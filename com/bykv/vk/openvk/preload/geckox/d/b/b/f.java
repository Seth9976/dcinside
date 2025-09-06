package com.bykv.vk.openvk.preload.geckox.d.b.b;

import android.util.Pair;
import com.bykv.vk.openvk.preload.b.b;
import com.bykv.vk.openvk.preload.b.d;
import com.bykv.vk.openvk.preload.geckox.buffer.a;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;
import com.bykv.vk.openvk.preload.geckox.utils.h;
import java.io.File;

public class f extends d {
    private static Object a(b b0, Pair pair0) throws Throwable {
        GeckoLogger.d("gecko-debug-tag", new Object[]{"start unzip merged zip file, channel:", ((UpdatePackage)pair0.second).getChannel()});
        a a0 = (a)pair0.first;
        UpdatePackage updatePackage0 = (UpdatePackage)pair0.second;
        a0.b(0L);
        File file0 = a0.f().getParentFile();
        try {
            h.a(new com.bykv.vk.openvk.preload.geckox.buffer.stream.a(a0), file0.getAbsolutePath(), updatePackage0.getChannel());
            a0.a();
        }
        catch(Exception exception0) {
            throw new RuntimeException("unzip merged zip file failed, channel:" + updatePackage0.getChannel() + ", pkg id:" + updatePackage0.getPatch().getId() + exception0.getMessage(), exception0);
        }
        File file1 = new File(file0, "res");
        com.bykv.vk.openvk.preload.geckox.utils.b.a(file1);
        if(!new File(file0, updatePackage0.getChannel()).renameTo(file1)) {
            throw new RuntimeException("rename unzip merged zip file failed:" + file0.getAbsolutePath());
        }
        return b0.a(new Pair(a0.f(), updatePackage0));
    }

    @Override  // com.bykv.vk.openvk.preload.b.d
    public final Object a(b b0, Object object0) throws Throwable {
        return f.a(b0, ((Pair)object0));
    }
}

