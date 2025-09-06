package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzava;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

final class zzr extends AsyncTask {
    final zzu zza;

    zzr(zzu zzu0, zzt zzt0) {
        this.zza = zzu0;
        super();
    }

    @Override  // android.os.AsyncTask
    protected final Object doInBackground(Object[] arr_object) {
        return this.zza(((Void[])arr_object));
    }

    @Override  // android.os.AsyncTask
    protected final void onPostExecute(Object object0) {
        zzu zzu0 = this.zza;
        if(zzu0.zzf != null && ((String)object0) != null) {
            zzu0.zzf.loadUrl(((String)object0));
        }
    }

    protected final String zza(Void[] arr_void) {
        try {
            zzava zzava0 = (zzava)this.zza.zzc.get(1000L, TimeUnit.MILLISECONDS);
            this.zza.zzh = zzava0;
            return this.zza.zzp();
        }
        catch(InterruptedException | ExecutionException interruptedException0) {
            zzo.zzk("", interruptedException0);
            return this.zza.zzp();
        }
        catch(TimeoutException timeoutException0) {
            zzo.zzk("", timeoutException0);
            return this.zza.zzp();
        }
    }
}

