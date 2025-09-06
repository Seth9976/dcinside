package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Field;
import java.util.ArrayList;
import kotlin.h0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;
import z3.i;

@s0({"SMAP\nDebugMetadata.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugMetadata.kt\nkotlin/coroutines/jvm/internal/DebugMetadataKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,134:1\n37#2,2:135\n*S KotlinDebug\n*F\n+ 1 DebugMetadata.kt\nkotlin/coroutines/jvm/internal/DebugMetadataKt\n*L\n131#1:135,2\n*E\n"})
public final class g {
    private static final int a = 1;

    private static final void a(int v, int v1) {
        if(v1 > v) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + v + ", got " + v1 + ". Please update the Kotlin standard library.").toString());
        }
    }

    private static final f b(a a0) {
        return (f)a0.getClass().getAnnotation(f.class);
    }

    private static final int c(a a0) {
        try {
            Field field0 = a0.getClass().getDeclaredField("label");
            field0.setAccessible(true);
            Object object0 = field0.get(a0);
            Integer integer0 = object0 instanceof Integer ? ((Integer)object0) : null;
            return integer0 == null ? -1 : ((int)integer0) - 1;
        }
        catch(Exception unused_ex) {
            return -1;
        }
    }

    @h0(version = "1.3")
    @m
    @i(name = "getSpilledVariableFieldMapping")
    public static final String[] d(@l a a0) {
        L.p(a0, "<this>");
        f f0 = g.b(a0);
        if(f0 == null) {
            return null;
        }
        g.a(1, f0.v());
        ArrayList arrayList0 = new ArrayList();
        int v = g.c(a0);
        int[] arr_v = f0.i();
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            if(arr_v[v1] == v) {
                arrayList0.add(f0.s()[v1]);
                arrayList0.add(f0.n()[v1]);
            }
        }
        return (String[])arrayList0.toArray(new String[0]);
    }

    @h0(version = "1.3")
    @m
    @i(name = "getStackTraceElement")
    public static final StackTraceElement e(@l a a0) {
        L.p(a0, "<this>");
        f f0 = g.b(a0);
        if(f0 == null) {
            return null;
        }
        g.a(1, f0.v());
        int v = g.c(a0);
        int v1 = v >= 0 ? f0.l()[v] : -1;
        String s = kotlin.coroutines.jvm.internal.i.a.b(a0);
        return s == null ? new StackTraceElement(f0.c(), f0.m(), f0.f(), v1) : new StackTraceElement(s + '/' + f0.c(), f0.m(), f0.f(), v1);
    }
}

