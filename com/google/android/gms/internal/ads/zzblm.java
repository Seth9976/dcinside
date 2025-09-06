package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.t0;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public final class zzblm implements zzapf {
    private volatile zzbkz zza;
    private final Context zzb;

    public zzblm(Context context0) {
        this.zzb = context0;
    }

    @Override  // com.google.android.gms.internal.ads.zzapf
    @Nullable
    public final zzapi zza(zzapm zzapm0) throws zzapv {
        ParcelFileDescriptor parcelFileDescriptor0;
        Map map0 = zzapm0.zzl();
        int v = map0.size();
        String[] arr_s = new String[v];
        String[] arr_s1 = new String[v];
        int v2 = 0;
        for(Object object0: map0.entrySet()) {
            arr_s[v2] = (String)((Map.Entry)object0).getKey();
            arr_s1[v2] = (String)((Map.Entry)object0).getValue();
            ++v2;
        }
        zzbla zzbla0 = new zzbla(zzapm0.zzk(), arr_s, arr_s1);
        long v3 = zzv.zzC().elapsedRealtime();
        try {
            zzcab zzcab0 = new zzcab();
            zzblk zzblk0 = new zzblk(this, zzcab0);
            zzbll zzbll0 = new zzbll(this, zzcab0);
            Looper looper0 = zzv.zzu().zzb();
            this.zza = new zzbkz(this.zzb, looper0, zzblk0, zzbll0);
            this.zza.checkAvailabilityAndConnect();
            t0 t00 = zzgch.zzo(zzgch.zzn(zzcab0, new zzbli(this, zzbla0), zzbzw.zza), ((long)(((int)(((Integer)zzbe.zzc().zza(zzbcl.zzey)))))), TimeUnit.MILLISECONDS, zzbzw.zzd);
            t00.addListener(new zzblj(this), zzbzw.zza);
            parcelFileDescriptor0 = (ParcelFileDescriptor)t00.get();
        }
        catch(InterruptedException | ExecutionException unused_ex) {
            return null;
        }
        finally {
            zze.zza(("Http assets remote cache took " + (zzv.zzC().elapsedRealtime() - v3) + "ms"));
        }
        zzblc zzblc0 = (zzblc)new zzbvi(parcelFileDescriptor0).zza(zzblc.CREATOR);
        if(zzblc0 == null) {
            return null;
        }
        if(zzblc0.zza) {
            throw new zzapv(zzblc0.zzb);
        }
        if(zzblc0.zze.length == zzblc0.zzf.length) {
            HashMap hashMap0 = new HashMap();
            for(int v1 = 0; true; ++v1) {
                String[] arr_s2 = zzblc0.zze;
                if(v1 >= arr_s2.length) {
                    break;
                }
                hashMap0.put(arr_s2[v1], zzblc0.zzf[v1]);
            }
            return new zzapi(zzblc0.zzc, zzblc0.zzd, hashMap0, zzblc0.zzg, zzblc0.zzh);
        }
        return null;
    }

    static void zzc(zzblm zzblm0) {
        if(zzblm0.zza == null) {
            return;
        }
        zzblm0.zza.disconnect();
        Binder.flushPendingCommands();
    }
}

