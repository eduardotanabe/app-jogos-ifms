package com.ifms.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ifms.entities.Modalidade;

@RestController
@RequestMapping(value = "/modalidades")
public class ModalidadeResource {

	@GetMapping()
	public ResponseEntity<List<Modalidade>> findAll() {
		List<Modalidade> lista = new ArrayList<Modalidade>();
		lista.add(new Modalidade(1L, "Futebol Americano"));
		lista.add(new Modalidade(2L, "Atletismo"));
		lista.add(new Modalidade(3L, "Voleibol"));
		return ResponseEntity.ok().body(lista);
	}
	
}
