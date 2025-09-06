package com.google.android.gms.phenotype;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.UserManager;
import android.util.Log;
import androidx.core.content.PermissionChecker;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.phenotype.zzf;
import com.google.android.gms.internal.phenotype.zzh;
import o3.h;

@KeepForSdk
@Deprecated
public abstract class PhenotypeFlag {
    @KeepForSdk
    public static class Factory {
        private final String zzax;
        private final Uri zzay;
        private final String zzaz;
        private final String zzba;
        private final boolean zzbb;
        private final boolean zzbc;

        @KeepForSdk
        public Factory(Uri uri0) {
            this(null, uri0, "", "", false, false);
        }

        private Factory(String s, Uri uri0, String s1, String s2, boolean z, boolean z1) {
            this.zzax = s;
            this.zzay = uri0;
            this.zzaz = s1;
            this.zzba = s2;
            this.zzbb = z;
            this.zzbc = z1;
        }

        @KeepForSdk
        public PhenotypeFlag createFlag(String s, String s1) {
            return PhenotypeFlag.zza(this, s, s1);
        }

        @KeepForSdk
        public Factory withGservicePrefix(String s) {
            if(this.zzbb) {
                throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
            }
            return new Factory(this.zzax, this.zzay, s, this.zzba, false, this.zzbc);
        }

        @KeepForSdk
        public Factory withPhenotypePrefix(String s) {
            return new Factory(this.zzax, this.zzay, this.zzaz, s, this.zzbb, this.zzbc);
        }
    }

    interface zza {
        Object zzh();
    }

    private static final Object zzak = null;
    @SuppressLint({"StaticFieldLeak"})
    private static Context zzal = null;
    private static boolean zzam = false;
    private static Boolean zzan;
    private final Factory zzao;
    final String zzap;
    private final String zzaq;
    private final Object zzar;
    private Object zzas;

    static {
        PhenotypeFlag.zzak = new Object();
    }

    private PhenotypeFlag(Factory phenotypeFlag$Factory0, String s, Object object0) {
        this.zzas = null;
        if(phenotypeFlag$Factory0.zzax == null && phenotypeFlag$Factory0.zzay == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if(phenotypeFlag$Factory0.zzax != null && phenotypeFlag$Factory0.zzay != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.zzao = phenotypeFlag$Factory0;
        String s1 = phenotypeFlag$Factory0.zzaz;
        String s2 = String.valueOf(s);
        this.zzaq = s2.length() == 0 ? new String(s1) : s1 + s2;
        String s3 = phenotypeFlag$Factory0.zzba;
        String s4 = String.valueOf(s);
        this.zzap = s4.length() == 0 ? new String(s3) : s3 + s4;
        this.zzar = object0;
    }

    PhenotypeFlag(Factory phenotypeFlag$Factory0, String s, Object object0, zzr zzr0) {
        this(phenotypeFlag$Factory0, s, object0);
    }

    @KeepForSdk
    public Object get() {
        if(PhenotypeFlag.zzal == null) {
            throw new IllegalStateException("Must call PhenotypeFlag.init() first");
        }
        if(this.zzao.zzbc) {
            Object object0 = this.zze();
            if(object0 != null) {
                return object0;
            }
            Object object1 = this.zzd();
            return object1 == null ? this.zzar : object1;
        }
        Object object2 = this.zzd();
        if(object2 != null) {
            return object2;
        }
        Object object3 = this.zze();
        return object3 == null ? this.zzar : object3;
    }

    @KeepForSdk
    public static void maybeInit(Context context0) {
        zzh.maybeInit(context0);
        if(PhenotypeFlag.zzal == null) {
            zzh.init(context0);
            synchronized(PhenotypeFlag.zzak) {
                if(Build.VERSION.SDK_INT < 24 || !context0.isDeviceProtectedStorage()) {
                    Context context1 = context0.getApplicationContext();
                    if(context1 != null) {
                        context0 = context1;
                    }
                }
                if(PhenotypeFlag.zzal != context0) {
                    PhenotypeFlag.zzan = null;
                }
                PhenotypeFlag.zzal = context0;
            }
            PhenotypeFlag.zzam = false;
        }
    }

    private static PhenotypeFlag zza(Factory phenotypeFlag$Factory0, String s, String s1) {
        return new zzs(phenotypeFlag$Factory0, s, s1);
    }

    private static Object zza(zza phenotypeFlag$zza0) {
        try {
            return phenotypeFlag$zza0.zzh();
        }
        catch(SecurityException unused_ex) {
            long v = Binder.clearCallingIdentity();
            try {
                return phenotypeFlag$zza0.zzh();
            }
            finally {
                Binder.restoreCallingIdentity(v);
            }
        }
    }

    // 去混淆评级： 低(20)
    static boolean zza(String s, boolean z) {
        return PhenotypeFlag.zzf() ? ((Boolean)PhenotypeFlag.zza(() -> Boolean.valueOf(zzf.zza(PhenotypeFlag.zzal.getContentResolver(), s, false)))).booleanValue() : false;
    }

    public abstract Object zza(SharedPreferences arg1);

    public abstract Object zza(String arg1);

    // 检测为 Lambda 实现
    static final Boolean zzb(String s, boolean z) [...]

    @TargetApi(24)
    @h
    private final Object zzd() {
        if(!PhenotypeFlag.zza("gms:phenotype:phenotype_flag:debug_bypass_phenotype", false)) {
            if(this.zzao.zzay != null) {
                String s = (String)PhenotypeFlag.zza(new zzo(this, com.google.android.gms.phenotype.zza.zza(PhenotypeFlag.zzal.getContentResolver(), this.zzao.zzay)));
                return s == null ? null : this.zza(s);
            }
            if(this.zzao.zzax == null || Build.VERSION.SDK_INT >= 24 && !PhenotypeFlag.zzal.isDeviceProtectedStorage() && !((UserManager)PhenotypeFlag.zzal.getSystemService(UserManager.class)).isUserUnlocked()) {
                return null;
            }
            SharedPreferences sharedPreferences0 = PhenotypeFlag.zzal.getSharedPreferences(this.zzao.zzax, 0);
            return sharedPreferences0.contains(this.zzap) ? this.zza(sharedPreferences0) : null;
        }
        String s1 = String.valueOf(this.zzap);
        Log.w("PhenotypeFlag", (s1.length() == 0 ? new String("Bypass reading Phenotype values for flag: ") : "Bypass reading Phenotype values for flag: " + s1));
        return null;
    }

    @h
    private final Object zze() {
        if(!this.zzao.zzbb && PhenotypeFlag.zzf()) {
            String s = (String)PhenotypeFlag.zza(() -> zzf.zza(PhenotypeFlag.zzal.getContentResolver(), this.zzaq, null));
            return s == null ? null : this.zza(s);
        }
        return null;
    }

    private static boolean zzf() {
        if(PhenotypeFlag.zzan == null) {
            Context context0 = PhenotypeFlag.zzal;
            boolean z = false;
            if(context0 != null) {
                if(PermissionChecker.a(context0, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                    z = true;
                }
                PhenotypeFlag.zzan = Boolean.valueOf(z);
                return PhenotypeFlag.zzan.booleanValue();
            }
            return false;
        }
        return PhenotypeFlag.zzan.booleanValue();
    }

    // 检测为 Lambda 实现
    final String zzg() [...]
}

