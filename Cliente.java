package models;

import play.*;
import play.db.jpa.*;

import javax.persistence.*;

import java.util.*;

@Entity
public class Cliente extends Model {
    
	public String cedula;
	public String nombre;
	public String apellido;
	public String direccion;
	public String telefono;
	
	public Cliente(String cedula, String nombre, String apellido,
			String direccion, String telefono) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	public void actualizarCliente(String cedula, String nombre, String apellido,
			String direccion, String telefono) {

		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	
}
