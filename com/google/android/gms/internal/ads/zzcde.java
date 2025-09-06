package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.api.Releasable;
import java.lang.ref.WeakReference;
import java.util.Map;
import o3.j;

@j
public abstract class zzcde implements Releasable {
    protected final Context zza;
    protected final String zzb;
    protected final WeakReference zzc;

    public zzcde(zzcbs zzcbs0) {
        Context context0 = zzcbs0.getContext();
        this.zza = context0;
        this.zzb = zzv.zzq().zzc(context0, zzcbs0.zzn().afmaVersion);
        this.zzc = new WeakReference(zzcbs0);
    }

    @Override  // com.google.android.gms.common.api.Releasable
    public void release() {
    }

    static void zze(zzcde zzcde0, String s, Map map0) {
        zzcbs zzcbs0 = (zzcbs)zzcde0.zzc.get();
        if(zzcbs0 != null) {
            zzcbs0.zzd("onPrecacheEvent", map0);
        }
    }

    public abstract void zzf();

    public final void zzg(String s, @Nullable String s1, String s2, @Nullable String s3) {
        zzcdd zzcdd0 = new zzcdd(this, s, s1, s2, s3);
        zzf.zza.post(zzcdd0);
    }

    protected final void zzh(String s, String s1, int v) {
        zzcdb zzcdb0 = new zzcdb(this, s, s1, v);
        zzf.zza.post(zzcdb0);
    }

    public final void zzj(String s, String s1, long v) {
        zzcdc zzcdc0 = new zzcdc(this, s, s1, v);
        zzf.zza.post(zzcdc0);
    }

    public final void zzn(String s, String s1, int v, int v1, long v2, long v3, boolean z, int v4, int v5) {
        zzcda zzcda0 = new zzcda(this, s, s1, v, v1, v2, v3, z, v4, v5);
        zzf.zza.post(zzcda0);
    }

    public final void zzo(String s, String s1, long v, long v1, boolean z, long v2, long v3, long v4, int v5, int v6) {
        zzccz zzccz0 = new zzccz(this, s, s1, v, v1, v2, v3, v4, z, v5, v6);
        zzf.zza.post(zzccz0);
    }

    protected void zzp(int v) {
    }

    protected void zzq(int v) {
    }

    protected void zzr(int v) {
    }

    protected void zzs(int v) {
    }

    public abstract boolean zzt(String arg1);

    public boolean zzu(String s, String[] arr_s) {
        return this.zzt(s);
    }

    public boolean zzw(String s, String[] arr_s, zzccw zzccw0) {
        return this.zzt(s);
    }
}

