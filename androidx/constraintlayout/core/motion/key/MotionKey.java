package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.HashMap;
import java.util.HashSet;

public abstract class MotionKey implements TypedValues {
    public int h;
    int i;
    String j;
    public int k;
    public HashMap l;
    public static int m = -1;
    public static final String n = "alpha";
    public static final String o = "elevation";
    public static final String p = "rotationZ";
    public static final String q = "rotationX";
    public static final String r = "transitionPathRotate";
    public static final String s = "scaleX";
    public static final String t = "scaleY";
    public static final String u = "translationX";
    public static final String v = "translationY";
    public static final String w = "CUSTOM";
    public static final String x = "visibility";

    static {
    }

    public MotionKey() {
        this.h = MotionKey.m;
        this.i = MotionKey.m;
        this.j = null;
    }

    @Override  // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean a(int v, int v1) {
        if(v != 100) {
            return false;
        }
        this.h = v1;
        return true;
    }

    @Override  // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean b(int v, float f) {
        return false;
    }

    @Override  // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean c(int v, boolean z) {
        return false;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return this.g();
    }

    @Override  // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean d(int v, String s) {
        if(v != 101) {
            return false;
        }
        this.j = s;
        return true;
    }

    public abstract void f(HashMap arg1);

    public abstract MotionKey g();

    public MotionKey h(MotionKey motionKey0) {
        this.h = motionKey0.h;
        this.i = motionKey0.i;
        this.j = motionKey0.j;
        this.k = motionKey0.k;
        return this;
    }

    public abstract void i(HashSet arg1);

    public int j() {
        return this.h;
    }

    boolean k(String s) {
        return this.j == null || s == null ? false : s.matches(this.j);
    }

    public void l(String s, int v, float f) {
        this.l.put(s, new CustomVariable(s, v, f));
    }

    public void m(String s, int v, int v1) {
        this.l.put(s, new CustomVariable(s, v, v1));
    }

    public void n(String s, int v, String s1) {
        this.l.put(s, new CustomVariable(s, v, s1));
    }

    public void o(String s, int v, boolean z) {
        this.l.put(s, new CustomVariable(s, v, z));
    }

    public void p(int v) {
        this.h = v;
    }

    public void q(HashMap hashMap0) {
    }

    public MotionKey r(int v) {
        this.i = v;
        return this;
    }

    // 去混淆评级： 低(20)
    boolean s(Object object0) {
        return object0 instanceof Boolean ? ((Boolean)object0).booleanValue() : Boolean.parseBoolean(object0.toString());
    }

    // 去混淆评级： 低(20)
    float t(Object object0) {
        return object0 instanceof Float ? ((float)(((Float)object0))) : Float.parseFloat(object0.toString());
    }

    // 去混淆评级： 低(20)
    int u(Object object0) {
        return object0 instanceof Integer ? ((int)(((Integer)object0))) : Integer.parseInt(object0.toString());
    }
}

