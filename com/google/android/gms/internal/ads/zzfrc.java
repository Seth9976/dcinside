package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.IOException;
import o3.h;

final class zzfrc {
    private static zzfrc zza;
    private final String zzb;
    private final SharedPreferences zzc;

    static {
    }

    private zzfrc(Context context0) {
        this.zzb = "com.dcinside.app.android";
        this.zzc = context0.getSharedPreferences("paid_storage_sp", 0);
    }

    final long zza(String s, long v) {
        return this.zzc.getLong(s, -1L);
    }

    static zzfrc zzb(Context context0) {
        if(zzfrc.zza == null) {
            zzfrc.zza = new zzfrc(context0);
        }
        return zzfrc.zza;
    }

    @h
    final String zzc(String s, String s1) {
        return this.zzc.getString(s, null);
    }

    final void zzd(String s, Object object0) throws IOException {
        boolean z;
        if(object0 instanceof String) {
            z = this.zzc.edit().putString(s, ((String)object0)).commit();
            goto label_11;
        }
        else if(object0 instanceof Long) {
            z = this.zzc.edit().putLong(s, ((long)(((Long)object0)))).commit();
            goto label_11;
        }
        else if(object0 instanceof Boolean) {
            z = this.zzc.edit().putBoolean(s, ((Boolean)object0).booleanValue()).commit();
            goto label_11;
        }
        else if(object0 instanceof Integer) {
            z = this.zzc.edit().putInt(s, ((int)(((Integer)object0)))).commit();
        label_11:
            if(z) {
                return;
            }
        }
        else {
            Log.e("GpidLifecycleSPHandler", "Unexpected object class " + object0.getClass() + " for app " + this.zzb);
        }
        throw new IOException("Failed to store " + s + " for app " + this.zzb);
    }

    final void zze(String s) throws IOException {
        if(!this.zzc.edit().remove(s).commit()) {
            throw new IOException("Failed to remove " + s + " for app " + this.zzb);
        }
    }

    final boolean zzf(String s, boolean z) {
        return this.zzc.getBoolean(s, true);
    }

    final boolean zzg(String s) {
        return this.zzc.contains(s);
    }
}

