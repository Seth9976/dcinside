package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

public final class zzawe {
    private long zza;
    private long zzb;
    private long zzc;
    private long zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;

    public zzawe() {
        this.zza = -1L;
        this.zzb = -1L;
        this.zzc = -1L;
        this.zzd = -1L;
        this.zze = -1L;
        this.zzf = -1L;
        this.zzg = -1L;
        this.zzh = -1L;
    }

    public final long zza() {
        return this.zzg;
    }

    public final long zzb() {
        return this.zze;
    }

    public final long zzc() {
        return this.zza;
    }

    public final long zzd() {
        return this.zzc;
    }

    public final long zze() {
        return this.zzh;
    }

    public final long zzf() {
        return this.zzf;
    }

    public final long zzg() {
        return this.zzb;
    }

    public final long zzh() {
        return this.zzd;
    }

    public final void zzi() {
        this.zzh = this.zzg;
        this.zzg = SystemClock.uptimeMillis();
    }

    public final void zzj() {
        this.zzb = this.zza;
        this.zza = SystemClock.uptimeMillis();
    }

    public final void zzk(Context context0, View view0) {
        this.zzd = this.zzc;
        this.zzc = SystemClock.uptimeMillis();
        long v = this.zze;
        if(v != -1L) {
            this.zzf = v;
        }
        DisplayMetrics displayMetrics0 = zzawe.zzl(context0);
        int v1 = displayMetrics0.widthPixels * displayMetrics0.heightPixels;
        if(view0 != null) {
            int v2 = Math.min(view0.getWidth(), displayMetrics0.widthPixels) * Math.min(view0.getHeight(), displayMetrics0.heightPixels);
            if(v2 + v2 >= v1 || v2 == 0 && zzawe.zzm(view0)) {
                this.zze = this.zzc;
                return;
            }
        }
        this.zze = -1L;
    }

    private static DisplayMetrics zzl(Context context0) {
        Display display0 = ((WindowManager)context0.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics0 = new DisplayMetrics();
        try {
            display0.getRealMetrics(displayMetrics0);
        }
        catch(NoSuchMethodError unused_ex) {
            display0.getMetrics(displayMetrics0);
        }
        return displayMetrics0;
    }

    private static boolean zzm(View view0) {
        try {
            if(view0.getClass().getName().contains("DebugGestureViewWrapper")) {
                view0 = ((ViewGroup)view0).getChildAt(0);
            }
            Object object0 = view0.getClass().getMethod("getAdConfiguration", null).invoke(view0, null);
            Integer integer0 = (Integer)object0.getClass().getField("adType").get(object0);
            integer0.intValue();
            String s = (String)object0.getClass().getMethod("adTypeToString", Integer.TYPE).invoke(null, integer0);
            return !s.contains("INTERSTITIAL") && !s.contains("APP_OPEN") ? s.contains("REWARDED") : true;
        }
        catch(SecurityException | ReflectiveOperationException unused_ex) {
            return false;
        }
    }
}

