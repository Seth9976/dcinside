package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.zzo;
import o3.j;

@j
public final class zzaze {
    private final Object zza;
    private zzazc zzb;
    private boolean zzc;

    public zzaze() {
        this.zza = new Object();
        this.zzb = null;
        this.zzc = false;
    }

    @Nullable
    public final Activity zza() {
        synchronized(this.zza) {
            zzazc zzazc0 = this.zzb;
            if(zzazc0 != null) {
                return zzazc0.zza();
            }
        }
        return null;
    }

    @Nullable
    public final Context zzb() {
        synchronized(this.zza) {
            zzazc zzazc0 = this.zzb;
            if(zzazc0 != null) {
                return zzazc0.zzb();
            }
        }
        return null;
    }

    public final void zzc(zzazd zzazd0) {
        synchronized(this.zza) {
            if(this.zzb == null) {
                this.zzb = new zzazc();
            }
            this.zzb.zzf(zzazd0);
        }
    }

    public final void zzd(Context context0) {
        synchronized(this.zza) {
            if(!this.zzc) {
                Context context1 = context0.getApplicationContext();
                if(context1 == null) {
                    context1 = context0;
                }
                Application application0 = context1 instanceof Application ? ((Application)context1) : null;
                if(application0 == null) {
                    zzo.zzj("Can not cast Context to Application");
                    return;
                }
                if(this.zzb == null) {
                    this.zzb = new zzazc();
                }
                this.zzb.zzg(application0, context0);
                this.zzc = true;
            }
        }
    }

    public final void zze(zzazd zzazd0) {
        synchronized(this.zza) {
            zzazc zzazc0 = this.zzb;
            if(zzazc0 == null) {
                return;
            }
            zzazc0.zzh(zzazd0);
        }
    }
}

