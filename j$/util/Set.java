package j$.util;

public interface Set extends Collection {
    @Override  // j$.util.Collection
    Spliterator spliterator();
}

