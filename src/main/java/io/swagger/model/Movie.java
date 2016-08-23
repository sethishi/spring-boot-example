package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Actor;
import io.swagger.model.Movie;
import java.util.ArrayList;
import java.util.List;




/**
 * Movie
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-08-23T13:03:57.645Z")

public class Movie   {
  private String movieId = null;

  private String name = null;

  private List<Actor> actor = new ArrayList<Actor>();

  private List<Movie> influence = new ArrayList<Movie>();

  private String image = null;

  public Movie movieId(String movieId) {
    this.movieId = movieId;
    return this;
  }

   /**
   * Unique identifier representing a specific Movie
   * @return movieId
  **/
  @ApiModelProperty(value = "Unique identifier representing a specific Movie")
  public String getMovieId() {
    return movieId;
  }

  public void setMovieId(String movieId) {
    this.movieId = movieId;
  }

  public Movie name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the movie.
   * @return name
  **/
  @ApiModelProperty(value = "Name of the movie.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Movie actor(List<Actor> actor) {
    this.actor = actor;
    return this;
  }

  public Movie addActorItem(Actor actorItem) {
    this.actor.add(actorItem);
    return this;
  }

   /**
   * Get actor
   * @return actor
  **/
  @ApiModelProperty(value = "")
  public List<Actor> getActor() {
    return actor;
  }

  public void setActor(List<Actor> actor) {
    this.actor = actor;
  }

  public Movie influence(List<Movie> influence) {
    this.influence = influence;
    return this;
  }

  public Movie addInfluenceItem(Movie influenceItem) {
    this.influence.add(influenceItem);
    return this;
  }

   /**
   * Get influence
   * @return influence
  **/
  @ApiModelProperty(value = "")
  public List<Movie> getInfluence() {
    return influence;
  }

  public void setInfluence(List<Movie> influence) {
    this.influence = influence;
  }

  public Movie image(String image) {
    this.image = image;
    return this;
  }

   /**
   * Image URL representing the product.
   * @return image
  **/
  @ApiModelProperty(value = "Image URL representing the product.")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Movie movie = (Movie) o;
    return Objects.equals(this.movieId, movie.movieId) &&
        Objects.equals(this.name, movie.name) &&
        Objects.equals(this.actor, movie.actor) &&
        Objects.equals(this.influence, movie.influence) &&
        Objects.equals(this.image, movie.image);
  }

  @Override
  public int hashCode() {
    return Objects.hash(movieId, name, actor, influence, image);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Movie {\n");
    
    sb.append("    movieId: ").append(toIndentedString(movieId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    actor: ").append(toIndentedString(actor)).append("\n");
    sb.append("    influence: ").append(toIndentedString(influence)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

