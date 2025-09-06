package androidx.work.impl.utils;

import java.util.concurrent.Callable;

public final class j implements Callable {
    public final IdGenerator a;
    public final int b;
    public final int c;

    public j(IdGenerator idGenerator0, int v, int v1) {
        this.a = idGenerator0;
        this.b = v;
        this.c = v1;
    }

    @Override
    public final Object call() {
        return IdGenerator.f(this.a, this.b, this.c);
    }
}

