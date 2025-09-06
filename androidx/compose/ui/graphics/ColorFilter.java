package androidx.compose.ui.graphics;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;

@Immutable
public final class ColorFilter {
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        @Stable
        @l
        public final ColorFilter a(@l float[] arr_f) {
            L.p(arr_f, "colorMatrix");
            return AndroidColorFilter_androidKt.a(arr_f);
        }

        @Stable
        @l
        public final ColorFilter b(long v, long v1) {
            return AndroidColorFilter_androidKt.b(v, v1);
        }

        @Stable
        @l
        public final ColorFilter c(long v, int v1) {
            return AndroidColorFilter_androidKt.c(v, v1);
        }

        public static ColorFilter d(Companion colorFilter$Companion0, long v, int v1, int v2, Object object0) {
            if((v2 & 2) != 0) {
                v1 = 5;
            }
            return colorFilter$Companion0.c(v, v1);
        }
    }

    @l
    private final android.graphics.ColorFilter a;
    @l
    public static final Companion b;

    static {
        ColorFilter.b = new Companion(null);
    }

    public ColorFilter(@l android.graphics.ColorFilter colorFilter0) {
        L.p(colorFilter0, "nativeColorFilter");
        super();
        this.a = colorFilter0;
    }

    @l
    public final android.graphics.ColorFilter a() {
        return this.a;
    }
}

