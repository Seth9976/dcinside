package io.realm;

import io.realm.internal.core.NativeRealmAny;

final class v1 extends z0 {
    v1(NativeRealmAny nativeRealmAny0) {
        super(nativeRealmAny0.asString(), a.e, nativeRealmAny0);
    }

    v1(String s) {
        super(s, a.e);
    }

    @Override  // io.realm.J0
    protected NativeRealmAny c() {
        return new NativeRealmAny(((String)super.i(String.class)));
    }
}

