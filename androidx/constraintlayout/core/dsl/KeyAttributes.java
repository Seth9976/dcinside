package androidx.constraintlayout.core.dsl;

import java.util.Arrays;

public class KeyAttributes extends Keys {
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
    private String[] b;
    private String c;
    private Fit d;
    private int[] e;
    private Visibility[] f;
    private float[] g;
    private float[] h;
    private float[] i;
    private float[] j;
    private float[] k;
    private float[] l;
    private float[] m;
    private float[] n;
    private float[] o;
    private float[] p;
    private float[] q;
    private float[] r;

    KeyAttributes(int v, String[] arr_s) {
        this.a = "KeyAttributes";
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.b = arr_s;
        int[] arr_v = new int[v];
        this.e = arr_v;
        float f = 100.0f / ((float)(arr_v.length + 1));
        for(int v1 = 0; true; ++v1) {
            int[] arr_v1 = this.e;
            if(v1 >= arr_v1.length) {
                break;
            }
            arr_v1[v1] = (int)(((float)v1) * f + f);
        }
    }

    public void A(float[] arr_f) {
        this.l = arr_f;
    }

    public void B(float[] arr_f) {
        this.h = arr_f;
    }

    public void C(float[] arr_f) {
        this.i = arr_f;
    }

    public void D(float[] arr_f) {
        this.j = arr_f;
    }

    public void E(float[] arr_f) {
        this.n = arr_f;
    }

    public void F(float[] arr_f) {
        this.o = arr_f;
    }

    public void G(String[] arr_s) {
        this.b = arr_s;
    }

    public void H(String s) {
        this.c = s;
    }

    public void I(float[] arr_f) {
        this.m = arr_f;
    }

    public void J(float[] arr_f) {
        this.p = arr_f;
    }

    public void K(float[] arr_f) {
        this.q = arr_f;
    }

    public void L(float[] arr_f) {
        this.r = arr_f;
    }

    public void M(Visibility[] arr_keyAttributes$Visibility) {
        this.f = arr_keyAttributes$Visibility;
    }

    protected void g(StringBuilder stringBuilder0) {
        this.e(stringBuilder0, "target", this.b);
        stringBuilder0.append("frame:");
        stringBuilder0.append(Arrays.toString(this.e));
        stringBuilder0.append(",\n");
        this.c(stringBuilder0, "easing", this.c);
        if(this.d != null) {
            stringBuilder0.append("fit:\'");
            stringBuilder0.append(this.d);
            stringBuilder0.append("\',\n");
        }
        if(this.f != null) {
            stringBuilder0.append("visibility:\'");
            stringBuilder0.append(Arrays.toString(this.f));
            stringBuilder0.append("\',\n");
        }
        this.d(stringBuilder0, "alpha", this.g);
        this.d(stringBuilder0, "rotationX", this.i);
        this.d(stringBuilder0, "rotationY", this.j);
        this.d(stringBuilder0, "rotationZ", this.h);
        this.d(stringBuilder0, "pivotX", this.k);
        this.d(stringBuilder0, "pivotY", this.l);
        this.d(stringBuilder0, "pathRotate", this.m);
        this.d(stringBuilder0, "scaleX", this.n);
        this.d(stringBuilder0, "scaleY", this.o);
        this.d(stringBuilder0, "translationX", this.p);
        this.d(stringBuilder0, "translationY", this.q);
        this.d(stringBuilder0, "translationZ", this.r);
    }

    public float[] h() {
        return this.g;
    }

    public Fit i() {
        return this.d;
    }

    public float[] j() {
        return this.k;
    }

    public float[] k() {
        return this.l;
    }

    public float[] l() {
        return this.h;
    }

    public float[] m() {
        return this.i;
    }

    public float[] n() {
        return this.j;
    }

    public float[] o() {
        return this.n;
    }

    public float[] p() {
        return this.o;
    }

    public String[] q() {
        return this.b;
    }

    public String r() {
        return this.c;
    }

    public float[] s() {
        return this.m;
    }

    public float[] t() {
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

    public float[] u() {
        return this.q;
    }

    public float[] v() {
        return this.r;
    }

    public Visibility[] w() {
        return this.f;
    }

    public void x(float[] arr_f) {
        this.g = arr_f;
    }

    public void y(Fit keyAttributes$Fit0) {
        this.d = keyAttributes$Fit0;
    }

    public void z(float[] arr_f) {
        this.k = arr_f;
    }
}

