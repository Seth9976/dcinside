package com.dcinside.app.youtube;

import Y.N0;
import android.os.Bundle;
import android.view.View;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class YoutubePlayerActivity extends AppCompatActivity {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    private N0 i;
    @l
    private final b j;
    @l
    public static final a k = null;
    @l
    public static final String l = "YoutubePlayerActivity_EXTRA_VIDEO_ID";

    static {
        YoutubePlayerActivity.k = new a(null);
    }

    public YoutubePlayerActivity() {
        public static final class b extends OnBackPressedCallback {
            final YoutubePlayerActivity d;

            b(YoutubePlayerActivity youtubePlayerActivity0) {
                this.d = youtubePlayerActivity0;
                super(true);
            }

            @Override  // androidx.activity.OnBackPressedCallback
            public void g() {
                this.d.finish();
            }
        }

        this.j = new b(this);
    }

    @Override  // androidx.fragment.app.FragmentActivity
    protected void onCreate(@m Bundle bundle0) {
        public static final class c extends K2.a {
            final String a;

            c(String s) {
                this.a = s;
                super();
            }

            @Override  // K2.a
            public void d(@l J2.c c0) {
                L.p(c0, "youTubePlayer");
                c0.o(this.a, 0.0f);
                c0.j();
            }
        }


        public static final class d implements K2.b {
            final YoutubePlayerActivity a;

            d(YoutubePlayerActivity youtubePlayerActivity0) {
                this.a = youtubePlayerActivity0;
                super();
            }

            @Override  // K2.b
            public void a() {
                N0 n00 = this.a.i;
                N0 n01 = null;
                if(n00 == null) {
                    L.S("binding");
                    n00 = null;
                }
                n00.c.setVisibility(0);
                N0 n02 = this.a.i;
                if(n02 == null) {
                    L.S("binding");
                    n02 = null;
                }
                n02.b.setVisibility(8);
                N0 n03 = this.a.i;
                if(n03 == null) {
                    L.S("binding");
                }
                else {
                    n01 = n03;
                }
                n01.b.removeAllViews();
            }

            @Override  // K2.b
            public void b(@l View view0, @l A3.a a0) {
                L.p(view0, "fullscreenView");
                L.p(a0, "exitFullscreen");
                N0 n00 = this.a.i;
                N0 n01 = null;
                if(n00 == null) {
                    L.S("binding");
                    n00 = null;
                }
                n00.c.setVisibility(8);
                N0 n02 = this.a.i;
                if(n02 == null) {
                    L.S("binding");
                    n02 = null;
                }
                n02.b.setVisibility(0);
                N0 n03 = this.a.i;
                if(n03 == null) {
                    L.S("binding");
                }
                else {
                    n01 = n03;
                }
                n01.b.addView(view0);
                this.a.setRequestedOrientation(0);
            }
        }

        super.onCreate(bundle0);
        N0 n00 = N0.c(this.getLayoutInflater());
        L.o(n00, "inflate(...)");
        this.i = n00;
        N0 n01 = null;
        if(n00 == null) {
            L.S("binding");
            n00 = null;
        }
        this.setContentView(n00.b());
        this.getOnBackPressedDispatcher().h(this.j);
        WindowInsetsControllerCompat windowInsetsControllerCompat0 = WindowCompat.a(this.getWindow(), this.getWindow().getDecorView());
        windowInsetsControllerCompat0.j(2);
        windowInsetsControllerCompat0.d(0x207);
        this.getWindow().setStatusBarColor(0);
        String s = this.getIntent().getStringExtra("YoutubePlayerActivity_EXTRA_VIDEO_ID");
        if(s == null) {
            s = "";
        }
        N0 n02 = this.i;
        if(n02 == null) {
            L.S("binding");
        }
        else {
            n01 = n02;
        }
        c youtubePlayerActivity$c0 = new c(s);
        n01.c.d(youtubePlayerActivity$c0);
        d youtubePlayerActivity$d0 = new d(this);
        n01.c.c(youtubePlayerActivity$d0);
        Lifecycle lifecycle0 = this.getLifecycle();
        L.m(n01.c);
        lifecycle0.a(n01.c);
    }

    @Override  // androidx.appcompat.app.AppCompatActivity
    protected void onDestroy() {
        N0 n00 = this.i;
        if(n00 == null) {
            L.S("binding");
            n00 = null;
        }
        n00.c.q();
        super.onDestroy();
    }
}

