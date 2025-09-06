package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.R.styleable;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

public class KeyTrigger extends Key {
    static class Loader {
        private static final int a = 1;
        private static final int b = 2;
        private static final int c = 4;
        private static final int d = 5;
        private static final int e = 6;
        private static final int f = 7;
        private static final int g = 8;
        private static final int h = 9;
        private static final int i = 10;
        private static final int j = 11;
        private static final int k = 12;
        private static final int l = 13;
        private static final int m = 14;
        private static SparseIntArray n;

        static {
            SparseIntArray sparseIntArray0 = new SparseIntArray();
            Loader.n = sparseIntArray0;
            sparseIntArray0.append(styleable.KeyTrigger_framePosition, 8);
            Loader.n.append(styleable.KeyTrigger_onCross, 4);
            Loader.n.append(styleable.KeyTrigger_onNegativeCross, 1);
            Loader.n.append(styleable.KeyTrigger_onPositiveCross, 2);
            Loader.n.append(styleable.KeyTrigger_motionTarget, 7);
            Loader.n.append(styleable.KeyTrigger_triggerId, 6);
            Loader.n.append(styleable.KeyTrigger_triggerSlack, 5);
            Loader.n.append(styleable.KeyTrigger_motion_triggerOnCollision, 9);
            Loader.n.append(styleable.KeyTrigger_motion_postLayoutCollision, 10);
            Loader.n.append(styleable.KeyTrigger_triggerReceiver, 11);
            Loader.n.append(styleable.KeyTrigger_viewTransitionOnCross, 12);
            Loader.n.append(styleable.KeyTrigger_viewTransitionOnNegativeCross, 13);
            Loader.n.append(styleable.KeyTrigger_viewTransitionOnPositiveCross, 14);
        }

        public static void a(KeyTrigger keyTrigger0, TypedArray typedArray0, Context context0) {
            int v = typedArray0.getIndexCount();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = typedArray0.getIndex(v1);
                switch(Loader.n.get(v2)) {
                    case 1: {
                        keyTrigger0.N = typedArray0.getString(v2);
                        break;
                    }
                    case 2: {
                        keyTrigger0.O = typedArray0.getString(v2);
                        break;
                    }
                    case 4: {
                        keyTrigger0.L = typedArray0.getString(v2);
                        break;
                    }
                    case 5: {
                        keyTrigger0.D = typedArray0.getFloat(v2, keyTrigger0.D);
                        break;
                    }
                    case 6: {
                        keyTrigger0.P = typedArray0.getResourceId(v2, keyTrigger0.P);
                        break;
                    }
                    case 7: {
                        if(MotionLayout.G9) {
                            int v3 = typedArray0.getResourceId(v2, keyTrigger0.b);
                            keyTrigger0.b = v3;
                            if(v3 == -1) {
                                keyTrigger0.c = typedArray0.getString(v2);
                            }
                        }
                        else if(typedArray0.peekValue(v2).type == 3) {
                            keyTrigger0.c = typedArray0.getString(v2);
                        }
                        else {
                            keyTrigger0.b = typedArray0.getResourceId(v2, keyTrigger0.b);
                        }
                        break;
                    }
                    case 8: {
                        int v4 = typedArray0.getInteger(v2, keyTrigger0.a);
                        keyTrigger0.a = v4;
                        keyTrigger0.V = (((float)v4) + 0.5f) / 100.0f;
                        break;
                    }
                    case 9: {
                        keyTrigger0.Q = typedArray0.getResourceId(v2, keyTrigger0.Q);
                        break;
                    }
                    case 10: {
                        keyTrigger0.X = typedArray0.getBoolean(v2, keyTrigger0.X);
                        break;
                    }
                    case 11: {
                        keyTrigger0.M = typedArray0.getResourceId(v2, keyTrigger0.M);
                        break;
                    }
                    case 12: {
                        keyTrigger0.G = typedArray0.getResourceId(v2, keyTrigger0.G);
                        break;
                    }
                    case 13: {
                        keyTrigger0.E = typedArray0.getResourceId(v2, keyTrigger0.E);
                        break;
                    }
                    case 14: {
                        keyTrigger0.F = typedArray0.getResourceId(v2, keyTrigger0.F);
                        break;
                    }
                    default: {
                        Log.e("KeyTrigger", "unused attribute 0x" + Integer.toHexString(v2) + "   " + Loader.n.get(v2));
                    }
                }
            }
        }
    }

    float D;
    int E;
    int F;
    int G;
    RectF H;
    RectF I;
    HashMap J;
    private int K;
    private String L;
    private int M;
    private String N;
    private String O;
    private int P;
    private int Q;
    private View R;
    private boolean S;
    private boolean T;
    private boolean U;
    private float V;
    private float W;
    private boolean X;
    public static final String Y = "viewTransitionOnCross";
    public static final String Z = "viewTransitionOnPositiveCross";
    public static final String a0 = "viewTransitionOnNegativeCross";
    public static final String b0 = "postLayout";
    public static final String c0 = "triggerSlack";
    public static final String d0 = "triggerCollisionView";
    public static final String e0 = "triggerCollisionId";
    public static final String f0 = "triggerID";
    public static final String g0 = "positiveCross";
    public static final String h0 = "negativeCross";
    public static final String i0 = "triggerReceiver";
    public static final String j0 = "CROSS";
    public static final int k0 = 5;
    static final String l0 = "KeyTrigger";
    private static final String m0 = "KeyTrigger";

    public KeyTrigger() {
        this.D = 0.1f;
        this.E = Key.f;
        this.F = Key.f;
        this.G = Key.f;
        this.H = new RectF();
        this.I = new RectF();
        this.J = new HashMap();
        this.K = -1;
        this.L = null;
        this.M = Key.f;
        this.N = null;
        this.O = null;
        this.P = Key.f;
        this.Q = Key.f;
        this.R = null;
        this.S = true;
        this.T = true;
        this.U = true;
        this.V = NaNf;
        this.X = false;
        this.d = 5;
        this.e = new HashMap();
    }

    public void A(float f, View view0) {
        int v;
        boolean z2;
        boolean z1;
        boolean z;
        boolean z3;
        int v1;
        if(this.Q == Key.f) {
            if(!this.S) {
                if(Math.abs(f - this.V) > this.D) {
                    this.S = true;
                }
                z = false;
            }
            else if((f - this.V) * (this.W - this.V) < 0.0f) {
                this.S = false;
                z = true;
            }
            else {
                z = false;
            }
            if(this.T) {
                float f1 = f - this.V;
                if((this.W - this.V) * f1 >= 0.0f || f1 >= 0.0f) {
                    v1 = 0;
                }
                else {
                    this.T = false;
                    v1 = 1;
                }
            }
            else {
                if(Math.abs(f - this.V) > this.D) {
                    this.T = true;
                }
                v1 = 0;
            }
            if(this.U) {
                float f2 = f - this.V;
                if((this.W - this.V) * f2 >= 0.0f || f2 <= 0.0f) {
                    z3 = false;
                }
                else {
                    this.U = false;
                    z3 = true;
                }
                z2 = z3;
                v = v1;
            }
            else {
                if(Math.abs(f - this.V) > this.D) {
                    this.U = true;
                }
                v = v1;
                z2 = false;
            }
        }
        else {
            if(this.R == null) {
                this.R = ((ViewGroup)view0.getParent()).findViewById(this.Q);
            }
            this.E(this.H, this.R, this.X);
            this.E(this.I, view0, this.X);
            if(this.H.intersect(this.I)) {
                if(this.S) {
                    this.S = false;
                    z = true;
                }
                else {
                    z = false;
                }
                if(this.U) {
                    this.U = false;
                    z1 = true;
                }
                else {
                    z1 = false;
                }
                this.T = true;
                z2 = z1;
                v = 0;
            }
            else {
                if(this.S) {
                    z = false;
                }
                else {
                    this.S = true;
                    z = true;
                }
                if(this.T) {
                    this.T = false;
                    v = 1;
                }
                else {
                    v = 0;
                }
                this.U = true;
                z2 = false;
            }
        }
        this.W = f;
        if(v != 0 || z || z2) {
            ((MotionLayout)view0.getParent()).s0(this.P, z2, f);
        }
        View view1 = this.M == Key.f ? view0 : ((MotionLayout)view0.getParent()).findViewById(this.M);
        if(v != 0) {
            String s = this.N;
            if(s != null) {
                this.B(s, view1);
            }
            if(this.E != Key.f) {
                ((MotionLayout)view0.getParent()).h1(this.E, new View[]{view1});
            }
        }
        if(z2) {
            String s1 = this.O;
            if(s1 != null) {
                this.B(s1, view1);
            }
            if(this.F != Key.f) {
                ((MotionLayout)view0.getParent()).h1(this.F, new View[]{view1});
            }
        }
        if(z) {
            String s2 = this.L;
            if(s2 != null) {
                this.B(s2, view1);
            }
            if(this.G != Key.f) {
                ((MotionLayout)view0.getParent()).h1(this.G, new View[]{view1});
            }
        }
    }

    private void B(String s, View view0) {
        Method method0;
        if(s == null) {
            return;
        }
        if(s.startsWith(".")) {
            this.C(s, view0);
            return;
        }
        if(this.J.containsKey(s)) {
            method0 = (Method)this.J.get(s);
            if(method0 == null) {
                return;
            }
        }
        else {
            method0 = null;
        }
        if(method0 == null) {
            try {
                method0 = view0.getClass().getMethod(s, null);
                this.J.put(s, method0);
            }
            catch(NoSuchMethodException unused_ex) {
                this.J.put(s, null);
                Log.e("KeyTrigger", "Could not find method \"" + s + "\"on class " + view0.getClass().getSimpleName() + " " + Debug.k(view0));
                return;
            }
        }
        try {
            method0.invoke(view0, null);
        }
        catch(Exception unused_ex) {
            Log.e("KeyTrigger", "Exception in call \"" + this.L + "\"on class " + view0.getClass().getSimpleName() + " " + Debug.k(view0));
        }
    }

    private void C(String s, View view0) {
        boolean z = s.length() == 1;
        if(!z) {
            s = s.substring(1).toLowerCase(Locale.ROOT);
        }
        for(Object object0: this.e.keySet()) {
            String s1 = (String)object0;
            if(z || s1.toLowerCase(Locale.ROOT).matches(s)) {
                ConstraintAttribute constraintAttribute0 = (ConstraintAttribute)this.e.get(s1);
                if(constraintAttribute0 != null) {
                    constraintAttribute0.a(view0);
                }
            }
        }
    }

    int D() {
        return this.K;
    }

    private void E(RectF rectF0, View view0, boolean z) {
        rectF0.top = (float)view0.getTop();
        rectF0.bottom = (float)view0.getBottom();
        rectF0.left = (float)view0.getLeft();
        rectF0.right = (float)view0.getRight();
        if(z) {
            view0.getMatrix().mapRect(rectF0);
        }
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public void a(HashMap hashMap0) {
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public Key b() {
        return new KeyTrigger().c(this);
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public Key c(Key key0) {
        super.c(key0);
        this.K = ((KeyTrigger)key0).K;
        this.L = ((KeyTrigger)key0).L;
        this.M = ((KeyTrigger)key0).M;
        this.N = ((KeyTrigger)key0).N;
        this.O = ((KeyTrigger)key0).O;
        this.P = ((KeyTrigger)key0).P;
        this.Q = ((KeyTrigger)key0).Q;
        this.R = ((KeyTrigger)key0).R;
        this.D = ((KeyTrigger)key0).D;
        this.S = ((KeyTrigger)key0).S;
        this.T = ((KeyTrigger)key0).T;
        this.U = ((KeyTrigger)key0).U;
        this.V = ((KeyTrigger)key0).V;
        this.W = ((KeyTrigger)key0).W;
        this.X = ((KeyTrigger)key0).X;
        this.H = ((KeyTrigger)key0).H;
        this.I = ((KeyTrigger)key0).I;
        this.J = ((KeyTrigger)key0).J;
        return this;
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public Object clone() throws CloneNotSupportedException {
        return this.b();
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public void d(HashSet hashSet0) {
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public void f(Context context0, AttributeSet attributeSet0) {
        Loader.a(this, context0.obtainStyledAttributes(attributeSet0, styleable.KeyTrigger), context0);
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public void j(String s, Object object0) {
        s.hashCode();
        switch(s) {
            case "CROSS": {
                this.L = object0.toString();
                return;
            }
            case "negativeCross": {
                this.N = object0.toString();
                return;
            }
            case "positiveCross": {
                this.O = object0.toString();
                return;
            }
            case "postLayout": {
                this.X = this.l(object0);
                return;
            }
            case "triggerCollisionId": {
                this.Q = this.n(object0);
                return;
            }
            case "triggerCollisionView": {
                this.R = (View)object0;
                return;
            }
            case "triggerID": {
                this.P = this.n(object0);
                return;
            }
            case "triggerReceiver": {
                this.M = this.n(object0);
                return;
            }
            case "triggerSlack": {
                this.D = this.m(object0);
                return;
            }
            case "viewTransitionOnCross": {
                this.G = this.n(object0);
                return;
            }
            case "viewTransitionOnNegativeCross": {
                this.E = this.n(object0);
                return;
            }
            case "viewTransitionOnPositiveCross": {
                this.F = this.n(object0);
            }
        }
    }
}

