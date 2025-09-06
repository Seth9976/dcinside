package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class zzaln {
    private String zza;
    private String zzb;
    private Set zzc;
    private String zzd;
    @Nullable
    private String zze;
    @ColorInt
    private int zzf;
    private boolean zzg;
    private int zzh;
    private boolean zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private float zzn;
    private int zzo;
    private boolean zzp;

    public zzaln() {
        this.zza = "";
        this.zzb = "";
        this.zzc = Collections.emptySet();
        this.zzd = "";
        this.zze = null;
        this.zzg = false;
        this.zzi = false;
        this.zzj = -1;
        this.zzk = -1;
        this.zzl = -1;
        this.zzm = -1;
        this.zzo = -1;
        this.zzp = false;
    }

    private static int zzA(int v, String s, @Nullable String s1, int v1) {
        if(!s.isEmpty() && v != -1) {
            return s.equals(s1) ? v + v1 : -1;
        }
        return v;
    }

    public final float zza() {
        return this.zzn;
    }

    public final int zzb() {
        if(!this.zzi) {
            throw new IllegalStateException("Background color not defined.");
        }
        return this.zzh;
    }

    public final int zzc() {
        if(!this.zzg) {
            throw new IllegalStateException("Font color not defined");
        }
        return this.zzf;
    }

    public final int zzd() {
        return this.zzm;
    }

    public final int zze() {
        return this.zzo;
    }

    public final int zzf(@Nullable String s, @Nullable String s1, Set set0, @Nullable String s2) {
        if(this.zza.isEmpty() && this.zzb.isEmpty() && this.zzc.isEmpty() && this.zzd.isEmpty()) {
            return TextUtils.isEmpty(s1) ? 1 : 0;
        }
        int v = zzaln.zzA(zzaln.zzA(zzaln.zzA(0, this.zza, s, 0x40000000), this.zzb, s1, 2), this.zzd, s2, 4);
        return v == -1 || !set0.containsAll(this.zzc) ? 0 : v + this.zzc.size() * 4;
    }

    public final int zzg() {
        int v = 0;
        int v1 = this.zzk;
        if(v1 == -1 && this.zzl == -1) {
            return -1;
        }
        if(this.zzl == 1) {
            v = 2;
        }
        return (v1 == 1 ? 1 : 0) | v;
    }

    public final zzaln zzh(int v) {
        this.zzh = v;
        this.zzi = true;
        return this;
    }

    public final zzaln zzi(boolean z) {
        this.zzk = 1;
        return this;
    }

    public final zzaln zzj(boolean z) {
        this.zzp = z;
        return this;
    }

    public final zzaln zzk(int v) {
        this.zzf = v;
        this.zzg = true;
        return this;
    }

    public final zzaln zzl(@Nullable String s) {
        this.zze = zzftt.zza(s);
        return this;
    }

    public final zzaln zzm(float f) {
        this.zzn = f;
        return this;
    }

    public final zzaln zzn(int v) {
        this.zzm = v;
        return this;
    }

    public final zzaln zzo(boolean z) {
        this.zzl = 1;
        return this;
    }

    public final zzaln zzp(int v) {
        this.zzo = v;
        return this;
    }

    public final zzaln zzq(boolean z) {
        this.zzj = 1;
        return this;
    }

    @Nullable
    public final String zzr() {
        return this.zze;
    }

    public final void zzs(String[] arr_s) {
        this.zzc = new HashSet(Arrays.asList(arr_s));
    }

    public final void zzt(String s) {
        this.zza = s;
    }

    public final void zzu(String s) {
        this.zzb = s;
    }

    public final void zzv(String s) {
        this.zzd = s;
    }

    public final boolean zzw() {
        return this.zzp;
    }

    public final boolean zzx() {
        return this.zzi;
    }

    public final boolean zzy() {
        return this.zzg;
    }

    public final boolean zzz() {
        return this.zzj == 1;
    }
}

