package com.inspo.solutions.model;

import java.util.Objects;

public class Flags {
    private boolean nsfw;
    private boolean religious;
    private boolean political;
    private boolean racist;
    private boolean sexist;
    private boolean explicit;

    public boolean isNsfw() {
        return nsfw;
    }

    public void setNsfw(boolean nsfw) {
        this.nsfw = nsfw;
    }

    public boolean isReligious() {
        return religious;
    }

    public void setReligious(boolean religious) {
        this.religious = religious;
    }

    public boolean isPolitical() {
        return political;
    }

    public void setPolitical(boolean political) {
        this.political = political;
    }

    public boolean isRacist() {
        return racist;
    }

    public void setRacist(boolean racist) {
        this.racist = racist;
    }

    public boolean isSexist() {
        return sexist;
    }

    public void setSexist(boolean sexist) {
        this.sexist = sexist;
    }

    public boolean isExplicit() {
        return explicit;
    }

    public void setExplicit(boolean explicit) {
        this.explicit = explicit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flags)) return false;
        Flags flags = (Flags) o;
        return isNsfw() == flags.isNsfw() && isReligious() == flags.isReligious() && isPolitical() == flags.isPolitical() && isRacist() == flags.isRacist() && isSexist() == flags.isSexist() && isExplicit() == flags.isExplicit();
    }

    @Override
    public int hashCode() {
        return Objects.hash(isNsfw(), isReligious(), isPolitical(), isRacist(), isSexist(), isExplicit());
    }
}
