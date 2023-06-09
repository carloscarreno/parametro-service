package pe.gob.indeci.sinpad.servicio;

import java.util.List;

import pe.gob.indeci.sinpad.modelo.entidad.Parametro;

public interface ServicioParametro {
	public List<Parametro> findAll();
	public Parametro findById(Long id);
	public Parametro save(Parametro o);
	public Parametro update(Parametro o);
	public void delete(Long id);
	
}
