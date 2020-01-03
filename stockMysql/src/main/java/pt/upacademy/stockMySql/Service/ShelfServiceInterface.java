package pt.upacademy.stockMySql.Service;

import pt.upacademy.stockMySql.models.Entity_;
import pt.upacademy.stockMySql.models.Shelf;
import pt.upacademy.stockMySql.repositories.ShelfRepository;

public interface ShelfServiceInterface<T extends Entity_> extends EntityServiceInterface<Shelf>{
	
	ShelfRepository shelfRep = ShelfRepository.getInstance();

	
}
