import java.sql.Date;

public class Festival {
	private String nombre;
	private String lugar;
	private Date fecha;
	
	public Festival() {
		
		
		
	}
	public Festival(String nombre, String lugar, Date fecha) {
		
		this.nombre = nombre;
		this.lugar = lugar;
		this.fecha = fecha;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getLugar() {
		return lugar;
	}


	public void setLugar(String lugar) {
		this.lugar = lugar;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
	
	

}
