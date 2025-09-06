package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Method;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;
import z3.f;

@s0({"SMAP\nDebugMetadata.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugMetadata.kt\nkotlin/coroutines/jvm/internal/ModuleNameRetriever\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
final class i {
    static final class a {
        @m
        @f
        public final Method a;
        @m
        @f
        public final Method b;
        @m
        @f
        public final Method c;

        public a(@m Method method0, @m Method method1, @m Method method2) {
            this.a = method0;
            this.b = method1;
            this.c = method2;
        }
    }

    @l
    public static final i a;
    @l
    private static final a b;
    @m
    private static a c;

    static {
        i.a = new i();
        i.b = new a(null, null, null);
    }

    private final a a(kotlin.coroutines.jvm.internal.a a0) {
        try {
            a i$a0 = new a(Class.class.getDeclaredMethod("getModule", null), a0.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), a0.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
            i.c = i$a0;
            return i$a0;
        }
        catch(Exception unused_ex) {
            i.c = i.b;
            return i.b;
        }
    }

    @m
    public final String b(@l kotlin.coroutines.jvm.internal.a a0) {
        L.p(a0, "continuation");
        a i$a0 = i.c == null ? this.a(a0) : i.c;
        if(i$a0 == i.b) {
            return null;
        }
        Object object0 = i$a0.a == null ? null : i$a0.a.invoke(a0.getClass(), null);
        if(object0 == null) {
            return null;
        }
        Object object1 = i$a0.b == null ? null : i$a0.b.invoke(object0, null);
        if(object1 == null) {
            return null;
        }
        Object object2 = i$a0.c == null ? null : i$a0.c.invoke(object1, null);
        return object2 instanceof String ? ((String)object2) : null;
    }
}

