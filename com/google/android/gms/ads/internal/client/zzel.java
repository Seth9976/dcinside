package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.zzc;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzayy;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbej;
import com.google.android.gms.internal.ads.zzbpa;
import d4.c;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzel {
    @VisibleForTesting
    final zzbd zza;
    private final zzbpa zzb;
    private final zzr zzc;
    private final AtomicBoolean zzd;
    private final VideoController zze;
    @Nullable
    private zza zzf;
    private AdListener zzg;
    private AdSize[] zzh;
    @Nullable
    private AppEventListener zzi;
    @Nullable
    private zzby zzj;
    private VideoOptions zzk;
    private String zzl;
    @c
    private final ViewGroup zzm;
    private int zzn;
    private boolean zzo;
    @Nullable
    private OnPaidEventListener zzp;

    public zzel(ViewGroup viewGroup0) {
        this(viewGroup0, null, false, zzr.zza, null, 0);
    }

    public zzel(ViewGroup viewGroup0, int v) {
        this(viewGroup0, null, false, zzr.zza, null, v);
    }

    public zzel(ViewGroup viewGroup0, AttributeSet attributeSet0, boolean z) {
        this(viewGroup0, attributeSet0, z, zzr.zza, null, 0);
    }

    public zzel(ViewGroup viewGroup0, AttributeSet attributeSet0, boolean z, int v) {
        this(viewGroup0, attributeSet0, z, zzr.zza, null, v);
    }

    @VisibleForTesting
    zzel(ViewGroup viewGroup0, @Nullable AttributeSet attributeSet0, boolean z, zzr zzr0, @Nullable zzby zzby0, int v) {
        zzs zzs0;
        this.zzb = new zzbpa();
        this.zze = new VideoController();
        this.zza = new zzek(this);
        this.zzm = viewGroup0;
        this.zzc = zzr0;
        this.zzj = null;
        this.zzd = new AtomicBoolean(false);
        this.zzn = v;
        if(attributeSet0 != null) {
            Context context0 = viewGroup0.getContext();
            try {
                zzaa zzaa0 = new zzaa(context0, attributeSet0);
                this.zzh = zzaa0.zzb(z);
                this.zzl = zzaa0.zza();
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                zzbc.zzb().zzl(viewGroup0, new zzs(context0, AdSize.BANNER), illegalArgumentException0.getMessage(), illegalArgumentException0.getMessage());
                return;
            }
            if(viewGroup0.isInEditMode()) {
                zzf zzf0 = zzbc.zzb();
                AdSize adSize0 = this.zzh[0];
                int v1 = this.zzn;
                if(adSize0.equals(AdSize.INVALID)) {
                    zzs0 = new zzs("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
                }
                else {
                    zzs zzs1 = new zzs(context0, adSize0);
                    zzs1.zzj = zzel.zzE(v1);
                    zzs0 = zzs1;
                }
                zzf0.zzm(viewGroup0, zzs0, "Ads by Google");
            }
        }
    }

    public final boolean zzA() {
        zzby zzby0 = this.zzj;
        if(zzby0 != null) {
            try {
                return zzby0.zzY();
            }
            catch(RemoteException remoteException0) {
                zzo.zzl("#007 Could not call remote method.", remoteException0);
            }
        }
        return false;
    }

    public final boolean zzB() {
        zzby zzby0 = this.zzj;
        if(zzby0 != null) {
            try {
                return zzby0.zzZ();
            }
            catch(RemoteException remoteException0) {
                zzo.zzl("#007 Could not call remote method.", remoteException0);
            }
        }
        return false;
    }

    public final AdSize[] zzC() {
        return this.zzh;
    }

    private static zzs zzD(Context context0, AdSize[] arr_adSize, int v) {
        for(int v1 = 0; v1 < arr_adSize.length; ++v1) {
            if(arr_adSize[v1].equals(AdSize.INVALID)) {
                return new zzs("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
            }
        }
        zzs zzs0 = new zzs(context0, arr_adSize);
        zzs0.zzj = zzel.zzE(v);
        return zzs0;
    }

    private static boolean zzE(int v) {
        return v == 1;
    }

    public final AdListener zza() {
        return this.zzg;
    }

    @Nullable
    public final AdSize zzb() {
        zzby zzby0 = this.zzj;
        if(zzby0 != null) {
            try {
                zzs zzs0 = zzby0.zzg();
                if(zzs0 != null) {
                    return zzc.zzc(zzs0.zze, zzs0.zzb, zzs0.zza);
                }
            }
            catch(RemoteException remoteException0) {
                zzo.zzl("#007 Could not call remote method.", remoteException0);
            }
        }
        return this.zzh == null ? null : this.zzh[0];
    }

    @Nullable
    public final OnPaidEventListener zzc() {
        return this.zzp;
    }

    @Nullable
    public final ResponseInfo zzd() {
        zzby zzby0 = this.zzj;
        if(zzby0 != null) {
            try {
                return ResponseInfo.zza(zzby0.zzk());
            }
            catch(RemoteException remoteException0) {
                zzo.zzl("#007 Could not call remote method.", remoteException0);
                return ResponseInfo.zza(null);
            }
        }
        return ResponseInfo.zza(null);
    }

    public final VideoController zzf() {
        return this.zze;
    }

    public final VideoOptions zzg() {
        return this.zzk;
    }

    @Nullable
    public final AppEventListener zzh() {
        return this.zzi;
    }

    @Nullable
    public final zzeb zzi() {
        zzby zzby0 = this.zzj;
        if(zzby0 != null) {
            try {
                return zzby0.zzl();
            }
            catch(RemoteException remoteException0) {
                zzo.zzl("#007 Could not call remote method.", remoteException0);
            }
        }
        return null;
    }

    public final String zzj() {
        if(this.zzl == null) {
            zzby zzby0 = this.zzj;
            if(zzby0 != null) {
                try {
                    this.zzl = zzby0.zzr();
                    return this.zzl;
                }
                catch(RemoteException remoteException0) {
                    zzo.zzl("#007 Could not call remote method.", remoteException0);
                }
            }
        }
        return this.zzl;
    }

    public final void zzk() {
        try {
            zzby zzby0 = this.zzj;
            if(zzby0 != null) {
                zzby0.zzx();
            }
        }
        catch(RemoteException remoteException0) {
            zzo.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    // 检测为 Lambda 实现
    final void zzl(IObjectWrapper iObjectWrapper0) [...]

    public final void zzm(zzei zzei0) {
        zzby zzby1;
        long v;
        try {
            v = System.currentTimeMillis();
            if(this.zzj == null) {
                if(this.zzh == null || this.zzl == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context0 = this.zzm.getContext();
                zzs zzs0 = zzel.zzD(context0, this.zzh, this.zzn);
                zzby zzby0 = "search_v2".equals(zzs0.zza) ? ((zzby)new zzao(zzbc.zza(), context0, zzs0, this.zzl).zzd(context0, false)) : ((zzby)new zzam(zzbc.zza(), context0, zzs0, this.zzl, this.zzb).zzd(context0, false));
                this.zzj = zzby0;
                zzby0.zzD(new zzg(this.zza));
                zza zza0 = this.zzf;
                if(zza0 != null) {
                    this.zzj.zzC(new zzb(zza0));
                }
                AppEventListener appEventListener0 = this.zzi;
                if(appEventListener0 != null) {
                    this.zzj.zzG(new zzayy(appEventListener0));
                }
                if(this.zzk != null) {
                    this.zzj.zzU(new zzga(this.zzk));
                }
                this.zzj.zzP(new zzfs(this.zzp));
                this.zzj.zzN(this.zzo);
                zzby1 = this.zzj;
                if(zzby1 != null) {
                    goto label_21;
                }
            }
            goto label_32;
        }
        catch(RemoteException remoteException0) {
            zzo.zzl("#007 Could not call remote method.", remoteException0);
            return;
        }
        try {
        label_21:
            IObjectWrapper iObjectWrapper0 = zzby1.zzn();
            if(iObjectWrapper0 != null) {
                if(!((Boolean)zzbej.zzf.zze()).booleanValue() || !((Boolean)zzbe.zzc().zza(zzbcl.zzla)).booleanValue()) {
                    View view0 = (View)ObjectWrapper.unwrap(iObjectWrapper0);
                    this.zzm.addView(view0);
                }
                else {
                    zzej zzej0 = () -> {
                        View view0 = (View)ObjectWrapper.unwrap(iObjectWrapper0);
                        this.zzm.addView(view0);
                    };
                    zzf.zza.post(zzej0);
                }
            }
            goto label_32;
        }
        catch(RemoteException remoteException1) {
        }
        try {
            zzo.zzl("#007 Could not call remote method.", remoteException1);
        label_32:
            if(zzei0 != null) {
                zzei0.zzq(v);
            }
            zzby zzby2 = this.zzj;
            if(zzby2 == null) {
                throw null;
            }
            Context context1 = this.zzm.getContext();
            zzby2.zzab(this.zzc.zza(context1, zzei0));
            return;
        }
        catch(RemoteException remoteException0) {
        }
        zzo.zzl("#007 Could not call remote method.", remoteException0);
    }

    public final void zzn() {
        try {
            zzby zzby0 = this.zzj;
            if(zzby0 != null) {
                zzby0.zzz();
            }
        }
        catch(RemoteException remoteException0) {
            zzo.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    public final void zzo() {
        if(this.zzd.getAndSet(true)) {
            return;
        }
        else {
            try {
                zzby zzby0 = this.zzj;
                if(zzby0 != null) {
                    zzby0.zzA();
                    return;
                }
                return;
            }
            catch(RemoteException remoteException0) {
            }
        }
        zzo.zzl("#007 Could not call remote method.", remoteException0);
    }

    public final void zzp() {
        try {
            zzby zzby0 = this.zzj;
            if(zzby0 != null) {
                zzby0.zzB();
            }
        }
        catch(RemoteException remoteException0) {
            zzo.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    public final void zzq(@Nullable zza zza0) {
        try {
            this.zzf = zza0;
            zzby zzby0 = this.zzj;
            if(zzby0 != null) {
                zzby0.zzC((zza0 == null ? null : new zzb(zza0)));
            }
            return;
        }
        catch(RemoteException remoteException0) {
        }
        zzo.zzl("#007 Could not call remote method.", remoteException0);
    }

    public final void zzr(AdListener adListener0) {
        this.zzg = adListener0;
        this.zza.zza(adListener0);
    }

    public final void zzs(AdSize[] arr_adSize) {
        if(this.zzh != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        this.zzt(arr_adSize);
    }

    public final void zzt(AdSize[] arr_adSize) {
        this.zzh = arr_adSize;
        zzby zzby0 = this.zzj;
        if(zzby0 != null) {
            try {
                zzby0.zzF(zzel.zzD(this.zzm.getContext(), this.zzh, this.zzn));
            }
            catch(RemoteException remoteException0) {
                zzo.zzl("#007 Could not call remote method.", remoteException0);
            }
        }
        this.zzm.requestLayout();
    }

    public final void zzu(String s) {
        if(this.zzl != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.zzl = s;
    }

    public final void zzv(@Nullable AppEventListener appEventListener0) {
        try {
            this.zzi = appEventListener0;
            zzby zzby0 = this.zzj;
            if(zzby0 != null) {
                zzby0.zzG((appEventListener0 == null ? null : new zzayy(appEventListener0)));
            }
            return;
        }
        catch(RemoteException remoteException0) {
        }
        zzo.zzl("#007 Could not call remote method.", remoteException0);
    }

    public final void zzw(boolean z) {
        try {
            this.zzo = z;
            zzby zzby0 = this.zzj;
            if(zzby0 != null) {
                zzby0.zzN(z);
            }
        }
        catch(RemoteException remoteException0) {
            zzo.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    public final void zzx(@Nullable OnPaidEventListener onPaidEventListener0) {
        try {
            this.zzp = onPaidEventListener0;
            zzby zzby0 = this.zzj;
            if(zzby0 != null) {
                zzby0.zzP(new zzfs(onPaidEventListener0));
            }
        }
        catch(RemoteException remoteException0) {
            zzo.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    public final void zzy(VideoOptions videoOptions0) {
        try {
            this.zzk = videoOptions0;
            zzby zzby0 = this.zzj;
            if(zzby0 != null) {
                zzby0.zzU((videoOptions0 == null ? null : new zzga(videoOptions0)));
            }
        }
        catch(RemoteException remoteException0) {
            zzo.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    public final boolean zzz(zzby zzby0) {
        IObjectWrapper iObjectWrapper0;
        try {
            iObjectWrapper0 = zzby0.zzn();
        }
        catch(RemoteException remoteException0) {
            zzo.zzl("#007 Could not call remote method.", remoteException0);
            return false;
        }
        if(iObjectWrapper0 != null && ((View)ObjectWrapper.unwrap(iObjectWrapper0)).getParent() == null) {
            View view0 = (View)ObjectWrapper.unwrap(iObjectWrapper0);
            this.zzm.addView(view0);
            this.zzj = zzby0;
            return true;
        }
        return false;
    }
}

