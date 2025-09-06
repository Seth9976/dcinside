package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.ViewTreeObserver;
import android.view.WindowManager.LayoutParams;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbv;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public final class zzdkb {
    private final zzdow zza;
    private final zzdnl zzb;
    private ViewTreeObserver.OnScrollChangedListener zzc;

    public zzdkb(zzdow zzdow0, zzdnl zzdnl0) {
        this.zza = zzdow0;
        this.zzb = zzdnl0;
        this.zzc = null;
    }

    public final View zza(@NonNull View view0, @NonNull WindowManager windowManager0) throws zzcfj {
        zzs zzs0 = zzs.zzc();
        zzcex zzcex0 = this.zza.zza(zzs0, null, null);
        zzcex0.zzF().setVisibility(4);
        zzcex0.zzF().setContentDescription("policy_validator");
        zzcex0.zzag("/sendMessageToSdk", (zzcex zzcex0, Map map0) -> this.zzb.zzj("sendMessageToNativeJs", map0));
        zzcex0.zzag("/hideValidatorOverlay", (zzcex zzcex0, Map map0) -> {
            zzo.zze("Hide native ad policy validator overlay.");
            zzcex0.zzF().setVisibility(8);
            if(zzcex0.zzF().getWindowToken() != null) {
                windowManager0.removeView(zzcex0.zzF());
            }
            zzcex0.destroy();
            ViewTreeObserver viewTreeObserver0 = view0.getViewTreeObserver();
            if(this.zzc != null && viewTreeObserver0 != null && viewTreeObserver0.isAlive()) {
                viewTreeObserver0.removeOnScrollChangedListener(this.zzc);
            }
        });
        zzcex0.zzag("/open", new zzbkb(null, null, null, null, null));
        WeakReference weakReference0 = new WeakReference(zzcex0);
        zzdjx zzdjx0 = (zzcex zzcex0, Map map0) -> {
            zzcex0.zzN().zzC((boolean z, int v, String s, String s1) -> {
                HashMap hashMap0 = new HashMap();
                hashMap0.put("messageType", "validatorHtmlLoaded");
                hashMap0.put("id", ((String)map0.get("id")));
                this.zzb.zzj("sendMessageToNativeJs", hashMap0);
            });
            if(map0 != null) {
                Context context0 = view0.getContext();
                int v = zzdkb.zzf(context0, ((String)map0.get("validator_width")), ((int)(((Integer)zzbe.zzc().zza(zzbcl.zzhV)))));
                int v1 = zzdkb.zzf(context0, ((String)map0.get("validator_height")), ((int)(((Integer)zzbe.zzc().zza(zzbcl.zzhW)))));
                int v2 = zzdkb.zzf(context0, ((String)map0.get("validator_x")), 0);
                int v3 = zzdkb.zzf(context0, ((String)map0.get("validator_y")), 0);
                zzcex0.zzaj(zzcgr.zzb(v, v1));
                try {
                    zzcex0.zzG().getSettings().setUseWideViewPort(((Boolean)zzbe.zzc().zza(zzbcl.zzhX)).booleanValue());
                    zzcex0.zzG().getSettings().setLoadWithOverviewMode(((Boolean)zzbe.zzc().zza(zzbcl.zzhY)).booleanValue());
                }
                catch(NullPointerException unused_ex) {
                }
                WindowManager.LayoutParams windowManager$LayoutParams0 = zzbv.zzb();
                windowManager$LayoutParams0.x = v2;
                windowManager$LayoutParams0.y = v3;
                windowManager0.updateViewLayout(zzcex0.zzF(), windowManager$LayoutParams0);
                Object object0 = map0.get("orientation");
                Rect rect0 = new Rect();
                if(view0.getGlobalVisibleRect(rect0)) {
                    this.zzc = new zzdka(view0, zzcex0, ((String)object0), windowManager$LayoutParams0, ("1".equals(((String)object0)) || "2".equals(((String)object0)) ? rect0.bottom : rect0.top) - v3, windowManager0);
                    ViewTreeObserver viewTreeObserver0 = view0.getViewTreeObserver();
                    if(viewTreeObserver0 != null && viewTreeObserver0.isAlive()) {
                        viewTreeObserver0.addOnScrollChangedListener(this.zzc);
                    }
                }
                String s = (String)map0.get("overlay_url");
                if(!TextUtils.isEmpty(s)) {
                    zzcex0.loadUrl(s);
                }
            }
        };
        this.zzb.zzm(weakReference0, "/loadNativeAdPolicyViolations", zzdjx0);
        WeakReference weakReference1 = new WeakReference(zzcex0);
        zzdjy zzdjy0 = new zzdjy();
        this.zzb.zzm(weakReference1, "/showValidatorOverlay", zzdjy0);
        return zzcex0.zzF();
    }

    // 检测为 Lambda 实现
    final void zzb(zzcex zzcex0, Map map0) [...]

    // 检测为 Lambda 实现
    final void zzc(WindowManager windowManager0, View view0, zzcex zzcex0, Map map0) [...]

    // 检测为 Lambda 实现
    final void zzd(View view0, WindowManager windowManager0, zzcex zzcex0, Map map0) [...]

    // 检测为 Lambda 实现
    final void zze(Map map0, boolean z, int v, String s, String s1) [...]

    private static final int zzf(Context context0, String s, int v) {
        try {
            v = Integer.parseInt(s);
        }
        catch(NumberFormatException unused_ex) {
        }
        return zzf.zzx(context0, v);
    }
}

