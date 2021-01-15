package com.efren.cajeroEL;


import java.util.Date;

public class Transaccion {

	//Clase que gestiona los movimientos de la cuenta
	
	private static double ingreso;
	private static double retirada;
	private static Date fecha;

	public static double getIngreso() {
		return ingreso;
	}

	public static void setIngreso(double ingreso) {
		Transaccion.ingreso = ingreso;
	}

	public static double getRetirada() {
		return retirada;
	}

	public static void setRetirada(double retirada) {
		Transaccion.retirada = retirada;
	}

	public static Date getFecha() {
		return fecha;
	}

	public static void setFecha() {

	 Transaccion.fecha = new Date();
	 fecha.getTime();
	}

}
