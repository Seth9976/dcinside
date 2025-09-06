package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import o3.a;

public abstract class zzfxd extends zzfxe implements Map {
    @Override
    public final void clear() {
        this.zzb().clear();
    }

    @Override
    public boolean containsKey(@a Object object0) {
        return this.zzb().containsKey(object0);
    }

    @Override
    public boolean containsValue(@a Object object0) {
        return this.zzb().containsValue(object0);
    }

    @Override
    public Set entrySet() {
        return this.zzb().entrySet();
    }

    @Override
    public boolean equals(@a Object object0) {
        return object0 == this || this.zzb().equals(object0);
    }

    @Override
    @a
    public Object get(@a Object object0) {
        return this.zzb().get(object0);
    }

    @Override
    public int hashCode() {
        return this.zzb().hashCode();
    }

    @Override
    public boolean isEmpty() {
        return this.zzb().isEmpty();
    }

    @Override
    public Set keySet() {
        return this.zzb().keySet();
    }

    @Override
    @a
    public final Object put(Object object0, Object object1) {
        return this.zzb().put(object0, object1);
    }

    @Override
    public final void putAll(Map map0) {
        this.zzb().putAll(map0);
    }

    @Override
    @a
    public final Object remove(@a Object object0) {
        return this.zzb().remove(object0);
    }

    @Override
    public int size() {
        return this.zzb().size();
    }

    @Override
    public final Collection values() {
        return this.zzb().values();
    }

    @Override  // com.google.android.gms.internal.ads.zzfxe
    protected Object zza() {
        throw null;
    }

    protected abstract Map zzb();

    protected final int zzc() {
        return zzfzp.zza(this.entrySet());
    }

    protected final boolean zzd(@a Object object0) {
        zzfyf zzfyf0 = new zzfyf(this.entrySet().iterator());
        if(object0 == null) {
            while(zzfyf0.hasNext()) {
                Object object1 = zzfyf0.next();
                if(object1 != null) {
                    continue;
                }
                return true;
            }
        }
        else {
            while(zzfyf0.hasNext()) {
                Object object2 = zzfyf0.next();
                if(object0.equals(object2)) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }

    protected final boolean zze(@a Object object0) {
        return zzfyk.zzb(this, object0);
    }
}

