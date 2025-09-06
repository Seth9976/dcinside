package com.bumptech.glide.request.transition;

public class c implements g {
    public static class a {
        private final int a;
        private boolean b;
        private static final int c = 300;

        public a() {
            this(300);
        }

        public a(int v) {
            this.a = v;
        }

        public c a() {
            return new c(this.a, this.b);
        }

        public a b(boolean z) {
            this.b = z;
            return this;
        }
    }

    private final int a;
    private final boolean b;
    private d c;

    protected c(int v, boolean z) {
        this.a = v;
        this.b = z;
    }

    @Override  // com.bumptech.glide.request.transition.g
    public f a(com.bumptech.glide.load.a a0, boolean z) {
        return a0 == com.bumptech.glide.load.a.e ? e.b() : this.b();
    }

    private f b() {
        if(this.c == null) {
            this.c = new d(this.a, this.b);
        }
        return this.c;
    }
}

