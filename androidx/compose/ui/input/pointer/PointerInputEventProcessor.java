package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.HitTestResult;
import androidx.compose.ui.node.LayoutNode;
import java.util.Collection;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nPointerInputEventProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInputEventProcessor.kt\nandroidx/compose/ui/input/pointer/PointerInputEventProcessor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,237:1\n1747#2,3:238\n1855#2,2:241\n1747#2,3:243\n*S KotlinDebug\n*F\n+ 1 PointerInputEventProcessor.kt\nandroidx/compose/ui/input/pointer/PointerInputEventProcessor\n*L\n78#1:238,3\n81#1:241,2\n104#1:243,3\n*E\n"})
public final class PointerInputEventProcessor {
    @l
    private final LayoutNode a;
    @l
    private final HitPathTracker b;
    @l
    private final PointerInputChangeEventProducer c;
    @l
    private final HitTestResult d;
    private boolean e;

    public PointerInputEventProcessor(@l LayoutNode layoutNode0) {
        L.p(layoutNode0, "root");
        super();
        this.a = layoutNode0;
        this.b = new HitPathTracker(layoutNode0.v());
        this.c = new PointerInputChangeEventProducer();
        this.d = new HitTestResult();
    }

    @l
    public final LayoutNode a() {
        return this.a;
    }

    public final int b(@l PointerInputEvent pointerInputEvent0, @l PositionCalculator positionCalculator0, boolean z) {
        boolean z3;
        boolean z2;
        L.p(pointerInputEvent0, "pointerEvent");
        L.p(positionCalculator0, "positionCalculator");
        if(this.e) {
            return 0;
        }
        boolean z1 = true;
        try {
            z2 = true;
            this.e = true;
            InternalPointerEvent internalPointerEvent0 = this.c.b(pointerInputEvent0, positionCalculator0);
            Iterable iterable0 = internalPointerEvent0.a().values();
            if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
                for(Object object0: iterable0) {
                    if(((PointerInputChange)object0).r() || ((PointerInputChange)object0).v()) {
                        z1 = false;
                        break;
                    }
                }
            }
            for(Object object1: internalPointerEvent0.a().values()) {
                PointerInputChange pointerInputChange0 = (PointerInputChange)object1;
                if(z1 || PointerEventKt.c(pointerInputChange0)) {
                    LayoutNode.K0(this.a, pointerInputChange0.q(), this.d, PointerType.i(pointerInputChange0.y(), 1), false, 8, null);
                    if(!this.d.isEmpty()) {
                        this.b.a(pointerInputChange0.p(), this.d);
                        this.d.clear();
                    }
                }
            }
            this.b.f();
            z3 = this.b.b(internalPointerEvent0, z);
            if(!internalPointerEvent0.d()) {
                Iterable iterable1 = internalPointerEvent0.a().values();
                if(!(iterable1 instanceof Collection) || !((Collection)iterable1).isEmpty()) {
                    for(Object object2: iterable1) {
                        if(!PointerEventKt.q(((PointerInputChange)object2)) || !((PointerInputChange)object2).A()) {
                            continue;
                        }
                        return PointerInputEventProcessorKt.a(z3, z2);
                    }
                }
            }
            z2 = false;
        }
        finally {
            this.e = false;
        }
        return PointerInputEventProcessorKt.a(z3, z2);
    }

    public static int c(PointerInputEventProcessor pointerInputEventProcessor0, PointerInputEvent pointerInputEvent0, PositionCalculator positionCalculator0, boolean z, int v, Object object0) {
        if((v & 4) != 0) {
            z = true;
        }
        return pointerInputEventProcessor0.b(pointerInputEvent0, positionCalculator0, z);
    }

    public final void d() {
        if(!this.e) {
            this.c.a();
            this.b.e();
        }
    }
}

