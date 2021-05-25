package ru.vlapin.experiments.performanceproject.config;

import ru.vlapin.experiments.performanceproject.model.JavaConfigBasedSetterPropertiesPlaceholderExample;
import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
@ConfigurationPropertiesScan("ru.vlapin.experiments.performanceproject")
public class PropertyPlaceholder {

  @Bean
  @ConfigurationProperties("my-properties2")
  JavaConfigBasedSetterPropertiesPlaceholderExample mySetterProperties2() {
    return new JavaConfigBasedSetterPropertiesPlaceholderExample();
  }
}
