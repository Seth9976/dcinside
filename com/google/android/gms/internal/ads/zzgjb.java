package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzgjb {
    public static final int zza;
    private static final zzgvo zzb;
    private static final zzgmt zzc;
    private static final zzgmp zzd;
    private static final zzglh zze;
    private static final zzgld zzf;

    static {
        zzgvo zzgvo0 = zzgnu.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzgjb.zzb = zzgvo0;
        zzgjb.zzc = zzgmt.zzb((zzgfu zzgfu0) -> {
            zzgsn zzgsn0 = zzgsp.zza();
            zzgsn0.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
            zzgra zzgra0 = zzgrc.zzb();
            zzgra0.zzb(zzgjb.zzg(zzgfu0));
            zzgra0.zza(zzgfu0.zzc());
            zzgsn0.zzc(((zzgrc)zzgra0.zzbn()).zzaN());
            zzgsn0.zza(zzgjb.zzh(zzgfu0.zze()));
            return zzgni.zzb(((zzgsp)zzgsn0.zzbn()));
        }, zzgfu.class, zzgni.class);
        zzgjb.zzd = zzgmp.zzb((zzgni zzgni0) -> // 去混淆评级： 中等(80)
        throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: "), zzgvo0, zzgni.class);
        zzgjb.zze = zzglh.zzb((zzgfn zzgfn0, zzgeo zzgeo0) -> {
            zzgqx zzgqx0 = zzgqz.zzb();
            zzgqx0.zzb(zzgjb.zzg(zzgfn0.zzb()));
            byte[] arr_b = zzgfn0.zzd().zzd(zzgeo0);
            zzgqx0.zza(zzgwj.zzv(arr_b, 0, arr_b.length));
            zzgwj zzgwj0 = ((zzgqz)zzgqx0.zzbn()).zzaN();
            zzgtp zzgtp0 = zzgjb.zzh(zzgfn0.zzb().zze());
            return zzgnh.zza("type.googleapis.com/google.crypto.tink.AesEaxKey", zzgwj0, zzgsj.zzb, zzgtp0, zzgfn0.zze());
        }, zzgfn.class, zzgnh.class);
        zzgjb.zzf = zzgld.zzb((zzgnh zzgnh0, zzgeo zzgeo0) -> {
            if(zzgnh0.zzg().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                try {
                    zzgqz zzgqz0 = zzgqz.zzd(zzgnh0.zze(), zzgxb.zza());
                    if(zzgqz0.zza() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    zzgfr zzgfr0 = zzgfu.zzd();
                    zzgfr0.zzb(zzgqz0.zzg().zzd());
                    zzgfr0.zza(zzgqz0.zzf().zza());
                    zzgfr0.zzc(16);
                    zzgfr0.zzd(zzgjb.zzf(zzgnh0.zzc()));
                    zzgfu zzgfu0 = zzgfr0.zze();
                    zzgfl zzgfl0 = zzgfn.zza();
                    zzgfl0.zzc(zzgfu0);
                    zzgfl0.zzb(zzgvp.zzb(zzgqz0.zzg().zzA(), zzgeo0));
                    zzgfl0.zza(zzgnh0.zzf());
                    return zzgfl0.zzd();
                }
                catch(zzgyg unused_ex) {
                    throw new GeneralSecurityException("Parsing AesEaxcKey failed");
                }
            }
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
        }, zzgvo0, zzgnh.class);
    }

    // 检测为 Lambda 实现
    public static zzgfn zza(zzgnh zzgnh0, zzgeo zzgeo0) [...]

    // 去混淆评级： 中等(80)
    // 检测为 Lambda 实现
    public static zzgfu zzb(zzgni zzgni0) [...]

    // 检测为 Lambda 实现
    public static zzgnh zzc(zzgfn zzgfn0, zzgeo zzgeo0) [...]

    // 检测为 Lambda 实现
    public static zzgni zzd(zzgfu zzgfu0) [...]

    public static void zze(zzgmk zzgmk0) throws GeneralSecurityException {
        zzgmk0.zzi(zzgjb.zzc);
        zzgmk0.zzh(zzgjb.zzd);
        zzgmk0.zzg(zzgjb.zze);
        zzgmk0.zzf(zzgjb.zzf);
    }

    private static zzgfs zzf(zzgtp zzgtp0) throws GeneralSecurityException {
        switch(zzgtp0.ordinal()) {
            case 1: {
                return zzgfs.zza;
            }
            case 3: {
                return zzgfs.zzc;
            }
            case 2: 
            case 4: {
                return zzgfs.zzb;
            }
            default: {
                throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzgtp0.zza());
            }
        }
    }

    private static zzgrf zzg(zzgfu zzgfu0) throws GeneralSecurityException {
        zzgrd zzgrd0 = zzgrf.zzb();
        zzgrd0.zza(zzgfu0.zzb());
        return (zzgrf)zzgrd0.zzbn();
    }

    private static zzgtp zzh(zzgfs zzgfs0) throws GeneralSecurityException {
        if(zzgfs.zza.equals(zzgfs0)) {
            return zzgtp.zzb;
        }
        if(zzgfs.zzb.equals(zzgfs0)) {
            return zzgtp.zze;
        }
        if(!zzgfs.zzc.equals(zzgfs0)) {
            throw new GeneralSecurityException("Unable to serialize variant: " + zzgfs0);
        }
        return zzgtp.zzd;
    }
}

