package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.c;

public abstract class j {
    class a extends j {
        a() {
            super();
        }

        @Override  // com.bumptech.glide.load.engine.j
        public boolean a() {
            return true;
        }

        @Override  // com.bumptech.glide.load.engine.j
        public boolean b() {
            return true;
        }

        @Override  // com.bumptech.glide.load.engine.j
        public boolean c(com.bumptech.glide.load.a a0) {
            return a0 == com.bumptech.glide.load.a.b;
        }

        @Override  // com.bumptech.glide.load.engine.j
        public boolean d(boolean z, com.bumptech.glide.load.a a0, c c0) {
            return a0 != com.bumptech.glide.load.a.d && a0 != com.bumptech.glide.load.a.e;
        }
    }

    class b extends j {
        b() {
            super();
        }

        @Override  // com.bumptech.glide.load.engine.j
        public boolean a() {
            return false;
        }

        @Override  // com.bumptech.glide.load.engine.j
        public boolean b() {
            return false;
        }

        @Override  // com.bumptech.glide.load.engine.j
        public boolean c(com.bumptech.glide.load.a a0) {
            return false;
        }

        @Override  // com.bumptech.glide.load.engine.j
        public boolean d(boolean z, com.bumptech.glide.load.a a0, c c0) {
            return false;
        }
    }

    class com.bumptech.glide.load.engine.j.c extends j {
        com.bumptech.glide.load.engine.j.c() {
            super();
        }

        @Override  // com.bumptech.glide.load.engine.j
        public boolean a() {
            return true;
        }

        @Override  // com.bumptech.glide.load.engine.j
        public boolean b() {
            return false;
        }

        @Override  // com.bumptech.glide.load.engine.j
        public boolean c(com.bumptech.glide.load.a a0) {
            return a0 != com.bumptech.glide.load.a.c && a0 != com.bumptech.glide.load.a.e;
        }

        @Override  // com.bumptech.glide.load.engine.j
        public boolean d(boolean z, com.bumptech.glide.load.a a0, c c0) {
            return false;
        }
    }

    class d extends j {
        d() {
            super();
        }

        @Override  // com.bumptech.glide.load.engine.j
        public boolean a() {
            return false;
        }

        @Override  // com.bumptech.glide.load.engine.j
        public boolean b() {
            return true;
        }

        @Override  // com.bumptech.glide.load.engine.j
        public boolean c(com.bumptech.glide.load.a a0) {
            return false;
        }

        @Override  // com.bumptech.glide.load.engine.j
        public boolean d(boolean z, com.bumptech.glide.load.a a0, c c0) {
            return a0 != com.bumptech.glide.load.a.d && a0 != com.bumptech.glide.load.a.e;
        }
    }

    class e extends j {
        e() {
            super();
        }

        @Override  // com.bumptech.glide.load.engine.j
        public boolean a() {
            return true;
        }

        @Override  // com.bumptech.glide.load.engine.j
        public boolean b() {
            return true;
        }

        @Override  // com.bumptech.glide.load.engine.j
        public boolean c(com.bumptech.glide.load.a a0) {
            return a0 == com.bumptech.glide.load.a.b;
        }

        @Override  // com.bumptech.glide.load.engine.j
        public boolean d(boolean z, com.bumptech.glide.load.a a0, c c0) {
            return (z && a0 == com.bumptech.glide.load.a.c || a0 == com.bumptech.glide.load.a.a) && c0 == c.b;
        }
    }

    public static final j a;
    public static final j b;
    public static final j c;
    public static final j d;
    public static final j e;

    static {
        j.a = new a();
        j.b = new b();
        j.c = new com.bumptech.glide.load.engine.j.c();
        j.d = new d();
        j.e = new e();
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(com.bumptech.glide.load.a arg1);

    public abstract boolean d(boolean arg1, com.bumptech.glide.load.a arg2, c arg3);
}

