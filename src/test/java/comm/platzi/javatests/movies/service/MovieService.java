package comm.platzi.javatests.movies.service;

import comm.platzi.javatests.movies.data.MovieRepository;
import comm.platzi.javatests.movies.model.Genre;
import comm.platzi.javatests.movies.model.Movie;

import java.util.Collection;
import java.util.stream.Collectors;

public class MovieService {

    private MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Collection<Movie> findMoviesByGenre(Genre genre) {
        return movieRepository.findAll().stream()
                .filter(movie -> movie.getGenre() == genre).collect(Collectors.toList());
    }
}
