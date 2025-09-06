package com.google.android.gms.internal.measurement;

import J1.e;
import h4.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public final class zzaf implements zzak, zzaq, Iterable {
    @e
    private final SortedMap zza;
    @e
    private final Map zzb;

    public zzaf() {
        this.zza = new TreeMap();
        this.zzb = new TreeMap();
    }

    public zzaf(List list0) {
        if(list0 != null) {
            for(int v = 0; v < list0.size(); ++v) {
                this.zzb(v, ((zzaq)list0.get(v)));
            }
        }
    }

    public zzaf(zzaq[] arr_zzaq) {
        this(Arrays.asList(arr_zzaq));
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof zzaf)) {
            return false;
        }
        if(this.zzb() != ((zzaf)object0).zzb()) {
            return false;
        }
        if(this.zza.isEmpty()) {
            return ((zzaf)object0).zza.isEmpty();
        }
        for(int v = (int)(((Integer)this.zza.firstKey())); v <= ((int)(((Integer)this.zza.lastKey()))); ++v) {
            if(!this.zza(v).equals(((zzaf)object0).zza(v))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final int hashCode() {
        return this.zza.hashCode() * 0x1F;
    }

    @Override
    public final Iterator iterator() {
        return new zzah(this);
    }

    // 去混淆评级： 低(20)
    @Override
    public final String toString() [...] // 潜在的解密器

    public final int zza() {
        return this.zza.size();
    }

    public final zzaq zza(int v) {
        if(v >= this.zzb()) {
            throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
        }
        if(this.zzc(v)) {
            zzaq zzaq0 = (zzaq)this.zza.get(v);
            return zzaq0 == null ? zzaq.zzc : zzaq0;
        }
        return zzaq.zzc;
    }

    @Override  // com.google.android.gms.internal.measurement.zzak
    public final zzaq zza(String s) {
        if("length".equals(s)) {
            return new zzai(((double)this.zzb()));
        }
        if(this.zzc(s)) {
            zzaq zzaq0 = (zzaq)this.zzb.get(s);
            return zzaq0 == null ? zzaq.zzc : zzaq0;
        }
        return zzaq.zzc;
    }

    // 去混淆评级： 高(200)
    @Override  // com.google.android.gms.internal.measurement.zzaq
    public final zzaq zza(String s, zzh zzh0, List list0) {
        return "concat".equals(s) || "every".equals(s) || "filter".equals(s) || "forEach".equals(s) || "indexOf".equals(s) || "join".equals(s) || "lastIndexOf".equals(s) || "map".equals(s) || "pop".equals(s) || "push".equals(s) || "reduce".equals(s) || "reduceRight".equals(s) || "reverse".equals(s) || "shift".equals(s) || "slice".equals(s) || "some".equals(s) || "sort".equals(s) || "splice".equals(s) || "toString".equals(s) || "unshift".equals(s) ? zzbe.zza(s, this, zzh0, list0) : zzan.zza(this, new zzas(s), zzh0, list0);
    }

    public final void zza(int v, zzaq zzaq0) {
        if(v < 0) {
            throw new IllegalArgumentException("Invalid value index: " + v);
        }
        if(v >= this.zzb()) {
            this.zzb(v, zzaq0);
            return;
        }
        for(int v1 = (int)(((Integer)this.zza.lastKey())); v1 >= v; --v1) {
            zzaq zzaq1 = (zzaq)this.zza.get(v1);
            if(zzaq1 != null) {
                this.zzb(v1 + 1, zzaq1);
                this.zza.remove(v1);
            }
        }
        this.zzb(v, zzaq0);
    }

    public final void zza(zzaq zzaq0) {
        this.zzb(this.zzb(), zzaq0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzak
    public final void zza(String s, zzaq zzaq0) {
        if(zzaq0 == null) {
            this.zzb.remove(s);
            return;
        }
        this.zzb.put(s, zzaq0);
    }

    // 去混淆评级： 低(20)
    public final int zzb() {
        return this.zza.isEmpty() ? 0 : ((int)(((Integer)this.zza.lastKey()))) + 1;
    }

    public final String zzb(String s) [...] // 潜在的解密器

    public final void zzb(int v) {
        int v1 = (int)(((Integer)this.zza.lastKey()));
        if(v <= v1 && v >= 0) {
            this.zza.remove(v);
            if(v == v1) {
                if(!this.zza.containsKey(((int)(v - 1))) && v - 1 >= 0) {
                    this.zza.put(((int)(v - 1)), zzaq.zzc);
                }
                return;
            }
            while(true) {
                ++v;
                if(v > ((int)(((Integer)this.zza.lastKey())))) {
                    break;
                }
                zzaq zzaq0 = (zzaq)this.zza.get(v);
                if(zzaq0 != null) {
                    this.zza.put(((int)(v - 1)), zzaq0);
                    this.zza.remove(v);
                }
            }
        }
    }

    @m({"elements"})
    public final void zzb(int v, zzaq zzaq0) {
        if(v > 0x7ED4) {
            throw new IllegalStateException("Array too large");
        }
        if(v < 0) {
            throw new IndexOutOfBoundsException("Out of bounds index: " + v);
        }
        if(zzaq0 == null) {
            this.zza.remove(v);
            return;
        }
        this.zza.put(v, zzaq0);
    }

    @Override  // com.google.android.gms.internal.measurement.zzaq
    public final zzaq zzc() {
        zzaq zzaq0 = new zzaf();
        for(Object object0: this.zza.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(map$Entry0.getValue() instanceof zzak) {
                Integer integer0 = (Integer)map$Entry0.getKey();
                zzaq zzaq1 = (zzaq)map$Entry0.getValue();
                zzaq0.zza.put(integer0, zzaq1);
            }
            else {
                Integer integer1 = (Integer)map$Entry0.getKey();
                zzaq zzaq2 = ((zzaq)map$Entry0.getValue()).zzc();
                zzaq0.zza.put(integer1, zzaq2);
            }
        }
        return zzaq0;
    }

    public final boolean zzc(int v) {
        if(v < 0 || v > ((int)(((Integer)this.zza.lastKey())))) {
            throw new IndexOutOfBoundsException("Out of bounds index: " + v);
        }
        return this.zza.containsKey(v);
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.measurement.zzak
    public final boolean zzc(String s) {
        return "length".equals(s) || this.zzb.containsKey(s);
    }

    @Override  // com.google.android.gms.internal.measurement.zzaq
    public final Boolean zzd() {
        return true;
    }

    @Override  // com.google.android.gms.internal.measurement.zzaq
    public final Double zze() {
        if(this.zza.size() == 1) {
            return this.zza(0).zze();
        }
        return this.zza.size() > 0 ? NaN : 0.0;
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.measurement.zzaq
    public final String zzf() {
        return "";
    }

    public final Iterator zzg() {
        return this.zza.keySet().iterator();
    }

    @Override  // com.google.android.gms.internal.measurement.zzaq
    public final Iterator zzh() {
        return new zzae(this, this.zza.keySet().iterator(), this.zzb.keySet().iterator());
    }

    public final List zzi() {
        List list0 = new ArrayList(this.zzb());
        for(int v = 0; v < this.zzb(); ++v) {
            list0.add(this.zza(v));
        }
        return list0;
    }

    public final void zzj() {
        this.zza.clear();
    }
}

