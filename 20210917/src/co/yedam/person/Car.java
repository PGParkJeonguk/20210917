package co.yedam.person;

public class Car {
	// 필드. 오른쪽클릭후-> 소스 -> 제네레이터 게터 세터
	private String carName;
	private String carModel;
	private int carPrice;
	private int maxSpeed;
	
	
	//생성자 오른쪽클릭후-> 소스 -> 콘스트럭트 유징 필드
	
	public Car(String carName, String carModel, int carPrice, int maxSpeed) {
		this.carName = carName;
		this.carModel = carModel;
		this.carPrice = carPrice;
		this.maxSpeed = maxSpeed;
	}

	//메소드. 오른쪽클릭후-> 소스 -> 제네레이터 게터 세터

	public String getCarName() {
		return carName;
	}


	public void setCarName(String carName) {
		this.carName = carName;
	}


	public String getCarModel() {
		return carModel;
	}


	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}


	public int getCarPrice() {
		return carPrice;
	}


	public void setCarPrice(int carPrice) {
		this.carPrice = carPrice;
	}


	public int getMaxSpeed() {
		return maxSpeed;
	}


	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}


	
}
