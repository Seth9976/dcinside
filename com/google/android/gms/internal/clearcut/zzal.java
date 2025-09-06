package com.google.android.gms.internal.clearcut;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.io.IOException;

final class zzal extends zzae {
    private final Object lock;
    private String zzec;
    private Object zzed;
    private final zzan zzee;

    zzal(zzao zzao0, String s, Object object0, zzan zzan0) {
        this.zzee = zzan0;
        super(zzao0, s, object0, null);
        this.lock = new Object();
    }

    @Override  // com.google.android.gms.internal.clearcut.zzae
    protected final Object zza(SharedPreferences sharedPreferences0) {
        try {
            return this.zzb(sharedPreferences0.getString(this.zzds, ""));
        }
        catch(ClassCastException classCastException0) {
            String s = String.valueOf(this.zzds);
            Log.e("PhenotypeFlag", (s.length() == 0 ? new String("Invalid byte[] value in SharedPreferences for ") : "Invalid byte[] value in SharedPreferences for " + s), classCastException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.internal.clearcut.zzae
    protected final Object zzb(String s) {
        try {
            Object object0 = this.lock;
            synchronized(object0) {
                if(!s.equals(this.zzec)) {
                    byte[] arr_b = Base64.decode(s, 3);
                    Object object1 = this.zzee.zzb(arr_b);
                    this.zzec = s;
                    this.zzed = object1;
                }
                return this.zzed;
            }
        }
        catch(IOException | IllegalArgumentException unused_ex) {
            Log.e("PhenotypeFlag", "Invalid byte[] value for " + this.zzds + ": " + s);
            return null;
        }
    }
}

