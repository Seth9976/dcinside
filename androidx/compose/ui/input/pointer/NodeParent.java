package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.PointerInputModifierNodeKt;
import java.util.Map;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nHitPathTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/NodeParent\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,538:1\n1182#2:539\n1161#2,2:540\n460#3,11:542\n460#3,11:553\n460#3,11:564\n460#3,11:575\n523#3:586\n48#3:587\n523#3:588\n*S KotlinDebug\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/NodeParent\n*L\n143#1:539\n143#1:540,2\n152#1:542,11\n182#1:553,11\n201#1:564,11\n212#1:575,11\n228#1:586\n240#1:587\n241#1:588\n*E\n"})
public class NodeParent {
    @l
    private final MutableVector a;

    public NodeParent() {
        this.a = new MutableVector(new Node[16], 0);
    }

    public boolean a(@l Map map0, @l LayoutCoordinates layoutCoordinates0, @l InternalPointerEvent internalPointerEvent0, boolean z) {
        L.p(map0, "changes");
        L.p(layoutCoordinates0, "parentCoordinates");
        L.p(internalPointerEvent0, "internalPointerEvent");
        MutableVector mutableVector0 = this.a;
        int v = mutableVector0.J();
        if(v > 0) {
            Object[] arr_object = mutableVector0.F();
            int v1 = 0;
            boolean z1 = false;
            do {
                z1 = ((Node)arr_object[v1]).a(map0, layoutCoordinates0, internalPointerEvent0, z) || z1;
                ++v1;
            }
            while(v1 < v);
            return z1;
        }
        return false;
    }

    public void b(@l InternalPointerEvent internalPointerEvent0) {
        L.p(internalPointerEvent0, "internalPointerEvent");
        for(int v = this.a.J() - 1; -1 < v; --v) {
            if(((Node)this.a.F()[v]).k().N()) {
                this.a.e0(v);
            }
        }
    }

    public final void c() {
        this.a.l();
    }

    public void d() {
        MutableVector mutableVector0 = this.a;
        int v = mutableVector0.J();
        if(v > 0) {
            Object[] arr_object = mutableVector0.F();
            int v1 = 0;
            while(true) {
                ((Node)arr_object[v1]).d();
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
    }

    public boolean e(@l InternalPointerEvent internalPointerEvent0) {
        L.p(internalPointerEvent0, "internalPointerEvent");
        MutableVector mutableVector0 = this.a;
        int v = mutableVector0.J();
        boolean z = false;
        if(v > 0) {
            Object[] arr_object = mutableVector0.F();
            int v1 = 0;
            boolean z1 = false;
            do {
                z1 = ((Node)arr_object[v1]).e(internalPointerEvent0) || z1;
                ++v1;
            }
            while(v1 < v);
            z = z1;
        }
        this.b(internalPointerEvent0);
        return z;
    }

    public boolean f(@l Map map0, @l LayoutCoordinates layoutCoordinates0, @l InternalPointerEvent internalPointerEvent0, boolean z) {
        L.p(map0, "changes");
        L.p(layoutCoordinates0, "parentCoordinates");
        L.p(internalPointerEvent0, "internalPointerEvent");
        MutableVector mutableVector0 = this.a;
        int v = mutableVector0.J();
        if(v > 0) {
            Object[] arr_object = mutableVector0.F();
            int v1 = 0;
            boolean z1 = false;
            do {
                z1 = ((Node)arr_object[v1]).f(map0, layoutCoordinates0, internalPointerEvent0, z) || z1;
                ++v1;
            }
            while(v1 < v);
            return z1;
        }
        return false;
    }

    @l
    public final MutableVector g() {
        return this.a;
    }

    public final void h() {
        int v = 0;
        while(v < this.a.J()) {
            Node node0 = (Node)this.a.F()[v];
            if(PointerInputModifierNodeKt.c(node0.l())) {
                ++v;
                node0.h();
            }
            else {
                this.a.e0(v);
                node0.d();
            }
        }
    }
}

