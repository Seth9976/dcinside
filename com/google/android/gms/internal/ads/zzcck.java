package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

public final class zzcck extends zzcay implements TextureView.SurfaceTextureListener, zzcbi {
    private final zzcbs zzc;
    private final zzcbt zzd;
    private final zzcbr zze;
    private zzcax zzf;
    private Surface zzg;
    private zzcbj zzh;
    private String zzi;
    private String[] zzj;
    private boolean zzk;
    private int zzl;
    private zzcbq zzm;
    private final boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;
    private float zzs;

    public zzcck(Context context0, zzcbt zzcbt0, zzcbs zzcbs0, boolean z, boolean z1, zzcbr zzcbr0) {
        super(context0);
        this.zzl = 1;
        this.zzc = zzcbs0;
        this.zzd = zzcbt0;
        this.zzn = z;
        this.zze = zzcbr0;
        this.setSurfaceTextureListener(this);
        zzcbt0.zza(this);
    }

    @Override  // android.view.View
    protected final void onMeasure(int v, int v1) {
        super.onMeasure(v, v1);
        int v2 = this.getMeasuredWidth();
        int v3 = this.getMeasuredHeight();
        float f = this.zzs;
        if(f != 0.0f && this.zzm == null) {
            float f1 = ((float)v2) / ((float)v3);
            if(f > f1) {
                v3 = (int)(((float)v2) / f);
            }
            if(f < f1) {
                v2 = (int)(((float)v3) * f);
            }
        }
        this.setMeasuredDimension(v2, v3);
        zzcbq zzcbq0 = this.zzm;
        if(zzcbq0 != null) {
            zzcbq0.zzc(v2, v3);
        }
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture0, int v, int v1) {
        if(this.zzn) {
            zzcbq zzcbq0 = new zzcbq(this.getContext());
            this.zzm = zzcbq0;
            zzcbq0.zzd(surfaceTexture0, v, v1);
            this.zzm.start();
            SurfaceTexture surfaceTexture1 = this.zzm.zzb();
            if(surfaceTexture1 == null) {
                this.zzm.zze();
                this.zzm = null;
            }
            else {
                surfaceTexture0 = surfaceTexture1;
            }
        }
        Surface surface0 = new Surface(surfaceTexture0);
        this.zzg = surface0;
        if(this.zzh == null) {
            this.zzW(false, null);
        }
        else {
            this.zzZ(surface0, true);
            if(!this.zze.zza) {
                this.zzU();
            }
        }
        if(this.zzq == 0 || this.zzr == 0) {
            this.zzab(v, v1);
        }
        else {
            this.zzaa();
        }
        zzccg zzccg0 = () -> {
            zzcax zzcax0 = this.zzf;
            if(zzcax0 != null) {
                zzcax0.zzh();
            }
        };
        zzs.zza.post(zzccg0);
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture0) {
        this.zzo();
        zzcbq zzcbq0 = this.zzm;
        if(zzcbq0 != null) {
            zzcbq0.zze();
            this.zzm = null;
        }
        if(this.zzh != null) {
            this.zzX();
            Surface surface0 = this.zzg;
            if(surface0 != null) {
                surface0.release();
            }
            this.zzg = null;
            this.zzZ(null, true);
        }
        zzccc zzccc0 = () -> {
            zzcax zzcax0 = this.zzf;
            if(zzcax0 != null) {
                zzcax0.zzi();
            }
        };
        zzs.zza.post(zzccc0);
        return true;
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture0, int v, int v1) {
        zzcbq zzcbq0 = this.zzm;
        if(zzcbq0 != null) {
            zzcbq0.zzc(v, v1);
        }
        zzccb zzccb0 = () -> {
            zzcax zzcax0 = this.zzf;
            if(zzcax0 != null) {
                zzcax0.zzj(v, v1);
            }
        };
        zzs.zza.post(zzccb0);
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture0) {
        this.zzd.zzf(this);
        this.zza.zza(surfaceTexture0, this.zzf);
    }

    @Override  // android.view.View
    protected final void onWindowVisibilityChanged(int v) {
        zze.zza(("AdExoPlayerView3 window visibility changed to " + v));
        zzcca zzcca0 = () -> {
            zzcax zzcax0 = this.zzf;
            if(zzcax0 != null) {
                zzcax0.onWindowVisibilityChanged(v);
            }
        };
        zzs.zza.post(zzcca0);
        super.onWindowVisibilityChanged(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzcay
    public final void zzA(int v) {
        zzcbj zzcbj0 = this.zzh;
        if(zzcbj0 != null) {
            zzcbj0.zzN(v);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcay
    public final void zzB(int v) {
        zzcbj zzcbj0 = this.zzh;
        if(zzcbj0 != null) {
            zzcbj0.zzR(v);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcay
    public final void zzC(@Nullable String s, @Nullable String[] arr_s, @Nullable Integer integer0) {
        if(s == null) {
            return;
        }
        this.zzj = arr_s == null ? new String[]{s} : ((String[])Arrays.copyOf(arr_s, arr_s.length));
        boolean z = this.zze.zzk && this.zzi != null && !s.equals(this.zzi) && this.zzl == 4;
        this.zzi = s;
        this.zzW(z, integer0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcbi
    public final void zzD(int v, int v1) {
        this.zzq = v;
        this.zzr = v1;
        this.zzaa();
    }

    final zzcbj zzE(@Nullable Integer integer0) {
        zzcbj zzcbj0 = new zzcef(this.zzc.getContext(), this.zze, this.zzc, integer0);
        zzo.zzi("ExoPlayerAdapter initialized.");
        return zzcbj0;
    }

    final String zzF() {
        return zzv.zzq().zzc(this.zzc.getContext(), this.zzc.zzn().afmaVersion);
    }

    // 检测为 Lambda 实现
    final void zzG(String s) [...]

    // 检测为 Lambda 实现
    final void zzH() [...]

    // 检测为 Lambda 实现
    final void zzI() [...]

    // 检测为 Lambda 实现
    final void zzJ(boolean z, long v) [...]

    // 检测为 Lambda 实现
    final void zzK(String s) [...]

    // 检测为 Lambda 实现
    final void zzL() [...]

    // 检测为 Lambda 实现
    final void zzM() [...]

    // 检测为 Lambda 实现
    final void zzN() [...]

    // 检测为 Lambda 实现
    final void zzO(int v, int v1) [...]

    // 检测为 Lambda 实现
    final void zzP() [...]

    // 检测为 Lambda 实现
    final void zzQ(int v) [...]

    // 检测为 Lambda 实现
    final void zzR() [...]

    // 检测为 Lambda 实现
    final void zzS() [...]

    private static String zzT(String s, Exception exception0) {
        return s + "/" + exception0.getClass().getCanonicalName() + ":" + exception0.getMessage();
    }

    private final void zzU() {
        zzcbj zzcbj0 = this.zzh;
        if(zzcbj0 != null) {
            zzcbj0.zzQ(true);
        }
    }

    private final void zzV() {
        if(!this.zzo) {
            this.zzo = true;
            zzccj zzccj0 = () -> {
                zzcax zzcax0 = this.zzf;
                if(zzcax0 != null) {
                    zzcax0.zzf();
                }
            };
            zzs.zza.post(zzccj0);
            this.zzn();
            this.zzd.zzb();
            if(this.zzp) {
                this.zzp();
            }
        }
    }

    private final void zzW(boolean z, @Nullable Integer integer0) {
        zzcbj zzcbj0 = this.zzh;
        if(zzcbj0 != null && !z) {
            zzcbj0.zzP(integer0);
            return;
        }
        if(this.zzi != null && this.zzg != null) {
            if(z) {
                if(this.zzad()) {
                    zzcbj0.zzU();
                    this.zzY();
                    goto label_12;
                }
                zzo.zzj("No valid ExoPlayerAdapter exists when switch source.");
                return;
            }
        label_12:
            if(this.zzi.startsWith("cache:")) {
                zzcde zzcde0 = this.zzc.zzp(this.zzi);
                if(zzcde0 instanceof zzcdn) {
                    zzcbj zzcbj1 = ((zzcdn)zzcde0).zza();
                    this.zzh = zzcbj1;
                    zzcbj1.zzP(integer0);
                    if(!this.zzh.zzV()) {
                        zzo.zzj("Precached video player has been released.");
                        return;
                    }
                }
                else {
                    if(zzcde0 instanceof zzcdk) {
                        String s = this.zzF();
                        ByteBuffer byteBuffer0 = ((zzcdk)zzcde0).zzl();
                        boolean z1 = ((zzcdk)zzcde0).zzm();
                        String s1 = ((zzcdk)zzcde0).zzk();
                        if(s1 == null) {
                            zzo.zzj("Stream cache URL is null.");
                            return;
                        }
                        zzcbj zzcbj2 = this.zzE(integer0);
                        this.zzh = zzcbj2;
                        zzcbj2.zzG(new Uri[]{Uri.parse(s1)}, s, byteBuffer0, z1);
                        goto label_45;
                    }
                    zzo.zzj(("Stream cache miss: " + this.zzi));
                    return;
                }
            }
            else {
                this.zzh = this.zzE(integer0);
                String s2 = this.zzF();
                Uri[] arr_uri = new Uri[this.zzj.length];
                for(int v = 0; true; ++v) {
                    String[] arr_s = this.zzj;
                    if(v >= arr_s.length) {
                        break;
                    }
                    arr_uri[v] = Uri.parse(arr_s[v]);
                }
                this.zzh.zzF(arr_uri, s2);
            }
        label_45:
            this.zzh.zzL(this);
            this.zzZ(this.zzg, false);
            if(this.zzh.zzV()) {
                int v1 = this.zzh.zzt();
                this.zzl = v1;
                if(v1 == 3) {
                    this.zzV();
                }
            }
        }
    }

    private final void zzX() {
        zzcbj zzcbj0 = this.zzh;
        if(zzcbj0 != null) {
            zzcbj0.zzQ(false);
        }
    }

    private final void zzY() {
        if(this.zzh != null) {
            this.zzZ(null, true);
            zzcbj zzcbj0 = this.zzh;
            if(zzcbj0 != null) {
                zzcbj0.zzL(null);
                this.zzh.zzH();
                this.zzh = null;
            }
            this.zzl = 1;
            this.zzk = false;
            this.zzo = false;
            this.zzp = false;
        }
    }

    private final void zzZ(Surface surface0, boolean z) {
        zzcbj zzcbj0 = this.zzh;
        if(zzcbj0 != null) {
            try {
                zzcbj0.zzS(surface0, z);
            }
            catch(IOException iOException0) {
                zzo.zzk("", iOException0);
            }
            return;
        }
        zzo.zzj("Trying to set surface before player is initialized.");
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzcay
    public final int zza() {
        return this.zzac() ? ((int)this.zzh.zzy()) : 0;
    }

    private final void zzaa() {
        this.zzab(this.zzq, this.zzr);
    }

    private final void zzab(int v, int v1) {
        float f = v1 <= 0 ? 1.0f : ((float)v) / ((float)v1);
        if(this.zzs != f) {
            this.zzs = f;
            this.requestLayout();
        }
    }

    private final boolean zzac() {
        return this.zzad() && this.zzl != 1;
    }

    // 去混淆评级： 低(20)
    private final boolean zzad() {
        return this.zzh != null && this.zzh.zzV() && !this.zzk;
    }

    @Override  // com.google.android.gms.internal.ads.zzcay
    public final int zzb() {
        return this.zzh == null ? -1 : this.zzh.zzr();
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzcay
    public final int zzc() {
        return this.zzac() ? ((int)this.zzh.zzz()) : 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcay
    public final int zzd() {
        return this.zzr;
    }

    @Override  // com.google.android.gms.internal.ads.zzcay
    public final int zze() {
        return this.zzq;
    }

    @Override  // com.google.android.gms.internal.ads.zzcay
    public final long zzf() {
        return this.zzh == null ? -1L : this.zzh.zzx();
    }

    @Override  // com.google.android.gms.internal.ads.zzcay
    public final long zzg() {
        return this.zzh == null ? -1L : this.zzh.zzA();
    }

    @Override  // com.google.android.gms.internal.ads.zzcay
    public final long zzh() {
        return this.zzh == null ? -1L : this.zzh.zzB();
    }

    @Override  // com.google.android.gms.internal.ads.zzcbi
    public final void zzi(boolean z, long v) {
        if(this.zzc != null) {
            zzccd zzccd0 = () -> this.zzc.zzv(z, v);
            zzbzw.zzf.execute(zzccd0);
        }
    }

    // 去混淆评级： 低(30)
    @Override  // com.google.android.gms.internal.ads.zzcay
    public final String zzj() {
        return this.zzn ? "ExoPlayer/2 spherical" : "ExoPlayer/2";
    }

    @Override  // com.google.android.gms.internal.ads.zzcbi
    public final void zzk(String s, Exception exception0) {
        String s1 = zzcck.zzT(s, exception0);
        zzo.zzj(("ExoPlayerAdapter error: " + s1));
        this.zzk = true;
        if(this.zze.zza) {
            this.zzX();
        }
        zzcch zzcch0 = () -> {
            zzcax zzcax0 = this.zzf;
            if(zzcax0 != null) {
                zzcax0.zzb("ExoPlayerAdapter error", s1);
            }
        };
        zzs.zza.post(zzcch0);
        zzv.zzp().zzv(exception0, "AdExoPlayerView.onError");
    }

    @Override  // com.google.android.gms.internal.ads.zzcbi
    public final void zzl(String s, Exception exception0) {
        String s1 = zzcck.zzT("onLoadException", exception0);
        zzo.zzj(("ExoPlayerAdapter exception: " + s1));
        zzv.zzp().zzv(exception0, "AdExoPlayerView.onException");
        zzcce zzcce0 = () -> {
            zzcax zzcax0 = this.zzf;
            if(zzcax0 != null) {
                zzcax0.zzc("ExoPlayerAdapter exception", s1);
            }
        };
        zzs.zza.post(zzcce0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcbi
    public final void zzm(int v) {
        if(this.zzl != v) {
            this.zzl = v;
            switch(v) {
                case 3: {
                    this.zzV();
                    break;
                }
                case 4: {
                    if(this.zze.zza) {
                        this.zzX();
                    }
                    this.zzd.zze();
                    this.zzb.zzc();
                    zzcci zzcci0 = () -> {
                        zzcax zzcax0 = this.zzf;
                        if(zzcax0 != null) {
                            zzcax0.zza();
                        }
                    };
                    zzs.zza.post(zzcci0);
                }
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcay
    public final void zzn() {
        zzcbz zzcbz0 = () -> {
            float f = this.zzb.zza();
            zzcbj zzcbj0 = this.zzh;
            if(zzcbj0 != null) {
                try {
                    zzcbj0.zzT(f, false);
                }
                catch(IOException iOException0) {
                    zzo.zzk("", iOException0);
                }
                return;
            }
            zzo.zzj("Trying to set volume before player is initialized.");
        };
        zzs.zza.post(zzcbz0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcay
    public final void zzo() {
        if(this.zzac()) {
            if(this.zze.zza) {
                this.zzX();
            }
            this.zzh.zzO(false);
            this.zzd.zze();
            this.zzb.zzc();
            zzccf zzccf0 = () -> {
                zzcax zzcax0 = this.zzf;
                if(zzcax0 != null) {
                    zzcax0.zzd();
                }
            };
            zzs.zza.post(zzccf0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcay
    public final void zzp() {
        if(this.zzac()) {
            if(this.zze.zza) {
                this.zzU();
            }
            this.zzh.zzO(true);
            this.zzd.zzc();
            this.zzb.zzb();
            this.zza.zzb();
            zzcby zzcby0 = () -> {
                zzcax zzcax0 = this.zzf;
                if(zzcax0 != null) {
                    zzcax0.zze();
                }
            };
            zzs.zza.post(zzcby0);
            return;
        }
        this.zzp = true;
    }

    @Override  // com.google.android.gms.internal.ads.zzcay
    public final void zzq(int v) {
        if(this.zzac()) {
            this.zzh.zzI(((long)v));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcay
    public final void zzr(zzcax zzcax0) {
        this.zzf = zzcax0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcay
    public final void zzs(@Nullable String s) {
        if(s != null) {
            this.zzC(s, null, null);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcay
    public final void zzt() {
        if(this.zzad()) {
            this.zzh.zzU();
            this.zzY();
        }
        this.zzd.zze();
        this.zzb.zzc();
        this.zzd.zzd();
    }

    @Override  // com.google.android.gms.internal.ads.zzcay
    public final void zzu(float f, float f1) {
        zzcbq zzcbq0 = this.zzm;
        if(zzcbq0 != null) {
            zzcbq0.zzf(f, f1);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcbi
    public final void zzv() {
        zzcbx zzcbx0 = () -> {
            zzcax zzcax0 = this.zzf;
            if(zzcax0 != null) {
                zzcax0.zzg();
            }
        };
        zzs.zza.post(zzcbx0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcay
    @Nullable
    public final Integer zzw() {
        return this.zzh == null ? null : this.zzh.zzC();
    }

    @Override  // com.google.android.gms.internal.ads.zzcay
    public final void zzx(int v) {
        zzcbj zzcbj0 = this.zzh;
        if(zzcbj0 != null) {
            zzcbj0.zzJ(v);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcay
    public final void zzy(int v) {
        zzcbj zzcbj0 = this.zzh;
        if(zzcbj0 != null) {
            zzcbj0.zzK(v);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcay
    public final void zzz(int v) {
        zzcbj zzcbj0 = this.zzh;
        if(zzcbj0 != null) {
            zzcbj0.zzM(v);
        }
    }
}

