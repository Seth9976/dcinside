package com.bytedance.sdk.component.Zh.PjT.PjT.PjT;

import android.text.TextUtils;
import com.bytedance.sdk.component.Zh.PjT.Zh;
import com.bytedance.sdk.component.Zh.PjT.qj;
import com.bytedance.sdk.component.Zh.PjT.xs;

public class cr extends qj {
    public JQp Au;
    public PjT SM;

    public cr(com.bytedance.sdk.component.Zh.PjT.qj.PjT qj$PjT0) {
        super(qj$PjT0);
        JQp jQp0 = new JQp();
        this.Au = jQp0;
        this.SM = new PjT(jQp0.Zh());
    }

    @Override  // com.bytedance.sdk.component.Zh.PjT.qj
    public Zh PjT(xs xs0) {
        Zh zh0;
        xs0.PjT(this);
        if(xs0.Zh() != null && xs0.Zh().PjT() != null && !TextUtils.isEmpty(xs0.Zh().PjT().toString())) {
            if(PjT.PjT != null && PjT.PjT.Zh() && this.SM.JQp() && !"setting".equals(xs0.cz())) {
                zh0 = new com.bytedance.sdk.component.Zh.PjT.PjT.PjT.Zh(xs0, this.SM);
                this.SM.ReZ().add(zh0);
                return zh0;
            }
            zh0 = new com.bytedance.sdk.component.Zh.PjT.PjT.PjT.Zh(xs0, this.Au);
            this.Au.ReZ().add(zh0);
            return zh0;
        }
        return null;
    }

    @Override  // com.bytedance.sdk.component.Zh.PjT.qj
    public com.bytedance.sdk.component.Zh.PjT.cr PjT() {
        return this.Au;
    }
}

