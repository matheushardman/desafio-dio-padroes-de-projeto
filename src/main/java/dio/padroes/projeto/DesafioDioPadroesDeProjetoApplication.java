package dio.padroes.projeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DesafioDioPadroesDeProjetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioDioPadroesDeProjetoApplication.class, args);
	}
}
