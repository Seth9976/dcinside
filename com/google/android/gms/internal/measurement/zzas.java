package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class zzas implements zzaq, Iterable {
    private final String zza;

    public zzas(String s) {
        if(s == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.zza = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof zzas ? this.zza.equals(((zzas)object0).zza) : false;
    }

    @Override
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override
    public final Iterator iterator() {
        return new zzau(this);
    }

    @Override
    public final String toString() {
        return "\"" + this.zza + "\"";
    }

    @Override  // com.google.android.gms.internal.measurement.zzaq
    public final zzaq zza(String s, zzh zzh0, List list0) {
        int v4;
        if(!"charAt".equals(s) && !"concat".equals(s) && !"hasOwnProperty".equals(s) && !"indexOf".equals(s) && !"lastIndexOf".equals(s) && !"match".equals(s) && !"replace".equals(s) && !"search".equals(s) && !"slice".equals(s) && !"split".equals(s) && !"substring".equals(s) && !"toLowerCase".equals(s) && !"toLocaleLowerCase".equals(s) && !"toString".equals(s) && !"toUpperCase".equals(s) && !"toLocaleUpperCase".equals(s) && !"trim".equals(s)) {
            throw new IllegalArgumentException(String.format("%s is not a String function", s));
        }
        s.hashCode();
        switch(s) {
            case "charAt": {
                zzg.zzc("charAt", 1, list0);
                int v = list0.isEmpty() ? 0 : ((int)zzg.zza(((double)zzh0.zza(((zzaq)list0.get(0))).zze())));
                String s2 = this.zza;
                return v >= 0 && v < s2.length() ? new zzas(String.valueOf(s2.charAt(v))) : zzaq.zzj;
            }
            case "concat": {
                if(list0.isEmpty()) {
                    return this;
                }
                StringBuilder stringBuilder0 = new StringBuilder(this.zza);
                for(int v1 = 0; v1 < list0.size(); ++v1) {
                    stringBuilder0.append(zzh0.zza(((zzaq)list0.get(v1))).zzf());
                }
                return new zzas(stringBuilder0.toString());
            }
            case "hasOwnProperty": {
                zzg.zza("hasOwnProperty", 1, list0);
                String s1 = this.zza;
                zzaq zzaq0 = zzh0.zza(((zzaq)list0.get(0)));
                if("length".equals(zzaq0.zzf())) {
                    return zzaq.zzh;
                }
                double f = (double)zzaq0.zze();
                return f != Math.floor(f) || ((int)f) < 0 || ((int)f) >= s1.length() ? zzaq.zzi : zzaq.zzh;
            }
            case "indexOf": {
                zzg.zzc("indexOf", 2, list0);
                String s8 = list0.size() > 0 ? zzh0.zza(((zzaq)list0.get(0))).zzf() : "undefined";
                return list0.size() >= 2 ? new zzai(((double)this.zza.indexOf(s8, ((int)zzg.zza(((double)zzh0.zza(((zzaq)list0.get(1))).zze())))))) : new zzai(((double)this.zza.indexOf(s8, 0)));
            }
            case "lastIndexOf": {
                zzg.zzc("lastIndexOf", 2, list0);
                String s3 = list0.size() > 0 ? zzh0.zza(((zzaq)list0.get(0))).zzf() : "undefined";
                double f1 = list0.size() >= 2 ? ((double)zzh0.zza(((zzaq)list0.get(1))).zze()) : NaN;
                return Double.isNaN(f1) ? new zzai(((double)this.zza.lastIndexOf(s3, 0x7FFFFFFF))) : new zzai(((double)this.zza.lastIndexOf(s3, ((int)zzg.zza(f1)))));
            }
            case "match": {
                zzg.zzc("match", 1, list0);
                Matcher matcher1 = Pattern.compile((list0.size() > 0 ? zzh0.zza(((zzaq)list0.get(0))).zzf() : "")).matcher(this.zza);
                return matcher1.find() ? new zzaf(new zzaq[]{new zzas(matcher1.group())}) : zzaq.zzd;
            }
            case "replace": {
                zzg.zzc("replace", 2, list0);
                zzaq zzaq1 = zzaq.zzc;
                String s6 = "undefined";
                if(!list0.isEmpty()) {
                    s6 = zzh0.zza(((zzaq)list0.get(0))).zzf();
                    if(list0.size() > 1) {
                        zzaq1 = zzh0.zza(((zzaq)list0.get(1)));
                    }
                }
                String s7 = this.zza;
                int v9 = s7.indexOf(s6);
                if(v9 < 0) {
                    return this;
                }
                if(zzaq1 instanceof zzal) {
                    zzaq1 = ((zzal)zzaq1).zza(zzh0, Arrays.asList(new zzaq[]{new zzas(s6), new zzai(((double)v9)), this}));
                }
                return new zzas(s7.substring(0, v9) + zzaq1.zzf() + s7.substring(v9 + s6.length()));
            }
            case "search": {
                zzg.zzc("search", 1, list0);
                Matcher matcher0 = Pattern.compile((list0.isEmpty() ? "undefined" : zzh0.zza(((zzaq)list0.get(0))).zzf())).matcher(this.zza);
                return matcher0.find() ? new zzai(((double)matcher0.start())) : new zzai(-1.0);
            }
            case "slice": {
                zzg.zzc("slice", 2, list0);
                double f2 = zzg.zza((list0.isEmpty() ? 0.0 : ((double)zzh0.zza(((zzaq)list0.get(0))).zze())));
                double f3 = f2 < 0.0 ? Math.max(((double)this.zza.length()) + f2, 0.0) : Math.min(f2, this.zza.length());
                double f4 = zzg.zza((list0.size() <= 1 ? ((double)this.zza.length()) : ((double)zzh0.zza(((zzaq)list0.get(1))).zze())));
                return f4 < 0.0 ? new zzas(this.zza.substring(((int)f3), Math.max(0, ((int)Math.max(((double)this.zza.length()) + f4, 0.0)) - ((int)f3)) + ((int)f3))) : new zzas(this.zza.substring(((int)f3), Math.max(0, ((int)Math.min(f4, this.zza.length())) - ((int)f3)) + ((int)f3)));
            }
            case "split": {
                zzg.zzc("split", 2, list0);
                String s4 = this.zza;
                if(s4.length() == 0) {
                    return new zzaf(new zzaq[]{this});
                }
                ArrayList arrayList0 = new ArrayList();
                if(list0.isEmpty()) {
                    arrayList0.add(this);
                    return new zzaf(arrayList0);
                }
                String s5 = zzh0.zza(((zzaq)list0.get(0))).zzf();
                long v2 = list0.size() <= 1 ? 0x7FFFFFFFL : zzg.zzc(((double)zzh0.zza(((zzaq)list0.get(1))).zze()));
                if(v2 == 0L) {
                    return new zzaf();
                }
                String[] arr_s = s4.split(Pattern.quote(s5), ((int)v2) + 1);
                int v3 = arr_s.length;
                if(!s5.isEmpty() || arr_s.length <= 0) {
                    v4 = 0;
                }
                else {
                    v4 = arr_s[0].isEmpty();
                    if(arr_s[arr_s.length - 1].isEmpty()) {
                        v3 = arr_s.length - 1;
                    }
                }
                if(((long)arr_s.length) > v2) {
                    --v3;
                }
                while(v4 < v3) {
                    arrayList0.add(new zzas(arr_s[v4]));
                    ++v4;
                }
                return new zzaf(arrayList0);
            }
            case "substring": {
                zzg.zzc("substring", 2, list0);
                int v5 = list0.isEmpty() ? 0 : ((int)zzg.zza(((double)zzh0.zza(((zzaq)list0.get(0))).zze())));
                int v6 = list0.size() <= 1 ? this.zza.length() : ((int)zzg.zza(((double)zzh0.zza(((zzaq)list0.get(1))).zze())));
                int v7 = Math.min(Math.max(v5, 0), this.zza.length());
                int v8 = Math.min(Math.max(v6, 0), this.zza.length());
                return new zzas(this.zza.substring(Math.min(v7, v8), Math.max(v7, v8)));
            }
            case "toLocaleLowerCase": {
                zzg.zza("toLocaleLowerCase", 0, list0);
                return new zzas(this.zza.toLowerCase());
            }
            case "toLocaleUpperCase": {
                zzg.zza("toLocaleUpperCase", 0, list0);
                return new zzas(this.zza.toUpperCase());
            }
            case "toLowerCase": {
                zzg.zza("toLowerCase", 0, list0);
                return new zzas(this.zza.toLowerCase(Locale.ENGLISH));
            }
            case "toString": {
                zzg.zza("toString", 0, list0);
                return this;
            }
            case "toUpperCase": {
                zzg.zza("toUpperCase", 0, list0);
                return new zzas(this.zza.toUpperCase(Locale.ENGLISH));
            }
            case "trim": {
                zzg.zza("toUpperCase", 0, list0);
                return new zzas(this.zza.trim());
            }
            default: {
                throw new IllegalArgumentException("Command not supported");
            }
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzaq
    public final zzaq zzc() {
        return new zzas(this.zza);
    }

    @Override  // com.google.android.gms.internal.measurement.zzaq
    public final Boolean zzd() {
        return Boolean.valueOf(!this.zza.isEmpty());
    }

    @Override  // com.google.android.gms.internal.measurement.zzaq
    public final Double zze() {
        if(this.zza.isEmpty()) {
            return 0.0;
        }
        try {
            return Double.valueOf(this.zza);
        }
        catch(NumberFormatException unused_ex) {
            return NaN;
        }
    }

    @Override  // com.google.android.gms.internal.measurement.zzaq
    public final String zzf() {
        return this.zza;
    }

    @Override  // com.google.android.gms.internal.measurement.zzaq
    public final Iterator zzh() {
        return new zzav(this);
    }
}

