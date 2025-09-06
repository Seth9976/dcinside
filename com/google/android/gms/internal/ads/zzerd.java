package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.common.util.concurrent.t0;
import java.util.Set;

public final class zzerd implements zzetr {
    private final zzgcs zza;
    @Nullable
    private final ViewGroup zzb;
    private final Context zzc;
    private final Set zzd;

    public zzerd(zzgcs zzgcs0, @Nullable ViewGroup viewGroup0, Context context0, Set set0) {
        this.zza = zzgcs0;
        this.zzd = set0;
        this.zzb = viewGroup0;
        this.zzc = context0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 22;
    }

    @Override  // com.google.android.gms.internal.ads.zzetr
    public final t0 zzb() {
        zzerc zzerc0 = () -> {
            Boolean boolean0 = null;
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzfM)).booleanValue() && this.zzb != null && this.zzd.contains("banner")) {
                return new zzere(Boolean.valueOf(this.zzb.isHardwareAccelerated()));
            }
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzfN)).booleanValue() && this.zzd.contains("native")) {
                Context context0 = this.zzc;
                if(context0 instanceof Activity) {
                    boolean z = false;
                    Activity activity0 = (Activity)context0;
                    Window window0 = activity0.getWindow();
                    if(window0 != null && (window0.getAttributes().flags & 0x1000000) != 0) {
                        return new zzere(Boolean.TRUE);
                    }
                    try {
                        if((activity0.getPackageManager().getActivityInfo(activity0.getComponentName(), 0).flags & 0x200) != 0) {
                            z = true;
                        }
                        boolean0 = Boolean.valueOf(z);
                    }
                    catch(PackageManager.NameNotFoundException unused_ex) {
                    }
                    return new zzere(boolean0);
                }
            }
            return new zzere(null);
        };
        return this.zza.zzb(zzerc0);
    }

    // 检测为 Lambda 实现
    final zzere zzc() throws Exception [...]
}

