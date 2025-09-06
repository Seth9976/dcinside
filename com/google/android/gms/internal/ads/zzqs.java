package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import j..util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

public final class zzqs extends zzsn implements zzkk {
    private final Context zzb;
    private final zzpe zzc;
    private final zzpm zzd;
    @Nullable
    private final zzrz zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    @Nullable
    private zzab zzi;
    @Nullable
    private zzab zzj;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private int zzo;

    public zzqs(Context context0, zzsb zzsb0, zzsp zzsp0, boolean z, @Nullable Handler handler0, @Nullable zzpf zzpf0, zzpm zzpm0) {
        zzrz zzrz0 = zzei.zza < 35 ? null : new zzrz(zzry.zza);
        super(1, zzsb0, zzsp0, false, 44100.0f);
        this.zzb = context0.getApplicationContext();
        this.zzd = zzpm0;
        this.zze = zzrz0;
        this.zzo = -1000;
        this.zzc = new zzpe(handler0, zzpf0);
        zzpm0.zzq(new zzqq(this, null));
    }

    @Override  // com.google.android.gms.internal.ads.zzhr
    protected final void zzA() {
        this.zzd.zzk();
        if(zzei.zza >= 35) {
            zzrz zzrz0 = this.zze;
            if(zzrz0 != null) {
                zzrz0.zzb();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzsn
    protected final void zzC() {
        try {
            this.zzn = false;
            super.zzC();
        }
        catch(Throwable throwable0) {
            if(this.zzm) {
                this.zzm = false;
                this.zzd.zzl();
            }
            throw throwable0;
        }
        if(this.zzm) {
            this.zzm = false;
            this.zzd.zzl();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzhr
    protected final void zzD() {
        this.zzd.zzi();
    }

    @Override  // com.google.android.gms.internal.ads.zzhr
    protected final void zzE() {
        this.zzaS();
        this.zzd.zzh();
    }

    @Override  // com.google.android.gms.internal.ads.zzlj, com.google.android.gms.internal.ads.zzlm
    public final String zzU() {
        return "MediaCodecAudioRenderer";
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzsn
    public final boolean zzW() {
        return super.zzW() && this.zzd.zzz();
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzsn
    public final boolean zzX() {
        return this.zzd.zzy() || super.zzX();
    }

    @Override  // com.google.android.gms.internal.ads.zzsn
    protected final float zzZ(float f, zzab zzab0, zzab[] arr_zzab) {
        int v1 = -1;
        for(int v = 0; v < arr_zzab.length; ++v) {
            int v2 = arr_zzab[v].zzE;
            if(v2 != -1) {
                v1 = Math.max(v1, v2);
            }
        }
        return v1 == -1 ? -1.0f : ((float)v1) * f;
    }

    @Override  // com.google.android.gms.internal.ads.zzkk
    public final long zza() {
        if(this.zzcT() == 2) {
            this.zzaS();
        }
        return this.zzk;
    }

    // 去混淆评级： 低(30)
    private final int zzaQ(zzsg zzsg0, zzab zzab0) {
        return !"OMX.google.raw.decoder".equals(zzsg0.zza) || (zzei.zza >= 24 || zzei.zza == 23 && zzei.zzM(this.zzb)) ? zzab0.zzp : -1;
    }

    private static List zzaR(zzsp zzsp0, zzab zzab0, boolean z, zzpm zzpm0) throws zzsu {
        if(zzab0.zzo == null) {
            return zzfxn.zzn();
        }
        if(zzpm0.zzA(zzab0)) {
            zzsg zzsg0 = zzta.zza();
            if(zzsg0 != null) {
                return zzfxn.zzo(zzsg0);
            }
        }
        return zzta.zze(zzsp0, zzab0, false, false);
    }

    private final void zzaS() {
        boolean z = this.zzW();
        long v = this.zzd.zzb(z);
        if(v != 0x8000000000000000L) {
            if(!this.zzl) {
                v = Math.max(this.zzk, v);
            }
            this.zzk = v;
            this.zzl = false;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzsn
    protected final int zzaa(zzsp zzsp0, zzab zzab0) throws zzsu {
        int v1;
        int v = 0x80;
        if(!zzbb.zzg(zzab0.zzo)) {
            return 0x80;
        }
        boolean z = zzsn.zzaP(zzab0);
        if(z && (zzab0.zzK == 0 || zzta.zza() != null)) {
            zzor zzor0 = this.zzd.zzd(zzab0);
            if(zzor0.zzb) {
                v1 = zzor0.zzc ? 0x600 : 0x200;
                if(zzor0.zzd) {
                    v1 |= 0x800;
                }
            }
            else {
                v1 = 0;
            }
            if(this.zzd.zzA(zzab0)) {
                return v1 | 0xAC;
            }
        }
        else {
            v1 = 0;
        }
        if(!"audio/raw".equals(zzab0.zzo) || this.zzd.zzA(zzab0)) {
            zzab zzab1 = zzei.zzA(2, zzab0.zzD, zzab0.zzE);
            if(this.zzd.zzA(zzab1)) {
                List list0 = zzqs.zzaR(zzsp0, zzab0, false, this.zzd);
                if(!list0.isEmpty()) {
                    if(!z) {
                        return 130;
                    }
                    int v2 = 1;
                    zzsg zzsg0 = (zzsg)list0.get(0);
                    boolean z1 = zzsg0.zze(zzab0);
                    if(!z1) {
                        for(int v3 = 1; v3 < list0.size(); ++v3) {
                            zzsg zzsg1 = (zzsg)list0.get(v3);
                            if(zzsg1.zze(zzab0)) {
                                zzsg0 = zzsg1;
                                v2 = 0;
                                z1 = true;
                                break;
                            }
                        }
                    }
                    int v4 = !z1 || !zzsg0.zzf(zzab0) ? 8 : 16;
                    int v5 = zzsg0.zzg ? 0x40 : 0;
                    if(1 != v2) {
                        v = 0;
                    }
                    return (z1 ? 4 : 3) | v4 | 0x20 | v5 | v | v1;
                }
            }
        }
        return 0x81;
    }

    @Override  // com.google.android.gms.internal.ads.zzsn
    protected final zzht zzab(zzsg zzsg0, zzab zzab0, zzab zzab1) {
        zzht zzht0 = zzsg0.zzb(zzab0, zzab1);
        int v = this.zzaM(zzab1) ? zzht0.zze | 0x8000 : zzht0.zze;
        if(this.zzaQ(zzsg0, zzab1) > this.zzf) {
            v |= 0x40;
        }
        return v == 0 ? new zzht(zzsg0.zza, zzab0, zzab1, zzht0.zzd, 0) : new zzht(zzsg0.zza, zzab0, zzab1, 0, v);
    }

    @Override  // com.google.android.gms.internal.ads.zzsn
    @Nullable
    protected final zzht zzac(zzke zzke0) throws zzib {
        zzab zzab0 = zzke0.zza;
        zzab0.getClass();
        this.zzi = zzab0;
        zzht zzht0 = super.zzac(zzke0);
        this.zzc.zzi(zzab0, zzht0);
        return zzht0;
    }

    static zzli zzad(zzqs zzqs0) {
        return zzqs0.zzay();
    }

    @Override  // com.google.android.gms.internal.ads.zzsn
    protected final zzsa zzaf(zzsg zzsg0, zzab zzab0, @Nullable MediaCrypto mediaCrypto0, float f) {
        zzab[] arr_zzab = this.zzT();
        int v = this.zzaQ(zzsg0, zzab0);
        if(arr_zzab.length != 1) {
            for(int v1 = 0; v1 < arr_zzab.length; ++v1) {
                zzab zzab1 = arr_zzab[v1];
                if(zzsg0.zzb(zzab0, zzab1).zzd != 0) {
                    v = Math.max(v, this.zzaQ(zzsg0, zzab1));
                }
            }
        }
        this.zzf = v;
        int v2 = zzei.zza;
        this.zzg = v2 < 24 && "OMX.SEC.aac.dec".equals(zzsg0.zza) && "samsung".equals(zzei.zzc) && (zzei.zzb.startsWith("zeroflte") || zzei.zzb.startsWith("herolte") || zzei.zzb.startsWith("heroqlte"));
        this.zzh = zzsg0.zza.equals("OMX.google.opus.decoder") || zzsg0.zza.equals("c2.android.opus.decoder") || zzsg0.zza.equals("OMX.google.vorbis.decoder") || zzsg0.zza.equals("c2.android.vorbis.decoder");
        int v3 = this.zzf;
        MediaFormat mediaFormat0 = new MediaFormat();
        mediaFormat0.setString("mime", zzsg0.zzc);
        mediaFormat0.setInteger("channel-count", zzab0.zzD);
        mediaFormat0.setInteger("sample-rate", zzab0.zzE);
        zzdr.zzb(mediaFormat0, zzab0.zzr);
        zzdr.zza(mediaFormat0, "max-input-size", v3);
        if(v2 >= 23) {
            mediaFormat0.setInteger("priority", 0);
            if(f != -1.0f && (v2 != 23 || !"ZTE B2017G".equals(zzei.zzd) && !"AXON 7 mini".equals(zzei.zzd))) {
                mediaFormat0.setFloat("operating-rate", f);
            }
        }
        if(v2 <= 28 && "audio/ac4".equals(zzab0.zzo)) {
            mediaFormat0.setInteger("ac4-is-sync", 1);
        }
        if(v2 >= 24) {
            zzab zzab2 = zzei.zzA(4, zzab0.zzD, zzab0.zzE);
            if(this.zzd.zza(zzab2) == 2) {
                mediaFormat0.setInteger("pcm-encoding", 4);
            }
        }
        if(v2 >= 0x20) {
            mediaFormat0.setInteger("max-output-channel-count", 99);
        }
        if(v2 >= 35) {
            mediaFormat0.setInteger("importance", Math.max(0, -this.zzo));
        }
        this.zzj = !"audio/raw".equals(zzsg0.zzb) || "audio/raw".equals(zzab0.zzo) ? null : zzab0;
        return zzsa.zza(zzsg0, mediaFormat0, zzab0, null, this.zze);
    }

    @Override  // com.google.android.gms.internal.ads.zzsn
    protected final List zzag(zzsp zzsp0, zzab zzab0, boolean z) throws zzsu {
        return zzta.zzf(zzqs.zzaR(zzsp0, zzab0, false, this.zzd), zzab0);
    }

    static void zzah(zzqs zzqs0, boolean z) {
        zzqs0.zzn = true;
    }

    @Override  // com.google.android.gms.internal.ads.zzsn
    protected final void zzaj(zzhh zzhh0) {
        if(zzei.zza >= 29 && (zzhh0.zza != null && Objects.equals(zzhh0.zza.zzo, "audio/opus") && this.zzaL())) {
            ByteBuffer byteBuffer0 = zzhh0.zzf;
            byteBuffer0.getClass();
            zzab zzab0 = zzhh0.zza;
            zzab0.getClass();
            int v = zzab0.zzG;
            if(byteBuffer0.remaining() == 8) {
                long v1 = byteBuffer0.order(ByteOrder.LITTLE_ENDIAN).getLong();
                this.zzd.zzr(v, ((int)(v1 * 48000L / 1000000000L)));
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzsn
    protected final void zzak(Exception exception0) {
        zzdo.zzd("MediaCodecAudioRenderer", "Audio codec error", exception0);
        this.zzc.zza(exception0);
    }

    @Override  // com.google.android.gms.internal.ads.zzsn
    protected final void zzal(String s, zzsa zzsa0, long v, long v1) {
        this.zzc.zze(s, v, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzsn
    protected final void zzam(String s) {
        this.zzc.zzf(s);
    }

    @Override  // com.google.android.gms.internal.ads.zzsn
    protected final void zzan(zzab zzab0, @Nullable MediaFormat mediaFormat0) throws zzib {
        int v;
        zzab zzab1 = this.zzj;
        int[] arr_v = null;
        if(zzab1 != null) {
            zzab0 = zzab1;
        }
        else if(this.zzaz() != null) {
            mediaFormat0.getClass();
            if("audio/raw".equals(zzab0.zzo)) {
                v = zzab0.zzF;
            }
            else if(zzei.zza < 24 || !mediaFormat0.containsKey("pcm-encoding")) {
                v = mediaFormat0.containsKey("v-bits-per-sample") ? zzei.zzn(mediaFormat0.getInteger("v-bits-per-sample")) : 2;
            }
            else {
                v = mediaFormat0.getInteger("pcm-encoding");
            }
            zzz zzz0 = new zzz();
            zzz0.zzaa("audio/raw");
            zzz0.zzU(v);
            zzz0.zzG(zzab0.zzG);
            zzz0.zzH(zzab0.zzH);
            zzz0.zzT(zzab0.zzl);
            zzz0.zzM(zzab0.zza);
            zzz0.zzO(zzab0.zzb);
            zzz0.zzP(zzab0.zzc);
            zzz0.zzQ(zzab0.zzd);
            zzz0.zzac(zzab0.zze);
            zzz0.zzY(zzab0.zzf);
            zzz0.zzz(mediaFormat0.getInteger("channel-count"));
            zzz0.zzab(mediaFormat0.getInteger("sample-rate"));
            zzab zzab2 = zzz0.zzag();
            if(!this.zzg || zzab2.zzD != 6) {
            label_39:
                if(this.zzh) {
                    int v3 = zzab2.zzD;
                    if(v3 == 3) {
                        arr_v = new int[]{0, 2, 1};
                    }
                    else {
                        switch(v3) {
                            case 5: {
                                arr_v = new int[]{0, 2, 1, 3, 4};
                                break;
                            }
                            case 6: {
                                arr_v = new int[]{0, 2, 1, 5, 3, 4};
                                break;
                            }
                            case 7: {
                                arr_v = new int[]{0, 2, 1, 6, 5, 3, 4};
                                break;
                            }
                            case 8: {
                                arr_v = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                            }
                        }
                    }
                }
            }
            else {
                int v1 = zzab0.zzD;
                if(v1 < 6) {
                    arr_v = new int[v1];
                    for(int v2 = 0; v2 < zzab0.zzD; ++v2) {
                        arr_v[v2] = v2;
                    }
                    goto label_53;
                }
                goto label_39;
            }
        label_53:
            zzab0 = zzab2;
        }
        try {
            if(zzei.zza >= 29) {
                if(this.zzaL()) {
                    this.zzn();
                }
                zzcw.zzf(true);
            }
            this.zzd.zze(zzab0, 0, arr_v);
            return;
        }
        catch(zzph zzph0) {
        }
        throw this.zzcW(zzph0, zzph0.zza, false, 5001);
    }

    @CallSuper
    protected final void zzao() {
        this.zzl = true;
    }

    @Override  // com.google.android.gms.internal.ads.zzsn
    protected final void zzap() {
        this.zzd.zzg();
    }

    @Override  // com.google.android.gms.internal.ads.zzsn
    protected final void zzaq() throws zzib {
        try {
            this.zzd.zzj();
        }
        catch(zzpl zzpl0) {
            throw this.zzcW(zzpl0, zzpl0.zzc, zzpl0.zzb, (this.zzaL() ? 5003 : 5002));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzsn
    protected final boolean zzar(long v, long v1, @Nullable zzsd zzsd0, @Nullable ByteBuffer byteBuffer0, int v2, int v3, int v4, long v5, boolean z, boolean z1, zzab zzab0) throws zzib {
        byteBuffer0.getClass();
        if(this.zzj != null && (v3 & 2) != 0) {
            zzsd0.getClass();
            zzsd0.zzo(v2, false);
            return true;
        }
        if(z) {
            if(zzsd0 != null) {
                zzsd0.zzo(v2, false);
            }
            this.zza.zzf += v4;
            this.zzd.zzg();
            return true;
        }
        try {
            if(this.zzd.zzx(byteBuffer0, v5, v4)) {
                goto label_22;
            }
            return false;
        }
        catch(zzpi zzpi0) {
            zzab zzab1 = this.zzi;
            if(this.zzaL()) {
                this.zzn();
            }
            throw this.zzcW(zzpi0, zzab1, zzpi0.zzb, 5001);
        }
        catch(zzpl zzpl0) {
            if(this.zzaL()) {
                this.zzn();
            }
            throw this.zzcW(zzpl0, zzab0, zzpl0.zzb, 5002);
        }
    label_22:
        if(zzsd0 != null) {
            zzsd0.zzo(v2, false);
        }
        this.zza.zze += v4;
        return true;
    }

    @Override  // com.google.android.gms.internal.ads.zzsn
    protected final boolean zzas(zzab zzab0) {
        this.zzn();
        return this.zzd.zzA(zzab0);
    }

    @Override  // com.google.android.gms.internal.ads.zzkk
    public final zzbe zzc() {
        return this.zzd.zzc();
    }

    @Override  // com.google.android.gms.internal.ads.zzkk
    public final void zzg(zzbe zzbe0) {
        this.zzd.zzs(zzbe0);
    }

    @Override  // com.google.android.gms.internal.ads.zzkk
    public final boolean zzj() {
        boolean z = this.zzn;
        this.zzn = false;
        return z;
    }

    @Override  // com.google.android.gms.internal.ads.zzhr
    @Nullable
    public final zzkk zzl() {
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzsn
    public final void zzu(int v, @Nullable Object object0) throws zzib {
        switch(v) {
            case 2: {
                object0.getClass();
                this.zzd.zzw(((float)(((Float)object0))));
                return;
            }
            case 3: {
                ((zze)object0).getClass();
                this.zzd.zzm(((zze)object0));
                return;
            }
            case 6: {
                ((zzf)object0).getClass();
                this.zzd.zzo(((zzf)object0));
                return;
            }
            case 9: {
                object0.getClass();
                this.zzd.zzv(((Boolean)object0).booleanValue());
                return;
            }
            case 10: {
                object0.getClass();
                int v1 = (int)(((Integer)object0));
                this.zzd.zzn(v1);
                if(zzei.zza >= 35) {
                    zzrz zzrz0 = this.zze;
                    if(zzrz0 != null) {
                        zzrz0.zzd(v1);
                        return;
                    }
                }
                break;
            }
            case 12: {
                if(zzei.zza >= 23) {
                    this.zzd.zzu(((AudioDeviceInfo)object0));
                }
                break;
            }
            case 16: {
                object0.getClass();
                this.zzo = (int)(((Integer)object0));
                zzsd zzsd0 = this.zzaz();
                if(zzsd0 != null && zzei.zza >= 35) {
                    Bundle bundle0 = new Bundle();
                    bundle0.putInt("importance", Math.max(0, -this.zzo));
                    zzsd0.zzq(bundle0);
                    return;
                }
                break;
            }
            default: {
                super.zzu(v, object0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzsn
    protected final void zzx() {
        try {
            this.zzm = true;
            this.zzi = null;
            this.zzd.zzf();
        }
        catch(Throwable throwable0) {
            super.zzx();
            throw throwable0;
        }
        finally {
            this.zzc.zzg(this.zza);
        }
        super.zzx();
    }

    @Override  // com.google.android.gms.internal.ads.zzsn
    protected final void zzy(boolean z, boolean z1) throws zzib {
        super.zzy(z, z1);
        this.zzc.zzh(this.zza);
        this.zzn();
        zzog zzog0 = this.zzo();
        this.zzd.zzt(zzog0);
        zzcx zzcx0 = this.zzi();
        this.zzd.zzp(zzcx0);
    }

    @Override  // com.google.android.gms.internal.ads.zzsn
    protected final void zzz(long v, boolean z) throws zzib {
        super.zzz(v, z);
        this.zzd.zzf();
        this.zzk = v;
        this.zzn = false;
        this.zzl = true;
    }
}

