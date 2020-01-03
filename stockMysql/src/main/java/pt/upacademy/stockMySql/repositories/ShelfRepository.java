package pt.upacademy.stockMySql.repositories;

import pt.upacademy.stockMySql.models.Shelf;

public class ShelfRepository extends EntityRepository<Shelf> {

	private static final ShelfRepository INSTANCE = new ShelfRepository();

	public static ShelfRepository getInstance() {
		return INSTANCE;
	}

	private ShelfRepository() {

	}


}
