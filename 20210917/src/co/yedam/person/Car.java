package co.yedam.person;

public class Car {
	// �ʵ�. ������Ŭ����-> �ҽ� -> ���׷����� ���� ����
	private String carName;
	private String carModel;
	private int carPrice;
	private int maxSpeed;
	
	
	//������ ������Ŭ����-> �ҽ� -> �ܽ�Ʈ��Ʈ ��¡ �ʵ�
	
	public Car(String carName, String carModel, int carPrice, int maxSpeed) {
		this.carName = carName;
		this.carModel = carModel;
		this.carPrice = carPrice;
		this.maxSpeed = maxSpeed;
	}

	//�޼ҵ�. ������Ŭ����-> �ҽ� -> ���׷����� ���� ����

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
