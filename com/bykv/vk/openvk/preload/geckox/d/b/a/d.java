package com.bykv.vk.openvk.preload.geckox.d.b.a;

import android.util.Pair;
import com.bykv.vk.openvk.preload.b.b;
import com.bykv.vk.openvk.preload.geckox.buffer.a;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;
import com.bykv.vk.openvk.preload.geckox.utils.h;
import java.io.File;

public class d extends com.bykv.vk.openvk.preload.b.d {
    private static Object a(b b0, Pair pair0) throws Throwable {
        GeckoLogger.d("gecko-debug-tag", new Object[]{"start unzip full zip file, channel:", ((UpdatePackage)pair0.second).getChannel()});
        a a0 = (a)pair0.first;
        a0.b(0L);
        UpdatePackage updatePackage0 = (UpdatePackage)pair0.second;
        File file0 = a0.f().getParentFile();
        try {
            h.a(new com.bykv.vk.openvk.preload.geckox.buffer.stream.a(a0), file0.getAbsolutePath(), updatePackage0.getChannel());
            a0.a();
        }
        catch(Exception exception0) {
            throw new RuntimeException("unzip full zip file failed, channel:" + updatePackage0.getChannel() + ", pkg id:" + updatePackage0.getFullPackage().getId() + ", dir:" + file0.getAbsolutePath() + ", caused by:" + exception0.getMessage(), exception0);
        }
        File file1 = new File(file0, "res");
        com.bykv.vk.openvk.preload.geckox.utils.b.a(file1);
        if(!new File(file0, updatePackage0.getChannel()).renameTo(file1)) {
            throw new RuntimeException("rename unziped full zip file failed:" + file0.getAbsolutePath() + ", dest:" + file1.getAbsolutePath() + ", exist?" + file1.exists());
        }
        return b0.a(new Pair(a0.f(), updatePackage0));
    }

    @Override  // com.bykv.vk.openvk.preload.b.d
    public final Object a(b b0, Object object0) throws Throwable {
        return d.a(b0, ((Pair)object0));
    }
}

