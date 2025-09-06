package androidx.constraintlayout.core.dsl;

public class KeyCycle extends KeyAttribute {
    public static enum Wave {
        SIN,
        SQUARE,
        TRIANGLE,
        SAW,
        REVERSE_SAW,
        COS;

        private static Wave[] a() [...] // Inlined contents
    }

    private Wave s;
    private float t;
    private float u;
    private float v;
    private static final String w = "KeyCycle";

    KeyCycle(int v, String s) {
        super(v, s);
        this.s = null;
        this.t = NaNf;
        this.u = NaNf;
        this.v = NaNf;
        this.a = "KeyCycle";
    }

    public float N() {
        return this.u;
    }

    public float O() {
        return this.t;
    }

    public float P() {
        return this.v;
    }

    public Wave Q() {
        return this.s;
    }

    public void R(float f) {
        this.u = f;
    }

    public void S(float f) {
        this.t = f;
    }

    public void T(float f) {
        this.v = f;
    }

    public void U(Wave keyCycle$Wave0) {
        this.s = keyCycle$Wave0;
    }

    @Override  // androidx.constraintlayout.core.dsl.KeyAttribute
    protected void g(StringBuilder stringBuilder0) {
        super.g(stringBuilder0);
        if(this.s != null) {
            stringBuilder0.append("shape:\'");
            stringBuilder0.append(this.s);
            stringBuilder0.append("\',\n");
        }
        this.a(stringBuilder0, "period", this.t);
        this.a(stringBuilder0, "offset", this.u);
        this.a(stringBuilder0, "phase", this.v);
    }
}

