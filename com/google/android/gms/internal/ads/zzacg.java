package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;
import jeb.synthetic.FIN;

final class zzacg {
    private final zzacf zza;
    private final AtomicBoolean zzb;

    public zzacg(zzacf zzacf0) {
        this.zza = zzacf0;
        this.zzb = new AtomicBoolean(false);
    }

    @Nullable
    public final zzacn zza(Object[] arr_object) {
        Constructor constructor0;
        AtomicBoolean atomicBoolean0 = this.zzb;
        __monitor_enter(atomicBoolean0);
        int v = FIN.finallyOpen$NT();
        if(this.zzb.get()) {
        label_12:
            FIN.finallyCodeBegin$NT(v);
            __monitor_exit(atomicBoolean0);
            FIN.finallyCodeEnd$NT(v);
            constructor0 = null;
        }
        else {
            try {
                constructor0 = this.zza.zza();
                FIN.finallyExec$NT(v);
            }
            catch(ClassNotFoundException unused_ex) {
                this.zzb.set(true);
                goto label_12;
            }
            catch(Exception exception0) {
                FIN.finallyExec$NT(v);
                throw new RuntimeException("Error instantiating extension", exception0);
            }
        }
        if(constructor0 == null) {
            return null;
        }
        try {
            return (zzacn)constructor0.newInstance(arr_object);
        }
        catch(Exception exception1) {
            throw new IllegalStateException("Unexpected error creating extractor", exception1);
        }
    }
}

