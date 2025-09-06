package com.bytedance.sdk.openadsdk.gK.PjT;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.ImageView.ScaleType;
import com.bytedance.sdk.component.JQp.Au;
import com.bytedance.sdk.component.JQp.qj;
import com.bytedance.sdk.component.JQp.xE;
import com.bytedance.sdk.openadsdk.SM.cr;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.utils.qZS;
import java.util.Map;

public class PjT {
    public interface com.bytedance.sdk.openadsdk.gK.PjT.PjT.PjT {
        void PjT(int arg1, String arg2, Throwable arg3);

        void PjT(String arg1, Zh arg2);
    }

    private int PjT(qj qj0) {
        Map map0 = qj0.cr();
        if(map0 != null) {
            Object object0 = map0.get("image_size");
            return object0 == null || !(object0 instanceof Integer) ? 0 : ((int)(((Integer)object0)));
        }
        return 0;
    }

    protected void PjT(int v, String s, Throwable throwable0, com.bytedance.sdk.openadsdk.gK.PjT.PjT.PjT pjT$PjT0) {
        if(pjT$PjT0 != null) {
            pjT$PjT0.PjT(v, s, throwable0);
        }
    }

    protected void PjT(qj qj0, com.bytedance.sdk.openadsdk.gK.PjT.PjT.PjT pjT$PjT0) {
        if(pjT$PjT0 != null) {
            Bitmap bitmap0 = null;
            Object object0 = qj0.Zh();
            int v = this.PjT(qj0);
            if(object0 instanceof byte[]) {
                pjT$PjT0.PjT(qj0.PjT(), new Zh(((byte[])object0), v));
                return;
            }
            if(object0 instanceof Bitmap) {
                if(qj0.ReZ() instanceof Bitmap) {
                    bitmap0 = (Bitmap)qj0.ReZ();
                }
                pjT$PjT0.PjT(qj0.PjT(), new Zh(((Bitmap)object0), bitmap0, v));
                return;
            }
            pjT$PjT0.PjT(0, "not bitmap or gif result!", null);
        }
    }

    public void PjT(com.bytedance.sdk.openadsdk.gK.PjT pjT0, com.bytedance.sdk.openadsdk.gK.PjT.PjT.PjT pjT$PjT0, int v, int v1, ImageView.ScaleType imageView$ScaleType0, String s, int v2, Owx owx0) {
        cr.PjT(pjT0.PjT).PjT(pjT0.Zh).PjT(v).Zh(v1).JQp(qZS.JQp(ub.PjT())).cr(qZS.ReZ(ub.PjT())).Zh(s).PjT(Bitmap.Config.RGB_565).PjT(imageView$ScaleType0).PjT(!TextUtils.isEmpty(s)).PjT(new Au() {
            final PjT Zh;

            @Override  // com.bytedance.sdk.component.JQp.Au
            public Bitmap PjT(Bitmap bitmap0) {
                return v2 > 0 ? com.bytedance.sdk.component.adexpress.cr.PjT.PjT(ub.PjT(), bitmap0, v2) : bitmap0;
            }
        }).PjT(new com.bytedance.sdk.openadsdk.SM.Zh(owx0, pjT0.PjT, new xE() {
            final PjT Zh;

            @Override  // com.bytedance.sdk.component.JQp.xE
            public void PjT(int v, String s, Throwable throwable0) {
                PjT.this.PjT(v, s, throwable0, pjT$PjT0);
            }

            @Override  // com.bytedance.sdk.component.JQp.xE
            public void PjT(qj qj0) {
                PjT.this.PjT(qj0, pjT$PjT0);
            }
        }));
    }
}

