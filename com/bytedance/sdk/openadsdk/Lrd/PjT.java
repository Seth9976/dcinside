package com.bytedance.sdk.openadsdk.Lrd;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.core.xf;
import com.bytedance.sdk.openadsdk.utils.wN;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class PjT {
    private static int PjT(int v) {
        return v == 2 || v == 3 || (v == 4 || v == 5 || v == 15) ? 2 : -1;
    }

    private static String PjT(String s) {
        if(!TextUtils.isEmpty(s)) {
            try {
                s = s.replace("[ss_random]", String.valueOf(new SecureRandom().nextLong()));
                return s.replace("[ss_timestamp]", "1757089024081");
            }
            catch(Exception exception0) {
                RD.Zh("TrackAdUrlUtils", exception0.getMessage());
            }
        }
        return s;
    }

    public static List PjT(List list0, boolean z) {
        String s = xf.PjT(ub.PjT());
        if(list0 == null) {
            return new ArrayList();
        }
        List list1 = new ArrayList();
        for(Object object0: list0) {
            String s1 = (String)object0;
            if(s1.contains("{TS}") || s1.contains("__TS__")) {
                s1 = s1.replace("{TS}", "1757089024573").replace("__TS__", "1757089024573");
            }
            if((s1.contains("{UID}") || s1.contains("__UID__")) && !TextUtils.isEmpty(s)) {
                s1 = s1.replace("{UID}", s).replace("__UID__", s);
            }
            if(z) {
                s1 = PjT.PjT(s1);
            }
            list1.add(s1);
        }
        return list1;
    }

    public static List PjT(List list0, boolean z, Owx owx0) {
        String s = xf.PjT(ub.PjT());
        if(list0 == null) {
            return new ArrayList();
        }
        List list1 = new ArrayList();
        for(Object object0: list0) {
            String s1 = (String)object0;
            if(s1.contains("{TS}") || s1.contains("__TS__")) {
                s1 = s1.replace("{TS}", "1757089028431").replace("__TS__", "1757089028431");
            }
            if((s1.contains("{UID}") || s1.contains("__UID__")) && !TextUtils.isEmpty(s)) {
                s1 = s1.replace("{UID}", s).replace("__UID__", s);
            }
            if(s1.contains("__CID__") && owx0 != null && !TextUtils.isEmpty(owx0.dIF())) {
                s1 = s1.replace("__CID__", owx0.dIF());
            }
            if(s1.contains("__CTYPE__") && owx0 != null) {
                s1 = s1.replace("__CTYPE__", String.valueOf(PjT.PjT(owx0.fK())));
            }
            if(s1.contains("__GAID__")) {
                s1 = s1.replace("__GAID__", com.bytedance.sdk.openadsdk.ltE.PjT.Zh.PjT.PjT().Zh());
            }
            if(s1.contains("__OS__")) {
                s1 = s1.replace("__OS__", "0");
            }
            if(s1.contains("__UA1__")) {
                s1 = s1.replace("__UA1__", URLEncoder.encode(wN.ReZ()));
            }
            if(z) {
                s1 = PjT.PjT(s1);
            }
            list1.add(s1);
        }
        return list1;
    }
}

