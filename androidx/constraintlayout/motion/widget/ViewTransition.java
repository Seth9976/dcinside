package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;
import androidx.constraintlayout.widget.ConstraintSet.Constraint;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.R.id;
import androidx.constraintlayout.widget.R.styleable;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class ViewTransition {
    static class Animate {
        private final int a;
        private final int b;
        long c;
        MotionController d;
        int e;
        int f;
        KeyCache g;
        ViewTransitionController h;
        Interpolator i;
        boolean j;
        float k;
        float l;
        long m;
        Rect n;
        boolean o;

        Animate(ViewTransitionController viewTransitionController0, MotionController motionController0, int v, int v1, int v2, Interpolator interpolator0, int v3, int v4) {
            this.g = new KeyCache();
            this.j = false;
            this.n = new Rect();
            this.o = false;
            this.h = viewTransitionController0;
            this.d = motionController0;
            this.e = v;
            this.f = v1;
            long v5 = System.nanoTime();
            this.c = v5;
            this.m = v5;
            this.h.c(this);
            this.i = interpolator0;
            this.a = v3;
            this.b = v4;
            if(v2 == 3) {
                this.o = true;
            }
            this.l = v == 0 ? 3.402823E+38f : 1.0f / ((float)v);
            this.a();
        }

        void a() {
            if(this.j) {
                this.c();
                return;
            }
            this.b();
        }

        void b() {
            long v = System.nanoTime();
            long v1 = v - this.m;
            this.m = v;
            float f = this.k + ((float)(((double)v1) * 0.000001)) * this.l;
            this.k = f;
            if(f >= 1.0f) {
                this.k = 1.0f;
            }
            float f1 = this.i == null ? this.k : this.i.getInterpolation(this.k);
            boolean z = this.d.L(this.d.b, f1, v, this.g);
            if(this.k >= 1.0f) {
                if(this.a != -1) {
                    this.d.J().setTag(this.a, System.nanoTime());
                }
                if(this.b != -1) {
                    this.d.J().setTag(this.b, null);
                }
                if(!this.o) {
                    this.h.k(this);
                }
            }
            if(this.k < 1.0f || z) {
                this.h.g();
            }
        }

        void c() {
            long v = System.nanoTime();
            long v1 = v - this.m;
            this.m = v;
            float f = this.k - ((float)(((double)v1) * 0.000001)) * this.l;
            this.k = f;
            if(f < 0.0f) {
                this.k = 0.0f;
            }
            float f1 = this.i == null ? this.k : this.i.getInterpolation(this.k);
            boolean z = this.d.L(this.d.b, f1, v, this.g);
            if(this.k <= 0.0f) {
                if(this.a != -1) {
                    this.d.J().setTag(this.a, System.nanoTime());
                }
                if(this.b != -1) {
                    this.d.J().setTag(this.b, null);
                }
                this.h.k(this);
            }
            if(this.k > 0.0f || z) {
                this.h.g();
            }
        }

        public void d(int v, float f, float f1) {
            switch(v) {
                case 1: {
                    if(!this.j) {
                        this.e(true);
                    }
                    return;
                }
                case 2: {
                    this.d.J().getHitRect(this.n);
                    if(!this.n.contains(((int)f), ((int)f1)) && !this.j) {
                        this.e(true);
                    }
                }
            }
        }

        void e(boolean z) {
            this.j = z;
            if(z) {
                int v = this.f;
                if(v != -1) {
                    this.l = v == 0 ? 3.402823E+38f : 1.0f / ((float)v);
                }
            }
            this.h.g();
            this.m = System.nanoTime();
        }
    }

    public static final String A = "ConstraintOverride";
    public static final String B = "CustomAttribute";
    public static final String C = "CustomMethod";
    private static final int D = -1;
    public static final int E = 1;
    public static final int F = 2;
    public static final int G = 3;
    public static final int H = 4;
    public static final int I = 5;
    static final int J = 0;
    static final int K = 1;
    static final int L = 2;
    private static final int M = -1;
    private static final int N = -2;
    static final int O = 0;
    static final int P = 1;
    static final int Q = 2;
    static final int R = 3;
    static final int S = 4;
    static final int T = 5;
    static final int U = 6;
    ConstraintSet a;
    private int b;
    private int c;
    private boolean d;
    private int e;
    int f;
    KeyFrames g;
    Constraint h;
    private int i;
    private int j;
    private int k;
    private String l;
    private int m;
    private String n;
    private int o;
    Context p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private static final String x = "ViewTransition";
    public static final String y = "ViewTransition";
    public static final String z = "KeyFrameSet";

    // This method was un-flattened
    ViewTransition(Context context0, XmlPullParser xmlPullParser0) {
        this.c = -1;
        this.d = false;
        this.e = 0;
        this.i = -1;
        this.j = -1;
        this.m = 0;
        this.n = null;
        this.o = -1;
        this.q = -1;
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = -1;
        this.p = context0;
        try {
            for(int v = xmlPullParser0.getEventType(); true; v = xmlPullParser0.next()) {
                if(v == 1) {
                    return;
                }
                switch(v) {
                    case 2: {
                        String s = xmlPullParser0.getName();
                        switch(s) {
                            case "ConstraintOverride": {
                                this.h = ConstraintSet.w(context0, xmlPullParser0);
                                break;
                            }
                            case "CustomAttribute": {
                                ConstraintAttribute.q(context0, xmlPullParser0, this.h.g);
                                break;
                            }
                            case "CustomMethod": {
                                ConstraintAttribute.q(context0, xmlPullParser0, this.h.g);
                                break;
                            }
                            case "KeyFrameSet": {
                                this.g = new KeyFrames(context0, xmlPullParser0);
                                break;
                            }
                            case "ViewTransition": {
                                this.n(context0, xmlPullParser0);
                                break;
                            }
                            default: {
                                Log.e("ViewTransition", ".(null:-1) <init>() unknown tag " + s);
                                Log.e("ViewTransition", ".xml:" + xmlPullParser0.getLineNumber());
                            }
                        }
                        break;
                    }
                    case 3: {
                        if("ViewTransition".equals(xmlPullParser0.getName())) {
                            return;
                        }
                    }
                }
            }
        }
        catch(XmlPullParserException xmlPullParserException0) {
        }
        catch(IOException iOException0) {
            Log.e("ViewTransition", "Error parsing XML resource", iOException0);
            return;
        }
        Log.e("ViewTransition", "Error parsing XML resource", xmlPullParserException0);
    }

    void b(ViewTransitionController viewTransitionController0, MotionLayout motionLayout0, View view0) {
        MotionController motionController0 = new MotionController(view0);
        motionController0.R(view0);
        this.g.a(motionController0);
        motionController0.a0(motionLayout0.getWidth(), motionLayout0.getHeight(), ((float)this.i), System.nanoTime());
        new Animate(viewTransitionController0, motionController0, this.i, this.j, this.c, this.f(motionLayout0.getContext()), this.q, this.r);
    }

    void c(ViewTransitionController viewTransitionController0, MotionLayout motionLayout0, int v, ConstraintSet constraintSet0, View[] arr_view) {
        if(this.d) {
            return;
        }
        int v1 = this.f;
        if(v1 == 2) {
            this.b(viewTransitionController0, motionLayout0, arr_view[0]);
            return;
        }
        if(v1 == 1) {
            int[] arr_v = motionLayout0.getConstraintSetIds();
            for(int v3 = 0; v3 < arr_v.length; ++v3) {
                int v4 = arr_v[v3];
                if(v4 != v) {
                    ConstraintSet constraintSet1 = motionLayout0.u0(v4);
                    for(int v5 = 0; v5 < arr_view.length; ++v5) {
                        Constraint constraintSet$Constraint0 = constraintSet1.k0(arr_view[v5].getId());
                        Constraint constraintSet$Constraint1 = this.h;
                        if(constraintSet$Constraint1 != null) {
                            constraintSet$Constraint1.h(constraintSet$Constraint0);
                            constraintSet$Constraint0.g.putAll(this.h.g);
                        }
                    }
                }
            }
        }
        ConstraintSet constraintSet2 = new ConstraintSet();
        constraintSet2.I(constraintSet0);
        for(int v6 = 0; v6 < arr_view.length; ++v6) {
            Constraint constraintSet$Constraint2 = constraintSet2.k0(arr_view[v6].getId());
            Constraint constraintSet$Constraint3 = this.h;
            if(constraintSet$Constraint3 != null) {
                constraintSet$Constraint3.h(constraintSet$Constraint2);
                constraintSet$Constraint2.g.putAll(this.h.g);
            }
        }
        motionLayout0.f1(v, constraintSet2);
        motionLayout0.f1(id.view_transition, constraintSet0);
        motionLayout0.setState(id.view_transition, -1, -1);
        Transition motionScene$Transition0 = new Transition(-1, motionLayout0.a, id.view_transition, v);
        for(int v2 = 0; v2 < arr_view.length; ++v2) {
            this.v(motionScene$Transition0, arr_view[v2]);
        }
        motionLayout0.setTransition(motionScene$Transition0);
        motionLayout0.X0(() -> {
            if(this.q != -1) {
                for(int v1 = 0; v1 < arr_view.length; ++v1) {
                    arr_view[v1].setTag(this.q, System.nanoTime());
                }
            }
            if(this.r != -1) {
                for(int v = 0; v < arr_view.length; ++v) {
                    arr_view[v].setTag(this.r, null);
                }
            }
        });
    }

    boolean d(View view0) {
        boolean z;
        int v = this.s;
        if(v == -1) {
            z = true;
        }
        else if(view0.getTag(v) == null) {
            z = false;
        }
        else {
            z = true;
        }
        int v1 = this.t;
        if(v1 == -1) {
            return z;
        }
        return view0.getTag(v1) == null ? z : false;
    }

    int e() {
        return this.b;
    }

    Interpolator f(Context context0) {
        int v = this.m;
        if(v != -2) {
            switch(v) {
                case -1: {
                    return new Interpolator() {
                        final ViewTransition b;

                        @Override  // android.animation.TimeInterpolator
                        public float getInterpolation(float f) {
                            return (float)Easing.c(this.n).a(((double)f));
                        }
                    };
                }
                case 0: {
                    return new AccelerateDecelerateInterpolator();
                }
                case 1: {
                    return new AccelerateInterpolator();
                }
                case 2: {
                    return new DecelerateInterpolator();
                }
                case 4: {
                    return new BounceInterpolator();
                }
                case 5: {
                    return new OvershootInterpolator();
                }
                case 6: {
                    return new AnticipateInterpolator();
                }
                default: {
                    return null;
                }
            }
        }
        return AnimationUtils.loadInterpolator(context0, this.o);
    }

    public int g() {
        return this.u;
    }

    public int h() {
        return this.w;
    }

    public int i() {
        return this.v;
    }

    public int j() {
        return this.c;
    }

    boolean k() {
        return !this.d;
    }

    // 检测为 Lambda 实现
    private void l(View[] arr_view) [...]

    boolean m(View view0) {
        if(view0 == null) {
            return false;
        }
        if(this.k == -1 && this.l == null) {
            return false;
        }
        if(!this.d(view0)) {
            return false;
        }
        if(view0.getId() == this.k) {
            return true;
        }
        if(this.l == null) {
            return false;
        }
        if(view0.getLayoutParams() instanceof LayoutParams) {
            String s = ((LayoutParams)view0.getLayoutParams()).c0;
            return s != null && s.matches(this.l);
        }
        return false;
    }

    private void n(Context context0, XmlPullParser xmlPullParser0) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser0), styleable.ViewTransition);
        int v = typedArray0.getIndexCount();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = typedArray0.getIndex(v1);
            if(v2 == styleable.ViewTransition_android_id) {
                this.b = typedArray0.getResourceId(v2, this.b);
            }
            else if(v2 != styleable.ViewTransition_motionTarget) {
                if(v2 == styleable.ViewTransition_onStateTransition) {
                    this.c = typedArray0.getInt(v2, this.c);
                }
                else if(v2 == styleable.ViewTransition_transitionDisable) {
                    this.d = typedArray0.getBoolean(v2, this.d);
                }
                else if(v2 == styleable.ViewTransition_pathMotionArc) {
                    this.e = typedArray0.getInt(v2, this.e);
                }
                else if(v2 == styleable.ViewTransition_duration) {
                    this.i = typedArray0.getInt(v2, this.i);
                }
                else if(v2 == styleable.ViewTransition_upDuration) {
                    this.j = typedArray0.getInt(v2, this.j);
                }
                else if(v2 == styleable.ViewTransition_viewTransitionMode) {
                    this.f = typedArray0.getInt(v2, this.f);
                }
                else if(v2 == styleable.ViewTransition_motionInterpolator) {
                    int v4 = typedArray0.peekValue(v2).type;
                    if(v4 == 1) {
                        int v5 = typedArray0.getResourceId(v2, -1);
                        this.o = v5;
                        if(v5 != -1) {
                            this.m = -2;
                        }
                    }
                    else if(v4 == 3) {
                        String s = typedArray0.getString(v2);
                        this.n = s;
                        if(s == null || s.indexOf("/") <= 0) {
                            this.m = -1;
                        }
                        else {
                            this.o = typedArray0.getResourceId(v2, -1);
                            this.m = -2;
                        }
                    }
                    else {
                        this.m = typedArray0.getInteger(v2, this.m);
                    }
                }
                else if(v2 == styleable.ViewTransition_setsTag) {
                    this.q = typedArray0.getResourceId(v2, this.q);
                }
                else if(v2 == styleable.ViewTransition_clearsTag) {
                    this.r = typedArray0.getResourceId(v2, this.r);
                }
                else if(v2 == styleable.ViewTransition_ifTagSet) {
                    this.s = typedArray0.getResourceId(v2, this.s);
                }
                else if(v2 == styleable.ViewTransition_ifTagNotSet) {
                    this.t = typedArray0.getResourceId(v2, this.t);
                }
                else if(v2 == styleable.ViewTransition_SharedValueId) {
                    this.v = typedArray0.getResourceId(v2, this.v);
                }
                else if(v2 == styleable.ViewTransition_SharedValue) {
                    this.u = typedArray0.getInteger(v2, this.u);
                }
            }
            else if(MotionLayout.G9) {
                int v3 = typedArray0.getResourceId(v2, this.k);
                this.k = v3;
                if(v3 == -1) {
                    this.l = typedArray0.getString(v2);
                }
            }
            else if(typedArray0.peekValue(v2).type == 3) {
                this.l = typedArray0.getString(v2);
            }
            else {
                this.k = typedArray0.getResourceId(v2, this.k);
            }
        }
        typedArray0.recycle();
    }

    void o(boolean z) {
        this.d = !z;
    }

    void p(int v) {
        this.b = v;
    }

    public void q(int v) {
        this.u = v;
    }

    public void r(int v) {
        this.w = v;
    }

    public void s(int v) {
        this.v = v;
    }

    public void t(int v) {
        this.c = v;
    }

    @Override
    public String toString() {
        return "ViewTransition(" + Debug.i(this.p, this.b) + ")";
    }

    boolean u(int v) {
        int v1 = this.c;
        if(v1 == 1) {
            return v == 0;
        }
        switch(v1) {
            case 2: {
                return v == 1;
            }
            case 3: {
                return v == 0;
            }
            default: {
                return false;
            }
        }
    }

    private void v(Transition motionScene$Transition0, View view0) {
        int v = this.i;
        if(v != -1) {
            motionScene$Transition0.O(v);
        }
        motionScene$Transition0.U(this.e);
        motionScene$Transition0.Q(this.m, this.n, this.o);
        int v1 = view0.getId();
        KeyFrames keyFrames0 = this.g;
        if(keyFrames0 != null) {
            ArrayList arrayList0 = keyFrames0.d(-1);
            KeyFrames keyFrames1 = new KeyFrames();
            for(Object object0: arrayList0) {
                keyFrames1.c(((Key)object0).b().k(v1));
            }
            motionScene$Transition0.t(keyFrames1);
        }
    }
}

