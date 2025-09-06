package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzbt extends zzay {
    protected zzbt() {
        this.zza.add(zzbv.zzd);
        this.zza.add(zzbv.zzo);
        this.zza.add(zzbv.zzq);
        this.zza.add(zzbv.zzr);
        this.zza.add(zzbv.zzw);
        this.zza.add(zzbv.zzaf);
        this.zza.add(zzbv.zzag);
        this.zza.add(zzbv.zzah);
        this.zza.add(zzbv.zzau);
        this.zza.add(zzbv.zzbc);
        this.zza.add(zzbv.zzbg);
        this.zza.add(zzbv.zzbh);
        this.zza.add(zzbv.zzbi);
    }

    @Override  // com.google.android.gms.internal.measurement.zzay
    public final zzaq zza(String s, zzh zzh0, List list0) {
        int v = 0;
        switch(zzg.zza(s)) {
            case 1: {
                zzg.zza(zzbv.zzd, 2, list0);
                zzaq zzaq0 = zzh0.zza(((zzaq)list0.get(0)));
                if(!(zzaq0 instanceof zzas)) {
                    throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", zzaq0.getClass().getCanonicalName()));
                }
                if(!zzh0.zzb(zzaq0.zzf())) {
                    throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", zzaq0.zzf()));
                }
                zzaq zzaq1 = zzh0.zza(((zzaq)list0.get(1)));
                zzh0.zzc(zzaq0.zzf(), zzaq1);
                return zzaq1;
            }
            case 2: {
                zzg.zzb(zzbv.zzo, 2, list0);
                if(list0.size() % 2 != 0) {
                    throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", list0.size()));
                }
                for(int v1 = 0; v1 < list0.size() - 1; v1 += 2) {
                    zzaq zzaq2 = zzh0.zza(((zzaq)list0.get(v1)));
                    if(!(zzaq2 instanceof zzas)) {
                        throw new IllegalArgumentException(String.format("Expected string for const name. got %s", zzaq2.getClass().getCanonicalName()));
                    }
                    zzh0.zzb(zzaq2.zzf(), zzh0.zza(((zzaq)list0.get(v1 + 1))));
                }
                return zzaq.zzc;
            }
            case 3: {
                if(list0.isEmpty()) {
                    return new zzaf();
                }
                zzaq zzaq3 = new zzaf();
                for(Object object0: list0) {
                    zzaq zzaq4 = zzh0.zza(((zzaq)object0));
                    if(zzaq4 instanceof zzaj) {
                        throw new IllegalStateException("Failed to evaluate array element");
                    }
                    ((zzaf)zzaq3).zzb(v, zzaq4);
                    ++v;
                }
                return zzaq3;
            }
            case 4: {
                if(list0.isEmpty()) {
                    return new zzap();
                }
                if(list0.size() % 2 != 0) {
                    throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", list0.size()));
                }
                zzaq zzaq5 = new zzap();
                while(v < list0.size() - 1) {
                    zzaq zzaq6 = zzh0.zza(((zzaq)list0.get(v)));
                    zzaq zzaq7 = zzh0.zza(((zzaq)list0.get(v + 1)));
                    if(zzaq6 instanceof zzaj || zzaq7 instanceof zzaj) {
                        throw new IllegalStateException("Failed to evaluate map entry");
                    }
                    ((zzap)zzaq5).zza(zzaq6.zzf(), zzaq7);
                    v += 2;
                }
                return zzaq5;
            }
            case 5: {
                zzg.zzb(zzbv.zzw, 1, list0);
                zzaq zzaq8 = zzaq.zzc;
                while(v < list0.size()) {
                    zzaq8 = zzh0.zza(((zzaq)list0.get(v)));
                    if(zzaq8 instanceof zzaj) {
                        throw new IllegalStateException("ControlValue cannot be in an expression list");
                    }
                    ++v;
                }
                return zzaq8;
            }
            case 6: {
                zzg.zza(zzbv.zzaf, 1, list0);
                zzaq zzaq9 = zzh0.zza(((zzaq)list0.get(0)));
                if(!(zzaq9 instanceof zzas)) {
                    throw new IllegalArgumentException(String.format("Expected string for get var. got %s", zzaq9.getClass().getCanonicalName()));
                }
                return zzh0.zza(zzaq9.zzf());
            }
            case 7: 
            case 8: {
                zzg.zza(zzbv.zzah, 2, list0);
                zzaq zzaq10 = zzh0.zza(((zzaq)list0.get(0)));
                zzaq zzaq11 = zzh0.zza(((zzaq)list0.get(1)));
                if(zzaq10 instanceof zzaf && zzg.zzb(zzaq11)) {
                    return ((zzaf)zzaq10).zza(zzaq11.zze().intValue());
                }
                if(zzaq10 instanceof zzak) {
                    return ((zzak)zzaq10).zza(zzaq11.zzf());
                }
                if(zzaq10 instanceof zzas) {
                    if("length".equals(zzaq11.zzf())) {
                        return new zzai(((double)zzaq10.zzf().length()));
                    }
                    if(zzg.zzb(zzaq11) && ((double)zzaq11.zze()) < ((double)zzaq10.zzf().length())) {
                        return new zzas(String.valueOf(zzaq10.zzf().charAt(zzaq11.zze().intValue())));
                    }
                }
                return zzaq.zzc;
            }
            case 9: {
                zzg.zza(zzbv.zzau, 0, list0);
                return zzaq.zzd;
            }
            case 10: {
                zzg.zza(zzbv.zzbc, 3, list0);
                zzaq zzaq12 = zzh0.zza(((zzaq)list0.get(0)));
                zzaq zzaq13 = zzh0.zza(((zzaq)list0.get(1)));
                zzaq zzaq14 = zzh0.zza(((zzaq)list0.get(2)));
                if(zzaq12 == zzaq.zzc || zzaq12 == zzaq.zzd) {
                    throw new IllegalStateException(String.format("Can\'t set property %s of %s", zzaq13.zzf(), zzaq12.zzf()));
                }
                if(zzaq12 instanceof zzaf && zzaq13 instanceof zzai) {
                    ((zzaf)zzaq12).zzb(zzaq13.zze().intValue(), zzaq14);
                    return zzaq14;
                }
                if(zzaq12 instanceof zzak) {
                    ((zzak)zzaq12).zza(zzaq13.zzf(), zzaq14);
                }
                return zzaq14;
            }
            case 11: {
                zzg.zza(zzbv.zzbg, 1, list0);
                zzaq zzaq15 = zzh0.zza(((zzaq)list0.get(0)));
                if(zzaq15 instanceof zzax) {
                    return new zzas("undefined");
                }
                if(zzaq15 instanceof zzag) {
                    return new zzas("boolean");
                }
                if(zzaq15 instanceof zzai) {
                    return new zzas("number");
                }
                if(zzaq15 instanceof zzas) {
                    return new zzas("string");
                }
                if(zzaq15 instanceof zzar) {
                    return new zzas("function");
                }
                if(zzaq15 instanceof zzat || zzaq15 instanceof zzaj) {
                    throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", zzaq15));
                }
                return new zzas("object");
            }
            case 12: {
                zzg.zza(zzbv.zzbh, 0, list0);
                return zzaq.zzc;
            }
            case 13: {
                zzg.zzb(zzbv.zzbi, 1, list0);
                for(Object object1: list0) {
                    zzaq zzaq16 = zzh0.zza(((zzaq)object1));
                    if(!(zzaq16 instanceof zzas)) {
                        throw new IllegalArgumentException(String.format("Expected string for var name. got %s", zzaq16.getClass().getCanonicalName()));
                    }
                    zzh0.zza(zzaq16.zzf(), zzaq.zzc);
                }
                return zzaq.zzc;
            }
            default: {
                return super.zza(s);
            }
        }
    }
}

