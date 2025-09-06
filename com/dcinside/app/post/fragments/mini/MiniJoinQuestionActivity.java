package com.dcinside.app.post.fragments.mini;

import A3.p;
import Y.J;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.dcinside.app.base.g;
import com.dcinside.app.internal.r;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.Nk;
import com.dcinside.app.util.uk;
import kotlin.S0;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import rx.o;
import y4.l;
import y4.m;

public final class MiniJoinQuestionActivity extends g {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        public final void a(@l AppCompatActivity appCompatActivity0, @l String s, @m String s1) {
            L.p(appCompatActivity0, "activity");
            L.p(s, "gallId");
            Intent intent0 = new Intent(appCompatActivity0, MiniJoinQuestionActivity.class);
            intent0.putExtra("com.dcinside.app.gallery.search.EXTRA_MINI_GALLERY_ID", s);
            intent0.putExtra("com.dcinside.app.gallery.search.EXTRA_MINI_QUESTION_CONTENT", s1);
            appCompatActivity0.startActivityForResult(intent0, 0x40F);
        }
    }

    @l
    private static final String A = "com.dcinside.app.gallery.search.EXTRA_MINI_QUESTION_CONTENT";
    @l
    private static final String B = "com.dcinside.app.gallery.search.EXTRA_MINI_GALLERY_ID";
    private J w;
    @m
    private o x;
    @m
    private String y;
    @l
    public static final a z;

    static {
        MiniJoinQuestionActivity.z = new a(null);
    }

    private final void Q1() {
        static final class b extends N implements A3.a {
            final MiniJoinQuestionActivity e;
            final String f;

            b(MiniJoinQuestionActivity miniJoinQuestionActivity0, String s) {
                this.e = miniJoinQuestionActivity0;
                this.f = s;
                super(0);
            }

            @Override  // A3.a
            public Object invoke() {
                this.invoke();
                return S0.a;
            }

            public final void invoke() {
                this.e.V1(this.f);
            }
        }

        J j0 = this.w;
        if(j0 == null) {
            L.S("binding");
            j0 = null;
        }
        String s = j0.c.getText().toString();
        if(s.length() == 0) {
            this.R1(0x7F1506E7, null);  // string:need_input_answer "답변을 입력하세요."
            return;
        }
        this.R1(0x7F150214, new b(this, s));  // string:confirm_join_answer "입력한 답변으로 가입 신청하시겠습니까?"
    }

    private final void R1(int v, A3.a a0) {
        static final class c extends N implements Function1 {
            final int e;

            c(int v) {
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


        static final class d extends N implements Function1 {
            public static final d e;

            static {
                d.e = new d();
            }

            d() {
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


        static final class e extends N implements Function1 {
            final A3.a e;

            e(A3.a a0) {
                this.e = a0;
                super(1);
            }

            public final void a(Boolean boolean0) {
                A3.a a0 = this.e;
                if(a0 != null) {
                    a0.invoke();
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        com.dcinside.app.perform.e.e.a(this).n(new c(v)).z(0x7F15034A).b().Z1((Object object0) -> {
            L.p(d.e, "$tmp0");
            return (Boolean)d.e.invoke(object0);
        }).x5((Object object0) -> {
            L.p(new e(a0), "$tmp0");
            new e(a0).invoke(object0);
        });
    }

    // 检测为 Lambda 实现
    private static final Boolean S1(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void T1(Function1 function10, Object object0) [...]

    private final void U1() {
        String s = this.getIntent().getStringExtra("com.dcinside.app.gallery.search.EXTRA_MINI_QUESTION_CONTENT");
        J j0 = this.w;
        if(j0 == null) {
            L.S("binding");
            j0 = null;
        }
        String s1 = this.getString(0x7F150826, new Object[]{s});  // string:question_merge "Q. %s"
        j0.d.setText(s1);
    }

    private final void V1(String s) {
        static final class com.dcinside.app.post.fragments.mini.MiniJoinQuestionActivity.g extends N implements Function1 {
            final MiniJoinQuestionActivity e;

            com.dcinside.app.post.fragments.mini.MiniJoinQuestionActivity.g(MiniJoinQuestionActivity miniJoinQuestionActivity0) {
                this.e = miniJoinQuestionActivity0;
                super(1);
            }

            public final void a(com.dcinside.app.response.d d0) {
                if(d0.g() == null) {
                    Dl.G(this.e, (d0.a() == null ? "" : d0.a()));
                    return;
                }
                this.e.Y1(d0.g());
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((com.dcinside.app.response.d)object0));
                return S0.a;
            }
        }

        this.x = uk.Qk(this.y, s).M3(rx.android.schedulers.a.c()).y5((Object object0) -> {
            L.p(new com.dcinside.app.post.fragments.mini.MiniJoinQuestionActivity.g(this), "$tmp0");
            new com.dcinside.app.post.fragments.mini.MiniJoinQuestionActivity.g(this).invoke(object0);
        }, (Throwable throwable0) -> {
            L.p(this, "this$0");
            timber.log.b.a.e(throwable0);
            Dl.D(this, 0x7F1502AC);  // string:error_error_in_process "처리 중 오류가 발생했습니다."
        });
    }

    // 检测为 Lambda 实现
    private static final void W1(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void X1(MiniJoinQuestionActivity miniJoinQuestionActivity0, Throwable throwable0) [...]

    private final void Y1(String s) {
        if(L.g(s, "ok")) {
            Dl.D(this, 0x7F1509F3);  // string:success_join_mini_member "멤버 가입이 완료되었습니다."
        }
        else if(L.g(s, "wait")) {
            Dl.D(this, 0x7F1509F4);  // string:success_join_request "멤버 가입 신청이 완료되었습니다."
        }
        Nk.a.a(this);
        this.setResult(-1);
        this.finish();
    }

    @Override  // com.dcinside.app.base.g
    protected void onCreate(@m Bundle bundle0) {
        super.onCreate(bundle0);
        J j0 = J.c(this.getLayoutInflater());
        L.o(j0, "inflate(...)");
        this.w = j0;
        J j1 = null;
        if(j0 == null) {
            L.S("binding");
            j0 = null;
        }
        this.setContentView(j0.b());
        J j2 = this.w;
        if(j2 == null) {
            L.S("binding");
        }
        else {
            j1 = j2;
        }
        this.S0(j1.f);
        kr.bhbfhfb.designcompat.a.d(this);
        String s = this.getIntent().getStringExtra("com.dcinside.app.gallery.search.EXTRA_MINI_GALLERY_ID");
        this.y = s;
        if(s == null) {
            this.finish();
        }
        this.U1();
    }

    @Override  // android.app.Activity
    public boolean onCreateOptionsMenu(@l Menu menu0) {
        @f(c = "com.dcinside.app.post.fragments.mini.MiniJoinQuestionActivity$onCreateOptionsMenu$1", f = "MiniJoinQuestionActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.post.fragments.mini.MiniJoinQuestionActivity.f extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final MiniJoinQuestionActivity l;
            final MenuItem m;

            com.dcinside.app.post.fragments.mini.MiniJoinQuestionActivity.f(MiniJoinQuestionActivity miniJoinQuestionActivity0, MenuItem menuItem0, kotlin.coroutines.d d0) {
                this.l = miniJoinQuestionActivity0;
                this.m = menuItem0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new com.dcinside.app.post.fragments.mini.MiniJoinQuestionActivity.f(this.l, this.m, d0).invokeSuspend(S0.a);
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
                L.o(this.m, "$item");
                this.l.onOptionsItemSelected(this.m);
                return S0.a;
            }
        }

        L.p(menu0, "menu");
        this.getMenuInflater().inflate(0x7F10000C, menu0);  // mipmap:ic_launcher16
        MenuItem menuItem0 = menu0.findItem(0x7F0B004A);  // id:action_apply
        if(menuItem0 != null) {
            View view0 = menuItem0.getActionView();
            Button button0 = view0 == null ? null : ((Button)view0.findViewById(0x7F0B0831));  // id:menu_submit
            if(button0 != null) {
                r.M(button0, null, new com.dcinside.app.post.fragments.mini.MiniJoinQuestionActivity.f(this, menuItem0, null), 1, null);
            }
        }
        return super.onCreateOptionsMenu(menu0);
    }

    @Override  // com.dcinside.app.base.g
    protected void onDestroy() {
        Nk.a.a(this);
        super.onDestroy();
    }

    @Override  // android.app.Activity
    public boolean onOptionsItemSelected(@l MenuItem menuItem0) {
        L.p(menuItem0, "item");
        switch(menuItem0.getItemId()) {
            case 0x102002C: {
                Nk.a.a(this);
                this.getOnBackPressedDispatcher().p();
                return true;
            }
            case 0x7F0B004A: {  // id:action_apply
                this.Q1();
                return true;
            }
            default: {
                return super.onOptionsItemSelected(menuItem0);
            }
        }
    }
}

