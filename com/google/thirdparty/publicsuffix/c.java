package com.google.thirdparty.publicsuffix;

import J1.b;
import J1.e;
import com.google.common.base.y;
import com.google.common.collect.Q2;
import com.google.common.collect.g4;
import java.util.Deque;

@b
final class c {
    private static final y a;

    static {
        c.a = y.p("");
    }

    private static int a(Deque deque0, CharSequence charSequence0, int v, com.google.common.collect.Q2.b q2$b0) {
        int v1 = charSequence0.length();
        int v2 = 0;
        int v3;
        for(v3 = v; v3 < v1; ++v3) {
            v2 = charSequence0.charAt(v3);
            if(v2 == 33 || v2 == 38 || v2 == 44 || v2 == 58 || v2 == 0x3F) {
                break;
            }
        }
        deque0.push(c.d(charSequence0.subSequence(v, v3)));
        if(v2 == 33 || v2 == 44 || v2 == 58 || v2 == 0x3F) {
            String s = c.a.k(deque0);
            if(s.length() > 0) {
                q2$b0.i(s, com.google.thirdparty.publicsuffix.b.b(((char)v2)));
            }
        }
        int v4 = v3 + 1;
        if(v2 != 44 && v2 != 0x3F) {
        alab1:
            while(v4 < v1) {
                v4 += c.a(deque0, charSequence0, v4, q2$b0);
                switch(charSequence0.charAt(v4)) {
                    case 44: 
                    case 0x3F: {
                        ++v4;
                        if(true) {
                            break alab1;
                        }
                    }
                }
            }
        }
        deque0.pop();
        return v4 - v;
    }

    @e
    static Q2 b(String s) {
        com.google.common.collect.Q2.b q2$b0 = Q2.b();
        int v = s.length();
        for(int v1 = 0; v1 < v; v1 += c.a(g4.d(), s, v1, q2$b0)) {
        }
        return q2$b0.d();
    }

    static Q2 c(CharSequence[] arr_charSequence) {
        return c.b(c.a.n(arr_charSequence));
    }

    private static CharSequence d(CharSequence charSequence0) {
        return new StringBuilder(charSequence0).reverse();
    }
}

