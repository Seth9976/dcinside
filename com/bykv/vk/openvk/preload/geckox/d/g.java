package com.bykv.vk.openvk.preload.geckox.d;

import android.net.Uri;
import android.util.Pair;
import com.bykv.vk.openvk.preload.b.k;
import com.bykv.vk.openvk.preload.geckox.b.a;
import com.bykv.vk.openvk.preload.geckox.b.b;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;
import java.util.List;

public class g extends k {
    private int d;

    public g() {
        this.d = 0;
    }

    @Override  // com.bykv.vk.openvk.preload.b.k
    protected final Object a() {
        UpdatePackage updatePackage0 = (UpdatePackage)this.g();
        List list0 = updatePackage0.getFullPackage().getUrlList();
        int v = this.d;
        this.d = v + 1;
        return new Pair(Uri.parse(((String)list0.get(v))), updatePackage0);
    }

    @Override  // com.bykv.vk.openvk.preload.b.k
    protected final boolean a(Throwable throwable0) {
        GeckoLogger.w("gecko-debug-tag", "full update failed and retry", throwable0);
        return this.d < ((UpdatePackage)this.g()).getFullPackage().getUrlList().size() ? throwable0 instanceof a || throwable0 instanceof b : false;
    }
}

