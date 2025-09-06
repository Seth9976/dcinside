package com.kakao.adfit.k;

import com.kakao.adfit.i.n;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.text.v;

public final class g {
    private final List a;
    private final List b;

    public g(List list0, List list1) {
        L.p(list0, "inAppExcludes");
        L.p(list1, "inAppIncludes");
        super();
        this.a = list0;
        this.b = list1;
    }

    public final List a(StackTraceElement[] arr_stackTraceElement) {
        ArrayList arrayList0 = new ArrayList();
        if(arr_stackTraceElement != null) {
            for(int v = 0; v < arr_stackTraceElement.length; ++v) {
                StackTraceElement stackTraceElement0 = arr_stackTraceElement[v];
                if(stackTraceElement0 != null) {
                    String s = stackTraceElement0.getClassName();
                    String s1 = stackTraceElement0.getMethodName();
                    String s2 = stackTraceElement0.getFileName();
                    int v1 = stackTraceElement0.getLineNumber();
                    arrayList0.add(new n(s, s1, s2, (v1 > 0 ? v1 : null), Boolean.valueOf(this.a(stackTraceElement0.getClassName())), Boolean.valueOf(stackTraceElement0.isNativeMethod())));
                }
            }
        }
        if(arrayList0.isEmpty()) {
            arrayList0 = null;
        }
        if(arrayList0 != null) {
            u.r1(arrayList0);
            return arrayList0;
        }
        return null;
    }

    public final boolean a(String s) {
        if(s != null && s.length() != 0) {
            for(Object object0: this.b) {
                if(v.v2(s, ((String)object0), false, 2, null)) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
            for(Object object1: this.a) {
                if(v.v2(s, ((String)object1), false, 2, null)) {
                    break;
                }
            }
            return false;
        }
        return true;
    }
}

