package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nInternalPointerEvent.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InternalPointerEvent.android.kt\nandroidx/compose/ui/input/pointer/InternalPointerEvent\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,35:1\n116#2,2:36\n33#2,6:38\n118#2:44\n*S KotlinDebug\n*F\n+ 1 InternalPointerEvent.android.kt\nandroidx/compose/ui/input/pointer/InternalPointerEvent\n*L\n30#1:36,2\n30#1:38,6\n30#1:44\n*E\n"})
public final class InternalPointerEvent {
    @l
    private final Map a;
    @l
    private final PointerInputEvent b;
    private boolean c;

    public InternalPointerEvent(@l Map map0, @l PointerInputEvent pointerInputEvent0) {
        L.p(map0, "changes");
        L.p(pointerInputEvent0, "pointerInputEvent");
        super();
        this.a = map0;
        this.b = pointerInputEvent0;
    }

    @l
    public final Map a() {
        return this.a;
    }

    @l
    public final MotionEvent b() {
        return this.b.a();
    }

    @l
    public final PointerInputEvent c() {
        return this.b;
    }

    public final boolean d() {
        return this.c;
    }

    public final boolean e(long v) {
        List list0 = this.b.b();
        int v1 = list0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            Object object0 = list0.get(v2);
            if(PointerId.d(((PointerInputEventData)object0).o(), v)) {
                return ((PointerInputEventData)object0) == null ? false : ((PointerInputEventData)object0).p();
            }
        }
        return false;
    }

    public final void f(boolean z) {
        this.c = z;
    }
}

