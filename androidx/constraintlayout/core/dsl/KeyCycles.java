package androidx.constraintlayout.core.dsl;

public class KeyCycles extends KeyAttributes {
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
    private float[] t;
    private float[] u;
    private float[] v;

    KeyCycles(int v, String[] arr_s) {
        super(v, arr_s);
        this.s = null;
        this.t = null;
        this.u = null;
        this.v = null;
        this.a = "KeyCycle";
    }

    public float[] N() {
        return this.u;
    }

    public float[] O() {
        return this.t;
    }

    public float[] P() {
        return this.v;
    }

    public Wave Q() {
        return this.s;
    }

    public void R(float[] arr_f) {
        this.u = arr_f;
    }

    public void S(float[] arr_f) {
        this.t = arr_f;
    }

    public void T(float[] arr_f) {
        this.v = arr_f;
    }

    public void U(Wave keyCycles$Wave0) {
        this.s = keyCycles$Wave0;
    }

    @Override  // androidx.constraintlayout.core.dsl.KeyAttributes
    protected void g(StringBuilder stringBuilder0) {
        super.g(stringBuilder0);
        if(this.s != null) {
            stringBuilder0.append("shape:\'");
            stringBuilder0.append(this.s);
            stringBuilder0.append("\',\n");
        }
        this.d(stringBuilder0, "period", this.t);
        this.d(stringBuilder0, "offset", this.u);
        this.d(stringBuilder0, "phase", this.v);
    }
}

