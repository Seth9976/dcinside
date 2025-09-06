package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.internal.ads.zzbus;
import com.google.android.gms.internal.ads.zzbxu;
import java.util.Collections;
import java.util.List;
import o3.j;

@j
public final class zzb {
    private final Context zza;
    private boolean zzb;
    @Nullable
    private final zzbxu zzc;
    private final zzbus zzd;

    public zzb(Context context0, @Nullable zzbxu zzbxu0, @Nullable zzbus zzbus0) {
        this.zza = context0;
        this.zzc = zzbxu0;
        this.zzd = new zzbus(false, Collections.emptyList());
    }

    public final void zza() {
        this.zzb = true;
    }

    public final void zzb(@Nullable String s) {
        if(this.zzd()) {
            if(s == null) {
                s = "";
            }
            zzbxu zzbxu0 = this.zzc;
            if(zzbxu0 != null) {
                zzbxu0.zzd(s, null, 3);
                return;
            }
            zzbus zzbus0 = this.zzd;
            if(zzbus0.zza) {
                List list0 = zzbus0.zzb;
                if(list0 != null) {
                    for(Object object0: list0) {
                        String s1 = (String)object0;
                        if(!TextUtils.isEmpty(s1)) {
                            String s2 = s1.replace("{NAVIGATION_URL}", Uri.encode(s));
                            zzs.zzM(this.zza, "", s2);
                        }
                    }
                }
            }
        }
    }

    // 去混淆评级： 低(20)
    public final boolean zzc() {
        return !this.zzd() || this.zzb;
    }

    // 去混淆评级： 低(30)
    private final boolean zzd() {
        return this.zzc != null && this.zzc.zza().zzf || this.zzd.zza;
    }
}

