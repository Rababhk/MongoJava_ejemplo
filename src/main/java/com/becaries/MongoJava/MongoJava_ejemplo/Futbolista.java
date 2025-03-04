package com.becaries.MongoJava.MongoJava_ejemplo;

import java.util.ArrayList;

import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;

public class Futbolista {

	private String nombre;
	private String apellidos;
	private Integer edad;
	private ArrayList<String> demarcacion;
	private Boolean internacional;
	private String id;

	public Futbolista(String nombre, String apellidos, Integer edad, ArrayList<String> demarcacion,
			Boolean internacional, String id) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.demarcacion = demarcacion;
		this.internacional = internacional;
		this.setId(id);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Futbolista() {
	}

	public Futbolista(String nombre, String apellidos, Integer edad, ArrayList<String> demarcacion, Boolean internacional) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.demarcacion = demarcacion;
		this.internacional = internacional;

	}

	// Transformo un objecto que me da MongoDB a un Objecto Java
	public Futbolista(BasicDBObject dBObjectFutbolista) {
		this.nombre = dBObjectFutbolista.getString("nombre");
		this.apellidos = dBObjectFutbolista.getString("apellidos");
		this.edad = dBObjectFutbolista.getInt("edad");
		this.id= dBObjectFutbolista.getString("_id");
		// Cuidado cuando trabajamos con Arrays o Listas
		BasicDBList listDemarcaciones = (BasicDBList) dBObjectFutbolista.get("demarcacion");
		this.demarcacion = new ArrayList<String>();
		for (Object demarc : listDemarcaciones) {
			this.demarcacion.add(demarc.toString());
		}

		this.internacional = dBObjectFutbolista.getBoolean("internacional");
	}

	public BasicDBObject toDBObjectFutbolista() {

		// Creamos una instancia BasicDBObject
		BasicDBObject dBObjectFutbolista = new BasicDBObject();

		dBObjectFutbolista.append("nombre", this.getNombre());
		dBObjectFutbolista.append("apellidos", this.getApellidos());
		dBObjectFutbolista.append("edad", this.getEdad());
		dBObjectFutbolista.append("demarcacion", this.getDemarcacion());
		dBObjectFutbolista.append("internacional", this.getInternacional());

		return dBObjectFutbolista;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public ArrayList<String> getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(ArrayList<String> demarcacion) {
		this.demarcacion = demarcacion;
	}

	public Boolean getInternacional() {
		return internacional;
	}

	public void setInternacional(Boolean internacional) {
		this.internacional = internacional;
	}

	@Override
	public String toString() {
		return "Nombre: " + this.getNombre() + " " + this.getApellidos() + " / Edad: " + this.edad + " / Demarcación: " + this.demarcacion.toString() + " / Internacional: " + this.internacional;
	}
}
