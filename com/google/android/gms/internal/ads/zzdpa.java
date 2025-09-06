package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.Nullable;

public final class zzdpa {
    @Nullable
    private Context zza;
    @Nullable
    private PopupWindow zzb;

    public final void zza(Context context0, View view0) {
    }

    public final void zzb() {
        Context context0 = this.zza;
        if(context0 != null && this.zzb != null) {
            if((!(context0 instanceof Activity) || !((Activity)context0).isDestroyed()) && (this.zzb != null && this.zzb.isShowing())) {
                this.zzb.dismiss();
            }
            this.zza = null;
            this.zzb = null;
        }
    }
}

