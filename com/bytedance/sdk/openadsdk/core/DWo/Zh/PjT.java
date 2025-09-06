package com.bytedance.sdk.openadsdk.core.DWo.Zh;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.SM.cz.Zh;
import com.bytedance.sdk.component.utils.Lrd;

public class PjT extends Zh {
    public PjT(Context context0) {
        super(context0);
    }

    @Override  // com.bytedance.adsdk.ugeno.SM.cz.Zh
    public void XX(String s) {
        super.XX(s);
        if(TextUtils.isEmpty(s)) {
            return;
        }
        if(TextUtils.equals("null", s)) {
            return;
        }
        try {
            String s1 = Lrd.PjT(this.Zh, "tt_comment_num");
            Object[] arr_object = {Integer.parseInt(s)};
            ((com.bytedance.adsdk.ugeno.SM.cz.PjT)this.JQp).setText("(" + String.format(s1, arr_object) + ")");
        }
        catch(Exception unused_ex) {
        }
    }
}

