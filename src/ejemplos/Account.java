package ejemplos;

public class Account {
	Integer id;
	String name;
	String document;
	String email;
	String contraseña;

	public Account(String name, String document) {
		this.name = name;
		this.document = document;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", document=" + document + "]";
	}
}
