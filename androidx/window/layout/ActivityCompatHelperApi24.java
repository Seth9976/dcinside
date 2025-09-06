package androidx.window.layout;

import android.app.Activity;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.L;
import y4.l;

@RequiresApi(24)
public final class ActivityCompatHelperApi24 {
    @l
    public static final ActivityCompatHelperApi24 a;

    static {
        ActivityCompatHelperApi24.a = new ActivityCompatHelperApi24();
    }

    public final boolean a(@l Activity activity0) {
        L.p(activity0, "activity");
        return activity0.isInMultiWindowMode();
    }
}

