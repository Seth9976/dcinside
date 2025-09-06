package kotlin.reflect;

import kotlin.h0;
import kotlin.internal.h;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;
import z3.i;

@s0({"SMAP\nKClasses.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KClasses.kt\nkotlin/reflect/KClasses\n+ 2 KClassesImpl.kt\nkotlin/reflect/KClassesImplKt\n*L\n1#1,46:1\n9#2:47\n*S KotlinDebug\n*F\n+ 1 KClasses.kt\nkotlin/reflect/KClasses\n*L\n25#1:47\n*E\n"})
@i(name = "KClasses")
public final class e {
    @h0(version = "1.4")
    @h
    @l
    public static final Object a(@l d d0, @m Object object0) {
        L.p(d0, "<this>");
        if(!d0.isInstance(object0)) {
            throw new ClassCastException("Value cannot be cast to " + d0.g());
        }
        L.n(object0, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.cast");
        return object0;
    }

    @h0(version = "1.4")
    @h
    @m
    public static final Object b(@l d d0, @m Object object0) {
        L.p(d0, "<this>");
        if(d0.isInstance(object0)) {
            L.n(object0, "null cannot be cast to non-null type T of kotlin.reflect.KClasses.safeCast");
            return object0;
        }
        return null;
    }
}

