package console.program;

import java.io.IOException;
import java.text.ParseException;

public class Main {
	public static void main(String args[]) throws ParseException, IOException{
		MyCar car = new MyCar("Brand");
		car.initCar("Fleet.csv");
		car.run(args);
	}
}
