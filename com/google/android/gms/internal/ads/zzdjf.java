package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.zza;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbv;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

public final class zzdjf {
    static final ImageView.ScaleType zza;
    private final zzg zzb;
    private final zzfcj zzc;
    private final zzdik zzd;
    private final zzdif zze;
    @Nullable
    private final zzdjt zzf;
    @Nullable
    private final zzdkb zzg;
    private final Executor zzh;
    private final Executor zzi;
    private final zzbfl zzj;
    private final zzdic zzk;

    static {
        zzdjf.zza = ImageView.ScaleType.CENTER_INSIDE;
    }

    public zzdjf(zzg zzg0, zzfcj zzfcj0, zzdik zzdik0, zzdif zzdif0, @Nullable zzdjt zzdjt0, @Nullable zzdkb zzdkb0, Executor executor0, Executor executor1, zzdic zzdic0) {
        this.zzb = zzg0;
        this.zzc = zzfcj0;
        this.zzj = zzfcj0.zzi;
        this.zzd = zzdik0;
        this.zze = zzdif0;
        this.zzf = zzdjt0;
        this.zzg = zzdkb0;
        this.zzh = executor0;
        this.zzi = executor1;
        this.zzk = zzdic0;
    }

    // 检测为 Lambda 实现
    final void zza(ViewGroup viewGroup0) [...]

    // 检测为 Lambda 实现
    final void zzb(zzdkd zzdkd0) [...]

    public final void zzc(@Nullable zzdkd zzdkd0) {
        if(zzdkd0 != null && this.zzf != null && zzdkd0.zzh() != null && this.zzd.zzg()) {
            try {
                zzdkd0.zzh().addView(this.zzf.zza());
            }
            catch(zzcfj zzcfj0) {
                zze.zzb("web view can not be obtained", zzcfj0);
            }
        }
    }

    public final void zzd(@Nullable zzdkd zzdkd0) {
        if(zzdkd0 != null) {
            Context context0 = zzdkd0.zzf().getContext();
            if(zzbv.zzh(context0, this.zzd.zza)) {
                if(!(context0 instanceof Activity)) {
                    zzo.zze("Activity context is needed for policy validator.");
                    return;
                }
                if(this.zzg != null && zzdkd0.zzh() != null) {
                    try {
                        WindowManager windowManager0 = (WindowManager)context0.getSystemService("window");
                        FrameLayout frameLayout0 = zzdkd0.zzh();
                        windowManager0.addView(this.zzg.zza(frameLayout0, windowManager0), zzbv.zzb());
                    }
                    catch(zzcfj zzcfj0) {
                        zze.zzb("web view can not be obtained", zzcfj0);
                    }
                }
            }
        }
    }

    public final void zze(zzdkd zzdkd0) {
        zzdjd zzdjd0 = () -> {
            IObjectWrapper iObjectWrapper0;
            View view1;
            ViewGroup viewGroup0 = null;
            Context context0 = null;
            if(this.zzd.zzf() || this.zzd.zze()) {
                for(int v = 0; v < 2; ++v) {
                    View view0 = zzdkd0.zzg(new String[]{"1098", "3011"}[v]);
                    if(view0 != null && view0 instanceof ViewGroup) {
                        viewGroup0 = (ViewGroup)view0;
                        break;
                    }
                }
            }
            Context context1 = zzdkd0.zzf().getContext();
            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
            zzdif zzdif0 = this.zze;
            if(zzdif0.zze() != null) {
                zzbfl zzbfl0 = this.zzj;
                view1 = zzdif0.zze();
                if(zzbfl0 != null && viewGroup0 == null) {
                    zzdjf.zzh(relativeLayout$LayoutParams0, zzbfl0.zze);
                    view1.setLayoutParams(relativeLayout$LayoutParams0);
                    viewGroup0 = null;
                }
            }
            else if(zzdif0.zzl() instanceof zzbfg) {
                zzbfg zzbfg0 = (zzbfg)zzdif0.zzl();
                if(viewGroup0 == null) {
                    zzdjf.zzh(relativeLayout$LayoutParams0, zzbfg0.zzc());
                    viewGroup0 = null;
                }
                zzbfh zzbfh0 = new zzbfh(context1, zzbfg0, relativeLayout$LayoutParams0);
                zzbfh0.setContentDescription(((CharSequence)zzbe.zzc().zza(zzbcl.zzdT)));
                view1 = zzbfh0;
            }
            else {
                view1 = null;
            }
            if(view1 != null) {
                if(view1.getParent() instanceof ViewGroup) {
                    ((ViewGroup)view1.getParent()).removeView(view1);
                }
                if(viewGroup0 == null) {
                    zza zza0 = new zza(zzdkd0.zzf().getContext());
                    zza0.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    zza0.addView(view1);
                    FrameLayout frameLayout0 = zzdkd0.zzh();
                    if(frameLayout0 != null) {
                        frameLayout0.addView(zza0);
                    }
                }
                else {
                    viewGroup0.removeAllViews();
                    viewGroup0.addView(view1);
                }
                zzdkd0.zzq(zzdkd0.zzk(), view1, true);
            }
            ViewGroup viewGroup1 = null;
            zzfxn zzfxn0 = zzdjb.zza;
            int v1 = zzfxn0.size();
            int v2 = 0;
            while(v2 < v1) {
                View view2 = zzdkd0.zzg(((String)zzfxn0.get(v2)));
                ++v2;
                if(view2 instanceof ViewGroup) {
                    viewGroup1 = (ViewGroup)view2;
                    break;
                }
            }
            zzdjc zzdjc0 = () -> {
                zzdif zzdif0 = this.zze;
                if(zzdif0.zzf() != null) {
                    switch(zzdif0.zzc()) {
                        case 1: 
                        case 2: {
                            String s = String.valueOf(zzdif0.zzc());
                            this.zzb.zzF(this.zzc.zzf, s, viewGroup1 != null);
                            break;
                        }
                        case 6: {
                            this.zzb.zzF(this.zzc.zzf, "2", viewGroup1 != null);
                            this.zzb.zzF(this.zzc.zzf, "1", viewGroup1 != null);
                        }
                    }
                }
            };
            this.zzi.execute(zzdjc0);
            if(viewGroup1 != null) {
                if(this.zzi(viewGroup1, true)) {
                    zzdif zzdif1 = this.zze;
                    if(zzdif1.zzs() != null) {
                        zzdif1.zzs().zzar(new zzdje(zzdkd0, viewGroup1));
                    }
                }
                else if(((Boolean)zzbe.zzc().zza(zzbcl.zzjS)).booleanValue() && this.zzi(viewGroup1, false)) {
                    zzdif zzdif2 = this.zze;
                    if(zzdif2.zzq() != null) {
                        zzdif2.zzq().zzar(new zzdje(zzdkd0, viewGroup1));
                    }
                }
                else {
                    viewGroup1.removeAllViews();
                    View view3 = zzdkd0.zzf();
                    if(view3 != null) {
                        context0 = view3.getContext();
                    }
                    if(context0 != null) {
                        zzbft zzbft0 = this.zzk.zza();
                        if(zzbft0 != null) {
                            try {
                                iObjectWrapper0 = zzbft0.zzi();
                            }
                            catch(RemoteException unused_ex) {
                                zzo.zzj("Could not get main image drawable");
                                return;
                            }
                            if(iObjectWrapper0 != null) {
                                Drawable drawable0 = (Drawable)ObjectWrapper.unwrap(iObjectWrapper0);
                                if(drawable0 != null) {
                                    ImageView imageView0 = new ImageView(context0);
                                    imageView0.setImageDrawable(drawable0);
                                    IObjectWrapper iObjectWrapper1 = zzdkd0.zzj();
                                    if(iObjectWrapper1 == null || !((Boolean)zzbe.zzc().zza(zzbcl.zzga)).booleanValue()) {
                                        imageView0.setScaleType(zzdjf.zza);
                                    }
                                    else {
                                        imageView0.setScaleType(((ImageView.ScaleType)ObjectWrapper.unwrap(iObjectWrapper1)));
                                    }
                                    imageView0.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                    viewGroup1.addView(imageView0);
                                }
                            }
                        }
                    }
                }
            }
        };
        this.zzh.execute(zzdjd0);
    }

    public final boolean zzf(@NonNull ViewGroup viewGroup0) {
        return this.zzi(viewGroup0, false);
    }

    public final boolean zzg(@NonNull ViewGroup viewGroup0) {
        return this.zzi(viewGroup0, true);
    }

    private static void zzh(RelativeLayout.LayoutParams relativeLayout$LayoutParams0, int v) {
        switch(v) {
            case 0: {
                relativeLayout$LayoutParams0.addRule(10);
                relativeLayout$LayoutParams0.addRule(9);
                return;
            }
            case 2: {
                relativeLayout$LayoutParams0.addRule(12);
                relativeLayout$LayoutParams0.addRule(11);
                return;
            }
            case 3: {
                relativeLayout$LayoutParams0.addRule(12);
                relativeLayout$LayoutParams0.addRule(9);
                return;
            }
            default: {
                relativeLayout$LayoutParams0.addRule(10);
                relativeLayout$LayoutParams0.addRule(11);
            }
        }
    }

    private final boolean zzi(@NonNull ViewGroup viewGroup0, boolean z) {
        View view0 = z ? this.zze.zzf() : this.zze.zzg();
        if(view0 == null) {
            return false;
        }
        viewGroup0.removeAllViews();
        if(view0.getParent() instanceof ViewGroup) {
            ((ViewGroup)view0.getParent()).removeView(view0);
        }
        viewGroup0.addView(view0, (((Boolean)zzbe.zzc().zza(zzbcl.zzdV)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17)));
        return true;
    }
}

