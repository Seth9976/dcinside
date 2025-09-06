package androidx.compose.runtime.external.kotlinx.collections.immutable;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSetBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import kotlin.V;
import kotlin.c0;
import kotlin.collections.Y;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.k;
import kotlin.sequences.m;
import kotlin.text.v;
import y4.l;

@s0({"SMAP\nextensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,741:1\n41#1:743\n41#1:744\n41#1:745\n41#1:746\n41#1:747\n41#1:748\n31#1:749\n31#1:750\n31#1:751\n31#1:752\n31#1:753\n31#1:754\n31#1:755\n53#1:756\n53#1:757\n53#1:758\n53#1:759\n53#1:760\n53#1:761\n53#1:762\n53#1:763\n41#1:764\n31#1:765\n31#1:766\n1#2:742\n*S KotlinDebug\n*F\n+ 1 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n*L\n158#1:743\n169#1:744\n180#1:745\n192#1:746\n203#1:747\n214#1:748\n241#1:749\n250#1:750\n259#1:751\n271#1:752\n282#1:753\n293#1:754\n304#1:755\n385#1:756\n394#1:757\n403#1:758\n423#1:759\n432#1:760\n441#1:761\n489#1:762\n505#1:763\n616#1:764\n672#1:765\n701#1:766\n*E\n"})
public final class ExtensionsKt {
    @l
    public static final PersistentMap A(@l PersistentMap persistentMap0, @l Function1 function10) {
        L.p(persistentMap0, "<this>");
        L.p(function10, "mutator");
        Builder persistentMap$Builder0 = persistentMap0.builder();
        function10.invoke(persistentMap$Builder0);
        return persistentMap$Builder0.build();
    }

    @l
    public static final PersistentSet B(@l PersistentSet persistentSet0, @l Function1 function10) {
        L.p(persistentSet0, "<this>");
        L.p(function10, "mutator");
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet.Builder persistentSet$Builder0 = persistentSet0.builder();
        function10.invoke(persistentSet$Builder0);
        return persistentSet$Builder0.build();
    }

    @l
    public static final PersistentMap C() {
        return PersistentHashMap.f.a();
    }

    @l
    public static final PersistentMap D(@l V[] arr_v) {
        L.p(arr_v, "pairs");
        PersistentHashMap persistentHashMap0 = PersistentHashMap.f.a();
        L.n(persistentHashMap0, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        Builder persistentMap$Builder0 = persistentHashMap0.builder();
        Y.y0(persistentMap$Builder0, arr_v);
        return persistentMap$Builder0.build();
    }

    @l
    public static final PersistentSet E() {
        return PersistentHashSet.d.a();
    }

    @l
    public static final PersistentSet F(@l Object[] arr_object) {
        L.p(arr_object, "elements");
        return PersistentHashSet.d.a().addAll(kotlin.collections.l.t(arr_object));
    }

    @l
    public static final PersistentList G() {
        return UtilsKt.b();
    }

    @l
    public static final PersistentList H(@l Object[] arr_object) {
        L.p(arr_object, "elements");
        return UtilsKt.b().addAll(kotlin.collections.l.t(arr_object));
    }

    @l
    public static final PersistentMap I() {
        return PersistentOrderedMap.g.a();
    }

    @l
    public static final PersistentMap J(@l V[] arr_v) {
        L.p(arr_v, "pairs");
        PersistentOrderedMap persistentOrderedMap0 = PersistentOrderedMap.g.a();
        L.n(persistentOrderedMap0, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate, V of androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt.mutate>");
        Builder persistentMap$Builder0 = persistentOrderedMap0.builder();
        Y.y0(persistentMap$Builder0, arr_v);
        return persistentMap$Builder0.build();
    }

    @l
    public static final PersistentSet K() {
        return PersistentOrderedSet.e.a();
    }

    @l
    public static final PersistentSet L(@l Object[] arr_object) {
        L.p(arr_object, "elements");
        return PersistentOrderedSet.e.a().addAll(kotlin.collections.l.t(arr_object));
    }

    @l
    public static final PersistentCollection M(@l PersistentCollection persistentCollection0, @l Iterable iterable0) {
        L.p(persistentCollection0, "<this>");
        L.p(iterable0, "elements");
        if(iterable0 instanceof Collection) {
            return persistentCollection0.addAll(((Collection)iterable0));
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder persistentCollection$Builder0 = persistentCollection0.builder();
        u.q0(persistentCollection$Builder0, iterable0);
        return persistentCollection$Builder0.build();
    }

    @l
    public static final PersistentCollection N(@l PersistentCollection persistentCollection0, Object object0) {
        L.p(persistentCollection0, "<this>");
        return persistentCollection0.add(object0);
    }

    @l
    public static final PersistentCollection O(@l PersistentCollection persistentCollection0, @l m m0) {
        L.p(persistentCollection0, "<this>");
        L.p(m0, "elements");
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder persistentCollection$Builder0 = persistentCollection0.builder();
        u.r0(persistentCollection$Builder0, m0);
        return persistentCollection$Builder0.build();
    }

    @l
    public static final PersistentCollection P(@l PersistentCollection persistentCollection0, @l Object[] arr_object) {
        L.p(persistentCollection0, "<this>");
        L.p(arr_object, "elements");
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder persistentCollection$Builder0 = persistentCollection0.builder();
        u.s0(persistentCollection$Builder0, arr_object);
        return persistentCollection$Builder0.build();
    }

    @l
    public static final PersistentList Q(@l PersistentList persistentList0, @l Iterable iterable0) {
        L.p(persistentList0, "<this>");
        L.p(iterable0, "elements");
        if(iterable0 instanceof Collection) {
            return persistentList0.addAll(((Collection)iterable0));
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder persistentList$Builder0 = persistentList0.builder();
        u.q0(persistentList$Builder0, iterable0);
        return persistentList$Builder0.build();
    }

    @l
    public static final PersistentList R(@l PersistentList persistentList0, Object object0) {
        L.p(persistentList0, "<this>");
        return persistentList0.add(object0);
    }

    @l
    public static final PersistentList S(@l PersistentList persistentList0, @l m m0) {
        L.p(persistentList0, "<this>");
        L.p(m0, "elements");
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder persistentList$Builder0 = persistentList0.builder();
        u.r0(persistentList$Builder0, m0);
        return persistentList$Builder0.build();
    }

    @l
    public static final PersistentList T(@l PersistentList persistentList0, @l Object[] arr_object) {
        L.p(persistentList0, "<this>");
        L.p(arr_object, "elements");
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder persistentList$Builder0 = persistentList0.builder();
        u.s0(persistentList$Builder0, arr_object);
        return persistentList$Builder0.build();
    }

    @l
    public static final PersistentMap U(@l PersistentMap persistentMap0, @l Iterable iterable0) {
        L.p(persistentMap0, "<this>");
        L.p(iterable0, "pairs");
        return ExtensionsKt.d0(persistentMap0, iterable0);
    }

    @l
    public static final PersistentMap V(@l PersistentMap persistentMap0, @l Map map0) {
        L.p(persistentMap0, "<this>");
        L.p(map0, "map");
        return ExtensionsKt.e0(persistentMap0, map0);
    }

    @l
    public static final PersistentMap W(@l PersistentMap persistentMap0, @l V v0) {
        L.p(persistentMap0, "<this>");
        L.p(v0, "pair");
        return persistentMap0.put(v0.e(), v0.f());
    }

    @l
    public static final PersistentMap X(@l PersistentMap persistentMap0, @l m m0) {
        L.p(persistentMap0, "<this>");
        L.p(m0, "pairs");
        return ExtensionsKt.f0(persistentMap0, m0);
    }

    @l
    public static final PersistentMap Y(@l PersistentMap persistentMap0, @l V[] arr_v) {
        L.p(persistentMap0, "<this>");
        L.p(arr_v, "pairs");
        return ExtensionsKt.g0(persistentMap0, arr_v);
    }

    @l
    public static final PersistentSet Z(@l PersistentSet persistentSet0, @l Iterable iterable0) {
        L.p(persistentSet0, "<this>");
        L.p(iterable0, "elements");
        if(iterable0 instanceof Collection) {
            return persistentSet0.addAll(((Collection)iterable0));
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet.Builder persistentSet$Builder0 = persistentSet0.builder();
        u.q0(persistentSet$Builder0, iterable0);
        return persistentSet$Builder0.build();
    }

    @k(message = "Use persistentHashMapOf instead.", replaceWith = @c0(expression = "persistentHashMapOf(*pairs)", imports = {}))
    @l
    public static final PersistentMap a(@l V[] arr_v) {
        L.p(arr_v, "pairs");
        return ExtensionsKt.D(((V[])Arrays.copyOf(arr_v, arr_v.length)));
    }

    @l
    public static final PersistentSet a0(@l PersistentSet persistentSet0, Object object0) {
        L.p(persistentSet0, "<this>");
        return persistentSet0.add(object0);
    }

    @k(message = "Use persistentHashSetOf instead.", replaceWith = @c0(expression = "persistentHashSetOf(*elements)", imports = {}))
    @l
    public static final PersistentSet b(@l Object[] arr_object) {
        L.p(arr_object, "elements");
        return ExtensionsKt.F(Arrays.copyOf(arr_object, arr_object.length));
    }

    @l
    public static final PersistentSet b0(@l PersistentSet persistentSet0, @l m m0) {
        L.p(persistentSet0, "<this>");
        L.p(m0, "elements");
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet.Builder persistentSet$Builder0 = persistentSet0.builder();
        u.r0(persistentSet$Builder0, m0);
        return persistentSet$Builder0.build();
    }

    @k(message = "Use persistentListOf instead.", replaceWith = @c0(expression = "persistentListOf()", imports = {}))
    @l
    public static final PersistentList c() {
        return ExtensionsKt.G();
    }

    @l
    public static final PersistentSet c0(@l PersistentSet persistentSet0, @l Object[] arr_object) {
        L.p(persistentSet0, "<this>");
        L.p(arr_object, "elements");
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet.Builder persistentSet$Builder0 = persistentSet0.builder();
        u.s0(persistentSet$Builder0, arr_object);
        return persistentSet$Builder0.build();
    }

    @k(message = "Use persistentListOf instead.", replaceWith = @c0(expression = "persistentListOf(*elements)", imports = {}))
    @l
    public static final PersistentList d(@l Object[] arr_object) {
        L.p(arr_object, "elements");
        return ExtensionsKt.H(Arrays.copyOf(arr_object, arr_object.length));
    }

    @l
    public static final PersistentMap d0(@l PersistentMap persistentMap0, @l Iterable iterable0) {
        L.p(persistentMap0, "<this>");
        L.p(iterable0, "pairs");
        Builder persistentMap$Builder0 = persistentMap0.builder();
        Y.w0(persistentMap$Builder0, iterable0);
        return persistentMap$Builder0.build();
    }

    @k(message = "Use persistentMapOf instead.", replaceWith = @c0(expression = "persistentMapOf(*pairs)", imports = {}))
    @l
    public static final PersistentMap e(@l V[] arr_v) {
        L.p(arr_v, "pairs");
        return ExtensionsKt.J(((V[])Arrays.copyOf(arr_v, arr_v.length)));
    }

    @l
    public static final PersistentMap e0(@l PersistentMap persistentMap0, @l Map map0) {
        L.p(persistentMap0, "<this>");
        L.p(map0, "map");
        return persistentMap0.putAll(map0);
    }

    @k(message = "Use persistentSetOf instead.", replaceWith = @c0(expression = "persistentSetOf()", imports = {}))
    @l
    public static final PersistentSet f() {
        return ExtensionsKt.K();
    }

    @l
    public static final PersistentMap f0(@l PersistentMap persistentMap0, @l m m0) {
        L.p(persistentMap0, "<this>");
        L.p(m0, "pairs");
        Builder persistentMap$Builder0 = persistentMap0.builder();
        Y.x0(persistentMap$Builder0, m0);
        return persistentMap$Builder0.build();
    }

    @k(message = "Use persistentSetOf instead.", replaceWith = @c0(expression = "persistentSetOf(*elements)", imports = {}))
    @l
    public static final PersistentSet g(@l Object[] arr_object) {
        L.p(arr_object, "elements");
        return ExtensionsKt.L(Arrays.copyOf(arr_object, arr_object.length));
    }

    @l
    public static final PersistentMap g0(@l PersistentMap persistentMap0, @l V[] arr_v) {
        L.p(persistentMap0, "<this>");
        L.p(arr_v, "pairs");
        Builder persistentMap$Builder0 = persistentMap0.builder();
        Y.y0(persistentMap$Builder0, arr_v);
        return persistentMap$Builder0.build();
    }

    @l
    public static final PersistentSet h(@l PersistentCollection persistentCollection0, @l Iterable iterable0) {
        L.p(persistentCollection0, "<this>");
        L.p(iterable0, "elements");
        return ExtensionsKt.i(ExtensionsKt.x0(persistentCollection0), iterable0);
    }

    @l
    public static final ImmutableList h0(@l CharSequence charSequence0) {
        L.p(charSequence0, "<this>");
        return ExtensionsKt.s0(charSequence0);
    }

    @l
    public static final PersistentSet i(@l PersistentSet persistentSet0, @l Iterable iterable0) {
        L.p(persistentSet0, "<this>");
        L.p(iterable0, "elements");
        if(iterable0 instanceof Collection) {
            return persistentSet0.retainAll(((Collection)iterable0));
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet.Builder persistentSet$Builder0 = persistentSet0.builder();
        u.R0(persistentSet$Builder0, iterable0);
        return persistentSet$Builder0.build();
    }

    @l
    public static final ImmutableList i0(@l Iterable iterable0) {
        L.p(iterable0, "<this>");
        ImmutableList immutableList0 = iterable0 instanceof ImmutableList ? ((ImmutableList)iterable0) : null;
        return immutableList0 == null ? ExtensionsKt.t0(iterable0) : immutableList0;
    }

    @l
    public static final PersistentCollection j(@l PersistentCollection persistentCollection0, @l Iterable iterable0) {
        L.p(persistentCollection0, "<this>");
        L.p(iterable0, "elements");
        if(iterable0 instanceof Collection) {
            return persistentCollection0.removeAll(((Collection)iterable0));
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder persistentCollection$Builder0 = persistentCollection0.builder();
        u.H0(persistentCollection$Builder0, iterable0);
        return persistentCollection$Builder0.build();
    }

    @l
    public static final ImmutableList j0(@l m m0) {
        L.p(m0, "<this>");
        return ExtensionsKt.u0(m0);
    }

    @l
    public static final PersistentCollection k(@l PersistentCollection persistentCollection0, Object object0) {
        L.p(persistentCollection0, "<this>");
        return persistentCollection0.remove(object0);
    }

    @l
    public static final ImmutableMap k0(@l Map map0) {
        L.p(map0, "<this>");
        PersistentMap persistentMap0 = null;
        ImmutableMap immutableMap0 = map0 instanceof ImmutableMap ? ((ImmutableMap)map0) : null;
        if(immutableMap0 == null) {
            Builder persistentMap$Builder0 = map0 instanceof Builder ? ((Builder)map0) : null;
            if(persistentMap$Builder0 != null) {
                persistentMap0 = persistentMap$Builder0.build();
            }
            return persistentMap0 == null ? ExtensionsKt.I().putAll(map0) : persistentMap0;
        }
        return immutableMap0;
    }

    @l
    public static final PersistentCollection l(@l PersistentCollection persistentCollection0, @l m m0) {
        L.p(persistentCollection0, "<this>");
        L.p(m0, "elements");
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder persistentCollection$Builder0 = persistentCollection0.builder();
        u.J0(persistentCollection$Builder0, m0);
        return persistentCollection$Builder0.build();
    }

    @l
    public static final ImmutableSet l0(@l Iterable iterable0) {
        L.p(iterable0, "<this>");
        PersistentSet persistentSet0 = null;
        ImmutableSet immutableSet0 = iterable0 instanceof ImmutableSet ? ((ImmutableSet)iterable0) : null;
        if(immutableSet0 == null) {
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet.Builder persistentSet$Builder0 = iterable0 instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet.Builder ? ((androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet.Builder)iterable0) : null;
            if(persistentSet$Builder0 != null) {
                persistentSet0 = persistentSet$Builder0.build();
            }
            return persistentSet0 == null ? ExtensionsKt.Z(ExtensionsKt.K(), iterable0) : persistentSet0;
        }
        return immutableSet0;
    }

    @l
    public static final PersistentCollection m(@l PersistentCollection persistentCollection0, @l Object[] arr_object) {
        L.p(persistentCollection0, "<this>");
        L.p(arr_object, "elements");
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder persistentCollection$Builder0 = persistentCollection0.builder();
        u.K0(persistentCollection$Builder0, arr_object);
        return persistentCollection$Builder0.build();
    }

    @l
    public static final ImmutableSet m0(@l m m0) {
        L.p(m0, "<this>");
        return ExtensionsKt.y0(m0);
    }

    @l
    public static final PersistentList n(@l PersistentList persistentList0, @l Iterable iterable0) {
        L.p(persistentList0, "<this>");
        L.p(iterable0, "elements");
        if(iterable0 instanceof Collection) {
            return persistentList0.removeAll(((Collection)iterable0));
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder persistentList$Builder0 = persistentList0.builder();
        u.H0(persistentList$Builder0, iterable0);
        return persistentList$Builder0.build();
    }

    @l
    public static final PersistentSet n0(@l CharSequence charSequence0) {
        L.p(charSequence0, "<this>");
        return ExtensionsKt.w0(charSequence0);
    }

    @l
    public static final PersistentList o(@l PersistentList persistentList0, Object object0) {
        L.p(persistentList0, "<this>");
        return persistentList0.remove(object0);
    }

    @l
    public static final PersistentMap o0(@l Map map0) {
        L.p(map0, "<this>");
        PersistentHashMap persistentHashMap0 = null;
        PersistentMap persistentMap0 = map0 instanceof PersistentHashMap ? ((PersistentHashMap)map0) : null;
        if(persistentMap0 == null) {
            PersistentHashMapBuilder persistentHashMapBuilder0 = map0 instanceof PersistentHashMapBuilder ? ((PersistentHashMapBuilder)map0) : null;
            if(persistentHashMapBuilder0 != null) {
                persistentHashMap0 = persistentHashMapBuilder0.f();
            }
            return persistentHashMap0 != null ? persistentHashMap0 : PersistentHashMap.f.a().putAll(map0);
        }
        return persistentMap0;
    }

    @l
    public static final PersistentList p(@l PersistentList persistentList0, @l m m0) {
        L.p(persistentList0, "<this>");
        L.p(m0, "elements");
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder persistentList$Builder0 = persistentList0.builder();
        u.J0(persistentList$Builder0, m0);
        return persistentList$Builder0.build();
    }

    @l
    public static final PersistentSet p0(@l CharSequence charSequence0) {
        L.p(charSequence0, "<this>");
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet.Builder persistentSet$Builder0 = ExtensionsKt.E().builder();
        v.g9(charSequence0, persistentSet$Builder0);
        return persistentSet$Builder0.build();
    }

    @l
    public static final PersistentList q(@l PersistentList persistentList0, @l Object[] arr_object) {
        L.p(persistentList0, "<this>");
        L.p(arr_object, "elements");
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder persistentList$Builder0 = persistentList0.builder();
        u.K0(persistentList$Builder0, arr_object);
        return persistentList$Builder0.build();
    }

    @l
    public static final PersistentSet q0(@l Iterable iterable0) {
        L.p(iterable0, "<this>");
        PersistentHashSet persistentHashSet0 = null;
        PersistentSet persistentSet0 = iterable0 instanceof PersistentHashSet ? ((PersistentHashSet)iterable0) : null;
        if(persistentSet0 == null) {
            PersistentHashSetBuilder persistentHashSetBuilder0 = iterable0 instanceof PersistentHashSetBuilder ? ((PersistentHashSetBuilder)iterable0) : null;
            if(persistentHashSetBuilder0 != null) {
                persistentHashSet0 = persistentHashSetBuilder0.b();
            }
            return persistentHashSet0 != null ? persistentHashSet0 : ExtensionsKt.Z(PersistentHashSet.d.a(), iterable0);
        }
        return persistentSet0;
    }

    @l
    public static final PersistentMap r(@l PersistentMap persistentMap0, @l Iterable iterable0) {
        L.p(persistentMap0, "<this>");
        L.p(iterable0, "keys");
        Builder persistentMap$Builder0 = persistentMap0.builder();
        u.H0(persistentMap$Builder0.keySet(), iterable0);
        return persistentMap$Builder0.build();
    }

    @l
    public static final PersistentSet r0(@l m m0) {
        L.p(m0, "<this>");
        return ExtensionsKt.b0(ExtensionsKt.E(), m0);
    }

    @l
    public static final PersistentMap s(@l PersistentMap persistentMap0, Object object0) {
        L.p(persistentMap0, "<this>");
        return persistentMap0.remove(object0);
    }

    @l
    public static final PersistentList s0(@l CharSequence charSequence0) {
        L.p(charSequence0, "<this>");
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder persistentList$Builder0 = ExtensionsKt.G().builder();
        v.g9(charSequence0, persistentList$Builder0);
        return persistentList$Builder0.build();
    }

    @l
    public static final PersistentMap t(@l PersistentMap persistentMap0, @l m m0) {
        L.p(persistentMap0, "<this>");
        L.p(m0, "keys");
        Builder persistentMap$Builder0 = persistentMap0.builder();
        u.J0(persistentMap$Builder0.keySet(), m0);
        return persistentMap$Builder0.build();
    }

    @l
    public static final PersistentList t0(@l Iterable iterable0) {
        L.p(iterable0, "<this>");
        PersistentList persistentList0 = null;
        PersistentList persistentList1 = iterable0 instanceof PersistentList ? ((PersistentList)iterable0) : null;
        if(persistentList1 == null) {
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder persistentList$Builder0 = iterable0 instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder ? ((androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder)iterable0) : null;
            if(persistentList$Builder0 != null) {
                persistentList0 = persistentList$Builder0.build();
            }
            return persistentList0 == null ? ExtensionsKt.Q(ExtensionsKt.G(), iterable0) : persistentList0;
        }
        return persistentList1;
    }

    @l
    public static final PersistentMap u(@l PersistentMap persistentMap0, @l Object[] arr_object) {
        L.p(persistentMap0, "<this>");
        L.p(arr_object, "keys");
        Builder persistentMap$Builder0 = persistentMap0.builder();
        u.K0(persistentMap$Builder0.keySet(), arr_object);
        return persistentMap$Builder0.build();
    }

    @l
    public static final PersistentList u0(@l m m0) {
        L.p(m0, "<this>");
        return ExtensionsKt.S(ExtensionsKt.G(), m0);
    }

    @l
    public static final PersistentSet v(@l PersistentSet persistentSet0, @l Iterable iterable0) {
        L.p(persistentSet0, "<this>");
        L.p(iterable0, "elements");
        if(iterable0 instanceof Collection) {
            return persistentSet0.removeAll(((Collection)iterable0));
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet.Builder persistentSet$Builder0 = persistentSet0.builder();
        u.H0(persistentSet$Builder0, iterable0);
        return persistentSet$Builder0.build();
    }

    @l
    public static final PersistentMap v0(@l Map map0) {
        L.p(map0, "<this>");
        PersistentMap persistentMap0 = null;
        PersistentMap persistentMap1 = map0 instanceof PersistentOrderedMap ? ((PersistentOrderedMap)map0) : null;
        if(persistentMap1 == null) {
            PersistentOrderedMapBuilder persistentOrderedMapBuilder0 = map0 instanceof PersistentOrderedMapBuilder ? ((PersistentOrderedMapBuilder)map0) : null;
            if(persistentOrderedMapBuilder0 != null) {
                persistentMap0 = persistentOrderedMapBuilder0.build();
            }
            return persistentMap0 == null ? PersistentOrderedMap.g.a().putAll(map0) : persistentMap0;
        }
        return persistentMap1;
    }

    @l
    public static final PersistentSet w(@l PersistentSet persistentSet0, Object object0) {
        L.p(persistentSet0, "<this>");
        return persistentSet0.remove(object0);
    }

    @l
    public static final PersistentSet w0(@l CharSequence charSequence0) {
        L.p(charSequence0, "<this>");
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet.Builder persistentSet$Builder0 = ExtensionsKt.K().builder();
        v.g9(charSequence0, persistentSet$Builder0);
        return persistentSet$Builder0.build();
    }

    @l
    public static final PersistentSet x(@l PersistentSet persistentSet0, @l m m0) {
        L.p(persistentSet0, "<this>");
        L.p(m0, "elements");
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet.Builder persistentSet$Builder0 = persistentSet0.builder();
        u.J0(persistentSet$Builder0, m0);
        return persistentSet$Builder0.build();
    }

    @l
    public static final PersistentSet x0(@l Iterable iterable0) {
        L.p(iterable0, "<this>");
        PersistentSet persistentSet0 = null;
        PersistentSet persistentSet1 = iterable0 instanceof PersistentOrderedSet ? ((PersistentOrderedSet)iterable0) : null;
        if(persistentSet1 == null) {
            PersistentOrderedSetBuilder persistentOrderedSetBuilder0 = iterable0 instanceof PersistentOrderedSetBuilder ? ((PersistentOrderedSetBuilder)iterable0) : null;
            if(persistentOrderedSetBuilder0 != null) {
                persistentSet0 = persistentOrderedSetBuilder0.build();
            }
            return persistentSet0 == null ? ExtensionsKt.Z(PersistentOrderedSet.e.a(), iterable0) : persistentSet0;
        }
        return persistentSet1;
    }

    @l
    public static final PersistentSet y(@l PersistentSet persistentSet0, @l Object[] arr_object) {
        L.p(persistentSet0, "<this>");
        L.p(arr_object, "elements");
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet.Builder persistentSet$Builder0 = persistentSet0.builder();
        u.K0(persistentSet$Builder0, arr_object);
        return persistentSet$Builder0.build();
    }

    @l
    public static final PersistentSet y0(@l m m0) {
        L.p(m0, "<this>");
        return ExtensionsKt.b0(ExtensionsKt.K(), m0);
    }

    @l
    public static final PersistentList z(@l PersistentList persistentList0, @l Function1 function10) {
        L.p(persistentList0, "<this>");
        L.p(function10, "mutator");
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder persistentList$Builder0 = persistentList0.builder();
        function10.invoke(persistentList$Builder0);
        return persistentList$Builder0.build();
    }
}

