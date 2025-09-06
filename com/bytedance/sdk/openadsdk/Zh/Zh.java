package com.bytedance.sdk.openadsdk.Zh;

import java.io.File;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Zh extends PjT {
    private int ReZ;
    private int Zh;
    private volatile boolean cr;

    public Zh(int v, int v1) {
        this.Zh = 15;
        this.ReZ = 3;
        if(v <= 0) {
            throw new IllegalArgumentException("Max count must be positive number!");
        }
        this.Zh = v;
        this.ReZ = v1;
    }

    public Zh(int v, int v1, boolean z) {
        this.Zh = 15;
        this.ReZ = 3;
        if(v <= 0) {
            throw new IllegalArgumentException("Max count must be positive number!");
        }
        this.Zh = v;
        this.ReZ = v1;
        this.cr = z;
    }

    @Override  // com.bytedance.sdk.openadsdk.Zh.PjT
    protected void PjT(List list0) {
        if(this.cr) {
            this.cr(list0);
            this.cr = false;
            return;
        }
        this.ReZ(list0);
    }

    @Override  // com.bytedance.sdk.openadsdk.Zh.PjT
    protected boolean PjT(long v, int v1) {
        return v1 <= this.Zh;
    }

    @Override  // com.bytedance.sdk.openadsdk.Zh.PjT
    protected boolean PjT(File file0, long v, int v1) {
        return v1 <= this.ReZ;
    }

    private void ReZ(List list0) {
        long v = this.Zh(list0);
        int v1 = list0.size();
        if(!this.PjT(v, v1)) {
            for(Object object0: list0) {
                long v2 = ((File)object0).length();
                if(((File)object0).delete()) {
                    --v1;
                    v -= v2;
                }
                if(this.PjT(((File)object0), v, v1)) {
                    break;
                }
            }
        }
    }

    private void cr(List list0) {
        if(list0 != null) {
            try {
                if(list0.size() != 0) {
                    long v = this.Zh(list0);
                    int v1 = list0.size();
                    if(this.PjT(v, v1)) {
                        return;
                    }
                    TreeMap treeMap0 = new TreeMap();
                    for(Object object0: list0) {
                        treeMap0.put(((File)object0).lastModified(), ((File)object0));
                    }
                    for(Object object1: treeMap0.entrySet()) {
                        Map.Entry map$Entry0 = (Map.Entry)object1;
                        if(map$Entry0 != null) {
                            ((Long)map$Entry0.getKey()).longValue();
                            File file0 = (File)map$Entry0.getValue();
                            long v2 = file0.length();
                            if(file0.delete()) {
                                --v1;
                                v -= v2;
                            }
                            if(this.PjT(file0, v, v1)) {
                                break;
                            }
                        }
                    }
                }
            }
            catch(Throwable unused_ex) {
            }
        }
    }
}

