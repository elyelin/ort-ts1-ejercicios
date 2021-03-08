package ejemplos;

public class Main {

	public static void main(String[] args) {
		Car car = new Car("6tewr32", new Account("Jose Ronaldo", "4523546"));
		car.printDataCar();

		UberX uberX = new UberX("jcho", new Account("Madero Show", "1544562"), "Chevrolet", "Corola");
		uberX.setPasajeros(4);
		uberX.printDataCar();

		Car car2 = new Car("98u7y", new Account("Ronald Jose", "548787"));
		car2.printDataCar();

	}

}
