package pt.upacademy.stockMySql.Service;

import java.util.Collection;
import java.util.stream.Collectors;

import pt.upacademy.stockMySql.models.Product;
import pt.upacademy.stockMySql.models.Shelf;
import pt.upacademy.stockMySql.repositories.ProductRepository;

public class ProductService extends EntityService<Product, ProductRepository> implements ProductServiceInterface<Product>{

	public static final ShelfService SHELF_SERVICE = new ShelfService();

	public ProductService() {
		repository = ProductRepository.getInstance();
	}

	@Override
	public void update(Product entity) {
		validate(entity.getID());
		Product oldProduct = repository.getById(entity.getID());
//		if (!oldProduct.getShelvesIds().equals(entity.getShelvesIds())) {
//			for (Long newId : entity.getShelvesIds()) {
//				if (!oldProduct.getShelvesIds().contains(newId)) {
//					addNewProductToShelf(entity, newId);
//				}
//			}
//			for (Long oldId : oldProduct.getShelvesIds()) {
//				if (!entity.getShelvesIds().contains(oldId)) {
//					removeProductToShelf(oldId, (long) 0);
//				}
//			}
//		}
		repository.editEntity(entity);
		
	}

	@Override
	public Long add(Product entity) {
		long currentId = repository.newEntityId(entity);
//		if (entity.getShelvesIds().size() > 0) {
//			for (Long id : entity.getShelvesIds()) {
//				addNewProductToShelf(entity, id);
//			}
//		}
		return currentId;
	}
	
	public void addNewProductToShelf(Product entity, Long long1) {
		Shelf editShelf = SHELF_SERVICE.getById(long1);
//		editShelf.setProductId(entity.getID());
//		shelfRep.editEntity(editShelf);
		SHELF_SERVICE.update(editShelf);
		
		
	}
	
	public void removeProductToShelf(Long key, Long key2) {
		Shelf editShelf = SHELF_SERVICE.getById(key);
//		shelfRep.editEntity(editShelf);
		SHELF_SERVICE.update(editShelf);
		
		
	}

	@Override
	public Product getById(long key) {
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
	}

	
	@Override
	public Collection<Product> getAll() {
		return repository.getAll();
	}

	@Override
	public void printAll() {
		repository.printAll();
		
	}

//	public Collection<Long> getEmptyShelves() {
//		Collection<Long> emptyShelves = SHELF_SERVICE.getAll().stream().filter(shelf -> shelf.getProductId() == 0).map(s -> s.getID()).collect(Collectors.toList());
//		return emptyShelves;
//	}
	
//	public Collection<Long> getShelvesWithProd(long key) {
//		Collection<Long> shelvesWithProduct = SHELF_SERVICE.getAll().stream().filter(shelf -> shelf.getProductId() == key).map(s -> s.getID()).collect(Collectors.toList());
//		return shelvesWithProduct;
//	}
	
//	public Collection<Shelf> getShelvesWithProd(int key) {
//		Collection<Shelf> shelfWithProduct = SHELF_SERVICE.getAll().stream().filter(shelf -> shelf.getProductId() == key).collect(Collectors.toList());
//		return shelfWithProduct;
//	}

	@Override
	protected Object getEntityClassName() {
		return Product.getName();
	}

}
