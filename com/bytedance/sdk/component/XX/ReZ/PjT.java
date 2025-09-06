package com.bytedance.sdk.component.XX.ReZ;

import android.text.TextUtils;
import java.util.Map;

public class PjT {
    public static boolean PjT(Map map0) {
        if(map0 == null) {
            return false;
        }
        if(TextUtils.isEmpty(((CharSequence)map0.get("content-type")))) {
            return TextUtils.isEmpty(((CharSequence)map0.get("Content-Type"))) ? false : ((String)map0.get("Content-Type")).contains("application/octet-stream");
        }
        return ((String)map0.get("content-type")).contains("application/octet-stream");
    }
}

