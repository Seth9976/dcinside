package io.realm;

import io.realm.internal.core.NativeRealmAny;

final class i extends z0 {
    i(NativeRealmAny nativeRealmAny0) {
        super(Boolean.valueOf(nativeRealmAny0.asBoolean()), a.d, nativeRealmAny0);
    }

    i(Boolean boolean0) {
        super(boolean0, a.d);
    }

    @Override  // io.realm.J0
    protected NativeRealmAny c() {
        return new NativeRealmAny(((Boolean)super.i(Boolean.class)));
    }
}

