package com.bykv.vk.openvk.preload.geckox.d;

import com.bykv.vk.openvk.preload.b.j;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage.Package;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;
import java.util.List;

public class b extends j {
    @Override  // com.bykv.vk.openvk.preload.b.j
    protected final String a(Object object0) {
        Package updatePackage$Package0 = ((UpdatePackage)object0).getPatch();
        if(updatePackage$Package0 == null) {
            GeckoLogger.d("gecko-debug-tag", new Object[]{"start full update, channel:", ((UpdatePackage)object0).getChannel()});
            return "full";
        }
        List list0 = updatePackage$Package0.getUrlList();
        if(list0 != null && !list0.isEmpty()) {
            GeckoLogger.d("gecko-debug-tag", new Object[]{"start full update, channel:", ((UpdatePackage)object0).getChannel()});
            return "patch";
        }
        GeckoLogger.d("gecko-debug-tag", new Object[]{"start full update, channel:", ((UpdatePackage)object0).getChannel()});
        return "full";
    }

    @Override  // com.bykv.vk.openvk.preload.b.j
    protected final String a(Object object0, Throwable throwable0, String s) {
        if(!"patch".equals(s)) {
            throw new RuntimeException("full update failed, caused by:" + throwable0.getMessage(), throwable0);
        }
        GeckoLogger.d("gecko-debug-tag", new Object[]{"start full update, channel:", ((UpdatePackage)object0).getChannel()});
        return "full";
    }
}

