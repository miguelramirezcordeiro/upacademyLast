package pt.upacademy.stockMySql.Service;

import java.util.Collection;

import pt.upacademy.stockMySql.models.Entity_;

public interface EntityServiceInterface<T extends Entity_> {

	 void update(T entity);

	Long add(T entity);

	T getById(long key);
	
	Collection<Long> getAllIds();
	
	void removeById(Long key);
	
	Collection<T> getAll();
	
	void printAll();
}
