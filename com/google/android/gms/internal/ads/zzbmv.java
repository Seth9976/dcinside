package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zza;
import j..util.Objects;
import java.util.Map;
import o3.j;
import org.json.JSONObject;

@j
public final class zzbmv implements zzbmm, zzbmn {
    private final zzcex zza;

    public zzbmv(Context context0, VersionInfoParcel versionInfoParcel0, @Nullable zzava zzava0, zza zza0) throws zzcfj {
        zzcex zzcex0 = zzcfk.zza(context0, zzcgr.zza(), "", false, false, null, null, versionInfoParcel0, null, null, null, zzbbj.zza(), null, null, null, null);
        this.zza = zzcex0;
        zzcex0.zzF().setWillNotDraw(true);
    }

    @Override  // com.google.android.gms.internal.ads.zzbmm, com.google.android.gms.internal.ads.zzbmw
    public final void zza(String s) {
        zze.zza("invokeJavascript on adWebView from js");
        zzbmv.zzs(() -> this.zza.zza(s));
    }

    @Override  // com.google.android.gms.internal.ads.zzbmm, com.google.android.gms.internal.ads.zzbmw
    public final void zzb(String s, String s1) {
        zzbml.zzc(this, s, s1);
    }

    @Override  // com.google.android.gms.internal.ads.zzbmn
    public final void zzc() {
        this.zza.destroy();
    }

    @Override  // com.google.android.gms.internal.ads.zzbmk
    public final void zzd(String s, Map map0) {
        zzbml.zza(this, s, map0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbmm, com.google.android.gms.internal.ads.zzbmk
    public final void zze(String s, JSONObject jSONObject0) {
        zzbml.zzb(this, s, jSONObject0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbmn
    public final void zzf(String s) {
        zze.zza("loadHtml on adWebView from html");
        zzbmv.zzs(() -> this.zza.loadData(s, "text/html", "UTF-8"));
    }

    @Override  // com.google.android.gms.internal.ads.zzbmn
    public final void zzg(String s) {
        zze.zza(("loadHtmlWrapper on adWebView from path: " + s));
        zzbmv.zzs(() -> this.zza.loadUrl(s));
    }

    @Override  // com.google.android.gms.internal.ads.zzbmn
    public final void zzh(String s) {
        zze.zza(("loadJavascript on adWebView from path: " + s));
        zzbmv.zzs(() -> this.zza.loadData(String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", s), "text/html", "UTF-8"));
    }

    @Override  // com.google.android.gms.internal.ads.zzbmn
    public final boolean zzi() {
        return this.zza.zzaE();
    }

    @Override  // com.google.android.gms.internal.ads.zzbmn
    public final zzbnu zzj() {
        return new zzbnu(this);
    }

    @Override  // com.google.android.gms.internal.ads.zzbmn
    public final void zzk(zzbmy zzbmy0) {
        zzcgp zzcgp0 = this.zza.zzN();
        Objects.requireNonNull(zzbmy0);
        zzcgp0.zzJ(new zzbmq(zzbmy0));
    }

    @Override  // com.google.android.gms.internal.ads.zzbmw
    public final void zzl(String s, JSONObject jSONObject0) {
        zzbml.zzd(this, s, jSONObject0);
    }

    // 检测为 Lambda 实现
    final void zzm(String s) [...]

    // 检测为 Lambda 实现
    final void zzn(String s) [...]

    // 检测为 Lambda 实现
    final void zzo(String s) [...]

    // 检测为 Lambda 实现
    final void zzp(String s) [...]

    @Override  // com.google.android.gms.internal.ads.zzbnt
    public final void zzq(String s, zzbjp zzbjp0) {
        zzbmu zzbmu0 = new zzbmu(this, zzbjp0);
        this.zza.zzag(s, zzbmu0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbnt
    public final void zzr(String s, zzbjp zzbjp0) {
        zzbmo zzbmo0 = new zzbmo(zzbjp0);
        this.zza.zzaA(s, zzbmo0);
    }

    private static final void zzs(Runnable runnable0) {
        if(zzf.zzu()) {
            zze.zza("runOnUiThread > the UI thread is the main thread, the runnable will be run now");
            runnable0.run();
            return;
        }
        zze.zza("runOnUiThread > the UI thread is not the main thread, the runnable will be added to the message queue");
        if(!zzs.zza.post(runnable0)) {
            zzo.zzj("runOnUiThread > the runnable could not be placed to the message queue");
        }
    }
}

