package com.dcinside.app.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.dcinside.app.Application;
import com.dcinside.app.archive.main.ArchiveMainActivity;
import com.dcinside.app.auth.LoginActivity;
import com.dcinside.app.base.g;
import com.dcinside.app.bookmark.FavoriteMenuView;
import com.dcinside.app.browser.AwesomeWebView.Builder;
import com.dcinside.app.gallery.search.CategoryHotActivity;
import com.dcinside.app.gallery.status.MyGalleryStatusActivity;
import com.dcinside.app.history.PostHistoryActivity;
import com.dcinside.app.perform.e;
import com.dcinside.app.post.view.DrawerLayout;
import com.dcinside.app.push.PushNoticeListActivity;
import com.dcinside.app.realm.B;
import com.dcinside.app.settings.SettingActivity;
import com.dcinside.app.type.P;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.Xk;
import com.dcinside.app.util.pl;
import com.dcinside.app.view.UserView;
import com.dcinside.app.view.recent.RecentMenuView;
import io.realm.F0;
import java.util.Iterator;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.i;
import y4.l;
import y4.m;

public abstract class u0 extends g {
    @m
    private TextView A;
    @m
    private DrawerLayout w;
    private UserView x;
    private RecentMenuView y;
    private FavoriteMenuView z;

    // 检测为 Lambda 实现
    private static final void A2(u0 u00, View view0) [...]

    // 检测为 Lambda 实现
    private static final void B2(u0 u00, View view0) [...]

    // 检测为 Lambda 实现
    private static final void C2(u0 u00, View view0) [...]

    // 检测为 Lambda 实现
    private static final void D2(u0 u00, View view0) [...]

    // 检测为 Lambda 实现
    private static final void E2(u0 u00, View view0) [...]

    // 检测为 Lambda 实现
    private static final void F2(u0 u00, View view0) [...]

    // 检测为 Lambda 实现
    private static final void G2(u0 u00, View view0) [...]

    // 检测为 Lambda 实现
    private static final void H2(u0 u00, View view0) [...]

    // 检测为 Lambda 实现
    private static final void I2(u0 u00, View view0) [...]

    // 检测为 Lambda 实现
    private static final void J2(u0 u00, View view0) [...]

    // 检测为 Lambda 实现
    private static final void K2(u0 u00, View view0) [...]

    // 检测为 Lambda 实现
    private static final void L2(u0 u00, View view0) [...]

    // 检测为 Lambda 实现
    private static final void M2(u0 u00, View view0) [...]

    private final void N2(View view0) {
        Object object0 = view0.getTag();
        L.n(object0, "null cannot be cast to non-null type kotlin.String");
        a.i(this, ((String)object0));
    }

    private final void O2(com.dcinside.app.type.m m0) {
        CategoryHotActivity.y.a(this, m0);
    }

    private final void P2(View view0) {
        Object object0 = view0.getTag();
        L.n(object0, "null cannot be cast to non-null type kotlin.String");
        a.j(this, ((String)object0));
    }

    private final void Q2() {
        static final class b extends N implements Function1 {
            public static final b e;

            static {
                b.e = new b();
            }

            b() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "builder");
                return p$a0.m(0x7F150517);  // string:join_mini_need_login "로그인이 필요합니다. 로그인하시겠습니까?"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
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

            public final Boolean a(@m Boolean boolean0) {
                return boolean0;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Boolean)object0));
            }
        }


        static final class d extends N implements Function1 {
            final u0 e;

            d(u0 u00) {
                this.e = u00;
                super(1);
            }

            public final void a(Boolean boolean0) {
                this.e.p2();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        String s = B.E.k0();
        if(m0.a.a.h(s)) {
            e.e.a(this).n(b.e).z(0x7F15034A).x(0x7F1509CD).b().Z1((Object object0) -> {
                L.p(c.e, "$tmp0");
                return (Boolean)c.e.invoke(object0);
            }).x5((Object object0) -> {
                L.p(new d(this), "$tmp0");
                new d(this).invoke(object0);
            });
            return;
        }
        MyGalleryStatusActivity.A.a(this);
    }

    // 检测为 Lambda 实现
    private static final Boolean R2(Function1 function10, Object object0) [...]

    @Override  // androidx.appcompat.app.AppCompatActivity
    public void S0(@m Toolbar toolbar0) {
        super.S0(toolbar0);
        if(toolbar0 != null) {
            kr.bhbfhfb.designcompat.a.d(this);
            com.dcinside.app.util.pl.c[] arr_pl$c = this.m2();
            pl pl0 = pl.s(this.w, toolbar0);
            toolbar0.setNavigationOnClickListener((View view0) -> {
                L.p(this, "this$0");
                this.b3();
            });
            if(arr_pl$c != null) {
                Iterator iterator0 = i.a(arr_pl$c);
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    pl0.w(((com.dcinside.app.util.pl.c)object0));
                }
            }
        }
    }

    // 检测为 Lambda 实现
    private static final void S2(Function1 function10, Object object0) [...]

    private final void T2() {
        Xk.i(this, "know");
    }

    private final void U2(View view0) {
        Builder awesomeWebView$Builder0 = a.d(this);
        if(awesomeWebView$Builder0 != null) {
            Builder awesomeWebView$Builder1 = awesomeWebView$Builder0.J6(true);
            if(awesomeWebView$Builder1 != null) {
                Builder awesomeWebView$Builder2 = awesomeWebView$Builder1.s7("Mozilla/5.0 (X11; U; Linux i686; en-US; rv:1.9.0.4) Gecko/20100101 Firefox/4.0");
                if(awesomeWebView$Builder2 != null) {
                    Object object0 = view0.getTag();
                    L.n(object0, "null cannot be cast to non-null type kotlin.String");
                    awesomeWebView$Builder2.y5(((String)object0));
                }
            }
        }
    }

    private final void V2() {
        this.startActivity(new Intent(this, ArchiveMainActivity.class));
    }

    private final void W2() {
        if(Application.e.f().o()) {
            Dl.D(this, 0x7F15045D);  // string:history_delete_running "최근 본 글 정리중입니다. 잠시 후 다시 시도해주세요."
            return;
        }
        this.startActivity(new Intent(this, PostHistoryActivity.class));
    }

    private final void X2() {
        PushNoticeListActivity.D.a(this);
    }

    private final void Y2() {
        this.startActivityForResult(new Intent(this, SettingActivity.class), 1007);
    }

    public final void Z2(@m String s) {
        Intent intent0 = new Intent(this, SettingActivity.class);
        intent0.putExtra("com.dcinside.app.settings.SettingActivity.EXTRA_OTP_URL", s);
        this.startActivityForResult(intent0, 1007);
        this.finish();
    }

    private final void a3() {
        P.b.j(this);
    }

    private final void b3() {
        DrawerLayout drawerLayout0 = this.w;
        L.m(drawerLayout0);
        if(drawerLayout0.E(0x800003)) {
            this.k2();
            return;
        }
        DrawerLayout drawerLayout1 = this.w;
        L.m(drawerLayout1);
        drawerLayout1.M(0x800003);
        this.f1();
    }

    // 检测为 Lambda 实现
    private static final void c3(u0 u00, View view0) [...]

    public final void d3(@m TextView textView0) {
        this.A = textView0;
    }

    protected final boolean k2() {
        DrawerLayout drawerLayout0 = this.w;
        L.m(drawerLayout0);
        if(drawerLayout0.E(0x800003)) {
            DrawerLayout drawerLayout1 = this.w;
            L.m(drawerLayout1);
            drawerLayout1.d(0x800003);
            return true;
        }
        return false;
    }

    @m
    public final DrawerLayout l2() {
        return this.w;
    }

    @m
    protected com.dcinside.app.util.pl.c[] m2() {
        return null;
    }

    @m
    public final TextView n2() {
        return this.A;
    }

    protected boolean o2() {
        return false;
    }

    @Override  // com.dcinside.app.base.g
    protected void onCreate(@m Bundle bundle0) {
        public static final class com.dcinside.app.main.u0.a implements ViewTreeObserver.OnPreDrawListener {
            final u0 a;
            final View b;

            com.dcinside.app.main.u0.a(u0 u00, View view0) {
                this.a = u00;
                this.b = view0;
                super();
            }

            @Override  // android.view.ViewTreeObserver$OnPreDrawListener
            public boolean onPreDraw() {
                FragmentManager fragmentManager0 = this.a.getSupportFragmentManager();
                L.o(fragmentManager0, "getSupportFragmentManager(...)");
                Fragment fragment0 = fragmentManager0.r0(0x7F0B075A);  // id:main_fragment
                boolean z = fragment0 instanceof Q ? ((Q)fragment0).i1() : true;
                if(z) {
                    this.b.getViewTreeObserver().removeOnPreDrawListener(this);
                }
                return z;
            }
        }

        super.onCreate(bundle0);
        this.setContentView(0x7F0E003B);  // layout:activity_main
        View view0 = this.findViewById(0x1020002);
        L.o(view0, "findViewById(...)");
        view0.getViewTreeObserver().addOnPreDrawListener(new com.dcinside.app.main.u0.a(this, view0));
        F0 f00 = this.F1();
        L.m(f00);
        this.w = (DrawerLayout)this.findViewById(0x7F0B0F1A);  // id:slide
        View view1 = this.findViewById(0x7F0B0F07);  // id:side_menu_user
        L.o(view1, "findViewById(...)");
        UserView userView0 = (UserView)view1;
        this.x = userView0;
        FavoriteMenuView favoriteMenuView0 = null;
        if(userView0 == null) {
            L.S("vwUser");
            userView0 = null;
        }
        userView0.r(f00);
        View view2 = this.findViewById(0x7F0B0F06);  // id:side_menu_recent
        L.o(view2, "findViewById(...)");
        RecentMenuView recentMenuView0 = (RecentMenuView)view2;
        this.y = recentMenuView0;
        if(recentMenuView0 == null) {
            L.S("vwRecentMenu");
            recentMenuView0 = null;
        }
        recentMenuView0.o(f00);
        View view3 = this.findViewById(0x7F0B0F05);  // id:side_menu_favorite
        L.o(view3, "findViewById(...)");
        this.z = (FavoriteMenuView)view3;
        if(((FavoriteMenuView)view3) == null) {
            L.S("vwFavoriteMenu");
        }
        else {
            favoriteMenuView0 = (FavoriteMenuView)view3;
        }
        favoriteMenuView0.v(f00);
        this.A = (TextView)this.findViewById(0x7F0B1033);  // id:user_notification_new_count
        this.findViewById(0x7F0B0760).setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            this.W2();
        });
        this.findViewById(0x7F0B075C).setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            this.V2();
        });
        this.findViewById(0x7F0B075F).setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            this.Q2();
        });
        this.findViewById(0x7F0B0304).setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            L.m(view0);
            this.P2(view0);
        });
        this.findViewById(0x7F0B0303).setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            L.m(view0);
            this.P2(view0);
        });
        this.findViewById(0x7F0B0302).setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            L.m(view0);
            this.P2(view0);
        });
        this.findViewById(0x7F0B0301).setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            L.m(view0);
            this.P2(view0);
        });
        this.findViewById(0x7F0B0761).setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            L.m(view0);
            this.P2(view0);
        });
        this.findViewById(0x7F0B0819).setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            this.O2(com.dcinside.app.type.m.g);
        });
        this.findViewById(0x7F0B081F).setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            this.O2(com.dcinside.app.type.m.h);
        });
        this.findViewById(0x7F0B081C).setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            this.O2(com.dcinside.app.type.m.i);
        });
        this.findViewById(0x7F0B0826).setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            this.O2(com.dcinside.app.type.m.j);
        });
        this.findViewById(0x7F0B0086).setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            L.m(view0);
            this.N2(view0);
        });
        this.findViewById(0x7F0B0087).setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            L.m(view0);
            this.N2(view0);
        });
        this.findViewById(0x7F0B0088).setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            L.m(view0);
            this.N2(view0);
        });
        this.findViewById(0x7F0B0300).setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            this.T2();
        });
        this.findViewById(0x7F0B02FF).setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            L.m(view0);
            this.U2(view0);
        });
        this.findViewById(0x7F0B075D).setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            this.Y2();
        });
        this.findViewById(0x7F0B1037).setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            this.Y2();
        });
        this.findViewById(0x7F0B1034).setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            this.X2();
        });
        this.findViewById(0x7F0B1000).setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            this.q2();
        });
        this.findViewById(0x7F0B0FFA).setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            this.a3();
        });
    }

    @Override  // com.dcinside.app.base.g
    protected void onDestroy() {
        UserView userView0 = this.x;
        if(userView0 == null) {
            L.S("vwUser");
            userView0 = null;
        }
        userView0.release();
        RecentMenuView recentMenuView0 = this.y;
        if(recentMenuView0 == null) {
            L.S("vwRecentMenu");
            recentMenuView0 = null;
        }
        recentMenuView0.release();
        FavoriteMenuView favoriteMenuView0 = this.z;
        if(favoriteMenuView0 == null) {
            L.S("vwFavoriteMenu");
            favoriteMenuView0 = null;
        }
        favoriteMenuView0.release();
        super.onDestroy();
        this.w = null;
    }

    @Override  // com.dcinside.app.base.d
    protected void onResume() {
        super.onResume();
        UserView userView0 = this.x;
        if(userView0 == null) {
            L.S("vwUser");
            userView0 = null;
        }
        userView0.s();
    }

    private final void p2() {
        if(com.dcinside.app.main.login.g.a.p()) {
            com.dcinside.app.base.d.y1(this, 0, null, null, 0, false, 0x1F, null);
            return;
        }
        this.startActivity(LoginActivity.x.b(this, false));
    }

    private final void q2() {
        DrawerLayout drawerLayout0 = this.w;
        if(drawerLayout0 != null && drawerLayout0.E(0x800003)) {
            drawerLayout0.d(0x800003);
        }
    }

    // 检测为 Lambda 实现
    private static final void r2(u0 u00, View view0) [...]

    // 检测为 Lambda 实现
    private static final void s2(u0 u00, View view0) [...]

    // 检测为 Lambda 实现
    private static final void t2(u0 u00, View view0) [...]

    // 检测为 Lambda 实现
    private static final void u2(u0 u00, View view0) [...]

    // 检测为 Lambda 实现
    private static final void v2(u0 u00, View view0) [...]

    // 检测为 Lambda 实现
    private static final void w2(u0 u00, View view0) [...]

    // 检测为 Lambda 实现
    private static final void x2(u0 u00, View view0) [...]

    // 检测为 Lambda 实现
    private static final void y2(u0 u00, View view0) [...]

    // 检测为 Lambda 实现
    private static final void z2(u0 u00, View view0) [...]
}

