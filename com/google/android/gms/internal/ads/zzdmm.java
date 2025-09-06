package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

public final class zzdmm extends zzbmb implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzbfi {
    private View zza;
    private zzeb zzb;
    private zzdia zzc;
    private boolean zzd;
    private boolean zze;

    public zzdmm(zzdia zzdia0, zzdif zzdif0) {
        this.zza = zzdif0.zzf();
        this.zzb = zzdif0.zzj();
        this.zzc = zzdia0;
        this.zzd = false;
        this.zze = false;
        if(zzdif0.zzs() != null) {
            zzdif0.zzs().zzap(this);
        }
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.zzg();
    }

    @Override  // android.view.ViewTreeObserver$OnScrollChangedListener
    public final void onScrollChanged() {
        this.zzg();
    }

    @Override  // com.google.android.gms.internal.ads.zzbmc
    @Nullable
    public final zzeb zzb() throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if(this.zzd) {
            zzo.zzg("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        return this.zzb;
    }

    @Override  // com.google.android.gms.internal.ads.zzbmc
    @Nullable
    public final zzbft zzc() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if(this.zzd) {
            zzo.zzg("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        return this.zzc == null || this.zzc.zzc() == null ? null : this.zzc.zzc().zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzbmc
    public final void zzd() throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzh();
        zzdia zzdia0 = this.zzc;
        if(zzdia0 != null) {
            zzdia0.zzb();
        }
        this.zzc = null;
        this.zza = null;
        this.zzb = null;
        this.zzd = true;
    }

    @Override  // com.google.android.gms.internal.ads.zzbmc
    public final void zze(IObjectWrapper iObjectWrapper0) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzf(iObjectWrapper0, new zzdml(this));
    }

    @Override  // com.google.android.gms.internal.ads.zzbmc
    public final void zzf(IObjectWrapper iObjectWrapper0, zzbmf zzbmf0) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if(this.zzd) {
            zzo.zzg("Instream ad can not be shown after destroy().");
            zzdmm.zzi(zzbmf0, 2);
            return;
        }
        View view0 = this.zza;
        if(view0 != null && this.zzb != null) {
            if(this.zze) {
                zzo.zzg("Instream ad should not be used again.");
                zzdmm.zzi(zzbmf0, 1);
                return;
            }
            this.zze = true;
            this.zzh();
            ((ViewGroup)ObjectWrapper.unwrap(iObjectWrapper0)).addView(this.zza, new ViewGroup.LayoutParams(-1, -1));
            zzcaj.zza(this.zza, this);
            zzcaj.zzb(this.zza, this);
            this.zzg();
            try {
                zzbmf0.zzf();
            }
            catch(RemoteException remoteException0) {
                zzo.zzl("#007 Could not call remote method.", remoteException0);
            }
            return;
        }
        zzo.zzg(("Instream internal error: " + (view0 == null ? "can not get video view." : "can not get video controller.")));
        zzdmm.zzi(zzbmf0, 0);
    }

    private final void zzg() {
        zzdia zzdia0 = this.zzc;
        if(zzdia0 != null) {
            View view0 = this.zza;
            if(view0 != null) {
                zzdia0.zzB(view0, Collections.emptyMap(), Collections.emptyMap(), zzdia.zzY(this.zza));
            }
        }
    }

    private final void zzh() {
        View view0 = this.zza;
        if(view0 != null) {
            ViewParent viewParent0 = view0.getParent();
            if(viewParent0 instanceof ViewGroup) {
                ((ViewGroup)viewParent0).removeView(this.zza);
            }
        }
    }

    private static final void zzi(zzbmf zzbmf0, int v) {
        try {
            zzbmf0.zze(v);
        }
        catch(RemoteException remoteException0) {
            zzo.zzl("#007 Could not call remote method.", remoteException0);
        }
    }
}

