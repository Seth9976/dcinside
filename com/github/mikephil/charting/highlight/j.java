package com.github.mikephil.charting.highlight;

public final class j {
    public float a;
    public float b;

    public j(float f, float f1) {
        this.a = f;
        this.b = f1;
    }

    public boolean a(float f) {
        return f > this.a && f <= this.b;
    }

    public boolean b(float f) {
        return f > this.b;
    }

    public boolean c(float f) {
        return f < this.a;
    }
}

