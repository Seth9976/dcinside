package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;
import o3.j;

@j
public final class zzayz {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final boolean zzd;
    private final zzazo zze;
    private final zzazw zzf;
    private final Object zzg;
    private final ArrayList zzh;
    private final ArrayList zzi;
    private final ArrayList zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private String zzo;
    private String zzp;
    private String zzq;

    public zzayz(int v, int v1, int v2, int v3, int v4, int v5, int v6, boolean z) {
        this.zzg = new Object();
        this.zzh = new ArrayList();
        this.zzi = new ArrayList();
        this.zzj = new ArrayList();
        this.zzk = 0;
        this.zzl = 0;
        this.zzm = 0;
        this.zzo = "";
        this.zzp = "";
        this.zzq = "";
        this.zza = v;
        this.zzb = v1;
        this.zzc = v2;
        this.zzd = z;
        this.zze = new zzazo(v3);
        this.zzf = new zzazw(v4, v5, v6);
    }

    @Override
    public final boolean equals(Object object0) {
        if(!(object0 instanceof zzayz)) {
            return false;
        }
        if(object0 == this) {
            return true;
        }
        String s = ((zzayz)object0).zzo;
        return s != null && s.equals(this.zzo);
    }

    @Override
    public final int hashCode() {
        return this.zzo.hashCode();
    }

    @Override
    public final String toString() {
        return "ActivityContent fetchId: " + this.zzl + " score:" + this.zzn + " total_length:" + this.zzk + "\n text: " + zzayz.zzn(this.zzh, 100) + "\n viewableText" + zzayz.zzn(this.zzi, 100) + "\n signture: " + this.zzo + "\n viewableSignture: " + this.zzp + "\n viewableSignatureForVertical: " + this.zzq;
    }

    // 去混淆评级： 低(20)
    @VisibleForTesting
    final int zza(int v, int v1) {
        return this.zzd ? this.zzb : v * this.zza + v1 * this.zzb;
    }

    @VisibleForTesting
    final int zzb() {
        return this.zzk;
    }

    public final String zzc() {
        return this.zzo;
    }

    public final String zzd() {
        return this.zzq;
    }

    public final void zze() {
        synchronized(this.zzg) {
            --this.zzm;
        }
    }

    public final void zzf() {
        synchronized(this.zzg) {
            ++this.zzm;
        }
    }

    public final void zzg(int v) {
        this.zzl = v;
    }

    public final void zzh(String s, boolean z, float f, float f1, float f2, float f3) {
        this.zzm(s, z, f, f1, f2, f3);
    }

    public final void zzi(String s, boolean z, float f, float f1, float f2, float f3) {
        this.zzm(s, z, f, f1, f2, f3);
        synchronized(this.zzg) {
            if(this.zzm < 0) {
                zzo.zze("ActivityContent: negative number of WebViews.");
            }
            this.zzj();
        }
    }

    public final void zzj() {
        synchronized(this.zzg) {
            int v1 = this.zza(this.zzk, this.zzl);
            if(v1 > this.zzn) {
                this.zzn = v1;
                if(!zzv.zzp().zzi().zzK()) {
                    this.zzo = this.zze.zza(this.zzh);
                    this.zzp = this.zze.zza(this.zzi);
                }
                if(!zzv.zzp().zzi().zzL()) {
                    this.zzq = this.zzf.zza(this.zzi, this.zzj);
                }
            }
        }
    }

    public final void zzk() {
        synchronized(this.zzg) {
            int v1 = this.zza(this.zzk, this.zzl);
            if(v1 > this.zzn) {
                this.zzn = v1;
            }
        }
    }

    public final boolean zzl() {
        synchronized(this.zzg) {
        }
        return this.zzm == 0;
    }

    private final void zzm(@Nullable String s, boolean z, float f, float f1, float f2, float f3) {
        if(s != null && s.length() >= this.zzc) {
            Object object0 = this.zzg;
            synchronized(object0) {
                this.zzh.add(s);
                this.zzk += s.length();
                if(z) {
                    this.zzi.add(s);
                    zzazk zzazk0 = new zzazk(f, f1, f2, f3, this.zzi.size() - 1);
                    this.zzj.add(zzazk0);
                }
            }
        }
    }

    private static final String zzn(ArrayList arrayList0, int v) {
        if(arrayList0.isEmpty()) {
            return "";
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        int v1 = arrayList0.size();
        int v2 = 0;
        while(v2 < v1) {
            stringBuilder0.append(((String)arrayList0.get(v2)));
            stringBuilder0.append(' ');
            ++v2;
            if(stringBuilder0.length() > 100) {
                break;
            }
        }
        stringBuilder0.deleteCharAt(stringBuilder0.length() - 1);
        String s = stringBuilder0.toString();
        return s.length() >= 100 ? s.substring(0, 100) : s;
    }
}

