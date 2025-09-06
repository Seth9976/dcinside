package rx;

import rx.functions.n;

public interface e extends h {
    public static enum a {
        NONE,
        ERROR,
        BUFFER,
        DROP,
        LATEST;

    }

    void a(n arg1);

    void c(o arg1);

    long e();
}

