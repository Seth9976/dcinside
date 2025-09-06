package androidx.lifecycle;

import android.view.View;
import android.view.ViewParent;
import androidx.lifecycle.runtime.R.id;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.sequences.p;
import y4.l;
import y4.m;
import z3.i;

@i(name = "ViewTreeLifecycleOwner")
public final class ViewTreeLifecycleOwner {
    @m
    @i(name = "get")
    public static final LifecycleOwner a(@l View view0) {
        L.p(view0, "<this>");
        return (LifecycleOwner)p.F0(p.p1(p.n(view0, androidx.lifecycle.ViewTreeLifecycleOwner.findViewTreeLifecycleOwner.1.e), androidx.lifecycle.ViewTreeLifecycleOwner.findViewTreeLifecycleOwner.2.e));

        final class androidx.lifecycle.ViewTreeLifecycleOwner.findViewTreeLifecycleOwner.1 extends N implements Function1 {
            public static final androidx.lifecycle.ViewTreeLifecycleOwner.findViewTreeLifecycleOwner.1 e;

            static {
                androidx.lifecycle.ViewTreeLifecycleOwner.findViewTreeLifecycleOwner.1.e = new androidx.lifecycle.ViewTreeLifecycleOwner.findViewTreeLifecycleOwner.1();
            }

            androidx.lifecycle.ViewTreeLifecycleOwner.findViewTreeLifecycleOwner.1() {
                super(1);
            }

            @m
            public final View b(@l View view0) {
                L.p(view0, "currentView");
                ViewParent viewParent0 = view0.getParent();
                return viewParent0 instanceof View ? ((View)viewParent0) : null;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.b(((View)object0));
            }
        }


        final class androidx.lifecycle.ViewTreeLifecycleOwner.findViewTreeLifecycleOwner.2 extends N implements Function1 {
            public static final androidx.lifecycle.ViewTreeLifecycleOwner.findViewTreeLifecycleOwner.2 e;

            static {
                androidx.lifecycle.ViewTreeLifecycleOwner.findViewTreeLifecycleOwner.2.e = new androidx.lifecycle.ViewTreeLifecycleOwner.findViewTreeLifecycleOwner.2();
            }

            androidx.lifecycle.ViewTreeLifecycleOwner.findViewTreeLifecycleOwner.2() {
                super(1);
            }

            @m
            public final LifecycleOwner b(@l View view0) {
                L.p(view0, "viewParent");
                Object object0 = view0.getTag(id.view_tree_lifecycle_owner);
                return object0 instanceof LifecycleOwner ? ((LifecycleOwner)object0) : null;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.b(((View)object0));
            }
        }

    }

    @i(name = "set")
    public static final void b(@l View view0, @m LifecycleOwner lifecycleOwner0) {
        L.p(view0, "<this>");
        view0.setTag(id.view_tree_lifecycle_owner, lifecycleOwner0);
    }
}

