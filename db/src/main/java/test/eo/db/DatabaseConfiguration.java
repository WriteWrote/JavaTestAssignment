package test.eo.db;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EntityScan(basePackages = {
        "db.src.main.java.entities"
})
@EnableJpaRepositories
@EnableTransactionManagement
public class DatabaseConfiguration {
}
