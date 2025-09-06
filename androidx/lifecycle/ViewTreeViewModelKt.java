package androidx.lifecycle;

import android.view.View;
import kotlin.c0;
import kotlin.jvm.internal.L;
import kotlin.k;
import kotlin.m;

public final class ViewTreeViewModelKt {
    @k(level = m.c, message = "Replaced by View.findViewTreeViewModelStoreOwner in ViewTreeViewModelStoreOwner", replaceWith = @c0(expression = "View.findViewTreeViewModelStoreOwner", imports = {"androidx.lifecycle.ViewTreeViewModelStoreOwner"}))
    public static final ViewModelStoreOwner a(View view0) {
        L.p(view0, "view");
        return ViewTreeViewModelStoreOwner.a(view0);
    }
}

