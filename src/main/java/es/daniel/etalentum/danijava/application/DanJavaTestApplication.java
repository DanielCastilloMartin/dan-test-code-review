package es.daniel.etalentum.danijava.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication(scanBasePackages = {"es.daniel.test.etalentum.danijavatest"})
public class DanJavaTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DanJavaTestApplication.class, args);

	}

	@PostConstruct
	public void init(){
		// Setting Spring Boot SetTimeZone
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
	}
}
