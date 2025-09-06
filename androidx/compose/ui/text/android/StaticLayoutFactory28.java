package androidx.compose.ui.text.android;

import android.text.StaticLayout.Builder;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.L;
import y4.l;
import z3.n;

@RequiresApi(28)
final class StaticLayoutFactory28 {
    @l
    public static final StaticLayoutFactory28 a;

    static {
        StaticLayoutFactory28.a = new StaticLayoutFactory28();
    }

    @DoNotInline
    @n
    public static final void a(@l StaticLayout.Builder staticLayout$Builder0, boolean z) {
        L.p(staticLayout$Builder0, "builder");
        staticLayout$Builder0.setUseLineSpacingFromFallbacks(z);
    }
}

