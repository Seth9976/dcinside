package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nAndroidScrollable.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidScrollable.android.kt\nandroidx/compose/foundation/gestures/AndroidConfig\n+ 2 TempListUtils.kt\nandroidx/compose/foundation/TempListUtilsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,35:1\n59#2,3:36\n62#2,2:43\n64#2:46\n33#3,4:39\n38#3:45\n154#4:47\n*S KotlinDebug\n*F\n+ 1 AndroidScrollable.android.kt\nandroidx/compose/foundation/gestures/AndroidConfig\n*L\n33#1:36,3\n33#1:43,2\n33#1:46\n33#1:39,4\n33#1:45\n33#1:47\n*E\n"})
final class AndroidConfig implements ScrollConfig {
    @l
    public static final AndroidConfig a;

    static {
        AndroidConfig.a = new AndroidConfig();
    }

    @Override  // androidx.compose.foundation.gestures.ScrollConfig
    public long a(@l Density density0, @l PointerEvent pointerEvent0, long v) {
        L.p(density0, "$this$calculateMouseWheelScroll");
        L.p(pointerEvent0, "event");
        List list0 = pointerEvent0.e();
        Offset offset0 = Offset.d(0L);
        int v1 = list0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            offset0 = Offset.d(Offset.v(offset0.A(), ((PointerInputChange)list0.get(v2)).x()));
        }
        return Offset.x(offset0.A(), -density0.y1(64.0f));
    }
}

