package pisteamakhbkktm.Recipe_Book_Gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class RecipeBookGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecipeBookGatewayApplication.class, args);
	}

}
