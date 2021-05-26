package ru.vlapin.experiments.performanceproject;

import static org.springframework.hateoas.config.EnableHypermediaSupport.HypermediaType.HAL;

import lombok.val;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.hateoas.config.EnableHypermediaSupport;
import ru.vlapin.experiments.performanceproject.model.JavaConfigBasedSetterPropertiesPlaceholderExample;

@SpringBootApplication
@EnableHypermediaSupport(type = HAL)
@EnableFeignClients("ru.vlapin.experiments.performanceproject.service")
@ConfigurationPropertiesScan//("ru.vlapin.experiments.performanceproject")
public class PerformanceProjectApplication {

  public static void main(String[] args) {
    SpringApplication.run(PerformanceProjectApplication.class, args);

    //    String stringBuffer = "";
    //    for (int i = 0; i < 55_000; i++) {
    //      stringBuffer = String.format("%stringBuffer, %d\n", stringBuffer, i);
    //      stringBuffer = new StringBuffer(stringBuffer).append(String.format(", %d\n", i)).toString();
    //    }

    val stringBuffer = new StringBuffer();
    for (int i = 0; i < 55_000; i++) {
      stringBuffer.append(String.format(", %d\n", i));
    }
    String s = stringBuffer.toString();

    System.out.println("s = " + s);
  }

  @Bean
  @ConfigurationProperties("my-properties2")
  JavaConfigBasedSetterPropertiesPlaceholderExample mySetterProperties2() {
    return new JavaConfigBasedSetterPropertiesPlaceholderExample();
  }
}
