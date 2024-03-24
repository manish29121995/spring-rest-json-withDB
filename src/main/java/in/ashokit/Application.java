package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	int a = 10;
	String manish = "HY Manish...";

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
