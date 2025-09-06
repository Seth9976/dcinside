package com.google.android.gms.internal.clearcut;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.UserManager;
import android.util.Log;
import androidx.core.content.PermissionChecker;
import o3.h;

public abstract class zzae {
    private static final Object zzdn = null;
    private static boolean zzdo = false;
    private static volatile Boolean zzdp;
    private static volatile Boolean zzdq;
    private final zzao zzdr;
    final String zzds;
    private final String zzdt;
    private final Object zzdu;
    private Object zzdv;
    private volatile zzab zzdw;
    private volatile SharedPreferences zzdx;
    @SuppressLint({"StaticFieldLeak"})
    private static Context zzh;

    static {
        zzae.zzdn = new Object();
    }

    private zzae(zzao zzao0, String s, Object object0) {
        this.zzdv = null;
        this.zzdw = null;
        this.zzdx = null;
        if(zzao0.zzef == null && zzao0.zzeg == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if(zzao0.zzef != null && zzao0.zzeg != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.zzdr = zzao0;
        String s1 = zzao0.zzeh;
        String s2 = String.valueOf(s);
        this.zzdt = s2.length() == 0 ? new String(s1) : s1 + s2;
        String s3 = zzao0.zzei;
        String s4 = String.valueOf(s);
        this.zzds = s4.length() == 0 ? new String(s3) : s3 + s4;
        this.zzdu = object0;
    }

    zzae(zzao zzao0, String s, Object object0, zzai zzai0) {
        this(zzao0, s, object0);
    }

    public final Object get() {
        if(zzae.zzh == null) {
            throw new IllegalStateException("Must call PhenotypeFlag.init() first");
        }
        if(this.zzdr.zzek) {
            Object object0 = this.zzm();
            if(object0 != null) {
                return object0;
            }
            Object object1 = this.zzl();
            return object1 == null ? this.zzdu : object1;
        }
        Object object2 = this.zzl();
        if(object2 != null) {
            return object2;
        }
        Object object3 = this.zzm();
        return object3 == null ? this.zzdu : object3;
    }

    public static void maybeInit(Context context0) {
        if(zzae.zzh == null) {
            Object object0 = zzae.zzdn;
            synchronized(object0) {
                if(Build.VERSION.SDK_INT < 24 || !context0.isDeviceProtectedStorage()) {
                    Context context1 = context0.getApplicationContext();
                    if(context1 != null) {
                        context0 = context1;
                    }
                }
                if(zzae.zzh != context0) {
                    zzae.zzdp = null;
                }
                zzae.zzh = context0;
            }
            zzae.zzdo = false;
        }
    }

    private static zzae zza(zzao zzao0, String s, Object object0, zzan zzan0) {
        return new zzal(zzao0, s, object0, zzan0);
    }

    private static zzae zza(zzao zzao0, String s, String s1) {
        return new zzak(zzao0, s, s1);
    }

    private static zzae zza(zzao zzao0, String s, boolean z) {
        return new zzaj(zzao0, s, Boolean.valueOf(z));
    }

    private static Object zza(zzam zzam0) {
        try {
            return zzam0.zzp();
        }
        catch(SecurityException unused_ex) {
            long v = Binder.clearCallingIdentity();
            try {
                return zzam0.zzp();
            }
            finally {
                Binder.restoreCallingIdentity(v);
            }
        }
    }

    // 去混淆评级： 低(20)
    static boolean zza(String s, boolean z) {
        return zzae.zzn() ? ((Boolean)zzae.zza(() -> Boolean.valueOf(zzy.zza(zzae.zzh.getContentResolver(), s, false)))).booleanValue() : false;
    }

    protected abstract Object zza(SharedPreferences arg1);

    static zzae zzb(zzao zzao0, String s, String s1) {
        return zzae.zza(zzao0, s, null);
    }

    static zzae zzb(zzao zzao0, String s, boolean z) {
        return zzae.zza(zzao0, s, false);
    }

    // 检测为 Lambda 实现
    static final Boolean zzb(String s, boolean z) [...]

    protected abstract Object zzb(String arg1);

    @TargetApi(24)
    @h
    private final Object zzl() {
        boolean z;
        if(zzae.zza("gms:phenotype:phenotype_flag:debug_bypass_phenotype", false)) {
            String s1 = String.valueOf(this.zzds);
            Log.w("PhenotypeFlag", (s1.length() == 0 ? new String("Bypass reading Phenotype values for flag: ") : "Bypass reading Phenotype values for flag: " + s1));
        }
        else {
            if(this.zzdr.zzeg != null) {
                if(this.zzdw == null) {
                    this.zzdw = zzab.zza(zzae.zzh.getContentResolver(), this.zzdr.zzeg);
                }
                String s = (String)zzae.zza(new zzaf(this, this.zzdw));
                return s == null ? null : this.zzb(s);
            }
            if(this.zzdr.zzef != null) {
                if(Build.VERSION.SDK_INT < 24 || zzae.zzh.isDeviceProtectedStorage()) {
                    z = true;
                }
                else {
                    if(zzae.zzdq == null || !zzae.zzdq.booleanValue()) {
                        zzae.zzdq = Boolean.valueOf(((UserManager)zzae.zzh.getSystemService(UserManager.class)).isUserUnlocked());
                    }
                    z = zzae.zzdq.booleanValue();
                }
                if(!z) {
                    return null;
                }
                if(this.zzdx == null) {
                    this.zzdx = zzae.zzh.getSharedPreferences(this.zzdr.zzef, 0);
                }
                SharedPreferences sharedPreferences0 = this.zzdx;
                return sharedPreferences0.contains(this.zzds) ? this.zza(sharedPreferences0) : null;
            }
        }
        return null;
    }

    @h
    private final Object zzm() {
        if(!this.zzdr.zzej && zzae.zzn()) {
            String s = (String)zzae.zza(() -> zzy.zza(zzae.zzh.getContentResolver(), this.zzdt, null));
            return s == null ? null : this.zzb(s);
        }
        return null;
    }

    private static boolean zzn() {
        if(zzae.zzdp == null) {
            Context context0 = zzae.zzh;
            boolean z = false;
            if(context0 != null) {
                if(PermissionChecker.a(context0, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                    z = true;
                }
                zzae.zzdp = Boolean.valueOf(z);
                return zzae.zzdp.booleanValue();
            }
            return false;
        }
        return zzae.zzdp.booleanValue();
    }

    // 检测为 Lambda 实现
    final String zzo() [...]
}

