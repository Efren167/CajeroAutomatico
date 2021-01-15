package com.efren.cajeroIU;

import java.util.Scanner;

import com.efren.appbancaria.Mensaje;
import com.efren.cajeroEL.Cuenta;
import com.efren.cajeroEL.Transaccion;
import com.efren.cajeroEL.Usuario;

public class Menu {

	private static Scanner sc;
	private static int opciones;
	private static final int SALIR = 4;

	public static void mostrarMenu() {

		sc = new Scanner(System.in);

		// Evaluamos si el pin es correcto o no, envolviendo en un if el funcionamiento
		// del cajero asi en caso de pin incorrecto no
		// se ejecuta y aparece un mensaje de bloqueo del usuario.

		Mensaje.mostrarMensajePin();

		int pin = sc.nextInt();
		Usuario.setPin();

		if (pin == Usuario.getPin()) {

			Mensaje.mostrarMensajePinCorrecto();

			do {

				// imprimimos por pantralla los datos del usuario y la fecha de conexion.
				
				Transaccion.setFecha();
				Cuenta.setNumeroCuenta();
				Mensaje.mostrarMensajeConexion(Transaccion.getFecha(), Cuenta.getNumeroCuenta());

				Usuario.setNombre("Juan ");
				Usuario.setApellido("González");
				Mensaje.mostrarMensajeBienvenida(Usuario.getNombre(), Usuario.getApellido());
				Mensaje.mostrarMensajeMenuPrincipal();
				opciones = sc.nextInt();

				switch (opciones) {

				// Ingreso en cuenta

				case 1:
					Mensaje.mostrarMensajeIngreso();
					double ingreso = sc.nextDouble();
					Cuenta.setSaldo(Cuenta.getSaldo() + ingreso);
					Transaccion.setFecha();
					Mensaje.mostrarMensajeFechaMovimiento(Transaccion.getFecha());
					break;

				// Retirada de dinero de la cuenta

				case 2:
					Mensaje.mostrarMensajeRetirada();
					double retirada = sc.nextDouble();
					Cuenta.setSaldo(Cuenta.getSaldo() - retirada);
					Transaccion.setFecha();
					Mensaje.mostrarMensajeFechaMovimiento(Transaccion.getFecha());

					// Comprobamos si la cantidad retirada no es mayor al saldo actual.

					if (retirada > Cuenta.getSaldo()) {
						Mensaje.mostrarMensajeSaldoNegativo();
						Cuenta.setSaldo(Cuenta.getSaldo() + retirada);
					}
					break;

				case 3:

					// Consulta de saldo

					Mensaje.mostrarMensajeSaldo(Cuenta.getSaldo());
					Transaccion.setFecha();
					Mensaje.mostrarMensajeFecha(Transaccion.getFecha());
					break;

				case 4:
					Mensaje.mostrarMensajeSalir();
					break;

				default:
					Mensaje.mostrarMensajeDefault();
				}

			} while (opciones != SALIR);

		} else {

			Mensaje.mostrarMensajePinIncorrecto();

		}

	}

}
