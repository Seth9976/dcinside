package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

public final class zzgvl implements zzgej {
    private static final byte[] zza;
    private final zzgpy zzb;
    private final int zzc;
    private final byte[] zzd;
    private final byte[] zze;

    static {
        zzgvl.zza = new byte[]{0};
    }

    private zzgvl(zzgnx zzgnx0) throws GeneralSecurityException {
        this.zzb = new zzgvi(zzgnx0.zzd().zzd(zzgdw.zza()));
        this.zzc = zzgnx0.zzb().zzb();
        this.zzd = zzgnx0.zzc().zzc();
        if(zzgnx0.zzb().zzf().equals(zzgod.zzc)) {
            this.zze = Arrays.copyOf(zzgvl.zza, 1);
            return;
        }
        this.zze = new byte[0];
    }

    private zzgvl(zzgom zzgom0) throws GeneralSecurityException {
        this.zzb = new zzgvk("HMAC" + zzgom0.zzb().zzf(), new SecretKeySpec(zzgom0.zzd().zzd(zzgdw.zza()), "HMAC"));
        this.zzc = zzgom0.zzb().zzb();
        this.zzd = zzgom0.zzc().zzc();
        if(zzgom0.zzb().zzg().equals(zzgou.zzc)) {
            this.zze = Arrays.copyOf(zzgvl.zza, 1);
            return;
        }
        this.zze = new byte[0];
    }

    public zzgvl(zzgpy zzgpy0, int v) throws GeneralSecurityException {
        this.zzb = zzgpy0;
        this.zzc = v;
        this.zzd = new byte[0];
        this.zze = new byte[0];
        zzgpy0.zza(new byte[0], v);
    }

    public static zzgej zza(zzgnx zzgnx0) throws GeneralSecurityException {
        return new zzgvl(zzgnx0);
    }

    public static zzgej zzb(zzgom zzgom0) throws GeneralSecurityException {
        return new zzgvl(zzgom0);
    }

    public final byte[] zzc(byte[] arr_b) throws GeneralSecurityException {
        byte[] arr_b1 = this.zze;
        if(arr_b1.length > 0) {
            byte[] arr_b2 = zzguo.zzb(new byte[][]{arr_b, arr_b1});
            byte[] arr_b3 = this.zzb.zza(arr_b2, this.zzc);
            return zzguo.zzb(new byte[][]{this.zzd, arr_b3});
        }
        byte[] arr_b4 = this.zzb.zza(arr_b, this.zzc);
        return zzguo.zzb(new byte[][]{this.zzd, arr_b4});
    }
}

