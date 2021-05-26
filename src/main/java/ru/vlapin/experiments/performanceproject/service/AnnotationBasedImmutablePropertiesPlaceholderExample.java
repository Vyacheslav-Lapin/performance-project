package ru.vlapin.experiments.performanceproject.service;

import static lombok.AccessLevel.PRIVATE;

import javax.annotation.PostConstruct;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.NonFinal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import ru.vlapin.experiments.performanceproject.config.DataJpaIniter;

/**
 * Limitations:
 * - no defaults (!!!)
 */
@Getter
@ConstructorBinding
@RequiredArgsConstructor
@ConfigurationProperties("mail.credentials")
public final class AnnotationBasedImmutablePropertiesPlaceholderExample {

  @NonFinal
  @Setter(value = PRIVATE, onMethod_ = @Autowired)
  DataJpaIniter dataJpaIniter;

  /**
   * Auth method
   */
  String authMethod;

  /**
   * login
   */
  String username;

  /**
   * pwd
   */
  String password;

  @PostConstruct
  private void init() {
    System.out.println("dataJpaIniter = " + dataJpaIniter);
  }

}
