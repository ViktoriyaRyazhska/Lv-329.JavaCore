package com.mak_keywa;

public abstract class Bird {
	String feathers;
	boolean layEggs;

	abstract void fly();

	public String getFeathers() {
		return feathers;
	}

	public boolean isLayEggs() {
		return layEggs;
	}

	public void setFeathers(String feathers) {
		this.feathers = feathers;
	}

	public void setLayEggs(boolean layEggs) {
		this.layEggs = layEggs;
	}

}
