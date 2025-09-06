package dagger.internal;

import a3.g;

public final class n {
    static enum a implements g {
        INSTANCE;

        @Override  // a3.g
        public void a(Object object0) {
            p.c(object0, "Cannot inject members into a null reference");
        }
    }

    public static g a() {
        return a.a;
    }
}

