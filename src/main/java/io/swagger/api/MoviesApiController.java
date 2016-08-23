package io.swagger.api;

import io.swagger.model.Movie;
import io.swagger.model.Error;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-08-23T13:03:57.645Z")

@Controller
public class MoviesApiController implements MoviesApi {

    public ResponseEntity<List<Movie>> moviesGet(@ApiParam(value = "Size of array") @RequestParam(value = "size", required = false) Double size) {



        return new ResponseEntity<List<Movie>>(HttpStatus.OK);
    }

}
