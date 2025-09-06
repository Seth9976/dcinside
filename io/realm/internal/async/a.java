package io.realm.internal.async;

import android.os.Process;
import java.util.concurrent.Callable;

public class a implements Callable {
    private final Callable a;

    a(Callable callable0) {
        this.a = callable0;
    }

    @Override
    public Object call() throws Exception {
        Process.setThreadPriority(10);
        return this.a.call();
    }
}

