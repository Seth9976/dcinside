package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.motion.utils.ViewSpline.CustomSet;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintSet.Constraint;
import androidx.constraintlayout.widget.ConstraintSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

class MotionConstrainedPoint implements Comparable {
    private float A;
    private float B;
    private int C;
    public static final String D = "MotionPaths";
    public static final boolean E = false;
    static final int F = 1;
    static final int G = 2;
    static String[] H;
    public float a;
    int b;
    int c;
    LinkedHashMap d;
    int e;
    double[] f;
    double[] g;
    private float h;
    private boolean i;
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;
    private float o;
    private float p;
    private float q;
    private float r;
    private float s;
    private Easing t;
    private int u;
    private float v;
    private float w;
    private float x;
    private float y;
    private float z;

    static {
        MotionConstrainedPoint.H = new String[]{"position", "x", "y", "width", "height", "pathRotate"};
    }

    MotionConstrainedPoint() {
        this.a = 0.0f;
        this.b = 0;
        this.d = new LinkedHashMap();
        this.e = 0;
        this.f = new double[18];
        this.g = new double[18];
        this.h = 1.0f;
        this.i = false;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 0.0f;
        this.m = 1.0f;
        this.n = 1.0f;
        this.o = NaNf;
        this.p = NaNf;
        this.q = 0.0f;
        this.r = 0.0f;
        this.s = 0.0f;
        this.u = 0;
        this.A = NaNf;
        this.B = NaNf;
        this.C = -1;
    }

    public void a(HashMap hashMap0, int v) {
        for(Object object0: hashMap0.keySet()) {
            String s = (String)object0;
            ViewSpline viewSpline0 = (ViewSpline)hashMap0.get(s);
            if(viewSpline0 != null) {
                s.hashCode();
                float f = 1.0f;
                float f1 = 0.0f;
                switch(s) {
                    case "alpha": {
                        if(!Float.isNaN(this.h)) {
                            f = this.h;
                        }
                        break;
                    }
                    case "elevation": {
                        if(!Float.isNaN(this.j)) {
                            f1 = this.j;
                        }
                        viewSpline0.g(v, f1);
                        continue;
                    }
                    case "progress": {
                        if(!Float.isNaN(this.B)) {
                            f1 = this.B;
                        }
                        viewSpline0.g(v, f1);
                        continue;
                    }
                    case "rotation": {
                        if(!Float.isNaN(this.k)) {
                            f1 = this.k;
                        }
                        viewSpline0.g(v, f1);
                        continue;
                    }
                    case "rotationX": {
                        if(!Float.isNaN(this.l)) {
                            f1 = this.l;
                        }
                        viewSpline0.g(v, f1);
                        continue;
                    }
                    case "rotationY": {
                        if(!Float.isNaN(this.a)) {
                            f1 = this.a;
                        }
                        viewSpline0.g(v, f1);
                        continue;
                    }
                    case "scaleX": {
                        if(!Float.isNaN(this.m)) {
                            f = this.m;
                        }
                        viewSpline0.g(v, f);
                        continue;
                    }
                    case "scaleY": {
                        if(!Float.isNaN(this.n)) {
                            f = this.n;
                        }
                        viewSpline0.g(v, f);
                        continue;
                    }
                    case "transformPivotX": {
                        if(!Float.isNaN(this.o)) {
                            f1 = this.o;
                        }
                        viewSpline0.g(v, f1);
                        continue;
                    }
                    case "transformPivotY": {
                        if(!Float.isNaN(this.p)) {
                            f1 = this.p;
                        }
                        viewSpline0.g(v, f1);
                        continue;
                    }
                    case "transitionPathRotate": {
                        if(!Float.isNaN(this.A)) {
                            f1 = this.A;
                        }
                        viewSpline0.g(v, f1);
                        continue;
                    }
                    case "translationX": {
                        if(!Float.isNaN(this.q)) {
                            f1 = this.q;
                        }
                        viewSpline0.g(v, f1);
                        continue;
                    }
                    case "translationY": {
                        if(!Float.isNaN(this.r)) {
                            f1 = this.r;
                        }
                        viewSpline0.g(v, f1);
                        continue;
                    }
                    case "translationZ": {
                        if(!Float.isNaN(this.s)) {
                            f1 = this.s;
                        }
                        viewSpline0.g(v, f1);
                        continue;
                    }
                    default: {
                        if(s.startsWith("CUSTOM")) {
                            String s1 = s.split(",")[1];
                            if(!this.d.containsKey(s1)) {
                                continue;
                            }
                            ConstraintAttribute constraintAttribute0 = (ConstraintAttribute)this.d.get(s1);
                            if(viewSpline0 instanceof CustomSet) {
                                ((CustomSet)viewSpline0).n(v, constraintAttribute0);
                            }
                            else {
                                Log.e("MotionPaths", s + " ViewSpline not a CustomSet frame = " + v + ", value" + constraintAttribute0.k() + viewSpline0);
                            }
                        }
                        else {
                            Log.e("MotionPaths", "UNKNOWN spline " + s);
                        }
                        continue;
                    }
                }
                viewSpline0.g(v, f);
            }
        }
    }

    public void b(View view0) {
        this.c = view0.getVisibility();
        this.h = view0.getVisibility() == 0 ? view0.getAlpha() : 0.0f;
        this.i = false;
        this.j = view0.getElevation();
        this.k = view0.getRotation();
        this.l = view0.getRotationX();
        this.a = view0.getRotationY();
        this.m = view0.getScaleX();
        this.n = view0.getScaleY();
        this.o = view0.getPivotX();
        this.p = view0.getPivotY();
        this.q = view0.getTranslationX();
        this.r = view0.getTranslationY();
        this.s = view0.getTranslationZ();
    }

    public void c(Constraint constraintSet$Constraint0) {
        int v = constraintSet$Constraint0.c.c;
        this.b = v;
        this.c = constraintSet$Constraint0.c.b;
        this.h = constraintSet$Constraint0.c.b == 0 || v != 0 ? constraintSet$Constraint0.c.d : 0.0f;
        this.i = constraintSet$Constraint0.f.m;
        this.j = constraintSet$Constraint0.f.n;
        this.k = constraintSet$Constraint0.f.b;
        this.l = constraintSet$Constraint0.f.c;
        this.a = constraintSet$Constraint0.f.d;
        this.m = constraintSet$Constraint0.f.e;
        this.n = constraintSet$Constraint0.f.f;
        this.o = constraintSet$Constraint0.f.g;
        this.p = constraintSet$Constraint0.f.h;
        this.q = constraintSet$Constraint0.f.j;
        this.r = constraintSet$Constraint0.f.k;
        this.s = constraintSet$Constraint0.f.l;
        this.t = Easing.c(constraintSet$Constraint0.d.d);
        this.A = constraintSet$Constraint0.d.i;
        this.u = constraintSet$Constraint0.d.f;
        this.C = constraintSet$Constraint0.d.b;
        this.B = constraintSet$Constraint0.c.e;
        for(Object object0: constraintSet$Constraint0.g.keySet()) {
            String s = (String)object0;
            ConstraintAttribute constraintAttribute0 = (ConstraintAttribute)constraintSet$Constraint0.g.get(s);
            if(constraintAttribute0.n()) {
                this.d.put(s, constraintAttribute0);
            }
        }
    }

    @Override
    public int compareTo(Object object0) {
        return this.d(((MotionConstrainedPoint)object0));
    }

    public int d(MotionConstrainedPoint motionConstrainedPoint0) {
        return Float.compare(this.v, motionConstrainedPoint0.v);
    }

    // 去混淆评级： 低(20)
    private boolean e(float f, float f1) {
        return Float.isNaN(f) || Float.isNaN(f1) ? Float.isNaN(f) != Float.isNaN(f1) : Math.abs(f - f1) > 0.000001f;
    }

    void f(MotionConstrainedPoint motionConstrainedPoint0, HashSet hashSet0) {
        if(this.e(this.h, motionConstrainedPoint0.h)) {
            hashSet0.add("alpha");
        }
        if(this.e(this.j, motionConstrainedPoint0.j)) {
            hashSet0.add("elevation");
        }
        if(this.c != motionConstrainedPoint0.c && this.b == 0 && (this.c == 0 || motionConstrainedPoint0.c == 0)) {
            hashSet0.add("alpha");
        }
        if(this.e(this.k, motionConstrainedPoint0.k)) {
            hashSet0.add("rotation");
        }
        if(!Float.isNaN(this.A) || !Float.isNaN(motionConstrainedPoint0.A)) {
            hashSet0.add("transitionPathRotate");
        }
        if(!Float.isNaN(this.B) || !Float.isNaN(motionConstrainedPoint0.B)) {
            hashSet0.add("progress");
        }
        if(this.e(this.l, motionConstrainedPoint0.l)) {
            hashSet0.add("rotationX");
        }
        if(this.e(this.a, motionConstrainedPoint0.a)) {
            hashSet0.add("rotationY");
        }
        if(this.e(this.o, motionConstrainedPoint0.o)) {
            hashSet0.add("transformPivotX");
        }
        if(this.e(this.p, motionConstrainedPoint0.p)) {
            hashSet0.add("transformPivotY");
        }
        if(this.e(this.m, motionConstrainedPoint0.m)) {
            hashSet0.add("scaleX");
        }
        if(this.e(this.n, motionConstrainedPoint0.n)) {
            hashSet0.add("scaleY");
        }
        if(this.e(this.q, motionConstrainedPoint0.q)) {
            hashSet0.add("translationX");
        }
        if(this.e(this.r, motionConstrainedPoint0.r)) {
            hashSet0.add("translationY");
        }
        if(this.e(this.s, motionConstrainedPoint0.s)) {
            hashSet0.add("translationZ");
        }
    }

    void g(MotionConstrainedPoint motionConstrainedPoint0, boolean[] arr_z, String[] arr_s) {
        arr_z[0] |= this.e(this.v, motionConstrainedPoint0.v);
        arr_z[1] |= this.e(this.w, motionConstrainedPoint0.w);
        arr_z[2] |= this.e(this.x, motionConstrainedPoint0.x);
        arr_z[3] |= this.e(this.y, motionConstrainedPoint0.y);
        arr_z[4] |= this.e(this.z, motionConstrainedPoint0.z);
    }

    void h(double[] arr_f, int[] arr_v) {
        float[] arr_f1 = new float[18];
        int v = 0;
        arr_f1[0] = this.v;
        arr_f1[1] = this.w;
        arr_f1[2] = this.x;
        arr_f1[3] = this.y;
        arr_f1[4] = this.z;
        arr_f1[5] = this.h;
        arr_f1[6] = this.j;
        arr_f1[7] = this.k;
        arr_f1[8] = this.l;
        arr_f1[9] = this.a;
        arr_f1[10] = this.m;
        arr_f1[11] = this.n;
        arr_f1[12] = this.o;
        arr_f1[13] = this.p;
        arr_f1[14] = this.q;
        arr_f1[15] = this.r;
        arr_f1[16] = this.s;
        arr_f1[17] = this.A;
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            int v2 = arr_v[v1];
            if(v2 < 18) {
                arr_f[v] = (double)arr_f1[v2];
                ++v;
            }
        }
    }

    int i(String s, double[] arr_f, int v) {
        ConstraintAttribute constraintAttribute0 = (ConstraintAttribute)this.d.get(s);
        if(constraintAttribute0.p() == 1) {
            arr_f[v] = (double)constraintAttribute0.k();
            return 1;
        }
        int v1 = constraintAttribute0.p();
        float[] arr_f1 = new float[v1];
        constraintAttribute0.l(arr_f1);
        int v2 = 0;
        while(v2 < v1) {
            arr_f[v] = (double)arr_f1[v2];
            ++v2;
            ++v;
        }
        return v1;
    }

    int j(String s) {
        return ((ConstraintAttribute)this.d.get(s)).p();
    }

    boolean k(String s) {
        return this.d.containsKey(s);
    }

    void l(float f, float f1, float f2, float f3) {
        this.w = f;
        this.x = f1;
        this.y = f2;
        this.z = f3;
    }

    public void m(Rect rect0, View view0, int v, float f) {
        this.l(((float)rect0.left), ((float)rect0.top), ((float)rect0.width()), ((float)rect0.height()));
        this.b(view0);
        this.o = NaNf;
        this.p = NaNf;
        switch(v) {
            case 1: {
                this.k = f - 90.0f;
                return;
            }
            case 2: {
                this.k = f + 90.0f;
            }
        }
    }

    public void n(Rect rect0, ConstraintSet constraintSet0, int v, int v1) {
        this.l(((float)rect0.left), ((float)rect0.top), ((float)rect0.width()), ((float)rect0.height()));
        this.c(constraintSet0.q0(v1));
        switch(v) {
            case 1: 
            case 3: {
                this.k -= 90.0f;
                return;
            }
            case 2: 
            case 4: {
                float f = this.k + 90.0f;
                this.k = f;
                if(f > 180.0f) {
                    this.k = f - 360.0f;
                }
            }
        }
    }

    public void p(View view0) {
        this.l(view0.getX(), view0.getY(), ((float)view0.getWidth()), ((float)view0.getHeight()));
        this.b(view0);
    }
}

