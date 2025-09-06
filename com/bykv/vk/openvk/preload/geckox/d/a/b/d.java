package com.bykv.vk.openvk.preload.geckox.d.a.b;

import android.util.Pair;
import com.bykv.vk.openvk.preload.geckox.b;
import com.bykv.vk.openvk.preload.geckox.buffer.a;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;
import com.bykv.vk.openvk.preload.geckox.utils.BsPatch;
import java.io.File;

public class d extends com.bykv.vk.openvk.preload.b.d {
    private b d;

    private Object a(com.bykv.vk.openvk.preload.b.b b0, Pair pair0) throws Throwable {
        GeckoLogger.d("gecko-debug-tag", new Object[]{"start merge patch single file, channel:", ((UpdatePackage)pair0.second).getChannel()});
        a a0 = (a)pair0.first;
        File file0 = a0.f();
        a0.a();
        a0.e();
        File file1 = file0.getParentFile().getParentFile();
        UpdatePackage updatePackage0 = (UpdatePackage)pair0.second;
        File file2 = new File(file1, updatePackage0.getLocalVersion() + "/" + "res");
        File[] arr_file = file2.listFiles();
        if(arr_file != null && arr_file.length != 0) {
            File file3 = arr_file[0];
            File file4 = new File(file0.getParentFile(), "res/" + com.bykv.vk.openvk.preload.geckox.d.a.a.b.a(updatePackage0, ((String)updatePackage0.getFullPackage().getUrlList().get(0))));
            com.bykv.vk.openvk.preload.geckox.utils.b.a(file4);
            try {
                BsPatch.a(file3, file0, file4.getParentFile(), file4.getName());
            }
            catch(Exception exception0) {
                throw new RuntimeException("merge patch single file failed, channel：" + updatePackage0.getChannel() + ", pkg id:" + updatePackage0.getPatch().getId() + ", caused by:" + exception0.getMessage(), exception0);
            }
            finally {
                com.bykv.vk.openvk.preload.geckox.utils.b.a(file0);
            }
            a a1 = com.bykv.vk.openvk.preload.geckox.buffer.a.a.a(file4, file4.length());
            try {
                return b0.a(new Pair(a1, updatePackage0));
            }
            finally {
                a1.e();
            }
        }
        throw new RuntimeException("can not found old full single file,:" + file2.getAbsolutePath());
    }

    @Override  // com.bykv.vk.openvk.preload.b.d
    public final Object a(com.bykv.vk.openvk.preload.b.b b0, Object object0) throws Throwable {
        return this.a(b0, ((Pair)object0));
    }

    @Override  // com.bykv.vk.openvk.preload.b.d
    protected final void a(Object[] arr_object) {
        super.a(arr_object);
        this.d = (b)arr_object[0];
    }
}

