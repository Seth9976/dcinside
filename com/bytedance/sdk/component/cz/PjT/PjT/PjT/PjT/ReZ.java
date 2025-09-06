package com.bytedance.sdk.component.cz.PjT.PjT.PjT.PjT;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.sdk.component.cz.PjT.XX.PjT;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class ReZ {
    private final Context PjT;
    private boolean ReZ;
    protected final List Zh;
    private final Runnable cr;

    public ReZ(Context context0) {
        this.Zh = new ArrayList();
        this.ReZ = false;
        this.cr = new Runnable() {
            final ReZ PjT;

            @Override
            public void run() {
                ArrayList arrayList0;
                synchronized(ReZ.this) {
                    if(ReZ.this.Zh.isEmpty()) {
                        ReZ.this.ReZ = false;
                        return;
                    }
                    arrayList0 = new ArrayList(ReZ.this.Zh);
                    ReZ.this.Zh.clear();
                    ReZ.this.ReZ = false;
                }
                ReZ.this.cr(arrayList0);
            }
        };
        this.PjT = context0;
    }

    public Context JQp() {
        return this.PjT;
    }

    private void PjT() {
        if(!this.ReZ) {
            Handler handler0 = PjT.PjT();
            long v = (long)PjT.Zh();
            handler0.postDelayed(this.cr, v);
            this.ReZ = true;
        }
    }

    public void PjT(com.bytedance.sdk.component.cz.PjT.cr.PjT pjT0) {
        synchronized(this) {
            if(pjT0.XX() != null && !TextUtils.isEmpty(pjT0.ReZ())) {
                this.Zh.add(pjT0);
                this.PjT();
            }
        }
    }

    protected void ReZ(List list0) {
        if(list0 != null && !list0.isEmpty()) {
            try {
                Iterator iterator0 = this.Zh.iterator();
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    com.bytedance.sdk.component.cz.PjT.cr.PjT pjT0 = (com.bytedance.sdk.component.cz.PjT.cr.PjT)object0;
                    if(pjT0 != null) {
                        String s = pjT0.ReZ();
                        if(!TextUtils.isEmpty(s) && list0.contains(s)) {
                            iterator0.remove();
                        }
                    }
                }
            }
            catch(Throwable unused_ex) {
                this.Zh();
            }
        }
    }

    public abstract String Zh();

    public void cr(List list0) {
        com.bytedance.sdk.component.cz.PjT.PjT.PjT.ReZ.PjT(this.JQp(), this.Zh(), list0);
    }
}

