package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.PointerInputModifierNode;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nHitPathTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/HitPathTracker\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,538:1\n366#2,12:539\n*S KotlinDebug\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/HitPathTracker\n*L\n61#1:539,12\n*E\n"})
public final class HitPathTracker {
    @l
    private final LayoutCoordinates a;
    @l
    private final NodeParent b;

    public HitPathTracker(@l LayoutCoordinates layoutCoordinates0) {
        L.p(layoutCoordinates0, "rootCoordinates");
        super();
        this.a = layoutCoordinates0;
        this.b = new NodeParent();
    }

    public final void a(long v, @l List list0) {
        Object object1;
        L.p(list0, "pointerInputNodes");
        NodeParent nodeParent0 = this.b;
        int v1 = list0.size();
        boolean z = true;
        int v2 = 0;
        while(v2 < v1) {
            PointerInputModifierNode pointerInputModifierNode0 = (PointerInputModifierNode)list0.get(v2);
            if(z) {
                MutableVector mutableVector0 = nodeParent0.g();
                int v3 = mutableVector0.J();
                if(v3 > 0) {
                    Object[] arr_object = mutableVector0.F();
                    int v4 = 0;
                    while(true) {
                        Object object0 = arr_object[v4];
                        if(L.g(((Node)object0).l(), pointerInputModifierNode0)) {
                            object1 = object0;
                            goto label_21;
                        }
                        if(v4 + 1 >= v3) {
                            break;
                        }
                        ++v4;
                    }
                }
                object1 = null;
            label_21:
                if(((Node)object1) == null) {
                    z = false;
                }
                else {
                    ((Node)object1).n();
                    if(!((Node)object1).k().m(PointerId.a(v))) {
                        ((Node)object1).k().b(PointerId.a(v));
                    }
                    nodeParent0 = (Node)object1;
                    goto label_32;
                }
            }
            Node node0 = new Node(pointerInputModifierNode0);
            node0.k().b(PointerId.a(v));
            nodeParent0.g().b(node0);
            nodeParent0 = node0;
        label_32:
            ++v2;
        }
    }

    public final boolean b(@l InternalPointerEvent internalPointerEvent0, boolean z) {
        L.p(internalPointerEvent0, "internalPointerEvent");
        if(!this.b.a(internalPointerEvent0.a(), this.a, internalPointerEvent0, z)) {
            return false;
        }
        boolean z1 = this.b.f(internalPointerEvent0.a(), this.a, internalPointerEvent0, z);
        return this.b.e(internalPointerEvent0) || z1;
    }

    public static boolean c(HitPathTracker hitPathTracker0, InternalPointerEvent internalPointerEvent0, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = true;
        }
        return hitPathTracker0.b(internalPointerEvent0, z);
    }

    @l
    public final NodeParent d() {
        return this.b;
    }

    public final void e() {
        this.b.d();
        this.b.c();
    }

    public final void f() {
        this.b.h();
    }
}

