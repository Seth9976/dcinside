package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.media.MediaPlayer.TrackInfo;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View.MeasureSpec;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public final class zzcaw extends zzcay implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, TextureView.SurfaceTextureListener {
    private static final Map zzc;
    private final zzcbs zzd;
    private final zzcbt zze;
    private final boolean zzf;
    private int zzg;
    private int zzh;
    private MediaPlayer zzi;
    private Uri zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private zzcbq zzn;
    private final boolean zzo;
    private int zzp;
    private zzcax zzq;
    private boolean zzr;
    private Integer zzs;

    static {
        HashMap hashMap0 = new HashMap();
        zzcaw.zzc = hashMap0;
        hashMap0.put(-1004, "MEDIA_ERROR_IO");
        hashMap0.put(-1007, "MEDIA_ERROR_MALFORMED");
        hashMap0.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
        hashMap0.put(-110, "MEDIA_ERROR_TIMED_OUT");
        hashMap0.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        hashMap0.put(100, "MEDIA_ERROR_SERVER_DIED");
        hashMap0.put(1, "MEDIA_ERROR_UNKNOWN");
        hashMap0.put(1, "MEDIA_INFO_UNKNOWN");
        hashMap0.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        hashMap0.put(701, "MEDIA_INFO_BUFFERING_START");
        hashMap0.put(702, "MEDIA_INFO_BUFFERING_END");
        hashMap0.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        hashMap0.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        hashMap0.put(802, "MEDIA_INFO_METADATA_UPDATE");
        hashMap0.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        hashMap0.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }

    public zzcaw(Context context0, zzcbs zzcbs0, boolean z, boolean z1, zzcbr zzcbr0, zzcbt zzcbt0) {
        super(context0);
        this.zzg = 0;
        this.zzh = 0;
        this.zzr = false;
        this.zzs = null;
        this.setSurfaceTextureListener(this);
        this.zzd = zzcbs0;
        this.zze = zzcbt0;
        this.zzo = z;
        this.zzf = z1;
        zzcbt0.zza(this);
    }

    @Override  // android.media.MediaPlayer$OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer0, int v) {
        this.zzm = v;
    }

    @Override  // android.media.MediaPlayer$OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer0) {
        zze.zza("AdMediaPlayerView completion");
        this.zzF(5);
        this.zzh = 5;
        zzcap zzcap0 = new zzcap(this);
        zzs.zza.post(zzcap0);
    }

    @Override  // android.media.MediaPlayer$OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer0, int v, int v1) {
        String s = (String)zzcaw.zzc.get(v);
        String s1 = (String)zzcaw.zzc.get(v1);
        zzo.zzj(("AdMediaPlayerView MediaPlayer error: " + s + ":" + s1));
        this.zzF(-1);
        this.zzh = -1;
        zzcaq zzcaq0 = new zzcaq(this, s, s1);
        zzs.zza.post(zzcaq0);
        return true;
    }

    @Override  // android.media.MediaPlayer$OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer0, int v, int v1) {
        zze.zza(("AdMediaPlayerView MediaPlayer info: " + ((String)zzcaw.zzc.get(v)) + ":" + ((String)zzcaw.zzc.get(v1))));
        return true;
    }

    @Override  // android.view.View
    protected final void onMeasure(int v, int v1) {
        int v13;
        int v2 = View.getDefaultSize(this.zzk, v);
        int v3 = View.getDefaultSize(this.zzl, v1);
        if(this.zzk > 0 && this.zzl > 0 && this.zzn == null) {
            int v4 = View.MeasureSpec.getMode(v);
            int v5 = View.MeasureSpec.getSize(v);
            int v6 = View.MeasureSpec.getMode(v1);
            int v7 = View.MeasureSpec.getSize(v1);
            if(v4 != 0x40000000) {
            label_25:
                if(v4 == 0x40000000) {
                    int v12 = this.zzl * v5 / this.zzk;
                    if(v6 == 0x80000000 && v12 > v7) {
                        v2 = v5;
                        v3 = v7;
                    }
                    else {
                        v3 = v12;
                        v2 = v5;
                    }
                }
                else if(v6 == 0x40000000) {
                    v13 = this.zzk * v7 / this.zzl;
                    v2 = v4 != 0x80000000 || v13 <= v5 ? v13 : v5;
                    v3 = v7;
                }
                else {
                    int v14 = this.zzk;
                    int v15 = this.zzl;
                    if(v6 != 0x80000000 || v15 <= v7) {
                        v13 = v14;
                        v7 = v15;
                    }
                    else {
                        v13 = v7 * v14 / v15;
                    }
                    if(v4 != 0x80000000 || v13 <= v5) {
                        v2 = v13;
                        v3 = v7;
                    }
                    else {
                        v3 = v15 * v5 / v14;
                        v2 = v5;
                    }
                }
            }
            else if(v6 == 0x40000000) {
                int v8 = this.zzk;
                int v9 = v8 * v7;
                int v10 = this.zzl;
                int v11 = v5 * v10;
                if(v9 < v11) {
                    v2 = v9 / v10;
                    v3 = v7;
                }
                else if(v9 > v11) {
                    v3 = v11 / v8;
                    v2 = v5;
                }
                else {
                    v2 = v5;
                    v3 = v7;
                }
            }
            else {
                v4 = 0x40000000;
                goto label_25;
            }
        }
        this.setMeasuredDimension(v2, v3);
        zzcbq zzcbq0 = this.zzn;
        if(zzcbq0 != null) {
            zzcbq0.zzc(v2, v3);
        }
    }

    @Override  // android.media.MediaPlayer$OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer0) {
        zze.zza("AdMediaPlayerView prepared");
        this.zzF(2);
        this.zze.zzb();
        zzcao zzcao0 = new zzcao(this, mediaPlayer0);
        zzs.zza.post(zzcao0);
        this.zzk = mediaPlayer0.getVideoWidth();
        this.zzl = mediaPlayer0.getVideoHeight();
        int v = this.zzp;
        if(v != 0) {
            this.zzq(v);
        }
        if(this.zzf && this.zzH() && this.zzi.getCurrentPosition() > 0 && this.zzh != 3) {
            zze.zza("AdMediaPlayerView nudging MediaPlayer");
            this.zzG(0.0f);
            this.zzi.start();
            int v1 = this.zzi.getCurrentPosition();
            long v2 = zzv.zzC().currentTimeMillis();
            while(this.zzH() && this.zzi.getCurrentPosition() == v1 && zzv.zzC().currentTimeMillis() - v2 <= 0xFAL) {
            }
            this.zzi.pause();
            this.zzn();
        }
        zzo.zzi(("AdMediaPlayerView stream dimensions: " + this.zzk + " x " + this.zzl));
        if(this.zzh == 3) {
            this.zzp();
        }
        this.zzn();
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture0, int v, int v1) {
        zze.zza("AdMediaPlayerView surface created");
        this.zzD();
        zzcar zzcar0 = new zzcar(this);
        zzs.zza.post(zzcar0);
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture0) {
        zze.zza("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer0 = this.zzi;
        if(mediaPlayer0 != null && this.zzp == 0) {
            this.zzp = mediaPlayer0.getCurrentPosition();
        }
        zzcbq zzcbq0 = this.zzn;
        if(zzcbq0 != null) {
            zzcbq0.zze();
        }
        zzcat zzcat0 = new zzcat(this);
        zzs.zza.post(zzcat0);
        this.zzE(true);
        return true;
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture0, int v, int v1) {
        zze.zza("AdMediaPlayerView surface changed");
        if(this.zzi != null && this.zzh == 3 && (this.zzk == v && this.zzl == v1)) {
            int v2 = this.zzp;
            if(v2 != 0) {
                this.zzq(v2);
            }
            this.zzp();
        }
        zzcbq zzcbq0 = this.zzn;
        if(zzcbq0 != null) {
            zzcbq0.zzc(v, v1);
        }
        zzcas zzcas0 = new zzcas(this, v, v1);
        zzs.zza.post(zzcas0);
    }

    @Override  // android.view.TextureView$SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture0) {
        this.zze.zzf(this);
        this.zza.zza(surfaceTexture0, this.zzq);
    }

    @Override  // android.media.MediaPlayer$OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer0, int v, int v1) {
        zze.zza(("AdMediaPlayerView size changed: " + v + " x " + v1));
        this.zzk = mediaPlayer0.getVideoWidth();
        int v2 = mediaPlayer0.getVideoHeight();
        this.zzl = v2;
        if(this.zzk != 0 && v2 != 0) {
            this.requestLayout();
        }
    }

    @Override  // android.view.View
    protected final void onWindowVisibilityChanged(int v) {
        zze.zza(("AdMediaPlayerView window visibility changed to " + v));
        zzcan zzcan0 = () -> {
            zzcax zzcax0 = this.zzq;
            if(zzcax0 != null) {
                zzcax0.onWindowVisibilityChanged(v);
            }
        };
        zzs.zza.post(zzcan0);
        super.onWindowVisibilityChanged(v);
    }

    // 去混淆评级： 低(40)
    @Override  // android.view.View
    public final String toString() {
        return "com.google.android.gms.internal.ads.zzcaw@" + Integer.toHexString(this.hashCode());
    }

    private final void zzD() {
        zze.zza("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture0 = this.getSurfaceTexture();
        if(this.zzj != null && surfaceTexture0 != null) {
            this.zzE(false);
            try {
                MediaPlayer mediaPlayer0 = new MediaPlayer();
                this.zzi = mediaPlayer0;
                mediaPlayer0.setOnBufferingUpdateListener(this);
                this.zzi.setOnCompletionListener(this);
                this.zzi.setOnErrorListener(this);
                this.zzi.setOnInfoListener(this);
                this.zzi.setOnPreparedListener(this);
                this.zzi.setOnVideoSizeChangedListener(this);
                this.zzm = 0;
                if(this.zzo) {
                    zzcbq zzcbq0 = new zzcbq(this.getContext());
                    this.zzn = zzcbq0;
                    zzcbq0.zzd(surfaceTexture0, this.getWidth(), this.getHeight());
                    this.zzn.start();
                    SurfaceTexture surfaceTexture1 = this.zzn.zzb();
                    if(surfaceTexture1 == null) {
                        this.zzn.zze();
                        this.zzn = null;
                    }
                    else {
                        surfaceTexture0 = surfaceTexture1;
                    }
                }
                this.zzi.setDataSource(this.getContext(), this.zzj);
                Surface surface0 = new Surface(surfaceTexture0);
                this.zzi.setSurface(surface0);
                this.zzi.setAudioStreamType(3);
                this.zzi.setScreenOnWhilePlaying(true);
                this.zzi.prepareAsync();
                this.zzF(1);
                return;
            }
            catch(IOException | IllegalArgumentException | IllegalStateException iOException0) {
            }
            zzo.zzk(("Failed to initialize MediaPlayer at " + this.zzj), iOException0);
            this.onError(this.zzi, 1, 0);
        }
    }

    private final void zzE(boolean z) {
        zze.zza("AdMediaPlayerView release");
        zzcbq zzcbq0 = this.zzn;
        if(zzcbq0 != null) {
            zzcbq0.zze();
            this.zzn = null;
        }
        MediaPlayer mediaPlayer0 = this.zzi;
        if(mediaPlayer0 != null) {
            mediaPlayer0.reset();
            this.zzi.release();
            this.zzi = null;
            this.zzF(0);
            if(z) {
                this.zzh = 0;
            }
        }
    }

    private final void zzF(int v) {
        if(v == 3) {
            this.zze.zzc();
            this.zzb.zzb();
        }
        else if(this.zzg == 3) {
            this.zze.zze();
            this.zzb.zzc();
        }
        this.zzg = v;
    }

    private final void zzG(float f) {
        MediaPlayer mediaPlayer0 = this.zzi;
        if(mediaPlayer0 != null) {
            try {
                mediaPlayer0.setVolume(f, f);
            }
            catch(IllegalStateException unused_ex) {
            }
            return;
        }
        zzo.zzj("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
    }

    private final boolean zzH() {
        return this.zzi != null && (this.zzg != -1 && this.zzg != 0 && this.zzg != 1);
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzcay
    public final int zza() {
        return this.zzH() ? this.zzi.getCurrentPosition() : 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcay
    public final int zzb() {
        return Build.VERSION.SDK_INT < 26 || !this.zzH() ? -1 : this.zzi.getMetrics().getInt("android.media.mediaplayer.dropped");
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzcay
    public final int zzc() {
        return this.zzH() ? this.zzi.getDuration() : -1;
    }

    @Override  // com.google.android.gms.internal.ads.zzcay
    public final int zzd() {
        return this.zzi == null ? 0 : this.zzi.getVideoHeight();
    }

    @Override  // com.google.android.gms.internal.ads.zzcay
    public final int zze() {
        return this.zzi == null ? 0 : this.zzi.getVideoWidth();
    }

    @Override  // com.google.android.gms.internal.ads.zzcay
    public final long zzf() {
        return 0L;
    }

    @Override  // com.google.android.gms.internal.ads.zzcay
    public final long zzg() {
        return this.zzs == null ? -1L : this.zzh() * ((long)this.zzm) / 100L;
    }

    @Override  // com.google.android.gms.internal.ads.zzcay
    public final long zzh() {
        return this.zzs == null ? -1L : ((long)this.zzc()) * ((long)(((int)this.zzs)));
    }

    // 去混淆评级： 低(30)
    @Override  // com.google.android.gms.internal.ads.zzcay
    public final String zzj() {
        return this.zzo ? "MediaPlayer spherical" : "MediaPlayer";
    }

    static void zzk(zzcaw zzcaw0, boolean z) {
        zzcaw0.zzr = true;
    }

    static void zzl(zzcaw zzcaw0, MediaPlayer mediaPlayer0) {
        MediaPlayer.TrackInfo[] arr_mediaPlayer$TrackInfo;
        if(((Boolean)zzbe.zzc().zza(zzbcl.zzbY)).booleanValue() && zzcaw0.zzd != null && mediaPlayer0 != null) {
            try {
                arr_mediaPlayer$TrackInfo = mediaPlayer0.getTrackInfo();
            }
            catch(RuntimeException runtimeException0) {
                zzv.zzp().zzw(runtimeException0, "AdMediaPlayerView.reportMetadata");
                return;
            }
            if(arr_mediaPlayer$TrackInfo != null) {
                HashMap hashMap0 = new HashMap();
                for(int v = 0; v < arr_mediaPlayer$TrackInfo.length; ++v) {
                    MediaPlayer.TrackInfo mediaPlayer$TrackInfo0 = arr_mediaPlayer$TrackInfo[v];
                    if(mediaPlayer$TrackInfo0 != null) {
                        switch(mediaPlayer$TrackInfo0.getTrackType()) {
                            case 1: {
                                MediaFormat mediaFormat0 = mediaPlayer$TrackInfo0.getFormat();
                                if(mediaFormat0 != null) {
                                    if(mediaFormat0.containsKey("frame-rate")) {
                                        try {
                                            hashMap0.put("frameRate", String.valueOf(mediaFormat0.getFloat("frame-rate")));
                                        }
                                        catch(ClassCastException unused_ex) {
                                            hashMap0.put("frameRate", String.valueOf(mediaFormat0.getInteger("frame-rate")));
                                        }
                                    }
                                    if(mediaFormat0.containsKey("bitrate")) {
                                        Integer integer0 = mediaFormat0.getInteger("bitrate");
                                        zzcaw0.zzs = integer0;
                                        hashMap0.put("bitRate", String.valueOf(integer0));
                                    }
                                    if(mediaFormat0.containsKey("width") && mediaFormat0.containsKey("height")) {
                                        hashMap0.put("resolution", mediaFormat0.getInteger("width") + "x" + mediaFormat0.getInteger("height"));
                                    }
                                    if(mediaFormat0.containsKey("mime")) {
                                        hashMap0.put("videoMime", mediaFormat0.getString("mime"));
                                    }
                                    if(Build.VERSION.SDK_INT >= 30 && mediaFormat0.containsKey("codecs-string")) {
                                        hashMap0.put("videoCodec", mediaFormat0.getString("codecs-string"));
                                    }
                                }
                                break;
                            }
                            case 2: {
                                MediaFormat mediaFormat1 = mediaPlayer$TrackInfo0.getFormat();
                                if(mediaFormat1 != null) {
                                    if(mediaFormat1.containsKey("mime")) {
                                        hashMap0.put("audioMime", mediaFormat1.getString("mime"));
                                    }
                                    if(Build.VERSION.SDK_INT >= 30 && mediaFormat1.containsKey("codecs-string")) {
                                        hashMap0.put("audioCodec", mediaFormat1.getString("codecs-string"));
                                    }
                                }
                            }
                        }
                    }
                }
                if(!hashMap0.isEmpty()) {
                    zzcaw0.zzd.zzd("onMetadataEvent", hashMap0);
                }
            }
        }
    }

    // 检测为 Lambda 实现
    final void zzm(int v) [...]

    @Override  // com.google.android.gms.internal.ads.zzcay
    public final void zzn() {
        this.zzG(this.zzb.zza());
    }

    @Override  // com.google.android.gms.internal.ads.zzcay
    public final void zzo() {
        zze.zza("AdMediaPlayerView pause");
        if(this.zzH() && this.zzi.isPlaying()) {
            this.zzi.pause();
            this.zzF(4);
            zzcav zzcav0 = new zzcav(this);
            zzs.zza.post(zzcav0);
        }
        this.zzh = 4;
    }

    @Override  // com.google.android.gms.internal.ads.zzcay
    public final void zzp() {
        zze.zza("AdMediaPlayerView play");
        if(this.zzH()) {
            this.zzi.start();
            this.zzF(3);
            this.zza.zzb();
            zzcau zzcau0 = new zzcau(this);
            zzs.zza.post(zzcau0);
        }
        this.zzh = 3;
    }

    @Override  // com.google.android.gms.internal.ads.zzcay
    public final void zzq(int v) {
        zze.zza(("AdMediaPlayerView seek " + v));
        if(this.zzH()) {
            this.zzi.seekTo(v);
            this.zzp = 0;
            return;
        }
        this.zzp = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzcay
    public final void zzr(zzcax zzcax0) {
        this.zzq = zzcax0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcay
    public final void zzs(@Nullable String s) {
        Uri uri0 = Uri.parse(s);
        zzbav zzbav0 = zzbav.zza(uri0);
        if(zzbav0 != null && zzbav0.zza == null) {
            return;
        }
        if(zzbav0 != null) {
            uri0 = Uri.parse(zzbav0.zza);
        }
        this.zzj = uri0;
        this.zzp = 0;
        this.zzD();
        this.requestLayout();
        this.invalidate();
    }

    @Override  // com.google.android.gms.internal.ads.zzcay
    public final void zzt() {
        zze.zza("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer0 = this.zzi;
        if(mediaPlayer0 != null) {
            mediaPlayer0.stop();
            this.zzi.release();
            this.zzi = null;
            this.zzF(0);
            this.zzh = 0;
        }
        this.zze.zzd();
    }

    @Override  // com.google.android.gms.internal.ads.zzcay
    public final void zzu(float f, float f1) {
        zzcbq zzcbq0 = this.zzn;
        if(zzcbq0 != null) {
            zzcbq0.zzf(f, f1);
        }
    }
}

