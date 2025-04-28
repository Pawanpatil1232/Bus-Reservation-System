package Project2;

public class Bus {
	private int busNo;
	private boolean ac;
	private int capacity;

	Bus(int busNo, boolean ac, int capacity) {
		this.busNo = busNo;
		this.ac = ac;
		this.capacity = capacity;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public boolean getAc() {
		return ac;
	}

	public void getAc(boolean ac) {
		this.ac = ac;
	}

	public int getBusNo() {
		return busNo;
	}

	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}

	public void displayBusInfo() {
		System.out.println("Bus No :" + busNo + ", AC:" + ac + ", Total Capacity: " + capacity);
	}
}
