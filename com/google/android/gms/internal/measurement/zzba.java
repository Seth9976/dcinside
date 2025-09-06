package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzba extends zzay {
    public zzba() {
        this.zza.add(zzbv.zzv);
        this.zza.add(zzbv.zzai);
        this.zza.add(zzbv.zzaj);
        this.zza.add(zzbv.zzak);
        this.zza.add(zzbv.zzal);
        this.zza.add(zzbv.zzan);
        this.zza.add(zzbv.zzao);
        this.zza.add(zzbv.zzat);
    }

    private static boolean zza(zzaq zzaq0, zzaq zzaq1) {
        zzai zzai0;
        while(true) {
            if(zzaq0.getClass().equals(zzaq1.getClass())) {
                if(!(zzaq0 instanceof zzax) && !(zzaq0 instanceof zzao)) {
                    if(zzaq0 instanceof zzai) {
                        return !Double.isNaN(((double)zzaq0.zze())) && !Double.isNaN(((double)zzaq1.zze())) && ((double)zzaq0.zze()) == ((double)zzaq1.zze());
                    }
                    if(zzaq0 instanceof zzas) {
                        return zzaq0.zzf().equals(zzaq1.zzf());
                    }
                    return zzaq0 instanceof zzag ? zzaq0.zzd().equals(zzaq1.zzd()) : zzaq0 == zzaq1;
                }
                return true;
            }
            if((zzaq0 instanceof zzax || zzaq0 instanceof zzao) && (zzaq1 instanceof zzax || zzaq1 instanceof zzao)) {
                break;
            }
            if(zzaq0 instanceof zzai && zzaq1 instanceof zzas) {
                zzaq1 = new zzai(zzaq1.zze());
            }
            else {
                if(zzaq0 instanceof zzas && zzaq1 instanceof zzai) {
                    zzai0 = new zzai(zzaq0.zze());
                }
                else if(zzaq0 instanceof zzag) {
                    zzai0 = new zzai(zzaq0.zze());
                }
                else if(zzaq1 instanceof zzag) {
                    zzaq1 = new zzai(zzaq1.zze());
                    continue;
                }
                else if(!(zzaq0 instanceof zzas) && !(zzaq0 instanceof zzai) || !(zzaq1 instanceof zzak)) {
                    if(!(zzaq0 instanceof zzak) || !(zzaq1 instanceof zzas) && !(zzaq1 instanceof zzai)) {
                        return false;
                    }
                    zzai0 = new zzas(zzaq0.zzf());
                }
                else {
                    zzaq1 = new zzas(zzaq1.zzf());
                    continue;
                }
                zzaq0 = zzai0;
            }
        }
        return true;
    }

    @Override  // com.google.android.gms.internal.measurement.zzay
    public final zzaq zza(String s, zzh zzh0, List list0) {
        zzg.zza(zzg.zza(s), 2, list0);
        zzaq zzaq0 = zzh0.zza(((zzaq)list0.get(0)));
        zzaq zzaq1 = zzh0.zza(((zzaq)list0.get(1)));
        switch(zzg.zza(s)) {
            case 1: {
                return zzba.zza(zzaq0, zzaq1) ? zzaq.zzh : zzaq.zzi;
            }
            case 2: {
                return zzba.zzb(zzaq1, zzaq0) ? zzaq.zzh : zzaq.zzi;
            }
            case 3: {
                return zzba.zzc(zzaq1, zzaq0) ? zzaq.zzh : zzaq.zzi;
            }
            case 4: {
                return zzg.zza(zzaq0, zzaq1) ? zzaq.zzh : zzaq.zzi;
            }
            case 5: {
                return zzg.zza(zzaq0, zzaq1) ? zzaq.zzi : zzaq.zzh;
            }
            case 6: {
                return zzba.zzb(zzaq0, zzaq1) ? zzaq.zzh : zzaq.zzi;
            }
            case 7: {
                return zzba.zzc(zzaq0, zzaq1) ? zzaq.zzh : zzaq.zzi;
            }
            case 8: {
                return zzba.zza(zzaq0, zzaq1) ? zzaq.zzi : zzaq.zzh;
            }
            default: {
                return super.zza(s);
            }
        }
    }

    private static boolean zzb(zzaq zzaq0, zzaq zzaq1) {
        if(zzaq0 instanceof zzak) {
            zzaq0 = new zzas(zzaq0.zzf());
        }
        if(zzaq1 instanceof zzak) {
            zzaq1 = new zzas(zzaq1.zzf());
        }
        if(zzaq0 instanceof zzas && zzaq1 instanceof zzas) {
            return zzaq0.zzf().compareTo(zzaq1.zzf()) < 0;
        }
        double f = (double)zzaq0.zze();
        double f1 = (double)zzaq1.zze();
        return !Double.isNaN(f) && !Double.isNaN(f1) && (f != 0.0 || f1 != -0.0) && (f != -0.0 || f1 != 0.0) ? Double.compare(f, f1) < 0 : false;
    }

    private static boolean zzc(zzaq zzaq0, zzaq zzaq1) {
        if(zzaq0 instanceof zzak) {
            zzaq0 = new zzas(zzaq0.zzf());
        }
        if(zzaq1 instanceof zzak) {
            zzaq1 = new zzas(zzaq1.zzf());
        }
        return (zzaq0 instanceof zzas && zzaq1 instanceof zzas || !Double.isNaN(((double)zzaq0.zze())) && !Double.isNaN(((double)zzaq1.zze()))) && !zzba.zzb(zzaq1, zzaq0);
    }
}

