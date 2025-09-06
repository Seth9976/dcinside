package com.google.android.gms.common;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;

@KeepForSdk
@ShowFirstParty
public class PackageSignatureVerifier {
    @Nullable
    @VisibleForTesting
    static volatile zzab zza;
    @Nullable
    private static zzac zzb;

    @NonNull
    @KeepForSdk
    @ShowFirstParty
    public PackageVerificationResult queryPackageSignatureVerified(@NonNull Context context0, @NonNull String s) {
        boolean z = GooglePlayServicesUtilLight.honorsDebugCertificates(context0);
        PackageSignatureVerifier.zza(context0);
        if(!zzn.zzf()) {
            throw new zzad();
        }
        String s1 = s + (z ? "-1" : "-0");
        if(PackageSignatureVerifier.zza != null && PackageSignatureVerifier.zza.zza.equals(s1)) {
            return PackageSignatureVerifier.zza.zzb;
        }
        PackageSignatureVerifier.zza(context0);
        zzw zzw0 = zzn.zzc(s, z, false, false);
        if(zzw0.zza) {
            PackageSignatureVerifier.zza = new zzab(s1, PackageVerificationResult.zzd(s, zzw0.zzd));
            return PackageSignatureVerifier.zza.zzb;
        }
        Preconditions.checkNotNull(zzw0.zzb);
        return PackageVerificationResult.zza(s, zzw0.zzb, zzw0.zzc);
    }

    @NonNull
    @KeepForSdk
    @ShowFirstParty
    public PackageVerificationResult queryPackageSignatureVerifiedWithRetry(@NonNull Context context0, @NonNull String s) {
        try {
            PackageVerificationResult packageVerificationResult0 = this.queryPackageSignatureVerified(context0, s);
            packageVerificationResult0.zzb();
            return packageVerificationResult0;
        }
        catch(SecurityException securityException0) {
            PackageVerificationResult packageVerificationResult1 = this.queryPackageSignatureVerified(context0, s);
            if(packageVerificationResult1.zzc()) {
                Log.e("PkgSignatureVerifier", "Got flaky result during package signature verification", securityException0);
                return packageVerificationResult1;
            }
            return packageVerificationResult1;
        }
    }

    private static zzac zza(Context context0) {
        synchronized(PackageSignatureVerifier.class) {
            if(PackageSignatureVerifier.zzb == null) {
                PackageSignatureVerifier.zzb = new zzac(context0);
            }
            return PackageSignatureVerifier.zzb;
        }
    }
}

