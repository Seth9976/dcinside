package androidx.navigation;

import android.view.View;
import kotlin.jvm.internal.L;
import y4.l;

public final class ViewKt {
    @l
    public static final NavController a(@l View view0) {
        L.p(view0, "<this>");
        return Navigation.k(view0);
    }
}

