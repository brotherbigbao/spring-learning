package me.liuyibao.config;

import me.liuyibao.service.CompactDisc;
import me.liuyibao.service.impl.SqtPeppers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * Created by liuyibao on 2017/10/10.
 */
@Configuration
@PropertySource("app.properties")
public class AppConfig {

    @Autowired
    Environment env;

    @Bean
    public CompactDisc compactDisc() {
        return new SqtPeppers(env.getProperty("service.name"), env.getProperty("service.body"));
    }
}
