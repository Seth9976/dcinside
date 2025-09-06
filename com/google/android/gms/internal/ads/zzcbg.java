package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.impl.R.string;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;
import o3.j;

@j
public final class zzcbg extends FrameLayout implements zzcax {
    @VisibleForTesting
    final zzcbu zza;
    private final zzcbs zzb;
    private final FrameLayout zzc;
    private final View zzd;
    private final zzbda zze;
    private final long zzf;
    @Nullable
    private final zzcay zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private String zzn;
    private String[] zzo;
    private Bitmap zzp;
    private final ImageView zzq;
    private boolean zzr;

    public zzcbg(Context context0, zzcbs zzcbs0, int v, boolean z, zzbda zzbda0, zzcbr zzcbr0) {
        super(context0);
        zzcem zzcem0;
        this.zzb = zzcbs0;
        this.zze = zzbda0;
        FrameLayout frameLayout0 = new FrameLayout(context0);
        this.zzc = frameLayout0;
        this.addView(frameLayout0, new FrameLayout.LayoutParams(-1, -1));
        Preconditions.checkNotNull(zzcbs0.zzj());
        zzcbs0.zzj();
        zzcbt zzcbt0 = new zzcbt(context0, zzcbs0.zzn(), zzcbs0.zzs(), zzbda0, zzcbs0.zzk());
        if(v == 3) {
            zzcem0 = new zzcem(context0, zzcbt0);
        }
        else if(v == 2) {
            zzcem0 = new zzcck(context0, zzcbt0, zzcbs0, z, zzcaz.zza(zzcbs0), zzcbr0);
        }
        else {
            zzcem0 = new zzcaw(context0, zzcbs0, z, zzcaz.zza(zzcbs0), zzcbr0, new zzcbt(context0, zzcbs0.zzn(), zzcbs0.zzs(), zzbda0, zzcbs0.zzk()));
        }
        this.zzg = zzcem0;
        View view0 = new View(context0);
        this.zzd = view0;
        view0.setBackgroundColor(0);
        frameLayout0.addView(zzcem0, new FrameLayout.LayoutParams(-1, -1, 17));
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzS)).booleanValue()) {
            frameLayout0.addView(view0, new FrameLayout.LayoutParams(-1, -1));
            frameLayout0.bringChildToFront(view0);
        }
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzP)).booleanValue()) {
            this.zzn();
        }
        this.zzq = new ImageView(context0);
        this.zzf = (long)(((Long)zzbe.zzc().zza(zzbcl.zzU)));
        boolean z1 = ((Boolean)zzbe.zzc().zza(zzbcl.zzR)).booleanValue();
        this.zzk = z1;
        if(zzbda0 != null) {
            zzbda0.zzd("spinner_used", (z1 ? "1" : "0"));
        }
        this.zza = new zzcbu(this);
        zzcem0.zzr(this);
    }

    @Override
    public final void finalize() throws Throwable {
        try {
            this.zza.zza();
            zzcay zzcay0 = this.zzg;
            if(zzcay0 != null) {
                zzcba zzcba0 = new zzcba(zzcay0);
                zzbzw.zzf.execute(zzcba0);
            }
        }
        finally {
            super.finalize();
        }
    }

    @Override  // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if(z) {
            this.zza.zzb();
        }
        else {
            this.zza.zza();
            this.zzm = this.zzl;
        }
        zzcbc zzcbc0 = () -> this.zzK("windowFocusChanged", new String[]{"hasWindowFocus", String.valueOf(z)});
        zzs.zza.post(zzcbc0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcax, android.view.View
    public final void onWindowVisibilityChanged(int v) {
        boolean z;
        super.onWindowVisibilityChanged(v);
        if(v == 0) {
            this.zza.zzb();
            z = true;
        }
        else {
            this.zza.zza();
            this.zzm = this.zzl;
            z = false;
        }
        zzcbf zzcbf0 = new zzcbf(this, z);
        zzs.zza.post(zzcbf0);
    }

    public final void zzA(int v) {
        zzcay zzcay0 = this.zzg;
        if(zzcay0 == null) {
            return;
        }
        zzcay0.zzz(v);
    }

    public final void zzB(int v) {
        zzcay zzcay0 = this.zzg;
        if(zzcay0 == null) {
            return;
        }
        zzcay0.zzA(v);
    }

    public final void zzC(int v) {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzS)).booleanValue()) {
            this.zzc.setBackgroundColor(v);
            this.zzd.setBackgroundColor(v);
        }
    }

    public final void zzD(int v) {
        zzcay zzcay0 = this.zzg;
        if(zzcay0 == null) {
            return;
        }
        zzcay0.zzB(v);
    }

    public final void zzE(String s, String[] arr_s) {
        this.zzn = s;
        this.zzo = arr_s;
    }

    public final void zzF(int v, int v1, int v2, int v3) {
        if(zze.zzc()) {
            zze.zza(("Set video bounds to x:" + v + ";y:" + v1 + ";w:" + v2 + ";h:" + v3));
        }
        if(v2 != 0 && v3 != 0) {
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(v2, v3);
            frameLayout$LayoutParams0.setMargins(v, v1, 0, 0);
            this.zzc.setLayoutParams(frameLayout$LayoutParams0);
            this.requestLayout();
        }
    }

    public final void zzG(float f) {
        zzcay zzcay0 = this.zzg;
        if(zzcay0 == null) {
            return;
        }
        zzcay0.zzb.zze(f);
        zzcay0.zzn();
    }

    public final void zzH(float f, float f1) {
        zzcay zzcay0 = this.zzg;
        if(zzcay0 != null) {
            zzcay0.zzu(f, f1);
        }
    }

    public final void zzI() {
        zzcay zzcay0 = this.zzg;
        if(zzcay0 == null) {
            return;
        }
        zzcay0.zzb.zzd(false);
        zzcay0.zzn();
    }

    private final void zzJ() {
        if(this.zzb.zzi() != null && this.zzi && !this.zzj) {
            this.zzb.zzi().getWindow().clearFlags(0x80);
            this.zzi = false;
        }
    }

    private final void zzK(String s, String[] arr_s) {
        HashMap hashMap0 = new HashMap();
        Integer integer0 = this.zzl();
        if(integer0 != null) {
            hashMap0.put("playerId", integer0.toString());
        }
        hashMap0.put("event", s);
        String s1 = null;
        for(int v = 0; v < arr_s.length; ++v) {
            String s2 = arr_s[v];
            if(s1 == null) {
                s1 = s2;
            }
            else {
                hashMap0.put(s1, s2);
                s1 = null;
            }
        }
        this.zzb.zzd("onVideoEvent", hashMap0);
    }

    private final boolean zzL() {
        return this.zzq.getParent() != null;
    }

    @Override  // com.google.android.gms.internal.ads.zzcax
    public final void zza() {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzca)).booleanValue()) {
            this.zza.zza();
        }
        this.zzK("ended", new String[0]);
        this.zzJ();
    }

    @Override  // com.google.android.gms.internal.ads.zzcax
    public final void zzb(String s, @Nullable String s1) {
        this.zzK("error", new String[]{"what", s, "extra", s1});
    }

    @Override  // com.google.android.gms.internal.ads.zzcax
    public final void zzc(String s, @Nullable String s1) {
        this.zzK("exception", new String[]{"what", "ExoPlayerAdapter exception", "extra", s1});
    }

    @Override  // com.google.android.gms.internal.ads.zzcax
    public final void zzd() {
        this.zzK("pause", new String[0]);
        this.zzJ();
        this.zzh = false;
    }

    @Override  // com.google.android.gms.internal.ads.zzcax
    public final void zze() {
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzca)).booleanValue()) {
            this.zza.zzb();
        }
        if(this.zzb.zzi() != null && !this.zzi) {
            boolean z = (this.zzb.zzi().getWindow().getAttributes().flags & 0x80) != 0;
            this.zzj = z;
            if(!z) {
                this.zzb.zzi().getWindow().addFlags(0x80);
                this.zzi = true;
            }
        }
        this.zzh = true;
    }

    @Override  // com.google.android.gms.internal.ads.zzcax
    public final void zzf() {
        zzcay zzcay0 = this.zzg;
        if(zzcay0 != null && this.zzm == 0L) {
            this.zzK("canplaythrough", new String[]{"duration", String.valueOf(((float)zzcay0.zzc()) / 1000.0f), "videoWidth", String.valueOf(this.zzg.zze()), "videoHeight", String.valueOf(this.zzg.zzd())});
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcax
    public final void zzg() {
        this.zzd.setVisibility(4);
        zzcbb zzcbb0 = () -> this.zzK("firstFrameRendered", new String[0]);
        zzs.zza.post(zzcbb0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcax
    public final void zzh() {
        this.zza.zzb();
        zzcbd zzcbd0 = new zzcbd(this);
        zzs.zza.post(zzcbd0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcax
    public final void zzi() {
        if(this.zzr && this.zzp != null && !this.zzL()) {
            this.zzq.setImageBitmap(this.zzp);
            this.zzq.invalidate();
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-1, -1);
            this.zzc.addView(this.zzq, frameLayout$LayoutParams0);
            this.zzc.bringChildToFront(this.zzq);
        }
        this.zza.zza();
        this.zzm = this.zzl;
        zzcbe zzcbe0 = new zzcbe(this);
        zzs.zza.post(zzcbe0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcax
    public final void zzj(int v, int v1) {
        if(this.zzk) {
            int v2 = Math.max(v / ((int)(((Integer)zzbe.zzc().zza(zzbcl.zzT)))), 1);
            int v3 = Math.max(v1 / ((int)(((Integer)zzbe.zzc().zza(zzbcl.zzT)))), 1);
            if(this.zzp == null || this.zzp.getWidth() != v2 || this.zzp.getHeight() != v3) {
                this.zzp = Bitmap.createBitmap(v2, v3, Bitmap.Config.ARGB_8888);
                this.zzr = false;
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcax
    public final void zzk() {
        if(this.zzh && this.zzL()) {
            this.zzc.removeView(this.zzq);
        }
        if(this.zzg != null && this.zzp != null) {
            long v = zzv.zzC().elapsedRealtime();
            if(this.zzg.getBitmap(this.zzp) != null) {
                this.zzr = true;
            }
            long v1 = zzv.zzC().elapsedRealtime() - v;
            if(zze.zzc()) {
                zze.zza(("Spinner frame grab took " + v1 + "ms"));
            }
            if(v1 > this.zzf) {
                zzo.zzj("Spinner frame grab crossed jank threshold! Suspending spinner.");
                this.zzk = false;
                this.zzp = null;
                zzbda zzbda0 = this.zze;
                if(zzbda0 != null) {
                    zzbda0.zzd("spinner_jank", Long.toString(v1));
                }
            }
        }
    }

    @Nullable
    public final Integer zzl() {
        return this.zzg == null ? null : this.zzg.zzw();
    }

    public final void zzn() {
        zzcay zzcay0 = this.zzg;
        if(zzcay0 == null) {
            return;
        }
        TextView textView0 = new TextView(zzcay0.getContext());
        Resources resources0 = zzv.zzp().zze();
        textView0.setText((resources0 == null ? "AdMob - " : resources0.getString(string.watermark_label_prefix)) + this.zzg.zzj());
        textView0.setTextColor(0xFFFF0000);
        textView0.setBackgroundColor(0xFFFFFF00);
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-2, -2, 17);
        this.zzc.addView(textView0, frameLayout$LayoutParams0);
        this.zzc.bringChildToFront(textView0);
    }

    public final void zzo() {
        this.zza.zza();
        zzcay zzcay0 = this.zzg;
        if(zzcay0 != null) {
            zzcay0.zzt();
        }
        this.zzJ();
    }

    // 检测为 Lambda 实现
    final void zzp() [...]

    // 检测为 Lambda 实现
    final void zzq(boolean z) [...]

    public final void zzr(Integer integer0) {
        if(this.zzg == null) {
            return;
        }
        if(!TextUtils.isEmpty(this.zzn)) {
            this.zzg.zzC(this.zzn, this.zzo, integer0);
            return;
        }
        this.zzK("no_src", new String[0]);
    }

    public final void zzs() {
        zzcay zzcay0 = this.zzg;
        if(zzcay0 == null) {
            return;
        }
        zzcay0.zzb.zzd(true);
        zzcay0.zzn();
    }

    final void zzt() {
        zzcay zzcay0 = this.zzg;
        if(zzcay0 != null) {
            long v = (long)zzcay0.zza();
            if(this.zzl != v && v > 0L) {
                if(((Boolean)zzbe.zzc().zza(zzbcl.zzbY)).booleanValue()) {
                    this.zzK("timeupdate", new String[]{"time", String.valueOf(((float)v) / 1000.0f), "totalBytes", String.valueOf(this.zzg.zzh()), "qoeCachedBytes", String.valueOf(this.zzg.zzf()), "qoeLoadedBytes", String.valueOf(this.zzg.zzg()), "droppedFrames", String.valueOf(this.zzg.zzb()), "reportTime", String.valueOf(zzv.zzC().currentTimeMillis())});
                }
                else {
                    this.zzK("timeupdate", new String[]{"time", String.valueOf(((float)v) / 1000.0f)});
                }
                this.zzl = v;
            }
        }
    }

    public final void zzu() {
        zzcay zzcay0 = this.zzg;
        if(zzcay0 == null) {
            return;
        }
        zzcay0.zzo();
    }

    public final void zzv() {
        zzcay zzcay0 = this.zzg;
        if(zzcay0 == null) {
            return;
        }
        zzcay0.zzp();
    }

    public final void zzw(int v) {
        zzcay zzcay0 = this.zzg;
        if(zzcay0 == null) {
            return;
        }
        zzcay0.zzq(v);
    }

    public final void zzx(MotionEvent motionEvent0) {
        zzcay zzcay0 = this.zzg;
        if(zzcay0 == null) {
            return;
        }
        zzcay0.dispatchTouchEvent(motionEvent0);
    }

    public final void zzy(int v) {
        zzcay zzcay0 = this.zzg;
        if(zzcay0 == null) {
            return;
        }
        zzcay0.zzx(v);
    }

    public final void zzz(int v) {
        zzcay zzcay0 = this.zzg;
        if(zzcay0 == null) {
            return;
        }
        zzcay0.zzy(v);
    }
}

