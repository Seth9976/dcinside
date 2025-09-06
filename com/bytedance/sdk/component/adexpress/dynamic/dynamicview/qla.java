package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.cz.DWo;
import com.bytedance.sdk.component.adexpress.dynamic.cr.Au;

public class qla extends cz {
    String PjT;
    Au Zh;

    public qla(Context context0, DynamicRootView dynamicRootView0, Au au0, String s) {
        super(context0, dynamicRootView0, au0);
        this.PjT = s;
        this.Zh = au0;
        DWo dWo0 = this.getLottieView();
        if(dWo0 != null) {
            this.addView(dWo0, this.getWidgetLayoutParams());
        }
    }

    private DWo getLottieView() {
        DWo dWo0 = null;
        if(this.xs != null && this.xs.DWo() != null && this.qj != null && !TextUtils.isEmpty(this.PjT)) {
            com.bytedance.sdk.component.adexpress.dynamic.cr.cz cz0 = this.xs.DWo().JQp();
            String s = cz0 == null ? "" : cz0.wKV();
            if(!TextUtils.isEmpty(s)) {
                dWo0 = new DWo(this.qj);
                dWo0.setImageLottieTosPath(this.PjT + "static/lotties/" + s + ".json");
                dWo0.Au();
            }
        }
        return dWo0;
    }
}

