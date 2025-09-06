package com.bykv.vk.openvk.preload.geckox.d;

import com.bykv.vk.openvk.preload.geckox.model.UpdatePackage;

public class a extends com.bykv.vk.openvk.preload.b.a {
    @Override  // com.bykv.vk.openvk.preload.b.a
    protected final String a(Object object0) {
        int v = ((UpdatePackage)object0).getPackageType();
        switch(v) {
            case 0: {
                return "branch_zip";
            }
            case 1: {
                return "branch_single_file";
            }
            default: {
                throw new RuntimeException("unknow file type: " + v);
            }
        }
    }
}

