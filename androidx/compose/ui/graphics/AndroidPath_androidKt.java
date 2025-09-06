package androidx.compose.ui.graphics;

import kotlin.jvm.internal.L;
import y4.l;

public final class AndroidPath_androidKt {
    @l
    public static final Path a() {
        return new AndroidPath(null, 1, null);
    }

    @l
    public static final android.graphics.Path b(@l Path path0) {
        L.p(path0, "<this>");
        if(!(path0 instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        return ((AndroidPath)path0).w();
    }

    @l
    public static final Path c(@l android.graphics.Path path0) {
        L.p(path0, "<this>");
        return new AndroidPath(path0);
    }
}

