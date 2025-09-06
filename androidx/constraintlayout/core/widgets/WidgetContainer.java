package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.Cache;
import java.util.ArrayList;

public class WidgetContainer extends ConstraintWidget {
    public ArrayList B1;

    public WidgetContainer() {
        this.B1 = new ArrayList();
    }

    public WidgetContainer(int v, int v1) {
        super(v, v1);
        this.B1 = new ArrayList();
    }

    public WidgetContainer(int v, int v1, int v2, int v3) {
        super(v, v1, v2, v3);
        this.B1 = new ArrayList();
    }

    @Override  // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void R0() {
        this.B1.clear();
        super.R0();
    }

    @Override  // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void R1(int v, int v1) {
        super.R1(v, v1);
        int v2 = this.B1.size();
        for(int v3 = 0; v3 < v2; ++v3) {
            ((ConstraintWidget)this.B1.get(v3)).R1(this.Y(), this.Z());
        }
    }

    @Override  // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void W0(Cache cache0) {
        super.W0(cache0);
        int v = this.B1.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((ConstraintWidget)this.B1.get(v1)).W0(cache0);
        }
    }

    public void a(ConstraintWidget constraintWidget0) {
        this.B1.add(constraintWidget0);
        if(constraintWidget0.U() != null) {
            ((WidgetContainer)constraintWidget0.U()).p2(constraintWidget0);
        }
        constraintWidget0.T1(this);
    }

    public void l2(ConstraintWidget[] arr_constraintWidget) {
        for(int v = 0; v < arr_constraintWidget.length; ++v) {
            this.a(arr_constraintWidget[v]);
        }
    }

    public ArrayList m2() {
        return this.B1;
    }

    public ConstraintWidgetContainer n2() {
        ConstraintWidget constraintWidget0 = this.U();
        ConstraintWidgetContainer constraintWidgetContainer0 = this instanceof ConstraintWidgetContainer ? ((ConstraintWidgetContainer)this) : null;
        while(constraintWidget0 != null) {
            ConstraintWidget constraintWidget1 = constraintWidget0.U();
            if(constraintWidget0 instanceof ConstraintWidgetContainer) {
                constraintWidgetContainer0 = (ConstraintWidgetContainer)constraintWidget0;
            }
            constraintWidget0 = constraintWidget1;
        }
        return constraintWidgetContainer0;
    }

    public void o2() {
        ArrayList arrayList0 = this.B1;
        if(arrayList0 == null) {
            return;
        }
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ConstraintWidget constraintWidget0 = (ConstraintWidget)this.B1.get(v1);
            if(constraintWidget0 instanceof WidgetContainer) {
                ((WidgetContainer)constraintWidget0).o2();
            }
        }
    }

    public void p2(ConstraintWidget constraintWidget0) {
        this.B1.remove(constraintWidget0);
        constraintWidget0.R0();
    }

    public void q2() {
        this.B1.clear();
    }
}

