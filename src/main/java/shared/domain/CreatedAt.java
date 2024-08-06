package shared.domain;

import java.time.Instant;
import java.util.Objects;

public class CreatedAt {

    private final Instant value;

    public CreatedAt(Instant value) {
        this.value = Objects.requireNonNull(value);
    }

    public static CreatedAt now() {
        return new CreatedAt(Instant.now());
    }

    public Instant getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreatedAt createdAt = (CreatedAt) o;
        return Objects.equals(value, createdAt.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "CreatedAt{" +
                "value=" + value +
                '}';
    }

}