package Multuply;

import java.util.Objects;

public class Exercise {
    private final int a;
    private final int b;

    public Exercise(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Exercise)) return false;
        Exercise exercise = (Exercise) o;
        return a == exercise.a && b == exercise.b || a == exercise.b && b == exercise.a;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(a) + Objects.hashCode(b);
    }

    @Override
    public String toString() {
        return a + " * " + b + " = " + a * b;
    }
}
