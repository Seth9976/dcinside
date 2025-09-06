package androidx.work.impl;

import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nStartStopToken.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StartStopToken.kt\nandroidx/work/impl/SynchronizedStartStopTokensImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,104:1\n1#2:105\n*E\n"})
final class SynchronizedStartStopTokensImpl implements StartStopTokens {
    @l
    private final StartStopTokens b;
    @l
    private final Object c;

    public SynchronizedStartStopTokensImpl(@l StartStopTokens startStopTokens0) {
        L.p(startStopTokens0, "delegate");
        super();
        this.b = startStopTokens0;
        this.c = new Object();
    }

    @Override  // androidx.work.impl.StartStopTokens
    public StartStopToken a(WorkSpec workSpec0) {
        return f.a(this, workSpec0);
    }

    @Override  // androidx.work.impl.StartStopTokens
    public boolean b(@l WorkGenerationalId workGenerationalId0) {
        L.p(workGenerationalId0, "id");
        synchronized(this.c) {
            return this.b.b(workGenerationalId0);
        }
    }

    @Override  // androidx.work.impl.StartStopTokens
    @m
    public StartStopToken c(@l WorkGenerationalId workGenerationalId0) {
        L.p(workGenerationalId0, "id");
        synchronized(this.c) {
            return this.b.c(workGenerationalId0);
        }
    }

    @Override  // androidx.work.impl.StartStopTokens
    public StartStopToken d(WorkSpec workSpec0) {
        return f.b(this, workSpec0);
    }

    @Override  // androidx.work.impl.StartStopTokens
    @l
    public StartStopToken e(@l WorkGenerationalId workGenerationalId0) {
        L.p(workGenerationalId0, "id");
        synchronized(this.c) {
            return this.b.e(workGenerationalId0);
        }
    }

    @Override  // androidx.work.impl.StartStopTokens
    @l
    public List remove(@l String s) {
        L.p(s, "workSpecId");
        synchronized(this.c) {
            return this.b.remove(s);
        }
    }
}

