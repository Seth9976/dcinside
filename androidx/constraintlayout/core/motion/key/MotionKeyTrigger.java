package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.utils.FloatRect;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

public class MotionKeyTrigger extends MotionKey {
    private int A;
    private String B;
    private String C;
    private int D;
    private int E;
    float F;
    private boolean G;
    private boolean H;
    private boolean I;
    private float J;
    private float K;
    private boolean L;
    int M;
    int N;
    int O;
    FloatRect P;
    FloatRect Q;
    private static final String R = "KeyTrigger";
    public static final String S = "viewTransitionOnCross";
    public static final String T = "viewTransitionOnPositiveCross";
    public static final String U = "viewTransitionOnNegativeCross";
    public static final String V = "postLayout";
    public static final String W = "triggerSlack";
    public static final String X = "triggerCollisionView";
    public static final String Y = "triggerCollisionId";
    public static final String Z = "triggerID";
    public static final String a0 = "positiveCross";
    public static final String b0 = "negativeCross";
    public static final String c0 = "triggerReceiver";
    public static final String d0 = "CROSS";
    public static final int e0 = 301;
    public static final int f0 = 302;
    public static final int g0 = 303;
    public static final int h0 = 304;
    public static final int i0 = 305;
    public static final int j0 = 306;
    public static final int k0 = 307;
    public static final int l0 = 308;
    public static final int m0 = 309;
    public static final int n0 = 310;
    public static final int o0 = 311;
    public static final int p0 = 312;
    public static final int q0 = 5;
    private int y;
    private String z;

    public MotionKeyTrigger() {
        this.y = -1;
        this.z = null;
        this.A = MotionKey.m;
        this.B = null;
        this.C = null;
        this.D = MotionKey.m;
        this.E = MotionKey.m;
        this.F = 0.1f;
        this.G = true;
        this.H = true;
        this.I = true;
        this.J = NaNf;
        this.L = false;
        this.M = MotionKey.m;
        this.N = MotionKey.m;
        this.O = MotionKey.m;
        this.P = new FloatRect();
        this.Q = new FloatRect();
        this.k = 5;
        this.l = new HashMap();
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public boolean a(int v, int v1) {
        switch(v) {
            case 301: {
                this.O = v1;
                return true;
            }
            case 302: {
                this.N = v1;
                return true;
            }
            case 303: {
                this.M = v1;
                return true;
            }
            case 307: {
                this.E = v1;
                return true;
            }
            case 308: {
                this.D = this.u(v1);
                return true;
            }
            case 311: {
                this.A = v1;
                return true;
            }
            default: {
                return super.a(v, v1);
            }
        }
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public boolean b(int v, float f) {
        if(v != 305) {
            return super.b(v, f);
        }
        this.F = f;
        return true;
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public boolean c(int v, boolean z) {
        if(v != 304) {
            return super.c(v, z);
        }
        this.L = z;
        return true;
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public Object clone() throws CloneNotSupportedException {
        return this.g();
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public boolean d(int v, String s) {
        switch(v) {
            case 309: {
                this.C = s;
                return true;
            }
            case 310: {
                this.B = s;
                return true;
            }
            case 312: {
                this.z = s;
                return true;
            }
            default: {
                return super.d(v, s);
            }
        }
    }

    @Override  // androidx.constraintlayout.core.motion.utils.TypedValues
    public int e(String s) {
        s.hashCode();
        switch(s) {
            case "negativeCross": {
                return 310;
            }
            case "positiveCross": {
                return 309;
            }
            case "postLayout": {
                return 304;
            }
            case "triggerCollisionId": {
                return 307;
            }
            case "triggerCollisionView": {
                return 306;
            }
            case "triggerID": {
                return 308;
            }
            case "triggerReceiver": {
                return 311;
            }
            case "triggerSlack": {
                return 305;
            }
            case "viewTransitionOnCross": {
                return 301;
            }
            case "viewTransitionOnNegativeCross": {
                return 303;
            }
            case "viewTransitionOnPositiveCross": {
                return 302;
            }
            default: {
                return -1;
            }
        }
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public void f(HashMap hashMap0) {
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public MotionKey g() {
        return new MotionKeyTrigger().w(this);
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public MotionKey h(MotionKey motionKey0) {
        return this.w(motionKey0);
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public void i(HashSet hashSet0) {
    }

    public void v(float f, MotionWidget motionWidget0) {
    }

    public MotionKeyTrigger w(MotionKey motionKey0) {
        super.h(motionKey0);
        this.y = ((MotionKeyTrigger)motionKey0).y;
        this.z = ((MotionKeyTrigger)motionKey0).z;
        this.A = ((MotionKeyTrigger)motionKey0).A;
        this.B = ((MotionKeyTrigger)motionKey0).B;
        this.C = ((MotionKeyTrigger)motionKey0).C;
        this.D = ((MotionKeyTrigger)motionKey0).D;
        this.E = ((MotionKeyTrigger)motionKey0).E;
        this.F = ((MotionKeyTrigger)motionKey0).F;
        this.G = ((MotionKeyTrigger)motionKey0).G;
        this.H = ((MotionKeyTrigger)motionKey0).H;
        this.I = ((MotionKeyTrigger)motionKey0).I;
        this.J = ((MotionKeyTrigger)motionKey0).J;
        this.K = ((MotionKeyTrigger)motionKey0).K;
        this.L = ((MotionKeyTrigger)motionKey0).L;
        this.P = ((MotionKeyTrigger)motionKey0).P;
        this.Q = ((MotionKeyTrigger)motionKey0).Q;
        return this;
    }

    private void x(String s, MotionWidget motionWidget0) {
        boolean z = s.length() == 1;
        if(!z) {
            s = s.substring(1).toLowerCase(Locale.ROOT);
        }
        for(Object object0: this.l.keySet()) {
            String s1 = (String)object0;
            if(z || s1.toLowerCase(Locale.ROOT).matches(s)) {
                CustomVariable customVariable0 = (CustomVariable)this.l.get(s1);
                if(customVariable0 != null) {
                    customVariable0.a(motionWidget0);
                }
            }
        }
    }
}

