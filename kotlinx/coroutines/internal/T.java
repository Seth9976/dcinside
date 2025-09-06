package kotlinx.coroutines.internal;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.g;

@s0({"SMAP\nInlineList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InlineList.kt\nkotlinx/coroutines/internal/InlineList\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
@g
public final class t {
    @m
    private final Object a;

    private t(Object object0) {
        this.a = object0;
    }

    public static final t a(Object object0) {
        return new t(object0);
    }

    @l
    public static Object b(@m Object object0) [...] // Inlined contents

    public static Object c(Object object0, int v, w w0) {
        return (v & 1) == 0 ? object0 : null;
    }

    // 去混淆评级： 低(20)
    public static boolean d(Object object0, Object object1) {
        return object1 instanceof t ? L.g(object0, ((t)object1).j()) : false;
    }

    public static final boolean e(Object object0, Object object1) {
        return L.g(object0, object1);
    }

    @Override
    public boolean equals(Object object0) {
        return t.d(this.a, object0);
    }

    public static final void f(Object object0, @l Function1 function10) {
        if(object0 == null) {
            return;
        }
        if(!(object0 instanceof ArrayList)) {
            function10.invoke(object0);
            return;
        }
        L.n(object0, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
        for(int v = ((ArrayList)object0).size() - 1; -1 < v; --v) {
            function10.invoke(((ArrayList)object0).get(v));
        }
    }

    public static int g(Object object0) {
        return object0 == null ? 0 : object0.hashCode();
    }

    @l
    public static final Object h(Object object0, Object object1) {
        if(object0 == null) {
            return object1;
        }
        if(object0 instanceof ArrayList) {
            L.n(object0, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            ((ArrayList)object0).add(object1);
            return object0;
        }
        ArrayList arrayList0 = new ArrayList(4);
        arrayList0.add(object0);
        arrayList0.add(object1);
        return arrayList0;
    }

    @Override
    public int hashCode() {
        return t.g(this.a);
    }

    public static String i(Object object0) [...] // Inlined contents

    public final Object j() {
        return this.a;
    }

    @Override
    public String toString() {
        return "InlineList(holder=" + this.a + ')';
    }
}

