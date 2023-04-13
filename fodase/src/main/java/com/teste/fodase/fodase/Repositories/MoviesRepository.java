package com.teste.fodase.fodase.Repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.teste.fodase.fodase.Models.Movie;

public interface MoviesRepository extends PagingAndSortingRepository<Movie, Long> {
}
