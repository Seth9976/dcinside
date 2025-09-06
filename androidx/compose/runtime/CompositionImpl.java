package androidx.compose.runtime;

import A3.a;
import A3.o;
import A3.p;
import androidx.compose.animation.core.d;
import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.collection.IdentityScopeMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.V;
import kotlin.collections.u;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.l0.h;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.y;
import y4.l;
import y4.m;

@s0({"SMAP\nComposition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 5 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 6 IdentityScopeMap.kt\nandroidx/compose/runtime/collection/IdentityScopeMap\n+ 7 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n+ 8 Composition.kt\nandroidx/compose/runtime/CompositionKt\n+ 9 Trace.kt\nandroidx/compose/runtime/TraceKt\n+ 10 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1257:1\n884#1,2:1271\n1025#1,3:1273\n874#1,6:1277\n1028#1,7:1283\n886#1,4:1290\n884#1,2:1467\n1025#1,3:1469\n874#1,6:1472\n1028#1,7:1478\n886#1,4:1485\n884#1,2:1498\n1025#1,10:1500\n886#1,4:1510\n884#1,2:1586\n1025#1,10:1588\n886#1,4:1598\n884#1,2:1603\n1025#1,10:1605\n886#1,4:1615\n884#1,2:1620\n1025#1,10:1622\n886#1,4:1632\n1025#1,10:1636\n70#2:1258\n70#2:1260\n70#2:1276\n70#2:1294\n70#2:1303\n70#2:1304\n70#2:1456\n70#2:1466\n70#2:1585\n70#2:1602\n70#2:1619\n70#2:1646\n70#2:1649\n70#2:1650\n1#3:1259\n1#3:1661\n93#4,2:1261\n33#4,4:1263\n95#4,2:1267\n38#4:1269\n97#4:1270\n110#4,2:1489\n33#4,6:1491\n112#4:1497\n33#4,6:1529\n33#4,6:1664\n162#5,8:1295\n162#5,8:1514\n162#5,4:1525\n167#5,3:1535\n89#6,3:1305\n93#6:1313\n220#6:1314\n236#6,5:1315\n221#6:1320\n222#6:1337\n241#6,17:1338\n223#6:1355\n220#6:1356\n236#6,5:1357\n221#6:1362\n222#6:1379\n241#6,17:1380\n223#6:1397\n220#6:1398\n236#6,5:1399\n221#6:1404\n222#6:1421\n241#6,17:1422\n223#6:1439\n89#6,3:1447\n93#6:1455\n89#6,3:1457\n93#6:1465\n220#6:1542\n236#6,5:1543\n221#6:1548\n222#6:1565\n241#6,17:1566\n223#6:1583\n89#6,3:1670\n93#6:1678\n105#7,5:1308\n146#7,16:1321\n146#7,16:1363\n146#7,16:1405\n105#7,5:1450\n105#7,5:1460\n146#7,16:1549\n105#7,5:1673\n1251#8,7:1440\n46#9,3:1522\n50#9:1538\n46#9,3:1539\n50#9:1584\n13579#10,2:1647\n11653#10,9:1651\n13579#10:1660\n13580#10:1662\n11662#10:1663\n*S KotlinDebug\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl\n*L\n583#1:1271,2\n583#1:1273,3\n586#1:1277,6\n583#1:1283,7\n583#1:1290,4\n770#1:1467,2\n770#1:1469,3\n771#1:1472,6\n770#1:1478,7\n770#1:1485,4\n784#1:1498,2\n784#1:1500,10\n784#1:1510,4\n841#1:1586,2\n841#1:1588,10\n841#1:1598,4\n850#1:1603,2\n850#1:1605,10\n850#1:1615,4\n860#1:1620,2\n860#1:1622,10\n860#1:1632,4\n885#1:1636,10\n514#1:1258\n523#1:1260\n584#1:1276\n594#1:1294\n635#1:1303\n656#1:1304\n758#1:1456\n768#1:1466\n840#1:1585\n849#1:1602\n859#1:1619\n899#1:1646\n905#1:1649\n950#1:1650\n1012#1:1661\n530#1:1261,2\n530#1:1263,4\n530#1:1267,2\n530#1:1269\n530#1:1270\n783#1:1489,2\n783#1:1491,6\n783#1:1497\n809#1:1529,6\n1013#1:1664,6\n620#1:1295,8\n792#1:1514,8\n807#1:1525,4\n807#1:1535,3\n701#1:1305,3\n701#1:1313\n708#1:1314\n708#1:1315,5\n708#1:1320\n708#1:1337\n708#1:1338,17\n708#1:1355\n715#1:1356\n715#1:1357,5\n715#1:1362\n715#1:1379\n715#1:1380,17\n715#1:1397\n722#1:1398\n722#1:1399,5\n722#1:1404\n722#1:1421\n722#1:1422,17\n722#1:1439\n750#1:1447,3\n750#1:1455\n763#1:1457,3\n763#1:1465\n827#1:1542\n827#1:1543,5\n827#1:1548\n827#1:1565\n827#1:1566,17\n827#1:1583\n678#1:1670,3\n678#1:1678\n701#1:1308,5\n708#1:1321,16\n715#1:1363,16\n722#1:1405,16\n750#1:1450,5\n763#1:1460,5\n827#1:1549,16\n678#1:1673,5\n723#1:1440,7\n803#1:1522,3\n803#1:1538\n825#1:1539,3\n825#1:1584\n900#1:1647,2\n1012#1:1651,9\n1012#1:1660\n1012#1:1662\n1012#1:1663\n*E\n"})
public final class CompositionImpl implements ControlledComposition {
    @s0({"SMAP\nComposition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl$RememberEventDispatcher\n+ 2 Trace.kt\nandroidx/compose/runtime/TraceKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,1257:1\n46#2,5:1258\n46#2,3:1263\n50#2:1272\n46#2,3:1273\n50#2:1282\n46#2,5:1283\n46#2,5:1288\n46#2,5:1293\n33#3,6:1266\n33#3,6:1276\n*S KotlinDebug\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl$RememberEventDispatcher\n*L\n1090#1:1258,5\n1102#1:1263,3\n1102#1:1272\n1113#1:1273,3\n1113#1:1282\n1124#1:1283,5\n1138#1:1288,5\n1151#1:1293,5\n1103#1:1266,6\n1114#1:1276,6\n*E\n"})
    static final class RememberEventDispatcher implements RememberManager {
        @l
        private final Set a;
        @l
        private final List b;
        @l
        private final List c;
        @l
        private final List d;
        @m
        private List e;
        @m
        private List f;

        public RememberEventDispatcher(@l Set set0) {
            L.p(set0, "abandoning");
            super();
            this.a = set0;
            this.b = new ArrayList();
            this.c = new ArrayList();
            this.d = new ArrayList();
        }

        @Override  // androidx.compose.runtime.RememberManager
        public void a(@l RememberObserver rememberObserver0) {
            L.p(rememberObserver0, "instance");
            int v = this.b.lastIndexOf(rememberObserver0);
            if(v >= 0) {
                this.b.remove(v);
                this.a.remove(rememberObserver0);
                return;
            }
            this.c.add(rememberObserver0);
        }

        @Override  // androidx.compose.runtime.RememberManager
        public void b(@l ComposeNodeLifecycleCallback composeNodeLifecycleCallback0) {
            L.p(composeNodeLifecycleCallback0, "instance");
            List list0 = this.e;
            if(list0 == null) {
                list0 = new ArrayList();
                this.e = list0;
            }
            list0.add(composeNodeLifecycleCallback0);
        }

        @Override  // androidx.compose.runtime.RememberManager
        public void c(@l a a0) {
            L.p(a0, "effect");
            this.d.add(a0);
        }

        @Override  // androidx.compose.runtime.RememberManager
        public void d(@l ComposeNodeLifecycleCallback composeNodeLifecycleCallback0) {
            L.p(composeNodeLifecycleCallback0, "instance");
            List list0 = this.f;
            if(list0 == null) {
                list0 = new ArrayList();
                this.f = list0;
            }
            list0.add(composeNodeLifecycleCallback0);
        }

        @Override  // androidx.compose.runtime.RememberManager
        public void e(@l RememberObserver rememberObserver0) {
            L.p(rememberObserver0, "instance");
            int v = this.c.lastIndexOf(rememberObserver0);
            if(v >= 0) {
                this.c.remove(v);
                this.a.remove(rememberObserver0);
                return;
            }
            this.b.add(rememberObserver0);
        }

        public final void f() {
            if(!this.a.isEmpty()) {
                Object object0 = Trace.a.a("Compose:abandons");
                try {
                    Iterator iterator0 = this.a.iterator();
                    while(iterator0.hasNext()) {
                        Object object1 = iterator0.next();
                        iterator0.remove();
                        ((RememberObserver)object1).c();
                    }
                }
                finally {
                    Trace.a.b(object0);
                }
            }
        }

        public final void g() {
            List list0 = this.e;
            if(list0 != null && !list0.isEmpty()) {
                Object object0 = Trace.a.a("Compose:deactivations");
                try {
                    for(int v1 = list0.size() - 1; -1 < v1; --v1) {
                        ((ComposeNodeLifecycleCallback)list0.get(v1)).j();
                    }
                }
                finally {
                    Trace.a.b(object0);
                }
                list0.clear();
            }
            List list1 = this.f;
            if(list1 != null && !list1.isEmpty()) {
                Object object1 = Trace.a.a("Compose:releases");
                try {
                    for(int v3 = list1.size() - 1; -1 < v3; --v3) {
                        ((ComposeNodeLifecycleCallback)list1.get(v3)).i();
                    }
                }
                finally {
                    Trace.a.b(object1);
                }
                list1.clear();
            }
        }

        public final void h() {
            if(!this.c.isEmpty()) {
                Object object0 = Trace.a.a("Compose:onForgotten");
                try {
                    for(int v1 = this.c.size() - 1; -1 < v1; --v1) {
                        RememberObserver rememberObserver0 = (RememberObserver)this.c.get(v1);
                        if(!this.a.contains(rememberObserver0)) {
                            rememberObserver0.d();
                        }
                    }
                }
                finally {
                    Trace.a.b(object0);
                }
            }
            if(!this.b.isEmpty()) {
                Object object1 = Trace.a.a("Compose:onRemembered");
                try {
                    List list0 = this.b;
                    int v3 = list0.size();
                    for(int v4 = 0; v4 < v3; ++v4) {
                        RememberObserver rememberObserver1 = (RememberObserver)list0.get(v4);
                        this.a.remove(rememberObserver1);
                        rememberObserver1.a();
                    }
                }
                finally {
                    Trace.a.b(object1);
                }
            }
        }

        public final void i() {
            if(!this.d.isEmpty()) {
                Object object0 = Trace.a.a("Compose:sideeffects");
                try {
                    List list0 = this.d;
                    int v1 = list0.size();
                    for(int v2 = 0; v2 < v1; ++v2) {
                        ((a)list0.get(v2)).invoke();
                    }
                    this.d.clear();
                }
                finally {
                    Trace.a.b(object0);
                }
            }
        }
    }

    @l
    private final CompositionContext a;
    @l
    private final Applier b;
    @l
    private final AtomicReference c;
    @l
    private final Object d;
    @l
    private final HashSet e;
    @l
    private final SlotTable f;
    @l
    private final IdentityScopeMap g;
    @l
    private final HashSet h;
    @l
    private final IdentityScopeMap i;
    @l
    private final List j;
    @l
    private final List k;
    @l
    private final IdentityScopeMap l;
    @l
    private IdentityArrayMap m;
    private boolean n;
    @m
    private CompositionImpl o;
    private int p;
    @l
    private final ComposerImpl q;
    @m
    private final g r;
    private final boolean s;
    private boolean t;
    @l
    private o u;

    public CompositionImpl(@l CompositionContext compositionContext0, @l Applier applier0, @m g g0) {
        L.p(compositionContext0, "parent");
        L.p(applier0, "applier");
        super();
        this.a = compositionContext0;
        this.b = applier0;
        this.c = new AtomicReference(null);
        this.d = new Object();
        HashSet hashSet0 = new HashSet();
        this.e = hashSet0;
        SlotTable slotTable0 = new SlotTable();
        this.f = slotTable0;
        this.g = new IdentityScopeMap();
        this.h = new HashSet();
        this.i = new IdentityScopeMap();
        ArrayList arrayList0 = new ArrayList();
        this.j = arrayList0;
        ArrayList arrayList1 = new ArrayList();
        this.k = arrayList1;
        this.l = new IdentityScopeMap();
        this.m = new IdentityArrayMap(0, 1, null);
        ComposerImpl composerImpl0 = new ComposerImpl(applier0, compositionContext0, slotTable0, hashSet0, arrayList0, arrayList1, this);
        compositionContext0.o(composerImpl0);
        this.q = composerImpl0;
        this.r = g0;
        this.s = compositionContext0 instanceof Recomposer;
        this.u = ComposableSingletons.CompositionKt.a.a();
    }

    public CompositionImpl(CompositionContext compositionContext0, Applier applier0, g g0, int v, w w0) {
        if((v & 4) != 0) {
            g0 = null;
        }
        this(compositionContext0, applier0, g0);
    }

    @Override  // androidx.compose.runtime.ControlledComposition
    public void A() {
        Object object0 = this.d;
        __monitor_enter(object0);
        try {
            this.g(this.j);
            this.m();
        }
        catch(Throwable throwable0) {
            try {
                try {
                    if(!this.e.isEmpty()) {
                        new RememberEventDispatcher(this.e).f();
                    }
                    throw throwable0;
                }
                catch(Exception exception0) {
                }
                this.d();
                throw exception0;
            }
            catch(Throwable throwable1) {
            }
            __monitor_exit(object0);
            throw throwable1;
        }
        __monitor_exit(object0);
    }

    @Override  // androidx.compose.runtime.ControlledComposition
    public boolean B() {
        return this.q.o1();
    }

    @Override  // androidx.compose.runtime.ControlledComposition
    public void C(@l Object object0) {
        L.p(object0, "value");
        synchronized(this.d) {
            this.O(object0);
            IdentityScopeMap identityScopeMap0 = this.i;
            int v1 = identityScopeMap0.f(object0);
            if(v1 >= 0) {
                IdentityArraySet identityArraySet0 = identityScopeMap0.v(v1);
                int v2 = identityArraySet0.size();
                for(int v3 = 0; v3 < v2; ++v3) {
                    this.O(((DerivedState)identityArraySet0.get(v3)));
                }
            }
        }
    }

    @l
    public final List D() {
        return u.V5(this.h);
    }

    @l
    public final List E() {
        return kotlin.collections.l.Ta(this.i.p());
    }

    @l
    public final List F() {
        return kotlin.collections.l.Ta(this.g.p());
    }

    public final boolean G() {
        return this.n;
    }

    @l
    public final g H() {
        return this.r == null ? this.a.h() : this.r;
    }

    @l
    public final SlotTable I() {
        return this.f;
    }

    private final Object J(a a0) {
        try {
            return a0.invoke();
        }
        catch(Throwable throwable0) {
            try {
                if(!this.e.isEmpty()) {
                    new RememberEventDispatcher(this.e).f();
                }
                throw throwable0;
            }
            catch(Exception exception0) {
            }
            this.d();
            throw exception0;
        }
    }

    private final Object K(Function1 function10) {
        IdentityArrayMap identityArrayMap0 = this.U();
        try {
            return function10.invoke(identityArrayMap0);
        }
        catch(Exception exception0) {
            this.m = identityArrayMap0;
            throw exception0;
        }
    }

    @l
    public final InvalidationResult L(@l RecomposeScopeImpl recomposeScopeImpl0, @m Object object0) {
        L.p(recomposeScopeImpl0, "scope");
        if(recomposeScopeImpl0.m()) {
            recomposeScopeImpl0.C(true);
        }
        Anchor anchor0 = recomposeScopeImpl0.j();
        if(anchor0 == null || !this.f.G(anchor0) || !anchor0.b() || !anchor0.b()) {
            return InvalidationResult.a;
        }
        return recomposeScopeImpl0.k() ? this.M(recomposeScopeImpl0, anchor0, object0) : InvalidationResult.a;
    }

    private final InvalidationResult M(RecomposeScopeImpl recomposeScopeImpl0, Anchor anchor0, Object object0) {
        CompositionImpl compositionImpl0;
        Object object1 = this.d;
        __monitor_enter(object1);
        try {
            compositionImpl0 = this.o == null || !this.f.x(this.p, anchor0) ? null : this.o;
            if(compositionImpl0 == null) {
                if(this.B() && this.q.m2(recomposeScopeImpl0, object0)) {
                    goto label_13;
                }
                if(object0 == null) {
                    this.m.o(recomposeScopeImpl0, null);
                }
                else {
                    CompositionKt.g(this.m, recomposeScopeImpl0, object0);
                }
            }
            goto label_15;
        }
        catch(Throwable throwable0) {
        }
        __monitor_exit(object1);
        throw throwable0;
    label_13:
        __monitor_exit(object1);
        return InvalidationResult.d;
    label_15:
        __monitor_exit(object1);
        if(compositionImpl0 != null) {
            return compositionImpl0.M(recomposeScopeImpl0, anchor0, object0);
        }
        this.a.j(this);
        return this.B() ? InvalidationResult.c : InvalidationResult.b;
    }

    public final void N(int v) {
        List list0;
        synchronized(this.d) {
            list0 = this.f.B(v);
        }
        if(list0 != null) {
            int v2 = list0.size();
            int v3 = 0;
            while(v3 < v2) {
                if(((RecomposeScopeImpl)list0.get(v3)).t(null) == InvalidationResult.a) {
                    goto label_14;
                }
                ++v3;
            }
            return;
        }
    label_14:
        if(this.q.U0()) {
            this.a.j(this);
        }
    }

    private final void O(Object object0) {
        IdentityScopeMap identityScopeMap0 = this.g;
        int v = identityScopeMap0.f(object0);
        if(v >= 0) {
            IdentityArraySet identityArraySet0 = identityScopeMap0.v(v);
            int v1 = identityArraySet0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                RecomposeScopeImpl recomposeScopeImpl0 = (RecomposeScopeImpl)identityArraySet0.get(v2);
                if(recomposeScopeImpl0.t(object0) == InvalidationResult.d) {
                    this.l.c(object0, recomposeScopeImpl0);
                }
            }
        }
    }

    public final boolean P() {
        return this.s;
    }

    public final void Q(@l DerivedState derivedState0) {
        L.p(derivedState0, "state");
        if(!this.g.e(derivedState0)) {
            this.i.s(derivedState0);
        }
    }

    public final void R(@l Object object0, @l RecomposeScopeImpl recomposeScopeImpl0) {
        L.p(object0, "instance");
        L.p(recomposeScopeImpl0, "scope");
        this.g.r(object0, recomposeScopeImpl0);
    }

    public final void S(@l o o0) {
        L.p(o0, "<set-?>");
        this.u = o0;
    }

    public final void T(boolean z) {
        this.n = z;
    }

    private final IdentityArrayMap U() {
        IdentityArrayMap identityArrayMap0 = this.m;
        this.m = new IdentityArrayMap(0, 1, null);
        return identityArrayMap0;
    }

    private final Object V(a a0) {
        try {
            return a0.invoke();
        }
        catch(Throwable throwable0) {
            if(!this.e.isEmpty()) {
                new RememberEventDispatcher(this.e).f();
            }
            throw throwable0;
        }
    }

    private final void W(SlotTable slotTable0) {
        Object[] arr_object = slotTable0.t();
        ArrayList arrayList0 = new ArrayList();
        for(int v1 = 0; v1 < arr_object.length; ++v1) {
            Object object0 = arr_object[v1];
            RecomposeScopeImpl recomposeScopeImpl0 = object0 instanceof RecomposeScopeImpl ? ((RecomposeScopeImpl)object0) : null;
            if(recomposeScopeImpl0 != null) {
                arrayList0.add(recomposeScopeImpl0);
            }
        }
        int v2 = arrayList0.size();
        for(int v = 0; v < v2; ++v) {
            RecomposeScopeImpl recomposeScopeImpl1 = (RecomposeScopeImpl)arrayList0.get(v);
            Anchor anchor0 = recomposeScopeImpl1.j();
            if(anchor0 != null && !slotTable0.N(anchor0.d(slotTable0)).contains(recomposeScopeImpl1)) {
                throw new IllegalStateException(("Misaligned anchor " + anchor0 + " in scope " + recomposeScopeImpl1 + " encountered, scope found at " + kotlin.collections.l.If(slotTable0.t(), recomposeScopeImpl1)).toString());
            }
        }
    }

    @Override  // androidx.compose.runtime.Composition
    public boolean a() {
        return this.t;
    }

    @Override  // androidx.compose.runtime.Composition
    public void b(@l o o0) {
        L.p(o0, "content");
        if(this.t) {
            throw new IllegalStateException("The composition is disposed");
        }
        this.u = o0;
        this.a.a(this, o0);
    }

    @Override  // androidx.compose.runtime.Composition
    public boolean c() {
        synchronized(this.d) {
            return this.m.h() > 0;
        }
    }

    private final void d() {
        this.c.set(null);
        this.j.clear();
        this.k.clear();
        this.e.clear();
    }

    @Override  // androidx.compose.runtime.Composition
    public void dispose() {
        synchronized(this.d) {
            if(!this.t) {
                boolean z = true;
                this.t = true;
                this.u = ComposableSingletons.CompositionKt.a.b();
                List list0 = this.q.a1();
                if(list0 != null) {
                    this.g(list0);
                }
                if(this.f.r() <= 0) {
                    z = false;
                    if(!this.e.isEmpty()) {
                        goto label_13;
                    }
                }
                else {
                label_13:
                    RememberEventDispatcher compositionImpl$RememberEventDispatcher0 = new RememberEventDispatcher(this.e);
                    if(z) {
                        SlotWriter slotWriter0 = this.f.F();
                        try {
                            ComposerKt.n0(slotWriter0, compositionImpl$RememberEventDispatcher0);
                        }
                        catch(Throwable throwable0) {
                            slotWriter0.I();
                            throw throwable0;
                        }
                        slotWriter0.I();
                        this.b.clear();
                        compositionImpl$RememberEventDispatcher0.h();
                        compositionImpl$RememberEventDispatcher0.g();
                    }
                    compositionImpl$RememberEventDispatcher0.f();
                }
                this.q.K0();
            }
        }
        this.a.s(this);
    }

    private final void e(Set set0, boolean z) {
        h l0$h0 = new h();
        for(Object object0: set0) {
            if(object0 instanceof RecomposeScopeImpl) {
                ((RecomposeScopeImpl)object0).t(null);
            }
            else {
                CompositionImpl.f(this, z, l0$h0, object0);
                IdentityScopeMap identityScopeMap0 = this.i;
                int v = identityScopeMap0.f(object0);
                if(v >= 0) {
                    IdentityArraySet identityArraySet0 = identityScopeMap0.v(v);
                    int v1 = identityArraySet0.size();
                    for(int v2 = 0; v2 < v1; ++v2) {
                        CompositionImpl.f(this, z, l0$h0, ((DerivedState)identityArraySet0.get(v2)));
                    }
                }
            }
        }
        if(z && !this.h.isEmpty()) {
            IdentityScopeMap identityScopeMap1 = this.g;
            int v3 = identityScopeMap1.l();
            int v5 = 0;
            for(int v4 = 0; v4 < v3; ++v4) {
                int v6 = identityScopeMap1.n()[v4];
                IdentityArraySet identityArraySet1 = identityScopeMap1.j()[v6];
                L.m(identityArraySet1);
                int v7 = identityArraySet1.size();
                int v9 = 0;
                for(int v8 = 0; v8 < v7; ++v8) {
                    Object object1 = identityArraySet1.h()[v8];
                    L.n(object1, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                    RecomposeScopeImpl recomposeScopeImpl0 = (RecomposeScopeImpl)object1;
                    if(!this.h.contains(recomposeScopeImpl0)) {
                        HashSet hashSet0 = (HashSet)l0$h0.a;
                        if(hashSet0 == null || !hashSet0.contains(recomposeScopeImpl0)) {
                            if(v9 != v8) {
                                identityArraySet1.h()[v9] = object1;
                            }
                            ++v9;
                        }
                    }
                }
                int v10 = identityArraySet1.size();
                for(int v11 = v9; v11 < v10; ++v11) {
                    identityArraySet1.h()[v11] = null;
                }
                identityArraySet1.l(v9);
                if(identityArraySet1.size() > 0) {
                    if(v5 != v4) {
                        int v12 = identityScopeMap1.n()[v5];
                        identityScopeMap1.n()[v5] = v6;
                        identityScopeMap1.n()[v4] = v12;
                    }
                    ++v5;
                }
            }
            int v13 = identityScopeMap1.l();
            for(int v14 = v5; v14 < v13; ++v14) {
                identityScopeMap1.p()[identityScopeMap1.n()[v14]] = null;
            }
            identityScopeMap1.x(v5);
            this.h();
            this.h.clear();
            return;
        }
        HashSet hashSet1 = (HashSet)l0$h0.a;
        if(hashSet1 != null) {
            IdentityScopeMap identityScopeMap2 = this.g;
            int v15 = identityScopeMap2.l();
            int v17 = 0;
            for(int v16 = 0; v16 < v15; ++v16) {
                int v18 = identityScopeMap2.n()[v16];
                IdentityArraySet identityArraySet2 = identityScopeMap2.j()[v18];
                L.m(identityArraySet2);
                int v19 = identityArraySet2.size();
                int v21 = 0;
                for(int v20 = 0; v20 < v19; ++v20) {
                    Object object2 = identityArraySet2.h()[v20];
                    L.n(object2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                    if(!hashSet1.contains(((RecomposeScopeImpl)object2))) {
                        if(v21 != v20) {
                            identityArraySet2.h()[v21] = object2;
                        }
                        ++v21;
                    }
                }
                int v22 = identityArraySet2.size();
                for(int v23 = v21; v23 < v22; ++v23) {
                    identityArraySet2.h()[v23] = null;
                }
                identityArraySet2.l(v21);
                if(identityArraySet2.size() > 0) {
                    if(v17 != v16) {
                        int v24 = identityScopeMap2.n()[v17];
                        identityScopeMap2.n()[v17] = v18;
                        identityScopeMap2.n()[v16] = v24;
                    }
                    ++v17;
                }
            }
            int v25 = identityScopeMap2.l();
            for(int v26 = v17; v26 < v25; ++v26) {
                identityScopeMap2.p()[identityScopeMap2.n()[v26]] = null;
            }
            identityScopeMap2.x(v17);
            this.h();
        }
    }

    private static final void f(CompositionImpl compositionImpl0, boolean z, h l0$h0, Object object0) {
        IdentityScopeMap identityScopeMap0 = compositionImpl0.g;
        int v = identityScopeMap0.f(object0);
        if(v >= 0) {
            IdentityArraySet identityArraySet0 = identityScopeMap0.v(v);
            int v1 = identityArraySet0.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                RecomposeScopeImpl recomposeScopeImpl0 = (RecomposeScopeImpl)identityArraySet0.get(v2);
                if(!compositionImpl0.l.r(object0, recomposeScopeImpl0) && recomposeScopeImpl0.t(object0) != InvalidationResult.a) {
                    if(!recomposeScopeImpl0.u() || z) {
                        HashSet hashSet0 = (HashSet)l0$h0.a;
                        if(hashSet0 == null) {
                            hashSet0 = new HashSet();
                            l0$h0.a = hashSet0;
                        }
                        hashSet0.add(recomposeScopeImpl0);
                    }
                    else {
                        compositionImpl0.h.add(recomposeScopeImpl0);
                    }
                }
            }
        }
    }

    private final void g(List list0) {
        Object object0;
        RememberEventDispatcher compositionImpl$RememberEventDispatcher0 = new RememberEventDispatcher(this.e);
        try {
            if(!list0.isEmpty()) {
                object0 = Trace.a.a("Compose:applyChanges");
                goto label_3;
            }
            goto label_85;
        }
        catch(Throwable throwable0) {
            goto label_79;
        }
        try {
        label_3:
            this.b.d();
            SlotWriter slotWriter0 = this.f.F();
            try {
                Applier applier0 = this.b;
                int v1 = list0.size();
                for(int v2 = 0; v2 < v1; ++v2) {
                    ((p)list0.get(v2)).invoke(applier0, slotWriter0, compositionImpl$RememberEventDispatcher0);
                }
                list0.clear();
            }
            finally {
                slotWriter0.I();
            }
            this.b.c();
            goto label_22;
        }
        catch(Throwable throwable1) {
            try {
                Trace.a.b(object0);
                throw throwable1;
            label_22:
                Trace trace0 = Trace.a;
                trace0.b(object0);
                compositionImpl$RememberEventDispatcher0.h();
                compositionImpl$RememberEventDispatcher0.g();
                compositionImpl$RememberEventDispatcher0.i();
                if(this.n) {
                    Object object1 = trace0.a("Compose:unobserve");
                    try {
                        this.n = false;
                        IdentityScopeMap identityScopeMap0 = this.g;
                        int v4 = identityScopeMap0.l();
                        int v6 = 0;
                        for(int v5 = 0; v5 < v4; ++v5) {
                            int v7 = identityScopeMap0.n()[v5];
                            IdentityArraySet identityArraySet0 = identityScopeMap0.j()[v7];
                            L.m(identityArraySet0);
                            int v8 = identityArraySet0.size();
                            int v10 = 0;
                            for(int v9 = 0; v9 < v8; ++v9) {
                                Object object2 = identityArraySet0.h()[v9];
                                L.n(object2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                if(((RecomposeScopeImpl)object2).s()) {
                                    if(v10 != v9) {
                                        identityArraySet0.h()[v10] = object2;
                                    }
                                    ++v10;
                                }
                            }
                            int v11 = identityArraySet0.size();
                            for(int v12 = v10; v12 < v11; ++v12) {
                                identityArraySet0.h()[v12] = null;
                            }
                            identityArraySet0.l(v10);
                            if(identityArraySet0.size() > 0) {
                                if(v6 != v5) {
                                    int v13 = identityScopeMap0.n()[v6];
                                    identityScopeMap0.n()[v6] = v7;
                                    identityScopeMap0.n()[v5] = v13;
                                }
                                ++v6;
                            }
                        }
                        int v14 = identityScopeMap0.l();
                        for(int v15 = v6; v15 < v14; ++v15) {
                            identityScopeMap0.p()[identityScopeMap0.n()[v15]] = null;
                        }
                        identityScopeMap0.x(v6);
                        this.h();
                    }
                    finally {
                        Trace.a.b(object1);
                    }
                }
                goto label_82;
            }
            catch(Throwable throwable0) {
            }
        }
    label_79:
        if(this.k.isEmpty()) {
            compositionImpl$RememberEventDispatcher0.f();
        }
        throw throwable0;
    label_82:
        if(this.k.isEmpty()) {
            compositionImpl$RememberEventDispatcher0.f();
        }
        return;
    label_85:
        if(this.k.isEmpty()) {
            compositionImpl$RememberEventDispatcher0.f();
        }
    }

    private final void h() {
        IdentityScopeMap identityScopeMap0 = this.i;
        int v = identityScopeMap0.l();
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            int v3 = identityScopeMap0.n()[v1];
            IdentityArraySet identityArraySet0 = identityScopeMap0.j()[v3];
            L.m(identityArraySet0);
            int v4 = identityArraySet0.size();
            int v6 = 0;
            for(int v5 = 0; v5 < v4; ++v5) {
                Object object0 = identityArraySet0.h()[v5];
                L.n(object0, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                if(this.g.e(((DerivedState)object0))) {
                    if(v6 != v5) {
                        identityArraySet0.h()[v6] = object0;
                    }
                    ++v6;
                }
            }
            int v7 = identityArraySet0.size();
            for(int v8 = v6; v8 < v7; ++v8) {
                identityArraySet0.h()[v8] = null;
            }
            identityArraySet0.l(v6);
            if(identityArraySet0.size() > 0) {
                if(v2 != v1) {
                    int v9 = identityScopeMap0.n()[v2];
                    identityScopeMap0.n()[v2] = v3;
                    identityScopeMap0.n()[v1] = v9;
                }
                ++v2;
            }
        }
        int v10 = identityScopeMap0.l();
        for(int v11 = v2; v11 < v10; ++v11) {
            identityScopeMap0.p()[identityScopeMap0.n()[v11]] = null;
        }
        identityScopeMap0.x(v2);
        Iterator iterator0 = this.h.iterator();
        L.o(iterator0, "iterator()");
        while(iterator0.hasNext()) {
            Object object1 = iterator0.next();
            if(!((RecomposeScopeImpl)object1).u()) {
                iterator0.remove();
            }
        }
    }

    private final void i() {
        Object object0 = this.c.getAndSet(CompositionKt.a);
        if(object0 != null) {
            if(!L.g(object0, CompositionKt.a)) {
                if(object0 instanceof Set) {
                    this.e(((Set)object0), true);
                    return;
                }
                if(object0 instanceof Object[]) {
                    for(int v = 0; v < ((Set[])object0).length; ++v) {
                        this.e(((Set[])object0)[v], true);
                    }
                    return;
                }
                ComposerKt.A(("corrupt pendingModifications drain: " + this.c));
                throw new y();
            }
            ComposerKt.A("pending composition has not been applied");
            throw new y();
        }
    }

    @Override  // androidx.compose.runtime.ControlledComposition
    public void j() {
        synchronized(this.d) {
            Object[] arr_object = this.f.t();
            for(int v1 = 0; v1 < arr_object.length; ++v1) {
                Object object1 = arr_object[v1];
                RecomposeScopeImpl recomposeScopeImpl0 = object1 instanceof RecomposeScopeImpl ? ((RecomposeScopeImpl)object1) : null;
                if(recomposeScopeImpl0 != null) {
                    recomposeScopeImpl0.invalidate();
                }
            }
        }
    }

    @Override  // androidx.compose.runtime.ControlledComposition
    public void k(@l o o0) {
        L.p(o0, "content");
        try {
            synchronized(this.d) {
                this.i();
                IdentityArrayMap identityArrayMap0 = this.U();
                try {
                    this.q.F0(identityArrayMap0, o0);
                }
                catch(Exception exception0) {
                    this.m = identityArrayMap0;
                    throw exception0;
                }
            }
        }
        catch(Throwable throwable0) {
            try {
                if(!this.e.isEmpty()) {
                    new RememberEventDispatcher(this.e).f();
                }
                throw throwable0;
            }
            catch(Exception exception1) {
            }
            this.d();
            throw exception1;
        }
    }

    @Override  // androidx.compose.runtime.ControlledComposition
    public void l(@l MovableContentState movableContentState0) {
        L.p(movableContentState0, "state");
        RememberEventDispatcher compositionImpl$RememberEventDispatcher0 = new RememberEventDispatcher(this.e);
        SlotWriter slotWriter0 = movableContentState0.a().F();
        try {
            ComposerKt.n0(slotWriter0, compositionImpl$RememberEventDispatcher0);
        }
        finally {
            slotWriter0.I();
        }
        compositionImpl$RememberEventDispatcher0.h();
        compositionImpl$RememberEventDispatcher0.g();
    }

    private final void m() {
        Object object0 = this.c.getAndSet(null);
        if(!L.g(object0, CompositionKt.a)) {
            if(object0 instanceof Set) {
                this.e(((Set)object0), false);
                return;
            }
            if(object0 instanceof Object[]) {
                for(int v = 0; v < ((Set[])object0).length; ++v) {
                    this.e(((Set[])object0)[v], false);
                }
                return;
            }
            if(object0 == null) {
                ComposerKt.A("calling recordModificationsOf and applyChanges concurrently is not supported");
                throw new y();
            }
            ComposerKt.A(("corrupt pendingModifications drain: " + this.c));
            throw new y();
        }
    }

    private final boolean n() {
        return this.q.V0();
    }

    @Override  // androidx.compose.runtime.ControlledComposition
    public boolean o(@l Set set0) {
        L.p(set0, "values");
        for(Object object0: set0) {
            if(this.g.e(object0) || this.i.e(object0)) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    @Override  // androidx.compose.runtime.ControlledComposition
    public Object p(@m ControlledComposition controlledComposition0, int v, @l a a0) {
        L.p(a0, "block");
        if(controlledComposition0 != null && !L.g(controlledComposition0, this) && v >= 0) {
            this.o = (CompositionImpl)controlledComposition0;
            this.p = v;
            try {
                Object object0 = a0.invoke();
                this.o = null;
                this.p = 0;
                return object0;
            }
            catch(Throwable throwable0) {
                this.o = null;
                this.p = 0;
                throw throwable0;
            }
        }
        return a0.invoke();
    }

    @Override  // androidx.compose.runtime.ControlledComposition
    public void q() {
        Object object0 = this.d;
        __monitor_enter(object0);
        try {
            this.q.C0();
            if(!this.e.isEmpty()) {
                new RememberEventDispatcher(this.e).f();
            }
            goto label_17;
        }
        catch(Throwable throwable0) {
        }
        try {
            try {
                if(!this.e.isEmpty()) {
                    new RememberEventDispatcher(this.e).f();
                }
                throw throwable0;
            }
            catch(Exception exception0) {
            }
            this.d();
            throw exception0;
        }
        catch(Throwable throwable1) {
        }
        __monitor_exit(object0);
        throw throwable1;
    label_17:
        __monitor_exit(object0);
    }

    @l
    public final o r() {
        return this.u;
    }

    @Override  // androidx.compose.runtime.ControlledComposition
    public void s() {
        Object object0 = this.d;
        __monitor_enter(object0);
        try {
            if(!this.k.isEmpty()) {
                this.g(this.k);
            }
            goto label_16;
        }
        catch(Throwable throwable0) {
        }
        try {
            try {
                if(!this.e.isEmpty()) {
                    new RememberEventDispatcher(this.e).f();
                }
                throw throwable0;
            }
            catch(Exception exception0) {
            }
            this.d();
            throw exception0;
        }
        catch(Throwable throwable1) {
        }
        __monitor_exit(object0);
        throw throwable1;
    label_16:
        __monitor_exit(object0);
    }

    @Override  // androidx.compose.runtime.ControlledComposition
    public void t(@l List list0) {
        L.p(list0, "references");
        int v = list0.size();
        boolean z = false;
        for(int v1 = 0; true; ++v1) {
            if(v1 >= v) {
                z = true;
                break;
            }
            if(!L.g(((MovableContentStateReference)((V)list0.get(v1)).e()).b(), this)) {
                break;
            }
        }
        ComposerKt.q0(z);
        try {
            this.q.d(list0);
        }
        catch(Throwable throwable0) {
            try {
                if(!this.e.isEmpty()) {
                    new RememberEventDispatcher(this.e).f();
                }
                throw throwable0;
            }
            catch(Exception exception0) {
            }
            this.d();
            throw exception0;
        }
    }

    @Override  // androidx.compose.runtime.ControlledComposition
    public boolean u() {
        synchronized(this.d) {
            return this.q.c1();
        }
    }

    @Override  // androidx.compose.runtime.ControlledComposition
    public boolean v() {
        boolean z;
        synchronized(this.d) {
            this.i();
            try {
                IdentityArrayMap identityArrayMap0 = this.U();
                try {
                    z = this.q.B1(identityArrayMap0);
                    if(!z) {
                        this.m();
                    }
                    return z;
                }
                catch(Exception exception0) {
                    this.m = identityArrayMap0;
                    throw exception0;
                }
            }
            catch(Throwable throwable0) {
                try {
                    if(!this.e.isEmpty()) {
                        new RememberEventDispatcher(this.e).f();
                    }
                    throw throwable0;
                }
                catch(Exception exception1) {
                }
                this.d();
                throw exception1;
            }
        }
    }

    @Override  // androidx.compose.runtime.ControlledComposition
    public void w() {
        synchronized(this.d) {
            if(!this.B()) {
                this.q.z2();
                this.f.O();
                this.W(this.f);
            }
        }
    }

    @Override  // androidx.compose.runtime.ControlledComposition
    public void x(@l Object object0) {
        L.p(object0, "value");
        if(!this.n()) {
            RecomposeScopeImpl recomposeScopeImpl0 = this.q.Y0();
            if(recomposeScopeImpl0 != null) {
                recomposeScopeImpl0.G(true);
                this.g.c(object0, recomposeScopeImpl0);
                if(object0 instanceof DerivedState) {
                    this.i.s(object0);
                    Object[] arr_object = ((DerivedState)object0).i();
                    for(int v = 0; v < arr_object.length; ++v) {
                        Object object1 = arr_object[v];
                        if(object1 == null) {
                            break;
                        }
                        this.i.c(object1, object0);
                    }
                }
                recomposeScopeImpl0.w(object0);
            }
        }
    }

    @Override  // androidx.compose.runtime.ControlledComposition
    public void y(@l Set set0) {
        Set set1;
        L.p(set0, "values");
        while(true) {
            Object object0 = this.c.get();
            if((object0 == null ? true : L.g(object0, CompositionKt.a))) {
                set1 = set0;
            }
            else if(object0 instanceof Set) {
                set1 = new Set[]{((Set)object0), set0};
            }
            else {
                if(!(object0 instanceof Object[])) {
                    break;
                }
                L.n(object0, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                set1 = kotlin.collections.l.w3(((Set[])object0), set0);
            }
            if(d.a(this.c, object0, set1)) {
                if(object0 == null) {
                    synchronized(this.d) {
                        this.m();
                    }
                    return;
                }
                return;
            }
        }
        throw new IllegalStateException(("corrupt pendingModifications: " + this.c).toString());
    }

    @Override  // androidx.compose.runtime.ControlledComposition
    public void z(@l a a0) {
        L.p(a0, "block");
        this.q.u1(a0);
    }
}

