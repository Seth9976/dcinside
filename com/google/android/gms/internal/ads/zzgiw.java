package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzgiw {
    public static final int zza;
    private static final zzgvo zzb;
    private static final zzgmt zzc;
    private static final zzgmp zzd;
    private static final zzglh zze;
    private static final zzgld zzf;

    static {
        zzgvo zzgvo0 = zzgnu.zzb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzgiw.zzb = zzgvo0;
        zzgiw.zzc = zzgmt.zzb((zzgfk zzgfk0) -> {
            zzgsn zzgsn0 = zzgsp.zza();
            zzgsn0.zzb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
            zzgql zzgql0 = zzgqn.zza();
            zzgqr zzgqr0 = zzgqt.zzb();
            zzgqu zzgqu0 = zzgqw.zzb();
            zzgqu0.zza(zzgfk0.zzd());
            zzgqr0.zzb(((zzgqw)zzgqu0.zzbn()));
            zzgqr0.zza(zzgfk0.zzb());
            zzgql0.zza(((zzgqt)zzgqr0.zzbn()));
            zzgsc zzgsc0 = zzgse.zzc();
            zzgsc0.zzb(zzgiw.zzh(zzgfk0));
            zzgsc0.zza(zzgfk0.zzc());
            zzgql0.zzb(((zzgse)zzgsc0.zzbn()));
            zzgsn0.zzc(((zzgqn)zzgql0.zzbn()).zzaN());
            zzgsn0.zza(zzgiw.zzi(zzgfk0.zzh()));
            return zzgni.zzb(((zzgsp)zzgsn0.zzbn()));
        }, zzgfk.class, zzgni.class);
        zzgiw.zzd = zzgmp.zzb((zzgni zzgni0) -> // 去混淆评级： 中等(80)
        throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: "), zzgvo0, zzgni.class);
        zzgiw.zze = zzglh.zzb((zzgfb zzgfb0, zzgeo zzgeo0) -> {
            zzgqi zzgqi0 = zzgqk.zzb();
            zzgqo zzgqo0 = zzgqq.zzb();
            zzgqu zzgqu0 = zzgqw.zzb();
            zzgqu0.zza(zzgfb0.zzb().zzd());
            zzgqo0.zzb(((zzgqw)zzgqu0.zzbn()));
            byte[] arr_b = zzgfb0.zzd().zzd(zzgeo0);
            zzgqo0.zza(zzgwj.zzv(arr_b, 0, arr_b.length));
            zzgqi0.zza(((zzgqq)zzgqo0.zzbn()));
            zzgrz zzgrz0 = zzgsb.zzb();
            zzgrz0.zzb(zzgiw.zzh(zzgfb0.zzb()));
            byte[] arr_b1 = zzgfb0.zze().zzd(zzgeo0);
            zzgrz0.zza(zzgwj.zzv(arr_b1, 0, arr_b1.length));
            zzgqi0.zzb(((zzgsb)zzgrz0.zzbn()));
            zzgwj zzgwj0 = ((zzgqk)zzgqi0.zzbn()).zzaN();
            zzgtp zzgtp0 = zzgiw.zzi(zzgfb0.zzb().zzh());
            return zzgnh.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", zzgwj0, zzgsj.zzb, zzgtp0, zzgfb0.zzf());
        }, zzgfb.class, zzgnh.class);
        zzgiw.zzf = zzgld.zzb((zzgnh zzgnh0, zzgeo zzgeo0) -> {
            if(zzgnh0.zzg().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                try {
                    zzgqk zzgqk0 = zzgqk.zzd(zzgnh0.zze(), zzgxb.zza());
                    if(zzgqk0.zza() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if(zzgqk0.zzf().zza() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
                    }
                    if(zzgqk0.zzg().zza() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
                    }
                    zzgfg zzgfg0 = zzgfk.zzf();
                    zzgfg0.zza(zzgqk0.zzf().zzg().zzd());
                    zzgfg0.zzc(zzgqk0.zzg().zzh().zzd());
                    zzgfg0.zzd(zzgqk0.zzf().zzf().zza());
                    zzgfg0.zze(zzgqk0.zzg().zzg().zza());
                    zzgfg0.zzb(zzgiw.zzf(zzgqk0.zzg().zzg().zzb()));
                    zzgfg0.zzf(zzgiw.zzg(zzgnh0.zzc()));
                    zzgfk zzgfk0 = zzgfg0.zzg();
                    zzgez zzgez0 = zzgfb.zza();
                    zzgez0.zzd(zzgfk0);
                    zzgez0.zza(zzgvp.zzb(zzgqk0.zzf().zzg().zzA(), zzgeo0));
                    zzgez0.zzb(zzgvp.zzb(zzgqk0.zzg().zzh().zzA(), zzgeo0));
                    zzgez0.zzc(zzgnh0.zzf());
                    return zzgez0.zze();
                }
                catch(zzgyg unused_ex) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
                }
            }
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
        }, zzgvo0, zzgnh.class);
    }

    // 检测为 Lambda 实现
    public static zzgfb zza(zzgnh zzgnh0, zzgeo zzgeo0) [...]

    // 去混淆评级： 中等(80)
    // 检测为 Lambda 实现
    public static zzgfk zzb(zzgni zzgni0) [...]

    // 检测为 Lambda 实现
    public static zzgnh zzc(zzgfb zzgfb0, zzgeo zzgeo0) [...]

    // 检测为 Lambda 实现
    public static zzgni zzd(zzgfk zzgfk0) [...]

    public static void zze(zzgmk zzgmk0) throws GeneralSecurityException {
        zzgmk0.zzi(zzgiw.zzc);
        zzgmk0.zzh(zzgiw.zzd);
        zzgmk0.zzg(zzgiw.zze);
        zzgmk0.zzf(zzgiw.zzf);
    }

    private static zzgfh zzf(zzgry zzgry0) throws GeneralSecurityException {
        switch(zzgry0.ordinal()) {
            case 1: {
                return zzgfh.zza;
            }
            case 2: {
                return zzgfh.zzd;
            }
            case 3: {
                return zzgfh.zzc;
            }
            case 4: {
                return zzgfh.zze;
            }
            case 5: {
                return zzgfh.zzb;
            }
            default: {
                throw new GeneralSecurityException("Unable to parse HashType: " + zzgry0.zza());
            }
        }
    }

    private static zzgfi zzg(zzgtp zzgtp0) throws GeneralSecurityException {
        switch(zzgtp0.ordinal()) {
            case 1: {
                return zzgfi.zza;
            }
            case 3: {
                return zzgfi.zzc;
            }
            case 2: 
            case 4: {
                return zzgfi.zzb;
            }
            default: {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgtp0.zza());
            }
        }
    }

    private static zzgsh zzh(zzgfk zzgfk0) throws GeneralSecurityException {
        zzgry zzgry0;
        zzgsf zzgsf0 = zzgsh.zzc();
        zzgsf0.zzb(zzgfk0.zze());
        zzgfh zzgfh0 = zzgfk0.zzg();
        if(zzgfh.zza.equals(zzgfh0)) {
            zzgry0 = zzgry.zzb;
        }
        else {
            if(zzgfh.zzb.equals(zzgfh0)) {
                zzgry0 = zzgry.zzf;
                zzgsf0.zza(zzgry0);
                return (zzgsh)zzgsf0.zzbn();
            }
            if(zzgfh.zzc.equals(zzgfh0)) {
                zzgry0 = zzgry.zzd;
                zzgsf0.zza(zzgry0);
                return (zzgsh)zzgsf0.zzbn();
            }
            if(zzgfh.zzd.equals(zzgfh0)) {
                zzgry0 = zzgry.zzc;
            }
            else if(zzgfh.zze.equals(zzgfh0)) {
                zzgry0 = zzgry.zze;
            }
            else {
                throw new GeneralSecurityException("Unable to serialize HashType " + zzgfh0);
            }
        }
        zzgsf0.zza(zzgry0);
        return (zzgsh)zzgsf0.zzbn();
    }

    private static zzgtp zzi(zzgfi zzgfi0) throws GeneralSecurityException {
        if(zzgfi.zza.equals(zzgfi0)) {
            return zzgtp.zzb;
        }
        if(zzgfi.zzb.equals(zzgfi0)) {
            return zzgtp.zze;
        }
        if(!zzgfi.zzc.equals(zzgfi0)) {
            throw new GeneralSecurityException("Unable to serialize variant: " + zzgfi0);
        }
        return zzgtp.zzd;
    }
}

