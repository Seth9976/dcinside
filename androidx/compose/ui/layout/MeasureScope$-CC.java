package androidx.compose.ui.layout;

import java.util.Map;
import kotlin.collections.Y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import y4.l;

public final class MeasureScope.-CC {
    @l
    public static MeasureResult a(MeasureScope measureScope0, int v, int v1, @l Map map0, @l Function1 function10) {
        L.p(map0, "alignmentLines");
        L.p(function10, "placementBlock");
        return new MeasureScope.layout.1(v, v1, map0, measureScope0, function10);
    }

    public static MeasureResult p(MeasureScope measureScope0, int v, int v1, Map map0, Function1 function10, int v2, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: layout");
        }
        if((v2 & 4) != 0) {
            map0 = Y.z();
        }
        return measureScope0.o1(v, v1, map0, function10);
    }
}

