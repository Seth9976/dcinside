package com.bytedance.sdk.openadsdk.multipro.aidl.PjT;

import android.content.ContentValues;
import android.net.Uri;
import com.bytedance.sdk.component.cz.PjT.cz.PjT;
import com.bytedance.sdk.openadsdk.core.settings.SM;
import com.bytedance.sdk.openadsdk.core.ub;
import com.bytedance.sdk.openadsdk.multipro.JQp;
import java.util.Map;

public class cz extends PjT {
    private static volatile cz PjT;

    @Override  // com.bytedance.sdk.component.cz.PjT.cz
    public int PjT(Uri uri0, ContentValues contentValues0, String s, String[] arr_s) {
        return SM.PjT() ? JQp.PjT(ub.PjT()).PjT(uri0, contentValues0, s, arr_s) : 0;
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.cz
    public int PjT(Uri uri0, String s, String[] arr_s) {
        return SM.PjT() ? JQp.PjT(ub.PjT()).PjT(uri0, s, arr_s) : 0;
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.cz
    public String PjT(Uri uri0) {
        return SM.PjT() ? JQp.PjT(ub.PjT()).PjT(uri0) : null;
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.cz
    public String PjT(Uri uri0, ContentValues contentValues0) {
        if(!SM.PjT()) {
            return null;
        }
        Uri uri1 = JQp.PjT(ub.PjT()).PjT(uri0, contentValues0);
        return uri1 == null ? null : uri1.toString();
    }

    @Override  // com.bytedance.sdk.component.cz.PjT.cz
    public Map PjT(Uri uri0, String[] arr_s, String s, String[] arr_s1, String s1) {
        if(!SM.PjT()) {
            return null;
        }
        try {
            return com.bytedance.sdk.openadsdk.multipro.PjT.PjT.PjT(JQp.PjT(ub.PjT()).PjT(uri0, arr_s, s, arr_s1, s1));
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    public static cz Zh() {
        if(cz.PjT == null) {
            Class class0 = cz.class;
            __monitor_enter(class0);
            try {
                if(cz.PjT == null) {
                    cz.PjT = new cz();
                }
                __monitor_exit(class0);
                return cz.PjT;
            }
            catch(Throwable throwable0) {
            }
            __monitor_exit(class0);
            throw throwable0;
        }
        return cz.PjT;
    }
}

