package com.bytedance.sdk.component.adexpress.dynamic.animation.PjT;

import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.cr.PjT;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wN;
import java.util.ArrayList;
import java.util.List;

public class Zh implements wN {
    List PjT;

    public Zh(View view0, List list0) {
        this.PjT = new ArrayList();
        for(Object object0: list0) {
            cr cr0 = ReZ.PjT().PjT(view0, ((PjT)object0));
            if(cr0 != null) {
                this.PjT.add(cr0);
            }
        }
    }

    public void PjT() {
        for(Object object0: this.PjT) {
            cr cr0 = (cr)object0;
            try {
                cr0.ReZ();
            }
            catch(Exception unused_ex) {
            }
        }
    }

    @Override  // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wN
    public void Zh() {
        for(Object object0: this.PjT) {
            cr cr0 = (cr)object0;
            try {
                cr0.Zh();
            }
            catch(Exception unused_ex) {
            }
        }
    }
}

