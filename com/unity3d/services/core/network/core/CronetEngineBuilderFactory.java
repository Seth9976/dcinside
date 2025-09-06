package com.unity3d.services.core.network.core;

import android.content.Context;
import kotlin.jvm.internal.L;
import org.chromium.net.CronetEngine.Builder;
import y4.l;

public final class CronetEngineBuilderFactory {
    @l
    public final Builder createCronetEngineBuilder(@l Context context0) {
        L.p(context0, "context");
        return new Builder(context0);
    }
}

