package com.aps.videocall;

import com.aps.videocall.user.User;
import com.aps.videocall.user.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VideocallApplication {
	public static void main(String[] args) {
		SpringApplication.run(VideocallApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(UserService service) {
		return args -> {

			service.register(User.builder()
					.username("123")
					.email("123@yandex.ru")
					.password("123")
					.build());

			service.register(User.builder()
					.username("vuachik")
					.email("vuachik@yandex.ru")
					.password("qwerty123")
					.build());

			service.register(User.builder()
					.username("tuffi")
					.email("tuffi@yandex.ru")
					.password("qwerty123")
					.build());

			service.register(User.builder()
					.username("sofiki")
					.email("sofiki@yandex.ru")
					.password("qwerty123")
					.build());

		};
	}
}
