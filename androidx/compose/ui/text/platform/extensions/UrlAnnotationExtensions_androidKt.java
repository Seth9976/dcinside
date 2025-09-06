package androidx.compose.ui.text.platform.extensions;

import android.text.style.URLSpan;
import androidx.compose.ui.text.ExperimentalTextApi;
import androidx.compose.ui.text.UrlAnnotation;
import kotlin.jvm.internal.L;
import y4.l;

public final class UrlAnnotationExtensions_androidKt {
    @ExperimentalTextApi
    @l
    public static final URLSpan a(@l UrlAnnotation urlAnnotation0) {
        L.p(urlAnnotation0, "<this>");
        return new URLSpan(urlAnnotation0.a());
    }
}

