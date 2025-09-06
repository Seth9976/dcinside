package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public final class zzged {
    private final List zza;
    private final zzglo zzb;
    private boolean zzc;

    public zzged() {
        this.zza = new ArrayList();
        this.zzb = zzglo.zza;
        this.zzc = false;
    }

    public final zzged zza(zzgeb zzgeb0) {
        if(zzgeb0.zzf != null) {
            throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        }
        if(zzgeb0.zza) {
            this.zzd();
        }
        zzgeb0.zzf = this;
        this.zza.add(zzgeb0);
        return this;
    }

    public final zzgeg zzb() throws GeneralSecurityException {
        int v3;
        if(this.zzc) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        this.zzc = true;
        zzgst zzgst0 = zzgsx.zzc();
        ArrayList arrayList0 = new ArrayList(this.zza.size());
        List list0 = this.zza;
        for(int v = 0; v < list0.size() - 1; ++v) {
            if(((zzgeb)list0.get(v)).zze == zzgec.zza && ((zzgeb)list0.get(v + 1)).zze != zzgec.zza) {
                throw new GeneralSecurityException("Entries with \'withRandomId()\' may only be followed by other entries with \'withRandomId()\'.");
            }
        }
        HashSet hashSet0 = new HashSet();
        Integer integer0 = null;
        for(Object object0: this.zza) {
            zzgeb zzgeb0 = (zzgeb)object0;
            if(zzgeb0.zze == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            if(zzgeb0.zze == zzgec.zza) {
                int v1;
                for(v1 = 0; v1 == 0 || hashSet0.contains(v1); v1 = v2) {
                    SecureRandom secureRandom0 = new SecureRandom();
                    byte[] arr_b = new byte[4];
                    int v2;
                    for(v2 = 0; v2 == 0; v2 = (arr_b[2] & 0xFF) << 8 | ((arr_b[0] & 0xFF) << 24 | (arr_b[1] & 0xFF) << 16) | arr_b[3] & 0xFF) {
                        secureRandom0.nextBytes(arr_b);
                    }
                }
            }
            else {
                v1 = 0;
            }
            Integer integer1 = v1;
            if(hashSet0.contains(integer1)) {
                throw new GeneralSecurityException("Id " + v1 + " is used twice in the keyset");
            }
            hashSet0.add(integer1);
            zzgdx zzgdx0 = zzgma.zzb().zza(zzgeb0.zzd, (zzgeb0.zzd.zza() ? integer1 : null));
            zzgee zzgee0 = new zzgee(zzgdx0, zzgeb0.zzb, v1, zzgeb0.zza, null);
            zzgdz zzgdz0 = zzgeb0.zzb;
            zzgnh zzgnh0 = (zzgnh)zzgmk.zzc().zzd(zzgdx0, zzgnh.class, zzgeo.zza());
            Integer integer2 = zzgnh0.zzf();
            if(integer2 != null && ((int)integer2) != v1) {
                throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
            }
            zzgdz zzgdz1 = zzgdz.zza;
            if(zzgdz1.equals(zzgdz0)) {
                v3 = 3;
            }
            else if(zzgdz.zzb.equals(zzgdz0)) {
                v3 = 4;
            }
            else {
                if(!zzgdz.zzc.equals(zzgdz0)) {
                    throw new IllegalStateException("Unknown key status");
                }
                v3 = 5;
            }
            zzgsu zzgsu0 = zzgsv.zzc();
            zzgsi zzgsi0 = zzgsl.zza();
            zzgsi0.zzb(zzgnh0.zzg());
            zzgsi0.zzc(zzgnh0.zze());
            zzgsi0.zza(zzgnh0.zzb());
            zzgsu0.zza(zzgsi0);
            zzgsu0.zzd(v3);
            zzgsu0.zzb(v1);
            zzgsu0.zzc(zzgnh0.zzc());
            zzgst0.zza(((zzgsv)zzgsu0.zzbn()));
            if(zzgeb0.zza) {
                if(integer0 != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                if(zzgeb0.zzb != zzgdz1) {
                    throw new GeneralSecurityException("Primary key is not enabled");
                }
                integer0 = integer1;
            }
            arrayList0.add(zzgee0);
        }
        if(integer0 == null) {
            throw new GeneralSecurityException("No primary was set");
        }
        zzgst0.zzb(((int)integer0));
        zzgsx zzgsx0 = (zzgsx)zzgst0.zzbn();
        zzgeg.zzh(zzgsx0);
        return new zzgeg(zzgsx0, arrayList0, this.zzb, null);
    }

    private final void zzd() {
        for(Object object0: this.zza) {
            zzgeb.zzi(((zzgeb)object0), false);
        }
    }
}

