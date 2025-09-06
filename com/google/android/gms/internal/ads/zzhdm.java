package com.google.android.gms.internal.ads;

import java.util.List;

public final class zzhdm extends zzgxr implements zzgzd {
    private zzgyd zzA;
    private zzgyd zzB;
    private zzhdi zzC;
    private zzgyd zzD;
    private zzhbt zzE;
    private String zzF;
    private zzhbl zzG;
    private zzgyd zzH;
    private zzhcm zzI;
    private int zzJ;
    private zzgyd zzK;
    private zzgyd zzL;
    private long zzM;
    private zzhdl zzN;
    private zzhcr zzO;
    private String zzP;
    private byte zzQ;
    private static final zzhdm zza;
    private static volatile zzgzk zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private zzhbp zzi;
    private zzgyd zzj;
    private zzgyd zzk;
    private String zzl;
    private zzhcx zzm;
    private boolean zzn;
    private zzgyd zzo;
    private String zzp;
    private boolean zzu;
    private boolean zzv;
    private zzgwj zzw;
    private zzhde zzx;
    private boolean zzy;
    private String zzz;

    static {
        zzhdm zzhdm0 = new zzhdm();
        zzhdm.zza = zzhdm0;
        zzgxr.zzbZ(zzhdm.class, zzhdm0);
    }

    private zzhdm() {
        this.zzQ = 2;
        this.zzf = "";
        this.zzg = "";
        this.zzh = "";
        this.zzj = zzgxr.zzbK();
        this.zzk = zzgxr.zzbK();
        this.zzl = "";
        this.zzo = zzgxr.zzbK();
        this.zzp = "";
        this.zzw = zzgwj.zzb;
        this.zzz = "";
        this.zzA = zzgxr.zzbK();
        this.zzB = zzgxr.zzbK();
        this.zzD = zzgxr.zzbK();
        this.zzF = "";
        this.zzH = zzgxr.zzbK();
        this.zzK = zzgxr.zzbK();
        this.zzL = zzgxr.zzbK();
        this.zzP = "";
    }

    public static zzhbn zzc() {
        return (zzhbn)zzhdm.zza.zzaZ();
    }

    @Override  // com.google.android.gms.internal.ads.zzgxr
    protected final Object zzdc(zzgxq zzgxq0, Object object0, Object object1) {
        byte b = 1;
        switch(zzgxq0.ordinal()) {
            case 0: {
                return this.zzQ;
            }
            case 1: {
                if(object0 == null) {
                    b = 0;
                }
                this.zzQ = b;
                return null;
            }
            case 2: {
                return zzgxr.zzbQ(zzhdm.zza, "\u0001#\u0000\u0001\u0001##\u0000\t\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001A\u0007ဈ\t\bဇ\n\tဇ\u000B\n᠌\u0000\u000B᠌\u0001\fဉ\u0005\rဈ\u0006\u000Eဉ\u0007\u000Fည\f\u0010\u001B\u0011ဉ\r\u0012ဇ\u000E\u0013ဈ\u000F\u0014\u001A\u0015\u001A\u0016ဉ\u0010\u0017\u001B\u0018ဉ\u0011\u0019ဈ\u0012\u001Aဉ\u0013\u001B\u001B\u001Cဉ\u0014\u001D᠌\u0015\u001E\u001B\u001F\u001B ဂ\u0016!ဉ\u0017\"ဉ\u0018#ဈ\u0019", new Object[]{"zzc", "zzf", "zzg", "zzh", "zzj", zzhdc.class, "zzn", "zzo", "zzp", "zzu", "zzv", "zzd", zzhcy.zza, "zze", zzhbm.zza, "zzi", "zzl", "zzm", "zzw", "zzk", zzhdq.class, "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", zzhdw.class, "zzE", "zzF", "zzG", "zzH", zzhbx.class, "zzI", "zzJ", zzhdg.zza, "zzK", zzhcp.class, "zzL", zzhcu.class, "zzM", "zzN", "zzO", "zzP"});
            }
            case 3: {
                return new zzhdm();
            }
            case 4: {
                return new zzhbn(null);
            }
            case 5: {
                return zzhdm.zza;
            }
            case 6: {
                zzgzk zzgzk0 = zzhdm.zzb;
                if(zzgzk0 == null) {
                    synchronized(zzhdm.class) {
                        zzgzk0 = zzhdm.zzb;
                        if(zzgzk0 == null) {
                            zzgzk0 = new zzgxm(zzhdm.zza);
                            zzhdm.zzb = zzgzk0;
                        }
                    }
                }
                return zzgzk0;
            }
            default: {
                throw null;
            }
        }
    }

    public final String zzf() {
        return this.zzl;
    }

    public final String zzg() {
        return this.zzf;
    }

    public final List zzh() {
        return this.zzj;
    }

    static void zzi(zzhdm zzhdm0, Iterable iterable0) {
        zzgyd zzgyd0 = zzhdm0.zzA;
        if(!zzgyd0.zzc()) {
            zzhdm0.zzA = zzgxr.zzbL(zzgyd0);
        }
        zzgvs.zzaQ(iterable0, zzhdm0.zzA);
    }

    static void zzj(zzhdm zzhdm0, Iterable iterable0) {
        zzgyd zzgyd0 = zzhdm0.zzB;
        if(!zzgyd0.zzc()) {
            zzhdm0.zzB = zzgxr.zzbL(zzgyd0);
        }
        zzgvs.zzaQ(iterable0, zzhdm0.zzB);
    }

    static void zzk(zzhdm zzhdm0, zzhdc zzhdc0) {
        zzhdc0.getClass();
        zzgyd zzgyd0 = zzhdm0.zzj;
        if(!zzgyd0.zzc()) {
            zzhdm0.zzj = zzgxr.zzbL(zzgyd0);
        }
        zzhdm0.zzj.add(zzhdc0);
    }

    static void zzl(zzhdm zzhdm0) {
        zzhdm0.zzc &= -65;
        zzhdm0.zzl = zzhdm.zza.zzl;
    }

    static void zzm(zzhdm zzhdm0, String s) {
        zzhdm0.zzc |= 0x40;
        zzhdm0.zzl = s;
    }

    static void zzn(zzhdm zzhdm0, zzhde zzhde0) {
        zzhde0.getClass();
        zzhdm0.zzx = zzhde0;
        zzhdm0.zzc |= 0x2000;
    }

    static void zzo(zzhdm zzhdm0, zzhbp zzhbp0) {
        zzhbp0.getClass();
        zzhdm0.zzi = zzhbp0;
        zzhdm0.zzc |= 0x20;
    }

    static void zzp(zzhdm zzhdm0, String s) {
        s.getClass();
        zzhdm0.zzc |= 8;
        zzhdm0.zzg = s;
    }

    static void zzq(zzhdm zzhdm0, zzhcx zzhcx0) {
        zzhcx0.getClass();
        zzhdm0.zzm = zzhcx0;
        zzhdm0.zzc |= 0x80;
    }

    static void zzr(zzhdm zzhdm0, String s) {
        s.getClass();
        zzhdm0.zzc |= 4;
        zzhdm0.zzf = s;
    }

    static void zzs(zzhdm zzhdm0, int v) {
        zzhdm0.zzd = v - 1;
        zzhdm0.zzc |= 1;
    }
}

