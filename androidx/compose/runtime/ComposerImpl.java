package androidx.compose.runtime;

import A3.a;
import A3.o;
import A3.p;
import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.collection.IntMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.ListUtilsKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.S0;
import kotlin.V;
import kotlin.b0;
import kotlin.collections.u;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0.f;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.v0;
import kotlin.r0;
import kotlin.y;
import y4.l;
import y4.m;

@s0({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 4 Trace.kt\nandroidx/compose/runtime/TraceKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Composer.kt\nandroidx/compose/runtime/GroupKind\n+ 7 BitwiseOperators.kt\nandroidx/compose/runtime/BitwiseOperatorsKt\n+ 8 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 9 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n+ 10 IdentityArrayMap.kt\nandroidx/compose/runtime/collection/IdentityArrayMap\n+ 11 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,4507:1\n3191#1,4:4546\n3201#1,6:4566\n3191#1,6:4572\n3208#1,2:4578\n3196#1:4584\n3191#1,6:4652\n1#2:4508\n146#3,8:4509\n146#3,8:4554\n146#3,4:4562\n151#3,3:4580\n162#3,8:4640\n146#3,4:4648\n151#3,3:4658\n46#4,5:4517\n46#4,3:4615\n50#4:4621\n4492#5,5:4522\n4492#5,5:4527\n309#5:4532\n4492#5,5:4536\n4492#5,5:4541\n4492#5,5:4595\n4492#5,5:4600\n4492#5,5:4605\n4492#5,5:4610\n4492#5,5:4625\n4492#5,5:4630\n4492#5,5:4635\n4492#5,5:4661\n4492#5,5:4666\n4492#5,5:4671\n4492#5,5:4676\n4422#6:4533\n4423#6:4534\n26#7:4535\n26#7:4681\n22#7:4682\n33#8,4:4550\n38#8:4583\n33#8,4:4585\n38#8:4594\n82#8,3:4683\n33#8,4:4686\n85#8,2:4690\n38#8:4692\n87#8:4693\n105#9,5:4589\n146#10,3:4618\n150#10:4622\n1002#11,2:4623\n1855#11,2:4694\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl\n*L\n3032#1:4546,4\n3145#1:4566,6\n3151#1:4572,6\n3145#1:4578,2\n3032#1:4584\n3749#1:4652,6\n1300#1:4509,8\n3060#1:4554,8\n3144#1:4562,4\n3144#1:4580,3\n3716#1:4640,8\n3747#1:4648,4\n3747#1:4658,3\n1540#1:4517,5\n3318#1:4615,3\n3318#1:4621\n1609#1:4522,5\n1636#1:4527,5\n1966#1:4532\n2749#1:4536,5\n2762#1:4541,5\n3276#1:4595,5\n3281#1:4600,5\n3297#1:4605,5\n3317#1:4610,5\n3384#1:4625,5\n3391#1:4630,5\n3528#1:4635,5\n3796#1:4661,5\n3812#1:4666,5\n3813#1:4671,5\n3841#1:4676,5\n2125#1:4533\n2149#1:4534\n2673#1:4535\n4036#1:4681\n4052#1:4682\n3034#1:4550,4\n3034#1:4583\n3227#1:4585,4\n3227#1:4594\n3620#1:4683,3\n3620#1:4686,4\n3620#1:4690,2\n3620#1:4692\n3620#1:4693\n3229#1:4589,5\n3322#1:4618,3\n3322#1:4622\n3326#1:4623,2\n3656#1:4694,2\n*E\n"})
public final class ComposerImpl implements Composer {
    static final class CompositionContextHolder implements RememberObserver {
        @l
        private final CompositionContextImpl a;

        public CompositionContextHolder(@l CompositionContextImpl composerImpl$CompositionContextImpl0) {
            L.p(composerImpl$CompositionContextImpl0, "ref");
            super();
            this.a = composerImpl$CompositionContextImpl0;
        }

        @Override  // androidx.compose.runtime.RememberObserver
        public void a() {
        }

        @l
        public final CompositionContextImpl b() {
            return this.a;
        }

        @Override  // androidx.compose.runtime.RememberObserver
        public void c() {
            this.a.t();
        }

        @Override  // androidx.compose.runtime.RememberObserver
        public void d() {
            this.a.t();
        }
    }

    @s0({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$CompositionContextImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,4507:1\n1855#2,2:4508\n76#3:4510\n102#3,2:4511\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerImpl$CompositionContextImpl\n*L\n3927#1:4508,2\n3977#1:4510\n3977#1:4511,2\n*E\n"})
    final class CompositionContextImpl extends CompositionContext {
        private final int b;
        private final boolean c;
        @m
        private Set d;
        @l
        private final Set e;
        @l
        private final MutableState f;
        final ComposerImpl g;

        public CompositionContextImpl(int v, boolean z) {
            this.b = v;
            this.c = z;
            this.e = new LinkedHashSet();
            this.f = SnapshotStateKt__SnapshotStateKt.g(ExtensionsKt.C(), null, 2, null);
        }

        public final void A(@l PersistentMap persistentMap0) {
            L.p(persistentMap0, "scope");
            this.y(persistentMap0);
        }

        @Override  // androidx.compose.runtime.CompositionContext
        @ComposableInferredTarget(scheme = "[0[0]]")
        public void a(@l ControlledComposition controlledComposition0, @l o o0) {
            L.p(controlledComposition0, "composition");
            L.p(o0, "content");
            ComposerImpl.this.c.a(controlledComposition0, o0);
        }

        @Override  // androidx.compose.runtime.CompositionContext
        public void b(@l MovableContentStateReference movableContentStateReference0) {
            L.p(movableContentStateReference0, "reference");
            ComposerImpl.this.c.b(movableContentStateReference0);
        }

        @Override  // androidx.compose.runtime.CompositionContext
        public void c() {
            --ComposerImpl.this.B;
        }

        @Override  // androidx.compose.runtime.CompositionContext
        public boolean d() {
            return this.c;
        }

        @Override  // androidx.compose.runtime.CompositionContext
        @l
        public PersistentMap e() {
            return this.v();
        }

        @Override  // androidx.compose.runtime.CompositionContext
        public int f() {
            return this.b;
        }

        @Override  // androidx.compose.runtime.CompositionContext
        @l
        public g g() {
            return ComposerImpl.this.c.g();
        }

        @Override  // androidx.compose.runtime.CompositionContext
        @l
        public g h() {
            return CompositionKt.j(ComposerImpl.this.o());
        }

        @Override  // androidx.compose.runtime.CompositionContext
        public void i(@l MovableContentStateReference movableContentStateReference0) {
            L.p(movableContentStateReference0, "reference");
            ComposerImpl.this.c.i(movableContentStateReference0);
        }

        @Override  // androidx.compose.runtime.CompositionContext
        public void j(@l ControlledComposition controlledComposition0) {
            L.p(controlledComposition0, "composition");
            ComposerImpl.this.c.j(ComposerImpl.this.o());
            ComposerImpl.this.c.j(controlledComposition0);
        }

        @Override  // androidx.compose.runtime.CompositionContext
        public void k(@l RecomposeScopeImpl recomposeScopeImpl0) {
            L.p(recomposeScopeImpl0, "scope");
            ComposerImpl.this.c.k(recomposeScopeImpl0);
        }

        @Override  // androidx.compose.runtime.CompositionContext
        public void l(@l MovableContentStateReference movableContentStateReference0, @l MovableContentState movableContentState0) {
            L.p(movableContentStateReference0, "reference");
            L.p(movableContentState0, "data");
            ComposerImpl.this.c.l(movableContentStateReference0, movableContentState0);
        }

        @Override  // androidx.compose.runtime.CompositionContext
        @m
        public MovableContentState m(@l MovableContentStateReference movableContentStateReference0) {
            L.p(movableContentStateReference0, "reference");
            return ComposerImpl.this.c.m(movableContentStateReference0);
        }

        @Override  // androidx.compose.runtime.CompositionContext
        public void n(@l Set set0) {
            L.p(set0, "table");
            Set set1 = this.d;
            if(set1 == null) {
                set1 = new HashSet();
                this.d = set1;
            }
            set1.add(set0);
        }

        @Override  // androidx.compose.runtime.CompositionContext
        public void o(@l Composer composer0) {
            L.p(composer0, "composer");
            super.o(((ComposerImpl)composer0));
            this.e.add(composer0);
        }

        @Override  // androidx.compose.runtime.CompositionContext
        public void p(@l ControlledComposition controlledComposition0) {
            L.p(controlledComposition0, "composition");
            ComposerImpl.this.c.p(controlledComposition0);
        }

        @Override  // androidx.compose.runtime.CompositionContext
        public void q() {
            ++ComposerImpl.this.B;
        }

        @Override  // androidx.compose.runtime.CompositionContext
        public void r(@l Composer composer0) {
            L.p(composer0, "composer");
            Set set0 = this.d;
            if(set0 != null) {
                for(Object object0: set0) {
                    ((Set)object0).remove(((ComposerImpl)composer0).d);
                }
            }
            v0.a(this.e).remove(composer0);
        }

        @Override  // androidx.compose.runtime.CompositionContext
        public void s(@l ControlledComposition controlledComposition0) {
            L.p(controlledComposition0, "composition");
            ComposerImpl.this.c.s(controlledComposition0);
        }

        public final void t() {
            if(!this.e.isEmpty()) {
                Set set0 = this.d;
                if(set0 != null) {
                    for(Object object0: this.e) {
                        ComposerImpl composerImpl0 = (ComposerImpl)object0;
                        for(Object object1: set0) {
                            ((Set)object1).remove(composerImpl0.d);
                        }
                    }
                }
                this.e.clear();
            }
        }

        @l
        public final Set u() {
            return this.e;
        }

        private final PersistentMap v() {
            return (PersistentMap)this.f.getValue();
        }

        @m
        public final Set w() {
            return this.d;
        }

        public static void x() {
        }

        private final void y(PersistentMap persistentMap0) {
            this.f.setValue(persistentMap0);
        }

        public final void z(@m Set set0) {
            this.d = set0;
        }
    }

    private int A;
    private int B;
    @l
    private Snapshot C;
    private int D;
    private boolean E;
    @l
    private final Stack F;
    private boolean G;
    private boolean H;
    @l
    private SlotReader I;
    @l
    private SlotTable J;
    @l
    private SlotWriter K;
    private boolean L;
    @m
    private PersistentMap M;
    @m
    private List N;
    @l
    private Anchor O;
    @l
    private final List P;
    private boolean Q;
    private int R;
    private int S;
    @l
    private Stack T;
    private int U;
    private boolean V;
    private boolean W;
    @l
    private final IntStack X;
    @l
    private final Stack Y;
    private int Z;
    private int a0;
    @l
    private final Applier b;
    private int b0;
    @l
    private final CompositionContext c;
    private int c0;
    @l
    private final SlotTable d;
    @l
    private final Set e;
    @l
    private List f;
    @l
    private List g;
    @l
    private final ControlledComposition h;
    @l
    private final Stack i;
    @m
    private Pending j;
    private int k;
    @l
    private IntStack l;
    private int m;
    @l
    private IntStack n;
    @m
    private int[] o;
    @m
    private HashMap p;
    private boolean q;
    private boolean r;
    private boolean s;
    @l
    private final List t;
    @l
    private final IntStack u;
    @l
    private PersistentMap v;
    @l
    private final IntMap w;
    private boolean x;
    @l
    private final IntStack y;
    private boolean z;

    public ComposerImpl(@l Applier applier0, @l CompositionContext compositionContext0, @l SlotTable slotTable0, @l Set set0, @l List list0, @l List list1, @l ControlledComposition controlledComposition0) {
        L.p(applier0, "applier");
        Anchor anchor0;
        L.p(compositionContext0, "parentContext");
        L.p(slotTable0, "slotTable");
        L.p(set0, "abandonSet");
        L.p(list0, "changes");
        L.p(list1, "lateChanges");
        L.p(controlledComposition0, "composition");
        super();
        this.b = applier0;
        this.c = compositionContext0;
        this.d = slotTable0;
        this.e = set0;
        this.f = list0;
        this.g = list1;
        this.h = controlledComposition0;
        this.i = new Stack();
        this.l = new IntStack();
        this.n = new IntStack();
        this.t = new ArrayList();
        this.u = new IntStack();
        this.v = ExtensionsKt.C();
        this.w = new IntMap(0, 1, null);
        this.y = new IntStack();
        this.A = -1;
        this.C = SnapshotKt.D();
        this.E = true;
        this.F = new Stack();
        SlotReader slotReader0 = slotTable0.E();
        slotReader0.e();
        this.I = slotReader0;
        SlotTable slotTable1 = new SlotTable();
        this.J = slotTable1;
        SlotWriter slotWriter0 = slotTable1.F();
        slotWriter0.I();
        this.K = slotWriter0;
        SlotReader slotReader1 = this.J.E();
        try {
            anchor0 = slotReader1.a(0);
        }
        finally {
            slotReader1.e();
        }
        this.O = anchor0;
        this.P = new ArrayList();
        this.T = new Stack();
        this.W = true;
        this.X = new IntStack();
        this.Y = new Stack();
        this.Z = -1;
        this.a0 = -1;
        this.b0 = -1;
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean A(long v) {
        Object object0 = this.q1();
        if(object0 instanceof Long && v == ((Number)object0).longValue()) {
            return false;
        }
        this.v2(v);
        return true;
    }

    private final void A0() {
        RecomposeScopeImpl recomposeScopeImpl1;
        if(this.E()) {
            ControlledComposition controlledComposition0 = this.o();
            L.n(controlledComposition0, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            RecomposeScopeImpl recomposeScopeImpl0 = new RecomposeScopeImpl(((CompositionImpl)controlledComposition0));
            this.F.h(recomposeScopeImpl0);
            this.v2(recomposeScopeImpl0);
            recomposeScopeImpl0.H(this.D);
            return;
        }
        Invalidation invalidation0 = ComposerKt.o0(this.t, this.I.y());
        Object object0 = this.I.Q();
        if(L.g(object0, Composer.a.a())) {
            ControlledComposition controlledComposition1 = this.o();
            L.n(controlledComposition1, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            recomposeScopeImpl1 = new RecomposeScopeImpl(((CompositionImpl)controlledComposition1));
            this.v2(recomposeScopeImpl1);
        }
        else {
            L.n(object0, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
            recomposeScopeImpl1 = (RecomposeScopeImpl)object0;
        }
        recomposeScopeImpl1.D(invalidation0 != null);
        this.F.h(recomposeScopeImpl1);
        recomposeScopeImpl1.H(this.D);
    }

    private final void A1() {
        int v = this.S;
        if(v > 0) {
            this.S = 0;
            this.F1(new p() {
                final int e;

                {
                    this.e = v;
                    super(3);
                }

                public final void a(@l Applier applier0, @l SlotWriter slotWriter0, @l RememberManager rememberManager0) {
                    L.p(applier0, "applier");
                    L.p(slotWriter0, "<anonymous parameter 1>");
                    L.p(rememberManager0, "<anonymous parameter 2>");
                    int v = this.e;
                    for(int v1 = 0; v1 < v; ++v1) {
                        applier0.i();
                    }
                }

                @Override  // A3.p
                public Object invoke(Object object0, Object object1, Object object2) {
                    this.a(((Applier)object0), ((SlotWriter)object1), ((RememberManager)object2));
                    return S0.a;
                }
            });
        }
    }

    private final Object A2(List list0, a a0) {
        try {
            this.f = list0;
            return a0.invoke();
        }
        finally {
            this.f = this.f;
        }
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean B(byte b) {
        Object object0 = this.q1();
        if(object0 instanceof Byte && b == ((Number)object0).byteValue()) {
            return false;
        }
        this.v2(b);
        return true;
    }

    @ComposeCompilerApi
    public final Object B0(boolean z, @l a a0) {
        L.p(a0, "block");
        Object object0 = this.q1();
        if(object0 == Composer.a.a() || z) {
            object0 = a0.invoke();
            this.v2(object0);
        }
        return object0;
    }

    public final boolean B1(@l IdentityArrayMap identityArrayMap0) {
        L.p(identityArrayMap0, "invalidationsRequested");
        if(this.f.isEmpty()) {
            if(!identityArrayMap0.k() && this.t.isEmpty() && !this.r) {
                return false;
            }
            this.L0(identityArrayMap0, null);
            return !this.f.isEmpty();
        }
        ComposerKt.A("Expected applyChanges() to have been called");
        throw new y();
    }

    private final Object B2(SlotReader slotReader0, a a0) {
        this.o = null;
        try {
            this.I = slotReader0;
            return a0.invoke();
        }
        finally {
            this.I = this.I;
            this.o = this.o;
        }
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean C(char c) {
        Object object0 = this.q1();
        if(object0 instanceof Character && c == ((Character)object0).charValue()) {
            return false;
        }
        this.v2(Character.valueOf(c));
        return true;
    }

    public final void C0() {
        this.w.a();
    }

    private final Object C1(ControlledComposition controlledComposition0, ControlledComposition controlledComposition1, Integer integer0, List list0, a a0) {
        int v1;
        boolean z1;
        boolean z;
        Object object0;
        try {
            z = this.W;
            z1 = this.G;
            v1 = this.k;
            this.W = false;
            this.G = true;
            this.k = 0;
            int v2 = list0.size();
            for(int v3 = 0; v3 < v2; ++v3) {
                V v4 = (V)list0.get(v3);
                RecomposeScopeImpl recomposeScopeImpl0 = (RecomposeScopeImpl)v4.a();
                IdentityArraySet identityArraySet0 = (IdentityArraySet)v4.b();
                if(identityArraySet0 == null) {
                    this.m2(recomposeScopeImpl0, null);
                }
                else {
                    int v5 = identityArraySet0.size();
                    for(int v6 = 0; v6 < v5; ++v6) {
                        this.m2(recomposeScopeImpl0, identityArraySet0.get(v6));
                    }
                }
            }
            if(controlledComposition0 == null) {
                object0 = a0.invoke();
            }
            else {
                object0 = controlledComposition0.p(controlledComposition1, (integer0 == null ? -1 : ((int)integer0)), a0);
                if(object0 == null) {
                    object0 = a0.invoke();
                }
            }
            return object0;
        }
        finally {
            this.W = z;
            this.G = z1;
            this.k = v1;
        }
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean D(double f) {
        Object object0 = this.q1();
        if(object0 instanceof Double && f == ((Number)object0).doubleValue()) {
            return false;
        }
        this.v2(f);
        return true;
    }

    private final void D0() {
        this.j = null;
        this.k = 0;
        this.m = 0;
        this.U = 0;
        this.R = 0;
        this.s = false;
        this.V = false;
        this.X.a();
        this.F.a();
        this.E0();
    }

    static Object D1(ComposerImpl composerImpl0, ControlledComposition controlledComposition0, ControlledComposition controlledComposition1, Integer integer0, List list0, a a0, int v, Object object0) {
        if((v & 8) != 0) {
            list0 = u.H();
        }
        return composerImpl0.C1(((v & 1) == 0 ? controlledComposition0 : null), ((v & 2) == 0 ? controlledComposition1 : null), ((v & 4) == 0 ? integer0 : null), list0, a0);
    }

    @Override  // androidx.compose.runtime.Composer
    public boolean E() {
        return this.Q;
    }

    private final void E0() {
        this.o = null;
        this.p = null;
    }

    private final void E1() {
        boolean z = this.G;
        this.G = true;
        int v = this.I.y();
        int v1 = this.I.K(v) + v;
        int v2 = this.k;
        int v3 = this.e0();
        int v4 = this.m;
        Invalidation invalidation0 = ComposerKt.H(this.t, this.I.n(), v1);
        boolean z1 = false;
        int v5 = v;
        while(invalidation0 != null) {
            int v6 = invalidation0.b();
            ComposerKt.o0(this.t, v6);
            if(invalidation0.d()) {
                this.I.X(v6);
                int v7 = this.I.n();
                this.W1(v5, v7, v);
                this.k = this.s1(v6, v7, v, v2);
                this.R = this.G0(this.I.V(v7), v, v3);
                this.M = null;
                invalidation0.c().h(this);
                this.M = null;
                this.I.Y(v);
                v5 = v7;
                z1 = true;
            }
            else {
                this.F.h(invalidation0.c());
                invalidation0.c().y();
                this.F.g();
            }
            invalidation0 = ComposerKt.H(this.t, this.I.n(), v1);
        }
        if(z1) {
            this.W1(v5, v, v);
            this.I.a0();
            int v8 = this.w2(v);
            this.k = v2 + v8;
            this.m = v4 + v8;
        }
        else {
            this.g2();
        }
        this.R = v3;
        this.G = z;
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void F() {
        if(this.t.isEmpty()) {
            this.f2();
            return;
        }
        SlotReader slotReader0 = this.I;
        int v = slotReader0.q();
        Object object0 = slotReader0.s();
        Object object1 = slotReader0.o();
        this.o2(v, object0, object1);
        this.k2(slotReader0.O(), null);
        this.E1();
        slotReader0.h();
        this.q2(v, object0, object1);
    }

    public final void F0(@l IdentityArrayMap identityArrayMap0, @l o o0) {
        L.p(identityArrayMap0, "invalidationsRequested");
        L.p(o0, "content");
        if(this.f.isEmpty()) {
            this.L0(identityArrayMap0, o0);
            return;
        }
        ComposerKt.A("Expected applyChanges() to have been called");
        throw new y();
    }

    private final void F1(p p0) {
        this.f.add(p0);
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    @l
    public Composer G(int v) {
        this.h2(v, null, 0, null);
        this.A0();
        return this;
    }

    private final int G0(int v, int v1, int v2) {
        if(v != v1) {
            int v3 = this.h1(this.I, v);
            return v3 == 0x78CC281 ? 0x78CC281 : Integer.rotateLeft(this.G0(this.I.V(v), v1, v2), 3) ^ v3;
        }
        return v2;
    }

    private final void G1(p p0) {
        this.A1();
        this.v1();
        this.F1(p0);
    }

    @Override  // androidx.compose.runtime.Composer
    @l
    public Applier H() {
        return this.b;
    }

    private final void H0() {
        ComposerKt.q0(this.K.X());
        SlotTable slotTable0 = new SlotTable();
        this.J = slotTable0;
        SlotWriter slotWriter0 = slotTable0.F();
        slotWriter0.I();
        this.K = slotWriter0;
    }

    private final void H1() {
        this.a2(this.I.n());
        this.S1(ComposerKt.b);
        this.U += this.I.t();
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    @m
    public ScopeUpdateScope I() {
        ScopeUpdateScope scopeUpdateScope0 = null;
        RecomposeScopeImpl recomposeScopeImpl0 = this.F.d() ? ((RecomposeScopeImpl)this.F.g()) : null;
        if(recomposeScopeImpl0 != null) {
            recomposeScopeImpl0.D(false);
        }
        if(recomposeScopeImpl0 != null) {
            Function1 function10 = recomposeScopeImpl0.i(this.D);
            if(function10 != null) {
                this.F1(new p(this) {
                    final Function1 e;
                    final ComposerImpl f;

                    {
                        this.e = function10;
                        this.f = composerImpl0;
                        super(3);
                    }

                    public final void a(@l Applier applier0, @l SlotWriter slotWriter0, @l RememberManager rememberManager0) {
                        L.p(applier0, "<anonymous parameter 0>");
                        L.p(slotWriter0, "<anonymous parameter 1>");
                        L.p(rememberManager0, "<anonymous parameter 2>");
                        this.e.invoke(this.f.o());
                    }

                    @Override  // A3.p
                    public Object invoke(Object object0, Object object1, Object object2) {
                        this.a(((Applier)object0), ((SlotWriter)object1), ((RememberManager)object2));
                        return S0.a;
                    }
                });
            }
        }
        if(recomposeScopeImpl0 != null && !recomposeScopeImpl0.q() && (recomposeScopeImpl0.r() || this.q)) {
            if(recomposeScopeImpl0.j() == null) {
                recomposeScopeImpl0.A((this.E() ? this.K.B(this.K.Z()) : this.I.a(this.I.y())));
            }
            recomposeScopeImpl0.C(false);
            scopeUpdateScope0 = recomposeScopeImpl0;
        }
        this.N0(false);
        return scopeUpdateScope0;
    }

    private final PersistentMap I0() {
        PersistentMap persistentMap0 = this.M;
        return persistentMap0 == null ? this.J0(this.I.y()) : persistentMap0;
    }

    private final void I1(Object object0) {
        this.T.h(object0);
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    @l
    public Object J(@m Object object0, @m Object object1) {
        JoinedKey joinedKey0 = ComposerKt.Q(this.I.s(), object0, object1);
        return joinedKey0 == null ? new JoinedKey(object0, object1) : joinedKey0;
    }

    private final PersistentMap J0(int v) {
        if(this.E() && this.L) {
            for(int v1 = this.K.Z(); v1 > 0; v1 = this.K.J0(v1)) {
                if(this.K.g0(v1) == 202 && L.g(this.K.h0(v1), ComposerKt.I())) {
                    Object object0 = this.K.e0(v1);
                    L.n(object0, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
                    this.M = (PersistentMap)object0;
                    return (PersistentMap)object0;
                }
            }
        }
        if(this.I.A() > 0) {
            while(v > 0) {
                if(this.I.H(v) == 202 && L.g(this.I.J(v), ComposerKt.I())) {
                    PersistentMap persistentMap0 = (PersistentMap)this.w.c(v);
                    if(persistentMap0 == null) {
                        Object object1 = this.I.D(v);
                        L.n(object1, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
                        persistentMap0 = (PersistentMap)object1;
                    }
                    this.M = persistentMap0;
                    return persistentMap0;
                }
                v = this.I.V(v);
            }
        }
        this.M = this.v;
        return this.v;
    }

    private final void J1() {
        int v = this.I.y();
        if(this.X.h(-1) <= v) {
            if(this.X.h(-1) == v) {
                this.X.i();
                ComposerImpl.U1(this, false, ComposerKt.d, 1, null);
            }
            return;
        }
        ComposerKt.A("Missed recording an endGroup");
        throw new y();
    }

    @Override  // androidx.compose.runtime.Composer
    public void K() {
        this.h2(0x7D, null, 1, null);
        this.s = true;
    }

    public final void K0() {
        Trace trace0 = Trace.a;
        Object object0 = trace0.a("Compose:Composer.dispose");
        try {
            this.c.r(this);
            this.F.a();
            this.t.clear();
            this.f.clear();
            this.w.a();
            this.H().clear();
            this.H = true;
        }
        catch(Throwable throwable0) {
            Trace.a.b(object0);
            throw throwable0;
        }
        trace0.b(object0);
    }

    private final void K1() {
        if(this.V) {
            ComposerImpl.U1(this, false, ComposerKt.d, 1, null);
            this.V = false;
        }
    }

    @Override  // androidx.compose.runtime.Composer
    @InternalComposeApi
    public Object L(@l CompositionLocal compositionLocal0) {
        L.p(compositionLocal0, "key");
        return this.c2(compositionLocal0, this.I0());
    }

    private final void L0(IdentityArrayMap identityArrayMap0, o o0) {
        if(!this.G) {
            Object object0 = Trace.a.a("Compose:recompose");
            try {
                Snapshot snapshot0 = SnapshotKt.D();
                this.C = snapshot0;
                this.D = snapshot0.g();
                this.w.a();
                int v1 = identityArrayMap0.h();
                int v2 = 0;
                while(v2 < v1) {
                    Object object1 = identityArrayMap0.g()[v2];
                    L.n(object1, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                    IdentityArraySet identityArraySet0 = (IdentityArraySet)identityArrayMap0.i()[v2];
                    Anchor anchor0 = ((RecomposeScopeImpl)object1).j();
                    if(anchor0 != null) {
                        Invalidation invalidation0 = new Invalidation(((RecomposeScopeImpl)object1), anchor0.a(), identityArraySet0);
                        this.t.add(invalidation0);
                        ++v2;
                        continue;
                    }
                    return;
                }
                List list0 = this.t;
                if(list0.size() > 1) {
                    u.p0(list0, new androidx.compose.runtime.ComposerImpl.doCompose.lambda.37..inlined.sortBy.1());
                }
                try {
                    this.k = 0;
                    this.G = true;
                    this.l2();
                    Object object2 = this.q1();
                    if(object2 != o0 && o0 != null) {
                        this.v2(o0);
                    }
                    SnapshotStateKt.m(new Function1() {
                        final ComposerImpl e;

                        {
                            this.e = composerImpl0;
                            super(1);
                        }

                        public final void a(@l State state0) {
                            L.p(state0, "it");
                            int v = this.e.B;
                            this.e.B = v + 1;
                        }

                        @Override  // kotlin.jvm.functions.Function1
                        public Object invoke(Object object0) {
                            this.a(((State)object0));
                            return S0.a;
                        }
                    }, new Function1() {
                        final ComposerImpl e;

                        {
                            this.e = composerImpl0;
                            super(1);
                        }

                        public final void a(@l State state0) {
                            L.p(state0, "it");
                            --this.e.B;
                        }

                        @Override  // kotlin.jvm.functions.Function1
                        public Object invoke(Object object0) {
                            this.a(((State)object0));
                            return S0.a;
                        }
                    }, new a(this, object2) {
                        final o e;
                        final ComposerImpl f;
                        final Object g;

                        {
                            this.e = o0;
                            this.f = composerImpl0;
                            this.g = object0;
                            super(0);
                        }

                        @Override  // A3.a
                        public Object invoke() {
                            this.invoke();
                            return S0.a;
                        }

                        public final void invoke() {
                            if(this.e != null) {
                                this.f.j2(200, ComposerKt.M());
                                ActualJvm_jvmKt.c(this.f, this.e);
                                this.f.O0();
                                return;
                            }
                            if((this.f.r || this.f.x) && (this.g != null && !L.g(this.g, Composer.a.a()))) {
                                this.f.j2(200, ComposerKt.M());
                                L.n(this.g, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
                                o o0 = (o)v0.q(this.g, 2);
                                ActualJvm_jvmKt.c(this.f, o0);
                                this.f.O0();
                                return;
                            }
                            this.f.F();
                        }
                    });
                    this.P0();
                }
                catch(Throwable throwable0) {
                    this.G = false;
                    this.t.clear();
                    this.h0();
                    throw throwable0;
                }
                this.G = false;
                this.t.clear();
            }
            finally {
                Trace.a.b(object0);
            }
            return;
        }
        ComposerKt.A("Reentrant composition is not supported");
        throw new y();

        @s0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerImpl\n*L\n1#1,328:1\n3326#2:329\n*E\n"})
        public final class androidx.compose.runtime.ComposerImpl.doCompose.lambda.37..inlined.sortBy.1 implements Comparator {
            @Override
            public final int compare(Object object0, Object object1) {
                return kotlin.comparisons.a.l(((Invalidation)object0).b(), ((Invalidation)object1).b());
            }
        }

    }

    private final void L1(p p0) {
        this.P.add(p0);
    }

    @Override  // androidx.compose.runtime.Composer
    @l
    public g M() {
        return this.c.g();
    }

    private final void M0(int v, int v1) {
        if(v > 0 && v != v1) {
            this.M0(this.I.V(v), v1);
            if(this.I.P(v)) {
                this.I1(this.r1(this.I, v));
            }
        }
    }

    private final void M1(Anchor anchor0) {
        if(this.P.isEmpty()) {
            this.S1(new p(anchor0) {
                final SlotTable e;
                final Anchor f;

                {
                    this.e = slotTable0;
                    this.f = anchor0;
                    super(3);
                }

                public final void a(@l Applier applier0, @l SlotWriter slotWriter0, @l RememberManager rememberManager0) {
                    L.p(applier0, "<anonymous parameter 0>");
                    L.p(slotWriter0, "slots");
                    L.p(rememberManager0, "<anonymous parameter 2>");
                    slotWriter0.G();
                    int v = this.f.d(this.e);
                    slotWriter0.z0(this.e, v);
                    slotWriter0.S();
                }

                @Override  // A3.p
                public Object invoke(Object object0, Object object1, Object object2) {
                    this.a(((Applier)object0), ((SlotWriter)object1), ((RememberManager)object2));
                    return S0.a;
                }
            });
            return;
        }
        List list0 = u.Y5(this.P);
        this.P.clear();
        this.A1();
        this.v1();
        this.S1(new p(anchor0, list0) {
            final SlotTable e;
            final Anchor f;
            final List g;

            {
                this.e = slotTable0;
                this.f = anchor0;
                this.g = list0;
                super(3);
            }

            public final void a(@l Applier applier0, @l SlotWriter slotWriter0, @l RememberManager rememberManager0) {
                L.p(applier0, "applier");
                L.p(slotWriter0, "slots");
                L.p(rememberManager0, "rememberManager");
                List list0 = this.g;
                SlotWriter slotWriter1 = this.e.F();
                try {
                    int v1 = list0.size();
                    for(int v2 = 0; v2 < v1; ++v2) {
                        ((p)list0.get(v2)).invoke(applier0, slotWriter1, rememberManager0);
                    }
                }
                finally {
                    slotWriter1.I();
                }
                slotWriter0.G();
                int v3 = this.f.d(this.e);
                slotWriter0.z0(this.e, v3);
                slotWriter0.S();
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                this.a(((Applier)object0), ((SlotWriter)object1), ((RememberManager)object2));
                return S0.a;
            }
        });
    }

    @Override  // androidx.compose.runtime.Composer
    public void N(Object object0, @l o o0) {
        L.p(o0, "block");
        androidx.compose.runtime.ComposerImpl.apply.operation.1 composerImpl$apply$operation$10 = new p(object0) {
            final o e;
            final Object f;

            {
                this.e = o0;
                this.f = object0;
                super(3);
            }

            public final void a(@l Applier applier0, @l SlotWriter slotWriter0, @l RememberManager rememberManager0) {
                L.p(applier0, "applier");
                L.p(slotWriter0, "<anonymous parameter 1>");
                L.p(rememberManager0, "<anonymous parameter 2>");
                Object object0 = applier0.a();
                this.e.invoke(object0, this.f);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                this.a(((Applier)object0), ((SlotWriter)object1), ((RememberManager)object2));
                return S0.a;
            }
        };
        if(this.E()) {
            this.L1(composerImpl$apply$operation$10);
            return;
        }
        this.G1(composerImpl$apply$operation$10);
    }

    private final void N0(boolean z) {
        List list2;
        if(this.E()) {
            int v = this.K.Z();
            this.q2(this.K.g0(v), this.K.h0(v), this.K.e0(v));
        }
        else {
            int v1 = this.I.y();
            this.q2(this.I.H(v1), this.I.J(v1), this.I.D(v1));
        }
        int v2 = this.m;
        Pending pending0 = this.j;
        if(pending0 != null && pending0.b().size() > 0) {
            List list0 = pending0.b();
            List list1 = pending0.f();
            Set set0 = ListUtilsKt.n(list1);
            LinkedHashSet linkedHashSet0 = new LinkedHashSet();
            int v3 = list1.size();
            int v4 = list0.size();
            int v5 = 0;
            int v6 = 0;
            int v7 = 0;
            while(v5 < v4) {
                KeyInfo keyInfo0 = (KeyInfo)list0.get(v5);
                if(!set0.contains(keyInfo0)) {
                    this.Q1(pending0.g(keyInfo0) + pending0.e(), keyInfo0.d());
                    pending0.n(keyInfo0.c(), 0);
                    this.P1(keyInfo0.c());
                    this.I.X(keyInfo0.c());
                    this.H1();
                    this.I.Z();
                    int v8 = this.I.K(keyInfo0.c());
                    ComposerKt.p0(this.t, keyInfo0.c(), keyInfo0.c() + v8);
                }
                else if(!linkedHashSet0.contains(keyInfo0)) {
                    if(v6 >= v3) {
                        continue;
                    }
                    KeyInfo keyInfo1 = (KeyInfo)list1.get(v6);
                    if(keyInfo1 == keyInfo0) {
                        list2 = list1;
                        ++v5;
                    }
                    else {
                        int v9 = pending0.g(keyInfo1);
                        linkedHashSet0.add(keyInfo1);
                        if(v9 == v7) {
                            list2 = list1;
                        }
                        else {
                            int v10 = pending0.o(keyInfo1);
                            list2 = list1;
                            this.O1(pending0.e() + v9, v7 + pending0.e(), v10);
                            pending0.j(v9, v7, v10);
                        }
                    }
                    ++v6;
                    v7 += pending0.o(keyInfo1);
                    list1 = list2;
                    continue;
                }
                ++v5;
            }
            this.x1();
            if(list0.size() > 0) {
                this.P1(this.I.p());
                this.I.a0();
            }
        }
        int v11 = this.k;
        while(!this.I.N()) {
            int v12 = this.I.n();
            this.H1();
            this.Q1(v11, this.I.Z());
            ComposerKt.p0(this.t, v12, this.I.n());
        }
        boolean z1 = this.E();
        if(z1) {
            if(z) {
                this.X1();
                v2 = 1;
            }
            this.I.g();
            int v13 = this.K.Z();
            this.K.R();
            if(!this.I.w()) {
                this.K.S();
                this.K.I();
                this.M1(this.O);
                this.Q = false;
                if(!this.d.isEmpty()) {
                    this.s2(-2 - v13, 0);
                    this.t2(-2 - v13, v2);
                }
            }
        }
        else {
            if(z) {
                this.V1();
            }
            this.J1();
            int v14 = this.I.y();
            if(v2 != this.w2(v14)) {
                this.t2(v14, v2);
            }
            if(z) {
                v2 = 1;
            }
            this.I.h();
            this.x1();
        }
        this.S0(v2, z1);
    }

    private final void N1(p p0) {
        this.Y.h(p0);
    }

    @Override  // androidx.compose.runtime.Composer
    public void O(@m Object object0) {
        this.v2(object0);
    }

    private final void O0() {
        this.N0(false);
    }

    private final void O1(int v, int v1, int v2) {
        if(v2 > 0) {
            int v3 = this.c0;
            if(v3 > 0 && this.a0 == v - v3 && this.b0 == v1 - v3) {
                this.c0 = v3 + v2;
                return;
            }
            this.x1();
            this.a0 = v;
            this.b0 = v1;
            this.c0 = v2;
        }
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void P() {
        this.O0();
        RecomposeScopeImpl recomposeScopeImpl0 = this.Y0();
        if(recomposeScopeImpl0 != null && recomposeScopeImpl0.r()) {
            recomposeScopeImpl0.B(true);
        }
    }

    private final void P0() {
        this.O0();
        this.c.c();
        this.O0();
        this.K1();
        this.T0();
        this.I.e();
        this.r = false;
    }

    private final void P1(int v) {
        this.U = v - (this.I.n() - this.U);
    }

    @Override  // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void Q(@l MovableContent movableContent0, @m Object object0) {
        L.p(movableContent0, "value");
        this.n1(movableContent0, this.I0(), object0, false);
    }

    private final void Q0() {
        if(this.K.X()) {
            SlotWriter slotWriter0 = this.J.F();
            this.K = slotWriter0;
            slotWriter0.b1();
            this.L = false;
            this.M = null;
        }
    }

    private final void Q1(int v, int v1) {
        if(v1 > 0) {
            if(v >= 0) {
                if(this.Z == v) {
                    this.c0 += v1;
                    return;
                }
                this.x1();
                this.Z = v;
                this.c0 = v1;
                return;
            }
            ComposerKt.A(("Invalid remove index " + v).toString());
            throw new y();
        }
    }

    @Override  // androidx.compose.runtime.Composer
    public void R() {
        this.E = false;
    }

    private final void R0(boolean z, Pending pending0) {
        this.i.h(this.j);
        this.j = pending0;
        this.l.j(this.k);
        if(z) {
            this.k = 0;
        }
        this.n.j(this.m);
        this.m = 0;
    }

    private final void R1() {
        if(this.I.A() > 0) {
            SlotReader slotReader0 = this.I;
            int v = slotReader0.y();
            if(this.X.h(-2) != v) {
                if(!this.V && this.W) {
                    ComposerImpl.U1(this, false, ComposerKt.e, 1, null);
                    this.V = true;
                }
                if(v > 0) {
                    Anchor anchor0 = slotReader0.a(v);
                    this.X.j(v);
                    ComposerImpl.U1(this, false, new p() {
                        final Anchor e;

                        {
                            this.e = anchor0;
                            super(3);
                        }

                        public final void a(@l Applier applier0, @l SlotWriter slotWriter0, @l RememberManager rememberManager0) {
                            L.p(applier0, "<anonymous parameter 0>");
                            L.p(slotWriter0, "slots");
                            L.p(rememberManager0, "<anonymous parameter 2>");
                            slotWriter0.U(this.e);
                        }

                        @Override  // A3.p
                        public Object invoke(Object object0, Object object1, Object object2) {
                            this.a(((Applier)object0), ((SlotWriter)object1), ((RememberManager)object2));
                            return S0.a;
                        }
                    }, 1, null);
                }
            }
        }
    }

    @Override  // androidx.compose.runtime.Composer
    public void S() {
        this.q = true;
    }

    private final void S0(int v, boolean z) {
        Pending pending0 = (Pending)this.i.g();
        if(pending0 != null && !z) {
            pending0.l(pending0.a() + 1);
        }
        this.j = pending0;
        this.k = this.l.i() + v;
        this.m = this.n.i() + v;
    }

    private final void S1(p p0) {
        ComposerImpl.z1(this, false, 1, null);
        this.R1();
        this.F1(p0);
    }

    @Override  // androidx.compose.runtime.Composer
    @m
    public RecomposeScope T() {
        return this.Y0();
    }

    private final void T0() {
        this.A1();
        if(this.i.c()) {
            if(this.X.d()) {
                this.D0();
                return;
            }
            ComposerKt.A("Missed recording an endGroup()");
            throw new y();
        }
        ComposerKt.A("Start/end imbalance");
        throw new y();
    }

    private final void T1(boolean z, p p0) {
        this.y1(z);
        this.F1(p0);
    }

    @Override  // androidx.compose.runtime.Composer
    public void U() {
        if(this.z && this.I.y() == this.A) {
            this.A = -1;
            this.z = false;
        }
        this.N0(false);
    }

    public final boolean U0() {
        if(!this.q) {
            this.q = true;
            this.r = true;
            return true;
        }
        return false;
    }

    static void U1(ComposerImpl composerImpl0, boolean z, p p0, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        composerImpl0.T1(z, p0);
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void V(int v) {
        this.h2(v, null, 0, null);
    }

    public final boolean V0() {
        return this.B > 0;
    }

    private final void V1() {
        if(this.T.d()) {
            this.T.g();
            return;
        }
        ++this.S;
    }

    @Override  // androidx.compose.runtime.Composer
    @m
    public Object W() {
        return this.q1();
    }

    public final int W0() {
        return this.f.size();
    }

    private final void W1(int v, int v1, int v2) {
        SlotReader slotReader0 = this.I;
        int v3 = ComposerKt.j0(slotReader0, v, v1, v2);
        while(v > 0 && v != v3) {
            if(slotReader0.P(v)) {
                this.V1();
            }
            v = slotReader0.V(v);
        }
        this.M0(v1, v3);
    }

    @Override  // androidx.compose.runtime.Composer
    @l
    public CompositionData X() {
        return this.d;
    }

    @InternalComposeApi
    public static void X0() {
    }

    private final void X1() {
        Object object0 = this.Y.g();
        this.P.add(object0);
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean Y(@m Object object0) {
        if(this.q1() != object0) {
            this.v2(object0);
            return true;
        }
        return false;
    }

    @m
    public final RecomposeScopeImpl Y0() {
        return this.B != 0 || !this.F.d() ? null : ((RecomposeScopeImpl)this.F.e());
    }

    private final void Y1(MovableContentStateReference movableContentStateReference0, SlotWriter slotWriter0) {
        SlotTable slotTable0 = new SlotTable();
        SlotWriter slotWriter1 = slotTable0.F();
        try {
            slotWriter1.G();
            slotWriter1.j1(0x78CC281, movableContentStateReference0.c());
            SlotWriter.x0(slotWriter1, 0, 1, null);
            slotWriter1.n1(movableContentStateReference0.f());
            slotWriter0.E0(movableContentStateReference0.a(), 1, slotWriter1);
            slotWriter1.a1();
            slotWriter1.R();
            slotWriter1.S();
        }
        finally {
            slotWriter1.I();
        }
        MovableContentState movableContentState0 = new MovableContentState(slotTable0);
        this.c.l(movableContentStateReference0, movableContentState0);
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void Z() {
        this.h2(0xFFFFFF81, null, 0, null);
    }

    @ComposeCompilerApi
    public static void Z0() {
    }

    private final void Z1() {
        if(this.d.j()) {
            ArrayList arrayList0 = new ArrayList();
            this.N = arrayList0;
            SlotReader slotReader0 = this.d.E();
            try {
                this.I = slotReader0;
                List list0 = this.f;
                try {
                    this.f = arrayList0;
                    this.a2(0);
                    this.A1();
                    if(this.V) {
                        this.F1(ComposerKt.c);
                        this.K1();
                    }
                }
                finally {
                    this.f = list0;
                }
            }
            finally {
                slotReader0.e();
            }
        }
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.runtime.Composer
    public int a() {
        return this.E() ? -this.K.Z() : this.I.y();
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void a0(int v, @m Object object0) {
        this.h2(v, object0, 0, null);
    }

    @m
    public final List a1() {
        return this.N;
    }

    private final void a2(int v) {
        ComposerImpl.b2(this, v, false, 0);
        this.x1();
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void b(boolean z) {
        if(this.m == 0) {
            if(!this.E()) {
                if(!z) {
                    this.g2();
                    return;
                }
                int v = this.I.n();
                int v1 = this.I.m();
                for(int v2 = v; v2 < v1; ++v2) {
                    if(this.I.P(v2)) {
                        Object object0 = this.I.R(v2);
                        if(object0 instanceof ComposeNodeLifecycleCallback) {
                            this.F1(new p() {
                                final Object e;

                                {
                                    this.e = object0;
                                    super(3);
                                }

                                public final void a(@l Applier applier0, @l SlotWriter slotWriter0, @l RememberManager rememberManager0) {
                                    L.p(applier0, "<anonymous parameter 0>");
                                    L.p(slotWriter0, "<anonymous parameter 1>");
                                    L.p(rememberManager0, "rememberManager");
                                    rememberManager0.b(((ComposeNodeLifecycleCallback)this.e));
                                }

                                @Override  // A3.p
                                public Object invoke(Object object0, Object object1, Object object2) {
                                    this.a(((Applier)object0), ((SlotWriter)object1), ((RememberManager)object2));
                                    return S0.a;
                                }
                            });
                        }
                    }
                    this.I.j(v2, new o(v2) {
                        final ComposerImpl e;
                        final int f;

                        {
                            this.e = composerImpl0;
                            this.f = v;
                            super(2);
                        }

                        public final void a(int v, @m Object object0) {
                            if(object0 instanceof RememberObserver) {
                                this.e.I.X(this.f);
                                androidx.compose.runtime.ComposerImpl.deactivateToEndGroup.3.1 composerImpl$deactivateToEndGroup$3$10 = new p(this.f, v) {
                                    final Object e;
                                    final int f;
                                    final int g;

                                    {
                                        this.e = object0;
                                        this.f = v;
                                        this.g = v1;
                                        super(3);
                                    }

                                    public final void a(@l Applier applier0, @l SlotWriter slotWriter0, @l RememberManager rememberManager0) {
                                        L.p(applier0, "<anonymous parameter 0>");
                                        L.p(slotWriter0, "slots");
                                        L.p(rememberManager0, "rememberManager");
                                        Object object0 = slotWriter0.c1(this.f, this.g);
                                        if(L.g(this.e, object0)) {
                                            rememberManager0.a(((RememberObserver)this.e));
                                            slotWriter0.X0(this.g, Composer.a.a());
                                            return;
                                        }
                                        ComposerKt.A("Slot table is out of sync");
                                        throw new y();
                                    }

                                    @Override  // A3.p
                                    public Object invoke(Object object0, Object object1, Object object2) {
                                        this.a(((Applier)object0), ((SlotWriter)object1), ((RememberManager)object2));
                                        return S0.a;
                                    }
                                };
                                ComposerImpl.U1(this.e, false, composerImpl$deactivateToEndGroup$3$10, 1, null);
                                return;
                            }
                            if(object0 instanceof RecomposeScopeImpl) {
                                CompositionImpl compositionImpl0 = ((RecomposeScopeImpl)object0).l();
                                if(compositionImpl0 != null) {
                                    compositionImpl0.T(true);
                                    ((RecomposeScopeImpl)object0).x();
                                }
                                this.e.I.X(this.f);
                                androidx.compose.runtime.ComposerImpl.deactivateToEndGroup.3.2 composerImpl$deactivateToEndGroup$3$20 = new p(this.f, v) {
                                    final Object e;
                                    final int f;
                                    final int g;

                                    {
                                        this.e = object0;
                                        this.f = v;
                                        this.g = v1;
                                        super(3);
                                    }

                                    public final void a(@l Applier applier0, @l SlotWriter slotWriter0, @l RememberManager rememberManager0) {
                                        L.p(applier0, "<anonymous parameter 0>");
                                        L.p(slotWriter0, "slots");
                                        L.p(rememberManager0, "<anonymous parameter 2>");
                                        Object object0 = slotWriter0.c1(this.f, this.g);
                                        if(L.g(this.e, object0)) {
                                            slotWriter0.X0(this.g, Composer.a.a());
                                            return;
                                        }
                                        ComposerKt.A("Slot table is out of sync");
                                        throw new y();
                                    }

                                    @Override  // A3.p
                                    public Object invoke(Object object0, Object object1, Object object2) {
                                        this.a(((Applier)object0), ((SlotWriter)object1), ((RememberManager)object2));
                                        return S0.a;
                                    }
                                };
                                ComposerImpl.U1(this.e, false, composerImpl$deactivateToEndGroup$3$20, 1, null);
                            }
                        }

                        @Override  // A3.o
                        public Object invoke(Object object0, Object object1) {
                            this.a(((Number)object0).intValue(), object1);
                            return S0.a;
                        }
                    });
                }
                ComposerKt.p0(this.t, v, v1);
                this.I.X(v);
                this.I.a0();
            }
            return;
        }
        ComposerKt.A("No nodes can be emitted before calling dactivateToEndGroup");
        throw new y();
    }

    @Override  // androidx.compose.runtime.Composer
    public void b0() {
        this.z = false;
    }

    public final boolean b1() {
        return !this.t.isEmpty();
    }

    private static final int b2(ComposerImpl composerImpl0, int v, boolean z, int v1) {
        int v2 = 1;
        if(composerImpl0.I.L(v)) {
            int v3 = composerImpl0.I.H(v);
            Object object0 = composerImpl0.I.J(v);
            if(v3 == 0x78CC281 && object0 instanceof MovableContent) {
                Object object1 = composerImpl0.I.G(v, 0);
                Anchor anchor0 = composerImpl0.I.a(v);
                int v4 = composerImpl0.I.K(v);
                List list0 = ComposerKt.E(composerImpl0.t, v, v4 + v);
                ArrayList arrayList0 = new ArrayList(list0.size());
                int v5 = list0.size();
                for(int v6 = 0; v6 < v5; ++v6) {
                    Invalidation invalidation0 = (Invalidation)list0.get(v6);
                    arrayList0.add(r0.a(invalidation0.c(), invalidation0.a()));
                }
                PersistentMap persistentMap0 = composerImpl0.J0(v);
                MovableContentStateReference movableContentStateReference0 = new MovableContentStateReference(((MovableContent)object0), object1, composerImpl0.o(), composerImpl0.d, anchor0, arrayList0, persistentMap0);
                composerImpl0.c.b(movableContentStateReference0);
                composerImpl0.R1();
                composerImpl0.F1(new p(composerImpl0, movableContentStateReference0) {
                    final ComposerImpl e;
                    final MovableContentStateReference f;

                    {
                        this.e = composerImpl0;
                        this.f = movableContentStateReference0;
                        super(3);
                    }

                    public final void a(@l Applier applier0, @l SlotWriter slotWriter0, @l RememberManager rememberManager0) {
                        L.p(applier0, "<anonymous parameter 0>");
                        L.p(slotWriter0, "slots");
                        L.p(rememberManager0, "<anonymous parameter 2>");
                        this.e.Y1(this.f, slotWriter0);
                    }

                    @Override  // A3.p
                    public Object invoke(Object object0, Object object1, Object object2) {
                        this.a(((Applier)object0), ((SlotWriter)object1), ((RememberManager)object2));
                        return S0.a;
                    }
                });
                if(z) {
                    composerImpl0.x1();
                    composerImpl0.A1();
                    composerImpl0.v1();
                    if(!composerImpl0.I.P(v)) {
                        v2 = composerImpl0.I.T(v);
                    }
                    if(v2 > 0) {
                        composerImpl0.Q1(v1, v2);
                        return 0;
                    }
                    return 0;
                }
                return composerImpl0.I.T(v);
            }
            if(v3 == 206 && L.g(object0, ComposerKt.a0())) {
                Object object2 = composerImpl0.I.G(v, 0);
                CompositionContextHolder composerImpl$CompositionContextHolder0 = object2 instanceof CompositionContextHolder ? ((CompositionContextHolder)object2) : null;
                if(composerImpl$CompositionContextHolder0 != null) {
                    for(Object object3: composerImpl$CompositionContextHolder0.b().u()) {
                        ((ComposerImpl)object3).Z1();
                    }
                }
                return composerImpl0.I.T(v);
            }
            return composerImpl0.I.T(v);
        }
        if(composerImpl0.I.f(v)) {
            int v7 = composerImpl0.I.K(v);
            int v8 = v + 1;
            int v9 = 0;
            while(v8 < v7 + v) {
                boolean z1 = composerImpl0.I.P(v8);
                if(z1) {
                    composerImpl0.x1();
                    composerImpl0.I1(composerImpl0.I.R(v8));
                }
                v9 += ComposerImpl.b2(composerImpl0, v8, z1 || z, (z1 ? 0 : v1 + v9));
                if(z1) {
                    composerImpl0.x1();
                    composerImpl0.V1();
                }
                v8 += composerImpl0.I.K(v8);
            }
            return v9;
        }
        return composerImpl0.I.T(v);
    }

    @Override  // androidx.compose.runtime.Composer
    public boolean c() {
        if(!this.E() && !this.z && !this.x) {
            RecomposeScopeImpl recomposeScopeImpl0 = this.Y0();
            return recomposeScopeImpl0 != null && !recomposeScopeImpl0.o() && !this.r;
        }
        return false;
    }

    @Override  // androidx.compose.runtime.Composer
    public void c0(@l a a0) {
        L.p(a0, "effect");
        this.F1(new p() {
            final a e;

            {
                this.e = a0;
                super(3);
            }

            public final void a(@l Applier applier0, @l SlotWriter slotWriter0, @l RememberManager rememberManager0) {
                L.p(applier0, "<anonymous parameter 0>");
                L.p(slotWriter0, "<anonymous parameter 1>");
                L.p(rememberManager0, "rememberManager");
                rememberManager0.c(this.e);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                this.a(((Applier)object0), ((SlotWriter)object1), ((RememberManager)object2));
                return S0.a;
            }
        });
    }

    public final boolean c1() {
        return !this.f.isEmpty();
    }

    // 去混淆评级： 低(20)
    private final Object c2(CompositionLocal compositionLocal0, PersistentMap persistentMap0) {
        return ComposerKt.C(persistentMap0, compositionLocal0) ? ComposerKt.e0(persistentMap0, compositionLocal0) : compositionLocal0.c().getValue();
    }

    @Override  // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void d(@l List list0) {
        L.p(list0, "references");
        try {
            this.i1(list0);
        }
        catch(Throwable throwable0) {
            this.h0();
            throw throwable0;
        }
        this.D0();
    }

    @Override  // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void d0() {
        this.O0();
        this.O0();
        this.x = ComposerKt.v(this.y.i());
        this.M = null;
    }

    @l
    public final SlotTable d1() {
        return this.J;
    }

    public final void d2(@m List list0) {
        this.N = list0;
    }

    @Override  // androidx.compose.runtime.Composer
    public void e(int v) {
        if(v < 0) {
            while(this.K.Z() > -v) {
                this.N0(false);
            }
            return;
        }
        while(this.I.y() > v) {
            this.N0(false);
        }
    }

    @Override  // androidx.compose.runtime.Composer
    public int e0() {
        return this.R;
    }

    @ComposeCompilerApi
    public static void e1() {
    }

    public final void e2(@l SlotTable slotTable0) {
        L.p(slotTable0, "<set-?>");
        this.J = slotTable0;
    }

    @Override  // androidx.compose.runtime.Composer
    public void f() {
        this.x2();
        if(!this.E()) {
            Object object0 = this.f1(this.I);
            this.I1(object0);
            if(this.z && object0 instanceof ComposeNodeLifecycleCallback) {
                this.G1(androidx.compose.runtime.ComposerImpl.useNode.2.e);
            }
            return;
        }
        ComposerKt.A("useNode() called while inserting");
        throw new y();

        final class androidx.compose.runtime.ComposerImpl.useNode.2 extends N implements p {
            public static final androidx.compose.runtime.ComposerImpl.useNode.2 e;

            static {
                androidx.compose.runtime.ComposerImpl.useNode.2.e = new androidx.compose.runtime.ComposerImpl.useNode.2();
            }

            androidx.compose.runtime.ComposerImpl.useNode.2() {
                super(3);
            }

            public final void a(@l Applier applier0, @l SlotWriter slotWriter0, @l RememberManager rememberManager0) {
                L.p(applier0, "applier");
                L.p(slotWriter0, "<anonymous parameter 1>");
                L.p(rememberManager0, "<anonymous parameter 2>");
                Object object0 = applier0.a();
                L.n(object0, "null cannot be cast to non-null type androidx.compose.runtime.ComposeNodeLifecycleCallback");
                ((ComposeNodeLifecycleCallback)object0).r();
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                this.a(((Applier)object0), ((SlotWriter)object1), ((RememberManager)object2));
                return S0.a;
            }
        }

    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void f0() {
        this.O0();
    }

    private final Object f1(SlotReader slotReader0) {
        return slotReader0.R(slotReader0.y());
    }

    private final void f2() {
        this.m += this.I.Z();
    }

    @Override  // androidx.compose.runtime.Composer
    public void g() {
        this.N0(true);
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void g0() {
        this.O0();
    }

    @ComposeCompilerApi
    public static void g1() {
    }

    private final void g2() {
        this.m = this.I.z();
        this.I.a0();
    }

    @Override  // androidx.compose.runtime.Composer
    public void h() {
        this.h2(0x7D, null, 2, null);
        this.s = true;
    }

    private final void h0() {
        this.D0();
        this.i.a();
        this.l.a();
        this.n.a();
        this.u.a();
        this.y.a();
        this.w.a();
        if(!this.I.l()) {
            this.I.e();
        }
        if(!this.K.X()) {
            this.K.I();
        }
        this.H0();
        this.R = 0;
        this.B = 0;
        this.s = false;
        this.Q = false;
        this.z = false;
        this.G = false;
        this.r = false;
    }

    private final int h1(SlotReader slotReader0, int v) {
        if(slotReader0.M(v)) {
            Object object0 = slotReader0.J(v);
            if(object0 != null) {
                if(object0 instanceof Enum) {
                    return ((Enum)object0).ordinal();
                }
                return object0 instanceof MovableContent ? 0x78CC281 : object0.hashCode();
            }
            return 0;
        }
        int v1 = slotReader0.H(v);
        if(v1 == 0xCF) {
            Object object1 = slotReader0.D(v);
            return object1 == null || L.g(object1, Composer.a.a()) ? 0xCF : object1.hashCode();
        }
        return v1;
    }

    private final void h2(int v, Object object0, int v1, Object object1) {
        Object object2 = object0;
        this.y2();
        this.o2(v, object0, object1);
        int v2 = 0;
        Pending pending0 = null;
        if(this.E()) {
            this.I.d();
            int v3 = this.K.Y();
            if(v1 != 0) {
                this.K.l1(v, Composer.a.a());
            }
            else if(object1 == null) {
                SlotWriter slotWriter1 = this.K;
                if(object2 == null) {
                    object2 = Composer.a.a();
                }
                slotWriter1.j1(v, object2);
            }
            else {
                SlotWriter slotWriter0 = this.K;
                if(object2 == null) {
                    object2 = Composer.a.a();
                }
                slotWriter0.g1(v, object2, object1);
            }
            Pending pending1 = this.j;
            if(pending1 != null) {
                KeyInfo keyInfo0 = new KeyInfo(v, -1, -2 - v3, -1, 0);
                pending1.i(keyInfo0, this.k - pending1.e());
                pending1.h(keyInfo0);
            }
            this.R0(v1 != 0, null);
            return;
        }
        boolean z = v1 == 1 && this.z;
        if(this.j == null) {
            if(z || this.I.q() != v || !L.g(object0, this.I.s())) {
                this.j = new Pending(this.I.i(), this.k);
            }
            else {
                this.k2(v1 != 0, object1);
            }
        }
        Pending pending2 = this.j;
        if(pending2 != null) {
            KeyInfo keyInfo1 = pending2.d(v, object0);
            if(z || keyInfo1 == null) {
                this.I.d();
                this.Q = true;
                this.M = null;
                this.Q0();
                this.K.G();
                int v7 = this.K.Y();
                if(v1 != 0) {
                    this.K.l1(v, Composer.a.a());
                }
                else if(object1 == null) {
                    SlotWriter slotWriter3 = this.K;
                    if(object2 == null) {
                        object2 = Composer.a.a();
                    }
                    slotWriter3.j1(v, object2);
                }
                else {
                    SlotWriter slotWriter2 = this.K;
                    if(object2 == null) {
                        object2 = Composer.a.a();
                    }
                    slotWriter2.g1(v, object2, object1);
                }
                this.O = this.K.B(v7);
                KeyInfo keyInfo2 = new KeyInfo(v, -1, -2 - v7, -1, 0);
                pending2.i(keyInfo2, this.k - pending2.e());
                pending2.h(keyInfo2);
                ArrayList arrayList0 = new ArrayList();
                if(v1 == 0) {
                    v2 = this.k;
                }
                pending0 = new Pending(arrayList0, v2);
            }
            else {
                pending2.h(keyInfo1);
                int v4 = keyInfo1.c();
                this.k = pending2.g(keyInfo1) + pending2.e();
                int v5 = pending2.m(keyInfo1);
                int v6 = v5 - pending2.a();
                pending2.k(v5, pending2.a());
                this.P1(v4);
                this.I.X(v4);
                if(v6 > 0) {
                    this.S1(new p() {
                        final int e;

                        {
                            this.e = v;
                            super(3);
                        }

                        public final void a(@l Applier applier0, @l SlotWriter slotWriter0, @l RememberManager rememberManager0) {
                            L.p(applier0, "<anonymous parameter 0>");
                            L.p(slotWriter0, "slots");
                            L.p(rememberManager0, "<anonymous parameter 2>");
                            slotWriter0.A0(this.e);
                        }

                        @Override  // A3.p
                        public Object invoke(Object object0, Object object1, Object object2) {
                            this.a(((Applier)object0), ((SlotWriter)object1), ((RememberManager)object2));
                            return S0.a;
                        }
                    });
                }
                this.k2(v1 != 0, object1);
            }
        }
        this.R0(v1 != 0, pending0);
    }

    @Override  // androidx.compose.runtime.Composer
    public void i(int v, @m Object object0) {
        if(this.I.q() == v && !L.g(this.I.o(), object0) && this.A < 0) {
            this.A = this.I.n();
            this.z = true;
        }
        this.h2(v, null, 0, object0);
    }

    private final void i1(List list0) {
        List list1;
        List list3;
        ArrayList arrayList2;
        int[] arr_v;
        SlotReader slotReader2;
        Anchor anchor2;
        SlotTable slotTable1;
        try {
            list1 = this.f;
            this.f = this.g;
            this.F1(ComposerKt.f);
            int v1 = list0.size();
            int v2 = 0;
            while(v2 < v1) {
                V v3 = (V)list0.get(v2);
                MovableContentStateReference movableContentStateReference0 = (MovableContentStateReference)v3.a();
                MovableContentStateReference movableContentStateReference1 = (MovableContentStateReference)v3.b();
                Anchor anchor0 = movableContentStateReference0.a();
                int v4 = movableContentStateReference0.g().d(anchor0);
                f l0$f0 = new f();
                this.A1();
                this.F1(new p(anchor0) {
                    final f e;
                    final Anchor f;

                    {
                        this.e = l0$f0;
                        this.f = anchor0;
                        super(3);
                    }

                    public final void a(@l Applier applier0, @l SlotWriter slotWriter0, @l RememberManager rememberManager0) {
                        L.p(applier0, "applier");
                        L.p(slotWriter0, "slots");
                        L.p(rememberManager0, "<anonymous parameter 2>");
                        this.e.a = ComposerImpl.k1(slotWriter0, this.f, applier0);
                    }

                    @Override  // A3.p
                    public Object invoke(Object object0, Object object1, Object object2) {
                        this.a(((Applier)object0), ((SlotWriter)object1), ((RememberManager)object2));
                        return S0.a;
                    }
                });
                if(movableContentStateReference1 == null) {
                    if(L.g(movableContentStateReference0.g(), this.J)) {
                        this.H0();
                    }
                    SlotReader slotReader0 = movableContentStateReference0.g().E();
                    try {
                        slotReader0.X(v4);
                        this.U = v4;
                        ArrayList arrayList0 = new ArrayList();
                        ArrayList arrayList1 = arrayList0;
                        ComposerImpl.D1(this, null, null, null, null, new a(arrayList0, slotReader0, movableContentStateReference0) {
                            final ComposerImpl e;
                            final List f;
                            final SlotReader g;
                            final MovableContentStateReference h;

                            {
                                this.e = composerImpl0;
                                this.f = list0;
                                this.g = slotReader0;
                                this.h = movableContentStateReference0;
                                super(0);
                            }

                            @Override  // A3.a
                            public Object invoke() {
                                this.invoke();
                                return S0.a;
                            }

                            public final void invoke() {
                                List list0;
                                ComposerImpl composerImpl0;
                                try {
                                    composerImpl0 = this.e;
                                    list0 = composerImpl0.f;
                                    composerImpl0.f = this.f;
                                    SlotReader slotReader0 = composerImpl0.I;
                                    int[] arr_v = composerImpl0.o;
                                    composerImpl0.o = null;
                                    try {
                                        composerImpl0.I = this.g;
                                        composerImpl0.n1(this.h.c(), this.h.e(), this.h.f(), true);
                                    }
                                    catch(Throwable throwable0) {
                                        composerImpl0.I = slotReader0;
                                        composerImpl0.o = arr_v;
                                        throw throwable0;
                                    }
                                    composerImpl0.I = slotReader0;
                                    composerImpl0.o = arr_v;
                                }
                                finally {
                                    composerImpl0.f = list0;
                                }
                            }
                        }, 15, null);
                        if(!arrayList1.isEmpty()) {
                            this.F1(new p(arrayList1) {
                                final f e;
                                final List f;

                                {
                                    this.e = l0$f0;
                                    this.f = list0;
                                    super(3);
                                }

                                public final void a(@l Applier applier0, @l SlotWriter slotWriter0, @l RememberManager rememberManager0) {
                                    L.p(applier0, "applier");
                                    L.p(slotWriter0, "slots");
                                    L.p(rememberManager0, "rememberManager");
                                    int v = this.e.a;
                                    if(v > 0) {
                                        applier0 = new OffsetApplier(applier0, v);
                                    }
                                    List list0 = this.f;
                                    int v1 = list0.size();
                                    for(int v2 = 0; v2 < v1; ++v2) {
                                        ((p)list0.get(v2)).invoke(applier0, slotWriter0, rememberManager0);
                                    }
                                }

                                @Override  // A3.p
                                public Object invoke(Object object0, Object object1, Object object2) {
                                    this.a(((Applier)object0), ((SlotWriter)object1), ((RememberManager)object2));
                                    return S0.a;
                                }
                            });
                        }
                    }
                    catch(Throwable throwable0) {
                        slotReader0.e();
                        throw throwable0;
                    }
                    slotReader0.e();
                }
                else {
                    MovableContentState movableContentState0 = this.c.m(movableContentStateReference1);
                    if(movableContentState0 == null) {
                        slotTable1 = movableContentStateReference1.g();
                    }
                    else {
                        SlotTable slotTable0 = movableContentState0.a();
                        if(slotTable0 != null) {
                            slotTable1 = slotTable0;
                        }
                    }
                    if(movableContentState0 == null) {
                        anchor2 = movableContentStateReference1.a();
                    }
                    else {
                        SlotTable slotTable2 = movableContentState0.a();
                        if(slotTable2 != null) {
                            Anchor anchor1 = slotTable2.c(0);
                            if(anchor1 != null) {
                                anchor2 = anchor1;
                            }
                        }
                    }
                    List list2 = ComposerKt.y(slotTable1, anchor2);
                    if(!list2.isEmpty()) {
                        this.F1(new p(list2) {
                            final f e;
                            final List f;

                            {
                                this.e = l0$f0;
                                this.f = list0;
                                super(3);
                            }

                            public final void a(@l Applier applier0, @l SlotWriter slotWriter0, @l RememberManager rememberManager0) {
                                L.p(applier0, "applier");
                                L.p(slotWriter0, "<anonymous parameter 1>");
                                L.p(rememberManager0, "<anonymous parameter 2>");
                                int v = this.e.a;
                                List list0 = this.f;
                                int v1 = list0.size();
                                for(int v2 = 0; v2 < v1; ++v2) {
                                    Object object0 = list0.get(v2);
                                    int v3 = v + v2;
                                    applier0.g(v3, object0);
                                    applier0.f(v3, object0);
                                }
                            }

                            @Override  // A3.p
                            public Object invoke(Object object0, Object object1, Object object2) {
                                this.a(((Applier)object0), ((SlotWriter)object1), ((RememberManager)object2));
                                return S0.a;
                            }
                        });
                        if(L.g(movableContentStateReference0.g(), this.d)) {
                            int v5 = this.d.d(anchor0);
                            this.s2(v5, this.w2(v5) + list2.size());
                        }
                    }
                    this.F1(new p(this, movableContentStateReference1, movableContentStateReference0) {
                        final MovableContentState e;
                        final ComposerImpl f;
                        final MovableContentStateReference g;
                        final MovableContentStateReference h;

                        {
                            this.e = movableContentState0;
                            this.f = composerImpl0;
                            this.g = movableContentStateReference0;
                            this.h = movableContentStateReference1;
                            super(3);
                        }

                        public final void a(@l Applier applier0, @l SlotWriter slotWriter0, @l RememberManager rememberManager0) {
                            L.p(applier0, "<anonymous parameter 0>");
                            L.p(slotWriter0, "slots");
                            L.p(rememberManager0, "<anonymous parameter 2>");
                            MovableContentState movableContentState0 = this.e;
                            if(movableContentState0 == null) {
                                movableContentState0 = this.f.c.m(this.g);
                                if(movableContentState0 == null) {
                                    ComposerKt.A("Could not resolve state for movable content");
                                    throw new y();
                                }
                            }
                            List list0 = slotWriter0.C0(1, movableContentState0.a(), 2);
                            if(!list0.isEmpty()) {
                                ControlledComposition controlledComposition0 = this.h.b();
                                L.n(controlledComposition0, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
                                int v = list0.size();
                                for(int v1 = 0; v1 < v; ++v1) {
                                    Object object0 = slotWriter0.d1(((Anchor)list0.get(v1)), 0);
                                    RecomposeScopeImpl recomposeScopeImpl0 = object0 instanceof RecomposeScopeImpl ? ((RecomposeScopeImpl)object0) : null;
                                    if(recomposeScopeImpl0 != null) {
                                        recomposeScopeImpl0.g(((CompositionImpl)controlledComposition0));
                                    }
                                }
                            }
                        }

                        @Override  // A3.p
                        public Object invoke(Object object0, Object object1, Object object2) {
                            this.a(((Applier)object0), ((SlotWriter)object1), ((RememberManager)object2));
                            return S0.a;
                        }
                    });
                    SlotReader slotReader1 = slotTable1.E();
                    try {
                        slotReader2 = this.I;
                        arr_v = this.o;
                        this.o = null;
                        this.I = slotReader1;
                        int v7 = slotTable1.d(anchor2);
                        slotReader1.X(v7);
                        this.U = v7;
                        arrayList2 = new ArrayList();
                    }
                    catch(Throwable throwable1) {
                        slotReader1.e();
                        throw throwable1;
                    }
                    finally {
                        this.I = slotReader2;
                        this.o = arr_v;
                    }
                    try {
                        this.f = arrayList2;
                        list3 = this.f;
                        this.C1(movableContentStateReference1.b(), movableContentStateReference0.b(), slotReader1.n(), movableContentStateReference1.d(), new a(movableContentStateReference0) {
                            final ComposerImpl e;
                            final MovableContentStateReference f;

                            {
                                this.e = composerImpl0;
                                this.f = movableContentStateReference0;
                                super(0);
                            }

                            @Override  // A3.a
                            public Object invoke() {
                                this.invoke();
                                return S0.a;
                            }

                            public final void invoke() {
                                this.e.n1(this.f.c(), this.f.e(), this.f.f(), true);
                            }
                        });
                        goto label_73;
                    }
                    catch(Throwable throwable2) {
                        try {
                            this.f = list3;
                            throw throwable2;
                        label_73:
                            this.f = list3;
                            if(!arrayList2.isEmpty()) {
                                this.F1(new p(arrayList2) {
                                    final f e;
                                    final List f;

                                    {
                                        this.e = l0$f0;
                                        this.f = list0;
                                        super(3);
                                    }

                                    public final void a(@l Applier applier0, @l SlotWriter slotWriter0, @l RememberManager rememberManager0) {
                                        L.p(applier0, "applier");
                                        L.p(slotWriter0, "slots");
                                        L.p(rememberManager0, "rememberManager");
                                        int v = this.e.a;
                                        if(v > 0) {
                                            applier0 = new OffsetApplier(applier0, v);
                                        }
                                        List list0 = this.f;
                                        int v1 = list0.size();
                                        for(int v2 = 0; v2 < v1; ++v2) {
                                            ((p)list0.get(v2)).invoke(applier0, slotWriter0, rememberManager0);
                                        }
                                    }

                                    @Override  // A3.p
                                    public Object invoke(Object object0, Object object1, Object object2) {
                                        this.a(((Applier)object0), ((SlotWriter)object1), ((RememberManager)object2));
                                        return S0.a;
                                    }
                                });
                            }
                            goto label_85;
                        }
                        catch(Throwable throwable1) {
                        }
                    }
                    slotReader1.e();
                    throw throwable1;
                label_85:
                    slotReader1.e();
                }
                this.F1(ComposerKt.c);
                ++v2;
            }
            this.F1(androidx.compose.runtime.ComposerImpl.insertMovableContentGuarded.1.2.e);
            this.U = 0;
        }
        finally {
            this.f = list1;
        }

        final class androidx.compose.runtime.ComposerImpl.insertMovableContentGuarded.1.2 extends N implements p {
            public static final androidx.compose.runtime.ComposerImpl.insertMovableContentGuarded.1.2 e;

            static {
                androidx.compose.runtime.ComposerImpl.insertMovableContentGuarded.1.2.e = new androidx.compose.runtime.ComposerImpl.insertMovableContentGuarded.1.2();
            }

            androidx.compose.runtime.ComposerImpl.insertMovableContentGuarded.1.2() {
                super(3);
            }

            public final void a(@l Applier applier0, @l SlotWriter slotWriter0, @l RememberManager rememberManager0) {
                L.p(applier0, "applier");
                L.p(slotWriter0, "slots");
                L.p(rememberManager0, "<anonymous parameter 2>");
                ComposerImpl.l1(slotWriter0, applier0, 0);
                slotWriter0.R();
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                this.a(((Applier)object0), ((SlotWriter)object1), ((RememberManager)object2));
                return S0.a;
            }
        }

    }

    private final void i2(int v) {
        this.h2(v, null, 0, null);
    }

    @Override  // androidx.compose.runtime.Composer
    @m
    public Object j() {
        RecomposeScopeImpl recomposeScopeImpl0 = this.Y0();
        return recomposeScopeImpl0 != null ? recomposeScopeImpl0.j() : null;
    }

    private static final int j1(SlotWriter slotWriter0) {
        int v = slotWriter0.Y();
        int v1;
        for(v1 = slotWriter0.Z(); v1 >= 0 && !slotWriter0.u0(v1); v1 = slotWriter0.J0(v1)) {
        }
        int v2 = v1 + 1;
        int v3 = 0;
        while(v2 < v) {
            if(slotWriter0.m0(v, v2)) {
                if(slotWriter0.u0(v2)) {
                    v3 = 0;
                }
                ++v2;
            }
            else {
                v3 += (slotWriter0.u0(v2) ? 1 : slotWriter0.H0(v2));
                v2 += slotWriter0.i0(v2);
            }
        }
        return v3;
    }

    private final void j2(int v, Object object0) {
        this.h2(v, object0, 0, null);
    }

    @Override  // androidx.compose.runtime.Composer
    public void k(@l a a0) {
        L.p(a0, "factory");
        this.x2();
        if(this.E()) {
            int v = this.l.f();
            Anchor anchor0 = this.K.B(this.K.Z());
            ++this.m;
            this.L1(new p(anchor0, v) {
                final a e;
                final Anchor f;
                final int g;

                {
                    this.e = a0;
                    this.f = anchor0;
                    this.g = v;
                    super(3);
                }

                public final void a(@l Applier applier0, @l SlotWriter slotWriter0, @l RememberManager rememberManager0) {
                    L.p(applier0, "applier");
                    L.p(slotWriter0, "slots");
                    L.p(rememberManager0, "<anonymous parameter 2>");
                    Object object0 = this.e.invoke();
                    slotWriter0.t1(this.f, object0);
                    applier0.f(this.g, object0);
                    applier0.h(object0);
                }

                @Override  // A3.p
                public Object invoke(Object object0, Object object1, Object object2) {
                    this.a(((Applier)object0), ((SlotWriter)object1), ((RememberManager)object2));
                    return S0.a;
                }
            });
            this.N1(new p(v) {
                final Anchor e;
                final int f;

                {
                    this.e = anchor0;
                    this.f = v;
                    super(3);
                }

                public final void a(@l Applier applier0, @l SlotWriter slotWriter0, @l RememberManager rememberManager0) {
                    L.p(applier0, "applier");
                    L.p(slotWriter0, "slots");
                    L.p(rememberManager0, "<anonymous parameter 2>");
                    Object object0 = slotWriter0.G0(this.e);
                    applier0.i();
                    applier0.g(this.f, object0);
                }

                @Override  // A3.p
                public Object invoke(Object object0, Object object1, Object object2) {
                    this.a(((Applier)object0), ((SlotWriter)object1), ((RememberManager)object2));
                    return S0.a;
                }
            });
            return;
        }
        ComposerKt.A("createNode() can only be called when inserting");
        throw new y();
    }

    private static final int k1(SlotWriter slotWriter0, Anchor anchor0, Applier applier0) {
        int v = slotWriter0.D(anchor0);
        boolean z = true;
        ComposerKt.q0(slotWriter0.Y() < v);
        ComposerImpl.l1(slotWriter0, applier0, v);
        int v1 = ComposerImpl.j1(slotWriter0);
        while(slotWriter0.Y() < v) {
            if(slotWriter0.l0(v)) {
                if(slotWriter0.t0()) {
                    applier0.h(slotWriter0.F0(slotWriter0.Y()));
                    v1 = 0;
                }
                slotWriter0.h1();
            }
            else {
                v1 += slotWriter0.a1();
            }
        }
        if(slotWriter0.Y() != v) {
            z = false;
        }
        ComposerKt.q0(z);
        return v1;
    }

    private final void k2(boolean z, Object object0) {
        if(z) {
            this.I.c0();
            return;
        }
        if(object0 != null && this.I.o() != object0) {
            ComposerImpl.U1(this, false, new p() {
                final Object e;

                {
                    this.e = object0;
                    super(3);
                }

                public final void a(@l Applier applier0, @l SlotWriter slotWriter0, @l RememberManager rememberManager0) {
                    L.p(applier0, "<anonymous parameter 0>");
                    L.p(slotWriter0, "slots");
                    L.p(rememberManager0, "<anonymous parameter 2>");
                    slotWriter0.p1(this.e);
                }

                @Override  // A3.p
                public Object invoke(Object object0, Object object1, Object object2) {
                    this.a(((Applier)object0), ((SlotWriter)object1), ((RememberManager)object2));
                    return S0.a;
                }
            }, 1, null);
        }
        this.I.b0();
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void l(@l String s) {
        L.p(s, "sourceInformation");
        if(this.E() && this.E) {
            this.K.o0(s);
        }
    }

    private static final void l1(SlotWriter slotWriter0, Applier applier0, int v) {
        while(!slotWriter0.n0(v)) {
            slotWriter0.b1();
            if(slotWriter0.u0(slotWriter0.Z())) {
                applier0.i();
            }
            slotWriter0.R();
        }
    }

    private final void l2() {
        this.I = this.d.E();
        this.i2(100);
        this.c.q();
        this.v = this.c.e();
        this.y.j(ComposerKt.b(this.x));
        this.x = this.t(this.v);
        this.M = null;
        if(!this.q) {
            this.q = this.c.d();
        }
        Set set0 = (Set)this.c2(InspectionTablesKt.a(), this.v);
        if(set0 != null) {
            set0.add(this.d);
            this.c.n(set0);
        }
        this.i2(this.c.f());
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void m() {
        if(this.m == 0) {
            RecomposeScopeImpl recomposeScopeImpl0 = this.Y0();
            if(recomposeScopeImpl0 != null) {
                recomposeScopeImpl0.z();
            }
            if(this.t.isEmpty()) {
                this.g2();
                return;
            }
            this.E1();
            return;
        }
        ComposerKt.A("No nodes can be emitted before calling skipAndEndGroup");
        throw new y();
    }

    private final int m1(int v) [...] // Inlined contents

    public final boolean m2(@l RecomposeScopeImpl recomposeScopeImpl0, @m Object object0) {
        L.p(recomposeScopeImpl0, "scope");
        Anchor anchor0 = recomposeScopeImpl0.j();
        if(anchor0 == null) {
            return false;
        }
        int v = anchor0.d(this.d);
        if(this.G && v >= this.I.n()) {
            ComposerKt.f0(this.t, v, recomposeScopeImpl0, object0);
            return true;
        }
        return false;
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void n(int v, @l String s) {
        L.p(s, "sourceInformation");
        if(this.E) {
            this.h2(v, null, 0, s);
        }
    }

    private final void n1(MovableContent movableContent0, PersistentMap persistentMap0, Object object0, boolean z) {
        this.a0(0x78CC281, movableContent0);
        this.t(object0);
        int v = this.e0();
        try {
            this.R = 0x78CC281;
            boolean z1 = false;
            if(this.E()) {
                SlotWriter.x0(this.K, 0, 1, null);
            }
            if(!this.E() && !L.g(this.I.o(), persistentMap0)) {
                z1 = true;
                this.w.g(this.I.n(), persistentMap0);
            }
            this.h2(202, ComposerKt.I(), 0, persistentMap0);
            if(!this.E() || z) {
                boolean z2 = this.x;
                this.x = z1;
                ActualJvm_jvmKt.c(this, ComposableLambdaKt.c(0x296367D0, true, new o(object0) {
                    final MovableContent e;
                    final Object f;

                    {
                        this.e = movableContent0;
                        this.f = object0;
                        super(2);
                    }

                    @Composable
                    public final void a(@m Composer composer0, int v) {
                        if((v & 11) == 2 && composer0.c()) {
                            composer0.m();
                            return;
                        }
                        if(ComposerKt.g0()) {
                            ComposerKt.w0(0x296367D0, v, -1, "androidx.compose.runtime.ComposerImpl.invokeMovableContentLambda.<anonymous> (Composer.kt:2946)");
                        }
                        this.e.a().invoke(this.f, composer0, 8);
                        if(ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        this.a(((Composer)object0), ((Number)object1).intValue());
                        return S0.a;
                    }
                }));
                this.x = z2;
            }
            else {
                this.L = true;
                this.M = null;
                Anchor anchor0 = this.K.B(this.K.J0(this.K.Z()));
                MovableContentStateReference movableContentStateReference0 = new MovableContentStateReference(movableContent0, object0, this.o(), this.J, anchor0, u.H(), this.I0());
                this.c.i(movableContentStateReference0);
            }
        }
        finally {
            this.O0();
            this.R = v;
            this.f0();
        }
    }

    @b0
    public final void n2(@m Object object0) {
        this.v2(object0);
    }

    @Override  // androidx.compose.runtime.Composer
    @l
    public ControlledComposition o() {
        return this.h;
    }

    public final boolean o1() {
        return this.G;
    }

    private final void o2(int v, Object object0, Object object1) {
        if(object0 == null) {
            if(object1 != null && v == 0xCF && !L.g(object1, Composer.a.a())) {
                this.p2(object1.hashCode());
                return;
            }
            this.p2(v);
            return;
        }
        if(object0 instanceof Enum) {
            this.p2(((Enum)object0).ordinal());
            return;
        }
        this.p2(object0.hashCode());
    }

    @Override  // androidx.compose.runtime.Composer
    public boolean p() {
        if(!this.x) {
            RecomposeScopeImpl recomposeScopeImpl0 = this.Y0();
            return recomposeScopeImpl0 != null && recomposeScopeImpl0.n();
        }
        return true;
    }

    public final boolean p1() {
        return this.H;
    }

    private final void p2(int v) {
        this.R = v ^ Integer.rotateLeft(this.e0(), 3);
    }

    @Override  // androidx.compose.runtime.Composer
    public void q(@l RecomposeScope recomposeScope0) {
        L.p(recomposeScope0, "scope");
        RecomposeScopeImpl recomposeScopeImpl0 = recomposeScope0 instanceof RecomposeScopeImpl ? ((RecomposeScopeImpl)recomposeScope0) : null;
        if(recomposeScopeImpl0 != null) {
            recomposeScopeImpl0.G(true);
        }
    }

    @b0
    @m
    public final Object q1() {
        if(this.E()) {
            this.y2();
            return Composer.a.a();
        }
        Object object0 = this.I.Q();
        return this.z ? Composer.a.a() : object0;
    }

    private final void q2(int v, Object object0, Object object1) {
        if(object0 == null) {
            if(object1 != null && v == 0xCF && !L.g(object1, Composer.a.a())) {
                this.r2(object1.hashCode());
                return;
            }
            this.r2(v);
            return;
        }
        if(object0 instanceof Enum) {
            this.r2(((Enum)object0).ordinal());
            return;
        }
        this.r2(object0.hashCode());
    }

    @Override  // androidx.compose.runtime.Composer
    @l
    public CompositionContext r() {
        this.j2(206, ComposerKt.a0());
        CompositionContextHolder composerImpl$CompositionContextHolder0 = null;
        if(this.E()) {
            SlotWriter.x0(this.K, 0, 1, null);
        }
        Object object0 = this.q1();
        if(object0 instanceof CompositionContextHolder) {
            composerImpl$CompositionContextHolder0 = (CompositionContextHolder)object0;
        }
        if(composerImpl$CompositionContextHolder0 == null) {
            composerImpl$CompositionContextHolder0 = new CompositionContextHolder(new CompositionContextImpl(this, this.e0(), this.q));
            this.v2(composerImpl$CompositionContextHolder0);
        }
        composerImpl$CompositionContextHolder0.b().A(this.I0());
        this.O0();
        return composerImpl$CompositionContextHolder0.b();
    }

    private final Object r1(SlotReader slotReader0, int v) {
        return slotReader0.R(v);
    }

    private final void r2(int v) {
        this.R = Integer.rotateRight(v ^ this.e0(), 3);
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void s() {
        if(this.E) {
            this.N0(false);
        }
    }

    private final int s1(int v, int v1, int v2, int v3) {
        int v4;
        for(v4 = this.I.V(v1); v4 != v2 && !this.I.P(v4); v4 = this.I.V(v4)) {
        }
        if(this.I.P(v4)) {
            v3 = 0;
        }
        if(v4 == v1) {
            return v3;
        }
        int v5 = this.w2(v4) - this.I.T(v1) + v3;
    label_9:
        while(v3 < v5 && v4 != v) {
            ++v4;
            while(true) {
                if(v4 >= v) {
                    break label_9;
                }
                int v6 = this.I.K(v4) + v4;
                if(v >= v6) {
                    v3 += this.w2(v4);
                    v4 = v6;
                    continue;
                }
                if(false) {
                    break label_9;
                }
                continue label_9;
            }
        }
        return v3;
    }

    private final void s2(int v, int v1) {
        if(this.w2(v) != v1) {
            if(v < 0) {
                HashMap hashMap0 = this.p;
                if(hashMap0 == null) {
                    hashMap0 = new HashMap();
                    this.p = hashMap0;
                }
                hashMap0.put(v, v1);
                return;
            }
            int[] arr_v = this.o;
            if(arr_v == null) {
                arr_v = new int[this.I.A()];
                kotlin.collections.l.T1(arr_v, -1, 0, 0, 6, null);
                this.o = arr_v;
            }
            arr_v[v] = v1;
        }
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean t(@m Object object0) {
        if(!L.g(this.q1(), object0)) {
            this.v2(object0);
            return true;
        }
        return false;
    }

    // 去混淆评级： 低(20)
    public final int t1() {
        return this.E() ? this.K.g0(this.K.Z()) : this.I.H(this.I.y());
    }

    private final void t2(int v, int v1) {
        int v2 = this.w2(v);
        if(v2 != v1) {
            int v3 = this.i.b() - 1;
            while(v != -1) {
                int v4 = this.w2(v) + (v1 - v2);
                this.s2(v, v4);
                for(int v5 = v3; -1 < v5; --v5) {
                    Pending pending0 = (Pending)this.i.f(v5);
                    if(pending0 != null && pending0.n(v, v4)) {
                        v3 = v5 - 1;
                        break;
                    }
                }
                if(v < 0) {
                    v = this.I.y();
                }
                else {
                    if(this.I.P(v)) {
                        break;
                    }
                    v = this.I.V(v);
                }
            }
        }
    }

    @Override  // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void u(@l ProvidedValue[] arr_providedValue) {
        PersistentMap persistentMap2;
        L.p(arr_providedValue, "values");
        PersistentMap persistentMap0 = this.I0();
        this.j2(201, ComposerKt.R());
        this.j2(203, ComposerKt.X());
        PersistentMap persistentMap1 = (PersistentMap)ActualJvm_jvmKt.d(this, new o(persistentMap0) {
            final ProvidedValue[] e;
            final PersistentMap f;

            {
                this.e = arr_providedValue;
                this.f = persistentMap0;
                super(2);
            }

            @Composable
            @l
            public final PersistentMap a(@m Composer composer0, int v) {
                composer0.V(0x37BE80EE);
                if(ComposerKt.g0()) {
                    ComposerKt.w0(0x37BE80EE, v, -1, "androidx.compose.runtime.ComposerImpl.startProviders.<anonymous> (Composer.kt:1981)");
                }
                PersistentMap persistentMap0 = ComposerKt.B(this.e, this.f, composer0, 8);
                if(ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                composer0.g0();
                return persistentMap0;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((Composer)object0), ((Number)object1).intValue());
            }
        });
        this.O0();
        int v = 0;
        if(this.E()) {
            persistentMap2 = this.u2(persistentMap0, persistentMap1);
            this.L = true;
        }
        else {
            Object object0 = this.I.F(0);
            L.n(object0, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
            Object object1 = this.I.F(1);
            L.n(object1, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
            if(!this.c() || !L.g(((PersistentMap)object1), persistentMap1)) {
                persistentMap2 = this.u2(persistentMap0, persistentMap1);
                v = !L.g(persistentMap2, ((PersistentMap)object0));
            }
            else {
                this.f2();
                persistentMap2 = (PersistentMap)object0;
            }
        }
        if(v != 0 && !this.E()) {
            this.w.g(this.I.n(), persistentMap2);
        }
        this.y.j(ComposerKt.b(this.x));
        this.x = v;
        this.M = persistentMap2;
        this.h2(202, ComposerKt.I(), 0, persistentMap2);
    }

    public final void u1(@l a a0) {
        L.p(a0, "block");
        if(!this.G) {
            try {
                this.G = true;
                a0.invoke();
                this.G = false;
                return;
            }
            catch(Throwable throwable0) {
                this.G = false;
                throw throwable0;
            }
        }
        ComposerKt.A("Preparing a composition while composing is not supported");
        throw new y();
    }

    private final PersistentMap u2(PersistentMap persistentMap0, PersistentMap persistentMap1) {
        Builder persistentMap$Builder0 = persistentMap0.builder();
        persistentMap$Builder0.putAll(persistentMap1);
        PersistentMap persistentMap2 = persistentMap$Builder0.build();
        this.j2(204, ComposerKt.U());
        this.t(persistentMap2);
        this.t(persistentMap1);
        this.O0();
        return persistentMap2;
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean v(boolean z) {
        Object object0 = this.q1();
        if(object0 instanceof Boolean && z == ((Boolean)object0).booleanValue()) {
            return false;
        }
        this.v2(Boolean.valueOf(z));
        return true;
    }

    private final void v1() {
        if(this.T.d()) {
            this.w1(this.T.i());
            this.T.a();
        }
    }

    @b0
    public final void v2(@m Object object0) {
        if(this.E()) {
            this.K.n1(object0);
            if(object0 instanceof RememberObserver) {
                this.F1(new p() {
                    final Object e;

                    {
                        this.e = object0;
                        super(3);
                    }

                    public final void a(@l Applier applier0, @l SlotWriter slotWriter0, @l RememberManager rememberManager0) {
                        L.p(applier0, "<anonymous parameter 0>");
                        L.p(slotWriter0, "<anonymous parameter 1>");
                        L.p(rememberManager0, "rememberManager");
                        rememberManager0.e(((RememberObserver)this.e));
                    }

                    @Override  // A3.p
                    public Object invoke(Object object0, Object object1, Object object2) {
                        this.a(((Applier)object0), ((SlotWriter)object1), ((RememberManager)object2));
                        return S0.a;
                    }
                });
                this.e.add(object0);
            }
        }
        else {
            int v = this.I.v();
            if(object0 instanceof RememberObserver) {
                this.e.add(object0);
            }
            this.T1(true, new p(v - 1) {
                final Object e;
                final int f;

                {
                    this.e = object0;
                    this.f = v;
                    super(3);
                }

                public final void a(@l Applier applier0, @l SlotWriter slotWriter0, @l RememberManager rememberManager0) {
                    L.p(applier0, "<anonymous parameter 0>");
                    L.p(slotWriter0, "slots");
                    L.p(rememberManager0, "rememberManager");
                    Object object0 = this.e;
                    if(object0 instanceof RememberObserver) {
                        rememberManager0.e(((RememberObserver)object0));
                    }
                    Object object1 = slotWriter0.X0(this.f, this.e);
                    if(object1 instanceof RememberObserver) {
                        rememberManager0.a(((RememberObserver)object1));
                        return;
                    }
                    if(object1 instanceof RecomposeScopeImpl) {
                        CompositionImpl compositionImpl0 = ((RecomposeScopeImpl)object1).l();
                        if(compositionImpl0 != null) {
                            ((RecomposeScopeImpl)object1).x();
                            compositionImpl0.T(true);
                        }
                    }
                }

                @Override  // A3.p
                public Object invoke(Object object0, Object object1, Object object2) {
                    this.a(((Applier)object0), ((SlotWriter)object1), ((RememberManager)object2));
                    return S0.a;
                }
            });
        }
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean w(short v) {
        Object object0 = this.q1();
        if(object0 instanceof Short && v == ((Number)object0).shortValue()) {
            return false;
        }
        this.v2(v);
        return true;
    }

    private final void w1(Object[] arr_object) {
        this.F1(new p() {
            final Object[] e;

            {
                this.e = arr_object;
                super(3);
            }

            public final void a(@l Applier applier0, @l SlotWriter slotWriter0, @l RememberManager rememberManager0) {
                L.p(applier0, "applier");
                L.p(slotWriter0, "<anonymous parameter 1>");
                L.p(rememberManager0, "<anonymous parameter 2>");
                for(int v = 0; v < this.e.length; ++v) {
                    applier0.h(this.e[v]);
                }
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                this.a(((Applier)object0), ((SlotWriter)object1), ((RememberManager)object2));
                return S0.a;
            }
        });
    }

    private final int w2(int v) {
        if(v < 0) {
            HashMap hashMap0 = this.p;
            if(hashMap0 != null) {
                Integer integer0 = (Integer)hashMap0.get(v);
                return integer0 == null ? 0 : ((int)integer0);
            }
            return 0;
        }
        int[] arr_v = this.o;
        if(arr_v != null) {
            int v1 = arr_v[v];
            return v1 < 0 ? this.I.T(v) : v1;
        }
        return this.I.T(v);
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean x(float f) {
        Object object0 = this.q1();
        if(object0 instanceof Float && f == ((Number)object0).floatValue()) {
            return false;
        }
        this.v2(f);
        return true;
    }

    private final void x1() {
        int v = this.c0;
        this.c0 = 0;
        if(v > 0) {
            int v1 = this.Z;
            if(v1 >= 0) {
                this.Z = -1;
                this.G1(new p(v) {
                    final int e;
                    final int f;

                    {
                        this.e = v;
                        this.f = v1;
                        super(3);
                    }

                    public final void a(@l Applier applier0, @l SlotWriter slotWriter0, @l RememberManager rememberManager0) {
                        L.p(applier0, "applier");
                        L.p(slotWriter0, "<anonymous parameter 1>");
                        L.p(rememberManager0, "<anonymous parameter 2>");
                        applier0.b(this.e, this.f);
                    }

                    @Override  // A3.p
                    public Object invoke(Object object0, Object object1, Object object2) {
                        this.a(((Applier)object0), ((SlotWriter)object1), ((RememberManager)object2));
                        return S0.a;
                    }
                });
                return;
            }
            int v2 = this.a0;
            this.a0 = -1;
            int v3 = this.b0;
            this.b0 = -1;
            this.G1(new p(v3, v) {
                final int e;
                final int f;
                final int g;

                {
                    this.e = v;
                    this.f = v1;
                    this.g = v2;
                    super(3);
                }

                public final void a(@l Applier applier0, @l SlotWriter slotWriter0, @l RememberManager rememberManager0) {
                    L.p(applier0, "applier");
                    L.p(slotWriter0, "<anonymous parameter 1>");
                    L.p(rememberManager0, "<anonymous parameter 2>");
                    applier0.e(this.e, this.f, this.g);
                }

                @Override  // A3.p
                public Object invoke(Object object0, Object object1, Object object2) {
                    this.a(((Applier)object0), ((SlotWriter)object1), ((RememberManager)object2));
                    return S0.a;
                }
            });
        }
    }

    private final void x2() {
        if(this.s) {
            this.s = false;
            return;
        }
        ComposerKt.A("A call to createNode(), emitNode() or useNode() expected was not expected");
        throw new y();
    }

    @Override  // androidx.compose.runtime.Composer
    public void y() {
        this.z = this.A >= 0;
    }

    private final void y1(boolean z) {
        int v = z ? this.I.y() : this.I.n();
        int v1 = v - this.U;
        if(v1 >= 0) {
            if(v1 > 0) {
                this.F1(new p() {
                    final int e;

                    {
                        this.e = v;
                        super(3);
                    }

                    public final void a(@l Applier applier0, @l SlotWriter slotWriter0, @l RememberManager rememberManager0) {
                        L.p(applier0, "<anonymous parameter 0>");
                        L.p(slotWriter0, "slots");
                        L.p(rememberManager0, "<anonymous parameter 2>");
                        slotWriter0.A(this.e);
                    }

                    @Override  // A3.p
                    public Object invoke(Object object0, Object object1, Object object2) {
                        this.a(((Applier)object0), ((SlotWriter)object1), ((RememberManager)object2));
                        return S0.a;
                    }
                });
                this.U = v;
            }
            return;
        }
        ComposerKt.A("Tried to seek backward");
        throw new y();
    }

    private final void y2() {
        if(!this.s) {
            return;
        }
        ComposerKt.A("A call to createNode(), emitNode() or useNode() expected");
        throw new y();
    }

    @Override  // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean z(int v) {
        Object object0 = this.q1();
        if(object0 instanceof Integer && v == ((Number)object0).intValue()) {
            return false;
        }
        this.v2(v);
        return true;
    }

    static void z1(ComposerImpl composerImpl0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        composerImpl0.y1(z);
    }

    public final void z2() {
        this.J.O();
    }
}

