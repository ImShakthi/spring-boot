package com.sakthi.restbox.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Repo {
  @JsonProperty private int id;
  @JsonProperty private String name;
}
