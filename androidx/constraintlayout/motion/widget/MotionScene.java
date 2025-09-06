package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
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
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.R.id;
import androidx.constraintlayout.widget.R.styleable;
import androidx.constraintlayout.widget.StateSet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class MotionScene {
    public static class Transition {
        public static class TransitionOnClick implements View.OnClickListener {
            private final Transition a;
            int b;
            int c;
            public static final int d = 1;
            public static final int e = 17;
            public static final int f = 16;
            public static final int g = 0x100;
            public static final int h = 0x1000;

            public TransitionOnClick(Context context0, Transition motionScene$Transition0, XmlPullParser xmlPullParser0) {
                this.b = -1;
                this.c = 17;
                this.a = motionScene$Transition0;
                TypedArray typedArray0 = context0.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser0), styleable.OnClick);
                int v = typedArray0.getIndexCount();
                for(int v1 = 0; v1 < v; ++v1) {
                    int v2 = typedArray0.getIndex(v1);
                    if(v2 == styleable.OnClick_targetId) {
                        this.b = typedArray0.getResourceId(v2, this.b);
                    }
                    else if(v2 == styleable.OnClick_clickAction) {
                        this.c = typedArray0.getInt(v2, this.c);
                    }
                }
                typedArray0.recycle();
            }

            public TransitionOnClick(Transition motionScene$Transition0, int v, int v1) {
                this.a = motionScene$Transition0;
                this.b = v;
                this.c = v1;
            }

            public void a(MotionLayout motionLayout0, int v, Transition motionScene$Transition0) {
                int v1 = this.b;
                if(v1 != -1) {
                    motionLayout0 = motionLayout0.findViewById(v1);
                }
                if(motionLayout0 == null) {
                    Log.e("MotionScene", "OnClick could not find id " + this.b);
                    return;
                }
                int v2 = motionScene$Transition0.d;
                int v3 = motionScene$Transition0.c;
                if(v2 == -1) {
                    motionLayout0.setOnClickListener(this);
                    return;
                }
                if((((this.c & 1) == 0 || v != v2 ? 0 : 1) | ((this.c & 0x100) == 0 || v != v2 ? 0 : 1) | ((this.c & 16) == 0 || v != v3 ? 0 : 1) | ((this.c & 0x1000) == 0 || v != v3 ? 0 : 1)) != 0) {
                    motionLayout0.setOnClickListener(this);
                }
            }

            boolean b(Transition motionScene$Transition0, MotionLayout motionLayout0) {
                Transition motionScene$Transition1 = this.a;
                if(motionScene$Transition1 == motionScene$Transition0) {
                    return true;
                }
                int v = motionScene$Transition1.c;
                int v1 = this.a.d;
                return v1 == -1 ? motionLayout0.f != v : motionLayout0.f == v1 || motionLayout0.f == v;
            }

            public void c(MotionLayout motionLayout0) {
                int v = this.b;
                if(v == -1) {
                    return;
                }
                View view0 = motionLayout0.findViewById(v);
                if(view0 == null) {
                    Log.e("MotionScene", " (*)  could not find id " + this.b);
                    return;
                }
                view0.setOnClickListener(null);
            }

            @Override  // android.view.View$OnClickListener
            public void onClick(View view0) {
                MotionLayout motionLayout0 = this.a.j.a;
                if(!motionLayout0.E0()) {
                    return;
                }
                if(this.a.d == -1) {
                    int v = motionLayout0.getCurrentState();
                    if(v == -1) {
                        motionLayout0.a1(this.a.c);
                        return;
                    }
                    Transition motionScene$Transition0 = new Transition(this.a.j, this.a);
                    motionScene$Transition0.d = v;
                    motionScene$Transition0.c = this.a.c;
                    motionLayout0.setTransition(motionScene$Transition0);
                    motionLayout0.W0();
                    return;
                }
                Transition motionScene$Transition1 = this.a.j.c;
                int v1 = 0;
                int v2 = (this.c & 1) != 0 || (this.c & 0x100) != 0 ? 1 : 0;
                boolean z = (this.c & 16) != 0 || (this.c & 0x1000) != 0;
                if(v2 == 0 || !z) {
                    v1 = v2;
                }
                else {
                    Transition motionScene$Transition2 = this.a;
                    if(this.a.j.c != motionScene$Transition2) {
                        motionLayout0.setTransition(motionScene$Transition2);
                    }
                    if(motionLayout0.getCurrentState() != motionLayout0.getEndState() && motionLayout0.getProgress() <= 0.5f) {
                        v1 = v2;
                        z = false;
                    }
                }
                if(this.b(motionScene$Transition1, motionLayout0)) {
                    if(v1 != 0 && (this.c & 1) != 0) {
                        motionLayout0.setTransition(this.a);
                        motionLayout0.W0();
                        return;
                    }
                    if(z && (this.c & 16) != 0) {
                        motionLayout0.setTransition(this.a);
                        motionLayout0.Y0();
                        return;
                    }
                    if(v1 != 0 && (this.c & 0x100) != 0) {
                        motionLayout0.setTransition(this.a);
                        motionLayout0.setProgress(1.0f);
                        return;
                    }
                    if(z && (this.c & 0x1000) != 0) {
                        motionLayout0.setTransition(this.a);
                        motionLayout0.setProgress(0.0f);
                    }
                }
            }
        }

        public static final int A = -2;
        public static final int B = -1;
        public static final int C = 0;
        public static final int D = 1;
        public static final int E = 2;
        public static final int F = 3;
        public static final int G = 4;
        public static final int H = 5;
        public static final int I = 6;
        private int a;
        private boolean b;
        private int c;
        private int d;
        private int e;
        private String f;
        private int g;
        private int h;
        private float i;
        private final MotionScene j;
        private ArrayList k;
        private TouchResponse l;
        private ArrayList m;
        private int n;
        private boolean o;
        private int p;
        private int q;
        private int r;
        public static final int s = 0;
        public static final int t = 1;
        public static final int u = 2;
        public static final int v = 3;
        public static final int w = 4;
        static final int x = 1;
        static final int y = 2;
        static final int z = 4;

        public Transition(int v, MotionScene motionScene0, int v1, int v2) {
            this.a = -1;
            this.b = false;
            this.c = -1;
            this.d = -1;
            this.e = 0;
            this.f = null;
            this.g = -1;
            this.h = 400;
            this.i = 0.0f;
            this.k = new ArrayList();
            this.l = null;
            this.m = new ArrayList();
            this.n = 0;
            this.o = false;
            this.p = -1;
            this.r = 0;
            this.a = v;
            this.j = motionScene0;
            this.d = v1;
            this.c = v2;
            this.h = motionScene0.k;
            this.q = motionScene0.l;
        }

        Transition(MotionScene motionScene0, Context context0, XmlPullParser xmlPullParser0) {
            this.a = -1;
            this.b = false;
            this.c = -1;
            this.d = -1;
            this.e = 0;
            this.f = null;
            this.g = -1;
            this.h = 400;
            this.i = 0.0f;
            this.k = new ArrayList();
            this.l = null;
            this.m = new ArrayList();
            this.n = 0;
            this.o = false;
            this.p = -1;
            this.r = 0;
            this.h = motionScene0.k;
            this.q = motionScene0.l;
            this.j = motionScene0;
            this.y(motionScene0, context0, Xml.asAttributeSet(xmlPullParser0));
        }

        Transition(MotionScene motionScene0, Transition motionScene$Transition0) {
            this.a = -1;
            this.b = false;
            this.c = -1;
            this.d = -1;
            this.e = 0;
            this.f = null;
            this.g = -1;
            this.h = 400;
            this.i = 0.0f;
            this.k = new ArrayList();
            this.l = null;
            this.m = new ArrayList();
            this.n = 0;
            this.o = false;
            this.p = -1;
            this.q = 0;
            this.r = 0;
            this.j = motionScene0;
            this.h = motionScene0.k;
            if(motionScene$Transition0 != null) {
                this.p = motionScene$Transition0.p;
                this.e = motionScene$Transition0.e;
                this.f = motionScene$Transition0.f;
                this.g = motionScene$Transition0.g;
                this.h = motionScene$Transition0.h;
                this.k = motionScene$Transition0.k;
                this.i = motionScene$Transition0.i;
                this.q = motionScene$Transition0.q;
            }
        }

        public int A() {
            return this.h;
        }

        public int B() {
            return this.c;
        }

        public int C() {
            return this.a;
        }

        public List D() {
            return this.k;
        }

        public int E() {
            return this.q;
        }

        public List F() {
            return this.m;
        }

        public int G() {
            return this.p;
        }

        public float H() {
            return this.i;
        }

        public int I() {
            return this.d;
        }

        public TouchResponse J() {
            return this.l;
        }

        public boolean K() {
            return !this.o;
        }

        public boolean L(int v) {
            return (v & this.r) != 0;
        }

        public void M(int v) {
            TransitionOnClick motionScene$Transition$TransitionOnClick0 = null;
            for(Object object0: this.m) {
                TransitionOnClick motionScene$Transition$TransitionOnClick1 = (TransitionOnClick)object0;
                if(motionScene$Transition$TransitionOnClick1.b == v) {
                    motionScene$Transition$TransitionOnClick0 = motionScene$Transition$TransitionOnClick1;
                    break;
                }
            }
            if(motionScene$Transition$TransitionOnClick0 != null) {
                this.m.remove(motionScene$Transition$TransitionOnClick0);
            }
        }

        public void N(int v) {
            this.n = v;
        }

        public void O(int v) {
            this.h = Math.max(v, 8);
        }

        public void P(boolean z) {
            this.o = !z;
        }

        public void Q(int v, String s, int v1) {
            this.e = v;
            this.f = s;
            this.g = v1;
        }

        public void R(int v) {
            this.q = v;
        }

        public void S(OnSwipe onSwipe0) {
            this.l = onSwipe0 == null ? null : new TouchResponse(this.j.a, onSwipe0);
        }

        public void T(int v) {
            TouchResponse touchResponse0 = this.J();
            if(touchResponse0 != null) {
                touchResponse0.F(v);
            }
        }

        public void U(int v) {
            this.p = v;
        }

        public void V(float f) {
            this.i = f;
        }

        public void W(int v) {
            this.r = v;
        }

        public void t(KeyFrames keyFrames0) {
            this.k.add(keyFrames0);
        }

        public void u(int v, int v1) {
            for(Object object0: this.m) {
                TransitionOnClick motionScene$Transition$TransitionOnClick0 = (TransitionOnClick)object0;
                if(motionScene$Transition$TransitionOnClick0.b == v) {
                    motionScene$Transition$TransitionOnClick0.c = v1;
                    return;
                }
                if(false) {
                    break;
                }
            }
            TransitionOnClick motionScene$Transition$TransitionOnClick1 = new TransitionOnClick(this, v, v1);
            this.m.add(motionScene$Transition$TransitionOnClick1);
        }

        public void v(Context context0, XmlPullParser xmlPullParser0) {
            this.m.add(new TransitionOnClick(context0, this, xmlPullParser0));
        }

        public String w(Context context0) {
            String s = this.d == -1 ? "null" : context0.getResources().getResourceEntryName(this.d);
            return this.c == -1 ? s + " -> null" : s + " -> " + context0.getResources().getResourceEntryName(this.c);
        }

        private void x(MotionScene motionScene0, Context context0, TypedArray typedArray0) {
            int v = typedArray0.getIndexCount();
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = typedArray0.getIndex(v1);
                if(v2 == styleable.Transition_constraintSetEnd) {
                    this.c = typedArray0.getResourceId(v2, -1);
                    String s = context0.getResources().getResourceTypeName(this.c);
                    if("layout".equals(s)) {
                        ConstraintSet constraintSet0 = new ConstraintSet();
                        constraintSet0.y0(context0, this.c);
                        motionScene0.h.append(this.c, constraintSet0);
                    }
                    else if("xml".equals(s)) {
                        this.c = motionScene0.b0(context0, this.c);
                    }
                }
                else if(v2 == styleable.Transition_constraintSetStart) {
                    this.d = typedArray0.getResourceId(v2, this.d);
                    String s1 = context0.getResources().getResourceTypeName(this.d);
                    if("layout".equals(s1)) {
                        ConstraintSet constraintSet1 = new ConstraintSet();
                        constraintSet1.y0(context0, this.d);
                        motionScene0.h.append(this.d, constraintSet1);
                    }
                    else if("xml".equals(s1)) {
                        this.d = motionScene0.b0(context0, this.d);
                    }
                }
                else if(v2 == styleable.Transition_motionInterpolator) {
                    int v3 = typedArray0.peekValue(v2).type;
                    if(v3 == 1) {
                        int v4 = typedArray0.getResourceId(v2, -1);
                        this.g = v4;
                        if(v4 != -1) {
                            this.e = -2;
                        }
                    }
                    else if(v3 == 3) {
                        String s2 = typedArray0.getString(v2);
                        this.f = s2;
                        if(s2 != null) {
                            if(s2.indexOf("/") > 0) {
                                this.g = typedArray0.getResourceId(v2, -1);
                                this.e = -2;
                            }
                            else {
                                this.e = -1;
                            }
                        }
                    }
                    else {
                        this.e = typedArray0.getInteger(v2, this.e);
                    }
                }
                else if(v2 == styleable.Transition_duration) {
                    int v5 = typedArray0.getInt(v2, this.h);
                    this.h = v5;
                    if(v5 < 8) {
                        this.h = 8;
                    }
                }
                else if(v2 == styleable.Transition_staggered) {
                    this.i = typedArray0.getFloat(v2, this.i);
                }
                else if(v2 == styleable.Transition_autoTransition) {
                    this.n = typedArray0.getInteger(v2, this.n);
                }
                else if(v2 == styleable.Transition_android_id) {
                    this.a = typedArray0.getResourceId(v2, this.a);
                }
                else if(v2 == styleable.Transition_transitionDisable) {
                    this.o = typedArray0.getBoolean(v2, this.o);
                }
                else if(v2 == styleable.Transition_pathMotionArc) {
                    this.p = typedArray0.getInteger(v2, -1);
                }
                else if(v2 == styleable.Transition_layoutDuringTransition) {
                    this.q = typedArray0.getInteger(v2, 0);
                }
                else if(v2 == styleable.Transition_transitionFlags) {
                    this.r = typedArray0.getInteger(v2, 0);
                }
            }
            if(this.d == -1) {
                this.b = true;
            }
        }

        private void y(MotionScene motionScene0, Context context0, AttributeSet attributeSet0) {
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.Transition);
            this.x(motionScene0, context0, typedArray0);
            typedArray0.recycle();
        }

        public int z() {
            return this.n;
        }
    }

    private static final int A = -2;
    public static final int B = -1;
    private static final boolean C = false;
    public static final int D = 0;
    public static final int E = 1;
    public static final int F = 2;
    private static final String G = "MotionScene";
    private static final String H = "Transition";
    private static final String I = "OnSwipe";
    private static final String J = "OnClick";
    private static final String K = "StateSet";
    private static final String L = "Include";
    private static final String M = "include";
    private static final String N = "KeyFrameSet";
    private static final String O = "ConstraintSet";
    private static final String P = "ViewTransition";
    static final int Q = 0;
    static final int R = 1;
    static final int S = 2;
    static final int T = 3;
    static final int U = 4;
    static final int V = 5;
    static final int W = 6;
    private final MotionLayout a;
    StateSet b;
    Transition c;
    private boolean d;
    private ArrayList e;
    private Transition f;
    private ArrayList g;
    private SparseArray h;
    private HashMap i;
    private SparseIntArray j;
    private int k;
    private int l;
    private MotionEvent m;
    private boolean n;
    private boolean o;
    private MotionTracker p;
    private boolean q;
    final ViewTransitionController r;
    float s;
    float t;
    private static final String u = "MotionScene";
    private static final boolean v = false;
    private static final int w = 8;
    static final int x = 0;
    static final int y = 1;
    private static final int z = -1;

    MotionScene(Context context0, MotionLayout motionLayout0, int v) {
        this.b = null;
        this.c = null;
        this.d = false;
        this.e = new ArrayList();
        this.f = null;
        this.g = new ArrayList();
        this.h = new SparseArray();
        this.i = new HashMap();
        this.j = new SparseIntArray();
        this.k = 400;
        this.l = 0;
        this.n = false;
        this.o = false;
        this.a = motionLayout0;
        this.r = new ViewTransitionController(motionLayout0);
        this.W(context0, v);
        SparseArray sparseArray0 = this.h;
        ConstraintSet constraintSet0 = new ConstraintSet();
        sparseArray0.put(id.motion_base, constraintSet0);
        this.i.put("motion_base", id.motion_base);
    }

    public MotionScene(MotionLayout motionLayout0) {
        this.b = null;
        this.c = null;
        this.d = false;
        this.e = new ArrayList();
        this.f = null;
        this.g = new ArrayList();
        this.h = new SparseArray();
        this.i = new HashMap();
        this.j = new SparseIntArray();
        this.k = 400;
        this.l = 0;
        this.n = false;
        this.o = false;
        this.a = motionLayout0;
        this.r = new ViewTransitionController(motionLayout0);
    }

    static String A(Context context0, int v, XmlPullParser xmlPullParser0) {
        return ".(" + Debug.i(context0, v) + ".xml:" + xmlPullParser0.getLineNumber() + ") \"" + xmlPullParser0.getName() + "\"";
    }

    public int[] B(String[] arr_s) {
        int v = this.h.size();
        int[] arr_v = new int[v];
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            ConstraintSet constraintSet0 = (ConstraintSet)this.h.valueAt(v1);
            int v3 = this.h.keyAt(v1);
            if(constraintSet0.B0(arr_s)) {
                constraintSet0.s0();
                arr_v[v2] = v3;
                ++v2;
            }
        }
        return Arrays.copyOf(arr_v, v2);
    }

    float C() {
        return this.c == null || this.c.l == null ? 0.0f : this.c.l.i();
    }

    float D() {
        return this.c == null || this.c.l == null ? 0.0f : this.c.l.j();
    }

    boolean E() {
        return this.c == null || this.c.l == null ? false : this.c.l.k();
    }

    public float F(View view0, int v) {
        return 0.0f;
    }

    float G(float f, float f1) {
        return this.c == null || this.c.l == null ? 0.0f : this.c.l.l(f, f1);
    }

    private int H(int v) {
        StateSet stateSet0 = this.b;
        if(stateSet0 != null) {
            int v1 = stateSet0.e(v, -1, -1);
            return v1 == -1 ? v : v1;
        }
        return v;
    }

    int I() {
        return this.c == null || this.c.l == null ? 0 : this.c.l.m();
    }

    float J() {
        return this.c == null || this.c.l == null ? 0.0f : this.c.l.n();
    }

    float K() {
        return this.c == null || this.c.l == null ? 0.0f : this.c.l.o();
    }

    float L() {
        return this.c == null || this.c.l == null ? 0.0f : this.c.l.p();
    }

    float M() {
        return this.c == null || this.c.l == null ? 0.0f : this.c.l.q();
    }

    public float N() {
        return this.c == null ? 0.0f : this.c.i;
    }

    int O() {
        return this.c == null ? -1 : this.c.d;
    }

    public Transition P(int v) {
        for(Object object0: this.e) {
            Transition motionScene$Transition0 = (Transition)object0;
            if(motionScene$Transition0.a == v) {
                return motionScene$Transition0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    int Q(int v) {
        for(Object object0: this.e) {
            if(((Transition)object0).d == v) {
                return 0;
            }
            if(false) {
                break;
            }
        }
        return 1;
    }

    public List R(int v) {
        int v1 = this.H(v);
        List list0 = new ArrayList();
        for(Object object0: this.e) {
            Transition motionScene$Transition0 = (Transition)object0;
            if(motionScene$Transition0.d == v1 || motionScene$Transition0.c == v1) {
                ((ArrayList)list0).add(motionScene$Transition0);
            }
        }
        return list0;
    }

    private boolean S(int v) {
        int v1 = this.j.get(v);
        for(int v2 = this.j.size(); v1 > 0; --v2) {
            if(v1 == v) {
                return true;
            }
            if(v2 < 0) {
                return true;
            }
            v1 = this.j.get(v1);
        }
        return false;
    }

    boolean T(View view0, int v) {
        Transition motionScene$Transition0 = this.c;
        if(motionScene$Transition0 == null) {
            return false;
        }
        for(Object object0: motionScene$Transition0.k) {
            for(Object object1: ((KeyFrames)object0).d(view0.getId())) {
                if(((Key)object1).a == v) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    private boolean U() {
        return this.p != null;
    }

    public boolean V(int v) {
        return this.r.h(v);
    }

    private void W(Context context0, int v) {
        XmlResourceParser xmlResourceParser0 = context0.getResources().getXml(v);
        try {
            int v1 = xmlResourceParser0.getEventType();
            Transition motionScene$Transition0 = null;
            while(true) {
                switch(v1) {
                    case 1: {
                        return;
                    }
                    case 2: {
                        switch(xmlResourceParser0.getName()) {
                            case "ConstraintSet": {
                                this.a0(context0, xmlResourceParser0);
                                break;
                            }
                            case "Include": {
                                this.c0(context0, xmlResourceParser0);
                                break;
                            }
                            case "KeyFrameSet": {
                                KeyFrames keyFrames0 = new KeyFrames(context0, xmlResourceParser0);
                                if(motionScene$Transition0 != null) {
                                    motionScene$Transition0.k.add(keyFrames0);
                                }
                                break;
                            }
                            case "MotionScene": {
                                this.d0(context0, xmlResourceParser0);
                                break;
                            }
                            case "OnClick": {
                                if(motionScene$Transition0 != null && !this.a.isInEditMode()) {
                                    motionScene$Transition0.v(context0, xmlResourceParser0);
                                }
                                break;
                            }
                            case "OnSwipe": {
                                if(motionScene$Transition0 == null) {
                                    Log.v("MotionScene", " OnSwipe (" + context0.getResources().getResourceEntryName(v) + ".xml:" + xmlResourceParser0.getLineNumber() + ")");
                                }
                                if(motionScene$Transition0 != null) {
                                    motionScene$Transition0.l = new TouchResponse(context0, this.a, xmlResourceParser0);
                                }
                                break;
                            }
                            case "StateSet": {
                                this.b = new StateSet(context0, xmlResourceParser0);
                                break;
                            }
                            case "Transition": {
                                ArrayList arrayList0 = this.e;
                                motionScene$Transition0 = new Transition(this, context0, xmlResourceParser0);
                                arrayList0.add(motionScene$Transition0);
                                if(this.c == null && !motionScene$Transition0.b) {
                                    this.c = motionScene$Transition0;
                                    if(motionScene$Transition0.l != null) {
                                        this.c.l.D(this.q);
                                    }
                                }
                                if(motionScene$Transition0.b) {
                                    if(motionScene$Transition0.c == -1) {
                                        this.f = motionScene$Transition0;
                                    }
                                    else {
                                        this.g.add(motionScene$Transition0);
                                    }
                                    this.e.remove(motionScene$Transition0);
                                }
                                break;
                            }
                            case "ViewTransition": {
                                ViewTransition viewTransition0 = new ViewTransition(context0, xmlResourceParser0);
                                this.r.b(viewTransition0);
                                break;
                            }
                            case "include": {
                                this.c0(context0, xmlResourceParser0);
                            }
                        }
                        v1 = xmlResourceParser0.next();
                        break;
                    }
                    default: {
                        v1 = xmlResourceParser0.next();
                        break;
                    }
                }
            }
            goto label_52;
        }
        catch(XmlPullParserException xmlPullParserException0) {
        }
        catch(IOException iOException0) {
            goto label_52;
        }
        Log.e("MotionScene", "Error parsing resource: " + v, xmlPullParserException0);
        return;
    label_52:
        Log.e("MotionScene", "Error parsing resource: " + v, iOException0);
    }

    public int X(String s) {
        Integer integer0 = (Integer)this.i.get(s);
        return integer0 == null ? 0 : ((int)integer0);
    }

    public String Y(int v) {
        for(Object object0: this.i.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            Integer integer0 = (Integer)map$Entry0.getValue();
            if(integer0 != null && ((int)integer0) == v) {
                return (String)map$Entry0.getKey();
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    protected void Z(boolean z, int v, int v1, int v2, int v3) {
    }

    // This method was un-flattened
    private int a0(Context context0, XmlPullParser xmlPullParser0) {
        ConstraintSet constraintSet0 = new ConstraintSet();
        constraintSet0.d1(false);
        int v = xmlPullParser0.getAttributeCount();
        int v2 = -1;
        int v3 = -1;
        for(int v1 = 0; v1 < v; ++v1) {
            String s = xmlPullParser0.getAttributeName(v1);
            String s1 = xmlPullParser0.getAttributeValue(v1);
            s.hashCode();
            switch(s) {
                case "constraintRotate": {
                    try {
                        constraintSet0.e = Integer.parseInt(s1);
                    }
                    catch(NumberFormatException unused_ex) {
                        s1.hashCode();
                        switch(s1) {
                            case "left": {
                                constraintSet0.e = 2;
                                break;
                            }
                            case "none": {
                                constraintSet0.e = 0;
                                break;
                            }
                            case "right": {
                                constraintSet0.e = 1;
                                break;
                            }
                            case "x_left": {
                                constraintSet0.e = 4;
                                break;
                            }
                            case "x_right": {
                                constraintSet0.e = 3;
                            }
                        }
                    }
                    break;
                }
                case "deriveConstraintsFrom": {
                    v3 = this.v(context0, s1);
                    break;
                }
                case "id": {
                    v2 = this.v(context0, s1);
                    this.i.put(MotionScene.r0(s1), v2);
                    constraintSet0.b = Debug.i(context0, v2);
                    break;
                }
                case "stateLabels": {
                    constraintSet0.u1(s1);
                }
            }
        }
        if(v2 != -1) {
            if(this.a.x != 0) {
                constraintSet0.E1(true);
            }
            constraintSet0.z0(context0, xmlPullParser0);
            if(v3 != -1) {
                this.j.put(v2, v3);
            }
            this.h.put(v2, constraintSet0);
        }
        return v2;
    }

    private int b0(Context context0, int v) {
        XmlResourceParser xmlResourceParser0 = context0.getResources().getXml(v);
        try {
            for(int v1 = xmlResourceParser0.getEventType(); true; v1 = xmlResourceParser0.next()) {
                if(v1 == 1) {
                    return -1;
                }
                if(2 == v1 && "ConstraintSet".equals(xmlResourceParser0.getName())) {
                    return this.a0(context0, xmlResourceParser0);
                }
            }
        }
        catch(XmlPullParserException xmlPullParserException0) {
        }
        catch(IOException iOException0) {
            Log.e("MotionScene", "Error parsing resource: " + v, iOException0);
            return -1;
        }
        Log.e("MotionScene", "Error parsing resource: " + v, xmlPullParserException0);
        return -1;
    }

    private void c0(Context context0, XmlPullParser xmlPullParser0) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser0), styleable.include);
        int v = typedArray0.getIndexCount();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = typedArray0.getIndex(v1);
            if(v2 == styleable.include_constraintSet) {
                this.b0(context0, typedArray0.getResourceId(v2, -1));
            }
        }
        typedArray0.recycle();
    }

    private void d0(Context context0, XmlPullParser xmlPullParser0) {
        TypedArray typedArray0 = context0.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser0), styleable.MotionScene);
        int v = typedArray0.getIndexCount();
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = typedArray0.getIndex(v1);
            if(v2 == styleable.MotionScene_defaultDuration) {
                int v3 = typedArray0.getInt(v2, this.k);
                this.k = v3;
                if(v3 < 8) {
                    this.k = 8;
                }
            }
            else if(v2 == styleable.MotionScene_layoutDuringTransition) {
                this.l = typedArray0.getInteger(v2, 0);
            }
        }
        typedArray0.recycle();
    }

    void e0(float f, float f1) {
        if(this.c != null && this.c.l != null) {
            this.c.l.w(f, f1);
        }
    }

    public void f(MotionLayout motionLayout0, int v) {
        for(Object object0: this.e) {
            Transition motionScene$Transition0 = (Transition)object0;
            if(motionScene$Transition0.m.size() > 0) {
                for(Object object1: motionScene$Transition0.m) {
                    ((TransitionOnClick)object1).c(motionLayout0);
                }
            }
        }
        for(Object object2: this.g) {
            Transition motionScene$Transition1 = (Transition)object2;
            if(motionScene$Transition1.m.size() > 0) {
                for(Object object3: motionScene$Transition1.m) {
                    ((TransitionOnClick)object3).c(motionLayout0);
                }
            }
        }
        for(Object object4: this.e) {
            Transition motionScene$Transition2 = (Transition)object4;
            if(motionScene$Transition2.m.size() > 0) {
                for(Object object5: motionScene$Transition2.m) {
                    ((TransitionOnClick)object5).a(motionLayout0, v, motionScene$Transition2);
                }
            }
        }
        for(Object object6: this.g) {
            Transition motionScene$Transition3 = (Transition)object6;
            if(motionScene$Transition3.m.size() > 0) {
                for(Object object7: motionScene$Transition3.m) {
                    ((TransitionOnClick)object7).a(motionLayout0, v, motionScene$Transition3);
                }
            }
        }
    }

    void f0(float f, float f1) {
        if(this.c != null && this.c.l != null) {
            this.c.l.x(f, f1);
        }
    }

    public void g(Transition motionScene$Transition0) {
        int v = this.w(motionScene$Transition0);
        if(v == -1) {
            this.e.add(motionScene$Transition0);
            return;
        }
        this.e.set(v, motionScene$Transition0);
    }

    void g0(MotionEvent motionEvent0, int v, MotionLayout motionLayout0) {
        RectF rectF0 = new RectF();
        if(this.p == null) {
            this.p = this.a.I0();
        }
        this.p.b(motionEvent0);
        if(v != -1) {
            boolean z = false;
            switch(motionEvent0.getAction()) {
                case 0: {
                    this.s = motionEvent0.getRawX();
                    this.t = motionEvent0.getRawY();
                    this.m = motionEvent0;
                    this.n = false;
                    if(this.c.l != null) {
                        RectF rectF1 = this.c.l.g(this.a, rectF0);
                        if(rectF1 != null && !rectF1.contains(this.m.getX(), this.m.getY())) {
                            this.m = null;
                            this.n = true;
                            return;
                        }
                        RectF rectF2 = this.c.l.r(this.a, rectF0);
                        this.o = rectF2 == null || rectF2.contains(this.m.getX(), this.m.getY()) ? false : true;
                        this.c.l.A(this.s, this.t);
                    }
                    return;
                }
                case 2: {
                    if(!this.n) {
                        float f = motionEvent0.getRawY() - this.t;
                        float f1 = motionEvent0.getRawX() - this.s;
                        if(((double)f1) == 0.0 && ((double)f) == 0.0) {
                            return;
                        }
                        MotionEvent motionEvent1 = this.m;
                        if(motionEvent1 == null) {
                            return;
                        }
                        Transition motionScene$Transition0 = this.j(v, f1, f, motionEvent1);
                        if(motionScene$Transition0 != null) {
                            motionLayout0.setTransition(motionScene$Transition0);
                            RectF rectF3 = this.c.l.r(this.a, rectF0);
                            if(rectF3 != null && !rectF3.contains(this.m.getX(), this.m.getY())) {
                                z = true;
                            }
                            this.o = z;
                            this.c.l.G(this.s, this.t);
                            break;
                        }
                    }
                }
            }
        }
        if(this.n) {
            return;
        }
        if(this.c != null && this.c.l != null && !this.o) {
            this.c.l.u(motionEvent0, this.p, v, this);
        }
        this.s = motionEvent0.getRawX();
        this.t = motionEvent0.getRawY();
        if(motionEvent0.getAction() == 1) {
            MotionTracker motionLayout$MotionTracker0 = this.p;
            if(motionLayout$MotionTracker0 != null) {
                motionLayout$MotionTracker0.recycle();
                this.p = null;
                int v1 = motionLayout0.f;
                if(v1 != -1) {
                    this.i(motionLayout0, v1);
                }
            }
        }
    }

    public boolean h(int v, MotionController motionController0) {
        return this.r.e(v, motionController0);
    }

    private void h0(int v, MotionLayout motionLayout0) {
        ConstraintSet constraintSet0 = (ConstraintSet)this.h.get(v);
        constraintSet0.c = constraintSet0.b;
        int v1 = this.j.get(v);
        if(v1 > 0) {
            this.h0(v1, motionLayout0);
            ConstraintSet constraintSet1 = (ConstraintSet)this.h.get(v1);
            if(constraintSet1 == null) {
                Log.e("MotionScene", "ERROR! invalid deriveConstraintsFrom: @id/" + Debug.i(this.a.getContext(), v1));
                return;
            }
            constraintSet0.c = constraintSet0.c + "/" + constraintSet1.c;
            constraintSet0.M0(constraintSet1);
        }
        else {
            constraintSet0.c = constraintSet0.c + "  layout";
            constraintSet0.L0(motionLayout0);
        }
        constraintSet0.q(constraintSet0);
    }

    boolean i(MotionLayout motionLayout0, int v) {
        if(this.U()) {
            return false;
        }
        if(this.d) {
            return false;
        }
        for(Object object0: this.e) {
            Transition motionScene$Transition0 = (Transition)object0;
            if(motionScene$Transition0.n != 0 && (this.c != motionScene$Transition0 || !this.c.L(2))) {
                if(v == motionScene$Transition0.d && (motionScene$Transition0.n == 2 || motionScene$Transition0.n == 4)) {
                    TransitionState motionLayout$TransitionState0 = TransitionState.d;
                    motionLayout0.setState(motionLayout$TransitionState0);
                    motionLayout0.setTransition(motionScene$Transition0);
                    if(motionScene$Transition0.n == 4) {
                        motionLayout0.W0();
                        motionLayout0.setState(TransitionState.b);
                        motionLayout0.setState(TransitionState.c);
                        return true;
                    }
                    motionLayout0.setProgress(1.0f);
                    motionLayout0.n0(true);
                    motionLayout0.setState(TransitionState.b);
                    motionLayout0.setState(TransitionState.c);
                    motionLayout0.setState(motionLayout$TransitionState0);
                    motionLayout0.J0();
                    return true;
                }
                if(v == motionScene$Transition0.c && (motionScene$Transition0.n == 1 || motionScene$Transition0.n == 3)) {
                    TransitionState motionLayout$TransitionState1 = TransitionState.d;
                    motionLayout0.setState(motionLayout$TransitionState1);
                    motionLayout0.setTransition(motionScene$Transition0);
                    if(motionScene$Transition0.n == 3) {
                        motionLayout0.Y0();
                        motionLayout0.setState(TransitionState.b);
                        motionLayout0.setState(TransitionState.c);
                        return true;
                    }
                    motionLayout0.setProgress(0.0f);
                    motionLayout0.n0(true);
                    motionLayout0.setState(TransitionState.b);
                    motionLayout0.setState(TransitionState.c);
                    motionLayout0.setState(motionLayout$TransitionState1);
                    motionLayout0.J0();
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }

    void i0(MotionLayout motionLayout0) {
        for(int v = 0; v < this.h.size(); ++v) {
            int v1 = this.h.keyAt(v);
            if(this.S(v1)) {
                Log.e("MotionScene", "Cannot be derived from yourself");
                return;
            }
            this.h0(v1, motionLayout0);
        }
    }

    public Transition j(int v, float f, float f1, MotionEvent motionEvent0) {
        if(v != -1) {
            List list0 = this.R(v);
            RectF rectF0 = new RectF();
            float f2 = 0.0f;
            Transition motionScene$Transition0 = null;
            for(Object object0: list0) {
                Transition motionScene$Transition1 = (Transition)object0;
                if(!motionScene$Transition1.o && motionScene$Transition1.l != null) {
                    motionScene$Transition1.l.D(this.q);
                    RectF rectF1 = motionScene$Transition1.l.r(this.a, rectF0);
                    if(rectF1 == null || motionEvent0 == null || rectF1.contains(motionEvent0.getX(), motionEvent0.getY())) {
                        RectF rectF2 = motionScene$Transition1.l.g(this.a, rectF0);
                        if(rectF2 == null || motionEvent0 == null || rectF2.contains(motionEvent0.getX(), motionEvent0.getY())) {
                            float f3 = motionScene$Transition1.l.a(f, f1);
                            if(motionScene$Transition1.l.l && motionEvent0 != null) {
                                float f4 = motionEvent0.getX() - motionScene$Transition1.l.i;
                                float f5 = motionEvent0.getY() - motionScene$Transition1.l.j;
                                f3 = ((float)(Math.atan2(f1 + f5, f + f4) - Math.atan2(f4, f5))) * 10.0f;
                            }
                            float f6 = f3 * (motionScene$Transition1.c == v ? -1.0f : 1.1f);
                            if(f6 > f2) {
                                motionScene$Transition0 = motionScene$Transition1;
                                f2 = f6;
                            }
                        }
                    }
                }
            }
            return motionScene$Transition0;
        }
        return this.c;
    }

    public void j0(Transition motionScene$Transition0) {
        int v = this.w(motionScene$Transition0);
        if(v != -1) {
            this.e.remove(v);
        }
    }

    public void k(boolean z) {
        this.d = z;
    }

    public void k0(int v, ConstraintSet constraintSet0) {
        this.h.put(v, constraintSet0);
    }

    public void l(int v, boolean z) {
        this.r.f(v, z);
    }

    public void l0(int v) {
        Transition motionScene$Transition0 = this.c;
        if(motionScene$Transition0 != null) {
            motionScene$Transition0.O(v);
            return;
        }
        this.k = v;
    }

    public int m() {
        return this.c == null ? -1 : this.c.p;
    }

    public void m0(View view0, int v, String s, Object object0) {
        Transition motionScene$Transition0 = this.c;
        if(motionScene$Transition0 == null) {
            return;
        }
        for(Object object1: motionScene$Transition0.k) {
            for(Object object2: ((KeyFrames)object1).d(view0.getId())) {
                if(((Key)object2).a == v && object0 != null) {
                    Float float0 = (Float)object0;
                }
            }
        }
    }

    int n() {
        return this.c == null || this.c.l == null ? 0 : this.c.l.e();
    }

    public void n0(boolean z) {
        this.q = z;
        if(this.c != null && this.c.l != null) {
            this.c.l.D(this.q);
        }
    }

    ConstraintSet o(int v) {
        return this.p(v, -1, -1);
    }

    void o0(int v, int v1) {
        int v3;
        int v2;
        StateSet stateSet0 = this.b;
        if(stateSet0 == null) {
            v2 = v;
            v3 = v1;
        }
        else {
            v2 = stateSet0.e(v, -1, -1);
            if(v2 == -1) {
                v2 = v;
            }
            v3 = this.b.e(v1, -1, -1);
            if(v3 == -1) {
                v3 = v1;
            }
        }
        if(this.c != null && this.c.c == v1 && this.c.d == v) {
            return;
        }
        for(Object object0: this.e) {
            Transition motionScene$Transition0 = (Transition)object0;
            if(motionScene$Transition0.c == v3 && motionScene$Transition0.d == v2 || motionScene$Transition0.c == v1 && motionScene$Transition0.d == v) {
                this.c = motionScene$Transition0;
                if(motionScene$Transition0 != null && motionScene$Transition0.l != null) {
                    this.c.l.D(this.q);
                }
                return;
            }
            if(false) {
                break;
            }
        }
        Transition motionScene$Transition1 = this.f;
        for(Object object1: this.g) {
            Transition motionScene$Transition2 = (Transition)object1;
            if(motionScene$Transition2.c == v1) {
                motionScene$Transition1 = motionScene$Transition2;
            }
        }
        Transition motionScene$Transition3 = new Transition(this, motionScene$Transition1);
        motionScene$Transition3.d = v2;
        motionScene$Transition3.c = v3;
        if(v2 != -1) {
            this.e.add(motionScene$Transition3);
        }
        this.c = motionScene$Transition3;
    }

    ConstraintSet p(int v, int v1, int v2) {
        StateSet stateSet0 = this.b;
        if(stateSet0 != null) {
            int v3 = stateSet0.e(v, v1, v2);
            if(v3 != -1) {
                v = v3;
            }
        }
        if(this.h.get(v) == null) {
            Log.e("MotionScene", "Warning could not find ConstraintSet id/" + Debug.i(this.a.getContext(), v) + " In MotionScene");
            return (ConstraintSet)this.h.get(this.h.keyAt(0));
        }
        return (ConstraintSet)this.h.get(v);
    }

    public void p0(Transition motionScene$Transition0) {
        this.c = motionScene$Transition0;
        if(motionScene$Transition0 != null && motionScene$Transition0.l != null) {
            this.c.l.D(this.q);
        }
    }

    public ConstraintSet q(Context context0, String s) {
        for(int v = 0; v < this.h.size(); ++v) {
            int v1 = this.h.keyAt(v);
            if(s.equals(context0.getResources().getResourceName(v1))) {
                return (ConstraintSet)this.h.get(v1);
            }
        }
        return null;
    }

    void q0() {
        if(this.c != null && this.c.l != null) {
            this.c.l.H();
        }
    }

    public int[] r() {
        int v = this.h.size();
        int[] arr_v = new int[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_v[v1] = this.h.keyAt(v1);
        }
        return arr_v;
    }

    public static String r0(String s) {
        if(s == null) {
            return "";
        }
        int v = s.indexOf(0x2F);
        return v >= 0 ? s.substring(v + 1) : s;
    }

    public ArrayList s() {
        return this.e;
    }

    boolean s0() {
        for(Object object0: this.e) {
            if(((Transition)object0).l != null) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return this.c != null && this.c.l != null;
    }

    public int t() {
        return this.c == null ? this.k : this.c.h;
    }

    public boolean t0(MotionLayout motionLayout0) {
        return motionLayout0 == this.a && motionLayout0.a == this;
    }

    int u() {
        return this.c == null ? -1 : this.c.c;
    }

    public void u0(int v, View[] arr_view) {
        this.r.m(v, arr_view);
    }

    private int v(Context context0, String s) {
        int v = s.contains("/") ? context0.getResources().getIdentifier(s.substring(s.indexOf(0x2F) + 1), "id", "com.dcinside.app.android") : -1;
        if(v == -1) {
            if(s.length() > 1) {
                return Integer.parseInt(s.substring(1));
            }
            Log.e("MotionScene", "error in parsing id");
        }
        return v;
    }

    private int w(Transition motionScene$Transition0) {
        int v = motionScene$Transition0.a;
        if(v == -1) {
            throw new IllegalArgumentException("The transition must have an id");
        }
        for(int v1 = 0; v1 < this.e.size(); ++v1) {
            if(((Transition)this.e.get(v1)).a == v) {
                return v1;
            }
        }
        return -1;
    }

    public Interpolator x() {
        int v = this.c.e;
        if(v != -2) {
            switch(v) {
                case -1: {
                    return new Interpolator() {
                        final MotionScene b;

                        @Override  // android.animation.TimeInterpolator
                        public float getInterpolation(float f) {
                            return (float)Easing.c(this.c.f).a(((double)f));
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
        return AnimationUtils.loadInterpolator(this.a.getContext(), this.c.g);
    }

    Key y(Context context0, int v, int v1, int v2) {
        Transition motionScene$Transition0 = this.c;
        if(motionScene$Transition0 == null) {
            return null;
        }
        for(Object object0: motionScene$Transition0.k) {
            KeyFrames keyFrames0 = (KeyFrames)object0;
            for(Object object1: keyFrames0.e()) {
                Integer integer0 = (Integer)object1;
                if(v1 == ((int)integer0)) {
                    for(Object object2: keyFrames0.d(((int)integer0))) {
                        Key key0 = (Key)object2;
                        if(key0.a == v2 && key0.d == v) {
                            return key0;
                        }
                        if(false) {
                            break;
                        }
                    }
                    if(false) {
                        break;
                    }
                }
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public void z(MotionController motionController0) {
        Transition motionScene$Transition0 = this.c;
        if(motionScene$Transition0 == null) {
            Transition motionScene$Transition1 = this.f;
            if(motionScene$Transition1 != null) {
                for(Object object0: motionScene$Transition1.k) {
                    ((KeyFrames)object0).b(motionController0);
                }
            }
            return;
        }
        for(Object object1: motionScene$Transition0.k) {
            ((KeyFrames)object1).b(motionController0);
        }
    }
}

