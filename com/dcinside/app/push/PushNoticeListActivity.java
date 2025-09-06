package com.dcinside.app.push;

import A3.p;
import Y.c0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.app.NotificationManagerCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback;
import com.dcinside.app.base.g;
import com.dcinside.app.internal.r;
import com.dcinside.app.msg.NotificationDeleteReceiver;
import com.dcinside.app.push.adapter.e;
import com.dcinside.app.settings.NotificationSettingActivity;
import com.dcinside.app.util.Ak;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.kl;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.d;
import kotlin.S0;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import rx.o;
import y4.l;
import y4.m;

@s0({"SMAP\nPushNoticeListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PushNoticeListActivity.kt\ncom/dcinside/app/push/PushNoticeListActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,256:1\n257#2,2:257\n*S KotlinDebug\n*F\n+ 1 PushNoticeListActivity.kt\ncom/dcinside/app/push/PushNoticeListActivity\n*L\n112#1:257,2\n*E\n"})
public final class PushNoticeListActivity extends g implements i {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final void a(@l Context context0) {
            L.p(context0, "context");
            context0.startActivity(new Intent(context0, PushNoticeListActivity.class));
        }
    }

    public final class b {
        public static final int[] a;

        static {
            int[] arr_v = new int[g0.b.values().length];
            try {
                arr_v[g0.b.b.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[g0.b.c.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            b.a = arr_v;
        }
    }

    private boolean A;
    private boolean B;
    @l
    private final c C;
    @l
    public static final a D = null;
    @l
    public static final String E = "actionPushMyActiveTab";
    @l
    public static final String F = "actionPushNewPostTab";
    private c0 w;
    @m
    private o x;
    @m
    private AppCompatCheckBox y;
    private boolean z;

    static {
        PushNoticeListActivity.D = new a(null);
    }

    public PushNoticeListActivity() {
        public static final class c extends OnPageChangeCallback {
            final PushNoticeListActivity a;

            c(PushNoticeListActivity pushNoticeListActivity0) {
                this.a = pushNoticeListActivity0;
                super();
            }

            @Override  // androidx.viewpager2.widget.ViewPager2$OnPageChangeCallback
            public void c(int v) {
                dl.a.l5(v);
                this.a.d2();
            }
        }

        this.A = true;
        this.C = new c(this);
    }

    @Override  // com.dcinside.app.push.i
    public void F(@l String s, @m String s1) {
        com.dcinside.app.push.i.a.a(this, s, s1);
    }

    private final void Q1() {
        if(this.getIntent().hasExtra("com.dcinside.app.extra.EXTRA_PUSH_ALERT_MY_ACTIVE")) {
            Intent intent0 = new Intent(this, NotificationDeleteReceiver.class).setAction("com.dcinside.app.action.GROUP_REPLIED").putExtras(this.getIntent());
            L.o(intent0, "putExtras(...)");
            this.sendBroadcast(intent0);
        }
        if(this.getIntent().getBooleanExtra("com.dcinside.app.extra.EXTRA_PUSH_ALERT_LIKE_POST", false)) {
            this.i2();
        }
        this.S1();
    }

    private final void R1() {
        String s = this.getIntent().getAction();
        if(s == null) {
            this.Y1(null);
        }
        else {
            switch(s) {
                case "actionPushMyActiveTab": {
                    this.Y1(g0.b.b);
                    break;
                }
                case "actionPushNewPostTab": {
                    this.Y1(g0.b.c);
                    break;
                }
                default: {
                    this.Y1(null);
                }
            }
        }
        dl.a.m5(0);
    }

    private final void S1() {
        NotificationManagerCompat notificationManagerCompat0 = NotificationManagerCompat.q(this);
        for(int v = 1100; v < 1110; ++v) {
            notificationManagerCompat0.c(v);
        }
        notificationManagerCompat0.c(10001);
        notificationManagerCompat0.c(10002);
    }

    private final void T1() {
        FragmentManager fragmentManager0 = this.getSupportFragmentManager();
        L.o(fragmentManager0, "getSupportFragmentManager(...)");
        c0 c00 = this.w;
        if(c00 == null) {
            L.S("binding");
            c00 = null;
        }
        Fragment fragment0 = fragmentManager0.s0("f" + c00.e.getCurrentItem());
        if(fragment0 instanceof k) {
            ((k)fragment0).o();
        }
    }

    private final void U1() {
        c0 c00 = this.w;
        c0 c01 = null;
        if(c00 == null) {
            L.S("binding");
            c00 = null;
        }
        e e0 = new e(this);
        c00.e.setAdapter(e0);
        c0 c02 = this.w;
        if(c02 == null) {
            L.S("binding");
            c02 = null;
        }
        c02.b.setVisibility(0);
        c0 c03 = this.w;
        if(c03 == null) {
            L.S("binding");
            c03 = null;
        }
        TabLayout tabLayout0 = c03.g;
        c0 c04 = this.w;
        if(c04 == null) {
            L.S("binding");
            c04 = null;
        }
        E0 e00 = (com.google.android.material.tabs.TabLayout.i tabLayout$i0, int v) -> {
            String s;
            L.p(this, "this$0");
            L.p(tabLayout$i0, "tab");
            switch(v) {
                case 0: {
                    s = "내 활동";
                    break;
                }
                case 1: {
                    s = "새 글";
                    break;
                }
                default: {
                    s = "내 활동";
                }
            }
            tabLayout$i0.D(s);
        };
        new d(tabLayout0, c04.e, e00).a();
        c0 c05 = this.w;
        if(c05 == null) {
            L.S("binding");
        }
        else {
            c01 = c05;
        }
        c01.e.n(this.C);
    }

    // 检测为 Lambda 实现
    private static final void V1(PushNoticeListActivity pushNoticeListActivity0, com.google.android.material.tabs.TabLayout.i tabLayout$i0, int v) [...]

    public final boolean W1() {
        return this.z;
    }

    public final boolean X1() {
        return this.A;
    }

    private final void Y1(g0.b b0) {
        int v = b0 == null ? -1 : b.a[b0.ordinal()];
        int v1 = 1;
        if(v == 1) {
            v1 = 0;
        }
        else if(v != 2) {
            v1 = dl.a.v1();
        }
        c0 c00 = this.w;
        if(c00 == null) {
            L.S("binding");
            c00 = null;
        }
        c00.e.s(v1, false);
    }

    // 检测为 Lambda 实现
    private static final void Z1(PushNoticeListActivity pushNoticeListActivity0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void a2(PushNoticeListActivity pushNoticeListActivity0, View view0) [...]

    private final void b2() {
        FragmentManager fragmentManager0 = this.getSupportFragmentManager();
        L.o(fragmentManager0, "getSupportFragmentManager(...)");
        c0 c00 = this.w;
        if(c00 == null) {
            L.S("binding");
            c00 = null;
        }
        Fragment fragment0 = fragmentManager0.s0("f" + c00.e.getCurrentItem());
        if(fragment0 instanceof k) {
            ((k)fragment0).H(this.z);
        }
        this.invalidateOptionsMenu();
    }

    public final void c2(boolean z) {
        this.B = z;
        AppCompatCheckBox appCompatCheckBox0 = this.y;
        if(appCompatCheckBox0 != null) {
            appCompatCheckBox0.setChecked(z);
        }
    }

    private final void d2() {
        FragmentManager fragmentManager0 = this.getSupportFragmentManager();
        L.o(fragmentManager0, "getSupportFragmentManager(...)");
        c0 c00 = this.w;
        if(c00 == null) {
            L.S("binding");
            c00 = null;
        }
        Fragment fragment0 = fragmentManager0.s0("f" + c00.e.getCurrentItem());
        if(fragment0 instanceof k) {
            ((k)fragment0).a();
        }
    }

    private final void e2() {
        FragmentManager fragmentManager0 = this.getSupportFragmentManager();
        L.o(fragmentManager0, "getSupportFragmentManager(...)");
        c0 c00 = this.w;
        if(c00 == null) {
            L.S("binding");
            c00 = null;
        }
        Fragment fragment0 = fragmentManager0.s0("f" + c00.e.getCurrentItem());
        if(fragment0 instanceof k) {
            ((k)fragment0).c();
        }
    }

    public final void f2(boolean z) {
        this.z = z;
        this.b2();
    }

    public final void g2(boolean z) {
        c0 c00 = this.w;
        if(c00 == null) {
            L.S("binding");
            c00 = null;
        }
        c00.e.setUserInputEnabled(z);
    }

    @Override  // com.dcinside.app.push.i
    public void h(@l String s, @m String s1) {
        L.p(s, "dataValue");
        FragmentManager fragmentManager0 = this.getSupportFragmentManager();
        L.o(fragmentManager0, "getSupportFragmentManager(...)");
        c0 c00 = this.w;
        if(c00 == null) {
            L.S("binding");
            c00 = null;
        }
        Fragment fragment0 = fragmentManager0.s0("f" + c00.e.getCurrentItem());
        if(fragment0 instanceof i) {
            ((i)fragment0).h(s, s1);
        }
    }

    public final void h2(boolean z) {
        this.A = z;
        if(z) {
            this.f2(false);
            return;
        }
        this.b2();
    }

    private final void i2() {
        @f(c = "com.dcinside.app.push.PushNoticeListActivity$showGuideLikePost$1", f = "PushNoticeListActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.push.PushNoticeListActivity.f extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;

            com.dcinside.app.push.PushNoticeListActivity.f(kotlin.coroutines.d d0) {
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                com.dcinside.app.push.PushNoticeListActivity.f pushNoticeListActivity$f0 = new com.dcinside.app.push.PushNoticeListActivity.f(d0);
                pushNoticeListActivity$f0.l = view0;
                return pushNoticeListActivity$f0.invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                ((View)this.l).setVisibility(8);
                return S0.a;
            }
        }

        dl dl0 = dl.a;
        if(dl0.s0()) {
            return;
        }
        dl0.l4(true);
        c0 c00 = this.w;
        if(c00 == null) {
            L.S("binding");
            c00 = null;
        }
        c00.c.setVisibility(0);
        c0 c01 = this.w;
        if(c01 == null) {
            L.S("binding");
            c01 = null;
        }
        L.o(c01.c, "pushNoticeLikeGuide");
        com.dcinside.app.push.PushNoticeListActivity.f pushNoticeListActivity$f0 = new com.dcinside.app.push.PushNoticeListActivity.f(null);
        r.M(c01.c, null, pushNoticeListActivity$f0, 1, null);
    }

    @Override  // com.dcinside.app.base.g
    protected void onCreate(@m Bundle bundle0) {
        public static final class com.dcinside.app.push.PushNoticeListActivity.d extends OnBackPressedCallback {
            final PushNoticeListActivity d;

            com.dcinside.app.push.PushNoticeListActivity.d(PushNoticeListActivity pushNoticeListActivity0) {
                this.d = pushNoticeListActivity0;
                super(true);
            }

            @Override  // androidx.activity.OnBackPressedCallback
            public void g() {
                if(this.d.W1()) {
                    this.d.f2(false);
                    return;
                }
                this.d.finish();
            }
        }

        super.onCreate(bundle0);
        c0 c00 = c0.c(this.getLayoutInflater());
        L.o(c00, "inflate(...)");
        this.w = c00;
        c0 c01 = null;
        if(c00 == null) {
            L.S("binding");
            c00 = null;
        }
        this.setContentView(c00.b());
        c0 c02 = this.w;
        if(c02 == null) {
            L.S("binding");
            c02 = null;
        }
        this.S0(c02.h);
        kr.bhbfhfb.designcompat.a.d(this);
        this.Q1();
        this.U1();
        this.R1();
        Ak ak0 = Ak.a;
        c0 c03 = this.w;
        if(c03 == null) {
            L.S("binding");
        }
        else {
            c01 = c03;
        }
        ak0.f(this, c01.h);
        this.getOnBackPressedDispatcher().h(new com.dcinside.app.push.PushNoticeListActivity.d(this));
    }

    @Override  // android.app.Activity
    public boolean onCreateOptionsMenu(@m Menu menu0) {
        @f(c = "com.dcinside.app.push.PushNoticeListActivity$onCreateOptionsMenu$1$1", f = "PushNoticeListActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.push.PushNoticeListActivity.e extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final PushNoticeListActivity m;

            com.dcinside.app.push.PushNoticeListActivity.e(PushNoticeListActivity pushNoticeListActivity0, kotlin.coroutines.d d0) {
                this.m = pushNoticeListActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                com.dcinside.app.push.PushNoticeListActivity.e pushNoticeListActivity$e0 = new com.dcinside.app.push.PushNoticeListActivity.e(this.m, d0);
                pushNoticeListActivity$e0.l = view0;
                return pushNoticeListActivity$e0.invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                View view0 = (View)this.l;
                AppCompatCheckBox appCompatCheckBox0 = view0 instanceof AppCompatCheckBox ? ((AppCompatCheckBox)view0) : null;
                if(appCompatCheckBox0 != null) {
                    PushNoticeListActivity pushNoticeListActivity0 = this.m;
                    if(appCompatCheckBox0.isChecked()) {
                        pushNoticeListActivity0.e2();
                        return S0.a;
                    }
                    pushNoticeListActivity0.T1();
                }
                return S0.a;
            }
        }

        View view0 = null;
        if(this.z) {
            this.getMenuInflater().inflate(0x7F100012, menu0);  // mipmap:ic_launcher21
            if(menu0 != null) {
                MenuItem menuItem0 = menu0.findItem(0x7F0B0072);  // id:action_select_all
                if(menuItem0 != null) {
                    View view1 = menuItem0.getActionView();
                    AppCompatCheckBox appCompatCheckBox0 = view1 == null ? null : ((AppCompatCheckBox)view1.findViewById(0x7F0B082F));  // id:menu_select_all
                    this.y = appCompatCheckBox0;
                    if(appCompatCheckBox0 != null) {
                        r.M(appCompatCheckBox0, null, new com.dcinside.app.push.PushNoticeListActivity.e(this, null), 1, null);
                        return super.onCreateOptionsMenu(menu0);
                    }
                }
            }
        }
        else {
            this.getMenuInflater().inflate(0x7F100013, menu0);  // mipmap:ic_launcher22
            if(menu0 != null) {
                MenuItem menuItem1 = menu0.findItem(0x7F0B006B);  // id:action_open_notice_setting
                if(menuItem1 != null) {
                    View view2 = menuItem1.getActionView();
                    View view3 = view2 == null ? null : view2.findViewById(0x7F0B082A);  // id:menu_push_setting
                    if(view3 != null) {
                        view3.setOnClickListener((View view0) -> {
                            L.p(this, "this$0");
                            NotificationSettingActivity.z.a(this);
                        });
                    }
                    View view4 = menuItem1.getActionView();
                    if(view4 != null) {
                        view0 = view4.findViewById(0x7F0B0829);  // id:menu_push_delete
                    }
                    if(view0 != null) {
                        view0.setVisibility((this.A ? 8 : 0));
                    }
                    if(view0 != null) {
                        view0.setOnClickListener((View view0) -> {
                            L.p(this, "this$0");
                            this.f2(true);
                        });
                    }
                }
            }
        }
        return super.onCreateOptionsMenu(menu0);
    }

    @Override  // com.dcinside.app.base.g
    protected void onDestroy() {
        super.onDestroy();
        kl.b(new o[]{this.x});
        c0 c00 = this.w;
        if(c00 == null) {
            L.S("binding");
            c00 = null;
        }
        c00.e.x(this.C);
    }

    @Override  // android.app.Activity
    public boolean onOptionsItemSelected(@l MenuItem menuItem0) {
        L.p(menuItem0, "item");
        if(menuItem0.getItemId() == 0x102002C) {
            this.getOnBackPressedDispatcher().p();
            return true;
        }
        return super.onOptionsItemSelected(menuItem0);
    }

    @Override  // androidx.fragment.app.FragmentActivity
    protected void onPause() {
        super.onPause();
        Ak.a.b();
    }
}

