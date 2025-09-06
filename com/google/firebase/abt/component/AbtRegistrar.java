package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.g;
import com.google.firebase.components.i;
import com.google.firebase.components.w;
import com.google.firebase.platforminfo.h;
import java.util.Arrays;
import java.util.List;

@Keep
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    @Override  // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(new g[]{g.h(a.class).h("fire-abt").b(w.m(Context.class)).b(w.k(com.google.firebase.analytics.connector.a.class)).f((i i0) -> new a(((Context)i0.a(Context.class)), i0.e(com.google.firebase.analytics.connector.a.class))).d(), h.b("fire-abt", "21.1.1")});
    }

    // 检测为 Lambda 实现
    private static a lambda$getComponents$0(i i0) [...]
}

