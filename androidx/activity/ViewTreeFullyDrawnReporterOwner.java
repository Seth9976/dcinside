package androidx.activity;

import android.view.View;
import android.view.ViewParent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.sequences.p;
import y4.l;
import y4.m;
import z3.i;

@i(name = "ViewTreeFullyDrawnReporterOwner")
public final class ViewTreeFullyDrawnReporterOwner {
    @m
    @i(name = "get")
    public static final FullyDrawnReporterOwner a(@l View view0) {
        L.p(view0, "<this>");
        return (FullyDrawnReporterOwner)p.F0(p.p1(p.n(view0, androidx.activity.ViewTreeFullyDrawnReporterOwner.findViewTreeFullyDrawnReporterOwner.1.e), androidx.activity.ViewTreeFullyDrawnReporterOwner.findViewTreeFullyDrawnReporterOwner.2.e));

        final class androidx.activity.ViewTreeFullyDrawnReporterOwner.findViewTreeFullyDrawnReporterOwner.1 extends N implements Function1 {
            public static final androidx.activity.ViewTreeFullyDrawnReporterOwner.findViewTreeFullyDrawnReporterOwner.1 e;

            static {
                androidx.activity.ViewTreeFullyDrawnReporterOwner.findViewTreeFullyDrawnReporterOwner.1.e = new androidx.activity.ViewTreeFullyDrawnReporterOwner.findViewTreeFullyDrawnReporterOwner.1();
            }

            androidx.activity.ViewTreeFullyDrawnReporterOwner.findViewTreeFullyDrawnReporterOwner.1() {
                super(1);
            }

            @m
            public final View b(@l View view0) {
                L.p(view0, "it");
                ViewParent viewParent0 = view0.getParent();
                return viewParent0 instanceof View ? ((View)viewParent0) : null;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.b(((View)object0));
            }
        }


        final class androidx.activity.ViewTreeFullyDrawnReporterOwner.findViewTreeFullyDrawnReporterOwner.2 extends N implements Function1 {
            public static final androidx.activity.ViewTreeFullyDrawnReporterOwner.findViewTreeFullyDrawnReporterOwner.2 e;

            static {
                androidx.activity.ViewTreeFullyDrawnReporterOwner.findViewTreeFullyDrawnReporterOwner.2.e = new androidx.activity.ViewTreeFullyDrawnReporterOwner.findViewTreeFullyDrawnReporterOwner.2();
            }

            androidx.activity.ViewTreeFullyDrawnReporterOwner.findViewTreeFullyDrawnReporterOwner.2() {
                super(1);
            }

            @m
            public final FullyDrawnReporterOwner b(@l View view0) {
                L.p(view0, "it");
                Object object0 = view0.getTag(id.report_drawn);
                return object0 instanceof FullyDrawnReporterOwner ? ((FullyDrawnReporterOwner)object0) : null;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.b(((View)object0));
            }
        }

    }

    @i(name = "set")
    public static final void b(@l View view0, @l FullyDrawnReporterOwner fullyDrawnReporterOwner0) {
        L.p(view0, "<this>");
        L.p(fullyDrawnReporterOwner0, "fullyDrawnReporterOwner");
        view0.setTag(id.report_drawn, fullyDrawnReporterOwner0);
    }
}

