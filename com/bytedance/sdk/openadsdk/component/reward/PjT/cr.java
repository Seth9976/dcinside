package com.bytedance.sdk.openadsdk.component.reward.PjT;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.ltE.PjT.PjT.XX;
import com.bytedance.sdk.openadsdk.ltE.PjT.PjT.cz;
import com.bytedance.sdk.openadsdk.multipro.Zh;
import com.bytedance.sdk.openadsdk.utils.qla;
import org.json.JSONObject;

public class cr {
    public interface PjT {
        void PjT(View arg1, float arg2, float arg3, float arg4, float arg5, SparseArray arg6, int arg7, int arg8, int arg9);

        void PjT(String arg1, JSONObject arg2);
    }

    private final com.bytedance.sdk.openadsdk.component.reward.PjT.PjT JQp;
    cz PjT;
    private final String ReZ;
    private final Owx Zh;
    private boolean cr;

    public cr(com.bytedance.sdk.openadsdk.component.reward.PjT.PjT pjT0) {
        this.JQp = pjT0;
        this.Zh = pjT0.Zh;
        this.ReZ = pjT0.JQp;
    }

    public void PjT() {
        if(this.cr) {
            return;
        }
        this.cr = true;
        this.cr();
    }

    public void PjT(View view0, float f, float f1, float f2, float f3, SparseArray sparseArray0, int v, int v1, int v2, PjT cr$PjT0) {
        if(this.PjT != null) {
            int v3 = view0.getId();
            if(v3 == qla.JQp) {
                cr$PjT0.PjT("click_play_star_level", null);
                return;
            }
            if(v3 == qla.cr) {
                cr$PjT0.PjT("click_play_star_nums", null);
                return;
            }
            if(v3 == qla.ReZ) {
                cr$PjT0.PjT("click_play_source", null);
                return;
            }
            if(v3 == qla.Zh) {
                cr$PjT0.PjT("click_play_logo", null);
            }
            return;
        }
        cr$PjT0.PjT(view0, f, f1, f2, f3, sparseArray0, v, v1, v2);
    }

    public cz ReZ() {
        return this.PjT;
    }

    public void Zh() {
        cz cz0 = this.PjT;
        if(cz0 != null) {
            cz0.cr();
        }
    }

    private void cr() {
        if(!Zh.ReZ() && this.Zh.cI() == 4) {
            this.PjT = XX.PjT(this.JQp.IJ, this.Zh, this.ReZ);
        }
        if(this.PjT == null) {
            this.PjT = XX.PjT(this.JQp.rds, this.Zh, this.ReZ);
        }
    }
}

