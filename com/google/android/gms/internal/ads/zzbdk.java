package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import com.google.android.gms.ads.internal.client.zzbe;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzbdk extends CustomTabsServiceConnection {
    public static final int zza;
    private final AtomicBoolean zzb;
    @Nullable
    private Context zzc;
    @Nullable
    private zzdrw zzd;
    @Nullable
    private CustomTabsSession zze;
    @Nullable
    private CustomTabsClient zzf;

    public zzbdk() {
        this.zzb = new AtomicBoolean(false);
    }

    @Override  // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void onCustomTabsServiceConnected(@NonNull ComponentName componentName0, @NonNull CustomTabsClient customTabsClient0) {
        this.zzf = customTabsClient0;
        customTabsClient0.n(0L);
        this.zze = customTabsClient0.k(new zzbdj(this));
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName0) {
        this.zzf = null;
        this.zze = null;
    }

    @Nullable
    public final CustomTabsSession zza() {
        if(this.zze == null) {
            zzbdi zzbdi0 = () -> this.zzf(this.zzc);
            zzbzw.zza.execute(zzbdi0);
        }
        return this.zze;
    }

    public final void zzb(Context context0, zzdrw zzdrw0) {
        if(this.zzb.getAndSet(true)) {
            return;
        }
        this.zzc = context0;
        this.zzd = zzdrw0;
        this.zzf(context0);
    }

    // 检测为 Lambda 实现
    final void zzc() [...]

    // 检测为 Lambda 实现
    final void zzd(int v) [...]

    @VisibleForTesting
    public final void zze(int v) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzeF)).booleanValue() && this.zzd != null) {
            zzbdh zzbdh0 = () -> {
                zzdrw zzdrw0 = this.zzd;
                if(zzdrw0 != null) {
                    zzdrv zzdrv0 = zzdrw0.zza();
                    zzdrv0.zzb("action", "cct_nav");
                    zzdrv0.zzb("cct_navs", String.valueOf(v));
                    zzdrv0.zzg();
                }
            };
            zzbzw.zza.execute(zzbdh0);
        }
    }

    private final void zzf(@Nullable Context context0) {
        if(this.zzf == null && context0 != null) {
            String s = CustomTabsClient.h(context0, null);
            if(s != null) {
                CustomTabsClient.b(context0, s, this);
            }
        }
    }
}

