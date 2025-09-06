package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.collection.IdentityArraySet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.u;
import kotlin.coroutines.g;
import kotlin.coroutines.i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.r0;
import y4.l;

@s0({"SMAP\nComposition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1257:1\n1549#2:1258\n1620#2,3:1259\n1#3:1262\n*S KotlinDebug\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionKt\n*L\n1227#1:1258\n1227#1:1259,3\n*E\n"})
public final class CompositionKt {
    @l
    private static final Object a;

    static {
        CompositionKt.a = new Object();
    }

    @l
    public static final Composition a(@l Applier applier0, @l CompositionContext compositionContext0) {
        L.p(applier0, "applier");
        L.p(compositionContext0, "parent");
        return new CompositionImpl(compositionContext0, applier0, null, 4, null);
    }

    @ExperimentalComposeApi
    @l
    public static final Composition b(@l Applier applier0, @l CompositionContext compositionContext0, @l g g0) {
        L.p(applier0, "applier");
        L.p(compositionContext0, "parent");
        L.p(g0, "recomposeCoroutineContext");
        return new CompositionImpl(compositionContext0, applier0, g0);
    }

    @l
    public static final ControlledComposition c(@l Applier applier0, @l CompositionContext compositionContext0) {
        L.p(applier0, "applier");
        L.p(compositionContext0, "parent");
        return new CompositionImpl(compositionContext0, applier0, null, 4, null);
    }

    @ExperimentalComposeApi
    @l
    public static final ControlledComposition d(@l Applier applier0, @l CompositionContext compositionContext0, @l g g0) {
        L.p(applier0, "applier");
        L.p(compositionContext0, "parent");
        L.p(g0, "recomposeCoroutineContext");
        return new CompositionImpl(compositionContext0, applier0, g0);
    }

    private static final void g(IdentityArrayMap identityArrayMap0, Object object0, Object object1) {
        if(identityArrayMap0.b(object0)) {
            IdentityArraySet identityArraySet0 = (IdentityArraySet)identityArrayMap0.f(object0);
            if(identityArraySet0 != null) {
                identityArraySet0.add(object1);
            }
        }
        else {
            IdentityArraySet identityArraySet1 = new IdentityArraySet();
            identityArraySet1.add(object1);
            identityArrayMap0.o(object0, identityArraySet1);
        }
    }

    public static final void h() {
        HotReloader.a.a();
    }

    @l
    public static final List i() {
        Iterable iterable0 = HotReloader.a.b();
        List list0 = new ArrayList(u.b0(iterable0, 10));
        for(Object object0: iterable0) {
            list0.add(r0.a(((RecomposerErrorInfo)object0).a(), Boolean.valueOf(((RecomposerErrorInfo)object0).b())));
        }
        return list0;
    }

    @ExperimentalComposeApi
    @l
    public static final g j(@l ControlledComposition controlledComposition0) {
        L.p(controlledComposition0, "<this>");
        CompositionImpl compositionImpl0 = controlledComposition0 instanceof CompositionImpl ? ((CompositionImpl)controlledComposition0) : null;
        if(compositionImpl0 != null) {
            g g0 = compositionImpl0.H();
            if(g0 != null) {
                return g0;
            }
        }
        return i.a;
    }

    @ExperimentalComposeApi
    public static void k(ControlledComposition controlledComposition0) {
    }

    public static final void l(int v) {
        HotReloader.a.c(v);
    }

    private static final void m(HashSet hashSet0, Function1 function10) {
        Iterator iterator0 = hashSet0.iterator();
        L.o(iterator0, "iterator()");
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            if(((Boolean)function10.invoke(object0)).booleanValue()) {
                iterator0.remove();
            }
        }
    }

    public static final void n(@l Object object0) {
        L.p(object0, "context");
        HotReloader.a.f(object0);
    }
}

