package com.bytedance.sdk.component.Zh.PjT.PjT.PjT;

import com.bytedance.sdk.component.Zh.PjT.Au.PjT;
import com.bytedance.sdk.component.Zh.PjT.Au;
import com.bytedance.sdk.component.Zh.PjT.qla;
import com.bytedance.sdk.component.Zh.PjT.xs;
import java.io.IOException;
import java.util.List;

public class ReZ implements PjT {
    List PjT;
    int ReZ;
    xs Zh;

    ReZ(List list0, xs xs0) {
        this.ReZ = 0;
        this.PjT = list0;
        this.Zh = xs0;
    }

    @Override  // com.bytedance.sdk.component.Zh.PjT.Au$PjT
    public qla PjT(xs xs0) throws IOException {
        this.Zh = xs0;
        int v = this.ReZ + 1;
        this.ReZ = v;
        return v < this.PjT.size() ? ((Au)this.PjT.get(this.ReZ)).PjT(this) : null;
    }

    @Override  // com.bytedance.sdk.component.Zh.PjT.Au$PjT
    public xs PjT() {
        return this.Zh;
    }
}

