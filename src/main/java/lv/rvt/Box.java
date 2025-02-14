package lv.rvt;

import java.util.ArrayList;

public class Box implements packable {
	private double capacity;
	private ArrayList<packable> items;

	public Box(double capacity) {
		this.capacity=capacity;
		items = new ArrayList<>();
	}


	public void add(packable item) {
		if (this.capacity >= item.weight()) {
			items.add(item);
			this.capacity -= item.weight();
		}
	}

	public double weight() {
		double weight = 0;
		for (packable item: items) {
			weight += item.weight();
		}
		return weight;
	}

	@Override
	public String toString() {
		return "Box: " + items.size() + " items, total weight " + weight() + " kg";
	}
}