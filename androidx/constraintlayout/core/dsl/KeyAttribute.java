package androidx.constraintlayout.core.dsl;

public class KeyAttribute extends Keys {
    public static enum Fit {
        SPLINE,
        LINEAR;

        private static Fit[] a() [...] // Inlined contents
    }

    public static enum Visibility {
        VISIBLE,
        INVISIBLE,
        GONE;

        private static Visibility[] a() [...] // Inlined contents
    }

    protected String a;
    private String b;
    private int c;
    private String d;
    private Fit e;
    private Visibility f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;
    private float o;
    private float p;
    private float q;
    private float r;

    public KeyAttribute(int v, String s) {
        this.a = "KeyAttributes";
        this.e = null;
        this.f = null;
        this.g = NaNf;
        this.h = NaNf;
        this.i = NaNf;
        this.j = NaNf;
        this.k = NaNf;
        this.l = NaNf;
        this.m = NaNf;
        this.n = NaNf;
        this.o = NaNf;
        this.p = NaNf;
        this.q = NaNf;
        this.r = NaNf;
        this.b = s;
        this.c = v;
    }

    public void A(float f) {
        this.l = f;
    }

    public void B(float f) {
        this.h = f;
    }

    public void C(float f) {
        this.i = f;
    }

    public void D(float f) {
        this.j = f;
    }

    public void E(float f) {
        this.n = f;
    }

    public void F(float f) {
        this.o = f;
    }

    public void G(String s) {
        this.b = s;
    }

    public void H(String s) {
        this.d = s;
    }

    public void I(float f) {
        this.m = f;
    }

    public void J(float f) {
        this.p = f;
    }

    public void K(float f) {
        this.q = f;
    }

    public void L(float f) {
        this.r = f;
    }

    public void M(Visibility keyAttribute$Visibility0) {
        this.f = keyAttribute$Visibility0;
    }

    protected void g(StringBuilder stringBuilder0) {
        this.c(stringBuilder0, "target", this.b);
        stringBuilder0.append("frame:");
        stringBuilder0.append(this.c);
        stringBuilder0.append(",\n");
        this.c(stringBuilder0, "easing", this.d);
        if(this.e != null) {
            stringBuilder0.append("fit:\'");
            stringBuilder0.append(this.e);
            stringBuilder0.append("\',\n");
        }
        if(this.f != null) {
            stringBuilder0.append("visibility:\'");
            stringBuilder0.append(this.f);
            stringBuilder0.append("\',\n");
        }
        this.a(stringBuilder0, "alpha", this.g);
        this.a(stringBuilder0, "rotationX", this.i);
        this.a(stringBuilder0, "rotationY", this.j);
        this.a(stringBuilder0, "rotationZ", this.h);
        this.a(stringBuilder0, "pivotX", this.k);
        this.a(stringBuilder0, "pivotY", this.l);
        this.a(stringBuilder0, "pathRotate", this.m);
        this.a(stringBuilder0, "scaleX", this.n);
        this.a(stringBuilder0, "scaleY", this.o);
        this.a(stringBuilder0, "translationX", this.p);
        this.a(stringBuilder0, "translationY", this.q);
        this.a(stringBuilder0, "translationZ", this.r);
    }

    public float h() {
        return this.g;
    }

    public Fit i() {
        return this.e;
    }

    public float j() {
        return this.k;
    }

    public float k() {
        return this.l;
    }

    public float l() {
        return this.h;
    }

    public float m() {
        return this.i;
    }

    public float n() {
        return this.j;
    }

    public float o() {
        return this.n;
    }

    public float p() {
        return this.o;
    }

    public String q() {
        return this.b;
    }

    public String r() {
        return this.d;
    }

    public float s() {
        return this.m;
    }

    public float t() {
        return this.p;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(this.a);
        stringBuilder0.append(":{\n");
        this.g(stringBuilder0);
        stringBuilder0.append("},\n");
        return stringBuilder0.toString();
    }

    public float u() {
        return this.q;
    }

    public float v() {
        return this.r;
    }

    public Visibility w() {
        return this.f;
    }

    public void x(float f) {
        this.g = f;
    }

    public void y(Fit keyAttribute$Fit0) {
        this.e = keyAttribute$Fit0;
    }

    public void z(float f) {
        this.k = f;
    }
}

