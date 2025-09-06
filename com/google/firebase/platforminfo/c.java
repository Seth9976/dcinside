package com.google.firebase.platforminfo;

import com.google.firebase.components.g;
import com.google.firebase.components.w;
import java.util.Iterator;
import java.util.Set;

public class c implements i {
    private final String a;
    private final d b;

    c(Set set0, d d0) {
        this.a = c.d(set0);
        this.b = d0;
    }

    public static g b() {
        return g.h(i.class).b(w.q(f.class)).f((com.google.firebase.components.i i0) -> new c(i0.d(f.class), d.a())).d();
    }

    // 检测为 Lambda 实现
    private static i c(com.google.firebase.components.i i0) [...]

    private static String d(Set set0) {
        StringBuilder stringBuilder0 = new StringBuilder();
        Iterator iterator0 = set0.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            stringBuilder0.append(((f)object0).b());
            stringBuilder0.append('/');
            stringBuilder0.append(((f)object0).c());
            if(iterator0.hasNext()) {
                stringBuilder0.append(' ');
            }
        }
        return stringBuilder0.toString();
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.firebase.platforminfo.i
    public String getUserAgent() {
        return this.b.b().isEmpty() ? this.a : this.a + ' ' + c.d(this.b.b());
    }
}

