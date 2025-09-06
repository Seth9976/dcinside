package androidx.compose.runtime;

import B3.a;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.l0.f;
import kotlin.jvm.internal.s0;
import kotlin.y;
import y4.l;
import y4.m;

@s0({"SMAP\nSlotTable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SlotTable.kt\nandroidx/compose/runtime/SlotTableKt\n+ 5 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,3443:1\n146#1,8:3486\n162#1,4:3494\n167#1,3:3504\n4492#2,5:3444\n4492#2,5:3449\n4492#2,5:3454\n4492#2,5:3466\n4492#2,5:3471\n4492#2,5:3476\n4492#2,5:3481\n1#3:3459\n3323#4,6:3460\n33#5,6:3498\n33#5,6:3507\n*S KotlinDebug\n*F\n+ 1 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n*L\n310#1:3486,8\n338#1:3494,4\n338#1:3504,3\n190#1:3444,5\n191#1:3449,5\n207#1:3454,5\n221#1:3466,5\n241#1:3471,5\n242#1:3476,5\n251#1:3481,5\n209#1:3460,6\n340#1:3498,6\n477#1:3507,6\n*E\n"})
public final class SlotTable implements a, CompositionData, Iterable {
    @l
    private int[] a;
    private int b;
    @l
    private Object[] c;
    private int d;
    private int e;
    private boolean f;
    private int g;
    @l
    private ArrayList h;

    public SlotTable() {
        this.a = new int[0];
        this.c = new Object[0];
        this.h = new ArrayList();
    }

    private static final void A(SlotReader slotReader0, int v, List list0, kotlin.jvm.internal.l0.a l0$a0, SlotTable slotTable0, List list1) {
        if(slotReader0.q() == v) {
            list0.add(SlotReader.b(slotReader0, 0, 1, null));
            if(l0$a0.a) {
                RecomposeScopeImpl recomposeScopeImpl0 = slotTable0.o(slotReader0.n());
                if(recomposeScopeImpl0 == null) {
                    l0$a0.a = false;
                    list1.clear();
                }
                else {
                    list1.add(recomposeScopeImpl0);
                }
            }
            slotReader0.Z();
            return;
        }
        slotReader0.b0();
        while(!slotReader0.N()) {
            SlotTable.A(slotReader0, v, list0, l0$a0, slotTable0, list1);
        }
        slotReader0.h();
    }

    @m
    public final List B(int v) {
        ArrayList arrayList0 = new ArrayList();
        List list0 = new ArrayList();
        kotlin.jvm.internal.l0.a l0$a0 = new kotlin.jvm.internal.l0.a();
        l0$a0.a = true;
        SlotReader slotReader0 = this.E();
        try {
            SlotTable.A(slotReader0, v, arrayList0, l0$a0, this, list0);
        }
        finally {
            slotReader0.e();
        }
        SlotWriter slotWriter0 = this.F();
        try {
            slotWriter0.h1();
            int v3 = arrayList0.size();
            for(int v4 = 0; v4 < v3; ++v4) {
                Anchor anchor0 = (Anchor)arrayList0.get(v4);
                if(anchor0.e(slotWriter0) >= slotWriter0.Y()) {
                    slotWriter0.W0(anchor0);
                    slotWriter0.F();
                }
            }
            slotWriter0.b1();
            slotWriter0.R();
            return l0$a0.a ? list0 : null;
        }
        finally {
            slotWriter0.I();
        }
    }

    private final List C() {
        return SlotTableKt.Z(this.a, this.b * 5);
    }

    private final List D() {
        return SlotTableKt.d0(this.a, this.b * 5);
    }

    @l
    public final SlotReader E() {
        if(this.f) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        ++this.e;
        return new SlotReader(this);
    }

    @l
    public final SlotWriter F() {
        if(!this.f) {
            if(this.e <= 0) {
                this.f = true;
                ++this.g;
                return new SlotWriter(this);
            }
            ComposerKt.A("Cannot start a writer when a reader is pending");
            throw new y();
        }
        ComposerKt.A("Cannot start a writer when another writer is pending");
        throw new y();
    }

    public final boolean G(@l Anchor anchor0) {
        L.p(anchor0, "anchor");
        if(anchor0.b()) {
            int v = SlotTableKt.k0(this.h, anchor0.a(), this.b);
            return v >= 0 && L.g(this.h.get(v), anchor0);
        }
        return false;
    }

    private final List H() {
        return SlotTableKt.i0(this.a, this.b * 5);
    }

    public final Object I(@l Function1 function10) {
        L.p(function10, "block");
        SlotReader slotReader0 = this.E();
        try {
            return function10.invoke(slotReader0);
        }
        finally {
            slotReader0.e();
        }
    }

    public final void J(@l ArrayList arrayList0) {
        L.p(arrayList0, "<set-?>");
        this.h = arrayList0;
    }

    public final void K(@l int[] arr_v, int v, @l Object[] arr_object, int v1, @l ArrayList arrayList0) {
        L.p(arr_v, "groups");
        L.p(arr_object, "slots");
        L.p(arrayList0, "anchors");
        this.a = arr_v;
        this.b = v;
        this.c = arr_object;
        this.d = v1;
        this.h = arrayList0;
    }

    public final void M(int v) {
        this.g = v;
    }

    @l
    public final List N(int v) {
        int v2;
        int v1 = SlotTableKt.L(this.a, v);
        if(v + 1 < this.b) {
            v2 = SlotTableKt.L(this.a, v + 1);
            return kotlin.collections.l.Ky(this.c).subList(v1, v2);
        }
        v2 = this.c.length;
        return kotlin.collections.l.Ky(this.c).subList(v1, v2);
    }

    public final void O() {
        f l0$f0 = new f();
        if(this.b > 0) {
            while(true) {
                int v1 = l0$f0.a;
                int v2 = this.b;
                if(v1 >= v2) {
                    break;
                }
                SlotTable.P(l0$f0, this, -1, v1 + SlotTableKt.Q(this.a, v1));
            }
            if(v1 != v2) {
                throw new IllegalStateException(("Incomplete group at root " + l0$f0.a + " expected to be " + this.b).toString());
            }
        }
        ArrayList arrayList0 = this.h;
        int v3 = arrayList0.size();
        int v4 = 0;
        for(int v = -1; v4 < v3; v = v5) {
            int v5 = ((Anchor)arrayList0.get(v4)).d(this);
            if(v5 < 0 || v5 > this.b) {
                throw new IllegalArgumentException("Invalid anchor, location out of bound");
            }
            if(v >= v5) {
                throw new IllegalArgumentException("Anchor is out of order");
            }
            ++v4;
        }
    }

    private static final int P(f l0$f0, SlotTable slotTable0, int v, int v1) {
        int v2 = l0$f0.a;
        l0$f0.a = v2 + 1;
        int v3 = SlotTableKt.h0(slotTable0.a, v2);
        if(v3 != v) {
            throw new IllegalStateException(("Invalid parent index detected at " + v2 + ", expected parent index to be " + v + " found " + v3).toString());
        }
        int v4 = SlotTableKt.Q(slotTable0.a, v2) + v2;
        if(v4 > slotTable0.b) {
            throw new IllegalStateException(("A group extends past the end of the table at " + v2).toString());
        }
        if(v4 > v1) {
            throw new IllegalStateException(("A group extends past its parent group at " + v2).toString());
        }
        int v5 = SlotTableKt.L(slotTable0.a, v2);
        int v6 = v2 < slotTable0.b - 1 ? SlotTableKt.L(slotTable0.a, v2 + 1) : slotTable0.d;
        if(v6 > slotTable0.c.length) {
            throw new IllegalStateException(("Slots for " + v2 + " extend past the end of the slot table").toString());
        }
        if(v5 > v6) {
            throw new IllegalStateException(("Invalid data anchor at " + v2).toString());
        }
        if(SlotTableKt.m0(slotTable0.a, v2) > v6) {
            throw new IllegalStateException(("Slots start out of range at " + v2).toString());
        }
        if(v6 - v5 < SlotTableKt.X(slotTable0.a, v2) + SlotTableKt.V(slotTable0.a, v2) + SlotTableKt.T(slotTable0.a, v2)) {
            throw new IllegalStateException(("Not enough slots added for group " + v2).toString());
        }
        boolean z = SlotTableKt.X(slotTable0.a, v2);
        if(z && slotTable0.c[SlotTableKt.f0(slotTable0.a, v2)] == null) {
            throw new IllegalStateException(("No node recorded for a node group at " + v2).toString());
        }
        int v7;
        for(v7 = 0; l0$f0.a < v4; v7 += SlotTable.P(l0$f0, slotTable0, v2, v4)) {
        }
        int v8 = SlotTableKt.c0(slotTable0.a, v2);
        int v9 = SlotTableKt.Q(slotTable0.a, v2);
        if(v8 != v7) {
            throw new IllegalStateException(("Incorrect node count detected at " + v2 + ", expected " + v8 + ", received " + v7).toString());
        }
        int v10 = l0$f0.a - v2;
        if(v9 != v10) {
            throw new IllegalStateException(("Incorrect slot count detected at " + v2 + ", expected " + v9 + ", received " + v10).toString());
        }
        if(SlotTableKt.I(slotTable0.a, v2) && v2 > 0 && !SlotTableKt.J(slotTable0.a, v)) {
            throw new IllegalStateException(("Expected group " + v + " to record it contains a mark because " + v2 + " does").toString());
        }
        return z ? 1 : v7;
    }

    public final int W() {
        return this.d;
    }

    public final Object X(@l Function1 function10) {
        L.p(function10, "block");
        SlotWriter slotWriter0 = this.F();
        try {
            return function10.invoke(slotWriter0);
        }
        finally {
            slotWriter0.I();
        }
    }

    @Override  // androidx.compose.runtime.tooling.CompositionData
    @m
    public CompositionGroup a(@l Object object0) {
        L.p(object0, "identityToFind");
        return new SlotTableGroup(this, 0, 0, 4, null).a(object0);
    }

    @Override  // androidx.compose.runtime.tooling.CompositionData
    @l
    public Iterable b() {
        return this;
    }

    @l
    public final Anchor c(int v) {
        if(!this.f) {
            if(v >= 0) {
                int v1 = this.b;
                if(v < v1) {
                    ArrayList arrayList0 = this.h;
                    int v2 = SlotTableKt.k0(arrayList0, v, v1);
                    if(v2 < 0) {
                        Anchor anchor0 = new Anchor(v);
                        arrayList0.add(-(v2 + 1), anchor0);
                        return anchor0;
                    }
                    Object object0 = arrayList0.get(v2);
                    L.o(object0, "get(location)");
                    return (Anchor)object0;
                }
            }
            throw new IllegalArgumentException("Parameter index is out of range");
        }
        ComposerKt.A("use active SlotWriter to create an anchor location instead ");
        throw new y();
    }

    public final int d(@l Anchor anchor0) {
        L.p(anchor0, "anchor");
        if(!this.f) {
            if(!anchor0.b()) {
                throw new IllegalArgumentException("Anchor refers to a group that was removed");
            }
            return anchor0.a();
        }
        ComposerKt.A("Use active SlotWriter to determine anchor location instead");
        throw new y();
    }

    @l
    public final String g() {
        if(this.f) {
            return super.toString();
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(super.toString());
        stringBuilder0.append('\n');
        int v = this.b;
        if(v > 0) {
            for(int v1 = 0; v1 < v; v1 += this.l(stringBuilder0, v1, 0)) {
            }
        }
        else {
            stringBuilder0.append("<EMPTY>");
        }
        String s = stringBuilder0.toString();
        L.o(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    public final void h(@l SlotReader slotReader0) {
        L.p(slotReader0, "reader");
        if(slotReader0.C() == this && this.e > 0) {
            --this.e;
            return;
        }
        ComposerKt.A("Unexpected reader close()");
        throw new y();
    }

    public final void i(@l SlotWriter slotWriter0, @l int[] arr_v, int v, @l Object[] arr_object, int v1, @l ArrayList arrayList0) {
        L.p(slotWriter0, "writer");
        L.p(arr_v, "groups");
        L.p(arr_object, "slots");
        L.p(arrayList0, "anchors");
        if(slotWriter0.b0() != this || !this.f) {
            throw new IllegalArgumentException("Unexpected writer close()");
        }
        this.f = false;
        this.K(arr_v, v, arr_object, v1, arrayList0);
    }

    @Override  // androidx.compose.runtime.tooling.CompositionData
    public boolean isEmpty() {
        return this.b == 0;
    }

    @Override
    @l
    public Iterator iterator() {
        return new GroupIterator(this, 0, this.b);
    }

    public final boolean j() {
        return this.b > 0 && SlotTableKt.J(this.a, 0);
    }

    private final List k() {
        return SlotTableKt.M(this.a, this.b * 5);
    }

    private final int l(StringBuilder stringBuilder0, int v, int v1) {
        for(int v2 = 0; v2 < v1; ++v2) {
            stringBuilder0.append(' ');
        }
        stringBuilder0.append("Group(");
        stringBuilder0.append(v);
        stringBuilder0.append(") key=");
        stringBuilder0.append(SlotTableKt.Y(this.a, v));
        int v3 = SlotTableKt.Q(this.a, v);
        stringBuilder0.append(", nodes=");
        stringBuilder0.append(SlotTableKt.c0(this.a, v));
        stringBuilder0.append(", size=");
        stringBuilder0.append(v3);
        if(SlotTableKt.U(this.a, v)) {
            stringBuilder0.append(", mark");
        }
        if(SlotTableKt.J(this.a, v)) {
            stringBuilder0.append(", contains mark");
        }
        int v4 = SlotTable.m(this, v);
        int v5 = v + 1;
        int v6 = SlotTable.m(this, v5);
        if(v4 < 0 || v4 > v6 || v6 > this.d) {
            stringBuilder0.append(", *invalid data offsets " + v4 + '-' + v6 + '*');
        }
        else {
            if(SlotTableKt.V(this.a, v)) {
                stringBuilder0.append(" objectKey=" + this.c[SlotTableKt.g0(this.a, v)]);
            }
            if(SlotTableKt.X(this.a, v)) {
                stringBuilder0.append(" node=" + this.c[SlotTableKt.f0(this.a, v)]);
            }
            if(SlotTableKt.T(this.a, v)) {
                stringBuilder0.append(" aux=" + this.c[SlotTableKt.H(this.a, v)]);
            }
            int v7 = SlotTableKt.m0(this.a, v);
            if(v7 < v6) {
                stringBuilder0.append(", slots=[");
                stringBuilder0.append(v7);
                stringBuilder0.append(": ");
                for(int v8 = v7; v8 < v6; ++v8) {
                    if(v8 != v7) {
                        stringBuilder0.append(", ");
                    }
                    stringBuilder0.append(String.valueOf(this.c[v8]));
                }
                stringBuilder0.append("]");
            }
        }
        stringBuilder0.append('\n');
        while(v5 < v + v3) {
            v5 += this.l(stringBuilder0, v5, v1 + 1);
        }
        return v3;
    }

    private static final int m(SlotTable slotTable0, int v) {
        return v < slotTable0.b ? SlotTableKt.L(slotTable0.a, v) : slotTable0.d;
    }

    private final RecomposeScopeImpl o(int v) {
        while(v > 0) {
            for(Object object0: new DataIterator(this, v)) {
                if(object0 instanceof RecomposeScopeImpl) {
                    return (RecomposeScopeImpl)object0;
                }
                if(false) {
                    break;
                }
            }
            v = SlotTableKt.h0(this.a, v);
        }
        return null;
    }

    @l
    public final ArrayList p() {
        return this.h;
    }

    @l
    public final int[] q() {
        return this.a;
    }

    public final int r() {
        return this.b;
    }

    @l
    public final Object[] t() {
        return this.c;
    }

    public final int u() {
        return this.g;
    }

    public final boolean v() {
        return this.f;
    }

    public final boolean x(int v, @l Anchor anchor0) {
        L.p(anchor0, "anchor");
        if(!this.f) {
            if(v >= 0 && v < this.b) {
                if(this.G(anchor0)) {
                    int v1 = SlotTableKt.Q(this.a, v);
                    int v2 = anchor0.a();
                    return v <= v2 && v2 < v1 + v;
                }
                return false;
            }
            ComposerKt.A("Invalid group index");
            throw new y();
        }
        ComposerKt.A("Writer is active");
        throw new y();
    }

    private final List y() {
        return SlotTableKt.R(this.a, this.b * 5);
    }

    private final boolean z(int v) {
        while(v >= 0) {
            for(Object object0: new DataIterator(this, v)) {
                if(object0 instanceof RecomposeScopeImpl) {
                    ((RecomposeScopeImpl)object0).D(true);
                    return ((RecomposeScopeImpl)object0).t(null) == InvalidationResult.a ? z : true;
                }
                if(false) {
                    break;
                }
            }
            z = false;
            v = SlotTableKt.h0(this.a, v);
        }
        return false;
    }
}

