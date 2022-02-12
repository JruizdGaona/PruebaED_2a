package com.iescomercio.ed.bloque2.repaso.modelo;

public class Persona{
	
	private String dni;
	private String nombre;
	private String apellido1;
	
	public Persona() {}
	
	/**
	 * Constructor de la clase Persona, introduce el dni, nombre y apellido de ésta.
	 * 
	 * @param dni DNI de la persona.
	 * 
	 * @param nombre Nombre de la persona.
	 * 
	 * @param apellido1 Apellido de la persona.
	 */
	public Persona(String dni, String nombre, String apellido1) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido1 = apellido1;
	}
	
	/**
	 * Método que retorna el DNI de la persona.
	 * 
	 * @return DNI de la persona.
	 */
	public String getDni() {
		return dni;
	}
	
	
	/**
	 * Método que añade el valor del DNI a una persona
	 * 
	 * @param dni DNI que queremos añadir a la persona.
	 * 
	 * @throws Exception Si el último carácter del DNI no es una letra.
	 */
	public void setDni(String dni) throws Exception {
		//comprobacion de si el ultimo caracter es una letra
		if(Character.isLetter(dni.charAt(dni.length()-1))) {
			this.dni=dni;
		}else {
			throw new Exception("El ultimo caracter introducido no es una letra");
		}
	}
	
	/**
	 * Método que retorna el nombre de una persona.
	 * 
	 * @return El nombre de la persona.
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Método que añade el nombre a una persona.
	 * 
	 * @param nombre Nombre de la persona que queremos añadir.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Método que devuelve el apellido de una persona.
	 * 
	 * @return El apellido de una persona.
	 */
	public String getApellido1() {
		return apellido1;
	}
	
	/**
	 * Método que añade el apellido a una persona.
	 * 
	 * @param apellido1 Apellido de la persona.
	 */
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
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
		Persona other = (Persona) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + "]";
	}
	

}

