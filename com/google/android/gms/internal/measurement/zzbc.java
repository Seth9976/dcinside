package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

public final class zzbc extends zzay {
    protected zzbc() {
        this.zza.add(zzbv.zzc);
        this.zza.add(zzbv.zzl);
        this.zza.add(zzbv.zzm);
        this.zza.add(zzbv.zzn);
        this.zza.add(zzbv.zzs);
        this.zza.add(zzbv.zzp);
        this.zza.add(zzbv.zzt);
        this.zza.add(zzbv.zzx);
        this.zza.add(zzbv.zzam);
        this.zza.add(zzbv.zzay);
        this.zza.add(zzbv.zzbb);
        this.zza.add(zzbv.zzbe);
        this.zza.add(zzbv.zzbf);
    }

    private static zzaq zza(zzh zzh0, List list0) {
        zzg.zzb(zzbv.zzx, 2, list0);
        zzaq zzaq0 = zzh0.zza(((zzaq)list0.get(0)));
        zzaq zzaq1 = zzh0.zza(((zzaq)list0.get(1)));
        if(!(zzaq1 instanceof zzaf)) {
            throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", zzaq1.getClass().getCanonicalName()));
        }
        List list1 = ((zzaf)zzaq1).zzi();
        List list2 = new ArrayList();
        if(list0.size() > 2) {
            list2 = list0.subList(2, list0.size());
        }
        return new zzar(zzaq0.zzf(), list1, list2, zzh0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzay
    public final zzaq zza(String s, zzh zzh0, List list0) {
        zzaq zzaq8;
        switch(zzg.zza(s)) {
            case 1: {
                zzg.zza(zzbv.zzc, 3, list0);
                zzaq zzaq0 = zzh0.zza(((zzaq)list0.get(0)));
                String s1 = zzh0.zza(((zzaq)list0.get(1))).zzf();
                zzaq zzaq1 = zzh0.zza(((zzaq)list0.get(2)));
                if(!(zzaq1 instanceof zzaf)) {
                    throw new IllegalArgumentException(String.format("Function arguments for Apply are not a list found %s", zzaq1.getClass().getCanonicalName()));
                }
                if(s1.isEmpty()) {
                    throw new IllegalArgumentException("Function name for apply is undefined");
                }
                return zzaq0.zza(s1, zzh0, ((zzaf)zzaq1).zzi());
            }
            case 2: {
                return zzh0.zza().zza(new zzaf(list0));
            }
            case 3: {
                zzg.zza(zzbv.zzm, 0, list0);
                return zzaq.zzf;
            }
            case 4: 
            case 5: {
                if(!list0.isEmpty()) {
                    zzaq zzaq2 = zzh0.zza(((zzaq)list0.get(0)));
                    return zzaq2 instanceof zzaf ? zzh0.zza(((zzaf)zzaq2)) : zzaq.zzc;
                }
                return zzaq.zzc;
            }
            case 6: {
                zzg.zza(zzbv.zzm, 0, list0);
                return zzaq.zze;
            }
            case 7: {
                zzg.zzb(zzbv.zzt, 2, list0);
                zzaq zzaq3 = (zzar)zzbc.zza(zzh0, list0);
                if(((zzal)zzaq3).zza() == null) {
                    zzh0.zzc("", zzaq3);
                    return zzaq3;
                }
                zzh0.zzc(((zzal)zzaq3).zza(), zzaq3);
                return zzaq3;
            }
            case 8: {
                return zzbc.zza(zzh0, list0);
            }
            case 9: {
                zzg.zzb(zzbv.zzam, 2, list0);
                zzaq zzaq4 = zzh0.zza(((zzaq)list0.get(0)));
                zzaq zzaq5 = zzh0.zza(((zzaq)list0.get(1)));
                zzaq zzaq6 = list0.size() <= 2 ? null : zzh0.zza(((zzaq)list0.get(2)));
                zzaq zzaq7 = zzaq.zzc;
                if(zzaq4.zzd().booleanValue()) {
                    zzaq8 = zzh0.zza(((zzaf)zzaq5));
                    return zzaq8 instanceof zzaj ? zzaq8 : zzaq7;
                }
                zzaq8 = zzaq6 == null ? zzaq7 : zzh0.zza(((zzaf)zzaq6));
                return zzaq8 instanceof zzaj ? zzaq8 : zzaq7;
            }
            case 10: {
                return new zzaf(list0);
            }
            case 11: {
                if(list0.isEmpty()) {
                    return zzaq.zzg;
                }
                zzg.zza(zzbv.zzbb, 1, list0);
                return new zzaj("return", zzh0.zza(((zzaq)list0.get(0))));
            }
            case 12: {
                zzg.zza(zzbv.zzbe, 3, list0);
                zzaq zzaq9 = zzh0.zza(((zzaq)list0.get(0)));
                zzaq zzaq10 = zzh0.zza(((zzaq)list0.get(1)));
                zzaq zzaq11 = zzh0.zza(((zzaq)list0.get(2)));
                if(!(zzaq10 instanceof zzaf)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                }
                if(!(zzaq11 instanceof zzaf)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                }
                boolean z = false;
                for(int v = 0; v < ((zzaf)zzaq10).zzb(); ++v) {
                    if(z || zzaq9.equals(zzh0.zza(((zzaf)zzaq10).zza(v)))) {
                        zzaq zzaq12 = zzh0.zza(((zzaf)zzaq11).zza(v));
                        if(zzaq12 instanceof zzaj) {
                            return zzaq12;
                        }
                        z = true;
                    }
                }
                if(((zzaf)zzaq10).zzb() + 1 == ((zzaf)zzaq11).zzb()) {
                    zzaq zzaq13 = zzh0.zza(((zzaf)zzaq11).zza(((zzaf)zzaq10).zzb()));
                    return zzaq13 instanceof zzaj ? zzaq13 : zzaq.zzc;
                }
                return zzaq.zzc;
            }
            case 13: {
                zzg.zza(zzbv.zzbf, 3, list0);
                return zzh0.zza(((zzaq)list0.get(0))).zzd().booleanValue() ? zzh0.zza(((zzaq)list0.get(1))) : zzh0.zza(((zzaq)list0.get(2)));
            }
            default: {
                return super.zza(s);
            }
        }
    }
}

