package javassist.bytecode.analysis;

import java.util.NoSuchElementException;

class f {
    static class a {
    }

    static class b {
        private b a;
        private int b;

        private b(int v) {
            this.b = v;
        }

        b(int v, a f$a0) {
            this(v);
        }
    }

    private b a;
    private b b;

    void a(int v) {
        b f$b0 = new b(v, null);
        b f$b1 = this.b;
        if(f$b1 != null) {
            f$b1.a = f$b0;
        }
        this.b = f$b0;
        if(this.a == null) {
            this.a = f$b0;
        }
    }

    boolean b() {
        return this.a == null;
    }

    int c() {
        b f$b0 = this.a;
        if(f$b0 == null) {
            throw new NoSuchElementException();
        }
        int v = f$b0.b;
        b f$b1 = this.a.a;
        this.a = f$b1;
        if(f$b1 == null) {
            this.b = null;
        }
        return v;
    }
}

