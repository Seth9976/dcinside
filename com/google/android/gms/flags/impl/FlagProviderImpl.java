package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.flags.zzd;

@DynamiteApi
public class FlagProviderImpl extends zzd {
    private boolean zzu;
    private SharedPreferences zzv;

    public FlagProviderImpl() {
        this.zzu = false;
    }

    @Override  // com.google.android.gms.flags.zzc
    public boolean getBooleanFlagValue(String s, boolean z, int v) {
        return this.zzu ? zzb.zza(this.zzv, s, Boolean.valueOf(z)).booleanValue() : z;
    }

    @Override  // com.google.android.gms.flags.zzc
    public int getIntFlagValue(String s, int v, int v1) {
        return this.zzu ? ((int)com.google.android.gms.flags.impl.zzd.zza(this.zzv, s, v)) : v;
    }

    @Override  // com.google.android.gms.flags.zzc
    public long getLongFlagValue(String s, long v, int v1) {
        return this.zzu ? ((long)zzf.zza(this.zzv, s, v)) : v;
    }

    @Override  // com.google.android.gms.flags.zzc
    public String getStringFlagValue(String s, String s1, int v) {
        return this.zzu ? zzh.zza(this.zzv, s, s1) : s1;
    }

    @Override  // com.google.android.gms.flags.zzc
    public void init(IObjectWrapper iObjectWrapper0) {
        Context context0 = (Context)ObjectWrapper.unwrap(iObjectWrapper0);
        if(this.zzu) {
            return;
        }
        try {
            this.zzv = zzj.zza(context0.createPackageContext("com.google.android.gms", 0));
            this.zzu = true;
        }
        catch(PackageManager.NameNotFoundException exception0) {
            String s = exception0.getMessage();
            Log.w("FlagProviderImpl", (s.length() == 0 ? new String("Could not retrieve sdk flags, continuing with defaults: ") : "Could not retrieve sdk flags, continuing with defaults: " + s));
        }
        catch(Exception unused_ex) {
        }
    }
}

