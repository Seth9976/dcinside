package androidx.compose.ui.input.pointer;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;

@s0({"SMAP\nPointerInputEventProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInputEventProcessor.kt\nandroidx/compose/ui/input/pointer/PointerInputChangeEventProducer\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,237:1\n33#2,6:238\n*S KotlinDebug\n*F\n+ 1 PointerInputEventProcessor.kt\nandroidx/compose/ui/input/pointer/PointerInputChangeEventProducer\n*L\n147#1:238,6\n*E\n"})
final class PointerInputChangeEventProducer {
    static final class PointerInputData {
        private final long a;
        private final long b;
        private final boolean c;
        private final int d;

        private PointerInputData(long v, long v1, boolean z, int v2) {
            this.a = v;
            this.b = v1;
            this.c = z;
            this.d = v2;
        }

        public PointerInputData(long v, long v1, boolean z, int v2, w w0) {
            this(v, v1, z, v2);
        }

        public final boolean a() {
            return this.c;
        }

        public final long b() {
            return this.b;
        }

        public final int c() {
            return this.d;
        }

        public final long d() {
            return this.a;
        }
    }

    @l
    private final Map a;

    public PointerInputChangeEventProducer() {
        this.a = new LinkedHashMap();
    }

    public final void a() {
        this.a.clear();
    }

    @l
    public final InternalPointerEvent b(@l PointerInputEvent pointerInputEvent0, @l PositionCalculator positionCalculator0) {
        boolean z;
        long v3;
        long v2;
        L.p(pointerInputEvent0, "pointerInputEvent");
        L.p(positionCalculator0, "positionCalculator");
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(pointerInputEvent0.b().size());
        List list0 = pointerInputEvent0.b();
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            PointerInputEventData pointerInputEventData0 = (PointerInputEventData)list0.get(v1);
            PointerId pointerId0 = PointerId.a(pointerInputEventData0.o());
            PointerInputData pointerInputChangeEventProducer$PointerInputData0 = (PointerInputData)this.a.get(pointerId0);
            if(pointerInputChangeEventProducer$PointerInputData0 == null) {
                v2 = pointerInputEventData0.v();
                v3 = pointerInputEventData0.q();
                z = false;
            }
            else {
                v2 = pointerInputChangeEventProducer$PointerInputData0.d();
                z = pointerInputChangeEventProducer$PointerInputData0.a();
                v3 = positionCalculator0.h(pointerInputChangeEventProducer$PointerInputData0.b());
            }
            linkedHashMap0.put(PointerId.a(pointerInputEventData0.o()), new PointerInputChange(pointerInputEventData0.o(), pointerInputEventData0.v(), pointerInputEventData0.q(), pointerInputEventData0.m(), pointerInputEventData0.s(), v2, v3, z, false, pointerInputEventData0.u(), pointerInputEventData0.n(), pointerInputEventData0.t(), null));
            if(pointerInputEventData0.m()) {
                PointerId pointerId1 = PointerId.a(pointerInputEventData0.o());
                PointerInputData pointerInputChangeEventProducer$PointerInputData1 = new PointerInputData(pointerInputEventData0.v(), pointerInputEventData0.r(), pointerInputEventData0.m(), pointerInputEventData0.u(), null);
                this.a.put(pointerId1, pointerInputChangeEventProducer$PointerInputData1);
            }
            else {
                PointerId pointerId2 = PointerId.a(pointerInputEventData0.o());
                this.a.remove(pointerId2);
            }
        }
        return new InternalPointerEvent(linkedHashMap0, pointerInputEvent0);
    }
}

