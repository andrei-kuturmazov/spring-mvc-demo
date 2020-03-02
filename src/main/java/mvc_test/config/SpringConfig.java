package mvc_test.config;

import mvc_test.service.TestBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    @Bean
    public TestBean getTestBean() {
        return new TestBean("My name is Andrei");
    }

    @Bean
    public JdbcTemplate getJdbcTemplate() {
        return new JdbcTemplate(getDataSource());
    }

    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/mvc_test?useSll=false");
        dataSource.setUsername("admin");
        dataSource.setPassword("15762105");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return dataSource;
    }
}
