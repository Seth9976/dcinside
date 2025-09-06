package com.bytedance.sdk.openadsdk.utils;

import android.content.res.Configuration;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.sdk.component.Au.Au;
import com.bytedance.sdk.component.utils.RD;
import com.bytedance.sdk.openadsdk.core.ub;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

public class iZZ {
    public static class PjT extends Au {
        public static AtomicBoolean PjT;
        private static final AtomicLong Zh;

        static {
            PjT.PjT = new AtomicBoolean(false);
            PjT.Zh = new AtomicLong(0L);
        }

        public PjT(String s, int v) {
            super(s, v);
        }

        public static void PjT() {
            if(!PjT.PjT.get()) {
                long v = System.currentTimeMillis();
                AtomicLong atomicLong0 = PjT.Zh;
                if(v - atomicLong0.get() < 600000L) {
                    return;
                }
                atomicLong0.set(v);
                Jo.Zh(new PjT("UpdateSimStatusTask", 5));
            }
        }

        @Override
        public void run() {
            PjT.PjT.set(true);
            iZZ.JQp();
            PjT.PjT.set(false);
        }
    }

    private static String PjT = null;
    private static String ReZ = null;
    private static String Zh = null;
    private static volatile boolean cr = true;

    static {
    }

    private static void JQp() {
        String s3;
        String s2;
        String s1;
        String s;
        TelephonyManager telephonyManager0;
        if(ub.PjT() == null) {
            return;
        }
        try {
            iZZ.cr = true;
            telephonyManager0 = (TelephonyManager)ub.PjT().getSystemService("phone");
        }
        catch(Throwable unused_ex) {
            return;
        }
        try {
            switch(telephonyManager0.getSimState()) {
                case 0: {
                    iZZ.cr = false;
                    goto label_12;
                }
                case 1: {
                    iZZ.cr = false;
                    goto label_12;
                }
                default: {
                    goto label_12;
                }
            }
        }
        catch(Throwable throwable0) {
        }
        try {
            RD.Zh("SimUtils", throwable0.getMessage());
        }
        catch(Throwable unused_ex) {
            return;
        }
        try {
        label_12:
            s = null;
            s1 = null;
            s1 = telephonyManager0.getSimOperatorName();
            s2 = null;
        }
        catch(Throwable unused_ex) {
        }
        try {
            s2 = telephonyManager0.getNetworkOperator();
        }
        catch(Throwable unused_ex) {
        }
        if(s2 == null) {
            s2 = telephonyManager0.getSimOperator();
        }
        else {
            try {
                if(s2.length() < 5) {
                    s2 = telephonyManager0.getSimOperator();
                }
                goto label_22;
            }
            catch(Throwable unused_ex) {
                return;
            }
            try {
                s2 = telephonyManager0.getSimOperator();
            }
            catch(Throwable unused_ex) {
            }
        }
        try {
        label_22:
            if(TextUtils.isEmpty(s2) || s2.length() <= 4) {
                s3 = null;
            }
            else {
                s3 = s2.substring(3);
                s = s2.substring(0, 3);
            }
            if(!TextUtils.isEmpty(s1)) {
                iZZ.PjT = s1;
            }
            if(!TextUtils.isEmpty(s)) {
                iZZ.Zh = s;
            }
            if(!TextUtils.isEmpty(s3)) {
                iZZ.ReZ = s3;
            }
        }
        catch(Throwable unused_ex) {
        }
    }

    public static String PjT() {
        PjT.PjT();
        return iZZ.PjT;
    }

    public static String ReZ() {
        PjT.PjT();
        return iZZ.ReZ;
    }

    public static String Zh() {
        try {
            PjT.PjT();
            if(!iZZ.cr) {
                new StringBuilder("getMCC").append((iZZ.cr ? "Have SIM card" : "No SIM card, MCC returns null"));
                RD.Zh("MCC", "getMCCHave SIM card");
                return null;
            }
            Configuration configuration0 = ub.PjT().getResources().getConfiguration();
            String s = configuration0.mcc == 0 ? iZZ.Zh : String.valueOf(configuration0.mcc);
            RD.Zh("MCC", "config=" + configuration0.mcc + ",sMCC=" + iZZ.Zh);
            return s;
        }
        catch(Throwable throwable0) {
        }
        RD.Zh("SimUtils", throwable0.getMessage());
        return null;
    }
}

