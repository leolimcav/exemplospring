package com.teste.fodase.fodase.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.teste.fodase.fodase.Models.Movie;
import com.teste.fodase.fodase.Repositories.MoviesRepository;

@RestController
@RequestMapping("/movies")
public class MoviesController {

  @Autowired
  private MoviesRepository _repository;

  @GetMapping()
  public Page<Movie> index(@RequestParam(name = "pageNumber", defaultValue = "0") int pageNumber, @RequestParam(name = "pageSize", defaultValue = "10") int pageSize) {
    return _repository.findAll(Pageable.ofSize(pageSize).withPage(pageNumber));
  }
}
