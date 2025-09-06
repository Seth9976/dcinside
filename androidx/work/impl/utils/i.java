package androidx.work.impl.utils;

import java.util.concurrent.Callable;

public final class i implements Callable {
    public final IdGenerator a;

    public i(IdGenerator idGenerator0) {
        this.a = idGenerator0;
    }

    @Override
    public final Object call() {
        return IdGenerator.d(this.a);
    }
}

