package androidx.savedstate;

import android.view.View;
import kotlin.c0;
import kotlin.jvm.internal.L;
import kotlin.k;
import kotlin.m;

public final class ViewKt {
    @k(level = m.c, message = "Replaced by View.findViewTreeSavedStateRegistryOwner() from savedstate module", replaceWith = @c0(expression = "findViewTreeSavedStateRegistryOwner()", imports = {"androidx.savedstate.findViewTreeSavedStateRegistryOwner"}))
    public static final SavedStateRegistryOwner a(View view0) {
        L.p(view0, "<this>");
        return ViewTreeSavedStateRegistryOwner.a(view0);
    }
}

