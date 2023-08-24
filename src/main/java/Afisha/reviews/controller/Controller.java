package Afisha.reviews.controller;

import Afisha.reviews.model.JsonSimpleParser;
import Afisha.reviews.model.Rating;
import Afisha.reviews.model.Review;
import Afisha.reviews.model.ReviewRepository;
import Afisha.reviews.servise.PutAndGet;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Class for get and put data from DB
 * @version 1.1.1
 */

@RestController
public class Controller {

    @Autowired
    private ReviewRepository reviewRepository;

    PutAndGet dataPut = new PutAndGet();

    @PostMapping("/setReview")
    public ArrayList<String> setReview(String reviewerName) {

        dataPut.putData(setReview(reviewerName));
        return null;
    }

    @GetMapping("/getReview")
    public ResponseEntity<String> getReview(@RequestParam MultipartFile json) throws IOException {
        String stringJson = new String(json.getBytes());
        JsonSimpleParser jsonSimpleParser = new JsonSimpleParser();
        Review review = jsonSimpleParser.parseAndCreateRating(stringJson); // Создаем объект Rating из JSON
        reviewRepository.save(review); // Сохраняем рейтинг в базе данных
        return ResponseEntity.ok("Data saved successfully");
    }
}
