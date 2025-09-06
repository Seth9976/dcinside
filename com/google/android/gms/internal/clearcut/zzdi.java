package com.google.android.gms.internal.clearcut;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class zzdi extends LinkedHashMap {
    private boolean zzfa;
    private static final zzdi zzme;

    static {
        zzdi zzdi0 = new zzdi();
        zzdi.zzme = zzdi0;
        zzdi0.zzfa = false;
    }

    private zzdi() {
        this.zzfa = true;
    }

    private zzdi(Map map0) {
        super(map0);
        this.zzfa = true;
    }

    @Override
    public final void clear() {
        this.zzcb();
        super.clear();
    }

    // 去混淆评级： 低(20)
    @Override
    public final Set entrySet() {
        return this.isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 instanceof Map) {
            if(this != ((Map)object0)) {
                if(this.size() == ((Map)object0).size()) {
                    Iterator iterator0 = this.entrySet().iterator();
                    while(true) {
                        if(!iterator0.hasNext()) {
                            return true;
                        }
                        Object object1 = iterator0.next();
                        if(!((Map)object0).containsKey(((Map.Entry)object1).getKey())) {
                            break;
                        }
                        Object object2 = ((Map.Entry)object1).getValue();
                        Object object3 = ((Map)object0).get(((Map.Entry)object1).getKey());
                        if((!(object2 instanceof byte[]) || !(object3 instanceof byte[]) ? object2.equals(object3) : Arrays.equals(((byte[])object2), ((byte[])object3)))) {
                            continue;
                        }
                        return false;
                    }
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        for(Object object0: this.entrySet()) {
            int v1 = zzdi.zzf(((Map.Entry)object0).getKey());
            v += zzdi.zzf(((Map.Entry)object0).getValue()) ^ v1;
        }
        return v;
    }

    public final boolean isMutable() {
        return this.zzfa;
    }

    @Override
    public final Object put(Object object0, Object object1) {
        this.zzcb();
        zzci.checkNotNull(object0);
        zzci.checkNotNull(object1);
        return super.put(object0, object1);
    }

    @Override
    public final void putAll(Map map0) {
        this.zzcb();
        for(Object object0: map0.keySet()) {
            zzci.checkNotNull(object0);
            zzci.checkNotNull(map0.get(object0));
        }
        super.putAll(map0);
    }

    @Override
    public final Object remove(Object object0) {
        this.zzcb();
        return super.remove(object0);
    }

    public final void zza(zzdi zzdi0) {
        this.zzcb();
        if(!zzdi0.isEmpty()) {
            this.putAll(zzdi0);
        }
    }

    public static zzdi zzbz() {
        return zzdi.zzme;
    }

    // 去混淆评级： 低(20)
    public final zzdi zzca() {
        return this.isEmpty() ? new zzdi() : new zzdi(this);
    }

    private final void zzcb() {
        if(!this.zzfa) {
            throw new UnsupportedOperationException();
        }
    }

    private static int zzf(Object object0) {
        if(object0 instanceof byte[]) {
            return zzci.hashCode(((byte[])object0));
        }
        if(object0 instanceof zzcj) {
            throw new UnsupportedOperationException();
        }
        return object0.hashCode();
    }

    public final void zzv() {
        this.zzfa = false;
    }
}

