package cuentas;
/**
 * 
 * @author Sergio Pedrero Benedi
 *
 */
public class CCuenta {

	/**
	 * Atributo nombre de la clase CCuenta
	 */
    private String nombre;

	/**
	 * Atributo cuenta de la clase CCuenta
	 */
    private String cuenta;
	
	/**
	 * Atributo saldo, de tipo double,  de la clase CCuenta
	 */
    private double saldo;
	
	/**
	 * Atributo tipoInteres, de tipo double,  de la clase CCuenta
	 */
    private double tipoInteres;
    

    /**
     * Metodo constructor vacio de objetos del tipo CCuenta 
     * */
    public CCuenta()
    {
    }
    

    /**
     * Metodo constructor con parametros de objetos del tipo CCuenta
     * @param nom parametro para poder asignar nombre al objeto a instanciar
     * @param cue parametro para poder asignar numero de cuenta al objeto a instanciar
     * @param sal parametro para poder asignar saldo al objeto a instanciar 
     * @param tipo parametro para poder asignar tipo al objeto a instanciar
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    

    /**
     * 
     * @return Devuelve en nombre de la cuenta
     */
    public String getNombre() {
    	return this.nombre;
    }
    
    /**
     * Establece a la propiedad nombre del objeto referenciado el valor del parametro nombre
     * @param nombre nombre de la cuenta
     */
    public void setNombre(String nombre) {
    	this.nombre = nombre;
    }
    
    
    /**
     * 
     * @return Devuelve el numero de la cuenta
     * */
    public String getCuenta() {
    	return this.cuenta;
    }
    
    /**
     * Establece a la propiedad cuenta del objeto referenciado el valor del parametro cuenta
     * @param cuenta numero de cuenta
     */
    public void setCuenta(String cuenta) {
    	this.cuenta = cuenta;
    }
    
    
    /**
     * 
     * @return Devuelve el saldo de la cuenta
     * */
    public double getSaldo() {
    	return this.saldo;
    }
    
    /**
     * Establece a la propiedad saldo del objeto referenciado el valor del parametro saldo
     * @param saldo saldo de la cuenta
     */
    public void setSaldo(double saldo) {
    	this.saldo = saldo;
    }

    /**
     * 
     * @return Devuelve el tipo de interes de la cuenta
     * */
    public double getTipoInteres() {
    	return this.tipoInteres;
    }
    
    /**
     * Establece a la propiedad nombre del objeto referenciado el valor del parametro nombre
     * @param tipoInteres tipo de interes
     */
    public void setTipoInteres(double tipoInteres) {
    	this.tipoInteres = tipoInteres;
    }
    
    
    /**
     * 
     * @return Devuelve el saldo de la cuenta
     * */
    public double estado()
    {
        return saldo;
    }

    /**
     * 
     * Ingresa una cantidad parametrizada a la cuenta propietaria
     * @param cantidad valor numerico que representa la cantidad a ingresar
     * @throws Exception Lanza una excepcion si la cantidad parametrizada a ingresar es negativa
     * */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    
    /**
     * 
     * Retira una cantidad parametrizada a la cuenta propietaria
     * @param cantidad valor numerico que representa la cantidad a retirar
     * @throws Exception Lanza una excepcion si la cantidad parametrizada a retirar es negativa 
     * @throws Exception Si no hay suficiente saldo con respecto a dicha cantidad
     * */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
