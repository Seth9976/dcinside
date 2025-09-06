package androidx.compose.ui.util;

import A3.a;
import android.os.Trace;
import kotlin.jvm.internal.L;
import y4.l;

public final class AndroidTrace_androidKt {
    public static final Object a(@l String s, @l a a0) {
        L.p(s, "sectionName");
        L.p(a0, "block");
        Trace.beginSection(s);
        try {
            return a0.invoke();
        }
        finally {
            Trace.endSection();
        }
    }
}

