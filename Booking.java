package Project2;

import java.text.SimpleDateFormat;
import java.util.*;

public class Booking {
	String passengerName;
	int busNo;
	Date date;

	Booking() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name of Passenger...");
		passengerName = sc.nextLine();
		System.out.println("Enter Bus No...");
		busNo = sc.nextInt();
		System.out.println("Enter the Date...");
		String dateInput = sc.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
		try {
			date = dateFormat.parse(dateInput);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
		int capacity = 0;
		for (Bus bus : buses) {
			if (bus.getBusNo() == busNo) {
				capacity = bus.getCapacity();
			}

		}
		int booked = 0;

		for (Booking b : bookings) {
			if (b.busNo == busNo && b.date.equals(date)) {
				booked++;
			}
		}
		return booked < capacity ? true : false;
	}

	public int getBusNo() {
		return busNo;
	}
}
