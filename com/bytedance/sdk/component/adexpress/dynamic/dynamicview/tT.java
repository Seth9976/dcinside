package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.cr.Au;

public class tT extends cz {
    public tT(Context context0, DynamicRootView dynamicRootView0, Au au0) {
        super(context0, dynamicRootView0, au0);
        View view0 = new View(context0);
        this.qla = view0;
        this.addView(view0, this.getWidgetLayoutParams());
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.cz
    public boolean SM() {
        super.SM();
        this.qla.setBackgroundColor(this.xf.Yo());
        return true;
    }
}

