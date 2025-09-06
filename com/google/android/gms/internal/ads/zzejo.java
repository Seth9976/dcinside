package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzbi;
import com.google.android.gms.ads.internal.client.zzbl;
import com.google.android.gms.ads.internal.client.zzbo;
import com.google.android.gms.ads.internal.client.zzbx;
import com.google.android.gms.ads.internal.client.zzcc;
import com.google.android.gms.ads.internal.client.zzcm;
import com.google.android.gms.ads.internal.client.zzcq;
import com.google.android.gms.ads.internal.client.zzct;
import com.google.android.gms.ads.internal.client.zzdr;
import com.google.android.gms.ads.internal.client.zzdy;
import com.google.android.gms.ads.internal.client.zzeb;
import com.google.android.gms.ads.internal.client.zzef;
import com.google.android.gms.ads.internal.client.zzga;
import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.client.zzy;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.List;

public final class zzejo extends zzbx {
    private final Context zza;
    private final zzbl zzb;
    private final zzfcj zzc;
    private final zzcom zzd;
    private final ViewGroup zze;
    private final zzdrw zzf;

    public zzejo(Context context0, @Nullable zzbl zzbl0, zzfcj zzfcj0, zzcom zzcom0, zzdrw zzdrw0) {
        this.zza = context0;
        this.zzb = zzbl0;
        this.zzc = zzfcj0;
        this.zzd = zzcom0;
        this.zzf = zzdrw0;
        FrameLayout frameLayout0 = new FrameLayout(context0);
        frameLayout0.removeAllViews();
        frameLayout0.addView(zzcom0.zzd(), new ViewGroup.LayoutParams(-1, -1));
        frameLayout0.setMinimumHeight(this.zzg().zzc);
        frameLayout0.setMinimumWidth(this.zzg().zzf);
        this.zze = frameLayout0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzA() throws RemoteException {
        this.zzd.zzh();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzB() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzd.zzn().zzc(null);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzC(zzbi zzbi0) throws RemoteException {
        zzo.zzi("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzD(zzbl zzbl0) throws RemoteException {
        zzo.zzi("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzE(zzcc zzcc0) throws RemoteException {
        zzo.zzi("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzF(zzs zzs0) throws RemoteException {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        zzcom zzcom0 = this.zzd;
        if(zzcom0 != null) {
            zzcom0.zzi(this.zze, zzs0);
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzG(zzcm zzcm0) throws RemoteException {
        zzekn zzekn0 = this.zzc.zzc;
        if(zzekn0 != null) {
            zzekn0.zzm(zzcm0);
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzH(zzbag zzbag0) throws RemoteException {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzI(zzy zzy0) throws RemoteException {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzJ(zzct zzct0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzK(zzef zzef0) throws RemoteException {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzL(boolean z) throws RemoteException {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzM(zzbtn zzbtn0) throws RemoteException {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzN(boolean z) throws RemoteException {
        zzo.zzi("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzO(zzbdg zzbdg0) throws RemoteException {
        zzo.zzi("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzP(zzdr zzdr0) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzlt)).booleanValue()) {
            zzekn zzekn0 = this.zzc.zzc;
            if(zzekn0 != null) {
                try {
                    if(!zzdr0.zzf()) {
                        this.zzf.zze();
                    }
                }
                catch(RemoteException remoteException0) {
                    zzo.zzf("Error in making CSI ping for reporting paid event callback", remoteException0);
                }
                zzekn0.zzl(zzdr0);
            }
            return;
        }
        zzo.zzi("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzQ(zzbtq zzbtq0, String s) throws RemoteException {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzR(String s) throws RemoteException {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzS(zzbwc zzbwc0) throws RemoteException {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzT(String s) throws RemoteException {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzU(zzga zzga0) throws RemoteException {
        zzo.zzi("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzW(IObjectWrapper iObjectWrapper0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzX() throws RemoteException {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzY() throws RemoteException {
        return this.zzd != null && this.zzd.zzs();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzZ() throws RemoteException {
        return false;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzaa() throws RemoteException {
        return false;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzab(zzm zzm0) throws RemoteException {
        zzo.zzi("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzac(zzcq zzcq0) throws RemoteException {
        zzo.zzi("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final Bundle zzd() throws RemoteException {
        zzo.zzi("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final zzs zzg() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        List list0 = Collections.singletonList(this.zzd.zzf());
        return zzfcp.zza(this.zza, list0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final zzbl zzi() throws RemoteException {
        return this.zzb;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final zzcm zzj() throws RemoteException {
        return this.zzc.zzn;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final zzdy zzk() {
        return this.zzd.zzm();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final zzeb zzl() throws RemoteException {
        return this.zzd.zze();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final IObjectWrapper zzn() throws RemoteException {
        return ObjectWrapper.wrap(this.zze);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final String zzr() throws RemoteException {
        return this.zzc.zzf;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    @Nullable
    public final String zzs() throws RemoteException {
        return this.zzd.zzm() == null ? null : this.zzd.zzm().zzg();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    @Nullable
    public final String zzt() throws RemoteException {
        return this.zzd.zzm() == null ? null : this.zzd.zzm().zzg();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzx() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzd.zzb();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzy(zzm zzm0, zzbo zzbo0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzz() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzd.zzn().zzb(null);
    }
}

