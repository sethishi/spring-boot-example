package io.swagger.dao;

import com.google.common.base.Optional;
import io.swagger.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.Collection;

@Repository
public class MoviesDaoImpl implements MoviesDao {


    private static final String SELECT_ALL_MOVIES = "select name from movies where movie = ? and provider = ? order by expiry desc";
    private static final String SELECT_BY_PROFILE = "select * from subscriptions where profile_id = ? order by expiry desc";

    private final JdbcTemplate template;

    @Autowired
    public MoviesDaoImpl(DataSource dataSource){
        this.template = new JdbcTemplate(dataSource);

    }

    @Override
    public Collection<Movie> getAllMovies(int size) {


        return null;

    }

    @Override
    public Optional<Movie> getMovieByName(String movieName) {
        return null;
    }
}
