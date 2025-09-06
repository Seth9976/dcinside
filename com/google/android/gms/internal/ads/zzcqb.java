package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import j..util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public final class zzcqb implements zzayk {
    @Nullable
    private final zzcex zza;
    private final Executor zzb;
    private final AtomicReference zzc;

    zzcqb(@Nullable zzcex zzcex0, Executor executor0) {
        this.zzc = new AtomicReference();
        this.zza = zzcex0;
        this.zzb = executor0;
    }

    @Override  // com.google.android.gms.internal.ads.zzayk
    public final void zzdn(zzayj zzayj0) {
        synchronized(this) {
            if(this.zza != null && ((Boolean)zzbe.zzc().zza(zzbcl.zzmv)).booleanValue()) {
                if(zzayj0.zzj) {
                    Object object0 = this.zzc.getAndSet(Boolean.TRUE);
                    if(!Boolean.TRUE.equals(object0)) {
                        Objects.requireNonNull(this.zza);
                        zzcpz zzcpz0 = new zzcpz(this.zza);
                        this.zzb.execute(zzcpz0);
                        return;
                    }
                }
                if(!zzayj0.zzj) {
                    Object object1 = this.zzc.getAndSet(Boolean.FALSE);
                    if(!Boolean.FALSE.equals(object1)) {
                        Objects.requireNonNull(this.zza);
                        zzcqa zzcqa0 = new zzcqa(this.zza);
                        this.zzb.execute(zzcqa0);
                    }
                }
            }
        }
    }
}

