package com.google.android.gms.internal.ads;

import j..util.DesugarCollections;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class zzhad extends AbstractMap {
    private Object[] zza;
    private int zzb;
    private Map zzc;
    private boolean zzd;
    private volatile zzhab zze;
    private Map zzf;

    private zzhad() {
        this.zzc = Collections.emptyMap();
        this.zzf = Collections.emptyMap();
    }

    zzhad(zzhac zzhac0) {
        this.zzc = Collections.emptyMap();
        this.zzf = Collections.emptyMap();
    }

    @Override
    public final void clear() {
        this.zzo();
        if(this.zzb != 0) {
            this.zza = null;
            this.zzb = 0;
        }
        if(!this.zzc.isEmpty()) {
            this.zzc.clear();
        }
    }

    @Override
    public final boolean containsKey(Object object0) {
        return this.zzl(((Comparable)object0)) >= 0 || this.zzc.containsKey(((Comparable)object0));
    }

    @Override
    public final Set entrySet() {
        if(this.zze == null) {
            this.zze = new zzhab(this, null);
        }
        return this.zze;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zzhad)) {
            return super.equals(object0);
        }
        int v = this.size();
        if(v == ((zzhad)object0).size()) {
            int v1 = this.zzb;
            if(v1 == ((zzhad)object0).zzb) {
                for(int v2 = 0; v2 < v1; ++v2) {
                    if(!this.zzg(v2).equals(((zzhad)object0).zzg(v2))) {
                        return false;
                    }
                }
                return v1 == v ? true : this.zzc.equals(((zzhad)object0).zzc);
            }
            return this.entrySet().equals(((zzhad)object0).entrySet());
        }
        return false;
    }

    @Override
    public final Object get(Object object0) {
        int v = this.zzl(((Comparable)object0));
        return v < 0 ? this.zzc.get(((Comparable)object0)) : ((zzgzz)this.zza[v]).getValue();
    }

    @Override
    public final int hashCode() {
        int v = this.zzb;
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 += this.zza[v1].hashCode();
        }
        return this.zzc.size() <= 0 ? v2 : v2 + this.zzc.hashCode();
    }

    @Override
    public final Object put(Object object0, Object object1) {
        return this.zzf(((Comparable)object0), object1);
    }

    @Override
    public final Object remove(Object object0) {
        this.zzo();
        int v = this.zzl(((Comparable)object0));
        if(v >= 0) {
            return this.zzm(v);
        }
        return this.zzc.isEmpty() ? null : this.zzc.remove(((Comparable)object0));
    }

    @Override
    public final int size() {
        return this.zzb + this.zzc.size();
    }

    public void zza() {
        if(!this.zzd) {
            this.zzc = this.zzc.isEmpty() ? Collections.emptyMap() : DesugarCollections.unmodifiableMap(this.zzc);
            this.zzf = this.zzf.isEmpty() ? Collections.emptyMap() : DesugarCollections.unmodifiableMap(this.zzf);
            this.zzd = true;
        }
    }

    public final int zzc() {
        return this.zzb;
    }

    // 去混淆评级： 低(20)
    public final Iterable zzd() {
        return this.zzc.isEmpty() ? Collections.emptySet() : this.zzc.entrySet();
    }

    public final Object zzf(Comparable comparable0, Object object0) {
        this.zzo();
        int v = this.zzl(comparable0);
        if(v >= 0) {
            return ((zzgzz)this.zza[v]).setValue(object0);
        }
        this.zzo();
        if(this.zza == null) {
            this.zza = new Object[16];
        }
        if(-(v + 1) >= 16) {
            return this.zzn().put(comparable0, object0);
        }
        if(this.zzb == 16) {
            zzgzz zzgzz0 = (zzgzz)this.zza[15];
            this.zzb = 15;
            this.zzn().put(zzgzz0.zza(), zzgzz0.getValue());
        }
        System.arraycopy(this.zza, -(v + 1), this.zza, -v, 15 - -(v + 1));
        Object[] arr_object = this.zza;
        arr_object[-(v + 1)] = new zzgzz(this, comparable0, object0);
        ++this.zzb;
        return null;
    }

    public final Map.Entry zzg(int v) {
        if(v >= this.zzb) {
            throw new ArrayIndexOutOfBoundsException(v);
        }
        return (zzgzz)this.zza[v];
    }

    public final boolean zzj() {
        return this.zzd;
    }

    private final int zzl(Comparable comparable0) {
        int v = this.zzb;
        int v1 = v - 1;
        int v2 = 0;
        if(v1 >= 0) {
            int v3 = comparable0.compareTo(((zzgzz)this.zza[v1]).zza());
            if(v3 > 0) {
                return -(v + 1);
            }
            if(v3 == 0) {
                return v1;
            }
        }
        while(v2 <= v1) {
            int v4 = (v2 + v1) / 2;
            int v5 = comparable0.compareTo(((zzgzz)this.zza[v4]).zza());
            if(v5 < 0) {
                v1 = v4 - 1;
                continue;
            }
            if(v5 > 0) {
                v2 = v4 + 1;
                continue;
            }
            return v4;
        }
        return -(v2 + 1);
    }

    private final Object zzm(int v) {
        this.zzo();
        Object object0 = ((zzgzz)this.zza[v]).getValue();
        System.arraycopy(this.zza, v + 1, this.zza, v, this.zzb - v - 1);
        --this.zzb;
        if(!this.zzc.isEmpty()) {
            Iterator iterator0 = this.zzn().entrySet().iterator();
            Object[] arr_object = this.zza;
            int v1 = this.zzb;
            Object object1 = iterator0.next();
            arr_object[v1] = new zzgzz(this, ((Comparable)((Map.Entry)object1).getKey()), ((Map.Entry)object1).getValue());
            ++this.zzb;
            iterator0.remove();
        }
        return object0;
    }

    private final SortedMap zzn() {
        this.zzo();
        if(this.zzc.isEmpty() && !(this.zzc instanceof TreeMap)) {
            TreeMap treeMap0 = new TreeMap();
            this.zzc = treeMap0;
            this.zzf = treeMap0.descendingMap();
        }
        return (SortedMap)this.zzc;
    }

    private final void zzo() {
        if(this.zzd) {
            throw new UnsupportedOperationException();
        }
    }
}

