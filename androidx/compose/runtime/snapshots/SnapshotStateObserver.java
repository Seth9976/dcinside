package androidx.compose.runtime.snapshots;

import A3.a;
import A3.o;
import androidx.compose.animation.core.d;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DerivedState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.collection.IdentityArrayIntMap;
import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.collection.IdentityScopeMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.S0;
import kotlin.c0;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.v0;
import kotlin.k;
import kotlin.y;
import y4.l;
import y4.m;

@StabilityInferred(parameters = 0)
@s0({"SMAP\nSnapshotStateObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap\n*L\n1#1,549:1\n181#1,2:554\n183#1,2:567\n181#1,2:598\n183#1,2:611\n181#1,2:613\n183#1,2:626\n181#1,2:628\n183#1,2:641\n1182#2:550\n1161#2,2:551\n1#3:553\n460#4,11:556\n460#4,11:569\n460#4,11:600\n460#4,11:615\n460#4,11:630\n366#4,12:643\n728#4,2:655\n436#5,18:580\n*S KotlinDebug\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver\n*L\n65#1:554,2\n65#1:567,2\n269#1:598,2\n269#1:611,2\n279#1:613,2\n279#1:626,2\n311#1:628,2\n311#1:641,2\n173#1:550\n173#1:551,2\n65#1:556,11\n182#1:569,11\n269#1:600,11\n279#1:615,11\n311#1:630,11\n324#1:643,12\n327#1:655,2\n229#1:580,18\n*E\n"})
public final class SnapshotStateObserver {
    @s0({"SMAP\nSnapshotStateObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap\n+ 2 IdentityArrayIntMap.kt\nandroidx/compose/runtime/collection/IdentityArrayIntMap\n+ 3 IdentityArrayMap.kt\nandroidx/compose/runtime/collection/IdentityArrayMap\n+ 4 IdentityScopeMap.kt\nandroidx/compose/runtime/collection/IdentityScopeMap\n+ 5 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n*L\n1#1,549:1\n132#2,18:550\n159#2,4:568\n159#2,4:579\n118#3,7:572\n125#3,15:583\n89#4,3:598\n89#4,3:604\n93#4:612\n93#4:614\n89#4,3:615\n93#4:623\n105#5,3:601\n105#5,5:607\n109#5:613\n105#5,5:618\n105#5,5:624\n*S KotlinDebug\n*F\n+ 1 SnapshotStateObserver.kt\nandroidx/compose/runtime/snapshots/SnapshotStateObserver$ObservedScopeMap\n*L\n456#1:550,18\n470#1:568,4\n482#1:579,4\n479#1:572,7\n479#1:583,15\n517#1:598,3\n524#1:604,3\n524#1:612\n517#1:614\n532#1:615,3\n532#1:623\n517#1:601,3\n524#1:607,5\n517#1:613\n532#1:618,5\n544#1:624,5\n*E\n"})
    static final class ObservedScopeMap {
        @l
        private final Function1 a;
        @m
        private Object b;
        @m
        private IdentityArrayIntMap c;
        private int d;
        @l
        private final IdentityScopeMap e;
        @l
        private final IdentityArrayMap f;
        @l
        private final IdentityArraySet g;
        @l
        private final Function1 h;
        @l
        private final Function1 i;
        private int j;
        @l
        private final IdentityScopeMap k;
        @l
        private final HashMap l;

        public ObservedScopeMap(@l Function1 function10) {
            L.p(function10, "onChanged");
            super();
            this.a = function10;
            this.d = -1;
            this.e = new IdentityScopeMap();
            this.f = new IdentityArrayMap(0, 1, null);
            this.g = new IdentityArraySet();
            this.h = new Function1() {
                final ObservedScopeMap e;

                {
                    this.e = snapshotStateObserver$ObservedScopeMap0;
                    super(1);
                }

                public final void a(@l State state0) {
                    L.p(state0, "it");
                    int v = this.e.j;
                    this.e.j = v + 1;
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.a(((State)object0));
                    return S0.a;
                }
            };
            this.i = new Function1() {
                final ObservedScopeMap e;

                {
                    this.e = snapshotStateObserver$ObservedScopeMap0;
                    super(1);
                }

                public final void a(@l State state0) {
                    L.p(state0, "it");
                    --this.e.j;
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.a(((State)object0));
                    return S0.a;
                }
            };
            this.k = new IdentityScopeMap();
            this.l = new HashMap();
        }

        public final void k() {
            this.e.d();
            this.f.a();
            this.k.d();
            this.l.clear();
        }

        private final void l(Object object0) {
            IdentityArrayIntMap identityArrayIntMap0 = this.c;
            if(identityArrayIntMap0 != null) {
                int v = identityArrayIntMap0.i();
                int v2 = 0;
                for(int v1 = 0; v1 < v; ++v1) {
                    Object object1 = identityArrayIntMap0.g()[v1];
                    L.n(object1, "null cannot be cast to non-null type kotlin.Any");
                    int v3 = identityArrayIntMap0.k()[v1];
                    boolean z = v3 != this.d;
                    if(z) {
                        this.u(object0, object1);
                    }
                    if(!z) {
                        if(v2 != v1) {
                            identityArrayIntMap0.g()[v2] = object1;
                            identityArrayIntMap0.k()[v2] = v3;
                        }
                        ++v2;
                    }
                }
                int v4 = identityArrayIntMap0.i();
                for(int v5 = v2; v5 < v4; ++v5) {
                    identityArrayIntMap0.g()[v5] = null;
                }
                identityArrayIntMap0.p(v2);
            }
        }

        public final void m(@l Object object0) {
            L.p(object0, "scope");
            IdentityArrayIntMap identityArrayIntMap0 = (IdentityArrayIntMap)this.f.l(object0);
            if(identityArrayIntMap0 == null) {
                return;
            }
            int v = identityArrayIntMap0.i();
            for(int v1 = 0; v1 < v; ++v1) {
                Object object1 = identityArrayIntMap0.g()[v1];
                L.n(object1, "null cannot be cast to non-null type kotlin.Any");
                int v2 = identityArrayIntMap0.k()[v1];
                this.u(object0, object1);
            }
        }

        @l
        public final Function1 n() {
            return this.h;
        }

        @l
        public final Function1 o() {
            return this.i;
        }

        @l
        public final Function1 p() {
            return this.a;
        }

        public final void q() {
            IdentityArraySet identityArraySet0 = this.g;
            Function1 function10 = this.a;
            int v = identityArraySet0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                function10.invoke(identityArraySet0.get(v1));
            }
            this.g.clear();
        }

        public final void r(@l Object object0, @l a a0) {
            L.p(object0, "scope");
            L.p(a0, "block");
            Object object1 = this.b;
            IdentityArrayIntMap identityArrayIntMap0 = this.c;
            int v = this.d;
            this.b = object0;
            this.c = (IdentityArrayIntMap)this.f.f(object0);
            if(this.d == -1) {
                this.d = SnapshotKt.D().g();
            }
            a0.invoke();
            Object object2 = this.b;
            L.m(object2);
            this.l(object2);
            this.b = object1;
            this.c = identityArrayIntMap0;
            this.d = v;
        }

        public final boolean s(@l Set set0) {
            L.p(set0, "changes");
            boolean z = false;
            for(Object object0: set0) {
                if(this.k.e(object0)) {
                    IdentityScopeMap identityScopeMap0 = this.k;
                    int v = identityScopeMap0.f(object0);
                    if(v >= 0) {
                        IdentityArraySet identityArraySet0 = identityScopeMap0.v(v);
                        int v1 = identityArraySet0.size();
                        for(int v2 = 0; v2 < v1; ++v2) {
                            DerivedState derivedState0 = (DerivedState)identityArraySet0.get(v2);
                            L.n(derivedState0, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
                            Object object1 = this.l.get(derivedState0);
                            SnapshotMutationPolicy snapshotMutationPolicy0 = derivedState0.a();
                            if(snapshotMutationPolicy0 == null) {
                                snapshotMutationPolicy0 = SnapshotStateKt.w();
                            }
                            if(!snapshotMutationPolicy0.a(derivedState0.e(), object1)) {
                                IdentityScopeMap identityScopeMap1 = this.e;
                                int v3 = identityScopeMap1.f(derivedState0);
                                if(v3 >= 0) {
                                    IdentityArraySet identityArraySet1 = identityScopeMap1.v(v3);
                                    int v4 = identityArraySet1.size();
                                    int v5 = 0;
                                    while(v5 < v4) {
                                        Object object2 = identityArraySet1.get(v5);
                                        this.g.add(object2);
                                        ++v5;
                                        z = true;
                                    }
                                }
                            }
                        }
                    }
                }
                IdentityScopeMap identityScopeMap2 = this.e;
                int v6 = identityScopeMap2.f(object0);
                if(v6 >= 0) {
                    IdentityArraySet identityArraySet2 = identityScopeMap2.v(v6);
                    int v7 = identityArraySet2.size();
                    int v8 = 0;
                    while(v8 < v7) {
                        Object object3 = identityArraySet2.get(v8);
                        this.g.add(object3);
                        ++v8;
                        z = true;
                    }
                }
            }
            return z;
        }

        public final void t(@l Object object0) {
            L.p(object0, "value");
            if(this.j > 0) {
                return;
            }
            Object object1 = this.b;
            L.m(object1);
            IdentityArrayIntMap identityArrayIntMap0 = this.c;
            if(identityArrayIntMap0 == null) {
                identityArrayIntMap0 = new IdentityArrayIntMap();
                this.c = identityArrayIntMap0;
                this.f.o(object1, identityArrayIntMap0);
            }
            int v = identityArrayIntMap0.a(object0, this.d);
            if(object0 instanceof DerivedState && v != this.d) {
                Object[] arr_object = ((DerivedState)object0).i();
                for(int v1 = 0; v1 < arr_object.length; ++v1) {
                    Object object2 = arr_object[v1];
                    if(object2 == null) {
                        break;
                    }
                    this.k.c(object2, object0);
                }
                Object object3 = ((DerivedState)object0).e();
                this.l.put(object0, object3);
            }
            if(v == -1) {
                this.e.c(object0, object1);
            }
        }

        private final void u(Object object0, Object object1) {
            this.e.r(object1, object0);
            if(object1 instanceof DerivedState && !this.e.e(object1)) {
                this.k.s(object1);
                this.l.remove(object1);
            }
        }

        public final void v(@l Function1 function10) {
            L.p(function10, "predicate");
            IdentityArrayMap identityArrayMap0 = this.f;
            int v = identityArrayMap0.h();
            int v2 = 0;
            for(int v1 = 0; v1 < v; ++v1) {
                Object object0 = identityArrayMap0.g()[v1];
                L.n(object0, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                IdentityArrayIntMap identityArrayIntMap0 = (IdentityArrayIntMap)identityArrayMap0.i()[v1];
                Boolean boolean0 = (Boolean)function10.invoke(object0);
                if(boolean0.booleanValue()) {
                    int v3 = identityArrayIntMap0.i();
                    for(int v4 = 0; v4 < v3; ++v4) {
                        Object object1 = identityArrayIntMap0.g()[v4];
                        L.n(object1, "null cannot be cast to non-null type kotlin.Any");
                        int v5 = identityArrayIntMap0.k()[v4];
                        this.u(object0, object1);
                    }
                }
                if(!boolean0.booleanValue()) {
                    if(v2 != v1) {
                        identityArrayMap0.g()[v2] = object0;
                        identityArrayMap0.i()[v2] = identityArrayMap0.i()[v1];
                    }
                    ++v2;
                }
            }
            if(identityArrayMap0.h() > v2) {
                int v6 = identityArrayMap0.h();
                for(int v7 = v2; v7 < v6; ++v7) {
                    identityArrayMap0.g()[v7] = null;
                    identityArrayMap0.i()[v7] = null;
                }
                identityArrayMap0.q(v2);
            }
        }
    }

    @l
    private final Function1 a;
    @l
    private final AtomicReference b;
    private boolean c;
    @l
    private final o d;
    @l
    private final Function1 e;
    @l
    private final MutableVector f;
    @m
    private ObserverHandle g;
    private boolean h;
    @m
    private ObservedScopeMap i;
    public static final int j = 8;

    static {
    }

    public SnapshotStateObserver(@l Function1 function10) {
        L.p(function10, "onChangedExecutor");
        super();
        this.a = function10;
        this.b = new AtomicReference(null);
        this.d = new o() {
            final SnapshotStateObserver e;

            {
                this.e = snapshotStateObserver0;
                super(2);
            }

            public final void a(@l Set set0, @l Snapshot snapshot0) {
                L.p(set0, "applied");
                L.p(snapshot0, "<anonymous parameter 1>");
                this.e.j(set0);
                if(this.e.n()) {
                    this.e.u();
                }
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((Set)object0), ((Snapshot)object1));
                return S0.a;
            }
        };
        this.e = new Function1() {
            final SnapshotStateObserver e;

            {
                this.e = snapshotStateObserver0;
                super(1);
            }

            public final void a(@l Object object0) {
                L.p(object0, "state");
                if(!this.e.h) {
                    synchronized(this.e.f) {
                        ObservedScopeMap snapshotStateObserver$ObservedScopeMap0 = this.e.i;
                        L.m(snapshotStateObserver$ObservedScopeMap0);
                        snapshotStateObserver$ObservedScopeMap0.t(object0);
                    }
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(object0);
                return S0.a;
            }
        };
        this.f = new MutableVector(new ObservedScopeMap[16], 0);
    }

    private final void j(Set set0) {
        Collection collection0;
        while(true) {
            Object object0 = this.b.get();
            if(object0 == null) {
                collection0 = set0;
            }
            else if(object0 instanceof Set) {
                collection0 = u.O(new Set[]{((Set)object0), set0});
            }
            else {
                if(!(object0 instanceof List)) {
                    break;
                }
                collection0 = u.D4(((Collection)object0), u.k(set0));
            }
            if(d.a(this.b, object0, collection0)) {
                return;
            }
        }
        this.t();
        throw new y();
    }

    public final void k() {
        synchronized(this.f) {
            MutableVector mutableVector1 = this.f;
            int v1 = mutableVector1.J();
            if(v1 > 0) {
                Object[] arr_object = mutableVector1.F();
                int v2 = 0;
                while(true) {
                    ((ObservedScopeMap)arr_object[v2]).k();
                    ++v2;
                    if(v2 >= v1) {
                        break;
                    }
                }
            }
        }
    }

    public final void l(@l Object object0) {
        L.p(object0, "scope");
        synchronized(this.f) {
            MutableVector mutableVector1 = this.f;
            int v1 = mutableVector1.J();
            if(v1 > 0) {
                Object[] arr_object = mutableVector1.F();
                int v2 = 0;
                while(true) {
                    ((ObservedScopeMap)arr_object[v2]).m(object0);
                    ++v2;
                    if(v2 >= v1) {
                        break;
                    }
                }
            }
        }
    }

    public final void m(@l Function1 function10) {
        L.p(function10, "predicate");
        synchronized(this.f) {
            MutableVector mutableVector1 = this.f;
            int v1 = mutableVector1.J();
            if(v1 > 0) {
                Object[] arr_object = mutableVector1.F();
                int v2 = 0;
                while(true) {
                    ((ObservedScopeMap)arr_object[v2]).v(function10);
                    ++v2;
                    if(v2 >= v1) {
                        break;
                    }
                }
            }
        }
    }

    private final boolean n() {
        synchronized(this.f) {
        }
        if(this.c) {
            return false;
        }
        boolean z = false;
        Set set0;
        while((set0 = this.s()) != null) {
            synchronized(this.f) {
                MutableVector mutableVector1 = this.f;
                int v1 = mutableVector1.J();
                if(v1 > 0) {
                    Object[] arr_object = mutableVector1.F();
                    for(int v2 = 0; true; ++v2) {
                        z = ((ObservedScopeMap)arr_object[v2]).s(set0) || z;
                        if(v2 + 1 >= v1) {
                            break;
                        }
                    }
                }
            }
        }
        return z;
    }

    private final ObservedScopeMap o(Function1 function10) {
        Object object1;
        MutableVector mutableVector0 = this.f;
        int v = mutableVector0.J();
        if(v > 0) {
            Object[] arr_object = mutableVector0.F();
            int v1 = 0;
            while(true) {
                Object object0 = arr_object[v1];
                if(((ObservedScopeMap)object0).p() == function10) {
                    object1 = object0;
                    goto label_12;
                }
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
        object1 = null;
    label_12:
        if(((ObservedScopeMap)object1) == null) {
            L.n(function10, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
            ObservedScopeMap snapshotStateObserver$ObservedScopeMap0 = new ObservedScopeMap(((Function1)v0.q(function10, 1)));
            this.f.b(snapshotStateObserver$ObservedScopeMap0);
            return snapshotStateObserver$ObservedScopeMap0;
        }
        return (ObservedScopeMap)object1;
    }

    private final void p(Function1 function10) {
        synchronized(this.f) {
            MutableVector mutableVector1 = this.f;
            int v1 = mutableVector1.J();
            if(v1 > 0) {
                Object[] arr_object = mutableVector1.F();
                int v2 = 0;
                while(true) {
                    function10.invoke(arr_object[v2]);
                    ++v2;
                    if(v2 >= v1) {
                        break;
                    }
                }
            }
        }
    }

    public final void q(@l Set set0, @l Snapshot snapshot0) {
        L.p(set0, "changes");
        L.p(snapshot0, "snapshot");
        this.d.invoke(set0, snapshot0);
    }

    public final void r(@l Object object0, @l Function1 function10, @l a a0) {
        ObservedScopeMap snapshotStateObserver$ObservedScopeMap0;
        L.p(object0, "scope");
        L.p(function10, "onValueChangedForScope");
        L.p(a0, "block");
        synchronized(this.f) {
            snapshotStateObserver$ObservedScopeMap0 = this.o(function10);
        }
        boolean z = this.h;
        ObservedScopeMap snapshotStateObserver$ObservedScopeMap1 = this.i;
        try {
            this.h = false;
            this.i = snapshotStateObserver$ObservedScopeMap0;
            Object object1 = snapshotStateObserver$ObservedScopeMap0.b;
            IdentityArrayIntMap identityArrayIntMap0 = snapshotStateObserver$ObservedScopeMap0.c;
            int v1 = snapshotStateObserver$ObservedScopeMap0.d;
            snapshotStateObserver$ObservedScopeMap0.b = object0;
            snapshotStateObserver$ObservedScopeMap0.c = (IdentityArrayIntMap)snapshotStateObserver$ObservedScopeMap0.f.f(object0);
            if(snapshotStateObserver$ObservedScopeMap0.d == -1) {
                snapshotStateObserver$ObservedScopeMap0.d = SnapshotKt.D().g();
            }
            SnapshotStateKt.m(snapshotStateObserver$ObservedScopeMap0.n(), snapshotStateObserver$ObservedScopeMap0.o(), new a(a0) {
                final SnapshotStateObserver e;
                final a f;

                {
                    this.e = snapshotStateObserver0;
                    this.f = a0;
                    super(0);
                }

                @Override  // A3.a
                public Object invoke() {
                    this.invoke();
                    return S0.a;
                }

                public final void invoke() {
                    Function1 function10 = this.e.e;
                    Snapshot.e.e(function10, null, this.f);
                }
            });
            Object object2 = snapshotStateObserver$ObservedScopeMap0.b;
            L.m(object2);
            snapshotStateObserver$ObservedScopeMap0.l(object2);
            snapshotStateObserver$ObservedScopeMap0.b = object1;
            snapshotStateObserver$ObservedScopeMap0.c = identityArrayIntMap0;
            snapshotStateObserver$ObservedScopeMap0.d = v1;
            this.i = snapshotStateObserver$ObservedScopeMap1;
            this.h = z;
            return;
        }
        catch(Throwable throwable0) {
        }
        this.i = snapshotStateObserver$ObservedScopeMap1;
        this.h = z;
        throw throwable0;
    }

    private final Set s() {
        Set set0;
        while(true) {
            Object object0 = this.b.get();
            List list0 = null;
            if(object0 == null) {
                return null;
            }
            if(object0 instanceof Set) {
                set0 = (Set)object0;
            }
            else {
                if(!(object0 instanceof List)) {
                    break;
                }
                Set set1 = (Set)((List)object0).get(0);
                if(((List)object0).size() == 2) {
                    list0 = ((List)object0).get(1);
                }
                else if(((List)object0).size() > 2) {
                    list0 = ((List)object0).subList(1, ((List)object0).size());
                }
                set0 = set1;
            }
            if(d.a(this.b, object0, list0)) {
                return set0;
            }
        }
        this.t();
        throw new y();
    }

    private final Void t() {
        ComposerKt.A("Unexpected notification");
        throw new y();
    }

    private final void u() {
        androidx.compose.runtime.snapshots.SnapshotStateObserver.sendNotifications.1 snapshotStateObserver$sendNotifications$10 = new a() {
            final SnapshotStateObserver e;

            {
                this.e = snapshotStateObserver0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                do {
                    MutableVector mutableVector0 = this.e.f;
                    SnapshotStateObserver snapshotStateObserver0 = this.e;
                    synchronized(mutableVector0) {
                        if(!snapshotStateObserver0.c) {
                            snapshotStateObserver0.c = true;
                            try {
                                MutableVector mutableVector1 = snapshotStateObserver0.f;
                                int v2 = mutableVector1.J();
                                if(v2 > 0) {
                                    Object[] arr_object = mutableVector1.F();
                                    for(int v3 = 0; true; ++v3) {
                                        ((ObservedScopeMap)arr_object[v3]).q();
                                        if(v3 + 1 >= v2) {
                                            break;
                                        }
                                    }
                                }
                            }
                            finally {
                                snapshotStateObserver0.c = false;
                            }
                        }
                    }
                }
                while(this.e.n());
            }
        };
        this.a.invoke(snapshotStateObserver$sendNotifications$10);
    }

    public final void v() {
        this.g = Snapshot.e.h(this.d);
    }

    public final void w() {
        ObserverHandle observerHandle0 = this.g;
        if(observerHandle0 != null) {
            observerHandle0.dispose();
        }
    }

    @k(message = "Replace with Snapshot.withoutReadObservation()", replaceWith = @c0(expression = "Snapshot.withoutReadObservation(block)", imports = {"androidx.compose.runtime.snapshots.Snapshot"}))
    public final void x(@l a a0) {
        L.p(a0, "block");
        boolean z = this.h;
        this.h = true;
        try {
            a0.invoke();
            this.h = z;
        }
        catch(Throwable throwable0) {
            this.h = z;
            throw throwable0;
        }
    }
}

