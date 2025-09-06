package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.utils.KeyCycleOscillator;
import androidx.constraintlayout.core.motion.utils.Utils;
import java.util.HashMap;
import java.util.HashSet;

public class MotionKeyCycle extends MotionKey {
    private int A;
    private String B;
    private float C;
    private float D;
    private float E;
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
    private static final String R = "KeyCycle";
    static final String S = "KeyCycle";
    public static final String T = "wavePeriod";
    public static final String U = "waveOffset";
    public static final String V = "wavePhase";
    public static final String W = "waveShape";
    public static final int X = 0;
    public static final int Y = 1;
    public static final int Z = 2;
    public static final int a0 = 3;
    public static final int b0 = 4;
    public static final int c0 = 5;
    public static final int d0 = 6;
    public static final int e0 = 4;
    private String y;
    private int z;

    public MotionKeyCycle() {
        this.y = null;
        this.z = 0;
        this.A = -1;
        this.B = null;
        this.C = NaNf;
        this.D = 0.0f;
        this.E = 0.0f;
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
        this.k = 4;
        this.l = new HashMap();
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public boolean a(int v, int v1) {
        switch(v) {
            case 401: {
                this.z = v1;
                return true;
            }
            case 421: {
                this.A = v1;
                return true;
            }
            default: {
                return this.b(v, ((float)v1)) ? true : super.a(v, v1);
            }
        }
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public boolean b(int v, float f) {
        switch(v) {
            case 304: {
                this.O = f;
                return true;
            }
            case 305: {
                this.P = f;
                return true;
            }
            case 306: {
                this.Q = f;
                return true;
            }
            case 307: {
                this.H = f;
                return true;
            }
            case 308: {
                this.K = f;
                return true;
            }
            case 309: {
                this.L = f;
                return true;
            }
            case 310: {
                this.I = f;
                return true;
            }
            case 311: {
                this.M = f;
                return true;
            }
            case 312: {
                this.N = f;
                return true;
            }
            case 315: {
                this.F = f;
                return true;
            }
            case 403: {
                this.G = f;
                return true;
            }
            case 0x1A0: {
                this.J = f;
                return true;
            }
            case 423: {
                this.C = f;
                return true;
            }
            case 424: {
                this.D = f;
                return true;
            }
            case 425: {
                this.E = f;
                return true;
            }
            default: {
                return super.b(v, f);
            }
        }
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public Object clone() throws CloneNotSupportedException {
        return null;
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public boolean d(int v, String s) {
        switch(v) {
            case 420: {
                this.y = s;
                return true;
            }
            case 422: {
                this.B = s;
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
            case "alpha": {
                return 403;
            }
            case "curveFit": {
                return 401;
            }
            case "customWave": {
                return 422;
            }
            case "easing": {
                return 420;
            }
            case "offset": {
                return 424;
            }
            case "pathRotate": {
                return 0x1A0;
            }
            case "period": {
                return 423;
            }
            case "phase": {
                return 425;
            }
            case "pivotX": {
                return 313;
            }
            case "pivotY": {
                return 314;
            }
            case "progress": {
                return 315;
            }
            case "rotationX": {
                return 308;
            }
            case "rotationY": {
                return 309;
            }
            case "rotationZ": {
                return 310;
            }
            case "scaleX": {
                return 311;
            }
            case "scaleY": {
                return 312;
            }
            case "translationX": {
                return 304;
            }
            case "translationY": {
                return 305;
            }
            case "translationZ": {
                return 306;
            }
            case "visibility": {
                return 402;
            }
            case "waveShape": {
                return 421;
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
    public MotionKey g() [...] // Inlined contents

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public void i(HashSet hashSet0) {
        if(!Float.isNaN(this.G)) {
            hashSet0.add("alpha");
        }
        if(!Float.isNaN(this.H)) {
            hashSet0.add("elevation");
        }
        if(!Float.isNaN(this.I)) {
            hashSet0.add("rotationZ");
        }
        if(!Float.isNaN(this.K)) {
            hashSet0.add("rotationX");
        }
        if(!Float.isNaN(this.L)) {
            hashSet0.add("rotationY");
        }
        if(!Float.isNaN(this.M)) {
            hashSet0.add("scaleX");
        }
        if(!Float.isNaN(this.N)) {
            hashSet0.add("scaleY");
        }
        if(!Float.isNaN(this.J)) {
            hashSet0.add("pathRotate");
        }
        if(!Float.isNaN(this.O)) {
            hashSet0.add("translationX");
        }
        if(!Float.isNaN(this.P)) {
            hashSet0.add("translationY");
        }
        if(!Float.isNaN(this.Q)) {
            hashSet0.add("translationZ");
        }
        if(this.l.size() > 0) {
            for(Object object0: this.l.keySet()) {
                hashSet0.add("CUSTOM," + ((String)object0));
            }
        }
    }

    public void v(HashMap hashMap0) {
        for(Object object0: hashMap0.keySet()) {
            String s = (String)object0;
            if(s.startsWith("CUSTOM")) {
                CustomVariable customVariable0 = (CustomVariable)this.l.get(s.substring(7));
                if(customVariable0 == null || customVariable0.m() != 901) {
                    continue;
                }
                KeyCycleOscillator keyCycleOscillator0 = (KeyCycleOscillator)hashMap0.get(s);
                if(keyCycleOscillator0 == null) {
                    continue;
                }
                keyCycleOscillator0.g(this.h, this.A, this.B, -1, this.C, this.D, this.E / 360.0f, customVariable0.n(), customVariable0);
            }
            else {
                float f = this.x(s);
                if(!Float.isNaN(f)) {
                    KeyCycleOscillator keyCycleOscillator1 = (KeyCycleOscillator)hashMap0.get(s);
                    if(keyCycleOscillator1 != null) {
                        keyCycleOscillator1.f(this.h, this.A, this.B, -1, this.C, this.D, this.E / 360.0f, f);
                    }
                }
            }
        }
    }

    public void w() {
        System.out.println("MotionKeyCycle{mWaveShape=" + this.A + ", mWavePeriod=" + this.C + ", mWaveOffset=" + this.D + ", mWavePhase=" + this.E + ", mRotation=" + this.I + '}');
    }

    public float x(String s) {
        s.hashCode();
        switch(s) {
            case "alpha": {
                return this.G;
            }
            case "elevation": {
                return this.H;
            }
            case "offset": {
                return this.D;
            }
            case "pathRotate": {
                return this.J;
            }
            case "phase": {
                return this.E;
            }
            case "progress": {
                return this.F;
            }
            case "rotationX": {
                return this.K;
            }
            case "rotationY": {
                return this.L;
            }
            case "rotationZ": {
                return this.I;
            }
            case "scaleX": {
                return this.M;
            }
            case "scaleY": {
                return this.N;
            }
            case "translationX": {
                return this.O;
            }
            case "translationY": {
                return this.P;
            }
            case "translationZ": {
                return this.Q;
            }
            default: {
                return NaNf;
            }
        }
    }

    public void y() {
        HashSet hashSet0 = new HashSet();
        this.i(hashSet0);
        Utils.c((" ------------- " + this.h + " -------------"));
        Utils.c(("MotionKeyCycle{Shape=" + this.A + ", Period=" + this.C + ", Offset=" + this.D + ", Phase=" + this.E + '}'));
        String[] arr_s = (String[])hashSet0.toArray(new String[0]);
        for(int v = 0; v < arr_s.length; ++v) {
            Utils.c((arr_s[v] + ":" + this.x(arr_s[v])));
        }
    }
}

