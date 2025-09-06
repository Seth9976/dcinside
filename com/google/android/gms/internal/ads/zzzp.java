package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import h4.m;
import java.nio.ByteBuffer;
import java.util.List;

public final class zzzp extends zzsn implements zzaak {
    private long zzA;
    private int zzB;
    private long zzC;
    private zzcd zzD;
    @Nullable
    private zzcd zzE;
    private int zzF;
    private int zzG;
    @Nullable
    private zzaai zzH;
    private long zzI;
    private long zzJ;
    private boolean zzK;
    private static final int[] zzb;
    private static boolean zzc;
    private static boolean zzd;
    private final Context zze;
    private final boolean zzf;
    private final zzabb zzg;
    private final boolean zzh;
    private final zzaal zzi;
    private final zzaaj zzj;
    private zzzo zzk;
    private boolean zzl;
    private boolean zzm;
    private zzabh zzn;
    private boolean zzo;
    private List zzp;
    @Nullable
    private Surface zzq;
    @Nullable
    private zzzs zzr;
    private zzdz zzs;
    private boolean zzt;
    private int zzu;
    private int zzv;
    private long zzw;
    private int zzx;
    private int zzy;
    private int zzz;

    static {
        zzzp.zzb = new int[]{0x780, 1600, 0x5A0, 0x500, 960, 854, 640, 540, 480};
    }

    public zzzp(Context context0, zzsb zzsb0, zzsp zzsp0, long v, boolean z, @Nullable Handler handler0, @Nullable zzabc zzabc0, int v1, float f) {
        super(2, zzsb0, zzsp0, false, 30.0f);
        Context context1 = context0.getApplicationContext();
        this.zze = context1;
        this.zzn = null;
        this.zzg = new zzabb(handler0, zzabc0);
        this.zzf = true;
        this.zzi = new zzaal(context1, this, 0L);
        this.zzj = new zzaaj();
        this.zzh = "NVIDIA".equals(zzei.zzc);
        this.zzs = zzdz.zza;
        this.zzu = 1;
        this.zzv = 0;
        this.zzD = zzcd.zza;
        this.zzG = 0;
        this.zzE = null;
        this.zzF = -1000;
        this.zzI = 0x8000000000000001L;
        this.zzJ = 0x8000000000000001L;
    }

    @Override  // com.google.android.gms.internal.ads.zzhr
    protected final void zzA() {
        zzabh zzabh0 = this.zzn;
        if(zzabh0 != null && this.zzf) {
            zzabh0.zzl();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzsn
    protected final void zzC() {
        try {
            super.zzC();
        }
        finally {
            this.zzo = false;
            this.zzI = 0x8000000000000001L;
            this.zzba();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzhr
    protected final void zzD() {
        this.zzx = 0;
        this.zzw = this.zzi().zzb();
        this.zzA = 0L;
        this.zzB = 0;
        zzabh zzabh0 = this.zzn;
        if(zzabh0 != null) {
            zzabh0.zzj();
            return;
        }
        this.zzi.zzg();
    }

    @Override  // com.google.android.gms.internal.ads.zzhr
    protected final void zzE() {
        if(this.zzx > 0) {
            long v = this.zzi().zzb();
            this.zzg.zzd(this.zzx, v - this.zzw);
            this.zzx = 0;
            this.zzw = v;
        }
        int v1 = this.zzB;
        if(v1 != 0) {
            this.zzg.zzr(this.zzA, v1);
            this.zzA = 0L;
            this.zzB = 0;
        }
        zzabh zzabh0 = this.zzn;
        if(zzabh0 != null) {
            zzabh0.zzk();
            return;
        }
        this.zzi.zzh();
    }

    @Override  // com.google.android.gms.internal.ads.zzsn
    protected final void zzF(zzab[] arr_zzab, long v, long v1, zzug zzug0) throws zzib {
        super.zzF(arr_zzab, v, v1, zzug0);
        if(this.zzI == 0x8000000000000001L) {
            this.zzI = v;
        }
        zzbq zzbq0 = this.zzh();
        if(zzbq0.zzo()) {
            this.zzJ = 0x8000000000000001L;
            return;
        }
        zzbo zzbo0 = new zzbo();
        this.zzJ = zzbq0.zzn(zzug0.zza, zzbo0).zzd;
    }

    @Override  // com.google.android.gms.internal.ads.zzsn
    public final void zzM(float f, float f1) throws zzib {
        super.zzM(f, f1);
        zzabh zzabh0 = this.zzn;
        if(zzabh0 != null) {
            zzabh0.zzq(f);
            return;
        }
        this.zzi.zzn(f);
    }

    @Override  // com.google.android.gms.internal.ads.zzlj, com.google.android.gms.internal.ads.zzlm
    public final String zzU() {
        return "MediaCodecVideoRenderer";
    }

    @Override  // com.google.android.gms.internal.ads.zzsn
    @CallSuper
    public final void zzV(long v, long v1) throws zzib {
        super.zzV(v, v1);
        zzabh zzabh0 = this.zzn;
        if(zzabh0 != null) {
            try {
                zzabh0.zzm(v, v1);
            }
            catch(zzabg zzabg0) {
                throw this.zzcW(zzabg0, zzabg0.zza, false, 7001);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzsn
    public final boolean zzW() {
        if(super.zzW()) {
            zzabh zzabh0 = this.zzn;
            if(zzabh0 == null) {
                return true;
            }
            zzabh0.zzv();
        }
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzsn
    public final boolean zzX() {
        boolean z = super.zzX();
        zzabh zzabh0 = this.zzn;
        if(zzabh0 != null) {
            return zzabh0.zzx(z);
        }
        return !z || this.zzaz() != null && this.zzq != null ? this.zzi.zzo(z) : true;
    }

    @Override  // com.google.android.gms.internal.ads.zzsn
    protected final float zzZ(float f, zzab zzab0, zzab[] arr_zzab) {
        float f1 = -1.0f;
        for(int v = 0; v < arr_zzab.length; ++v) {
            float f2 = arr_zzab[v].zzx;
            if(f2 != -1.0f) {
                f1 = Math.max(f1, f2);
            }
        }
        return f1 == -1.0f ? -1.0f : f1 * f;
    }

    @Override  // com.google.android.gms.internal.ads.zzsn
    protected final zzsf zzaA(Throwable throwable0, @Nullable zzsg zzsg0) {
        return new zzzk(throwable0, zzsg0, this.zzq);
    }

    @Override  // com.google.android.gms.internal.ads.zzsn
    @CallSuper
    protected final void zzaD(long v) {
        super.zzaD(v);
        --this.zzz;
    }

    @Override  // com.google.android.gms.internal.ads.zzsn
    @CallSuper
    protected final void zzaE(zzhh zzhh0) throws zzib {
        ++this.zzz;
    }

    @Override  // com.google.android.gms.internal.ads.zzsn
    @CallSuper
    protected final void zzaF(zzab zzab0) throws zzib {
        zzabh zzabh0 = this.zzn;
        if(zzabh0 != null && !zzabh0.zzw()) {
            try {
                zzabh0.zze(zzab0);
            }
            catch(zzabg zzabg0) {
                throw this.zzcW(zzabg0, zzab0, false, 7000);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzsn
    @CallSuper
    protected final void zzaH() {
        super.zzaH();
        this.zzz = 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzsn
    protected final boolean zzaN(zzsg zzsg0) {
        return this.zzbb(zzsg0);
    }

    // 去混淆评级： 低(40)
    @Override  // com.google.android.gms.internal.ads.zzsn
    protected final boolean zzaO(zzhh zzhh0) {
        return zzhh0.zzi() && !this.zzQ() && !zzhh0.zzh() && this.zzJ != 0x8000000000000001L && this.zzJ - (zzhh0.zze - this.zzav()) > 100000L && !zzhh0.zzl() && zzhh0.zze < this.zzf();
    }

    protected final void zzaQ(zzsd zzsd0, int v, long v1) {
        Trace.beginSection("skipVideoBuffer");
        zzsd0.zzo(v, false);
        Trace.endSection();
        ++this.zza.zzf;
    }

    protected final void zzaR(int v, int v1) {
        this.zza.zzh += v;
        int v2 = v + v1;
        this.zza.zzg += v2;
        this.zzx += v2;
        int v3 = this.zzy + v2;
        this.zzy = v3;
        this.zza.zzi = Math.max(v3, this.zza.zzi);
    }

    protected final void zzaS(long v) {
        this.zza.zzk += v;
        ++this.zza.zzl;
        this.zzA += v;
        ++this.zzB;
    }

    protected final boolean zzaT(long v, boolean z) throws zzib {
        int v1 = this.zzd(v);
        if(v1 == 0) {
            return false;
        }
        if(z) {
            this.zza.zzd += v1;
            this.zza.zzf += this.zzz;
        }
        else {
            ++this.zza.zzj;
            this.zzaR(v1, this.zzz);
        }
        this.zzaJ();
        zzabh zzabh0 = this.zzn;
        if(zzabh0 != null) {
            zzabh0.zzd(false);
        }
        return true;
    }

    // 去混淆评级： 中等(65)
    protected static final boolean zzaU(String s) {
        boolean z = false;
        if(s.startsWith("OMX.google")) {
            return false;
        }
        synchronized(zzzp.class) {
            if(!zzzp.zzc) {
                int v1 = zzei.zza;
                if(v1 <= 28) {
                    switch(zzei.zzb) {
                        case "aquaman": 
                        case "dangal": 
                        case "dangalFHD": 
                        case "dangalUHD": 
                        case "machuca": 
                        case "magnolia": 
                        case "once": 
                        case "oneday": {
                            z = true;
                            zzzp.zzd = z;
                            zzzp.zzc = true;
                            return zzzp.zzd;
                        }
                    }
                }
                else if(v1 > 27 || !"HWEML".equals(zzei.zzb)) {
                    String s1 = zzei.zzd;
                    switch(s1) {
                        case "AFTA": 
                        case "AFTEU011": 
                        case "AFTEU014": 
                        case "AFTEUFF014": 
                        case "AFTJMST12": 
                        case "AFTKMST12": 
                        case "AFTN": 
                        case "AFTR": 
                        case "AFTSO001": {
                            z = true;
                            zzzp.zzd = z;
                            zzzp.zzc = true;
                            return zzzp.zzd;
                        }
                        default: {
                            if(v1 <= 26) {
                                switch(zzei.zzb) {
                                    case "1601": 
                                    case "1713": 
                                    case "1714": 
                                    case "601LV": 
                                    case "602LV": 
                                    case "A10-70F": 
                                    case "A10-70L": 
                                    case "A1601": 
                                    case "A2016a40": 
                                    case "A7000-a": 
                                    case "A7000plus": 
                                    case "A7010a48": 
                                    case "A7020a48": 
                                    case "ASUS_X00AD_2": 
                                    case "AquaPowerM": 
                                    case "Aura_Note_2": 
                                    case "BLACK-1X": 
                                    case "BRAVIA_ATV2": 
                                    case "BRAVIA_ATV3_4K": 
                                    case "C1": 
                                    case "CP8676_I02": 
                                    case "CPH1609": 
                                    case "CPH1715": 
                                    case "CPY83_I00": 
                                    case "ComioS1": 
                                    case "DM-01K": 
                                    case "E5643": 
                                    case "ELUGA_A3_Pro": 
                                    case "ELUGA_Note": 
                                    case "ELUGA_Prim": 
                                    case "ELUGA_Ray_X": 
                                    case "EverStar_S": 
                                    case "F01H": 
                                    case "F01J": 
                                    case "F02H": 
                                    case "F03H": 
                                    case "F04H": 
                                    case "F04J": 
                                    case "F3111": 
                                    case "F3113": 
                                    case "F3116": 
                                    case "F3211": 
                                    case "F3213": 
                                    case "F3215": 
                                    case "F3311": 
                                    case "GIONEE_GBL7360": 
                                    case "GIONEE_SWW1609": 
                                    case "GIONEE_SWW1627": 
                                    case "GIONEE_SWW1631": 
                                    case "GIONEE_WBL5708": 
                                    case "GIONEE_WBL7365": 
                                    case "GIONEE_WBL7519": 
                                    case "GiONEE_CBL7513": 
                                    case "GiONEE_GBL7319": 
                                    case "HWBLN-H": 
                                    case "HWCAM-H": 
                                    case "HWVNS-H": 
                                    case "HWWAS-H": 
                                    case "Infinix-X572": 
                                    case "JGZ": 
                                    case "K50a40": 
                                    case "LS-5017": 
                                    case "M04": 
                                    case "M5c": 
                                    case "MEIZU_M5": 
                                    case "MX6": 
                                    case "NX541J": 
                                    case "NX573J": 
                                    case "OnePlus5T": 
                                    case "P681": 
                                    case "P85": 
                                    case "PB2-670M": 
                                    case "PGN528": 
                                    case "PGN610": 
                                    case "PGN611": 
                                    case "PLE": 
                                    case "PRO7S": 
                                    case "Phantom6": 
                                    case "Pixi4-7_3G": 
                                    case "Pixi5-10_4G": 
                                    case "Q350": 
                                    case "Q4260": 
                                    case "Q427": 
                                    case "Q4310": 
                                    case "Q5": 
                                    case "QM16XE_U": 
                                    case "QX1": 
                                    case "RAIJIN": 
                                    case "SVP-DTV15": 
                                    case "Slate_Pro": 
                                    case "TB3-730F": 
                                    case "TB3-730X": 
                                    case "TB3-850F": 
                                    case "TB3-850M": 
                                    case "V1": 
                                    case "V23GB": 
                                    case "V5": 
                                    case "X3_HK": 
                                    case "XE2X": 
                                    case "XT1663": 
                                    case "Z12_PRO": 
                                    case "Z80": 
                                    case "b5": 
                                    case "cv1": 
                                    case "cv3": 
                                    case "deb": 
                                    case "flo": 
                                    case "fugu": 
                                    case "griffin": 
                                    case "htc_e56ml_dtul": 
                                    case "hwALE-H": 
                                    case "i9031": 
                                    case "iball8735_9806": 
                                    case "iris60": 
                                    case "itel_S41": 
                                    case "j2xlteins": 
                                    case "kate": 
                                    case "l5460": 
                                    case "le_x6": 
                                    case "manning": 
                                    case "marino_f": 
                                    case "mh": 
                                    case "mido": 
                                    case "namath": 
                                    case "nicklaus_f": 
                                    case "p212": 
                                    case "pacificrim": 
                                    case "panell_d": 
                                    case "panell_dl": 
                                    case "panell_ds": 
                                    case "panell_dt": 
                                    case "s905x018": 
                                    case "santoni": 
                                    case "taido_row": 
                                    case "tcl_eu": 
                                    case "vernee_M5": 
                                    case "watson": 
                                    case "whyred": 
                                    case "woods_f": 
                                    case "woods_fn": {
                                        z = true;
                                        zzzp.zzd = z;
                                        zzzp.zzc = true;
                                        return zzzp.zzd;
                                    }
                                    default: {
                                        if(s1.hashCode() == 0xDC901DE3 && s1.equals("JSN-L21")) {
                                            z = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                else {
                    z = true;
                }
                zzzp.zzd = z;
                zzzp.zzc = true;
            }
            return zzzp.zzd;
        }
    }

    protected static final boolean zzaV(zzsg zzsg0) {
        return zzei.zza >= 35 && zzsg0.zzh;
    }

    @Nullable
    private final Surface zzaW(zzsg zzsg0) {
        zzabh zzabh0 = this.zzn;
        if(zzabh0 != null) {
            return zzabh0.zza();
        }
        Surface surface0 = this.zzq;
        if(surface0 != null) {
            return surface0;
        }
        if(zzzp.zzaV(zzsg0)) {
            return null;
        }
        zzcw.zzf(this.zzbc(zzsg0));
        if(this.zzr != null && this.zzr.zza != zzsg0.zzf) {
            this.zzba();
        }
        if(this.zzr == null) {
            this.zzr = zzzs.zza(this.zze, zzsg0.zzf);
        }
        return this.zzr;
    }

    private static List zzaX(Context context0, zzsp zzsp0, zzab zzab0, boolean z, boolean z1) throws zzsu {
        String s = zzab0.zzo;
        if(s == null) {
            return zzfxn.zzn();
        }
        if(zzei.zza >= 26 && "video/dolby-vision".equals(s) && !zzzn.zza(context0)) {
            List list0 = zzta.zzc(zzsp0, zzab0, z, z1);
            return list0.isEmpty() ? zzta.zze(zzsp0, zzab0, z, z1) : list0;
        }
        return zzta.zze(zzsp0, zzab0, z, z1);
    }

    private final void zzaY() {
        zzcd zzcd0 = this.zzE;
        if(zzcd0 != null) {
            this.zzg.zzt(zzcd0);
        }
    }

    @m({"displaySurface"})
    private final void zzaZ() {
        this.zzg.zzq(this.zzq);
        this.zzt = true;
    }

    @Override  // com.google.android.gms.internal.ads.zzsn
    protected final int zzaa(zzsp zzsp0, zzab zzab0) throws zzsu {
        int v = 0x80;
        if(zzbb.zzi(zzab0.zzo)) {
            Context context0 = this.zze;
            int v1 = 0;
            boolean z = zzab0.zzs != null;
            List list0 = zzzp.zzaX(context0, zzsp0, zzab0, z, false);
            if(z && list0.isEmpty()) {
                list0 = zzzp.zzaX(context0, zzsp0, zzab0, false, false);
            }
            if(list0.isEmpty()) {
                return 0x81;
            }
            if(!zzsn.zzaP(zzab0)) {
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
            int v4 = zzsg0.zzf(zzab0) ? 16 : 8;
            int v5 = zzsg0.zzg ? 0x40 : 0;
            if(1 != v2) {
                v = 0;
            }
            if(zzei.zza >= 26 && "video/dolby-vision".equals(zzab0.zzo) && !zzzn.zza(context0)) {
                v = 0x100;
            }
            if(z1) {
                List list1 = zzzp.zzaX(context0, zzsp0, zzab0, z, true);
                if(!list1.isEmpty()) {
                    zzsg zzsg2 = (zzsg)zzta.zzf(list1, zzab0).get(0);
                    if(zzsg2.zze(zzab0) && zzsg2.zzf(zzab0)) {
                        v1 = 0x20;
                    }
                }
            }
            return v | ((z1 ? 4 : 3) | v4 | v1 | v5);
        }
        return 0x80;
    }

    @Override  // com.google.android.gms.internal.ads.zzsn
    protected final zzht zzab(zzsg zzsg0, zzab zzab0, zzab zzab1) {
        zzht zzht0 = zzsg0.zzb(zzab0, zzab1);
        int v = zzht0.zze;
        zzzo zzzo0 = this.zzk;
        zzzo0.getClass();
        if(zzab1.zzv > zzzo0.zza || zzab1.zzw > zzzo0.zzb) {
            v |= 0x100;
        }
        if(zzzp.zzae(zzsg0, zzab1) > zzzo0.zzc) {
            v |= 0x40;
        }
        return v == 0 ? new zzht(zzsg0.zza, zzab0, zzab1, zzht0.zzd, 0) : new zzht(zzsg0.zza, zzab0, zzab1, 0, v);
    }

    @Override  // com.google.android.gms.internal.ads.zzsn
    @Nullable
    protected final zzht zzac(zzke zzke0) throws zzib {
        zzht zzht0 = super.zzac(zzke0);
        zzab zzab0 = zzke0.zza;
        zzab0.getClass();
        this.zzg.zzf(zzab0, zzht0);
        return zzht0;
    }

    public static int zzad(zzsg zzsg0, zzab zzab0) {
        int v = zzab0.zzv;
        int v1 = zzab0.zzw;
        if(v != -1 && v1 != -1) {
            String s = zzab0.zzo;
            s.getClass();
            if("video/dolby-vision".equals(s)) {
                Pair pair0 = zzcy.zza(zzab0);
                if(pair0 == null) {
                    s = "video/hevc";
                }
                else {
                    switch(((int)(((Integer)pair0.first)))) {
                        case 1: 
                        case 2: 
                        case 0x200: {
                            s = "video/avc";
                            break;
                        }
                        default: {
                            s = "video/hevc";
                        }
                    }
                }
            }
            switch(s) {
                case "video/3gpp": {
                    return v * v1 * 3 / 4;
                }
                case "video/av01": {
                    return v * v1 * 3 / 4;
                }
                case "video/avc": {
                    return "BRAVIA 4K 2015".equals(zzei.zzd) || "Amazon".equals(zzei.zzc) && ("KFSOWI".equals(zzei.zzd) || "AFTS".equals(zzei.zzd) && zzsg0.zzf) ? -1 : (v + 15) / 16 * ((v1 + 15) / 16) * 0x300 / 4;
                }
                case "video/hevc": {
                    return Math.max(0x200000, v * v1 * 3 / 4);
                }
                case "video/mp4v-es": {
                    return v * v1 * 3 / 4;
                }
                case "video/x-vnd.on2.vp8": {
                    return v * v1 * 3 / 4;
                }
                case "video/x-vnd.on2.vp9": {
                    return v * v1 * 3 / 8;
                }
                default: {
                    return -1;
                }
            }
        }
        return -1;
    }

    protected static int zzae(zzsg zzsg0, zzab zzab0) {
        if(zzab0.zzp != -1) {
            int v = zzab0.zzr.size();
            int v2 = 0;
            for(int v1 = 0; v1 < v; ++v1) {
                v2 += ((byte[])zzab0.zzr.get(v1)).length;
            }
            return zzab0.zzp + v2;
        }
        return zzzp.zzad(zzsg0, zzab0);
    }

    @Override  // com.google.android.gms.internal.ads.zzsn
    protected final zzsa zzaf(zzsg zzsg0, zzab zzab0, @Nullable MediaCrypto mediaCrypto0, float f) {
        int v15;
        int v14;
        Point point0;
        zzab[] arr_zzab = this.zzT();
        int v = zzzp.zzae(zzsg0, zzab0);
        int v1 = zzab0.zzv;
        int v2 = zzab0.zzw;
        if(arr_zzab.length != 1) {
            int v5 = 0;
            for(int v4 = 0; v4 < arr_zzab.length; ++v4) {
                zzab zzab1 = arr_zzab[v4];
                if(zzab0.zzC != null && zzab1.zzC == null) {
                    zzz zzz0 = zzab1.zzb();
                    zzz0.zzB(zzab0.zzC);
                    zzab1 = zzz0.zzag();
                }
                if(zzsg0.zzb(zzab0, zzab1).zzd != 0) {
                    v5 |= (zzab1.zzv != -1 && zzab1.zzw != -1 ? 0 : 1);
                    v1 = Math.max(v1, zzab1.zzv);
                    v2 = Math.max(v2, zzab1.zzw);
                    v = Math.max(v, zzzp.zzae(zzsg0, zzab1));
                }
            }
            if(v5 != 0) {
                zzdo.zzf("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + v1 + "x" + v2);
                int v6 = zzab0.zzw;
                int v7 = zzab0.zzv;
                int v8 = v6 <= v7 ? 0 : 1;
                int v9 = v8 == 0 ? v7 : v6;
                if(1 == v8) {
                    v6 = v7;
                }
                int[] arr_v = zzzp.zzb;
                int v10 = 0;
                while(true) {
                    if(v10 < 9) {
                        int v11 = arr_v[v10];
                        if(v11 > v9) {
                            int v12 = (int)(((float)v11) * (((float)v6) / ((float)v9)));
                            if(v12 > v6) {
                                int v13 = 1 == v8 ? v12 : v11;
                                if(1 != v8) {
                                    v11 = v12;
                                }
                                point0 = zzsg0.zza(v13, v11);
                                float f1 = zzab0.zzx;
                                if(point0 == null) {
                                    v15 = v6;
                                    v14 = v8;
                                }
                                else {
                                    v14 = v8;
                                    v15 = v6;
                                    if(zzsg0.zzg(point0.x, point0.y, ((double)f1))) {
                                        break;
                                    }
                                }
                                ++v10;
                                v8 = v14;
                                v6 = v15;
                                continue;
                            }
                        }
                    }
                    point0 = null;
                    break;
                }
                if(point0 != null) {
                    v1 = Math.max(v1, point0.x);
                    v2 = Math.max(v2, point0.y);
                    zzz zzz1 = zzab0.zzb();
                    zzz1.zzaf(v1);
                    zzz1.zzK(v2);
                    v = Math.max(v, zzzp.zzad(zzsg0, zzz1.zzag()));
                    zzdo.zzf("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + v1 + "x" + v2);
                }
            }
        }
        else if(v != -1) {
            int v3 = zzzp.zzad(zzsg0, zzab0);
            if(v3 != -1) {
                v = Math.min(((int)(((float)v) * 1.5f)), v3);
            }
        }
        zzzo zzzo0 = new zzzo(v1, v2, v);
        this.zzk = zzzo0;
        boolean z = this.zzh;
        MediaFormat mediaFormat0 = new MediaFormat();
        mediaFormat0.setString("mime", zzsg0.zzc);
        mediaFormat0.setInteger("width", zzab0.zzv);
        mediaFormat0.setInteger("height", zzab0.zzw);
        zzdr.zzb(mediaFormat0, zzab0.zzr);
        float f2 = zzab0.zzx;
        if(f2 != -1.0f) {
            mediaFormat0.setFloat("frame-rate", f2);
        }
        zzdr.zza(mediaFormat0, "rotation-degrees", zzab0.zzy);
        zzk zzk0 = zzab0.zzC;
        if(zzk0 != null) {
            zzdr.zza(mediaFormat0, "color-transfer", zzk0.zzd);
            zzdr.zza(mediaFormat0, "color-standard", zzk0.zzb);
            zzdr.zza(mediaFormat0, "color-range", zzk0.zzc);
            byte[] arr_b = zzk0.zze;
            if(arr_b != null) {
                mediaFormat0.setByteBuffer("hdr-static-info", ByteBuffer.wrap(arr_b));
            }
        }
        if("video/dolby-vision".equals(zzab0.zzo)) {
            Pair pair0 = zzcy.zza(zzab0);
            if(pair0 != null) {
                zzdr.zza(mediaFormat0, "profile", ((int)(((Integer)pair0.first))));
            }
        }
        mediaFormat0.setInteger("max-width", zzzo0.zza);
        mediaFormat0.setInteger("max-height", zzzo0.zzb);
        zzdr.zza(mediaFormat0, "max-input-size", zzzo0.zzc);
        int v16 = zzei.zza;
        if(v16 >= 23) {
            mediaFormat0.setInteger("priority", 0);
            if(f != -1.0f) {
                mediaFormat0.setFloat("operating-rate", f);
            }
        }
        if(z) {
            mediaFormat0.setInteger("no-post-process", 1);
            mediaFormat0.setInteger("auto-frc", 0);
        }
        if(v16 >= 35) {
            mediaFormat0.setInteger("importance", Math.max(0, -this.zzF));
        }
        Surface surface0 = this.zzaW(zzsg0);
        if(this.zzn != null && !zzei.zzK(this.zze)) {
            mediaFormat0.setInteger("allow-frame-drop", 0);
        }
        return zzsa.zzb(zzsg0, mediaFormat0, zzab0, surface0, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzsn
    protected final List zzag(zzsp zzsp0, zzab zzab0, boolean z) throws zzsu {
        return zzta.zzf(zzzp.zzaX(this.zze, zzsp0, zzab0, false, false), zzab0);
    }

    @Override  // com.google.android.gms.internal.ads.zzsn
    @TargetApi(29)
    protected final void zzaj(zzhh zzhh0) throws zzib {
        if(this.zzm) {
            ByteBuffer byteBuffer0 = zzhh0.zzf;
            byteBuffer0.getClass();
            if(byteBuffer0.remaining() >= 7) {
                int v = byteBuffer0.get();
                int v1 = byteBuffer0.getShort();
                int v2 = byteBuffer0.getShort();
                int v3 = byteBuffer0.get();
                int v4 = byteBuffer0.get();
                byteBuffer0.position(0);
                if(v == -75 && v1 == 60 && v2 == 1 && v3 == 4 && (v4 == 0 || v4 == 1)) {
                    byte[] arr_b = new byte[byteBuffer0.remaining()];
                    byteBuffer0.get(arr_b);
                    byteBuffer0.position(0);
                    zzsd zzsd0 = this.zzaz();
                    zzsd0.getClass();
                    Bundle bundle0 = new Bundle();
                    bundle0.putByteArray("hdr10-plus-info", arr_b);
                    zzsd0.zzq(bundle0);
                }
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzsn
    protected final void zzak(Exception exception0) {
        zzdo.zzd("MediaCodecVideoRenderer", "Video codec error", exception0);
        this.zzg.zzs(exception0);
    }

    @Override  // com.google.android.gms.internal.ads.zzsn
    protected final void zzal(String s, zzsa zzsa0, long v, long v1) {
        this.zzg.zza(s, v, v1);
        this.zzl = zzzp.zzaU(s);
        zzsg zzsg0 = this.zzaB();
        zzsg0.getClass();
        boolean z = false;
        if(zzei.zza >= 29 && "video/x-vnd.on2.vp9".equals(zzsg0.zzb)) {
            MediaCodecInfo.CodecProfileLevel[] arr_mediaCodecInfo$CodecProfileLevel = zzsg0.zzh();
            for(int v2 = 0; v2 < arr_mediaCodecInfo$CodecProfileLevel.length; ++v2) {
                if(arr_mediaCodecInfo$CodecProfileLevel[v2].profile == 0x4000) {
                    z = true;
                    break;
                }
            }
        }
        this.zzm = z;
    }

    @Override  // com.google.android.gms.internal.ads.zzsn
    protected final void zzam(String s) {
        this.zzg.zzb(s);
    }

    @Override  // com.google.android.gms.internal.ads.zzsn
    protected final void zzan(zzab zzab0, @Nullable MediaFormat mediaFormat0) {
        zzsd zzsd0 = this.zzaz();
        if(zzsd0 != null) {
            zzsd0.zzr(this.zzu);
        }
        mediaFormat0.getClass();
        boolean z = mediaFormat0.containsKey("crop-right") && mediaFormat0.containsKey("crop-left") && mediaFormat0.containsKey("crop-bottom") && mediaFormat0.containsKey("crop-top");
        int v = z ? mediaFormat0.getInteger("crop-right") - mediaFormat0.getInteger("crop-left") + 1 : mediaFormat0.getInteger("width");
        int v1 = z ? mediaFormat0.getInteger("crop-bottom") - mediaFormat0.getInteger("crop-top") + 1 : mediaFormat0.getInteger("height");
        float f = zzei.zza < 30 || !mediaFormat0.containsKey("sar-width") || !mediaFormat0.containsKey("sar-height") ? zzab0.zzz : ((float)mediaFormat0.getInteger("sar-width")) / ((float)mediaFormat0.getInteger("sar-height"));
        if(zzab0.zzy == 90 || zzab0.zzy == 270) {
            f = 1.0f / f;
            int v2 = v1;
            v1 = v;
            v = v2;
        }
        this.zzD = new zzcd(v, v1, f);
        zzabh zzabh0 = this.zzn;
        if(zzabh0 == null || !this.zzK) {
            this.zzi.zzl(zzab0.zzx);
        }
        else {
            zzz zzz0 = zzab0.zzb();
            zzz0.zzaf(v);
            zzz0.zzK(v1);
            zzz0.zzW(f);
            zzabh0.zzg(1, zzz0.zzag());
        }
        this.zzK = false;
    }

    protected final void zzao(zzsd zzsd0, int v, long v1, long v2) {
        Trace.beginSection("releaseOutputBuffer");
        zzsd0.zzn(v, v2);
        Trace.endSection();
        ++this.zza.zze;
        this.zzy = 0;
        if(this.zzn == null) {
            zzcd zzcd0 = this.zzD;
            if(!zzcd0.equals(zzcd.zza) && !zzcd0.equals(this.zzE)) {
                this.zzE = zzcd0;
                this.zzg.zzt(zzcd0);
            }
            if(this.zzi.zzp() && this.zzq != null) {
                this.zzaZ();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzsn
    protected final void zzap() {
        zzabh zzabh0 = this.zzn;
        if(zzabh0 == null) {
            this.zzi.zzf();
        }
        else {
            zzabh0.zzr(this.zzaw(), this.zzav(), -this.zzI, this.zzf());
        }
        this.zzK = true;
    }

    @Override  // com.google.android.gms.internal.ads.zzsn
    protected final boolean zzar(long v, long v1, @Nullable zzsd zzsd0, @Nullable ByteBuffer byteBuffer0, int v2, int v3, int v4, long v5, boolean z, boolean z1, zzab zzab0) throws zzib {
        zzsd0.getClass();
        long v6 = v5 - this.zzav();
        zzabh zzabh0 = this.zzn;
        if(zzabh0 != null) {
            try {
                return zzabh0.zzu(v5 - this.zzI, z1, v, v1, new zzzm(this, zzsd0, v2, v6));
            }
            catch(zzabg zzabg0) {
                throw this.zzcW(zzabg0, zzabg0.zza, false, 7001);
            }
        }
        int v7 = this.zzi.zza(v5, v, v1, this.zzaw(), z1, this.zzj);
        if(v7 == 4) {
            return false;
        }
        if(z && !z1) {
            this.zzaQ(zzsd0, v2, v6);
            return true;
        }
        if(this.zzq == null) {
            if(this.zzj.zzc() < 30000L) {
                this.zzaQ(zzsd0, v2, v6);
                this.zzaS(this.zzj.zzc());
                return true;
            }
            return false;
        }
        switch(v7) {
            case 0: {
                this.zzao(zzsd0, v2, v6, this.zzi().zzc());
                this.zzaS(this.zzj.zzc());
                return true;
            }
            case 1: {
                long v8 = this.zzj.zzd();
                long v9 = this.zzj.zzc();
                if(v8 == this.zzC) {
                    this.zzaQ(zzsd0, v2, v6);
                }
                else {
                    this.zzao(zzsd0, v2, v6, v8);
                }
                this.zzaS(v9);
                this.zzC = v8;
                return true;
            }
            case 2: {
                Trace.beginSection("dropVideoBuffer");
                zzsd0.zzo(v2, false);
                Trace.endSection();
                this.zzaR(0, 1);
                this.zzaS(this.zzj.zzc());
                return true;
            }
            case 3: {
                this.zzaQ(zzsd0, v2, v6);
                this.zzaS(this.zzj.zzc());
                return true;
            }
            case 5: {
                return false;
            }
            default: {
                throw new IllegalStateException(String.valueOf(v7));
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzsn
    protected final int zzau(zzhh zzhh0) {
        return 0;
    }

    private final void zzba() {
        zzzs zzzs0 = this.zzr;
        if(zzzs0 != null) {
            zzzs0.release();
            this.zzr = null;
        }
    }

    // 去混淆评级： 低(40)
    private final boolean zzbb(zzsg zzsg0) {
        return this.zzq != null && this.zzq.isValid() || zzzp.zzaV(zzsg0) || this.zzbc(zzsg0);
    }

    // 去混淆评级： 低(30)
    private final boolean zzbc(zzsg zzsg0) {
        return zzei.zza >= 23 && !zzzp.zzaU(zzsg0.zza) && (!zzsg0.zzf || zzzs.zzb(this.zze));
    }

    @Override  // com.google.android.gms.internal.ads.zzhr
    public final void zzt() {
        zzabh zzabh0 = this.zzn;
        if(zzabh0 != null) {
            zzabh0.zzc();
            return;
        }
        this.zzi.zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zzsn
    public final void zzu(int v, @Nullable Object object0) throws zzib {
        switch(v) {
            case 1: {
                Surface surface1 = object0 instanceof Surface ? ((Surface)object0) : null;
                if(this.zzq != surface1) {
                    this.zzq = surface1;
                    if(this.zzn == null) {
                        this.zzi.zzm(surface1);
                    }
                    this.zzt = false;
                    int v4 = this.zzcT();
                    zzsd zzsd2 = this.zzaz();
                    if(zzsd2 != null && this.zzn == null) {
                        zzsg zzsg0 = this.zzaB();
                        zzsg0.getClass();
                        boolean z = this.zzbb(zzsg0);
                        int v5 = zzei.zza;
                        if(v5 < 23 || !z || this.zzl) {
                            this.zzaG();
                            this.zzaC();
                        }
                        else {
                            Surface surface2 = this.zzaW(zzsg0);
                            if(v5 < 23 || surface2 == null) {
                                if(v5 < 35) {
                                    throw new IllegalStateException();
                                }
                                zzsd2.zzi();
                            }
                            else {
                                zzsd2.zzp(surface2);
                            }
                        }
                    }
                    if(surface1 == null) {
                        this.zzE = null;
                        zzabh zzabh5 = this.zzn;
                        if(zzabh5 != null) {
                            zzabh5.zzb();
                            return;
                        }
                    }
                    else {
                        this.zzaY();
                        if(v4 == 2) {
                            zzabh zzabh4 = this.zzn;
                            if(zzabh4 != null) {
                                zzabh4.zzf(true);
                                return;
                            }
                            this.zzi.zzc(true);
                            return;
                        }
                    }
                }
                else if(surface1 != null) {
                    this.zzaY();
                    Surface surface3 = this.zzq;
                    if(surface3 != null && this.zzt) {
                        this.zzg.zzq(surface3);
                    }
                }
                break;
            }
            case 4: {
                object0.getClass();
                int v2 = (int)(((Integer)object0));
                this.zzu = v2;
                zzsd zzsd0 = this.zzaz();
                if(zzsd0 != null) {
                    zzsd0.zzr(v2);
                    return;
                }
                break;
            }
            case 5: {
                object0.getClass();
                int v1 = (int)(((Integer)object0));
                this.zzv = v1;
                zzabh zzabh0 = this.zzn;
                if(zzabh0 != null) {
                    zzabh0.zzn(v1);
                    return;
                }
                this.zzi.zzj(v1);
                return;
            }
            case 7: {
                object0.getClass();
                this.zzH = (zzaai)object0;
                zzabh zzabh3 = this.zzn;
                if(zzabh3 != null) {
                    zzabh3.zzt(((zzaai)object0));
                    return;
                }
                break;
            }
            case 10: {
                object0.getClass();
                int v3 = (int)(((Integer)object0));
                if(this.zzG != v3) {
                    this.zzG = v3;
                    return;
                }
                break;
            }
            case 13: {
                object0.getClass();
                this.zzp = (List)object0;
                zzabh zzabh2 = this.zzn;
                if(zzabh2 != null) {
                    zzabh2.zzs(((List)object0));
                    return;
                }
                break;
            }
            case 14: {
                object0.getClass();
                if(((zzdz)object0).zzb() != 0 && ((zzdz)object0).zza() != 0) {
                    this.zzs = (zzdz)object0;
                    zzabh zzabh1 = this.zzn;
                    if(zzabh1 != null) {
                        Surface surface0 = this.zzq;
                        zzcw.zzb(surface0);
                        zzabh1.zzp(surface0, ((zzdz)object0));
                        return;
                    }
                }
                break;
            }
            case 16: {
                object0.getClass();
                this.zzF = (int)(((Integer)object0));
                zzsd zzsd1 = this.zzaz();
                if(zzsd1 != null && zzei.zza >= 35) {
                    Bundle bundle0 = new Bundle();
                    bundle0.putInt("importance", Math.max(0, -this.zzF));
                    zzsd1.zzq(bundle0);
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
        this.zzE = null;
        this.zzJ = 0x8000000000000001L;
        zzabh zzabh0 = this.zzn;
        if(zzabh0 == null) {
            this.zzi.zzd();
        }
        else {
            zzabh0.zzh();
        }
        try {
            this.zzt = false;
            super.zzx();
        }
        finally {
            this.zzg.zzc(this.zza);
            this.zzg.zzt(zzcd.zza);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzsn
    protected final void zzy(boolean z, boolean z1) throws zzib {
        super.zzy(z, z1);
        this.zzn();
        this.zzg.zze(this.zza);
        if(!this.zzo) {
            if(this.zzp != null && this.zzn == null) {
                zzzw zzzw0 = new zzzw(this.zze, this.zzi);
                zzzw0.zzd(this.zzi());
                this.zzn = zzzw0.zze().zzh();
            }
            this.zzo = true;
        }
        zzabh zzabh0 = this.zzn;
        if(zzabh0 != null) {
            zzabh0.zzo(new zzzl(this), zzgcz.zzc());
            zzaai zzaai0 = this.zzH;
            if(zzaai0 != null) {
                this.zzn.zzt(zzaai0);
            }
            if(this.zzq != null && !this.zzs.equals(zzdz.zza)) {
                this.zzn.zzp(this.zzq, this.zzs);
            }
            this.zzn.zzn(this.zzv);
            this.zzn.zzq(this.zzat());
            List list0 = this.zzp;
            if(list0 != null) {
                this.zzn.zzs(list0);
            }
            this.zzn.zzi(z1);
            return;
        }
        zzcx zzcx0 = this.zzi();
        this.zzi.zzk(zzcx0);
        this.zzi.zze(z1);
    }

    @Override  // com.google.android.gms.internal.ads.zzsn
    protected final void zzz(long v, boolean z) throws zzib {
        zzabh zzabh0 = this.zzn;
        if(zzabh0 != null) {
            zzabh0.zzd(true);
            this.zzn.zzr(this.zzaw(), this.zzav(), -this.zzI, this.zzf());
            this.zzK = true;
        }
        super.zzz(v, z);
        if(this.zzn == null) {
            this.zzi.zzi();
        }
        if(z) {
            zzabh zzabh1 = this.zzn;
            if(zzabh1 == null) {
                this.zzi.zzc(false);
            }
            else {
                zzabh1.zzf(false);
            }
        }
        this.zzy = 0;
    }
}

