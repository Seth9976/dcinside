package androidx.compose.runtime;

import A3.a;
import A3.o;
import A3.p;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.MutableSnapshot;
import androidx.compose.runtime.snapshots.ObserverHandle;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotApplyResult.Failure;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import jeb.synthetic.FIN;
import kotlin.S0;
import kotlin.V;
import kotlin.c0;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.h;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.r0;
import kotlinx.coroutines.A;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.M0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.flow.E;
import kotlinx.coroutines.flow.U;
import kotlinx.coroutines.flow.W;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.k;
import kotlinx.coroutines.t0;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
@s0({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 7 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 8 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,1408:1\n1112#1,5:1450\n1118#1:1460\n1112#1,5:1473\n1118#1:1483\n1112#1,5:1504\n1118#1:1525\n70#2:1409\n70#2:1430\n70#2:1432\n70#2:1433\n70#2:1434\n70#2:1435\n70#2:1445\n70#2:1448\n70#2:1449\n70#2:1461\n70#2:1462\n70#2:1512\n70#2:1526\n70#2:1549\n70#2:1550\n70#2:1551\n70#2:1552\n70#2:1553\n70#2:1554\n70#2:1555\n70#2:1556\n70#2:1557\n1229#3,2:1410\n33#4,6:1412\n33#4,6:1418\n33#4,6:1424\n93#4,2:1463\n33#4,4:1465\n95#4,2:1469\n38#4:1471\n97#4:1472\n120#4,3:1484\n33#4,4:1487\n123#4,2:1491\n125#4,2:1500\n38#4:1502\n127#4:1503\n82#4,3:1513\n33#4,4:1516\n85#4,2:1520\n38#4:1522\n87#4:1523\n82#4,3:1527\n33#4,4:1530\n85#4,2:1534\n38#4:1536\n87#4:1537\n33#4,6:1538\n1#5:1431\n314#6,9:1436\n323#6,2:1446\n122#7,5:1455\n122#7,5:1478\n122#7,3:1509\n126#7:1524\n122#7,5:1544\n361#8,7:1493\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer\n*L\n965#1:1450,5\n965#1:1460\n1039#1:1473,5\n1039#1:1483\n1059#1:1504,5\n1059#1:1525\n324#1:1409\n448#1:1430\n655#1:1432\n691#1:1433\n703#1:1434\n846#1:1435\n855#1:1445\n930#1:1448\n946#1:1449\n978#1:1461\n1009#1:1462\n1062#1:1512\n1075#1:1526\n1142#1:1549\n1186#1:1550\n1194#1:1551\n1203#1:1552\n1210#1:1553\n1217#1:1554\n1226#1:1555\n1234#1:1556\n1015#1:1557\n325#1:1410,2\n415#1:1412,6\n435#1:1418,6\n440#1:1424,6\n1010#1:1463,2\n1010#1:1465,4\n1010#1:1469,2\n1010#1:1471\n1010#1:1472\n1056#1:1484,3\n1056#1:1487,4\n1056#1:1491,2\n1056#1:1500,2\n1056#1:1502\n1056#1:1503\n1063#1:1513,3\n1063#1:1516,4\n1063#1:1520,2\n1063#1:1522\n1063#1:1523\n1079#1:1527,3\n1079#1:1530,4\n1079#1:1534,2\n1079#1:1536\n1079#1:1537\n1086#1:1538,6\n854#1:1436,9\n854#1:1446,2\n965#1:1455,5\n1039#1:1478,5\n1059#1:1509,3\n1059#1:1524\n1116#1:1544,5\n1056#1:1493,7\n*E\n"})
public final class Recomposer extends CompositionContext {
    @s0({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1408:1\n1360#2:1409\n1446#2,5:1410\n1855#2,2:1415\n1855#2,2:1429\n1855#2,2:1431\n1603#2,9:1433\n1855#2:1442\n1856#2:1444\n1612#2:1445\n1603#2,9:1446\n1855#2:1455\n1856#2:1457\n1612#2:1458\n33#3,6:1417\n33#3,6:1423\n1#4:1443\n1#4:1456\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$Companion\n*L\n1285#1:1409\n1285#1:1410,5\n1293#1:1415,2\n1302#1:1429,2\n1309#1:1431,2\n1323#1:1433,9\n1323#1:1442\n1323#1:1444\n1323#1:1445\n1328#1:1446,9\n1328#1:1455\n1328#1:1457\n1328#1:1458\n1299#1:1417,6\n1300#1:1423,6\n1323#1:1443\n1328#1:1456\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        public Companion(w w0) {
        }

        private final void c(RecomposerInfoImpl recomposer$RecomposerInfoImpl0) {
            do {
                PersistentSet persistentSet0 = (PersistentSet)Recomposer.y.getValue();
                PersistentSet persistentSet1 = persistentSet0.add(recomposer$RecomposerInfoImpl0);
            }
            while(persistentSet0 != persistentSet1 && !Recomposer.y.compareAndSet(persistentSet0, persistentSet1));
        }

        public final void d() {
            Iterable iterable0 = (Iterable)Recomposer.y.getValue();
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: iterable0) {
                RecomposerErrorState recomposer$RecomposerErrorState0 = ((RecomposerInfoImpl)object0).e();
                if(recomposer$RecomposerErrorState0 != null) {
                    arrayList0.add(recomposer$RecomposerErrorState0);
                }
            }
        }

        @l
        public final List e() {
            Iterable iterable0 = (Iterable)Recomposer.y.getValue();
            List list0 = new ArrayList();
            for(Object object0: iterable0) {
                RecomposerErrorInfo recomposerErrorInfo0 = ((RecomposerInfoImpl)object0).c();
                if(recomposerErrorInfo0 != null) {
                    list0.add(recomposerErrorInfo0);
                }
            }
            return list0;
        }

        @l
        public final U f() {
            return Recomposer.y;
        }

        public final void g(int v) {
            Recomposer.z.set(Boolean.TRUE);
            for(Object object0: ((Iterable)Recomposer.y.getValue())) {
                RecomposerInfoImpl recomposer$RecomposerInfoImpl0 = (RecomposerInfoImpl)object0;
                RecomposerErrorInfo recomposerErrorInfo0 = recomposer$RecomposerInfoImpl0.c();
                if(recomposerErrorInfo0 == null || recomposerErrorInfo0.b()) {
                    recomposer$RecomposerInfoImpl0.e();
                    recomposer$RecomposerInfoImpl0.d(v);
                    recomposer$RecomposerInfoImpl0.f();
                }
            }
        }

        public final void h(@l Object object0) {
            L.p(object0, "token");
            Recomposer.z.set(Boolean.TRUE);
            for(Object object1: ((Iterable)Recomposer.y.getValue())) {
                ((RecomposerInfoImpl)object1).e();
            }
            int v = ((List)object0).size();
            for(int v2 = 0; v2 < v; ++v2) {
                ((HotReloadable)((List)object0).get(v2)).c();
            }
            int v3 = ((List)object0).size();
            for(int v1 = 0; v1 < v3; ++v1) {
                ((HotReloadable)((List)object0).get(v1)).b();
            }
            for(Object object2: ((Iterable)Recomposer.y.getValue())) {
                ((RecomposerInfoImpl)object2).f();
            }
        }

        private final void i(RecomposerInfoImpl recomposer$RecomposerInfoImpl0) {
            do {
                PersistentSet persistentSet0 = (PersistentSet)Recomposer.y.getValue();
                PersistentSet persistentSet1 = persistentSet0.remove(recomposer$RecomposerInfoImpl0);
            }
            while(persistentSet0 != persistentSet1 && !Recomposer.y.compareAndSet(persistentSet0, persistentSet1));
        }

        @l
        public final Object j() {
            Recomposer.z.set(Boolean.TRUE);
            Iterable iterable0 = (Iterable)Recomposer.y.getValue();
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: iterable0) {
                u.q0(arrayList0, ((RecomposerInfoImpl)object0).g());
            }
            return arrayList0;
        }

        public final void k(boolean z) {
            Recomposer.z.set(Boolean.valueOf(z));
        }
    }

    static final class HotReloadable {
        @l
        private final CompositionImpl a;
        @l
        private o b;

        public HotReloadable(@l CompositionImpl compositionImpl0) {
            L.p(compositionImpl0, "composition");
            super();
            this.a = compositionImpl0;
            this.b = compositionImpl0.r();
        }

        public final void a() {
            if(this.a.P()) {
                this.a.b(ComposableSingletons.RecomposerKt.a.a());
            }
        }

        public final void b() {
            if(this.a.P()) {
                this.a.b(this.b);
            }
        }

        public final void c() {
            this.a.S(this.b);
        }
    }

    static final class RecomposerErrorState implements RecomposerErrorInfo {
        private final boolean a;
        @l
        private final Exception b;

        public RecomposerErrorState(boolean z, @l Exception exception0) {
            L.p(exception0, "cause");
            super();
            this.a = z;
            this.b = exception0;
        }

        @Override  // androidx.compose.runtime.RecomposerErrorInfo
        @l
        public Exception a() {
            return this.b;
        }

        @Override  // androidx.compose.runtime.RecomposerErrorInfo
        public boolean b() {
            return this.a;
        }
    }

    @s0({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$RecomposerInfoImpl\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1408:1\n70#2:1409\n70#2:1410\n70#2:1429\n211#3,3:1411\n33#3,4:1414\n214#3:1418\n215#3:1420\n38#3:1421\n216#3:1422\n33#3,6:1423\n211#3,3:1430\n33#3,4:1433\n214#3:1437\n215#3:1439\n38#3:1440\n216#3:1441\n82#3,3:1442\n33#3,4:1445\n85#3:1449\n86#3:1451\n38#3:1452\n87#3:1453\n1#4:1419\n1#4:1438\n1#4:1450\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$RecomposerInfoImpl\n*L\n350#1:1409\n355#1:1410\n363#1:1429\n359#1:1411,3\n359#1:1414,4\n359#1:1418\n359#1:1420\n359#1:1421\n359#1:1422\n360#1:1423,6\n367#1:1430,3\n367#1:1433,4\n367#1:1437\n367#1:1439\n367#1:1440\n367#1:1441\n368#1:1442,3\n368#1:1445,4\n368#1:1449\n368#1:1451\n368#1:1452\n368#1:1453\n359#1:1419\n367#1:1438\n*E\n"})
    final class RecomposerInfoImpl implements RecomposerInfo {
        final Recomposer a;

        @Override  // androidx.compose.runtime.RecomposerInfo
        public long a() {
            return Recomposer.this.o0();
        }

        @Override  // androidx.compose.runtime.RecomposerInfo
        public boolean b() {
            return Recomposer.this.s0();
        }

        @m
        public final RecomposerErrorInfo c() {
            synchronized(Recomposer.this.d) {
                return Recomposer.this.r;
            }
        }

        public final void d(int v) {
            List list0;
            synchronized(Recomposer.this.d) {
                list0 = u.Y5(Recomposer.this.g);
            }
            ArrayList arrayList0 = new ArrayList(list0.size());
            int v2 = list0.size();
            for(int v4 = 0; v4 < v2; ++v4) {
                ControlledComposition controlledComposition0 = (ControlledComposition)list0.get(v4);
                CompositionImpl compositionImpl0 = controlledComposition0 instanceof CompositionImpl ? ((CompositionImpl)controlledComposition0) : null;
                if(compositionImpl0 != null) {
                    arrayList0.add(compositionImpl0);
                }
            }
            int v5 = arrayList0.size();
            for(int v3 = 0; v3 < v5; ++v3) {
                ((CompositionImpl)arrayList0.get(v3)).N(v);
            }
        }

        @m
        public final RecomposerErrorState e() {
            return Recomposer.this.J0();
        }

        public final void f() {
            Recomposer.this.K0();
        }

        @l
        public final List g() {
            List list0;
            synchronized(Recomposer.this.d) {
                list0 = u.Y5(Recomposer.this.g);
            }
            ArrayList arrayList0 = new ArrayList(list0.size());
            int v1 = list0.size();
            for(int v3 = 0; v3 < v1; ++v3) {
                ControlledComposition controlledComposition0 = (ControlledComposition)list0.get(v3);
                CompositionImpl compositionImpl0 = controlledComposition0 instanceof CompositionImpl ? ((CompositionImpl)controlledComposition0) : null;
                if(compositionImpl0 != null) {
                    arrayList0.add(compositionImpl0);
                }
            }
            List list1 = new ArrayList(arrayList0.size());
            int v4 = arrayList0.size();
            for(int v2 = 0; v2 < v4; ++v2) {
                HotReloadable recomposer$HotReloadable0 = new HotReloadable(((CompositionImpl)arrayList0.get(v2)));
                recomposer$HotReloadable0.a();
                list1.add(recomposer$HotReloadable0);
            }
            return list1;
        }

        @Override  // androidx.compose.runtime.RecomposerInfo
        @l
        public i getState() {
            return Recomposer.this.p0();
        }
    }

    public static enum State {
        ShutDown,
        ShuttingDown,
        Inactive,
        InactivePendingWork,
        Idle,
        PendingWork;

        private static final State[] a() [...] // Inlined contents
    }

    private long b;
    @l
    private final BroadcastFrameClock c;
    @l
    private final Object d;
    @m
    private I0 e;
    @m
    private Throwable f;
    @l
    private final List g;
    @l
    private Set h;
    @l
    private final List i;
    @l
    private final List j;
    @l
    private final List k;
    @l
    private final Map l;
    @l
    private final Map m;
    @m
    private List n;
    @m
    private kotlinx.coroutines.o o;
    private int p;
    private boolean q;
    @m
    private RecomposerErrorState r;
    @l
    private final E s;
    @l
    private final A t;
    @l
    private final g u;
    @l
    private final RecomposerInfoImpl v;
    @l
    public static final Companion w;
    public static final int x;
    @l
    private static final E y;
    @l
    private static final AtomicReference z;

    static {
        Recomposer.w = new Companion(null);
        Recomposer.x = 8;
        Recomposer.y = W.a(ExtensionsKt.K());
        Recomposer.z = new AtomicReference(Boolean.FALSE);
    }

    public Recomposer(@l g g0) {
        L.p(g0, "effectCoroutineContext");
        super();
        BroadcastFrameClock broadcastFrameClock0 = new BroadcastFrameClock(new a() {
            final Recomposer e;

            {
                this.e = recomposer0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                Object object0 = this.e.d;
                Recomposer recomposer0 = this.e;
                synchronized(object0) {
                    kotlinx.coroutines.o o0 = recomposer0.m0();
                    if(((State)recomposer0.s.getValue()).compareTo(State.b) > 0) {
                        if(o0 != null) {
                            o0.resumeWith(S0.a);
                        }
                        return;
                    }
                }
                throw t0.a("Recomposer shutdown; frame clock awaiter will never resume", recomposer0.f);
            }
        });
        this.c = broadcastFrameClock0;
        this.d = new Object();
        this.g = new ArrayList();
        this.h = new LinkedHashSet();
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new LinkedHashMap();
        this.m = new LinkedHashMap();
        this.s = W.a(State.c);
        A a0 = M0.a(((I0)g0.get(I0.B8)));
        a0.w(new Function1() {
            final Recomposer e;

            {
                this.e = recomposer0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Throwable)object0));
                return S0.a;
            }

            public final void invoke(@m Throwable throwable0) {
                d d0;
                kotlinx.coroutines.o o0;
                CancellationException cancellationException0 = t0.a("Recomposer effect job completed", throwable0);
                Object object0 = this.e.d;
                Recomposer recomposer0 = this.e;
                synchronized(object0) {
                    I0 i00 = recomposer0.e;
                    d0 = null;
                    if(i00 == null) {
                        recomposer0.f = cancellationException0;
                        recomposer0.s.setValue(State.a);
                    }
                    else {
                        recomposer0.s.setValue(State.b);
                        if(recomposer0.q) {
                            o0 = recomposer0.o == null ? null : recomposer0.o;
                        }
                        else {
                            i00.e(cancellationException0);
                            o0 = null;
                        }
                        recomposer0.o = null;
                        i00.w(new Function1(throwable0) {
                            final Recomposer e;
                            final Throwable f;

                            {
                                this.e = recomposer0;
                                this.f = throwable0;
                                super(1);
                            }

                            @Override  // kotlin.jvm.functions.Function1
                            public Object invoke(Object object0) {
                                this.invoke(((Throwable)object0));
                                return S0.a;
                            }

                            public final void invoke(@m Throwable throwable0) {
                                Object object0 = this.e.d;
                                Recomposer recomposer0 = this.e;
                                Throwable throwable1 = this.f;
                                synchronized(object0) {
                                    if(throwable1 == null) {
                                        throwable1 = null;
                                    }
                                    else if(throwable0 != null) {
                                        if(throwable0 instanceof CancellationException) {
                                            throwable0 = null;
                                        }
                                        if(throwable0 != null) {
                                            kotlin.o.a(throwable1, throwable0);
                                        }
                                    }
                                    recomposer0.f = throwable1;
                                    recomposer0.s.setValue(State.a);
                                }
                            }
                        });
                        d0 = o0;
                    }
                }
                if(d0 != null) {
                    d0.resumeWith(S0.a);
                }
            }
        });
        this.t = a0;
        this.u = g0.plus(broadcastFrameClock0).plus(a0);
        this.v = new RecomposerInfoImpl(this);
    }

    private final List A0(List list0, IdentityArraySet identityArraySet0) {
        ArrayList arrayList1;
        HashMap hashMap0 = new HashMap(list0.size());
        int v = list0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = list0.get(v1);
            ControlledComposition controlledComposition0 = ((MovableContentStateReference)object0).b();
            ArrayList arrayList0 = hashMap0.get(controlledComposition0);
            if(arrayList0 == null) {
                arrayList0 = new ArrayList();
                hashMap0.put(controlledComposition0, arrayList0);
            }
            arrayList0.add(object0);
        }
        for(Object object1: hashMap0.entrySet()) {
            ControlledComposition controlledComposition1 = (ControlledComposition)((Map.Entry)object1).getKey();
            List list1 = (List)((Map.Entry)object1).getValue();
            ComposerKt.q0(!controlledComposition1.B());
            Function1 function10 = this.E0(controlledComposition1);
            Function1 function11 = this.O0(controlledComposition1, identityArraySet0);
            MutableSnapshot mutableSnapshot0 = Snapshot.e.m(function10, function11);
            try {
                Snapshot snapshot0 = mutableSnapshot0.p();
                try {
                    synchronized(this.d) {
                        arrayList1 = new ArrayList(list1.size());
                        int v4 = list1.size();
                        for(int v5 = 0; v5 < v4; ++v5) {
                            MovableContentStateReference movableContentStateReference0 = (MovableContentStateReference)list1.get(v5);
                            arrayList1.add(r0.a(movableContentStateReference0, RecomposerKt.d(this.l, movableContentStateReference0.c())));
                        }
                    }
                    controlledComposition1.t(arrayList1);
                }
                catch(Throwable throwable0) {
                    mutableSnapshot0.w(snapshot0);
                    throw throwable0;
                }
                mutableSnapshot0.w(snapshot0);
            }
            finally {
                this.f0(mutableSnapshot0);
            }
        }
        return u.V5(hashMap0.keySet());
    }

    private final ControlledComposition B0(ControlledComposition controlledComposition0, IdentityArraySet identityArraySet0) {
        boolean z;
        if(!controlledComposition0.B() && !controlledComposition0.a()) {
            Function1 function10 = this.E0(controlledComposition0);
            Function1 function11 = this.O0(controlledComposition0, identityArraySet0);
            MutableSnapshot mutableSnapshot0 = Snapshot.e.m(function10, function11);
            try {
                Snapshot snapshot0 = mutableSnapshot0.p();
                try {
                    if(identityArraySet0 != null && identityArraySet0.j()) {
                        controlledComposition0.z(new a(controlledComposition0) {
                            final IdentityArraySet e;
                            final ControlledComposition f;

                            {
                                this.e = identityArraySet0;
                                this.f = controlledComposition0;
                                super(0);
                            }

                            @Override  // A3.a
                            public Object invoke() {
                                this.invoke();
                                return S0.a;
                            }

                            public final void invoke() {
                                IdentityArraySet identityArraySet0 = this.e;
                                ControlledComposition controlledComposition0 = this.f;
                                int v = identityArraySet0.size();
                                for(int v1 = 0; v1 < v; ++v1) {
                                    controlledComposition0.C(identityArraySet0.get(v1));
                                }
                            }
                        });
                    }
                    z = controlledComposition0.v();
                }
                catch(Throwable throwable0) {
                    mutableSnapshot0.w(snapshot0);
                    throw throwable0;
                }
                mutableSnapshot0.w(snapshot0);
                return z ? controlledComposition0 : null;
            }
            finally {
                this.f0(mutableSnapshot0);
            }
        }
        return null;
    }

    private final void C0(Exception exception0, ControlledComposition controlledComposition0, boolean z) {
        Object object0 = Recomposer.z.get();
        L.o(object0, "_hotReloadEnabled.get()");
        if(!((Boolean)object0).booleanValue() || exception0 instanceof ComposeRuntimeError) {
            throw exception0;
        }
        synchronized(this.d) {
            ActualAndroid_androidKt.d("Error was captured in composition while live edit was enabled.", exception0);
            this.j.clear();
            this.i.clear();
            this.h = new LinkedHashSet();
            this.k.clear();
            this.l.clear();
            this.m.clear();
            this.r = new RecomposerErrorState(z, exception0);
            if(controlledComposition0 != null) {
                List list0 = this.n;
                if(list0 == null) {
                    list0 = new ArrayList();
                    this.n = list0;
                }
                if(!list0.contains(controlledComposition0)) {
                    list0.add(controlledComposition0);
                }
                this.g.remove(controlledComposition0);
            }
            this.m0();
        }
    }

    static void D0(Recomposer recomposer0, Exception exception0, ControlledComposition controlledComposition0, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            controlledComposition0 = null;
        }
        if((v & 4) != 0) {
            z = false;
        }
        recomposer0.C0(exception0, controlledComposition0, z);
    }

    private final Function1 E0(ControlledComposition controlledComposition0) {
        return new Function1() {
            final ControlledComposition e;

            {
                this.e = controlledComposition0;
                super(1);
            }

            public final void a(@l Object object0) {
                L.p(object0, "value");
                this.e.x(object0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(object0);
                return S0.a;
            }
        };
    }

    private final Object F0(p p0, d d0) {
        androidx.compose.runtime.Recomposer.recompositionRunner.2 recomposer$recompositionRunner$20 = new o(p0, MonotonicFrameClockKt.a(d0.getContext()), null) {
            Object k;
            int l;
            private Object m;
            final Recomposer n;
            final p o;
            final MonotonicFrameClock p;

            {
                this.n = recomposer0;
                this.o = p0;
                this.p = monotonicFrameClock0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.compose.runtime.Recomposer.recompositionRunner.2(this.n, this.o, this.p, d0);
                d1.m = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((androidx.compose.runtime.Recomposer.recompositionRunner.2)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                Throwable throwable1;
                ObserverHandle observerHandle1;
                I0 i00;
                Object object1 = b.l();
                switch(this.l) {
                    case 0: {
                        f0.n(object0);
                        i00 = M0.B(((O)this.m).getCoroutineContext());
                        this.n.I0(i00);
                        androidx.compose.runtime.Recomposer.recompositionRunner.2.unregisterApplyObserver.1 recomposer$recompositionRunner$2$unregisterApplyObserver$10 = new o() {
                            final Recomposer e;

                            {
                                this.e = recomposer0;
                                super(2);
                            }

                            public final void a(@l Set set0, @l Snapshot snapshot0) {
                                kotlinx.coroutines.o o0;
                                L.p(set0, "changed");
                                L.p(snapshot0, "<anonymous parameter 1>");
                                Object object0 = this.e.d;
                                Recomposer recomposer0 = this.e;
                                synchronized(object0) {
                                    if(((State)recomposer0.s.getValue()).compareTo(State.e) >= 0) {
                                        recomposer0.h.addAll(set0);
                                        o0 = recomposer0.m0();
                                    }
                                    else {
                                        o0 = null;
                                    }
                                }
                                if(o0 != null) {
                                    o0.resumeWith(S0.a);
                                }
                            }

                            @Override  // A3.o
                            public Object invoke(Object object0, Object object1) {
                                this.a(((Set)object0), ((Snapshot)object1));
                                return S0.a;
                            }
                        };
                        ObserverHandle observerHandle0 = Snapshot.e.h(recomposer$recompositionRunner$2$unregisterApplyObserver$10);
                        Recomposer.w.c(this.n.v);
                        try {
                            synchronized(this.n.d) {
                                List list0 = this.n.g;
                                int v1 = list0.size();
                                for(int v2 = 0; v2 < v1; ++v2) {
                                    ((ControlledComposition)list0.get(v2)).j();
                                }
                            }
                            androidx.compose.runtime.Recomposer.recompositionRunner.2.2 recomposer$recompositionRunner$2$20 = new o(this.p, null) {
                                int k;
                                private Object l;
                                final p m;
                                final MonotonicFrameClock n;

                                {
                                    this.m = p0;
                                    this.n = monotonicFrameClock0;
                                    super(2, d0);
                                }

                                @Override  // kotlin.coroutines.jvm.internal.a
                                @l
                                public final d create(@m Object object0, @l d d0) {
                                    d d1 = new androidx.compose.runtime.Recomposer.recompositionRunner.2.2(this.m, this.n, d0);
                                    d1.l = object0;
                                    return d1;
                                }

                                @Override  // A3.o
                                public Object invoke(Object object0, Object object1) {
                                    return this.invoke(((O)object0), ((d)object1));
                                }

                                @m
                                public final Object invoke(@l O o0, @m d d0) {
                                    return ((androidx.compose.runtime.Recomposer.recompositionRunner.2.2)this.create(o0, d0)).invokeSuspend(S0.a);
                                }

                                @Override  // kotlin.coroutines.jvm.internal.a
                                @m
                                public final Object invokeSuspend(@l Object object0) {
                                    Object object1 = b.l();
                                    switch(this.k) {
                                        case 0: {
                                            f0.n(object0);
                                            this.k = 1;
                                            return this.m.invoke(((O)this.l), this.n, this) == object1 ? object1 : S0.a;
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
                            this.m = i00;
                            this.k = observerHandle0;
                            this.l = 1;
                            if(P.g(recomposer$recompositionRunner$2$20, this) == object1) {
                                return object1;
                            }
                        }
                        catch(Throwable throwable0) {
                            observerHandle1 = observerHandle0;
                            throwable1 = throwable0;
                            goto label_40;
                        }
                        observerHandle1 = observerHandle0;
                        break;
                    }
                    case 1: {
                        observerHandle1 = (ObserverHandle)this.k;
                        i00 = (I0)this.m;
                        try {
                            f0.n(object0);
                            break;
                        }
                        catch(Throwable throwable1) {
                        }
                    label_40:
                        observerHandle1.dispose();
                        Object object3 = this.n.d;
                        Recomposer recomposer0 = this.n;
                        synchronized(object3) {
                            if(recomposer0.e == i00) {
                                recomposer0.e = null;
                            }
                            recomposer0.m0();
                        }
                        Recomposer.w.i(this.n.v);
                        throw throwable1;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                observerHandle1.dispose();
                Object object4 = this.n.d;
                Recomposer recomposer1 = this.n;
                synchronized(object4) {
                    if(recomposer1.e == i00) {
                        recomposer1.e = null;
                    }
                    recomposer1.m0();
                }
                Recomposer.w.i(this.n.v);
                return S0.a;
            }
        };
        Object object0 = kotlinx.coroutines.i.h(this.c, recomposer$recompositionRunner$20, d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    private final void G0() {
        Set set0 = this.h;
        if(!set0.isEmpty()) {
            List list0 = this.g;
            int v = list0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                ((ControlledComposition)list0.get(v1)).y(set0);
                if(((State)this.s.getValue()).compareTo(State.b) <= 0) {
                    break;
                }
            }
            this.h = new LinkedHashSet();
            if(this.m0() != null) {
                throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
            }
        }
    }

    private final void H0(Function1 function10) {
        Set set0 = this.h;
        if(!set0.isEmpty()) {
            List list0 = this.g;
            int v1 = list0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                ((ControlledComposition)list0.get(v2)).y(set0);
            }
            this.h = new LinkedHashSet();
        }
        List list1 = this.i;
        int v3 = list1.size();
        for(int v = 0; v < v3; ++v) {
            function10.invoke(list1.get(v));
        }
        this.i.clear();
        if(this.m0() != null) {
            throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
        }
    }

    private final void I0(I0 i00) {
        Throwable throwable0;
        synchronized(this.d) {
            throwable0 = this.f;
            if(throwable0 == null) {
                if(((State)this.s.getValue()).compareTo(State.b) <= 0) {
                    throw new IllegalStateException("Recomposer shut down");
                }
                if(this.e != null) {
                    throw new IllegalStateException("Recomposer already running");
                }
                this.e = i00;
                this.m0();
                return;
            }
        }
        throw throwable0;
    }

    private final RecomposerErrorState J0() {
        synchronized(this.d) {
            RecomposerErrorState recomposer$RecomposerErrorState0 = this.r;
            if(recomposer$RecomposerErrorState0 != null) {
                this.r = null;
                this.m0();
            }
            return recomposer$RecomposerErrorState0;
        }
    }

    private final void K0() {
        Object object0 = this.d;
        __monitor_enter(object0);
        try {
            List list0 = this.n;
            if(list0 != null) {
                while(true) {
                    if(list0.isEmpty()) {
                        goto label_15;
                    }
                    ControlledComposition controlledComposition0 = (ControlledComposition)u.O0(list0);
                    if(controlledComposition0 instanceof CompositionImpl) {
                        controlledComposition0.j();
                        controlledComposition0.b(((CompositionImpl)controlledComposition0).r());
                        if(this.r != null) {
                            goto label_15;
                        }
                    }
                }
            }
            goto label_17;
        }
        catch(Throwable throwable0) {
        }
        __monitor_exit(object0);
        throw throwable0;
    label_15:
        __monitor_exit(object0);
        return;
    label_17:
        __monitor_exit(object0);
    }

    private final Object L0(MonotonicFrameClock monotonicFrameClock0, ProduceFrameSignal produceFrameSignal0, d d0) {
        Recomposer recomposer1;
        MonotonicFrameClock monotonicFrameClock1;
        ProduceFrameSignal produceFrameSignal1;
        List list3;
        List list2;
        Recomposer recomposer0;
        List list1;
        List list0;
        androidx.compose.runtime.Recomposer.runFrameLoop.1 recomposer$runFrameLoop$10;
        if(d0 instanceof androidx.compose.runtime.Recomposer.runFrameLoop.1) {
            recomposer$runFrameLoop$10 = (androidx.compose.runtime.Recomposer.runFrameLoop.1)d0;
            int v = recomposer$runFrameLoop$10.r;
            if((v & 0x80000000) == 0) {
                recomposer$runFrameLoop$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                    Object k;
                    Object l;
                    Object m;
                    Object n;
                    Object o;
                    Object p;
                    int r;

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        this.p = object0;
                        this.r |= 0x80000000;
                        return d0.L0(null, null, this);
                    }
                };
            }
            else {
                recomposer$runFrameLoop$10.r = v ^ 0x80000000;
            }
        }
        else {
            recomposer$runFrameLoop$10 = new kotlin.coroutines.jvm.internal.d(/*ERROR_MISSING_ARG_1/*) {
                Object k;
                Object l;
                Object m;
                Object n;
                Object o;
                Object p;
                int r;

                @Override  // kotlin.coroutines.jvm.internal.a
                @m
                public final Object invokeSuspend(@l Object object0) {
                    this.p = object0;
                    this.r |= 0x80000000;
                    return d0.L0(null, null, this);
                }
            };
        }
        Object object0 = recomposer$runFrameLoop$10.p;
        Object object1 = b.l();
        switch(recomposer$runFrameLoop$10.r) {
            case 0: {
                f0.n(object0);
                list0 = new ArrayList();
                list1 = new ArrayList();
                recomposer0 = this;
                goto label_36;
            }
            case 1: {
                list2 = (List)recomposer$runFrameLoop$10.o;
                list3 = (List)recomposer$runFrameLoop$10.n;
                produceFrameSignal1 = (ProduceFrameSignal)recomposer$runFrameLoop$10.m;
                monotonicFrameClock1 = (MonotonicFrameClock)recomposer$runFrameLoop$10.l;
                recomposer1 = (Recomposer)recomposer$runFrameLoop$10.k;
                f0.n(object0);
                goto label_49;
            }
            case 2: {
                list2 = (List)recomposer$runFrameLoop$10.o;
                list3 = (List)recomposer$runFrameLoop$10.n;
                produceFrameSignal1 = (ProduceFrameSignal)recomposer$runFrameLoop$10.m;
                monotonicFrameClock1 = (MonotonicFrameClock)recomposer$runFrameLoop$10.l;
                recomposer1 = (Recomposer)recomposer$runFrameLoop$10.k;
                f0.n(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        do {
            list0 = list3;
            produceFrameSignal0 = produceFrameSignal1;
            list1 = list2;
            monotonicFrameClock0 = monotonicFrameClock1;
            recomposer0 = recomposer1;
        label_36:
            recomposer$runFrameLoop$10.k = recomposer0;
            recomposer$runFrameLoop$10.l = monotonicFrameClock0;
            recomposer$runFrameLoop$10.m = produceFrameSignal0;
            recomposer$runFrameLoop$10.n = list0;
            recomposer$runFrameLoop$10.o = list1;
            recomposer$runFrameLoop$10.r = 1;
            if(produceFrameSignal0.c(recomposer0.d, recomposer$runFrameLoop$10) == object1) {
                return object1;
            }
            recomposer1 = recomposer0;
            monotonicFrameClock1 = monotonicFrameClock0;
            list2 = list1;
            produceFrameSignal1 = produceFrameSignal0;
            list3 = list0;
        label_49:
            androidx.compose.runtime.Recomposer.runFrameLoop.2 recomposer$runFrameLoop$20 = new Function1(list3, list2, produceFrameSignal1) {
                final Recomposer e;
                final List f;
                final List g;
                final ProduceFrameSignal h;

                {
                    this.e = recomposer0;
                    this.f = list0;
                    this.g = list1;
                    this.h = produceFrameSignal0;
                    super(1);
                }

                @m
                public final kotlinx.coroutines.o a(long v) {
                    kotlinx.coroutines.o o0;
                    if(this.e.c.t()) {
                        Trace trace0 = Trace.a;
                        Object object0 = trace0.a("Recomposer:animation");
                        try {
                            this.e.c.u(v);
                            Snapshot.e.l();
                        }
                        catch(Throwable throwable0) {
                            Trace.a.b(object0);
                            throw throwable0;
                        }
                        trace0.b(object0);
                    }
                    Recomposer recomposer0 = this.e;
                    List list0 = this.f;
                    List list1 = this.g;
                    ProduceFrameSignal produceFrameSignal0 = this.h;
                    Object object1 = Trace.a.a("Recomposer:recompose");
                    try {
                        synchronized(recomposer0.d) {
                            recomposer0.G0();
                            List list2 = recomposer0.j;
                            int v3 = list2.size();
                            for(int v5 = 0; v5 < v3; ++v5) {
                                list1.add(((ControlledComposition)list2.get(v5)));
                            }
                            recomposer0.j.clear();
                            List list3 = recomposer0.i;
                            int v6 = list3.size();
                            for(int v7 = 0; v7 < v6; ++v7) {
                                list0.add(((ControlledComposition)list3.get(v7)));
                            }
                            recomposer0.i.clear();
                            produceFrameSignal0.e();
                        }
                        IdentityArraySet identityArraySet0 = new IdentityArraySet();
                        try {
                            int v9 = list0.size();
                            for(int v10 = 0; v10 < v9; ++v10) {
                                ControlledComposition controlledComposition0 = recomposer0.B0(((ControlledComposition)list0.get(v10)), identityArraySet0);
                                if(controlledComposition0 != null) {
                                    list1.add(controlledComposition0);
                                }
                            }
                        }
                        finally {
                            list0.clear();
                        }
                        if(!list1.isEmpty()) {
                            recomposer0.b = recomposer0.o0() + 1L;
                        }
                        try {
                            int v11 = list1.size();
                            for(int v4 = 0; v4 < v11; ++v4) {
                                ((ControlledComposition)list1.get(v4)).A();
                            }
                        }
                        catch(Throwable throwable1) {
                            list1.clear();
                            throw throwable1;
                        }
                        list1.clear();
                        synchronized(recomposer0.d) {
                            o0 = recomposer0.m0();
                        }
                        return o0;
                    }
                    finally {
                        Trace.a.b(object1);
                    }
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    return this.a(((Number)object0).longValue());
                }
            };
            recomposer$runFrameLoop$10.k = recomposer1;
            recomposer$runFrameLoop$10.l = monotonicFrameClock1;
            recomposer$runFrameLoop$10.m = produceFrameSignal1;
            recomposer$runFrameLoop$10.n = list3;
            recomposer$runFrameLoop$10.o = list2;
            recomposer$runFrameLoop$10.r = 2;
        }
        while(monotonicFrameClock1.s(recomposer$runFrameLoop$20, recomposer$runFrameLoop$10) != object1);
        return object1;
    }

    @m
    public final Object M0(@l d d0) {
        Object object0 = this.F0(new p(null) {
            Object k;
            Object l;
            Object m;
            Object n;
            Object o;
            int p;
            Object q;
            final Recomposer r;

            {
                this.r = recomposer0;
                super(3, d0);
            }

            @m
            public final Object g(@l O o0, @l MonotonicFrameClock monotonicFrameClock0, @m d d0) {
                androidx.compose.runtime.Recomposer.runRecomposeAndApplyChanges.2 recomposer$runRecomposeAndApplyChanges$20 = new androidx.compose.runtime.Recomposer.runRecomposeAndApplyChanges.2(this.r, d0);
                recomposer$runRecomposeAndApplyChanges$20.q = monotonicFrameClock0;
                return recomposer$runRecomposeAndApplyChanges$20.invokeSuspend(S0.a);
            }

            private static final void h(List list0, List list1, List list2, Set set0, Set set1) {
                list0.clear();
                list1.clear();
                list2.clear();
                set0.clear();
                set1.clear();
            }

            private static final void i(List list0, Recomposer recomposer0) {
                list0.clear();
                synchronized(recomposer0.d) {
                    List list1 = recomposer0.k;
                    int v1 = list1.size();
                    for(int v2 = 0; v2 < v1; ++v2) {
                        list0.add(((MovableContentStateReference)list1.get(v2)));
                    }
                    recomposer0.k.clear();
                }
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.g(((O)object0), ((MonotonicFrameClock)object1), ((d)object2));
            }

            // This method was un-flattened
            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                List list8;
                List list7;
                List list6;
                Set set5;
                Set set4;
                Set set1;
                Set set0;
                List list2;
                List list1;
                List list0;
                MonotonicFrameClock monotonicFrameClock0;
                Object object1 = b.l();
                switch(this.p) {
                    case 0: {
                        f0.n(object0);
                        monotonicFrameClock0 = (MonotonicFrameClock)this.q;
                        list0 = new ArrayList();
                        list1 = new ArrayList();
                        list2 = new ArrayList();
                        set0 = new LinkedHashSet();
                        set1 = new LinkedHashSet();
                        goto label_39;
                    }
                    case 1: {
                        Set set2 = (Set)this.o;
                        Set set3 = (Set)this.n;
                        List list3 = (List)this.m;
                        List list4 = (List)this.l;
                        List list5 = (List)this.k;
                        MonotonicFrameClock monotonicFrameClock1 = (MonotonicFrameClock)this.q;
                        f0.n(object0);
                        set4 = set2;
                        set5 = set3;
                        list6 = list3;
                        list7 = list4;
                        list8 = list5;
                        monotonicFrameClock0 = monotonicFrameClock1;
                        goto label_54;
                    }
                    case 2: {
                        Set set6 = (Set)this.o;
                        Set set7 = (Set)this.n;
                        List list9 = (List)this.m;
                        List list10 = (List)this.l;
                        List list11 = (List)this.k;
                        MonotonicFrameClock monotonicFrameClock2 = (MonotonicFrameClock)this.q;
                        f0.n(object0);
                        set1 = set6;
                        monotonicFrameClock0 = monotonicFrameClock2;
                        set0 = set7;
                        list0 = list11;
                        list2 = list9;
                        list1 = list10;
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            alab1:
                while(true) {
                    this.r.n0();
                    while(true) {
                    label_39:
                        if(!this.r.u0()) {
                            break alab1;
                        }
                        this.q = monotonicFrameClock0;
                        this.k = list0;
                        this.l = list1;
                        this.m = list2;
                        this.n = set0;
                        this.o = set1;
                        this.p = 1;
                        if(this.r.i0(this) == object1) {
                            return object1;
                        }
                        list8 = list0;
                        list7 = list1;
                        list6 = list2;
                        set5 = set0;
                        set4 = set1;
                    label_54:
                        Object object2 = this.r.d;
                        Recomposer recomposer0 = this.r;
                        synchronized(object2) {
                            if(!recomposer0.r0()) {
                                recomposer0.G0();
                                if(recomposer0.r0()) {
                                    goto label_70;
                                }
                                set1 = set4;
                                list0 = list8;
                                list1 = list7;
                                list2 = list6;
                                set0 = set5;
                                continue;
                            }
                        }
                    label_70:
                        androidx.compose.runtime.Recomposer.runRecomposeAndApplyChanges.2.2 recomposer$runRecomposeAndApplyChanges$2$20 = new Function1(list8, list7, set5, list6, set4) {
                            final Recomposer e;
                            final List f;
                            final List g;
                            final Set h;
                            final List i;
                            final Set j;

                            {
                                this.e = recomposer0;
                                this.f = list0;
                                this.g = list1;
                                this.h = set0;
                                this.i = list2;
                                this.j = set1;
                                super(1);
                            }

                            public final void a(long v) {
                                int v8;
                                int v6;
                                if(this.e.c.t()) {
                                    Trace trace0 = Trace.a;
                                    Object object0 = trace0.a("Recomposer:animation");
                                    try {
                                        this.e.c.u(v);
                                        Snapshot.e.l();
                                    }
                                    catch(Throwable throwable0) {
                                        Trace.a.b(object0);
                                        throw throwable0;
                                    }
                                    trace0.b(object0);
                                }
                                Recomposer recomposer0 = this.e;
                                List list0 = this.f;
                                List list1 = this.g;
                                Set set0 = this.h;
                                List list2 = this.i;
                                Set set1 = this.j;
                                Object object1 = Trace.a.a("Recomposer:recompose");
                                int v1 = FIN.finallyOpen$NT();
                                synchronized(recomposer0.d) {
                                    recomposer0.G0();
                                    List list3 = recomposer0.i;
                                    int v3 = list3.size();
                                    for(int v4 = 0; v4 < v3; ++v4) {
                                        list0.add(((ControlledComposition)list3.get(v4)));
                                    }
                                    recomposer0.i.clear();
                                }
                                IdentityArraySet identityArraySet0 = new IdentityArraySet();
                                IdentityArraySet identityArraySet1 = new IdentityArraySet();
                            alab1:
                                while(true) {
                                    if(list0.isEmpty() && list1.isEmpty()) {
                                        if(!list2.isEmpty()) {
                                            recomposer0.b = recomposer0.o0() + 1L;
                                            try {
                                                u.q0(set1, list2);
                                                int v5 = list2.size();
                                                v6 = 0;
                                            }
                                            catch(Exception exception0) {
                                                goto label_46;
                                            }
                                            catch(Throwable throwable1) {
                                                goto label_51;
                                            }
                                            while(v6 < v5) {
                                                try {
                                                    try {
                                                        ((ControlledComposition)list2.get(v6)).A();
                                                        ++v6;
                                                        continue;
                                                    }
                                                    catch(Exception exception0) {
                                                    }
                                                label_46:
                                                    Recomposer.D0(recomposer0, exception0, null, false, 6, null);
                                                    androidx.compose.runtime.Recomposer.runRecomposeAndApplyChanges.2.h(list0, list1, list2, set0, set1);
                                                }
                                                catch(Throwable throwable1) {
                                                    goto label_51;
                                                }
                                                list2.clear();
                                                goto label_149;
                                            label_51:
                                                list2.clear();
                                                FIN.finallyExec$NT(v1);
                                                throw throwable1;
                                            }
                                            list2.clear();
                                        }
                                        if(!set0.isEmpty()) {
                                            try {
                                                try {
                                                    u.q0(set1, set0);
                                                    Iterator iterator0 = set0.iterator();
                                                    while(true) {
                                                        if(!iterator0.hasNext()) {
                                                            goto label_71;
                                                        }
                                                        Object object3 = iterator0.next();
                                                        ((ControlledComposition)object3).s();
                                                    }
                                                }
                                                catch(Exception exception1) {
                                                }
                                                Recomposer.D0(recomposer0, exception1, null, false, 6, null);
                                                androidx.compose.runtime.Recomposer.runRecomposeAndApplyChanges.2.h(list0, list1, list2, set0, set1);
                                            }
                                            catch(Throwable throwable2) {
                                                goto label_68;
                                            }
                                            set0.clear();
                                            goto label_149;
                                        label_68:
                                            set0.clear();
                                            FIN.finallyExec$NT(v1);
                                            throw throwable2;
                                        label_71:
                                            set0.clear();
                                        }
                                        if(!set1.isEmpty()) {
                                            try {
                                                try {
                                                    Iterator iterator1 = set1.iterator();
                                                    while(true) {
                                                        if(!iterator1.hasNext()) {
                                                            goto label_87;
                                                        }
                                                        Object object4 = iterator1.next();
                                                        ((ControlledComposition)object4).q();
                                                    }
                                                }
                                                catch(Exception exception2) {
                                                }
                                                Recomposer.D0(recomposer0, exception2, null, false, 6, null);
                                                androidx.compose.runtime.Recomposer.runRecomposeAndApplyChanges.2.h(list0, list1, list2, set0, set1);
                                            }
                                            catch(Throwable throwable3) {
                                                goto label_84;
                                            }
                                            set1.clear();
                                            goto label_149;
                                        label_84:
                                            set1.clear();
                                            FIN.finallyExec$NT(v1);
                                            throw throwable3;
                                        label_87:
                                            set1.clear();
                                        }
                                        Object object5 = recomposer0.d;
                                        __monitor_enter(object5);
                                        try {
                                            recomposer0.m0();
                                        }
                                        catch(Throwable throwable4) {
                                            __monitor_exit(object5);
                                            FIN.finallyExec$NT(v1);
                                            throw throwable4;
                                        }
                                        __monitor_exit(object5);
                                        Snapshot.e.d();
                                        FIN.finallyCodeBegin$NT(v1);
                                        Trace.a.b(object1);
                                        FIN.finallyCodeEnd$NT(v1);
                                        return;
                                    }
                                    try {
                                        int v7 = list0.size();
                                        v8 = 0;
                                    }
                                    catch(Exception exception3) {
                                        goto label_113;
                                    }
                                    catch(Throwable throwable5) {
                                        goto label_118;
                                    }
                                    while(v8 < v7) {
                                        try {
                                            try {
                                                ControlledComposition controlledComposition0 = (ControlledComposition)list0.get(v8);
                                                identityArraySet1.add(controlledComposition0);
                                                ControlledComposition controlledComposition1 = recomposer0.B0(controlledComposition0, identityArraySet0);
                                                if(controlledComposition1 != null) {
                                                    list2.add(controlledComposition1);
                                                }
                                                ++v8;
                                                continue;
                                            }
                                            catch(Exception exception3) {
                                            }
                                        label_113:
                                            Recomposer.D0(recomposer0, exception3, null, true, 2, null);
                                            androidx.compose.runtime.Recomposer.runRecomposeAndApplyChanges.2.h(list0, list1, list2, set0, set1);
                                        }
                                        catch(Throwable throwable5) {
                                            goto label_118;
                                        }
                                        list0.clear();
                                        goto label_149;
                                    label_118:
                                        list0.clear();
                                        FIN.finallyExec$NT(v1);
                                        throw throwable5;
                                    }
                                    list0.clear();
                                    if(identityArraySet0.j()) {
                                        Object object6 = recomposer0.d;
                                        __monitor_enter(object6);
                                        try {
                                            List list4 = recomposer0.g;
                                            int v9 = list4.size();
                                            int v10 = 0;
                                            while(true) {
                                                if(v10 >= v9) {
                                                    goto label_138;
                                                }
                                                ControlledComposition controlledComposition2 = (ControlledComposition)list4.get(v10);
                                                if(!identityArraySet1.contains(controlledComposition2) && controlledComposition2.o(identityArraySet0)) {
                                                    list0.add(controlledComposition2);
                                                }
                                                ++v10;
                                            }
                                        }
                                        catch(Throwable throwable6) {
                                        }
                                        __monitor_exit(object6);
                                        FIN.finallyExec$NT(v1);
                                        throw throwable6;
                                    label_138:
                                        __monitor_exit(object6);
                                    }
                                    if(!list0.isEmpty()) {
                                        continue;
                                    }
                                    try {
                                        androidx.compose.runtime.Recomposer.runRecomposeAndApplyChanges.2.i(list1, recomposer0);
                                        while(true) {
                                            if(list1.isEmpty()) {
                                                continue alab1;
                                            }
                                            u.q0(set0, recomposer0.A0(list1, identityArraySet0));
                                            androidx.compose.runtime.Recomposer.runRecomposeAndApplyChanges.2.i(list1, recomposer0);
                                        }
                                    }
                                    catch(Exception exception4) {
                                        Recomposer.D0(recomposer0, exception4, null, true, 2, null);
                                        androidx.compose.runtime.Recomposer.runRecomposeAndApplyChanges.2.h(list0, list1, list2, set0, set1);
                                        if(true) {
                                            goto label_149;
                                        }
                                        continue;
                                    }
                                label_149:
                                    FIN.finallyExec$NT(v1);
                                    return;
                                }
                            }

                            @Override  // kotlin.jvm.functions.Function1
                            public Object invoke(Object object0) {
                                this.a(((Number)object0).longValue());
                                return S0.a;
                            }
                        };
                        this.q = monotonicFrameClock0;
                        this.k = list8;
                        this.l = list7;
                        this.m = list6;
                        this.n = set5;
                        set1 = set4;
                        this.o = set1;
                        this.p = 2;
                        if(monotonicFrameClock0.s(recomposer$runRecomposeAndApplyChanges$2$20, this) == object1) {
                            return object1;
                        }
                        list0 = list8;
                        list1 = list7;
                        list2 = list6;
                        set0 = set5;
                        break;
                    }
                }
                return S0.a;
            }
        }, d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    @ExperimentalComposeApi
    @m
    public final Object N0(@l g g0, @l d d0) {
        Object object0 = this.F0(new p(this, null) {
            Object k;
            int l;
            private Object m;
            Object n;
            final g o;
            final Recomposer p;

            {
                this.o = g0;
                this.p = recomposer0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l MonotonicFrameClock monotonicFrameClock0, @m d d0) {
                androidx.compose.runtime.Recomposer.runRecomposeConcurrentlyAndApplyChanges.2 recomposer$runRecomposeConcurrentlyAndApplyChanges$20 = new androidx.compose.runtime.Recomposer.runRecomposeConcurrentlyAndApplyChanges.2(this.o, this.p, d0);
                recomposer$runRecomposeConcurrentlyAndApplyChanges$20.m = o0;
                recomposer$runRecomposeConcurrentlyAndApplyChanges$20.n = monotonicFrameClock0;
                return recomposer$runRecomposeConcurrentlyAndApplyChanges$20.invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((MonotonicFrameClock)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                d d0;
                int v;
                ProduceFrameSignal produceFrameSignal1;
                O o2;
                I0 i00;
                Object object1 = b.l();
                switch(this.l) {
                    case 0: {
                        f0.n(object0);
                        O o0 = (O)this.m;
                        MonotonicFrameClock monotonicFrameClock0 = (MonotonicFrameClock)this.n;
                        kotlinx.coroutines.I0.b i0$b0 = I0.B8;
                        boolean z = this.o.get(i0$b0) == null;
                        g g0 = this.o;
                        if(!z) {
                            throw new IllegalArgumentException(("recomposeCoroutineContext may not contain a Job; found " + g0.get(i0$b0)).toString());
                        }
                        O o1 = P.a(o0.getCoroutineContext().plus(this.o).plus(M0.a(M0.B(o0.getCoroutineContext()))));
                        ProduceFrameSignal produceFrameSignal0 = new ProduceFrameSignal();
                        i00 = k.f(o0, null, null, new o(monotonicFrameClock0, produceFrameSignal0, null) {
                            int k;
                            final Recomposer l;
                            final MonotonicFrameClock m;
                            final ProduceFrameSignal n;

                            {
                                this.l = recomposer0;
                                this.m = monotonicFrameClock0;
                                this.n = produceFrameSignal0;
                                super(2, d0);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @l
                            public final d create(@m Object object0, @l d d0) {
                                return new androidx.compose.runtime.Recomposer.runRecomposeConcurrentlyAndApplyChanges.2.frameLoop.1(this.l, this.m, this.n, d0);
                            }

                            @Override  // A3.o
                            public Object invoke(Object object0, Object object1) {
                                return this.invoke(((O)object0), ((d)object1));
                            }

                            @m
                            public final Object invoke(@l O o0, @m d d0) {
                                return ((androidx.compose.runtime.Recomposer.runRecomposeConcurrentlyAndApplyChanges.2.frameLoop.1)this.create(o0, d0)).invokeSuspend(S0.a);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @m
                            public final Object invokeSuspend(@l Object object0) {
                                Object object1 = b.l();
                                switch(this.k) {
                                    case 0: {
                                        f0.n(object0);
                                        this.k = 1;
                                        return this.l.L0(this.m, this.n, this) == object1 ? object1 : S0.a;
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
                        }, 3, null);
                        o2 = o1;
                        produceFrameSignal1 = produceFrameSignal0;
                        goto label_54;
                    }
                    case 1: {
                        i00 = (I0)this.k;
                        produceFrameSignal1 = (ProduceFrameSignal)this.n;
                        o2 = (O)this.m;
                        f0.n(object0);
                        while(true) {
                            Object object2 = this.p.d;
                            Recomposer recomposer0 = this.p;
                            synchronized(object2) {
                                v = FIN.finallyOpen$NT();
                                Set set0 = recomposer0.h;
                                if(!set0.isEmpty()) {
                                    List list0 = recomposer0.g;
                                    int v1 = list0.size();
                                    for(int v2 = 0; v2 < v1; ++v2) {
                                        ((ControlledComposition)list0.get(v2)).y(set0);
                                    }
                                    recomposer0.h = new LinkedHashSet();
                                }
                                List list1 = recomposer0.i;
                                int v3 = list1.size();
                                for(int v4 = 0; v4 < v3; ++v4) {
                                    ControlledComposition controlledComposition0 = (ControlledComposition)list1.get(v4);
                                    ++recomposer0.p;
                                    k.f(o2, CompositionKt.j(controlledComposition0), null, new o(controlledComposition0, null) {
                                        int k;
                                        final Recomposer l;
                                        final ControlledComposition m;

                                        {
                                            this.l = recomposer0;
                                            this.m = controlledComposition0;
                                            super(2, d0);
                                        }

                                        @Override  // kotlin.coroutines.jvm.internal.a
                                        @l
                                        public final d create(@m Object object0, @l d d0) {
                                            return new androidx.compose.runtime.Recomposer.runRecomposeConcurrentlyAndApplyChanges.2.2.1.1(this.l, this.m, d0);
                                        }

                                        @Override  // A3.o
                                        public Object invoke(Object object0, Object object1) {
                                            return this.invoke(((O)object0), ((d)object1));
                                        }

                                        @m
                                        public final Object invoke(@l O o0, @m d d0) {
                                            return ((androidx.compose.runtime.Recomposer.runRecomposeConcurrentlyAndApplyChanges.2.2.1.1)this.create(o0, d0)).invokeSuspend(S0.a);
                                        }

                                        @Override  // kotlin.coroutines.jvm.internal.a
                                        @m
                                        public final Object invokeSuspend(@l Object object0) {
                                            kotlinx.coroutines.o o0;
                                            if(this.k != 0) {
                                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                            }
                                            f0.n(object0);
                                            ControlledComposition controlledComposition0 = this.l.B0(this.m, null);
                                            Object object1 = this.l.d;
                                            Recomposer recomposer0 = this.l;
                                            synchronized(object1) {
                                                if(controlledComposition0 != null) {
                                                    recomposer0.j.add(controlledComposition0);
                                                }
                                                --recomposer0.p;
                                                o0 = recomposer0.m0();
                                            }
                                            if(o0 != null) {
                                                o0.resumeWith(S0.a);
                                            }
                                            return S0.a;
                                        }
                                    }, 2, null);
                                }
                                recomposer0.i.clear();
                                if(recomposer0.m0() != null) {
                                    goto label_68;
                                }
                                d0 = recomposer0.q0() ? produceFrameSignal1.d() : null;
                                FIN.finallyCodeBegin$NT(v);
                            }
                            FIN.finallyCodeEnd$NT(v);
                            if(d0 != null) {
                                d0.resumeWith(S0.a);
                            }
                        label_54:
                            if(this.p.u0()) {
                                this.m = o2;
                                this.n = produceFrameSignal1;
                                this.k = i00;
                                this.l = 1;
                                if(this.p.i0(this) != object1) {
                                    continue;
                                }
                                break;
                            }
                            goto label_61;
                        }
                        return object1;
                    label_61:
                        I0 i01 = M0.B(o2.getCoroutineContext());
                        this.m = i00;
                        this.n = null;
                        this.k = null;
                        this.l = 2;
                        if(M0.l(i01, this) == object1) {
                            return object1;
                        label_68:
                            FIN.finallyExec$NT(v);
                            throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                        }
                        goto label_72;
                    }
                    case 2: {
                        break;
                    }
                    case 3: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                i00 = (I0)this.m;
                f0.n(object0);
            label_72:
                this.m = null;
                this.l = 3;
                return M0.l(i00, this) == object1 ? object1 : S0.a;
            }
        }, d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    private final Function1 O0(ControlledComposition controlledComposition0, IdentityArraySet identityArraySet0) {
        return new Function1(identityArraySet0) {
            final ControlledComposition e;
            final IdentityArraySet f;

            {
                this.e = controlledComposition0;
                this.f = identityArraySet0;
                super(1);
            }

            public final void a(@l Object object0) {
                L.p(object0, "value");
                this.e.C(object0);
                IdentityArraySet identityArraySet0 = this.f;
                if(identityArraySet0 != null) {
                    identityArraySet0.add(object0);
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(object0);
                return S0.a;
            }
        };
    }

    public static final Object T(Recomposer recomposer0, p p0, d d0) {
        return recomposer0.F0(p0, d0);
    }

    @Override  // androidx.compose.runtime.CompositionContext
    @ComposableInferredTarget(scheme = "[0[0]]")
    public void a(@l ControlledComposition controlledComposition0, @l o o0) {
        androidx.compose.runtime.snapshots.Snapshot.Companion snapshot$Companion0;
        L.p(controlledComposition0, "composition");
        L.p(o0, "content");
        boolean z = controlledComposition0.B();
        try {
            snapshot$Companion0 = Snapshot.e;
            MutableSnapshot mutableSnapshot0 = snapshot$Companion0.m(this.E0(controlledComposition0), this.O0(controlledComposition0, null));
            try {
                Snapshot snapshot0 = mutableSnapshot0.p();
                try {
                    controlledComposition0.k(o0);
                }
                catch(Throwable throwable0) {
                    mutableSnapshot0.w(snapshot0);
                    throw throwable0;
                }
                mutableSnapshot0.w(snapshot0);
            }
            finally {
                this.f0(mutableSnapshot0);
            }
        }
        catch(Exception exception0) {
            this.C0(exception0, controlledComposition0, true);
            return;
        }
        if(!z) {
            snapshot$Companion0.d();
        }
        synchronized(this.d) {
            if(((State)this.s.getValue()).compareTo(State.b) > 0 && !this.g.contains(controlledComposition0)) {
                this.g.add(controlledComposition0);
            }
        }
        try {
            this.y0(controlledComposition0);
        }
        catch(Exception exception1) {
            this.C0(exception1, controlledComposition0, true);
            return;
        }
        try {
            controlledComposition0.A();
            controlledComposition0.s();
        }
        catch(Exception exception2) {
            Recomposer.D0(this, exception2, null, false, 6, null);
            return;
        }
        if(!z) {
            snapshot$Companion0.d();
        }
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public void b(@l MovableContentStateReference movableContentStateReference0) {
        L.p(movableContentStateReference0, "reference");
        synchronized(this.d) {
            RecomposerKt.c(this.l, movableContentStateReference0.c(), movableContentStateReference0);
        }
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public boolean d() {
        return false;
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public int f() {
        return 1000;
    }

    private final void f0(MutableSnapshot mutableSnapshot0) {
        try {
            if(!(mutableSnapshot0.J() instanceof Failure)) {
                return;
            }
        }
        finally {
            mutableSnapshot0.d();
        }
        throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
    }

    @Override  // androidx.compose.runtime.CompositionContext
    @l
    public g g() {
        return this.u;
    }

    @l
    public final RecomposerInfo g0() {
        return this.v;
    }

    @Override  // androidx.compose.runtime.CompositionContext
    @l
    public g h() {
        return kotlin.coroutines.i.a;
    }

    @m
    public final Object h0(@l d d0) {
        Object object0 = kotlinx.coroutines.flow.k.y(kotlinx.coroutines.flow.k.U1(this.p0(), new o() {
            int k;
            Object l;

            {
                super(2, d0);
            }

            @m
            public final Object a(@l State recomposer$State0, @m d d0) {
                return ((androidx.compose.runtime.Recomposer.awaitIdle.2)this.create(recomposer$State0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.compose.runtime.Recomposer.awaitIdle.2(d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((State)object0), ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                return ((State)this.l).compareTo(State.e) <= 0 ? kotlin.coroutines.jvm.internal.b.a(false) : kotlin.coroutines.jvm.internal.b.a(true);
            }
        }), d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public void i(@l MovableContentStateReference movableContentStateReference0) {
        kotlinx.coroutines.o o0;
        L.p(movableContentStateReference0, "reference");
        synchronized(this.d) {
            this.k.add(movableContentStateReference0);
            o0 = this.m0();
        }
        if(o0 != null) {
            o0.resumeWith(S0.a);
        }
    }

    private final Object i0(d d0) {
        S0 s00;
        if(!this.t0()) {
            kotlinx.coroutines.p p0 = new kotlinx.coroutines.p(b.e(d0), 1);
            p0.c0();
            synchronized(this.d) {
                if(this.t0()) {
                    p0.resumeWith(S0.a);
                }
                else {
                    this.o = p0;
                }
                s00 = S0.a;
            }
            Object object1 = p0.x();
            if(object1 == b.l()) {
                h.c(d0);
            }
            return object1 == b.l() ? object1 : s00;
        }
        return S0.a;
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public void j(@l ControlledComposition controlledComposition0) {
        kotlinx.coroutines.o o0;
        L.p(controlledComposition0, "composition");
        synchronized(this.d) {
            if(this.i.contains(controlledComposition0)) {
                o0 = null;
            }
            else {
                this.i.add(controlledComposition0);
                o0 = this.m0();
            }
        }
        if(o0 != null) {
            o0.resumeWith(S0.a);
        }
    }

    public final void j0() {
        synchronized(this.d) {
            if(((State)this.s.getValue()).compareTo(State.e) >= 0) {
                this.s.setValue(State.b);
            }
        }
        kotlinx.coroutines.I0.a.b(this.t, null, 1, null);
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public void k(@l RecomposeScopeImpl recomposeScopeImpl0) {
        kotlinx.coroutines.o o0;
        L.p(recomposeScopeImpl0, "scope");
        synchronized(this.d) {
            this.h.add(recomposeScopeImpl0);
            o0 = this.m0();
        }
        if(o0 != null) {
            o0.resumeWith(S0.a);
        }
    }

    public final void k0() {
        if(this.t.a()) {
            synchronized(this.d) {
                this.q = true;
            }
        }
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public void l(@l MovableContentStateReference movableContentStateReference0, @l MovableContentState movableContentState0) {
        L.p(movableContentStateReference0, "reference");
        L.p(movableContentState0, "data");
        synchronized(this.d) {
            this.m.put(movableContentStateReference0, movableContentState0);
        }
    }

    private final Object l0(ControlledComposition controlledComposition0, IdentityArraySet identityArraySet0, a a0) {
        Object object0;
        Function1 function10 = this.E0(controlledComposition0);
        Function1 function11 = this.O0(controlledComposition0, identityArraySet0);
        MutableSnapshot mutableSnapshot0 = Snapshot.e.m(function10, function11);
        try {
            Snapshot snapshot0 = mutableSnapshot0.p();
            try {
                object0 = a0.invoke();
            }
            catch(Throwable throwable0) {
                mutableSnapshot0.w(snapshot0);
                throw throwable0;
            }
            mutableSnapshot0.w(snapshot0);
            return object0;
        }
        finally {
            this.f0(mutableSnapshot0);
        }
    }

    @Override  // androidx.compose.runtime.CompositionContext
    @m
    public MovableContentState m(@l MovableContentStateReference movableContentStateReference0) {
        L.p(movableContentStateReference0, "reference");
        synchronized(this.d) {
            return (MovableContentState)this.m.remove(movableContentStateReference0);
        }
    }

    private final kotlinx.coroutines.o m0() {
        State recomposer$State0;
        if(((State)this.s.getValue()).compareTo(State.b) <= 0) {
            this.g.clear();
            this.h = new LinkedHashSet();
            this.i.clear();
            this.j.clear();
            this.k.clear();
            this.n = null;
            kotlinx.coroutines.o o0 = this.o;
            if(o0 != null) {
                kotlinx.coroutines.o.a.a(o0, null, 1, null);
            }
            this.o = null;
            this.r = null;
            return null;
        }
        if(this.r != null) {
            recomposer$State0 = State.c;
        }
        else if(this.e == null) {
            this.h = new LinkedHashSet();
            this.i.clear();
            recomposer$State0 = this.c.t() ? State.d : State.c;
        }
        else {
            recomposer$State0 = !this.i.isEmpty() || !this.h.isEmpty() || !this.j.isEmpty() || !this.k.isEmpty() || this.p > 0 || this.c.t() ? State.f : State.e;
        }
        this.s.setValue(recomposer$State0);
        if(recomposer$State0 == State.f) {
            kotlinx.coroutines.o o1 = this.o;
            this.o = null;
            return o1;
        }
        return null;
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public void n(@l Set set0) {
        L.p(set0, "table");
    }

    private final void n0() {
        List list1;
        synchronized(this.d) {
            if(this.l.isEmpty()) {
                list1 = u.H();
            }
            else {
                List list0 = u.d0(this.l.values());
                this.l.clear();
                list1 = new ArrayList(list0.size());
                int v2 = list0.size();
                for(int v3 = 0; v3 < v2; ++v3) {
                    MovableContentStateReference movableContentStateReference0 = (MovableContentStateReference)list0.get(v3);
                    list1.add(r0.a(movableContentStateReference0, this.m.get(movableContentStateReference0)));
                }
                this.m.clear();
            }
        }
        int v4 = list1.size();
        for(int v = 0; v < v4; ++v) {
            V v5 = (V)list1.get(v);
            MovableContentStateReference movableContentStateReference1 = (MovableContentStateReference)v5.a();
            MovableContentState movableContentState0 = (MovableContentState)v5.b();
            if(movableContentState0 != null) {
                movableContentStateReference1.b().l(movableContentState0);
            }
        }
    }

    public final long o0() {
        return this.b;
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public void p(@l ControlledComposition controlledComposition0) {
        L.p(controlledComposition0, "composition");
    }

    @l
    public final U p0() {
        return this.s;
    }

    // 去混淆评级： 低(20)
    private final boolean q0() {
        return !this.j.isEmpty() || this.c.t();
    }

    // 去混淆评级： 低(20)
    private final boolean r0() {
        return !this.i.isEmpty() || this.c.t();
    }

    @Override  // androidx.compose.runtime.CompositionContext
    public void s(@l ControlledComposition controlledComposition0) {
        L.p(controlledComposition0, "composition");
        synchronized(this.d) {
            this.g.remove(controlledComposition0);
            this.i.remove(controlledComposition0);
            this.j.remove(controlledComposition0);
        }
    }

    public final boolean s0() {
        synchronized(this.d) {
            return !this.h.isEmpty() || !this.i.isEmpty() || this.p > 0 || !this.j.isEmpty() || this.c.t();
        }
    }

    private final boolean t0() {
        synchronized(this.d) {
            return !this.h.isEmpty() || !this.i.isEmpty() || this.c.t();
        }
    }

    private final boolean u0() {
        synchronized(this.d) {
        }
        if(this.q) {
            for(Object object0: this.t.u0()) {
                if(((I0)object0).isActive()) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
            return false;
        }
        return true;
    }

    @l
    public final i v0() {
        return this.p0();
    }

    @kotlin.k(message = "Replaced by currentState as a StateFlow", replaceWith = @c0(expression = "currentState", imports = {}))
    public static void w0() {
    }

    @m
    public final Object x0(@l d d0) {
        Object object0 = kotlinx.coroutines.flow.k.u0(this.p0(), new o() {
            int k;
            Object l;

            {
                super(2, d0);
            }

            @m
            public final Object a(@l State recomposer$State0, @m d d0) {
                return ((androidx.compose.runtime.Recomposer.join.2)this.create(recomposer$State0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                d d1 = new androidx.compose.runtime.Recomposer.join.2(d0);
                d1.l = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((State)object0), ((d)object1));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                return ((State)this.l) == State.a ? kotlin.coroutines.jvm.internal.b.a(true) : kotlin.coroutines.jvm.internal.b.a(false);
            }
        }, d0);
        return object0 == b.l() ? object0 : S0.a;
    }

    private final void y0(ControlledComposition controlledComposition0) {
        synchronized(this.d) {
            List list0 = this.k;
            int v1 = list0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                if(L.g(((MovableContentStateReference)list0.get(v2)).b(), controlledComposition0)) {
                    ArrayList arrayList0 = new ArrayList();
                    Recomposer.z0(arrayList0, this, controlledComposition0);
                    while(!arrayList0.isEmpty()) {
                        this.A0(arrayList0, null);
                        Recomposer.z0(arrayList0, this, controlledComposition0);
                    }
                    return;
                }
            }
        }
    }

    private static final void z0(List list0, Recomposer recomposer0, ControlledComposition controlledComposition0) {
        list0.clear();
        synchronized(recomposer0.d) {
            Iterator iterator0 = recomposer0.k.iterator();
            while(iterator0.hasNext()) {
                Object object1 = iterator0.next();
                MovableContentStateReference movableContentStateReference0 = (MovableContentStateReference)object1;
                if(L.g(movableContentStateReference0.b(), controlledComposition0)) {
                    list0.add(movableContentStateReference0);
                    iterator0.remove();
                }
            }
        }
    }
}

