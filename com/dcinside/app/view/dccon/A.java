package com.dcinside.app.view.dccon;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.dcinside.app.internal.t;
import com.dcinside.app.util.dl;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nBigDcconChangeReceiver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BigDcconChangeReceiver.kt\ncom/dcinside/app/view/dccon/BigDcconChangeReceiver\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n*L\n1#1,36:1\n147#2:37\n*S KotlinDebug\n*F\n+ 1 BigDcconChangeReceiver.kt\ncom/dcinside/app/view/dccon/BigDcconChangeReceiver\n*L\n16#1:37\n*E\n"})
public final class a extends BroadcastReceiver {
    public static final class com.dcinside.app.view.dccon.a.a {
        private com.dcinside.app.view.dccon.a.a() {
        }

        public com.dcinside.app.view.dccon.a.a(w w0) {
        }

        public final void a(@l Context context0) {
            L.p(context0, "context");
            LocalBroadcastManager.b(context0).d(new Intent("com.dcinside.app.action.BIG_DCCON_CHANGE"));
        }
    }

    @l
    private final t a;
    @l
    public static final com.dcinside.app.view.dccon.a.a b = null;
    @l
    public static final String c = "com.dcinside.app.action.BIG_DCCON_CHANGE";

    static {
        a.b = new com.dcinside.app.view.dccon.a.a(null);
    }

    public a(@l b b0) {
        L.p(b0, "listener");
        super();
        this.a = new t(b0);
    }

    @Override  // android.content.BroadcastReceiver
    public void onReceive(@m Context context0, @m Intent intent0) {
        if(intent0 != null) {
            String s = intent0.getAction();
            if(s != null && L.g(s, "com.dcinside.app.action.BIG_DCCON_CHANGE")) {
                b b0 = (b)this.a.a();
                if(b0 != null) {
                    b0.k(dl.a.K2());
                }
            }
        }
    }
}

