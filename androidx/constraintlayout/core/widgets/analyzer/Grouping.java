package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.Metrics;
import androidx.constraintlayout.core.widgets.Barrier;
import androidx.constraintlayout.core.widgets.ConstraintAnchor.Type;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Flow;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.HelperWidget;
import java.util.ArrayList;

public class Grouping {
    private static final boolean a = false;
    private static final boolean b = false;
    private static final boolean c = true;

    public static WidgetGroup a(ConstraintWidget constraintWidget0, int v, ArrayList arrayList0, WidgetGroup widgetGroup0) {
        int v1 = v == 0 ? constraintWidget0.S0 : constraintWidget0.T0;
        int v2 = 0;
        if(v1 != -1 && (widgetGroup0 == null || v1 != widgetGroup0.f())) {
            for(int v3 = 0; v3 < arrayList0.size(); ++v3) {
                WidgetGroup widgetGroup1 = (WidgetGroup)arrayList0.get(v3);
                if(widgetGroup1.f() == v1) {
                    if(widgetGroup0 != null) {
                        widgetGroup0.m(v, widgetGroup1);
                        arrayList0.remove(widgetGroup0);
                    }
                    widgetGroup0 = widgetGroup1;
                    break;
                }
            }
        }
        else if(v1 != -1) {
            return widgetGroup0;
        }
        if(widgetGroup0 == null) {
            if(constraintWidget0 instanceof HelperWidget) {
                int v4 = ((HelperWidget)constraintWidget0).m2(v);
                if(v4 != -1) {
                    for(int v5 = 0; v5 < arrayList0.size(); ++v5) {
                        WidgetGroup widgetGroup2 = (WidgetGroup)arrayList0.get(v5);
                        if(widgetGroup2.f() == v4) {
                            widgetGroup0 = widgetGroup2;
                            break;
                        }
                    }
                }
            }
            if(widgetGroup0 == null) {
                widgetGroup0 = new WidgetGroup(v);
            }
            arrayList0.add(widgetGroup0);
        }
        if(widgetGroup0.a(constraintWidget0)) {
            if(constraintWidget0 instanceof Guideline) {
                ConstraintAnchor constraintAnchor0 = ((Guideline)constraintWidget0).m2();
                if(((Guideline)constraintWidget0).o2() == 0) {
                    v2 = 1;
                }
                constraintAnchor0.d(v2, arrayList0, widgetGroup0);
            }
            if(v == 0) {
                constraintWidget0.S0 = widgetGroup0.f();
                constraintWidget0.Q.d(0, arrayList0, widgetGroup0);
                constraintWidget0.S.d(0, arrayList0, widgetGroup0);
            }
            else {
                constraintWidget0.T0 = widgetGroup0.f();
                constraintWidget0.R.d(v, arrayList0, widgetGroup0);
                constraintWidget0.U.d(v, arrayList0, widgetGroup0);
                constraintWidget0.T.d(v, arrayList0, widgetGroup0);
            }
            constraintWidget0.X.d(v, arrayList0, widgetGroup0);
        }
        return widgetGroup0;
    }

    private static WidgetGroup b(ArrayList arrayList0, int v) {
        int v1 = arrayList0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            WidgetGroup widgetGroup0 = (WidgetGroup)arrayList0.get(v2);
            if(v == widgetGroup0.f()) {
                return widgetGroup0;
            }
        }
        return null;
    }

    public static boolean c(ConstraintWidgetContainer constraintWidgetContainer0, Measurer basicMeasure$Measurer0) {
        WidgetGroup widgetGroup4;
        ArrayList arrayList0 = constraintWidgetContainer0.m2();
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ConstraintWidget constraintWidget0 = (ConstraintWidget)arrayList0.get(v1);
            if(!Grouping.d(constraintWidgetContainer0.H(), constraintWidgetContainer0.j0(), constraintWidget0.H(), constraintWidget0.j0())) {
                return false;
            }
            if(constraintWidget0 instanceof Flow) {
                return false;
            }
        }
        Metrics metrics0 = constraintWidgetContainer0.H1;
        if(metrics0 != null) {
            ++metrics0.L;
        }
        ArrayList arrayList1 = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList arrayList4 = null;
        ArrayList arrayList5 = null;
        ArrayList arrayList6 = null;
        for(int v2 = 0; v2 < v; ++v2) {
            ConstraintWidget constraintWidget1 = (ConstraintWidget)arrayList0.get(v2);
            if(!Grouping.d(constraintWidgetContainer0.H(), constraintWidgetContainer0.j0(), constraintWidget1.H(), constraintWidget1.j0())) {
                ConstraintWidgetContainer.S2(0, constraintWidget1, basicMeasure$Measurer0, constraintWidgetContainer0.g2, Measure.k);
            }
            if(constraintWidget1 instanceof Guideline) {
                if(((Guideline)constraintWidget1).o2() == 0) {
                    if(arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList3.add(((Guideline)constraintWidget1));
                }
                if(((Guideline)constraintWidget1).o2() == 1) {
                    if(arrayList1 == null) {
                        arrayList1 = new ArrayList();
                    }
                    arrayList1.add(((Guideline)constraintWidget1));
                }
            }
            if(constraintWidget1 instanceof HelperWidget) {
                if(constraintWidget1 instanceof Barrier) {
                    if(((Barrier)constraintWidget1).s2() == 0) {
                        if(arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(((Barrier)constraintWidget1));
                    }
                    if(((Barrier)constraintWidget1).s2() == 1) {
                        if(arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        arrayList4.add(((Barrier)constraintWidget1));
                    }
                }
                else {
                    if(arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(((HelperWidget)constraintWidget1));
                    if(arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    arrayList4.add(((HelperWidget)constraintWidget1));
                }
            }
            if(constraintWidget1.Q.f == null && constraintWidget1.S.f == null && !(constraintWidget1 instanceof Guideline) && !(constraintWidget1 instanceof Barrier)) {
                if(arrayList5 == null) {
                    arrayList5 = new ArrayList();
                }
                arrayList5.add(constraintWidget1);
            }
            if(constraintWidget1.R.f == null && constraintWidget1.T.f == null && constraintWidget1.U.f == null && !(constraintWidget1 instanceof Guideline) && !(constraintWidget1 instanceof Barrier)) {
                if(arrayList6 == null) {
                    arrayList6 = new ArrayList();
                }
                arrayList6.add(constraintWidget1);
            }
        }
        ArrayList arrayList7 = new ArrayList();
        if(arrayList1 != null) {
            for(Object object0: arrayList1) {
                Grouping.a(((Guideline)object0), 0, arrayList7, null);
            }
        }
        if(arrayList2 != null) {
            for(Object object1: arrayList2) {
                WidgetGroup widgetGroup0 = Grouping.a(((HelperWidget)object1), 0, arrayList7, null);
                ((HelperWidget)object1).l2(arrayList7, 0, widgetGroup0);
                widgetGroup0.c(arrayList7);
            }
        }
        ConstraintAnchor constraintAnchor0 = constraintWidgetContainer0.r(Type.b);
        if(constraintAnchor0.e() != null) {
            for(Object object2: constraintAnchor0.e()) {
                Grouping.a(((ConstraintAnchor)object2).d, 0, arrayList7, null);
            }
        }
        ConstraintAnchor constraintAnchor1 = constraintWidgetContainer0.r(Type.d);
        if(constraintAnchor1.e() != null) {
            for(Object object3: constraintAnchor1.e()) {
                Grouping.a(((ConstraintAnchor)object3).d, 0, arrayList7, null);
            }
        }
        ConstraintAnchor constraintAnchor2 = constraintWidgetContainer0.r(Type.g);
        if(constraintAnchor2.e() != null) {
            for(Object object4: constraintAnchor2.e()) {
                Grouping.a(((ConstraintAnchor)object4).d, 0, arrayList7, null);
            }
        }
        if(arrayList5 != null) {
            for(Object object5: arrayList5) {
                Grouping.a(((ConstraintWidget)object5), 0, arrayList7, null);
            }
        }
        if(arrayList3 != null) {
            for(Object object6: arrayList3) {
                Grouping.a(((Guideline)object6), 1, arrayList7, null);
            }
        }
        if(arrayList4 != null) {
            for(Object object7: arrayList4) {
                WidgetGroup widgetGroup1 = Grouping.a(((HelperWidget)object7), 1, arrayList7, null);
                ((HelperWidget)object7).l2(arrayList7, 1, widgetGroup1);
                widgetGroup1.c(arrayList7);
            }
        }
        ConstraintAnchor constraintAnchor3 = constraintWidgetContainer0.r(Type.c);
        if(constraintAnchor3.e() != null) {
            for(Object object8: constraintAnchor3.e()) {
                Grouping.a(((ConstraintAnchor)object8).d, 1, arrayList7, null);
            }
        }
        ConstraintAnchor constraintAnchor4 = constraintWidgetContainer0.r(Type.f);
        if(constraintAnchor4.e() != null) {
            for(Object object9: constraintAnchor4.e()) {
                Grouping.a(((ConstraintAnchor)object9).d, 1, arrayList7, null);
            }
        }
        ConstraintAnchor constraintAnchor5 = constraintWidgetContainer0.r(Type.e);
        if(constraintAnchor5.e() != null) {
            for(Object object10: constraintAnchor5.e()) {
                Grouping.a(((ConstraintAnchor)object10).d, 1, arrayList7, null);
            }
        }
        ConstraintAnchor constraintAnchor6 = constraintWidgetContainer0.r(Type.g);
        if(constraintAnchor6.e() != null) {
            for(Object object11: constraintAnchor6.e()) {
                Grouping.a(((ConstraintAnchor)object11).d, 1, arrayList7, null);
            }
        }
        if(arrayList6 != null) {
            for(Object object12: arrayList6) {
                Grouping.a(((ConstraintWidget)object12), 1, arrayList7, null);
            }
        }
        for(int v3 = 0; v3 < v; ++v3) {
            ConstraintWidget constraintWidget2 = (ConstraintWidget)arrayList0.get(v3);
            if(constraintWidget2.Q0()) {
                WidgetGroup widgetGroup2 = Grouping.b(arrayList7, constraintWidget2.S0);
                WidgetGroup widgetGroup3 = Grouping.b(arrayList7, constraintWidget2.T0);
                if(widgetGroup2 != null && widgetGroup3 != null) {
                    widgetGroup2.m(0, widgetGroup3);
                    widgetGroup3.o(2);
                    arrayList7.remove(widgetGroup2);
                }
            }
        }
        if(arrayList7.size() <= 1) {
            return false;
        }
        if(constraintWidgetContainer0.H() == DimensionBehaviour.b) {
            widgetGroup4 = null;
            int v4 = 0;
            for(Object object13: arrayList7) {
                WidgetGroup widgetGroup5 = (WidgetGroup)object13;
                if(widgetGroup5.g() != 1) {
                    widgetGroup5.n(false);
                    int v5 = widgetGroup5.l(constraintWidgetContainer0.J2(), 0);
                    if(v5 > v4) {
                        widgetGroup4 = widgetGroup5;
                        v4 = v5;
                    }
                }
            }
            if(widgetGroup4 == null) {
                widgetGroup4 = null;
            }
            else {
                constraintWidgetContainer0.E1(DimensionBehaviour.a);
                constraintWidgetContainer0.d2(v4);
                widgetGroup4.n(true);
            }
        }
        else {
            widgetGroup4 = null;
        }
        if(constraintWidgetContainer0.j0() == DimensionBehaviour.b) {
            WidgetGroup widgetGroup6 = null;
            int v6 = 0;
            for(Object object14: arrayList7) {
                WidgetGroup widgetGroup7 = (WidgetGroup)object14;
                if(widgetGroup7.g() != 0) {
                    widgetGroup7.n(false);
                    int v7 = widgetGroup7.l(constraintWidgetContainer0.J2(), 1);
                    if(v7 > v6) {
                        widgetGroup6 = widgetGroup7;
                        v6 = v7;
                    }
                }
            }
            if(widgetGroup6 != null) {
                constraintWidgetContainer0.Z1(DimensionBehaviour.a);
                constraintWidgetContainer0.z1(v6);
                widgetGroup6.n(true);
                return widgetGroup4 != null || widgetGroup6 != null;
            }
        }
        return widgetGroup4 != null;
    }

    // 去混淆评级： 低(40)
    public static boolean d(DimensionBehaviour constraintWidget$DimensionBehaviour0, DimensionBehaviour constraintWidget$DimensionBehaviour1, DimensionBehaviour constraintWidget$DimensionBehaviour2, DimensionBehaviour constraintWidget$DimensionBehaviour3) {
        return constraintWidget$DimensionBehaviour2 == DimensionBehaviour.a || (constraintWidget$DimensionBehaviour2 == DimensionBehaviour.b || constraintWidget$DimensionBehaviour2 == DimensionBehaviour.d && constraintWidget$DimensionBehaviour0 != DimensionBehaviour.b) || (constraintWidget$DimensionBehaviour3 == DimensionBehaviour.a || (constraintWidget$DimensionBehaviour3 == DimensionBehaviour.b || constraintWidget$DimensionBehaviour3 == DimensionBehaviour.d && constraintWidget$DimensionBehaviour1 != DimensionBehaviour.b));
    }
}

