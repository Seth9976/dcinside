package com.bykv.vk.openvk.preload.geckox.d.b.a;

import android.net.Uri;
import android.util.Pair;
import com.bykv.vk.openvk.preload.b.d;
import com.bykv.vk.openvk.preload.geckox.buffer.a;
import com.bykv.vk.openvk.preload.geckox.buffer.stream.BufferOutputStream;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;
import java.io.File;

public class b extends d {
    private com.bykv.vk.openvk.preload.geckox.b d;
    private File e;

    private Object a(com.bykv.vk.openvk.preload.b.b b0, Pair pair0) throws Throwable {
        GeckoLogger.d("gecko-debug-tag", new Object[]{"start download full zip file, channel:", ((UpdatePackage)pair0.second).getChannel()});
        UpdatePackage updatePackage0 = (UpdatePackage)pair0.second;
        String s = ((Uri)pair0.first).toString();
        long v = updatePackage0.getFullPackage().getLength();
        File file0 = new File(this.e, updatePackage0.getAccessKey() + "/" + updatePackage0.getChannel() + "/" + updatePackage0.getVersion() + "--updating");
        file0.mkdirs();
        a a0 = com.bykv.vk.openvk.preload.geckox.buffer.a.a.a(new File(file0, "res.zip"), v);
        try {
            this.d.i().downloadFile(s, v, new BufferOutputStream(a0));
        }
        catch(Throwable throwable0) {
            throw new com.bykv.vk.openvk.preload.geckox.b.a("download full zip file failed, url:" + s + ", channel:" + updatePackage0.getChannel() + ", pkg id:" + updatePackage0.getFullPackage().getId() + ", caused by:" + throwable0.getMessage(), throwable0);
        }
        finally {
            a0.e();
        }
        return b0.a(new Pair(a0, updatePackage0));
    }

    @Override  // com.bykv.vk.openvk.preload.b.d
    public final Object a(com.bykv.vk.openvk.preload.b.b b0, Object object0) throws Throwable {
        return this.a(b0, ((Pair)object0));
    }

    @Override  // com.bykv.vk.openvk.preload.b.d
    protected final void a(Object[] arr_object) {
        super.a(arr_object);
        this.d = (com.bykv.vk.openvk.preload.geckox.b)arr_object[0];
        this.e = (File)arr_object[1];
    }
}

