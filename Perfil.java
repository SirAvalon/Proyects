package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Perfil extends Model {
    public String descripcion;

	public Perfil(String descripcion) {
		super();
		this.descripcion = descripcion;
	}
    
}
