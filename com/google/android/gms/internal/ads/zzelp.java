package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.Nullable;
import com.google.common.util.concurrent.t0;
import java.util.ArrayList;

public final class zzelp implements zzetr {
    private final zzgcs zza;
    private final Context zzb;
    private final zzfcj zzc;
    @Nullable
    private final View zzd;

    public zzelp(zzgcs zzgcs0, Context context0, zzfcj zzfcj0, @Nullable ViewGroup viewGroup0) {
        this.zza = zzgcs0;
        this.zzb = context0;
        this.zzc = zzfcj0;
        this.zzd = viewGroup0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 3;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final t0 zzb() {
        zzbcl.zza(this.zzb);
        zzelo zzelo0 = () -> {
            ArrayList arrayList0 = new ArrayList();
            for(View view0 = this.zzd; view0 != null; view0 = (View)viewParent0) {
                ViewParent viewParent0 = view0.getParent();
                if(viewParent0 == null) {
                    break;
                }
                int v = viewParent0 instanceof ViewGroup ? ((ViewGroup)viewParent0).indexOfChild(view0) : -1;
                Bundle bundle0 = new Bundle();
                bundle0.putString("type", viewParent0.getClass().getName());
                bundle0.putInt("index_of_child", v);
                arrayList0.add(bundle0);
                if(!(viewParent0 instanceof View)) {
                    break;
                }
            }
            return new zzelq(this.zzb, this.zzc.zze, arrayList0);
        };
        return this.zza.zzb(zzelo0);
    }

    // 检测为 Lambda 实现
    final zzelq zzc() throws Exception [...]
}

