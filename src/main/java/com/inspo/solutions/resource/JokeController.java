package com.inspo.solutions.resource;

import com.inspo.solutions.service.JokeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/joke")
public class JokeController {
    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping("/publish/{numberOfJoke}")
    public String publishJoke(@PathVariable("numberOfJoke") long numberOfJoke){
        jokeService.getJokeList(numberOfJoke);
        return "successfully sent joke to kafka topics";
    }
}
