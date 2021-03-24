package edu.socialnet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@SpringBootApplication
@EnableNeo4jRepositories("edu.socialnet.repositorios")
@EntityScan("edu.socialnet.modelos")
public class SocialnetApplication {

	public static void main(String[] args) {
		SpringApplication.run(SocialnetApplication.class, args);
	}
}
