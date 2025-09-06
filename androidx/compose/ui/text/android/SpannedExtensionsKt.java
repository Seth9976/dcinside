package androidx.compose.ui.text.android;

import android.text.Spanned;
import kotlin.jvm.internal.L;
import y4.l;

public final class SpannedExtensionsKt {
    public static final boolean a(@l Spanned spanned0, @l Class class0) {
        L.p(spanned0, "<this>");
        L.p(class0, "clazz");
        return spanned0.nextSpanTransition(-1, spanned0.length(), class0) != spanned0.length();
    }

    public static final boolean b(@l Spanned spanned0, @l Class class0, int v, int v1) {
        L.p(spanned0, "<this>");
        L.p(class0, "clazz");
        return spanned0.nextSpanTransition(v - 1, v1, class0) != v1;
    }
}

