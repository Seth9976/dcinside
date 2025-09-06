package androidx.arch.core.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.HashMap;
import java.util.Map.Entry;

@RestrictTo({Scope.c})
public class FastSafeIterableMap extends SafeIterableMap {
    private final HashMap e;

    public FastSafeIterableMap() {
        this.e = new HashMap();
    }

    @Override  // androidx.arch.core.internal.SafeIterableMap
    @Nullable
    protected Entry b(Object object0) {
        return (Entry)this.e.get(object0);
    }

    public boolean contains(Object object0) {
        return this.e.containsKey(object0);
    }

    @Override  // androidx.arch.core.internal.SafeIterableMap
    public Object h(@NonNull Object object0, @NonNull Object object1) {
        Entry safeIterableMap$Entry0 = this.b(object0);
        if(safeIterableMap$Entry0 != null) {
            return safeIterableMap$Entry0.b;
        }
        Entry safeIterableMap$Entry1 = this.g(object0, object1);
        this.e.put(object0, safeIterableMap$Entry1);
        return null;
    }

    @Override  // androidx.arch.core.internal.SafeIterableMap
    public Object i(@NonNull Object object0) {
        Object object1 = super.i(object0);
        this.e.remove(object0);
        return object1;
    }

    @Nullable
    public Map.Entry j(Object object0) {
        return this.contains(object0) ? ((Entry)this.e.get(object0)).d : null;
    }
}

