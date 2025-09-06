package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

public final class x0 {
    public static Future a(y0 y00, Runnable runnable0) {
        return y00.submit(runnable0);
    }

    public static Future b(y0 y00, Runnable runnable0, @F0 Object object0) {
        return y00.submit(runnable0, object0);
    }

    public static Future c(y0 y00, Callable callable0) {
        return y00.submit(callable0);
    }
}

