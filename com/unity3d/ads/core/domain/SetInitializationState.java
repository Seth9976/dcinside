package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.InitializationState;
import y4.l;

public interface SetInitializationState {
    public static final class DefaultImpls {
        public static void invoke$default(SetInitializationState setInitializationState0, InitializationState initializationState0, boolean z, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            if((v & 2) != 0) {
                z = false;
            }
            setInitializationState0.invoke(initializationState0, z);
        }
    }

    void invoke(@l InitializationState arg1, boolean arg2);
}

