package pe.gob.indeci.sinpad.modelo.entidad;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/*
 * CREATE TABLE "SINPAD"."PARAMETRO" 
   ("ID" NUMBER, 
	"TIPO" VARCHAR2(16 BYTE), 
	"NOMBRE" VARCHAR2(64 BYTE), 
	"VALOR" VARCHAR2(128 BYTE)
   )
 */

@Entity
@Table(name="parametro")
public class Parametro implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	String tipo;
	String nombre;
	String valor;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	
	

}
