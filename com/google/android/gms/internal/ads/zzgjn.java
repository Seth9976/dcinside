package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzgjn {
    public static final int zza;
    private static final zzgvo zzb;
    private static final zzgmt zzc;
    private static final zzgmp zzd;
    private static final zzglh zze;
    private static final zzgld zzf;

    static {
        zzgvo zzgvo0 = zzgnu.zzb("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzgjn.zzb = zzgvo0;
        zzgjn.zzc = zzgmt.zzb((zzggq zzggq0) -> {
            zzgsn zzgsn0 = zzgsp.zza();
            zzgsn0.zzb("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
            zzgrp zzgrp0 = zzgrr.zzc();
            zzgrp0.zza(zzggq0.zzb());
            zzgsn0.zzc(((zzgrr)zzgrp0.zzbn()).zzaN());
            zzgsn0.zza(zzgjn.zzg(zzggq0.zzd()));
            return zzgni.zzb(((zzgsp)zzgsn0.zzbn()));
        }, zzggq.class, zzgni.class);
        zzgjn.zzd = zzgmp.zzb((zzgni zzgni0) -> // 去混淆评级： 中等(80)
        throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: "), zzgvo0, zzgni.class);
        zzgjn.zze = zzglh.zzb((zzggi zzggi0, zzgeo zzgeo0) -> {
            zzgrm zzgrm0 = zzgro.zzb();
            byte[] arr_b = zzggi0.zzd().zzd(zzgeo0);
            zzgrm0.zza(zzgwj.zzv(arr_b, 0, arr_b.length));
            zzgwj zzgwj0 = ((zzgro)zzgrm0.zzbn()).zzaN();
            zzgtp zzgtp0 = zzgjn.zzg(zzggi0.zzb().zzd());
            return zzgnh.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey", zzgwj0, zzgsj.zzb, zzgtp0, zzggi0.zze());
        }, zzggi.class, zzgnh.class);
        zzgjn.zzf = zzgld.zzb((zzgnh zzgnh0, zzgeo zzgeo0) -> {
            if(zzgnh0.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                try {
                    zzgro zzgro0 = zzgro.zzd(zzgnh0.zze(), zzgxb.zza());
                    if(zzgro0.zza() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    zzggn zzggn0 = zzggq.zzc();
                    zzggn0.zza(zzgro0.zzf().zzd());
                    zzggn0.zzb(zzgjn.zzf(zzgnh0.zzc()));
                    zzggq zzggq0 = zzggn0.zzc();
                    zzggg zzggg0 = zzggi.zza();
                    zzggg0.zzc(zzggq0);
                    zzggg0.zzb(zzgvp.zzb(zzgro0.zzf().zzA(), zzgeo0));
                    zzggg0.zza(zzgnh0.zzf());
                    return zzggg0.zzd();
                }
                catch(zzgyg unused_ex) {
                    throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
                }
            }
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
        }, zzgvo0, zzgnh.class);
    }

    // 检测为 Lambda 实现
    public static zzggi zza(zzgnh zzgnh0, zzgeo zzgeo0) [...]

    // 去混淆评级： 中等(80)
    // 检测为 Lambda 实现
    public static zzggq zzb(zzgni zzgni0) [...]

    // 检测为 Lambda 实现
    public static zzgnh zzc(zzggi zzggi0, zzgeo zzgeo0) [...]

    // 检测为 Lambda 实现
    public static zzgni zzd(zzggq zzggq0) [...]

    public static void zze(zzgmk zzgmk0) throws GeneralSecurityException {
        zzgmk0.zzi(zzgjn.zzc);
        zzgmk0.zzh(zzgjn.zzd);
        zzgmk0.zzg(zzgjn.zze);
        zzgmk0.zzf(zzgjn.zzf);
    }

    private static zzggo zzf(zzgtp zzgtp0) throws GeneralSecurityException {
        switch(zzgtp0.ordinal()) {
            case 1: {
                return zzggo.zza;
            }
            case 3: {
                return zzggo.zzc;
            }
            case 2: 
            case 4: {
                return zzggo.zzb;
            }
            default: {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgtp0.zza());
            }
        }
    }

    private static zzgtp zzg(zzggo zzggo0) throws GeneralSecurityException {
        if(zzggo.zza.equals(zzggo0)) {
            return zzgtp.zzb;
        }
        if(zzggo.zzb.equals(zzggo0)) {
            return zzgtp.zze;
        }
        if(!zzggo.zzc.equals(zzggo0)) {
            throw new GeneralSecurityException("Unable to serialize variant: " + zzggo0);
        }
        return zzgtp.zzd;
    }
}

