package androidx.compose.ui.graphics;

import kotlin.jvm.internal.L;
import y4.l;

public interface PathEffect {
    public static final class Companion {
        static final Companion a;

        static {
            Companion.a = new Companion();
        }

        @l
        public final PathEffect a(@l PathEffect pathEffect0, @l PathEffect pathEffect1) {
            L.p(pathEffect0, "outer");
            L.p(pathEffect1, "inner");
            return AndroidPathEffect_androidKt.a(pathEffect0, pathEffect1);
        }

        @l
        public final PathEffect b(float f) {
            return AndroidPathEffect_androidKt.b(f);
        }

        @l
        public final PathEffect c(@l float[] arr_f, float f) {
            L.p(arr_f, "intervals");
            return AndroidPathEffect_androidKt.c(arr_f, f);
        }

        public static PathEffect d(Companion pathEffect$Companion0, float[] arr_f, float f, int v, Object object0) {
            if((v & 2) != 0) {
                f = 0.0f;
            }
            return pathEffect$Companion0.c(arr_f, f);
        }

        @l
        public final PathEffect e(@l Path path0, float f, float f1, int v) {
            L.p(path0, "shape");
            return AndroidPathEffect_androidKt.d(path0, f, f1, v);
        }
    }

    @l
    public static final Companion a;

    static {
        PathEffect.a = Companion.a;
    }
}

