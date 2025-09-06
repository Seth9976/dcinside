package androidx.compose.foundation.gestures;

public final class d {
    public static void a(TransformScope transformScope0, float f, long v, float f1, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transformBy-d-4ec7I");
        }
        if((v1 & 1) != 0) {
            f = 1.0f;
        }
        if((v1 & 2) != 0) {
            v = 0L;
        }
        if((v1 & 4) != 0) {
            f1 = 0.0f;
        }
        transformScope0.a(f, v, f1);
    }
}

