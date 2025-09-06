package com.bykv.vk.openvk.preload.geckox.d.b.b;

import android.util.Pair;
import com.bykv.vk.openvk.preload.b.b;
import com.bykv.vk.openvk.preload.b.d;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;
import java.io.File;

public class e extends d {
    @Override  // com.bykv.vk.openvk.preload.b.d
    public final Object a(b b0, Object object0) throws Throwable {
        GeckoLogger.d("gecko-debug-tag", new Object[]{"start active merged zip file, channel:", ((UpdatePackage)((Pair)object0).second).getChannel()});
        File file0 = ((File)((Pair)object0).first).getParentFile();
        long v = ((UpdatePackage)((Pair)object0).second).getVersion();
        File file1 = new File(file0.getParentFile(), String.valueOf(v));
        com.bykv.vk.openvk.preload.geckox.utils.b.a(file1);
        if(!file0.renameTo(file1)) {
            throw new RuntimeException("active merged zip file failed:" + file0.getAbsolutePath());
        }
        return b0.a(new Pair(((UpdatePackage)((Pair)object0).second).getChannel(), v));
    }
}

