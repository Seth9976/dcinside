package com.google.gson.internal;

public final class a {
    private a() {
        throw new UnsupportedOperationException();
    }

    public static void a(boolean z) {
        if(!z) {
            throw new IllegalArgumentException();
        }
    }

    @Deprecated
    public static Object b(Object object0) {
        object0.getClass();
        return object0;
    }
}

