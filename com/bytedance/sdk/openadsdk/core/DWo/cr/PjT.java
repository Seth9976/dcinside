package com.bytedance.sdk.openadsdk.core.DWo.cr;

import android.content.Context;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.view.View;
import com.bytedance.adsdk.ugeno.Zh.ReZ;
import com.bytedance.adsdk.ugeno.core.DWo;
import com.bytedance.adsdk.ugeno.core.SM;
import com.bytedance.adsdk.ugeno.core.xf.Zh;
import com.bytedance.adsdk.ugeno.core.xf;
import com.bytedance.adsdk.ugeno.core.xs;
import com.bytedance.sdk.openadsdk.core.DWo.cz.cr;
import com.bytedance.sdk.openadsdk.utils.Jo;
import org.json.JSONException;
import org.json.JSONObject;

public class PjT implements xf, xs {
    interface com.bytedance.sdk.openadsdk.core.DWo.cr.PjT.PjT {
        void PjT(DWo arg1);
    }

    private final Context PjT;
    private com.bytedance.sdk.openadsdk.core.DWo.cr.PjT.PjT ReZ;
    private ReZ Zh;
    private xs cr;

    public PjT(Context context0) {
        this.PjT = context0;
    }

    @Override  // com.bytedance.adsdk.ugeno.core.xs
    public void PjT(ReZ reZ0, MotionEvent motionEvent0) {
        xs xs0 = this.cr;
        if(xs0 != null) {
            xs0.PjT(reZ0, motionEvent0);
        }
    }

    @Override  // com.bytedance.adsdk.ugeno.core.xf
    public void PjT(ReZ reZ0, String s, com.bytedance.adsdk.ugeno.cr.cz.PjT cz$PjT0) {
    }

    @Override  // com.bytedance.adsdk.ugeno.core.xf
    public void PjT(DWo dWo0, Zh xf$Zh0, com.bytedance.adsdk.ugeno.core.xf.PjT xf$PjT0) {
        if(dWo0 == null) {
            return;
        }
        switch(dWo0.Zh()) {
            case 1: 
            case 4: {
                com.bytedance.sdk.openadsdk.core.DWo.cr.PjT.PjT pjT$PjT0 = this.ReZ;
                if(pjT$PjT0 != null) {
                    pjT$PjT0.PjT(dWo0);
                }
            }
        }
        if(xf$Zh0 != null && dWo0.cr() != null) {
            xf$Zh0.PjT(dWo0.cr());
        }
    }

    public void PjT(xs xs0) {
        this.cr = xs0;
    }

    public void PjT(com.bytedance.sdk.openadsdk.core.DWo.cr.PjT.PjT pjT$PjT0) {
        this.ReZ = pjT$PjT0;
    }

    public void PjT(JSONObject jSONObject0, JSONObject jSONObject1, cr cr0) {
        if(Looper.myLooper() == Looper.getMainLooper()) {
            this.Zh(jSONObject0, jSONObject1, cr0);
            return;
        }
        Jo.PjT(() -> {
            try {
                SM sM0 = new SM(PjT.this.PjT);
                ReZ reZ0 = sM0.PjT(this.PjT);
                PjT.this.Zh = reZ0;
                if(reZ0 == null) {
                    if(this.ReZ != null) {
                        this.ReZ.PjT(3000, "ugen render fail");
                        return;
                    }
                    return;
                }
                View view0 = reZ0.qj();
                if(view0 != null) {
                    view0.setOnClickListener(new View.OnClickListener() {
                        final PjT PjT;

                        @Override  // android.view.View$OnClickListener
                        public void onClick(View view0) {
                        }
                    });
                }
                sM0.PjT(PjT.this);
                sM0.PjT(PjT.this);
                if(this.Zh != null) {
                    try {
                        this.Zh.put("language", com.bytedance.sdk.openadsdk.core.xf.Zh());
                        this.Zh.put("os", "Android");
                    }
                    catch(JSONException unused_ex) {
                    }
                }
                sM0.Zh(this.Zh);
                goto label_22;
            label_19:
                if(this.ReZ != null) {
                    goto label_20;
                }
                return;
            }
            catch(Exception exception0) {
                goto label_19;
            }
        label_20:
            this.ReZ.PjT(3000, "ugen render fail exception is" + exception0.getMessage());
            return;
        label_22:
            if(this.ReZ != null) {
                this.ReZ.PjT(PjT.this.Zh);
            }
        });

        class com.bytedance.sdk.openadsdk.core.DWo.cr.PjT.1 implements Runnable {
            final PjT cr;

            com.bytedance.sdk.openadsdk.core.DWo.cr.PjT.1(JSONObject jSONObject0, JSONObject jSONObject1, cr cr0) {
            }

            @Override
            public void run() {
                PjT.this.Zh(this.PjT, this.Zh, this.ReZ);
            }
        }

    }

    // 检测为 Lambda 实现
    private void Zh(JSONObject jSONObject0, JSONObject jSONObject1, cr cr0) [...]
}

