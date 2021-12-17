package com.inspo.solutions.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class JokeList {
    private boolean error;
    private int amount;
    private List<Joke> jokes = new ArrayList<>();

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public List<Joke> getJokes() {
        return jokes;
    }

    public void setJokes(List<Joke> jokes) {
        this.jokes = jokes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JokeList)) return false;
        JokeList jokeList = (JokeList) o;
        return isError() == jokeList.isError() && getAmount() == jokeList.getAmount() && getJokes().equals(jokeList.getJokes());
    }

    @Override
    public int hashCode() {
        return Objects.hash(isError(), getAmount(), getJokes());
    }
}
