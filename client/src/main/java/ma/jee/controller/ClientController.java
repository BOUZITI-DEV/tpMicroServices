package ma.jee.controller;

import java.util.List;		

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import ma.jee.model.Client;
import ma.jee.repository.ClientRepository;

@RestController
public class ClientController {
	@Autowired
	ClientRepository clientRepository;

	@GetMapping("/clients")
	public List findAll() {
		return clientRepository.findAll();
	}

	@GetMapping("/client/{id}")
	public Client findById(@PathVariable int id) throws Exception {
		return this.clientRepository.findById(id).orElseThrow(() -> new Exception("Client inexistant"));
	}

}
