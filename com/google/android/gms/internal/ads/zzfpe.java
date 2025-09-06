package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Hex;
import java.io.File;
import java.util.HashSet;

public final class zzfpe {
    private static final Object zza;
    private final Context zzb;
    private final SharedPreferences zzc;
    private final String zzd;
    private final zzfol zze;
    private boolean zzf;

    static {
        zzfpe.zza = new Object();
    }

    public zzfpe(@NonNull Context context0, @NonNull int v, @NonNull zzfol zzfol0, boolean z) {
        this.zzf = false;
        this.zzb = context0;
        this.zzd = Integer.toString(v - 1);
        this.zzc = context0.getSharedPreferences("pcvmspf", 0);
        this.zze = zzfol0;
        this.zzf = z;
    }

    public final boolean zza(@NonNull zzaxw zzaxw0) {
        long v = System.currentTimeMillis();
        synchronized(zzfpe.zza) {
            if(!zzfoy.zze(new File(this.zze(""), "pcbc"), zzaxw0.zzd().zzA())) {
                this.zzi(4020, v);
                return false;
            }
            String s = zzfpe.zzf(zzaxw0);
            SharedPreferences.Editor sharedPreferences$Editor0 = this.zzc.edit();
            sharedPreferences$Editor0.putString(this.zzh(), s);
            boolean z = sharedPreferences$Editor0.commit();
            if(z) {
                this.zzi(5015, v);
            }
            else {
                this.zzi(0xFB5, v);
            }
            return z;
        }
    }

    public final boolean zzb(@NonNull zzaxw zzaxw0, @Nullable zzfpd zzfpd0) {
        long v1 = System.currentTimeMillis();
        synchronized(zzfpe.zza) {
            if(this.zzk(1) != null) {
                this.zzi(0xFAE, v1);
                return false;
            }
            String s = "1";
            String s1 = "1";
            long v3 = System.currentTimeMillis();
            File file0 = this.zze("");
            if(file0.exists()) {
                if(!file0.isDirectory()) {
                    s1 = "0";
                }
                this.zzj(0xFB7, v3, "d:" + s1 + ",f:" + (file0.isFile() ? "1" : "0"));
                this.zzi(0xFAF, v3);
            }
            else if(!file0.mkdirs()) {
                if(!file0.canWrite()) {
                    s = "0";
                }
                this.zzj(0xFB8, v3, "cw:" + s);
                this.zzi(0xFAF, v3);
                return false;
            }
            File file1 = this.zze("");
            File file2 = new File(file1, "pcam.jar");
            File file3 = new File(file1, "pcbc");
            if(!zzfoy.zze(file2, zzaxw0.zzf().zzA())) {
                this.zzi(0xFB0, v1);
                return false;
            }
            if(!zzfoy.zze(file3, zzaxw0.zzd().zzA())) {
                this.zzi(0xFB1, v1);
                return false;
            }
            if(zzfpd0 != null && !zzfpd0.zza(file2)) {
                this.zzi(0xFB2, v1);
                zzfoy.zzd(file1);
                return false;
            }
            String s2 = zzfpe.zzf(zzaxw0);
            long v4 = System.currentTimeMillis();
            String s3 = this.zzc.getString(this.zzh(), null);
            SharedPreferences.Editor sharedPreferences$Editor0 = this.zzc.edit();
            sharedPreferences$Editor0.putString(this.zzh(), s2);
            if(s3 != null) {
                sharedPreferences$Editor0.putString(this.zzg(), s3);
            }
            if(!sharedPreferences$Editor0.commit()) {
                this.zzi(0xFB3, v4);
                return false;
            }
            HashSet hashSet0 = new HashSet();
            if(this.zzk(1) != null) {
                hashSet0.add("");
            }
            if(this.zzk(2) != null) {
                hashSet0.add("");
            }
            File[] arr_file = new File(this.zzb.getDir("pccache", 0), this.zzd).listFiles();
            for(int v = 0; v < arr_file.length; ++v) {
                File file4 = arr_file[v];
                if(!hashSet0.contains(file4.getName())) {
                    zzfoy.zzd(file4);
                }
            }
            this.zzi(5014, v1);
            return true;
        }
    }

    @Nullable
    public final zzfow zzc(int v) {
        File file3;
        File file2;
        File file1;
        zzaxz zzaxz0;
        long v1 = System.currentTimeMillis();
        synchronized(zzfpe.zza) {
            zzaxz0 = this.zzk(1);
            if(zzaxz0 == null) {
                this.zzi(0xFB6, v1);
                return null;
            }
            File file0 = this.zze("");
            file1 = new File(file0, "pcam.jar");
            if(!file1.exists()) {
                file1 = new File(file0, "pcam");
            }
            file2 = new File(file0, "pcbc");
            file3 = new File(file0, "pcopt");
            this.zzi(5016, v1);
        }
        return new zzfow(zzaxz0, file1, file2, file3);
    }

    public final boolean zzd(int v) {
        long v1 = System.currentTimeMillis();
        synchronized(zzfpe.zza) {
            if(this.zzk(1) == null) {
                this.zzi(0xFB9, v1);
                return false;
            }
            File file0 = this.zze("");
            if(!new File(file0, "pcam.jar").exists()) {
                this.zzi(0xFBA, v1);
                return false;
            }
            if(!new File(file0, "pcbc").exists()) {
                this.zzi(0xFBB, v1);
                return false;
            }
            this.zzi(5019, v1);
            return true;
        }
    }

    private final File zze(@NonNull String s) {
        return new File(new File(this.zzb.getDir("pccache", 0), this.zzd), s);
    }

    private static String zzf(@NonNull zzaxw zzaxw0) {
        zzaxx zzaxx0 = zzaxz.zzd();
        zzaxx0.zze("");
        zzaxx0.zza("");
        zzaxx0.zzb(zzaxw0.zzc().zza());
        zzaxx0.zzd(zzaxw0.zzc().zzc());
        zzaxx0.zzc(zzaxw0.zzc().zzb());
        return Hex.bytesToStringLowercase(((zzaxz)zzaxx0.zzbn()).zzaV());
    }

    private final String zzg() {
        return "FBAMTD" + this.zzd;
    }

    private final String zzh() {
        return "LATMTD" + this.zzd;
    }

    private final void zzi(int v, long v1) {
        this.zze.zza(v, v1);
    }

    private final void zzj(int v, long v1, String s) {
        this.zze.zzb(v, v1, s);
    }

    @Nullable
    private final zzaxz zzk(int v) {
        long v1;
        String s = v == 1 ? this.zzc.getString(this.zzh(), null) : this.zzc.getString(this.zzg(), null);
        if(s == null) {
            return null;
        }
        try {
            v1 = System.currentTimeMillis();
            byte[] arr_b = Hex.stringToBytes(s);
            return zzaxz.zzi(zzgwj.zzv(arr_b, 0, arr_b.length), (this.zzf ? zzgxb.zza() : zzgxb.zzb()));
        }
        catch(zzgyg unused_ex) {
            this.zzi(2029, v1);
            return null;
        }
        catch(NullPointerException unused_ex) {
            return null;
        }
        catch(RuntimeException unused_ex) {
            this.zzi(0x7F0, v1);
            return null;
        }
    }
}

