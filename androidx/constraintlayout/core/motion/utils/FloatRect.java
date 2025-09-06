package androidx.constraintlayout.core.motion.utils;

public class FloatRect {
    public float a;
    public float b;
    public float c;
    public float d;

    public final float a() {
        return (this.b + this.c) * 0.5f;
    }

    public final float b() {
        return (this.d + this.a) * 0.5f;
    }
}

