package com.google.android.gms.internal.measurement;

import j..util.DesugarCollections;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class zzlv extends AbstractMap {
    private Object[] zza;
    private int zzb;
    private Map zzc;
    private boolean zzd;
    private volatile zzmb zze;
    private Map zzf;

    private zzlv() {
        this.zzc = Collections.emptyMap();
        this.zzf = Collections.emptyMap();
    }

    zzlv(zzme zzme0) {
    }

    @Override
    public void clear() {
        this.zzg();
        if(this.zzb != 0) {
            this.zza = null;
            this.zzb = 0;
        }
        if(!this.zzc.isEmpty()) {
            this.zzc.clear();
        }
    }

    @Override
    public boolean containsKey(Object object0) {
        return this.zza(((Comparable)object0)) >= 0 || this.zzc.containsKey(((Comparable)object0));
    }

    @Override
    public Set entrySet() {
        if(this.zze == null) {
            this.zze = new zzmb(this, null);
        }
        return this.zze;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zzlv)) {
            return super.equals(object0);
        }
        int v = this.size();
        if(v != ((zzlv)object0).size()) {
            return false;
        }
        int v1 = this.zzb;
        if(v1 != ((zzlv)object0).zzb) {
            return this.entrySet().equals(((zzlv)object0).entrySet());
        }
        for(int v2 = 0; v2 < v1; ++v2) {
            if(!this.zza(v2).equals(((zzlv)object0).zza(v2))) {
                return false;
            }
        }
        return v1 == v ? true : this.zzc.equals(((zzlv)object0).zzc);
    }

    @Override
    public Object get(Object object0) {
        int v = this.zza(((Comparable)object0));
        return v < 0 ? this.zzc.get(((Comparable)object0)) : ((zzlz)this.zza[v]).getValue();
    }

    @Override
    public int hashCode() {
        int v = this.zzb;
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 += this.zza[v1].hashCode();
        }
        return this.zzc.size() <= 0 ? v2 : v2 + this.zzc.hashCode();
    }

    @Override
    public Object put(Object object0, Object object1) {
        return this.zza(((Comparable)object0), object1);
    }

    @Override
    public Object remove(Object object0) {
        this.zzg();
        int v = this.zza(((Comparable)object0));
        if(v >= 0) {
            return this.zzb(v);
        }
        return this.zzc.isEmpty() ? null : this.zzc.remove(((Comparable)object0));
    }

    @Override
    public int size() {
        return this.zzb + this.zzc.size();
    }

    private final int zza(Comparable comparable0) {
        int v = this.zzb;
        int v1 = v - 1;
        if(v1 >= 0) {
            int v2 = comparable0.compareTo(((Comparable)((zzlz)this.zza[v1]).getKey()));
            if(v2 > 0) {
                return -(v + 1);
            }
            if(v2 == 0) {
                return v1;
            }
        }
        int v3 = 0;
        while(v3 <= v1) {
            int v4 = (v3 + v1) / 2;
            int v5 = comparable0.compareTo(((Comparable)((zzlz)this.zza[v4]).getKey()));
            if(v5 < 0) {
                v1 = v4 - 1;
                continue;
            }
            if(v5 > 0) {
                v3 = v4 + 1;
                continue;
            }
            return v4;
        }
        return -(v3 + 1);
    }

    public final int zza() {
        return this.zzb;
    }

    public final Object zza(Comparable comparable0, Object object0) {
        this.zzg();
        int v = this.zza(comparable0);
        if(v >= 0) {
            return ((zzlz)this.zza[v]).setValue(object0);
        }
        this.zzg();
        if(this.zza == null) {
            this.zza = new Object[16];
        }
        if(-(v + 1) >= 16) {
            return this.zzf().put(comparable0, object0);
        }
        if(this.zzb == 16) {
            zzlz zzlz0 = (zzlz)this.zza[15];
            this.zzb = 15;
            this.zzf().put(((Comparable)zzlz0.getKey()), zzlz0.getValue());
        }
        System.arraycopy(this.zza, -(v + 1), this.zza, -v, this.zza.length - -(v + 1) - 1);
        Object[] arr_object = this.zza;
        arr_object[-(v + 1)] = new zzlz(this, comparable0, object0);
        ++this.zzb;
        return null;
    }

    public final Map.Entry zza(int v) {
        if(v >= this.zzb) {
            throw new ArrayIndexOutOfBoundsException(v);
        }
        return (zzlz)this.zza[v];
    }

    private final Object zzb(int v) {
        this.zzg();
        Object object0 = ((zzlz)this.zza[v]).getValue();
        System.arraycopy(this.zza, v + 1, this.zza, v, this.zzb - v - 1);
        --this.zzb;
        if(!this.zzc.isEmpty()) {
            Iterator iterator0 = this.zzf().entrySet().iterator();
            Object[] arr_object = this.zza;
            int v1 = this.zzb;
            Object object1 = iterator0.next();
            arr_object[v1] = new zzlz(this, ((Map.Entry)object1));
            ++this.zzb;
            iterator0.remove();
        }
        return object0;
    }

    // 去混淆评级： 低(20)
    public final Iterable zzb() {
        return this.zzc.isEmpty() ? Collections.emptySet() : this.zzc.entrySet();
    }

    final Set zzc() {
        return new zzma(this, null);
    }

    public void zzd() {
        if(!this.zzd) {
            this.zzc = this.zzc.isEmpty() ? Collections.emptyMap() : DesugarCollections.unmodifiableMap(this.zzc);
            this.zzf = this.zzf.isEmpty() ? Collections.emptyMap() : DesugarCollections.unmodifiableMap(this.zzf);
            this.zzd = true;
        }
    }

    public final boolean zze() {
        return this.zzd;
    }

    private final SortedMap zzf() {
        this.zzg();
        if(this.zzc.isEmpty() && !(this.zzc instanceof TreeMap)) {
            TreeMap treeMap0 = new TreeMap();
            this.zzc = treeMap0;
            this.zzf = treeMap0.descendingMap();
        }
        return (SortedMap)this.zzc;
    }

    private final void zzg() {
        if(this.zzd) {
            throw new UnsupportedOperationException();
        }
    }
}

