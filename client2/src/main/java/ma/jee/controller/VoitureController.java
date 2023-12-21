package ma.jee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import ma.jee.model.Voiture;
import ma.jee.repository.VoitureRepository;

@RestController
public class VoitureController {
	@Autowired
	VoitureRepository voitureRepository;

	@GetMapping("/voitures")
	public List findAll() {
		return voitureRepository.findAll();
	}

	@GetMapping("/voiture/{id}")
	public Voiture findById(@PathVariable int id) throws Exception {
		return this.voitureRepository.findById(id).orElseThrow(() -> new Exception("Voiture inexistante"));
	}

}
