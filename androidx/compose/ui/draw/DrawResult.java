package androidx.compose.ui.draw;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;

@StabilityInferred(parameters = 0)
public final class DrawResult {
    @l
    private Function1 a;
    public static final int b = 8;

    static {
    }

    public DrawResult(@l Function1 function10) {
        L.p(function10, "block");
        super();
        this.a = function10;
    }

    @l
    public final Function1 a() {
        return this.a;
    }

    public final void b(@l Function1 function10) {
        L.p(function10, "<set-?>");
        this.a = function10;
    }
}

