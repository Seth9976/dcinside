package io.realm;

import java.util.Locale;
import o3.h;

public interface v0 {
    public static class a {
        public final int a;
        public final int b;

        public a(int v, int v1) {
            this.a = v;
            this.b = v1;
        }

        @Override
        public String toString() {
            return String.format(Locale.ENGLISH, "startIndex: %d, length: %d", this.a, this.b);
        }
    }

    public static enum b {
        INITIAL,
        UPDATE,
        ERROR;

    }

    int[] a();

    int[] b();

    int[] c();

    a[] d();

    a[] e();

    a[] f();

    @h
    Throwable getError();

    b getState();
}

