package androidx.constraintlayout.core.dsl;

public class KeyPosition extends Keys {
    public static enum Type {
        CARTESIAN,
        SCREEN,
        PATH;

        private static Type[] a() [...] // Inlined contents
    }

    private String a;
    private String b;
    private int c;
    private float d;
    private float e;
    private float f;
    private float g;
    private Type h;

    public KeyPosition(String s, int v) {
        this.b = null;
        this.d = NaNf;
        this.e = NaNf;
        this.f = NaNf;
        this.g = NaNf;
        this.h = Type.a;
        this.a = s;
        this.c = v;
    }

    public int g() {
        return this.c;
    }

    public float h() {
        return this.e;
    }

    public float i() {
        return this.d;
    }

    public float j() {
        return this.f;
    }

    public float k() {
        return this.g;
    }

    public Type l() {
        return this.h;
    }

    public String m() {
        return this.a;
    }

    public String n() {
        return this.b;
    }

    public void o(int v) {
        this.c = v;
    }

    public void p(float f) {
        this.e = f;
    }

    public void q(float f) {
        this.d = f;
    }

    public void r(float f) {
        this.f = f;
    }

    public void s(float f) {
        this.g = f;
    }

    public void t(Type keyPosition$Type0) {
        this.h = keyPosition$Type0;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append("KeyPositions:{\n");
        this.c(stringBuilder0, "target", this.a);
        stringBuilder0.append("frame:");
        stringBuilder0.append(this.c);
        stringBuilder0.append(",\n");
        if(this.h != null) {
            stringBuilder0.append("type:\'");
            stringBuilder0.append(this.h);
            stringBuilder0.append("\',\n");
        }
        this.c(stringBuilder0, "easing", this.b);
        this.a(stringBuilder0, "percentX", this.f);
        this.a(stringBuilder0, "percentY", this.g);
        this.a(stringBuilder0, "percentWidth", this.d);
        this.a(stringBuilder0, "percentHeight", this.e);
        stringBuilder0.append("},\n");
        return stringBuilder0.toString();
    }

    public void u(String s) {
        this.a = s;
    }

    public void v(String s) {
        this.b = s;
    }
}

