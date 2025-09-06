package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.Chain;
import androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;

public class WidgetGroup {
    static class MeasureResult {
        WeakReference a;
        int b;
        int c;
        int d;
        int e;
        int f;
        int g;

        MeasureResult(ConstraintWidget constraintWidget0, LinearSystem linearSystem0, int v) {
            this.a = new WeakReference(constraintWidget0);
            this.b = linearSystem0.M(constraintWidget0.Q);
            this.c = linearSystem0.M(constraintWidget0.R);
            this.d = linearSystem0.M(constraintWidget0.S);
            this.e = linearSystem0.M(constraintWidget0.T);
            this.f = linearSystem0.M(constraintWidget0.U);
            this.g = v;
        }

        public void a() {
            Object object0 = this.a.get();
            if(((ConstraintWidget)object0) != null) {
                ((ConstraintWidget)object0).q1(this.b, this.c, this.d, this.e, this.f, this.g);
            }
        }
    }

    ArrayList a;
    int b;
    boolean c;
    int d;
    ArrayList e;
    private int f;
    private static final boolean g = false;
    static int h;

    static {
    }

    public WidgetGroup(int v) {
        this.a = new ArrayList();
        this.c = false;
        this.e = null;
        this.f = -1;
        int v1 = WidgetGroup.h;
        WidgetGroup.h = v1 + 1;
        this.b = v1;
        this.d = v;
    }

    public boolean a(ConstraintWidget constraintWidget0) {
        if(this.a.contains(constraintWidget0)) {
            return false;
        }
        this.a.add(constraintWidget0);
        return true;
    }

    public void b() {
        if(this.e == null) {
            return;
        }
        if(!this.c) {
            return;
        }
        for(int v = 0; v < this.e.size(); ++v) {
            ((MeasureResult)this.e.get(v)).a();
        }
    }

    public void c(ArrayList arrayList0) {
        int v = this.a.size();
        if(this.f != -1 && v > 0) {
            for(int v1 = 0; v1 < arrayList0.size(); ++v1) {
                WidgetGroup widgetGroup0 = (WidgetGroup)arrayList0.get(v1);
                if(this.f == widgetGroup0.b) {
                    this.m(this.d, widgetGroup0);
                }
            }
        }
        if(v == 0) {
            arrayList0.remove(this);
        }
    }

    public void d() {
        this.a.clear();
    }

    private boolean e(ConstraintWidget constraintWidget0) {
        return this.a.contains(constraintWidget0);
    }

    public int f() {
        return this.b;
    }

    public int g() {
        return this.d;
    }

    private String h() {
        int v = this.d;
        if(v == 0) {
            return "Horizontal";
        }
        switch(v) {
            case 1: {
                return "Vertical";
            }
            case 2: {
                return "Both";
            }
            default: {
                return "Unknown";
            }
        }
    }

    public boolean i(WidgetGroup widgetGroup0) {
        for(int v = 0; v < this.a.size(); ++v) {
            if(widgetGroup0.e(((ConstraintWidget)this.a.get(v)))) {
                return true;
            }
        }
        return false;
    }

    public boolean j() {
        return this.c;
    }

    private int k(int v, ConstraintWidget constraintWidget0) {
        DimensionBehaviour constraintWidget$DimensionBehaviour0 = constraintWidget0.z(v);
        if(constraintWidget$DimensionBehaviour0 != DimensionBehaviour.b && constraintWidget$DimensionBehaviour0 != DimensionBehaviour.d && constraintWidget$DimensionBehaviour0 != DimensionBehaviour.a) {
            return -1;
        }
        return v == 0 ? constraintWidget0.m0() : constraintWidget0.D();
    }

    public int l(LinearSystem linearSystem0, int v) {
        return this.a.size() == 0 ? 0 : this.q(linearSystem0, this.a, v);
    }

    public void m(int v, WidgetGroup widgetGroup0) {
        for(Object object0: this.a) {
            ConstraintWidget constraintWidget0 = (ConstraintWidget)object0;
            widgetGroup0.a(constraintWidget0);
            if(v == 0) {
                constraintWidget0.S0 = widgetGroup0.f();
            }
            else {
                constraintWidget0.T0 = widgetGroup0.f();
            }
        }
        this.f = widgetGroup0.b;
    }

    public void n(boolean z) {
        this.c = z;
    }

    public void o(int v) {
        this.d = v;
    }

    public int p() {
        return this.a.size();
    }

    private int q(LinearSystem linearSystem0, ArrayList arrayList0, int v) {
        int v4;
        int v3;
        ConstraintWidgetContainer constraintWidgetContainer0 = (ConstraintWidgetContainer)((ConstraintWidget)arrayList0.get(0)).U();
        linearSystem0.W();
        constraintWidgetContainer0.g(linearSystem0, false);
        for(int v2 = 0; v2 < arrayList0.size(); ++v2) {
            ((ConstraintWidget)arrayList0.get(v2)).g(linearSystem0, false);
        }
        if(v == 0 && constraintWidgetContainer0.N1 > 0) {
            Chain.b(constraintWidgetContainer0, linearSystem0, arrayList0, 0);
        }
        if(v == 1 && constraintWidgetContainer0.O1 > 0) {
            Chain.b(constraintWidgetContainer0, linearSystem0, arrayList0, 1);
        }
        try {
            linearSystem0.R();
        }
        catch(Exception exception0) {
            System.err.println(exception0.toString() + "\n" + Arrays.toString(exception0.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.e = new ArrayList();
        for(int v1 = 0; v1 < arrayList0.size(); ++v1) {
            MeasureResult widgetGroup$MeasureResult0 = new MeasureResult(((ConstraintWidget)arrayList0.get(v1)), linearSystem0, v);
            this.e.add(widgetGroup$MeasureResult0);
        }
        if(v == 0) {
            v3 = linearSystem0.M(constraintWidgetContainer0.Q);
            v4 = linearSystem0.M(constraintWidgetContainer0.S);
            linearSystem0.W();
            return v4 - v3;
        }
        v3 = linearSystem0.M(constraintWidgetContainer0.R);
        v4 = linearSystem0.M(constraintWidgetContainer0.T);
        linearSystem0.W();
        return v4 - v3;
    }

    @Override
    public String toString() {
        String s = this.h() + " [" + this.b + "] <";
        for(Object object0: this.a) {
            s = s + " " + ((ConstraintWidget)object0).y();
        }
        return s + " >";
    }
}

