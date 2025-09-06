package com.bykv.vk.openvk.preload.geckox.d;

import android.util.Pair;
import com.bykv.vk.openvk.preload.b.b;
import com.bykv.vk.openvk.preload.b.d;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.utils.g;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class e extends d {
    private File d;
    private List e;

    @Override  // com.bykv.vk.openvk.preload.b.d
    public final Object a(b b0, Object object0) throws Throwable {
        GeckoLogger.d("gecko-debug-tag", new Object[]{"get local channel version:", ((String)object0)});
        HashMap hashMap0 = new HashMap();
        for(Object object1: this.e) {
            File file0 = new File(this.d, ((String)object1));
            String[] arr_s = file0.list();
            ArrayList arrayList0 = new ArrayList();
            if(arr_s != null && arr_s.length > 0) {
                int v = arr_s.length;
                for(int v1 = 0; v1 < v; ++v1) {
                    String s = arr_s[v1];
                    File file1 = new File(file0, s);
                    if(file1.isDirectory()) {
                        Long long0 = g.a(file1);
                        if(long0 != null) {
                            arrayList0.add(new Pair(s, long0));
                        }
                    }
                }
            }
            hashMap0.put(((String)object1), arrayList0);
        }
        return b0.a(hashMap0);
    }

    @Override  // com.bykv.vk.openvk.preload.b.d
    protected final void a(Object[] arr_object) {
        super.a(arr_object);
        this.d = (File)arr_object[0];
        this.e = (List)arr_object[1];
    }
}

