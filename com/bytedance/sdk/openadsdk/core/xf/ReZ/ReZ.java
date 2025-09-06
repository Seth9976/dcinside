package com.bytedance.sdk.openadsdk.core.xf.ReZ;

import com.bytedance.sdk.component.utils.XX;
import com.bytedance.sdk.openadsdk.Zh.Zh;
import java.io.File;
import java.util.List;

public class ReZ extends Zh {
    public ReZ(int v, int v1) {
        super(v, v1);
    }

    public ReZ(int v, int v1, boolean z) {
        super(v, v1);
        this.PjT = z;
    }

    @Override  // com.bytedance.sdk.openadsdk.Zh.Zh
    protected void PjT(List list0) {
        int v = list0.size();
        if(!this.PjT(0L, v)) {
            for(Object object0: list0) {
                XX.ReZ(((File)object0));
                --v;
                if(this.PjT(((File)object0), 0L, v)) {
                    break;
                }
            }
        }
    }
}

