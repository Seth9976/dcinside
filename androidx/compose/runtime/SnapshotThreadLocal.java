package androidx.compose.runtime;

import androidx.compose.runtime.internal.ThreadMap;
import androidx.compose.runtime.internal.ThreadMapKt;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nActualJvm.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActualJvm.jvm.kt\nandroidx/compose/runtime/SnapshotThreadLocal\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,116:1\n70#2:117\n*S KotlinDebug\n*F\n+ 1 ActualJvm.jvm.kt\nandroidx/compose/runtime/SnapshotThreadLocal\n*L\n58#1:117\n*E\n"})
public final class SnapshotThreadLocal {
    @l
    private final AtomicReference a;
    @l
    private final Object b;

    public SnapshotThreadLocal() {
        this.a = new AtomicReference(ThreadMapKt.a());
        this.b = new Object();
    }

    @m
    public final Object a() {
        return ((ThreadMap)this.a.get()).b(Thread.currentThread().getId());
    }

    public final void b(@m Object object0) {
        long v = Thread.currentThread().getId();
        synchronized(this.b) {
            ThreadMap threadMap0 = (ThreadMap)this.a.get();
            if(threadMap0.d(v, object0)) {
                return;
            }
            ThreadMap threadMap1 = threadMap0.c(v, object0);
            this.a.set(threadMap1);
        }
    }
}

