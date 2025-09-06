package com.dcinside.app.image.edit;

public class j {
    public static class a {
        private boolean a;
        private boolean b;
        private int c;
        private int d;

        public a() {
            this.a = true;
            this.b = true;
            this.c = 0;
            this.d = 0;
        }

        public j e() {
            return new j(this, null);
        }

        public a f(boolean z) {
            this.b = z;
            return this;
        }

        public a g(int v) {
            this.d = v;
            return this;
        }

        public a h(boolean z) {
            this.a = z;
            return this;
        }

        public a i(int v) {
            this.c = v;
            return this;
        }
    }

    private boolean a;
    private boolean b;
    private int c;
    private int d;

    private j(a j$a0) {
        this.b = j$a0.b;
        this.a = j$a0.a;
        this.c = j$a0.c;
        this.d = j$a0.d;
    }

    j(a j$a0, k k0) {
        this(j$a0);
    }

    public int a() {
        return this.d;
    }

    public int b() {
        return this.c;
    }

    public boolean c() {
        return this.b;
    }

    public boolean d() {
        return this.a;
    }
}

