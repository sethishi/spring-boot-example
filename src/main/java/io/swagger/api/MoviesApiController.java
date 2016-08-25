package io.swagger.api;

import com.google.common.base.Optional;
import io.swagger.dao.MoviesDao;
import io.swagger.model.Movie;
import io.swagger.model.Error;

import io.swagger.annotations.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-08-23T13:03:57.645Z")


@Controller
public class MoviesApiController implements MoviesApi {

    @Autowired
    private MoviesDao moviesDao;

    public ResponseEntity<List<Movie>> moviesGet(@ApiParam(value = "Size of array") @RequestParam(value = "size", required = false) Double size) {
        return new ResponseEntity<List<Movie>>(HttpStatus.OK);
    }



    @RequestMapping("/handle")
    public ResponseEntity<String> moviesGetByName(@RequestParam(value = "name", required = true) String name) {

        List<Movie> m = moviesDao.getMovieByName(name);
        return new ResponseEntity<String>(m.get(0).getName(),HttpStatus.OK);
    }
}
