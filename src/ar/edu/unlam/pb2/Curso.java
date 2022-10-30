package ar.edu.unlam.pb2;

import java.util.ArrayList;

public class Curso {

	private Integer codigo;
	private String nom;
	private Integer cuota;
	private Integer duracion;
	private Integer contador = 0;
	private Integer limiteA= 50;
	private ArrayList<Instructor> instructores;
	private ArrayList<Alumno> alumnos;

	public Curso(Integer codigo, String nom, Integer cuota, Integer duracion, Instructor instructor, Alumno alumno) {
		this.codigo = codigo;
		this.nom = nom;
		this.cuota = cuota;
		this.duracion = duracion;
		this.instructores = new ArrayList<>();
		this.alumnos = new ArrayList<>();;
	}

	public void agregarInstructor(Instructor instructor) {
		this.instructores.add(instructor);
		
	}

	public ArrayList<Instructor> getInstructores() {
		return instructores;
	}

	public void contadorAlumnos() {
		if (this.contador < this.limiteA) {
			this.contador++;
		}
		
	}

	public void agregarAlumnos(Alumno alumnos) {
		if (this.contador <= this.limiteA) {
			this.alumnos.add(alumnos);
		}else {
			this.contador = 0;
			
			
		}
		
	}
	
	

	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}


	public Integer getContador() {
		return contador;
	}

	
	

}
