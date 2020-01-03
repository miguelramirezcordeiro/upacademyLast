package pt.upacademy.stockMySql.controllers;

import java.util.Collection;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import pt.upacademy.stockMySql.Service.EntityService;
import pt.upacademy.stockMySql.models.Entity_;
import pt.upacademy.stockMySql.repositories.EntityRepository;


public abstract class EntityController<V extends EntityService<T,R>,T extends Entity_, R extends EntityRepository<T>> {

	protected V service;

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Response update(T entity) {
		try {
			service.update(entity);
			return Response.ok().build();
		} catch (Exception e) {
//			e.printStackTrace();
			return Response.status(400).entity(e.getMessage()).build();
		}
		
	}
	
	@PUT
	@Path("list")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response update(List<T> entity) {
		String result = "";
		for (T t : entity) {
			try {
				service.update(t);
				
				result = result.concat("ID: " + t.getID().toString() + "---> Done!\n");
			} catch (Exception e) {
				result = result.concat("ID: " + t.getID().toString() + "---> Failed!\n");
			}
		}
		return Response.status(200).entity(result).build();
		
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public Long add(T entity) {
		return service.add(entity);
	}
	
	@POST
	@Path("list")
	@Consumes(MediaType.APPLICATION_JSON)
	public void add(List<T> entity) {
		for (T t : entity) {
			add(t);
			
		}
	}

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getById(@PathParam("id") long key) {
		try {
			T result = service.getById(key);
			return Response.status(200).entity(result).build();
		} catch (Exception e) {
			return Response.status(400).entity(e.getMessage()).build();
		}
		
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<Long> getAllIds() {
		return service.getAllIds();
	}

	@DELETE
	@Path("/{id}")
	public Response removeById(@PathParam("id") Long key) {
		try {
			service.removeById(key);
			return Response.ok().build();
		} catch (Exception e) {
			return Response.status(400).entity(e.getMessage()).build();
		}
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<T> getAll() {
		return service.getAll();
	}

	
	public void printAll() {
		service.printAll();
	}
}
