package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.zzv;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class zzclw implements zzcla {
    @Nullable
    private final CookieManager zza;

    public zzclw(Context context0) {
        this.zza = zzv.zzr().zza(context0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcla
    public final void zza(Map map0) {
        if(this.zza != null) {
            if(((String)map0.get("clear")) == null) {
                String s3 = (String)map0.get("cookie");
                if(!TextUtils.isEmpty(s3)) {
                    String s4 = (String)zzbe.zzc().zza(zzbcl.zzaY);
                    this.zza.setCookie(s4, s3);
                }
            }
            else {
                String s = (String)zzbe.zzc().zza(zzbcl.zzaY);
                CookieManager cookieManager0 = this.zza;
                if(cookieManager0 != null) {
                    String s1 = cookieManager0.getCookie(s);
                    if(s1 != null) {
                        List list0 = zzfvc.zzb(zzfty.zzc(';')).zzf(s1);
                        for(int v = 0; v < list0.size(); ++v) {
                            CookieManager cookieManager1 = this.zza;
                            String s2 = (String)list0.get(v);
                            Iterator iterator0 = zzfvc.zzb(zzfty.zzc('=')).zzd(s2).iterator();
                            iterator0.getClass();
                            if(!iterator0.hasNext()) {
                                throw new IndexOutOfBoundsException("position (0) must be less than the number of elements that remained (" + 0 + ")");
                            }
                            Object object0 = iterator0.next();
                            cookieManager1.setCookie(s, ((String)object0) + ((String)zzbe.zzc().zza(zzbcl.zzaK)));
                        }
                    }
                }
            }
        }
    }
}

