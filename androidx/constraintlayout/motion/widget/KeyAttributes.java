package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.motion.utils.ViewSpline.CustomSet;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.R.styleable;
import java.util.HashMap;
import java.util.HashSet;

public class KeyAttributes extends Key {
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
        private static SparseIntArray s;

        static {
            SparseIntArray sparseIntArray0 = new SparseIntArray();
            Loader.s = sparseIntArray0;
            sparseIntArray0.append(styleable.KeyAttribute_android_alpha, 1);
            Loader.s.append(styleable.KeyAttribute_android_elevation, 2);
            Loader.s.append(styleable.KeyAttribute_android_rotation, 4);
            Loader.s.append(styleable.KeyAttribute_android_rotationX, 5);
            Loader.s.append(styleable.KeyAttribute_android_rotationY, 6);
            Loader.s.append(styleable.KeyAttribute_android_transformPivotX, 19);
            Loader.s.append(styleable.KeyAttribute_android_transformPivotY, 20);
            Loader.s.append(styleable.KeyAttribute_android_scaleX, 7);
            Loader.s.append(styleable.KeyAttribute_transitionPathRotate, 8);
            Loader.s.append(styleable.KeyAttribute_transitionEasing, 9);
            Loader.s.append(styleable.KeyAttribute_motionTarget, 10);
            Loader.s.append(styleable.KeyAttribute_framePosition, 12);
            Loader.s.append(styleable.KeyAttribute_curveFit, 13);
            Loader.s.append(styleable.KeyAttribute_android_scaleY, 14);
            Loader.s.append(styleable.KeyAttribute_android_translationX, 15);
            Loader.s.append(styleable.KeyAttribute_android_translationY, 16);
            Loader.s.append(styleable.KeyAttribute_android_translationZ, 17);
            Loader.s.append(styleable.KeyAttribute_motionProgress, 18);
        }

        public static void a(KeyAttributes keyAttributes0, TypedArray typedArray0) {
            int v = typedArray0.getIndexCount();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = typedArray0.getIndex(v1);
                switch(Loader.s.get(v2)) {
                    case 1: {
                        keyAttributes0.G = typedArray0.getFloat(v2, keyAttributes0.G);
                        break;
                    }
                    case 2: {
                        keyAttributes0.H = typedArray0.getDimension(v2, keyAttributes0.H);
                        break;
                    }
                    case 4: {
                        keyAttributes0.I = typedArray0.getFloat(v2, keyAttributes0.I);
                        break;
                    }
                    case 5: {
                        keyAttributes0.J = typedArray0.getFloat(v2, keyAttributes0.J);
                        break;
                    }
                    case 6: {
                        keyAttributes0.K = typedArray0.getFloat(v2, keyAttributes0.K);
                        break;
                    }
                    case 7: {
                        keyAttributes0.O = typedArray0.getFloat(v2, keyAttributes0.O);
                        break;
                    }
                    case 8: {
                        keyAttributes0.N = typedArray0.getFloat(v2, keyAttributes0.N);
                        break;
                    }
                    case 9: {
                        keyAttributes0.D = typedArray0.getString(v2);
                        break;
                    }
                    case 10: {
                        if(MotionLayout.G9) {
                            int v3 = typedArray0.getResourceId(v2, keyAttributes0.b);
                            keyAttributes0.b = v3;
                            if(v3 == -1) {
                                keyAttributes0.c = typedArray0.getString(v2);
                            }
                        }
                        else if(typedArray0.peekValue(v2).type == 3) {
                            keyAttributes0.c = typedArray0.getString(v2);
                        }
                        else {
                            keyAttributes0.b = typedArray0.getResourceId(v2, keyAttributes0.b);
                        }
                        break;
                    }
                    case 12: {
                        keyAttributes0.a = typedArray0.getInt(v2, keyAttributes0.a);
                        break;
                    }
                    case 13: {
                        keyAttributes0.E = typedArray0.getInteger(v2, keyAttributes0.E);
                        break;
                    }
                    case 14: {
                        keyAttributes0.P = typedArray0.getFloat(v2, keyAttributes0.P);
                        break;
                    }
                    case 15: {
                        keyAttributes0.Q = typedArray0.getDimension(v2, keyAttributes0.Q);
                        break;
                    }
                    case 16: {
                        keyAttributes0.R = typedArray0.getDimension(v2, keyAttributes0.R);
                        break;
                    }
                    case 17: {
                        keyAttributes0.S = typedArray0.getDimension(v2, keyAttributes0.S);
                        break;
                    }
                    case 18: {
                        keyAttributes0.T = typedArray0.getFloat(v2, keyAttributes0.T);
                        break;
                    }
                    case 19: {
                        keyAttributes0.L = typedArray0.getDimension(v2, keyAttributes0.L);
                        break;
                    }
                    case 20: {
                        keyAttributes0.M = typedArray0.getDimension(v2, keyAttributes0.M);
                        break;
                    }
                    default: {
                        Log.e("KeyAttribute", "unused attribute 0x" + Integer.toHexString(v2) + "   " + Loader.s.get(v2));
                    }
                }
            }
        }
    }

    private String D;
    private int E;
    private boolean F;
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
    private float R;
    private float S;
    private float T;
    static final String U = "KeyAttribute";
    private static final String V = "KeyAttributes";
    private static final boolean W = false;
    public static final int X = 1;

    public KeyAttributes() {
        this.E = -1;
        this.F = false;
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
        this.R = NaNf;
        this.S = NaNf;
        this.T = NaNf;
        this.d = 1;
        this.e = new HashMap();
    }

    int T() {
        return this.E;
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public void a(HashMap hashMap0) {
        for(Object object0: hashMap0.keySet()) {
            String s = (String)object0;
            SplineSet splineSet0 = (SplineSet)hashMap0.get(s);
            if(splineSet0 == null) {
            }
            else if(s.startsWith("CUSTOM")) {
                ConstraintAttribute constraintAttribute0 = (ConstraintAttribute)this.e.get(s.substring(7));
                if(constraintAttribute0 == null) {
                    continue;
                }
                ((CustomSet)splineSet0).n(this.a, constraintAttribute0);
            }
            else {
                switch(s) {
                    case "alpha": {
                        if(!Float.isNaN(this.G)) {
                            break;
                        }
                        continue;
                    }
                    case "elevation": {
                        if(Float.isNaN(this.H)) {
                            continue;
                        }
                        splineSet0.g(this.a, this.H);
                        continue;
                    }
                    case "progress": {
                        if(Float.isNaN(this.T)) {
                            continue;
                        }
                        splineSet0.g(this.a, this.T);
                        continue;
                    }
                    case "rotation": {
                        if(Float.isNaN(this.I)) {
                            continue;
                        }
                        splineSet0.g(this.a, this.I);
                        continue;
                    }
                    case "rotationX": {
                        if(Float.isNaN(this.J)) {
                            continue;
                        }
                        splineSet0.g(this.a, this.J);
                        continue;
                    }
                    case "rotationY": {
                        if(Float.isNaN(this.K)) {
                            continue;
                        }
                        splineSet0.g(this.a, this.K);
                        continue;
                    }
                    case "scaleX": {
                        if(Float.isNaN(this.O)) {
                            continue;
                        }
                        splineSet0.g(this.a, this.O);
                        continue;
                    }
                    case "scaleY": {
                        if(Float.isNaN(this.P)) {
                            continue;
                        }
                        splineSet0.g(this.a, this.P);
                        continue;
                    }
                    case "transformPivotX": {
                        if(Float.isNaN(this.J)) {
                            continue;
                        }
                        splineSet0.g(this.a, this.L);
                        continue;
                    }
                    case "transformPivotY": {
                        if(Float.isNaN(this.K)) {
                            continue;
                        }
                        splineSet0.g(this.a, this.M);
                        continue;
                    }
                    case "transitionPathRotate": {
                        if(Float.isNaN(this.N)) {
                            continue;
                        }
                        splineSet0.g(this.a, this.N);
                        continue;
                    }
                    case "translationX": {
                        if(Float.isNaN(this.Q)) {
                            continue;
                        }
                        splineSet0.g(this.a, this.Q);
                        continue;
                    }
                    case "translationY": {
                        if(Float.isNaN(this.R)) {
                            continue;
                        }
                        splineSet0.g(this.a, this.R);
                        continue;
                    }
                    case "translationZ": {
                        if(Float.isNaN(this.S)) {
                            continue;
                        }
                        splineSet0.g(this.a, this.S);
                        continue;
                    }
                    default: {
                        continue;
                    }
                }
                splineSet0.g(this.a, this.G);
            }
        }
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public Key b() {
        return new KeyAttributes().c(this);
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public Key c(Key key0) {
        super.c(key0);
        this.E = ((KeyAttributes)key0).E;
        this.F = ((KeyAttributes)key0).F;
        this.G = ((KeyAttributes)key0).G;
        this.H = ((KeyAttributes)key0).H;
        this.I = ((KeyAttributes)key0).I;
        this.J = ((KeyAttributes)key0).J;
        this.K = ((KeyAttributes)key0).K;
        this.L = ((KeyAttributes)key0).L;
        this.M = ((KeyAttributes)key0).M;
        this.N = ((KeyAttributes)key0).N;
        this.O = ((KeyAttributes)key0).O;
        this.P = ((KeyAttributes)key0).P;
        this.Q = ((KeyAttributes)key0).Q;
        this.R = ((KeyAttributes)key0).R;
        this.S = ((KeyAttributes)key0).S;
        this.T = ((KeyAttributes)key0).T;
        this.D = ((KeyAttributes)key0).D;
        return this;
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public Object clone() throws CloneNotSupportedException {
        return this.b();
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public void d(HashSet hashSet0) {
        if(!Float.isNaN(this.G)) {
            hashSet0.add("alpha");
        }
        if(!Float.isNaN(this.H)) {
            hashSet0.add("elevation");
        }
        if(!Float.isNaN(this.I)) {
            hashSet0.add("rotation");
        }
        if(!Float.isNaN(this.J)) {
            hashSet0.add("rotationX");
        }
        if(!Float.isNaN(this.K)) {
            hashSet0.add("rotationY");
        }
        if(!Float.isNaN(this.L)) {
            hashSet0.add("transformPivotX");
        }
        if(!Float.isNaN(this.M)) {
            hashSet0.add("transformPivotY");
        }
        if(!Float.isNaN(this.Q)) {
            hashSet0.add("translationX");
        }
        if(!Float.isNaN(this.R)) {
            hashSet0.add("translationY");
        }
        if(!Float.isNaN(this.S)) {
            hashSet0.add("translationZ");
        }
        if(!Float.isNaN(this.N)) {
            hashSet0.add("transitionPathRotate");
        }
        if(!Float.isNaN(this.O)) {
            hashSet0.add("scaleX");
        }
        if(!Float.isNaN(this.P)) {
            hashSet0.add("scaleY");
        }
        if(!Float.isNaN(this.T)) {
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
        Loader.a(this, context0.obtainStyledAttributes(attributeSet0, styleable.KeyAttribute));
    }

    @Override  // androidx.constraintlayout.motion.widget.Key
    public void i(HashMap hashMap0) {
        if(this.E == -1) {
            return;
        }
        if(!Float.isNaN(this.G)) {
            hashMap0.put("alpha", this.E);
        }
        if(!Float.isNaN(this.H)) {
            hashMap0.put("elevation", this.E);
        }
        if(!Float.isNaN(this.I)) {
            hashMap0.put("rotation", this.E);
        }
        if(!Float.isNaN(this.J)) {
            hashMap0.put("rotationX", this.E);
        }
        if(!Float.isNaN(this.K)) {
            hashMap0.put("rotationY", this.E);
        }
        if(!Float.isNaN(this.L)) {
            hashMap0.put("transformPivotX", this.E);
        }
        if(!Float.isNaN(this.M)) {
            hashMap0.put("transformPivotY", this.E);
        }
        if(!Float.isNaN(this.Q)) {
            hashMap0.put("translationX", this.E);
        }
        if(!Float.isNaN(this.R)) {
            hashMap0.put("translationY", this.E);
        }
        if(!Float.isNaN(this.S)) {
            hashMap0.put("translationZ", this.E);
        }
        if(!Float.isNaN(this.N)) {
            hashMap0.put("transitionPathRotate", this.E);
        }
        if(!Float.isNaN(this.O)) {
            hashMap0.put("scaleX", this.E);
        }
        if(!Float.isNaN(this.P)) {
            hashMap0.put("scaleY", this.E);
        }
        if(!Float.isNaN(this.T)) {
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
                this.G = this.m(object0);
                return;
            }
            case "curveFit": {
                this.E = this.n(object0);
                return;
            }
            case "elevation": {
                this.H = this.m(object0);
                return;
            }
            case "motionProgress": {
                this.T = this.m(object0);
                return;
            }
            case "rotation": {
                this.I = this.m(object0);
                return;
            }
            case "rotationX": {
                this.J = this.m(object0);
                return;
            }
            case "rotationY": {
                this.K = this.m(object0);
                return;
            }
            case "scaleX": {
                this.O = this.m(object0);
                return;
            }
            case "scaleY": {
                this.P = this.m(object0);
                return;
            }
            case "transformPivotX": {
                this.L = this.m(object0);
                return;
            }
            case "transformPivotY": {
                this.M = this.m(object0);
                return;
            }
            case "transitionEasing": {
                this.D = object0.toString();
                return;
            }
            case "transitionPathRotate": {
                this.N = this.m(object0);
                return;
            }
            case "translationX": {
                this.Q = this.m(object0);
                return;
            }
            case "translationY": {
                this.R = this.m(object0);
                return;
            }
            case "translationZ": {
                this.S = this.m(object0);
                return;
            }
            case "visibility": {
                this.F = this.l(object0);
            }
        }
    }
}

