package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat.Builder;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.net.Uri;
import android.provider.Settings.Global;
import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.exoplayer.audio.a;
import androidx.media3.exoplayer.audio.g;
import j..util.Objects;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public final class zzoi {
    public static final zzoi zza;
    @VisibleForTesting
    static final zzfxq zzb;
    @SuppressLint({"InlinedApi"})
    private static final zzfxn zzc;
    private final SparseArray zzd;
    private final int zze;

    static {
        zzoi.zza = new zzoi(zzfxn.zzo(zzoh.zza));
        zzoi.zzc = zzfxn.zzq(2, 5, 6);
        zzfxp zzfxp0 = new zzfxp();
        zzfxp0.zza(5, 6);
        zzfxp0.zza(17, 6);
        zzfxp0.zza(7, 6);
        zzfxp0.zza(30, 10);
        zzfxp0.zza(18, 6);
        zzfxp0.zza(6, 8);
        zzfxp0.zza(8, 8);
        zzfxp0.zza(14, 8);
        zzoi.zzb = zzfxp0.zzc();
    }

    private zzoi(List list0) {
        this.zzd = new SparseArray();
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            zzoh zzoh0 = (zzoh)list0.get(v1);
            this.zzd.put(zzoh0.zzb, zzoh0);
        }
        int v2 = 0;
        for(int v = 0; v < this.zzd.size(); ++v) {
            v2 = Math.max(v2, ((zzoh)this.zzd.valueAt(v)).zzc);
        }
        this.zze = v2;
    }

    @Override
    public final boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zzoi)) {
            return false;
        }
        SparseArray sparseArray0 = this.zzd;
        SparseArray sparseArray1 = ((zzoi)object0).zzd;
        if(zzei.zza >= 0x1F) {
            return sparseArray0.contentEquals(sparseArray1) ? this.zze == ((zzoi)object0).zze : false;
        }
        int v = sparseArray0.size();
        if(v == sparseArray1.size()) {
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = sparseArray0.keyAt(v1);
                if(!Objects.equals(sparseArray0.valueAt(v1), sparseArray1.get(v2))) {
                    return false;
                }
            }
            return this.zze == ((zzoi)object0).zze;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        SparseArray sparseArray0 = this.zzd;
        if(zzei.zza >= 0x1F) {
            int v = sparseArray0.contentHashCode();
            return this.zze + v * 0x1F;
        }
        int v2 = 17;
        for(int v1 = 0; v1 < sparseArray0.size(); ++v1) {
            v2 = (v2 * 0x1F + sparseArray0.keyAt(v1)) * 0x1F + Objects.hashCode(sparseArray0.valueAt(v1));
        }
        return this.zze + v2 * 0x1F;
    }

    @Override
    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.zze + ", audioProfiles=" + this.zzd.toString() + "]";
    }

    // 去混淆评级： 低(40)
    @Nullable
    static Uri zza() {
        return null;
    }

    @Nullable
    public final Pair zzb(zzab zzab0, zze zze0) {
        int v = 8;
        zzab0.zzo.getClass();
        int v1 = zzbb.zza(zzab0.zzo, zzab0.zzk);
        if(zzoi.zzb.containsKey(v1)) {
            if(v1 != 18) {
            label_9:
                if(v1 != 8) {
                label_15:
                    if(v1 == 30 && !zzei.zzG(this.zzd, 30)) {
                        v1 = 7;
                    }
                }
                else if(zzei.zzG(this.zzd, 8)) {
                    v1 = 8;
                    goto label_15;
                }
                else {
                    v1 = 7;
                }
            }
            else if(!zzei.zzG(this.zzd, 18)) {
                v1 = 6;
            }
            else {
                v1 = 18;
                goto label_9;
            }
            if(zzei.zzG(this.zzd, v1)) {
                zzoh zzoh0 = (zzoh)this.zzd.get(v1);
                zzoh0.getClass();
                int v2 = zzab0.zzD;
                if(v2 == -1 || v1 == 18) {
                    v2 = zzoh0.zza((zzab0.zzE == -1 ? 48000 : zzab0.zzE), zze0);
                }
                else if(zzab0.zzo.equals("audio/vnd.dts.uhd;profile=p2") && zzei.zza < 33) {
                    if(v2 > 10) {
                        return null;
                    }
                }
                else if(!zzoh0.zzb(v2)) {
                    return null;
                }
                int v3 = zzei.zza;
                if(v3 <= 28) {
                    switch(v2) {
                        case 3: 
                        case 4: 
                        case 5: {
                            v = 6;
                            break;
                        }
                        case 7: {
                            break;
                        }
                        default: {
                            v = v2;
                        }
                    }
                }
                else {
                    v = v2;
                }
                if(v3 <= 26 && "fugu".equals(zzei.zzb) && v == 1) {
                    v = 2;
                }
                int v4 = zzei.zzi(v);
                return v4 == 0 ? null : Pair.create(v1, v4);
            }
        }
        return null;
    }

    @SuppressLint({"UnprotectedReceiver"})
    static zzoi zzc(Context context0, zze zze0, @Nullable zzoo zzoo0) {
        return zzoi.zzd(context0, context0.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), zze0, zzoo0);
    }

    @SuppressLint({"InlinedApi"})
    static zzoi zzd(Context context0, @Nullable Intent intent0, zze zze0, @Nullable zzoo zzoo0) {
        List list0;
        zzoo zzoo1 = null;
        Object object0 = context0.getSystemService("audio");
        object0.getClass();
        AudioManager audioManager0 = (AudioManager)object0;
        if(zzoo0 == null) {
            if(zzei.zza >= 33) {
                try {
                    list0 = audioManager0.getAudioDevicesForAttributes(zze0.zza().zza);
                }
                catch(RuntimeException unused_ex) {
                    goto label_12;
                }
                if(!list0.isEmpty()) {
                    zzoo1 = new zzoo(g.a(list0.get(0)));
                }
            }
        label_12:
            zzoo0 = zzoo1;
        }
        int v1 = zzei.zza;
        if(v1 >= 33 && (zzei.zzM(context0) || zzei.zzI(context0))) {
            List list1 = audioManager0.getDirectProfilesForAttributes(zze0.zza().zza);
            HashMap hashMap0 = new HashMap();
            hashMap0.put(2, new HashSet(zzgaq.zzg(new int[]{12})));
            for(int v = 0; v < list1.size(); ++v) {
                AudioProfile audioProfile0 = a.a(list1.get(v));
                if(audioProfile0.getEncapsulationType() != 1) {
                    int v2 = audioProfile0.getFormat();
                    if(zzei.zzJ(v2) || zzoi.zzb.containsKey(v2)) {
                        Integer integer0 = v2;
                        if(hashMap0.containsKey(integer0)) {
                            Set set0 = (Set)hashMap0.get(integer0);
                            set0.getClass();
                            set0.addAll(zzgaq.zzg(audioProfile0.getChannelMasks()));
                        }
                        else {
                            hashMap0.put(integer0, new HashSet(zzgaq.zzg(audioProfile0.getChannelMasks())));
                        }
                    }
                }
            }
            zzfxk zzfxk0 = new zzfxk();
            for(Object object1: hashMap0.entrySet()) {
                zzfxk0.zzf(new zzoh(((int)(((Integer)((Map.Entry)object1).getKey()))), ((Set)((Map.Entry)object1).getValue())));
            }
            return new zzoi(zzfxk0.zzi());
        }
        if(v1 >= 23) {
            AudioDeviceInfo[] arr_audioDeviceInfo = zzoo0 == null ? audioManager0.getDevices(2) : new AudioDeviceInfo[]{zzoo0.zza};
            zzfxr zzfxr0 = new zzfxr();
            zzfxr0.zzg(new Integer[]{8, 7});
            if(v1 >= 0x1F) {
                zzfxr0.zzg(new Integer[]{26, 27});
            }
            if(v1 >= 33) {
                zzfxr0.zzf(30);
            }
            zzfxs zzfxs0 = zzfxr0.zzi();
            for(int v3 = 0; v3 < arr_audioDeviceInfo.length; ++v3) {
                if(zzfxs0.contains(arr_audioDeviceInfo[v3].getType())) {
                    return zzoi.zza;
                }
            }
        }
        zzfxr zzfxr1 = new zzfxr();
        zzfxr1.zzf(2);
        if(zzei.zza >= 29 && (zzei.zzM(context0) || zzei.zzI(context0))) {
            zzfxk zzfxk1 = new zzfxk();
            zzfzt zzfzt0 = zzoi.zzb.zzi().zze();
            while(zzfzt0.hasNext()) {
                Object object2 = zzfzt0.next();
                Integer integer1 = (Integer)object2;
                int v4 = (int)integer1;
                if(zzei.zza >= zzei.zzh(v4) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(v4).setSampleRate(48000).build(), zze0.zza().zza)) {
                    zzfxk1.zzf(integer1);
                }
            }
            zzfxk1.zzf(2);
            zzfxr1.zzh(zzfxk1.zzi());
            return new zzoi(zzoi.zze(zzgaq.zzh(zzfxr1.zzi()), 10));
        }
        ContentResolver contentResolver0 = context0.getContentResolver();
        boolean z = Settings.Global.getInt(contentResolver0, "use_external_surround_sound_flag", 0) == 1;
        if(z && Settings.Global.getInt(contentResolver0, "external_surround_sound_enabled", 0) == 1) {
            zzfxr1.zzh(zzoi.zzc);
        }
        if(intent0 != null && !z && intent0.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 1) {
            int[] arr_v = intent0.getIntArrayExtra("android.media.extra.ENCODINGS");
            if(arr_v != null) {
                zzfxr1.zzh(zzgaq.zzg(arr_v));
            }
            return new zzoi(zzoi.zze(zzgaq.zzh(zzfxr1.zzi()), intent0.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
        }
        return new zzoi(zzoi.zze(zzgaq.zzh(zzfxr1.zzi()), 10));
    }

    private static zzfxn zze(@Nullable int[] arr_v, int v) {
        zzfxk zzfxk0 = new zzfxk();
        for(int v1 = 0; v1 < arr_v.length; ++v1) {
            zzfxk0.zzf(new zzoh(arr_v[v1], v));
        }
        return zzfxk0.zzi();
    }

    // 去混淆评级： 低(20)
    private static boolean zzf() [...] // 潜在的解密器
}

