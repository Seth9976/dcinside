package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import o3.a;
import sun.misc.Unsafe;

final class zzgax.zzj extends zzgax.zza {
    static final Unsafe zza;
    static final long zzb;
    static final long zzc;
    static final long zzd;
    static final long zze;
    static final long zzf;

    static {
        Unsafe unsafe0;
        Class class0;
        try {
            class0 = zzgax.zzk.class;
            unsafe0 = Unsafe.getUnsafe();
        }
        catch(SecurityException unused_ex) {
            try {
                unsafe0 = (Unsafe)AccessController.doPrivileged(new PrivilegedExceptionAction() {
                    @Override
                    public final Object run() throws Exception {
                        Class class0 = Unsafe.class;
                        Field[] arr_field = class0.getDeclaredFields();
                        for(int v = 0; v < arr_field.length; ++v) {
                            Field field0 = arr_field[v];
                            field0.setAccessible(true);
                            Object object0 = field0.get(null);
                            if(class0.isInstance(object0)) {
                                return (Unsafe)class0.cast(object0);
                            }
                        }
                        throw new NoSuchFieldError("the Unsafe");
                    }
                });
            }
            catch(PrivilegedActionException privilegedActionException0) {
                throw new RuntimeException("Could not initialize intrinsics", privilegedActionException0.getCause());
            }
        }
        try {
            zzgax.zzj.zzc = unsafe0.objectFieldOffset(zzgax.class.getDeclaredField("waiters"));
            zzgax.zzj.zzb = unsafe0.objectFieldOffset(zzgax.class.getDeclaredField("listeners"));
            zzgax.zzj.zzd = unsafe0.objectFieldOffset(zzgax.class.getDeclaredField("value"));
            zzgax.zzj.zze = unsafe0.objectFieldOffset(class0.getDeclaredField("thread"));
            zzgax.zzj.zzf = unsafe0.objectFieldOffset(class0.getDeclaredField("next"));
            zzgax.zzj.zza = unsafe0;
        }
        catch(NoSuchFieldException noSuchFieldException0) {
            throw new RuntimeException(noSuchFieldException0);
        }
    }

    private zzgax.zzj() {
        throw null;
    }

    zzgax.zzj(zzgba zzgba0) {
        super(null);
    }

    @Override  // com.google.android.gms.internal.ads.zzgax$zza
    final zzgax.zzd zza(zzgax zzgax0, zzgax.zzd zzgax$zzd0) {
        zzgax.zzd zzgax$zzd1;
        do {
            zzgax$zzd1 = zzgax0.listeners;
        }
        while(zzgax$zzd0 != zzgax$zzd1 && !this.zze(zzgax0, zzgax$zzd1, zzgax$zzd0));
        return zzgax$zzd1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgax$zza
    final zzgax.zzk zzb(zzgax zzgax0, zzgax.zzk zzgax$zzk0) {
        zzgax.zzk zzgax$zzk1;
        do {
            zzgax$zzk1 = zzgax0.waiters;
        }
        while(zzgax$zzk0 != zzgax$zzk1 && !this.zzg(zzgax0, zzgax$zzk1, zzgax$zzk0));
        return zzgax$zzk1;
    }

    @Override  // com.google.android.gms.internal.ads.zzgax$zza
    final void zzc(zzgax.zzk zzgax$zzk0, @a zzgax.zzk zzgax$zzk1) {
        zzgax.zzj.zza.putObject(zzgax$zzk0, zzgax.zzj.zzf, zzgax$zzk1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgax$zza
    final void zzd(zzgax.zzk zzgax$zzk0, Thread thread0) {
        zzgax.zzj.zza.putObject(zzgax$zzk0, zzgax.zzj.zze, thread0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgax$zza
    final boolean zze(zzgax zzgax0, @a zzgax.zzd zzgax$zzd0, zzgax.zzd zzgax$zzd1) {
        return zzgaz.zza(zzgax.zzj.zza, zzgax0, zzgax.zzj.zzb, zzgax$zzd0, zzgax$zzd1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgax$zza
    final boolean zzf(zzgax zzgax0, @a Object object0, Object object1) {
        return zzgaz.zza(zzgax.zzj.zza, zzgax0, zzgax.zzj.zzd, object0, object1);
    }

    @Override  // com.google.android.gms.internal.ads.zzgax$zza
    final boolean zzg(zzgax zzgax0, @a zzgax.zzk zzgax$zzk0, @a zzgax.zzk zzgax$zzk1) {
        return zzgaz.zza(zzgax.zzj.zza, zzgax0, zzgax.zzj.zzc, zzgax$zzk0, zzgax$zzk1);
    }
}

