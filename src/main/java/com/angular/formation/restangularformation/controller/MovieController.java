package com.angular.formation.restangularformation.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.angular.formation.restangularformation.entity.Movie;
import com.angular.formation.restangularformation.repository.MovieRepository;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin
public class MovieController {
	
	@Autowired
    private MovieRepository movieRepository;

    @GetMapping("/movies")
    public List <Movie> getAll() {
        return movieRepository.findAll();
    }
    
    @PostMapping("/movies")
    public Movie createMovie(@Valid @RequestBody Movie movie) {
        return movieRepository.save(movie);
    }
    
    @DeleteMapping("/employees/{id}")
    public Map < String, Boolean > deleteMovie(@PathVariable(value = "id") Long employeeId)
    {
        Movie movie = movieRepository.findById(employeeId).get();

        movieRepository.delete(movie);
        Map < String, Boolean > response = new HashMap < > ();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
    
    

}
