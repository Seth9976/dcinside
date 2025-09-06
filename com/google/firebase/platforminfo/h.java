package com.google.firebase.platforminfo;

import android.content.Context;
import com.google.firebase.components.g;
import com.google.firebase.components.i;
import com.google.firebase.components.w;

public class h {
    public interface a {
        String a(Object arg1);
    }

    // 检测为 Lambda 实现
    public static f a(String s, a h$a0, i i0) [...]

    public static g b(String s, String s1) {
        return g.p(f.a(s, s1), f.class);
    }

    public static g c(String s, a h$a0) {
        return g.r(f.class).b(w.m(Context.class)).f((i i0) -> h.d(s, h$a0, i0)).d();
    }

    private static f d(String s, a h$a0, i i0) {
        return f.a(s, h$a0.a(((Context)i0.a(Context.class))));
    }
}

