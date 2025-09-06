package androidx.lifecycle;

import android.view.View;
import android.view.ViewParent;
import androidx.lifecycle.viewmodel.R.id;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.sequences.p;
import y4.l;
import y4.m;
import z3.i;

@i(name = "ViewTreeViewModelStoreOwner")
public final class ViewTreeViewModelStoreOwner {
    @m
    @i(name = "get")
    public static final ViewModelStoreOwner a(@l View view0) {
        L.p(view0, "<this>");
        return (ViewModelStoreOwner)p.F0(p.p1(p.n(view0, androidx.lifecycle.ViewTreeViewModelStoreOwner.findViewTreeViewModelStoreOwner.1.e), androidx.lifecycle.ViewTreeViewModelStoreOwner.findViewTreeViewModelStoreOwner.2.e));

        final class androidx.lifecycle.ViewTreeViewModelStoreOwner.findViewTreeViewModelStoreOwner.1 extends N implements Function1 {
            public static final androidx.lifecycle.ViewTreeViewModelStoreOwner.findViewTreeViewModelStoreOwner.1 e;

            static {
                androidx.lifecycle.ViewTreeViewModelStoreOwner.findViewTreeViewModelStoreOwner.1.e = new androidx.lifecycle.ViewTreeViewModelStoreOwner.findViewTreeViewModelStoreOwner.1();
            }

            androidx.lifecycle.ViewTreeViewModelStoreOwner.findViewTreeViewModelStoreOwner.1() {
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


        final class androidx.lifecycle.ViewTreeViewModelStoreOwner.findViewTreeViewModelStoreOwner.2 extends N implements Function1 {
            public static final androidx.lifecycle.ViewTreeViewModelStoreOwner.findViewTreeViewModelStoreOwner.2 e;

            static {
                androidx.lifecycle.ViewTreeViewModelStoreOwner.findViewTreeViewModelStoreOwner.2.e = new androidx.lifecycle.ViewTreeViewModelStoreOwner.findViewTreeViewModelStoreOwner.2();
            }

            androidx.lifecycle.ViewTreeViewModelStoreOwner.findViewTreeViewModelStoreOwner.2() {
                super(1);
            }

            @m
            public final ViewModelStoreOwner b(@l View view0) {
                L.p(view0, "view");
                Object object0 = view0.getTag(id.view_tree_view_model_store_owner);
                return object0 instanceof ViewModelStoreOwner ? ((ViewModelStoreOwner)object0) : null;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.b(((View)object0));
            }
        }

    }

    @i(name = "set")
    public static final void b(@l View view0, @m ViewModelStoreOwner viewModelStoreOwner0) {
        L.p(view0, "<this>");
        view0.setTag(id.view_tree_view_model_store_owner, viewModelStoreOwner0);
    }
}

