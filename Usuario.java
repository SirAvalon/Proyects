package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import play.db.jpa.Blob;
import play.db.jpa.Model;

@Entity
public class Usuario extends Model {
	public String username;	
	public String password;
	
	
	public String cedula;
	public String apellido;
	public String nombre;
	public Blob imagen;
	public String codigo;
	public String telefono;
	public String celular;
	public Date fechaNa;
	public Date fechaIn;
	public String direccion;
	public String especialidad;
	
	
	@ManyToOne
	public Perfil perfil;
	
	
	//Constructor para crear el usuario administrador por defecto
	public Usuario(String username, String password, Perfil perfil) {
		super();
		this.username = username;
		this.password = password;
		this.perfil = perfil;
	}
	

	//Constructor para crear usuarios con la interfaz de administracion
	public Usuario(String username, String password, String cedula, String apellido, String nombre, Perfil perfil,String codigo,String telefono,String celular,Date fechaNa,Date fechaIn,String direccion,String especialidad) {
		super();
		this.username = username;
		this.password = password;
		this.cedula = cedula;
		this.apellido = apellido;
		this.nombre = nombre;
		this.perfil = perfil;
		this.codigo = codigo;
		this.telefono = telefono;
		this.celular = celular;
		this.fechaNa = fechaNa;
		this.fechaIn = fechaIn;
		this.direccion = direccion;
		this.especialidad = especialidad;
		

	}
	
	
	
	public void actualizarDatos(String cedula, String apellido, String nombre, Perfil perfil,String codigo,String telefono,String celular,Date fechaNa,Date fechaIn,String direccion,String especialidad){
		this.cedula = cedula;
		this.apellido = apellido;
		this.nombre = nombre;
		this.perfil = perfil;
		this.codigo = codigo;
		this.telefono = telefono;
		this.celular = celular;
		this.fechaNa = fechaNa;
		this.fechaIn = fechaIn;
		this.direccion = direccion;
		this.especialidad = especialidad;
	}
	
	
	public void reestablecerPassword(){
		this.password=this.cedula;
		this.username=this.cedula;
	}
	
	
	public void actualizarCuenta(String cedula, String apellido, String nombre, String username){
		this.cedula = cedula;
		this.apellido = apellido;
		this.nombre = nombre;
		this.username=username;
	}
	
	public void actalizarPassword(String password){
		this.password=password;
		
	}
	
	public String toString(){
		return this.nombre+" "+this.apellido;
	}
	
}
