package com.iescomercio.ed.bloque2.repaso.modelo;

import java.util.ArrayList;
import java.util.List;
/**
 * Esta clase permite a�adir, eliminar, mostrar el n�mero de alumnos y comprobar si un alumno pertenece a la clase o no.
 * Los alumnos se almacenan en una Lista de personas.
 * 
 * @author Javier Ruiz de Gaona
 * 
 * @version 11.0
 * 
 * @since 11.0
 *
 */
public class Curso {
	
	private List<Persona> listaAlumnos;

	/**
	 * Este m�todo elimina a un alumno del curso.
	 * 
	 * @param dni DNI del alumno que se quiere eliminar.
	 * 
	 * @throws Exception Si la longitud del DNI del alumno no es igual a 9.
	 */
	public void eliminarAlumno(String dni) throws Exception {
		if(dni.length()==9) {//comprobar la longitud del dni
			listaAlumnos.remove(new Persona(dni, "", "")); //solo hace falta el dni
		}else {
			throw new Exception("El dni no tiene la longitud adecuada");
		}
	}
	
	/**
	 * Este m�todo a�ade un alumno al curso.
	 * 
	 * @param p Persona que a�adimos al curso.
	 */
	public void aniadirAlumno(Persona p) {
		listaAlumnos.add(p);
	}
	
	/**
	 * Este m�todo nos indica si un alumno est� resgistrado en el curso o no
	 * 
	 * @param dni DNI del alumno que queremos comprobar.
	 * 
	 * @return Devuelve "True" si el alumno est� registrado, devolver� "False" si no lo est�.
	 */
	public Boolean estaRegistrado(String dni) {
		int i =0;
		Boolean encontrado=false;
		while (!encontrado && i<listaAlumnos.size()) {
			if(listaAlumnos.get(i).getDni().equals(dni)) {
				encontrado=true;
			}
			i++;
		}
		return encontrado;
	}
	
	/**
	 * M�todo constructor de la clase.
	 */
	public Curso() {
		listaAlumnos= new ArrayList<Persona>();
	}
	
	/**
	 * Este m�todo muestra el n�mero de alumnos que hay en el curso.
	 * 
	 * @return N�mero de alumnos que hay en el curso.
	 */
	public Integer numeroAlumnos() {return listaAlumnos.size();}
	
	
	public void mostrarTodos() {
		for (Persona persona : listaAlumnos) {
			System.out.println(persona);
		}
	}
}
