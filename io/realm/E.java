package io.realm;

import io.realm.internal.core.NativeRealmAny;
import java.util.Arrays;

final class e extends z0 {
    e(NativeRealmAny nativeRealmAny0) {
        super(nativeRealmAny0.asBinary(), a.f, nativeRealmAny0);
    }

    e(byte[] arr_b) {
        super(arr_b, a.f);
    }

    @Override  // io.realm.J0
    protected NativeRealmAny c() {
        return new NativeRealmAny(((byte[])super.i(byte[].class)));
    }

    @Override  // io.realm.z0
    public boolean equals(Object object0) {
        if(object0 != null) {
            Class class0 = object0.getClass();
            return e.class.equals(class0) ? Arrays.equals(((byte[])this.i(byte[].class)), ((byte[])((J0)object0).i(byte[].class))) : false;
        }
        return false;
    }
}

