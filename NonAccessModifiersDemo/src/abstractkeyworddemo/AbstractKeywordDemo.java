package abstractkeyworddemo;

public class AbstractKeywordDemo {

	public static void main(String[] args) {

		Car car = new Car();//generic car object
		car.accelerate();
		
		BmwCar bmwCar = new BmwCar();
		bmwCar.accelerate();
		
		HondaCar hondaCar = new HondaCar();
		hondaCar.accelerate();
		
		
		
	}

}
