package androidx.compose.ui.text.android;

import android.text.StaticLayout.Builder;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.L;
import y4.l;
import z3.n;

@RequiresApi(26)
final class StaticLayoutFactory26 {
    @l
    public static final StaticLayoutFactory26 a;

    static {
        StaticLayoutFactory26.a = new StaticLayoutFactory26();
    }

    @DoNotInline
    @n
    public static final void a(@l StaticLayout.Builder staticLayout$Builder0, int v) {
        L.p(staticLayout$Builder0, "builder");
        staticLayout$Builder0.setJustificationMode(v);
    }
}

