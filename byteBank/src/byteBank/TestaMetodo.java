package byteBank;

public class TestaMetodo {
	public static void main(String[] args) {
		

	Conta contaDoPhillip = new Conta(1337);
	contaDoPhillip.deposita(150);
	
	System.out.println(contaDoPhillip.getSaldo());
	
	System.out.println("Esse é o número de sua agência: " + contaDoPhillip.getAgencia());
	
	
	//System.out.println("Esse é o número do Titular: " + contaDoPhillip.getTitular());
	
	
	
	Conta conta = new Conta(5566);
	Conta conta2 = new Conta(5588);
	Conta conta3 = new Conta(5599);
	
	
	}
}
