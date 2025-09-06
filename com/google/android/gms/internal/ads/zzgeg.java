package com.google.android.gms.internal.ads;

import j..util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;

public final class zzgeg {
    private final zzgsx zza;
    private final List zzb;
    private final zzglo zzc;

    private zzgeg(zzgsx zzgsx0, List list0) {
        this.zza = zzgsx0;
        this.zzb = list0;
        this.zzc = zzglo.zza;
    }

    zzgeg(zzgsx zzgsx0, List list0, zzglo zzglo0, zzgef zzgef0) {
        this.zza = zzgsx0;
        this.zzb = list0;
        this.zzc = zzglo0;
    }

    @Override
    public final String toString() {
        zzgsy zzgsy0 = zzgtc.zza();
        zzgsy0.zzb(this.zza.zzb());
        for(Object object0: this.zza.zzh()) {
            zzgsz zzgsz0 = zzgta.zza();
            zzgsz0.zzc(((zzgsv)object0).zzb().zzg());
            zzgsz0.zzd(((zzgsv)object0).zzk());
            zzgsz0.zzb(((zzgsv)object0).zzf());
            zzgsz0.zza(((zzgsv)object0).zza());
            zzgsy0.zza(((zzgta)zzgsz0.zzbn()));
        }
        return ((zzgtc)zzgsy0.zzbn()).toString();
    }

    static final zzgeg zza(zzgsx zzgsx0) throws GeneralSecurityException {
        zzgeg.zzh(zzgsx0);
        return new zzgeg(zzgsx0, zzgeg.zzg(zzgsx0));
    }

    public static final zzgeg zzb(zzgek zzgek0) throws GeneralSecurityException {
        zzged zzged0 = new zzged();
        zzgeb zzgeb0 = new zzgeb(zzgek0, null);
        zzgeb0.zzd();
        zzgeb0.zzc();
        zzged0.zza(zzgeb0);
        return zzged0.zzb();
    }

    final zzgsx zzc() {
        return this.zza;
    }

    public final Object zzd(zzgdr zzgdr0, Class class0) throws GeneralSecurityException {
        Class class1 = ((zzgky)zzgdr0).zza(class0);
        if(class1 == null) {
            throw new GeneralSecurityException("No wrapper found for " + class0.getName());
        }
        return this.zzf(((zzgky)zzgdr0), class0, class1);
    }

    private final Object zzf(zzgky zzgky0, Class class0, Class class1) throws GeneralSecurityException {
        Object object1;
        int v = this.zza.zzb();
        int v2 = 0;
        boolean z = false;
        int v3 = 1;
        for(Object object0: this.zza.zzh()) {
            zzgsv zzgsv0 = (zzgsv)object0;
            if(zzgsv0.zzk() == 3) {
                if(!zzgsv0.zzj()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", zzgsv0.zza()));
                }
                if(zzgsv0.zzf() == zzgtp.zza) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", zzgsv0.zza()));
                }
                if(zzgsv0.zzk() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", zzgsv0.zza()));
                }
                if(zzgsv0.zza() == v) {
                    if(z) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z = true;
                }
                v3 &= (zzgsv0.zzb().zzb() == zzgsj.zzd ? 1 : 0);
                ++v2;
            }
        }
        if(v2 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if(!z && v3 == 0) {
            throw new GeneralSecurityException("keyset doesn\'t contain a valid primary key");
        }
        zzgnc zzgnc0 = zzgnf.zzb(class1);
        zzgnc0.zzc(this.zzc);
        for(int v1 = 0; v1 < this.zzb.size(); ++v1) {
            zzgsv zzgsv1 = this.zza.zzd(v1);
            if(zzgsv1.zzk() == 3) {
                zzgee zzgee0 = (zzgee)this.zzb.get(v1);
                if(zzgee0 == null) {
                    throw new GeneralSecurityException("Key parsing of key with index " + v1 + " and type_url " + "" + " failed, unable to get primitive");
                }
                zzgdx zzgdx0 = zzgee0.zza();
                try {
                    object1 = zzgky0.zzb(zzgdx0, class1);
                }
                catch(GeneralSecurityException generalSecurityException0) {
                    throw new GeneralSecurityException("Unable to get primitive " + class1.toString() + " for key of type " + "" + ", see https://developers.google.com/tink/faq/registration_errors", generalSecurityException0);
                }
                if(zzgsv1.zza() == this.zza.zzb()) {
                    zzgnc0.zzb(object1, zzgdx0, zzgsv1);
                }
                else {
                    zzgnc0.zza(object1, zzgdx0, zzgsv1);
                }
                continue;
            }
        }
        return zzgky0.zzc(zzgnc0.zzd(), class0);
    }

    private static List zzg(zzgsx zzgsx0) {
        zzgdz zzgdz0;
        ArrayList arrayList0 = new ArrayList(zzgsx0.zza());
        for(Object object0: zzgsx0.zzh()) {
            zzgsv zzgsv0 = (zzgsv)object0;
            int v = zzgsv0.zza();
            try {
                zzgnh zzgnh0 = zzgnh.zza("", zzgsv0.zzb().zzf(), zzgsv0.zzb().zzb(), zzgsv0.zzf(), (zzgsv0.zzf() == zzgtp.zzd ? null : zzgsv0.zza()));
                zzgmk zzgmk0 = zzgmk.zzc();
                zzgeo zzgeo0 = zzgeo.zza();
                zzgdx zzgdx0 = zzgmk0.zzj(zzgnh0) ? zzgmk0.zza(zzgnh0, zzgeo0) : new zzglk(zzgnh0, zzgeo0);
                switch(zzgsv0.zzk() - 2) {
                    case 1: {
                        zzgdz0 = zzgdz.zza;
                        break;
                    }
                    case 2: {
                        zzgdz0 = zzgdz.zzb;
                        break;
                    }
                    case 3: {
                        zzgdz0 = zzgdz.zzc;
                        break;
                    }
                    default: {
                        goto label_22;
                    }
                }
                arrayList0.add(new zzgee(zzgdx0, zzgdz0, v, v == zzgsx0.zzb(), null));
                continue;
            }
            catch(GeneralSecurityException unused_ex) {
            }
        label_22:
            arrayList0.add(null);
        }
        return DesugarCollections.unmodifiableList(arrayList0);
    }

    private static void zzh(zzgsx zzgsx0) throws GeneralSecurityException {
        if(zzgsx0 == null || zzgsx0.zza() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }
}

