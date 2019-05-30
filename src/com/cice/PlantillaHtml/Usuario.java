package com.cice.PlantillaHtml;

public class Usuario {

	private String nombre;
	private String apellido;
	private	Double peso;
	private Double altura;
	private String telefono;
	
	public Usuario() {
		super();
	}

	public Usuario(String nombre, String apellido, Double peso, Double altura, String telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.peso = peso;
		this.altura = altura;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellido=" + apellido + ", peso=" + peso + ", altura=" + altura
				+ ", telefono=" + telefono + "]";
	}	
	
		
	
}
