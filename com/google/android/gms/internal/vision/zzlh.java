package com.google.android.gms.internal.vision;

import j..util.DesugarCollections;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class zzlh extends AbstractMap {
    private final int zza;
    private List zzb;
    private Map zzc;
    private boolean zzd;
    private volatile zzlo zze;
    private Map zzf;
    private volatile zzli zzg;

    private zzlh(int v) {
        this.zza = v;
        this.zzb = Collections.emptyList();
        this.zzc = Collections.emptyMap();
        this.zzf = Collections.emptyMap();
    }

    zzlh(int v, zzlg zzlg0) {
        this(v);
    }

    @Override
    public void clear() {
        this.zzf();
        if(!this.zzb.isEmpty()) {
            this.zzb.clear();
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
            this.zze = new zzlo(this, null);
        }
        return this.zze;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zzlh)) {
            return super.equals(object0);
        }
        int v = this.size();
        if(v != ((zzlh)object0).size()) {
            return false;
        }
        int v1 = this.zzc();
        if(v1 != ((zzlh)object0).zzc()) {
            return this.entrySet().equals(((zzlh)object0).entrySet());
        }
        for(int v2 = 0; v2 < v1; ++v2) {
            if(!this.zzb(v2).equals(((zzlh)object0).zzb(v2))) {
                return false;
            }
        }
        return v1 == v ? true : this.zzc.equals(((zzlh)object0).zzc);
    }

    @Override
    public Object get(Object object0) {
        int v = this.zza(((Comparable)object0));
        return v < 0 ? this.zzc.get(((Comparable)object0)) : ((zzlm)this.zzb.get(v)).getValue();
    }

    @Override
    public int hashCode() {
        int v = this.zzc();
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 += ((zzlm)this.zzb.get(v1)).hashCode();
        }
        return this.zzc.size() <= 0 ? v2 : v2 + this.zzc.hashCode();
    }

    @Override
    public Object put(Object object0, Object object1) {
        return this.zza(((Comparable)object0), object1);
    }

    @Override
    public Object remove(Object object0) {
        this.zzf();
        int v = this.zza(((Comparable)object0));
        if(v >= 0) {
            return this.zzc(v);
        }
        return this.zzc.isEmpty() ? null : this.zzc.remove(((Comparable)object0));
    }

    @Override
    public int size() {
        return this.zzb.size() + this.zzc.size();
    }

    private final int zza(Comparable comparable0) {
        int v = this.zzb.size();
        int v1 = v - 1;
        if(v1 >= 0) {
            int v2 = comparable0.compareTo(((Comparable)((zzlm)this.zzb.get(v1)).getKey()));
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
            int v5 = comparable0.compareTo(((Comparable)((zzlm)this.zzb.get(v4)).getKey()));
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

    static zzlh zza(int v) {
        return new zzlg(v);
    }

    public final Object zza(Comparable comparable0, Object object0) {
        this.zzf();
        int v = this.zza(comparable0);
        if(v >= 0) {
            return ((zzlm)this.zzb.get(v)).setValue(object0);
        }
        this.zzf();
        if(this.zzb.isEmpty() && !(this.zzb instanceof ArrayList)) {
            this.zzb = new ArrayList(this.zza);
        }
        if(-(v + 1) >= this.zza) {
            return this.zzg().put(comparable0, object0);
        }
        int v1 = this.zza;
        if(this.zzb.size() == v1) {
            zzlm zzlm0 = (zzlm)this.zzb.remove(v1 - 1);
            this.zzg().put(((Comparable)zzlm0.getKey()), zzlm0.getValue());
        }
        this.zzb.add(-(v + 1), new zzlm(this, comparable0, object0));
        return null;
    }

    public void zza() {
        if(!this.zzd) {
            this.zzc = this.zzc.isEmpty() ? Collections.emptyMap() : DesugarCollections.unmodifiableMap(this.zzc);
            this.zzf = this.zzf.isEmpty() ? Collections.emptyMap() : DesugarCollections.unmodifiableMap(this.zzf);
            this.zzd = true;
        }
    }

    public final Map.Entry zzb(int v) {
        return (Map.Entry)this.zzb.get(v);
    }

    public final boolean zzb() {
        return this.zzd;
    }

    private final Object zzc(int v) {
        this.zzf();
        Object object0 = ((zzlm)this.zzb.remove(v)).getValue();
        if(!this.zzc.isEmpty()) {
            Iterator iterator0 = this.zzg().entrySet().iterator();
            List list0 = this.zzb;
            Object object1 = iterator0.next();
            list0.add(new zzlm(this, ((Map.Entry)object1)));
            iterator0.remove();
        }
        return object0;
    }

    public final int zzc() {
        return this.zzb.size();
    }

    public final Iterable zzd() {
        return this.zzc.isEmpty() ? zzll.zza() : this.zzc.entrySet();
    }

    final Set zze() {
        if(this.zzg == null) {
            this.zzg = new zzli(this, null);
        }
        return this.zzg;
    }

    private final void zzf() {
        if(this.zzd) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap zzg() {
        this.zzf();
        if(this.zzc.isEmpty() && !(this.zzc instanceof TreeMap)) {
            TreeMap treeMap0 = new TreeMap();
            this.zzc = treeMap0;
            this.zzf = treeMap0.descendingMap();
        }
        return (SortedMap)this.zzc;
    }
}

