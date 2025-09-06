package androidx.compose.ui.graphics;

import y4.l;
import y4.m;

public interface PathMeasure {
    public static final class DefaultImpls {
        public static boolean a(PathMeasure pathMeasure0, float f, float f1, Path path0, boolean z, int v, Object object0) {
            return i0.a(pathMeasure0, f, f1, path0, z, v, object0);
        }
    }

    long a(float arg1);

    boolean b(float arg1, float arg2, @l Path arg3, boolean arg4);

    void c(@m Path arg1, boolean arg2);

    long d(float arg1);

    float getLength();
}

