package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Rect;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager.LayoutParams;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.internal.ads.zzbcl;
import java.util.Locale;
import o3.j;

@TargetApi(28)
@j
public class zzx extends zzv {
    @Override  // com.google.android.gms.ads.internal.util.zzaa
    public final int zzj(AudioManager audioManager0) {
        return audioManager0.getStreamMinVolume(3);
    }

    @Override  // com.google.android.gms.ads.internal.util.zzaa
    public final void zzk(Activity activity0) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzbo)).booleanValue() && com.google.android.gms.ads.internal.zzv.zzp().zzi().zzj() == null && !activity0.isInMultiWindowMode()) {
            zzx.zzn(true, activity0);
            activity0.getWindow().getDecorView().setOnApplyWindowInsetsListener((View view0, WindowInsets windowInsets0) -> {
                if(com.google.android.gms.ads.internal.zzv.zzp().zzi().zzj() == null) {
                    DisplayCutout displayCutout0 = windowInsets0.getDisplayCutout();
                    String s = "";
                    if(displayCutout0 == null) {
                        com.google.android.gms.ads.internal.zzv.zzp().zzi().zzy("");
                    }
                    else {
                        zzg zzg0 = com.google.android.gms.ads.internal.zzv.zzp().zzi();
                        for(Object object0: displayCutout0.getBoundingRects()) {
                            String s1 = String.format(Locale.US, "%d,%d,%d,%d", ((Rect)object0).left, ((Rect)object0).top, ((Rect)object0).right, ((Rect)object0).bottom);
                            if(!TextUtils.isEmpty(s)) {
                                s = s + "|";
                            }
                            s = s + s1;
                        }
                        zzg0.zzy(s);
                    }
                }
                zzx.zzn(false, activity0);
                return view0.onApplyWindowInsets(windowInsets0);
            });
        }
    }

    // 检测为 Lambda 实现
    static final WindowInsets zzl(Activity activity0, View view0, WindowInsets windowInsets0) [...]

    private static final void zzn(boolean z, Activity activity0) {
        Window window0 = activity0.getWindow();
        WindowManager.LayoutParams windowManager$LayoutParams0 = window0.getAttributes();
        if((z ? 1 : 2) != windowManager$LayoutParams0.layoutInDisplayCutoutMode) {
            windowManager$LayoutParams0.layoutInDisplayCutoutMode = z ? 1 : 2;
            window0.setAttributes(windowManager$LayoutParams0);
        }
    }
}

