package Parking;

import java.time.LocalTime;

public class Vehiculo {
	
	private String matricula;
	private int fila;
	private int columna;
	private double precio=0.04;
	private LocalTime horaActual = LocalTime.now();
	private int hora = horaActual.getHour();
	private int minutos = horaActual.getMinute();
	
	public double tiempoEnSegundos() {
		int segundos = (hora*60) + minutos;
		int mediaHora = segundos +1800;
		double pago = (segundos - mediaHora)*precio;		
		return pago;
	}
	
	public LocalTime getHoraActual() {
		return horaActual;
	}

	public void setHoraActual(LocalTime horaActual) {
		this.horaActual = horaActual;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public Vehiculo(String matricula, int fila, int columna) {
		super();
		this.fila = fila;
		this.columna = columna;
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getColumna() {
		return columna;
	}

	public void setColumna(int columna) {
		this.columna = columna;
	}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", fila=" + fila + ", columna=" + columna + "]";
	}
	
	
}
