package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import h4.m;
import java.io.EOFException;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.List;

public final class zzahs implements zzacn {
    private final zzdy zza;
    private final zzadf zzb;
    private final zzadb zzc;
    private final zzadd zzd;
    private final zzadt zze;
    private zzacq zzf;
    private zzadt zzg;
    private zzadt zzh;
    private int zzi;
    @Nullable
    private zzay zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private int zzo;
    private zzahu zzp;
    private boolean zzq;

    public zzahs() {
        throw null;
    }

    public zzahs(int v) {
        this.zza = new zzdy(10);
        this.zzb = new zzadf();
        this.zzc = new zzadb();
        this.zzk = 0x8000000000000001L;
        this.zzd = new zzadd();
        zzaci zzaci0 = new zzaci();
        this.zze = zzaci0;
        this.zzh = zzaci0;
        this.zzn = -1L;
    }

    public final void zza() {
        this.zzq = true;
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final int zzb(zzaco zzaco0, zzadj zzadj0) throws IOException {
        zzcw.zzb(this.zzg);
        int v = this.zzg(zzaco0);
        if(v == -1 && this.zzp instanceof zzahq) {
            long v1 = this.zzh(this.zzl);
            if(this.zzp.zza() != v1) {
                zzahq zzahq0 = (zzahq)this.zzp;
                throw null;
            }
        }
        return v;
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
        this.zzf = zzacq0;
        zzadt zzadt0 = zzacq0.zzw(0, 1);
        this.zzg = zzadt0;
        this.zzh = zzadt0;
        this.zzf.zzD();
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final void zzf(long v, long v1) {
        this.zzi = 0;
        this.zzk = 0x8000000000000001L;
        this.zzl = 0L;
        this.zzo = 0;
        if(this.zzp instanceof zzahq) {
            throw null;
        }
    }

    @m({"extractorOutput", "realTrackOutput"})
    private final int zzg(zzaco zzaco0) throws IOException {
        long v18;
        zzahv zzahv0;
        long v10;
        int v1;
        if(this.zzi == 0) {
            try {
                this.zzm(zzaco0, false);
            }
            catch(EOFException unused_ex) {
                return -1;
            }
        }
        if(this.zzp == null) {
            zzdy zzdy0 = new zzdy(this.zzb.zzc);
            zzaco0.zzh(zzdy0.zzN(), 0, this.zzb.zzc);
            zzadf zzadf0 = this.zzb;
            int v = 21;
            if((zzadf0.zza & 1) == 0) {
                if(zzadf0.zze == 1) {
                    v = 13;
                }
            }
            else if(zzadf0.zze != 1) {
                v = 36;
            }
            if(zzdy0.zze() >= v + 4) {
                zzdy0.zzL(v);
                v1 = zzdy0.zzg();
                if(v1 != 1483304551) {
                    if(v1 == 0x496E666F) {
                        v1 = 0x496E666F;
                        goto label_30;
                    }
                    goto label_22;
                }
            }
            else {
            label_22:
                if(zzdy0.zze() >= 40) {
                    zzdy0.zzL(36);
                    v1 = zzdy0.zzg() == 1447187017 ? 1447187017 : 0;
                }
                else {
                    v1 = 0;
                }
            }
        label_30:
            switch(v1) {
                case 1447187017: {
                    zzahv0 = zzahv.zzb(zzaco0.zzd(), zzaco0.zzf(), this.zzb, zzdy0);
                    zzaco0.zzk(this.zzb.zzc);
                    break;
                }
                case 0x496E666F: 
                case 1483304551: {
                    zzahw zzahw0 = zzahw.zzb(this.zzb, zzdy0);
                    zzadb zzadb0 = this.zzc;
                    if(!zzadb0.zza()) {
                        int v2 = zzahw0.zzd;
                        if(v2 != -1) {
                            int v3 = zzahw0.zze;
                            if(v3 != -1) {
                                zzadb0.zza = v2;
                                zzadb0.zzb = v3;
                            }
                        }
                    }
                    long v4 = zzaco0.zzf();
                    if(zzaco0.zzd() != -1L) {
                        long v5 = zzahw0.zzc;
                        if(v5 != -1L) {
                            long v6 = v5 + v4;
                            if(zzaco0.zzd() != v6) {
                                zzdo.zze("Mp3Extractor", "Data size mismatch between stream (" + zzaco0.zzd() + ") and Xing frame (" + v6 + "), using Xing value.");
                            }
                        }
                    }
                    zzaco0.zzk(this.zzb.zzc);
                    if(v1 == 1483304551) {
                        zzahv0 = zzahx.zzb(zzahw0, v4);
                    }
                    else {
                        long v7 = zzaco0.zzd();
                        long v8 = zzahw0.zza();
                        if(v8 == 0x8000000000000001L) {
                            zzahv0 = null;
                        }
                        else {
                            long v9 = zzahw0.zzc;
                            if(v9 != -1L) {
                                v7 = v4 + v9;
                                v10 = v9 - ((long)zzahw0.zza.zzc);
                                goto label_64;
                            }
                            else if(v7 == -1L) {
                                zzahv0 = null;
                            }
                            else {
                                v10 = v7 - v4 - ((long)zzahw0.zza.zzc);
                            label_64:
                                RoundingMode roundingMode0 = RoundingMode.HALF_UP;
                                int v11 = zzgaq.zzb(zzei.zzu(v10, 8000000L, v8, roundingMode0));
                                int v12 = zzgaq.zzb(zzgal.zzb(v10, zzahw0.zzb, roundingMode0));
                                zzahv0 = new zzahp(v7, v4 + ((long)zzahw0.zza.zzc), v11, v12, false);
                            }
                        }
                    }
                    break;
                }
                default: {
                    zzaco0.zzj();
                    zzahv0 = null;
                }
            }
            zzahv zzahv1 = null;
            zzay zzay0 = this.zzj;
            long v13 = zzaco0.zzf();
            if(zzay0 != null) {
                int v14 = zzay0.zza();
                for(int v15 = 0; v15 < v14; ++v15) {
                    zzax zzax0 = zzay0.zzb(v15);
                    if(zzax0 instanceof zzagm) {
                        int v16 = zzay0.zza();
                        for(int v17 = 0; true; ++v17) {
                            v18 = 0x8000000000000001L;
                            if(v17 >= v16) {
                                break;
                            }
                            zzax zzax1 = zzay0.zzb(v17);
                            if(zzax1 instanceof zzagq && ((zzagq)zzax1).zzf.equals("TLEN")) {
                                v18 = zzei.zzs(Long.parseLong(((String)((zzagq)zzax1).zzb.get(0))));
                                break;
                            }
                        }
                        zzahv1 = zzahr.zzb(v13, ((zzagm)zzax0), v18);
                        break;
                    }
                }
            }
            if(this.zzq) {
                zzahv0 = new zzaht();
            }
            else {
                if(zzahv1 != null) {
                    zzahv0 = zzahv1;
                }
                else if(zzahv0 == null) {
                    zzahv0 = null;
                }
                if(zzahv0 == null) {
                    zzaco0.zzh(this.zza.zzN(), 0, 4);
                    this.zza.zzL(0);
                    int v19 = this.zza.zzg();
                    this.zzb.zza(v19);
                    zzahv0 = new zzahp(zzaco0.zzd(), zzaco0.zzf(), this.zzb.zzf, this.zzb.zzc, false);
                }
                else {
                    zzahv0.zzh();
                }
            }
            this.zzp = zzahv0;
            this.zzf.zzO(zzahv0);
            zzz zzz0 = new zzz();
            zzz0.zzaa(this.zzb.zzb);
            zzz0.zzR(0x1000);
            zzz0.zzz(this.zzb.zze);
            zzz0.zzab(this.zzb.zzd);
            zzz0.zzG(this.zzc.zza);
            zzz0.zzH(this.zzc.zzb);
            zzz0.zzT(this.zzj);
            if(this.zzp.zzc() != 0x80000001) {
                zzz0.zzy(this.zzp.zzc());
            }
            this.zzh.zzm(zzz0.zzag());
            this.zzm = zzaco0.zzf();
        }
        else {
            long v20 = this.zzm;
            if(v20 != 0L) {
                long v21 = zzaco0.zzf();
                if(v21 < v20) {
                    zzaco0.zzk(((int)(v20 - v21)));
                }
            }
        }
        int v22 = this.zzo;
        if(v22 == 0) {
            zzaco0.zzj();
            if(!this.zzl(zzaco0)) {
                this.zza.zzL(0);
                int v23 = this.zza.zzg();
                if(zzahs.zzk(v23, ((long)this.zzi)) && zzadg.zzb(v23) != -1) {
                    this.zzb.zza(v23);
                    if(this.zzk == 0x8000000000000001L) {
                        this.zzk = this.zzp.zze(zzaco0.zzf());
                    }
                    int v24 = this.zzb.zzc;
                    this.zzo = v24;
                    this.zzn = zzaco0.zzf() + ((long)v24);
                    if(this.zzp instanceof zzahq) {
                        throw null;
                    }
                    v22 = v24;
                    goto label_155;
                }
                zzaco0.zzk(1);
                this.zzi = 0;
                return 0;
            }
        }
        else {
        label_155:
            int v25 = this.zzh.zzf(zzaco0, v22, true);
            if(v25 != -1) {
                int v26 = this.zzo - v25;
                this.zzo = v26;
                if(v26 <= 0) {
                    this.zzh.zzt(this.zzh(this.zzl), 1, this.zzb.zzc, 0, null);
                    this.zzl += (long)this.zzb.zzg;
                    this.zzo = 0;
                    return 0;
                }
                return 0;
            }
        }
        return -1;
    }

    private final long zzh(long v) {
        return this.zzk + v * 1000000L / ((long)this.zzb.zzd);
    }

    @Override  // com.google.android.gms.internal.ads.zzacn
    public final boolean zzi(zzaco zzaco0) throws IOException {
        return this.zzm(zzaco0, true);
    }

    private final void zzj() {
        if(this.zzp instanceof zzahp && this.zzp.zzh() && (this.zzn != -1L && this.zzn != this.zzp.zzd())) {
            this.zzp = ((zzahp)this.zzp).zzf(this.zzn);
            zzacq zzacq0 = this.zzf;
            zzacq0.getClass();
            zzacq0.zzO(this.zzp);
        }
    }

    private static boolean zzk(int v, long v1) {
        return ((long)(v & 0xFFFE0C00)) == (v1 & 0xFFFFFFFFFFFE0C00L);
    }

    private final boolean zzl(zzaco zzaco0) throws IOException {
        zzahu zzahu0 = this.zzp;
        if(zzahu0 != null) {
            long v = zzahu0.zzd();
            if(v != -1L && zzaco0.zze() > v - 4L) {
                return true;
            }
        }
        try {
            return !zzaco0.zzm(this.zza.zzN(), 0, 4, true);
        }
        catch(EOFException unused_ex) {
            return true;
        }
    }

    private final boolean zzm(zzaco zzaco0, boolean z) throws IOException {
        int v1;
        int v;
        zzaco0.zzj();
        if(zzaco0.zzf() == 0L) {
            zzay zzay0 = this.zzd.zza(zzaco0, null);
            this.zzj = zzay0;
            if(zzay0 != null) {
                this.zzc.zzb(zzay0);
            }
            v = (int)zzaco0.zze();
            if(!z) {
                zzaco0.zzk(v);
            }
            v1 = 0;
        }
        else {
            v1 = 0;
            v = 0;
        }
        int v2 = 0;
        int v3 = 0;
        while(true) {
            if(this.zzl(zzaco0)) {
                if(v2 > 0) {
                    goto label_30;
                }
                this.zzj();
                throw new EOFException();
            }
            this.zza.zzL(0);
            int v4 = this.zza.zzg();
            if(v1 == 0 || zzahs.zzk(v4, ((long)v1))) {
                int v5 = zzadg.zzb(v4);
                if(v5 != -1) {
                    ++v2;
                    if(v2 == 1) {
                        this.zzb.zza(v4);
                        v1 = v4;
                    }
                    else if(v2 == 4) {
                        goto label_30;
                    }
                    zzaco0.zzg(v5 - 4);
                    continue;
                label_30:
                    if(z) {
                        zzaco0.zzk(v + v3);
                    }
                    else {
                        zzaco0.zzj();
                    }
                    this.zzi = v1;
                    return true;
                }
            }
            if(v3 == (z ? 0x8000 : 0x20000)) {
                if(z) {
                    return false;
                }
                this.zzj();
                throw new EOFException();
            }
            if(z) {
                zzaco0.zzj();
                zzaco0.zzg(v + (v3 + 1));
            }
            else {
                zzaco0.zzk(1);
            }
            ++v3;
            v1 = 0;
            v2 = 0;
        }
    }
}

