package com.cice.gestionequipo.entidades;

public class Personal {

	
	private int id;
	private String nombre;
	private String apellido;
	private double salario;
	private Integer fechaIncorporacion;
	private Integer fechaDespido;
	
	public Personal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Personal(int id, String nombre, String apellido, double salario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Integer getFechaIncorporacion() {
		return fechaIncorporacion;
	}

	public void setFechaIncorporacion(Integer fechaIncorporacion) {
		this.fechaIncorporacion = fechaIncorporacion;
	}

	public Integer getFechaDespido() {
		return fechaDespido;
	}

	public void setFechaDespido(Integer fechaDespido) {
		this.fechaDespido = fechaDespido;
	}

	@Override
	public String toString() {
		return "Personal [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", salario=" + salario
				+ ", fechaIncorporacion=" + fechaIncorporacion + ", fechaDespido=" + fechaDespido + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
		result = prime * result + ((fechaDespido == null) ? 0 : fechaDespido.hashCode());
		result = prime * result + ((fechaIncorporacion == null) ? 0 : fechaIncorporacion.hashCode());
		result = prime * result + id;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salario);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personal other = (Personal) obj;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (fechaDespido == null) {
			if (other.fechaDespido != null)
				return false;
		} else if (!fechaDespido.equals(other.fechaDespido))
			return false;
		if (fechaIncorporacion == null) {
			if (other.fechaIncorporacion != null)
				return false;
		} else if (!fechaIncorporacion.equals(other.fechaIncorporacion))
			return false;
		if (id != other.id)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (Double.doubleToLongBits(salario) != Double.doubleToLongBits(other.salario))
			return false;
		return true;
	}
	
	
	
	
	
	
}
