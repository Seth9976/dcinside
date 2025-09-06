package com.google.android.gms.ads.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri.Builder;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.ViewGroup.LayoutParams;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
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
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzava;
import com.google.android.gms.internal.ads.zzavb;
import com.google.android.gms.internal.ads.zzbag;
import com.google.android.gms.internal.ads.zzbdg;
import com.google.android.gms.internal.ads.zzbtn;
import com.google.android.gms.internal.ads.zzbtq;
import com.google.android.gms.internal.ads.zzbwc;
import com.google.android.gms.internal.ads.zzbzw;
import java.util.Map;
import java.util.concurrent.Future;
import o3.j;

@j
public final class zzu extends zzbx {
    private final VersionInfoParcel zza;
    private final zzs zzb;
    private final Future zzc;
    private final Context zzd;
    private final com.google.android.gms.ads.internal.zzs zze;
    @Nullable
    private WebView zzf;
    @Nullable
    private zzbl zzg;
    @Nullable
    private zzava zzh;
    private AsyncTask zzi;

    public zzu(Context context0, zzs zzs0, String s, VersionInfoParcel versionInfoParcel0) {
        this.zzd = context0;
        this.zza = versionInfoParcel0;
        this.zzb = zzs0;
        this.zzf = new WebView(context0);
        zzq zzq0 = new zzq(this);
        this.zzc = zzbzw.zza.zzb(zzq0);
        this.zze = new com.google.android.gms.ads.internal.zzs(context0, s);
        this.zzV(0);
        this.zzf.setVerticalScrollBarEnabled(false);
        this.zzf.getSettings().setJavaScriptEnabled(true);
        this.zzf.setWebViewClient(new zzo(this));
        this.zzf.setOnTouchListener(new zzp(this));
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzA() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzB() throws RemoteException {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzC(zzbi zzbi0) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzD(zzbl zzbl0) throws RemoteException {
        this.zzg = zzbl0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzE(zzcc zzcc0) {
        throw new IllegalStateException("Unused method");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzF(zzs zzs0) throws RemoteException {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzG(zzcm zzcm0) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzH(zzbag zzbag0) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzI(zzy zzy0) {
        throw new IllegalStateException("Unused method");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzJ(zzct zzct0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzK(zzef zzef0) {
        throw new IllegalStateException("Unused method");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzL(boolean z) {
        throw new IllegalStateException("Unused method");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzM(zzbtn zzbtn0) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzN(boolean z) throws RemoteException {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzO(zzbdg zzbdg0) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzP(zzdr zzdr0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzQ(zzbtq zzbtq0, String s) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzR(String s) {
        throw new IllegalStateException("Unused method");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzS(zzbwc zzbwc0) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzT(String s) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzU(zzga zzga0) {
        throw new IllegalStateException("Unused method");
    }

    @VisibleForTesting
    final void zzV(int v) {
        if(this.zzf == null) {
            return;
        }
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = new ViewGroup.LayoutParams(-1, v);
        this.zzf.setLayoutParams(viewGroup$LayoutParams0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzW(IObjectWrapper iObjectWrapper0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzX() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzY() throws RemoteException {
        return false;
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
        Preconditions.checkNotNull(this.zzf, "This Search Ad has already been torn down");
        this.zze.zzf(zzm0, this.zza);
        this.zzi = new zzr(this, null).execute(new Void[0]);
        return true;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzac(zzcq zzcq0) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @VisibleForTesting
    final int zzb(String s) {
        String s1 = Uri.parse(s).getQueryParameter("height");
        if(TextUtils.isEmpty(s1)) {
            return 0;
        }
        try {
            int v = Integer.parseInt(s1);
            return zzf.zzx(this.zzd, v);
        }
        catch(NumberFormatException unused_ex) {
            return 0;
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final Bundle zzd() {
        throw new IllegalStateException("Unused method");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final zzs zzg() throws RemoteException {
        return this.zzb;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final zzbl zzi() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final zzcm zzj() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    @Nullable
    public final zzdy zzk() {
        return null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    @Nullable
    public final zzeb zzl() {
        return null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final IObjectWrapper zzn() throws RemoteException {
        Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
        return ObjectWrapper.wrap(this.zzf);
    }

    static String zzo(zzu zzu0, String s) {
        if(zzu0.zzh != null) {
            Uri uri0 = Uri.parse(s);
            try {
                uri0 = zzu0.zzh.zza(uri0, zzu0.zzd, null, null);
                return uri0.toString();
            }
            catch(zzavb zzavb0) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Unable to process ad data", zzavb0);
                return uri0.toString();
            }
        }
        return s;
    }

    @VisibleForTesting
    final String zzp() {
        Uri.Builder uri$Builder0 = new Uri.Builder();
        uri$Builder0.scheme("https://").appendEncodedPath("/afs/ads/i/webview.html");
        uri$Builder0.appendQueryParameter("query", this.zze.zzd());
        uri$Builder0.appendQueryParameter("pubId", this.zze.zzc());
        uri$Builder0.appendQueryParameter("mappver", this.zze.zza());
        Map map0 = this.zze.zze();
        for(Object object0: map0.keySet()) {
            uri$Builder0.appendQueryParameter(((String)object0), ((String)map0.get(((String)object0))));
        }
        Uri uri0 = uri$Builder0.build();
        zzava zzava0 = this.zzh;
        if(zzava0 != null) {
            try {
                uri0 = zzava0.zzb(uri0, this.zzd);
                return this.zzq() + "#" + uri0.getEncodedQuery();
            }
            catch(zzavb zzavb0) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Unable to process ad data", zzavb0);
                return this.zzq() + "#" + uri0.getEncodedQuery();
            }
        }
        return this.zzq() + "#" + uri0.getEncodedQuery();
    }

    @VisibleForTesting
    final String zzq() {
        String s = this.zze.zzb();
        if(TextUtils.isEmpty(s)) {
            s = "www.google.com";
        }
        return "https://" + s + "/afs/ads/i/webview.html";
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final String zzr() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    @Nullable
    public final String zzs() throws RemoteException {
        return null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    @Nullable
    public final String zzt() throws RemoteException {
        return null;
    }

    static void zzw(zzu zzu0, String s) {
        Intent intent0 = new Intent("android.intent.action.VIEW");
        intent0.setData(Uri.parse(s));
        zzu0.zzd.startActivity(intent0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzx() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzi.cancel(true);
        this.zzc.cancel(false);
        this.zzf.destroy();
        this.zzf = null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzy(zzm zzm0, zzbo zzbo0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzby
    public final void zzz() throws RemoteException {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
    }
}

