package Afisha.reviews.controller;

import Afisha.reviews.servise.PutAndGet;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

/**
 * Class for get and put data from DB
 * @version 1.1.1
 */

public class Controller {

    PutAndGet dataPut = new PutAndGet();

    @PostMapping("/setReview")
    public ArrayList<String> setReview(String reviewerName) {

        dataPut.putData(setReview(reviewerName));
        return null;
    }

    @GetMapping("/getReview")
    public ResponseEntity<String> getReview() {
        dataPut.getData();
        return null;
    }
}
