package pt.upacademy.stockMySql.Service;

import java.util.Collection;

import pt.upacademy.stockMySql.models.Entity_;
import pt.upacademy.stockMySql.repositories.EntityRepository;

public abstract class EntityService<T extends Entity_, R extends EntityRepository<T>> implements EntityServiceInterface<T> {

	protected R repository ;
	
	public void update(T entity) {
		repository.editEntity(entity);
	}
	
	public void validate(Long id) {
		if (repository.getById(id) == null) {
			throw new IllegalArgumentException(String.format("No %s with Id [%d]", getEntityClassName(), id));
		}
	}

	protected abstract Object getEntityClassName();

	public Long add(T entity) {
		return repository.newEntityId(entity);
	}

	@Override
	public T getById(long key) {
		return repository.getById(key);
	}

	@Override
	public Collection<Long> getAllIds() {
		return repository.getAllIds();
	}

	@Override
	public void removeById(Long key) {
		repository.removeById(key);
		
	}

	@Override
	public Collection<T> getAll() {
		return repository.getAll();
	}

	@Override
	public void printAll() {
		repository.printAll();
	}
	
	
}
