package com.libreria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libreria.dao.Todo;
import com.libreria.daoImpl.PrestamodaImpl;
import com.libreria.entities.Prestamo;


@Service
public class PrestamoService implements Todo<Prestamo>{
	@Autowired
	private PrestamodaImpl daoIMpl;
	@Override
	public int create(Prestamo t) {
		// TODO Auto-generated method stub
		return daoIMpl.create(t);
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
		return daoIMpl.readAll();
	}

}
