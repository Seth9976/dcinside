package androidx.compose.ui.text.android;

import android.graphics.text.LineBreakConfig;
import android.text.StaticLayout.Builder;
import android.text.StaticLayout;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.L;
import y4.l;
import z3.n;

@RequiresApi(33)
final class StaticLayoutFactory33 {
    @l
    public static final StaticLayoutFactory33 a;

    static {
        StaticLayoutFactory33.a = new StaticLayoutFactory33();
    }

    @DoNotInline
    @n
    public static final boolean a(@l StaticLayout staticLayout0) {
        L.p(staticLayout0, "layout");
        return staticLayout0.isFallbackLineSpacingEnabled();
    }

    @DoNotInline
    @n
    public static final void b(@l StaticLayout.Builder staticLayout$Builder0, int v, int v1) {
        L.p(staticLayout$Builder0, "builder");
        LineBreakConfig lineBreakConfig0 = x.a().setLineBreakStyle(v).setLineBreakWordStyle(v1).build();
        L.o(lineBreakConfig0, "Builder()\n              …\n                .build()");
        staticLayout$Builder0.setLineBreakConfig(lineBreakConfig0);
    }
}

