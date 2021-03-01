package com.builder;

public class ConcreteHouseBuilder implements HouseBuilder {

	private House house;

	public ConcreteHouseBuilder() {
		this.house = new House();
	}

	@Override
	public void buildFoundation() {
		house.setFoundation("concrete House, foundation");
		System.out.println("ConcreteHouseBuilder foundation complete");
	}

	@Override
	public void buildStructure() {
		house.setStructure("concrete House, structure");
		System.out.println("ConcreteHouseBuilder structure complete");
	}

	@Override
	public void buildRoof() {
		house.setRoof("concrete House, roofs");
		System.out.println("ConcreteHouseBuilder roofs complete");
	}

	@Override
	public void paintHouse() {
		house.setPainted(true);
		System.out.println("ConcreteHouseBuilder paint complete");
	}

	@Override
	public void finishHouse() {
		house.setFinished(true);
		System.out.println("ConcreteHouseBuilder finished");
	}

	@Override
	public House getHouse() {
		System.out.println("ConcreteHouseBuilder is complete");
		return house;
	}
}
