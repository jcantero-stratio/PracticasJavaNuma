package EstacionMeteorologica;

import java.time.LocalTime;
import java.util.Objects;

public class TemperaturaHora {
	private float temperatura;
	private LocalTime hora;

	public TemperaturaHora() {}
	
	public float getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}
	public LocalTime getHora() {
		return hora;
	}
	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
	
	public TemperaturaHora(float temperatura, LocalTime hora) {
		this.temperatura = temperatura;
		this.hora = hora;
	}
	
	@Override
	public String toString() {
		return "TemperaturaHora [temperatura=" + temperatura + ", hora=" + hora + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(hora, temperatura);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TemperaturaHora other = (TemperaturaHora) obj;
		return Objects.equals(hora, other.hora)
				&& Float.floatToIntBits(temperatura) == Float.floatToIntBits(other.temperatura);
	}
}
