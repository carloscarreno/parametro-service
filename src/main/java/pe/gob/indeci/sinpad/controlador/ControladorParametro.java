package pe.gob.indeci.sinpad.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.gob.indeci.sinpad.modelo.entidad.Parametro;
import pe.gob.indeci.sinpad.servicio.ServicioParametro;

@RestController
@RequestMapping(path="/parametro")
public class ControladorParametro {

	@Autowired
	private ServicioParametro servicio;

	@GetMapping("/listar")
	public List<Parametro> listar(){
		return servicio.findAll();
	}
	
	@GetMapping("/mostrar/{id}")
	public Parametro mostrar(@PathVariable Long id) {
		return servicio.findById(id);
	}

	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable Long id) {
		 servicio.delete(id);
	}
	
	@PostMapping("/guardar/{p}")
	public Parametro guardar(@PathVariable Parametro p) {
		return servicio.save(p);
	}
	
	@PutMapping("/actualizar/{p}")
	public Parametro actualizar(@PathVariable Parametro p) {
		return servicio.update(p);
	}
	
}