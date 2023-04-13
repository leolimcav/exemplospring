package com.teste.fodase.fodase.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "movies")
public class Movie {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String genre;
}
