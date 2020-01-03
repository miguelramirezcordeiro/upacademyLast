package pt.upacademy.stockMySql.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQueries({@NamedQuery(name = Product.GET_ALL_PRODUCTS, query = "SELECT p FROM Product p")
})

public class Product extends Entity_ implements Serializable {
	
	public static final String GET_ALL_PRODUCTS = "getAllProducts";
	
	private static final long serialVersionUID = 1L;

	@OneToMany(mappedBy = "product", fetch = FetchType.EAGER)
	private List<Shelf> shelves;
	private int discount;
	private int iva;
	private float pvp;
	


	public List<Shelf> getShelves() {
		return shelves;
	}

	public void setShelves(List<Shelf> shelves) {
		this.shelves = shelves;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}

	public float getPvp() {
		return pvp;
	}

	public void setPvp(float pvp) {
		this.pvp = pvp;
	}

	@Override
	public String toString() {
		return "Product [shelves=" + shelves + ", discount=" + discount + ", iva=" + iva + ", pvp=" + pvp + "]";
	}

	public static Object getName() {
		return "Product";
	}
	
	
	
}
