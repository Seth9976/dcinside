package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.CodecException;
import android.media.MediaCodec.CryptoException;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import android.os.Trace;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import j..util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

public abstract class zzsn extends zzhr {
    private int zzA;
    private boolean zzB;
    private boolean zzC;
    private boolean zzD;
    private boolean zzE;
    private boolean zzF;
    private boolean zzG;
    private long zzH;
    private long zzI;
    private int zzJ;
    private int zzK;
    @Nullable
    private ByteBuffer zzL;
    private boolean zzM;
    private boolean zzN;
    private boolean zzO;
    private boolean zzP;
    private boolean zzQ;
    private boolean zzR;
    private int zzS;
    private int zzT;
    private int zzU;
    private boolean zzV;
    private boolean zzW;
    private boolean zzX;
    private long zzY;
    private long zzZ;
    protected zzhs zza;
    private boolean zzaa;
    private boolean zzab;
    private boolean zzac;
    private zzsl zzad;
    private long zzae;
    private boolean zzaf;
    @Nullable
    private zzrg zzag;
    @Nullable
    private zzrg zzah;
    private static final byte[] zzb;
    private final zzsb zzc;
    private final zzsp zzd;
    private final float zze;
    private final zzhh zzf;
    private final zzhh zzg;
    private final zzhh zzh;
    private final zzru zzi;
    private final MediaCodec.BufferInfo zzj;
    private final ArrayDeque zzk;
    private final zzqt zzl;
    @Nullable
    private zzab zzm;
    @Nullable
    private zzab zzn;
    @Nullable
    private zzli zzo;
    @Nullable
    private MediaCrypto zzp;
    private float zzq;
    private float zzr;
    @Nullable
    private zzsd zzs;
    @Nullable
    private zzab zzt;
    @Nullable
    private MediaFormat zzu;
    private boolean zzv;
    private float zzw;
    @Nullable
    private ArrayDeque zzx;
    @Nullable
    private zzsj zzy;
    @Nullable
    private zzsg zzz;

    static {
        zzsn.zzb = new byte[]{0, 0, 1, 103, 66, (byte)0xC0, 11, -38, 37, (byte)0x90, 0, 0, 1, 104, -50, 15, 19, 0x20, 0, 0, 1, 101, -120, (byte)0x84, 13, -50, 0x71, 24, (byte)0xA0, 0, 0x2F, -65, 28, 49, -61, 39, 93, 120};
    }

    public zzsn(int v, zzsb zzsb0, zzsp zzsp0, boolean z, float f) {
        super(v);
        this.zzc = zzsb0;
        this.zzd = zzsp0;
        this.zze = f;
        this.zzf = new zzhh(0, 0);
        this.zzg = new zzhh(0, 0);
        this.zzh = new zzhh(2, 0);
        zzru zzru0 = new zzru();
        this.zzi = zzru0;
        this.zzj = new MediaCodec.BufferInfo();
        this.zzq = 1.0f;
        this.zzr = 1.0f;
        this.zzk = new ArrayDeque();
        this.zzad = zzsl.zza;
        zzru0.zzj(0);
        zzru0.zzc.order(ByteOrder.nativeOrder());
        this.zzl = new zzqt();
        this.zzw = -1.0f;
        this.zzA = 0;
        this.zzS = 0;
        this.zzJ = -1;
        this.zzK = -1;
        this.zzI = 0x8000000000000001L;
        this.zzY = 0x8000000000000001L;
        this.zzZ = 0x8000000000000001L;
        this.zzae = 0x8000000000000001L;
        this.zzH = 0x8000000000000001L;
        this.zzT = 0;
        this.zzU = 0;
        this.zza = new zzhs();
    }

    @Override  // com.google.android.gms.internal.ads.zzhr
    protected void zzC() {
        try {
            this.zzad();
            this.zzaG();
            this.zzah = null;
        }
        catch(Throwable throwable0) {
            this.zzah = null;
            throw throwable0;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzhr
    protected void zzF(zzab[] arr_zzab, long v, long v1, zzug zzug0) throws zzib {
        if(this.zzad.zzd == 0x8000000000000001L) {
            this.zzaR(new zzsl(0x8000000000000001L, v, v1));
            return;
        }
        if(this.zzk.isEmpty() && (this.zzY == 0x8000000000000001L || this.zzae != 0x8000000000000001L && this.zzae >= this.zzY)) {
            this.zzaR(new zzsl(0x8000000000000001L, v, v1));
            if(this.zzad.zzd != 0x8000000000000001L) {
                this.zzap();
            }
            return;
        }
        zzsl zzsl0 = new zzsl(this.zzY, v, v1);
        this.zzk.add(zzsl0);
    }

    @Override  // com.google.android.gms.internal.ads.zzhr
    public void zzM(float f, float f1) throws zzib {
        this.zzq = f;
        this.zzr = f1;
        this.zzaX(this.zzt);
    }

    @Override  // com.google.android.gms.internal.ads.zzlj
    public void zzV(long v, long v1) throws zzib {
        Throwable throwable3;
        MediaCodec.CryptoException mediaCodec$CryptoException3;
        IllegalStateException illegalStateException3;
        boolean z2;
        Throwable throwable2;
        int v2;
        zzsn zzsn1;
        zzsd zzsd0;
        Throwable throwable1;
        Throwable throwable0;
        zzsn zzsn0 = this;
        if(zzsn0.zzab) {
            try {
                this.zzaq();
                return;
            label_4:
                if(zzsn0.zzm == null && !zzsn0.zzaW(2)) {
                    return;
                }
                goto label_7;
            }
            catch(MediaCodec.CryptoException mediaCodec$CryptoException0) {
                mediaCodec$CryptoException3 = mediaCodec$CryptoException0;
                zzsn1 = zzsn0;
                throw zzsn1.zzcW(mediaCodec$CryptoException3, zzsn1.zzm, false, zzei.zzl(mediaCodec$CryptoException3.getErrorCode()));
            }
            catch(IllegalStateException illegalStateException0) {
            }
        }
        else {
            goto label_4;
            try {
            label_7:
                throwable0 = null;
                throwable1 = null;
                this.zzaC();
                if(!zzsn0.zzO) {
                    if(zzsn0.zzs != null) {
                        this.zzi().zzb();
                        Trace.beginSection("drainAndFeed");
                        while(true) {
                        label_14:
                            zzsd0 = zzsn0.zzs;
                            if(zzsd0 == null) {
                                zzsn1 = zzsn0;
                                throw throwable0;
                            }
                            if(!this.zzaU()) {
                                goto label_24;
                            }
                            goto label_84;
                        }
                    }
                    goto label_131;
                }
                goto label_287;
            }
            catch(MediaCodec.CryptoException mediaCodec$CryptoException1) {
            }
            catch(IllegalStateException illegalStateException1) {
                zzsn1 = zzsn0;
                illegalStateException3 = illegalStateException1;
                goto label_397;
            }
            try {
                zzsn1 = zzsn0;
                mediaCodec$CryptoException3 = mediaCodec$CryptoException1;
                throw zzsn1.zzcW(mediaCodec$CryptoException3, zzsn1.zzm, false, zzei.zzl(mediaCodec$CryptoException3.getErrorCode()));
            }
            catch(MediaCodec.CryptoException mediaCodec$CryptoException1) {
                mediaCodec$CryptoException3 = mediaCodec$CryptoException1;
                throw zzsn1.zzcW(mediaCodec$CryptoException3, zzsn1.zzm, false, zzei.zzl(mediaCodec$CryptoException3.getErrorCode()));
            }
            catch(IllegalStateException illegalStateException1) {
                illegalStateException3 = illegalStateException1;
                goto label_397;
            }
            try {
            label_24:
                if(!zzsn0.zzD) {
                }
                else if(!zzsn0.zzW) {
                    v2 = zzsd0.zzb(zzsn0.zzj);
                    goto label_36;
                }
                v2 = zzsd0.zzb(zzsn0.zzj);
                goto label_36;
            }
            catch(MediaCodec.CryptoException mediaCodec$CryptoException0) {
                mediaCodec$CryptoException3 = mediaCodec$CryptoException0;
                zzsn1 = zzsn0;
                throw zzsn1.zzcW(mediaCodec$CryptoException3, zzsn1.zzm, false, zzei.zzl(mediaCodec$CryptoException3.getErrorCode()));
            }
            catch(IllegalStateException illegalStateException0) {
                goto label_395;
            }
            try {
                v2 = zzsd0.zzb(zzsn0.zzj);
                goto label_36;
            }
            catch(IllegalStateException unused_ex) {
                try {
                    this.zzai();
                    if(!zzsn0.zzab) {
                        throwable2 = throwable0;
                        goto label_149;
                    }
                    this.zzaG();
                    throwable2 = throwable0;
                    goto label_149;
                label_36:
                    if(v2 < 0) {
                        if(v2 != -2) {
                            if(zzsn0.zzG && (zzsn0.zzaa || zzsn0.zzT == 2)) {
                                this.zzai();
                            }
                            if(zzsn0.zzH == 0x8000000000000001L || zzsn0.zzH + 100L >= this.zzi().zza()) {
                                throwable2 = throwable0;
                                goto label_149;
                            }
                            this.zzai();
                            throwable2 = throwable0;
                            goto label_149;
                        }
                        zzsn0.zzX = true;
                        zzsd zzsd1 = zzsn0.zzs;
                        if(zzsd1 == null) {
                            throw throwable0;
                        }
                        MediaFormat mediaFormat0 = zzsd1.zzc();
                        if(zzsn0.zzA == 0 || mediaFormat0.getInteger("width") != 0x20 || mediaFormat0.getInteger("height") != 0x20) {
                            zzsn0.zzu = mediaFormat0;
                            zzsn0.zzv = true;
                        }
                        else {
                            zzsn0.zzF = true;
                        }
                        goto label_14;
                    }
                    else if(zzsn0.zzF) {
                        zzsn0.zzF = false;
                        zzsd0.zzo(v2, false);
                        goto label_14;
                    }
                    else {
                        if(zzsn0.zzj.size == 0 && (zzsn0.zzj.flags & 4) != 0) {
                            this.zzai();
                            throwable2 = throwable0;
                            goto label_149;
                        }
                        zzsn0.zzK = v2;
                        ByteBuffer byteBuffer0 = zzsd0.zzg(v2);
                        zzsn0.zzL = byteBuffer0;
                        if(byteBuffer0 != null) {
                            byteBuffer0.position(zzsn0.zzj.offset);
                            zzsn0.zzL.limit(zzsn0.zzj.offset + zzsn0.zzj.size);
                        }
                        zzsn0.zzM = zzsn0.zzj.presentationTimeUs < this.zzf();
                        zzsn0.zzN = zzsn0.zzZ != 0x8000000000000001L && zzsn0.zzZ <= zzsn0.zzj.presentationTimeUs;
                        zzab zzab0 = (zzab)zzsn0.zzad.zze.zzc(zzsn0.zzj.presentationTimeUs);
                        if(zzab0 == null && zzsn0.zzaf && zzsn0.zzu != null) {
                            zzab0 = (zzab)zzsn0.zzad.zze.zzb();
                        }
                        if(zzab0 != null) {
                            zzsn0.zzn = zzab0;
                            goto label_71;
                        }
                        else if(zzsn0.zzv && zzsn0.zzn != null) {
                        label_71:
                            zzab zzab1 = zzsn0.zzn;
                            if(zzab1 == null) {
                                throw throwable0;
                            }
                            zzsn0.zzan(zzab1, zzsn0.zzu);
                            zzsn0.zzv = false;
                            zzsn0.zzaf = false;
                        }
                    }
                label_84:
                    if(!zzsn0.zzD || !zzsn0.zzW) {
                        goto label_98;
                    }
                    else {
                        goto label_85;
                    }
                    goto label_112;
                }
                catch(MediaCodec.CryptoException mediaCodec$CryptoException0) {
                    mediaCodec$CryptoException3 = mediaCodec$CryptoException0;
                    zzsn1 = zzsn0;
                    throw zzsn1.zzcW(mediaCodec$CryptoException3, zzsn1.zzm, false, zzei.zzl(mediaCodec$CryptoException3.getErrorCode()));
                }
                catch(IllegalStateException illegalStateException0) {
                    goto label_395;
                }
                try {
                label_85:
                    ByteBuffer byteBuffer1 = zzsn0.zzL;
                    int v3 = zzsn0.zzK;
                    int v4 = zzsn0.zzj.flags;
                    long v5 = zzsn0.zzj.presentationTimeUs;
                    boolean z = zzsn0.zzM;
                    boolean z1 = zzsn0.zzN;
                    zzab zzab2 = zzsn0.zzn;
                    if(zzab2 != null) {
                        try {
                            throwable2 = throwable0;
                            z2 = this.zzar(v, v1, zzsd0, byteBuffer1, v3, v4, 1, v5, z, z1, zzab2);
                            goto label_112;
                        }
                        catch(IllegalStateException unused_ex) {
                            goto label_145;
                        }
                    }
                    throwable2 = throwable0;
                    throw throwable2;
                }
                catch(MediaCodec.CryptoException mediaCodec$CryptoException1) {
                    goto label_143;
                }
            label_98:
                throwable2 = throwable0;
                ByteBuffer byteBuffer2 = zzsn0.zzL;
                int v6 = zzsn0.zzK;
                int v7 = zzsn0.zzj.flags;
                long v8 = zzsn0.zzj.presentationTimeUs;
                boolean z3 = zzsn0.zzM;
                boolean z4 = zzsn0.zzN;
                zzab zzab3 = zzsn0.zzn;
                if(zzab3 != null) {
                    try {
                        z2 = this.zzar(v, v1, zzsd0, byteBuffer2, v6, v7, 1, v8, z3, z4, zzab3);
                        goto label_112;
                    }
                    catch(MediaCodec.CryptoException mediaCodec$CryptoException1) {
                        goto label_143;
                    }
                    catch(IllegalStateException illegalStateException1) {
                    }
                    try {
                        zzsn1 = this;
                        illegalStateException3 = illegalStateException1;
                        goto label_397;
                    }
                    catch(MediaCodec.CryptoException mediaCodec$CryptoException1) {
                        mediaCodec$CryptoException3 = mediaCodec$CryptoException1;
                        throw zzsn1.zzcW(mediaCodec$CryptoException3, zzsn1.zzm, false, zzei.zzl(mediaCodec$CryptoException3.getErrorCode()));
                    }
                    catch(IllegalStateException illegalStateException1) {
                        illegalStateException3 = illegalStateException1;
                        goto label_397;
                    }
                label_112:
                    if(z2) {
                        try {
                            zzsn1 = this;
                            zzsn1.zzaD(zzsn1.zzj.presentationTimeUs);
                            boolean z5 = (zzsn1.zzj.flags & 4) != 0;
                            if(!z5 && zzsn1.zzW && zzsn1.zzN) {
                                zzsn1.zzH = this.zzi().zza();
                            }
                            this.zzaQ();
                            if(z5) {
                                this.zzai();
                                goto label_150;
                            }
                            zzsn0 = zzsn1;
                            throwable0 = throwable2;
                            goto label_14;
                        }
                        catch(MediaCodec.CryptoException mediaCodec$CryptoException2) {
                            mediaCodec$CryptoException3 = mediaCodec$CryptoException2;
                            throw zzsn1.zzcW(mediaCodec$CryptoException3, zzsn1.zzm, false, zzei.zzl(mediaCodec$CryptoException3.getErrorCode()));
                        }
                        catch(IllegalStateException illegalStateException2) {
                            illegalStateException3 = illegalStateException2;
                            goto label_397;
                        }
                    }
                    zzsn1 = this;
                    goto label_150;
                }
                try {
                    zzsn1 = zzsn0;
                    throw throwable2;
                label_131:
                    zzsn1 = zzsn0;
                    zzhs zzhs0 = zzsn1.zza;
                    zzhs0.zzd += this.zzd(v);
                    zzsn1.zzaW(1);
                    return;
                }
                catch(MediaCodec.CryptoException mediaCodec$CryptoException1) {
                }
                catch(IllegalStateException illegalStateException1) {
                    illegalStateException3 = illegalStateException1;
                    goto label_397;
                }
                try {
                    while(true) {
                        mediaCodec$CryptoException3 = mediaCodec$CryptoException1;
                        throw zzsn1.zzcW(mediaCodec$CryptoException3, zzsn1.zzm, false, zzei.zzl(mediaCodec$CryptoException3.getErrorCode()));
                    label_143:
                        zzsn1 = this;
                    }
                }
                catch(IllegalStateException unused_ex) {
                }
                catch(MediaCodec.CryptoException mediaCodec$CryptoException1) {
                    goto label_143;
                }
                try {
                label_145:
                    this.zzai();
                    zzsn0 = this;
                }
                catch(MediaCodec.CryptoException mediaCodec$CryptoException0) {
                    zzsn0 = this;
                    mediaCodec$CryptoException3 = mediaCodec$CryptoException0;
                    zzsn1 = zzsn0;
                    throw zzsn1.zzcW(mediaCodec$CryptoException3, zzsn1.zzm, false, zzei.zzl(mediaCodec$CryptoException3.getErrorCode()));
                }
                catch(IllegalStateException illegalStateException0) {
                    zzsn0 = this;
                    goto label_395;
                }
                try {
                    if(zzsn0.zzab) {
                        this.zzaG();
                    }
                label_149:
                    zzsn1 = zzsn0;
                }
                catch(MediaCodec.CryptoException mediaCodec$CryptoException0) {
                    mediaCodec$CryptoException3 = mediaCodec$CryptoException0;
                    zzsn1 = zzsn0;
                    throw zzsn1.zzcW(mediaCodec$CryptoException3, zzsn1.zzm, false, zzei.zzl(mediaCodec$CryptoException3.getErrorCode()));
                }
                catch(IllegalStateException illegalStateException0) {
                    goto label_395;
                }
                while(true) {
                label_150:
                    zzsd zzsd2 = zzsn1.zzs;
                    if(zzsd2 == null || zzsn1.zzT == 2 || zzsn1.zzaa) {
                        goto label_220;
                    }
                    if(zzsn1.zzJ < 0) {
                        try {
                            int v9 = zzsd2.zza();
                            zzsn1.zzJ = v9;
                            if(v9 < 0) {
                                goto label_220;
                            }
                            zzsn1.zzg.zzc = zzsd2.zzf(v9);
                            zzsn1.zzg.zzb();
                        }
                        catch(MediaCodec.CryptoException mediaCodec$CryptoException2) {
                            mediaCodec$CryptoException3 = mediaCodec$CryptoException2;
                            throw zzsn1.zzcW(mediaCodec$CryptoException3, zzsn1.zzm, false, zzei.zzl(mediaCodec$CryptoException3.getErrorCode()));
                        }
                        catch(IllegalStateException illegalStateException2) {
                            illegalStateException3 = illegalStateException2;
                            goto label_397;
                        }
                    }
                    if(zzsn1.zzT == 1) {
                        try {
                            if(!zzsn1.zzG) {
                                zzsn1.zzW = true;
                                zzsd2.zzk(zzsn1.zzJ, 0, 0, 0L, 4);
                                this.zzao();
                            }
                            zzsn1.zzT = 2;
                            goto label_220;
                        }
                        catch(MediaCodec.CryptoException mediaCodec$CryptoException2) {
                        }
                        catch(IllegalStateException illegalStateException4) {
                            illegalStateException3 = illegalStateException4;
                            goto label_397;
                        }
                        try {
                            mediaCodec$CryptoException3 = mediaCodec$CryptoException2;
                            throw zzsn1.zzcW(mediaCodec$CryptoException3, zzsn1.zzm, false, zzei.zzl(mediaCodec$CryptoException3.getErrorCode()));
                        }
                        catch(MediaCodec.CryptoException mediaCodec$CryptoException2) {
                            mediaCodec$CryptoException3 = mediaCodec$CryptoException2;
                            throw zzsn1.zzcW(mediaCodec$CryptoException3, zzsn1.zzm, false, zzei.zzl(mediaCodec$CryptoException3.getErrorCode()));
                        }
                        catch(IllegalStateException illegalStateException2) {
                            illegalStateException3 = illegalStateException2;
                            goto label_397;
                        }
                    }
                    try {
                        if(!zzsn1.zzE) {
                            if(zzsn1.zzS == 1) {
                                for(int v10 = 0; true; ++v10) {
                                    zzab zzab4 = zzsn1.zzt;
                                    if(zzab4 == null) {
                                        throw throwable2;
                                    }
                                    if(v10 >= zzab4.zzr.size()) {
                                        break;
                                    }
                                    byte[] arr_b = (byte[])zzsn1.zzt.zzr.get(v10);
                                    ByteBuffer byteBuffer3 = zzsn1.zzg.zzc;
                                    if(byteBuffer3 == null) {
                                        throw throwable2;
                                    }
                                    byteBuffer3.put(arr_b);
                                }
                                zzsn1.zzS = 2;
                            }
                            ByteBuffer byteBuffer4 = zzsn1.zzg.zzc;
                            if(byteBuffer4 == null) {
                                throw throwable2;
                            }
                            int v11 = byteBuffer4.position();
                            zzke zzke0 = this.zzk();
                            try {
                                int v12 = zzsn1.zzcU(zzke0, zzsn1.zzg, 0);
                            }
                            catch(zzhg zzhg0) {
                                zzsn1.zzak(zzhg0);
                                zzsn1.zzaW(0);
                                this.zzah();
                                continue;
                            }
                            if(v12 == -3) {
                                if(!this.zzQ()) {
                                    goto label_220;
                                }
                                zzsn1.zzZ = zzsn1.zzY;
                                goto label_220;
                            }
                            if(v12 == -5) {
                                if(zzsn1.zzS == 2) {
                                    zzsn1.zzg.zzb();
                                    zzsn1.zzS = 1;
                                }
                                zzsn1.zzac(zzke0);
                            }
                            else {
                                zzhh zzhh0 = zzsn1.zzg;
                                if(zzhh0.zzf()) {
                                    zzsn1.zzZ = zzsn1.zzY;
                                    if(zzsn1.zzS == 2) {
                                        zzhh0.zzb();
                                        zzsn1.zzS = 1;
                                    }
                                    zzsn1.zzaa = true;
                                    if(!zzsn1.zzV) {
                                        this.zzai();
                                    }
                                    else if(!zzsn1.zzG) {
                                        zzsn1.zzW = true;
                                        zzsd2.zzk(zzsn1.zzJ, 0, 0, 0L, 4);
                                        this.zzao();
                                    }
                                }
                                else {
                                    goto label_222;
                                }
                            label_220:
                                Trace.endSection();
                                return;
                            label_222:
                                if(!zzsn1.zzV && !zzhh0.zzg()) {
                                    zzhh0.zzb();
                                    if(zzsn1.zzS != 2) {
                                        continue;
                                    }
                                    zzsn1.zzS = 1;
                                }
                                else if(zzsn1.zzaO(zzhh0)) {
                                    zzsn1.zzg.zzb();
                                    ++zzsn1.zza.zzd;
                                }
                                else {
                                    zzhh zzhh1 = zzsn1.zzg;
                                    boolean z6 = zzhh1.zzl();
                                    if(z6) {
                                        zzhh1.zzb.zzb(v11);
                                    }
                                    long v13 = zzsn1.zzg.zze;
                                    if(zzsn1.zzac) {
                                        if(zzsn1.zzk.isEmpty()) {
                                            zzee zzee1 = zzsn1.zzad.zze;
                                            zzab zzab6 = zzsn1.zzm;
                                            if(zzab6 == null) {
                                                throw throwable2;
                                            }
                                            zzee1.zzd(v13, zzab6);
                                        }
                                        else {
                                            zzee zzee0 = ((zzsl)zzsn1.zzk.peekLast()).zze;
                                            zzab zzab5 = zzsn1.zzm;
                                            if(zzab5 == null) {
                                                throw throwable2;
                                            }
                                            zzee0.zzd(v13, zzab5);
                                        }
                                        zzsn1.zzac = false;
                                    }
                                    long v14 = Math.max(zzsn1.zzY, v13);
                                    zzsn1.zzY = v14;
                                    if(this.zzQ() || zzsn1.zzg.zzh()) {
                                        zzsn1.zzZ = v14;
                                    }
                                    zzsn1.zzg.zzk();
                                    zzhh zzhh2 = zzsn1.zzg;
                                    if(zzhh2.zze()) {
                                        zzsn1.zzaj(zzhh2);
                                    }
                                    zzsn1.zzaE(zzsn1.zzg);
                                    zzsn1.zzau(zzsn1.zzg);
                                    if(z6) {
                                        zzsd2.zzl(zzsn1.zzJ, 0, zzsn1.zzg.zzb, v13, 0);
                                    }
                                    else {
                                        int v15 = zzsn1.zzJ;
                                        ByteBuffer byteBuffer5 = zzsn1.zzg.zzc;
                                        if(byteBuffer5 == null) {
                                            throw throwable2;
                                        }
                                        zzsd2.zzk(v15, 0, byteBuffer5.limit(), v13, 0);
                                    }
                                    this.zzao();
                                    zzsn1.zzV = true;
                                    zzsn1.zzS = 0;
                                    ++zzsn1.zza.zzc;
                                }
                            }
                            continue;
                        }
                        zzsn1.zzE = false;
                        ByteBuffer byteBuffer6 = zzsn1.zzg.zzc;
                        if(byteBuffer6 == null) {
                            throw throwable2;
                        }
                        byteBuffer6.put(zzsn.zzb);
                        zzsd2.zzk(zzsn1.zzJ, 0, 38, 0L, 0);
                        this.zzao();
                        zzsn1.zzV = true;
                    }
                    catch(MediaCodec.CryptoException mediaCodec$CryptoException1) {
                        mediaCodec$CryptoException3 = mediaCodec$CryptoException1;
                        throw zzsn1.zzcW(mediaCodec$CryptoException3, zzsn1.zzm, false, zzei.zzl(mediaCodec$CryptoException3.getErrorCode()));
                    }
                    catch(IllegalStateException illegalStateException1) {
                        illegalStateException3 = illegalStateException1;
                        goto label_397;
                    }
                }
                try {
                label_287:
                    Trace.beginSection("bypassRender");
                    while(true) {
                    label_288:
                        zzcw.zzf(!zzsn0.zzab);
                        zzru zzru0 = zzsn0.zzi;
                        if(zzru0.zzq()) {
                            ByteBuffer byteBuffer7 = zzru0.zzc;
                            int v16 = zzsn0.zzK;
                            int v17 = zzru0.zzm();
                            long v18 = zzru0.zze;
                            boolean z7 = zzsn0.zzaV(this.zzf(), zzru0.zzn());
                            boolean z8 = zzsn0.zzi.zzf();
                            zzab zzab7 = zzsn0.zzn;
                            if(zzab7 == null) {
                                throw throwable1;
                            }
                            break;
                        }
                        else {
                            throwable3 = throwable1;
                        }
                        goto label_314;
                    }
                }
                catch(MediaCodec.CryptoException mediaCodec$CryptoException0) {
                    mediaCodec$CryptoException3 = mediaCodec$CryptoException0;
                    zzsn1 = zzsn0;
                    throw zzsn1.zzcW(mediaCodec$CryptoException3, zzsn1.zzm, false, zzei.zzl(mediaCodec$CryptoException3.getErrorCode()));
                }
                catch(IllegalStateException illegalStateException0) {
                    goto label_395;
                }
                try {
                    if(!this.zzar(v, v1, null, byteBuffer7, v16, 0, v17, v18, z7, z8, zzab7)) {
                        goto label_387;
                    }
                    goto label_310;
                }
                catch(MediaCodec.CryptoException mediaCodec$CryptoException0) {
                }
                catch(IllegalStateException illegalStateException0) {
                    zzsn0 = this;
                    goto label_395;
                }
                try {
                    zzsn0 = this;
                    mediaCodec$CryptoException3 = mediaCodec$CryptoException0;
                    zzsn1 = zzsn0;
                    throw zzsn1.zzcW(mediaCodec$CryptoException3, zzsn1.zzm, false, zzei.zzl(mediaCodec$CryptoException3.getErrorCode()));
                label_310:
                    zzsn0 = this;
                    zzsn0.zzaD(zzsn0.zzi.zzn());
                    zzsn0.zzi.zzb();
                    throwable3 = null;
                label_314:
                    if(zzsn0.zzaa) {
                        zzsn0.zzab = true;
                    }
                    else {
                        if(zzsn0.zzP) {
                            zzcw.zzf(zzsn0.zzi.zzp(zzsn0.zzh));
                            zzsn0.zzP = false;
                        }
                        if(zzsn0.zzQ) {
                            if(zzsn0.zzi.zzq()) {
                                throwable1 = throwable3;
                                goto label_288;
                            }
                            else {
                                this.zzad();
                                zzsn0.zzQ = false;
                                this.zzaC();
                                if(zzsn0.zzO) {
                                    goto label_326;
                                }
                                Trace.endSection();
                                return;
                            }
                        }
                    label_326:
                        zzcw.zzf(!zzsn0.zzaa);
                        zzke zzke1 = this.zzk();
                        zzsn0.zzh.zzb();
                    alab1:
                        do {
                            zzsn0.zzh.zzb();
                            switch(zzsn0.zzcU(zzke1, zzsn0.zzh, 0)) {
                                case -5: {
                                    zzsn0.zzac(zzke1);
                                    goto label_379;
                                }
                                case -4: {
                                    zzhh zzhh3 = zzsn0.zzh;
                                    if(zzhh3.zzf()) {
                                        goto label_377;
                                    }
                                    long v19 = Math.max(zzsn0.zzY, zzhh3.zze);
                                    zzsn0.zzY = v19;
                                    if(this.zzQ() || zzsn0.zzg.zzh()) {
                                        zzsn0.zzZ = v19;
                                    }
                                    if(zzsn0.zzac) {
                                        zzab zzab8 = zzsn0.zzm;
                                        if(zzab8 == null) {
                                            throw throwable3;
                                        }
                                        zzsn0.zzn = zzab8;
                                        if(Objects.equals(zzab8.zzo, "audio/opus") && !zzsn0.zzn.zzr.isEmpty()) {
                                            int v20 = zzadi.zza(((byte[])zzsn0.zzn.zzr.get(0)));
                                            zzab zzab9 = zzsn0.zzn;
                                            if(zzab9 == null) {
                                                throw throwable3;
                                            }
                                            zzz zzz0 = zzab9.zzb();
                                            zzz0.zzG(v20);
                                            zzsn0.zzn = zzz0.zzag();
                                        }
                                        zzsn0.zzan(zzsn0.zzn, ((MediaFormat)throwable3));
                                        zzsn0.zzac = false;
                                    }
                                    zzsn0.zzh.zzk();
                                    if(zzsn0.zzn != null && Objects.equals(zzsn0.zzn.zzo, "audio/opus")) {
                                        zzhh zzhh4 = zzsn0.zzh;
                                        if(zzhh4.zze()) {
                                            zzhh4.zza = zzsn0.zzn;
                                            zzsn0.zzaj(zzhh4);
                                        }
                                        zzhh zzhh5 = zzsn0.zzh;
                                        if(zzadi.zzf(this.zzf(), zzhh5.zze)) {
                                            zzqt zzqt0 = zzsn0.zzl;
                                            zzab zzab10 = zzsn0.zzn;
                                            if(zzab10 == null) {
                                                throw throwable3;
                                            }
                                            zzqt0.zza(zzhh5, zzab10.zzr);
                                        }
                                    }
                                    zzru zzru1 = zzsn0.zzi;
                                    if(zzru1.zzq()) {
                                        long v21 = this.zzf();
                                        if(zzsn0.zzaV(v21, zzru1.zzn()) == zzsn0.zzaV(v21, zzsn0.zzh.zze)) {
                                            break;
                                        }
                                        break alab1;
                                    }
                                    break;
                                }
                                default: {
                                    if(this.zzQ()) {
                                        zzsn0.zzZ = zzsn0.zzY;
                                    }
                                    goto label_379;
                                }
                            }
                        }
                        while(zzsn0.zzi.zzp(zzsn0.zzh));
                        zzsn0.zzP = true;
                        goto label_379;
                    label_377:
                        zzsn0.zzaa = true;
                        zzsn0.zzZ = zzsn0.zzY;
                    label_379:
                        zzru zzru2 = zzsn0.zzi;
                        if(zzru2.zzq()) {
                            zzru2.zzk();
                        }
                        if(zzsn0.zzi.zzq() || zzsn0.zzaa || zzsn0.zzQ) {
                            throwable1 = throwable3;
                            goto label_288;
                        label_387:
                            zzsn0 = this;
                        }
                    }
                    Trace.endSection();
                    return;
                }
                catch(MediaCodec.CryptoException mediaCodec$CryptoException0) {
                }
                catch(IllegalStateException illegalStateException0) {
                    goto label_395;
                }
            }
            catch(MediaCodec.CryptoException mediaCodec$CryptoException0) {
            }
            mediaCodec$CryptoException3 = mediaCodec$CryptoException0;
            zzsn1 = zzsn0;
            throw zzsn1.zzcW(mediaCodec$CryptoException3, zzsn1.zzm, false, zzei.zzl(mediaCodec$CryptoException3.getErrorCode()));
        }
    label_395:
        illegalStateException3 = illegalStateException0;
        zzsn1 = zzsn0;
    label_397:
        if(!(illegalStateException3 instanceof MediaCodec.CodecException)) {
            StackTraceElement[] arr_stackTraceElement = illegalStateException3.getStackTrace();
            if(arr_stackTraceElement.length <= 0 || !arr_stackTraceElement[0].getClassName().equals("android.media.MediaCodec")) {
                throw illegalStateException3;
            }
        }
        zzsn1.zzak(illegalStateException3);
        boolean z9 = illegalStateException3 instanceof MediaCodec.CodecException && ((MediaCodec.CodecException)illegalStateException3).isRecoverable();
        if(z9) {
            this.zzaG();
        }
        zzsf zzsf0 = zzsn1.zzaA(illegalStateException3, zzsn1.zzz);
        throw zzsn1.zzcW(zzsf0, zzsn1.zzm, z9, (zzsf0.zzb == 1101 ? 4006 : 4003));
    }

    @Override  // com.google.android.gms.internal.ads.zzlj
    public boolean zzW() {
        return this.zzab;
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzlj
    public boolean zzX() {
        return this.zzm != null && (this.zzS() || this.zzaU() || this.zzI != 0x8000000000000001L && this.zzi().zzb() < this.zzI);
    }

    @Override  // com.google.android.gms.internal.ads.zzlm
    public final int zzY(zzab zzab0) throws zzib {
        try {
            return this.zzaa(this.zzd, zzab0);
        }
        catch(zzsu zzsu0) {
            throw this.zzcW(zzsu0, zzab0, false, 4002);
        }
    }

    protected float zzZ(float f, zzab zzab0, zzab[] arr_zzab) {
        throw null;
    }

    protected zzsf zzaA(Throwable throwable0, @Nullable zzsg zzsg0) {
        return new zzsf(throwable0, zzsg0);
    }

    @Nullable
    protected final zzsg zzaB() {
        return this.zzz;
    }

    protected final void zzaC() throws zzib {
        int v7;
        zzsa zzsa2;
        zzsa zzsa1;
        int v3;
        LinkedHashSet linkedHashSet0;
        ArrayDeque arrayDeque2;
        StringBuilder stringBuilder0;
        long v2;
        zzsg zzsg1;
        zzab zzab4;
        ArrayDeque arrayDeque1;
        Throwable throwable2;
        zzsa zzsa0;
        long v1;
        float f;
        String s;
        zzab zzab3;
        zzab zzab2;
        zzsg zzsg0;
        ArrayDeque arrayDeque0;
        if(this.zzs == null && !this.zzO) {
            zzab zzab0 = this.zzm;
            if(zzab0 != null) {
                if(this.zzaM(zzab0)) {
                    this.zzad();
                    if("audio/mp4a-latm".equals(zzab0.zzo) || "audio/mpeg".equals(zzab0.zzo) || "audio/opus".equals(zzab0.zzo)) {
                        this.zzi.zzo(0x20);
                    }
                    else {
                        this.zzi.zzo(1);
                    }
                    this.zzO = true;
                    return;
                }
                this.zzag = this.zzah;
                if(this.zzah != null) {
                    zzcw.zzf(true);
                }
                zzab zzab1 = this.zzm;
                Throwable throwable0 = null;
                if(zzab1 == null) {
                    zzab2 = zzab0;
                    throw null;
                }
                else {
                    if(this.zzx == null) {
                        try {
                            try {
                                List list0 = this.zzag(this.zzd, zzab1, false);
                                list0.isEmpty();
                                this.zzx = new ArrayDeque();
                                if(!list0.isEmpty()) {
                                    this.zzx.add(((zzsg)list0.get(0)));
                                }
                                this.zzy = null;
                            }
                            catch(zzsu zzsu0) {
                                throw new zzsj(zzab1, zzsu0, false, 0xFFFF3CB2);
                            }
                        label_24:
                            if(!this.zzx.isEmpty()) {
                                arrayDeque0 = this.zzx;
                                if(arrayDeque0 != null) {
                                    while(true) {
                                    label_27:
                                        if(this.zzs != null) {
                                            this.zzx = throwable0;
                                            return;
                                        }
                                        zzsg0 = (zzsg)arrayDeque0.peekFirst();
                                        if(zzsg0 == null) {
                                            zzab2 = zzab0;
                                            throw throwable0;
                                        }
                                        if(!this.zzaN(zzsg0)) {
                                            return;
                                        }
                                        goto label_37;
                                    }
                                }
                                zzab2 = zzab0;
                                throw null;
                            }
                            zzab2 = zzab0;
                            throw new zzsj(zzab1, null, false, 0xFFFF3CB1);
                        }
                        catch(zzsj zzsj0) {
                            zzab2 = zzab0;
                            throw this.zzcW(zzsj0, zzab2, false, 4001);
                        }
                    }
                    goto label_24;
                    try {
                    label_37:
                        zzab3 = this.zzm;
                        if(zzab3 != null) {
                            s = zzsg0.zza;
                            int v = zzei.zza;
                            f = v >= 23 ? this.zzZ(this.zzr, zzab3, this.zzT()) : -1.0f;
                            if(f <= this.zze) {
                                f = -1.0f;
                            }
                            this.zzaF(zzab3);
                            v1 = this.zzi().zzb();
                            zzsa0 = this.zzaf(zzsg0, zzab3, ((MediaCrypto)throwable0), f);
                            if(v >= 0x1F) {
                                LogSessionId logSessionId0 = this.zzo().zza();
                                if(!logSessionId0.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                                    String s1 = logSessionId0.getStringId();
                                    zzsa0.zzb.setString("log-session-id", s1);
                                }
                            }
                            goto label_52;
                        }
                        goto label_278;
                    }
                    catch(Exception exception0) {
                        goto label_70;
                    }
                    try {
                    label_52:
                        Trace.beginSection(("createCodec:" + s));
                        zzsd zzsd0 = this.zzc.zzd(zzsa0);
                        this.zzs = zzsd0;
                        zzsd0.zzs(new zzsk(this, ((zzsm)throwable0)));
                    }
                    catch(Throwable throwable1) {
                        try {
                            throwable2 = throwable0;
                            arrayDeque1 = arrayDeque0;
                            zzab2 = zzab0;
                            zzab4 = zzab1;
                            zzsg1 = zzsg0;
                            Trace.endSection();
                            throw throwable1;
                        }
                        catch(Exception exception0) {
                            goto label_285;
                        }
                    }
                    try {
                        Trace.endSection();
                        v2 = this.zzi().zzb();
                        if(zzsg0.zze(zzab3)) {
                            goto label_231;
                        }
                        else {
                            goto label_75;
                        }
                        goto label_235;
                    }
                    catch(Exception exception0) {
                    label_70:
                        throwable2 = throwable0;
                        arrayDeque1 = arrayDeque0;
                        zzab2 = zzab0;
                        zzab4 = zzab1;
                        zzsg1 = zzsg0;
                        goto label_285;
                    }
                    try {
                    label_75:
                        stringBuilder0 = new StringBuilder();
                        stringBuilder0.append("id=");
                        stringBuilder0.append(zzab3.zza);
                        stringBuilder0.append(", mimeType=");
                        stringBuilder0.append(zzab3.zzo);
                    }
                    catch(Exception exception0) {
                        try {
                            arrayDeque2 = arrayDeque0;
                            zzab2 = zzab0;
                            zzab4 = zzab1;
                        }
                        catch(Exception exception0) {
                        }
                        goto label_265;
                    }
                    if(zzab3.zzn == null) {
                    label_95:
                        arrayDeque2 = arrayDeque0;
                        if(zzab3.zzj == -1) {
                            goto label_99;
                        }
                        else {
                            try {
                                stringBuilder0.append(", bitrate=");
                                stringBuilder0.append(zzab3.zzj);
                            label_99:
                                if(zzab3.zzk != null) {
                                    stringBuilder0.append(", codecs=");
                                    stringBuilder0.append(zzab3.zzk);
                                }
                                goto label_110;
                            }
                            catch(Exception exception0) {
                            }
                        }
                        zzab2 = zzab0;
                        zzab4 = zzab1;
                        arrayDeque1 = arrayDeque2;
                    }
                    else {
                        try {
                            stringBuilder0.append(", container=");
                            stringBuilder0.append(zzab3.zzn);
                            goto label_95;
                        }
                        catch(Exception exception0) {
                            arrayDeque1 = arrayDeque0;
                            zzab2 = zzab0;
                            zzab4 = zzab1;
                        }
                    }
                    throwable2 = null;
                    zzsg1 = zzsg0;
                    goto label_285;
                    try {
                    label_110:
                        if(zzab3.zzs == null) {
                            goto label_150;
                        }
                        else {
                            linkedHashSet0 = new LinkedHashSet();
                            zzab2 = zzab0;
                            v3 = 0;
                            goto label_119;
                        }
                        goto label_153;
                    }
                    catch(Exception exception0) {
                        try {
                            zzab2 = zzab0;
                            zzab4 = zzab1;
                            goto label_265;
                            while(true) {
                            label_119:
                                zzu zzu0 = zzab3.zzs;
                                zzab4 = zzab1;
                                if(v3 >= zzu0.zzb) {
                                    break;
                                }
                                UUID uUID0 = zzu0.zza(v3).zza;
                                if(uUID0.equals(zzh.zzb)) {
                                    linkedHashSet0.add("cenc");
                                }
                                else {
                                    if(!uUID0.equals(zzh.zzc)) {
                                        if(uUID0.equals(zzh.zze)) {
                                        }
                                        else if(uUID0.equals(zzh.zzd)) {
                                            linkedHashSet0.add("widevine");
                                            goto label_140;
                                        }
                                        else if(uUID0.equals(zzh.zza)) {
                                            linkedHashSet0.add("universal");
                                            goto label_140;
                                        }
                                        else {
                                            zzsa1 = zzsa0;
                                            linkedHashSet0.add("unknown (" + uUID0.toString() + ")");
                                            goto label_141;
                                        }
                                        linkedHashSet0.add("playready");
                                        goto label_140;
                                    }
                                    linkedHashSet0.add("clearkey");
                                }
                            label_140:
                                zzsa1 = zzsa0;
                            label_141:
                                ++v3;
                                zzab1 = zzab4;
                                zzsa0 = zzsa1;
                            }
                            zzsa2 = zzsa0;
                            stringBuilder0.append(", drm=[");
                            zzfuf.zzb(stringBuilder0, linkedHashSet0, ",");
                            stringBuilder0.append(']');
                            goto label_153;
                        label_150:
                            zzsa2 = zzsa0;
                            zzab2 = zzab0;
                            zzab4 = zzab1;
                        label_153:
                            if(zzab3.zzv != -1 && zzab3.zzw != -1) {
                                stringBuilder0.append(", res=");
                                stringBuilder0.append(zzab3.zzv);
                                stringBuilder0.append("x");
                                stringBuilder0.append(zzab3.zzw);
                            }
                            if(zzab3.zzC != null && (zzab3.zzC.zze() || zzab3.zzC.zzf())) {
                                stringBuilder0.append(", color=");
                                stringBuilder0.append(zzab3.zzC.zzd());
                            }
                            if(zzab3.zzx != -1.0f) {
                                stringBuilder0.append(", fps=");
                                stringBuilder0.append(zzab3.zzx);
                            }
                            if(zzab3.zzD != -1) {
                                stringBuilder0.append(", channels=");
                                stringBuilder0.append(zzab3.zzD);
                            }
                            if(zzab3.zzE != -1) {
                                stringBuilder0.append(", sample_rate=");
                                stringBuilder0.append(zzab3.zzE);
                            }
                            if(zzab3.zzd != null) {
                                stringBuilder0.append(", language=");
                                stringBuilder0.append(zzab3.zzd);
                            }
                            if(!zzab3.zzc.isEmpty()) {
                                stringBuilder0.append(", labels=[");
                                zzy zzy0 = new zzy();
                                zzfuf.zzb(stringBuilder0, zzfyd.zzb(zzab3.zzc, zzy0), ",");
                                stringBuilder0.append("]");
                            }
                            if(zzab3.zze != 0) {
                                stringBuilder0.append(", selectionFlags=[");
                                int v4 = zzab3.zze;
                                ArrayList arrayList0 = new ArrayList();
                                if((v4 & 1) != 0) {
                                    arrayList0.add("default");
                                }
                                if((v4 & 2) != 0) {
                                    arrayList0.add("forced");
                                }
                                zzfuf.zzb(stringBuilder0, arrayList0, ",");
                                stringBuilder0.append("]");
                            }
                            if(zzab3.zzf != 0) {
                                stringBuilder0.append(", roleFlags=[");
                                int v5 = zzab3.zzf;
                                ArrayList arrayList1 = new ArrayList();
                                if((v5 & 1) != 0) {
                                    arrayList1.add("main");
                                }
                                if((v5 & 2) != 0) {
                                    arrayList1.add("alt");
                                }
                                if((v5 & 4) != 0) {
                                    arrayList1.add("supplementary");
                                }
                                if((v5 & 8) != 0) {
                                    arrayList1.add("commentary");
                                }
                                if((v5 & 16) != 0) {
                                    arrayList1.add("dub");
                                }
                                if((v5 & 0x20) != 0) {
                                    arrayList1.add("emergency");
                                }
                                if((v5 & 0x40) != 0) {
                                    arrayList1.add("caption");
                                }
                                if((v5 & 0x80) != 0) {
                                    arrayList1.add("subtitle");
                                }
                                if((v5 & 0x100) != 0) {
                                    arrayList1.add("sign");
                                }
                                if((v5 & 0x200) != 0) {
                                    arrayList1.add("describes-video");
                                }
                                if((v5 & 0x400) != 0) {
                                    arrayList1.add("describes-music");
                                }
                                if((v5 & 0x800) != 0) {
                                    arrayList1.add("enhanced-intelligibility");
                                }
                                if((v5 & 0x1000) != 0) {
                                    arrayList1.add("transcribes-dialog");
                                }
                                if((v5 & 0x2000) != 0) {
                                    arrayList1.add("easy-read");
                                }
                                if((v5 & 0x4000) != 0) {
                                    arrayList1.add("trick-play");
                                }
                                if((v5 & 0x8000) != 0) {
                                    arrayList1.add("auxiliary");
                                }
                                zzfuf.zzb(stringBuilder0, arrayList1, ",");
                                stringBuilder0.append("]");
                            }
                            if((zzab3.zzf & 0x8000) != 0) {
                                stringBuilder0.append(", auxiliaryTrackType=");
                                stringBuilder0.append("undefined");
                            }
                            zzdo.zzf("MediaCodecRenderer", String.format(Locale.US, "Format exceeds selected codec\'s capabilities [%s, %s]", stringBuilder0.toString(), s));
                            goto label_235;
                        label_231:
                            arrayDeque2 = arrayDeque0;
                            zzsa2 = zzsa0;
                            zzab2 = zzab0;
                            zzab4 = zzab1;
                        label_235:
                            this.zzz = zzsg0;
                            this.zzw = f;
                            this.zzt = zzab3;
                            int v6 = zzei.zza;
                            if(v6 <= 25 && "OMX.Exynos.avc.dec.secure".equals(s) && (zzei.zzd.startsWith("SM-T585") || zzei.zzd.startsWith("SM-A510") || zzei.zzd.startsWith("SM-A520") || zzei.zzd.startsWith("SM-J700"))) {
                                v7 = 2;
                            }
                            else if(v6 >= 24 || !"OMX.Nvidia.h264.decode".equals(s) && !"OMX.Nvidia.h264.decode.secure".equals(s) || !"flounder".equals(zzei.zzb) && !"flounder_lte".equals(zzei.zzb) && !"grouper".equals(zzei.zzb) && !"tilapia".equals(zzei.zzb)) {
                                v7 = 0;
                            }
                            else {
                                v7 = 1;
                            }
                            this.zzA = v7;
                            this.zzB = v6 == 29 && "c2.android.aac.decoder".equals(s);
                            this.zzC = v6 <= 23 && "OMX.google.vorbis.decoder".equals(s);
                            this.zzD = v6 == 21 && "OMX.google.aac.decoder".equals(s);
                            this.zzG = v6 <= 25 && "OMX.rk.video_decoder.avc".equals(zzsg0.zza) || (v6 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(zzsg0.zza) || "OMX.broadcom.video_decoder.tunnel.secure".equals(zzsg0.zza) || "OMX.bcm.vdec.avc.tunnel".equals(zzsg0.zza) || "OMX.bcm.vdec.avc.tunnel.secure".equals(zzsg0.zza) || "OMX.bcm.vdec.hevc.tunnel".equals(zzsg0.zza) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(zzsg0.zza)) || "Amazon".equals(zzei.zzc) && "AFTS".equals(zzei.zzd) && zzsg0.zzf);
                            if(this.zzs != null) {
                                goto label_252;
                            }
                            zzsg1 = zzsg0;
                            arrayDeque1 = arrayDeque2;
                            throwable2 = null;
                            throw null;
                        }
                        catch(Exception exception0) {
                            goto label_265;
                        }
                    }
                    try {
                    label_252:
                        if(this.zzcT() == 2) {
                            this.zzI = this.zzi().zzb() + 1000L;
                        }
                        ++this.zza.zza;
                        zzsg1 = zzsg0;
                        arrayDeque1 = arrayDeque2;
                        throwable2 = null;
                    }
                    catch(Exception exception0) {
                        zzsg1 = zzsg0;
                        arrayDeque1 = arrayDeque2;
                        try {
                            while(true) {
                                throwable2 = null;
                                goto label_285;
                            label_265:
                                zzsg1 = zzsg0;
                                arrayDeque1 = arrayDeque2;
                            }
                        }
                        catch(Exception exception0) {
                            goto label_265;
                        }
                    }
                    try {
                        this.zzal(s, zzsa2, v2, v2 - v1);
                        throwable0 = null;
                        arrayDeque0 = arrayDeque1;
                        zzab0 = zzab2;
                        zzab1 = zzab4;
                        goto label_27;
                    label_278:
                        throwable2 = throwable0;
                        arrayDeque1 = arrayDeque0;
                        zzab2 = zzab0;
                        zzab4 = zzab1;
                        zzsg1 = zzsg0;
                        throw throwable2;
                    }
                    catch(Exception exception0) {
                    }
                    try {
                    label_285:
                        zzdo.zzg("MediaCodecRenderer", "Failed to initialize decoder: " + zzsg1.zza, exception0);
                        arrayDeque1.removeFirst();
                        zzsj zzsj1 = new zzsj(zzab4, exception0, false, zzsg1);
                        this.zzak(zzsj1);
                        zzsj zzsj2 = this.zzy;
                        this.zzy = zzsj2 == null ? zzsj1 : zzsj.zza(zzsj2, zzsj1);
                        if(arrayDeque1.isEmpty()) {
                            throw this.zzy;
                        }
                        zzab1 = zzab4;
                        throwable0 = throwable2;
                        arrayDeque0 = arrayDeque1;
                        zzab0 = zzab2;
                        goto label_27;
                    }
                    catch(zzsj zzsj0) {
                    }
                }
                throw this.zzcW(zzsj0, zzab2, false, 4001);
            }
        }
    }

    @CallSuper
    protected void zzaD(long v) {
        this.zzae = v;
        while(!this.zzk.isEmpty() && v >= ((zzsl)this.zzk.peek()).zzb) {
            zzsl zzsl0 = (zzsl)this.zzk.poll();
            zzsl0.getClass();
            this.zzaR(zzsl0);
            this.zzap();
        }
    }

    protected void zzaE(zzhh zzhh0) throws zzib {
    }

    protected void zzaF(zzab zzab0) throws zzib {
    }

    protected final void zzaG() {
        try {
            zzsd zzsd0 = this.zzs;
            if(zzsd0 != null) {
                zzsd0.zzm();
                ++this.zza.zzb;
                zzsg zzsg0 = this.zzz;
                if(zzsg0 == null) {
                    throw null;
                }
                this.zzam(zzsg0.zza);
            }
        }
        finally {
            this.zzs = null;
            this.zzp = null;
            this.zzag = null;
            this.zzaI();
        }
    }

    @CallSuper
    protected void zzaH() {
        this.zzao();
        this.zzaQ();
        this.zzI = 0x8000000000000001L;
        this.zzW = false;
        this.zzH = 0x8000000000000001L;
        this.zzV = false;
        this.zzE = false;
        this.zzF = false;
        this.zzM = false;
        this.zzN = false;
        this.zzY = 0x8000000000000001L;
        this.zzZ = 0x8000000000000001L;
        this.zzae = 0x8000000000000001L;
        this.zzT = 0;
        this.zzU = 0;
        this.zzS = this.zzR;
    }

    @CallSuper
    protected final void zzaI() {
        this.zzaH();
        this.zzx = null;
        this.zzz = null;
        this.zzt = null;
        this.zzu = null;
        this.zzv = false;
        this.zzX = false;
        this.zzw = -1.0f;
        this.zzA = 0;
        this.zzB = false;
        this.zzC = false;
        this.zzD = false;
        this.zzG = false;
        this.zzR = false;
        this.zzS = 0;
    }

    protected final boolean zzaJ() throws zzib {
        boolean z = this.zzaK();
        if(z) {
            this.zzaC();
        }
        return z;
    }

    protected final boolean zzaK() {
        if(this.zzs == null) {
            return false;
        }
        int v = this.zzU;
        if(v != 3 && (!this.zzB || this.zzX) && (!this.zzC || !this.zzW)) {
            if(v == 2) {
                zzcw.zzf(zzei.zza >= 23);
                if(zzei.zza >= 23) {
                    try {
                        this.zzaS();
                    }
                    catch(zzib zzib0) {
                        zzdo.zzg("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", zzib0);
                        this.zzaG();
                        return true;
                    }
                }
            }
            this.zzah();
            return false;
        }
        this.zzaG();
        return true;
    }

    protected final boolean zzaL() {
        return this.zzO;
    }

    protected final boolean zzaM(zzab zzab0) {
        return this.zzah == null && this.zzas(zzab0);
    }

    protected boolean zzaN(zzsg zzsg0) {
        return true;
    }

    protected boolean zzaO(zzhh zzhh0) {
        return false;
    }

    protected static boolean zzaP(zzab zzab0) {
        return zzab0.zzK == 0;
    }

    private final void zzaQ() {
        this.zzK = -1;
        this.zzL = null;
    }

    private final void zzaR(zzsl zzsl0) {
        this.zzad = zzsl0;
        if(zzsl0.zzd != 0x8000000000000001L) {
            this.zzaf = true;
        }
    }

    @RequiresApi(23)
    private final void zzaS() throws zzib {
        zzrg zzrg0 = this.zzah;
        zzrg0.getClass();
        this.zzag = zzrg0;
        this.zzT = 0;
        this.zzU = 0;
    }

    @TargetApi(23)
    private final boolean zzaT() throws zzib {
        if(this.zzV) {
            this.zzT = 1;
            if(this.zzC) {
                this.zzU = 3;
                return false;
            }
            this.zzU = 2;
            return true;
        }
        this.zzaS();
        return true;
    }

    private final boolean zzaU() {
        return this.zzK >= 0;
    }

    // 去混淆评级： 低(20)
    private final boolean zzaV(long v, long v1) {
        return v1 < v && (this.zzn == null || !Objects.equals(this.zzn.zzo, "audio/opus") || !zzadi.zzf(v, v1));
    }

    private final boolean zzaW(int v) throws zzib {
        zzke zzke0 = this.zzk();
        this.zzf.zzb();
        int v1 = this.zzcU(zzke0, this.zzf, v | 4);
        if(v1 == -5) {
            this.zzac(zzke0);
            return true;
        }
        if(v1 == -4 && this.zzf.zzf()) {
            this.zzaa = true;
            this.zzai();
        }
        return false;
    }

    private final boolean zzaX(@Nullable zzab zzab0) throws zzib {
        if(zzei.zza >= 23 && this.zzs != null && this.zzU != 3 && this.zzcT() != 0) {
            float f = this.zzr;
            zzab0.getClass();
            float f1 = this.zzZ(f, zzab0, this.zzT());
            float f2 = this.zzw;
            if(f2 != f1) {
                if(f1 == -1.0f) {
                    this.zzae();
                    return false;
                }
                if(f2 != -1.0f || f1 > this.zze) {
                    Bundle bundle0 = new Bundle();
                    bundle0.putFloat("operating-rate", f1);
                    zzsd zzsd0 = this.zzs;
                    zzsd0.getClass();
                    zzsd0.zzq(bundle0);
                    this.zzw = f1;
                }
            }
        }
        return true;
    }

    protected abstract int zzaa(zzsp arg1, zzab arg2) throws zzsu;

    protected zzht zzab(zzsg zzsg0, zzab zzab0, zzab zzab1) {
        throw null;
    }

    @CallSuper
    @Nullable
    protected zzht zzac(zzke zzke0) throws zzib {
        boolean z = true;
        this.zzac = true;
        zzab zzab0 = zzke0.zza;
        zzab0.getClass();
        String s = zzab0.zzo;
        if(s == null) {
            throw this.zzcW(new IllegalArgumentException("Sample MIME type is null."), zzab0, false, 4005);
        }
        if(s.equals("video/av01") && !zzab0.zzr.isEmpty()) {
            zzz zzz0 = zzab0.zzb();
            zzz0.zzN(null);
            zzab0 = zzz0.zzag();
        }
        this.zzah = zzke0.zzb;
        this.zzm = zzab0;
        if(this.zzO) {
            this.zzQ = true;
            return null;
        }
        zzsd zzsd0 = this.zzs;
        if(zzsd0 == null) {
            this.zzx = null;
            this.zzaC();
            return null;
        }
        zzsg zzsg0 = this.zzz;
        zzsg0.getClass();
        zzab zzab1 = this.zzt;
        zzab1.getClass();
        zzrg zzrg0 = this.zzag;
        zzrg zzrg1 = this.zzah;
        if(zzrg0 == zzrg1) {
            boolean z1 = zzrg1 != zzrg0;
            zzcw.zzf(!z1 || zzei.zza >= 23);
            zzht zzht0 = this.zzab(zzsg0, zzab1, zzab0);
            int v = zzht0.zzd;
            if(v != 0) {
                switch(v) {
                    case 1: {
                        if(this.zzaX(zzab0)) {
                            this.zzt = zzab0;
                            if(z1) {
                                if(this.zzaT()) {
                                    return zzht0.zzd == 0 || this.zzs == zzsd0 && this.zzU != 3 ? zzht0 : new zzht(zzsg0.zza, zzab1, zzab0, 0, 0);
                                }
                                return zzht0.zzd == 0 || this.zzs == zzsd0 && this.zzU != 3 ? zzht0 : new zzht(zzsg0.zza, zzab1, zzab0, 0, 2);
                            }
                            if(!this.zzV) {
                                return zzht0.zzd == 0 || this.zzs == zzsd0 && this.zzU != 3 ? zzht0 : new zzht(zzsg0.zza, zzab1, zzab0, 0, 0);
                            }
                            this.zzT = 1;
                            if(this.zzC) {
                                this.zzU = 3;
                                return zzht0.zzd == 0 ? zzht0 : new zzht(zzsg0.zza, zzab1, zzab0, 0, 2);
                            }
                            this.zzU = 1;
                            return zzht0.zzd == 0 || this.zzs == zzsd0 ? zzht0 : new zzht(zzsg0.zza, zzab1, zzab0, 0, 0);
                        }
                        break;
                    }
                    case 2: {
                        if(this.zzaX(zzab0)) {
                            this.zzR = true;
                            this.zzS = 1;
                            if(this.zzA != 2 && (this.zzA != 1 || zzab0.zzv != zzab1.zzv || zzab0.zzw != zzab1.zzw)) {
                                z = false;
                            }
                            this.zzE = z;
                            this.zzt = zzab0;
                            if(z1 && !this.zzaT()) {
                                return zzht0.zzd == 0 || this.zzs == zzsd0 && this.zzU != 3 ? zzht0 : new zzht(zzsg0.zza, zzab1, zzab0, 0, 2);
                            }
                            return zzht0.zzd == 0 || this.zzs == zzsd0 && this.zzU != 3 ? zzht0 : new zzht(zzsg0.zza, zzab1, zzab0, 0, 0);
                        }
                        break;
                    }
                    default: {
                        if(this.zzaX(zzab0)) {
                            this.zzt = zzab0;
                            if(!z1 || this.zzaT()) {
                                return zzht0.zzd == 0 || this.zzs == zzsd0 && this.zzU != 3 ? zzht0 : new zzht(zzsg0.zza, zzab1, zzab0, 0, 0);
                            }
                            return zzht0.zzd == 0 || this.zzs == zzsd0 && this.zzU != 3 ? zzht0 : new zzht(zzsg0.zza, zzab1, zzab0, 0, 2);
                        }
                    }
                }
                return zzht0.zzd == 0 || this.zzs == zzsd0 && this.zzU != 3 ? zzht0 : new zzht(zzsg0.zza, zzab1, zzab0, 0, 16);
            }
            this.zzae();
            return zzht0.zzd == 0 || this.zzs == zzsd0 && this.zzU != 3 ? zzht0 : new zzht(zzsg0.zza, zzab1, zzab0, 0, 0);
        }
        this.zzae();
        return new zzht(zzsg0.zza, zzab1, zzab0, 0, 0x80);
    }

    private final void zzad() {
        this.zzQ = false;
        this.zzi.zzb();
        this.zzh.zzb();
        this.zzP = false;
        this.zzO = false;
        this.zzl.zzb();
    }

    private final void zzae() throws zzib {
        if(this.zzV) {
            this.zzT = 1;
            this.zzU = 3;
            return;
        }
        this.zzaG();
        this.zzaC();
    }

    protected abstract zzsa zzaf(zzsg arg1, zzab arg2, @Nullable MediaCrypto arg3, float arg4);

    protected abstract List zzag(zzsp arg1, zzab arg2, boolean arg3) throws zzsu;

    private final void zzah() {
        try {
            zzsd zzsd0 = this.zzs;
            zzcw.zzb(zzsd0);
            zzsd0.zzj();
        }
        finally {
            this.zzaH();
        }
    }

    @TargetApi(23)
    private final void zzai() throws zzib {
        switch(this.zzU) {
            case 1: {
                this.zzah();
                return;
            }
            case 2: {
                this.zzah();
                this.zzaS();
                return;
            }
            case 3: {
                this.zzaG();
                this.zzaC();
                return;
            }
            default: {
                this.zzab = true;
                this.zzaq();
            }
        }
    }

    protected void zzaj(zzhh zzhh0) throws zzib {
        throw null;
    }

    protected void zzak(Exception exception0) {
        throw null;
    }

    protected void zzal(String s, zzsa zzsa0, long v, long v1) {
        throw null;
    }

    protected void zzam(String s) {
        throw null;
    }

    protected void zzan(zzab zzab0, @Nullable MediaFormat mediaFormat0) throws zzib {
        throw null;
    }

    private final void zzao() {
        this.zzJ = -1;
        this.zzg.zzc = null;
    }

    protected void zzap() {
    }

    protected void zzaq() throws zzib {
    }

    protected abstract boolean zzar(long arg1, long arg2, @Nullable zzsd arg3, @Nullable ByteBuffer arg4, int arg5, int arg6, int arg7, long arg8, boolean arg9, boolean arg10, zzab arg11) throws zzib;

    protected boolean zzas(zzab zzab0) {
        return false;
    }

    protected final float zzat() {
        return this.zzq;
    }

    protected int zzau(zzhh zzhh0) {
        return 0;
    }

    protected final long zzav() {
        return this.zzad.zzd;
    }

    protected final long zzaw() {
        return this.zzad.zzc;
    }

    @Nullable
    protected final zzli zzay() {
        return this.zzo;
    }

    @Nullable
    protected final zzsd zzaz() {
        return this.zzs;
    }

    @Override  // com.google.android.gms.internal.ads.zzhr
    public final int zze() {
        return 8;
    }

    @Override  // com.google.android.gms.internal.ads.zzhr
    public void zzu(int v, @Nullable Object object0) throws zzib {
        if(v == 11) {
            this.zzo = (zzli)object0;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzhr
    protected void zzx() {
        this.zzm = null;
        this.zzaR(zzsl.zza);
        this.zzk.clear();
        this.zzaK();
    }

    @Override  // com.google.android.gms.internal.ads.zzhr
    protected void zzy(boolean z, boolean z1) throws zzib {
        this.zza = new zzhs();
    }

    @Override  // com.google.android.gms.internal.ads.zzhr
    protected void zzz(long v, boolean z) throws zzib {
        this.zzaa = false;
        this.zzab = false;
        if(this.zzO) {
            this.zzi.zzb();
            this.zzh.zzb();
            this.zzP = false;
            this.zzl.zzb();
        }
        else {
            this.zzaJ();
        }
        zzee zzee0 = this.zzad.zze;
        if(zzee0.zza() > 0) {
            this.zzac = true;
        }
        zzee0.zze();
        this.zzk.clear();
    }
}

