package com.bytedance.sdk.openadsdk.component.XX;

import android.content.Context;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.component.utils.XX;
import com.bytedance.sdk.openadsdk.component.cz;
import com.bytedance.sdk.openadsdk.core.SM;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.multipro.Zh;
import com.bytedance.sdk.openadsdk.utils.xf;
import java.io.File;
import org.json.JSONObject;

public class PjT {
    public static int PjT(Owx owx0, int v) {
        return v - owx0.Lmo();
    }

    public static File PjT(Context context0, String s, String s1) {
        return XX.PjT(context0, Zh.ReZ(), s, s1);
    }

    // 去混淆评级： 中等(60)
    public static File PjT(String s) {
        return new File("null/video_splash/" + s);
    }

    public static String PjT() {
        return xf.PjT();
    }

    public static void PjT(Context context0) {
        try {
            cz.PjT(context0).PjT();
        }
        catch(Throwable unused_ex) {
        }
    }

    public static void PjT(File file0) {
        if(file0 == null) {
            return;
        }
        try {
            XX.Zh(file0);
        }
        catch(Throwable unused_ex) {
        }
    }

    public static void PjT(JSONObject jSONObject0, int v, boolean z) {
        try {
            int v1 = SM.Zh().SM();
            JSONObject jSONObject1 = jSONObject0.getJSONObject("creative");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("app_name", "");
            if(!z) {
                jSONObject2.put("app_icon_id", "@" + v1);
            }
            else if(SM.Zh().SM() != 0) {
                jSONObject2.put("app_icon_id", "local://pag_open_icon_id");
            }
            jSONObject1.put("open_app_info", jSONObject2);
            if(jSONObject1.optJSONObject("video") == null) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("video_duration", ub.cr().tT(String.valueOf(v)));
                jSONObject1.put("video", jSONObject3);
            }
            return;
        }
        catch(Exception exception0) {
        }
        RD.Zh("TTAppOpenUtils", exception0.getMessage());
    }

    public static File Zh(String s) {
        String s1 = cz.PjT(ub.PjT()).Zh();
        return PjT.PjT(ub.PjT(), s1, s);
    }

    public static String Zh() {
        return XX.PjT(ub.PjT(), Zh.ReZ(), cz.PjT(ub.PjT()).Zh()).getAbsolutePath();
    }
}

