package me.liuyibao.config;

import me.liuyibao.aop.Audience;
import me.liuyibao.aop.MoviePerformance;
import me.liuyibao.aop.Performance;
import me.liuyibao.service.CompactDisc;
import me.liuyibao.service.impl.SqtPeppers;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * Created by liuyibao on 2017/10/10.
 */
@Configuration
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
    public Performance performance() {
        return new MoviePerformance();
    }

    @Bean
    public Audience audience() {
        return new Audience();
    }
}
