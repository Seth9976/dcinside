package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsIntent.Builder;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.common.util.concurrent.t0;
import java.util.concurrent.Executor;

public final class zzeel implements zzecw {
    private final Context zza;
    private final zzdfu zzb;
    private final Executor zzc;
    private final zzfbn zzd;
    private final zzdrw zze;

    public zzeel(Context context0, Executor executor0, zzdfu zzdfu0, zzfbn zzfbn0, zzdrw zzdrw0) {
        this.zza = context0;
        this.zzb = zzdfu0;
        this.zzc = executor0;
        this.zzd = zzfbn0;
        this.zze = zzdrw0;
    }

    @Override  // com.google.android.gms.internal.ads.zzecw
    public final t0 zza(zzfca zzfca0, zzfbo zzfbo0) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzmT)).booleanValue()) {
            zzdrv zzdrv0 = this.zze.zza();
            zzdrv0.zzb("action", "cstm_tbs_rndr");
            zzdrv0.zzg();
        }
        String s = zzeel.zze(zzfbo0);
        if(s != null) {
            Uri uri0 = Uri.parse(s);
            return zzgch.zzn(zzgch.zzh(null), (Object object0) -> try {
                CustomTabsIntent customTabsIntent0 = new Builder().d();
                customTabsIntent0.a.setData(uri0);
                zzc zzc0 = new zzc(customTabsIntent0.a, null);
                zzcab zzcab0 = new zzcab();
                zzcrp zzcrp0 = new zzcrp(zzfca0, zzfbo0, null);
                zzdeu zzdeu0 = new zzdeu((boolean z, Context context0, zzcwg zzcwg0) -> try {
                    zzn.zza(context0, ((AdOverlayInfoParcel)zzcab0.get()), true, this.zze);
                }
                catch(Exception unused_ex) {
                }, null);
                zzder zzder0 = this.zzb.zze(zzcrp0, zzdeu0);
                zzcab0.zzc(new AdOverlayInfoParcel(zzc0, null, zzder0.zza(), null, new VersionInfoParcel(0, 0, false), null, null, zzfca0.zzb.zzb.zzb));
                this.zzd.zza();
                return zzgch.zzh(zzder0.zzg());
            }
            catch(Throwable throwable0) {
                zzo.zzh("Error in CustomTabsAdRenderer", throwable0);
                throw throwable0;
            }, this.zzc);
        }
        return zzgch.zzn(zzgch.zzh(null), (Object object0) -> try {
            CustomTabsIntent customTabsIntent0 = new Builder().d();
            customTabsIntent0.a.setData(null);
            zzc zzc0 = new zzc(customTabsIntent0.a, null);
            zzcab zzcab0 = new zzcab();
            zzcrp zzcrp0 = new zzcrp(zzfca0, zzfbo0, null);
            zzdeu zzdeu0 = new zzdeu((boolean z, Context context0, zzcwg zzcwg0) -> try {
                zzn.zza(context0, ((AdOverlayInfoParcel)zzcab0.get()), true, this.zze);
            }
            catch(Exception unused_ex) {
            }, null);
            zzder zzder0 = this.zzb.zze(zzcrp0, zzdeu0);
            zzcab0.zzc(new AdOverlayInfoParcel(zzc0, null, zzder0.zza(), null, new VersionInfoParcel(0, 0, false), null, null, zzfca0.zzb.zzb.zzb));
            this.zzd.zza();
            return zzgch.zzh(zzder0.zzg());
        }
        catch(Throwable throwable0) {
            zzo.zzh("Error in CustomTabsAdRenderer", throwable0);
            throw throwable0;
        }, this.zzc);
    }

    // 去混淆评级： 低(30)
    @Override  // com.google.android.gms.internal.ads.zzecw
    public final boolean zzb(zzfca zzfca0, zzfbo zzfbo0) {
        return this.zza instanceof Activity && zzbdm.zzg(this.zza) && !TextUtils.isEmpty(zzeel.zze(zzfbo0));
    }

    // 检测为 Lambda 实现
    final t0 zzc(Uri uri0, zzfca zzfca0, zzfbo zzfbo0, zzfbr zzfbr0, Object object0) throws Exception [...]

    // 检测为 Lambda 实现
    final void zzd(zzcab zzcab0, boolean z, Context context0, zzcwg zzcwg0) throws zzdgb [...]

    @Nullable
    private static String zze(zzfbo zzfbo0) {
        try {
            return zzfbo0.zzv.getString("tab_url");
        }
        catch(Exception unused_ex) {
            return null;
        }
    }
}

