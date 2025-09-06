package com.bytedance.sdk.component.adexpress.cz;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.adsdk.Zh.cr;
import com.bytedance.adsdk.Zh.cz;
import com.bytedance.sdk.component.JQp.Au;
import com.bytedance.sdk.component.JQp.qj;
import com.bytedance.sdk.component.JQp.xE;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public class DWo extends cz {
    static class PjT implements xE {
        private final WeakReference PjT;
        private final String ReZ;
        private final com.bytedance.adsdk.Zh.DWo Zh;
        private final Map cr;

        public PjT(DWo dWo0, com.bytedance.adsdk.Zh.DWo dWo1, String s, Map map0) {
            this.PjT = new WeakReference(dWo0);
            this.Zh = dWo1;
            this.ReZ = s;
            this.cr = map0;
        }

        @Override  // com.bytedance.sdk.component.JQp.xE
        public void PjT(int v, String s, Throwable throwable0) {
        }

        @Override  // com.bytedance.sdk.component.JQp.xE
        public void PjT(qj qj0) {
            Bitmap bitmap0 = Bitmap.createScaledBitmap(((Bitmap)qj0.Zh()), this.Zh.PjT(), this.Zh.Zh(), false);
            this.cr.put(this.ReZ, bitmap0);
            DWo dWo0 = (DWo)this.PjT.get();
            if(dWo0 != null) {
                dWo0.PjT(this.Zh.Au(), bitmap0);
            }
        }
    }

    private Map PjT;
    private String Zh;

    public DWo(Context context0) {
        super(context0);
        this.PjT = new HashMap();
    }

    public void Au() {
        if(TextUtils.isEmpty(this.Zh)) {
            return;
        }
        this.setProgress(0.0f);
        this.PjT(true);
        this.setAnimationFromUrl(this.Zh);
        this.setImageAssetDelegate(new cr() {
            final DWo PjT;

            @Override  // com.bytedance.adsdk.Zh.cr
            public Bitmap PjT(com.bytedance.adsdk.Zh.DWo dWo0) {
                String s = dWo0.Au();
                String s1 = dWo0.DWo();
                String s2 = !TextUtils.equals(s, "image_0") || !TextUtils.equals(dWo0.SM(), "Lark20201123-180048_2.png") ? dWo0.SM() : "hand.png";
                Bitmap bitmap0 = (Bitmap)DWo.this.PjT.get(s);
                if(bitmap0 != null) {
                    return bitmap0;
                }
                if(TextUtils.isEmpty(s1) || !TextUtils.isEmpty(s2)) {
                    if(TextUtils.isEmpty(s2) || !TextUtils.isEmpty(s1)) {
                        s1 = TextUtils.isEmpty(s2) || TextUtils.isEmpty(s1) ? "" : s1 + s2;
                    }
                    else {
                        s1 = s2;
                    }
                }
                if(TextUtils.isEmpty(s1)) {
                    return null;
                }
                com.bytedance.sdk.component.adexpress.PjT.PjT.PjT.PjT().JQp().PjT(s1).PjT(new Au() {
                    final com.bytedance.sdk.component.adexpress.cz.DWo.1 ReZ;

                    @Override  // com.bytedance.sdk.component.JQp.Au
                    public Bitmap PjT(Bitmap bitmap0) {
                        Bitmap bitmap1 = Bitmap.createScaledBitmap(bitmap0, dWo0.PjT(), dWo0.Zh(), false);
                        DWo.this.PjT.put(s, bitmap1);
                        return bitmap1;
                    }
                }).PjT(new PjT(DWo.this, dWo0, s, DWo.this.PjT));
                return (Bitmap)DWo.this.PjT.get(s);
            }
        });
        this.PjT();
    }

    public void setAnimationsLoop(boolean z) {
    }

    public void setData(Map map0) {
    }

    public void setImageLottieTosPath(String s) {
        this.Zh = s;
    }

    public void setLottieAdDescMaxLength(int v) {
    }

    public void setLottieAdTitleMaxLength(int v) {
    }

    public void setLottieAppNameMaxLength(int v) {
    }
}

