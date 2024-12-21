package hu.unideb.inf.hangszerek;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HangszerekApplication {

	public static void main(String[] args) {
		SpringApplication.run(HangszerekApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper() {
		ModelMapper m = new ModelMapper();
		return m;
	}
/*
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**") // Minden endpointra engedélyezi a CORS-t
						.allowedOrigins("http://localhost:4200") // Angular app originje
						.allowedMethods("GET", "POST", "PUT", "DELETE","OPTIONS") // Engedélyezett HTTP metódusok
						.allowedHeaders("*").allowCredentials(true); // Minden fejlécre vonatkozik
			}
		};
	}*/

	/*@Bean
	public FilterRegistrationBean<CorsFilter> processCorsFilter() {
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		CorsConfiguration config = new CorsConfiguration();
		config.setAllowCredentials(true);
		config.addAllowedOrigin("http://localhost:4200");
		config.addAllowedHeader("*");
		config.addAllowedMethod("*");
		source.registerCorsConfiguration("/**", config);

		FilterRegistrationBean<CorsFilter> bean = new FilterRegistrationBean<CorsFilter>(new CorsFilter(source));
		bean.setOrder(0);
		return bean;
	}*/

}
