package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;

public abstract class Key {
    public static final String A = "motionProgress";
    public static final String B = "transitionEasing";
    public static final String C = "visibility";
    int a;
    int b;
    String c;
    protected int d;
    HashMap e;
    public static int f = -1;
    public static final String g = "alpha";
    public static final String h = "elevation";
    public static final String i = "rotation";
    public static final String j = "rotationX";
    public static final String k = "rotationY";
    public static final String l = "transformPivotX";
    public static final String m = "transformPivotY";
    public static final String n = "transitionPathRotate";
    public static final String o = "scaleX";
    public static final String p = "scaleY";
    public static final String q = "wavePeriod";
    public static final String r = "waveOffset";
    public static final String s = "wavePhase";
    public static final String t = "waveVariesBy";
    public static final String u = "translationX";
    public static final String v = "translationY";
    public static final String w = "translationZ";
    public static final String x = "progress";
    public static final String y = "CUSTOM";
    public static final String z = "curveFit";

    static {
    }

    public Key() {
        this.a = Key.f;
        this.b = Key.f;
        this.c = null;
    }

    public abstract void a(HashMap arg1);

    public abstract Key b();

    public Key c(Key key0) {
        this.a = key0.a;
        this.b = key0.b;
        this.c = key0.c;
        this.d = key0.d;
        this.e = key0.e;
        return this;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return this.b();
    }

    abstract void d(HashSet arg1);

    public int e() {
        return this.a;
    }

    abstract void f(Context arg1, AttributeSet arg2);

    boolean g(String s) {
        return this.c == null || s == null ? false : s.matches(this.c);
    }

    public void h(int v) {
        this.a = v;
    }

    public void i(HashMap hashMap0) {
    }

    public abstract void j(String arg1, Object arg2);

    public Key k(int v) {
        this.b = v;
        return this;
    }

    // 去混淆评级： 低(20)
    boolean l(Object object0) {
        return object0 instanceof Boolean ? ((Boolean)object0).booleanValue() : Boolean.parseBoolean(object0.toString());
    }

    // 去混淆评级： 低(20)
    float m(Object object0) {
        return object0 instanceof Float ? ((float)(((Float)object0))) : Float.parseFloat(object0.toString());
    }

    // 去混淆评级： 低(20)
    int n(Object object0) {
        return object0 instanceof Integer ? ((int)(((Integer)object0))) : Integer.parseInt(object0.toString());
    }
}

