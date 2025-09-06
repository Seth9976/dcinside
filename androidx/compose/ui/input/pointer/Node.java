package androidx.compose.ui.input.pointer;

import A3.a;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.PointerInputModifierNodeKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nHitPathTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/Node\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,538:1\n486#1,5:542\n493#1:558\n486#1,5:559\n493#1:575\n1182#2:539\n1161#2,2:540\n460#3,11:547\n460#3,11:564\n48#3:582\n523#3:583\n460#3,11:593\n33#4,6:576\n116#4,2:584\n33#4,6:586\n118#4:592\n33#4,6:604\n*S KotlinDebug\n*F\n+ 1 HitPathTracker.kt\nandroidx/compose/ui/input/pointer/Node\n*L\n292#1:542,5\n292#1:558\n326#1:559,5\n326#1:575\n263#1:539\n263#1:540,2\n300#1:547,11\n334#1:564,11\n407#1:582\n408#1:583\n504#1:593,11\n377#1:576,6\n415#1:584,2\n415#1:586,6\n415#1:592\n519#1:604,6\n*E\n"})
public final class Node extends NodeParent {
    @l
    private final PointerInputModifierNode b;
    @l
    private final MutableVector c;
    @l
    private final Map d;
    @m
    private LayoutCoordinates e;
    @m
    private PointerEvent f;
    private boolean g;
    private boolean h;
    private boolean i;

    public Node(@l PointerInputModifierNode pointerInputModifierNode0) {
        L.p(pointerInputModifierNode0, "pointerInputNode");
        super();
        this.b = pointerInputModifierNode0;
        this.c = new MutableVector(new PointerId[16], 0);
        this.d = new LinkedHashMap();
        this.h = true;
        this.i = true;
    }

    @Override  // androidx.compose.ui.input.pointer.NodeParent
    public boolean a(@l Map map0, @l LayoutCoordinates layoutCoordinates0, @l InternalPointerEvent internalPointerEvent0, boolean z) {
        Object object1;
        L.p(map0, "changes");
        L.p(layoutCoordinates0, "parentCoordinates");
        L.p(internalPointerEvent0, "internalPointerEvent");
        boolean z1 = super.a(map0, layoutCoordinates0, internalPointerEvent0, z);
        if(!PointerInputModifierNodeKt.c(this.b)) {
            return true;
        }
        this.e = PointerInputModifierNodeKt.a(this.b);
        for(Object object0: map0.entrySet()) {
            long v1 = ((PointerId)((Map.Entry)object0).getKey()).h();
            PointerInputChange pointerInputChange0 = (PointerInputChange)((Map.Entry)object0).getValue();
            PointerId pointerId0 = PointerId.a(v1);
            if(this.c.m(pointerId0)) {
                ArrayList arrayList0 = new ArrayList();
                List list0 = pointerInputChange0.n();
                int v2 = list0.size();
                for(int v = 0; v < v2; ++v) {
                    HistoricalChange historicalChange0 = (HistoricalChange)list0.get(v);
                    LayoutCoordinates layoutCoordinates1 = this.e;
                    L.m(layoutCoordinates1);
                    arrayList0.add(new HistoricalChange(historicalChange0.b(), layoutCoordinates1.P(layoutCoordinates0, historicalChange0.a()), null));
                }
                PointerId pointerId1 = PointerId.a(v1);
                LayoutCoordinates layoutCoordinates2 = this.e;
                L.m(layoutCoordinates2);
                long v3 = layoutCoordinates2.P(layoutCoordinates0, pointerInputChange0.u());
                LayoutCoordinates layoutCoordinates3 = this.e;
                L.m(layoutCoordinates3);
                PointerInputChange pointerInputChange1 = PointerInputChange.i(pointerInputChange0, 0L, 0L, layoutCoordinates3.P(layoutCoordinates0, pointerInputChange0.q()), false, 0L, v3, false, 0, arrayList0, 0L, 731, null);
                this.d.put(pointerId1, pointerInputChange1);
            }
        }
        if(this.d.isEmpty()) {
            this.c.l();
            this.g().l();
            return true;
        }
        for(int v4 = this.c.J() - 1; -1 < v4; --v4) {
            if(!map0.containsKey(PointerId.a(((PointerId)this.c.F()[v4]).h()))) {
                this.c.e0(v4);
            }
        }
        PointerEvent pointerEvent0 = new PointerEvent(u.V5(this.d.values()), internalPointerEvent0);
        List list1 = pointerEvent0.e();
        int v5 = list1.size();
        for(int v6 = 0; true; ++v6) {
            object1 = null;
            if(v6 >= v5) {
                break;
            }
            Object object2 = list1.get(v6);
            if(internalPointerEvent0.e(((PointerInputChange)object2).p())) {
                object1 = object2;
                break;
            }
        }
        if(((PointerInputChange)object1) != null) {
            if(!z) {
                this.h = false;
            }
            else if(!this.h && (((PointerInputChange)object1).r() || ((PointerInputChange)object1).v())) {
                LayoutCoordinates layoutCoordinates4 = this.e;
                L.m(layoutCoordinates4);
                this.h = !PointerEventKt.i(((PointerInputChange)object1), layoutCoordinates4.a());
            }
            if(this.h != this.g && (PointerEventType.k(pointerEvent0.i(), 3) || PointerEventType.k(pointerEvent0.i(), 4) || PointerEventType.k(pointerEvent0.i(), 5))) {
                pointerEvent0.j((this.h ? 4 : 5));
            }
            else if(PointerEventType.k(pointerEvent0.i(), 4) && this.g && !this.i) {
                pointerEvent0.j(3);
            }
            else if(PointerEventType.k(pointerEvent0.i(), 5) && this.h && ((PointerInputChange)object1).r()) {
                pointerEvent0.j(3);
            }
        }
        boolean z2 = z1 || !PointerEventType.k(pointerEvent0.i(), 3) || this.m(this.f, pointerEvent0);
        this.f = pointerEvent0;
        return z2;
    }

    @Override  // androidx.compose.ui.input.pointer.NodeParent
    public void b(@l InternalPointerEvent internalPointerEvent0) {
        L.p(internalPointerEvent0, "internalPointerEvent");
        super.b(internalPointerEvent0);
        PointerEvent pointerEvent0 = this.f;
        if(pointerEvent0 == null) {
            return;
        }
        this.g = this.h;
        List list0 = pointerEvent0.e();
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            PointerInputChange pointerInputChange0 = (PointerInputChange)list0.get(v1);
            if(!pointerInputChange0.r() && (!internalPointerEvent0.e(pointerInputChange0.p()) || !this.h)) {
                PointerId pointerId0 = PointerId.a(pointerInputChange0.p());
                this.c.a0(pointerId0);
            }
        }
        this.h = false;
        this.i = PointerEventType.k(pointerEvent0.i(), 5);
    }

    @Override  // androidx.compose.ui.input.pointer.NodeParent
    public void d() {
        MutableVector mutableVector0 = this.g();
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
        this.b.n();
    }

    @Override  // androidx.compose.ui.input.pointer.NodeParent
    public boolean e(@l InternalPointerEvent internalPointerEvent0) {
        L.p(internalPointerEvent0, "internalPointerEvent");
        int v = 0;
        if(!this.d.isEmpty() && PointerInputModifierNodeKt.c(this.b)) {
            PointerEvent pointerEvent0 = this.f;
            L.m(pointerEvent0);
            LayoutCoordinates layoutCoordinates0 = this.e;
            L.m(layoutCoordinates0);
            long v1 = layoutCoordinates0.a();
            this.b.r(pointerEvent0, PointerEventPass.c, v1);
            if(PointerInputModifierNodeKt.c(this.b)) {
                MutableVector mutableVector0 = this.g();
                int v2 = mutableVector0.J();
                if(v2 > 0) {
                    Object[] arr_object = mutableVector0.F();
                    while(true) {
                        ((Node)arr_object[v]).e(internalPointerEvent0);
                        ++v;
                        if(v >= v2) {
                            break;
                        }
                    }
                }
            }
            v = 1;
        }
        this.b(internalPointerEvent0);
        this.i();
        return v != 0;
    }

    @Override  // androidx.compose.ui.input.pointer.NodeParent
    public boolean f(@l Map map0, @l LayoutCoordinates layoutCoordinates0, @l InternalPointerEvent internalPointerEvent0, boolean z) {
        L.p(map0, "changes");
        L.p(layoutCoordinates0, "parentCoordinates");
        L.p(internalPointerEvent0, "internalPointerEvent");
        int v = 0;
        if(!this.d.isEmpty() && PointerInputModifierNodeKt.c(this.b)) {
            PointerEvent pointerEvent0 = this.f;
            L.m(pointerEvent0);
            LayoutCoordinates layoutCoordinates1 = this.e;
            L.m(layoutCoordinates1);
            long v1 = layoutCoordinates1.a();
            this.b.r(pointerEvent0, PointerEventPass.a, v1);
            if(PointerInputModifierNodeKt.c(this.b)) {
                MutableVector mutableVector0 = this.g();
                int v2 = mutableVector0.J();
                if(v2 > 0) {
                    Object[] arr_object = mutableVector0.F();
                    while(true) {
                        Node node0 = (Node)arr_object[v];
                        LayoutCoordinates layoutCoordinates2 = this.e;
                        L.m(layoutCoordinates2);
                        node0.f(this.d, layoutCoordinates2, internalPointerEvent0, z);
                        ++v;
                        if(v >= v2) {
                            break;
                        }
                    }
                }
            }
            if(PointerInputModifierNodeKt.c(this.b)) {
                this.b.r(pointerEvent0, PointerEventPass.b, v1);
            }
            v = 1;
        }
        return v != 0;
    }

    private final void i() {
        this.d.clear();
        this.e = null;
    }

    private final boolean j(a a0) {
        if(this.d.isEmpty()) {
            return false;
        }
        if(!PointerInputModifierNodeKt.c(this.b)) {
            return false;
        }
        a0.invoke();
        return true;
    }

    @l
    public final MutableVector k() {
        return this.c;
    }

    @l
    public final PointerInputModifierNode l() {
        return this.b;
    }

    private final boolean m(PointerEvent pointerEvent0, PointerEvent pointerEvent1) {
        if(pointerEvent0 != null && pointerEvent0.e().size() == pointerEvent1.e().size()) {
            int v = pointerEvent1.e().size();
            for(int v1 = 0; v1 < v; ++v1) {
                if(!Offset.l(((PointerInputChange)pointerEvent0.e().get(v1)).q(), ((PointerInputChange)pointerEvent1.e().get(v1)).q())) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final void n() {
        this.h = true;
    }

    @Override
    @l
    public String toString() {
        return "Node(pointerInputFilter=" + this.b + ", children=" + this.g() + ", pointerIds=" + this.c + ')';
    }
}

