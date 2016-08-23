package io.swagger.dao;

import com.google.common.base.Optional;
import io.swagger.model.Movie;

import java.util.Collection;

/**
 * Created by sethishi on 23/08/2016.
 */
public interface MoviesDao {


    Collection<Movie> getAllMovies(int size);

    Optional<Movie> getMovieByName(String movieName);

}
