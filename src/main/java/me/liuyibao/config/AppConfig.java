package me.liuyibao.config;

import me.liuyibao.service.CompactDisc;
import me.liuyibao.service.impl.SqtPeppers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * Created by liuyibao on 2017/10/10.
 */
@Configuration
@ComponentScan(basePackages = {"me.liuyibao"})
@PropertySource("app.properties")
@EnableAspectJAutoProxy
public class AppConfig {

    @Autowired
    Environment env;

    @Bean
    public CompactDisc compactDisc() {
        return new SqtPeppers(env.getProperty("service.name"), env.getProperty("service.body"));
    }

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://10.209.44.12:10043/opads");
        ds.setUsername("opads");
        ds.setPassword("opads");
        return ds;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
}
