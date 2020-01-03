package pt.upacademy.stockMySql.controllers;

import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

import pt.upacademy.stockMySql.Service.ProductService;
import pt.upacademy.stockMySql.models.Product;
import pt.upacademy.stockMySql.repositories.ProductRepository;

@Path("products")
public class ProductController extends EntityController<ProductService, Product, ProductRepository> {
	
	
	public ProductController() {
		this.service = new ProductService();
	}
	
	@Context
	protected UriInfo context;
	
//	@PUT
//	@Consumes(MediaType.APPLICATION_JSON)
//	@Produces(MediaType.TEXT_PLAIN)
//	public void updateProd(Product entity) {
//		service.update(entity);
//	}
//	
//	@POST
//	@Consumes(MediaType.APPLICATION_JSON)
//	@Produces(MediaType.TEXT_PLAIN)
//	public Long addProd(Product entity) {
//		return service.add(entity);
//		
//	}
//	
//	
//	
//	@GET
//	@Path("/{id}")
//	@Produces(MediaType.APPLICATION_JSON)
//	public Product getProdById(@PathParam("id") long key) {
//		return service.getById(key);
//	}
//	
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	public Collection<Product> getAllProd() {
//		return service.getAll();
//	}
//	
//	@DELETE
//	@Path("/{id}")
//	public void removeProdById(@PathParam("id") Long key) {
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
