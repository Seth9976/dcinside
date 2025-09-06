package androidx.window.layout;

import android.graphics.Point;
import android.view.Display;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.L;
import y4.l;

@RequiresApi(17)
public final class DisplayCompatHelperApi17 {
    @l
    public static final DisplayCompatHelperApi17 a;

    static {
        DisplayCompatHelperApi17.a = new DisplayCompatHelperApi17();
    }

    public final void a(@l Display display0, @l Point point0) {
        L.p(display0, "display");
        L.p(point0, "point");
        display0.getRealSize(point0);
    }
}

