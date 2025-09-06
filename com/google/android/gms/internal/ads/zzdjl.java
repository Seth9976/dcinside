package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View.OnClickListener;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashMap;

public final class zzdjl implements View.OnClickListener {
    @Nullable
    @VisibleForTesting
    String zza;
    @Nullable
    @VisibleForTesting
    Long zzb;
    @Nullable
    @VisibleForTesting
    WeakReference zzc;
    private final zzdnl zzd;
    private final Clock zze;
    @Nullable
    private zzbhq zzf;
    @Nullable
    private zzbjp zzg;

    public zzdjl(zzdnl zzdnl0, Clock clock0) {
        this.zzd = zzdnl0;
        this.zze = clock0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        if(this.zzc != null && this.zzc.get() == view0) {
            if(this.zza != null && this.zzb != null) {
                HashMap hashMap0 = new HashMap();
                hashMap0.put("id", this.zza);
                hashMap0.put("time_interval", String.valueOf(this.zze.currentTimeMillis() - ((long)this.zzb)));
                hashMap0.put("messageType", "onePointFiveClick");
                this.zzd.zzj("sendMessageToNativeJs", hashMap0);
            }
            this.zzd();
        }
    }

    @Nullable
    public final zzbhq zza() {
        return this.zzf;
    }

    public final void zzb() {
        if(this.zzf != null && this.zzb != null) {
            this.zzd();
            try {
                this.zzf.zze();
            }
            catch(RemoteException remoteException0) {
                zzo.zzl("#007 Could not call remote method.", remoteException0);
            }
        }
    }

    public final void zzc(zzbhq zzbhq0) {
        this.zzf = zzbhq0;
        zzbjp zzbjp0 = this.zzg;
        if(zzbjp0 != null) {
            this.zzd.zzn("/unconfirmedClick", zzbjp0);
        }
        zzdjk zzdjk0 = new zzdjk(this, zzbhq0);
        this.zzg = zzdjk0;
        this.zzd.zzl("/unconfirmedClick", zzdjk0);
    }

    private final void zzd() {
        this.zza = null;
        this.zzb = null;
        WeakReference weakReference0 = this.zzc;
        if(weakReference0 != null) {
            View view0 = (View)weakReference0.get();
            if(view0 != null) {
                view0.setClickable(false);
                view0.setOnClickListener(null);
                this.zzc = null;
            }
        }
    }
}

