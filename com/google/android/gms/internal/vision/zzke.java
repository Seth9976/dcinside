package com.google.android.gms.internal.vision;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class zzke extends LinkedHashMap {
    private boolean zza;
    private static final zzke zzb;

    static {
        zzke zzke0 = new zzke();
        zzke.zzb = zzke0;
        zzke0.zza = false;
    }

    private zzke() {
        this.zza = true;
    }

    private zzke(Map map0) {
        super(map0);
        this.zza = true;
    }

    @Override
    public final void clear() {
        this.zze();
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
            int v1 = zzke.zza(((Map.Entry)object0).getKey());
            v += zzke.zza(((Map.Entry)object0).getValue()) ^ v1;
        }
        return v;
    }

    @Override
    public final Object put(Object object0, Object object1) {
        this.zze();
        zzjf.zza(object0);
        zzjf.zza(object1);
        return super.put(object0, object1);
    }

    @Override
    public final void putAll(Map map0) {
        this.zze();
        for(Object object0: map0.keySet()) {
            zzjf.zza(object0);
            zzjf.zza(map0.get(object0));
        }
        super.putAll(map0);
    }

    @Override
    public final Object remove(Object object0) {
        this.zze();
        return super.remove(object0);
    }

    private static int zza(Object object0) {
        if(object0 instanceof byte[]) {
            return zzjf.zzc(((byte[])object0));
        }
        if(object0 instanceof zzje) {
            throw new UnsupportedOperationException();
        }
        return object0.hashCode();
    }

    public static zzke zza() {
        return zzke.zzb;
    }

    public final void zza(zzke zzke0) {
        this.zze();
        if(!zzke0.isEmpty()) {
            this.putAll(zzke0);
        }
    }

    // 去混淆评级： 低(20)
    public final zzke zzb() {
        return this.isEmpty() ? new zzke() : new zzke(this);
    }

    public final void zzc() {
        this.zza = false;
    }

    public final boolean zzd() {
        return this.zza;
    }

    private final void zze() {
        if(!this.zza) {
            throw new UnsupportedOperationException();
        }
    }
}

