package kotlinx.serialization.json.internal;

import z3.f;

public final class l {
    @y4.l
    public static final l a;
    @y4.l
    @f
    public static final char[] b;
    @y4.l
    @f
    public static final byte[] c;

    static {
        l l0 = new l();
        l.a = l0;
        l.b = new char[0x75];
        l.c = new byte[0x7E];
        l0.f();
        l0.e();
    }

    private final void a(char c, char c1) {
        this.b(((int)c), c1);
    }

    private final void b(int v, char c) {
        if(c != 0x75) {
            l.b[c] = (char)v;
        }
    }

    private final void c(char c, byte b) {
        this.d(((int)c), b);
    }

    private final void d(int v, byte b) {
        l.c[v] = b;
    }

    private final void e() {
        for(int v = 0; v < 33; ++v) {
            this.d(v, 0x7F);
        }
        this.d(9, 3);
        this.d(10, 3);
        this.d(13, 3);
        this.d(0x20, 3);
        this.c(',', 4);
        this.c(':', 5);
        this.c('{', 6);
        this.c('}', 7);
        this.c('[', 8);
        this.c(']', 9);
        this.c('\"', 1);
        this.c('\\', 2);
    }

    private final void f() {
        for(int v = 0; v < 0x20; ++v) {
            this.b(v, 'u');
        }
        this.b(8, 'b');
        this.b(9, 't');
        this.b(10, 'n');
        this.b(12, 'f');
        this.b(13, 'r');
        this.a('/', '/');
        this.a('\"', '\"');
        this.a('\\', '\\');
    }
}

