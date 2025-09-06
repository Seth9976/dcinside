package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class zzaxq {
    private final zzawd zza;
    private final String zzb;
    private final String zzc;
    private volatile Method zzd;
    private final Class[] zze;
    private final CountDownLatch zzf;

    static {
    }

    public zzaxq(zzawd zzawd0, String s, String s1, Class[] arr_class) {
        this.zzd = null;
        this.zzf = new CountDownLatch(1);
        this.zza = zzawd0;
        this.zzb = s;
        this.zzc = s1;
        this.zze = arr_class;
        zzawd0.zzk().submit(new zzaxp(this));
    }

    public final Method zza() {
        if(this.zzd != null) {
            return this.zzd;
        }
        try {
            return this.zzf.await(2L, TimeUnit.SECONDS) ? this.zzd : null;
        }
        catch(InterruptedException unused_ex) {
            return null;
        }
    }

    static void zzb(zzaxq zzaxq0) {
        try {
            Class class0 = zzaxq0.zza.zzi().loadClass(zzaxq0.zzc(zzaxq0.zza.zzu(), zzaxq0.zzb));
            if(class0 != null) {
                zzaxq0.zzd = class0.getMethod(zzaxq0.zzc(zzaxq0.zza.zzu(), zzaxq0.zzc), zzaxq0.zze);
            }
        }
        catch(zzavh | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused_ex) {
        }
        finally {
            zzaxq0.zzf.countDown();
        }
    }

    private final String zzc(byte[] arr_b, String s) throws zzavh, UnsupportedEncodingException {
        return new String(this.zza.zze().zzb(arr_b, s), "UTF-8");
    }
}

