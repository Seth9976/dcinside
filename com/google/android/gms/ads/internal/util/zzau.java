package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri.Builder;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager.BadTokenException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbzw;
import com.google.android.gms.internal.ads.zzdur;
import com.google.android.gms.internal.ads.zzduv;
import com.google.android.gms.internal.ads.zzgcs;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public final class zzau {
    private final Context zza;
    private final zzduv zzb;
    private String zzc;
    private String zzd;
    private String zze;
    @Nullable
    private String zzf;
    private int zzg;
    private int zzh;
    private PointF zzi;
    private PointF zzj;
    private Handler zzk;
    private Runnable zzl;

    public zzau(Context context0) {
        this.zzg = 0;
        this.zzl = () -> {
            this.zzg = 4;
            this.zzr();
        };
        this.zza = context0;
        this.zzh = ViewConfiguration.get(context0).getScaledTouchSlop();
        zzv.zzu().zzb();
        this.zzk = zzv.zzu().zza();
        this.zzb = zzv.zzt().zza();
    }

    public zzau(Context context0, String s) {
        this(context0);
        this.zzc = s;
    }

    @Override
    public final String toString() {
        return "{Dialog: " + this.zzc + ",DebugSignal: " + this.zzf + ",AFMA Version: " + this.zze + ",Ad Unit ID: " + this.zzd + "}";
    }

    // 检测为 Lambda 实现
    final void zza() [...]

    // 检测为 Lambda 实现
    final void zzb(zzgcs zzgcs0) [...]

    // 检测为 Lambda 实现
    final void zzc() [...]

    // 检测为 Lambda 实现
    final void zzd() [...]

    // 检测为 Lambda 实现
    final void zze(zzgcs zzgcs0) [...]

    // 检测为 Lambda 实现
    final void zzf() [...]

    // 检测为 Lambda 实现
    final void zzg() [...]

    // 检测为 Lambda 实现
    final void zzh(AtomicInteger atomicInteger0, int v, int v1, int v2, DialogInterface dialogInterface0, int v3) [...]

    // 检测为 Lambda 实现
    final void zzi(String s, DialogInterface dialogInterface0, int v) [...]

    // 检测为 Lambda 实现
    final void zzj(int v, int v1, int v2, int v3, int v4, DialogInterface dialogInterface0, int v5) [...]

    // 检测为 Lambda 实现
    final void zzk() [...]

    // 检测为 Lambda 实现
    final void zzl() [...]

    public final void zzm(MotionEvent motionEvent0) {
        int v = motionEvent0.getActionMasked();
        int v1 = motionEvent0.getHistorySize();
        int v2 = motionEvent0.getPointerCount();
        if(v == 0) {
            this.zzg = 0;
            this.zzi = new PointF(motionEvent0.getX(0), motionEvent0.getY(0));
            return;
        }
        switch(this.zzg) {
            case 0: {
                if(v == 5) {
                    this.zzg = 5;
                    this.zzj = new PointF(motionEvent0.getX(1), motionEvent0.getY(1));
                    this.zzk.postDelayed(this.zzl, ((long)(((Long)zzbe.zzc().zza(zzbcl.zzeJ)))));
                    return;
                }
                break;
            }
            case 5: {
                if(v2 != 2) {
                    this.zzg = -1;
                    this.zzk.removeCallbacks(this.zzl);
                }
                else if(v == 2) {
                    int v4 = 0;
                    for(int v3 = 0; v3 < v1; ++v3) {
                        v4 |= !this.zzt(motionEvent0.getHistoricalX(0, v3), motionEvent0.getHistoricalY(0, v3), motionEvent0.getHistoricalX(1, v3), motionEvent0.getHistoricalY(1, v3));
                    }
                    if(!this.zzt(motionEvent0.getX(), motionEvent0.getY(), motionEvent0.getX(1), motionEvent0.getY(1)) || v4 != 0) {
                        this.zzg = -1;
                        this.zzk.removeCallbacks(this.zzl);
                        return;
                    }
                }
                break;
            }
        }
    }

    public final void zzn(String s) {
        this.zzd = s;
    }

    public final void zzo(String s) {
        this.zze = s;
    }

    public final void zzp(String s) {
        this.zzc = s;
    }

    public final void zzq(String s) {
        this.zzf = s;
    }

    // 检测为 Lambda 实现
    public final void zzr() [...]

    private final void zzs(Context context0) {
        int v3;
        ArrayList arrayList0 = new ArrayList();
        int v = zzau.zzu(arrayList0, "None", true);
        int v1 = zzau.zzu(arrayList0, "Shake", true);
        int v2 = zzau.zzu(arrayList0, "Flick", true);
        switch(this.zzb.zza().ordinal()) {
            case 1: {
                v3 = v1;
                break;
            }
            case 2: {
                v3 = v2;
                break;
            }
            default: {
                v3 = v;
            }
        }
        AlertDialog.Builder alertDialog$Builder0 = zzs.zzL(context0);
        AtomicInteger atomicInteger0 = new AtomicInteger(v3);
        alertDialog$Builder0.setTitle("Setup gesture");
        alertDialog$Builder0.setSingleChoiceItems(((CharSequence[])arrayList0.toArray(new String[0])), v3, new zzan(atomicInteger0));
        alertDialog$Builder0.setNegativeButton("Dismiss", (/* 缺少LAMBDA参数 */, /* 缺少LAMBDA参数 */) -> {
            try {
                String s = "Troubleshooting (enabled)";
                if(!(this.zza instanceof Activity)) {
                    zzo.zzi("Can not create dialog without Activity Context");
                    return;
                }
                if(!zzv.zzt().zzm()) {
                    s = "Troubleshooting";
                }
                ArrayList arrayList0 = new ArrayList();
                int v = zzau.zzu(arrayList0, "Ad information", true);
                int v1 = zzau.zzu(arrayList0, "Creative preview", true);
                int v2 = zzau.zzu(arrayList0, s, true);
                boolean z = ((Boolean)zzbe.zzc().zza(zzbcl.zzjc)).booleanValue();
                int v3 = zzau.zzu(arrayList0, "Open ad inspector", z);
                int v4 = zzau.zzu(arrayList0, "Ad inspector settings", z);
                AlertDialog.Builder alertDialog$Builder0 = zzs.zzL(this.zza);
                alertDialog$Builder0.setTitle("Select a debug mode").setItems(((CharSequence[])arrayList0.toArray(new String[0])), (DialogInterface dialogInterface0, int v5) -> {
                    if(v5 == v) {
                        if(!(this.zza instanceof Activity)) {
                            zzo.zzi("Can not create dialog without Activity Context");
                            return;
                        }
                        String s = this.zzc;
                        String s1 = "No debug information";
                        if(!TextUtils.isEmpty(s)) {
                            Uri uri0 = new Uri.Builder().encodedQuery(s.replaceAll("\\+", "%20")).build();
                            StringBuilder stringBuilder0 = new StringBuilder();
                            Map map0 = zzs.zzP(uri0);
                            for(Object object0: map0.keySet()) {
                                stringBuilder0.append(((String)object0));
                                stringBuilder0.append(" = ");
                                stringBuilder0.append(((String)map0.get(((String)object0))));
                                stringBuilder0.append("\n\n");
                            }
                            String s2 = stringBuilder0.toString().trim();
                            if(!TextUtils.isEmpty(s2)) {
                                s1 = s2;
                            }
                        }
                        AlertDialog.Builder alertDialog$Builder0 = zzs.zzL(this.zza);
                        alertDialog$Builder0.setMessage(s1);
                        alertDialog$Builder0.setTitle("Ad Information");
                        alertDialog$Builder0.setPositiveButton("Share", (DialogInterface dialogInterface0, int v) -> {
                            Intent intent0 = Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", s1), "Share via");
                            zzs.zzT(this.zza, intent0);
                        });
                        alertDialog$Builder0.setNegativeButton("Close", new zzai());
                        alertDialog$Builder0.create().show();
                        return;
                    }
                    if(v5 == v1) {
                        zzo.zze("Debug mode [Creative Preview] selected.");
                        zzag zzag0 = () -> {
                            zzay zzay0 = zzv.zzt();
                            Context context0 = this.zza;
                            String s = this.zzd;
                            String s1 = this.zze;
                            if(!zzay0.zzk(context0, s, s1)) {
                                zzay0.zzi(context0, "In-app preview failed to load because of a system error. Please try again later.", true, true);
                                return;
                            }
                            if("2".equals(zzay0.zza)) {
                                zzo.zze("Creative is not pushed for this device.");
                                zzay0.zzi(context0, "There was no creative pushed from DFP to the device.", false, false);
                                return;
                            }
                            if("1".equals(zzay0.zza)) {
                                zzo.zze("The app is not linked for creative preview.");
                                zzay0.zzd(context0, s, s1);
                                return;
                            }
                            if("0".equals(zzay0.zza)) {
                                zzo.zze("Device is linked for in app preview.");
                                zzay0.zzi(context0, "The device is successfully linked for creative preview.", false, true);
                            }
                        };
                        zzbzw.zza.execute(zzag0);
                        return;
                    }
                    if(v5 == v2) {
                        zzo.zze("Debug mode [Troubleshooting] selected.");
                        zzat zzat0 = () -> {
                            zzay zzay0 = zzv.zzt();
                            String s = this.zzd;
                            String s1 = this.zze;
                            String s2 = this.zzf;
                            boolean z = zzay0.zzm();
                            Context context0 = this.zza;
                            zzay0.zzh(zzay0.zzj(context0, s, s1));
                            if(zzay0.zzm()) {
                                if(!z && !TextUtils.isEmpty(s2)) {
                                    zzay0.zze(context0, s1, s2, s);
                                }
                                zzo.zze("Device is linked for debug signals.");
                                zzay0.zzi(context0, "The device is successfully linked for troubleshooting.", false, true);
                                return;
                            }
                            zzay0.zzd(context0, s, s1);
                        };
                        zzbzw.zza.execute(zzat0);
                        return;
                    }
                    if(v5 == v3) {
                        zzgcs zzgcs0 = zzbzw.zzf;
                        zzgcs zzgcs1 = zzbzw.zza;
                        if(this.zzb.zzq()) {
                            zzgcs0.execute(() -> zzv.zzt().zzc(this.zza));
                            return;
                        }
                        zzgcs1.execute(() -> {
                            if(!zzv.zzt().zzj(this.zza, this.zzd, this.zze)) {
                                zzv.zzt().zzd(this.zza, this.zzd, this.zze);
                                return;
                            }
                            zzgcs0.execute(() -> zzv.zzt().zzc(this.zza));
                        });
                        return;
                    }
                    if(v5 == v4) {
                        zzgcs zzgcs2 = zzbzw.zzf;
                        zzgcs zzgcs3 = zzbzw.zza;
                        if(this.zzb.zzq()) {
                            zzgcs2.execute(() -> this.zzs(this.zza));
                            return;
                        }
                        zzgcs3.execute(() -> {
                            if(!zzv.zzt().zzj(this.zza, this.zzd, this.zze)) {
                                zzv.zzt().zzd(this.zza, this.zzd, this.zze);
                                return;
                            }
                            zzgcs2.execute(() -> this.zzs(this.zza));
                        });
                    }
                });
                alertDialog$Builder0.create().show();
                return;
            }
            catch(WindowManager.BadTokenException windowManager$BadTokenException0) {
            }
            zze.zzb("", windowManager$BadTokenException0);
        });
        alertDialog$Builder0.setPositiveButton("Save", (DialogInterface dialogInterface0, int v3) -> {
            if(atomicInteger0.get() != v3) {
                if(atomicInteger0.get() == v1) {
                    this.zzb.zzm(zzdur.zzb);
                }
                else if(atomicInteger0.get() == v2) {
                    this.zzb.zzm(zzdur.zzc);
                }
                else {
                    this.zzb.zzm(zzdur.zza);
                }
            }
            this.zzr();
        });
        alertDialog$Builder0.setOnCancelListener((/* 缺少LAMBDA参数 */) -> {
            try {
                String s = "Troubleshooting (enabled)";
                if(!(this.zza instanceof Activity)) {
                    zzo.zzi("Can not create dialog without Activity Context");
                    return;
                }
                if(!zzv.zzt().zzm()) {
                    s = "Troubleshooting";
                }
                ArrayList arrayList0 = new ArrayList();
                int v = zzau.zzu(arrayList0, "Ad information", true);
                int v1 = zzau.zzu(arrayList0, "Creative preview", true);
                int v2 = zzau.zzu(arrayList0, s, true);
                boolean z = ((Boolean)zzbe.zzc().zza(zzbcl.zzjc)).booleanValue();
                int v3 = zzau.zzu(arrayList0, "Open ad inspector", z);
                int v4 = zzau.zzu(arrayList0, "Ad inspector settings", z);
                AlertDialog.Builder alertDialog$Builder0 = zzs.zzL(this.zza);
                alertDialog$Builder0.setTitle("Select a debug mode").setItems(((CharSequence[])arrayList0.toArray(new String[0])), (DialogInterface dialogInterface0, int v5) -> {
                    if(v5 == v) {
                        if(!(this.zza instanceof Activity)) {
                            zzo.zzi("Can not create dialog without Activity Context");
                            return;
                        }
                        String s = this.zzc;
                        String s1 = "No debug information";
                        if(!TextUtils.isEmpty(s)) {
                            Uri uri0 = new Uri.Builder().encodedQuery(s.replaceAll("\\+", "%20")).build();
                            StringBuilder stringBuilder0 = new StringBuilder();
                            Map map0 = zzs.zzP(uri0);
                            for(Object object0: map0.keySet()) {
                                stringBuilder0.append(((String)object0));
                                stringBuilder0.append(" = ");
                                stringBuilder0.append(((String)map0.get(((String)object0))));
                                stringBuilder0.append("\n\n");
                            }
                            String s2 = stringBuilder0.toString().trim();
                            if(!TextUtils.isEmpty(s2)) {
                                s1 = s2;
                            }
                        }
                        AlertDialog.Builder alertDialog$Builder0 = zzs.zzL(this.zza);
                        alertDialog$Builder0.setMessage(s1);
                        alertDialog$Builder0.setTitle("Ad Information");
                        alertDialog$Builder0.setPositiveButton("Share", (DialogInterface dialogInterface0, int v) -> {
                            Intent intent0 = Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", s1), "Share via");
                            zzs.zzT(this.zza, intent0);
                        });
                        alertDialog$Builder0.setNegativeButton("Close", new zzai());
                        alertDialog$Builder0.create().show();
                        return;
                    }
                    if(v5 == v1) {
                        zzo.zze("Debug mode [Creative Preview] selected.");
                        zzag zzag0 = () -> {
                            zzay zzay0 = zzv.zzt();
                            Context context0 = this.zza;
                            String s = this.zzd;
                            String s1 = this.zze;
                            if(!zzay0.zzk(context0, s, s1)) {
                                zzay0.zzi(context0, "In-app preview failed to load because of a system error. Please try again later.", true, true);
                                return;
                            }
                            if("2".equals(zzay0.zza)) {
                                zzo.zze("Creative is not pushed for this device.");
                                zzay0.zzi(context0, "There was no creative pushed from DFP to the device.", false, false);
                                return;
                            }
                            if("1".equals(zzay0.zza)) {
                                zzo.zze("The app is not linked for creative preview.");
                                zzay0.zzd(context0, s, s1);
                                return;
                            }
                            if("0".equals(zzay0.zza)) {
                                zzo.zze("Device is linked for in app preview.");
                                zzay0.zzi(context0, "The device is successfully linked for creative preview.", false, true);
                            }
                        };
                        zzbzw.zza.execute(zzag0);
                        return;
                    }
                    if(v5 == v2) {
                        zzo.zze("Debug mode [Troubleshooting] selected.");
                        zzat zzat0 = () -> {
                            zzay zzay0 = zzv.zzt();
                            String s = this.zzd;
                            String s1 = this.zze;
                            String s2 = this.zzf;
                            boolean z = zzay0.zzm();
                            Context context0 = this.zza;
                            zzay0.zzh(zzay0.zzj(context0, s, s1));
                            if(zzay0.zzm()) {
                                if(!z && !TextUtils.isEmpty(s2)) {
                                    zzay0.zze(context0, s1, s2, s);
                                }
                                zzo.zze("Device is linked for debug signals.");
                                zzay0.zzi(context0, "The device is successfully linked for troubleshooting.", false, true);
                                return;
                            }
                            zzay0.zzd(context0, s, s1);
                        };
                        zzbzw.zza.execute(zzat0);
                        return;
                    }
                    if(v5 == v3) {
                        zzgcs zzgcs0 = zzbzw.zzf;
                        zzgcs zzgcs1 = zzbzw.zza;
                        if(this.zzb.zzq()) {
                            zzgcs0.execute(() -> zzv.zzt().zzc(this.zza));
                            return;
                        }
                        zzgcs1.execute(() -> {
                            if(!zzv.zzt().zzj(this.zza, this.zzd, this.zze)) {
                                zzv.zzt().zzd(this.zza, this.zzd, this.zze);
                                return;
                            }
                            zzgcs0.execute(() -> zzv.zzt().zzc(this.zza));
                        });
                        return;
                    }
                    if(v5 == v4) {
                        zzgcs zzgcs2 = zzbzw.zzf;
                        zzgcs zzgcs3 = zzbzw.zza;
                        if(this.zzb.zzq()) {
                            zzgcs2.execute(() -> this.zzs(this.zza));
                            return;
                        }
                        zzgcs3.execute(() -> {
                            if(!zzv.zzt().zzj(this.zza, this.zzd, this.zze)) {
                                zzv.zzt().zzd(this.zza, this.zzd, this.zze);
                                return;
                            }
                            zzgcs2.execute(() -> this.zzs(this.zza));
                        });
                    }
                });
                alertDialog$Builder0.create().show();
                return;
            }
            catch(WindowManager.BadTokenException windowManager$BadTokenException0) {
            }
            zze.zzb("", windowManager$BadTokenException0);
        });
        alertDialog$Builder0.create().show();
    }

    private final boolean zzt(float f, float f1, float f2, float f3) {
        return Math.abs(this.zzi.x - f) < ((float)this.zzh) && Math.abs(this.zzi.y - f1) < ((float)this.zzh) && Math.abs(this.zzj.x - f2) < ((float)this.zzh) && Math.abs(this.zzj.y - f3) < ((float)this.zzh);
    }

    private static final int zzu(List list0, String s, boolean z) {
        if(!z) {
            return -1;
        }
        list0.add(s);
        return list0.size() - 1;
    }
}

