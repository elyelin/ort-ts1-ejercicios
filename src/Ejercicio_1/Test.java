package Ejercicio_1;

public class Test {

	public static void main(String[] args) {
		Agenda agenda = new Agenda();

		agenda.agregarPersona("Diego", "Mata", "Echague", "95986144");
		agenda.agregarPersona("Elye", "Luna", "Libertador", "95845777");
		agenda.agregarPersona("Elyelim", "Lunader", "Libertador432", "9584555");
		agenda.listarPersonas();
		agenda.removerPersona("95986144");
		// agenda.removerPersona("4574517");
		agenda.modificarDomicilio("rojas", "95845337");
		agenda.modificarDomicilio("rojas", "95845777");
		agenda.listarPersonas();
	}

}
