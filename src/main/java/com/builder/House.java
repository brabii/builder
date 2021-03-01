package com.builder;

/**
 * @author rabii c'est un bean on fournit seulement les getters/setters
 */
public class House {
	private String foundation;
	private String structure;
	private String roof;
	private boolean finished;
	private boolean painted;

	public String getFoundation() {
		return foundation;
	}

	public void setFoundation(String foundation) {
		this.foundation = foundation;
	}

	public String getStructure() {
		return structure;
	}

	public void setStructure(String structure) {
		this.structure = structure;
	}

	public String getRoof() {
		return roof;
	}

	public void setRoof(String roof) {
		this.roof = roof;
	}

	public boolean isFinished() {
		return finished;
	}

	public void setFinished(boolean finished) {
		this.finished = finished;
	}

	public boolean isPainted() {
		return painted;
	}

	public void setPainted(boolean painted) {
		this.painted = painted;
	}

	@Override
	public String toString() {
		return "House [foundation=" + foundation + ", structure=" + structure + ", roof=" + roof + ", finished="
				+ finished + ", painted=" + painted + "]";
	}

}
