package io.realm;

import io.realm.internal.core.NativeRealmAny;
import java.util.Date;

final class s extends z0 {
    s(NativeRealmAny nativeRealmAny0) {
        super(nativeRealmAny0.asDate(), a.g, nativeRealmAny0);
    }

    s(Date date0) {
        super(date0, a.g);
    }

    @Override  // io.realm.J0
    protected NativeRealmAny c() {
        return new NativeRealmAny(((Date)super.i(Date.class)));
    }
}

