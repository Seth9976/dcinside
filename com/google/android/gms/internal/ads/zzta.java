package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.annotation.CheckResult;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import h4.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

@SuppressLint({"InlinedApi"})
public final class zzta {
    public static final int zza;
    @GuardedBy("MediaCodecUtil.class")
    private static final HashMap zzb;

    static {
        zzta.zzb = new HashMap();
    }

    @Nullable
    public static zzsg zza() throws zzsu {
        List list0 = zzta.zzd("audio/raw", false, false);
        return list0.isEmpty() ? null : ((zzsg)list0.get(0));
    }

    @Nullable
    public static String zzb(zzab zzab0) {
        if("audio/eac3-joc".equals(zzab0.zzo)) {
            return "audio/eac3";
        }
        if("video/dolby-vision".equals(zzab0.zzo)) {
            Pair pair0 = zzcy.zza(zzab0);
            if(pair0 != null) {
                switch(((int)(((Integer)pair0.first)))) {
                    case 16: 
                    case 0x100: {
                        return "video/hevc";
                    }
                    case 0x200: {
                        return "video/avc";
                    }
                    case 0x400: {
                        return "video/av01";
                    }
                    default: {
                        return "video/mv-hevc".equals(zzab0.zzo) ? "video/hevc" : null;
                    }
                }
            }
        }
        return "video/mv-hevc".equals(zzab0.zzo) ? "video/hevc" : null;
    }

    public static List zzc(zzsp zzsp0, zzab zzab0, boolean z, boolean z1) throws zzsu {
        String s = zzta.zzb(zzab0);
        return s == null ? zzfxn.zzn() : zzsp0.zza(s, z, z1);
    }

    public static List zzd(String s, boolean z, boolean z1) throws zzsu {
        synchronized(zzta.class) {
            zzst zzst0 = new zzst(s, z, z1);
            HashMap hashMap0 = zzta.zzb;
            List list0 = (List)hashMap0.get(zzst0);
            if(list0 != null) {
                return list0;
            }
            ArrayList arrayList0 = zzta.zzg(zzst0, new zzsx(z, z1));
            if(z && arrayList0.isEmpty() && zzei.zza <= 23) {
                arrayList0 = zzta.zzg(zzst0, new zzsw(null));
                if(!arrayList0.isEmpty()) {
                    zzdo.zzf("MediaCodecUtil", "MediaCodecList API didn\'t list secure decoder for: " + s + ". Assuming: " + ((zzsg)arrayList0.get(0)).zza);
                }
            }
            if("audio/raw".equals(s)) {
                if(zzei.zza < 26 && zzei.zzb.equals("R9") && arrayList0.size() == 1 && ((zzsg)arrayList0.get(0)).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    arrayList0.add(zzsg.zzc("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
                }
                zzta.zzh(arrayList0, new zzsr());
            }
            if(zzei.zza < 0x20 && arrayList0.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zzsg)arrayList0.get(0)).zza)) {
                arrayList0.add(((zzsg)arrayList0.remove(0)));
            }
            List list1 = zzfxn.zzl(arrayList0);
            hashMap0.put(zzst0, list1);
            return list1;
        }
    }

    @m({"#2.sampleMimeType"})
    public static List zze(zzsp zzsp0, zzab zzab0, boolean z, boolean z1) throws zzsu {
        List list0 = zzsp0.zza(zzab0.zzo, z, z1);
        List list1 = zzta.zzc(zzsp0, zzab0, z, z1);
        zzfxk zzfxk0 = new zzfxk();
        zzfxk0.zzh(list0);
        zzfxk0.zzh(list1);
        return zzfxk0.zzi();
    }

    @CheckResult
    public static List zzf(List list0, zzab zzab0) {
        List list1 = new ArrayList(list0);
        zzta.zzh(list1, new zzss(zzab0));
        return list1;
    }

    private static ArrayList zzg(zzst zzst0, zzsv zzsv0) throws zzsu {
        String s6;
        StringBuilder stringBuilder0;
        String s5;
        boolean z7;
        boolean z6;
        boolean z5;
        MediaCodecInfo.CodecCapabilities mediaCodecInfo$CodecCapabilities0;
        int v3;
        String s2;
        String s1;
        MediaCodecInfo mediaCodecInfo0;
        int v1;
        String s;
        ArrayList arrayList0;
        try {
            arrayList0 = new ArrayList();
            s = zzst0.zza;
            int v = zzsv0.zza();
            boolean z = zzsv0.zze();
            v1 = 0;
        alab1:
            while(true) {
            label_5:
                if(v1 >= v) {
                    return arrayList0;
                }
                mediaCodecInfo0 = zzsv0.zzb(v1);
                int v2 = zzei.zza;
                if(v2 < 29 || !mediaCodecInfo0.isAlias()) {
                    s1 = mediaCodecInfo0.getName();
                    if(mediaCodecInfo0.isEncoder()) {
                        v3 = v1;
                    }
                    else if(!z && s1.endsWith(".secure")) {
                        v3 = v1;
                    }
                    else if(v2 < 24 && ("OMX.SEC.aac.dec".equals(s1) || "OMX.Exynos.AAC.Decoder".equals(s1)) && "samsung".equals(zzei.zzc) && (zzei.zzb.startsWith("zeroflte") || zzei.zzb.startsWith("zerolte") || zzei.zzb.startsWith("zenlte") || "SC-05G".equals(zzei.zzb) || "marinelteatt".equals(zzei.zzb) || "404SC".equals(zzei.zzb) || "SC-04G".equals(zzei.zzb) || "SCV31".equals(zzei.zzb)) || v2 <= 23 && "audio/eac3-joc".equals(s) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(s1)) {
                        v3 = v1;
                    }
                    else {
                        String[] arr_s = mediaCodecInfo0.getSupportedTypes();
                        int v4 = 0;
                        while(true) {
                            if(v4 >= arr_s.length) {
                                if(s.equals("video/dolby-vision")) {
                                    if("OMX.MS.HEVCDV.Decoder".equals(s1)) {
                                        s2 = "video/hevcdv";
                                    }
                                    else if("OMX.RTK.video.decoder".equals(s1) || "OMX.realtek.video.decoder.tunneled".equals(s1)) {
                                        s2 = "video/dv_hevc";
                                    }
                                    else {
                                        s2 = null;
                                    }
                                }
                                else if(s.equals("video/mv-hevc")) {
                                    s2 = "c2.qti.mvhevc.decoder".equals(s1) ? "video/x-mvhevc" : null;
                                }
                                else if(s.equals("audio/alac") && "OMX.lge.alac.decoder".equals(s1)) {
                                    s2 = "audio/x-lg-alac";
                                }
                                else if(s.equals("audio/flac") && "OMX.lge.flac.decoder".equals(s1)) {
                                    s2 = "audio/x-lg-flac";
                                }
                                else if(!s.equals("audio/ac3") || !"OMX.lge.ac3.decoder".equals(s1)) {
                                    s2 = null;
                                }
                                else {
                                    s2 = "audio/lg-ac3";
                                }
                                break alab1;
                            }
                            String s3 = arr_s[v4];
                            if(!s3.equalsIgnoreCase(s)) {
                                ++v4;
                                continue;
                            }
                            s2 = s3;
                            break alab1;
                        }
                    }
                }
                else {
                    v3 = v1;
                }
                v1 = v3 + 1;
            }
        }
        catch(Exception exception0) {
            throw new zzsu(exception0, null);
        }
        if(s2 == null) {
            v3 = v1;
            v1 = v3 + 1;
            goto label_5;
        }
        else {
            try {
                mediaCodecInfo$CodecCapabilities0 = mediaCodecInfo0.getCapabilitiesForType(s2);
                boolean z1 = zzsv0.zzd("tunneled-playback", s2, mediaCodecInfo$CodecCapabilities0);
                boolean z2 = zzsv0.zzc("tunneled-playback", s2, mediaCodecInfo$CodecCapabilities0);
                if(zzst0.zzc) {
                label_64:
                    if(z1) {
                        goto label_65;
                    }
                    v3 = v1;
                    v1 = v3 + 1;
                    goto label_5;
                }
                else {
                    if(z2) {
                        v3 = v1;
                        v1 = v3 + 1;
                        goto label_5;
                    }
                    else {
                        goto label_65;
                    }
                    goto label_64;
                }
            label_65:
                boolean z3 = zzsv0.zzd("secure-playback", s2, mediaCodecInfo$CodecCapabilities0);
                boolean z4 = zzsv0.zzc("secure-playback", s2, mediaCodecInfo$CodecCapabilities0);
                if(zzst0.zzb) {
                label_70:
                    if(z3) {
                        z3 = true;
                    }
                    else {
                        v3 = v1;
                        v1 = v3 + 1;
                        goto label_5;
                    }
                }
                else {
                    if(z4) {
                        v3 = v1;
                        v1 = v3 + 1;
                        goto label_5;
                    }
                    else {
                        goto label_72;
                    }
                    goto label_70;
                }
            label_72:
                z5 = zzei.zza < 29 ? !zzta.zzi(mediaCodecInfo0, s) : mediaCodecInfo0.isHardwareAccelerated();
                z6 = zzta.zzi(mediaCodecInfo0, s);
                if(zzei.zza >= 29) {
                    z7 = mediaCodecInfo0.isVendor();
                }
                else {
                    String s4 = zzftt.zza(mediaCodecInfo0.getName());
                    z7 = !s4.startsWith("omx.google.") && !s4.startsWith("c2.android.") && !s4.startsWith("c2.google.");
                }
            }
            catch(Exception exception1) {
                s5 = s1;
                v3 = v1;
                goto label_106;
            }
            if(z) {
                try {
                    if(zzst0.zzb == z3) {
                        goto label_87;
                    }
                label_86:
                    if(z || zzst0.zzb) {
                        s6 = s1;
                        v3 = v1;
                        if(!z && z3) {
                            stringBuilder0 = new StringBuilder();
                            goto label_99;
                        }
                    }
                    else {
                    label_87:
                        s6 = s1;
                        v3 = v1;
                        arrayList0.add(zzsg.zzc(s1, s, s2, mediaCodecInfo$CodecCapabilities0, z5, z6, z7, false, false));
                    }
                    v1 = v3 + 1;
                    goto label_5;
                }
                catch(Exception exception1) {
                }
            }
            else {
                goto label_86;
            }
            s5 = s6;
            goto label_106;
            try {
            label_99:
                stringBuilder0.append(s6);
                s5 = s6;
                stringBuilder0.append(".secure");
                s5 = s6;
                arrayList0.add(zzsg.zzc(stringBuilder0.toString(), s, s2, mediaCodecInfo$CodecCapabilities0, z5, z6, z7, false, true));
                return arrayList0;
            }
            catch(Exception exception1) {
            }
            try {
            label_106:
                if(zzei.zza > 23 || arrayList0.isEmpty()) {
                    zzdo.zzc("MediaCodecUtil", "Failed to query codec " + s5 + " (" + s2 + ")");
                    throw exception1;
                }
                zzdo.zzc("MediaCodecUtil", "Skipping codec " + s5 + " (failed to query capabilities)");
                v1 = v3 + 1;
                goto label_5;
            }
            catch(Exception exception0) {
            }
            throw new zzsu(exception0, null);
        }
        v1 = v3 + 1;
        goto label_5;
    }

    private static void zzh(List list0, zzsy zzsy0) {
        Collections.sort(list0, new zzsq(zzsy0));
    }

    // 去混淆评级： 低(20)
    private static boolean zzi(MediaCodecInfo mediaCodecInfo0, String s) {
        if(zzei.zza >= 29) {
            return mediaCodecInfo0.isSoftwareOnly();
        }
        if(zzbb.zzg(s)) {
            return true;
        }
        String s1 = zzftt.zza(mediaCodecInfo0.getName());
        return s1.startsWith("arc.") ? false : s1.startsWith("omx.google.") || s1.startsWith("omx.ffmpeg.") || s1.startsWith("omx.sec.") && s1.contains(".sw.") || s1.equals("omx.qcom.video.decoder.hevcswvdec") || s1.startsWith("c2.android.") || s1.startsWith("c2.google.") || !s1.startsWith("omx.") && !s1.startsWith("c2.");
    }
}

