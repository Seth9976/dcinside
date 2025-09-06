package io.realm;

import io.realm.internal.core.NativeRealmAny;
import org.bson.types.ObjectId;

final class t0 extends z0 {
    t0(NativeRealmAny nativeRealmAny0) {
        super(nativeRealmAny0.asObjectId(), a.k, nativeRealmAny0);
    }

    t0(ObjectId objectId0) {
        super(objectId0, a.k);
    }

    @Override  // io.realm.J0
    protected NativeRealmAny c() {
        return new NativeRealmAny(((ObjectId)super.i(ObjectId.class)));
    }
}

