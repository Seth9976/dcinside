package androidx.compose.ui.semantics;

import androidx.compose.ui.ExperimentalComposeUiApi;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.reflect.o;
import y4.l;

public final class SemanticsProperties_androidKt {
    static final o[] a;

    static {
        SemanticsProperties_androidKt.a = new o[]{m0.k(new Y(SemanticsProperties_androidKt.class, "testTagsAsResourceId", "getTestTagsAsResourceId(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1))};
    }

    @ExperimentalComposeUiApi
    public static final boolean a(@l SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        L.p(semanticsPropertyReceiver0, "<this>");
        return ((Boolean)SemanticsPropertiesAndroid.a.a().c(semanticsPropertyReceiver0, SemanticsProperties_androidKt.a[0])).booleanValue();
    }

    @ExperimentalComposeUiApi
    public static void b(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
    }

    private static Object c(SemanticsPropertyReceiver semanticsPropertyReceiver0) {
        return SemanticsPropertiesAndroid.a.a();
    }

    @ExperimentalComposeUiApi
    public static final void d(@l SemanticsPropertyReceiver semanticsPropertyReceiver0, boolean z) {
        L.p(semanticsPropertyReceiver0, "<this>");
        SemanticsPropertiesAndroid.a.a().e(semanticsPropertyReceiver0, SemanticsProperties_androidKt.a[0], Boolean.valueOf(z));
    }
}

