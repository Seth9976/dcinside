package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzgji {
    public static final int zza;
    private static final zzgvo zzb;
    private static final zzgmt zzc;
    private static final zzgmp zzd;
    private static final zzglh zze;
    private static final zzgld zzf;

    static {
        zzgvo zzgvo0 = zzgnu.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzgji.zzb = zzgvo0;
        zzgji.zzc = zzgmt.zzb((zzggf zzggf0) -> {
            zzgsn zzgsn0 = zzgsp.zza();
            zzgsn0.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
            zzgrj zzgrj0 = zzgrl.zzc();
            zzgrj0.zza(zzggf0.zzb());
            zzgsn0.zzc(((zzgrl)zzgrj0.zzbn()).zzaN());
            zzgsn0.zza(zzgji.zzg(zzggf0.zzd()));
            return zzgni.zzb(((zzgsp)zzgsn0.zzbn()));
        }, zzggf.class, zzgni.class);
        zzgji.zzd = zzgmp.zzb((zzgni zzgni0) -> // 去混淆评级： 中等(80)
        throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: "), zzgvo0, zzgni.class);
        zzgji.zze = zzglh.zzb((zzgfx zzgfx0, zzgeo zzgeo0) -> {
            zzgrg zzgrg0 = zzgri.zzb();
            byte[] arr_b = zzgfx0.zzd().zzd(zzgeo0);
            zzgrg0.zza(zzgwj.zzv(arr_b, 0, arr_b.length));
            zzgwj zzgwj0 = ((zzgri)zzgrg0.zzbn()).zzaN();
            zzgtp zzgtp0 = zzgji.zzg(zzgfx0.zzb().zzd());
            return zzgnh.zza("type.googleapis.com/google.crypto.tink.AesGcmKey", zzgwj0, zzgsj.zzb, zzgtp0, zzgfx0.zze());
        }, zzgfx.class, zzgnh.class);
        zzgji.zzf = zzgld.zzb((zzgnh zzgnh0, zzgeo zzgeo0) -> {
            if(zzgnh0.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                try {
                    zzgri zzgri0 = zzgri.zzd(zzgnh0.zze(), zzgxb.zza());
                    if(zzgri0.zza() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    zzggc zzggc0 = zzggf.zzc();
                    zzggc0.zzb(zzgri0.zzf().zzd());
                    zzggc0.zza(12);
                    zzggc0.zzc(16);
                    zzggc0.zzd(zzgji.zzf(zzgnh0.zzc()));
                    zzggf zzggf0 = zzggc0.zze();
                    zzgfv zzgfv0 = zzgfx.zza();
                    zzgfv0.zzc(zzggf0);
                    zzgfv0.zzb(zzgvp.zzb(zzgri0.zzf().zzA(), zzgeo0));
                    zzgfv0.zza(zzgnh0.zzf());
                    return zzgfv0.zzd();
                }
                catch(zzgyg unused_ex) {
                    throw new GeneralSecurityException("Parsing AesGcmKey failed");
                }
            }
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
        }, zzgvo0, zzgnh.class);
    }

    // 检测为 Lambda 实现
    public static zzgfx zza(zzgnh zzgnh0, zzgeo zzgeo0) [...]

    // 去混淆评级： 中等(80)
    // 检测为 Lambda 实现
    public static zzggf zzb(zzgni zzgni0) [...]

    // 检测为 Lambda 实现
    public static zzgnh zzc(zzgfx zzgfx0, zzgeo zzgeo0) [...]

    // 检测为 Lambda 实现
    public static zzgni zzd(zzggf zzggf0) [...]

    public static void zze(zzgmk zzgmk0) throws GeneralSecurityException {
        zzgmk0.zzi(zzgji.zzc);
        zzgmk0.zzh(zzgji.zzd);
        zzgmk0.zzg(zzgji.zze);
        zzgmk0.zzf(zzgji.zzf);
    }

    private static zzggd zzf(zzgtp zzgtp0) throws GeneralSecurityException {
        switch(zzgtp0.ordinal()) {
            case 1: {
                return zzggd.zza;
            }
            case 3: {
                return zzggd.zzc;
            }
            case 2: 
            case 4: {
                return zzggd.zzb;
            }
            default: {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgtp0.zza());
            }
        }
    }

    private static zzgtp zzg(zzggd zzggd0) throws GeneralSecurityException {
        if(zzggd.zza.equals(zzggd0)) {
            return zzgtp.zzb;
        }
        if(zzggd.zzb.equals(zzggd0)) {
            return zzgtp.zze;
        }
        if(!zzggd.zzc.equals(zzggd0)) {
            throw new GeneralSecurityException("Unable to serialize variant: " + zzggd0);
        }
        return zzgtp.zzd;
    }
}

