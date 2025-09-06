package com.bytedance.sdk.component.adexpress.cr;

import android.net.Uri;
import android.text.TextUtils;

public class SM {
    public static enum PjT {
        HTML("text/html"),
        CSS("text/css"),
        JS("application/x-javascript"),
        IMAGE("image/*");

        private String JQp;

        private PjT(String s1) {
            this.JQp = s1;
        }

        public String PjT() {
            return this.JQp;
        }
    }

    public static PjT PjT(String s) {
        PjT sM$PjT0 = PjT.cr;
        if(!TextUtils.isEmpty(s)) {
            try {
                String s1 = Uri.parse(s).getPath();
                if(s1 != null) {
                    if(s1.endsWith(".css")) {
                        return PjT.Zh;
                    }
                    if(s1.endsWith(".js")) {
                        return PjT.ReZ;
                    }
                    return s1.endsWith(".jpg") || s1.endsWith(".gif") || s1.endsWith(".png") || s1.endsWith(".jpeg") || s1.endsWith(".webp") || s1.endsWith(".bmp") || s1.endsWith(".ico") || !s1.endsWith(".html") ? sM$PjT0 : PjT.PjT;
                }
                return sM$PjT0;
            }
            catch(Throwable unused_ex) {
            }
        }
        return sM$PjT0;
    }

    public static boolean Zh(String s) {
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        Uri uri0 = Uri.parse(s);
        if(uri0 == null) {
            return false;
        }
        String s1 = uri0.getPath();
        return TextUtils.isEmpty(s1) ? false : s1.endsWith(".gif");
    }
}

