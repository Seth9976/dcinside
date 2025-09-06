package androidx.emoji2.text;

import java.util.concurrent.ThreadFactory;

public final class b implements ThreadFactory {
    public final String a;

    public b(String s) {
        this.a = s;
    }

    @Override
    public final Thread newThread(Runnable runnable0) {
        return ConcurrencyHelpers.d(this.a, runnable0);
    }
}

