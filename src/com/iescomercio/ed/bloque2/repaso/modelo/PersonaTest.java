package com.iescomercio.ed.bloque2.repaso.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonaTest {

	@Test
	void testPersonaStringStringString() {
		Persona p1 = new Persona ("12345678A", "Pedro", "Gómez");
		Persona p2 = new Persona ("87654321B", "Juan", "Pérez");
		Persona p3 = new Persona ("87651234C", "Javier", "Ruiz de Gaona");
	}

	@Test
	void testGetDni() {
		String dniRec = new Persona("12345678A", "Pedro", "Gómez").getDni();
		String dniEsp = "12345678A";
		assertEquals(dniEsp, dniRec);
		String dniRec2 = new Persona("87654321B", "Juan", "Pérez").getDni();
		String dniEsp2 = "87654321B";
		assertEquals(dniEsp2, dniRec2);
	}
	
	@Test
	void testGetNombre() {
		String nomRec = new Persona("12345678A", "Pedro", "Gómez").getNombre();
		String nomEsp = "Pedro";
		assertEquals(nomEsp, nomRec);
		String nomRec2 = new Persona("87654321B", "Juan", "Pérez").getNombre();
		String nomEsp2 = "Juan";
		assertEquals(nomEsp2, nomRec2);
	}
	
	@Test
	void testGetApellido1() {
		String apRec = new Persona("12345678A", "Pedro", "Gómez").getApellido1();
		String apEsp = "Gómez";
		assertEquals(apEsp, apRec);
		String apRec2 = new Persona("87654321B", "Juan", "Pérez").getApellido1();
		String apEsp2 = "Pérez";
		assertEquals(apEsp2, apRec2);
	}
	
	@Test
	void testSetApellido1() {
		String apellido = "Sancho";
		new Persona().setApellido1(apellido);
		String apellido1 = "Dome";
		new Persona().setApellido1(apellido1);
	}

	@Test
	void testSetNombre() {
		String nombre = "Antonio";
		new Persona().setNombre(nombre);
		String nombre1 = "Iván";
		new Persona().setNombre(nombre1);
	}
	
	@Test
	void testSetDni() {
		fail("Not yet implemented");
	}

}
