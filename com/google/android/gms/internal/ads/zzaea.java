package com.google.android.gms.internal.ads;

import h4.m;
import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

public final class zzaea implements zzacn {
    private static final int[] zza;
    private static final int[] zzb;
    private static final byte[] zzc;
    private static final byte[] zzd;
    private final byte[] zze;
    private final zzadt zzf;
    private boolean zzg;
    private long zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private zzacq zzn;
    private zzadt zzo;
    private zzadt zzp;
    private zzadm zzq;
    private long zzr;
    private boolean zzs;

    static {
        zzaea.zza = new int[]{13, 14, 16, 18, 20, 21, 27, 0x20, 6, 7, 6, 6, 1, 1, 1, 1};
        zzaea.zzb = new int[]{18, 24, 33, 37, 41, 0x2F, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        Charset charset0 = StandardCharsets.UTF_8;
        zzaea.zzc = "#!AMR\n".getBytes(charset0);
        zzaea.zzd = "#!AMR-WB\n".getBytes(charset0);
    }

    public zzaea() {
        throw null;
    }

    public zzaea(int v) {
        this.zze = new byte[1];
        this.zzk = -1;
        zzaci zzaci0 = new zzaci();
        this.zzf = zzaci0;
        this.zzp = zzaci0;
    }

    @m({"realTrackOutput"})
    private final int zza(zzaco zzaco0) throws IOException {
        int v3;
        int v = this.zzj;
        if(v == 0) {
            try {
                zzaco0.zzj();
                zzaco0.zzh(this.zze, 0, 1);
                int v1 = this.zze[0];
                if((v1 & 0x83) > 0) {
                    throw zzbc.zza(("Invalid padding bits for frame header " + v1), null);
                }
                String s = "WB";
                boolean z = this.zzg;
                int v2 = v1 >> 3 & 15;
                if((!z || v2 >= 10 && v2 <= 13) && (z || v2 >= 12 && v2 <= 14)) {
                    if(!z) {
                        s = "NB";
                    }
                    throw zzbc.zza(("Illegal AMR " + s + " frame type " + v2), null);
                }
                v = z ? zzaea.zzb[v2] : zzaea.zza[v2];
                this.zzi = v;
                this.zzj = v;
                v3 = this.zzk;
            }
            catch(EOFException unused_ex) {
                return -1;
            }
            if(v3 == -1) {
                this.zzk = v;
                v3 = v;
            }
            if(v3 == v) {
                ++this.zzl;
            }
        }
        int v4 = this.zzp.zzf(zzaco0, v, true);
        if(v4 == -1) {
            return -1;
        }
        int v5 = this.zzj - v4;
        this.zzj = v5;
        if(v5 > 0) {
            return 0;
        }
        this.zzp.zzt(this.zzh, 1, this.zzi, 0, null);
        this.zzh += 20000L;
        return 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final int zzb(zzaco zzaco0, zzadj zzadj0) throws IOException {
        zzcw.zzb(this.zzo);
        if(zzaco0.zzf() == 0L && !this.zzh(zzaco0)) {
            throw zzbc.zza("Could not find AMR header.", null);
        }
        if(!this.zzs) {
            this.zzs = true;
            boolean z = this.zzg;
            int v = z ? zzaea.zzb[8] : zzaea.zza[7];
            zzadt zzadt0 = this.zzp;
            zzz zzz0 = new zzz();
            zzz0.zzaa((z ? "audio/amr-wb" : "audio/3gpp"));
            zzz0.zzR(v);
            zzz0.zzz(1);
            zzz0.zzab((z ? 16000 : 8000));
            zzadt0.zzm(zzz0.zzag());
        }
        int v1 = this.zza(zzaco0);
        if(this.zzq == null) {
            zzadl zzadl0 = new zzadl(0x8000000000000001L, 0L);
            this.zzq = zzadl0;
            this.zzn.zzO(zzadl0);
        }
        return v1 == -1 ? -1 : 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final zzacn zzc() {
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final List zzd() {
        return zzfxn.zzn();
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final void zze(zzacq zzacq0) {
        this.zzn = zzacq0;
        zzadt zzadt0 = zzacq0.zzw(0, 1);
        this.zzo = zzadt0;
        this.zzp = zzadt0;
        zzacq0.zzD();
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final void zzf(long v, long v1) {
        this.zzh = 0L;
        this.zzi = 0;
        this.zzj = 0;
        this.zzr = v1;
        this.zzm = 0L;
    }

    private static boolean zzg(zzaco zzaco0, byte[] arr_b) throws IOException {
        zzaco0.zzj();
        byte[] arr_b1 = new byte[arr_b.length];
        zzaco0.zzh(arr_b1, 0, arr_b.length);
        return Arrays.equals(arr_b1, arr_b);
    }

    private final boolean zzh(zzaco zzaco0) throws IOException {
        byte[] arr_b = zzaea.zzc;
        if(zzaea.zzg(zzaco0, arr_b)) {
            this.zzg = false;
            zzaco0.zzk(arr_b.length);
            return true;
        }
        byte[] arr_b1 = zzaea.zzd;
        if(zzaea.zzg(zzaco0, arr_b1)) {
            this.zzg = true;
            zzaco0.zzk(arr_b1.length);
            return true;
        }
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final boolean zzi(zzaco zzaco0) throws IOException {
        return this.zzh(zzaco0);
    }
}

