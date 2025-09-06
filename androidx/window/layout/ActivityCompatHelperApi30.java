package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.L;
import y4.l;

@RequiresApi(30)
public final class ActivityCompatHelperApi30 {
    @l
    public static final ActivityCompatHelperApi30 a;

    static {
        ActivityCompatHelperApi30.a = new ActivityCompatHelperApi30();
    }

    @l
    public final Rect a(@l Activity activity0) {
        L.p(activity0, "activity");
        Rect rect0 = activity0.getWindowManager().getCurrentWindowMetrics().getBounds();
        L.o(rect0, "activity.windowManager.currentWindowMetrics.bounds");
        return rect0;
    }

    @l
    public final Rect b(@l Activity activity0) {
        L.p(activity0, "activity");
        Rect rect0 = activity0.getWindowManager().getMaximumWindowMetrics().getBounds();
        L.o(rect0, "activity.windowManager.maximumWindowMetrics.bounds");
        return rect0;
    }
}

