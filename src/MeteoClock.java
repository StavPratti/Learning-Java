
public class MeteoClock extends Clock
{
	private float temperature;
	private float altitude;
	private float pressure;
	
	public MeteoClock(int hours, int mins, int sec, int format, float temperature, float altitude, float pressure) {
		super(hours, mins, sec, format);
		this.temperature = temperature;
		this.altitude = altitude;
		this.pressure = pressure;
	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public float getAltitude() {
		return altitude;
	}

	public void setAltitude(float altitude) {
		this.altitude = altitude;
	}

	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}
	
	@Override
	public String getTime() {
		return super.getTime()+"Temperature: "+temperature+"Pressure: "+pressure+"Altitude: "+altitude;
	}

}
