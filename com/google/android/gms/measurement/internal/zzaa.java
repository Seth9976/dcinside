package com.google.android.gms.measurement.internal;

import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfo.zzd;
import com.google.android.gms.internal.measurement.zzfo.zzf.zzb;
import com.google.android.gms.internal.measurement.zzfo.zzf;
import j..util.DesugarCollections;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

abstract class zzaa {
    String zza;
    int zzb;
    Boolean zzc;
    Boolean zzd;
    Long zze;
    Long zzf;

    zzaa(String s, int v) {
        this.zza = s;
        this.zzb = v;
    }

    static Boolean zza(double f, zzd zzfo$zzd0) {
        try {
            return zzaa.zza(new BigDecimal(f), zzfo$zzd0, Math.ulp(f));
        }
        catch(NumberFormatException unused_ex) {
            return null;
        }
    }

    static Boolean zza(long v, zzd zzfo$zzd0) {
        try {
            return zzaa.zza(new BigDecimal(v), zzfo$zzd0, 0.0);
        }
        catch(NumberFormatException unused_ex) {
            return null;
        }
    }

    @VisibleForTesting
    static Boolean zza(Boolean boolean0, boolean z) {
        if(boolean0 == null) {
            return null;
        }
        return boolean0.booleanValue() == z ? false : true;
    }

    static Boolean zza(String s, zzd zzfo$zzd0) {
        if(!zzoo.zzb(s)) {
            return null;
        }
        try {
            return zzaa.zza(new BigDecimal(s), zzfo$zzd0, 0.0);
        }
        catch(NumberFormatException unused_ex) {
            return null;
        }
    }

    private static Boolean zza(String s, zzb zzfo$zzf$zzb0, boolean z, String s1, List list0, String s2, zzgo zzgo0) {
        if(s == null) {
            return null;
        }
        if(zzfo$zzf$zzb0 == zzb.zzg) {
            if(list0 == null || list0.isEmpty()) {
                return null;
            }
        }
        else if(s1 == null) {
            return null;
        }
        if(!z && zzfo$zzf$zzb0 != zzb.zzb) {
            s = s.toUpperCase(Locale.ENGLISH);
        }
        switch(zzfo$zzf$zzb0) {
            case 1: {
                if(s2 == null) {
                    return null;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(s2, (z ? 0 : 66)).matcher(s).matches());
                }
                catch(PatternSyntaxException unused_ex) {
                    if(zzgo0 != null) {
                        zzgo0.zzu().zza("Invalid regular expression in REGEXP audience filter. expression", s2);
                    }
                    return null;
                }
            }
            case 2: {
                return Boolean.valueOf(s.startsWith(s1));
            }
            case 3: {
                return Boolean.valueOf(s.endsWith(s1));
            }
            case 4: {
                return Boolean.valueOf(s.contains(s1));
            }
            case 5: {
                return Boolean.valueOf(s.equals(s1));
            }
            case 6: {
                return list0 == null ? null : Boolean.valueOf(list0.contains(s));
            }
            default: {
                return null;
            }
        }
    }

    @VisibleForTesting
    static Boolean zza(String s, zzf zzfo$zzf0, zzgo zzgo0) {
        Preconditions.checkNotNull(zzfo$zzf0);
        if(s == null) {
            return null;
        }
        if(zzfo$zzf0.zzj() && zzfo$zzf0.zzb() != zzb.zza) {
            if(zzfo$zzf0.zzb() == zzb.zzg) {
                if(zzfo$zzf0.zza() == 0) {
                    return null;
                }
            }
            else if(!zzfo$zzf0.zzi()) {
                return null;
            }
            zzb zzfo$zzf$zzb0 = zzfo$zzf0.zzb();
            boolean z = zzfo$zzf0.zzg();
            if(zzfo$zzf0.zza() == 0) {
                return zzfo$zzf$zzb0 == zzb.zzb ? zzaa.zza(s, zzfo$zzf$zzb0, z, "", null, "", zzgo0) : zzaa.zza(s, zzfo$zzf$zzb0, z, "", null, null, zzgo0);
            }
            List list0 = zzfo$zzf0.zzf();
            if(z) {
                return zzfo$zzf$zzb0 == zzb.zzb ? zzaa.zza(s, zzfo$zzf$zzb0, true, "", list0, "", zzgo0) : zzaa.zza(s, zzfo$zzf$zzb0, true, "", list0, null, zzgo0);
            }
            ArrayList arrayList0 = new ArrayList(list0.size());
            for(Object object0: list0) {
                arrayList0.add(((String)object0).toUpperCase(Locale.ENGLISH));
            }
            list0 = DesugarCollections.unmodifiableList(arrayList0);
            return zzfo$zzf$zzb0 == zzb.zzb ? zzaa.zza(s, zzfo$zzf$zzb0, false, "", list0, "", zzgo0) : zzaa.zza(s, zzfo$zzf$zzb0, false, "", list0, null, zzgo0);
        }
        return null;
    }

    @VisibleForTesting
    private static Boolean zza(BigDecimal bigDecimal0, zzd zzfo$zzd0, double f) {
        Preconditions.checkNotNull(zzfo$zzd0);
        if(zzfo$zzd0.zzh() && zzfo$zzd0.zza() != com.google.android.gms.internal.measurement.zzfo.zzd.zzb.zza) {
            com.google.android.gms.internal.measurement.zzfo.zzd.zzb zzfo$zzd$zzb0 = com.google.android.gms.internal.measurement.zzfo.zzd.zzb.zze;
            if(zzfo$zzd0.zza() == zzfo$zzd$zzb0) {
                if(!zzfo$zzd0.zzl() || !zzfo$zzd0.zzk()) {
                    return null;
                }
            }
            else if(!zzfo$zzd0.zzi()) {
                return null;
            }
            com.google.android.gms.internal.measurement.zzfo.zzd.zzb zzfo$zzd$zzb1 = zzfo$zzd0.zza();
            if(zzfo$zzd0.zza() != zzfo$zzd$zzb0 || true) {
                return null;
            }
            try {
                BigDecimal bigDecimal1 = new BigDecimal("");
                BigDecimal bigDecimal2 = new BigDecimal("");
                if(zzfo$zzd$zzb1 == zzfo$zzd$zzb0) {
                    goto label_13;
                }
            }
            catch(NumberFormatException unused_ex) {
            }
            return null;
        label_13:
            boolean z = false;
            switch(zzfo$zzd$zzb1) {
                case 1: 
                case 2: 
                case 3: {
                    break;
                }
                case 4: {
                    if(bigDecimal0.compareTo(bigDecimal1) >= 0 && bigDecimal0.compareTo(bigDecimal2) <= 0) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
                default: {
                    return null;
                }
            }
        }
        return null;
    }

    abstract int zza();

    abstract boolean zzb();

    abstract boolean zzc();
}

