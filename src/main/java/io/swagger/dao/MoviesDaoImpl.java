package io.swagger.dao;

import com.google.common.base.Optional;
import io.swagger.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import javax.swing.text.html.Option;
import java.util.Collection;
import java.util.List;

@Repository
public class MoviesDaoImpl implements MoviesDao {


    private static final String SELECT_ALL_MOVIES = "select * from movies limit by ?";
    private static final String SELECT_MOVIE_BY_NAME = "select * from movies where name = ?";

    private final JdbcTemplate template;

    @Autowired
    public MoviesDaoImpl(DataSource dataSource){
        this.template = new JdbcTemplate(dataSource);

    }

    @Override
    public Collection<Movie> getAllMovies(int size) {

        List<Movie> movies=  template.query(SELECT_ALL_MOVIES, new Object[]{ size },new BeanPropertyRowMapper(Movie.class));

        return movies;
    }

    @Override
    public List<Movie> getMovieByName(String movieName) {

        List<Movie> movies=  template.query(SELECT_MOVIE_BY_NAME, new Object[]{ movieName },new BeanPropertyRowMapper(Movie.class));

        return movies;
    }
}

