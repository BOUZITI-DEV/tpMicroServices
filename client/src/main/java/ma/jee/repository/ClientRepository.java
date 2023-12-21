package ma.jee.repository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.jee.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {
	
}

