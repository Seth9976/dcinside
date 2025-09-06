package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import com.bytedance.sdk.component.utils.iZZ;

public class Sks {
    public static String PjT(Context context0) {
        switch(iZZ.PjT(context0, 0L)) {
            case 2: {
                return "2g";
            }
            case 3: {
                return "3g";
            }
            case 4: {
                return "wifi";
            }
            case 5: {
                return "4g";
            }
            case 6: {
                return "5g";
            }
            default: {
                return "mobile";
            }
        }
    }
}

