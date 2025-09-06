package com.dcinside.app.dccon.setting.tag;

import Y.l0;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.activity.OnBackPressedCallback;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.dcinside.app.base.d;
import com.dcinside.app.model.p;
import com.dcinside.app.read.E;
import com.dcinside.app.read.G;
import com.dcinside.app.util.Nk;
import java.util.List;
import java.util.NoSuchElementException;
import k0.c;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import rx.g;
import rx.o;
import y4.l;
import y4.m;

@s0({"SMAP\nDcconTagSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DcconTagSettingActivity.kt\ncom/dcinside/app/dccon/setting/tag/DcconTagSettingActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,87:1\n230#2,2:88\n*S KotlinDebug\n*F\n+ 1 DcconTagSettingActivity.kt\ncom/dcinside/app/dccon/setting/tag/DcconTagSettingActivity\n*L\n71#1:88,2\n*E\n"})
public final class DcconTagSettingActivity extends d {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @l
    public static final String A = "com.dcinside.app.dccon.setting.tag.DcconTagSettingActivity.EXTRA_DCCON_PACKAGE_NAME";
    @l
    public static final String B = "com.dcinside.app.dccon.setting.tag.DcconTagSettingActivity.EXTRA_DCCON_PACKAGE_IDX";
    private l0 u;
    @l
    private final c v;
    @m
    private o w;
    @l
    private e x;
    @l
    private final b y;
    @l
    public static final a z;

    static {
        DcconTagSettingActivity.z = new a(null);
    }

    public DcconTagSettingActivity() {
        public static final class b extends OnBackPressedCallback {
            final DcconTagSettingActivity d;

            b(DcconTagSettingActivity dcconTagSettingActivity0) {
                this.d = dcconTagSettingActivity0;
                super(true);
            }

            @Override  // androidx.activity.OnBackPressedCallback
            public void g() {
                Nk.a.a(this.d);
                this.d.finish();
            }
        }

        this.v = new c(() -> G.c());
        this.x = new e();
        this.y = new b(this);
    }

    // 检测为 Lambda 实现
    private static final g I1() [...]

    private final void J1(E e0) {
        int v = this.getIntent().getIntExtra("com.dcinside.app.dccon.setting.tag.DcconTagSettingActivity.EXTRA_DCCON_PACKAGE_IDX", 0);
        for(Object object0: e0.c()) {
            List list0 = (List)object0;
            p p0 = (p)u.G2(list0);
            if(p0 != null && p0.s() == v) {
                this.x.x(list0);
                return;
            }
            if(false) {
                break;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    // 检测为 Lambda 实现
    private static final void K1(Function1 function10, Object object0) [...]

    @Override  // com.dcinside.app.base.d
    protected void onCreate(@m Bundle bundle0) {
        static final class com.dcinside.app.dccon.setting.tag.DcconTagSettingActivity.c extends N implements Function1 {
            final DcconTagSettingActivity e;

            com.dcinside.app.dccon.setting.tag.DcconTagSettingActivity.c(DcconTagSettingActivity dcconTagSettingActivity0) {
                this.e = dcconTagSettingActivity0;
                super(1);
            }

            public final void a(k0.d d0) {
                l0 l00 = this.e.u;
                if(l00 == null) {
                    L.S("binding");
                    l00 = null;
                }
                l00.e.e(d0);
                if(d0.d() == 8) {
                    Object object0 = d0.b();
                    L.o(object0, "getData(...)");
                    this.e.J1(((E)object0));
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((k0.d)object0));
                return S0.a;
            }
        }

        super.onCreate(bundle0);
        l0 l00 = l0.c(this.getLayoutInflater());
        L.o(l00, "inflate(...)");
        this.u = l00;
        l0 l01 = null;
        if(l00 == null) {
            L.S("binding");
            l00 = null;
        }
        this.setContentView(l00.b());
        this.getOnBackPressedDispatcher().h(this.y);
        l0 l02 = this.u;
        if(l02 == null) {
            L.S("binding");
            l02 = null;
        }
        this.S0(l02.g);
        kr.bhbfhfb.designcompat.a.d(this);
        this.setTitle("");
        String s = this.getIntent().getStringExtra("com.dcinside.app.dccon.setting.tag.DcconTagSettingActivity.EXTRA_DCCON_PACKAGE_NAME");
        l0 l03 = this.u;
        if(l03 == null) {
            L.S("binding");
            l03 = null;
        }
        String s1 = this.getString(0x7F15024D, new Object[]{s});  // string:dccon_tag_title_prefix "%1$s "
        l03.d.setText(s1);
        l0 l04 = this.u;
        if(l04 == null) {
            L.S("binding");
            l04 = null;
        }
        l04.c.setAdapter(this.x);
        l0 l05 = this.u;
        if(l05 == null) {
            L.S("binding");
        }
        else {
            l01 = l05;
        }
        LinearLayoutManager linearLayoutManager0 = new LinearLayoutManager(this);
        l01.c.setLayoutManager(linearLayoutManager0);
        this.w = this.v.f().x5((Object object0) -> {
            L.p(new com.dcinside.app.dccon.setting.tag.DcconTagSettingActivity.c(this), "$tmp0");
            new com.dcinside.app.dccon.setting.tag.DcconTagSettingActivity.c(this).invoke(object0);
        });
    }

    @Override  // com.dcinside.app.base.d
    protected void onDestroy() {
        super.onDestroy();
        o o0 = this.w;
        if(o0 != null) {
            o0.l();
        }
        this.w = null;
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
}

