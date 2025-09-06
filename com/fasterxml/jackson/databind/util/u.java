package com.fasterxml.jackson.databind.util;

public final class u {
    private final Object a;
    private u b;

    public u(Object object0, u u0) {
        this.a = object0;
        this.b = u0;
    }

    public static boolean a(u u0, Object object0) {
        while(u0 != null) {
            if(u0.d() == object0) {
                return true;
            }
            u0 = u0.c();
        }
        return false;
    }

    public void b(u u0) {
        if(this.b != null) {
            throw new IllegalStateException();
        }
        this.b = u0;
    }

    public u c() {
        return this.b;
    }

    public Object d() {
        return this.a;
    }
}

