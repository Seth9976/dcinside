package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

final class zzghl {
    public static final int zza;
    private static final zzgvo zzb;
    private static final zzgmt zzc;
    private static final zzgmp zzd;
    private static final zzglh zze;
    private static final zzgld zzf;

    static {
        zzgvo zzgvo0 = zzgnu.zzb("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zzghl.zzb = zzgvo0;
        zzghl.zzc = zzgmt.zzb((zzghg zzghg0) -> {
            zzgsn zzgsn0 = zzgsp.zza();
            zzgsn0.zzb("type.googleapis.com/google.crypto.tink.KmsAeadKey");
            zzgtg zzgtg0 = zzgti.zza();
            zzgtg0.zza(zzghg0.zzd());
            zzgsn0.zzc(((zzgti)zzgtg0.zzbn()).zzaN());
            zzgsn0.zza(zzghl.zzg(zzghg0.zzb()));
            return zzgni.zzb(((zzgsp)zzgsn0.zzbn()));
        }, zzghg.class, zzgni.class);
        zzghl.zzd = zzgmp.zzb((zzgni zzgni0) -> // 去混淆评级： 中等(100)
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: "), zzgvo0, zzgni.class);
        zzghl.zze = zzglh.zzb((zzghe zzghe0, zzgeo zzgeo0) -> {
            zzgtd zzgtd0 = zzgtf.zzb();
            zzgtg zzgtg0 = zzgti.zza();
            zzgtg0.zza(zzghe0.zzb().zzd());
            zzgtd0.zza(((zzgti)zzgtg0.zzbn()));
            zzgwj zzgwj0 = ((zzgtf)zzgtd0.zzbn()).zzaN();
            zzgtp zzgtp0 = zzghl.zzg(zzghe0.zzb().zzb());
            return zzgnh.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey", zzgwj0, zzgsj.zze, zzgtp0, zzghe0.zzd());
        }, zzghe.class, zzgnh.class);
        zzghl.zzf = zzgld.zzb((zzgnh zzgnh0, zzgeo zzgeo0) -> {
            if(!zzgnh0.zzg().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
            }
            try {
                zzgtf zzgtf0 = zzgtf.zzd(zzgnh0.zze(), zzgxb.zza());
                if(zzgtf0.zza() != 0) {
                    throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got " + zzgtf0);
                }
                return zzghe.zza(zzghg.zzc("", zzghl.zzf(zzgnh0.zzc())), zzgnh0.zzf());
            }
            catch(zzgyg zzgyg0) {
            }
            throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", zzgyg0);
        }, zzgvo0, zzgnh.class);
    }

    // 检测为 Lambda 实现
    public static zzghe zza(zzgnh zzgnh0, zzgeo zzgeo0) [...]

    // 去混淆评级： 中等(100)
    // 检测为 Lambda 实现
    public static zzghg zzb(zzgni zzgni0) [...]

    // 检测为 Lambda 实现
    public static zzgnh zzc(zzghe zzghe0, zzgeo zzgeo0) [...]

    // 检测为 Lambda 实现
    public static zzgni zzd(zzghg zzghg0) [...]

    public static void zze(zzgmk zzgmk0) throws GeneralSecurityException {
        zzgmk0.zzi(zzghl.zzc);
        zzgmk0.zzh(zzghl.zzd);
        zzgmk0.zzg(zzghl.zze);
        zzgmk0.zzf(zzghl.zzf);
    }

    private static zzghf zzf(zzgtp zzgtp0) throws GeneralSecurityException {
        switch(zzgtp0.ordinal()) {
            case 1: {
                return zzghf.zza;
            }
            case 3: {
                return zzghf.zzb;
            }
            default: {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgtp0.zza());
            }
        }
    }

    private static zzgtp zzg(zzghf zzghf0) throws GeneralSecurityException {
        if(zzghf.zza.equals(zzghf0)) {
            return zzgtp.zzb;
        }
        if(!zzghf.zzb.equals(zzghf0)) {
            throw new GeneralSecurityException("Unable to serialize variant: " + zzghf0.toString());
        }
        return zzgtp.zzd;
    }
}

