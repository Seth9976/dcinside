package com.dcinside.app.write.menu.series;

import A3.p;
import Y.l1;
import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import androidx.fragment.app.DialogFragment;
import com.dcinside.app.internal.r;
import com.dcinside.app.model.Q;
import com.dcinside.app.rx.bus.c;
import com.dcinside.app.rx.bus.j0;
import com.dcinside.app.util.Nk;
import com.dcinside.app.util.Yk;
import com.dcinside.app.util.uk;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.text.v;
import kotlinx.coroutines.O;
import rx.o;
import y4.l;
import y4.m;

public final class e extends DialogFragment {
    @m
    private l1 a;
    @m
    private o b;

    @Override  // androidx.fragment.app.Fragment
    @l
    public View onCreateView(@l LayoutInflater layoutInflater0, @m ViewGroup viewGroup0, @m Bundle bundle0) {
        L.p(layoutInflater0, "inflater");
        this.a = l1.d(layoutInflater0, viewGroup0, false);
        View view0 = this.q0().b();
        L.o(view0, "getRoot(...)");
        return view0;
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void onDestroyView() {
        o o0 = this.b;
        if(o0 != null) {
            o0.l();
        }
        this.b = null;
        super.onDestroyView();
        this.a = null;
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void onStart() {
        super.onStart();
        Dialog dialog0 = this.getDialog();
        if(dialog0 != null) {
            Window window0 = dialog0.getWindow();
            if(window0 != null) {
                window0.setLayout(-1, -2);
                WindowManager.LayoutParams windowManager$LayoutParams0 = window0.getAttributes();
                windowManager$LayoutParams0.gravity = 17;
                window0.setAttributes(windowManager$LayoutParams0);
            }
        }
    }

    @Override  // androidx.fragment.app.Fragment
    public void onViewCreated(@l View view0, @m Bundle bundle0) {
        @f(c = "com.dcinside.app.write.menu.series.SeriesAddPostUrlDialog$onViewCreated$1", f = "SeriesAddPostUrlDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements p {
            int k;
            final e l;

            a(e e0, d d0) {
                this.l = e0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new a(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.s0();
                return S0.a;
            }
        }

        L.p(view0, "view");
        super.onViewCreated(view0, bundle0);
        this.q0().e.setVisibility(4);
        l1 l10 = this.q0();
        L.o(l10.c, "seriesInputUrlApply");
        a e$a0 = new a(this, null);
        r.M(l10.c, null, e$a0, 1, null);
    }

    private final l1 q0() {
        l1 l10 = this.a;
        L.m(l10);
        return l10;
    }

    private final void r0(boolean z) {
        this.q0().d.setVisibility((z ? 0 : 8));
    }

    private final void s0() {
        static final class b extends N implements Function1 {
            final e e;

            b(e e0) {
                this.e = e0;
                super(1);
            }

            public final void a(Q q0) {
                if(q0.K0()) {
                    l1 l10 = this.e.q0();
                    String s = this.e.getString(0x7F15093D);  // string:series_add_url_incorrect "- 게시물 URL을 정확히 입력해 주세요."
                    l10.e.setText(s);
                    this.e.q0().e.setVisibility(0);
                    return;
                }
                Context context0 = this.e.getContext();
                if(context0 == null) {
                    return;
                }
                L.m(q0);
                c.a(context0, new j0(q0));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Q)object0));
                return S0.a;
            }
        }

        l1 l10 = this.q0();
        Nk.a.c(l10.b);
        this.q0().b.clearFocus();
        Editable editable0 = this.q0().b.getText();
        Uri uri0 = Uri.parse((editable0 == null ? null : editable0.toString()));
        int v = Yk.m.match(uri0);
        L.m(uri0);
        com.dcinside.app.main.a.a a$a0 = com.dcinside.app.main.a.a.e(uri0, v);
        String s = a$a0.a();
        String s1 = a$a0.b();
        int v1 = 0;
        if(s != null && s.length() > 0 && s1 != null && s1.length() > 0) {
            Integer integer0 = v.b1(s1);
            if(integer0 != null) {
                v1 = (int)integer0;
            }
            this.b = uk.iG(s, v1, null, null).R1(() -> {
                L.p(this, "this$0");
                this.r0(true);
            }).T1(() -> {
                L.p(this, "this$0");
                this.r0(false);
            }).y5((Object object0) -> {
                L.p(new b(this), "$tmp0");
                new b(this).invoke(object0);
            }, (Throwable throwable0) -> {
                L.p(this, "this$0");
                l1 l10 = this.q0();
                String s = this.getString(0x7F15093D);  // string:series_add_url_incorrect "- 게시물 URL을 정확히 입력해 주세요."
                l10.e.setText(s);
                this.q0().e.setVisibility(0);
            });
            return;
        }
        l1 l11 = this.q0();
        String s2 = this.getString(0x7F15093D);  // string:series_add_url_incorrect "- 게시물 URL을 정확히 입력해 주세요."
        l11.e.setText(s2);
        this.q0().e.setVisibility(0);
    }

    // 检测为 Lambda 实现
    private static final void t0(e e0) [...]

    // 检测为 Lambda 实现
    private static final void u0(e e0) [...]

    // 检测为 Lambda 实现
    private static final void v0(Function1 function10, Object object0) [...]

    // 检测为 Lambda 实现
    private static final void w0(e e0, Throwable throwable0) [...]
}

