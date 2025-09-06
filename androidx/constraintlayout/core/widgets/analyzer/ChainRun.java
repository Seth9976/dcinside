package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import java.util.ArrayList;

public class ChainRun extends WidgetRun {
    ArrayList k;
    private int l;

    public ChainRun(ConstraintWidget constraintWidget0, int v) {
        super(constraintWidget0);
        this.k = new ArrayList();
        this.f = v;
        this.u();
    }

    @Override  // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void a(Dependency dependency0) {
        int v30;
        int v27;
        int v26;
        boolean z3;
        int v23;
        boolean z2;
        int v22;
        int v21;
        float f3;
        int v20;
        int v19;
        int v14;
        int v13;
        float f;
        int v9;
        int v8;
        int v3;
        if(this.h.j && this.i.j) {
            ConstraintWidget constraintWidget0 = this.b.U();
            boolean z = constraintWidget0 instanceof ConstraintWidgetContainer ? ((ConstraintWidgetContainer)constraintWidget0).P2() : false;
            int v = this.i.g - this.h.g;
            int v1 = this.k.size();
            int v2;
            for(v2 = 0; true; ++v2) {
                v3 = -1;
                if(v2 >= v1) {
                    v2 = -1;
                    break;
                }
                if(((WidgetRun)this.k.get(v2)).b.l0() != 8) {
                    break;
                }
            }
            int v4 = v1 - 1;
            while(v4 >= 0) {
                if(((WidgetRun)this.k.get(v4)).b.l0() == 8) {
                    --v4;
                }
                else {
                    v3 = v4;
                    if(true) {
                        break;
                    }
                }
            }
            int v5 = 0;
            int v6 = 0;
            while(v6 < 2) {
                int v7 = 0;
                v8 = 0;
                v9 = 0;
                int v10 = 0;
                f = 0.0f;
                while(v7 < v1) {
                    WidgetRun widgetRun0 = (WidgetRun)this.k.get(v7);
                    if(widgetRun0.b.l0() != 8) {
                        ++v10;
                        if(v7 > 0 && v7 >= v2) {
                            v8 += widgetRun0.h.f;
                        }
                        DimensionDependency dimensionDependency0 = widgetRun0.e;
                        int v11 = dimensionDependency0.g;
                        boolean z1 = widgetRun0.d != DimensionBehaviour.c;
                        if(z1) {
                            int v12 = this.f;
                            if(v12 == 0 && !widgetRun0.b.e.e.j) {
                                return;
                            }
                            if(v12 == 1 && !widgetRun0.b.f.e.j) {
                                return;
                            }
                            v13 = v11;
                        }
                        else {
                            v13 = v11;
                            if(widgetRun0.a == 1 && v6 == 0) {
                                v14 = dimensionDependency0.m;
                                ++v9;
                                z1 = true;
                                goto label_56;
                            }
                            else if(dimensionDependency0.j) {
                                v14 = v13;
                                z1 = true;
                                goto label_56;
                            }
                        }
                        v14 = v13;
                    label_56:
                        if(z1) {
                            v8 += v14;
                        }
                        else {
                            ++v9;
                            float f1 = widgetRun0.b.N0[this.f];
                            if(f1 >= 0.0f) {
                                f += f1;
                            }
                        }
                        if(v7 < v1 - 1 && v7 < v3) {
                            v8 -= widgetRun0.i.f;
                        }
                    }
                    ++v7;
                }
                if(v8 < v || v9 == 0) {
                    v5 = v10;
                }
                else {
                    ++v6;
                    continue;
                }
                goto label_75;
            }
            v8 = 0;
            v9 = 0;
            f = 0.0f;
        label_75:
            int v15 = z ? this.i.g : this.h.g;
            if(v8 > v) {
                v15 = z ? v15 + ((int)(((float)(v8 - v)) / 2.0f + 0.5f)) : v15 - ((int)(((float)(v8 - v)) / 2.0f + 0.5f));
            }
            if(v9 > 0) {
                float f2 = (float)(v - v8);
                int v16 = (int)(f2 / ((float)v9) + 0.5f);
                int v17 = 0;
                int v18 = 0;
                while(v17 < v1) {
                    WidgetRun widgetRun1 = (WidgetRun)this.k.get(v17);
                    if(widgetRun1.b.l0() == 8 || widgetRun1.d != DimensionBehaviour.c) {
                        z2 = z;
                        v23 = v5;
                        v19 = v15;
                        f3 = f2;
                    }
                    else {
                        DimensionDependency dimensionDependency1 = widgetRun1.e;
                        if(!dimensionDependency1.j) {
                            if(f > 0.0f) {
                                v19 = v15;
                                v20 = (int)(widgetRun1.b.N0[this.f] * f2 / f + 0.5f);
                            }
                            else {
                                v19 = v15;
                                v20 = v16;
                            }
                            if(this.f == 0) {
                                f3 = f2;
                                v21 = widgetRun1.b.A;
                                v22 = widgetRun1.b.z;
                                z2 = z;
                            }
                            else {
                                f3 = f2;
                                z2 = z;
                                v22 = widgetRun1.b.C;
                                v21 = widgetRun1.b.D;
                            }
                            v23 = v5;
                            int v24 = widgetRun1.a == 1 ? Math.min(v20, dimensionDependency1.m) : v20;
                            int v25 = v21 <= 0 ? Math.max(v22, v24) : Math.min(v21, Math.max(v22, v24));
                            if(v25 != v20) {
                                ++v18;
                                v20 = v25;
                            }
                            widgetRun1.e.e(v20);
                        }
                    }
                    ++v17;
                    v15 = v19;
                    f2 = f3;
                    z = z2;
                    v5 = v23;
                }
                z3 = z;
                v26 = v5;
                v27 = v15;
                if(v18 > 0) {
                    v9 -= v18;
                    v8 = 0;
                    for(int v28 = 0; v28 < v1; ++v28) {
                        WidgetRun widgetRun2 = (WidgetRun)this.k.get(v28);
                        if(widgetRun2.b.l0() != 8) {
                            if(v28 > 0 && v28 >= v2) {
                                v8 += widgetRun2.h.f;
                            }
                            v8 += widgetRun2.e.g;
                            if(v28 < v1 - 1 && v28 < v3) {
                                v8 -= widgetRun2.i.f;
                            }
                        }
                    }
                }
                if(this.l == 2 && v18 == 0) {
                    this.l = 0;
                }
            }
            else {
                z3 = z;
                v26 = v5;
                v27 = v15;
            }
            if(v8 > v) {
                this.l = 2;
            }
            if(v26 > 0 && v9 == 0 && v2 == v3) {
                this.l = 2;
            }
            int v29 = this.l;
            if(v29 == 1) {
                if(v26 > 1) {
                    v30 = (v - v8) / (v26 - 1);
                }
                else {
                    v30 = v26 == 1 ? (v - v8) / 2 : 0;
                }
                if(v9 > 0) {
                    v30 = 0;
                }
                int v31 = v27;
                for(int v32 = 0; v32 < v1; ++v32) {
                    WidgetRun widgetRun3 = (WidgetRun)this.k.get((z3 ? v1 - (v32 + 1) : v32));
                    if(widgetRun3.b.l0() == 8) {
                        widgetRun3.h.e(v31);
                        widgetRun3.i.e(v31);
                    }
                    else {
                        if(v32 > 0) {
                            v31 = z3 ? v31 - v30 : v31 + v30;
                        }
                        if(v32 > 0 && v32 >= v2) {
                            v31 = z3 ? v31 - widgetRun3.h.f : v31 + widgetRun3.h.f;
                        }
                        if(z3) {
                            widgetRun3.i.e(v31);
                        }
                        else {
                            widgetRun3.h.e(v31);
                        }
                        int v33 = widgetRun3.d != DimensionBehaviour.c || widgetRun3.a != 1 ? widgetRun3.e.g : widgetRun3.e.m;
                        v31 = z3 ? v31 - v33 : v31 + v33;
                        if(z3) {
                            widgetRun3.h.e(v31);
                        }
                        else {
                            widgetRun3.i.e(v31);
                        }
                        widgetRun3.g = true;
                        if(v32 < v1 - 1 && v32 < v3) {
                            v31 = z3 ? v31 - -widgetRun3.i.f : v31 - widgetRun3.i.f;
                        }
                    }
                }
                return;
            }
        alab1:
            switch(v29) {
                case 0: {
                    int v34 = (v - v8) / (v26 + 1);
                    if(v9 > 0) {
                        v34 = 0;
                    }
                    int v35 = v27;
                    for(int v36 = 0; v36 < v1; ++v36) {
                        WidgetRun widgetRun4 = (WidgetRun)this.k.get((z3 ? v1 - (v36 + 1) : v36));
                        if(widgetRun4.b.l0() == 8) {
                            widgetRun4.h.e(v35);
                            widgetRun4.i.e(v35);
                        }
                        else {
                            int v37 = z3 ? v35 - v34 : v35 + v34;
                            if(v36 > 0 && v36 >= v2) {
                                v37 = z3 ? v37 - widgetRun4.h.f : v37 + widgetRun4.h.f;
                            }
                            if(z3) {
                                widgetRun4.i.e(v37);
                            }
                            else {
                                widgetRun4.h.e(v37);
                            }
                            int v38 = widgetRun4.d != DimensionBehaviour.c || widgetRun4.a != 1 ? widgetRun4.e.g : Math.min(widgetRun4.e.g, widgetRun4.e.m);
                            v35 = z3 ? v37 - v38 : v37 + v38;
                            if(z3) {
                                widgetRun4.h.e(v35);
                            }
                            else {
                                widgetRun4.i.e(v35);
                            }
                            if(v36 < v1 - 1 && v36 < v3) {
                                v35 = z3 ? v35 - -widgetRun4.i.f : v35 - widgetRun4.i.f;
                            }
                        }
                    }
                    return;
                }
                case 2: {
                    float f4 = this.f == 0 ? this.b.E() : this.b.g0();
                    if(z3) {
                        f4 = 1.0f - f4;
                    }
                    int v39 = ((int)(((float)(v - v8)) * f4 + 0.5f)) >= 0 && v9 <= 0 ? ((int)(((float)(v - v8)) * f4 + 0.5f)) : 0;
                    int v40 = z3 ? v27 - v39 : v27 + v39;
                    for(int v41 = 0; true; ++v41) {
                        if(v41 >= v1) {
                            break alab1;
                        }
                        WidgetRun widgetRun5 = (WidgetRun)this.k.get((z3 ? v1 - (v41 + 1) : v41));
                        if(widgetRun5.b.l0() == 8) {
                            widgetRun5.h.e(v40);
                            widgetRun5.i.e(v40);
                        }
                        else {
                            if(v41 > 0 && v41 >= v2) {
                                v40 = z3 ? v40 - widgetRun5.h.f : v40 + widgetRun5.h.f;
                            }
                            if(z3) {
                                widgetRun5.i.e(v40);
                            }
                            else {
                                widgetRun5.h.e(v40);
                            }
                            int v42 = widgetRun5.d != DimensionBehaviour.c || widgetRun5.a != 1 ? widgetRun5.e.g : widgetRun5.e.m;
                            v40 = z3 ? v40 - v42 : v40 + v42;
                            if(z3) {
                                widgetRun5.h.e(v40);
                            }
                            else {
                                widgetRun5.i.e(v40);
                            }
                            if(v41 < v1 - 1 && v41 < v3) {
                                v40 = z3 ? v40 - -widgetRun5.i.f : v40 - widgetRun5.i.f;
                            }
                        }
                    }
                }
            }
        }
    }

    @Override  // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void d() {
        for(Object object0: this.k) {
            ((WidgetRun)object0).d();
        }
        int v = this.k.size();
        if(v < 1) {
            return;
        }
        ConstraintWidget constraintWidget0 = ((WidgetRun)this.k.get(0)).b;
        ConstraintWidget constraintWidget1 = ((WidgetRun)this.k.get(v - 1)).b;
        if(this.f == 0) {
            ConstraintAnchor constraintAnchor0 = constraintWidget0.Q;
            ConstraintAnchor constraintAnchor1 = constraintWidget1.S;
            DependencyNode dependencyNode0 = this.i(constraintAnchor0, 0);
            int v1 = constraintAnchor0.g();
            ConstraintWidget constraintWidget2 = this.v();
            if(constraintWidget2 != null) {
                v1 = constraintWidget2.Q.g();
            }
            if(dependencyNode0 != null) {
                this.b(this.h, dependencyNode0, v1);
            }
            DependencyNode dependencyNode1 = this.i(constraintAnchor1, 0);
            int v2 = constraintAnchor1.g();
            ConstraintWidget constraintWidget3 = this.w();
            if(constraintWidget3 != null) {
                v2 = constraintWidget3.S.g();
            }
            if(dependencyNode1 != null) {
                this.b(this.i, dependencyNode1, -v2);
            }
        }
        else {
            ConstraintAnchor constraintAnchor2 = constraintWidget0.R;
            ConstraintAnchor constraintAnchor3 = constraintWidget1.T;
            DependencyNode dependencyNode2 = this.i(constraintAnchor2, 1);
            int v3 = constraintAnchor2.g();
            ConstraintWidget constraintWidget4 = this.v();
            if(constraintWidget4 != null) {
                v3 = constraintWidget4.R.g();
            }
            if(dependencyNode2 != null) {
                this.b(this.h, dependencyNode2, v3);
            }
            DependencyNode dependencyNode3 = this.i(constraintAnchor3, 1);
            int v4 = constraintAnchor3.g();
            ConstraintWidget constraintWidget5 = this.w();
            if(constraintWidget5 != null) {
                v4 = constraintWidget5.T.g();
            }
            if(dependencyNode3 != null) {
                this.b(this.i, dependencyNode3, -v4);
            }
        }
        this.h.a = this;
        this.i.a = this;
    }

    @Override  // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void e() {
        for(int v = 0; v < this.k.size(); ++v) {
            ((WidgetRun)this.k.get(v)).e();
        }
    }

    @Override  // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void f() {
        this.c = null;
        for(Object object0: this.k) {
            ((WidgetRun)object0).f();
        }
    }

    @Override  // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public long j() {
        int v = this.k.size();
        long v1 = 0L;
        for(int v2 = 0; v2 < v; ++v2) {
            WidgetRun widgetRun0 = (WidgetRun)this.k.get(v2);
            v1 = v1 + ((long)widgetRun0.h.f) + widgetRun0.j() + ((long)widgetRun0.i.f);
        }
        return v1;
    }

    @Override  // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    void n() {
        this.h.j = false;
        this.i.j = false;
    }

    @Override  // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    boolean p() {
        int v = this.k.size();
        for(int v1 = 0; v1 < v; ++v1) {
            if(!((WidgetRun)this.k.get(v1)).p()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("ChainRun ");
        stringBuilder0.append((this.f == 0 ? "horizontal : " : "vertical : "));
        for(Object object0: this.k) {
            stringBuilder0.append("<");
            stringBuilder0.append(((WidgetRun)object0));
            stringBuilder0.append("> ");
        }
        return stringBuilder0.toString();
    }

    private void u() {
        ConstraintWidget constraintWidget2;
        ConstraintWidget constraintWidget0 = this.b;
        for(ConstraintWidget constraintWidget1 = constraintWidget0.V(this.f); true; constraintWidget1 = constraintWidget0.V(this.f)) {
            constraintWidget2 = constraintWidget0;
            constraintWidget0 = constraintWidget1;
            if(constraintWidget0 == null) {
                break;
            }
        }
        this.b = constraintWidget2;
        this.k.add(constraintWidget2.a0(this.f));
        for(ConstraintWidget constraintWidget3 = constraintWidget2.R(this.f); constraintWidget3 != null; constraintWidget3 = constraintWidget3.R(this.f)) {
            this.k.add(constraintWidget3.a0(this.f));
        }
        for(Object object0: this.k) {
            WidgetRun widgetRun0 = (WidgetRun)object0;
            int v = this.f;
            if(v == 0) {
                widgetRun0.b.c = this;
            }
            else if(v == 1) {
                widgetRun0.b.d = this;
            }
        }
        if(this.f == 0 && ((ConstraintWidgetContainer)this.b.U()).P2() && this.k.size() > 1) {
            this.b = ((WidgetRun)this.k.get(this.k.size() - 1)).b;
        }
        this.l = this.f == 0 ? this.b.G() : this.b.i0();
    }

    private ConstraintWidget v() {
        for(int v = 0; v < this.k.size(); ++v) {
            WidgetRun widgetRun0 = (WidgetRun)this.k.get(v);
            if(widgetRun0.b.l0() != 8) {
                return widgetRun0.b;
            }
        }
        return null;
    }

    private ConstraintWidget w() {
        for(int v = this.k.size() - 1; v >= 0; --v) {
            WidgetRun widgetRun0 = (WidgetRun)this.k.get(v);
            if(widgetRun0.b.l0() != 8) {
                return widgetRun0.b;
            }
        }
        return null;
    }
}

