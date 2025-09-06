package androidx.constraintlayout.core.motion.utils;

public class Rect {
    public int a;
    public int b;
    public int c;
    public int d;

    public int a() {
        return this.a - this.d;
    }

    public int b() {
        return this.c - this.b;
    }
}

