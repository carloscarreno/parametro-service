package pe.gob.indeci.sinpad.servicio;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.gob.indeci.sinpad.modelo.dao.DaoParametro;
import pe.gob.indeci.sinpad.modelo.entidad.Parametro;

@Service
public class ServicioParametroImpl implements ServicioParametro {
    
	@Autowired
	private DaoParametro dao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Parametro> findAll() {
		return (List<Parametro>) dao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Parametro findById(Long id) {
		return  dao.findById(id).orElse(null);
	}

	@Override
	@Transactional(readOnly = false)
	public Parametro save(Parametro o) {
		 dao.save(o);
		 return o;
	}

	@Override
	@Transactional(readOnly = false)
	public Parametro update(Parametro o) {
		delete(o.getId());
		save(o);
		return o;
	}

	@Override
	@Transactional(readOnly = false)
	public void delete(Long id) {
		Parametro aux = findById(id);
		dao.delete(aux);
	}

}
