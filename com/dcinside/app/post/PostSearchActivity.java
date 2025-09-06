package com.dcinside.app.post;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.dcinside.app.base.g;
import com.dcinside.app.rx.bus.J;
import com.dcinside.app.rx.bus.c;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import rx.o;
import rx.subscriptions.b;
import y4.l;
import y4.m;

@s0({"SMAP\nPostSearchActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostSearchActivity.kt\ncom/dcinside/app/post/PostSearchActivity\n+ 2 ContextBus.kt\ncom/dcinside/app/rx/bus/ContextBusKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,55:1\n60#2:56\n1#3:57\n*S KotlinDebug\n*F\n+ 1 PostSearchActivity.kt\ncom/dcinside/app/post/PostSearchActivity\n*L\n20#1:56\n*E\n"})
public final class PostSearchActivity extends g {
    @m
    private b w;

    private final void M1(J j0) {
        this.finish();
    }

    // 检测为 Lambda 实现
    private static final void N1(Function1 function10, Object object0) [...]

    @Override  // com.dcinside.app.base.g
    protected void onCreate(@m Bundle bundle0) {
        static final class a extends N implements Function1 {
            final PostSearchActivity e;

            a(PostSearchActivity postSearchActivity0) {
                this.e = postSearchActivity0;
                super(1);
            }

            public final void a(J j0) {
                L.m(j0);
                this.e.M1(j0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((J)object0));
                return S0.a;
            }
        }

        super.onCreate(bundle0);
        this.setContentView(0x7F0E0073);  // layout:activity_settings
        b b0 = this.w;
        if(b0 != null) {
            b0.l();
        }
        this.w = new b();
        o o0 = c.c(this, J.class).x5((Object object0) -> {
            L.p(new a(this), "$tmp0");
            new a(this).invoke(object0);
        });
        b b1 = this.w;
        if(b1 != null) {
            b1.a(o0);
        }
        FragmentManager fragmentManager0 = this.getSupportFragmentManager();
        L.o(fragmentManager0, "getSupportFragmentManager(...)");
        if(fragmentManager0.r0(0x7F0B0EE9) == null) {  // id:settings_fragment_container
            com.dcinside.app.post.S0 s00 = new com.dcinside.app.post.S0();
            s00.setArguments(this.getIntent().getExtras());
            fragmentManager0.u().C(0x7F0B0EE9, s00).q();  // id:settings_fragment_container
        }
    }

    @Override  // com.dcinside.app.base.g
    protected void onDestroy() {
        super.onDestroy();
        b b0 = this.w;
        if(b0 != null) {
            b0.l();
        }
        this.w = null;
    }

    @Override  // androidx.activity.ComponentActivity
    protected void onNewIntent(@l Intent intent0) {
        L.p(intent0, "intent");
        super.onNewIntent(intent0);
        Bundle bundle0 = intent0.getExtras();
        if(bundle0 == null) {
            return;
        }
        FragmentManager fragmentManager0 = this.getSupportFragmentManager();
        L.o(fragmentManager0, "getSupportFragmentManager(...)");
        Fragment fragment0 = fragmentManager0.r0(0x7F0B0EE9);  // id:settings_fragment_container
        if(fragment0 instanceof com.dcinside.app.post.S0) {
            ((com.dcinside.app.post.S0)fragment0).r1(bundle0);
        }
    }
}

