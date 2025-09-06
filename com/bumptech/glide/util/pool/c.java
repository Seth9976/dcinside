package com.bumptech.glide.util.pool;

import androidx.annotation.NonNull;

public abstract class c {
    static class a {
    }

    static class b extends c {
        private volatile RuntimeException b;

        b() {
            super(null);
        }

        @Override  // com.bumptech.glide.util.pool.c
        void b(boolean z) {
            if(z) {
                this.b = new RuntimeException("Released");
                return;
            }
            this.b = null;
        }

        @Override  // com.bumptech.glide.util.pool.c
        public void c() {
            if(this.b != null) {
                throw new IllegalStateException("Already released", this.b);
            }
        }
    }

    static class com.bumptech.glide.util.pool.c.c extends c {
        private volatile boolean b;

        com.bumptech.glide.util.pool.c.c() {
            super(null);
        }

        @Override  // com.bumptech.glide.util.pool.c
        public void b(boolean z) {
            this.b = z;
        }

        @Override  // com.bumptech.glide.util.pool.c
        public void c() {
            if(this.b) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    private static final boolean a = false;

    private c() {
    }

    c(a c$a0) {
    }

    @NonNull
    public static c a() {
        return new com.bumptech.glide.util.pool.c.c();
    }

    abstract void b(boolean arg1);

    public abstract void c();
}

