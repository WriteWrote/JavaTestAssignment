package test.eo.rest;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"test.eo.rest","test.eo.service"})
public class RestConfiguration {
}
