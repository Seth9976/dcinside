package androidx.window.layout;

import android.view.DisplayCutout;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.L;
import y4.l;

@RequiresApi(28)
public final class DisplayCompatHelperApi28 {
    @l
    public static final DisplayCompatHelperApi28 a;

    static {
        DisplayCompatHelperApi28.a = new DisplayCompatHelperApi28();
    }

    public final int a(@l DisplayCutout displayCutout0) {
        L.p(displayCutout0, "displayCutout");
        return displayCutout0.getSafeInsetBottom();
    }

    public final int b(@l DisplayCutout displayCutout0) {
        L.p(displayCutout0, "displayCutout");
        return displayCutout0.getSafeInsetLeft();
    }

    public final int c(@l DisplayCutout displayCutout0) {
        L.p(displayCutout0, "displayCutout");
        return displayCutout0.getSafeInsetRight();
    }

    public final int d(@l DisplayCutout displayCutout0) {
        L.p(displayCutout0, "displayCutout");
        return displayCutout0.getSafeInsetTop();
    }
}

