package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.core.model.Owx;
import com.bytedance.sdk.openadsdk.core.ub;
import java.util.Map;

public class Yo {
    public static void PjT(Owx owx0, Double double0) {
        if(owx0 != null && owx0.Vs() != null) {
            Map map0 = owx0.Vs();
            try {
                Object object0 = owx0.Vs().get("sdk_bidding_type");
                if(object0 != null && Integer.parseInt(object0.toString()) == 2) {
                    String s = (String)map0.get("nurl");
                    if(!TextUtils.isEmpty(s)) {
                        if(double0 != null) {
                            s = s.replace("${AUCTION_BID_TO_WIN}", String.valueOf(double0));
                        }
                        ub.ReZ().PjT(s);
                    }
                }
            }
            catch(Throwable unused_ex) {
                RD.Zh("report Win error", new Object[0]);
            }
        }
    }

    public static void PjT(Owx owx0, Double double0, String s, String s1) {
        if(owx0 != null && owx0.Vs() != null) {
            Map map0 = owx0.Vs();
            try {
                Object object0 = owx0.Vs().get("sdk_bidding_type");
                if(object0 != null && Integer.parseInt(object0.toString()) == 2) {
                    String s2 = (String)map0.get("lurl");
                    if(!TextUtils.isEmpty(s2)) {
                        if(double0 != null) {
                            s2 = s2.replace("${AUCTION_PRICE}", String.valueOf(double0));
                        }
                        if(s != null) {
                            s2 = s2.replace("${AUCTION_LOSS}", s);
                        }
                        if(s1 != null) {
                            s2 = s2.replace("${AUCTION_WINNER}", s1);
                        }
                        ub.ReZ().PjT(s2);
                    }
                }
            }
            catch(Throwable unused_ex) {
                RD.Zh("report Loss error", new Object[0]);
            }
        }
    }
}

