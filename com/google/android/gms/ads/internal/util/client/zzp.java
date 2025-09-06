package com.google.android.gms.ads.internal.util.client;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import java.lang.reflect.Array;
import o3.j;

@j
public final class zzp {
    public static boolean zza(@Nullable Bundle bundle0, @Nullable Bundle bundle1) {
        if(bundle0 != null && bundle1 != null) {
            if(bundle0.size() != bundle1.size()) {
                return false;
            }
            for(Object object0: bundle0.keySet()) {
                if(!bundle1.containsKey(((String)object0))) {
                    return false;
                }
                Object object1 = bundle0.get(((String)object0));
                Object object2 = bundle1.get(((String)object0));
                if(object1 != null && object2 != null) {
                    if(object1 instanceof Bundle) {
                        if(object2 instanceof Bundle && zzp.zza(((Bundle)object1), ((Bundle)object2))) {
                            continue;
                        }
                        return false;
                    }
                    if(object1.getClass().isArray()) {
                        int v = Array.getLength(object1);
                        if(object2.getClass().isArray() && v == Array.getLength(object2)) {
                            for(int v1 = 0; v1 < v; ++v1) {
                                if(!Objects.equal(Array.get(object1, v1), Array.get(object2, v1))) {
                                    return false;
                                }
                            }
                            continue;
                        }
                        return false;
                    }
                    if(object1.equals(object2)) {
                        continue;
                    }
                    return false;
                }
                return object1 == null && object2 == null;
            }
            return true;
        }
        return bundle0 == null && bundle1 == null;
    }
}

