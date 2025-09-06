package com.dcinside.app.write.menu.setting;

import A3.p;
import Y.i;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatSpinner;
import com.dcinside.app.base.d;
import com.dcinside.app.internal.r;
import com.dcinside.app.perform.e;
import com.dcinside.app.util.Bk;
import com.dcinside.app.util.dl;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import kotlin.S0;
import kotlin.collections.u;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.ranges.s;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nPostAutoDeleteActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostAutoDeleteActivity.kt\ncom/dcinside/app/write/menu/setting/PostAutoDeleteActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,202:1\n1557#2:203\n1628#2,3:204\n*S KotlinDebug\n*F\n+ 1 PostAutoDeleteActivity.kt\ncom/dcinside/app/write/menu/setting/PostAutoDeleteActivity\n*L\n45#1:203\n45#1:204,3\n*E\n"})
public final class PostAutoDeleteActivity extends d {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final void a(@l AppCompatActivity appCompatActivity0, @m String s) {
            L.p(appCompatActivity0, "activity");
            Intent intent0 = new Intent(appCompatActivity0, PostAutoDeleteActivity.class);
            intent0.putExtra("com.dcinside.app.EXTRA_REMOVE_DATE", s);
            appCompatActivity0.startActivityForResult(intent0, 1042);
        }
    }

    private i u;
    @m
    private DatePickerDialog v;
    @l
    public static final a w = null;
    @l
    public static final String x = "com.dcinside.app.EXTRA_REMOVE_DATE";
    @l
    public static final String y = "com.dcinside.app.EXTRA_CLEAR_DATE";

    static {
        PostAutoDeleteActivity.w = new a(null);
    }

    private final void M1() {
        i i0 = this.u;
        i i1 = null;
        if(i0 == null) {
            L.S("binding");
            i0 = null;
        }
        String s = i0.f.getText().toString();
        i i2 = this.u;
        if(i2 == null) {
            L.S("binding");
            i2 = null;
        }
        Object object0 = i2.i.getSelectedItem();
        i i3 = this.u;
        if(i3 == null) {
            L.S("binding");
        }
        else {
            i1 = i3;
        }
        String s1 = this.getString(0x7F1507AE, new Object[]{s, object0, i1.j.getSelectedItem()});  // string:post_auto_del_date_merge "%1$s %2$s:%3$s"
        L.o(s1, "getString(...)");
        Date date0 = Bk.i(s1);
        if((date0 == null ? System.currentTimeMillis() : date0.getTime()) < System.currentTimeMillis()) {
            this.P1(0x7F1507B1);  // string:post_auto_del_time_error "현재 시간 이후로 설정해주세요."
            return;
        }
        Intent intent0 = new Intent();
        intent0.putExtra("com.dcinside.app.EXTRA_REMOVE_DATE", s1);
        this.setResult(-1, intent0);
        this.finish();
    }

    private final void N1() {
        Intent intent0 = new Intent();
        intent0.putExtra("com.dcinside.app.EXTRA_CLEAR_DATE", true);
        this.setResult(-1, intent0);
        this.finish();
    }

    private final void O1() {
        String s = this.getIntent().getStringExtra("com.dcinside.app.EXTRA_REMOVE_DATE");
        Calendar calendar0 = Calendar.getInstance();
        i i0 = null;
        if(s == null) {
            calendar0.add(12, 5);
        }
        else {
            Date date0 = Bk.i(s);
            calendar0.setTimeInMillis((date0 == null ? System.currentTimeMillis() : date0.getTime()));
            i i1 = this.u;
            if(i1 == null) {
                L.S("binding");
                i1 = null;
            }
            i1.b.setVisibility(0);
        }
        String s1 = Bk.G(calendar0.getTimeInMillis());
        i i2 = this.u;
        if(i2 == null) {
            L.S("binding");
            i2 = null;
        }
        i2.f.setText(s1);
        int v = calendar0.get(11);
        int v1 = calendar0.get(12);
        i i3 = this.u;
        if(i3 == null) {
            L.S("binding");
            i3 = null;
        }
        i3.i.setSelection(v);
        i i4 = this.u;
        if(i4 == null) {
            L.S("binding");
        }
        else {
            i0 = i4;
        }
        i0.j.setSelection(v1 / 5);
    }

    private final void P1(int v) {
        static final class b extends N implements Function1 {
            final int e;

            b(int v) {
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


        static final class c extends N implements Function1 {
            public static final c e;

            static {
                c.e = new c();
            }

            c() {
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


        static final class com.dcinside.app.write.menu.setting.PostAutoDeleteActivity.d extends N implements Function1 {
            public static final com.dcinside.app.write.menu.setting.PostAutoDeleteActivity.d e;

            static {
                com.dcinside.app.write.menu.setting.PostAutoDeleteActivity.d.e = new com.dcinside.app.write.menu.setting.PostAutoDeleteActivity.d();
            }

            com.dcinside.app.write.menu.setting.PostAutoDeleteActivity.d() {
                super(1);
            }

            public final void a(Boolean boolean0) {
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return S0.a;
            }
        }

        e.e.a(this).n(new b(v)).z(0x7F150925).b().Z1((Object object0) -> {
            L.p(c.e, "$tmp0");
            return (Boolean)c.e.invoke(object0);
        }).x5((Object object0) -> {
            L.p(com.dcinside.app.write.menu.setting.PostAutoDeleteActivity.d.e, "$tmp0");
            com.dcinside.app.write.menu.setting.PostAutoDeleteActivity.d.e.invoke(object0);
        });
    }

    // 检测为 Lambda 实现
    private static final Boolean Q1(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void R1(Function1 function10, Object object0) [...]

    private final void S1() {
        i i0 = this.u;
        if(i0 == null) {
            L.S("binding");
            i0 = null;
        }
        Date date0 = Bk.g(i0.f.getText().toString());
        long v = date0 == null ? System.currentTimeMillis() : date0.getTime();
        Calendar calendar0 = Calendar.getInstance();
        calendar0.setTimeInMillis(v);
        int v1 = calendar0.get(1);
        int v2 = calendar0.get(2);
        int v3 = calendar0.get(5);
        f f0 = (DatePicker datePicker0, int v, int v1, int v2) -> {
            L.p(this, "this$0");
            calendar0.set(v, v1, v2);
            i i0 = this.u;
            if(i0 == null) {
                L.S("binding");
                i0 = null;
            }
            String s = Bk.G(calendar0.getTimeInMillis());
            i0.f.setText(s);
        };
        DatePickerDialog datePickerDialog0 = this.v;
        if(datePickerDialog0 != null) {
            L.m(datePickerDialog0);
            if(datePickerDialog0.isShowing()) {
                DatePickerDialog datePickerDialog1 = this.v;
                L.m(datePickerDialog1);
                datePickerDialog1.cancel();
            }
            this.v = null;
        }
        DatePickerDialog datePickerDialog2 = new DatePickerDialog(this, dl.a.q2().h(), f0, v1, v2, v3);
        this.v = datePickerDialog2;
        DatePicker datePicker0 = datePickerDialog2.getDatePicker();
        if(datePicker0 != null) {
            try {
                Calendar calendar1 = Calendar.getInstance();
                calendar1.add(12, 5);
                datePicker0.setMinDate(calendar1.getTimeInMillis());
                calendar1.add(2, 3);
                datePicker0.setMaxDate(calendar1.getTimeInMillis());
            }
            catch(Exception unused_ex) {
            }
        }
        DatePickerDialog datePickerDialog3 = this.v;
        if(datePickerDialog3 != null) {
            datePickerDialog3.show();
        }
    }

    // 检测为 Lambda 实现
    private static final void T1(Calendar calendar0, PostAutoDeleteActivity postAutoDeleteActivity0, DatePicker datePicker0, int v, int v1, int v2) [...]

    private final void U1() {
        static final class g extends N implements Function1 {
            public static final g e;

            static {
                g.e = new g();
            }

            g() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "b");
                return p$a0.m(0x7F1507B0);  // string:post_auto_del_remove "자동 삭제 설정을 해제하시겠습니까?"
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


        static final class com.dcinside.app.write.menu.setting.PostAutoDeleteActivity.i extends N implements Function1 {
            final PostAutoDeleteActivity e;

            com.dcinside.app.write.menu.setting.PostAutoDeleteActivity.i(PostAutoDeleteActivity postAutoDeleteActivity0) {
                this.e = postAutoDeleteActivity0;
                super(1);
            }

            public final void a(Boolean boolean0) {
                this.e.N1();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        e.e.a(this).n(g.e).z(0x7F15034A).x(0x7F1501C1).b().Z1((Object object0) -> {
            L.p(h.e, "$tmp0");
            return (Boolean)h.e.invoke(object0);
        }).x5((Object object0) -> {
            L.p(new com.dcinside.app.write.menu.setting.PostAutoDeleteActivity.i(this), "$tmp0");
            new com.dcinside.app.write.menu.setting.PostAutoDeleteActivity.i(this).invoke(object0);
        });
    }

    // 检测为 Lambda 实现
    private static final Boolean V1(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void W1(Function1 function10, Object object0) [...]

    @Override  // com.dcinside.app.base.d
    protected void onCreate(@m Bundle bundle0) {
        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.menu.setting.PostAutoDeleteActivity$onCreate$1$1", f = "PostAutoDeleteActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.menu.setting.PostAutoDeleteActivity.e extends o implements p {
            int k;
            final PostAutoDeleteActivity l;

            com.dcinside.app.write.menu.setting.PostAutoDeleteActivity.e(PostAutoDeleteActivity postAutoDeleteActivity0, kotlin.coroutines.d d0) {
                this.l = postAutoDeleteActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.write.menu.setting.PostAutoDeleteActivity.e(this.l, d0).invokeSuspend(S0.a);
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
                this.l.S1();
                return S0.a;
            }
        }


        @kotlin.coroutines.jvm.internal.f(c = "com.dcinside.app.write.menu.setting.PostAutoDeleteActivity$onCreate$4", f = "PostAutoDeleteActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.write.menu.setting.PostAutoDeleteActivity.f extends o implements p {
            int k;
            final PostAutoDeleteActivity l;

            com.dcinside.app.write.menu.setting.PostAutoDeleteActivity.f(PostAutoDeleteActivity postAutoDeleteActivity0, kotlin.coroutines.d d0) {
                this.l = postAutoDeleteActivity0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.write.menu.setting.PostAutoDeleteActivity.f(this.l, d0).invokeSuspend(S0.a);
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
                this.l.U1();
                return S0.a;
            }
        }

        super.onCreate(bundle0);
        i i0 = i.c(this.getLayoutInflater());
        L.o(i0, "inflate(...)");
        this.u = i0;
        if(i0 == null) {
            L.S("binding");
            i0 = null;
        }
        this.setContentView(i0.b());
        i i1 = this.u;
        if(i1 == null) {
            L.S("binding");
            i1 = null;
        }
        this.S0(i1.k);
        kr.bhbfhfb.designcompat.a.d(this);
        i i2 = this.u;
        if(i2 == null) {
            L.S("binding");
            i2 = null;
        }
        L.m(i2.f);
        com.dcinside.app.write.menu.setting.PostAutoDeleteActivity.e postAutoDeleteActivity$e0 = new com.dcinside.app.write.menu.setting.PostAutoDeleteActivity.e(this, null);
        r.M(i2.f, null, postAutoDeleteActivity$e0, 1, null);
        i i3 = this.u;
        if(i3 == null) {
            L.S("binding");
            i3 = null;
        }
        AppCompatSpinner appCompatSpinner0 = i3.i;
        Iterable iterable0 = u.V5(s.W1(0, 24));
        ArrayList arrayList0 = new ArrayList(u.b0(iterable0, 10));
        for(Object object0: iterable0) {
            arrayList0.add(String.valueOf(((Number)object0).intValue()));
        }
        appCompatSpinner0.setAdapter(new ArrayAdapter(this, 0x7F0E0286, arrayList0));  // layout:view_spinner_item_center
        i i4 = this.u;
        if(i4 == null) {
            L.S("binding");
            i4 = null;
        }
        String[] arr_s = this.getResources().getStringArray(0x7F030035);  // array:time_select_auto_del_minute
        L.o(arr_s, "getStringArray(...)");
        ArrayAdapter arrayAdapter0 = new ArrayAdapter(this, 0x7F0E0286, arr_s);  // layout:view_spinner_item_center
        i4.j.setAdapter(arrayAdapter0);
        i i5 = this.u;
        if(i5 == null) {
            L.S("binding");
            i5 = null;
        }
        L.o(i5.b, "postAutoDelClear");
        com.dcinside.app.write.menu.setting.PostAutoDeleteActivity.f postAutoDeleteActivity$f0 = new com.dcinside.app.write.menu.setting.PostAutoDeleteActivity.f(this, null);
        r.M(i5.b, null, postAutoDeleteActivity$f0, 1, null);
        this.O1();
    }

    @Override  // android.app.Activity
    public boolean onCreateOptionsMenu(@l Menu menu0) {
        L.p(menu0, "menu");
        this.getMenuInflater().inflate(0x7F100019, menu0);  // mipmap:ic_launcher28
        return super.onCreateOptionsMenu(menu0);
    }

    @Override  // android.app.Activity
    public boolean onOptionsItemSelected(@l MenuItem menuItem0) {
        L.p(menuItem0, "item");
        switch(menuItem0.getItemId()) {
            case 0x102002C: {
                this.onBackPressed();
                return true;
            }
            case 0x7F0B0075: {  // id:action_write
                this.M1();
                return true;
            }
            default: {
                return super.onOptionsItemSelected(menuItem0);
            }
        }
    }
}

