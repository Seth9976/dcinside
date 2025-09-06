package com.dcinside.app.browser.listeners;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import java.util.List;

public class a {
    class com.dcinside.app.browser.listeners.a.a extends BroadcastReceiver {
        final a a;

        @Override  // android.content.BroadcastReceiver
        public void onReceive(Context context0, Intent intent0) {
            if(context0 != null && intent0 != null) {
                int v = intent0.getIntExtra("EXTRA_KEY", 0x80000000);
                a a0 = a.this;
                if(a0.a == v) {
                    a0.c(intent0);
                }
            }
        }
    }

    public static enum b {
        PROGRESS_CHANGED,
        RECEIVED_TITLE,
        RECEIVED_TOUCH_ICON_URL,
        PAGE_STARTED,
        PAGE_FINISHED,
        LOAD_RESOURCE,
        PAGE_COMMIT_VISIBLE,
        DOWNLOADED_START,
        CUSTOM_MENU_CLICK,
        CLICK_IMAGE,
        UNREGISTER;

        private static b[] a() [...] // Inlined contents
    }

    protected int a;
    protected List b;
    protected LocalBroadcastManager c;
    protected BroadcastReceiver d;
    static final String e = "WEBVIEW_EVENT";
    static final String f = "EXTRA_KEY";
    static final String g = "EXTRA_TYPE";
    static final String h = "EXTRA_URL";
    static final String i = "EXTRA_TITLE";
    static final String j = "EXTRA_PROGESS";
    static final String k = "EXTRA_PRECOMPOSED";
    static final String l = "EXTRA_USER_AGENT";
    static final String m = "EXTRA_CONTENT_DISPOSITION";
    static final String n = "EXTRA_MIME_TYPE";
    static final String o = "EXTRA_CONTENT_LENGTH";
    static final String p = "EXTRA_MENU_CODE";
    static final String q = "EXTRA_IMAGE_URL";

    public a(Context context0, int v, @NonNull List list0) {
        this.d = new com.dcinside.app.browser.listeners.a.a(this);
        this.a = v;
        this.b = list0;
        LocalBroadcastManager localBroadcastManager0 = LocalBroadcastManager.b(context0);
        this.c = localBroadcastManager0;
        localBroadcastManager0.c(this.d, new IntentFilter("WEBVIEW_EVENT"));
    }

    private static Intent b(int v, b a$b0) {
        return new Intent("WEBVIEW_EVENT").putExtra("EXTRA_KEY", v).putExtra("EXTRA_TYPE", a$b0);
    }

    private void c(@NonNull Intent intent0) {
        switch(((b)intent0.getSerializableExtra("EXTRA_TYPE")).ordinal()) {
            case 0: {
                this.s(intent0);
                return;
            }
            case 1: {
                this.u(intent0);
                return;
            }
            case 2: {
                this.w(intent0);
                return;
            }
            case 3: {
                this.q(intent0);
                return;
            }
            case 4: {
                this.o(intent0);
                return;
            }
            case 5: {
                this.k(intent0);
                return;
            }
            case 6: {
                this.m(intent0);
                return;
            }
            case 7: {
                this.i(intent0);
                return;
            }
            case 8: {
                this.g(intent0);
                return;
            }
            case 9: {
                this.e(intent0);
                return;
            }
            case 10: {
                this.y();
            }
        }
    }

    public static void d(Context context0, int v, String s) {
        a.x(context0, a.b(v, b.j).putExtra("EXTRA_IMAGE_URL", s));
    }

    public void e(Intent intent0) {
        for(Object object0: this.b) {
            ((com.dcinside.app.browser.listeners.b)object0).a(intent0.getStringExtra("EXTRA_IMAGE_URL"));
        }
    }

    public static void f(Context context0, int v, String s) {
        a.x(context0, a.b(v, b.i).putExtra("EXTRA_MENU_CODE", s));
    }

    public void g(Intent intent0) {
        for(Object object0: this.b) {
            ((com.dcinside.app.browser.listeners.b)object0).b(intent0.getStringExtra("EXTRA_MENU_CODE"));
        }
    }

    public static void h(Context context0, int v, String s, String s1, String s2, String s3, long v1) {
        a.x(context0, a.b(v, b.h).putExtra("EXTRA_URL", s).putExtra("EXTRA_USER_AGENT", s1).putExtra("EXTRA_CONTENT_DISPOSITION", s2).putExtra("EXTRA_MIME_TYPE", s3).putExtra("EXTRA_CONTENT_LENGTH", v1));
    }

    public void i(Intent intent0) {
        for(Object object0: this.b) {
            ((com.dcinside.app.browser.listeners.b)object0).c(intent0.getStringExtra("EXTRA_URL"), intent0.getStringExtra("EXTRA_USER_AGENT"), intent0.getStringExtra("EXTRA_CONTENT_DISPOSITION"), intent0.getStringExtra("EXTRA_MIME_TYPE"), intent0.getLongExtra("EXTRA_CONTENT_LENGTH", 0L));
        }
    }

    public static void j(Context context0, int v, String s) {
        a.x(context0, a.b(v, b.f).putExtra("EXTRA_URL", s));
    }

    public void k(Intent intent0) {
        for(Object object0: this.b) {
            ((com.dcinside.app.browser.listeners.b)object0).d(intent0.getStringExtra("EXTRA_URL"));
        }
    }

    public static void l(Context context0, int v, String s) {
        a.x(context0, a.b(v, b.g).putExtra("EXTRA_URL", s));
    }

    public void m(Intent intent0) {
        for(Object object0: this.b) {
            ((com.dcinside.app.browser.listeners.b)object0).e(intent0.getStringExtra("EXTRA_URL"));
        }
    }

    public static void n(Context context0, int v, String s) {
        a.x(context0, a.b(v, b.e).putExtra("EXTRA_URL", s));
    }

    public void o(Intent intent0) {
        for(Object object0: this.b) {
            ((com.dcinside.app.browser.listeners.b)object0).f(intent0.getStringExtra("EXTRA_URL"));
        }
    }

    public static void p(Context context0, int v, String s) {
        a.x(context0, a.b(v, b.d).putExtra("EXTRA_URL", s));
    }

    public void q(Intent intent0) {
        for(Object object0: this.b) {
            ((com.dcinside.app.browser.listeners.b)object0).g(intent0.getStringExtra("EXTRA_URL"));
        }
    }

    public static void r(Context context0, int v, int v1) {
        a.x(context0, a.b(v, b.a).putExtra("EXTRA_PROGESS", v1));
    }

    public void s(Intent intent0) {
        for(Object object0: this.b) {
            ((com.dcinside.app.browser.listeners.b)object0).h(intent0.getIntExtra("EXTRA_PROGESS", 0));
        }
    }

    public static void t(Context context0, int v, String s) {
        a.x(context0, a.b(v, b.b).putExtra("EXTRA_TITLE", s));
    }

    public void u(Intent intent0) {
        for(Object object0: this.b) {
            ((com.dcinside.app.browser.listeners.b)object0).i(intent0.getStringExtra("EXTRA_TITLE"));
        }
    }

    public static void v(Context context0, int v, String s, boolean z) {
        a.x(context0, a.b(v, b.c).putExtra("EXTRA_URL", s).putExtra("EXTRA_PRECOMPOSED", z));
    }

    public void w(Intent intent0) {
        for(Object object0: this.b) {
            ((com.dcinside.app.browser.listeners.b)object0).j(intent0.getStringExtra("EXTRA_URL"), intent0.getBooleanExtra("EXTRA_PRECOMPOSED", false));
        }
    }

    private static void x(Context context0, Intent intent0) {
        LocalBroadcastManager.b(context0).d(intent0);
    }

    private void y() {
        LocalBroadcastManager localBroadcastManager0 = this.c;
        if(localBroadcastManager0 != null) {
            BroadcastReceiver broadcastReceiver0 = this.d;
            if(broadcastReceiver0 != null) {
                localBroadcastManager0.f(broadcastReceiver0);
            }
        }
    }

    public static void z(Context context0, int v) {
        a.x(context0, a.b(v, b.k));
    }
}

