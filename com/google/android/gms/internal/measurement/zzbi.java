package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

public final class zzbi extends zzay {
    protected zzbi() {
        this.zza.add(zzbv.zzy);
        this.zza.add(zzbv.zzz);
        this.zza.add(zzbv.zzaa);
        this.zza.add(zzbv.zzab);
        this.zza.add(zzbv.zzac);
        this.zza.add(zzbv.zzad);
        this.zza.add(zzbv.zzae);
        this.zza.add(zzbv.zzbj);
    }

    private static zzaq zza(zzbm zzbm0, zzaq zzaq0, zzaq zzaq1) {
        return zzbi.zza(zzbm0, zzaq0.zzh(), zzaq1);
    }

    private static zzaq zza(zzbm zzbm0, Iterator iterator0, zzaq zzaq0) {
        if(iterator0 != null) {
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                zzaq zzaq1 = zzbm0.zza(((zzaq)object0)).zza(((zzaf)zzaq0));
                if(zzaq1 instanceof zzaj) {
                    return (zzaj)zzaq1;
                }
                if(false) {
                    break;
                }
            }
        }
        return zzaq.zzc;
    }

    @Override  // com.google.android.gms.internal.measurement.zzay
    public final zzaq zza(String s, zzh zzh0, List list0) {
        switch(zzg.zza(s)) {
            case 1: {
                zzg.zza(zzbv.zzy, 3, list0);
                if(!(list0.get(0) instanceof zzas)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                }
                String s1 = ((zzaq)list0.get(0)).zzf();
                zzaq zzaq0 = zzh0.zza(((zzaq)list0.get(1)));
                zzaq zzaq1 = zzh0.zza(((zzaq)list0.get(2)));
                return zzbi.zza(new zzbp(zzh0, s1), zzaq0, zzaq1);
            }
            case 2: {
                zzg.zza(zzbv.zzz, 3, list0);
                if(!(list0.get(0) instanceof zzas)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                }
                String s2 = ((zzaq)list0.get(0)).zzf();
                zzaq zzaq2 = zzh0.zza(((zzaq)list0.get(1)));
                zzaq zzaq3 = zzh0.zza(((zzaq)list0.get(2)));
                return zzbi.zza(new zzbk(zzh0, s2), zzaq2, zzaq3);
            }
            case 3: {
                zzg.zza(zzbv.zzaa, 3, list0);
                if(!(list0.get(0) instanceof zzas)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                }
                String s3 = ((zzaq)list0.get(0)).zzf();
                zzaq zzaq4 = zzh0.zza(((zzaq)list0.get(1)));
                zzaq zzaq5 = zzh0.zza(((zzaq)list0.get(2)));
                return zzbi.zza(new zzbn(zzh0, s3), zzaq4, zzaq5);
            }
            case 4: {
                zzg.zza(zzbv.zzab, 4, list0);
                zzaq zzaq6 = zzh0.zza(((zzaq)list0.get(0)));
                if(!(zzaq6 instanceof zzaf)) {
                    throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                }
                zzaq zzaq7 = (zzaq)list0.get(1);
                zzaq zzaq8 = (zzaq)list0.get(2);
                zzaq zzaq9 = zzh0.zza(((zzaq)list0.get(3)));
                zzh zzh1 = zzh0.zza();
                for(int v = 0; v < ((zzaf)zzaq6).zzb(); ++v) {
                    String s4 = ((zzaf)zzaq6).zza(v).zzf();
                    zzh1.zzc(s4, zzh0.zza(s4));
                }
                while(zzh0.zza(zzaq7).zzd().booleanValue()) {
                    zzaq zzaq10 = zzh0.zza(((zzaf)zzaq9));
                    if(zzaq10 instanceof zzaj) {
                        return (zzaj)zzaq10;
                    }
                    zzh zzh2 = zzh0.zza();
                    for(int v1 = 0; v1 < ((zzaf)zzaq6).zzb(); ++v1) {
                        String s5 = ((zzaf)zzaq6).zza(v1).zzf();
                        zzh2.zzc(s5, zzh1.zza(s5));
                    }
                    zzh2.zza(zzaq8);
                    zzh1 = zzh2;
                }
                return zzaq.zzc;
            }
            case 5: {
                zzg.zza(zzbv.zzac, 3, list0);
                if(!(list0.get(0) instanceof zzas)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                }
                String s6 = ((zzaq)list0.get(0)).zzf();
                zzaq zzaq11 = zzh0.zza(((zzaq)list0.get(1)));
                zzaq zzaq12 = zzh0.zza(((zzaq)list0.get(2)));
                return zzbi.zzb(new zzbp(zzh0, s6), zzaq11, zzaq12);
            }
            case 6: {
                zzg.zza(zzbv.zzad, 3, list0);
                if(!(list0.get(0) instanceof zzas)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                }
                String s7 = ((zzaq)list0.get(0)).zzf();
                zzaq zzaq13 = zzh0.zza(((zzaq)list0.get(1)));
                zzaq zzaq14 = zzh0.zza(((zzaq)list0.get(2)));
                return zzbi.zzb(new zzbk(zzh0, s7), zzaq13, zzaq14);
            }
            case 7: {
                zzg.zza(zzbv.zzae, 3, list0);
                if(!(list0.get(0) instanceof zzas)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                }
                String s8 = ((zzaq)list0.get(0)).zzf();
                zzaq zzaq15 = zzh0.zza(((zzaq)list0.get(1)));
                zzaq zzaq16 = zzh0.zza(((zzaq)list0.get(2)));
                return zzbi.zzb(new zzbn(zzh0, s8), zzaq15, zzaq16);
            }
            case 8: {
                zzg.zza(zzbv.zzbj, 4, list0);
                zzaq zzaq17 = (zzaq)list0.get(0);
                zzaq zzaq18 = (zzaq)list0.get(1);
                zzaq zzaq19 = (zzaq)list0.get(2);
                zzaq zzaq20 = zzh0.zza(((zzaq)list0.get(3)));
                if(zzh0.zza(zzaq19).zzd().booleanValue()) {
                    zzaq zzaq21 = zzh0.zza(((zzaf)zzaq20));
                    if(zzaq21 instanceof zzaj) {
                        return (zzaj)zzaq21;
                    }
                }
                while(zzh0.zza(zzaq17).zzd().booleanValue()) {
                    zzaq zzaq22 = zzh0.zza(((zzaf)zzaq20));
                    if(zzaq22 instanceof zzaj) {
                        return (zzaj)zzaq22;
                    }
                    zzh0.zza(zzaq18);
                }
                return zzaq.zzc;
            }
            default: {
                return super.zza(s);
            }
        }
    }

    private static zzaq zzb(zzbm zzbm0, zzaq zzaq0, zzaq zzaq1) {
        if(!(zzaq0 instanceof Iterable)) {
            throw new IllegalArgumentException("Non-iterable type in for...of loop.");
        }
        return zzbi.zza(zzbm0, ((Iterable)zzaq0).iterator(), zzaq1);
    }
}

