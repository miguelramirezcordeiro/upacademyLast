package pt.upacademy.stockMySql.repositories;

import pt.upacademy.stockMySql.models.Product;

public class ProductRepository extends EntityRepository<Product>{
	
	private static final ProductRepository INSTANCE = new ProductRepository();
	
	public static ProductRepository getInstance() {
		return INSTANCE;
	}

	private ProductRepository() {
		
	}
	
	
}
