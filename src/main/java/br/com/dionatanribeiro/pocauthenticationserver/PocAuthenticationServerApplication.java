package br.com.dionatanribeiro.pocauthenticationserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableAuthorizationServer
@EnableResourceServer
public class PocAuthenticationServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PocAuthenticationServerApplication.class, args);
	}

}
