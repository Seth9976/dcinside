package androidx.fragment.app;

import android.view.View;
import kotlin.jvm.internal.L;
import y4.l;

public final class ViewKt {
    @l
    public static final Fragment a(@l View view0) {
        L.p(view0, "<this>");
        Fragment fragment0 = FragmentManager.q0(view0);
        L.o(fragment0, "findFragment(this)");
        return fragment0;
    }
}

