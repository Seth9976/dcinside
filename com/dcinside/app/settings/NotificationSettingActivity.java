package com.dcinside.app.settings;

import A3.p;
import Y.x0;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.widget.SwitchCompat;
import com.dcinside.app.base.g;
import com.dcinside.app.model.X;
import com.dcinside.app.model.f0;
import com.dcinside.app.perform.e;
import com.dcinside.app.push.ArticlePostListActivity;
import com.dcinside.app.push.KeywordListActivity;
import com.dcinside.app.push.SettingPushGalleryActivity;
import com.dcinside.app.realm.n;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.ll;
import com.dcinside.app.util.uk;
import kotlin.S0;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import rx.o;
import timber.log.b;
import y4.l;
import y4.m;

@s0({"SMAP\nNotificationSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotificationSettingActivity.kt\ncom/dcinside/app/settings/NotificationSettingActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,298:1\n257#2,2:299\n*S KotlinDebug\n*F\n+ 1 NotificationSettingActivity.kt\ncom/dcinside/app/settings/NotificationSettingActivity\n*L\n208#1:299,2\n*E\n"})
public final class NotificationSettingActivity extends g {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final void a(@l Context context0) {
            L.p(context0, "context");
            context0.startActivity(new Intent(context0, NotificationSettingActivity.class));
        }
    }

    private x0 w;
    @m
    private o x;
    @m
    private X y;
    @l
    public static final a z;

    static {
        NotificationSettingActivity.z = new a(null);
    }

    // 检测为 Lambda 实现
    private static final void A2(Throwable throwable0) [...]

    private final void B2() {
        static final class G extends N implements Function1 {
            public static final G e;

            static {
                G.e = new G();
            }

            G() {
                super(1);
            }

            public final Boolean a(Integer integer0) {
                L.m(integer0);
                return ((int)integer0) < 0 ? false : true;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Integer)object0));
            }
        }


        static final class H extends N implements Function1 {
            final NotificationSettingActivity e;

            H(NotificationSettingActivity notificationSettingActivity0) {
                this.e = notificationSettingActivity0;
                super(1);
            }

            public final void a(int v) {
                x0 x00 = this.e.w;
                if(x00 == null) {
                    L.S("binding");
                    x00 = null;
                }
                x00.f0.setText(Dl.g(v));
                dl dl0 = dl.a;
                if(dl0.x1() != v) {
                    n.j.a();
                }
                dl0.n5(v);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Number)object0).intValue());
                return S0.a;
            }
        }

        com.dcinside.app.perform.e.a.v(e.e.a(this).m(), 0x7F030015, 0, 2, null).d().Z1((Object object0) -> {
            L.p(G.e, "$tmp0");
            return (Boolean)G.e.invoke(object0);
        }).y5((Object object0) -> {
            L.p(new H(this), "$tmp0");
            new H(this).invoke(object0);
        }, (Throwable throwable0) -> b.a.y(throwable0));
    }

    // 检测为 Lambda 实现
    private static final Boolean C2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void D2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void E2(Throwable throwable0) [...]

    private final void F2() {
        static final class I extends N implements Function1 {
            public static final I e;

            static {
                I.e = new I();
            }

            I() {
                super(1);
            }

            public final Boolean a(Integer integer0) {
                L.m(integer0);
                return ((int)integer0) < 0 ? false : true;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Integer)object0));
            }
        }


        static final class J extends N implements Function1 {
            final NotificationSettingActivity e;

            J(NotificationSettingActivity notificationSettingActivity0) {
                this.e = notificationSettingActivity0;
                super(1);
            }

            public final void a(int v) {
                x0 x00 = this.e.w;
                if(x00 == null) {
                    L.S("binding");
                    x00 = null;
                }
                x00.u.setText(Dl.d(v));
                ll.X(v);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Number)object0).intValue());
                return S0.a;
            }
        }

        if(Build.VERSION.SDK_INT < 26) {
            com.dcinside.app.perform.e.a.v(e.e.a(this).m(), 0x7F030014, 0, 2, null).d().Z1((Object object0) -> {
                L.p(I.e, "$tmp0");
                return (Boolean)I.e.invoke(object0);
            }).y5((Object object0) -> {
                L.p(new J(this), "$tmp0");
                new J(this).invoke(object0);
            }, (Throwable throwable0) -> b.a.y(throwable0));
            return;
        }
        Intent intent0 = new Intent();
        intent0.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent0.putExtra("android.provider.extra.APP_PACKAGE", "com.dcinside.app.android");
        this.startActivity(intent0);
    }

    // 检测为 Lambda 实现
    private static final Boolean G2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void H2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void I2(Throwable throwable0) [...]

    private final void J2(X x0) {
        x0 x00 = this.w;
        x0 x01 = null;
        if(x00 == null) {
            L.S("binding");
            x00 = null;
        }
        x00.S.setChecked(x0.p(x0.o()));
        x0 x02 = this.w;
        if(x02 == null) {
            L.S("binding");
            x02 = null;
        }
        x02.c.setChecked(x0.p(x0.d()));
        x0 x03 = this.w;
        if(x03 == null) {
            L.S("binding");
            x03 = null;
        }
        x03.x.setChecked(x0.p(x0.f()));
        x0 x04 = this.w;
        if(x04 == null) {
            L.S("binding");
            x04 = null;
        }
        x04.Y.setChecked(x0.p(x0.i()));
        x0 x05 = this.w;
        if(x05 == null) {
            L.S("binding");
            x05 = null;
        }
        x05.h.setChecked(x0.p(x0.e()));
        x0 x06 = this.w;
        if(x06 == null) {
            L.S("binding");
            x06 = null;
        }
        x06.L.setChecked(x0.p(x0.g()));
        x0 x07 = this.w;
        if(x07 == null) {
            L.S("binding");
            x07 = null;
        }
        x07.m0.setChecked(x0.p(x0.j()));
        x0 x08 = this.w;
        if(x08 == null) {
            L.S("binding");
        }
        else {
            x01 = x08;
        }
        x01.E.setChecked(x0.p(x0.h()));
        this.y = x0;
    }

    private final void K2(boolean z) {
        x0 x00 = this.w;
        if(x00 == null) {
            L.S("binding");
            x00 = null;
        }
        x00.c0.setVisibility((z ? 0 : 8));
    }

    private final void L2(SwitchCompat switchCompat0) {
        if(switchCompat0.isEnabled()) {
            switchCompat0.setChecked(!switchCompat0.isChecked());
        }
    }

    private final void i2() {
        static final class com.dcinside.app.settings.NotificationSettingActivity.b extends N implements Function1 {
            final NotificationSettingActivity e;

            com.dcinside.app.settings.NotificationSettingActivity.b(NotificationSettingActivity notificationSettingActivity0) {
                this.e = notificationSettingActivity0;
                super(1);
            }

            public final void a(f0 f00) {
                this.e.finish();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((f0)object0));
                return S0.a;
            }
        }


        static final class c extends N implements Function1 {
            public static final c e;

            static {
                c.e = new c();
            }

            c() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "it");
                return p$a0.m(0x7F15032F);  // string:failed_save_notification_push "저장에 실패했습니다.\n\"확인\"을 누르면 이전 화면으로 돌아갑니다."
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class d extends N implements Function1 {
            final NotificationSettingActivity e;

            d(NotificationSettingActivity notificationSettingActivity0) {
                this.e = notificationSettingActivity0;
                super(1);
            }

            public final void a(Integer integer0) {
                if(integer0 != null && ((int)integer0) == -1) {
                    this.e.finish();
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Integer)object0));
                return S0.a;
            }
        }

        X x0 = new X();
        x0 x00 = this.w;
        x0 x01 = null;
        if(x00 == null) {
            L.S("binding");
            x00 = null;
        }
        x0.q(x0.b(x00.S.isChecked()));
        x0 x02 = this.w;
        if(x02 == null) {
            L.S("binding");
            x02 = null;
        }
        x0.r(x0.b(x02.c.isChecked()));
        x0 x03 = this.w;
        if(x03 == null) {
            L.S("binding");
            x03 = null;
        }
        x0.t(x0.b(x03.x.isChecked()));
        x0 x04 = this.w;
        if(x04 == null) {
            L.S("binding");
            x04 = null;
        }
        x0.w(x0.b(x04.Y.isChecked()));
        x0 x05 = this.w;
        if(x05 == null) {
            L.S("binding");
            x05 = null;
        }
        x0.s(x0.b(x05.h.isChecked()));
        x0 x06 = this.w;
        if(x06 == null) {
            L.S("binding");
            x06 = null;
        }
        x0.u(x0.b(x06.L.isChecked()));
        x0 x07 = this.w;
        if(x07 == null) {
            L.S("binding");
            x07 = null;
        }
        x0.x(x0.b(x07.m0.isChecked()));
        x0 x08 = this.w;
        if(x08 == null) {
            L.S("binding");
        }
        else {
            x01 = x08;
        }
        x0.v(x0.b(x01.E.isChecked()));
        if(L.g(x0, this.y)) {
            this.finish();
            return;
        }
        o o0 = this.x;
        if(o0 != null) {
            o0.l();
        }
        this.x = uk.Nj(x0).A5(rx.schedulers.c.e()).M3(rx.android.schedulers.a.c()).R1(() -> {
            L.p(this, "this$0");
            this.K2(true);
        }).T1(() -> {
            L.p(this, "this$0");
            this.K2(false);
        }).y5((Object object0) -> {
            L.p(new com.dcinside.app.settings.NotificationSettingActivity.b(this), "$tmp0");
            new com.dcinside.app.settings.NotificationSettingActivity.b(this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            e.e.a(this).n(c.e).z(0x104000A).x(0x1040000).d().x5((Object object0) -> {
                L.p(new d(notificationSettingActivity0), "$tmp0");
                new d(notificationSettingActivity0).invoke(object0);
            });
        });
    }

    // 检测为 Lambda 实现
    private static final void j2(NotificationSettingActivity notificationSettingActivity0) [...]

    // 检测为 Lambda 实现
    private static final void k2(NotificationSettingActivity notificationSettingActivity0) [...]

    // 检测为 Lambda 实现
    private static final void l2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void m2(NotificationSettingActivity notificationSettingActivity0, Throwable throwable0) [...]

    // 检测为 Lambda 实现
    private static final void n2(Function1 function10, Object object0) [...]

    private final void o2() {
        @f(c = "com.dcinside.app.settings.NotificationSettingActivity$initCallback$8", f = "NotificationSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class A extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final NotificationSettingActivity l;

            A(NotificationSettingActivity notificationSettingActivity0, kotlin.coroutines.d d0) {
                this.l = notificationSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new A(this.l, d0).invokeSuspend(S0.a);
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
                kotlin.f0.n(object0);
                NotificationSettingActivity notificationSettingActivity0 = this.l;
                x0 x00 = notificationSettingActivity0.w;
                if(x00 == null) {
                    L.S("binding");
                    x00 = null;
                }
                L.o(x00.h, "notificationArticlePushSwitch");
                notificationSettingActivity0.L2(x00.h);
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.settings.NotificationSettingActivity$initCallback$9", f = "NotificationSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class B extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final NotificationSettingActivity m;

            B(NotificationSettingActivity notificationSettingActivity0, kotlin.coroutines.d d0) {
                this.m = notificationSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                B notificationSettingActivity$B0 = new B(this.m, d0);
                notificationSettingActivity$B0.l = view0;
                return notificationSettingActivity$B0.invokeSuspend(S0.a);
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
                kotlin.f0.n(object0);
                this.m.q2(((View)this.l));
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.settings.NotificationSettingActivity$initCallback$10", f = "NotificationSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.settings.NotificationSettingActivity.e extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final NotificationSettingActivity m;

            com.dcinside.app.settings.NotificationSettingActivity.e(NotificationSettingActivity notificationSettingActivity0, kotlin.coroutines.d d0) {
                this.m = notificationSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                com.dcinside.app.settings.NotificationSettingActivity.e notificationSettingActivity$e0 = new com.dcinside.app.settings.NotificationSettingActivity.e(this.m, d0);
                notificationSettingActivity$e0.l = view0;
                return notificationSettingActivity$e0.invokeSuspend(S0.a);
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
                kotlin.f0.n(object0);
                this.m.q2(((View)this.l));
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.settings.NotificationSettingActivity$initCallback$11", f = "NotificationSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.settings.NotificationSettingActivity.f extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final NotificationSettingActivity m;

            com.dcinside.app.settings.NotificationSettingActivity.f(NotificationSettingActivity notificationSettingActivity0, kotlin.coroutines.d d0) {
                this.m = notificationSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                com.dcinside.app.settings.NotificationSettingActivity.f notificationSettingActivity$f0 = new com.dcinside.app.settings.NotificationSettingActivity.f(this.m, d0);
                notificationSettingActivity$f0.l = view0;
                return notificationSettingActivity$f0.invokeSuspend(S0.a);
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
                kotlin.f0.n(object0);
                this.m.q2(((View)this.l));
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.settings.NotificationSettingActivity$initCallback$12", f = "NotificationSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.settings.NotificationSettingActivity.g extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final NotificationSettingActivity m;

            com.dcinside.app.settings.NotificationSettingActivity.g(NotificationSettingActivity notificationSettingActivity0, kotlin.coroutines.d d0) {
                this.m = notificationSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                com.dcinside.app.settings.NotificationSettingActivity.g notificationSettingActivity$g0 = new com.dcinside.app.settings.NotificationSettingActivity.g(this.m, d0);
                notificationSettingActivity$g0.l = view0;
                return notificationSettingActivity$g0.invokeSuspend(S0.a);
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
                kotlin.f0.n(object0);
                this.m.q2(((View)this.l));
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.settings.NotificationSettingActivity$initCallback$13", f = "NotificationSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class h extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final NotificationSettingActivity m;

            h(NotificationSettingActivity notificationSettingActivity0, kotlin.coroutines.d d0) {
                this.m = notificationSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                h notificationSettingActivity$h0 = new h(this.m, d0);
                notificationSettingActivity$h0.l = view0;
                return notificationSettingActivity$h0.invokeSuspend(S0.a);
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
                kotlin.f0.n(object0);
                this.m.q2(((View)this.l));
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.settings.NotificationSettingActivity$initCallback$14", f = "NotificationSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class i extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final NotificationSettingActivity m;

            i(NotificationSettingActivity notificationSettingActivity0, kotlin.coroutines.d d0) {
                this.m = notificationSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                i notificationSettingActivity$i0 = new i(this.m, d0);
                notificationSettingActivity$i0.l = view0;
                return notificationSettingActivity$i0.invokeSuspend(S0.a);
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
                kotlin.f0.n(object0);
                this.m.q2(((View)this.l));
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.settings.NotificationSettingActivity$initCallback$15", f = "NotificationSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class j extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final NotificationSettingActivity m;

            j(NotificationSettingActivity notificationSettingActivity0, kotlin.coroutines.d d0) {
                this.m = notificationSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                j notificationSettingActivity$j0 = new j(this.m, d0);
                notificationSettingActivity$j0.l = view0;
                return notificationSettingActivity$j0.invokeSuspend(S0.a);
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
                kotlin.f0.n(object0);
                this.m.q2(((View)this.l));
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.settings.NotificationSettingActivity$initCallback$16", f = "NotificationSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class k extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final NotificationSettingActivity m;

            k(NotificationSettingActivity notificationSettingActivity0, kotlin.coroutines.d d0) {
                this.m = notificationSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                k notificationSettingActivity$k0 = new k(this.m, d0);
                notificationSettingActivity$k0.l = view0;
                return notificationSettingActivity$k0.invokeSuspend(S0.a);
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
                kotlin.f0.n(object0);
                this.m.q2(((View)this.l));
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.settings.NotificationSettingActivity$initCallback$17", f = "NotificationSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.settings.NotificationSettingActivity.l extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final NotificationSettingActivity m;

            com.dcinside.app.settings.NotificationSettingActivity.l(NotificationSettingActivity notificationSettingActivity0, kotlin.coroutines.d d0) {
                this.m = notificationSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                com.dcinside.app.settings.NotificationSettingActivity.l notificationSettingActivity$l0 = new com.dcinside.app.settings.NotificationSettingActivity.l(this.m, d0);
                notificationSettingActivity$l0.l = view0;
                return notificationSettingActivity$l0.invokeSuspend(S0.a);
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
                kotlin.f0.n(object0);
                this.m.q2(((View)this.l));
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.settings.NotificationSettingActivity$initCallback$18", f = "NotificationSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.settings.NotificationSettingActivity.m extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final NotificationSettingActivity m;

            com.dcinside.app.settings.NotificationSettingActivity.m(NotificationSettingActivity notificationSettingActivity0, kotlin.coroutines.d d0) {
                this.m = notificationSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                com.dcinside.app.settings.NotificationSettingActivity.m notificationSettingActivity$m0 = new com.dcinside.app.settings.NotificationSettingActivity.m(this.m, d0);
                notificationSettingActivity$m0.l = view0;
                return notificationSettingActivity$m0.invokeSuspend(S0.a);
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
                kotlin.f0.n(object0);
                this.m.q2(((View)this.l));
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.settings.NotificationSettingActivity$initCallback$19", f = "NotificationSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.settings.NotificationSettingActivity.n extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final NotificationSettingActivity m;

            com.dcinside.app.settings.NotificationSettingActivity.n(NotificationSettingActivity notificationSettingActivity0, kotlin.coroutines.d d0) {
                this.m = notificationSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                com.dcinside.app.settings.NotificationSettingActivity.n notificationSettingActivity$n0 = new com.dcinside.app.settings.NotificationSettingActivity.n(this.m, d0);
                notificationSettingActivity$n0.l = view0;
                return notificationSettingActivity$n0.invokeSuspend(S0.a);
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
                kotlin.f0.n(object0);
                this.m.q2(((View)this.l));
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.settings.NotificationSettingActivity$initCallback$1", f = "NotificationSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.settings.NotificationSettingActivity.o extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final NotificationSettingActivity l;

            com.dcinside.app.settings.NotificationSettingActivity.o(NotificationSettingActivity notificationSettingActivity0, kotlin.coroutines.d d0) {
                this.l = notificationSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.settings.NotificationSettingActivity.o(this.l, d0).invokeSuspend(S0.a);
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
                kotlin.f0.n(object0);
                NotificationSettingActivity notificationSettingActivity0 = this.l;
                x0 x00 = notificationSettingActivity0.w;
                if(x00 == null) {
                    L.S("binding");
                    x00 = null;
                }
                L.o(x00.S, "notificationPushEnableCheck");
                notificationSettingActivity0.L2(x00.S);
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.settings.NotificationSettingActivity$initCallback$20", f = "NotificationSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.settings.NotificationSettingActivity.p extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final NotificationSettingActivity m;

            com.dcinside.app.settings.NotificationSettingActivity.p(NotificationSettingActivity notificationSettingActivity0, kotlin.coroutines.d d0) {
                this.m = notificationSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                com.dcinside.app.settings.NotificationSettingActivity.p notificationSettingActivity$p0 = new com.dcinside.app.settings.NotificationSettingActivity.p(this.m, d0);
                notificationSettingActivity$p0.l = view0;
                return notificationSettingActivity$p0.invokeSuspend(S0.a);
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
                kotlin.f0.n(object0);
                this.m.q2(((View)this.l));
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.settings.NotificationSettingActivity$initCallback$21", f = "NotificationSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class q extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final NotificationSettingActivity m;

            q(NotificationSettingActivity notificationSettingActivity0, kotlin.coroutines.d d0) {
                this.m = notificationSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                q notificationSettingActivity$q0 = new q(this.m, d0);
                notificationSettingActivity$q0.l = view0;
                return notificationSettingActivity$q0.invokeSuspend(S0.a);
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
                kotlin.f0.n(object0);
                this.m.q2(((View)this.l));
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.settings.NotificationSettingActivity$initCallback$22", f = "NotificationSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class r extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            Object l;
            final NotificationSettingActivity m;

            r(NotificationSettingActivity notificationSettingActivity0, kotlin.coroutines.d d0) {
                this.m = notificationSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                r notificationSettingActivity$r0 = new r(this.m, d0);
                notificationSettingActivity$r0.l = view0;
                return notificationSettingActivity$r0.invokeSuspend(S0.a);
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
                kotlin.f0.n(object0);
                this.m.q2(((View)this.l));
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.settings.NotificationSettingActivity$initCallback$23", f = "NotificationSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class s extends kotlin.coroutines.jvm.internal.o implements A3.q {
            int k;
            boolean l;
            final NotificationSettingActivity m;

            s(NotificationSettingActivity notificationSettingActivity0, kotlin.coroutines.d d0) {
                this.m = notificationSettingActivity0;
                super(4, d0);
            }

            @Override  // A3.q
            public Object T0(Object object0, Object object1, Object object2, Object object3) {
                return this.a(((O)object0), ((CompoundButton)object1), ((Boolean)object2).booleanValue(), ((kotlin.coroutines.d)object3));
            }

            @m
            public final Object a(@l O o0, @l CompoundButton compoundButton0, boolean z, @m kotlin.coroutines.d d0) {
                s notificationSettingActivity$s0 = new s(this.m, d0);
                notificationSettingActivity$s0.l = z;
                return notificationSettingActivity$s0.invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                kotlin.f0.n(object0);
                this.m.r2(this.l);
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.settings.NotificationSettingActivity$initCallback$24", f = "NotificationSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class t extends kotlin.coroutines.jvm.internal.o implements A3.q {
            int k;
            boolean l;

            t(kotlin.coroutines.d d0) {
                super(4, d0);
            }

            @Override  // A3.q
            public Object T0(Object object0, Object object1, Object object2, Object object3) {
                return this.a(((O)object0), ((CompoundButton)object1), ((Boolean)object2).booleanValue(), ((kotlin.coroutines.d)object3));
            }

            @m
            public final Object a(@l O o0, @l CompoundButton compoundButton0, boolean z, @m kotlin.coroutines.d d0) {
                t notificationSettingActivity$t0 = new t(d0);
                notificationSettingActivity$t0.l = z;
                return notificationSettingActivity$t0.invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                kotlin.f0.n(object0);
                dl.a.j6(this.l);
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.settings.NotificationSettingActivity$initCallback$2", f = "NotificationSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class u extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final NotificationSettingActivity l;

            u(NotificationSettingActivity notificationSettingActivity0, kotlin.coroutines.d d0) {
                this.l = notificationSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new u(this.l, d0).invokeSuspend(S0.a);
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
                kotlin.f0.n(object0);
                NotificationSettingActivity notificationSettingActivity0 = this.l;
                x0 x00 = notificationSettingActivity0.w;
                if(x00 == null) {
                    L.S("binding");
                    x00 = null;
                }
                L.o(x00.c, "notificationActivePushSwitch");
                notificationSettingActivity0.L2(x00.c);
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.settings.NotificationSettingActivity$initCallback$3", f = "NotificationSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class v extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final NotificationSettingActivity l;

            v(NotificationSettingActivity notificationSettingActivity0, kotlin.coroutines.d d0) {
                this.l = notificationSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new v(this.l, d0).invokeSuspend(S0.a);
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
                kotlin.f0.n(object0);
                NotificationSettingActivity notificationSettingActivity0 = this.l;
                x0 x00 = notificationSettingActivity0.w;
                if(x00 == null) {
                    L.S("binding");
                    x00 = null;
                }
                L.o(x00.E, "notificationLikePushSwitch");
                notificationSettingActivity0.L2(x00.E);
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.settings.NotificationSettingActivity$initCallback$4", f = "NotificationSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.settings.NotificationSettingActivity.w extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final NotificationSettingActivity l;

            com.dcinside.app.settings.NotificationSettingActivity.w(NotificationSettingActivity notificationSettingActivity0, kotlin.coroutines.d d0) {
                this.l = notificationSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.settings.NotificationSettingActivity.w(this.l, d0).invokeSuspend(S0.a);
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
                kotlin.f0.n(object0);
                NotificationSettingActivity notificationSettingActivity0 = this.l;
                x0 x00 = notificationSettingActivity0.w;
                if(x00 == null) {
                    L.S("binding");
                    x00 = null;
                }
                L.o(x00.x, "notificationKeywordPushSwitch");
                notificationSettingActivity0.L2(x00.x);
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.settings.NotificationSettingActivity$initCallback$5", f = "NotificationSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class x extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final NotificationSettingActivity l;

            x(NotificationSettingActivity notificationSettingActivity0, kotlin.coroutines.d d0) {
                this.l = notificationSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new x(this.l, d0).invokeSuspend(S0.a);
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
                kotlin.f0.n(object0);
                NotificationSettingActivity notificationSettingActivity0 = this.l;
                x0 x00 = notificationSettingActivity0.w;
                if(x00 == null) {
                    L.S("binding");
                    x00 = null;
                }
                L.o(x00.m0, "notificationUserPushSwitch");
                notificationSettingActivity0.L2(x00.m0);
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.settings.NotificationSettingActivity$initCallback$6", f = "NotificationSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class y extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final NotificationSettingActivity l;

            y(NotificationSettingActivity notificationSettingActivity0, kotlin.coroutines.d d0) {
                this.l = notificationSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new y(this.l, d0).invokeSuspend(S0.a);
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
                kotlin.f0.n(object0);
                NotificationSettingActivity notificationSettingActivity0 = this.l;
                x0 x00 = notificationSettingActivity0.w;
                if(x00 == null) {
                    L.S("binding");
                    x00 = null;
                }
                L.o(x00.Y, "notificationRecommPushSwitch");
                notificationSettingActivity0.L2(x00.Y);
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.settings.NotificationSettingActivity$initCallback$7", f = "NotificationSettingActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class z extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final NotificationSettingActivity l;

            z(NotificationSettingActivity notificationSettingActivity0, kotlin.coroutines.d d0) {
                this.l = notificationSettingActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new z(this.l, d0).invokeSuspend(S0.a);
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
                kotlin.f0.n(object0);
                NotificationSettingActivity notificationSettingActivity0 = this.l;
                x0 x00 = notificationSettingActivity0.w;
                if(x00 == null) {
                    L.S("binding");
                    x00 = null;
                }
                L.o(x00.L, "notificationNoticePushSwitch");
                notificationSettingActivity0.L2(x00.L);
                return S0.a;
            }
        }

        x0 x00 = this.w;
        if(x00 == null) {
            L.S("binding");
            x00 = null;
        }
        L.o(x00.R, "notificationPushEnable");
        com.dcinside.app.settings.NotificationSettingActivity.o notificationSettingActivity$o0 = new com.dcinside.app.settings.NotificationSettingActivity.o(this, null);
        com.dcinside.app.internal.r.M(x00.R, null, notificationSettingActivity$o0, 1, null);
        x0 x01 = this.w;
        if(x01 == null) {
            L.S("binding");
            x01 = null;
        }
        L.o(x01.b, "notificationActivePushEnable");
        u notificationSettingActivity$u0 = new u(this, null);
        com.dcinside.app.internal.r.M(x01.b, null, notificationSettingActivity$u0, 1, null);
        x0 x02 = this.w;
        if(x02 == null) {
            L.S("binding");
            x02 = null;
        }
        L.o(x02.C, "notificationLikePushEnable");
        v notificationSettingActivity$v0 = new v(this, null);
        com.dcinside.app.internal.r.M(x02.C, null, notificationSettingActivity$v0, 1, null);
        x0 x03 = this.w;
        if(x03 == null) {
            L.S("binding");
            x03 = null;
        }
        L.o(x03.w, "notificationKeywordPushEnable");
        com.dcinside.app.settings.NotificationSettingActivity.w notificationSettingActivity$w0 = new com.dcinside.app.settings.NotificationSettingActivity.w(this, null);
        com.dcinside.app.internal.r.M(x03.w, null, notificationSettingActivity$w0, 1, null);
        x0 x04 = this.w;
        if(x04 == null) {
            L.S("binding");
            x04 = null;
        }
        L.o(x04.l0, "notificationUserPushEnable");
        x notificationSettingActivity$x0 = new x(this, null);
        com.dcinside.app.internal.r.M(x04.l0, null, notificationSettingActivity$x0, 1, null);
        x0 x05 = this.w;
        if(x05 == null) {
            L.S("binding");
            x05 = null;
        }
        L.o(x05.W, "notificationRecommPushEnable");
        y notificationSettingActivity$y0 = new y(this, null);
        com.dcinside.app.internal.r.M(x05.W, null, notificationSettingActivity$y0, 1, null);
        x0 x06 = this.w;
        if(x06 == null) {
            L.S("binding");
            x06 = null;
        }
        L.o(x06.J, "notificationNoticePushEnable");
        z notificationSettingActivity$z0 = new z(this, null);
        com.dcinside.app.internal.r.M(x06.J, null, notificationSettingActivity$z0, 1, null);
        x0 x07 = this.w;
        if(x07 == null) {
            L.S("binding");
            x07 = null;
        }
        L.o(x07.f, "notificationArticlePushEnable");
        A notificationSettingActivity$A0 = new A(this, null);
        com.dcinside.app.internal.r.M(x07.f, null, notificationSettingActivity$A0, 1, null);
        x0 x08 = this.w;
        if(x08 == null) {
            L.S("binding");
            x08 = null;
        }
        L.o(x08.B, "notificationKeywordSettingTitle");
        B notificationSettingActivity$B0 = new B(this, null);
        com.dcinside.app.internal.r.M(x08.B, null, notificationSettingActivity$B0, 1, null);
        x0 x09 = this.w;
        if(x09 == null) {
            L.S("binding");
            x09 = null;
        }
        L.o(x09.A, "notificationKeywordSettingIcon");
        com.dcinside.app.settings.NotificationSettingActivity.e notificationSettingActivity$e0 = new com.dcinside.app.settings.NotificationSettingActivity.e(this, null);
        com.dcinside.app.internal.r.M(x09.A, null, notificationSettingActivity$e0, 1, null);
        x0 x010 = this.w;
        if(x010 == null) {
            L.S("binding");
            x010 = null;
        }
        L.o(x010.q0, "notificationUserSettingTitle");
        com.dcinside.app.settings.NotificationSettingActivity.f notificationSettingActivity$f0 = new com.dcinside.app.settings.NotificationSettingActivity.f(this, null);
        com.dcinside.app.internal.r.M(x010.q0, null, notificationSettingActivity$f0, 1, null);
        x0 x011 = this.w;
        if(x011 == null) {
            L.S("binding");
            x011 = null;
        }
        L.o(x011.p0, "notificationUserSettingIcon");
        com.dcinside.app.settings.NotificationSettingActivity.g notificationSettingActivity$g0 = new com.dcinside.app.settings.NotificationSettingActivity.g(this, null);
        com.dcinside.app.internal.r.M(x011.p0, null, notificationSettingActivity$g0, 1, null);
        x0 x012 = this.w;
        if(x012 == null) {
            L.S("binding");
            x012 = null;
        }
        L.o(x012.b0, "notificationRecommSettingTitle");
        h notificationSettingActivity$h0 = new h(this, null);
        com.dcinside.app.internal.r.M(x012.b0, null, notificationSettingActivity$h0, 1, null);
        x0 x013 = this.w;
        if(x013 == null) {
            L.S("binding");
            x013 = null;
        }
        L.o(x013.a0, "notificationRecommSettingIcon");
        i notificationSettingActivity$i0 = new i(this, null);
        com.dcinside.app.internal.r.M(x013.a0, null, notificationSettingActivity$i0, 1, null);
        x0 x014 = this.w;
        if(x014 == null) {
            L.S("binding");
            x014 = null;
        }
        L.o(x014.O, "notificationNoticeSettingTitle");
        j notificationSettingActivity$j0 = new j(this, null);
        com.dcinside.app.internal.r.M(x014.O, null, notificationSettingActivity$j0, 1, null);
        x0 x015 = this.w;
        if(x015 == null) {
            L.S("binding");
            x015 = null;
        }
        L.o(x015.N, "notificationNoticeSettingIcon");
        k notificationSettingActivity$k0 = new k(this, null);
        com.dcinside.app.internal.r.M(x015.N, null, notificationSettingActivity$k0, 1, null);
        x0 x016 = this.w;
        if(x016 == null) {
            L.S("binding");
            x016 = null;
        }
        L.o(x016.k, "notificationArticleSettingTitle");
        com.dcinside.app.settings.NotificationSettingActivity.l notificationSettingActivity$l0 = new com.dcinside.app.settings.NotificationSettingActivity.l(this, null);
        com.dcinside.app.internal.r.M(x016.k, null, notificationSettingActivity$l0, 1, null);
        x0 x017 = this.w;
        if(x017 == null) {
            L.S("binding");
            x017 = null;
        }
        L.o(x017.j, "notificationArticleSettingIcon");
        com.dcinside.app.settings.NotificationSettingActivity.m notificationSettingActivity$m0 = new com.dcinside.app.settings.NotificationSettingActivity.m(this, null);
        com.dcinside.app.internal.r.M(x017.j, null, notificationSettingActivity$m0, 1, null);
        x0 x018 = this.w;
        if(x018 == null) {
            L.S("binding");
            x018 = null;
        }
        L.o(x018.q, "notificationEffect");
        com.dcinside.app.settings.NotificationSettingActivity.n notificationSettingActivity$n0 = new com.dcinside.app.settings.NotificationSettingActivity.n(this, null);
        com.dcinside.app.internal.r.M(x018.q, null, notificationSettingActivity$n0, 1, null);
        x0 x019 = this.w;
        if(x019 == null) {
            L.S("binding");
            x019 = null;
        }
        L.o(x019.d0, "notificationTouchAction");
        com.dcinside.app.settings.NotificationSettingActivity.p notificationSettingActivity$p0 = new com.dcinside.app.settings.NotificationSettingActivity.p(this, null);
        com.dcinside.app.internal.r.M(x019.d0, null, notificationSettingActivity$p0, 1, null);
        x0 x020 = this.w;
        if(x020 == null) {
            L.S("binding");
            x020 = null;
        }
        L.o(x020.m, "notificationContentsType");
        q notificationSettingActivity$q0 = new q(this, null);
        com.dcinside.app.internal.r.M(x020.m, null, notificationSettingActivity$q0, 1, null);
        x0 x021 = this.w;
        if(x021 == null) {
            L.S("binding");
            x021 = null;
        }
        L.o(x021.g0, "notificationUseUnread");
        r notificationSettingActivity$r0 = new r(this, null);
        com.dcinside.app.internal.r.M(x021.g0, null, notificationSettingActivity$r0, 1, null);
        x0 x022 = this.w;
        if(x022 == null) {
            L.S("binding");
            x022 = null;
        }
        L.o(x022.S, "notificationPushEnableCheck");
        s notificationSettingActivity$s0 = new s(this, null);
        com.dcinside.app.internal.r.J(x022.S, null, notificationSettingActivity$s0, 1, null);
        x0 x023 = this.w;
        if(x023 == null) {
            L.S("binding");
            x023 = null;
        }
        L.o(x023.h0, "notificationUseUnreadCheck");
        t notificationSettingActivity$t0 = new t(null);
        com.dcinside.app.internal.r.J(x023.h0, null, notificationSettingActivity$t0, 1, null);
    }

    @Override  // com.dcinside.app.base.g
    protected void onCreate(@m Bundle bundle0) {
        public static final class C extends OnBackPressedCallback {
            final NotificationSettingActivity d;

            C(NotificationSettingActivity notificationSettingActivity0) {
                this.d = notificationSettingActivity0;
                super(true);
            }

            @Override  // androidx.activity.OnBackPressedCallback
            public void g() {
                this.d.i2();
            }
        }

        super.onCreate(bundle0);
        x0 x00 = x0.c(this.getLayoutInflater());
        L.o(x00, "inflate(...)");
        this.w = x00;
        x0 x01 = null;
        if(x00 == null) {
            L.S("binding");
            x00 = null;
        }
        this.setContentView(x00.b());
        x0 x02 = this.w;
        if(x02 == null) {
            L.S("binding");
        }
        else {
            x01 = x02;
        }
        this.S0(x01.t);
        kr.bhbfhfb.designcompat.a.d(this);
        this.p2();
        this.o2();
        this.s2();
        this.getOnBackPressedDispatcher().h(new C(this));
    }

    @Override  // com.dcinside.app.base.g
    protected void onDestroy() {
        super.onDestroy();
        o o0 = this.x;
        if(o0 != null) {
            o0.l();
        }
        this.x = null;
    }

    @Override  // android.app.Activity
    public boolean onOptionsItemSelected(@l MenuItem menuItem0) {
        L.p(menuItem0, "item");
        if(menuItem0.getItemId() == 0x102002C) {
            this.i2();
            return true;
        }
        return super.onOptionsItemSelected(menuItem0);
    }

    private final void p2() {
        x0 x00 = this.w;
        x0 x01 = null;
        if(x00 == null) {
            L.S("binding");
            x00 = null;
        }
        dl dl0 = dl.a;
        int v = Dl.f(dl0.u1());
        x00.o.setText(v);
        x0 x02 = this.w;
        if(x02 == null) {
            L.S("binding");
            x02 = null;
        }
        int v1 = Dl.g(dl0.x1());
        x02.f0.setText(v1);
        if(Build.VERSION.SDK_INT < 26) {
            x0 x03 = this.w;
            if(x03 == null) {
                L.S("binding");
                x03 = null;
            }
            int v2 = Dl.d(ll.W());
            x03.u.setText(v2);
            x0 x04 = this.w;
            if(x04 == null) {
                L.S("binding");
                x04 = null;
            }
            x04.r.setText("알림 모드");
        }
        else {
            x0 x05 = this.w;
            if(x05 == null) {
                L.S("binding");
                x05 = null;
            }
            x05.u.setVisibility(8);
            x0 x06 = this.w;
            if(x06 == null) {
                L.S("binding");
                x06 = null;
            }
            x06.r.setText("알림 세부 설정");
        }
        x0 x07 = this.w;
        if(x07 == null) {
            L.S("binding");
        }
        else {
            x01 = x07;
        }
        boolean z = dl0.v2();
        x01.h0.setChecked(z);
    }

    private final void q2(View view0) {
        if(view0 == null) {
            return;
        }
        switch(view0.getId()) {
            case 0x7F0B0922:   // id:notification_article_setting_icon
            case 0x7F0B0923: {  // id:notification_article_setting_title
                ArticlePostListActivity.y.a(this, "", "");
                return;
            }
            case 0x7F0B0927: {  // id:notification_contents_type
                this.x2();
                return;
            }
            case 0x7F0B092C: {  // id:notification_effect
                this.F2();
                return;
            }
            case 0x7F0B0937:   // id:notification_keyword_setting_icon
            case 0x7F0B0938: {  // id:notification_keyword_setting_title
                KeywordListActivity.w.a(this, "com.dcinside.app.ArticlePostListActivity.ACTION_KEYWORD_LIST_TYPE");
                return;
            }
            case 0x7F0B0947:   // id:notification_notice_setting_icon
            case 0x7F0B0948: {  // id:notification_notice_setting_title
                SettingPushGalleryActivity.y.a(this);
                return;
            }
            case 0x7F0B0954:   // id:notification_recomm_setting_icon
            case 0x7F0B0955: {  // id:notification_recomm_setting_title
                SettingPushGalleryActivity.y.b(this);
                return;
            }
            case 0x7F0B0958: {  // id:notification_touch_action
                this.B2();
                return;
            }
            case 0x7F0B095B: {  // id:notification_use_unread
                x0 x00 = this.w;
                if(x00 == null) {
                    L.S("binding");
                    x00 = null;
                }
                L.o(x00.h0, "notificationUseUnreadCheck");
                this.L2(x00.h0);
                return;
            }
            case 0x7F0B0964:   // id:notification_user_setting_icon
            case 0x7F0B0965: {  // id:notification_user_setting_title
                KeywordListActivity.w.a(this, "com.dcinside.app.ArticlePostListActivity.ACTION_USER_LIST_TYPE");
            }
        }
    }

    private final void r2(boolean z) {
        x0 x00 = this.w;
        x0 x01 = null;
        if(x00 == null) {
            L.S("binding");
            x00 = null;
        }
        x00.P.setVisibility((z ? 8 : 0));
        x0 x02 = this.w;
        if(x02 == null) {
            L.S("binding");
            x02 = null;
        }
        x02.d.setAlpha((z ? 1.0f : 0.3f));
        x0 x03 = this.w;
        if(x03 == null) {
            L.S("binding");
            x03 = null;
        }
        x03.e.setAlpha((z ? 1.0f : 0.3f));
        x0 x04 = this.w;
        if(x04 == null) {
            L.S("binding");
            x04 = null;
        }
        x04.G.setAlpha((z ? 1.0f : 0.3f));
        x0 x05 = this.w;
        if(x05 == null) {
            L.S("binding");
            x05 = null;
        }
        x05.H.setAlpha((z ? 1.0f : 0.3f));
        x0 x06 = this.w;
        if(x06 == null) {
            L.S("binding");
            x06 = null;
        }
        x06.l.setAlpha((z ? 1.0f : 0.3f));
        x0 x07 = this.w;
        if(x07 == null) {
            L.S("binding");
            x07 = null;
        }
        x07.p.setAlpha((z ? 1.0f : 0.3f));
        x0 x08 = this.w;
        if(x08 == null) {
            L.S("binding");
            x08 = null;
        }
        x08.c.setEnabled(z);
        x0 x09 = this.w;
        if(x09 == null) {
            L.S("binding");
            x09 = null;
        }
        x09.x.setEnabled(z);
        x0 x010 = this.w;
        if(x010 == null) {
            L.S("binding");
            x010 = null;
        }
        x010.Y.setEnabled(z);
        x0 x011 = this.w;
        if(x011 == null) {
            L.S("binding");
            x011 = null;
        }
        x011.h.setEnabled(z);
        x0 x012 = this.w;
        if(x012 == null) {
            L.S("binding");
            x012 = null;
        }
        x012.L.setEnabled(z);
        x0 x013 = this.w;
        if(x013 == null) {
            L.S("binding");
            x013 = null;
        }
        x013.m0.setEnabled(z);
        x0 x014 = this.w;
        if(x014 == null) {
            L.S("binding");
            x014 = null;
        }
        x014.E.setEnabled(z);
        x0 x015 = this.w;
        if(x015 == null) {
            L.S("binding");
        }
        else {
            x01 = x015;
        }
        x01.h0.setEnabled(z);
    }

    private final void s2() {
        static final class D extends N implements Function1 {
            final NotificationSettingActivity e;

            D(NotificationSettingActivity notificationSettingActivity0) {
                this.e = notificationSettingActivity0;
                super(1);
            }

            public final void a(X x0) {
                L.m(x0);
                this.e.J2(x0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((X)object0));
                return S0.a;
            }
        }

        o o0 = this.x;
        if(o0 != null) {
            o0.l();
        }
        this.x = uk.Hk().A5(rx.schedulers.c.e()).M3(rx.android.schedulers.a.c()).R1(() -> {
            L.p(this, "this$0");
            this.K2(true);
        }).K1(() -> {
            L.p(this, "this$0");
            this.K2(false);
            x0 x00 = this.w;
            if(x00 == null) {
                L.S("binding");
                x00 = null;
            }
            L.o(x00.U, "notificationPushSettingView");
            x00.U.setVisibility(0);
        }).y5((Object object0) -> {
            L.p(new D(this), "$tmp0");
            new D(this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            Dl.D(this, 0x7F150326);  // string:failed_notice_data "정보를 가져올 수 없습니다. 잠시 후 다시 시도해주세요."
        });
    }

    // 检测为 Lambda 实现
    private static final void t2(NotificationSettingActivity notificationSettingActivity0) [...]

    // 检测为 Lambda 实现
    private static final void u2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void v2(NotificationSettingActivity notificationSettingActivity0, Throwable throwable0) [...]

    // 检测为 Lambda 实现
    private static final void w2(NotificationSettingActivity notificationSettingActivity0) [...]

    private final void x2() {
        static final class E extends N implements Function1 {
            public static final E e;

            static {
                E.e = new E();
            }

            E() {
                super(1);
            }

            public final Boolean a(Integer integer0) {
                L.m(integer0);
                return ((int)integer0) < 0 ? false : true;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Integer)object0));
            }
        }


        static final class F extends N implements Function1 {
            final NotificationSettingActivity e;

            F(NotificationSettingActivity notificationSettingActivity0) {
                this.e = notificationSettingActivity0;
                super(1);
            }

            public final void a(int v) {
                x0 x00 = this.e.w;
                if(x00 == null) {
                    L.S("binding");
                    x00 = null;
                }
                x00.o.setText(Dl.f(v));
                dl.a.k5(v);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Number)object0).intValue());
                return S0.a;
            }
        }

        com.dcinside.app.perform.e.a.v(e.e.a(this).m(), 0x7F030013, 0, 2, null).d().Z1((Object object0) -> {
            L.p(E.e, "$tmp0");
            return (Boolean)E.e.invoke(object0);
        }).y5((Object object0) -> {
            L.p(new F(this), "$tmp0");
            new F(this).invoke(object0);
        }, (Throwable throwable0) -> b.a.y(throwable0));
    }

    // 检测为 Lambda 实现
    private static final Boolean y2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void z2(Function1 function10, Object object0) [...]
}

