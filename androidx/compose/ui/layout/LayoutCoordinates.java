package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Rect;
import java.util.Set;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public interface LayoutCoordinates {
    public static final class DefaultImpls {
        public static Rect a(LayoutCoordinates layoutCoordinates0, LayoutCoordinates layoutCoordinates1, boolean z, int v, Object object0) {
            return b.c(layoutCoordinates0, layoutCoordinates1, z, v, object0);
        }

        @Deprecated
        public static void b(@l LayoutCoordinates layoutCoordinates0, @l LayoutCoordinates layoutCoordinates1, @l float[] arr_f) {
            L.p(layoutCoordinates1, "sourceCoordinates");
            L.p(arr_f, "matrix");
            b.a(layoutCoordinates0, layoutCoordinates1, arr_f);
        }
    }

    long B(long arg1);

    @l
    Rect E(@l LayoutCoordinates arg1, boolean arg2);

    @m
    LayoutCoordinates K();

    long L(long arg1);

    long P(@l LayoutCoordinates arg1, long arg2);

    @m
    LayoutCoordinates U();

    long X(long arg1);

    long a();

    void c0(@l LayoutCoordinates arg1, @l float[] arg2);

    boolean o();

    @l
    Set t1();

    int v(@l AlignmentLine arg1);
}

