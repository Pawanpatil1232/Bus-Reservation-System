package Project2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Bus> buses = new ArrayList<>();
		ArrayList<Booking> bookings = new ArrayList<>();

		buses.add(new Bus(101, true, 45));
		buses.add(new Bus(102, false, 50));
		buses.add(new Bus(103, true, 60));
		buses.add(new Bus(104, false, 55));

		int userOpt = 1;
		Scanner scanner = new Scanner(System.in);

		for (Bus b : buses) {
			b.displayBusInfo(); // Corrected method name
		}

		while (userOpt == 1) {
			System.out.println("Enter 1 to Book and 2 to Exit:");
			userOpt = scanner.nextInt();
			if (userOpt == 1) {
				Booking booking = new Booking();
				if (booking.isAvailable(bookings, buses)) {
					bookings.add(booking);
					System.out.println("\nYour Booking is Confirmed...!!!");

					for (Bus b : buses) {
						if (b.getBusNo() == booking.getBusNo()) { // matching bus number
							b.setCapacity(b.getCapacity() - 1); // reduce 1 seat
						}

					}
					System.out.println("\nUpdated Bus Details:");
					for (Bus b : buses) {
						b.displayBusInfo();
					}
					System.out.println();
				}
			} else {
				System.out.println("Sorry..!! Bus is full. Try another Bus or Date..");
			}
		}
	}
}
