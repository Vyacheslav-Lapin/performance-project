package ru.vlapin.experiments.performanceproject.model.jsonplaceholder;

import static lombok.AccessLevel.PRIVATE;

import lombok.Data;
import lombok.Setter;

@Data
@Setter(PRIVATE)
public class Geo {

  Double lat;
  Double lng;
}
