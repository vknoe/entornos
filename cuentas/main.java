

package cuentas;
public class main {

	 private static double saldoActual;

	public static void main(String[] args) {
	        ccuenta cuenta1;
	        cuenta1 = operativa_cuenta();

	        try {
	            cuenta1.retirar(2300);
	        } catch (Exception e) {
	            System.out.print("Fallo al retirar");
	        }
	        try {
	            System.out.println("Ingreso en cuenta");
	            cuenta1.ingresar(695);
	        } catch (Exception e) {
	            System.out.print("Fallo al ingresar");
	        }
	    }

		private static ccuenta operativa_cuenta() {
			ccuenta cuenta1;
			double saldoActual;
			cuenta1 = new ccuenta("Antonio López","1000-2365-85-1230456789",2500,0);
	        saldoActual = cuenta1.estado();
	        System.out.println("El saldo actual es"+ saldoActual );
			return cuenta1;
		}
	}
