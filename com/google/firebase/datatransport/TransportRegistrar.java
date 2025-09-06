package com.google.firebase.datatransport;

import Z1.b;
import Z1.d;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.datatransport.cct.a;
import com.google.android.datatransport.m;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.K;
import com.google.firebase.components.g;
import com.google.firebase.components.i;
import com.google.firebase.components.w;
import com.google.firebase.platforminfo.h;
import java.util.Arrays;
import java.util.List;

@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    @Override  // com.google.firebase.components.ComponentRegistrar
    @NonNull
    public List getComponents() {
        return Arrays.asList(new g[]{g.h(m.class).h("fire-transport").b(w.m(Context.class)).f((i i0) -> {
            com.google.android.datatransport.runtime.w.f(((Context)i0.a(Context.class)));
            return com.google.android.datatransport.runtime.w.c().g(a.k);
        }).d(), g.f(K.a(b.class, m.class)).b(w.m(Context.class)).f((i i0) -> {
            com.google.android.datatransport.runtime.w.f(((Context)i0.a(Context.class)));
            return com.google.android.datatransport.runtime.w.c().g(a.k);
        }).d(), g.f(K.a(d.class, m.class)).b(w.m(Context.class)).f((i i0) -> {
            com.google.android.datatransport.runtime.w.f(((Context)i0.a(Context.class)));
            return com.google.android.datatransport.runtime.w.c().g(a.j);
        }).d(), h.b("fire-transport", "19.0.0")});
    }

    // 检测为 Lambda 实现
    private static m lambda$getComponents$0(i i0) [...]

    // 检测为 Lambda 实现
    private static m lambda$getComponents$1(i i0) [...]

    // 检测为 Lambda 实现
    private static m lambda$getComponents$2(i i0) [...]
}

