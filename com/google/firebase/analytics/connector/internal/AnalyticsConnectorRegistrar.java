package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.analytics.connector.a;
import com.google.firebase.analytics.connector.b;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.g;
import com.google.firebase.components.i;
import com.google.firebase.components.w;
import com.google.firebase.h;
import e2.d;
import java.util.Arrays;
import java.util.List;

@Keep
@KeepForSdk
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    @Override  // com.google.firebase.components.ComponentRegistrar
    @SuppressLint({"MissingPermission"})
    @Keep
    @NonNull
    @KeepForSdk
    public List getComponents() {
        return Arrays.asList(new g[]{g.h(a.class).b(w.m(h.class)).b(w.m(Context.class)).b(w.m(d.class)).f((i i0) -> b.j(((h)i0.a(h.class)), ((Context)i0.a(Context.class)), ((d)i0.a(d.class)))).e().d(), com.google.firebase.platforminfo.h.b("fire-analytics", "22.1.2")});
    }

    // 检测为 Lambda 实现
    static a lambda$getComponents$0(i i0) [...]
}

