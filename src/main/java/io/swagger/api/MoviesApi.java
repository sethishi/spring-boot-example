package io.swagger.api;

import io.swagger.model.Movie;
import io.swagger.model.Error;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-08-23T13:03:57.645Z")

@Api(value = "movies", description = "the movies API")
public interface MoviesApi {

    @ApiOperation(value = "", notes = "Gets `Movie` objects. Optional query param of **size** determines size of returned array ", response = Movie.class, responseContainer = "List", tags={ "Movie", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "An array of products", response = Movie.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Movie.class) })
    @RequestMapping(value = "/movies",
        method = RequestMethod.GET)
    ResponseEntity<List<Movie>> moviesGet(@ApiParam(value = "Size of array") @RequestParam(value = "size", required = false) Double size



);

}
