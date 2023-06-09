package dev.chandraji.movies.service;

import dev.chandraji.movies.data.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/movies")
public class MoviesController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies() {
        return new ResponseEntity<>(movieService.allMovies(), HttpStatus.OK);
    }

    @GetMapping("/{id}/movie")
    public ResponseEntity<Optional<Movie>> findAMovie(@PathVariable String id) {
        return new ResponseEntity<>(movieService.findAMovie(id), HttpStatus.OK);
    }

}
