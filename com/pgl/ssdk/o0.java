package com.pgl.ssdk;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.PjT;

public class o0 {
    public static Pair a(String s) {
        Pair pair0 = null;
        if(!TextUtils.isEmpty(s)) {
            try {
                pair0 = PglCryptUtils.getInstance().cypher4EncryptWithNoWrapBase64(s);
            }
            catch(Throwable unused_ex) {
            }
            return pair0 == null || ((int)(((Integer)pair0.first))) != 0 || TextUtils.isEmpty(((CharSequence)pair0.second)) ? new Pair(3, PjT.Zh(s)) : new Pair(4, pair0.second);
        }
        return null;
    }
}

