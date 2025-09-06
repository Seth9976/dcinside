package androidx.constraintlayout.core.widgets;

public class Rectangle {
    public int a;
    public int b;
    public int c;
    public int d;

    public boolean a(int v, int v1) {
        return v >= this.a && v < this.a + this.c && (v1 >= this.b && v1 < this.b + this.d);
    }

    public int b() {
        return (this.a + this.c) / 2;
    }

    public int c() {
        return (this.b + this.d) / 2;
    }

    void d(int v, int v1) {
        this.a -= v;
        this.b -= v1;
        this.c += v * 2;
        this.d += v1 * 2;
    }

    boolean e(Rectangle rectangle0) {
        return this.a >= rectangle0.a && this.a < rectangle0.a + rectangle0.c && (this.b >= rectangle0.b && this.b < rectangle0.b + rectangle0.d);
    }

    public void f(int v, int v1, int v2, int v3) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
    }
}

