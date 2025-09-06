package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

public abstract class zzfmw extends AsyncTask {
    private zzfmx zza;
    protected final zzfmo zzd;

    public zzfmw(zzfmo zzfmo0) {
        this.zzd = zzfmo0;
    }

    @Override  // android.os.AsyncTask
    protected void onPostExecute(Object object0) {
        this.zza(((String)object0));
    }

    protected void zza(String s) {
        zzfmx zzfmx0 = this.zza;
        if(zzfmx0 != null) {
            zzfmx0.zza(this);
        }
    }

    public final void zzb(zzfmx zzfmx0) {
        this.zza = zzfmx0;
    }
}

