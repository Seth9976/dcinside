package androidx.compose.foundation.text.selection;

import A3.a;
import A3.o;
import A3.p;
import A3.r;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.collections.Y;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nSelectionRegistrarImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionRegistrarImpl.kt\nandroidx/compose/foundation/text/selection/SelectionRegistrarImpl\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,205:1\n76#2:206\n102#2,2:207\n*S KotlinDebug\n*F\n+ 1 SelectionRegistrarImpl.kt\nandroidx/compose/foundation/text/selection/SelectionRegistrarImpl\n*L\n99#1:206\n99#1:207,2\n*E\n"})
public final class SelectionRegistrarImpl implements SelectionRegistrar {
    private boolean c;
    @l
    private final List d;
    @l
    private final Map e;
    @l
    private AtomicLong f;
    @m
    private Function1 g;
    @m
    private p h;
    @m
    private Function1 i;
    @m
    private r j;
    @m
    private a k;
    @m
    private Function1 l;
    @m
    private Function1 m;
    @l
    private final MutableState n;

    public SelectionRegistrarImpl() {
        this.d = new ArrayList();
        this.e = new LinkedHashMap();
        this.f = new AtomicLong(1L);
        this.n = SnapshotStateKt__SnapshotStateKt.g(Y.z(), null, 2, null);
    }

    public final void A(@m Function1 function10) {
        this.i = function10;
    }

    public final void B(@m p p0) {
        this.h = p0;
    }

    public final void C(boolean z) {
        this.c = z;
    }

    public void D(@l Map map0) {
        L.p(map0, "<set-?>");
        this.n.setValue(map0);
    }

    @l
    public final List E(@l LayoutCoordinates layoutCoordinates0) {
        L.p(layoutCoordinates0, "containerLayoutCoordinates");
        if(!this.c) {
            b b0 = (Object object0, Object object1) -> {
                L.p(new androidx.compose.foundation.text.selection.SelectionRegistrarImpl.sort.1(layoutCoordinates0), "$tmp0");
                return ((Number)new androidx.compose.foundation.text.selection.SelectionRegistrarImpl.sort.1(layoutCoordinates0).invoke(object0, object1)).intValue();
            };
            u.p0(this.d, b0);
            this.c = true;
        }
        return this.t();

        final class androidx.compose.foundation.text.selection.SelectionRegistrarImpl.sort.1 extends N implements o {
            final LayoutCoordinates e;

            androidx.compose.foundation.text.selection.SelectionRegistrarImpl.sort.1(LayoutCoordinates layoutCoordinates0) {
                this.e = layoutCoordinates0;
                super(2);
            }

            @l
            public final Integer a(@l Selectable selectable0, @l Selectable selectable1) {
                L.p(selectable0, "a");
                L.p(selectable1, "b");
                LayoutCoordinates layoutCoordinates0 = selectable0.d();
                LayoutCoordinates layoutCoordinates1 = selectable1.d();
                long v = layoutCoordinates0 == null ? 0L : this.e.P(layoutCoordinates0, 0L);
                long v1 = layoutCoordinates1 == null ? 0L : this.e.P(layoutCoordinates1, 0L);
                return Offset.r(v) == Offset.r(v1) ? kotlin.comparisons.a.l(Offset.p(v), Offset.p(v1)) : kotlin.comparisons.a.l(Offset.r(v), Offset.r(v1));
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((Selectable)object0), ((Selectable)object1));
            }
        }

    }

    // 检测为 Lambda 实现
    private static final int F(o o0, Object object0, Object object1) [...]

    @Override  // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void a(@l LayoutCoordinates layoutCoordinates0, long v, @l SelectionAdjustment selectionAdjustment0) {
        L.p(layoutCoordinates0, "layoutCoordinates");
        L.p(selectionAdjustment0, "adjustment");
        p p0 = this.h;
        if(p0 != null) {
            p0.invoke(layoutCoordinates0, Offset.d(v), selectionAdjustment0);
        }
    }

    @Override  // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void b(long v) {
        this.c = false;
        Function1 function10 = this.g;
        if(function10 != null) {
            function10.invoke(v);
        }
    }

    @Override  // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void c(@l Selectable selectable0) {
        L.p(selectable0, "selectable");
        Long long0 = selectable0.h();
        if(!this.e.containsKey(long0)) {
            return;
        }
        this.d.remove(selectable0);
        Long long1 = selectable0.h();
        this.e.remove(long1);
        Function1 function10 = this.m;
        if(function10 != null) {
            function10.invoke(selectable0.h());
        }
    }

    @Override  // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void d() {
        a a0 = this.k;
        if(a0 != null) {
            a0.invoke();
        }
    }

    @Override  // androidx.compose.foundation.text.selection.SelectionRegistrar
    public long e() {
        long v;
        for(v = this.f.getAndIncrement(); v == 0L; v = this.f.getAndIncrement()) {
        }
        return v;
    }

    @Override  // androidx.compose.foundation.text.selection.SelectionRegistrar
    @l
    public Map f() {
        return (Map)this.n.getValue();
    }

    @Override  // androidx.compose.foundation.text.selection.SelectionRegistrar
    public boolean g(@l LayoutCoordinates layoutCoordinates0, long v, long v1, boolean z, @l SelectionAdjustment selectionAdjustment0) {
        L.p(layoutCoordinates0, "layoutCoordinates");
        L.p(selectionAdjustment0, "adjustment");
        return this.j == null ? true : ((Boolean)this.j.K0(layoutCoordinates0, Offset.d(v), Offset.d(v1), Boolean.valueOf(z), selectionAdjustment0)).booleanValue();
    }

    @Override  // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void h(long v) {
        Function1 function10 = this.l;
        if(function10 != null) {
            function10.invoke(v);
        }
    }

    @Override  // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void i(long v) {
        Function1 function10 = this.i;
        if(function10 != null) {
            function10.invoke(v);
        }
    }

    @Override  // androidx.compose.foundation.text.selection.SelectionRegistrar
    @l
    public Selectable j(@l Selectable selectable0) {
        L.p(selectable0, "selectable");
        if(selectable0.h() == 0L) {
            throw new IllegalArgumentException(("The selectable contains an invalid id: " + selectable0.h()).toString());
        }
        Long long0 = selectable0.h();
        if(this.e.containsKey(long0)) {
            throw new IllegalArgumentException(("Another selectable with the id: " + selectable0 + ".selectableId has already subscribed.").toString());
        }
        Long long1 = selectable0.h();
        this.e.put(long1, selectable0);
        this.d.add(selectable0);
        this.c = false;
        return selectable0;
    }

    @m
    public final Function1 l() {
        return this.m;
    }

    @m
    public final Function1 m() {
        return this.g;
    }

    @m
    public final Function1 n() {
        return this.l;
    }

    @m
    public final r o() {
        return this.j;
    }

    @m
    public final a p() {
        return this.k;
    }

    @m
    public final Function1 q() {
        return this.i;
    }

    @m
    public final p r() {
        return this.h;
    }

    @l
    public final Map s() {
        return this.e;
    }

    @l
    public final List t() {
        return this.d;
    }

    public final boolean u() {
        return this.c;
    }

    public final void v(@m Function1 function10) {
        this.m = function10;
    }

    public final void w(@m Function1 function10) {
        this.g = function10;
    }

    public final void x(@m Function1 function10) {
        this.l = function10;
    }

    public final void y(@m r r0) {
        this.j = r0;
    }

    public final void z(@m a a0) {
        this.k = a0;
    }
}

