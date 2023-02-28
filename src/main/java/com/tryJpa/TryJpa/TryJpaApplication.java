package com.tryJpa.TryJpa;

import com.tryJpa.TryJpa.config.RsaKeyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableConfigurationProperties(RsaKeyProperties.class)
@SpringBootApplication
//@EnableScheduling
public class TryJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TryJpaApplication.class, args);
	}

}
