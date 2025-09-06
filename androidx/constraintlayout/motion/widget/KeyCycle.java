package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.motion.utils.ViewOscillator;
import androidx.constraintlayout.widget.ConstraintAttribute.AttributeType;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.R.styleable;
import java.util.HashMap;
import java.util.HashSet;

public class KeyCycle extends Key {
    static class Loader {
        private static final int a = 1;
        private static final int b = 2;
        private static final int c = 3;
        private static final int d = 4;
        private static final int e = 5;
        private static final int f = 6;
        private static final int g = 7;
        private static final int h = 8;
        private static final int i = 9;
        private static final int j = 10;
        private static final int k = 11;
        private static final int l = 12;
        private static final int m = 13;
        private static final int n = 14;
        private static final int o = 15;
        private static final int p = 16;
        private static final int q = 17;
        private static final int r = 18;
        private static final int s = 19;
        private static final int t = 20;
        private static final int u = 21;
        private static SparseIntArray v;

        static {
            SparseIntArray sparseIntArray0 = new SparseIntArray();
            Loader.v = sparseIntArray0;
            sparseIntArray0.append(styleable.KeyCycle_motionTarget, 1);
            Loader.v.append(styleable.KeyCycle_framePosition, 2);
            Loader.v.append(styleable.KeyCycle_transitionEasing, 3);
            Loader.v.append(styleable.KeyCycle_curveFit, 4);
            Loader.v.append(styleable.KeyCycle_waveShape, 5);
            Loader.v.append(styleable.KeyCycle_wavePeriod, 6);
            Loader.v.append(styleable.KeyCycle_waveOffset, 7);
            Loader.v.append(styleable.KeyCycle_waveVariesBy, 8);
            Loader.v.append(styleable.KeyCycle_android_alpha, 9);
            Loader.v.append(styleable.KeyCycle_android_elevation, 10);
            Loader.v.append(styleable.KeyCycle_android_rotation, 11);
            Loader.v.append(styleable.KeyCycle_android_rotationX, 12);
            Loader.v.append(styleable.KeyCycle_android_rotationY, 13);
            Loader.v.append(styleable.KeyCycle_transitionPathRotate, 14);
            Loader.v.append(styleable.KeyCycle_android_scaleX, 15);
            Loader.v.append(styleable.KeyCycle_android_scaleY, 16);
            Loader.v.append(styleable.KeyCycle_android_translationX, 17);
            Loader.v.append(styleable.KeyCycle_android_translationY, 18);
            Loader.v.append(styleable.KeyCycle_android_translationZ, 19);
            Loader.v.append(styleable.KeyCycle_motionProgress, 20);
            Loader.v.append(styleable.KeyCycle_wavePhase, 21);
        }

        private static void b(KeyCycle keyCycle0, TypedArray typedArray0) {
            int v = typedArray0.getIndexCount();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = typedArray0.getIndex(v1);
                switch(Loader.v.get(v2)) {
                    case 1: {
                        if(MotionLayout.G9) {
                            int v3 = typedArray0.getResourceId(v2, keyCycle0.b);
                            keyCycle0.b = v3;
                            if(v3 == -1) {
                                keyCycle0.c = typedArray0.getString(v2);
                            }
                        }
                        else if(typedArray0.peekValue(v2).type == 3) {
                            keyCycle0.c = typedArray0.getString(v2);
                        }
                        else {
                            keyCycle0.b = typedArray0.getResourceId(v2, keyCycle0.b);
                        }
                        break;
                    }
                    case 2: {
                        keyCycle0.a = typedArray0.getInt(v2, keyCycle0.a);
                        break;
                    }
                    case 3: {
                        keyCycle0.D = typedArray0.getString(v2);
                        break;
                    }
                    case 4: {
                        keyCycle0.E = typedArray0.getInteger(v2, keyCycle0.E);
                        break;
                    }
                    case 5: {
                        if(typedArray0.peekValue(v2).type == 3) {
                            keyCycle0.G = typedArray0.getString(v2);
                            keyCycle0.F = 7;
                        }
                        else {
                            keyCycle0.F = typedArray0.getInt(v2, keyCycle0.F);
                        }
                        break;
                    }
                    case 6: {
                        keyCycle0.H = typedArray0.getFloat(v2, keyCycle0.H);
                        break;
                    }
                    case 7: {
                        keyCycle0.I = typedArray0.peekValue(v2).type == 5 ? typedArray0.getDimension(v2, keyCycle0.I) : typedArray0.getFloat(v2, keyCycle0.I);
                        break;
                    }
                    case 8: {
                        keyCycle0.L = typedArray0.getInt(v2, keyCycle0.L);
                        break;
                    }
                    case 9: {
                        keyCycle0.M = typedArray0.getFloat(v2, keyCycle0.M);
                        break;
                    }
                    case 10: {
                        keyCycle0.N = typedArray0.getDimension(v2, keyCycle0.N);
                        break;
                    }
                    case 11: {
                        keyCycle0.O = typedArray0.getFloat(v2, keyCycle0.O);
                        break;
                    }
                    case 12: {
                        keyCycle0.Q = typedArray0.getFloat(v2, keyCycle0.Q);
                        break;
                    }
                    case 13: {
                        keyCycle0.R = typedArray0.getFloat(v2, keyCycle0.R);
                        break;
                    }
                    case 14: {
                        keyCycle0.P = typedArray0.getFloat(v2, keyCycle0.P);
                        break;
                    }
                    case 15: {
                        keyCycle0.S = typedArray0.getFloat(v2, keyCycle0.S);
                        break;
                    }
                    case 16: {
                        keyCycle0.T = typedArray0.getFloat(v2, keyCycle0.T);
                        break;
                    }
                    case 17: {
                        keyCycle0.U = typedArray0.getDimension(v2, keyCycle0.U);
                        break;
                    }
                    case 18: {
                        keyCycle0.V = typedArray0.getDimension(v2, keyCycle0.V);
                        break;
                    }
                    case 19: {
                        keyCycle0.W = typedArray0.getDimension(v2, keyCycle0.W);
                        break;
                    }
                    case 20: {
                        keyCycle0.K = typedArray0.getFloat(v2, keyCycle0.K);
                        break;
                    }
                    case 21: {
                        keyCycle0.J = typedArray0.getFloat(v2, keyCycle0.J) / 360.0f;
                        break;
                    }
                    default: {
                        Log.e("KeyCycle", "unused attribute 0x" + Integer.toHexString(v2) + "   " + Loader.v.get(v2));
                    }
                }
            }
        }
    }

    private String D;
    private int E;
    private int F;
    private String G;
    private float H;
    private float I;
    private float J;
    private float K;
    private int L;
    private float M;
    private float N;
    private float O;
    private float P;
    private float Q;
    private float R;
    private float S;
    private float T;
    private float U;
    private float V;
    private float W;
    private static final String X = "KeyCycle";
    static final String Y = "KeyCycle";
    public static final String Z = "wavePeriod";
    public static final String a0 = "waveOffset";
    public static final String b0 = "wavePhase";
    public static final String c0 = "waveShape";
    public static final int d0 = 0;
    public static final int e0 = 1;
    public static final int f0 = 2;
    public static final int g0 = 3;
    public static final int h0 = 4;
    public static final int i0 = 5;
    public static final int j0 = 6;
    public static final int k0 = 4;

    public KeyCycle() {
        this.D = null;
        this.E = 0;
        this.F = -1;
        this.G = null;
        this.H = NaNf;
        this.I = 0.0f;
        this.J = 0.0f;
        this.K = NaNf;
        this.L = -1;
        this.M = NaNf;
        this.N = NaNf;
        this.O = NaNf;
        this.P = NaNf;
        this.Q = NaNf;
        this.R = NaNf;
        this.S = NaNf;
        this.T = NaNf;
        this.U = NaNf;
        this.V = NaNf;
        this.W = NaNf;
        this.d = 4;
        this.e = new HashMap();
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public void a(HashMap hashMap0) {
        Debug.n("KeyCycle", "add " + hashMap0.size() + " values", 2);
        for(Object object0: hashMap0.keySet()) {
            String s = (String)object0;
            SplineSet splineSet0 = (SplineSet)hashMap0.get(s);
            if(splineSet0 != null) {
                s.hashCode();
                switch(s) {
                    case "alpha": {
                        splineSet0.g(this.a, this.M);
                        break;
                    }
                    case "elevation": {
                        splineSet0.g(this.a, this.N);
                        break;
                    }
                    case "progress": {
                        splineSet0.g(this.a, this.K);
                        break;
                    }
                    case "rotation": {
                        splineSet0.g(this.a, this.O);
                        break;
                    }
                    case "rotationX": {
                        splineSet0.g(this.a, this.Q);
                        break;
                    }
                    case "rotationY": {
                        splineSet0.g(this.a, this.R);
                        break;
                    }
                    case "scaleX": {
                        splineSet0.g(this.a, this.S);
                        break;
                    }
                    case "scaleY": {
                        splineSet0.g(this.a, this.T);
                        break;
                    }
                    case "transitionPathRotate": {
                        splineSet0.g(this.a, this.P);
                        break;
                    }
                    case "translationX": {
                        splineSet0.g(this.a, this.U);
                        break;
                    }
                    case "translationY": {
                        splineSet0.g(this.a, this.V);
                        break;
                    }
                    case "translationZ": {
                        splineSet0.g(this.a, this.W);
                        break;
                    }
                    case "waveOffset": {
                        splineSet0.g(this.a, this.I);
                        break;
                    }
                    case "wavePhase": {
                        splineSet0.g(this.a, this.J);
                        break;
                    }
                    default: {
                        if(s.startsWith("CUSTOM")) {
                            continue;
                        }
                        Log.v("WARNING KeyCycle", "  UNKNOWN  " + s);
                    }
                }
            }
        }
    }

    public void a0(HashMap hashMap0) {
        for(Object object0: hashMap0.keySet()) {
            String s = (String)object0;
            if(s.startsWith("CUSTOM")) {
                ConstraintAttribute constraintAttribute0 = (ConstraintAttribute)this.e.get(s.substring(7));
                if(constraintAttribute0 == null || constraintAttribute0.j() != AttributeType.b) {
                    continue;
                }
                ViewOscillator viewOscillator0 = (ViewOscillator)hashMap0.get(s);
                if(viewOscillator0 == null) {
                    continue;
                }
                viewOscillator0.g(this.a, this.F, this.G, this.L, this.H, this.I, this.J, constraintAttribute0.k(), constraintAttribute0);
            }
            else {
                float f = this.b0(s);
                if(!Float.isNaN(f)) {
                    ViewOscillator viewOscillator1 = (ViewOscillator)hashMap0.get(s);
                    if(viewOscillator1 != null) {
                        viewOscillator1.f(this.a, this.F, this.G, this.L, this.H, this.I, this.J, f);
                    }
                }
            }
        }
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public Key b() {
        return new KeyCycle().c(this);
    }

    public float b0(String s) {
        s.hashCode();
        switch(s) {
            case "alpha": {
                return this.M;
            }
            case "elevation": {
                return this.N;
            }
            case "progress": {
                return this.K;
            }
            case "rotation": {
                return this.O;
            }
            case "rotationX": {
                return this.Q;
            }
            case "rotationY": {
                return this.R;
            }
            case "scaleX": {
                return this.S;
            }
            case "scaleY": {
                return this.T;
            }
            case "transitionPathRotate": {
                return this.P;
            }
            case "translationX": {
                return this.U;
            }
            case "translationY": {
                return this.V;
            }
            case "translationZ": {
                return this.W;
            }
            case "waveOffset": {
                return this.I;
            }
            case "wavePhase": {
                return this.J;
            }
            default: {
                if(!s.startsWith("CUSTOM")) {
                    Log.v("WARNING! KeyCycle", "  UNKNOWN  " + s);
                }
                return NaNf;
            }
        }
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public Key c(Key key0) {
        super.c(key0);
        KeyCycle keyCycle0 = (KeyCycle)key0;
        this.D = keyCycle0.D;
        this.E = keyCycle0.E;
        this.F = keyCycle0.F;
        this.G = keyCycle0.G;
        this.H = keyCycle0.H;
        this.I = keyCycle0.I;
        this.J = keyCycle0.J;
        this.K = keyCycle0.K;
        this.L = keyCycle0.L;
        this.M = keyCycle0.M;
        this.N = keyCycle0.N;
        this.O = keyCycle0.O;
        this.P = keyCycle0.P;
        this.Q = keyCycle0.Q;
        this.R = keyCycle0.R;
        this.S = keyCycle0.S;
        this.T = keyCycle0.T;
        this.U = keyCycle0.U;
        this.V = keyCycle0.V;
        this.W = keyCycle0.W;
        return this;
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public Object clone() throws CloneNotSupportedException {
        return this.b();
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public void d(HashSet hashSet0) {
        if(!Float.isNaN(this.M)) {
            hashSet0.add("alpha");
        }
        if(!Float.isNaN(this.N)) {
            hashSet0.add("elevation");
        }
        if(!Float.isNaN(this.O)) {
            hashSet0.add("rotation");
        }
        if(!Float.isNaN(this.Q)) {
            hashSet0.add("rotationX");
        }
        if(!Float.isNaN(this.R)) {
            hashSet0.add("rotationY");
        }
        if(!Float.isNaN(this.S)) {
            hashSet0.add("scaleX");
        }
        if(!Float.isNaN(this.T)) {
            hashSet0.add("scaleY");
        }
        if(!Float.isNaN(this.P)) {
            hashSet0.add("transitionPathRotate");
        }
        if(!Float.isNaN(this.U)) {
            hashSet0.add("translationX");
        }
        if(!Float.isNaN(this.V)) {
            hashSet0.add("translationY");
        }
        if(!Float.isNaN(this.W)) {
            hashSet0.add("translationZ");
        }
        if(this.e.size() > 0) {
            for(Object object0: this.e.keySet()) {
                hashSet0.add("CUSTOM," + ((String)object0));
            }
        }
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public void f(Context context0, AttributeSet attributeSet0) {
        Loader.b(this, context0.obtainStyledAttributes(attributeSet0, styleable.KeyCycle));
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public void j(String s, Object object0) {
        s.hashCode();
        switch(s) {
            case "alpha": {
                this.M = this.m(object0);
                return;
            }
            case "curveFit": {
                this.E = this.n(object0);
                return;
            }
            case "elevation": {
                this.N = this.m(object0);
                return;
            }
            case "motionProgress": {
                this.K = this.m(object0);
                return;
            }
            case "rotation": {
                this.O = this.m(object0);
                return;
            }
            case "rotationX": {
                this.Q = this.m(object0);
                return;
            }
            case "rotationY": {
                this.R = this.m(object0);
                return;
            }
            case "scaleX": {
                this.S = this.m(object0);
                return;
            }
            case "scaleY": {
                this.T = this.m(object0);
                return;
            }
            case "transitionEasing": {
                this.D = object0.toString();
                return;
            }
            case "transitionPathRotate": {
                this.P = this.m(object0);
                return;
            }
            case "translationX": {
                this.U = this.m(object0);
                return;
            }
            case "translationY": {
                this.V = this.m(object0);
                return;
            }
            case "translationZ": {
                this.W = this.m(object0);
                return;
            }
            case "waveOffset": {
                this.I = this.m(object0);
                return;
            }
            case "wavePeriod": {
                this.H = this.m(object0);
                return;
            }
            case "wavePhase": {
                this.J = this.m(object0);
                return;
            }
            case "waveShape": {
                if(object0 instanceof Integer) {
                    this.F = this.n(object0);
                    return;
                }
                this.F = 7;
                this.G = object0.toString();
            }
        }
    }
}

