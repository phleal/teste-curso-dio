package byteBank;

public class Conta {
	private double saldo;
	private int agencia;
	private Cliente titular;
	private static int total;
	
	
	public Conta(int agencia) {
		this.agencia = agencia;
		total++;
		System.out.println("O numero da sua agencia e: "+ this.agencia);
		System.out.println("O total de contas é: "+ total);
		
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor){
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
			return false;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public int getAgencia() {
		return agencia;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	
}
