package model;

public class Car {

	private String plateNo;
	private String model;
	private CarType type;
	private boolean isAvailable;

	public Car(String plateNo, String model, CarType type, boolean isAvailable) {
		this.plateNo = plateNo;
		this.model = model;
		this.type = type;
		this.isAvailable = isAvailable;
	}

	public String getPlateNo() {
		return plateNo;
	}
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public CarType getType() {
		return type;
	}
	public void setType(CarType type) {
		this.type = type;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	@Override
	public String toString() {
		return " Car: plateNo=" + plateNo + ", model=" + model + ", type=" + type + ", isAvailable=" + isAvailable ;
	}

}

