
public class Cajero {

	UserInput input = new UserInput();
	Clientes cliente = new Clientes(200);
	Operadores operador = new Operadores(cliente.balance);

	int opcion;

	public void menuPrincipal(){
		System.out.println("Escoja una opcion:\n "
				+ "1. Retirar dinero. \n"
				+ "2. Depositar dinero. \n"
				+ "3. Ver balance. \n"
				+ "\n"
				+ "0. Terminar transaccion.");
		opcion = input.inputInt();
		menuSecundarioSwitch(opcion);

	}

	public void menuSecundarioSwitch(int opcion) {
		switch(opcion) {
		case 1:
			System.out.println("Inserte la cantidad de dinero que desea retirar: ");
			double retiro = input.inputDouble(); 
			if(cliente.getBalance() - retiro < 0) {
				System.out.println("Lo sentimos, no puede retirar esta cantidad de dinero.\n");
				balanceActual();
				menuPrincipal();
			}else {
				operador.retiro(retiro);
				cliente.setBalance(operador.balanceEditado());
				balanceActual();
			}
			break;
		case 2: 
			System.out.println("Insterte la cantidad que desea depositar: ");
			double deposito = input.inputDouble();
			operador.deposito(deposito);
			cliente.setBalance(operador.balanceEditado());
			balanceActual();
			break;
		case 3:
			balanceActual();
			break;
		case 0:
			System.out.println("Gracias por su visita.");
			exit();
		}
	}

	public void balanceActual() {
		System.out.println("La cantidad disponible en su cuenta es: " + cliente.getBalance() + ".\n");
		decicionFinal();

	}
	public void decicionFinal() {
		System.out.println("1.Menu principal. \n"
				+ "\n"
				+ "0. Terminar transaccion.");

		opcion = input.inputInt();
		switch(opcion) {
		case 1:
			menuPrincipal();
			break;
		case 0:
			System.out.println("Gracias por su visita");
			exit();
			break;
		}
	

	}

public void exit() {
	System.exit(0);
}








}
