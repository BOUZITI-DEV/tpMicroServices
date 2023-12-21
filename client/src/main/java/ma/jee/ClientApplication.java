package ma.jee;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import ma.jee.model.Client;
import ma.jee.repository.ClientRepository;

@EnableDiscoveryClient
@SpringBootApplication
public class ClientApplication {

	@Bean
	CommandLineRunner initializeBaseH2(ClientRepository clientRepository) {
		return args -> {
			clientRepository.save(new Client(1, "Rabab SELIMANI", Float.parseFloat("23")));
			clientRepository.save(new Client(2, "Amal RAMI", Float.parseFloat("22")));
			clientRepository.save(new Client(3, "Samir SAFI", Float.parseFloat("22")));
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}
}
