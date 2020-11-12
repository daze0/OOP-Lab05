package it.unibo.oop.lab05.ex3;

import java.util.Set;
import java.util.LinkedHashSet;

public class WarehouseImpl implements Warehouse {

	private Set<Product> set;
	
	public WarehouseImpl() {
		this.set = new LinkedHashSet<>();
	}

	public void addProduct(Product p) {
		if(!this.containsProduct(p)) {
			this.set.add(p);
		}
	}

	public Set<String> allNames() {
		Set<String> names = new LinkedHashSet<>();
		for(Product p : this.set) {
			names.add(p.getName());
		}
		return Set.copyOf(names);	
	}

	public Set<Product> allProducts() {
		return Set.copyOf(this.set);	
	}

	public boolean containsProduct(Product p) {
		if(this.set.contains(p)) {
			return true;
		}
		return false;
	}

	public double getQuantity(String name) {
		for(Product p : this.set) {
			if(p.getName() == name) {
				return p.getQuantity();
			}
		}
		return -1;
	}

}
