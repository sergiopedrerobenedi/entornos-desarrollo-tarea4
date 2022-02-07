package cuentas;

public class CCuenta {

    
    private String nombre;    
    private String cuenta;
    private double saldo;
    private double tipoInteres;
    

    
    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    public String getNombre() {
    	return this.nombre;
    }
    public void setNombre(String nombre) {
    	this.nombre = nombre;
    }
    
    public String getCuenta() {
    	return this.cuenta;
    }
    public void setCuenta(String cuenta) {
    	this.cuenta = cuenta;
    }
    
    public double getSaldo() {
    	return this.saldo;
    }
    public void setSaldo(double saldo) {
    	this.saldo = saldo;
    }
    
    public double getTipoInteres() {
    	return this.tipoInteres;
    }
    public void setTipoInteres(double tipoInteres) {
    	this.tipoInteres = tipoInteres;
    }

    public double estado()
    {
        return saldo;
    }

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
