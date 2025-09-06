package androidx.constraintlayout.core.state;

import androidx.annotation.NonNull;
import androidx.constraintlayout.core.state.helpers.AlignHorizontallyReference;
import androidx.constraintlayout.core.state.helpers.AlignVerticallyReference;
import androidx.constraintlayout.core.state.helpers.BarrierReference;
import androidx.constraintlayout.core.state.helpers.FlowReference;
import androidx.constraintlayout.core.state.helpers.GridReference;
import androidx.constraintlayout.core.state.helpers.GuidelineReference;
import androidx.constraintlayout.core.state.helpers.HorizontalChainReference;
import androidx.constraintlayout.core.state.helpers.VerticalChainReference;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.HelperWidget;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class State {
    public static enum Chain {
        SPREAD,
        SPREAD_INSIDE,
        PACKED;

        public static Map d;
        public static Map e;

        static {
            Chain.d = new HashMap();
            Chain.e = new HashMap();
            Chain.d.put("packed", Chain.c);
            Chain.d.put("spread_inside", Chain.b);
            Chain.d.put("spread", Chain.a);
            Chain.e.put("packed", 2);
            Chain.e.put("spread_inside", 1);
            Chain.e.put("spread", 0);
        }

        private static Chain[] a() [...] // Inlined contents

        // 去混淆评级： 低(20)
        public static Chain b(String s) {
            return Chain.d.containsKey(s) ? ((Chain)Chain.d.get(s)) : null;
        }

        // 去混淆评级： 低(20)
        public static int c(String s) {
            return Chain.e.containsKey(s) ? ((int)(((Integer)Chain.e.get(s)))) : -1;
        }
    }

    public static enum Constraint {
        LEFT_TO_LEFT,
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT,
        RIGHT_TO_RIGHT,
        START_TO_START,
        START_TO_END,
        END_TO_START,
        END_TO_END,
        TOP_TO_TOP,
        TOP_TO_BOTTOM,
        TOP_TO_BASELINE,
        BOTTOM_TO_TOP,
        BOTTOM_TO_BOTTOM,
        BOTTOM_TO_BASELINE,
        BASELINE_TO_BASELINE,
        BASELINE_TO_TOP,
        BASELINE_TO_BOTTOM,
        CENTER_HORIZONTALLY,
        CENTER_VERTICALLY,
        CIRCULAR_CONSTRAINT;

        private static Constraint[] a() [...] // Inlined contents
    }

    public static enum Direction {
        LEFT,
        RIGHT,
        START,
        END,
        TOP,
        BOTTOM;

        private static Direction[] a() [...] // Inlined contents
    }

    public static enum Helper {
        HORIZONTAL_CHAIN,
        VERTICAL_CHAIN,
        ALIGN_HORIZONTALLY,
        ALIGN_VERTICALLY,
        BARRIER,
        LAYER,
        HORIZONTAL_FLOW,
        VERTICAL_FLOW,
        GRID,
        ROW,
        COLUMN,
        FLOW;

        private static Helper[] a() [...] // Inlined contents
    }

    public static enum Wrap {
        NONE,
        CHAIN,
        ALIGNED;

        public static Map d;
        public static Map e;

        static {
            Wrap.d = new HashMap();
            Wrap.e = new HashMap();
            Wrap.d.put("none", Wrap.a);
            Wrap.d.put("chain", Wrap.b);
            Wrap.d.put("aligned", Wrap.c);
            Wrap.e.put("none", 0);
            Wrap.e.put("chain", 3);
            Wrap.e.put("aligned", 2);
        }

        private static Wrap[] a() [...] // Inlined contents

        // 去混淆评级： 低(20)
        public static Wrap b(String s) {
            return Wrap.d.containsKey(s) ? ((Wrap)Wrap.d.get(s)) : null;
        }

        // 去混淆评级： 低(20)
        public static int c(String s) {
            return Wrap.e.containsKey(s) ? ((int)(((Integer)Wrap.e.get(s)))) : -1;
        }
    }

    private CorePixelDp a;
    private boolean b;
    protected HashMap c;
    protected HashMap d;
    HashMap e;
    public final ConstraintReference f;
    private int g;
    ArrayList h;
    ArrayList i;
    boolean j;
    static final int k = -1;
    static final int l = 0;
    static final int m = 1;
    static final int n = 2;
    public static final Integer o;

    static {
        State.o = 0;
    }

    public State() {
        this.b = true;
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = new HashMap();
        ConstraintReference constraintReference0 = new ConstraintReference(this);
        this.f = constraintReference0;
        this.g = 0;
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = true;
        constraintReference0.c(State.o);
        this.c.put(State.o, constraintReference0);
    }

    public boolean A() {
        return !this.b;
    }

    public void B(Object object0, Object object1) {
        ConstraintReference constraintReference0 = this.f(object0);
        if(constraintReference0 != null) {
            constraintReference0.z0(object1);
        }
    }

    Reference C(Object object0) {
        return (Reference)this.c.get(object0);
    }

    public void D() {
        for(Object object0: this.c.keySet()) {
            ((Reference)this.c.get(object0)).a().R0();
        }
        this.c.clear();
        this.c.put(State.o, this.f);
        this.d.clear();
        this.e.clear();
        this.h.clear();
        this.j = true;
    }

    public boolean E(int v) {
        return this.f.G().k(v);
    }

    public boolean F(int v) {
        return this.f.Y().k(v);
    }

    public void G(CorePixelDp corePixelDp0) {
        this.a = corePixelDp0;
    }

    public State H(Dimension dimension0) {
        this.f.t0(dimension0);
        return this;
    }

    @Deprecated
    public void I(boolean z) {
        this.b = z;
    }

    public void J(boolean z) {
        this.b = !z;
    }

    public void K(String s, String s1) {
        ArrayList arrayList0;
        ConstraintReference constraintReference0 = this.f(s);
        if(constraintReference0 instanceof ConstraintReference) {
            constraintReference0.w0(s1);
            if(this.e.containsKey(s1)) {
                arrayList0 = (ArrayList)this.e.get(s1);
            }
            else {
                arrayList0 = new ArrayList();
                this.e.put(s1, arrayList0);
            }
            arrayList0.add(s);
        }
    }

    public State L(Dimension dimension0) {
        this.f.A0(dimension0);
        return this;
    }

    public VerticalChainReference M() {
        return (VerticalChainReference)this.u(null, Helper.b);
    }

    public VerticalChainReference N(Object[] arr_object) {
        VerticalChainReference verticalChainReference0 = (VerticalChainReference)this.u(null, Helper.b);
        verticalChainReference0.P0(arr_object);
        return verticalChainReference0;
    }

    public GuidelineReference O(Object object0) {
        return this.s(object0, 1);
    }

    public State P(Dimension dimension0) {
        return this.L(dimension0);
    }

    public void a(ConstraintWidgetContainer constraintWidgetContainer0) {
        constraintWidgetContainer0.q2();
        this.f.Y().a(this, constraintWidgetContainer0, 0);
        this.f.G().a(this, constraintWidgetContainer0, 1);
        for(Object object0: this.d.keySet()) {
            HelperWidget helperWidget0 = ((HelperReference)this.d.get(object0)).R0();
            if(helperWidget0 != null) {
                Reference reference0 = (Reference)this.c.get(object0);
                if(reference0 == null) {
                    reference0 = this.f(object0);
                }
                reference0.b(helperWidget0);
            }
        }
        for(Object object1: this.c.keySet()) {
            Reference reference1 = (Reference)this.c.get(object1);
            if(reference1 != this.f && reference1.d() instanceof HelperReference) {
                HelperWidget helperWidget1 = ((HelperReference)reference1.d()).R0();
                if(helperWidget1 != null) {
                    Reference reference2 = (Reference)this.c.get(object1);
                    if(reference2 == null) {
                        reference2 = this.f(object1);
                    }
                    reference2.b(helperWidget1);
                }
            }
        }
        for(Object object2: this.c.keySet()) {
            Reference reference3 = (Reference)this.c.get(object2);
            if(reference3 == this.f) {
                reference3.b(constraintWidgetContainer0);
            }
            else {
                ConstraintWidget constraintWidget0 = reference3.a();
                constraintWidget0.k1(reference3.getKey().toString());
                constraintWidget0.T1(null);
                if(reference3.d() instanceof GuidelineReference) {
                    reference3.apply();
                }
                constraintWidgetContainer0.a(constraintWidget0);
            }
        }
        for(Object object3: this.d.keySet()) {
            HelperReference helperReference0 = (HelperReference)this.d.get(object3);
            if(helperReference0.R0() != null) {
                for(Object object4: helperReference0.o0) {
                    Reference reference4 = (Reference)this.c.get(object4);
                    helperReference0.R0().a(reference4.a());
                }
            }
            helperReference0.apply();
        }
        for(Object object5: this.c.keySet()) {
            Reference reference5 = (Reference)this.c.get(object5);
            if(reference5 != this.f && reference5.d() instanceof HelperReference) {
                HelperReference helperReference1 = (HelperReference)reference5.d();
                HelperWidget helperWidget2 = helperReference1.R0();
                if(helperWidget2 != null) {
                    for(Object object6: helperReference1.o0) {
                        Reference reference6 = (Reference)this.c.get(object6);
                        if(reference6 != null) {
                            helperWidget2.a(reference6.a());
                        }
                        else if(object6 instanceof Reference) {
                            helperWidget2.a(((Reference)object6).a());
                        }
                        else {
                            System.out.println("couldn\'t find reference for " + object6);
                        }
                    }
                    reference5.apply();
                }
            }
        }
        for(Object object7: this.c.keySet()) {
            Reference reference7 = (Reference)this.c.get(object7);
            reference7.apply();
            ConstraintWidget constraintWidget1 = reference7.a();
            if(constraintWidget1 != null && object7 != null) {
                constraintWidget1.o = object7.toString();
            }
        }
    }

    public BarrierReference b(Object object0, Direction state$Direction0) {
        ConstraintReference constraintReference0 = this.f(object0);
        if(constraintReference0.d() == null || !(constraintReference0.d() instanceof BarrierReference)) {
            BarrierReference barrierReference0 = new BarrierReference(this);
            barrierReference0.U0(state$Direction0);
            constraintReference0.s0(barrierReference0);
        }
        return (BarrierReference)constraintReference0.d();
    }

    public void c(Object object0) {
        this.h.add(object0);
        this.j = true;
    }

    public AlignHorizontallyReference d(Object[] arr_object) {
        AlignHorizontallyReference alignHorizontallyReference0 = (AlignHorizontallyReference)this.u(null, Helper.c);
        alignHorizontallyReference0.P0(arr_object);
        return alignHorizontallyReference0;
    }

    public AlignVerticallyReference e(Object[] arr_object) {
        AlignVerticallyReference alignVerticallyReference0 = (AlignVerticallyReference)this.u(null, Helper.d);
        alignVerticallyReference0.P0(arr_object);
        return alignVerticallyReference0;
    }

    public ConstraintReference f(Object object0) {
        Reference reference0 = (Reference)this.c.get(object0);
        if(reference0 == null) {
            reference0 = this.h(object0);
            this.c.put(object0, reference0);
            reference0.c(object0);
        }
        return reference0 instanceof ConstraintReference ? ((ConstraintReference)reference0) : null;
    }

    public int g(Object object0) {
        if(object0 instanceof Float) {
            return Math.round(((float)(((Float)object0))));
        }
        return object0 instanceof Integer ? ((int)(((Integer)object0))) : 0;
    }

    public ConstraintReference h(Object object0) {
        return new ConstraintReference(this);
    }

    private String i() [...] // 潜在的解密器

    public void j() {
        for(Object object0: this.c.keySet()) {
            ConstraintReference constraintReference0 = this.f(object0);
            if(constraintReference0 instanceof ConstraintReference) {
                constraintReference0.z0(object0);
            }
        }
    }

    CorePixelDp k() {
        return this.a;
    }

    public FlowReference l(Object object0, boolean z) {
        ConstraintReference constraintReference0 = this.f(object0);
        if(constraintReference0.d() == null || !(constraintReference0.d() instanceof FlowReference)) {
            constraintReference0.s0((z ? new FlowReference(this, Helper.h) : new FlowReference(this, Helper.g)));
        }
        return (FlowReference)constraintReference0.d();
    }

    @NonNull
    public GridReference m(@NonNull Object object0, @NonNull String s) {
        ConstraintReference constraintReference0 = this.f(object0);
        if(constraintReference0.d() == null || !(constraintReference0.d() instanceof GridReference)) {
            Helper state$Helper0 = Helper.i;
            if(s.charAt(0) == 0x72) {
                state$Helper0 = Helper.j;
            }
            else if(s.charAt(0) == 99) {
                state$Helper0 = Helper.k;
            }
            constraintReference0.s0(new GridReference(this, state$Helper0));
        }
        return (GridReference)constraintReference0.d();
    }

    public FlowReference n() {
        return (FlowReference)this.u(null, Helper.g);
    }

    public FlowReference o(Object[] arr_object) {
        FlowReference flowReference0 = (FlowReference)this.u(null, Helper.g);
        flowReference0.P0(arr_object);
        return flowReference0;
    }

    // 去混淆评级： 低(20)
    public ArrayList p(String s) {
        return this.e.containsKey(s) ? ((ArrayList)this.e.get(s)) : null;
    }

    public FlowReference q() {
        return (FlowReference)this.u(null, Helper.h);
    }

    public FlowReference r(Object[] arr_object) {
        FlowReference flowReference0 = (FlowReference)this.u(null, Helper.h);
        flowReference0.P0(arr_object);
        return flowReference0;
    }

    public GuidelineReference s(Object object0, int v) {
        ConstraintReference constraintReference0 = this.f(object0);
        if(constraintReference0.d() == null || !(constraintReference0.d() instanceof GuidelineReference)) {
            GuidelineReference guidelineReference0 = new GuidelineReference(this);
            guidelineReference0.h(v);
            guidelineReference0.c(object0);
            constraintReference0.s0(guidelineReference0);
        }
        return (GuidelineReference)constraintReference0.d();
    }

    public State t(Dimension dimension0) {
        return this.H(dimension0);
    }

    public HelperReference u(Object object0, Helper state$Helper0) {
        if(object0 == null) {
            object0 = "__HELPER_KEY_0__";
        }
        HelperReference helperReference0 = (HelperReference)this.d.get(object0);
        if(helperReference0 == null) {
            switch(state$Helper0.ordinal()) {
                case 0: {
                    helperReference0 = new HorizontalChainReference(this);
                    break;
                }
                case 1: {
                    helperReference0 = new VerticalChainReference(this);
                    break;
                }
                case 2: {
                    helperReference0 = new AlignHorizontallyReference(this);
                    break;
                }
                case 3: {
                    helperReference0 = new AlignVerticallyReference(this);
                    break;
                }
                case 4: {
                    helperReference0 = new BarrierReference(this);
                    break;
                }
                case 6: 
                case 7: {
                    helperReference0 = new FlowReference(this, state$Helper0);
                    break;
                }
                case 8: 
                case 9: 
                case 10: {
                    helperReference0 = new GridReference(this, state$Helper0);
                    break;
                }
                default: {
                    helperReference0 = new HelperReference(this, state$Helper0);
                }
            }
            helperReference0.c(object0);
            this.d.put(object0, helperReference0);
        }
        return helperReference0;
    }

    public HorizontalChainReference v() {
        return (HorizontalChainReference)this.u(null, Helper.a);
    }

    public HorizontalChainReference w(Object[] arr_object) {
        HorizontalChainReference horizontalChainReference0 = (HorizontalChainReference)this.u(null, Helper.a);
        horizontalChainReference0.P0(arr_object);
        return horizontalChainReference0;
    }

    public GuidelineReference x(Object object0) {
        return this.s(object0, 0);
    }

    public boolean y(ConstraintWidget constraintWidget0) {
        if(this.j) {
            this.i.clear();
            for(Object object0: this.h) {
                ConstraintWidget constraintWidget1 = ((Reference)this.c.get(object0)).a();
                if(constraintWidget1 != null) {
                    this.i.add(constraintWidget1);
                }
            }
            this.j = false;
        }
        return this.i.contains(constraintWidget0);
    }

    @Deprecated
    public boolean z() {
        return this.b;
    }
}

