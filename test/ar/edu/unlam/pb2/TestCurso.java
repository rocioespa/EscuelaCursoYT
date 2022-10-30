package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCurso {

	@Test
	public void sePuedeCrearUnCurso() {
		Curso curso = new Curso(3521, "Lenguaje", 7000, 2, null, null);
		assertNotNull(curso);
	}
	
	@Test
	public void sePuedaAgregarUnInstructorEnElCurso() {
		
		Integer dni = 43446347;
		String nombre = "pepito";
		String email = "rochiespa@gmail.com";
		Integer codigo = 3521;
		String nom = "Lenguaje";
		Integer cuota = 7000;
		Integer duracion = 2;
		Integer legajo = 3782;
		String nomb = "Rocio";
		Integer telefono = 1133518168;
		Instructor instructor = new Instructor(dni ,nombre ,email);
		Alumno alumno = new Alumno(legajo,nomb,telefono);
		Curso curso = new Curso(codigo,nom,cuota,duracion,instructor,alumno);
		
		curso.agregarInstructor(instructor);
		Integer valorEsperado = 1;
		Integer valorObtenido = curso.getInstructores().size();
				
		assertEquals(valorEsperado,valorObtenido);
	}
	
	@Test
	public void sePuedaAgregarAlumnosAUnCurso() {
		
		Integer dni = 43446347;
		String nombre = "pepito";
		String email = "rochiespa@gmail.com";
		Integer codigo = 3521;
		String nom = "Lenguaje";
		Integer cuota = 7000;
		Integer duracion = 2;
		Integer legajo = 3782;
		String nomb = "Rocio";
		Integer telefono = 1133518168;
		Instructor instructor = new Instructor(dni ,nombre ,email);
		Alumno alumno = new Alumno(legajo,nomb,telefono);
		Curso curso = new Curso(codigo,nom,cuota,duracion,instructor,alumno);
		Integer contador = 0;
		Integer limiteA = 50;
		while(contador<limiteA) {
			curso.contadorAlumnos();
			curso.agregarAlumnos(alumno);
			contador++;
		}
		Integer valorEsperado = curso.getContador();
		Integer valorObtenido = curso.getAlumnos().size();
				
		assertEquals(valorEsperado,valorObtenido);
	}

}
