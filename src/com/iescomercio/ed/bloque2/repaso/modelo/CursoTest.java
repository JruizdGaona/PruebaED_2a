package com.iescomercio.ed.bloque2.repaso.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CursoTest {

	@Test
	void testEliminarAlumno() {
		Curso c1 = new Curso();
		c1.aniadirAlumno(new Persona("72930462Q","Sara","Martinez"));
		c1.aniadirAlumno(new Persona("00374926D","Pepe","Botella"));
		
		int numeroAlum1 = c1.numeroAlumnos();
		try {
			c1.eliminarAlumno("72930462Q");
		} catch (Exception e) {
			e.printStackTrace();
		}
		int numeroAlum2 = c1.numeroAlumnos();
		
		assertEquals(numeroAlum1 - 1, numeroAlum2);
		
		Exception e = assertThrows(Exception.class, ()->c1.eliminarAlumno("7358H"));
		assertEquals(e.getMessage(), "El dni no tiene la longitud adecuada");
	}

	@Test
	void testAniadirAlumno() {
		Persona p1 = new Persona("73489237Y", "Sandra", "Garc�a");
		Persona p2 = new Persona("74947573G", "Marta", "G�mez");
		Curso c = new Curso();
		
		c.aniadirAlumno(p1);
		c.aniadirAlumno(p2);

	}

	@Test
	void testEstaRegistrado() {
		Persona p1 = new Persona("73849329J","Carlos","Perez");
		Curso c = new Curso();
		
		c.aniadirAlumno(p1);
	
		assertTrue(c.estaRegistrado("73849329J"));
		assertFalse(c.estaRegistrado("67483920M"));
	}

	@Test
	void testCurso() {
		fail("Not yet implemented");
	}

	@Test
	void testNumeroAlumnos() {
		fail("Not yet implemented");
	}
}
