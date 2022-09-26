package com.libreria.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.libreria.dao.Todo;
import com.libreria.entities.Prestamo;
@Component
public class PrestamodaImpl implements Todo<Prestamo>{
	@Autowired
    private JdbcTemplate jdbcTemplate;
	@Override
	public int create(Prestamo t) {
	    return jdbcTemplate.update("INSERT INTO prestamo (idprestamo,fecha_prestamo, fecha_devolucion, idalumno,idempleado,iddetalle) VALUES(0,now(),?,?,?,?)",
	            new Object[] {t.getFecha_devolucion(),t.getIdalumno(),t.getIdempleado(),t.getIddetalle()  });
	}

	@Override
	public int update(Prestamo t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Prestamo read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Prestamo> readAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("SELECT idprestamo, fecha_prestamo, idalumno, idempleado, prestamo.iddetalle, libro.nombre FROM libreria.prestamo\r\n"
				+ "inner join libreria.detalle\r\n"
				+ "on prestamo.iddetalle = detalle.iddetalle\r\n"
				+ "inner join libreria.libro\r\n"
				+ "on detalle.idlibro = libro.idlibro;", new BeanPropertyRowMapper<Prestamo>(Prestamo.class));
	}

}
