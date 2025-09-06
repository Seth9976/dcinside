package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzgkp {
    public static final int zza;
    private static final zzgvo zzb;
    private static final zzgmt zzc;
    private static final zzgmp zzd;
    private static final zzglh zze;
    private static final zzgld zzf;

    static {
        zzgvo zzgvo0 = zzgnu.zzb("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zzgkp.zzb = zzgvo0;
        zzgkp.zzc = zzgmt.zzb((zzgir zzgir0) -> {
            zzgsn zzgsn0 = zzgsp.zza();
            zzgsn0.zzb("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
            zzgsn0.zzc(zzguh.zzc().zzaN());
            zzgsn0.zza(zzgkp.zzg(zzgir0.zzb()));
            return zzgni.zzb(((zzgsp)zzgsn0.zzbn()));
        }, zzgir.class, zzgni.class);
        zzgkp.zzd = zzgmp.zzb((zzgni zzgni0) -> // 去混淆评级： 中等(80)
        throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: "), zzgvo0, zzgni.class);
        zzgkp.zze = zzglh.zzb((zzgil zzgil0, zzgeo zzgeo0) -> {
            zzguc zzguc0 = zzgue.zzb();
            byte[] arr_b = zzgil0.zzd().zzd(zzgeo0);
            zzguc0.zza(zzgwj.zzv(arr_b, 0, arr_b.length));
            zzgwj zzgwj0 = ((zzgue)zzguc0.zzbn()).zzaN();
            zzgtp zzgtp0 = zzgkp.zzg(zzgil0.zzb().zzb());
            return zzgnh.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", zzgwj0, zzgsj.zzb, zzgtp0, zzgil0.zze());
        }, zzgil.class, zzgnh.class);
        zzgkp.zzf = zzgld.zzb((zzgnh zzgnh0, zzgeo zzgeo0) -> {
            if(zzgnh0.zzg().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                try {
                    zzgue zzgue0 = zzgue.zzd(zzgnh0.zze(), zzgxb.zza());
                    if(zzgue0.zza() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    return zzgil.zza(zzgkp.zzf(zzgnh0.zzc()), zzgvp.zzb(zzgue0.zzf().zzA(), zzgeo0), zzgnh0.zzf());
                }
                catch(zzgyg unused_ex) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
                }
            }
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
        }, zzgvo0, zzgnh.class);
    }

    // 检测为 Lambda 实现
    public static zzgil zza(zzgnh zzgnh0, zzgeo zzgeo0) [...]

    // 去混淆评级： 中等(80)
    // 检测为 Lambda 实现
    public static zzgir zzb(zzgni zzgni0) [...]

    // 检测为 Lambda 实现
    public static zzgnh zzc(zzgil zzgil0, zzgeo zzgeo0) [...]

    // 检测为 Lambda 实现
    public static zzgni zzd(zzgir zzgir0) [...]

    public static void zze(zzgmk zzgmk0) throws GeneralSecurityException {
        zzgmk0.zzi(zzgkp.zzc);
        zzgmk0.zzh(zzgkp.zzd);
        zzgmk0.zzg(zzgkp.zze);
        zzgmk0.zzf(zzgkp.zzf);
    }

    private static zzgiq zzf(zzgtp zzgtp0) throws GeneralSecurityException {
        switch(zzgtp0.ordinal()) {
            case 1: {
                return zzgiq.zza;
            }
            case 3: {
                return zzgiq.zzc;
            }
            case 2: 
            case 4: {
                return zzgiq.zzb;
            }
            default: {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgtp0.zza());
            }
        }
    }

    private static zzgtp zzg(zzgiq zzgiq0) throws GeneralSecurityException {
        if(zzgiq.zza.equals(zzgiq0)) {
            return zzgtp.zzb;
        }
        if(zzgiq.zzb.equals(zzgiq0)) {
            return zzgtp.zze;
        }
        if(!zzgiq.zzc.equals(zzgiq0)) {
            throw new GeneralSecurityException("Unable to serialize variant: " + zzgiq0.toString());
        }
        return zzgtp.zzd;
    }
}

