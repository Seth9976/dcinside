package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo.AudioCapabilities;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecInfo.VideoCapabilities;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import j..util.Objects;

public final class zzsg {
    public final String zza;
    public final String zzb;
    public final String zzc;
    @Nullable
    public final MediaCodecInfo.CodecCapabilities zzd;
    public final boolean zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    private final boolean zzi;

    @VisibleForTesting
    zzsg(String s, String s1, String s2, @Nullable MediaCodecInfo.CodecCapabilities mediaCodecInfo$CodecCapabilities0, boolean z, boolean z1, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        s.getClass();
        this.zza = s;
        this.zzb = s1;
        this.zzc = s2;
        this.zzd = mediaCodecInfo$CodecCapabilities0;
        this.zzg = z;
        this.zze = z3;
        this.zzf = z5;
        this.zzh = z6;
        this.zzi = zzbb.zzi(s1);
    }

    @Override
    public final String toString() {
        return this.zza;
    }

    @Nullable
    public final Point zza(int v, int v1) {
        MediaCodecInfo.CodecCapabilities mediaCodecInfo$CodecCapabilities0 = this.zzd;
        if(mediaCodecInfo$CodecCapabilities0 != null) {
            MediaCodecInfo.VideoCapabilities mediaCodecInfo$VideoCapabilities0 = mediaCodecInfo$CodecCapabilities0.getVideoCapabilities();
            return mediaCodecInfo$VideoCapabilities0 == null ? null : zzsg.zzi(mediaCodecInfo$VideoCapabilities0, v, v1);
        }
        return null;
    }

    public final zzht zzb(zzab zzab0, zzab zzab1) {
        int v = Objects.equals(zzab0.zzo, zzab1.zzo) ? 0 : 8;
        if(this.zzi) {
            if(zzab0.zzy != zzab1.zzy) {
                v |= 0x400;
            }
            if(!this.zze && (zzab0.zzv != zzab1.zzv || zzab0.zzw != zzab1.zzw)) {
                v |= 0x200;
            }
            if((!zzk.zzg(zzab0.zzC) || !zzk.zzg(zzab1.zzC)) && !Objects.equals(zzab0.zzC, zzab1.zzC)) {
                v |= 0x800;
            }
            if(zzei.zzd.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.zza) && !zzab0.zzd(zzab1)) {
                v |= 2;
            }
            if(v == 0) {
                return zzab0.zzd(zzab1) ? new zzht(this.zza, zzab0, zzab1, 3, 0) : new zzht(this.zza, zzab0, zzab1, 2, 0);
            }
            return new zzht(this.zza, zzab0, zzab1, 0, v);
        }
        if(zzab0.zzD != zzab1.zzD) {
            v |= 0x1000;
        }
        if(zzab0.zzE != zzab1.zzE) {
            v |= 0x2000;
        }
        if(zzab0.zzF != zzab1.zzF) {
            v |= 0x4000;
        }
        if(v == 0 && "audio/mp4a-latm".equals(this.zzb)) {
            Pair pair0 = zzcy.zza(zzab0);
            Pair pair1 = zzcy.zza(zzab1);
            if(pair0 != null && pair1 != null && (((int)(((Integer)pair0.first))) == 42 && ((int)(((Integer)pair1.first))) == 42)) {
                return new zzht(this.zza, zzab0, zzab1, 3, 0);
            }
        }
        if(!zzab0.zzd(zzab1)) {
            v |= 0x20;
        }
        if("audio/opus".equals(this.zzb)) {
            v |= 2;
        }
        return v == 0 ? new zzht(this.zza, zzab0, zzab1, 1, 0) : new zzht(this.zza, zzab0, zzab1, 0, v);
    }

    public static zzsg zzc(String s, String s1, String s2, @Nullable MediaCodecInfo.CodecCapabilities mediaCodecInfo$CodecCapabilities0, boolean z, boolean z1, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        if(mediaCodecInfo$CodecCapabilities0 == null || !mediaCodecInfo$CodecCapabilities0.isFeatureSupported("adaptive-playback")) {
            z5 = false;
        }
        else if(zzei.zza > 22 || !"ODROID-XU3".equals(zzei.zzd) && !"Nexus 10".equals(zzei.zzd)) {
            z5 = true;
        }
        else if(!"OMX.Exynos.AVC.Decoder".equals(s) && !"OMX.Exynos.AVC.Decoder.secure".equals(s)) {
            z5 = true;
        }
        else {
            z5 = false;
        }
        boolean z6 = mediaCodecInfo$CodecCapabilities0 != null && mediaCodecInfo$CodecCapabilities0.isFeatureSupported("tunneled-playback");
        boolean z7 = z4 || mediaCodecInfo$CodecCapabilities0 != null && mediaCodecInfo$CodecCapabilities0.isFeatureSupported("secure-playback");
        return zzei.zza < 35 || mediaCodecInfo$CodecCapabilities0 == null || !mediaCodecInfo$CodecCapabilities0.isFeatureSupported("detached-surface") ? new zzsg(s, s1, s2, mediaCodecInfo$CodecCapabilities0, z, z1, z2, z5, z6, z7, false) : new zzsg(s, s1, s2, mediaCodecInfo$CodecCapabilities0, z, z1, z2, z5, z6, z7, true);
    }

    // 去混淆评级： 低(20)
    public final boolean zzd(zzab zzab0) {
        return this.zzm(zzab0) && this.zzl(zzab0, false);
    }

    public final boolean zze(zzab zzab0) throws zzsu {
        int v4;
        if(!this.zzm(zzab0)) {
            return false;
        }
        if(!this.zzl(zzab0, true)) {
            return false;
        }
        if(this.zzi) {
            int v = zzab0.zzv;
            if(v > 0) {
                return zzab0.zzw <= 0 ? true : this.zzg(v, zzab0.zzw, ((double)zzab0.zzx));
            }
            return true;
        }
        int v1 = zzab0.zzE;
        if(v1 != -1) {
            MediaCodecInfo.CodecCapabilities mediaCodecInfo$CodecCapabilities0 = this.zzd;
            if(mediaCodecInfo$CodecCapabilities0 == null) {
                this.zzj("sampleRate.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities mediaCodecInfo$AudioCapabilities0 = mediaCodecInfo$CodecCapabilities0.getAudioCapabilities();
            if(mediaCodecInfo$AudioCapabilities0 == null) {
                this.zzj("sampleRate.aCaps");
                return false;
            }
            if(!mediaCodecInfo$AudioCapabilities0.isSampleRateSupported(v1)) {
                this.zzj("sampleRate.support, " + v1);
                return false;
            }
        }
        int v2 = zzab0.zzD;
        if(v2 != -1) {
            MediaCodecInfo.CodecCapabilities mediaCodecInfo$CodecCapabilities1 = this.zzd;
            if(mediaCodecInfo$CodecCapabilities1 == null) {
                this.zzj("channelCount.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities mediaCodecInfo$AudioCapabilities1 = mediaCodecInfo$CodecCapabilities1.getAudioCapabilities();
            if(mediaCodecInfo$AudioCapabilities1 == null) {
                this.zzj("channelCount.aCaps");
                return false;
            }
            String s = this.zza;
            String s1 = this.zzb;
            int v3 = mediaCodecInfo$AudioCapabilities1.getMaxInputChannelCount();
            if(v3 <= 1 && (zzei.zza < 26 || v3 <= 0) && !"audio/mpeg".equals(s1) && !"audio/3gpp".equals(s1) && !"audio/amr-wb".equals(s1) && !"audio/mp4a-latm".equals(s1) && !"audio/vorbis".equals(s1) && !"audio/opus".equals(s1) && !"audio/raw".equals(s1) && !"audio/flac".equals(s1) && !"audio/g711-alaw".equals(s1) && !"audio/g711-mlaw".equals(s1) && !"audio/gsm".equals(s1)) {
                if("audio/ac3".equals(s1)) {
                    v4 = 6;
                }
                else {
                    v4 = "audio/eac3".equals(s1) ? 16 : 30;
                }
                zzdo.zzf("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + s + ", [" + v3 + " to " + v4 + "]");
                v3 = v4;
            }
            if(v3 < v2) {
                this.zzj("channelCount.support, " + v2);
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean zzf(zzab zzab0) {
        if(this.zzi) {
            return this.zze;
        }
        Pair pair0 = zzcy.zza(zzab0);
        return pair0 != null && ((int)(((Integer)pair0.first))) == 42;
    }

    public final boolean zzg(int v, int v1, double f) {
        MediaCodecInfo.CodecCapabilities mediaCodecInfo$CodecCapabilities0 = this.zzd;
        if(mediaCodecInfo$CodecCapabilities0 == null) {
            this.zzj("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities mediaCodecInfo$VideoCapabilities0 = mediaCodecInfo$CodecCapabilities0.getVideoCapabilities();
        if(mediaCodecInfo$VideoCapabilities0 == null) {
            this.zzj("sizeAndRate.vCaps");
            return false;
        }
        if(zzei.zza >= 29) {
            switch(zzsi.zza(mediaCodecInfo$VideoCapabilities0, v, v1, f)) {
                case 1: {
                    this.zzj("sizeAndRate.cover, " + v + "x" + v1 + "@" + f);
                    return false;
                }
                case 2: {
                    break;
                }
                default: {
                    goto label_13;
                }
            }
        }
        else {
        label_13:
            if(!zzsg.zzk(mediaCodecInfo$VideoCapabilities0, v, v1, f)) {
                if(v < v1 && (!"OMX.MTK.VIDEO.DECODER.HEVC".equals(this.zza) || !"mcv5a".equals(zzei.zzb)) && zzsg.zzk(mediaCodecInfo$VideoCapabilities0, v1, v, f)) {
                    zzdo.zzb("MediaCodecInfo", "AssumedSupport [" + ("sizeAndRate.rotated, " + v + "x" + v1 + "@" + f) + "] [" + this.zza + ", " + this.zzb + "] [" + zzei.zze + "]");
                    return true;
                }
                this.zzj("sizeAndRate.support, " + v + "x" + v1 + "@" + f);
                return false;
            }
        }
        return true;
    }

    public final MediaCodecInfo.CodecProfileLevel[] zzh() {
        MediaCodecInfo.CodecCapabilities mediaCodecInfo$CodecCapabilities0 = this.zzd;
        if(mediaCodecInfo$CodecCapabilities0 != null) {
            return mediaCodecInfo$CodecCapabilities0.profileLevels == null ? new MediaCodecInfo.CodecProfileLevel[0] : mediaCodecInfo$CodecCapabilities0.profileLevels;
        }
        return new MediaCodecInfo.CodecProfileLevel[0];
    }

    private static Point zzi(MediaCodecInfo.VideoCapabilities mediaCodecInfo$VideoCapabilities0, int v, int v1) {
        int v2 = mediaCodecInfo$VideoCapabilities0.getWidthAlignment();
        int v3 = mediaCodecInfo$VideoCapabilities0.getHeightAlignment();
        return new Point((v + v2 - 1) / v2 * v2, (v1 + v3 - 1) / v3 * v3);
    }

    private final void zzj(String s) {
        zzdo.zzb("MediaCodecInfo", "NoSupport [" + s + "] [" + this.zza + ", " + this.zzb + "] [" + zzei.zze + "]");
    }

    private static boolean zzk(MediaCodecInfo.VideoCapabilities mediaCodecInfo$VideoCapabilities0, int v, int v1, double f) {
        Point point0 = zzsg.zzi(mediaCodecInfo$VideoCapabilities0, v, v1);
        int v2 = point0.x;
        int v3 = point0.y;
        return f == -1.0 || f < 1.0 ? mediaCodecInfo$VideoCapabilities0.isSizeSupported(v2, v3) : mediaCodecInfo$VideoCapabilities0.areSizeAndRateSupported(v2, v3, Math.floor(f));
    }

    private final boolean zzl(zzab zzab0, boolean z) {
        int v3;
        Pair pair0 = zzcy.zza(zzab0);
        if(zzab0.zzo != null && zzab0.zzo.equals("video/mv-hevc") && this.zzc.equals("video/hevc")) {
            String s = zzfk.zzg(zzab0.zzr);
            pair0 = s == null ? null : zzcy.zzb(s, s.trim().split("\\.", -1), zzab0.zzC);
        }
        if(pair0 != null) {
            int v = (int)(((Integer)pair0.first));
            int v1 = (int)(((Integer)pair0.second));
            int v2 = 8;
            if("video/dolby-vision".equals(zzab0.zzo)) {
                if("video/avc".equals(this.zzb)) {
                    v1 = 0;
                    v = 8;
                }
                else if("video/hevc".equals(this.zzb)) {
                    v1 = 0;
                    v = 2;
                }
            }
            if(this.zzi) {
            label_19:
                MediaCodecInfo.CodecProfileLevel[] arr_mediaCodecInfo$CodecProfileLevel = this.zzh();
                if(zzei.zza <= 23 && "video/x-vnd.on2.vp9".equals(this.zzb) && arr_mediaCodecInfo$CodecProfileLevel.length == 0) {
                    MediaCodecInfo.CodecCapabilities mediaCodecInfo$CodecCapabilities0 = this.zzd;
                    if(mediaCodecInfo$CodecCapabilities0 == null) {
                        v3 = 0;
                    }
                    else {
                        MediaCodecInfo.VideoCapabilities mediaCodecInfo$VideoCapabilities0 = mediaCodecInfo$CodecCapabilities0.getVideoCapabilities();
                        v3 = mediaCodecInfo$VideoCapabilities0 == null ? 0 : ((int)(((Integer)mediaCodecInfo$VideoCapabilities0.getBitrateRange().getUpper())));
                    }
                    if(v3 >= 180000000) {
                        v2 = 0x400;
                    }
                    else if(v3 >= 120000000) {
                        v2 = 0x200;
                    }
                    else if(v3 >= 60000000) {
                        v2 = 0x100;
                    }
                    else if(v3 >= 30000000) {
                        v2 = 0x80;
                    }
                    else if(v3 >= 18000000) {
                        v2 = 0x40;
                    }
                    else if(v3 >= 12000000) {
                        v2 = 0x20;
                    }
                    else if(v3 >= 7200000) {
                        v2 = 16;
                    }
                    else if(v3 < 3600000) {
                        if(v3 >= 1800000) {
                            v2 = 4;
                        }
                        else {
                            v2 = v3 < 800000 ? 1 : 2;
                        }
                    }
                    MediaCodecInfo.CodecProfileLevel mediaCodecInfo$CodecProfileLevel0 = new MediaCodecInfo.CodecProfileLevel();
                    mediaCodecInfo$CodecProfileLevel0.profile = 1;
                    mediaCodecInfo$CodecProfileLevel0.level = v2;
                    arr_mediaCodecInfo$CodecProfileLevel = new MediaCodecInfo.CodecProfileLevel[]{mediaCodecInfo$CodecProfileLevel0};
                }
                for(int v4 = 0; v4 < arr_mediaCodecInfo$CodecProfileLevel.length; ++v4) {
                    MediaCodecInfo.CodecProfileLevel mediaCodecInfo$CodecProfileLevel1 = arr_mediaCodecInfo$CodecProfileLevel[v4];
                    if(mediaCodecInfo$CodecProfileLevel1.profile == v && (mediaCodecInfo$CodecProfileLevel1.level >= v1 || !z) && (!"video/hevc".equals(this.zzb) || v != 2 || !"sailfish".equals(zzei.zzb) && !"marlin".equals(zzei.zzb))) {
                        return true;
                    }
                }
                this.zzj("codec.profileLevel, " + zzab0.zzk + ", " + this.zzc);
                return false;
            }
            else if(v == 42) {
                v = 42;
                goto label_19;
            }
        }
        return true;
    }

    private final boolean zzm(zzab zzab0) {
        if(!this.zzb.equals(zzab0.zzo)) {
            String s = zzta.zzb(zzab0);
            return this.zzb.equals(s);
        }
        return true;
    }
}

