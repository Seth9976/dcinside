package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet.CustomVarSet;
import androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet;
import androidx.constraintlayout.core.motion.utils.Utils;
import androidx.constraintlayout.core.motion.utils.c;
import java.util.HashMap;
import java.util.HashSet;

public class MotionKeyTimeCycle extends MotionKey {
    private float A;
    private float B;
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
    private int M;
    private String N;
    private float O;
    private float P;
    static final String Q = "KeyTimeCycle";
    private static final String R = "KeyTimeCycle";
    public static final int S = 3;
    private String y;
    private int z;

    public MotionKeyTimeCycle() {
        this.z = -1;
        this.A = NaNf;
        this.B = NaNf;
        this.C = NaNf;
        this.D = NaNf;
        this.E = NaNf;
        this.F = NaNf;
        this.G = NaNf;
        this.H = NaNf;
        this.I = NaNf;
        this.J = NaNf;
        this.K = NaNf;
        this.L = NaNf;
        this.M = 0;
        this.N = null;
        this.O = NaNf;
        this.P = 0.0f;
        this.k = 3;
        this.l = new HashMap();
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public boolean a(int v, int v1) {
        switch(v) {
            case 100: {
                this.h = v1;
                return true;
            }
            case 421: {
                this.M = v1;
                return true;
            }
            default: {
                return super.a(v, v1);
            }
        }
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public boolean b(int v, float f) {
        switch(v) {
            case 304: {
                this.I = this.t(f);
                return true;
            }
            case 305: {
                this.J = this.t(f);
                return true;
            }
            case 306: {
                this.K = this.t(f);
                return true;
            }
            case 307: {
                this.B = this.t(f);
                return true;
            }
            case 308: {
                this.D = this.t(f);
                return true;
            }
            case 309: {
                this.E = this.t(f);
                return true;
            }
            case 310: {
                this.C = this.t(f);
                return true;
            }
            case 311: {
                this.G = this.t(f);
                return true;
            }
            case 312: {
                this.H = this.t(f);
                return true;
            }
            case 315: {
                this.L = this.t(f);
                return true;
            }
            case 401: {
                this.z = this.u(f);
                return true;
            }
            case 403: {
                this.A = f;
                return true;
            }
            case 0x1A0: {
                this.F = this.t(f);
                return true;
            }
            case 423: {
                this.O = this.t(f);
                return true;
            }
            case 424: {
                this.P = this.t(f);
                return true;
            }
            default: {
                return super.b(v, f);
            }
        }
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public boolean c(int v, boolean z) {
        return super.c(v, z);
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public Object clone() throws CloneNotSupportedException {
        return this.g();
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public boolean d(int v, String s) {
        switch(v) {
            case 420: {
                this.y = s;
                return true;
            }
            case 421: {
                this.M = 7;
                this.N = s;
                return true;
            }
            default: {
                return super.d(v, s);
            }
        }
    }

    @Override  // androidx.constraintlayout.core.motion.utils.TypedValues
    public int e(String s) {
        return c.a(s);
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public void f(HashMap hashMap0) {
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public MotionKey g() {
        return new MotionKeyTimeCycle().w(this);
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public MotionKey h(MotionKey motionKey0) {
        return this.w(motionKey0);
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public void i(HashSet hashSet0) {
        if(!Float.isNaN(this.A)) {
            hashSet0.add("alpha");
        }
        if(!Float.isNaN(this.B)) {
            hashSet0.add("elevation");
        }
        if(!Float.isNaN(this.C)) {
            hashSet0.add("rotationZ");
        }
        if(!Float.isNaN(this.D)) {
            hashSet0.add("rotationX");
        }
        if(!Float.isNaN(this.E)) {
            hashSet0.add("rotationY");
        }
        if(!Float.isNaN(this.G)) {
            hashSet0.add("scaleX");
        }
        if(!Float.isNaN(this.H)) {
            hashSet0.add("scaleY");
        }
        if(!Float.isNaN(this.F)) {
            hashSet0.add("pathRotate");
        }
        if(!Float.isNaN(this.I)) {
            hashSet0.add("translationX");
        }
        if(!Float.isNaN(this.J)) {
            hashSet0.add("translationY");
        }
        if(!Float.isNaN(this.K)) {
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
            TimeCycleSplineSet timeCycleSplineSet0 = (TimeCycleSplineSet)hashMap0.get(s);
            if(timeCycleSplineSet0 == null) {
            }
            else if(s.startsWith("CUSTOM")) {
                CustomVariable customVariable0 = (CustomVariable)this.l.get(s.substring(7));
                if(customVariable0 == null) {
                    continue;
                }
                ((CustomVarSet)timeCycleSplineSet0).g(this.h, customVariable0, this.O, this.M, this.P);
            }
            else {
                switch(s) {
                    case "alpha": {
                        if(Float.isNaN(this.A)) {
                            continue;
                        }
                        timeCycleSplineSet0.c(this.h, this.A, this.O, this.M, this.P);
                        continue;
                    }
                    case "elevation": {
                        if(Float.isNaN(this.K)) {
                            continue;
                        }
                        timeCycleSplineSet0.c(this.h, this.K, this.O, this.M, this.P);
                        continue;
                    }
                    case "pathRotate": {
                        if(!Float.isNaN(this.F)) {
                            break;
                        }
                        continue;
                    }
                    case "progress": {
                        if(Float.isNaN(this.L)) {
                            continue;
                        }
                        timeCycleSplineSet0.c(this.h, this.L, this.O, this.M, this.P);
                        continue;
                    }
                    case "rotationX": {
                        if(Float.isNaN(this.D)) {
                            continue;
                        }
                        timeCycleSplineSet0.c(this.h, this.D, this.O, this.M, this.P);
                        continue;
                    }
                    case "rotationY": {
                        if(Float.isNaN(this.E)) {
                            continue;
                        }
                        timeCycleSplineSet0.c(this.h, this.E, this.O, this.M, this.P);
                        continue;
                    }
                    case "rotationZ": {
                        if(Float.isNaN(this.C)) {
                            continue;
                        }
                        timeCycleSplineSet0.c(this.h, this.C, this.O, this.M, this.P);
                        continue;
                    }
                    case "scaleX": {
                        if(Float.isNaN(this.G)) {
                            continue;
                        }
                        timeCycleSplineSet0.c(this.h, this.G, this.O, this.M, this.P);
                        continue;
                    }
                    case "scaleY": {
                        if(Float.isNaN(this.H)) {
                            continue;
                        }
                        timeCycleSplineSet0.c(this.h, this.H, this.O, this.M, this.P);
                        continue;
                    }
                    case "translationX": {
                        if(Float.isNaN(this.I)) {
                            continue;
                        }
                        timeCycleSplineSet0.c(this.h, this.I, this.O, this.M, this.P);
                        continue;
                    }
                    case "translationY": {
                        if(Float.isNaN(this.J)) {
                            continue;
                        }
                        timeCycleSplineSet0.c(this.h, this.J, this.O, this.M, this.P);
                        continue;
                    }
                    case "translationZ": {
                        if(Float.isNaN(this.K)) {
                            continue;
                        }
                        timeCycleSplineSet0.c(this.h, this.K, this.O, this.M, this.P);
                        continue;
                    }
                    default: {
                        Utils.f("KeyTimeCycles", "UNKNOWN addValues \"" + s + "\"");
                        continue;
                    }
                }
                timeCycleSplineSet0.c(this.h, this.F, this.O, this.M, this.P);
            }
        }
    }

    public MotionKeyTimeCycle w(MotionKey motionKey0) {
        super.h(motionKey0);
        this.y = ((MotionKeyTimeCycle)motionKey0).y;
        this.z = ((MotionKeyTimeCycle)motionKey0).z;
        this.M = ((MotionKeyTimeCycle)motionKey0).M;
        this.O = ((MotionKeyTimeCycle)motionKey0).O;
        this.P = ((MotionKeyTimeCycle)motionKey0).P;
        this.L = ((MotionKeyTimeCycle)motionKey0).L;
        this.A = ((MotionKeyTimeCycle)motionKey0).A;
        this.B = ((MotionKeyTimeCycle)motionKey0).B;
        this.C = ((MotionKeyTimeCycle)motionKey0).C;
        this.F = ((MotionKeyTimeCycle)motionKey0).F;
        this.D = ((MotionKeyTimeCycle)motionKey0).D;
        this.E = ((MotionKeyTimeCycle)motionKey0).E;
        this.G = ((MotionKeyTimeCycle)motionKey0).G;
        this.H = ((MotionKeyTimeCycle)motionKey0).H;
        this.I = ((MotionKeyTimeCycle)motionKey0).I;
        this.J = ((MotionKeyTimeCycle)motionKey0).J;
        this.K = ((MotionKeyTimeCycle)motionKey0).K;
        return this;
    }
}

