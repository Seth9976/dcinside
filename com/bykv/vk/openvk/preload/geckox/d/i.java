package com.bykv.vk.openvk.preload.geckox.d;

import android.util.Pair;
import com.bykv.vk.openvk.preload.b.b;
import com.bykv.vk.openvk.preload.b.d;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;

public class i extends d {
    @Override  // com.bykv.vk.openvk.preload.b.d
    public final Object a(b b0, Object object0) throws Throwable {
        GeckoLogger.d("gecko-debug-tag", new Object[]{"update success:", ((Pair)object0)});
        return b0.a(((Pair)object0));
    }
}

