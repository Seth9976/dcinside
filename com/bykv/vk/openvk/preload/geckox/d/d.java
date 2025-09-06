package com.bykv.vk.openvk.preload.geckox.d;

import android.util.Pair;
import com.bykv.vk.openvk.preload.b.b;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.utils.g;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class d extends com.bykv.vk.openvk.preload.b.d {
    private File d;
    private String e;

    @Override  // com.bykv.vk.openvk.preload.b.d
    public final Object a(b b0, Object object0) throws Throwable {
        GeckoLogger.d("gecko-debug-tag", new Object[]{"get local channel version:", ((List)object0)});
        File file0 = new File(this.d, this.e);
        ArrayList arrayList0 = new ArrayList();
        for(Object object1: ((List)object0)) {
            Long long0 = g.a(new File(file0, ((String)object1)));
            arrayList0.add(new Pair(((String)object1), ((long)(long0 == null ? 0L : ((long)long0)))));
        }
        return b0.a(arrayList0);
    }

    @Override  // com.bykv.vk.openvk.preload.b.d
    protected final void a(Object[] arr_object) {
        super.a(arr_object);
        this.d = (File)arr_object[0];
        this.e = (String)arr_object[1];
    }
}

