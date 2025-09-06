package androidx.constraintlayout.motion.widget;

import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintSet;
import j..util.Objects;
import java.util.HashMap;

public class DesignTool {
    private final MotionLayout a;
    private MotionScene b;
    private String c;
    private String d;
    private int e;
    private int f;
    static final HashMap g = null;
    static final HashMap h = null;
    private static final boolean i = false;
    private static final boolean j = false;
    private static final String k = "DesignTool";

    static {
        HashMap hashMap0 = new HashMap();
        DesignTool.g = hashMap0;
        HashMap hashMap1 = new HashMap();
        DesignTool.h = hashMap1;
        hashMap0.put(Pair.create(4, 4), "layout_constraintBottom_toBottomOf");
        hashMap0.put(Pair.create(4, 3), "layout_constraintBottom_toTopOf");
        hashMap0.put(Pair.create(3, 4), "layout_constraintTop_toBottomOf");
        hashMap0.put(Pair.create(3, 3), "layout_constraintTop_toTopOf");
        hashMap0.put(Pair.create(6, 6), "layout_constraintStart_toStartOf");
        hashMap0.put(Pair.create(6, 7), "layout_constraintStart_toEndOf");
        hashMap0.put(Pair.create(7, 6), "layout_constraintEnd_toStartOf");
        hashMap0.put(Pair.create(7, 7), "layout_constraintEnd_toEndOf");
        hashMap0.put(Pair.create(1, 1), "layout_constraintLeft_toLeftOf");
        hashMap0.put(Pair.create(1, 2), "layout_constraintLeft_toRightOf");
        hashMap0.put(Pair.create(2, 2), "layout_constraintRight_toRightOf");
        hashMap0.put(Pair.create(2, 1), "layout_constraintRight_toLeftOf");
        hashMap0.put(Pair.create(5, 5), "layout_constraintBaseline_toBaselineOf");
        hashMap1.put("layout_constraintBottom_toBottomOf", "layout_marginBottom");
        hashMap1.put("layout_constraintBottom_toTopOf", "layout_marginBottom");
        hashMap1.put("layout_constraintTop_toBottomOf", "layout_marginTop");
        hashMap1.put("layout_constraintTop_toTopOf", "layout_marginTop");
        hashMap1.put("layout_constraintStart_toStartOf", "layout_marginStart");
        hashMap1.put("layout_constraintStart_toEndOf", "layout_marginStart");
        hashMap1.put("layout_constraintEnd_toStartOf", "layout_marginEnd");
        hashMap1.put("layout_constraintEnd_toEndOf", "layout_marginEnd");
        hashMap1.put("layout_constraintLeft_toLeftOf", "layout_marginLeft");
        hashMap1.put("layout_constraintLeft_toRightOf", "layout_marginLeft");
        hashMap1.put("layout_constraintRight_toRightOf", "layout_marginRight");
        hashMap1.put("layout_constraintRight_toLeftOf", "layout_marginRight");
    }

    public DesignTool(MotionLayout motionLayout0) {
        this.c = null;
        this.d = null;
        this.e = -1;
        this.f = -1;
        this.a = motionLayout0;
    }

    public boolean A(Object object0, int v, int v1, float f, float f1) {
        if(!(object0 instanceof View)) {
            return false;
        }
        MotionLayout motionLayout0 = this.a;
        if(motionLayout0.a != null) {
            MotionController motionController0 = (MotionController)motionLayout0.k.get(object0);
            int v2 = (int)(this.a.n * 100.0f);
            if(motionController0 != null && this.a.a.T(((View)object0), v2)) {
                float f2 = motionController0.y(2, f, f1);
                float f3 = motionController0.y(5, f, f1);
                this.a.a.m0(((View)object0), v2, "motion:percentX", f2);
                this.a.a.m0(((View)object0), v2, "motion:percentY", f3);
                this.a.M0();
                this.a.n0(true);
                this.a.invalidate();
                return true;
            }
        }
        return false;
    }

    public void B(Object object0, String s, Object object1) {
        if(object0 instanceof Key) {
            ((Key)object0).j(s, object1);
            this.a.M0();
            this.a.s = true;
        }
    }

    public void C(String s) {
        if(s == null) {
            s = "motion_base";
        }
        if(Objects.equals(this.c, s)) {
            return;
        }
        this.c = s;
        this.d = null;
        MotionLayout motionLayout0 = this.a;
        if(motionLayout0.a == null) {
            motionLayout0.a = this.b;
        }
        int v = motionLayout0.H0(s);
        this.e = v;
        if(v != 0) {
            if(v == this.a.getStartState()) {
                this.a.setProgress(0.0f);
            }
            else {
                if(v != this.a.getEndState()) {
                    this.a.a1(v);
                }
                this.a.setProgress(1.0f);
            }
        }
        this.a.requestLayout();
    }

    public void D(float f) {
        MotionLayout motionLayout0 = this.a;
        if(motionLayout0.a == null) {
            motionLayout0.a = this.b;
        }
        motionLayout0.setProgress(f);
        this.a.n0(true);
        this.a.requestLayout();
        this.a.invalidate();
    }

    public void E(String s, String s1) {
        MotionLayout motionLayout0 = this.a;
        if(motionLayout0.a == null) {
            motionLayout0.a = this.b;
        }
        int v = motionLayout0.H0(s);
        int v1 = this.a.H0(s1);
        this.a.R0(v, v1);
        this.e = v;
        this.f = v1;
        this.c = s;
        this.d = s1;
    }

    public void F(Object object0, int v) {
        if(!(object0 instanceof View)) {
            return;
        }
        MotionController motionController0 = (MotionController)this.a.k.get(object0);
        if(motionController0 != null) {
            motionController0.S(v);
            this.a.invalidate();
        }
    }

    private static void a(int v, ConstraintSet constraintSet0, View view0, HashMap hashMap0, int v1, int v2) {
        Pair pair0 = Pair.create(v1, v2);
        String s = (String)DesignTool.g.get(pair0);
        String s1 = (String)hashMap0.get(s);
        if(s1 != null) {
            String s2 = (String)DesignTool.h.get(s);
            int v3 = s2 == null ? 0 : DesignTool.q(v, ((String)hashMap0.get(s2)));
            int v4 = Integer.parseInt(s1);
            constraintSet0.L(view0.getId(), v1, v4, v2, v3);
        }
    }

    public int b(int v, String s, Object object0, float[] arr_f, int v1, float[] arr_f1, int v2) {
        MotionController motionController0;
        if(v == 0) {
            motionController0 = null;
        }
        else {
            MotionLayout motionLayout0 = this.a;
            if(motionLayout0.a == null) {
                return -1;
            }
            if(((View)object0) == null) {
                return -1;
            }
            motionController0 = (MotionController)motionLayout0.k.get(((View)object0));
            if(motionController0 == null) {
                return -1;
            }
        }
        switch(v) {
            case 0: {
                return 1;
            }
            case 1: {
                int v3 = this.a.a.t();
                motionController0.f(arr_f1, v3 / 16);
                return v3 / 16;
            }
            case 2: {
                int v4 = this.a.a.t();
                motionController0.e(arr_f1, null);
                return v4 / 16;
            }
            case 3: {
                return motionController0.l(s, arr_f1, v2);
            }
            default: {
                return -1;
            }
        }
    }

    public void c(boolean z) {
        this.a.j0(z);
    }

    public void d(String s) {
        MotionLayout motionLayout0 = this.a;
        if(motionLayout0.a == null) {
            motionLayout0.a = this.b;
        }
        int v = motionLayout0.H0(s);
        System.out.println(" dumping  " + s + " (" + v + ")");
        try {
            this.a.a.o(v).g0(this.a.a, new int[0]);
        }
        catch(Exception exception0) {
            Log.e("DesignTool", "Error while dumping: " + s + " (" + v + ")", exception0);
        }
    }

    public int e(Object object0, float[] arr_f) {
        MotionScene motionScene0 = this.a.a;
        if(motionScene0 == null) {
            return -1;
        }
        int v = motionScene0.t();
        MotionController motionController0 = (MotionController)this.a.k.get(object0);
        if(motionController0 == null) {
            return 0;
        }
        motionController0.e(arr_f, null);
        return v / 16;
    }

    public int f(Object object0, float[] arr_f, int v) {
        MotionLayout motionLayout0 = this.a;
        if(motionLayout0.a == null) {
            return -1;
        }
        MotionController motionController0 = (MotionController)motionLayout0.k.get(object0);
        if(motionController0 == null) {
            return 0;
        }
        motionController0.f(arr_f, v);
        return v;
    }

    public void g(Object object0, float[] arr_f) {
        MotionScene motionScene0 = this.a.a;
        if(motionScene0 == null) {
            return;
        }
        int v = motionScene0.t();
        MotionController motionController0 = (MotionController)this.a.k.get(object0);
        if(motionController0 == null) {
            return;
        }
        motionController0.h(arr_f, v / 16);
    }

    public String h() {
        int v = this.a.getEndState();
        if(this.f == v) {
            return this.d;
        }
        String s = this.a.v0(v);
        if(s != null) {
            this.d = s;
            this.f = v;
        }
        return s;
    }

    public int i(Object object0, int v, int[] arr_v) {
        MotionController motionController0 = (MotionController)this.a.k.get(((View)object0));
        return motionController0 == null ? 0 : motionController0.x(v, arr_v);
    }

    public float j(Object object0, int v, float f, float f1) {
        if(!(object0 instanceof View)) {
            return 0.0f;
        }
        MotionController motionController0 = (MotionController)this.a.k.get(((View)object0));
        return motionController0 == null ? 0.0f : motionController0.y(v, f, f1);
    }

    public int k(Object object0, int[] arr_v, float[] arr_f) {
        MotionController motionController0 = (MotionController)this.a.k.get(((View)object0));
        return motionController0 == null ? 0 : motionController0.z(arr_v, arr_f);
    }

    public Object l(int v, int v1, int v2) {
        MotionLayout motionLayout0 = this.a;
        MotionScene motionScene0 = motionLayout0.a;
        return motionScene0 == null ? null : motionScene0.y(motionLayout0.getContext(), v, v1, v2);
    }

    public Object m(Object object0, int v, int v1) {
        if(this.a.a == null) {
            return null;
        }
        int v2 = ((View)object0).getId();
        return this.a.a.y(this.a.getContext(), v, v2, v1);
    }

    public Object n(Object object0, float f, float f1) {
        MotionLayout motionLayout0 = this.a;
        if(motionLayout0.a == null) {
            return -1;
        }
        if(((View)object0) != null) {
            MotionController motionController0 = (MotionController)motionLayout0.k.get(((View)object0));
            if(motionController0 == null) {
                return null;
            }
            ViewGroup viewGroup0 = (ViewGroup)((View)object0).getParent();
            return motionController0.B(viewGroup0.getWidth(), viewGroup0.getHeight(), f, f1);
        }
        return null;
    }

    public Boolean o(Object object0, Object object1, float f, float f1, String[] arr_s, float[] arr_f) {
        if(object0 instanceof KeyPositionBase) {
            ((MotionController)this.a.k.get(((View)object1))).N(((View)object1), ((KeyPositionBase)object0), f, f1, arr_s, arr_f);
            this.a.M0();
            this.a.s = true;
            return true;
        }
        return false;
    }

    public float p() {
        return this.a.getProgress();
    }

    private static int q(int v, String s) {
        if(s == null) {
            return 0;
        }
        int v1 = s.indexOf(100);
        return v1 == -1 ? 0 : ((int)(((float)(((int)Integer.valueOf(s.substring(0, v1))) * v)) / 160.0f));
    }

    public String r() {
        int v = this.a.getStartState();
        if(this.e == v) {
            return this.c;
        }
        String s = this.a.v0(v);
        if(s != null) {
            this.c = s;
            this.e = v;
        }
        return this.a.v0(v);
    }

    public String s() {
        if(this.c != null && this.d != null) {
            float f = this.p();
            if(f <= 0.01f) {
                return this.c;
            }
            return f >= 0.99f ? this.d : this.c;
        }
        return this.c;
    }

    public long t() {
        return this.a.getTransitionTimeMs();
    }

    public boolean u() {
        return this.c != null && this.d != null;
    }

    private static void v(int v, ConstraintSet constraintSet0, View view0, HashMap hashMap0) {
        String s = (String)hashMap0.get("layout_editor_absoluteX");
        if(s != null) {
            constraintSet0.Z0(view0.getId(), DesignTool.q(v, s));
        }
        String s1 = (String)hashMap0.get("layout_editor_absoluteY");
        if(s1 != null) {
            constraintSet0.a1(view0.getId(), DesignTool.q(v, s1));
        }
    }

    public void w(int v, String s, Object object0, Object object1) {
        HashMap hashMap0 = object1 instanceof HashMap ? ((HashMap)object1) : new HashMap();
        int v1 = this.a.H0(s);
        ConstraintSet constraintSet0 = this.a.a.o(v1);
        if(constraintSet0 == null) {
            return;
        }
        constraintSet0.E(((View)object0).getId());
        DesignTool.y(v, constraintSet0, ((View)object0), hashMap0, 0);
        DesignTool.y(v, constraintSet0, ((View)object0), hashMap0, 1);
        DesignTool.a(v, constraintSet0, ((View)object0), hashMap0, 6, 6);
        DesignTool.a(v, constraintSet0, ((View)object0), hashMap0, 6, 7);
        DesignTool.a(v, constraintSet0, ((View)object0), hashMap0, 7, 7);
        DesignTool.a(v, constraintSet0, ((View)object0), hashMap0, 7, 6);
        DesignTool.a(v, constraintSet0, ((View)object0), hashMap0, 1, 1);
        DesignTool.a(v, constraintSet0, ((View)object0), hashMap0, 1, 2);
        DesignTool.a(v, constraintSet0, ((View)object0), hashMap0, 2, 2);
        DesignTool.a(v, constraintSet0, ((View)object0), hashMap0, 2, 1);
        DesignTool.a(v, constraintSet0, ((View)object0), hashMap0, 3, 3);
        DesignTool.a(v, constraintSet0, ((View)object0), hashMap0, 3, 4);
        DesignTool.a(v, constraintSet0, ((View)object0), hashMap0, 4, 3);
        DesignTool.a(v, constraintSet0, ((View)object0), hashMap0, 4, 4);
        DesignTool.a(v, constraintSet0, ((View)object0), hashMap0, 5, 5);
        DesignTool.x(constraintSet0, ((View)object0), hashMap0, 0);
        DesignTool.x(constraintSet0, ((View)object0), hashMap0, 1);
        DesignTool.v(v, constraintSet0, ((View)object0), hashMap0);
        this.a.f1(v1, constraintSet0);
        this.a.requestLayout();
    }

    private static void x(ConstraintSet constraintSet0, View view0, HashMap hashMap0, int v) {
        String s = (String)hashMap0.get((v == 1 ? "layout_constraintVertical_bias" : "layout_constraintHorizontal_bias"));
        if(s != null) {
            if(v == 0) {
                constraintSet0.i1(view0.getId(), Float.parseFloat(s));
                return;
            }
            if(v == 1) {
                constraintSet0.F1(view0.getId(), Float.parseFloat(s));
            }
        }
    }

    private static void y(int v, ConstraintSet constraintSet0, View view0, HashMap hashMap0, int v1) {
        String s = (String)hashMap0.get((v1 == 1 ? "layout_height" : "layout_width"));
        if(s != null) {
            int v2 = s.equalsIgnoreCase("wrap_content") ? -2 : DesignTool.q(v, s);
            if(v1 == 0) {
                constraintSet0.W(view0.getId(), v2);
                return;
            }
            constraintSet0.P(view0.getId(), v2);
        }
    }

    public void z(Object object0, int v, String s, Object object1) {
        MotionScene motionScene0 = this.a.a;
        if(motionScene0 != null) {
            motionScene0.m0(((View)object0), v, s, object1);
            this.a.q = ((float)v) / 100.0f;
            this.a.o = 0.0f;
            this.a.M0();
            this.a.n0(true);
        }
    }
}

