package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.annotation.H.d;

public final class h {
    public static i a(i i0, d h$d0, g g0) {
        return i0.d(h$d0.g(), g0);
    }

    public static i b(i i0, Class class0) {
        return i0.f(class0);
    }

    public static i c(i i0, d h$d0) {
        throw new IllegalStateException("TypeResolveBuilder implementation " + i0.getClass().getName() + " must implement `withSettings()`");
    }
}

