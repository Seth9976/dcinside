package androidx.compose.ui.graphics;

public final class i0 {
    public static boolean a(PathMeasure pathMeasure0, float f, float f1, Path path0, boolean z, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSegment");
        }
        if((v & 8) != 0) {
            z = true;
        }
        return pathMeasure0.b(f, f1, path0, z);
    }
}

