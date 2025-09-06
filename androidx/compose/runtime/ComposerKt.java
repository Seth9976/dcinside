package androidx.compose.runtime;

import A3.a;
import A3.p;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap.Builder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.S0;
import kotlin.b0;
import kotlin.c0;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.k;
import kotlin.y;
import y4.l;
import y4.m;

@s0({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n*L\n1#1,4507:1\n309#1:4508\n4492#1,5:4525\n1#2:4509\n361#3,7:4510\n146#4,8:4517\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n325#1:4508\n4498#1:4525,5\n4232#1:4510,7\n4346#1:4517,8\n*E\n"})
public final class ComposerKt {
    @m
    private static CompositionTracer a = null;
    @l
    private static final p b = null;
    @l
    private static final p c = null;
    @l
    private static final p d = null;
    @l
    private static final p e = null;
    @l
    private static final p f = null;
    private static final int g = 100;
    private static final int h = 0x7D;
    private static final int i = 0xFFFFFF81;
    public static final int j = 200;
    @l
    private static final Object k = null;
    public static final int l = 201;
    @l
    private static final Object m = null;
    public static final int n = 202;
    @l
    private static final Object o = null;
    public static final int p = 203;
    @l
    private static final Object q = null;
    public static final int r = 204;
    @l
    private static final Object s = null;
    public static final int t = 206;
    @l
    private static final Object u = null;
    public static final int v = 0xCF;
    private static final int w = -2;

    static {
        ComposerKt.b = ComposerKt.removeCurrentGroupInstance.1.e;
        ComposerKt.c = ComposerKt.skipToGroupEndInstance.1.e;
        ComposerKt.d = ComposerKt.endGroupInstance.1.e;
        ComposerKt.e = ComposerKt.startRootGroup.1.e;
        ComposerKt.f = ComposerKt.resetSlotsInstance.1.e;
        ComposerKt.k = new OpaqueKey("provider");
        ComposerKt.m = new OpaqueKey("provider");
        ComposerKt.o = new OpaqueKey("compositionLocalMap");
        ComposerKt.q = new OpaqueKey("providerValues");
        ComposerKt.s = new OpaqueKey("providers");
        ComposerKt.u = new OpaqueKey("reference");
    }

    @l
    public static final Void A(@l String s) {
        L.p(s, "message");
        throw new ComposeRuntimeError("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + s + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    @Composable
    private static final PersistentMap B(ProvidedValue[] arr_providedValue, PersistentMap persistentMap0, Composer composer0, int v) {
        composer0.V(0x2AFB8B98);
        if(ComposerKt.g0()) {
            ComposerKt.w0(0x2AFB8B98, v, -1, "androidx.compose.runtime.compositionLocalMapOf (Composer.kt:319)");
        }
        Builder persistentMap$Builder0 = ExtensionsKt.C().builder();
        for(int v1 = 0; v1 < arr_providedValue.length; ++v1) {
            ProvidedValue providedValue0 = arr_providedValue[v1];
            composer0.V(0x2894FF7F);
            if(providedValue0.a() || !ComposerKt.C(persistentMap0, providedValue0.b())) {
                CompositionLocal compositionLocal0 = providedValue0.b();
                L.n(compositionLocal0, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
                persistentMap$Builder0.put(compositionLocal0, providedValue0.b().e(providedValue0.c(), composer0, 8));
            }
            composer0.g0();
        }
        PersistentMap persistentMap1 = persistentMap$Builder0.build();
        if(ComposerKt.g0()) {
            ComposerKt.v0();
        }
        composer0.g0();
        return persistentMap1;
    }

    public static final boolean C(@l PersistentMap persistentMap0, @l CompositionLocal compositionLocal0) {
        L.p(persistentMap0, "<this>");
        L.p(compositionLocal0, "key");
        return persistentMap0.containsKey(compositionLocal0);
    }

    private static final int D(SlotReader slotReader0, int v, int v1) {
        int v2;
        for(v2 = 0; v > 0 && v != v1; ++v2) {
            v = slotReader0.V(v);
        }
        return v2;
    }

    private static final List E(List list0, int v, int v1) {
        List list1 = new ArrayList();
        for(int v2 = ComposerKt.F(list0, v); v2 < list0.size(); ++v2) {
            Invalidation invalidation0 = (Invalidation)list0.get(v2);
            if(invalidation0.b() >= v1) {
                break;
            }
            list1.add(invalidation0);
        }
        return list1;
    }

    private static final int F(List list0, int v) {
        int v1 = ComposerKt.G(list0, v);
        return v1 >= 0 ? v1 : -(v1 + 1);
    }

    private static final int G(List list0, int v) {
        int v1 = list0.size() - 1;
        int v2 = 0;
        while(v2 <= v1) {
            int v3 = v2 + v1 >>> 1;
            int v4 = L.t(((Invalidation)list0.get(v3)).b(), v);
            if(v4 < 0) {
                v2 = v3 + 1;
                continue;
            }
            if(v4 > 0) {
                v1 = v3 - 1;
                continue;
            }
            return v3;
        }
        return -(v2 + 1);
    }

    private static final Invalidation H(List list0, int v, int v1) {
        int v2 = ComposerKt.F(list0, v);
        if(v2 < list0.size()) {
            Invalidation invalidation0 = (Invalidation)list0.get(v2);
            return invalidation0.b() >= v1 ? null : invalidation0;
        }
        return null;
    }

    @l
    public static final Object I() {
        return ComposerKt.o;
    }

    @b0
    public static void J() {
    }

    @b0
    public static void K() {
    }

    private static void L() {
    }

    @l
    public static final Object M() {
        return ComposerKt.k;
    }

    @b0
    public static void N() {
    }

    @b0
    public static void O() {
    }

    private static final Object P(KeyInfo keyInfo0) {
        return keyInfo0.e() != null ? new JoinedKey(keyInfo0.b(), keyInfo0.e()) : keyInfo0.b();
    }

    private static final Object Q(Object object0, Object object1, Object object2) {
        JoinedKey joinedKey0 = object0 instanceof JoinedKey ? ((JoinedKey)object0) : null;
        if(joinedKey0 != null) {
            if(!L.g(joinedKey0.e(), object1) || !L.g(joinedKey0.f(), object2)) {
                object0 = ComposerKt.Q(joinedKey0.e(), object1, object2);
                return object0 == null ? ComposerKt.Q(joinedKey0.f(), object1, object2) : object0;
            }
            return object0;
        }
        return null;
    }

    @l
    public static final Object R() {
        return ComposerKt.m;
    }

    @b0
    public static void S() {
    }

    @b0
    public static void T() {
    }

    @l
    public static final Object U() {
        return ComposerKt.s;
    }

    @b0
    public static void V() {
    }

    @b0
    public static void W() {
    }

    @l
    public static final Object X() {
        return ComposerKt.q;
    }

    @b0
    public static void Y() {
    }

    @b0
    public static void Z() {
    }

    @l
    public static final Object a0() {
        return ComposerKt.u;
    }

    public static final int b(boolean z) {
        return z;
    }

    @b0
    public static void b0() {
    }

    @b0
    public static void c0() {
    }

    @b0
    public static void d0() {
    }

    public static final Object e0(@l PersistentMap persistentMap0, @l CompositionLocal compositionLocal0) {
        L.p(persistentMap0, "<this>");
        L.p(compositionLocal0, "key");
        State state0 = (State)persistentMap0.get(compositionLocal0);
        return state0 == null ? null : state0.getValue();
    }

    private static final void f0(List list0, int v, RecomposeScopeImpl recomposeScopeImpl0, Object object0) {
        int v1 = ComposerKt.G(list0, v);
        IdentityArraySet identityArraySet0 = null;
        if(v1 < 0) {
            if(object0 != null) {
                identityArraySet0 = new IdentityArraySet();
                identityArraySet0.add(object0);
            }
            list0.add(-(v1 + 1), new Invalidation(recomposeScopeImpl0, v, identityArraySet0));
            return;
        }
        if(object0 == null) {
            ((Invalidation)list0.get(v1)).e(null);
            return;
        }
        IdentityArraySet identityArraySet1 = ((Invalidation)list0.get(v1)).a();
        if(identityArraySet1 != null) {
            identityArraySet1.add(object0);
        }
    }

    @ComposeCompilerApi
    public static final boolean g0() {
        return ComposerKt.a != null && ComposerKt.a.a();
    }

    private static final HashMap h0() {
        return new HashMap();
    }

    @l
    public static final PersistentMap i0(@l PersistentMap persistentMap0, @l Function1 function10) {
        L.p(persistentMap0, "<this>");
        L.p(function10, "mutator");
        Builder persistentMap$Builder0 = persistentMap0.builder();
        function10.invoke(persistentMap$Builder0);
        return persistentMap$Builder0.build();
    }

    private static final int j0(SlotReader slotReader0, int v, int v1, int v2) {
        if(v == v1) {
            return v;
        }
        if(v != v2 && v1 != v2) {
            if(slotReader0.V(v) == v1) {
                return v1;
            }
            if(slotReader0.V(v1) == v) {
                return v;
            }
            if(slotReader0.V(v) == slotReader0.V(v1)) {
                return slotReader0.V(v);
            }
            int v3 = ComposerKt.D(slotReader0, v, v2);
            int v4 = ComposerKt.D(slotReader0, v1, v2);
            for(int v6 = 0; v6 < v3 - v4; ++v6) {
                v = slotReader0.V(v);
            }
            for(int v5 = 0; v5 < v4 - v3; ++v5) {
                v1 = slotReader0.V(v1);
            }
            while(v != v1) {
                v = slotReader0.V(v);
                v1 = slotReader0.V(v1);
            }
            return v;
        }
        return v2;
    }

    private static final Object k0(HashMap hashMap0, Object object0) {
        LinkedHashSet linkedHashSet0 = (LinkedHashSet)hashMap0.get(object0);
        if(linkedHashSet0 != null) {
            Object object1 = u.E2(linkedHashSet0);
            if(object1 != null) {
                ComposerKt.m0(hashMap0, object0, object1);
                return object1;
            }
        }
        return null;
    }

    private static final boolean l0(HashMap hashMap0, Object object0, Object object1) {
        LinkedHashSet linkedHashSet0 = hashMap0.get(object0);
        if(linkedHashSet0 == null) {
            linkedHashSet0 = new LinkedHashSet();
            hashMap0.put(object0, linkedHashSet0);
        }
        return linkedHashSet0.add(object1);
    }

    private static final S0 m0(HashMap hashMap0, Object object0, Object object1) {
        LinkedHashSet linkedHashSet0 = (LinkedHashSet)hashMap0.get(object0);
        if(linkedHashSet0 != null) {
            linkedHashSet0.remove(object1);
            if(linkedHashSet0.isEmpty()) {
                hashMap0.remove(object0);
            }
            return S0.a;
        }
        return null;
    }

    public static final void n0(@l SlotWriter slotWriter0, @l RememberManager rememberManager0) {
        L.p(slotWriter0, "<this>");
        L.p(rememberManager0, "rememberManager");
        Iterator iterator0 = slotWriter0.j0();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(object0 instanceof ComposeNodeLifecycleCallback) {
                rememberManager0.d(((ComposeNodeLifecycleCallback)object0));
            }
            if(object0 instanceof RememberObserver) {
                rememberManager0.a(((RememberObserver)object0));
            }
            if(object0 instanceof RecomposeScopeImpl) {
                CompositionImpl compositionImpl0 = ((RecomposeScopeImpl)object0).l();
                if(compositionImpl0 != null) {
                    compositionImpl0.T(true);
                    ((RecomposeScopeImpl)object0).x();
                }
            }
        }
        slotWriter0.Q0();
    }

    private static final Invalidation o0(List list0, int v) {
        int v1 = ComposerKt.G(list0, v);
        return v1 < 0 ? null : ((Invalidation)list0.remove(v1));
    }

    private static final void p0(List list0, int v, int v1) {
        int v2 = ComposerKt.F(list0, v);
        while(v2 < list0.size() && ((Invalidation)list0.get(v2)).b() < v1) {
            list0.remove(v2);
        }
    }

    public static final void q0(boolean z) {
        if(z) {
            return;
        }
        ComposerKt.A("Check failed");
        throw new y();
    }

    public static final void r0(boolean z, @l a a0) {
        L.p(a0, "lazyMessage");
        if(z) {
            return;
        }
        ComposerKt.A(a0.invoke().toString());
        throw new y();
    }

    @ComposeCompilerApi
    public static final void s0(@l Composer composer0, @l String s) {
        L.p(composer0, "composer");
        L.p(s, "sourceInformation");
        composer0.l(s);
    }

    @ComposeCompilerApi
    public static final void t0(@l Composer composer0) {
        L.p(composer0, "composer");
        composer0.s();
    }

    @ComposeCompilerApi
    public static final void u0(@l Composer composer0, int v, @l String s) {
        L.p(composer0, "composer");
        L.p(s, "sourceInformation");
        composer0.n(v, s);
    }

    private static final boolean v(int v) {
        return v != 0;
    }

    @ComposeCompilerApi
    public static final void v0() {
        CompositionTracer compositionTracer0 = ComposerKt.a;
        if(compositionTracer0 != null) {
            compositionTracer0.c();
        }
    }

    private static final int w(boolean z) [...] // Inlined contents

    @ComposeCompilerApi
    public static final void w0(int v, int v1, int v2, @l String s) {
        L.p(s, "info");
        CompositionTracer compositionTracer0 = ComposerKt.a;
        if(compositionTracer0 != null) {
            compositionTracer0.b(v, v1, v2, s);
        }
    }

    @ComposeCompilerApi
    public static final Object x(@l Composer composer0, boolean z, @l a a0) {
        L.p(composer0, "<this>");
        L.p(a0, "block");
        Object object0 = composer0.W();
        if(z || object0 == Composer.a.a()) {
            object0 = a0.invoke();
            composer0.O(object0);
        }
        return object0;
    }

    @ComposeCompilerApi
    @k(level = kotlin.m.c, message = "Use the overload with $dirty metadata instead", replaceWith = @c0(expression = "traceEventStart(key, dirty1, dirty2, info)", imports = {}))
    public static final void x0(int v, String s) {
        L.p(s, "info");
        ComposerKt.w0(v, -1, -1, s);
    }

    private static final List y(SlotTable slotTable0, Anchor anchor0) {
        List list0 = new ArrayList();
        SlotReader slotReader0 = slotTable0.E();
        try {
            ComposerKt.z(slotReader0, list0, slotTable0.d(anchor0));
            return list0;
        }
        finally {
            slotReader0.e();
        }
    }

    private static final void z(SlotReader slotReader0, List list0, int v) {
        if(slotReader0.P(v)) {
            list0.add(slotReader0.R(v));
            return;
        }
        int v1 = v + 1;
        int v2 = slotReader0.K(v);
        while(v1 < v + v2) {
            ComposerKt.z(slotReader0, list0, v1);
            v1 += slotReader0.K(v1);
        }
    }
}

