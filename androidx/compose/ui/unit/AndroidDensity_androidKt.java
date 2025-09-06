package androidx.compose.ui.unit;

import android.content.Context;
import kotlin.jvm.internal.L;
import y4.l;

public final class AndroidDensity_androidKt {
    @l
    public static final Density a(@l Context context0) {
        L.p(context0, "context");
        return DensityKt.a(context0.getResources().getDisplayMetrics().density, context0.getResources().getConfiguration().fontScale);
    }
}

