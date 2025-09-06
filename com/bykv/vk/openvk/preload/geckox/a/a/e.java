package com.bykv.vk.openvk.preload.geckox.a.a;

import com.bykv.vk.openvk.preload.geckox.a.c;
import java.io.File;
import java.util.List;

final class e extends b {
    @Override  // com.bykv.vk.openvk.preload.geckox.a.a.b
    public final void a() {
        for(Object object0: this.e) {
            List list0 = com.bykv.vk.openvk.preload.geckox.utils.b.b(new File(this.d, ((String)object0)));
            if(list0 != null && list0.size() > this.c.a) {
                for(Object object1: list0.subList(0, list0.size() - this.c.a)) {
                    File file0 = (File)object1;
                    c.b(file0.getAbsolutePath());
                    if(this.c.b != null) {
                        file0.getName();
                    }
                }
            }
        }
    }

    @Override  // com.bykv.vk.openvk.preload.geckox.a.a.b
    public final void a(a a0, File file0, List list0) {
        super.a(a0, file0, list0);
    }
}

