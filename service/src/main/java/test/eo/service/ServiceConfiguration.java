package test.eo.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "test.eo.service")
@EnableAspectJAutoProxy
public class ServiceConfiguration {
}
