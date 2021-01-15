package com.efren.appbancaria;

import java.util.Date;

public class Mensaje {

	// Clase que unicamente muestra los distintos mensajes segun la operación
	// realizada en el cajero,
	// Tambien muestra mensajes de error

	public static void mostrarMensajePinCorrecto() {

		System.out.println("El pin es correcto");

	}

	public static void mostrarMensajeMenuPrincipal() {

		System.out.println(
				"******** ¿Qué desea hacer? ******** \n 1- Ingresar dinero \n 2- Retirar dinero \n 3- Consultar saldo \n 4- Salir");
	}

	public static void mostrarMensajeSalir() {

		System.out.println("Saliendo del sistema... \n Hasta pronto!");
	}

	public static void mostrarMensajeDefault() {

		System.out.println("Opción invalida");
	}

	public static void mostrarMensajeSaldoNegativo() {

		System.err.println("El saldo no puede estar en negativo");
	}

	public static void mostrarMensajeSaldo(double saldo) {

		System.out.println("Su saldo es: " + saldo + "€");
	}

	public static void mostrarMensajeIngreso() {

		System.out.println("¿Cuánto desea ingresar?");

	}

	public static void mostrarMensajeRetirada() {

		System.out.println("¿Cuánto desea retirar?");

	}

	public static void mostrarMensajeFechaMovimiento(Date fecha) {

		System.out.println("La operación se ha realido el " + fecha);
	}

	public static void mostrarMensajeFecha(Date fecha) {

		System.out.println("Fecha: " + fecha);
	}

	public static void mostrarMensajeConexion(Date fecha, String numeroCuenta) {

		System.out.println(" Conexión relizada: " + fecha + " número de cuenta " + numeroCuenta + ".");
	}

	public static void mostrarMensajeBienvenida(String nombre, String apellido) {

		System.out.println("Buenos dias Sr/a " + nombre + apellido);
	}

	public static void mostrarMensajePin() {

		System.out.println("Introduzca pin");
	}

	public static void mostrarMensajePinIncorrecto() {

		System.err.println(" El pin es incorrecto... \n Usuario bloqueado.");
	}

}
