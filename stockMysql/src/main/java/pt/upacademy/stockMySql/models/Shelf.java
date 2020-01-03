package pt.upacademy.stockMySql.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({@NamedQuery(name = Shelf.GET_ALL_SHELVES, query = "SELECT e FROM Shelf e")
})

public class Shelf extends Entity_ {
	
	public static final String GET_ALL_SHELVES = "getAllShelves";
	
	private static final long serialVersionUID = 1L;

	
	private int capacity;
	@ManyToOne
	private Product product;
	private float dailyPrice;
	
	
	public Shelf() {}



	@Override
	public String toString() {
		return "Shelf [capacity=" + capacity + ", product=" + product + ", dailyPrice=" + dailyPrice + "]";
	}



	public int getCapacity() {
		return capacity;
	}



	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}



	public Product getProduct() {
		return product;
	}



	public void setProduct(Product product) {
		this.product = product;
	}



	public float getDailyPrice() {
		return dailyPrice;
	}



	public void setDailyPrice(float dailyPrice) {
		this.dailyPrice = dailyPrice;
	}



	public static Object getName() {
		return "Shelf";
	}

	
}
