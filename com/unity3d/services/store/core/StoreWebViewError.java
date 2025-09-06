package com.unity3d.services.store.core;

import com.unity3d.scar.adapter.common.n;
import java.util.Arrays;
import kotlin.jvm.internal.L;
import y4.l;
import y4.m;

public final class StoreWebViewError extends n {
    public StoreWebViewError(@m Enum enum0, @m String s, @l Object[] arr_object) {
        L.p(arr_object, "errorArguments");
        super(enum0, s, Arrays.copyOf(arr_object, arr_object.length));
    }

    // 去混淆评级： 低(20)
    @Override  // com.unity3d.scar.adapter.common.n
    @l
    public String getDomain() {
        return "STORE";
    }
}

