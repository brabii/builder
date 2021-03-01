package com.builder;

public interface HouseBuilder {

	void buildFoundation();

	void buildStructure();

	void buildRoof();

	void paintHouse();

	void finishHouse();

	House getHouse();
}