package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.internal.ads.zzapi;
import com.google.android.gms.internal.ads.zzapm;
import com.google.android.gms.internal.ads.zzapp;
import com.google.android.gms.internal.ads.zzapv;
import com.google.android.gms.internal.ads.zzaqa;
import com.google.android.gms.internal.ads.zzaqb;
import com.google.android.gms.internal.ads.zzaqi;
import com.google.android.gms.internal.ads.zzaqn;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzblm;
import com.google.android.gms.internal.ads.zzfpu;
import com.google.android.gms.internal.ads.zzfpv;
import java.io.File;
import java.util.regex.Pattern;

public final class zzaz extends zzaqb {
    private final Context zzb;

    private zzaz(Context context0, zzaqa zzaqa0) {
        super(zzaqa0);
        this.zzb = context0;
    }

    @Override  // com.google.android.gms.internal.ads.zzaqb
    public final zzapi zza(zzapm zzapm0) throws zzapv {
        if(zzapm0.zza() == 0 && Pattern.matches(((String)zzbe.zzc().zza(zzbcl.zzex)), zzapm0.zzk()) && zzf.zzs(this.zzb, 13400000)) {
            zzapi zzapi0 = new zzblm(this.zzb).zza(zzapm0);
            if(zzapi0 != null) {
                zze.zza(("Got gmscore asset response: " + zzapm0.zzk()));
                return zzapi0;
            }
            zze.zza(("Failed to get gmscore asset response: " + zzapm0.zzk()));
        }
        return super.zza(zzapm0);
    }

    public static zzapp zzb(Context context0) {
        zzaz zzaz0 = new zzaz(context0, new zzaqn(null, null));
        zzapp zzapp0 = new zzapp(new zzaqi(new File(zzfpv.zza(zzfpu.zza(), context0.getCacheDir(), "admob_volley")), 0x1400000), zzaz0, 4);
        zzapp0.zzd();
        return zzapp0;
    }
}

