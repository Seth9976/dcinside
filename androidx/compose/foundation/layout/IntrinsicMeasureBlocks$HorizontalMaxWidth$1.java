package androidx.compose.foundation.layout;

import A3.o;
import A3.p;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import y4.l;

final class IntrinsicMeasureBlocks.HorizontalMaxWidth.1 extends N implements p {
    public static final IntrinsicMeasureBlocks.HorizontalMaxWidth.1 e;

    static {
        IntrinsicMeasureBlocks.HorizontalMaxWidth.1.e = new IntrinsicMeasureBlocks.HorizontalMaxWidth.1();
    }

    IntrinsicMeasureBlocks.HorizontalMaxWidth.1() {
        super(3);
    }

    @l
    public final Integer a(@l List list0, int v, int v1) {
        L.p(list0, "measurables");
        return RowColumnImplKt.p(list0, androidx.compose.foundation.layout.IntrinsicMeasureBlocks.HorizontalMaxWidth.1.1.e, androidx.compose.foundation.layout.IntrinsicMeasureBlocks.HorizontalMaxWidth.1.2.e, v, v1, LayoutOrientation.a, LayoutOrientation.a);

        final class androidx.compose.foundation.layout.IntrinsicMeasureBlocks.HorizontalMaxWidth.1.1 extends N implements o {
            public static final androidx.compose.foundation.layout.IntrinsicMeasureBlocks.HorizontalMaxWidth.1.1 e;

            static {
                androidx.compose.foundation.layout.IntrinsicMeasureBlocks.HorizontalMaxWidth.1.1.e = new androidx.compose.foundation.layout.IntrinsicMeasureBlocks.HorizontalMaxWidth.1.1();
            }

            androidx.compose.foundation.layout.IntrinsicMeasureBlocks.HorizontalMaxWidth.1.1() {
                super(2);
            }

            @l
            public final Integer a(@l IntrinsicMeasurable intrinsicMeasurable0, int v) {
                L.p(intrinsicMeasurable0, "$this$intrinsicSize");
                return intrinsicMeasurable0.h1(v);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((IntrinsicMeasurable)object0), ((Number)object1).intValue());
            }
        }


        final class androidx.compose.foundation.layout.IntrinsicMeasureBlocks.HorizontalMaxWidth.1.2 extends N implements o {
            public static final androidx.compose.foundation.layout.IntrinsicMeasureBlocks.HorizontalMaxWidth.1.2 e;

            static {
                androidx.compose.foundation.layout.IntrinsicMeasureBlocks.HorizontalMaxWidth.1.2.e = new androidx.compose.foundation.layout.IntrinsicMeasureBlocks.HorizontalMaxWidth.1.2();
            }

            androidx.compose.foundation.layout.IntrinsicMeasureBlocks.HorizontalMaxWidth.1.2() {
                super(2);
            }

            @l
            public final Integer a(@l IntrinsicMeasurable intrinsicMeasurable0, int v) {
                L.p(intrinsicMeasurable0, "$this$intrinsicSize");
                return intrinsicMeasurable0.g(v);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((IntrinsicMeasurable)object0), ((Number)object1).intValue());
            }
        }

    }

    @Override  // A3.p
    public Object invoke(Object object0, Object object1, Object object2) {
        return this.a(((List)object0), ((Number)object1).intValue(), ((Number)object2).intValue());
    }
}

