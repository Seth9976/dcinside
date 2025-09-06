package com.bytedance.sdk.component.SM;

import java.util.List;
import java.util.regex.Pattern;

public class Zh {
    public static boolean PjT(List list0, String s) {
        if(list0 != null && !list0.isEmpty()) {
            for(Object object0: list0) {
                String s1 = (String)object0;
                try {
                    if(Pattern.matches(s1, s)) {
                        return true;
                    }
                }
                catch(Throwable unused_ex) {
                    continue;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }
}

