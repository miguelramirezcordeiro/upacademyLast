package pt.upacademy.stockMySql.Service;

import java.util.Collection;
import java.util.stream.Collectors;

import pt.upacademy.stockMySql.models.Product;
import pt.upacademy.stockMySql.models.Shelf;
import pt.upacademy.stockMySql.repositories.ShelfRepository;

public class ShelfService extends EntityService<Shelf, ShelfRepository> implements ShelfServiceInterface<Shelf>{
	
	public static final ProductService PRODUCT_SERVICE = new ProductService();

	public ShelfService() {
		repository = ShelfRepository.getInstance();
	}
	
	@Override
	public void update(Shelf entity) {
		validate(entity.getID());
		repository.editEntity(entity);
	}

	@Override
	public Long add(Shelf entity) {
		return repository.newEntityId(entity);
		
	}

	@Override
	public Shelf getById(long key) {
		validate(key);
		return repository.getById(key);
	}

	@Override
	public Collection<Long> getAllIds() {
		return repository.getAllIds();
	}

	@Override
	public void removeById(Long key) {
		validate(key);
		repository.removeById(key);
//		Collection<Product> productInShelf = PRODUCT_SERVICE.getAll().stream().filter(product -> product.getShelvesIds().contains(key) == true).collect(Collectors.toList());
//		System.out.println(productInShelf.toString());
//		for (Product product : productInShelf) {
//			int tempIndex = product.getShelvesIds().indexOf(key);
//			product.getShelvesIds().remove(tempIndex);
//			try {
//				PRODUCT_SERVICE.update(product);
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
	}

	@Override
	public Collection<Shelf> getAll() {
		return repository.getAll();
	}

	@Override
	public void printAll() {
		repository.printAll();
		
	}

	@Override
	protected Object getEntityClassName() {
		return Shelf.getName();
	}

	






	

}
