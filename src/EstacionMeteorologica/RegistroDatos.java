package EstacionMeteorologica;

import java.time.LocalDate;
import java.util.Objects;

public class RegistroDatos {

	private LocalDate fecha;
	private String estacionMeteorologica;
	private String provincia;
	private TemperaturaHora maxima;
	private TemperaturaHora minima;
	private float precipitacion;

	public RegistroDatos() {}
	
	
	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getEstacionMeteorologica() {
		return estacionMeteorologica;
	}

	public void setEstacionMeteorologica(String estacionMeteorologica) {
		this.estacionMeteorologica = estacionMeteorologica;
	}

	public TemperaturaHora getMaxima() {
		return maxima;
	}

	public void setMaxima(TemperaturaHora maxima) {
		this.maxima = maxima;
	}

	public TemperaturaHora getMinima() {
		return minima;
	}

	public void setMinima(TemperaturaHora minima) {
		this.minima = minima;
	}

	public float getPrecipitacion() {
		return precipitacion;
	}

	public void setPrecipitacion(float precipitacion) {
		this.precipitacion = precipitacion;
	}


	public RegistroDatos(LocalDate fecha, String estacionMeteorologica, String provincia, TemperaturaHora maxima,
			TemperaturaHora minima, float precipitacion) {
		super();
		this.fecha = fecha;
		this.estacionMeteorologica = estacionMeteorologica;
		this.provincia = provincia;
		this.maxima = maxima;
		this.minima = minima;
		this.precipitacion = precipitacion;
	}


	public String getProvincia() {
		return provincia;
	}


	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}


	@Override
	public int hashCode() {
		return Objects.hash(estacionMeteorologica, fecha, maxima, minima, precipitacion, provincia);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RegistroDatos other = (RegistroDatos) obj;
		return Objects.equals(estacionMeteorologica, other.estacionMeteorologica) && Objects.equals(fecha, other.fecha)
				&& Objects.equals(maxima, other.maxima) && Objects.equals(minima, other.minima)
				&& Float.floatToIntBits(precipitacion) == Float.floatToIntBits(other.precipitacion)
				&& Objects.equals(provincia, other.provincia);
	}


	@Override
	public String toString() {
		return "RegistroDatos [fecha=" + fecha + ", estacionMeteorologica=" + estacionMeteorologica + ", provincia="
				+ provincia + ", maxima=" + maxima + ", minima=" + minima + ", precipitacion=" + precipitacion + "]";
	}



	
	
}
