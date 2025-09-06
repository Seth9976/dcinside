package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.utils.ViewTimeCycle.CustomSet;
import androidx.constraintlayout.motion.utils.ViewTimeCycle;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.R.styleable;
import java.util.HashMap;
import java.util.HashSet;

public class KeyTimeCycle extends Key {
    static class Loader {
        private static final int a = 1;
        private static final int b = 2;
        private static final int c = 4;
        private static final int d = 5;
        private static final int e = 6;
        private static final int f = 8;
        private static final int g = 7;
        private static final int h = 9;
        private static final int i = 10;
        private static final int j = 12;
        private static final int k = 13;
        private static final int l = 14;
        private static final int m = 15;
        private static final int n = 16;
        private static final int o = 17;
        private static final int p = 18;
        private static final int q = 19;
        private static final int r = 20;
        private static final int s = 21;
        private static SparseIntArray t;

        static {
            SparseIntArray sparseIntArray0 = new SparseIntArray();
            Loader.t = sparseIntArray0;
            sparseIntArray0.append(styleable.KeyTimeCycle_android_alpha, 1);
            Loader.t.append(styleable.KeyTimeCycle_android_elevation, 2);
            Loader.t.append(styleable.KeyTimeCycle_android_rotation, 4);
            Loader.t.append(styleable.KeyTimeCycle_android_rotationX, 5);
            Loader.t.append(styleable.KeyTimeCycle_android_rotationY, 6);
            Loader.t.append(styleable.KeyTimeCycle_android_scaleX, 7);
            Loader.t.append(styleable.KeyTimeCycle_transitionPathRotate, 8);
            Loader.t.append(styleable.KeyTimeCycle_transitionEasing, 9);
            Loader.t.append(styleable.KeyTimeCycle_motionTarget, 10);
            Loader.t.append(styleable.KeyTimeCycle_framePosition, 12);
            Loader.t.append(styleable.KeyTimeCycle_curveFit, 13);
            Loader.t.append(styleable.KeyTimeCycle_android_scaleY, 14);
            Loader.t.append(styleable.KeyTimeCycle_android_translationX, 15);
            Loader.t.append(styleable.KeyTimeCycle_android_translationY, 16);
            Loader.t.append(styleable.KeyTimeCycle_android_translationZ, 17);
            Loader.t.append(styleable.KeyTimeCycle_motionProgress, 18);
            Loader.t.append(styleable.KeyTimeCycle_wavePeriod, 20);
            Loader.t.append(styleable.KeyTimeCycle_waveOffset, 21);
            Loader.t.append(styleable.KeyTimeCycle_waveShape, 19);
        }

        public static void a(KeyTimeCycle keyTimeCycle0, TypedArray typedArray0) {
            int v = typedArray0.getIndexCount();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = typedArray0.getIndex(v1);
                switch(Loader.t.get(v2)) {
                    case 1: {
                        keyTimeCycle0.F = typedArray0.getFloat(v2, keyTimeCycle0.F);
                        break;
                    }
                    case 2: {
                        keyTimeCycle0.G = typedArray0.getDimension(v2, keyTimeCycle0.G);
                        break;
                    }
                    case 4: {
                        keyTimeCycle0.H = typedArray0.getFloat(v2, keyTimeCycle0.H);
                        break;
                    }
                    case 5: {
                        keyTimeCycle0.I = typedArray0.getFloat(v2, keyTimeCycle0.I);
                        break;
                    }
                    case 6: {
                        keyTimeCycle0.J = typedArray0.getFloat(v2, keyTimeCycle0.J);
                        break;
                    }
                    case 7: {
                        keyTimeCycle0.L = typedArray0.getFloat(v2, keyTimeCycle0.L);
                        break;
                    }
                    case 8: {
                        keyTimeCycle0.K = typedArray0.getFloat(v2, keyTimeCycle0.K);
                        break;
                    }
                    case 9: {
                        keyTimeCycle0.D = typedArray0.getString(v2);
                        break;
                    }
                    case 10: {
                        if(MotionLayout.G9) {
                            int v3 = typedArray0.getResourceId(v2, keyTimeCycle0.b);
                            keyTimeCycle0.b = v3;
                            if(v3 == -1) {
                                keyTimeCycle0.c = typedArray0.getString(v2);
                            }
                        }
                        else if(typedArray0.peekValue(v2).type == 3) {
                            keyTimeCycle0.c = typedArray0.getString(v2);
                        }
                        else {
                            keyTimeCycle0.b = typedArray0.getResourceId(v2, keyTimeCycle0.b);
                        }
                        break;
                    }
                    case 12: {
                        keyTimeCycle0.a = typedArray0.getInt(v2, keyTimeCycle0.a);
                        break;
                    }
                    case 13: {
                        keyTimeCycle0.E = typedArray0.getInteger(v2, keyTimeCycle0.E);
                        break;
                    }
                    case 14: {
                        keyTimeCycle0.M = typedArray0.getFloat(v2, keyTimeCycle0.M);
                        break;
                    }
                    case 15: {
                        keyTimeCycle0.N = typedArray0.getDimension(v2, keyTimeCycle0.N);
                        break;
                    }
                    case 16: {
                        keyTimeCycle0.O = typedArray0.getDimension(v2, keyTimeCycle0.O);
                        break;
                    }
                    case 17: {
                        keyTimeCycle0.P = typedArray0.getDimension(v2, keyTimeCycle0.P);
                        break;
                    }
                    case 18: {
                        keyTimeCycle0.Q = typedArray0.getFloat(v2, keyTimeCycle0.Q);
                        break;
                    }
                    case 19: {
                        if(typedArray0.peekValue(v2).type == 3) {
                            keyTimeCycle0.S = typedArray0.getString(v2);
                            keyTimeCycle0.R = 7;
                        }
                        else {
                            keyTimeCycle0.R = typedArray0.getInt(v2, keyTimeCycle0.R);
                        }
                        break;
                    }
                    case 20: {
                        keyTimeCycle0.T = typedArray0.getFloat(v2, keyTimeCycle0.T);
                        break;
                    }
                    case 21: {
                        keyTimeCycle0.U = typedArray0.peekValue(v2).type == 5 ? typedArray0.getDimension(v2, keyTimeCycle0.U) : typedArray0.getFloat(v2, keyTimeCycle0.U);
                        break;
                    }
                    default: {
                        Log.e("KeyTimeCycle", "unused attribute 0x" + Integer.toHexString(v2) + "   " + Loader.t.get(v2));
                    }
                }
            }
        }
    }

    private String D;
    private int E;
    private float F;
    private float G;
    private float H;
    private float I;
    private float J;
    private float K;
    private float L;
    private float M;
    private float N;
    private float O;
    private float P;
    private float Q;
    private int R;
    private String S;
    private float T;
    private float U;
    public static final String V = "wavePeriod";
    public static final String W = "waveOffset";
    public static final String X = "waveShape";
    public static final int Y = 0;
    public static final int Z = 1;
    public static final int a0 = 2;
    public static final int b0 = 3;
    public static final int c0 = 4;
    public static final int d0 = 5;
    public static final int e0 = 6;
    public static final int f0 = 3;
    static final String g0 = "KeyTimeCycle";
    private static final String h0 = "KeyTimeCycle";

    public KeyTimeCycle() {
        this.E = -1;
        this.F = NaNf;
        this.G = NaNf;
        this.H = NaNf;
        this.I = NaNf;
        this.J = NaNf;
        this.K = NaNf;
        this.L = NaNf;
        this.M = NaNf;
        this.N = NaNf;
        this.O = NaNf;
        this.P = NaNf;
        this.Q = NaNf;
        this.R = 0;
        this.S = null;
        this.T = NaNf;
        this.U = 0.0f;
        this.d = 3;
        this.e = new HashMap();
    }

    public void W(HashMap hashMap0) {
        for(Object object0: hashMap0.keySet()) {
            String s = (String)object0;
            ViewTimeCycle viewTimeCycle0 = (ViewTimeCycle)hashMap0.get(s);
            if(viewTimeCycle0 == null) {
            }
            else if(s.startsWith("CUSTOM")) {
                ConstraintAttribute constraintAttribute0 = (ConstraintAttribute)this.e.get(s.substring(7));
                if(constraintAttribute0 == null) {
                    continue;
                }
                ((CustomSet)viewTimeCycle0).k(this.a, constraintAttribute0, this.T, this.R, this.U);
            }
            else {
                switch(s) {
                    case "alpha": {
                        if(!Float.isNaN(this.F)) {
                            break;
                        }
                        continue;
                    }
                    case "elevation": {
                        if(Float.isNaN(this.G)) {
                            continue;
                        }
                        viewTimeCycle0.c(this.a, this.G, this.T, this.R, this.U);
                        continue;
                    }
                    case "progress": {
                        if(Float.isNaN(this.Q)) {
                            continue;
                        }
                        viewTimeCycle0.c(this.a, this.Q, this.T, this.R, this.U);
                        continue;
                    }
                    case "rotation": {
                        if(Float.isNaN(this.H)) {
                            continue;
                        }
                        viewTimeCycle0.c(this.a, this.H, this.T, this.R, this.U);
                        continue;
                    }
                    case "rotationX": {
                        if(Float.isNaN(this.I)) {
                            continue;
                        }
                        viewTimeCycle0.c(this.a, this.I, this.T, this.R, this.U);
                        continue;
                    }
                    case "rotationY": {
                        if(Float.isNaN(this.J)) {
                            continue;
                        }
                        viewTimeCycle0.c(this.a, this.J, this.T, this.R, this.U);
                        continue;
                    }
                    case "scaleX": {
                        if(Float.isNaN(this.L)) {
                            continue;
                        }
                        viewTimeCycle0.c(this.a, this.L, this.T, this.R, this.U);
                        continue;
                    }
                    case "scaleY": {
                        if(Float.isNaN(this.M)) {
                            continue;
                        }
                        viewTimeCycle0.c(this.a, this.M, this.T, this.R, this.U);
                        continue;
                    }
                    case "transitionPathRotate": {
                        if(Float.isNaN(this.K)) {
                            continue;
                        }
                        viewTimeCycle0.c(this.a, this.K, this.T, this.R, this.U);
                        continue;
                    }
                    case "translationX": {
                        if(Float.isNaN(this.N)) {
                            continue;
                        }
                        viewTimeCycle0.c(this.a, this.N, this.T, this.R, this.U);
                        continue;
                    }
                    case "translationY": {
                        if(Float.isNaN(this.O)) {
                            continue;
                        }
                        viewTimeCycle0.c(this.a, this.O, this.T, this.R, this.U);
                        continue;
                    }
                    case "translationZ": {
                        if(Float.isNaN(this.P)) {
                            continue;
                        }
                        viewTimeCycle0.c(this.a, this.P, this.T, this.R, this.U);
                        continue;
                    }
                    default: {
                        Log.e("KeyTimeCycles", "UNKNOWN addValues \"" + s + "\"");
                        continue;
                    }
                }
                viewTimeCycle0.c(this.a, this.F, this.T, this.R, this.U);
            }
        }
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public void a(HashMap hashMap0) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public Key b() {
        return new KeyTimeCycle().c(this);
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public Key c(Key key0) {
        super.c(key0);
        this.D = ((KeyTimeCycle)key0).D;
        this.E = ((KeyTimeCycle)key0).E;
        this.R = ((KeyTimeCycle)key0).R;
        this.T = ((KeyTimeCycle)key0).T;
        this.U = ((KeyTimeCycle)key0).U;
        this.Q = ((KeyTimeCycle)key0).Q;
        this.F = ((KeyTimeCycle)key0).F;
        this.G = ((KeyTimeCycle)key0).G;
        this.H = ((KeyTimeCycle)key0).H;
        this.K = ((KeyTimeCycle)key0).K;
        this.I = ((KeyTimeCycle)key0).I;
        this.J = ((KeyTimeCycle)key0).J;
        this.L = ((KeyTimeCycle)key0).L;
        this.M = ((KeyTimeCycle)key0).M;
        this.N = ((KeyTimeCycle)key0).N;
        this.O = ((KeyTimeCycle)key0).O;
        this.P = ((KeyTimeCycle)key0).P;
        this.S = ((KeyTimeCycle)key0).S;
        return this;
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public Object clone() throws CloneNotSupportedException {
        return this.b();
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public void d(HashSet hashSet0) {
        if(!Float.isNaN(this.F)) {
            hashSet0.add("alpha");
        }
        if(!Float.isNaN(this.G)) {
            hashSet0.add("elevation");
        }
        if(!Float.isNaN(this.H)) {
            hashSet0.add("rotation");
        }
        if(!Float.isNaN(this.I)) {
            hashSet0.add("rotationX");
        }
        if(!Float.isNaN(this.J)) {
            hashSet0.add("rotationY");
        }
        if(!Float.isNaN(this.N)) {
            hashSet0.add("translationX");
        }
        if(!Float.isNaN(this.O)) {
            hashSet0.add("translationY");
        }
        if(!Float.isNaN(this.P)) {
            hashSet0.add("translationZ");
        }
        if(!Float.isNaN(this.K)) {
            hashSet0.add("transitionPathRotate");
        }
        if(!Float.isNaN(this.L)) {
            hashSet0.add("scaleX");
        }
        if(!Float.isNaN(this.M)) {
            hashSet0.add("scaleY");
        }
        if(!Float.isNaN(this.Q)) {
            hashSet0.add("progress");
        }
        if(this.e.size() > 0) {
            for(Object object0: this.e.keySet()) {
                hashSet0.add("CUSTOM," + ((String)object0));
            }
        }
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public void f(Context context0, AttributeSet attributeSet0) {
        Loader.a(this, context0.obtainStyledAttributes(attributeSet0, styleable.KeyTimeCycle));
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public void i(HashMap hashMap0) {
        if(this.E == -1) {
            return;
        }
        if(!Float.isNaN(this.F)) {
            hashMap0.put("alpha", this.E);
        }
        if(!Float.isNaN(this.G)) {
            hashMap0.put("elevation", this.E);
        }
        if(!Float.isNaN(this.H)) {
            hashMap0.put("rotation", this.E);
        }
        if(!Float.isNaN(this.I)) {
            hashMap0.put("rotationX", this.E);
        }
        if(!Float.isNaN(this.J)) {
            hashMap0.put("rotationY", this.E);
        }
        if(!Float.isNaN(this.N)) {
            hashMap0.put("translationX", this.E);
        }
        if(!Float.isNaN(this.O)) {
            hashMap0.put("translationY", this.E);
        }
        if(!Float.isNaN(this.P)) {
            hashMap0.put("translationZ", this.E);
        }
        if(!Float.isNaN(this.K)) {
            hashMap0.put("transitionPathRotate", this.E);
        }
        if(!Float.isNaN(this.L)) {
            hashMap0.put("scaleX", this.E);
        }
        if(!Float.isNaN(this.L)) {
            hashMap0.put("scaleY", this.E);
        }
        if(!Float.isNaN(this.Q)) {
            hashMap0.put("progress", this.E);
        }
        if(this.e.size() > 0) {
            for(Object object0: this.e.keySet()) {
                hashMap0.put("CUSTOM," + ((String)object0), this.E);
            }
        }
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public void j(String s, Object object0) {
        s.hashCode();
        switch(s) {
            case "alpha": {
                this.F = this.m(object0);
                return;
            }
            case "curveFit": {
                this.E = this.n(object0);
                return;
            }
            case "elevation": {
                this.G = this.m(object0);
                return;
            }
            case "motionProgress": {
                this.Q = this.m(object0);
                return;
            }
            case "rotation": {
                this.H = this.m(object0);
                return;
            }
            case "rotationX": {
                this.I = this.m(object0);
                return;
            }
            case "rotationY": {
                this.J = this.m(object0);
                return;
            }
            case "scaleX": {
                this.L = this.m(object0);
                return;
            }
            case "scaleY": {
                this.M = this.m(object0);
                return;
            }
            case "transitionEasing": {
                this.D = object0.toString();
                return;
            }
            case "transitionPathRotate": {
                this.K = this.m(object0);
                return;
            }
            case "translationX": {
                this.N = this.m(object0);
                return;
            }
            case "translationY": {
                this.O = this.m(object0);
                return;
            }
            case "translationZ": {
                this.P = this.m(object0);
                return;
            }
            case "waveOffset": {
                this.U = this.m(object0);
                return;
            }
            case "wavePeriod": {
                this.T = this.m(object0);
                return;
            }
            case "waveShape": {
                if(object0 instanceof Integer) {
                    this.R = this.n(object0);
                    return;
                }
                this.R = 7;
                this.S = object0.toString();
            }
        }
    }
}

