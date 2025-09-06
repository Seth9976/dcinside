package com.bykv.vk.openvk.preload.geckox.d.b.a;

import android.util.Pair;
import com.bykv.vk.openvk.preload.b.b;
import com.bykv.vk.openvk.preload.b.d;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;

public class a extends d {
    private static Object a(b b0, Pair pair0) throws Throwable {
        GeckoLogger.d("gecko-debug-tag", new Object[]{"start check full zip file, channel:", ((UpdatePackage)pair0.second).getChannel()});
        com.bykv.vk.openvk.preload.geckox.buffer.a a0 = (com.bykv.vk.openvk.preload.geckox.buffer.a)pair0.first;
        UpdatePackage updatePackage0 = (UpdatePackage)pair0.second;
        a0.b(0L);
        try {
            com.bykv.vk.openvk.preload.geckox.utils.d.a(new com.bykv.vk.openvk.preload.geckox.buffer.stream.a(a0), updatePackage0.getFullPackage().getMd5());
            return b0.a(pair0);
        }
        catch(Throwable throwable0) {
            throw new com.bykv.vk.openvk.preload.geckox.b.b("check full zip file failed, channel:" + updatePackage0.getChannel() + ", pkg id:" + updatePackage0.getFullPackage().getId() + ", caused by:" + throwable0.getMessage(), throwable0);
        }
    }

    @Override  // com.bykv.vk.openvk.preload.b.d
    public final Object a(b b0, Object object0) throws Throwable {
        return a.a(b0, ((Pair)object0));
    }
}

