import io.swagger.dao.MoviesDao;
import io.swagger.dao.MoviesDaoImpl;
import io.swagger.model.Movie;
import org.apache.commons.dbcp.BasicDataSource;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MovieDaoTest.TestConfig.class)
public class MovieDaoTest {


    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private MoviesDao moviesDao;

    @Autowired
    private DataSource dataSource;


    @Test
    public void firstTest() {

        List<Movie> movies = moviesDao.getMovieByName("Star Wars");

        System.out.println(movies.get(0).getMovieId());



    }


    @Configuration
    public static class TestConfig {


        @Bean
        public DataSource dataSource()
        {
            BasicDataSource dataSource = new BasicDataSource();
            dataSource.setDriverClassName("com.mysql.jdbc.Driver");
            dataSource.setUrl("jdbc:mysql://localhost/:3306/test_app_personal");
            dataSource.setUsername("root");
            dataSource.setPassword("root");
            return dataSource;
        }

        @Bean
        public JdbcTemplate jdbcTemplate(DataSource dataSource)
        {
            return new JdbcTemplate(dataSource);
        }

        @Bean
        public MoviesDao moviesDao(){
            MoviesDao moviesDao = new MoviesDaoImpl(dataSource());

            return moviesDao;
        }



    }
}
