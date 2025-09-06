package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.lang.reflect.Constructor;
import java.security.GeneralSecurityException;
import java.util.HashMap;

public final class zzfpg {
    private static final HashMap zza;
    private final Context zzb;
    private final zzfph zzc;
    private final zzfni zzd;
    private final zzfnd zze;
    @Nullable
    private zzfov zzf;
    private final Object zzg;

    static {
        zzfpg.zza = new HashMap();
    }

    public zzfpg(@NonNull Context context0, @NonNull zzfph zzfph0, @NonNull zzfni zzfni0, @NonNull zzfnd zzfnd0) {
        this.zzg = new Object();
        this.zzb = context0;
        this.zzc = zzfph0;
        this.zzd = zzfni0;
        this.zze = zzfnd0;
    }

    @Nullable
    public final zzfnl zza() {
        synchronized(this.zzg) {
        }
        return this.zzf;
    }

    @Nullable
    public final zzfow zzb() {
        synchronized(this.zzg) {
            zzfov zzfov0 = this.zzf;
            if(zzfov0 != null) {
                return zzfov0.zzf();
            }
        }
        return null;
    }

    public final boolean zzc(@NonNull zzfow zzfow0) {
        Object object0;
        long v;
        try {
            v = System.currentTimeMillis();
            Class class0 = this.zzd(zzfow0);
            try {
                Constructor constructor0 = class0.getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE);
                byte[] arr_b = zzfow0.zze();
                Bundle bundle0 = new Bundle();
                object0 = constructor0.newInstance(this.zzb, "msa-r", arr_b, null, bundle0, 2);
            }
            catch(Exception exception1) {
                throw new zzfpf(2004, exception1);
            }
            zzfov zzfov0 = new zzfov(object0, zzfow0, this.zzc, this.zzd);
            if(!zzfov0.zzh()) {
                throw new zzfpf(4000, "init failed");
            }
            int v1 = zzfov0.zze();
            if(v1 != 0) {
                throw new zzfpf(4001, "ci: " + v1);
            }
            synchronized(this.zzg) {
                zzfov zzfov1 = this.zzf;
                if(zzfov1 != null) {
                    try {
                        zzfov1.zzg();
                    }
                    catch(zzfpf zzfpf1) {
                        this.zzd.zzc(zzfpf1.zza(), -1L, zzfpf1);
                    }
                }
                this.zzf = zzfov0;
            }
            this.zzd.zzd(3000, System.currentTimeMillis() - v);
            return true;
        }
        catch(zzfpf zzfpf0) {
            this.zzd.zzc(zzfpf0.zza(), System.currentTimeMillis() - v, zzfpf0);
            return false;
        }
        catch(Exception exception0) {
            this.zzd.zzc(4010, System.currentTimeMillis() - v, exception0);
            return false;
        }
    }

    private final Class zzd(@NonNull zzfow zzfow0) throws zzfpf {
        Class class1;
        synchronized(this) {
            HashMap hashMap0 = zzfpg.zza;
            Class class0 = (Class)hashMap0.get("");
            if(class0 != null) {
                return class0;
            }
            try {
                if(!this.zze.zza(zzfow0.zzc())) {
                    throw new zzfpf(2026, "VM did not pass signature verification");
                }
            }
            catch(GeneralSecurityException generalSecurityException0) {
                throw new zzfpf(2026, generalSecurityException0);
            }
            try {
                File file0 = zzfow0.zzb();
                if(!file0.exists()) {
                    file0.mkdirs();
                }
                class1 = new DexClassLoader(zzfow0.zzc().getAbsolutePath(), file0.getAbsolutePath(), null, this.zzb.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
            }
            catch(ClassNotFoundException | SecurityException | IllegalArgumentException classNotFoundException0) {
                throw new zzfpf(2008, classNotFoundException0);
            }
            hashMap0.put("", class1);
            return class1;
        }
    }
}

