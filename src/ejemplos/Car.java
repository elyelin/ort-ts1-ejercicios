package ejemplos;

public class Car {
	private Integer id;
	private String license;
	private Account driver;
	private Integer pasajeros;

	public Car(String license, Account driver) {
		this.license = license;
		this.driver = driver;
	}

	void printDataCar() {
		if (pasajeros != null) {
			System.out.println("License: " + license + " Driver: " + driver.name + " Pasageros: " + pasajeros);
		}
	}

	public Integer getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(Integer pasajeros) {
		if (pasajeros == 4) {
			this.pasajeros = pasajeros;
		} else {
			System.out.println("Necesitas mas de 4 pasajeros");
		}
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public Account getDriver() {
		return driver;
	}

	public void setDriver(Account driver) {
		this.driver = driver;
	}

}
