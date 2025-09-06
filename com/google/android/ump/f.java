package com.google.android.ump;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.consent_sdk.zza;
import com.google.android.gms.internal.consent_sdk.zzbl;
import com.google.android.gms.internal.consent_sdk.zzbm;
import com.google.android.gms.internal.consent_sdk.zzbn;
import com.google.android.gms.internal.consent_sdk.zzcr;
import j..util.Objects;

public final class f {
    public interface a {
        void onConsentFormLoadFailure(@RecentlyNonNull e arg1);
    }

    public interface b {
        void onConsentFormLoadSuccess(@RecentlyNonNull com.google.android.ump.b arg1);
    }

    @RecentlyNonNull
    public static c a(@RecentlyNonNull Context context0) {
        return zza.zza(context0).zzb();
    }

    public static void b(@RecentlyNonNull Activity activity0, @RecentlyNonNull com.google.android.ump.b.a b$a0) {
        if(zza.zza(activity0).zzb().canRequestAds()) {
            b$a0.a(null);
            return;
        }
        zzbn zzbn0 = zza.zza(activity0).zzc();
        zzcr.zza();
        zzbl zzbl0 = new zzbl(activity0, b$a0);
        Objects.requireNonNull(b$a0);
        zzbn0.zzb(zzbl0, new zzbm(b$a0));
    }

    public static void c(@RecentlyNonNull Context context0, @RecentlyNonNull b f$b0, @RecentlyNonNull a f$a0) {
        zza.zza(context0).zzc().zzb(f$b0, f$a0);
    }

    public static void d(@RecentlyNonNull Activity activity0, @RecentlyNonNull com.google.android.ump.b.a b$a0) {
        zza.zza(activity0).zzc().zze(activity0, b$a0);
    }
}

