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

@i(name = "ViewTreeOnBackPressedDispatcherOwner")
public final class ViewTreeOnBackPressedDispatcherOwner {
    @m
    @i(name = "get")
    public static final OnBackPressedDispatcherOwner a(@l View view0) {
        L.p(view0, "<this>");
        return (OnBackPressedDispatcherOwner)p.F0(p.p1(p.n(view0, androidx.activity.ViewTreeOnBackPressedDispatcherOwner.findViewTreeOnBackPressedDispatcherOwner.1.e), androidx.activity.ViewTreeOnBackPressedDispatcherOwner.findViewTreeOnBackPressedDispatcherOwner.2.e));

        final class androidx.activity.ViewTreeOnBackPressedDispatcherOwner.findViewTreeOnBackPressedDispatcherOwner.1 extends N implements Function1 {
            public static final androidx.activity.ViewTreeOnBackPressedDispatcherOwner.findViewTreeOnBackPressedDispatcherOwner.1 e;

            static {
                androidx.activity.ViewTreeOnBackPressedDispatcherOwner.findViewTreeOnBackPressedDispatcherOwner.1.e = new androidx.activity.ViewTreeOnBackPressedDispatcherOwner.findViewTreeOnBackPressedDispatcherOwner.1();
            }

            androidx.activity.ViewTreeOnBackPressedDispatcherOwner.findViewTreeOnBackPressedDispatcherOwner.1() {
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


        final class androidx.activity.ViewTreeOnBackPressedDispatcherOwner.findViewTreeOnBackPressedDispatcherOwner.2 extends N implements Function1 {
            public static final androidx.activity.ViewTreeOnBackPressedDispatcherOwner.findViewTreeOnBackPressedDispatcherOwner.2 e;

            static {
                androidx.activity.ViewTreeOnBackPressedDispatcherOwner.findViewTreeOnBackPressedDispatcherOwner.2.e = new androidx.activity.ViewTreeOnBackPressedDispatcherOwner.findViewTreeOnBackPressedDispatcherOwner.2();
            }

            androidx.activity.ViewTreeOnBackPressedDispatcherOwner.findViewTreeOnBackPressedDispatcherOwner.2() {
                super(1);
            }

            @m
            public final OnBackPressedDispatcherOwner b(@l View view0) {
                L.p(view0, "it");
                Object object0 = view0.getTag(id.view_tree_on_back_pressed_dispatcher_owner);
                return object0 instanceof OnBackPressedDispatcherOwner ? ((OnBackPressedDispatcherOwner)object0) : null;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.b(((View)object0));
            }
        }

    }

    @i(name = "set")
    public static final void b(@l View view0, @l OnBackPressedDispatcherOwner onBackPressedDispatcherOwner0) {
        L.p(view0, "<this>");
        L.p(onBackPressedDispatcherOwner0, "onBackPressedDispatcherOwner");
        view0.setTag(id.view_tree_on_back_pressed_dispatcher_owner, onBackPressedDispatcherOwner0);
    }
}

