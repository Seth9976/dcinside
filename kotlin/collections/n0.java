package kotlin.collections;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.internal.f;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.sequences.m;
import y4.l;

@s0({"SMAP\n_Sets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Sets.kt\nkotlin/collections/SetsKt___SetsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,140:1\n865#2,2:141\n855#2,2:143\n1#3:145\n*S KotlinDebug\n*F\n+ 1 _Sets.kt\nkotlin/collections/SetsKt___SetsKt\n*L\n29#1:141,2\n53#1:143,2\n*E\n"})
class n0 extends m0 {
    @l
    public static final Set A(@l Set set0, @l Object[] arr_object) {
        L.p(set0, "<this>");
        L.p(arr_object, "elements");
        Set set1 = new LinkedHashSet(set0);
        u.K0(set1, arr_object);
        return set1;
    }

    @f
    private static final Set B(Set set0, Object object0) {
        L.p(set0, "<this>");
        return k0.y(set0, object0);
    }

    @l
    public static Set C(@l Set set0, @l Iterable iterable0) {
        L.p(set0, "<this>");
        L.p(iterable0, "elements");
        Integer integer0 = x.c0(iterable0);
        Set set1 = new LinkedHashSet(Y.j((integer0 == null ? set0.size() * 2 : set0.size() + integer0.intValue())));
        ((AbstractCollection)set1).addAll(set0);
        u.q0(set1, iterable0);
        return set1;
    }

    @l
    public static Set D(@l Set set0, Object object0) {
        L.p(set0, "<this>");
        Set set1 = new LinkedHashSet(Y.j(set0.size() + 1));
        ((AbstractCollection)set1).addAll(set0);
        ((AbstractCollection)set1).add(object0);
        return set1;
    }

    @l
    public static final Set E(@l Set set0, @l m m0) {
        L.p(set0, "<this>");
        L.p(m0, "elements");
        Set set1 = new LinkedHashSet(Y.j(set0.size() * 2));
        ((AbstractCollection)set1).addAll(set0);
        u.r0(set1, m0);
        return set1;
    }

    @l
    public static final Set F(@l Set set0, @l Object[] arr_object) {
        L.p(set0, "<this>");
        L.p(arr_object, "elements");
        Set set1 = new LinkedHashSet(Y.j(set0.size() + arr_object.length));
        ((AbstractCollection)set1).addAll(set0);
        u.s0(set1, arr_object);
        return set1;
    }

    @f
    private static final Set G(Set set0, Object object0) {
        L.p(set0, "<this>");
        return k0.D(set0, object0);
    }

    @l
    public static Set x(@l Set set0, @l Iterable iterable0) {
        L.p(set0, "<this>");
        L.p(iterable0, "elements");
        Collection collection0 = u.t0(iterable0);
        if(collection0.isEmpty()) {
            return u.a6(set0);
        }
        if(collection0 instanceof Set) {
            Set set1 = new LinkedHashSet();
            for(Object object0: set0) {
                if(!collection0.contains(object0)) {
                    set1.add(object0);
                }
            }
            return set1;
        }
        Set set2 = new LinkedHashSet(set0);
        ((AbstractCollection)set2).removeAll(collection0);
        return set2;
    }

    @l
    public static Set y(@l Set set0, Object object0) {
        L.p(set0, "<this>");
        Set set1 = new LinkedHashSet(Y.j(set0.size()));
        boolean z = false;
        for(Object object1: set0) {
            boolean z1 = true;
            if(!z && L.g(object1, object0)) {
                z = true;
                z1 = false;
            }
            if(z1) {
                set1.add(object1);
            }
        }
        return set1;
    }

    @l
    public static final Set z(@l Set set0, @l m m0) {
        L.p(set0, "<this>");
        L.p(m0, "elements");
        Set set1 = new LinkedHashSet(set0);
        u.J0(set1, m0);
        return set1;
    }
}

