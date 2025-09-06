package androidx.savedstate;

import android.view.View;
import android.view.ViewParent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.sequences.p;
import y4.l;
import y4.m;
import z3.i;

@i(name = "ViewTreeSavedStateRegistryOwner")
public final class ViewTreeSavedStateRegistryOwner {
    @m
    @i(name = "get")
    public static final SavedStateRegistryOwner a(@l View view0) {
        L.p(view0, "<this>");
        return (SavedStateRegistryOwner)p.F0(p.p1(p.n(view0, androidx.savedstate.ViewTreeSavedStateRegistryOwner.findViewTreeSavedStateRegistryOwner.1.e), androidx.savedstate.ViewTreeSavedStateRegistryOwner.findViewTreeSavedStateRegistryOwner.2.e));

        final class androidx.savedstate.ViewTreeSavedStateRegistryOwner.findViewTreeSavedStateRegistryOwner.1 extends N implements Function1 {
            public static final androidx.savedstate.ViewTreeSavedStateRegistryOwner.findViewTreeSavedStateRegistryOwner.1 e;

            static {
                androidx.savedstate.ViewTreeSavedStateRegistryOwner.findViewTreeSavedStateRegistryOwner.1.e = new androidx.savedstate.ViewTreeSavedStateRegistryOwner.findViewTreeSavedStateRegistryOwner.1();
            }

            androidx.savedstate.ViewTreeSavedStateRegistryOwner.findViewTreeSavedStateRegistryOwner.1() {
                super(1);
            }

            @m
            public final View b(@l View view0) {
                L.p(view0, "view");
                ViewParent viewParent0 = view0.getParent();
                return viewParent0 instanceof View ? ((View)viewParent0) : null;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.b(((View)object0));
            }
        }


        final class androidx.savedstate.ViewTreeSavedStateRegistryOwner.findViewTreeSavedStateRegistryOwner.2 extends N implements Function1 {
            public static final androidx.savedstate.ViewTreeSavedStateRegistryOwner.findViewTreeSavedStateRegistryOwner.2 e;

            static {
                androidx.savedstate.ViewTreeSavedStateRegistryOwner.findViewTreeSavedStateRegistryOwner.2.e = new androidx.savedstate.ViewTreeSavedStateRegistryOwner.findViewTreeSavedStateRegistryOwner.2();
            }

            androidx.savedstate.ViewTreeSavedStateRegistryOwner.findViewTreeSavedStateRegistryOwner.2() {
                super(1);
            }

            @m
            public final SavedStateRegistryOwner b(@l View view0) {
                L.p(view0, "view");
                Object object0 = view0.getTag(id.view_tree_saved_state_registry_owner);
                return object0 instanceof SavedStateRegistryOwner ? ((SavedStateRegistryOwner)object0) : null;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.b(((View)object0));
            }
        }

    }

    @i(name = "set")
    public static final void b(@l View view0, @m SavedStateRegistryOwner savedStateRegistryOwner0) {
        L.p(view0, "<this>");
        view0.setTag(id.view_tree_saved_state_registry_owner, savedStateRegistryOwner0);
    }
}

