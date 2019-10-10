package Modelos;

public class Airport {
	String id;
	String nombre;
	String ciudad;
	String pais;
	Double latitud;
	Double longitud;
	
	public Airport(String id, String nombre, String ciudad, String pais, Double latitud, Double longitud) {
		this.id = id;
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.pais = pais;
		this.latitud = latitud;
		this.longitud = longitud;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public Double getLatitud() {
		return latitud;
	}
	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}
	public Double getLongitud() {
		return longitud;
	}
	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}
}
