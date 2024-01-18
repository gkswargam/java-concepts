package org.gkswargam.generics;

public class Pair<T, U> {
    private T left;
    private U right;

    public Pair(T left, U right) {
        this.left = left;
        this.right = right;
    }

    public T getLeft() {
        return left;
    }

    public void setLeft(T left) {
        this.left = left;
    }

    public U getRight() {
        return right;
    }

    public void setRight(U right) {
        this.right = right;
    }

    public static <T, U> Pair<U, T> swap(Pair<T, U> pair) {
        return new Pair<>(pair.getRight(), pair.getLeft());
    }
}
