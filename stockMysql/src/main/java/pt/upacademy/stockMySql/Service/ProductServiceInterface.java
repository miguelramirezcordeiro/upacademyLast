package pt.upacademy.stockMySql.Service;

import pt.upacademy.stockMySql.models.Entity_;
import pt.upacademy.stockMySql.models.Product;
import pt.upacademy.stockMySql.repositories.ProductRepository;

public interface ProductServiceInterface<T extends Entity_> extends EntityServiceInterface<Product> {
	
	ProductRepository prodRep = ProductRepository.getInstance();



}
