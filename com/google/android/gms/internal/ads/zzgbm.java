package com.google.android.gms.internal.ads;

import j..util.Objects;
import j..util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import o3.a;

abstract class zzgbm extends zzgax.zzi {
    private volatile int remaining;
    @a
    private volatile Set seenExceptions;
    private static final zzgbi zzbe;
    private static final zzgcq zzbf;

    static {
        Throwable throwable1;
        zzgbj zzgbj0;
        zzgbm.zzbf = new zzgcq(zzgbm.class);
        try {
            zzgbj0 = new zzgbj(AtomicReferenceFieldUpdater.newUpdater(zzgbm.class, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(zzgbm.class, "remaining"));
            throwable1 = null;
        }
        catch(Throwable throwable0) {
            zzgbj0 = new zzgbk(null);
            throwable1 = throwable0;
        }
        zzgbm.zzbe = zzgbj0;
        if(throwable1 != null) {
            zzgbm.zzbf.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", throwable1);
        }
    }

    zzgbm(int v) {
        this.seenExceptions = null;
        this.remaining = v;
    }

    final int zzA() {
        return zzgbm.zzbe.zza(this);
    }

    final Set zzC() {
        Set set0 = this.seenExceptions;
        if(set0 == null) {
            Set set1 = Collections.newSetFromMap(new ConcurrentHashMap());
            this.zze(set1);
            zzgbm.zzbe.zzb(this, null, set1);
            Set set2 = this.seenExceptions;
            Objects.requireNonNull(set2);
            return set2;
        }
        return set0;
    }

    final void zzF() {
        this.seenExceptions = null;
    }

    abstract void zze(Set arg1);
}

