package androidx.dynamicanimation.animation;

public final class FloatValueHolder {
    private float a;

    public FloatValueHolder() {
        this.a = 0.0f;
    }

    public FloatValueHolder(float f) {
        this.a = 0.0f;
        this.b(f);
    }

    public float a() {
        return this.a;
    }

    public void b(float f) {
        this.a = f;
    }
}

