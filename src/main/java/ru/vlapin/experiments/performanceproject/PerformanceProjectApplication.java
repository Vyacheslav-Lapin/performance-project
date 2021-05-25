package ru.vlapin.experiments.performanceproject;

import lombok.val;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
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
}
