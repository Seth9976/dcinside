package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.utils.SplineSet.CustomSpline;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.a;
import java.util.HashMap;
import java.util.HashSet;

public class MotionKeyAttributes extends MotionKey {
    private int A;
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
    private float M;
    private float N;
    private float O;
    static final String P = "KeyAttribute";
    private static final String Q = "KeyAttributes";
    private static final boolean R = false;
    public static final int S = 1;
    private String y;
    private int z;

    public MotionKeyAttributes() {
        this.z = -1;
        this.A = 0;
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
        this.M = NaNf;
        this.N = NaNf;
        this.O = NaNf;
        this.k = 1;
        this.l = new HashMap();
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public boolean a(int v, int v1) {
        switch(v) {
            case 100: {
                this.h = v1;
                return true;
            }
            case 301: {
                this.z = v1;
                return true;
            }
            case 302: {
                this.A = v1;
                return true;
            }
            default: {
                return this.a(v, v1) ? true : super.a(v, v1);
            }
        }
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public boolean b(int v, float f) {
        if(v != 100) {
            switch(v) {
                case 303: {
                    this.B = f;
                    return true;
                }
                case 304: {
                    this.L = f;
                    return true;
                }
                case 305: {
                    this.M = f;
                    return true;
                }
                case 306: {
                    this.N = f;
                    return true;
                }
                case 307: {
                    this.C = f;
                    return true;
                }
                case 308: {
                    this.E = f;
                    return true;
                }
                case 309: {
                    this.F = f;
                    return true;
                }
                case 310: {
                    this.D = f;
                    return true;
                }
                case 311: {
                    this.J = f;
                    return true;
                }
                case 312: {
                    this.K = f;
                    return true;
                }
                case 313: {
                    this.G = f;
                    return true;
                }
                case 314: {
                    this.H = f;
                    return true;
                }
                case 315: {
                    this.O = f;
                    return true;
                }
                case 316: {
                    this.I = f;
                    return true;
                }
                default: {
                    return super.b(v, f);
                }
            }
        }
        this.I = f;
        return true;
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public Object clone() throws CloneNotSupportedException {
        return null;
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public boolean d(int v, String s) {
        switch(v) {
            case 101: {
                this.j = s;
                return true;
            }
            case 317: {
                this.y = s;
                return true;
            }
            default: {
                return super.d(v, s);
            }
        }
    }

    @Override  // androidx.constraintlayout.core.motion.utils.TypedValues
    public int e(String s) {
        return a.a(s);
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public void f(HashMap hashMap0) {
        for(Object object0: hashMap0.keySet()) {
            String s = (String)object0;
            SplineSet splineSet0 = (SplineSet)hashMap0.get(s);
            if(splineSet0 == null) {
            }
            else if(s.startsWith("CUSTOM")) {
                CustomVariable customVariable0 = (CustomVariable)this.l.get(s.substring(7));
                if(customVariable0 == null) {
                    continue;
                }
                ((CustomSpline)splineSet0).k(this.h, customVariable0);
            }
            else {
                switch(s) {
                    case "alpha": {
                        if(Float.isNaN(this.B)) {
                            continue;
                        }
                        splineSet0.g(this.h, this.B);
                        continue;
                    }
                    case "elevation": {
                        if(Float.isNaN(this.C)) {
                            continue;
                        }
                        splineSet0.g(this.h, this.C);
                        continue;
                    }
                    case "pathRotate": {
                        if(!Float.isNaN(this.I)) {
                            break;
                        }
                        continue;
                    }
                    case "pivotX": {
                        if(Float.isNaN(this.E)) {
                            continue;
                        }
                        splineSet0.g(this.h, this.G);
                        continue;
                    }
                    case "pivotY": {
                        if(Float.isNaN(this.F)) {
                            continue;
                        }
                        splineSet0.g(this.h, this.H);
                        continue;
                    }
                    case "progress": {
                        if(Float.isNaN(this.O)) {
                            continue;
                        }
                        splineSet0.g(this.h, this.O);
                        continue;
                    }
                    case "rotationX": {
                        if(Float.isNaN(this.E)) {
                            continue;
                        }
                        splineSet0.g(this.h, this.E);
                        continue;
                    }
                    case "rotationY": {
                        if(Float.isNaN(this.F)) {
                            continue;
                        }
                        splineSet0.g(this.h, this.F);
                        continue;
                    }
                    case "rotationZ": {
                        if(Float.isNaN(this.D)) {
                            continue;
                        }
                        splineSet0.g(this.h, this.D);
                        continue;
                    }
                    case "scaleX": {
                        if(Float.isNaN(this.J)) {
                            continue;
                        }
                        splineSet0.g(this.h, this.J);
                        continue;
                    }
                    case "scaleY": {
                        if(Float.isNaN(this.K)) {
                            continue;
                        }
                        splineSet0.g(this.h, this.K);
                        continue;
                    }
                    case "translationX": {
                        if(Float.isNaN(this.L)) {
                            continue;
                        }
                        splineSet0.g(this.h, this.L);
                        continue;
                    }
                    case "translationY": {
                        if(Float.isNaN(this.M)) {
                            continue;
                        }
                        splineSet0.g(this.h, this.M);
                        continue;
                    }
                    case "translationZ": {
                        if(Float.isNaN(this.N)) {
                            continue;
                        }
                        splineSet0.g(this.h, this.N);
                        continue;
                    }
                    default: {
                        System.err.println("not supported by KeyAttributes " + s);
                        continue;
                    }
                }
                splineSet0.g(this.h, this.I);
            }
        }
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public MotionKey g() [...] // Inlined contents

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public void i(HashSet hashSet0) {
        if(!Float.isNaN(this.B)) {
            hashSet0.add("alpha");
        }
        if(!Float.isNaN(this.C)) {
            hashSet0.add("elevation");
        }
        if(!Float.isNaN(this.D)) {
            hashSet0.add("rotationZ");
        }
        if(!Float.isNaN(this.E)) {
            hashSet0.add("rotationX");
        }
        if(!Float.isNaN(this.F)) {
            hashSet0.add("rotationY");
        }
        if(!Float.isNaN(this.G)) {
            hashSet0.add("pivotX");
        }
        if(!Float.isNaN(this.H)) {
            hashSet0.add("pivotY");
        }
        if(!Float.isNaN(this.L)) {
            hashSet0.add("translationX");
        }
        if(!Float.isNaN(this.M)) {
            hashSet0.add("translationY");
        }
        if(!Float.isNaN(this.N)) {
            hashSet0.add("translationZ");
        }
        if(!Float.isNaN(this.I)) {
            hashSet0.add("pathRotate");
        }
        if(!Float.isNaN(this.J)) {
            hashSet0.add("scaleX");
        }
        if(!Float.isNaN(this.K)) {
            hashSet0.add("scaleY");
        }
        if(!Float.isNaN(this.O)) {
            hashSet0.add("progress");
        }
        if(this.l.size() > 0) {
            for(Object object0: this.l.keySet()) {
                hashSet0.add("CUSTOM," + ((String)object0));
            }
        }
    }

    @Override  // androidx.constraintlayout.core.motion.key.MotionKey
    public void q(HashMap hashMap0) {
        if(!Float.isNaN(this.B)) {
            hashMap0.put("alpha", this.z);
        }
        if(!Float.isNaN(this.C)) {
            hashMap0.put("elevation", this.z);
        }
        if(!Float.isNaN(this.D)) {
            hashMap0.put("rotationZ", this.z);
        }
        if(!Float.isNaN(this.E)) {
            hashMap0.put("rotationX", this.z);
        }
        if(!Float.isNaN(this.F)) {
            hashMap0.put("rotationY", this.z);
        }
        if(!Float.isNaN(this.G)) {
            hashMap0.put("pivotX", this.z);
        }
        if(!Float.isNaN(this.H)) {
            hashMap0.put("pivotY", this.z);
        }
        if(!Float.isNaN(this.L)) {
            hashMap0.put("translationX", this.z);
        }
        if(!Float.isNaN(this.M)) {
            hashMap0.put("translationY", this.z);
        }
        if(!Float.isNaN(this.N)) {
            hashMap0.put("translationZ", this.z);
        }
        if(!Float.isNaN(this.I)) {
            hashMap0.put("pathRotate", this.z);
        }
        if(!Float.isNaN(this.J)) {
            hashMap0.put("scaleX", this.z);
        }
        if(!Float.isNaN(this.K)) {
            hashMap0.put("scaleY", this.z);
        }
        if(!Float.isNaN(this.O)) {
            hashMap0.put("progress", this.z);
        }
        if(this.l.size() > 0) {
            for(Object object0: this.l.keySet()) {
                hashMap0.put("CUSTOM," + ((String)object0), this.z);
            }
        }
    }

    public int v() {
        return this.z;
    }

    private float w(int v) {
        if(v != 100) {
            switch(v) {
                case 303: {
                    return this.B;
                }
                case 304: {
                    return this.L;
                }
                case 305: {
                    return this.M;
                }
                case 306: {
                    return this.N;
                }
                case 307: {
                    return this.C;
                }
                case 308: {
                    return this.E;
                }
                case 309: {
                    return this.F;
                }
                case 310: {
                    return this.D;
                }
                case 311: {
                    return this.J;
                }
                case 312: {
                    return this.K;
                }
                case 313: {
                    return this.G;
                }
                case 314: {
                    return this.H;
                }
                case 315: {
                    return this.O;
                }
                case 316: {
                    return this.I;
                }
                default: {
                    return NaNf;
                }
            }
        }
        return (float)this.h;
    }

    public void x() {
        HashSet hashSet0 = new HashSet();
        this.i(hashSet0);
        System.out.println(" ------------- " + this.h + " -------------");
        String[] arr_s = (String[])hashSet0.toArray(new String[0]);
        for(int v = 0; v < arr_s.length; ++v) {
            System.out.println(arr_s[v] + ":" + this.w(a.a(arr_s[v])));
        }
    }
}

