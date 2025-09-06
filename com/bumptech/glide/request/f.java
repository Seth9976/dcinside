package com.bumptech.glide.request;

public interface f {
    public static enum a {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);

        private final boolean a;

        private a(boolean z) {
            this.a = z;
        }

        private static a[] a() [...] // Inlined contents

        boolean b() {
            return this.a;
        }
    }

    boolean a();

    void b(e arg1);

    boolean c(e arg1);

    boolean d(e arg1);

    f getRoot();

    void h(e arg1);

    boolean j(e arg1);
}

