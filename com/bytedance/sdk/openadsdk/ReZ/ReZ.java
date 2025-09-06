package com.bytedance.sdk.openadsdk.ReZ;

import android.app.Activity;
import android.content.Context;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.cRA.PjT;
import com.bytedance.sdk.openadsdk.core.cRA;
import java.util.List;

public class ReZ implements cRA {
    private PjT JQp;
    public xf PjT;
    private cr ReZ;
    private final Context Zh;
    private boolean cr;

    public ReZ(Context context0, String s, List list0, String s1, String s2) {
        this.Zh = context0;
        this.PjT(s, list0, s1, s2);
    }

    private void PjT(String s, List list0, String s1, String s2) {
        this.ReZ = new cr(this.Zh, s, list0, s2);
        DWo dWo0 = this.ReZ.getDislikeManager();
        xf xf0 = new xf(this.Zh, dWo0);
        this.PjT = xf0;
        xf0.PjT(s, s1);
        this.PjT.PjT(s2);
        this.PjT.PjT(new com.bytedance.sdk.openadsdk.ReZ.xf.PjT() {
            final ReZ PjT;

            @Override  // com.bytedance.sdk.openadsdk.ReZ.xf$PjT
            public void PjT() {
            }

            @Override  // com.bytedance.sdk.openadsdk.ReZ.xf$PjT
            public void PjT(int v, FilterWord filterWord0, String s) {
                ReZ.this.ReZ.onSuggestionSubmit(s);
                ReZ.this.PjT();
            }

            @Override  // com.bytedance.sdk.openadsdk.ReZ.xf$PjT
            public void ReZ() {
                ReZ.this.PjT();
            }

            @Override  // com.bytedance.sdk.openadsdk.ReZ.xf$PjT
            public void Zh() {
                ReZ.this.PjT();
            }
        });
        this.ReZ.PjT(new com.bytedance.sdk.openadsdk.ReZ.cr.PjT() {
            final ReZ PjT;

            @Override  // com.bytedance.sdk.openadsdk.ReZ.cr$PjT
            public void PjT() {
                ReZ.this.PjT(true);
                if(ReZ.this.ReZ != null && ReZ.this.ReZ.isShowing()) {
                    ReZ.this.ReZ.hide();
                }
                ReZ.this.cr();
            }

            @Override  // com.bytedance.sdk.openadsdk.ReZ.cr$PjT
            public void PjT(int v, FilterWord filterWord0) {
                try {
                    if(!filterWord0.hasSecondOptions() && ReZ.this.JQp != null) {
                        ReZ.this.JQp.PjT(v, filterWord0.getName());
                    }
                }
                catch(Throwable unused_ex) {
                }
            }

            @Override  // com.bytedance.sdk.openadsdk.ReZ.cr$PjT
            public void Zh() {
                try {
                    if(ReZ.this.JQp != null) {
                        ReZ.this.JQp.PjT();
                    }
                }
                catch(Throwable throwable0) {
                    RD.PjT("TTAdDislikeImpl", "dislike callback cancel error: ", throwable0);
                }
            }
        });
    }

    @Override  // com.bytedance.sdk.openadsdk.core.cRA
    public void PjT() {
        if(this.Zh instanceof Activity && !((Activity)this.Zh).isFinishing() && !this.ReZ.isShowing()) {
            this.ReZ.show();
        }
    }

    @Override  // com.bytedance.sdk.openadsdk.core.cRA
    public void PjT(PjT cRA$PjT0) {
        this.JQp = cRA$PjT0;
    }

    public void PjT(String s) {
        cr cr0 = this.ReZ;
        if(cr0 != null) {
            cr0.PjT(s);
        }
    }

    public void PjT(boolean z) {
        this.cr = z;
    }

    public boolean ReZ() {
        return this.cr;
    }

    @Override  // com.bytedance.sdk.openadsdk.core.cRA
    public void Zh() {
        cr cr0 = this.ReZ;
        if(cr0 != null) {
            cr0.destroy();
        }
    }

    private void cr() {
        Context context0 = this.Zh;
        if(!(context0 instanceof Activity)) {
            return;
        }
        if(!((Activity)context0).isFinishing() && !this.PjT.isShowing()) {
            this.PjT.show();
        }
    }
}

