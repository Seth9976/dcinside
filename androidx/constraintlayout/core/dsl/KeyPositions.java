package androidx.constraintlayout.core.dsl;

import java.util.Arrays;

public class KeyPositions extends Keys {
    public static enum Type {
        CARTESIAN,
        SCREEN,
        PATH;

        private static Type[] a() [...] // Inlined contents
    }

    private String[] a;
    private String b;
    private Type c;
    private int[] d;
    private float[] e;
    private float[] f;
    private float[] g;
    private float[] h;

    public KeyPositions(int v, String[] arr_s) {
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.a = arr_s;
        int[] arr_v = new int[v];
        this.d = arr_v;
        float f = 100.0f / ((float)(arr_v.length + 1));
        for(int v1 = 0; true; ++v1) {
            int[] arr_v1 = this.d;
            if(v1 >= arr_v1.length) {
                break;
            }
            arr_v1[v1] = (int)(((float)v1) * f + f);
        }
    }

    public int[] g() {
        return this.d;
    }

    public float[] h() {
        return this.f;
    }

    public float[] i() {
        return this.e;
    }

    public float[] j() {
        return this.g;
    }

    public float[] k() {
        return this.h;
    }

    public Type l() {
        return this.c;
    }

    public String[] m() {
        return this.a;
    }

    public String n() {
        return this.b;
    }

    public void o(int[] arr_v) {
        this.d = arr_v;
    }

    public void p(float[] arr_f) {
        this.f = arr_f;
    }

    public void q(float[] arr_f) {
        this.e = arr_f;
    }

    public void r(float[] arr_f) {
        this.g = arr_f;
    }

    public void s(float[] arr_f) {
        this.h = arr_f;
    }

    public void t(Type keyPositions$Type0) {
        this.c = keyPositions$Type0;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("KeyPositions:{\n");
        this.e(stringBuilder0, "target", this.a);
        stringBuilder0.append("frame:");
        stringBuilder0.append(Arrays.toString(this.d));
        stringBuilder0.append(",\n");
        if(this.c != null) {
            stringBuilder0.append("type:\'");
            stringBuilder0.append(this.c);
            stringBuilder0.append("\',\n");
        }
        this.c(stringBuilder0, "easing", this.b);
        this.d(stringBuilder0, "percentX", this.g);
        this.d(stringBuilder0, "percentX", this.h);
        this.d(stringBuilder0, "percentWidth", this.e);
        this.d(stringBuilder0, "percentHeight", this.f);
        stringBuilder0.append("},\n");
        return stringBuilder0.toString();
    }

    public void u(String s) {
        this.b = s;
    }
}

