
public class Operadores{
	public double balance;
	
	public Operadores (double balance) {
		this.balance = balance;
	}
	
	
	public double balanceEditado() {
		return balance;
	}
	
	public void retiro(double retiro) {
		this.balance -= retiro; 
	}
	
	public void deposito(double deposito) {
		this.balance += deposito;
	}
}
