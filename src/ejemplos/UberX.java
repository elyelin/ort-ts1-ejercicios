package ejemplos;

public class UberX extends Car {
	String marca;
	String modelo;

	public UberX(String license, Account driver, String marca, String modelo) {
		super(license, driver);
		this.marca = marca;
		this.modelo = modelo;

	}

	@Override
	void printDataCar() {
		super.printDataCar();
		System.out.println("Modelo: " + modelo + " Marca: " + marca);
	}
}
