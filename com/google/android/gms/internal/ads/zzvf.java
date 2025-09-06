package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.List;
import java.util.Map;

final class zzvf implements zztv, zzyt {
    final zzvk zza;
    private final long zzb;
    private final Uri zzc;
    private final zzgx zzd;
    private final zzuz zze;
    private final zzacq zzf;
    private final zzda zzg;
    private final zzadj zzh;
    private volatile boolean zzi;
    private boolean zzj;
    private long zzk;
    private zzgd zzl;
    @Nullable
    private zzadt zzm;
    private boolean zzn;

    public zzvf(zzvk zzvk0, Uri uri0, zzfy zzfy0, zzuz zzuz0, zzacq zzacq0, zzda zzda0) {
        this.zza = zzvk0;
        super();
        this.zzc = uri0;
        this.zzd = new zzgx(zzfy0);
        this.zze = zzuz0;
        this.zzf = zzacq0;
        this.zzg = zzda0;
        this.zzh = new zzadj();
        this.zzj = true;
        this.zzb = zztx.zza();
        this.zzl = this.zzi(0L);
    }

    @Override  // com.google.android.gms.internal.ads.zztv
    public final void zza(zzdy zzdy0) {
        long v = this.zzn ? Math.max(zzvk.zzr(this.zza, true), this.zzk) : this.zzk;
        int v1 = zzdy0.zzb();
        zzadt zzadt0 = this.zzm;
        zzadt0.getClass();
        zzadt0.zzr(zzdy0, v1);
        zzadt0.zzt(v, 1, v1, 0, null);
        this.zzn = true;
    }

    static void zzf(zzvf zzvf0, long v, long v1) {
        zzvf0.zzh.zza = v;
        zzvf0.zzk = v1;
        zzvf0.zzj = true;
        zzvf0.zzn = false;
    }

    @Override  // com.google.android.gms.internal.ads.zzyt
    public final void zzg() {
        this.zzi = true;
    }

    @Override  // com.google.android.gms.internal.ads.zzyt
    public final void zzh() throws IOException {
        int v10;
        int v8;
        int v7;
        long v6;
        zzgx zzgx1;
        int v5;
        int v4;
        boolean z1;
        String s3;
        String s2;
        String s1;
        boolean z;
        int v3;
        int v2;
        while(!this.zzi) {
            try {
                long v = this.zzh.zza;
                zzgd zzgd0 = this.zzi(v);
                this.zzl = zzgd0;
                long v1 = this.zzd.zzb(zzgd0);
                if(this.zzi) {
                    goto label_127;
                }
                if(v1 != -1L) {
                    v1 += v;
                    zzvk.zzC(this.zza);
                }
                zzvk zzvk0 = this.zza;
                Map map0 = this.zzd.zze();
                List list0 = (List)map0.get("icy-br");
                if(list0 == null) {
                    z = false;
                    v3 = -1;
                    goto label_28;
                label_26:
                    v3 = v2;
                    z = true;
                }
                else {
                    String s = (String)list0.get(0);
                    try {
                        v2 = -1;
                        v2 = Integer.parseInt(s) * 1000;
                        if(v2 <= 0) {
                            zzdo.zzf("IcyHeaders", "Invalid bitrate: " + s);
                            z = false;
                            v3 = -1;
                        }
                        else {
                            goto label_26;
                        }
                    }
                    catch(NumberFormatException unused_ex) {
                        zzdo.zzf("IcyHeaders", "Invalid bitrate header: " + s);
                        v3 = v2;
                        z = false;
                    }
                }
            label_28:
                List list1 = (List)map0.get("icy-genre");
                zzafr zzafr0 = null;
                if(list1 == null) {
                    s1 = null;
                }
                else {
                    s1 = (String)list1.get(0);
                    z = true;
                }
                List list2 = (List)map0.get("icy-name");
                if(list2 == null) {
                    s2 = null;
                }
                else {
                    s2 = (String)list2.get(0);
                    z = true;
                }
                List list3 = (List)map0.get("icy-url");
                if(list3 == null) {
                    s3 = null;
                }
                else {
                    s3 = (String)list3.get(0);
                    z = true;
                }
                List list4 = (List)map0.get("icy-pub");
                if(list4 == null) {
                    z1 = false;
                }
                else {
                    z1 = ((String)list4.get(0)).equals("1");
                    z = true;
                }
                List list5 = (List)map0.get("icy-metaint");
                if(list5 == null) {
                    v5 = -1;
                    goto label_68;
                label_66:
                    v5 = v4;
                    z = true;
                }
                else {
                    String s4 = (String)list5.get(0);
                    try {
                        v4 = -1;
                        v4 = Integer.parseInt(s4);
                        if(v4 <= 0) {
                            zzdo.zzf("IcyHeaders", "Invalid metadata interval: " + s4);
                            v5 = -1;
                        }
                        else {
                            goto label_66;
                        }
                    }
                    catch(NumberFormatException unused_ex) {
                        zzdo.zzf("IcyHeaders", "Invalid metadata interval: " + s4);
                        v5 = v4;
                    }
                }
            label_68:
                if(z) {
                    zzafr0 = new zzafr(v3, s1, s2, s3, z1, v5);
                }
                zzvk0.zzs = zzafr0;
                zzgx zzgx0 = this.zzd;
                zzvk zzvk1 = this.zza;
                if(zzvk1.zzs == null || zzvk1.zzs.zzf == -1) {
                    zzgx1 = zzgx0;
                }
                else {
                    zztw zztw0 = new zztw(zzgx0, zzvk1.zzs.zzf, this);
                    zzadt zzadt0 = this.zza.zzv();
                    this.zzm = zzadt0;
                    zzadt0.zzm(zzvk.zzc);
                    zzgx1 = zztw0;
                }
                Map map1 = this.zzd.zze();
                this.zze.zzd(zzgx1, this.zzc, map1, v, v1, this.zzf);
                if(this.zza.zzs != null) {
                    this.zze.zzc();
                }
                if(this.zzj) {
                    this.zze.zzf(v, this.zzk);
                    this.zzj = false;
                }
                v6 = v;
                v7 = 0;
            }
            catch(Throwable throwable0) {
                v8 = 0;
                goto label_108;
            }
            while(v7 == 0) {
                if(!this.zzi) {
                    try {
                        try {
                            this.zzg.zza();
                        }
                        catch(InterruptedException unused_ex) {
                            throw new InterruptedIOException();
                        }
                        v7 = this.zze.zza(this.zzh);
                        long v9 = this.zze.zzb();
                        if(v9 <= this.zza.zzj + v6) {
                            continue;
                        }
                        this.zzg.zzc();
                        this.zza.zzq.post(this.zza.zzp);
                        v6 = v9;
                        continue;
                    }
                    catch(Throwable throwable0) {
                        v8 = v7;
                    }
                label_108:
                    if(v8 != 1) {
                        zzuz zzuz0 = this.zze;
                        if(zzuz0.zzb() != -1L) {
                            this.zzh.zza = zzuz0.zzb();
                        }
                    }
                    zzga.zza(this.zzd);
                    throw throwable0;
                }
                v7 = 0;
                break;
            }
            if(v7 == 1) {
                v10 = 0;
            }
            else {
                zzuz zzuz1 = this.zze;
                if(zzuz1.zzb() != -1L) {
                    this.zzh.zza = zzuz1.zzb();
                }
                v10 = v7;
            }
            zzga.zza(this.zzd);
            if(v10 != 0) {
                return;
            }
            continue;
        label_127:
            zzuz zzuz2 = this.zze;
            if(zzuz2.zzb() != -1L) {
                this.zzh.zza = zzuz2.zzb();
            }
            zzga.zza(this.zzd);
            return;
        }
    }

    private final zzgd zzi(long v) {
        zzgb zzgb0 = new zzgb();
        zzgb0.zzd(this.zzc);
        zzgb0.zzc(v);
        zzgb0.zza(6);
        zzgb0.zzb(zzvk.zzb);
        return zzgb0.zze();
    }
}

