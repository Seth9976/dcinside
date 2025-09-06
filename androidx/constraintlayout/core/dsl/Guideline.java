package androidx.constraintlayout.core.dsl;

public abstract class Guideline extends Helper {
    private int g;
    private int h;
    private float i;

    Guideline(String s) {
        super(s, new HelperType(""));
        this.g = 0x80000000;
        this.h = 0x80000000;
        this.i = NaNf;
    }

    public int g() {
        return this.h;
    }

    public float h() {
        return this.i;
    }

    public int i() {
        return this.g;
    }

    public void j(int v) {
        this.h = v;
        this.d.put("end", String.valueOf(v));
    }

    public void k(float f) {
        this.i = f;
        this.d.put("percent", String.valueOf(f));
    }

    public void l(int v) {
        this.g = v;
        this.d.put("start", String.valueOf(v));
    }
}

