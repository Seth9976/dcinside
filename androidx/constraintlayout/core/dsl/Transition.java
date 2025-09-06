package androidx.constraintlayout.core.dsl;

public class Transition {
    private OnSwipe a;
    final int b;
    private final int c;
    private final float d;
    private String e;
    private String f;
    private String g;
    private int h;
    private String i;
    private int j;
    private int k;
    private float l;
    private KeyFrames m;

    public Transition(String s, String s1) {
        this.a = null;
        this.b = -1;
        this.c = 400;
        this.d = 0.0f;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = 0;
        this.i = null;
        this.j = -1;
        this.k = 400;
        this.l = 0.0f;
        this.m = new KeyFrames();
        this.e = "default";
        this.g = s;
        this.f = s1;
    }

    public Transition(String s, String s1, String s2) {
        this.a = null;
        this.b = -1;
        this.c = 400;
        this.d = 0.0f;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = 0;
        this.i = null;
        this.j = -1;
        this.k = 400;
        this.l = 0.0f;
        this.m = new KeyFrames();
        this.e = s;
        this.g = s1;
        this.f = s2;
    }

    public String a() {
        return this.e;
    }

    public void b(int v) {
        this.k = v;
    }

    public void c(String s) {
        this.g = s;
    }

    public void d(String s) {
        this.e = s;
    }

    public void e(Keys keys0) {
        this.m.a(keys0);
    }

    public void f(OnSwipe onSwipe0) {
        this.a = onSwipe0;
    }

    public void g(float f) {
        this.l = f;
    }

    public void h(String s) {
        this.f = s;
    }

    String i() {
        return this.toString();
    }

    @Override
    public String toString() {
        String s = this.k == 400 ? this.e + ":{\nfrom:\'" + this.g + "\',\nto:\'" + this.f + "\',\n" : this.e + ":{\nfrom:\'" + this.g + "\',\nto:\'" + this.f + "\',\n" + "duration:" + this.k + ",\n";
        if(this.l != 0.0f) {
            s = s + "stagger:" + this.l + ",\n";
        }
        if(this.a != null) {
            s = s + "OnSwipe:{\n},\n";
        }
        return s + "" + "},\n";
    }
}

