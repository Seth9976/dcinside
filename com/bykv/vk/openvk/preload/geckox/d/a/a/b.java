package com.bykv.vk.openvk.preload.geckox.d.a.a;

import android.net.Uri;
import android.text.TextUtils;
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
        GeckoLogger.d("gecko-debug-tag", new Object[]{"start download full single file channel:", ((UpdatePackage)pair0.second).getChannel()});
        UpdatePackage updatePackage0 = (UpdatePackage)pair0.second;
        String s = ((Uri)pair0.first).toString();
        long v = updatePackage0.getFullPackage().getLength();
        File file0 = new File(this.e, updatePackage0.getAccessKey() + "/" + updatePackage0.getChannel() + "/" + updatePackage0.getVersion() + "--updating");
        file0.mkdirs();
        a a0 = com.bykv.vk.openvk.preload.geckox.buffer.a.a.a(new File(file0, "res/" + b.a(updatePackage0, s)), v);
        try {
            this.d.i().downloadFile(s, v, new BufferOutputStream(a0));
        }
        catch(Throwable throwable0) {
            a0.e();
            throw new com.bykv.vk.openvk.preload.geckox.b.a("download full single file failed! url:" + s + ", channel:" + updatePackage0.getChannel() + ", pkg id:" + updatePackage0.getFullPackage().getId() + ", caused by:" + throwable0.getMessage(), throwable0);
        }
        try {
            return b0.a(new Pair(a0, updatePackage0));
        }
        finally {
            try {
                a0.e();
            }
            catch(Exception exception0) {
                GeckoLogger.w("gecko-debug-tag", "DownloadFullSingleFile-release:", exception0);
            }
        }
    }

    public static String a(UpdatePackage updatePackage0, String s) {
        if(TextUtils.isEmpty(s)) {
            throw new RuntimeException("url empty, channel:" + updatePackage0.getChannel());
        }
        int v = s.lastIndexOf("/");
        if(v == -1) {
            throw new RuntimeException("url path illegal, url:" + s);
        }
        String s1 = s.substring(v + 1);
        if(TextUtils.isEmpty(s1)) {
            throw new RuntimeException("url path illegal, url:" + s);
        }
        return s1;
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

