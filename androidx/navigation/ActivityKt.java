package androidx.navigation;

import android.app.Activity;
import androidx.annotation.IdRes;
import kotlin.jvm.internal.L;
import y4.l;

public final class ActivityKt {
    @l
    public static final NavController a(@l Activity activity0, @IdRes int v) {
        L.p(activity0, "<this>");
        return Navigation.j(activity0, v);
    }
}

