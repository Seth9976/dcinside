package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.t0;
import j..util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import o3.a;

abstract class zzgbh extends zzgbm {
    private static final zzgcq zza;
    @a
    private zzfxi zzb;
    private final boolean zzc;
    private final boolean zzf;

    static {
        zzgbh.zza = new zzgcq(zzgbh.class);
    }

    zzgbh(zzfxi zzfxi0, boolean z, boolean z1) {
        super(zzfxi0.size());
        this.zzb = zzfxi0;
        this.zzc = z;
        this.zzf = z1;
    }

    private final void zzG(int v, Future future0) {
        try {
            this.zzf(v, zzgdk.zza(future0));
        }
        catch(ExecutionException executionException0) {
            this.zzI(executionException0.getCause());
        }
        catch(Throwable throwable0) {
            this.zzI(throwable0);
        }
    }

    private final void zzH(@a zzfxi zzfxi0) {
        int v = this.zzA();
        zzfun.zzm(v >= 0, "Less than 0 remaining futures");
        if(v == 0) {
            if(zzfxi0 != null) {
                zzfzt zzfzt0 = zzfxi0.zze();
                for(int v1 = 0; zzfzt0.hasNext(); ++v1) {
                    Object object0 = zzfzt0.next();
                    Future future0 = (Future)object0;
                    if(!future0.isCancelled()) {
                        this.zzG(v1, future0);
                    }
                }
            }
            this.zzF();
            this.zzu();
            this.zzy(2);
        }
    }

    private final void zzI(Throwable throwable0) {
        throwable0.getClass();
        if(this.zzc && !this.zzd(throwable0) && zzgbh.zzL(this.zzC(), throwable0)) {
            zzgbh.zzJ(throwable0);
            return;
        }
        if(throwable0 instanceof Error) {
            zzgbh.zzJ(throwable0);
        }
    }

    private static void zzJ(Throwable throwable0) {
        zzgbh.zza.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", (throwable0 instanceof Error ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first"), throwable0);
    }

    private final void zzK(int v, t0 t00) {
        try {
            if(t00.isCancelled()) {
                this.zzb = null;
                this.cancel(false);
            }
            else {
                this.zzG(v, t00);
            }
        }
        finally {
            this.zzH(null);
        }
    }

    private static boolean zzL(Set set0, Throwable throwable0) {
        while(throwable0 != null) {
            if(!set0.add(throwable0)) {
                return false;
            }
            throwable0 = throwable0.getCause();
        }
        return true;
    }

    @Override  // com.google.android.gms.internal.ads.zzgax
    @a
    protected final String zza() {
        zzfxi zzfxi0 = this.zzb;
        return zzfxi0 == null ? super.zza() : "futures=" + zzfxi0.toString();
    }

    @Override  // com.google.android.gms.internal.ads.zzgax
    protected final void zzb() {
        zzfxi zzfxi0 = this.zzb;
        boolean z = true;
        this.zzy(1);
        boolean z1 = this.isCancelled();
        if(zzfxi0 == null) {
            z = false;
        }
        if(z && z1) {
            boolean z2 = this.zzt();
            zzfzt zzfzt0 = zzfxi0.zze();
            while(zzfzt0.hasNext()) {
                Object object0 = zzfzt0.next();
                ((Future)object0).cancel(z2);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgbm
    final void zze(Set set0) {
        set0.getClass();
        if(!this.isCancelled()) {
            Throwable throwable0 = this.zzl();
            Objects.requireNonNull(throwable0);
            zzgbh.zzL(set0, throwable0);
        }
    }

    abstract void zzf(int arg1, Object arg2);

    abstract void zzu();

    final void zzv() {
        Objects.requireNonNull(this.zzb);
        if(this.zzb.isEmpty()) {
            this.zzu();
            return;
        }
        if(this.zzc) {
            zzfzt zzfzt0 = this.zzb.zze();
            for(int v = 0; zzfzt0.hasNext(); ++v) {
                Object object0 = zzfzt0.next();
                t0 t00 = (t0)object0;
                if(t00.isDone()) {
                    this.zzK(v, t00);
                }
                else {
                    t00.addListener(() -> this.zzK(v, t00), zzgbv.zza);
                }
            }
            return;
        }
        zzfxi zzfxi0 = this.zzf ? this.zzb : null;
        zzgbg zzgbg0 = () -> this.zzH(zzfxi0);
        zzfzt zzfzt1 = this.zzb.zze();
        while(zzfzt1.hasNext()) {
            Object object1 = zzfzt1.next();
            t0 t01 = (t0)object1;
            if(t01.isDone()) {
                this.zzH(zzfxi0);
            }
            else {
                t01.addListener(zzgbg0, zzgbv.zza);
            }
        }
    }

    // 检测为 Lambda 实现
    final void zzw(int v, t0 t00) [...]

    // 检测为 Lambda 实现
    final void zzx(zzfxi zzfxi0) [...]

    void zzy(int v) {
        this.zzb = null;
    }
}

