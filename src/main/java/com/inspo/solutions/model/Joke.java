package com.inspo.solutions.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import java.util.Objects;

public class Joke {
    private String category;
    private String type;
    private String setup;
    private String delivery;
    private Flags flags;
    private int id;
    private boolean safe;
    private String lang;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSetup() {
        return setup;
    }

    public void setSetup(String setup) {
        this.setup = setup;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public Flags getFlags() {
        return flags;
    }

    public void setFlags(Flags flags) {
        this.flags = flags;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isSafe() {
        return safe;
    }

    public void setSafe(boolean safe) {
        this.safe = safe;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Joke)) return false;
        Joke joke = (Joke) o;
        return getId() == joke.getId() && isSafe() == joke.isSafe() && getCategory().equals(joke.getCategory()) && getType().equals(joke.getType()) && getSetup().equals(joke.getSetup()) && getDelivery().equals(joke.getDelivery()) && getFlags().equals(joke.getFlags()) && getLang().equals(joke.getLang());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCategory(), getType(), getSetup(), getDelivery(), getFlags(), getId(), isSafe(), getLang());
    }
}
