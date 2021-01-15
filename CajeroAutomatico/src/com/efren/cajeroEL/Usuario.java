package com.efren.cajeroEL;

public class Usuario {

	private static String nombre;
	private static String apellido;
	private static int pin;

	public static String getNombre() {
		return nombre;
	}

	public static void setNombre(String nombre) {
		Usuario.nombre = nombre;
	}

	public static String getApellido() {
		return apellido;
	}

	public static void setApellido(String apellido) {
		Usuario.apellido = apellido;
	}

	public static int getPin() {
		return pin;
	}

	public static void setPin () {
		Usuario.pin = 123;
	}

}
