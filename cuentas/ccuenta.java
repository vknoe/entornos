/**Esta clase muestra el saldo actual 
 * @author Noemi
 * @version	1.1
 * @see main.java
 */

package cuentas;
public class ccuenta {

/**@param de la clase
 * 
 */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /*metdodo ccuenta*/
    
    public ccuenta()
    {
 }
    public ccuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
/**
 * @param estado
 * @return getsaldo
 */
    public double estado()
    {
        return getSaldo();
    }
/**
 * 
 * @param ingresar
 * @throws Exception
 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
/**
 * 
 * @param cantidad retirar
 * @throws Exception
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
/**
 * @param getNombre
 * @return nombre
 */
	public String getNombre() {
		return nombre;
	}
/**
 * @param setnombre
 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
/**
 * @param getcuenta
 * @return cuenta 
 */
	public String getCuenta() {
		return cuenta;
	}
/**
 * @param setCuenta
 * @param cuenta
 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
/**
 * 
 * @return tipoInteres
 */
	public double getTipoInteres() {
		return tipoInteres;
	}
/**
 * 
 * @param tipoInteres
 */
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
/**
 *  @param getsaldo
 * @return saldo
 */
	private double getSaldo() {
		return saldo;
	}
/**
 * @param setsaldo
 * @param saldo
 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}