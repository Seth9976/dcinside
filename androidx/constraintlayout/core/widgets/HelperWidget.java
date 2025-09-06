package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.widgets.analyzer.Grouping;
import androidx.constraintlayout.core.widgets.analyzer.WidgetGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class HelperWidget extends ConstraintWidget implements Helper {
    public ConstraintWidget[] B1;
    public int C1;

    public HelperWidget() {
        this.B1 = new ConstraintWidget[4];
        this.C1 = 0;
    }

    @Override  // androidx.constraintlayout.core.widgets.Helper
    public void a(ConstraintWidget constraintWidget0) {
        if(constraintWidget0 != this && constraintWidget0 != null) {
            ConstraintWidget[] arr_constraintWidget = this.B1;
            if(this.C1 + 1 > arr_constraintWidget.length) {
                this.B1 = (ConstraintWidget[])Arrays.copyOf(arr_constraintWidget, arr_constraintWidget.length * 2);
            }
            int v = this.C1;
            this.B1[v] = constraintWidget0;
            this.C1 = v + 1;
        }
    }

    @Override  // androidx.constraintlayout.core.widgets.Helper
    public void b() {
        this.C1 = 0;
        Arrays.fill(this.B1, null);
    }

    @Override  // androidx.constraintlayout.core.widgets.Helper
    public void c(ConstraintWidgetContainer constraintWidgetContainer0) {
    }

    public void l2(ArrayList arrayList0, int v, WidgetGroup widgetGroup0) {
        for(int v2 = 0; v2 < this.C1; ++v2) {
            widgetGroup0.a(this.B1[v2]);
        }
        for(int v1 = 0; v1 < this.C1; ++v1) {
            Grouping.a(this.B1[v1], v, arrayList0, widgetGroup0);
        }
    }

    public int m2(int v) {
        for(int v1 = 0; v1 < this.C1; ++v1) {
            ConstraintWidget constraintWidget0 = this.B1[v1];
            if(v == 0) {
                int v2 = constraintWidget0.S0;
                if(v2 != -1) {
                    return v2;
                }
            }
            if(v == 1) {
                int v3 = constraintWidget0.T0;
                if(v3 != -1) {
                    return v3;
                }
            }
        }
        return -1;
    }

    @Override  // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void n(ConstraintWidget constraintWidget0, HashMap hashMap0) {
        super.n(constraintWidget0, hashMap0);
        this.C1 = 0;
        int v1 = ((HelperWidget)constraintWidget0).C1;
        for(int v = 0; v < v1; ++v) {
            this.a(((ConstraintWidget)hashMap0.get(((HelperWidget)constraintWidget0).B1[v])));
        }
    }
}

