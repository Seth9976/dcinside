package io.realm;

import io.realm.internal.core.NativeRealmAny;
import org.bson.types.Decimal128;

final class w extends z0 {
    w(NativeRealmAny nativeRealmAny0) {
        super(nativeRealmAny0.asDecimal128(), a.j, nativeRealmAny0);
    }

    w(Decimal128 decimal1280) {
        super(decimal1280, a.j);
    }

    @Override  // io.realm.J0
    protected NativeRealmAny c() {
        return new NativeRealmAny(((Decimal128)super.i(Decimal128.class)));
    }
}

