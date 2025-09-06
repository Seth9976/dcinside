package com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.List;
import kotlin.S0;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nNetworkObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkObserver.kt\ncom/pierfrancescosoffritti/androidyoutubeplayer/core/player/utils/NetworkObserver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,122:1\n1#2:123\n*E\n"})
public final class b {
    public interface a {
        void a();

        void b();
    }

    @l
    private final Context a;
    @l
    private final List b;
    @m
    private com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils.a c;
    @m
    private ConnectivityManager.NetworkCallback d;

    public b(@l Context context0) {
        L.p(context0, "context");
        super();
        this.a = context0;
        this.b = new ArrayList();
    }

    public final void a() {
        if(Build.VERSION.SDK_INT >= 24) {
            ConnectivityManager.NetworkCallback connectivityManager$NetworkCallback0 = this.d;
            if(connectivityManager$NetworkCallback0 == null) {
                return;
            }
            Object object0 = this.a.getSystemService("connectivity");
            L.n(object0, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ((ConnectivityManager)object0).unregisterNetworkCallback(connectivityManager$NetworkCallback0);
        }
        else {
            com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils.a a0 = this.c;
            if(a0 == null) {
                return;
            }
            try {
                this.a.unregisterReceiver(a0);
            }
            catch(Throwable throwable0) {
                f0.a(throwable0);
            }
        }
        this.b.clear();
        this.d = null;
        this.c = null;
    }

    @RequiresApi(24)
    private final void b(Context context0) {
        @s0({"SMAP\nNetworkObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkObserver.kt\ncom/pierfrancescosoffritti/androidyoutubeplayer/core/player/utils/NetworkObserver$doObserveNetwork$callback$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,122:1\n1855#2,2:123\n1855#2,2:125\n*S KotlinDebug\n*F\n+ 1 NetworkObserver.kt\ncom/pierfrancescosoffritti/androidyoutubeplayer/core/player/utils/NetworkObserver$doObserveNetwork$callback$1\n*L\n62#1:123,2\n69#1:125,2\n*E\n"})
        public static final class com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils.b.b extends ConnectivityManager.NetworkCallback {
            @l
            private final Handler a;
            final b b;

            com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils.b.b(b b0) {
                this.b = b0;
                super();
                this.a = new Handler(Looper.getMainLooper());
            }

            // 检测为 Lambda 实现
            private static final void c(b b0) [...]

            // 检测为 Lambda 实现
            private static final void d(b b0) [...]

            @Override  // android.net.ConnectivityManager$NetworkCallback
            public void onAvailable(@l Network network0) {
                L.p(network0, "network");
                c c0 = () -> {
                    L.p(this.b, "this$0");
                    for(Object object0: this.b.d()) {
                        ((a)object0).b();
                    }
                };
                this.a.post(c0);
            }

            @Override  // android.net.ConnectivityManager$NetworkCallback
            public void onLost(@l Network network0) {
                L.p(network0, "network");
                d d0 = () -> {
                    L.p(this.b, "this$0");
                    for(Object object0: this.b.d()) {
                        ((a)object0).a();
                    }
                };
                this.a.post(d0);
            }
        }

        com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils.b.b b$b0 = new com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils.b.b(this);
        this.d = b$b0;
        Object object0 = context0.getSystemService("connectivity");
        L.n(object0, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ((ConnectivityManager)object0).registerDefaultNetworkCallback(b$b0);
    }

    private final void c(Context context0) {
        @s0({"SMAP\nNetworkObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkObserver.kt\ncom/pierfrancescosoffritti/androidyoutubeplayer/core/player/utils/NetworkObserver$doObserveNetworkLegacy$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,122:1\n1855#2,2:123\n*S KotlinDebug\n*F\n+ 1 NetworkObserver.kt\ncom/pierfrancescosoffritti/androidyoutubeplayer/core/player/utils/NetworkObserver$doObserveNetworkLegacy$1\n*L\n81#1:123,2\n*E\n"})
        static final class com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils.b.c extends N implements A3.a {
            final b e;

            com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils.b.c(b b0) {
                this.e = b0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                for(Object object0: this.e.d()) {
                    ((a)object0).b();
                }
            }
        }


        @s0({"SMAP\nNetworkObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkObserver.kt\ncom/pierfrancescosoffritti/androidyoutubeplayer/core/player/utils/NetworkObserver$doObserveNetworkLegacy$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,122:1\n1855#2,2:123\n*S KotlinDebug\n*F\n+ 1 NetworkObserver.kt\ncom/pierfrancescosoffritti/androidyoutubeplayer/core/player/utils/NetworkObserver$doObserveNetworkLegacy$2\n*L\n82#1:123,2\n*E\n"})
        static final class com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils.b.d extends N implements A3.a {
            final b e;

            com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils.b.d(b b0) {
                this.e = b0;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                for(Object object0: this.e.d()) {
                    ((a)object0).a();
                }
            }
        }

        com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils.a a0 = new com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils.a(new com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils.b.c(this), new com.pierfrancescosoffritti.androidyoutubeplayer.core.player.utils.b.d(this));
        this.c = a0;
        context0.registerReceiver(a0, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @l
    public final List d() {
        return this.b;
    }

    public final void e() {
        if(Build.VERSION.SDK_INT >= 24) {
            this.b(this.a);
            return;
        }
        this.c(this.a);
    }
}

