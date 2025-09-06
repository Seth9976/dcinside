package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

final class zzfov implements zzfnl {
    private final Object zza;
    private final zzfow zzb;
    private final zzfph zzc;
    private final zzfni zzd;

    zzfov(@NonNull Object object0, @NonNull zzfow zzfow0, @NonNull zzfph zzfph0, @NonNull zzfni zzfni0) {
        this.zza = object0;
        this.zzb = zzfow0;
        this.zzc = zzfph0;
        this.zzd = zzfni0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfnl
    @Nullable
    public final String zza(Context context0, String s, String s1, View view0, Activity activity0) {
        synchronized(this) {
            Map map0 = this.zzc.zza();
            map0.put("f", "c");
            map0.put("ctx", context0);
            map0.put("cs", s1);
            map0.put("aid", null);
            map0.put("view", view0);
            map0.put("act", activity0);
            return zzfov.zzi(this.zzj(null, map0));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfnl
    @Nullable
    public final String zzb(Context context0, String s, View view0, Activity activity0) {
        synchronized(this) {
            Map map0 = this.zzc.zzc();
            map0.put("f", "v");
            map0.put("ctx", context0);
            map0.put("aid", null);
            map0.put("view", view0);
            map0.put("act", activity0);
            return zzfov.zzi(this.zzj(null, map0));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfnl
    @Nullable
    public final String zzc(Context context0, String s) {
        synchronized(this) {
            Map map0 = this.zzc.zzb();
            map0.put("f", "q");
            map0.put("ctx", context0);
            map0.put("aid", null);
            return zzfov.zzi(this.zzj(null, map0));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfnl
    public final void zzd(String s, MotionEvent motionEvent0) throws zzfpf {
        synchronized(this) {
            try {
                HashMap hashMap0 = new HashMap();
                hashMap0.put("t", new Throwable());
                hashMap0.put("aid", null);
                hashMap0.put("evt", motionEvent0);
                this.zza.getClass().getDeclaredMethod("he", Map.class).invoke(this.zza, hashMap0);
                this.zzd.zzd(3003, 0L);
            }
            catch(Exception exception0) {
                throw new zzfpf(2005, exception0);
            }
        }
    }

    public final int zze() throws zzfpf {
        synchronized(this) {
            try {
                return (int)(((Integer)this.zza.getClass().getDeclaredMethod("lcs", null).invoke(this.zza, null)));
            }
            catch(Exception exception0) {
                throw new zzfpf(2006, exception0);
            }
        }
    }

    final zzfow zzf() {
        return this.zzb;
    }

    public final void zzg() throws zzfpf {
        synchronized(this) {
            try {
                this.zza.getClass().getDeclaredMethod("close", null).invoke(this.zza, null);
                this.zzd.zzd(3001, 0L);
            }
            catch(Exception exception0) {
                throw new zzfpf(2003, exception0);
            }
        }
    }

    final boolean zzh() throws zzfpf {
        synchronized(this) {
            try {
                return ((Boolean)this.zza.getClass().getDeclaredMethod("init", null).invoke(this.zza, null)).booleanValue();
            }
            catch(Exception exception0) {
                throw new zzfpf(2001, exception0);
            }
        }
    }

    @Nullable
    private static String zzi(byte[] arr_b) {
        if(arr_b == null) {
            return null;
        }
        zzatm zzatm0 = zzatn.zza();
        zzatm0.zzc(5);
        zzatm0.zza(zzgwj.zzv(arr_b, 0, arr_b.length));
        return Base64.encodeToString(((zzatn)zzatm0.zzbn()).zzaV(), 11);
    }

    @Nullable
    private final byte[] zzj(Map map0, Map map1) {
        synchronized(this) {
            long v1 = System.currentTimeMillis();
            try {
                return (byte[])this.zza.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.zza, null, map1);
            }
            catch(Exception exception0) {
                this.zzd.zzc(2007, System.currentTimeMillis() - v1, exception0);
                return null;
            }
        }
    }
}

