package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import java.util.Set;
import o3.h;

@KeepForSdk
@ShowFirstParty
public class GoogleSignatureVerifier {
    @h
    private static GoogleSignatureVerifier zza;
    @h
    private static volatile Set zzb;
    @h
    private static volatile Set zzc;
    private final Context zzd;
    private volatile String zze;

    public GoogleSignatureVerifier(@NonNull Context context0) {
        this.zzd = context0.getApplicationContext();
    }

    @NonNull
    @KeepForSdk
    public static GoogleSignatureVerifier getInstance(@NonNull Context context0) {
        Preconditions.checkNotNull(context0);
        synchronized(GoogleSignatureVerifier.class) {
            if(GoogleSignatureVerifier.zza == null) {
                zzn.zze(context0);
                GoogleSignatureVerifier.zza = new GoogleSignatureVerifier(context0);
            }
            return GoogleSignatureVerifier.zza;
        }
    }

    @KeepForSdk
    public boolean isGooglePublicSignedPackage(@NonNull PackageInfo packageInfo0) {
        if(packageInfo0 == null) {
            return false;
        }
        if(GoogleSignatureVerifier.zzb(packageInfo0, false)) {
            return true;
        }
        if(GoogleSignatureVerifier.zzb(packageInfo0, true)) {
            if(GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzd)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren\'t accepted on this build.");
        }
        return false;
    }

    @KeepForSdk
    @ShowFirstParty
    public boolean isPackageGoogleSigned(@h String s) {
        zzw zzw0 = this.zzc(s, false, false);
        zzw0.zze();
        return zzw0.zza;
    }

    @KeepForSdk
    @ShowFirstParty
    public boolean isUidGoogleSigned(int v) {
        zzw zzw0;
        String[] arr_s = this.zzd.getPackageManager().getPackagesForUid(v);
        if(arr_s == null || arr_s.length == 0) {
            zzw0 = zzw.zzc("no pkgs");
        }
        else {
            zzw0 = null;
            for(int v1 = 0; v1 < arr_s.length; ++v1) {
                zzw0 = this.zzc(arr_s[v1], false, false);
                if(zzw0.zza) {
                    zzw0.zze();
                    return zzw0.zza;
                }
            }
            Preconditions.checkNotNull(zzw0);
        }
        zzw0.zze();
        return zzw0.zza;
    }

    @h
    static final zzj zza(PackageInfo packageInfo0, zzj[] arr_zzj) {
        Signature[] arr_signature = packageInfo0.signatures;
        if(arr_signature != null) {
            if(arr_signature.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            zzk zzk0 = new zzk(packageInfo0.signatures[0].toByteArray());
            for(int v = 0; v < arr_zzj.length; ++v) {
                if(arr_zzj[v].equals(zzk0)) {
                    return arr_zzj[v];
                }
            }
        }
        return null;
    }

    public static final boolean zzb(@NonNull PackageInfo packageInfo0, boolean z) {
        if(z) {
            if(packageInfo0 == null) {
                throw new NullPointerException();
            }
            if("com.android.vending".equals(packageInfo0.packageName) || "com.google.android.gms".equals(packageInfo0.packageName)) {
                if(packageInfo0.applicationInfo != null && (packageInfo0.applicationInfo.flags & 0x81) != 0) {
                    return packageInfo0 == null || packageInfo0.signatures == null ? false : GoogleSignatureVerifier.zza(packageInfo0, zzm.zza) != null;
                }
                return packageInfo0 == null || packageInfo0.signatures == null ? false : GoogleSignatureVerifier.zza(packageInfo0, new zzj[]{zzm.zza[0]}) != null;
            }
        }
        return packageInfo0 == null || packageInfo0.signatures == null ? false : (z ? GoogleSignatureVerifier.zza(packageInfo0, zzm.zza) : GoogleSignatureVerifier.zza(packageInfo0, new zzj[]{zzm.zza[0]})) != null;
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    private final zzw zzc(@h String s, boolean z, boolean z1) {
        PackageInfo packageInfo0;
        zzw zzw0;
        if(s == null) {
            return zzw.zzc("null pkg");
        }
        if(!s.equals(this.zze)) {
            if(zzn.zzg()) {
                zzw0 = zzn.zzb(s, GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzd), false, false);
            }
            else {
                try {
                    packageInfo0 = this.zzd.getPackageManager().getPackageInfo(s, 0x40);
                }
                catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                    return zzw.zzd(("no pkg " + s), packageManager$NameNotFoundException0);
                }
                boolean z2 = GooglePlayServicesUtilLight.honorsDebugCertificates(this.zzd);
                if(packageInfo0 == null) {
                    zzw0 = zzw.zzc("null pkg");
                }
                else if(packageInfo0.signatures == null || packageInfo0.signatures.length != 1) {
                    zzw0 = zzw.zzc("single cert required");
                }
                else {
                    zzk zzk0 = new zzk(packageInfo0.signatures[0].toByteArray());
                    String s1 = packageInfo0.packageName;
                    zzw zzw1 = zzn.zza(s1, zzk0, z2, false);
                    zzw0 = !zzw1.zza || (packageInfo0.applicationInfo == null || (packageInfo0.applicationInfo.flags & 2) == 0 || !zzn.zza(s1, zzk0, false, true).zza) ? zzw1 : zzw.zzc("debuggable release cert app rejected");
                }
            }
            if(zzw0.zza) {
                this.zze = s;
            }
            return zzw0;
        }
        return zzw.zzb();
    }
}

