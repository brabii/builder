package com.builder;

public class PrefabricatedHouseBuilder implements HouseBuilder {

	private House house;

	public PrefabricatedHouseBuilder() {
		this.house = new House();
	}

	@Override
	public void buildFoundation() {
		this.house.setFoundation("PrefabricatedHouseBuilder, foundation.");
		System.out.println("PrefabricatedHouseBuilder foundation complete");
	}

	@Override
	public void buildStructure() {
		this.house.setStructure("PrefabricatedHouseBuilder, structure.");
		System.out.println("PrefabricatedHouseBuilder structure complete");
	}

	@Override
	public void buildRoof() {
		this.house.setRoof("PrefabricatedHouseBuilder, roof.");
		System.out.println("PrefabricatedHouseBuilder roof complete");
	}

	@Override
	public void paintHouse() {
		this.house.setPainted(true);
		System.out.println("PrefabricatedHouseBuilder paint complete");
	}

	@Override
	public void finishHouse() {
		this.house.setFinished(false);
		System.out.println("PrefabricatedHouseBuilder finished");
	}

	@Override
	public House getHouse() {
		System.out.println("PrefabricatedHouseBuilder is complete");
		return house;
	}

}
