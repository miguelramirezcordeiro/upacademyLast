package pt.upacademy.stockMySql.controllers;

import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

import pt.upacademy.stockMySql.Service.ShelfService;
import pt.upacademy.stockMySql.models.Shelf;
import pt.upacademy.stockMySql.repositories.ShelfRepository;

@Path("shelves")
public class ShelfController extends EntityController<ShelfService, Shelf, ShelfRepository> {

	
	
	public ShelfController() {
		this.service = new ShelfService();
	}
	
	@Context
	protected UriInfo context;
	
//	@PUT
//	@Consumes(MediaType.APPLICATION_JSON)
//	@Produces(MediaType.TEXT_PLAIN)
//	public void updateShelf(Shelf entity) {
//		service.update(entity);
//	}
//	
//	@POST
//	@Consumes(MediaType.APPLICATION_JSON)
//	@Produces(MediaType.TEXT_PLAIN)
//	public Long addShelf(Shelf entity) {
//		return service.add(entity);
//		
//	}
//	
//	@GET
//	@Path("/{id}")
//	@Produces(MediaType.APPLICATION_JSON)
//	public Shelf getShelfById(@PathParam("id") long key) {
//		return service.getById(key);
//	}
//	
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	public Collection<Shelf> getAllShelves() {
//		return service.getAll();
//	}
//	
//	@DELETE
//	@Path("/{id}")
//	public void removeShelfById(@PathParam("id") Long key) {
//		service.removeById(key);
//	} 
//	
//	
//	@GET
//	@Path("status")
//	@Produces(MediaType.TEXT_PLAIN)
//	public String status() {
//		return "Url: " + context.getRequestUri().toString() + " is OK";
//	}
}
