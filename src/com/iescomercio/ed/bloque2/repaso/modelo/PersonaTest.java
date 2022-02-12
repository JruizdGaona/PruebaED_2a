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
	void testSetDni() {
		fail("Not yet implemented");
	}

	@Test
	void testGetNombre() {
		fail("Not yet implemented");
	}

	@Test
	void testSetNombre() {
		fail("Not yet implemented");
	}

	@Test
	void testGetApellido1() {
		fail("Not yet implemented");
	}

	@Test
	void testSetApellido1() {
		fail("Not yet implemented");
	}

}
