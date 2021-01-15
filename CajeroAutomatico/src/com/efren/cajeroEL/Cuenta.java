package com.efren.cajeroEL;

public class Cuenta {

	// Clase donde programamos los datos de la cuenta y sus accesso mediante setters
	// y getters

	private static double saldoInicial;
	private static double saldo;
	private static String numeroCuenta;
	private static final double SALDO_INICIAL = 0;

	public static double getSaldoInicial() {
		return saldoInicial;
	}

	public static void setSaldoInicial() {
		Cuenta.saldoInicial = SALDO_INICIAL;

	}

	public static double getSaldo() {
		return saldo;
	}

	public static void setSaldo(double saldo) {
		Cuenta.saldo = saldo;

	}

	public static String getNumeroCuenta() {
		return numeroCuenta;
	}

	public static void setNumeroCuenta() {
		Cuenta.numeroCuenta = "ES22 111 222 333 444 555 666";

	}

}
