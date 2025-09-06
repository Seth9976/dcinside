package j$.util.concurrent;

final class v extends ThreadLocal {
    @Override
    protected final Object initialValue() {
        return new ThreadLocalRandom(0);
    }
}

