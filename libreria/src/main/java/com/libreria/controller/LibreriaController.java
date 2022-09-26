package com.libreria.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.libreria.entities.Prestamo;
import com.libreria.service.PrestamoService;

@RestController
@RequestMapping("/api")
public class LibreriaController {
@Autowired
	private PrestamoService prestamoService;

@GetMapping("/prestamo")
	public List<Prestamo> getList(){
		return prestamoService.readAll();
	}
@PostMapping("/prestamo")
public ResponseEntity<String> createTutorial(@RequestBody Prestamo prestamo) {
  try {
	  prestamoService.create(new Prestamo(prestamo.getFecha_devolucion(), prestamo.getIdalumno(), prestamo.getIdempleado(),prestamo.getIddetalle());
    return new ResponseEntity<>("zz was created successfully.", HttpStatus.CREATED);
  } catch (Exception e) {
    return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
  }
}

}
