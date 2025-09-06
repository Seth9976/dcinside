package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzgpw {
    public static final int zza;
    private static final zzgvo zzb;
    private static final zzgkx zzc;
    private static final zzgkx zzd;
    private static final zzgmt zze;
    private static final zzgmp zzf;
    private static final zzglh zzg;
    private static final zzgld zzh;

    static {
        zzgvo zzgvo0 = zzgnu.zzb("type.googleapis.com/google.crypto.tink.HmacKey");
        zzgpw.zzb = zzgvo0;
        zzgkv zzgkv0 = zzgkx.zza();
        zzgkv0.zza(zzgtp.zzd, zzgou.zzd);
        zzgkv0.zza(zzgtp.zzb, zzgou.zza);
        zzgkv0.zza(zzgtp.zzc, zzgou.zzc);
        zzgkv0.zza(zzgtp.zze, zzgou.zzb);
        zzgpw.zzc = zzgkv0.zzb();
        zzgkv zzgkv1 = zzgkx.zza();
        zzgkv1.zza(zzgry.zzb, zzgot.zza);
        zzgkv1.zza(zzgry.zzf, zzgot.zzb);
        zzgkv1.zza(zzgry.zzd, zzgot.zzc);
        zzgkv1.zza(zzgry.zzc, zzgot.zzd);
        zzgkv1.zza(zzgry.zze, zzgot.zze);
        zzgpw.zzd = zzgkv1.zzb();
        zzgpw.zze = zzgmt.zzb((zzgow zzgow0) -> {
            zzgsn zzgsn0 = zzgsp.zza();
            zzgsn0.zzb("type.googleapis.com/google.crypto.tink.HmacKey");
            zzgsc zzgsc0 = zzgse.zzc();
            zzgsc0.zzb(zzgpw.zzf(zzgow0));
            zzgsc0.zza(zzgow0.zzc());
            zzgsn0.zzc(((zzgse)zzgsc0.zzbn()).zzaN());
            zzgsn0.zza(((zzgtp)zzgpw.zzc.zzb(zzgow0.zzg())));
            return zzgni.zzb(((zzgsp)zzgsn0.zzbn()));
        }, zzgow.class, zzgni.class);
        zzgpw.zzf = zzgmp.zzb((zzgni zzgni0) -> // 去混淆评级： 中等(80)
        throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: "), zzgvo0, zzgni.class);
        zzgpw.zzg = zzglh.zzb((zzgom zzgom0, zzgeo zzgeo0) -> {
            zzgrz zzgrz0 = zzgsb.zzb();
            zzgrz0.zzb(zzgpw.zzf(zzgom0.zzb()));
            byte[] arr_b = zzgom0.zzd().zzd(zzgeo0);
            zzgrz0.zza(zzgwj.zzv(arr_b, 0, arr_b.length));
            zzgwj zzgwj0 = ((zzgsb)zzgrz0.zzbn()).zzaN();
            zzgtp zzgtp0 = (zzgtp)zzgpw.zzc.zzb(zzgom0.zzb().zzg());
            return zzgnh.zza("type.googleapis.com/google.crypto.tink.HmacKey", zzgwj0, zzgsj.zzb, zzgtp0, zzgom0.zze());
        }, zzgom.class, zzgnh.class);
        zzgpw.zzh = zzgld.zzb((zzgnh zzgnh0, zzgeo zzgeo0) -> {
            if(zzgnh0.zzg().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                try {
                    zzgsb zzgsb0 = zzgsb.zzf(zzgnh0.zze(), zzgxb.zza());
                    if(zzgsb0.zza() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    zzgos zzgos0 = zzgow.zze();
                    zzgos0.zzb(zzgsb0.zzh().zzd());
                    zzgos0.zzc(zzgsb0.zzg().zza());
                    zzgry zzgry0 = zzgsb0.zzg().zzb();
                    zzgos0.zza(((zzgot)zzgpw.zzd.zzc(zzgry0)));
                    zzgos0.zzd(((zzgou)zzgpw.zzc.zzc(zzgnh0.zzc())));
                    zzgow zzgow0 = zzgos0.zze();
                    zzgok zzgok0 = zzgom.zza();
                    zzgok0.zzc(zzgow0);
                    zzgok0.zzb(zzgvp.zzb(zzgsb0.zzh().zzA(), zzgeo0));
                    zzgok0.zza(zzgnh0.zzf());
                    return zzgok0.zzd();
                }
                catch(zzgyg | IllegalArgumentException unused_ex) {
                    throw new GeneralSecurityException("Parsing HmacKey failed");
                }
            }
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }, zzgvo0, zzgnh.class);
    }

    // 检测为 Lambda 实现
    public static zzgnh zza(zzgom zzgom0, zzgeo zzgeo0) [...]

    // 检测为 Lambda 实现
    public static zzgni zzb(zzgow zzgow0) [...]

    // 检测为 Lambda 实现
    public static zzgom zzc(zzgnh zzgnh0, zzgeo zzgeo0) [...]

    // 去混淆评级： 中等(80)
    // 检测为 Lambda 实现
    public static zzgow zzd(zzgni zzgni0) [...]

    public static void zze(zzgmk zzgmk0) throws GeneralSecurityException {
        zzgmk0.zzi(zzgpw.zze);
        zzgmk0.zzh(zzgpw.zzf);
        zzgmk0.zzg(zzgpw.zzg);
        zzgmk0.zzf(zzgpw.zzh);
    }

    private static zzgsh zzf(zzgow zzgow0) throws GeneralSecurityException {
        zzgsf zzgsf0 = zzgsh.zzc();
        zzgsf0.zzb(zzgow0.zzb());
        zzgsf0.zza(((zzgry)zzgpw.zzd.zzb(zzgow0.zzf())));
        return (zzgsh)zzgsf0.zzbn();
    }
}

