package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.InitializationState;
import y4.l;

public interface GetInitializationState {
    public static final class DefaultImpls {
        public static InitializationState invoke$default(GetInitializationState getInitializationState0, boolean z, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            if((v & 1) != 0) {
                z = false;
            }
            return getInitializationState0.invoke(z);
        }
    }

    @l
    InitializationState invoke(boolean arg1);
}

