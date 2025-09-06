package com.dcinside.app.write.menu.setting;

import Y.U;
import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.Editable.Factory;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.dcinside.app.base.d;
import com.dcinside.app.http.p;
import com.dcinside.app.model.P;
import com.dcinside.app.model.f0;
import com.dcinside.app.perform.e;
import com.dcinside.app.response.GalleryInfo;
import com.dcinside.app.util.Bk;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.Nk;
import com.dcinside.app.util.cl;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.uk;
import com.dcinside.app.util.vk;
import com.dcinside.app.util.yk;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.ranges.s;
import rx.o;
import rx.schedulers.c;
import y4.l;
import y4.m;

@s0({"SMAP\nPostPollSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostPollSettingActivity.kt\ncom/dcinside/app/write/menu/setting/PostPollSettingActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,735:1\n1557#2:736\n1628#2,3:737\n1557#2:740\n1628#2,3:741\n774#2:744\n865#2,2:745\n1755#2,3:747\n774#2:754\n865#2,2:755\n37#3,2:750\n37#3,2:752\n37#3,2:757\n37#3,2:759\n*S KotlinDebug\n*F\n+ 1 PostPollSettingActivity.kt\ncom/dcinside/app/write/menu/setting/PostPollSettingActivity\n*L\n189#1:736\n189#1:737,3\n262#1:740\n262#1:741,3\n406#1:744\n406#1:745,2\n410#1:747,3\n639#1:754\n639#1:755,2\n457#1:750,2\n458#1:752,2\n662#1:757,2\n663#1:759,2\n*E\n"})
public final class PostPollSettingActivity extends d implements PermissionListener {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final void a(@l AppCompatActivity appCompatActivity0, @m GalleryInfo galleryInfo0) {
            L.p(appCompatActivity0, "activity");
            Intent intent0 = new Intent(appCompatActivity0, PostPollSettingActivity.class);
            intent0.putExtra("com.dcinside.app.extra.GALLERY_INFO", galleryInfo0);
            appCompatActivity0.startActivityForResult(intent0, 1043);
        }

        public final void b(@l AppCompatActivity appCompatActivity0, @m GalleryInfo galleryInfo0, @m String s, boolean z) {
            L.p(appCompatActivity0, "activity");
            Intent intent0 = new Intent(appCompatActivity0, PostPollSettingActivity.class);
            intent0.putExtra("com.dcinside.app.extra.GALLERY_INFO", galleryInfo0);
            intent0.putExtra("com.dcinside.app.EXTRA_POLL_SETTING_DATA", s);
            intent0.putExtra("com.dcinside.app.EXTRA_POST_MODIFY", z);
            appCompatActivity0.startActivityForResult(intent0, 1043);
        }
    }

    @m
    private DatePickerDialog A;
    @m
    private o B;
    @m
    private o C;
    @m
    private p D;
    private boolean E;
    @m
    private P F;
    @l
    public static final a G = null;
    @l
    public static final String H = "com.dcinside.app.EXTRA_POLL_SETTING_DATA";
    @l
    public static final String I = "com.dcinside.app.EXTRA_POST_MODIFY";
    private U u;
    @l
    private final j v;
    @l
    private com.dcinside.app.write.menu.setting.a w;
    @l
    private final k x;
    @m
    private GalleryInfo y;
    private int z;

    static {
        PostPollSettingActivity.G = new a(null);
    }

    public PostPollSettingActivity() {
        public static final class j extends OnBackPressedCallback {
            final PostPollSettingActivity d;

            j(PostPollSettingActivity postPollSettingActivity0) {
                this.d = postPollSettingActivity0;
                super(true);
            }

            @Override  // androidx.activity.OnBackPressedCallback
            public void g() {
                this.d.q2();
            }
        }

        this.v = new j(this);
        this.w = com.dcinside.app.write.menu.setting.a.c;
        this.x = new k();
        this.z = -1;
    }

    private final P A2() {
        U u0 = this.u;
        U u1 = null;
        if(u0 == null) {
            L.S("binding");
            u0 = null;
        }
        String s = String.valueOf(u0.J.getText());
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.x.w()) {
            String s1 = ((b)object0).f();
            if(s1 != null && s1.length() != 0) {
                arrayList0.add(object0);
            }
        }
        U u2 = this.u;
        if(u2 == null) {
            L.S("binding");
            u2 = null;
        }
        String s2 = u2.f.getText().toString();
        U u3 = this.u;
        if(u3 == null) {
            L.S("binding");
            u3 = null;
        }
        Object object1 = u3.m.getSelectedItem();
        U u4 = this.u;
        if(u4 == null) {
            L.S("binding");
            u4 = null;
        }
        String s3 = this.getString(0x7F1507AE, new Object[]{s2, object1, u4.n.getSelectedItem()});  // string:post_auto_del_date_merge "%1$s %2$s:%3$s"
        L.o(s3, "getString(...)");
        U u5 = this.u;
        if(u5 == null) {
            L.S("binding");
            u5 = null;
        }
        boolean z = u5.i.isChecked();
        ArrayList arrayList1 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for(Object object2: arrayList0) {
            String s4 = ((b)object2).f();
            if(s4 == null) {
                s4 = "";
            }
            arrayList1.add(s4);
            arrayList2.add(((b)object2).e());
        }
        U u6 = this.u;
        if(u6 == null) {
            L.S("binding");
            u6 = null;
        }
        int v = u6.u.getSelectedItemPosition();
        P p0 = new P(null, null, null, false, null, false, null, null, null, null, null, 0x7FF, null);
        p0.o((this.y == null ? null : this.y.r()));
        p0.v(s);
        if(!z) {
            s3 = null;
        }
        p0.n(s3);
        p0.t(((String[])arrayList1.toArray(new String[0])));
        p0.s(((String[])arrayList2.toArray(new String[0])));
        p0.q(this.w.d());
        U u7 = this.u;
        if(u7 == null) {
            L.S("binding");
            u7 = null;
        }
        p0.l(u7.y.isChecked());
        p0.p(((int)(v + 2)));
        U u8 = this.u;
        if(u8 == null) {
            L.S("binding");
        }
        else {
            u1 = u8;
        }
        p0.m(u1.G.isChecked());
        return p0;
    }

    private final void B2(P p0) {
        static final class f extends N implements Function1 {
            final P e;
            final PostPollSettingActivity f;

            f(P p0, PostPollSettingActivity postPollSettingActivity0) {
                this.e = p0;
                this.f = postPollSettingActivity0;
                super(1);
            }

            public final void a(f0 f00) {
                if(f00.f()) {
                    String s = f00.a();
                    if(s != null && s.length() > 0) {
                        this.e.r(f00.a());
                        Intent intent0 = new Intent();
                        intent0.putExtra("com.dcinside.app.EXTRA_POLL_SETTING_DATA", uk.a.D(this.e));
                        this.f.setResult(-1, intent0);
                        this.f.finish();
                        return;
                    }
                }
                Dl.G(this.f, f00.a());
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((f0)object0));
                return S0.a;
            }
        }

        o o0 = this.C;
        if(o0 != null) {
            o0.l();
        }
        this.C = uk.ZF(p0).A5(c.e()).M3(rx.android.schedulers.a.c()).R1(() -> {
            L.p(this, "this$0");
            if(this.q1()) {
                U u0 = this.u;
                if(u0 == null) {
                    L.S("binding");
                    u0 = null;
                }
                u0.e.setVisibility(0);
            }
        }).T1(() -> {
            L.p(this, "this$0");
            if(this.q1()) {
                U u0 = this.u;
                if(u0 == null) {
                    L.S("binding");
                    u0 = null;
                }
                u0.e.setVisibility(8);
            }
        }).y5((Object object0) -> {
            L.p(new f(p0, this), "$tmp0");
            new f(p0, this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            timber.log.b.a.e(throwable0);
            Dl.D(this, 0x7F1502AC);  // string:error_error_in_process "처리 중 오류가 발생했습니다."
        });
    }

    // 检测为 Lambda 实现
    private static final void C2(PostPollSettingActivity postPollSettingActivity0) [...]

    // 检测为 Lambda 实现
    private static final void D2(PostPollSettingActivity postPollSettingActivity0) [...]

    // 检测为 Lambda 实现
    private static final void E2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void F2(PostPollSettingActivity postPollSettingActivity0, Throwable throwable0) [...]

    private final void G2(int v) {
        static final class g extends N implements Function1 {
            final int e;

            g(int v) {
                this.e = v;
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                return p$a0.m(this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class h extends N implements Function1 {
            public static final h e;

            static {
                h.e = new h();
            }

            h() {
                super(1);
            }

            public final Boolean a(Boolean boolean0) {
                return boolean0;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Boolean)object0));
            }
        }


        static final class i extends N implements Function1 {
            public static final i e;

            static {
                i.e = new i();
            }

            i() {
                super(1);
            }

            public final void a(Boolean boolean0) {
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return S0.a;
            }
        }

        e.e.a(this).n(new g(v)).z(0x7F150925).b().Z1((Object object0) -> {
            L.p(h.e, "$tmp0");
            return (Boolean)h.e.invoke(object0);
        }).x5((Object object0) -> {
            L.p(i.e, "$tmp0");
            i.e.invoke(object0);
        });
    }

    // 检测为 Lambda 实现
    private static final Boolean H2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void I2(Function1 function10, Object object0) [...]

    private final void J2() {
        this.x.v();
        this.t2();
    }

    private final void K2() {
        U u0 = this.u;
        if(u0 == null) {
            L.S("binding");
            u0 = null;
        }
        String s = this.getString(this.w.c());
        u0.D.setText(s);
    }

    private final void L2() {
        U u0 = this.u;
        if(u0 == null) {
            L.S("binding");
            u0 = null;
        }
        AppCompatSpinner appCompatSpinner0 = u0.u;
        Iterable iterable0 = u.V5(new kotlin.ranges.l(2, this.x.getItemCount()));
        ArrayList arrayList0 = new ArrayList(u.b0(iterable0, 10));
        for(Object object0: iterable0) {
            arrayList0.add(this.getString(0x7F15079A, new Object[]{((Number)object0).intValue()}));  // string:poll_item_count_text "%d개"
        }
        appCompatSpinner0.setAdapter(new ArrayAdapter(this, 0x7F0E0286, arrayList0));  // layout:view_spinner_item_center
    }

    private final void M2() {
        this.F = this.A2();
    }

    private final void N2() {
        U u0 = this.u;
        if(u0 == null) {
            L.S("binding");
            u0 = null;
        }
        Date date0 = Bk.f(u0.f.getText().toString());
        long v = date0 == null ? System.currentTimeMillis() : date0.getTime();
        Calendar calendar0 = Calendar.getInstance();
        calendar0.setTimeInMillis(v);
        int v1 = calendar0.get(1);
        int v2 = calendar0.get(2);
        int v3 = calendar0.get(5);
        q q0 = (DatePicker datePicker0, int v, int v1, int v2) -> {
            L.p(this, "this$0");
            calendar0.set(v, v1, v2);
            U u0 = this.u;
            if(u0 == null) {
                L.S("binding");
                u0 = null;
            }
            String s = Bk.F(calendar0.getTimeInMillis());
            u0.f.setText(s);
        };
        DatePickerDialog datePickerDialog0 = this.A;
        if(datePickerDialog0 != null) {
            L.m(datePickerDialog0);
            if(datePickerDialog0.isShowing()) {
                DatePickerDialog datePickerDialog1 = this.A;
                L.m(datePickerDialog1);
                datePickerDialog1.cancel();
            }
            this.A = null;
        }
        DatePickerDialog datePickerDialog2 = new DatePickerDialog(this, dl.a.q2().h(), q0, v1, v2, v3);
        this.A = datePickerDialog2;
        DatePicker datePicker0 = datePickerDialog2.getDatePicker();
        if(datePicker0 != null) {
            try {
                Calendar calendar1 = Calendar.getInstance();
                calendar1.add(12, 10);
                datePicker0.setMinDate(calendar1.getTimeInMillis());
                calendar1.add(1, 3);
                datePicker0.setMaxDate(calendar1.getTimeInMillis());
            }
            catch(Exception unused_ex) {
            }
        }
        DatePickerDialog datePickerDialog3 = this.A;
        if(datePickerDialog3 != null) {
            datePickerDialog3.show();
        }
    }

    // 检测为 Lambda 实现
    private static final void O2(Calendar calendar0, PostPollSettingActivity postPollSettingActivity0, DatePicker datePicker0, int v, int v1, int v2) [...]

    private final void P2() {
        @s0({"SMAP\nPostPollSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostPollSettingActivity.kt\ncom/dcinside/app/write/menu/setting/PostPollSettingActivity$selectPermission$1\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,735:1\n37#2,2:736\n*S KotlinDebug\n*F\n+ 1 PostPollSettingActivity.kt\ncom/dcinside/app/write/menu/setting/PostPollSettingActivity$selectPermission$1\n*L\n328#1:736,2\n*E\n"})
        static final class com.dcinside.app.write.menu.setting.PostPollSettingActivity.k extends N implements Function1 {
            final GalleryInfo e;
            final PostPollSettingActivity f;

            com.dcinside.app.write.menu.setting.PostPollSettingActivity.k(GalleryInfo galleryInfo0, PostPollSettingActivity postPollSettingActivity0) {
                this.e = galleryInfo0;
                this.f = postPollSettingActivity0;
                super(1);
            }

            @m
            public final Object b(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                ArrayList arrayList0 = new ArrayList();
                if(!this.e.f0()) {
                    arrayList0.add("모두");
                    arrayList0.add("고정닉만");
                    if(this.e.J()) {
                        arrayList0.add("멤버만");
                    }
                }
                p$a0.l(((CharSequence[])arrayList0.toArray(new CharSequence[0])), (DialogInterface dialogInterface0, int v) -> {
                    com.dcinside.app.write.menu.setting.a a0;
                    L.p(this.f, "this$0");
                    switch(v) {
                        case 0: {
                            a0 = com.dcinside.app.write.menu.setting.a.c;
                            break;
                        }
                        case 1: {
                            a0 = com.dcinside.app.write.menu.setting.a.d;
                            break;
                        }
                        case 2: {
                            a0 = com.dcinside.app.write.menu.setting.a.e;
                            break;
                        }
                        default: {
                            a0 = com.dcinside.app.write.menu.setting.a.c;
                        }
                    }
                    this.f.S2(a0);
                });
                return p$a0;
            }

            // 检测为 Lambda 实现
            private static final void c(PostPollSettingActivity postPollSettingActivity0, DialogInterface dialogInterface0, int v) [...]

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.b(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class com.dcinside.app.write.menu.setting.PostPollSettingActivity.l extends N implements Function1 {
            public static final com.dcinside.app.write.menu.setting.PostPollSettingActivity.l e;

            static {
                com.dcinside.app.write.menu.setting.PostPollSettingActivity.l.e = new com.dcinside.app.write.menu.setting.PostPollSettingActivity.l();
            }

            com.dcinside.app.write.menu.setting.PostPollSettingActivity.l() {
                super(1);
            }

            public final void a(Boolean boolean0) {
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return S0.a;
            }
        }

        GalleryInfo galleryInfo0 = this.y;
        if(galleryInfo0 == null) {
            return;
        }
        e.e.a(this).n(new com.dcinside.app.write.menu.setting.PostPollSettingActivity.k(galleryInfo0, this)).b().x5((Object object0) -> {
            L.p(com.dcinside.app.write.menu.setting.PostPollSettingActivity.l.e, "$tmp0");
            com.dcinside.app.write.menu.setting.PostPollSettingActivity.l.e.invoke(object0);
        });
    }

    // 检测为 Lambda 实现
    private static final void Q2(Function1 function10, Object object0) [...]

    public final void R2(int v) {
        this.z = v;
        if(cl.i(this, this)) {
            return;
        }
        long v1 = this.y == null ? 0L : this.y.D();
        com.dcinside.app.album.h.c(this).b(v1).f(1).e("이미지를 선택해주세요.").c(1010).a();
    }

    private final void S2(com.dcinside.app.write.menu.setting.a a0) {
        this.w = a0;
        this.K2();
    }

    private final void a2(P p0) {
        static final class com.dcinside.app.write.menu.setting.PostPollSettingActivity.b extends N implements Function1 {
            final P e;
            final PostPollSettingActivity f;

            com.dcinside.app.write.menu.setting.PostPollSettingActivity.b(P p0, PostPollSettingActivity postPollSettingActivity0) {
                this.e = p0;
                this.f = postPollSettingActivity0;
                super(1);
            }

            public final void a(f0 f00) {
                if(f00.f()) {
                    String s = f00.a();
                    if(s != null && s.length() > 0) {
                        this.e.r(f00.a());
                        Intent intent0 = new Intent();
                        intent0.putExtra("com.dcinside.app.EXTRA_POLL_SETTING_DATA", uk.a.D(this.e));
                        this.f.setResult(-1, intent0);
                        this.f.finish();
                        return;
                    }
                }
                Dl.G(this.f, f00.a());
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((f0)object0));
                return S0.a;
            }
        }

        o o0 = this.B;
        if(o0 != null) {
            o0.l();
        }
        this.B = uk.YG(p0).A5(c.e()).M3(rx.android.schedulers.a.c()).R1(() -> {
            L.p(this, "this$0");
            if(this.q1()) {
                U u0 = this.u;
                if(u0 == null) {
                    L.S("binding");
                    u0 = null;
                }
                u0.e.setVisibility(0);
            }
        }).T1(() -> {
            L.p(this, "this$0");
            if(this.q1()) {
                U u0 = this.u;
                if(u0 == null) {
                    L.S("binding");
                    u0 = null;
                }
                u0.e.setVisibility(8);
            }
        }).y5((Object object0) -> {
            L.p(new com.dcinside.app.write.menu.setting.PostPollSettingActivity.b(p0, this), "$tmp0");
            new com.dcinside.app.write.menu.setting.PostPollSettingActivity.b(p0, this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            timber.log.b.a.e(throwable0);
            if(throwable0 instanceof com.dcinside.app.http.f) {
                String s = throwable0.getMessage();
                if(s == null) {
                    s = "처리 중 오류가 발생했습니다.";
                    L.o("처리 중 오류가 발생했습니다.", "getString(...)");
                }
                com.dcinside.app.internal.c.w(this, s);
                return;
            }
            Dl.D(this, 0x7F1502AC);  // string:error_error_in_process "처리 중 오류가 발생했습니다."
        });
    }

    // 检测为 Lambda 实现
    private static final void b2(PostPollSettingActivity postPollSettingActivity0) [...]

    // 检测为 Lambda 实现
    private static final void c2(PostPollSettingActivity postPollSettingActivity0) [...]

    // 检测为 Lambda 实现
    private static final void d2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void e2(PostPollSettingActivity postPollSettingActivity0, Throwable throwable0) [...]

    private final void f2() {
        U u0 = this.u;
        U u1 = null;
        if(u0 == null) {
            L.S("binding");
            u0 = null;
        }
        com.dcinside.app.write.menu.setting.w w0 = (View view0) -> {
            L.p(this, "this$0");
            Nk.a.a(this);
            this.N2();
        };
        u0.f.setOnClickListener(w0);
        U u2 = this.u;
        if(u2 == null) {
            L.S("binding");
            u2 = null;
        }
        x x0 = (View view0) -> {
            L.p(this, "this$0");
            this.J2();
        };
        u2.o.setOnClickListener(x0);
        U u3 = this.u;
        if(u3 == null) {
            L.S("binding");
            u3 = null;
        }
        y y0 = (View view0) -> {
            L.p(this, "this$0");
            Nk.a.a(this);
            this.P2();
        };
        u3.B.setOnClickListener(y0);
        U u4 = this.u;
        if(u4 == null) {
            L.S("binding");
            u4 = null;
        }
        z z0 = (CompoundButton compoundButton0, boolean z) -> {
            L.p(this, "this$0");
            Nk.a.a(this);
            U u0 = this.u;
            if(u0 == null) {
                L.S("binding");
                u0 = null;
            }
            u0.x.setVisibility((z ? 0 : 8));
        };
        u4.y.setOnCheckedChangeListener(z0);
        U u5 = this.u;
        if(u5 == null) {
            L.S("binding");
        }
        else {
            u1 = u5;
        }
        A a0 = (CompoundButton compoundButton0, boolean z) -> {
            L.p(this, "this$0");
            Nk.a.a(this);
            U u0 = null;
            if(z) {
                U u1 = this.u;
                if(u1 == null) {
                    L.S("binding");
                    u1 = null;
                }
                u1.j.setVisibility(0);
                U u2 = this.u;
                if(u2 == null) {
                    L.S("binding");
                }
                else {
                    u0 = u2;
                }
                u0.g.setVisibility(8);
                return;
            }
            U u3 = this.u;
            if(u3 == null) {
                L.S("binding");
                u3 = null;
            }
            u3.j.setVisibility(8);
            U u4 = this.u;
            if(u4 == null) {
                L.S("binding");
            }
            else {
                u0 = u4;
            }
            u0.g.setVisibility(0);
        };
        u1.i.setOnCheckedChangeListener(a0);
    }

    // 检测为 Lambda 实现
    private static final void g2(PostPollSettingActivity postPollSettingActivity0, CompoundButton compoundButton0, boolean z) [...]

    // 检测为 Lambda 实现
    private static final void h2(PostPollSettingActivity postPollSettingActivity0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void i2(PostPollSettingActivity postPollSettingActivity0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void j2(PostPollSettingActivity postPollSettingActivity0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void k2(PostPollSettingActivity postPollSettingActivity0, CompoundButton compoundButton0, boolean z) [...]

    private final void l2() {
        String s = this.getIntent().getStringExtra("com.dcinside.app.EXTRA_POLL_SETTING_DATA");
        if(s == null) {
            return;
        }
        P p0 = (P)uk.a.r(s, P.class);
        U u0 = this.u;
        String s1 = null;
        if(u0 == null) {
            L.S("binding");
            u0 = null;
        }
        String s2 = u0.f.getText().toString();
        U u1 = this.u;
        if(u1 == null) {
            L.S("binding");
            u1 = null;
        }
        Object object0 = u1.m.getSelectedItem();
        U u2 = this.u;
        if(u2 == null) {
            L.S("binding");
            u2 = null;
        }
        String s3 = this.getString(0x7F1507AE, new Object[]{s2, object0, u2.n.getSelectedItem()});  // string:post_auto_del_date_merge "%1$s %2$s:%3$s"
        L.o(s3, "getString(...)");
        U u3 = this.u;
        if(u3 == null) {
            L.S("binding");
            u3 = null;
        }
        boolean z = u3.i.isChecked();
        Date date0 = Bk.h(s3);
        long v = date0 == null ? 0L : date0.getTime();
        if(z && v < System.currentTimeMillis()) {
            this.G2(0x7F1507B1);  // string:post_auto_del_time_error "현재 시간 이후로 설정해주세요."
            return;
        }
        String s4 = Bk.I(v);
        p0.o((this.y == null ? null : this.y.r()));
        if(z) {
            s1 = s4;
        }
        p0.n(s1);
        L.m(p0);
        this.B2(p0);
    }

    private final void m2() {
        U u0 = null;
        GalleryInfo galleryInfo0 = this.y;
        if(galleryInfo0 == null) {
            return;
        }
        if(galleryInfo0.f0()) {
            U u1 = this.u;
            if(u1 == null) {
                L.S("binding");
                u1 = null;
            }
            u1.B.setEnabled(false);
            U u2 = this.u;
            if(u2 == null) {
                L.S("binding");
                u2 = null;
            }
            u2.C.setVisibility(8);
            this.S2((galleryInfo0.J() ? com.dcinside.app.write.menu.setting.a.e : com.dcinside.app.write.menu.setting.a.d));
            U u3 = this.u;
            if(u3 == null) {
                L.S("binding");
                u3 = null;
            }
            u3.B.setBackground(null);
            return;
        }
        U u4 = this.u;
        if(u4 == null) {
            L.S("binding");
            u4 = null;
        }
        u4.B.setEnabled(true);
        U u5 = this.u;
        if(u5 == null) {
            L.S("binding");
        }
        else {
            u0 = u5;
        }
        u0.C.setVisibility(0);
        this.S2(com.dcinside.app.write.menu.setting.a.c);
    }

    private final void n2() {
        if(this.E) {
            this.l2();
            return;
        }
        this.u2();
    }

    private final void o2() {
        U u0 = this.u;
        U u1 = null;
        if(u0 == null) {
            L.S("binding");
            u0 = null;
        }
        AppCompatSpinner appCompatSpinner0 = u0.m;
        Iterable iterable0 = u.V5(s.W1(0, 24));
        ArrayList arrayList0 = new ArrayList(u.b0(iterable0, 10));
        for(Object object0: iterable0) {
            arrayList0.add(String.valueOf(((Number)object0).intValue()));
        }
        appCompatSpinner0.setAdapter(new ArrayAdapter(this, 0x7F0E0286, arrayList0));  // layout:view_spinner_item_center
        U u2 = this.u;
        if(u2 == null) {
            L.S("binding");
        }
        else {
            u1 = u2;
        }
        String[] arr_s = this.getResources().getStringArray(0x7F030036);  // array:time_select_vote_minute
        L.o(arr_s, "getStringArray(...)");
        ArrayAdapter arrayAdapter0 = new ArrayAdapter(this, 0x7F0E0286, arr_s);  // layout:view_spinner_item_center
        u1.n.setAdapter(arrayAdapter0);
        this.L2();
    }

    @Override  // com.dcinside.app.base.d
    protected void onActivityResult(int v, int v1, @m Intent intent0) {
        if(v1 == -1 && intent0 != null && !this.s1()) {
            if(v == 1010) {
                ArrayList arrayList0 = intent0.getStringArrayListExtra("intent_path");
                if(arrayList0 == null) {
                    return;
                }
                if(arrayList0.size() > 0) {
                    int v2 = this.z;
                    Object object0 = arrayList0.get(0);
                    L.o(object0, "get(...)");
                    this.x.x(v2, ((String)object0));
                }
            }
            else {
                super.onActivityResult(v, -1, intent0);
            }
        }
    }

    @Override  // com.dcinside.app.base.d
    protected void onCreate(@m Bundle bundle0) {
        super.onCreate(bundle0);
        U u0 = U.c(this.getLayoutInflater());
        L.o(u0, "inflate(...)");
        this.u = u0;
        U u1 = null;
        if(u0 == null) {
            L.S("binding");
            u0 = null;
        }
        this.setContentView(u0.b());
        U u2 = this.u;
        if(u2 == null) {
            L.S("binding");
            u2 = null;
        }
        this.S0(u2.K);
        kr.bhbfhfb.designcompat.a.d(this);
        this.getOnBackPressedDispatcher().h(this.v);
        U u3 = this.u;
        if(u3 == null) {
            L.S("binding");
        }
        else {
            u1 = u3;
        }
        LinearLayoutManager linearLayoutManager0 = new LinearLayoutManager(u1.r.getContext());
        u1.r.setLayoutManager(linearLayoutManager0);
        u1.r.setAdapter(this.x);
        this.x.y();
        this.y = (GalleryInfo)this.getIntent().getParcelableExtra("com.dcinside.app.extra.GALLERY_INFO");
        this.y2();
        this.f2();
        this.m2();
        this.o2();
        this.w2();
        boolean z = this.getIntent().getBooleanExtra("com.dcinside.app.EXTRA_POST_MODIFY", false);
        this.E = z;
        if(z) {
            this.x2();
        }
        this.v2();
        this.M2();
    }

    @Override  // android.app.Activity
    public boolean onCreateOptionsMenu(@l Menu menu0) {
        L.p(menu0, "menu");
        this.getMenuInflater().inflate(0x7F100019, menu0);  // mipmap:ic_launcher28
        return super.onCreateOptionsMenu(menu0);
    }

    @Override  // com.dcinside.app.base.d
    protected void onDestroy() {
        super.onDestroy();
        p p0 = this.D;
        if(p0 != null) {
            p0.e();
        }
        this.D = null;
        o o0 = this.B;
        if(o0 != null) {
            o0.l();
        }
        this.B = null;
        o o1 = this.C;
        if(o1 != null) {
            o1.l();
        }
        this.C = null;
    }

    @Override  // android.app.Activity
    public boolean onOptionsItemSelected(@l MenuItem menuItem0) {
        L.p(menuItem0, "item");
        switch(menuItem0.getItemId()) {
            case 0x102002C: {
                this.q2();
                return super.onOptionsItemSelected(menuItem0);
            }
            case 0x7F0B0075: {  // id:action_write
                this.n2();
                return super.onOptionsItemSelected(menuItem0);
            }
            default: {
                return super.onOptionsItemSelected(menuItem0);
            }
        }
    }

    @Override  // com.karumi.dexter.listener.single.PermissionListener
    public void onPermissionDenied(@m PermissionDeniedResponse permissionDeniedResponse0) {
        Dl.D(this, cl.b((permissionDeniedResponse0 == null ? null : permissionDeniedResponse0.getPermissionName())));
    }

    @Override  // com.karumi.dexter.listener.single.PermissionListener
    public void onPermissionGranted(@m PermissionGrantedResponse permissionGrantedResponse0) {
        Dl.D(this, cl.c((permissionGrantedResponse0 == null ? null : permissionGrantedResponse0.getPermissionName())));
        this.R2(this.z);
    }

    @Override  // com.karumi.dexter.listener.single.PermissionListener
    public void onPermissionRationaleShouldBeShown(@l PermissionRequest permissionRequest0, @m PermissionToken permissionToken0) {
        L.p(permissionRequest0, "permission");
        if(permissionToken0 != null) {
            permissionToken0.continuePermissionRequest();
        }
    }

    private final void p2() {
        this.setResult(0);
        this.finish();
    }

    private final void q2() {
        static final class com.dcinside.app.write.menu.setting.PostPollSettingActivity.c extends N implements Function1 {
            final int e;

            com.dcinside.app.write.menu.setting.PostPollSettingActivity.c(int v) {
                this.e = v;
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                return p$a0.m(this.e);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class com.dcinside.app.write.menu.setting.PostPollSettingActivity.d extends N implements Function1 {
            public static final com.dcinside.app.write.menu.setting.PostPollSettingActivity.d e;

            static {
                com.dcinside.app.write.menu.setting.PostPollSettingActivity.d.e = new com.dcinside.app.write.menu.setting.PostPollSettingActivity.d();
            }

            com.dcinside.app.write.menu.setting.PostPollSettingActivity.d() {
                super(1);
            }

            public final Boolean a(Boolean boolean0) {
                return boolean0;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((Boolean)object0));
            }
        }


        static final class com.dcinside.app.write.menu.setting.PostPollSettingActivity.e extends N implements Function1 {
            final PostPollSettingActivity e;

            com.dcinside.app.write.menu.setting.PostPollSettingActivity.e(PostPollSettingActivity postPollSettingActivity0) {
                this.e = postPollSettingActivity0;
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

        if(this.z2()) {
            int v = this.E ? 0x7F15079B : 0x7F150794;  // string:poll_modify_cancel "투표 수정을 취소하시겠습니까?"
            e.e.a(this).n(new com.dcinside.app.write.menu.setting.PostPollSettingActivity.c(v)).z(0x7F150793).x(0x7F150792).b().Z1((Object object0) -> {
                L.p(com.dcinside.app.write.menu.setting.PostPollSettingActivity.d.e, "$tmp0");
                return (Boolean)com.dcinside.app.write.menu.setting.PostPollSettingActivity.d.e.invoke(object0);
            }).x5((Object object0) -> {
                L.p(new com.dcinside.app.write.menu.setting.PostPollSettingActivity.e(this), "$tmp0");
                new com.dcinside.app.write.menu.setting.PostPollSettingActivity.e(this).invoke(object0);
            });
            return;
        }
        this.p2();
    }

    // 检测为 Lambda 实现
    private static final Boolean r2(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void s2(Function1 function10, Object object0) [...]

    private final void t2() {
        int v = this.x.getItemCount();
        this.L2();
        U u0 = this.u;
        if(u0 == null) {
            L.S("binding");
            u0 = null;
        }
        u0.o.setVisibility((v < 20 ? 0 : 8));
    }

    private final void u2() {
        U u0 = this.u;
        U u1 = null;
        if(u0 == null) {
            L.S("binding");
            u0 = null;
        }
        String s = String.valueOf(u0.J.getText());
        if(s.length() == 0) {
            this.G2(0x7F15079E);  // string:poll_need_title "제목을 입력해 주세요."
            return;
        }
        ArrayList arrayList0 = this.x.w();
        ArrayList arrayList1 = new ArrayList();
        for(Object object0: arrayList0) {
            String s1 = ((b)object0).f();
            if(s1 != null && s1.length() != 0) {
                arrayList1.add(object0);
            }
        }
        if(!(arrayList0 instanceof Collection) || !arrayList0.isEmpty()) {
            for(Object object1: arrayList0) {
                b b0 = (b)object1;
                String s2 = b0.e();
                if(s2 != null && s2.length() > 0) {
                    String s3 = b0.f();
                    if(s3 == null || s3.length() == 0) {
                        this.G2(0x7F1507A7);  // string:poll_subject_empty "보기에 내용을 입력해 주세요."
                        return;
                    }
                    if(false) {
                        break;
                    }
                }
            }
        }
        if(arrayList1.size() < 2) {
            this.G2(0x7F15079D);  // string:poll_need_more_item "보기를 2개 이상 입력해 주세요."
            return;
        }
        U u2 = this.u;
        if(u2 == null) {
            L.S("binding");
            u2 = null;
        }
        String s4 = u2.f.getText().toString();
        U u3 = this.u;
        if(u3 == null) {
            L.S("binding");
            u3 = null;
        }
        Object object2 = u3.m.getSelectedItem();
        U u4 = this.u;
        if(u4 == null) {
            L.S("binding");
            u4 = null;
        }
        String s5 = this.getString(0x7F1507AE, new Object[]{s4, object2, u4.n.getSelectedItem()});  // string:post_auto_del_date_merge "%1$s %2$s:%3$s"
        L.o(s5, "getString(...)");
        U u5 = this.u;
        if(u5 == null) {
            L.S("binding");
            u5 = null;
        }
        boolean z = u5.i.isChecked();
        Date date0 = Bk.h(s5);
        long v = date0 == null ? 0L : date0.getTime();
        if(z && v < System.currentTimeMillis()) {
            this.G2(0x7F1507B1);  // string:post_auto_del_time_error "현재 시간 이후로 설정해주세요."
            return;
        }
        String s6 = Bk.I(v);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for(Object object3: arrayList1) {
            String s7 = ((b)object3).f();
            if(s7 == null) {
                s7 = "";
            }
            arrayList2.add(s7);
            arrayList3.add(((b)object3).e());
        }
        U u6 = this.u;
        if(u6 == null) {
            L.S("binding");
            u6 = null;
        }
        int v1 = u6.u.getSelectedItemPosition();
        if(arrayList2.size() < v1 + 2) {
            this.G2(0x7F1507A8);  // string:poll_subject_multi_count "복수 선택 개수를 확인하세요."
            return;
        }
        P p0 = new P(null, null, null, false, null, false, null, null, null, null, null, 0x7FF, null);
        p0.o((this.y == null ? null : this.y.r()));
        p0.v(s);
        if(!z) {
            s6 = null;
        }
        p0.n(s6);
        p0.t(((String[])arrayList2.toArray(new String[0])));
        p0.s(((String[])arrayList3.toArray(new String[0])));
        p0.q(this.w.d());
        U u7 = this.u;
        if(u7 == null) {
            L.S("binding");
            u7 = null;
        }
        p0.l(u7.y.isChecked());
        p0.p(((int)(v1 + 2)));
        U u8 = this.u;
        if(u8 == null) {
            L.S("binding");
        }
        else {
            u1 = u8;
        }
        p0.m(u1.G.isChecked());
        this.a2(p0);
    }

    private final void v2() {
        String s = this.getIntent().getStringExtra("com.dcinside.app.EXTRA_POLL_SETTING_DATA");
        if(s == null) {
            return;
        }
        P p0 = (P)uk.a.r(s, P.class);
        String s1 = p0.c();
        Calendar calendar0 = Calendar.getInstance();
        U u0 = null;
        if(s1 == null) {
            U u1 = this.u;
            if(u1 == null) {
                L.S("binding");
                u1 = null;
            }
            u1.i.setChecked(false);
            calendar0.add(12, 5);
        }
        else {
            Date date0 = Bk.i(s1);
            calendar0.setTimeInMillis((date0 == null ? System.currentTimeMillis() : date0.getTime()));
        }
        String s2 = Bk.F(calendar0.getTimeInMillis());
        int v = calendar0.get(11);
        int v1 = calendar0.get(12);
        U u2 = this.u;
        if(u2 == null) {
            L.S("binding");
            u2 = null;
        }
        u2.f.setText(s2);
        this.x.C(p0.i(), p0.h());
        this.t2();
        U u3 = this.u;
        if(u3 == null) {
            L.S("binding");
            u3 = null;
        }
        u3.m.setSelection(v);
        U u4 = this.u;
        if(u4 == null) {
            L.S("binding");
            u4 = null;
        }
        u4.n.setSelection(v1 / 10);
        String s3 = p0.f();
        com.dcinside.app.write.menu.setting.a a0 = com.dcinside.app.write.menu.setting.a.c;
        if(!L.g(s3, "A")) {
            com.dcinside.app.write.menu.setting.a a1 = com.dcinside.app.write.menu.setting.a.d;
            if(L.g(s3, "M")) {
                a0 = a1;
            }
            else {
                a1 = com.dcinside.app.write.menu.setting.a.e;
                if(L.g(s3, "G")) {
                    a0 = a1;
                }
            }
        }
        this.S2(a0);
        U u5 = this.u;
        if(u5 == null) {
            L.S("binding");
            u5 = null;
        }
        Integer integer0 = p0.e();
        u5.u.setSelection(Math.max((integer0 == null ? 0 : ((int)integer0)) - 2, 0));
        U u6 = this.u;
        if(u6 == null) {
            L.S("binding");
            u6 = null;
        }
        Editable.Factory editable$Factory0 = Editable.Factory.getInstance();
        u6.J.setText(editable$Factory0.newEditable((p0.k() == null ? "" : p0.k())));
        U u7 = this.u;
        if(u7 == null) {
            L.S("binding");
            u7 = null;
        }
        u7.y.setChecked(p0.a());
        U u8 = this.u;
        if(u8 == null) {
            L.S("binding");
        }
        else {
            u0 = u8;
        }
        u0.G.setChecked(p0.b());
    }

    private final void w2() {
        Calendar calendar0 = Calendar.getInstance();
        calendar0.add(6, 1);
        calendar0.add(12, 5);
        String s = Bk.F(calendar0.getTimeInMillis());
        U u0 = this.u;
        U u1 = null;
        if(u0 == null) {
            L.S("binding");
            u0 = null;
        }
        u0.f.setText(s);
        int v = calendar0.get(11);
        int v1 = calendar0.get(12);
        U u2 = this.u;
        if(u2 == null) {
            L.S("binding");
            u2 = null;
        }
        u2.m.setSelection(v);
        U u3 = this.u;
        if(u3 == null) {
            L.S("binding");
        }
        else {
            u1 = u3;
        }
        u1.n.setSelection(v1 / 10);
    }

    private final void x2() {
        this.setTitle(0x7F150680);  // string:modify_poll_title "투표 수정하기"
        U u0 = this.u;
        U u1 = null;
        if(u0 == null) {
            L.S("binding");
            u0 = null;
        }
        u0.l.setVisibility(0);
        U u2 = this.u;
        if(u2 == null) {
            L.S("binding");
            u2 = null;
        }
        u2.t.setVisibility(0);
        U u3 = this.u;
        if(u3 == null) {
            L.S("binding");
            u3 = null;
        }
        u3.J.setVisibility(8);
        U u4 = this.u;
        if(u4 == null) {
            L.S("binding");
            u4 = null;
        }
        u4.s.setVisibility(8);
        U u5 = this.u;
        if(u5 == null) {
            L.S("binding");
            u5 = null;
        }
        u5.A.setVisibility(8);
        U u6 = this.u;
        if(u6 == null) {
            L.S("binding");
            u6 = null;
        }
        u6.I.setVisibility(8);
        U u7 = this.u;
        if(u7 == null) {
            L.S("binding");
        }
        else {
            u1 = u7;
        }
        u1.F.setVisibility(8);
        this.v2();
    }

    private final void y2() {
        int v = vk.b(this, 0x7F0406F6);  // attr:windowBackgroundInverse
        int v1 = yk.e.a(v).a(0.8f).f();
        ColorStateList colorStateList0 = new ColorStateList(new int[][]{new int[0]}, new int[]{v1});
        U u0 = this.u;
        if(u0 == null) {
            L.S("binding");
            u0 = null;
        }
        vk.q(colorStateList0, new View[]{u0.s});
    }

    private final boolean z2() {
        return !L.g(this.F, this.A2());
    }
}

