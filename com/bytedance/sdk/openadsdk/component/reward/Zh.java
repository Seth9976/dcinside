package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.component.Au.Au;
import com.bytedance.sdk.component.utils.SM;
import com.bytedance.sdk.component.utils.ltE;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.utils.Jo;
import java.util.Iterator;
import java.util.List;

public class Zh extends Au {
    private final List PjT;

    public Zh(String s, List list0) {
        super(s);
        this.PjT = list0;
    }

    @Override
    public void run() {
        if(ltE.ReZ(ub.PjT()) != 0) {
            List list0 = this.PjT;
            if(list0 != null) {
                Iterator iterator0 = list0.iterator();
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    Jo.PjT(((Au)object0), 1);
                    iterator0.remove();
                }
            }
        }
        try {
            SM.PjT().removeCallbacks(this);
        }
        catch(Exception unused_ex) {
        }
    }
}

