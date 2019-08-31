package com.thaido.ratingdataservice.controller;

import com.thaido.ratingdataservice.model.Rating;
import com.thaido.ratingdataservice.model.UserRatings;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("rating")
public class RatingController {

  @RequestMapping("/{movieId}")
  public Rating getRating(@PathVariable("movieId") String movieId) {

    return new Rating(
      movieId,
      4
    );
  }

  @RequestMapping("/user/{userId}")
  public UserRatings getUsersRating(@PathVariable("userId") String userId) {
    List<Rating> ratings = Arrays.asList(
      new Rating("1234", 4),
      new Rating("5678", 5)
    );
    UserRatings userRatings = new UserRatings();
    userRatings.setUserRatings(ratings);
    return userRatings;
  }
}
