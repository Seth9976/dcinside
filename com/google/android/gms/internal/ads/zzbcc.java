package com.google.android.gms.internal.ads;

import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;
import org.json.JSONObject;

public abstract class zzbcc {
    private final int zza;
    private final String zzb;
    private final Object zzc;
    private final Object zzd;

    zzbcc(int v, String s, Object object0, Object object1, zzbcb zzbcb0) {
        this.zza = v;
        this.zzb = s;
        this.zzc = object0;
        this.zzd = object1;
        zzbe.zza().zzd(this);
    }

    protected abstract Object zza(JSONObject arg1);

    public abstract Object zzb(Bundle arg1);

    protected abstract Object zzc(SharedPreferences arg1);

    public abstract void zzd(SharedPreferences.Editor arg1, Object arg2);

    public final int zze() {
        return this.zza;
    }

    public static zzbcc zzf(int v, String s, float f, float f1) {
        return new zzbbz(1, s, f, f1);
    }

    public static zzbcc zzg(int v, String s, int v1, int v2) {
        return new zzbbx(1, s, v1, v2);
    }

    public static zzbcc zzh(int v, String s, long v1, long v2) {
        return new zzbby(1, s, v1, v2);
    }

    public static zzbcc zzi(int v, String s) {
        zzbcc zzbcc0 = new zzbca(1, "gads:sdk_core_constants:experiment_id", null, null);
        zzbe.zza().zzc(zzbcc0);
        return zzbcc0;
    }

    public final Object zzj() {
        return zzbe.zzc().zza(this);
    }

    // 去混淆评级： 低(20)
    public final Object zzk() {
        return zzbe.zzc().zzf() ? this.zzd : this.zzc;
    }

    public final String zzl() {
        return this.zzb;
    }
}

