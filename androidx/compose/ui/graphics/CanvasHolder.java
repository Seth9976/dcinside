package androidx.compose.ui.graphics;

import android.graphics.Canvas;
import kotlin.b0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;

public final class CanvasHolder {
    @l
    private final AndroidCanvas a;

    public CanvasHolder() {
        this.a = new AndroidCanvas();
    }

    public final void a(@l Canvas canvas0, @l Function1 function10) {
        L.p(canvas0, "targetCanvas");
        L.p(function10, "block");
        Canvas canvas1 = this.b().I();
        this.b().K(canvas0);
        function10.invoke(this.b());
        this.b().K(canvas1);
    }

    @l
    public final AndroidCanvas b() {
        return this.a;
    }

    @b0
    public static void c() {
    }
}

