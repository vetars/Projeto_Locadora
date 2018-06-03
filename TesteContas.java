
public class TesteContas {

	public static void main (String[] args) {
		ContaCorrente cc = new ContaCorrente(123, 123);
		
		
		ContaPoupanca cp = new ContaPoupanca(123, 123);
		cp.deposita(200);
		cc.deposita(400);
		
		cc.saca(10);
		
		System.out.println(cp.getSaldo());
		
		System.out.println(cc.getSaldo());
	}
}
