package androidx.lifecycle;

import android.view.View;
import kotlin.c0;
import kotlin.jvm.internal.L;
import kotlin.k;
import kotlin.m;

public final class ViewKt {
    @k(level = m.c, message = "Replaced by View.findViewTreeLifecycleOwner() from lifecycle module", replaceWith = @c0(expression = "findViewTreeLifecycleOwner()", imports = {"androidx.lifecycle.findViewTreeLifecycleOwner"}))
    public static final LifecycleOwner a(View view0) {
        L.p(view0, "<this>");
        return ViewTreeLifecycleOwner.a(view0);
    }
}

