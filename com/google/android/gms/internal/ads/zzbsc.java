package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.Map;

public final class zzbsc extends zzbsi {
    private String zza;
    private boolean zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private final Object zzi;
    private final zzcex zzj;
    private final Activity zzk;
    private zzcgr zzl;
    private ImageView zzm;
    private LinearLayout zzn;
    private final zzbsj zzo;
    private PopupWindow zzp;
    private RelativeLayout zzq;
    private ViewGroup zzr;

    static {
        CollectionUtils.setOf(new String[]{"top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center"});
    }

    public zzbsc(zzcex zzcex0, zzbsj zzbsj0) {
        super(zzcex0, "resize");
        this.zza = "top-right";
        this.zzb = true;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = -1;
        this.zzi = new Object();
        this.zzj = zzcex0;
        this.zzk = zzcex0.zzi();
        this.zzo = zzbsj0;
    }

    public final void zza(boolean z) {
        synchronized(this.zzi) {
            if(this.zzp != null) {
                if(!((Boolean)zzbe.zzc().zza(zzbcl.zzkH)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                    this.zzm(z);
                }
                else {
                    zzbsa zzbsa0 = () -> this.zzm(z);
                    zzbzw.zzf.zza(zzbsa0);
                }
            }
        }
    }

    public final void zzb(Map map0) {
        int v16;
        int v6;
        int v5;
        int[] arr_v2;
        synchronized(this.zzi) {
            if(this.zzk == null) {
                this.zzh("Not an activity context. Cannot resize.");
                return;
            }
            if(this.zzj.zzO() == null) {
                this.zzh("Webview is not yet available, size is not set.");
                return;
            }
            if(this.zzj.zzO().zzi()) {
                this.zzh("Is interstitial. Cannot resize an interstitial.");
                return;
            }
            if(this.zzj.zzaF()) {
                this.zzh("Cannot resize an expanded banner.");
                return;
            }
            if(!TextUtils.isEmpty(((CharSequence)map0.get("width")))) {
                this.zzh = zzs.zzO(((String)map0.get("width")));
            }
            if(!TextUtils.isEmpty(((CharSequence)map0.get("height")))) {
                this.zze = zzs.zzO(((String)map0.get("height")));
            }
            if(!TextUtils.isEmpty(((CharSequence)map0.get("offsetX")))) {
                this.zzf = zzs.zzO(((String)map0.get("offsetX")));
            }
            if(!TextUtils.isEmpty(((CharSequence)map0.get("offsetY")))) {
                this.zzg = zzs.zzO(((String)map0.get("offsetY")));
            }
            if(!TextUtils.isEmpty(((CharSequence)map0.get("allowOffscreen")))) {
                this.zzb = Boolean.parseBoolean(((String)map0.get("allowOffscreen")));
            }
            String s = (String)map0.get("customClosePosition");
            if(!TextUtils.isEmpty(s)) {
                this.zza = s;
            }
            if(this.zzh >= 0 && this.zze >= 0) {
                Window window0 = this.zzk.getWindow();
                if(window0 != null && window0.getDecorView() != null) {
                    int[] arr_v = zzs.zzV(this.zzk);
                    int[] arr_v1 = zzs.zzR(this.zzk);
                    int v1 = arr_v[0];
                    int v2 = arr_v[1];
                    int v3 = this.zzh;
                    if(v3 < 50 || v3 > v1) {
                        zzo.zzj("Width is too small or too large.");
                        arr_v2 = null;
                    }
                    else {
                        int v4 = this.zze;
                        if(v4 < 50 || v4 > v2) {
                            zzo.zzj("Height is too small or too large.");
                            arr_v2 = null;
                        }
                        else if(v4 == v2 && v3 == v1) {
                            zzo.zzj("Cannot resize to a full-screen ad.");
                            arr_v2 = null;
                        }
                        else if(this.zzb) {
                            switch(this.zza) {
                                case "bottom-center": {
                                    v5 = this.zzc + this.zzf + (v3 >> 1) - 25;
                                    v6 = this.zzd + this.zzg + v4 - 50;
                                    break;
                                }
                                case "bottom-left": {
                                    v5 = this.zzc + this.zzf;
                                    v6 = this.zzd + this.zzg + v4 - 50;
                                    break;
                                }
                                case "bottom-right": {
                                    v5 = this.zzc + this.zzf + v3 - 50;
                                    v6 = this.zzd + this.zzg + v4 - 50;
                                    break;
                                }
                                case "center": {
                                    v5 = this.zzc + this.zzf + (v3 >> 1) - 25;
                                    v6 = this.zzd + this.zzg + (v4 >> 1) - 25;
                                    break;
                                }
                                case "top-center": {
                                    v5 = this.zzc + this.zzf + (v3 >> 1) - 25;
                                    v6 = this.zzd + this.zzg;
                                    break;
                                }
                                case "top-left": {
                                    v5 = this.zzc + this.zzf;
                                    v6 = this.zzd + this.zzg;
                                    break;
                                }
                                default: {
                                    v5 = this.zzc + this.zzf + v3 - 50;
                                    v6 = this.zzd + this.zzg;
                                }
                            }
                            arr_v2 = v5 < 0 || v5 + 50 > v1 || v6 < arr_v1[0] || v6 + 50 > arr_v1[1] ? null : new int[]{this.zzc + this.zzf, this.zzd + this.zzg};
                        }
                        else {
                            int[] arr_v3 = zzs.zzV(this.zzk);
                            int[] arr_v4 = zzs.zzR(this.zzk);
                            int v7 = arr_v3[0];
                            int v8 = this.zzc + this.zzf;
                            int v9 = this.zzd + this.zzg;
                            if(v8 < 0) {
                                v8 = 0;
                            }
                            else {
                                int v10 = this.zzh;
                                if(v8 + v10 > v7) {
                                    v8 = v7 - v10;
                                }
                            }
                            int v11 = arr_v4[0];
                            if(v9 < v11) {
                                v9 = v11;
                            }
                            else {
                                int v12 = this.zze;
                                int v13 = arr_v4[1];
                                if(v9 + v12 > v13) {
                                    v9 = v13 - v12;
                                }
                            }
                            arr_v2 = new int[]{v8, v9};
                        }
                    }
                    if(arr_v2 == null) {
                        this.zzh("Resize location out of screen or close button is not visible.");
                        return;
                    }
                    int v14 = zzf.zzx(this.zzk, this.zzh);
                    int v15 = zzf.zzx(this.zzk, this.zze);
                    ViewParent viewParent0 = ((View)this.zzj).getParent();
                    if(viewParent0 != null && viewParent0 instanceof ViewGroup) {
                        ((ViewGroup)viewParent0).removeView(((View)this.zzj));
                        PopupWindow popupWindow0 = this.zzp;
                        if(popupWindow0 == null) {
                            this.zzr = (ViewGroup)viewParent0;
                            ((View)this.zzj).setDrawingCacheEnabled(true);
                            Bitmap bitmap0 = Bitmap.createBitmap(((View)this.zzj).getDrawingCache());
                            ((View)this.zzj).setDrawingCacheEnabled(false);
                            ImageView imageView0 = new ImageView(this.zzk);
                            this.zzm = imageView0;
                            imageView0.setImageBitmap(bitmap0);
                            this.zzl = this.zzj.zzO();
                            this.zzr.addView(this.zzm);
                        }
                        else {
                            popupWindow0.dismiss();
                        }
                        RelativeLayout relativeLayout0 = new RelativeLayout(this.zzk);
                        this.zzq = relativeLayout0;
                        relativeLayout0.setBackgroundColor(0);
                        this.zzq.setLayoutParams(new ViewGroup.LayoutParams(v14, v15));
                        PopupWindow popupWindow1 = new PopupWindow(this.zzq, v14, v15, false);
                        this.zzp = popupWindow1;
                        popupWindow1.setOutsideTouchable(false);
                        this.zzp.setTouchable(true);
                        this.zzp.setClippingEnabled(!this.zzb);
                        this.zzq.addView(((View)this.zzj), -1, -1);
                        this.zzn = new LinearLayout(this.zzk);
                        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(zzf.zzx(this.zzk, 50), zzf.zzx(this.zzk, 50));
                        switch(this.zza) {
                            case "bottom-center": {
                                v16 = 4;
                                goto label_151;
                            }
                            case "bottom-left": {
                                v16 = 3;
                                goto label_151;
                            }
                            case "bottom-right": {
                                relativeLayout$LayoutParams0.addRule(12);
                                relativeLayout$LayoutParams0.addRule(11);
                                break;
                            }
                            case "center": {
                                v16 = 2;
                                goto label_151;
                            }
                            case "top-center": {
                                v16 = 1;
                            label_151:
                                if(v16 == 0) {
                                    relativeLayout$LayoutParams0.addRule(10);
                                    relativeLayout$LayoutParams0.addRule(9);
                                }
                                else {
                                    switch(v16) {
                                        case 1: {
                                            relativeLayout$LayoutParams0.addRule(10);
                                            relativeLayout$LayoutParams0.addRule(14);
                                            break;
                                        }
                                        case 2: {
                                            relativeLayout$LayoutParams0.addRule(13);
                                            break;
                                        }
                                        case 3: {
                                            relativeLayout$LayoutParams0.addRule(12);
                                            relativeLayout$LayoutParams0.addRule(9);
                                            break;
                                        }
                                        case 4: {
                                            relativeLayout$LayoutParams0.addRule(12);
                                            relativeLayout$LayoutParams0.addRule(14);
                                            break;
                                        }
                                        default: {
                                            relativeLayout$LayoutParams0.addRule(10);
                                            relativeLayout$LayoutParams0.addRule(11);
                                        }
                                    }
                                }
                                break;
                            }
                            case "top-left": {
                                v16 = 0;
                                goto label_151;
                            }
                            default: {
                                v16 = -1;
                                goto label_151;
                            }
                        }
                        this.zzn.setOnClickListener(new zzbsb(this));
                        this.zzn.setContentDescription("Close button");
                        this.zzq.addView(this.zzn, relativeLayout$LayoutParams0);
                        try {
                            this.zzp.showAtLocation(window0.getDecorView(), 0, zzf.zzx(this.zzk, arr_v2[0]), zzf.zzx(this.zzk, arr_v2[1]));
                        }
                        catch(RuntimeException runtimeException0) {
                            this.zzh("Cannot show popup window: " + runtimeException0.getMessage());
                            this.zzq.removeView(((View)this.zzj));
                            ViewGroup viewGroup0 = this.zzr;
                            if(viewGroup0 != null) {
                                viewGroup0.removeView(this.zzm);
                                this.zzr.addView(((View)this.zzj));
                                this.zzj.zzaj(this.zzl);
                            }
                            return;
                        }
                        int v17 = arr_v2[0];
                        int v18 = arr_v2[1];
                        zzbsj zzbsj0 = this.zzo;
                        if(zzbsj0 != null) {
                            zzbsj0.zza(v17, v18, this.zzh, this.zze);
                        }
                        zzcgr zzcgr0 = zzcgr.zzb(v14, v15);
                        this.zzj.zzaj(zzcgr0);
                        this.zzk(arr_v2[0], arr_v2[1] - zzs.zzR(this.zzk)[0], this.zzh, this.zze);
                        this.zzl("resized");
                        return;
                    }
                    this.zzh("Webview is detached, probably in the middle of a resize or expand.");
                    return;
                }
                this.zzh("Activity context is not ready, cannot get window or decor view.");
                return;
            }
            this.zzh("Invalid width and height options. Cannot resize.");
        }
    }

    // 检测为 Lambda 实现
    final void zzc(boolean z) [...]

    public final void zzd(int v, int v1, boolean z) {
        synchronized(this.zzi) {
            this.zzc = v;
            this.zzd = v1;
        }
    }

    public final void zze(int v, int v1) {
        this.zzc = v;
        this.zzd = v1;
    }

    public final boolean zzf() {
        synchronized(this.zzi) {
        }
        return this.zzp != null;
    }

    private final void zzm(boolean z) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzkI)).booleanValue()) {
            this.zzq.removeView(((View)this.zzj));
            this.zzp.dismiss();
        }
        else {
            this.zzp.dismiss();
            this.zzq.removeView(((View)this.zzj));
        }
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzkJ)).booleanValue()) {
            ViewParent viewParent0 = ((View)this.zzj).getParent();
            if(viewParent0 instanceof ViewGroup) {
                ((ViewGroup)viewParent0).removeView(((View)this.zzj));
            }
        }
        ViewGroup viewGroup0 = this.zzr;
        if(viewGroup0 != null) {
            viewGroup0.removeView(this.zzm);
            if(((Boolean)zzbe.zzc().zza(zzbcl.zzkK)).booleanValue()) {
                try {
                    this.zzr.addView(((View)this.zzj));
                    this.zzj.zzaj(this.zzl);
                }
                catch(IllegalStateException illegalStateException0) {
                    zzo.zzh("Unable to add webview back to view hierarchy.", illegalStateException0);
                }
            }
            else {
                this.zzr.addView(((View)this.zzj));
                this.zzj.zzaj(this.zzl);
            }
        }
        if(z) {
            this.zzl("default");
            zzbsj zzbsj0 = this.zzo;
            if(zzbsj0 != null) {
                zzbsj0.zzb();
            }
        }
        this.zzp = null;
        this.zzq = null;
        this.zzr = null;
        this.zzn = null;
    }
}

