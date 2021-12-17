package com.inspo.solutions.service;

import com.inspo.solutions.model.Joke;
import com.inspo.solutions.model.JokeList;
import org.springframework.http.MediaType;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class JokeService {

    private final KafkaTemplate<String, Joke> kafkaTemplate;
    private final String KAFKA_TOPIC = "jokes";

    public JokeService(KafkaTemplate<String, Joke> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void getJokeList(long numberOfJokes){
        Mono<JokeList> jokeListMono = WebClient.create()
                .get()
                .uri("https://v2.jokeapi.dev/joke/Any?amount=" + numberOfJokes)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(JokeList.class);

        jokeListMono.subscribe(domainList -> {
            domainList.getJokes()
                    .forEach(joke -> {
                        kafkaTemplate.send(KAFKA_TOPIC, joke);
                        System.out.println("joke setup message" + joke.getSetup());
                    });
        });
    }
}
