package com.google.android.gms.internal.clearcut;

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

class zzei extends AbstractMap {
    private boolean zzgu;
    private final int zzol;
    private List zzom;
    private Map zzon;
    private volatile zzer zzoo;
    private Map zzop;
    private volatile zzel zzoq;

    private zzei(int v) {
        this.zzol = v;
        this.zzom = Collections.emptyList();
        this.zzon = Collections.emptyMap();
        this.zzop = Collections.emptyMap();
    }

    zzei(int v, zzej zzej0) {
        this(v);
    }

    @Override
    public void clear() {
        this.zzdu();
        if(!this.zzom.isEmpty()) {
            this.zzom.clear();
        }
        if(!this.zzon.isEmpty()) {
            this.zzon.clear();
        }
    }

    @Override
    public boolean containsKey(Object object0) {
        return this.zza(((Comparable)object0)) >= 0 || this.zzon.containsKey(((Comparable)object0));
    }

    @Override
    public Set entrySet() {
        if(this.zzoo == null) {
            this.zzoo = new zzer(this, null);
        }
        return this.zzoo;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zzei)) {
            return super.equals(object0);
        }
        int v = this.size();
        if(v != ((zzei)object0).size()) {
            return false;
        }
        int v1 = this.zzdr();
        if(v1 != ((zzei)object0).zzdr()) {
            return this.entrySet().equals(((zzei)object0).entrySet());
        }
        for(int v2 = 0; v2 < v1; ++v2) {
            if(!this.zzak(v2).equals(((zzei)object0).zzak(v2))) {
                return false;
            }
        }
        return v1 == v ? true : this.zzon.equals(((zzei)object0).zzon);
    }

    @Override
    public Object get(Object object0) {
        int v = this.zza(((Comparable)object0));
        return v < 0 ? this.zzon.get(((Comparable)object0)) : ((zzep)this.zzom.get(v)).getValue();
    }

    @Override
    public int hashCode() {
        int v = this.zzdr();
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 += ((zzep)this.zzom.get(v1)).hashCode();
        }
        return this.zzon.size() <= 0 ? v2 : v2 + this.zzon.hashCode();
    }

    public final boolean isImmutable() {
        return this.zzgu;
    }

    @Override
    public Object put(Object object0, Object object1) {
        return this.zza(((Comparable)object0), object1);
    }

    @Override
    public Object remove(Object object0) {
        this.zzdu();
        int v = this.zza(((Comparable)object0));
        if(v >= 0) {
            return this.zzal(v);
        }
        return this.zzon.isEmpty() ? null : this.zzon.remove(((Comparable)object0));
    }

    @Override
    public int size() {
        return this.zzom.size() + this.zzon.size();
    }

    private final int zza(Comparable comparable0) {
        int v = this.zzom.size();
        int v1 = v - 1;
        if(v1 >= 0) {
            int v2 = comparable0.compareTo(((Comparable)((zzep)this.zzom.get(v1)).getKey()));
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
            int v5 = comparable0.compareTo(((Comparable)((zzep)this.zzom.get(v4)).getKey()));
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

    public final Object zza(Comparable comparable0, Object object0) {
        this.zzdu();
        int v = this.zza(comparable0);
        if(v >= 0) {
            return ((zzep)this.zzom.get(v)).setValue(object0);
        }
        this.zzdu();
        if(this.zzom.isEmpty() && !(this.zzom instanceof ArrayList)) {
            this.zzom = new ArrayList(this.zzol);
        }
        if(-(v + 1) >= this.zzol) {
            return this.zzdv().put(comparable0, object0);
        }
        int v1 = this.zzol;
        if(this.zzom.size() == v1) {
            zzep zzep0 = (zzep)this.zzom.remove(v1 - 1);
            this.zzdv().put(((Comparable)zzep0.getKey()), zzep0.getValue());
        }
        this.zzom.add(-(v + 1), new zzep(this, comparable0, object0));
        return null;
    }

    static zzei zzaj(int v) {
        return new zzej(v);
    }

    public final Map.Entry zzak(int v) {
        return (Map.Entry)this.zzom.get(v);
    }

    private final Object zzal(int v) {
        this.zzdu();
        Object object0 = ((zzep)this.zzom.remove(v)).getValue();
        if(!this.zzon.isEmpty()) {
            Iterator iterator0 = this.zzdv().entrySet().iterator();
            List list0 = this.zzom;
            Object object1 = iterator0.next();
            list0.add(new zzep(this, ((Map.Entry)object1)));
            iterator0.remove();
        }
        return object0;
    }

    public final int zzdr() {
        return this.zzom.size();
    }

    public final Iterable zzds() {
        return this.zzon.isEmpty() ? zzem.zzdx() : this.zzon.entrySet();
    }

    final Set zzdt() {
        if(this.zzoq == null) {
            this.zzoq = new zzel(this, null);
        }
        return this.zzoq;
    }

    private final void zzdu() {
        if(this.zzgu) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap zzdv() {
        this.zzdu();
        if(this.zzon.isEmpty() && !(this.zzon instanceof TreeMap)) {
            TreeMap treeMap0 = new TreeMap();
            this.zzon = treeMap0;
            this.zzop = treeMap0.descendingMap();
        }
        return (SortedMap)this.zzon;
    }

    public void zzv() {
        if(!this.zzgu) {
            this.zzon = this.zzon.isEmpty() ? Collections.emptyMap() : DesugarCollections.unmodifiableMap(this.zzon);
            this.zzop = this.zzop.isEmpty() ? Collections.emptyMap() : DesugarCollections.unmodifiableMap(this.zzop);
            this.zzgu = true;
        }
    }
}

