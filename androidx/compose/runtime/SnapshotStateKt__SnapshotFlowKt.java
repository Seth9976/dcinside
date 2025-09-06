package androidx.compose.runtime;

import A3.a;
import A3.o;
import androidx.compose.runtime.snapshots.ObserverHandle;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.LinkedHashSet;
import java.util.Set;
import jeb.synthetic.FIN;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.intrinsics.b;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.channels.p;
import kotlinx.coroutines.flow.U;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.k;
import y4.l;
import y4.m;

@s0({"SMAP\nSnapshotFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,174:1\n1747#2,3:175\n*S KotlinDebug\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt\n*L\n173#1:175,3\n*E\n"})
final class SnapshotStateKt__SnapshotFlowKt {
    @Composable
    @l
    public static final State b(@l i i0, Object object0, @m g g0, @m Composer composer0, int v, int v1) {
        L.p(i0, "<this>");
        composer0.V(-606625098);
        if((v1 & 2) != 0) {
            g0 = kotlin.coroutines.i.a;
        }
        if(ComposerKt.g0()) {
            ComposerKt.w0(-606625098, v, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:59)");
        }
        State state0 = SnapshotStateKt.p(object0, i0, g0, new o(g0, i0, null) {
            int k;
            private Object l;
            final g m;
            final i n;

            {
                this.m = g0;
                this.n = i0;
                super(2, d0);
            }

            @m
            public final Object a(@l ProduceStateScope produceStateScope0, @m d d0) {
                return ((androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt.collectAsState.1)this.create(produceStateScope0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt.collectAsState.1(this.m, this.n, d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((ProduceStateScope)object0), ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        ProduceStateScope produceStateScope0 = (ProduceStateScope)this.l;
                        if(L.g(this.m, kotlin.coroutines.i.a)) {
                            androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt.collectAsState.1.1 snapshotStateKt__SnapshotFlowKt$collectAsState$1$10 = new j() {
                                @Override  // kotlinx.coroutines.flow.j
                                @m
                                public final Object emit(Object object0, @l d d0) {
                                    this.a.setValue(object0);
                                    return S0.a;
                                }
                            };
                            this.k = 1;
                            if(this.n.collect(snapshotStateKt__SnapshotFlowKt$collectAsState$1$10, this) == object1) {
                                return object1;
                            }
                        }
                        else {
                            androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt.collectAsState.1.2 snapshotStateKt__SnapshotFlowKt$collectAsState$1$20 = new o(produceStateScope0, null) {
                                int k;
                                final i l;
                                final ProduceStateScope m;

                                {
                                    this.l = i0;
                                    this.m = produceStateScope0;
                                    super(2, d0);
                                }

                                @Override  // kotlin.coroutines.jvm.internal.a
                                @l
                                public final d create(@m Object object0, @l d d0) {
                                    return new androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt.collectAsState.1.2(this.l, this.m, d0);
                                }

                                @Override  // A3.o
                                public Object invoke(Object object0, Object object1) {
                                    return this.invoke(((O)object0), ((d)object1));
                                }

                                @m
                                public final Object invoke(@l O o0, @m d d0) {
                                    return ((androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt.collectAsState.1.2)this.create(o0, d0)).invokeSuspend(S0.a);
                                }

                                @Override  // kotlin.coroutines.jvm.internal.a
                                @m
                                public final Object invokeSuspend(@l Object object0) {
                                    Object object1 = b.l();
                                    switch(this.k) {
                                        case 0: {
                                            f0.n(object0);
                                            androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt.collectAsState.1.2.1 snapshotStateKt__SnapshotFlowKt$collectAsState$1$2$10 = new j() {
                                                @Override  // kotlinx.coroutines.flow.j
                                                @m
                                                public final Object emit(Object object0, @l d d0) {
                                                    this.a.setValue(object0);
                                                    return S0.a;
                                                }
                                            };
                                            this.k = 1;
                                            return this.l.collect(snapshotStateKt__SnapshotFlowKt$collectAsState$1$2$10, this) == object1 ? object1 : S0.a;
                                        }
                                        case 1: {
                                            f0.n(object0);
                                            return S0.a;
                                        }
                                        default: {
                                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                        }
                                    }
                                }
                            };
                            this.k = 2;
                            if(kotlinx.coroutines.i.h(this.m, snapshotStateKt__SnapshotFlowKt$collectAsState$1$20, this) == object1) {
                                return object1;
                            }
                        }
                        return S0.a;
                    }
                    case 1: 
                    case 2: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }, composer0, v >> 3 & 8 | 0x1240 | v >> 3 & 14);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return state0;
    }

    @Composable
    @l
    public static final State c(@l U u0, @m g g0, @m Composer composer0, int v, int v1) {
        L.p(u0, "<this>");
        composer0.V(0xAA2D1D71);
        if((v1 & 1) != 0) {
            g0 = kotlin.coroutines.i.a;
        }
        if(ComposerKt.g0()) {
            ComposerKt.w0(0xAA2D1D71, v, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:45)");
        }
        State state0 = SnapshotStateKt.a(u0, u0.getValue(), g0, composer0, 520, 0);
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return state0;
    }

    private static final boolean d(Set set0, Set set1) {
        if(set0.size() < set1.size()) {
            if(!set0.isEmpty()) {
                for(Object object0: set0) {
                    if(!set1.contains(object0)) {
                        continue;
                    }
                    return true;
                }
            }
        }
        else if(!set1.isEmpty()) {
            for(Object object1: set1) {
                if(set0.contains(object1)) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }

    @l
    public static final i e(@l a a0) {
        L.p(a0, "block");
        return k.I0(new o(a0, null) {
            Object k;
            Object l;
            Object m;
            Object n;
            Object o;
            int p;
            int q;
            private Object r;
            final a s;

            {
                this.s = a0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt.snapshotFlow.1(this.s, d0);
                d1.r = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((j)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l j j0, @m d d0) {
                return ((androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt.snapshotFlow.1)this.create(j0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Snapshot snapshot3;
                int v2;
                Snapshot snapshot2;
                j j1;
                Set set1;
                Function1 function11;
                kotlinx.coroutines.channels.l l1;
                ObserverHandle observerHandle1;
                Object object3;
                int v1;
                Object object2;
                Snapshot snapshot1;
                int v;
                Snapshot snapshot0;
                ObserverHandle observerHandle0;
                kotlinx.coroutines.channels.l l0;
                Function1 function10;
                Set set0;
                j j0;
                Object object1 = b.l();
            alab1:
                switch(this.q) {
                    case 0: {
                        f0.n(object0);
                        j0 = (j)this.r;
                        set0 = new LinkedHashSet();
                        function10 = new Function1() {
                            final Set e;

                            {
                                this.e = set0;
                                super(1);
                            }

                            public final void a(@l Object object0) {
                                L.p(object0, "it");
                                this.e.add(object0);
                            }

                            @Override  // kotlin.jvm.functions.Function1
                            public Object invoke(Object object0) {
                                this.a(object0);
                                return S0.a;
                            }
                        };
                        l0 = kotlinx.coroutines.channels.o.d(0x7FFFFFFF, null, null, 6, null);
                        androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt.snapshotFlow.1.unregisterApplyObserver.1 snapshotStateKt__SnapshotFlowKt$snapshotFlow$1$unregisterApplyObserver$10 = new o() {
                            final kotlinx.coroutines.channels.l e;

                            {
                                this.e = l0;
                                super(2);
                            }

                            public final void a(@l Set set0, @l Snapshot snapshot0) {
                                L.p(set0, "changed");
                                L.p(snapshot0, "<anonymous parameter 1>");
                                this.e.l(set0);
                            }

                            @Override  // A3.o
                            public Object invoke(Object object0, Object object1) {
                                this.a(((Set)object0), ((Snapshot)object1));
                                return S0.a;
                            }
                        };
                        observerHandle0 = Snapshot.e.h(snapshotStateKt__SnapshotFlowKt$snapshotFlow$1$unregisterApplyObserver$10);
                        try {
                            snapshot0 = Snapshot.e.o(function10);
                            v = FIN.finallyOpen$NT();
                            snapshot1 = snapshot0.p();
                        }
                        catch(Throwable throwable0) {
                            goto label_118;
                        }
                        try {
                            object2 = this.s.invoke();
                            goto label_19;
                        }
                        catch(Throwable throwable1) {
                            try {
                                snapshot0.w(snapshot1);
                                FIN.finallyExec$NT(v);
                                throw throwable1;
                            label_19:
                                snapshot0.w(snapshot1);
                                FIN.finallyCodeBegin$NT(v);
                                snapshot0.d();
                                FIN.finallyCodeEnd$NT(v);
                                this.r = j0;
                                this.k = set0;
                                this.l = function10;
                                this.m = l0;
                                this.n = observerHandle0;
                                this.o = object2;
                                this.q = 1;
                                if(j0.emit(object2, this) == object1) {
                                    return object1;
                                }
                                goto label_55;
                            }
                            catch(Throwable throwable0) {
                                goto label_118;
                            }
                        }
                    }
                    case 1: {
                        object2 = this.o;
                        observerHandle0 = (ObserverHandle)this.n;
                        l0 = (kotlinx.coroutines.channels.l)this.m;
                        function10 = (Function1)this.l;
                        set0 = (Set)this.k;
                        j0 = (j)this.r;
                        goto label_54;
                    }
                    case 2: {
                        v1 = this.p;
                        object3 = this.o;
                        observerHandle1 = (ObserverHandle)this.n;
                        l1 = (kotlinx.coroutines.channels.l)this.m;
                        function11 = (Function1)this.l;
                        set1 = (Set)this.k;
                        j1 = (j)this.r;
                        try {
                            f0.n(object0);
                            goto label_73;
                        }
                        catch(Throwable throwable0) {
                            goto label_109;
                        }
                    }
                    case 3: {
                        object2 = this.o;
                        observerHandle0 = (ObserverHandle)this.n;
                        l0 = (kotlinx.coroutines.channels.l)this.m;
                        function10 = (Function1)this.l;
                        set0 = (Set)this.k;
                        j0 = (j)this.r;
                        try {
                        label_54:
                            f0.n(object0);
                            while(true) {
                            label_55:
                                this.r = j0;
                                this.k = set0;
                                this.l = function10;
                                this.m = l0;
                                this.n = observerHandle0;
                                this.o = object2;
                                this.p = 0;
                                this.q = 2;
                                object0 = l0.F(this);
                                if(object0 == object1) {
                                    break alab1;
                                }
                                goto label_66;
                            }
                        }
                        catch(Throwable throwable0) {
                            goto label_118;
                        }
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                return object1;
            label_66:
                j1 = j0;
                set1 = set0;
                function11 = function10;
                l1 = l0;
                observerHandle1 = observerHandle0;
                object3 = object2;
                v1 = 0;
                try {
                label_73:
                    for(Set set2 = (Set)object0; true; set2 = set3) {
                        v1 = v1 != 0 || SnapshotStateKt__SnapshotFlowKt.d(set1, set2) ? 1 : 0;
                        Set set3 = (Set)p.h(l1.v());
                        if(set3 == null) {
                            break;
                        }
                    }
                    if(v1 == 0) {
                        goto label_106;
                    }
                    else {
                        set1.clear();
                        snapshot2 = Snapshot.e.o(function11);
                        v2 = FIN.finallyOpen$NT();
                        snapshot3 = snapshot2.p();
                        goto label_84;
                    }
                    goto label_111;
                }
                catch(Throwable throwable0) {
                    goto label_109;
                }
                try {
                label_84:
                    object2 = this.s.invoke();
                    goto label_90;
                }
                catch(Throwable throwable2) {
                    try {
                        snapshot2.w(snapshot3);
                        FIN.finallyExec$NT(v2);
                        throw throwable2;
                    label_90:
                        snapshot2.w(snapshot3);
                        FIN.finallyCodeBegin$NT(v2);
                        snapshot2.d();
                        FIN.finallyCodeEnd$NT(v2);
                        if(L.g(object2, object3)) {
                            object2 = object3;
                            goto label_111;
                        label_106:
                            object2 = object3;
                        }
                        else {
                            this.r = j1;
                            this.k = set1;
                            this.l = function11;
                            this.m = l1;
                            this.n = observerHandle1;
                            this.o = object2;
                            this.q = 3;
                            if(j1.emit(object2, this) == object1) {
                                return object1;
                            }
                        }
                        goto label_111;
                    }
                    catch(Throwable throwable0) {
                    }
                }
            label_109:
                observerHandle0 = observerHandle1;
                goto label_118;
                try {
                label_111:
                    observerHandle0 = observerHandle1;
                    l0 = l1;
                    function10 = function11;
                    set0 = set1;
                    j0 = j1;
                    goto label_55;
                }
                catch(Throwable throwable0) {
                }
            label_118:
                observerHandle0.dispose();
                throw throwable0;
            }
        });
    }
}

