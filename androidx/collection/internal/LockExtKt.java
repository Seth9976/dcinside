package androidx.collection.internal;

import A3.a;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;

@s0({"SMAP\nLockExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockExt.kt\nandroidx/collection/internal/LockExtKt\n+ 2 Lock.jvm.kt\nandroidx/collection/internal/Lock\n*L\n1#1,27:1\n26#2:28\n*S KotlinDebug\n*F\n+ 1 LockExt.kt\nandroidx/collection/internal/LockExtKt\n*L\n25#1:28\n*E\n"})
public final class LockExtKt {
    public static final Object a(@l Lock lock0, @l a a0) {
        L.p(lock0, "<this>");
        L.p(a0, "block");
        synchronized(lock0) {
            return a0.invoke();
        }
    }
}

