package com.google.android.gms.internal.ads;

import android.util.Pair;
import h4.d;
import h4.m;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class zzahk {
    public int zzA;
    public int zzB;
    public int zzC;
    public float zzD;
    public float zzE;
    public float zzF;
    public float zzG;
    public float zzH;
    public float zzI;
    public float zzJ;
    public float zzK;
    public float zzL;
    public float zzM;
    public byte[] zzN;
    public int zzO;
    public int zzP;
    public int zzQ;
    public long zzR;
    public long zzS;
    public zzadu zzT;
    public boolean zzU;
    public boolean zzV;
    public zzadt zzW;
    public int zzX;
    private int zzY;
    private String zzZ;
    public String zza;
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public boolean zzg;
    public byte[] zzh;
    public zzads zzi;
    public byte[] zzj;
    public zzu zzk;
    public int zzl;
    public int zzm;
    public int zzn;
    public int zzo;
    public int zzp;
    public int zzq;
    public int zzr;
    public float zzs;
    public float zzt;
    public float zzu;
    public byte[] zzv;
    public int zzw;
    public boolean zzx;
    public int zzy;
    public int zzz;

    protected zzahk() {
        this.zzl = -1;
        this.zzm = -1;
        this.zzn = -1;
        this.zzo = -1;
        this.zzp = -1;
        this.zzq = 0;
        this.zzr = -1;
        this.zzs = 0.0f;
        this.zzt = 0.0f;
        this.zzu = 0.0f;
        this.zzv = null;
        this.zzw = -1;
        this.zzx = false;
        this.zzy = -1;
        this.zzz = -1;
        this.zzA = -1;
        this.zzB = 1000;
        this.zzC = 200;
        this.zzD = -1.0f;
        this.zzE = -1.0f;
        this.zzF = -1.0f;
        this.zzG = -1.0f;
        this.zzH = -1.0f;
        this.zzI = -1.0f;
        this.zzJ = -1.0f;
        this.zzK = -1.0f;
        this.zzL = -1.0f;
        this.zzM = -1.0f;
        this.zzO = 1;
        this.zzP = -1;
        this.zzQ = 8000;
        this.zzR = 0L;
        this.zzS = 0L;
        this.zzV = true;
        this.zzZ = "eng";
    }

    static void zzd(zzahk zzahk0) {
        zzahk0.zzW.getClass();
    }

    @d({"this.output"})
    @m({"codecId"})
    public final void zze(zzacq zzacq0, int v) throws zzbc {
        float f;
        int v9;
        int v7;
        int v4;
        String s2;
        List list0;
        int v3;
        String s = this.zzb;
        int v1 = 4;
        int v2 = 0;
        switch(s) {
            case "A_AAC": {
                v3 = 13;
                break;
            }
            case "A_AC3": {
                v3 = 16;
                break;
            }
            case "A_DTS": {
                v3 = 19;
                break;
            }
            case "A_DTS/EXPRESS": {
                v3 = 20;
                break;
            }
            case "A_DTS/LOSSLESS": {
                v3 = 21;
                break;
            }
            case "A_EAC3": {
                v3 = 17;
                break;
            }
            case "A_FLAC": {
                v3 = 22;
                break;
            }
            case "A_MPEG/L2": {
                v3 = 14;
                break;
            }
            case "A_MPEG/L3": {
                v3 = 15;
                break;
            }
            case "A_MS/ACM": {
                v3 = 23;
                break;
            }
            case "A_OPUS": {
                v3 = 12;
                break;
            }
            case "A_PCM/FLOAT/IEEE": {
                v3 = 26;
                break;
            }
            case "A_PCM/INT/BIG": {
                v3 = 25;
                break;
            }
            case "A_PCM/INT/LIT": {
                v3 = 24;
                break;
            }
            case "A_TRUEHD": {
                v3 = 18;
                break;
            }
            case "A_VORBIS": {
                v3 = 11;
                break;
            }
            case "S_DVBSUB": {
                v3 = 0x20;
                break;
            }
            case "S_HDMV/PGS": {
                v3 = 0x1F;
                break;
            }
            case "S_TEXT/ASS": {
                v3 = 28;
                break;
            }
            case "S_TEXT/UTF8": {
                v3 = 27;
                break;
            }
            case "S_TEXT/WEBVTT": {
                v3 = 29;
                break;
            }
            case "S_VOBSUB": {
                v3 = 30;
                break;
            }
            case "V_AV1": {
                v3 = 2;
                break;
            }
            case "V_MPEG2": {
                v3 = 3;
                break;
            }
            case "V_MPEG4/ISO/AP": {
                v3 = 6;
                break;
            }
            case "V_MPEG4/ISO/ASP": {
                v3 = 5;
                break;
            }
            case "V_MPEG4/ISO/AVC": {
                v3 = 7;
                break;
            }
            case "V_MPEG4/ISO/SP": {
                v3 = 4;
                break;
            }
            case "V_MPEGH/ISO/HEVC": {
                v3 = 8;
                break;
            }
            case "V_MS/VFW/FOURCC": {
                v3 = 9;
                break;
            }
            case "V_THEORA": {
                v3 = 10;
                break;
            }
            case "V_VP8": {
                v3 = 0;
                break;
            }
            case "V_VP9": {
                v3 = 1;
                break;
            }
            default: {
                v3 = -1;
            }
        }
        String s1 = "audio/raw";
        byte[] arr_b = null;
        switch(v3) {
            case 0: {
                s1 = "video/x-vnd.on2.vp8";
                list0 = null;
                s2 = null;
                v4 = -1;
                v1 = -1;
                break;
            }
            case 1: {
                s1 = "video/x-vnd.on2.vp9";
                list0 = null;
                s2 = null;
                v4 = -1;
                v1 = -1;
                break;
            }
            case 2: {
                s1 = "video/av01";
                list0 = null;
                s2 = null;
                v4 = -1;
                v1 = -1;
                break;
            }
            case 3: {
                s1 = "video/mpeg2";
                list0 = null;
                s2 = null;
                v4 = -1;
                v1 = -1;
                break;
            }
            case 4: 
            case 5: 
            case 6: {
                list0 = this.zzj == null ? null : Collections.singletonList(this.zzj);
                s1 = "video/mp4v-es";
                s2 = null;
                v4 = -1;
                v1 = -1;
                break;
            }
            case 7: {
                zzabr zzabr0 = zzabr.zza(new zzdy(this.zzi(this.zzb)));
                this.zzX = zzabr0.zzb;
                s1 = "video/avc";
                s2 = zzabr0.zzl;
                list0 = zzabr0.zza;
                v4 = -1;
                v1 = -1;
                break;
            }
            case 8: {
                zzadc zzadc0 = zzadc.zza(new zzdy(this.zzi(this.zzb)));
                this.zzX = zzadc0.zzb;
                s1 = "video/hevc";
                s2 = zzadc0.zzk;
                list0 = zzadc0.zza;
                v4 = -1;
                v1 = -1;
                break;
            }
            case 9: {
                Pair pair0 = zzahk.zzf(new zzdy(this.zzi(this.zzb)));
                s1 = (String)pair0.first;
                list0 = (List)pair0.second;
                s2 = null;
                v4 = -1;
                v1 = -1;
                break;
            }
            case 10: {
                s1 = "video/x-unknown";
                list0 = null;
                s2 = null;
                v4 = -1;
                v1 = -1;
                break;
            }
            case 11: {
                list0 = zzahk.zzg(this.zzi(s));
                v4 = 0x2000;
                s1 = "audio/vorbis";
                s2 = null;
                v1 = -1;
                break;
            }
            case 12: {
                list0 = new ArrayList(3);
                list0.add(this.zzi(this.zzb));
                ByteBuffer byteBuffer0 = ByteBuffer.allocate(8);
                ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
                list0.add(byteBuffer0.order(byteOrder0).putLong(this.zzR).array());
                list0.add(ByteBuffer.allocate(8).order(byteOrder0).putLong(this.zzS).array());
                v4 = 5760;
                s1 = "audio/opus";
                s2 = null;
                v1 = -1;
                break;
            }
            case 13: {
                list0 = Collections.singletonList(this.zzi(s));
                zzabi zzabi0 = zzabk.zza(this.zzj);
                this.zzQ = zzabi0.zza;
                this.zzO = zzabi0.zzb;
                s1 = "audio/mp4a-latm";
                s2 = zzabi0.zzc;
                v4 = -1;
                v1 = -1;
                break;
            }
            case 14: {
                s1 = "audio/mpeg-L2";
                goto label_129;
            }
            case 15: {
                s1 = "audio/mpeg";
            label_129:
                list0 = null;
                s2 = null;
                v4 = 0x1000;
                v1 = -1;
                break;
            }
            case 16: {
                s1 = "audio/ac3";
                list0 = null;
                s2 = null;
                v4 = -1;
                v1 = -1;
                break;
            }
            case 17: {
                s1 = "audio/eac3";
                list0 = null;
                s2 = null;
                v4 = -1;
                v1 = -1;
                break;
            }
            case 18: {
                this.zzT = new zzadu();
                s1 = "audio/true-hd";
                list0 = null;
                s2 = null;
                v4 = -1;
                v1 = -1;
                break;
            }
            case 19: 
            case 20: {
                s1 = "audio/vnd.dts";
                list0 = null;
                s2 = null;
                v4 = -1;
                v1 = -1;
                break;
            }
            case 21: {
                s1 = "audio/vnd.dts.hd";
                list0 = null;
                s2 = null;
                v4 = -1;
                v1 = -1;
                break;
            }
            case 22: {
                list0 = Collections.singletonList(this.zzi(s));
                s1 = "audio/flac";
                s2 = null;
                v4 = -1;
                v1 = -1;
                break;
            }
            case 23: {
                if(zzahk.zzh(new zzdy(this.zzi(this.zzb)))) {
                    v1 = zzei.zzn(this.zzP);
                    if(v1 == 0) {
                        zzdo.zzf("MatroskaExtractor", "Unsupported PCM bit depth: " + this.zzP + ". Setting mimeType to audio/x-unknown");
                        goto label_183;
                    }
                    else {
                        list0 = null;
                        s2 = null;
                        v4 = -1;
                        break;
                    }
                }
                else {
                    zzdo.zzf("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                    goto label_183;
                }
                break;
            }
            case 24: {
                v1 = zzei.zzn(this.zzP);
                if(v1 == 0) {
                    zzdo.zzf("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + this.zzP + ". Setting mimeType to audio/x-unknown");
                    goto label_183;
                }
                else {
                    list0 = null;
                    s2 = null;
                    v4 = -1;
                    break;
                }
                break;
            }
            case 25: {
                int v5 = this.zzP;
                if(v5 == 8) {
                    list0 = null;
                    s2 = null;
                    v4 = -1;
                    v1 = 3;
                }
                else if(v5 == 16) {
                    v1 = 0x10000000;
                    list0 = null;
                    s2 = null;
                    v4 = -1;
                    break;
                }
                else if(v5 == 24) {
                    v1 = 0x50000000;
                    list0 = null;
                    s2 = null;
                    v4 = -1;
                    break;
                }
                else if(v5 == 0x20) {
                    v1 = 0x60000000;
                    list0 = null;
                    s2 = null;
                    v4 = -1;
                    break;
                }
                else {
                    zzdo.zzf("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + v5 + ". Setting mimeType to audio/x-unknown");
                    goto label_183;
                }
                break;
            }
            case 26: {
                int v6 = this.zzP;
                if(v6 == 0x20) {
                    list0 = null;
                    s2 = null;
                    v4 = -1;
                }
                else {
                    zzdo.zzf("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + v6 + ". Setting mimeType to audio/x-unknown");
                label_183:
                    list0 = null;
                    s2 = null;
                    s1 = "audio/x-unknown";
                    v4 = -1;
                    v1 = -1;
                    break;
                }
                break;
            }
            case 27: {
                s1 = "application/x-subrip";
                list0 = null;
                s2 = null;
                v4 = -1;
                v1 = -1;
                break;
            }
            case 28: {
                list0 = zzfxn.zzp(zzahm.zzb, this.zzi(this.zzb));
                s1 = "text/x-ssa";
                s2 = null;
                v4 = -1;
                v1 = -1;
                break;
            }
            case 29: {
                s1 = "text/vtt";
                list0 = null;
                s2 = null;
                v4 = -1;
                v1 = -1;
                break;
            }
            case 30: {
                list0 = zzfxn.zzo(this.zzi(s));
                s2 = null;
                s1 = "application/vobsub";
                v4 = -1;
                v1 = -1;
                break;
            }
            case 0x1F: {
                list0 = null;
                s2 = null;
                s1 = "application/pgs";
                v4 = -1;
                v1 = -1;
                break;
            }
            case 0x20: {
                byte[] arr_b1 = new byte[4];
                System.arraycopy(this.zzi(s), 0, arr_b1, 0, 4);
                list0 = zzfxn.zzo(arr_b1);
                s1 = "application/dvbsubs";
                s2 = null;
                v4 = -1;
                v1 = -1;
                break;
            }
            default: {
                throw zzbc.zza("Unrecognized codec identifier.", null);
            }
        }
        if(this.zzN != null) {
            zzacj zzacj0 = zzacj.zza(new zzdy(this.zzN));
            if(zzacj0 != null) {
                s2 = zzacj0.zza;
                s1 = "video/dolby-vision";
            }
        }
        boolean z = this.zzV;
        zzz zzz0 = new zzz();
        if(zzbb.zzg(s1)) {
            zzz0.zzz(this.zzO);
            zzz0.zzab(this.zzQ);
            zzz0.zzU(v1);
            v7 = 1;
        }
        else if(zzbb.zzi(s1)) {
            if(this.zzq == 0) {
                int v8 = this.zzo;
                v9 = -1;
                if(v8 == -1) {
                    v8 = this.zzl;
                }
                this.zzo = v8;
                this.zzp = this.zzp == -1 ? this.zzm : this.zzp;
            }
            else {
                v9 = -1;
            }
            int v10 = this.zzo;
            if(v10 == -1) {
                f = -1.0f;
            }
            else {
                int v11 = this.zzp;
                f = v11 == -1 ? -1.0f : ((float)(this.zzm * v10)) / ((float)(this.zzl * v11));
            }
            if(this.zzx) {
                if(this.zzD != -1.0f && this.zzE != -1.0f && this.zzF != -1.0f && this.zzG != -1.0f && this.zzH != -1.0f && this.zzI != -1.0f && this.zzJ != -1.0f && this.zzK != -1.0f && this.zzL != -1.0f && this.zzM != -1.0f) {
                    arr_b = new byte[25];
                    ByteBuffer byteBuffer1 = ByteBuffer.wrap(arr_b).order(ByteOrder.LITTLE_ENDIAN);
                    byteBuffer1.put(0);
                    byteBuffer1.putShort(((short)(((int)(this.zzD * 50000.0f + 0.5f)))));
                    byteBuffer1.putShort(((short)(((int)(this.zzE * 50000.0f + 0.5f)))));
                    byteBuffer1.putShort(((short)(((int)(this.zzF * 50000.0f + 0.5f)))));
                    byteBuffer1.putShort(((short)(((int)(this.zzG * 50000.0f + 0.5f)))));
                    byteBuffer1.putShort(((short)(((int)(this.zzH * 50000.0f + 0.5f)))));
                    byteBuffer1.putShort(((short)(((int)(this.zzI * 50000.0f + 0.5f)))));
                    byteBuffer1.putShort(((short)(((int)(this.zzJ * 50000.0f + 0.5f)))));
                    byteBuffer1.putShort(((short)(((int)(this.zzK * 50000.0f + 0.5f)))));
                    byteBuffer1.putShort(((short)(((int)(this.zzL + 0.5f)))));
                    byteBuffer1.putShort(((short)(((int)(this.zzM + 0.5f)))));
                    byteBuffer1.putShort(((short)this.zzB));
                    byteBuffer1.putShort(((short)this.zzC));
                }
                zzi zzi0 = new zzi();
                zzi0.zzc(this.zzy);
                zzi0.zzb(this.zzA);
                zzi0.zzd(this.zzz);
                zzi0.zze(arr_b);
                zzi0.zzf(this.zzn);
                zzi0.zza(this.zzn);
                arr_b = zzi0.zzg();
            }
            if(this.zza != null && zzahm.zzf.containsKey(this.zza)) {
                v9 = (int)(((Integer)zzahm.zzf.get(this.zza)));
            }
            if(this.zzr != 0 || Float.compare(this.zzs, 0.0f) != 0 || Float.compare(this.zzt, 0.0f) != 0) {
                v2 = v9;
            }
            else if(Float.compare(this.zzu, 0.0f) != 0) {
                if(Float.compare(this.zzu, 90.0f) == 0) {
                    v2 = 90;
                }
                else if(Float.compare(this.zzu, -180.0f) == 0 || Float.compare(this.zzu, 180.0f) == 0) {
                    v2 = 180;
                }
                else if(Float.compare(this.zzu, -90.0f) == 0) {
                    v2 = 270;
                }
                else {
                    v2 = v9;
                }
            }
            zzz0.zzaf(this.zzl);
            zzz0.zzK(this.zzm);
            zzz0.zzW(f);
            zzz0.zzZ(v2);
            zzz0.zzX(this.zzv);
            zzz0.zzad(this.zzw);
            zzz0.zzB(((zzk)arr_b));
            v7 = 2;
        }
        else if("application/x-subrip".equals(s1) || "text/x-ssa".equals(s1) || "text/vtt".equals(s1) || "application/vobsub".equals(s1) || "application/pgs".equals(s1) || "application/dvbsubs".equals(s1)) {
            v7 = 3;
        }
        else {
            throw zzbc.zza("Unexpected MIME type.", null);
        }
        if(this.zza != null && !zzahm.zzf.containsKey(this.zza)) {
            zzz0.zzO(this.zza);
        }
        zzz0.zzL(v);
        zzz0.zzaa(s1);
        zzz0.zzR(v4);
        zzz0.zzQ(this.zzZ);
        zzz0.zzac(z);
        zzz0.zzN(list0);
        zzz0.zzA(s2);
        zzz0.zzF(this.zzk);
        zzab zzab0 = zzz0.zzag();
        zzadt zzadt0 = zzacq0.zzw(this.zzc, v7);
        this.zzW = zzadt0;
        zzadt0.zzm(zzab0);
    }

    private static Pair zzf(zzdy zzdy0) throws zzbc {
        try {
            zzdy0.zzM(16);
            long v = zzdy0.zzs();
            if(v == 1482049860L) {
                return new Pair("video/divx", null);
            }
            if(v == 0x33363248L) {
                return new Pair("video/3gpp", null);
            }
            if(v == 0x31435657L) {
                int v1 = zzdy0.zzd() + 20;
                byte[] arr_b = zzdy0.zzN();
                while(v1 < arr_b.length - 4) {
                    if(arr_b[v1] == 0 && arr_b[v1 + 1] == 0 && arr_b[v1 + 2] == 1 && arr_b[v1 + 3] == 15) {
                        return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(arr_b, v1, arr_b.length)));
                    }
                    ++v1;
                }
                throw zzbc.zza("Failed to find FourCC VC1 initialization data", null);
            }
        }
        catch(ArrayIndexOutOfBoundsException unused_ex) {
            throw zzbc.zza("Error parsing FourCC private data", null);
        }
        zzdo.zzf("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
        return new Pair("video/x-unknown", null);
    }

    private static List zzg(byte[] arr_b) throws zzbc {
        int v7;
        int v3;
        try {
            if(arr_b[0] != 2) {
                throw zzbc.zza("Error parsing vorbis codec private", null);
            }
            int v = 1;
            int v1;
            for(v1 = 0; true; v1 += 0xFF) {
                int v2 = arr_b[v];
                ++v;
                v3 = v2 & 0xFF;
                if(v3 != 0xFF) {
                    break;
                }
            }
            int v4 = v1 + v3;
            int v5;
            for(v5 = 0; true; v5 += 0xFF) {
                int v6 = arr_b[v];
                ++v;
                v7 = v6 & 0xFF;
                if(v7 != 0xFF) {
                    break;
                }
            }
            if(arr_b[v] != 1) {
                throw zzbc.zza("Error parsing vorbis codec private", null);
            }
            byte[] arr_b1 = new byte[v4];
            System.arraycopy(arr_b, v, arr_b1, 0, v4);
            int v8 = v + v4;
            if(arr_b[v8] != 3) {
                throw zzbc.zza("Error parsing vorbis codec private", null);
            }
            int v9 = v8 + (v5 + v7);
            if(arr_b[v9] != 5) {
                throw zzbc.zza("Error parsing vorbis codec private", null);
            }
            int v10 = arr_b.length - v9;
            byte[] arr_b2 = new byte[v10];
            System.arraycopy(arr_b, v9, arr_b2, 0, v10);
            List list0 = new ArrayList(2);
            list0.add(arr_b1);
            list0.add(arr_b2);
            return list0;
        }
        catch(ArrayIndexOutOfBoundsException unused_ex) {
            throw zzbc.zza("Error parsing vorbis codec private", null);
        }
    }

    private static boolean zzh(zzdy zzdy0) throws zzbc {
        try {
            int v = zzdy0.zzk();
            if(v == 1) {
                return true;
            }
            if(v != 0xFFFE) {
                return false;
            }
            zzdy0.zzL(24);
            return zzdy0.zzt() != zzahm.zze.getMostSignificantBits() || zzdy0.zzt() != zzahm.zze.getLeastSignificantBits() ? false : true;
        }
        catch(ArrayIndexOutOfBoundsException unused_ex) {
            throw zzbc.zza("Error parsing MS/ACM codec private", null);
        }
    }

    @d({"codecPrivate"})
    private final byte[] zzi(String s) throws zzbc {
        byte[] arr_b = this.zzj;
        if(arr_b == null) {
            throw zzbc.zza(("Missing CodecPrivate for codec " + s), null);
        }
        return arr_b;
    }
}

