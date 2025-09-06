package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.Rect;
import androidx.constraintlayout.core.motion.utils.SplineSet.CustomSpline;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.Utils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

class MotionConstrainedPoint implements Comparable {
    int A;
    double[] B;
    double[] C;
    public static final String D = "MotionPaths";
    public static final boolean E = false;
    static final int F = 1;
    static final int G = 2;
    static String[] H;
    private float a;
    int b;
    int c;
    private boolean d;
    private float e;
    private float f;
    private float g;
    public float h;
    private float i;
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;
    private float o;
    private Easing p;
    private int q;
    private float r;
    private float s;
    private float t;
    private float u;
    private float v;
    private float w;
    private float x;
    private int y;
    LinkedHashMap z;

    static {
        MotionConstrainedPoint.H = new String[]{"position", "x", "y", "width", "height", "pathRotate"};
    }

    MotionConstrainedPoint() {
        this.a = 1.0f;
        this.b = 0;
        this.d = false;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 1.0f;
        this.j = 1.0f;
        this.k = NaNf;
        this.l = NaNf;
        this.m = 0.0f;
        this.n = 0.0f;
        this.o = 0.0f;
        this.q = 0;
        this.w = NaNf;
        this.x = NaNf;
        this.y = -1;
        this.z = new LinkedHashMap();
        this.A = 0;
        this.B = new double[18];
        this.C = new double[18];
    }

    public void a(HashMap hashMap0, int v) {
        for(Object object0: hashMap0.keySet()) {
            String s = (String)object0;
            SplineSet splineSet0 = (SplineSet)hashMap0.get(s);
            s.hashCode();
            float f = 1.0f;
            float f1 = 0.0f;
            switch(s) {
                case "alpha": {
                    if(!Float.isNaN(this.a)) {
                        f = this.a;
                    }
                    splineSet0.g(v, f);
                    continue;
                }
                case "pathRotate": {
                    if(!Float.isNaN(this.w)) {
                        f1 = this.w;
                    }
                    break;
                }
                case "pivotX": {
                    if(!Float.isNaN(this.k)) {
                        f1 = this.k;
                    }
                    splineSet0.g(v, f1);
                    continue;
                }
                case "pivotY": {
                    if(!Float.isNaN(this.l)) {
                        f1 = this.l;
                    }
                    splineSet0.g(v, f1);
                    continue;
                }
                case "progress": {
                    if(!Float.isNaN(this.x)) {
                        f1 = this.x;
                    }
                    splineSet0.g(v, f1);
                    continue;
                }
                case "rotationX": {
                    if(!Float.isNaN(this.g)) {
                        f1 = this.g;
                    }
                    splineSet0.g(v, f1);
                    continue;
                }
                case "rotationY": {
                    if(!Float.isNaN(this.h)) {
                        f1 = this.h;
                    }
                    splineSet0.g(v, f1);
                    continue;
                }
                case "rotationZ": {
                    if(!Float.isNaN(this.f)) {
                        f1 = this.f;
                    }
                    splineSet0.g(v, f1);
                    continue;
                }
                case "scaleX": {
                    if(!Float.isNaN(this.i)) {
                        f = this.i;
                    }
                    splineSet0.g(v, f);
                    continue;
                }
                case "scaleY": {
                    if(!Float.isNaN(this.j)) {
                        f = this.j;
                    }
                    splineSet0.g(v, f);
                    continue;
                }
                case "translationX": {
                    if(!Float.isNaN(this.m)) {
                        f1 = this.m;
                    }
                    splineSet0.g(v, f1);
                    continue;
                }
                case "translationY": {
                    if(!Float.isNaN(this.n)) {
                        f1 = this.n;
                    }
                    splineSet0.g(v, f1);
                    continue;
                }
                case "translationZ": {
                    if(!Float.isNaN(this.o)) {
                        f1 = this.o;
                    }
                    splineSet0.g(v, f1);
                    continue;
                }
                default: {
                    if(s.startsWith("CUSTOM")) {
                        String s1 = s.split(",")[1];
                        if(!this.z.containsKey(s1)) {
                            continue;
                        }
                        CustomVariable customVariable0 = (CustomVariable)this.z.get(s1);
                        if(splineSet0 instanceof CustomSpline) {
                            ((CustomSpline)splineSet0).k(v, customVariable0);
                        }
                        else {
                            Utils.f("MotionPaths", s + " ViewSpline not a CustomSet frame = " + v + ", value" + customVariable0.n() + splineSet0);
                        }
                    }
                    else {
                        Utils.f("MotionPaths", "UNKNOWN spline " + s);
                    }
                    continue;
                }
            }
            splineSet0.g(v, f1);
        }
    }

    public void b(MotionWidget motionWidget0) {
        this.c = motionWidget0.B();
        this.a = motionWidget0.B() == 4 ? motionWidget0.g() : 0.0f;
        this.d = false;
        this.f = motionWidget0.t();
        this.g = motionWidget0.r();
        this.h = motionWidget0.s();
        this.i = motionWidget0.u();
        this.j = motionWidget0.v();
        this.k = motionWidget0.o();
        this.l = motionWidget0.p();
        this.m = motionWidget0.x();
        this.n = motionWidget0.y();
        this.o = motionWidget0.z();
        for(Object object0: motionWidget0.j()) {
            String s = (String)object0;
            CustomVariable customVariable0 = motionWidget0.i(s);
            if(customVariable0 != null && customVariable0.q()) {
                this.z.put(s, customVariable0);
            }
        }
    }

    public int c(MotionConstrainedPoint motionConstrainedPoint0) {
        return Float.compare(this.r, motionConstrainedPoint0.r);
    }

    @Override
    public int compareTo(Object object0) {
        return this.c(((MotionConstrainedPoint)object0));
    }

    // 去混淆评级： 低(20)
    private boolean d(float f, float f1) {
        return Float.isNaN(f) || Float.isNaN(f1) ? Float.isNaN(f) != Float.isNaN(f1) : Math.abs(f - f1) > 0.000001f;
    }

    void e(MotionConstrainedPoint motionConstrainedPoint0, HashSet hashSet0) {
        if(this.d(this.a, motionConstrainedPoint0.a)) {
            hashSet0.add("alpha");
        }
        if(this.d(this.e, motionConstrainedPoint0.e)) {
            hashSet0.add("translationZ");
        }
        if(this.c != motionConstrainedPoint0.c && this.b == 0 && (this.c == 4 || motionConstrainedPoint0.c == 4)) {
            hashSet0.add("alpha");
        }
        if(this.d(this.f, motionConstrainedPoint0.f)) {
            hashSet0.add("rotationZ");
        }
        if(!Float.isNaN(this.w) || !Float.isNaN(motionConstrainedPoint0.w)) {
            hashSet0.add("pathRotate");
        }
        if(!Float.isNaN(this.x) || !Float.isNaN(motionConstrainedPoint0.x)) {
            hashSet0.add("progress");
        }
        if(this.d(this.g, motionConstrainedPoint0.g)) {
            hashSet0.add("rotationX");
        }
        if(this.d(this.h, motionConstrainedPoint0.h)) {
            hashSet0.add("rotationY");
        }
        if(this.d(this.k, motionConstrainedPoint0.k)) {
            hashSet0.add("pivotX");
        }
        if(this.d(this.l, motionConstrainedPoint0.l)) {
            hashSet0.add("pivotY");
        }
        if(this.d(this.i, motionConstrainedPoint0.i)) {
            hashSet0.add("scaleX");
        }
        if(this.d(this.j, motionConstrainedPoint0.j)) {
            hashSet0.add("scaleY");
        }
        if(this.d(this.m, motionConstrainedPoint0.m)) {
            hashSet0.add("translationX");
        }
        if(this.d(this.n, motionConstrainedPoint0.n)) {
            hashSet0.add("translationY");
        }
        if(this.d(this.o, motionConstrainedPoint0.o)) {
            hashSet0.add("translationZ");
        }
        if(this.d(this.e, motionConstrainedPoint0.e)) {
            hashSet0.add("elevation");
        }
    }

    void f(MotionConstrainedPoint motionConstrainedPoint0, boolean[] arr_z, String[] arr_s) {
        arr_z[0] |= this.d(this.r, motionConstrainedPoint0.r);
        arr_z[1] |= this.d(this.s, motionConstrainedPoint0.s);
        arr_z[2] |= this.d(this.t, motionConstrainedPoint0.t);
        arr_z[3] |= this.d(this.u, motionConstrainedPoint0.u);
        arr_z[4] |= this.d(this.v, motionConstrainedPoint0.v);
    }

    void g(double[] arr_f, int[] arr_v) {
        float[] arr_f1 = new float[18];
        int v = 0;
        arr_f1[0] = this.r;
        arr_f1[1] = this.s;
        arr_f1[2] = this.t;
        arr_f1[3] = this.u;
        arr_f1[4] = this.v;
        arr_f1[5] = this.a;
        arr_f1[6] = this.e;
        arr_f1[7] = this.f;
        arr_f1[8] = this.g;
        arr_f1[9] = this.h;
        arr_f1[10] = this.i;
        arr_f1[11] = this.j;
        arr_f1[12] = this.k;
        arr_f1[13] = this.l;
        arr_f1[14] = this.m;
        arr_f1[15] = this.n;
        arr_f1[16] = this.o;
        arr_f1[17] = this.w;
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            int v2 = arr_v[v1];
            if(v2 < 18) {
                arr_f[v] = (double)arr_f1[v2];
                ++v;
            }
        }
    }

    int h(String s, double[] arr_f, int v) {
        CustomVariable customVariable0 = (CustomVariable)this.z.get(s);
        if(customVariable0.r() == 1) {
            arr_f[v] = (double)customVariable0.n();
            return 1;
        }
        int v1 = customVariable0.r();
        float[] arr_f1 = new float[v1];
        customVariable0.o(arr_f1);
        int v2 = 0;
        while(v2 < v1) {
            arr_f[v] = (double)arr_f1[v2];
            ++v2;
            ++v;
        }
        return v1;
    }

    int i(String s) {
        return ((CustomVariable)this.z.get(s)).r();
    }

    boolean j(String s) {
        return this.z.containsKey(s);
    }

    void k(float f, float f1, float f2, float f3) {
        this.s = f;
        this.t = f1;
        this.u = f2;
        this.v = f3;
    }

    public void l(MotionWidget motionWidget0) {
        this.k(((float)motionWidget0.E()), ((float)motionWidget0.F()), ((float)motionWidget0.D()), ((float)motionWidget0.k()));
        this.b(motionWidget0);
    }

    public void m(Rect rect0, MotionWidget motionWidget0, int v, float f) {
        this.k(((float)rect0.b), ((float)rect0.d), ((float)rect0.b()), ((float)rect0.a()));
        this.b(motionWidget0);
        this.k = NaNf;
        this.l = NaNf;
        switch(v) {
            case 1: {
                this.f = f - 90.0f;
                return;
            }
            case 2: {
                this.f = f + 90.0f;
            }
        }
    }
}

