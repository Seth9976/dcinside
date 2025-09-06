package com.dcinside.app.dccon.setting.tag;

import Y.h4;
import android.content.Context;
import android.text.InputFilter.LengthFilter;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.internal.r;
import com.dcinside.app.model.p;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.Nk;
import com.dcinside.app.util.vk;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.v;
import kotlinx.coroutines.O;
import net.fellbaum.jemoji.H0;
import y4.l;
import y4.m;

@s0({"SMAP\nDcconTagSettingHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DcconTagSettingHolder.kt\ncom/dcinside/app/dccon/setting/tag/DcconTagSettingHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,155:1\n255#2,4:156\n255#2:160\n257#2,2:161\n*S KotlinDebug\n*F\n+ 1 DcconTagSettingHolder.kt\ncom/dcinside/app/dccon/setting/tag/DcconTagSettingHolder\n*L\n54#1:156,4\n62#1:160\n113#1:161,2\n*E\n"})
public final class i extends ViewHolder {
    @l
    private final h4 a;
    private final int b;
    private final int c;

    public i(@l h4 h40) {
        L.p(h40, "binding");
        super(h40.b());
        this.a = h40;
        Context context0 = this.itemView.getContext();
        L.o(context0, "getContext(...)");
        this.b = vk.b(context0, 0x1010054);
        this.c = ContextCompat.getColor(this.itemView.getContext(), 0x7F06012B);  // color:grey3
        this.t();
    }

    public final void m(@l p p0) {
        @f(c = "com.dcinside.app.dccon.setting.tag.DcconTagSettingHolder$bind$1", f = "DcconTagSettingHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements A3.p {
            int k;
            final i l;
            final p m;

            a(i i0, p p0, d d0) {
                this.l = i0;
                this.m = p0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new a(this.l, this.m, d0).invokeSuspend(S0.a);
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
                this.l.p(this.m);
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.dccon.setting.tag.DcconTagSettingHolder$bind$2", f = "DcconTagSettingHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements A3.p {
            int k;
            final i l;
            final p m;

            b(i i0, p p0, d d0) {
                this.l = i0;
                this.m = p0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new b(this.l, this.m, d0).invokeSuspend(S0.a);
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
                this.l.n(this.m);
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.dccon.setting.tag.DcconTagSettingHolder$bind$3", f = "DcconTagSettingHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends o implements A3.p {
            int k;
            final i l;

            c(i i0, d d0) {
                this.l = i0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new c(this.l, d0).invokeSuspend(S0.a);
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
                this.l.v();
                return S0.a;
            }
        }

        L.p(p0, "icon");
        Context context0 = this.itemView.getContext();
        String s = p0.t();
        String s1 = context0.getString(0x7F15024E, new Object[]{(s == null ? null : v.l2(s, " ", "", false, 4, null))});  // string:dccon_tag_with_hashtag "#%1$s"
        this.a.n.setText(s1);
        com.facebook.drawee.controller.a a0 = ((com.facebook.drawee.backends.pipeline.f)com.facebook.drawee.backends.pipeline.d.j().j0(p0.r()).I(true)).e();
        this.a.m.setController(a0);
        L.o(this.a.h, "dcconTagItemDetailSave");
        a i$a0 = new a(this, p0, null);
        r.M(this.a.h, null, i$a0, 1, null);
        L.o(this.a.e, "dcconTagItemCustomWrap");
        b i$b0 = new b(this, p0, null);
        r.M(this.a.e, null, i$b0, 1, null);
        L.o(this.a.b, "dcconTagItemAdd");
        c i$c0 = new c(this, null);
        r.M(this.a.b, null, i$c0, 1, null);
        this.s(p0);
    }

    private final void n(p p0) {
        static final class com.dcinside.app.dccon.setting.tag.i.d extends N implements Function1 {
            public static final com.dcinside.app.dccon.setting.tag.i.d e;

            static {
                com.dcinside.app.dccon.setting.tag.i.d.e = new com.dcinside.app.dccon.setting.tag.i.d();
            }

            com.dcinside.app.dccon.setting.tag.i.d() {
                super(1);
            }

            @m
            public final Object a(@l com.dcinside.app.perform.p.a p$a0) {
                L.p(p$a0, "builder");
                return p$a0.m(0x7F15045C);  // string:history_delete_msg "삭제하시겠습니까?"
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((com.dcinside.app.perform.p.a)object0));
            }
        }


        static final class e extends N implements Function1 {
            final p e;
            final i f;

            e(p p0, i i0) {
                this.e = p0;
                this.f = i0;
                super(1);
            }

            public final void a(Boolean boolean0) {
                L.m(boolean0);
                if(boolean0.booleanValue()) {
                    com.dcinside.app.dccon.setting.tag.a.f.f(this.e);
                    this.f.a.b.setVisibility(0);
                    i.r(this.f, false, 1, null);
                    this.f.a.e.setVisibility(8);
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((Boolean)object0));
                return S0.a;
            }
        }

        Context context0 = this.itemView.getContext();
        AppCompatActivity appCompatActivity0 = context0 instanceof AppCompatActivity ? ((AppCompatActivity)context0) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        com.dcinside.app.perform.e.e.a(appCompatActivity0).n(com.dcinside.app.dccon.setting.tag.i.d.e).z(0x7F15034A).x(0x1040000).b().x5((Object object0) -> {
            L.p(new e(p0, this), "$tmp0");
            new e(p0, this).invoke(object0);
        });
    }

    // 检测为 Lambda 实现
    private static final void o(Function1 function10, Object object0) [...]

    private final void p(p p0) {
        Context context0 = this.itemView.getContext();
        String s = this.a.g.getText().toString();
        if(s.length() > 0) {
            String s1 = context0.getString(0x7F15024E, new Object[]{s});  // string:dccon_tag_with_hashtag "#%1$s"
            this.a.d.setText(s1);
            com.dcinside.app.dccon.setting.tag.a.f.c(p0, s);
            this.a.j.setVisibility(8);
            Nk.a.c(this.a.g);
            this.a.e.setVisibility(0);
            this.a.b.setVisibility(8);
            this.a.g.setText(null);
            return;
        }
        Dl.G(context0, "내용을 입력해 주세요.");
    }

    private final void q(boolean z) {
        if(z) {
            this.a.b.setRotation(0.0f);
            this.a.b.setColorFilter(this.c);
            this.a.b.setActivated(false);
            return;
        }
        this.a.b.setRotation(45.0f);
        this.a.b.setColorFilter(this.b);
        this.a.b.setActivated(true);
    }

    static void r(i i0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = true;
        }
        i0.q(z);
    }

    private final void s(p p0) {
        Context context0 = this.itemView.getContext();
        String s = com.dcinside.app.dccon.setting.tag.a.f.d(p0.s(), p0.q());
        L.o(this.a.j, "dcconTagItemDetailWrap");
        this.a.j.setVisibility(8);
        if(s != null) {
            this.a.e.setVisibility(0);
            this.a.b.setVisibility(8);
            String s1 = context0.getString(0x7F15024E, new Object[]{s});  // string:dccon_tag_with_hashtag "#%1$s"
            this.a.d.setText(s1);
            return;
        }
        this.a.e.setVisibility(8);
        this.a.b.setVisibility(0);
        i.r(this, false, 1, null);
    }

    private final void t() {
        InputFilter[] arr_inputFilter = {(CharSequence charSequence0, int v, int v1, Spanned spanned0, int v2, int v3) -> {
            L.p(new kotlin.text.r("[^#\\s]"), "$regex");
            L.m(charSequence0);
            return charSequence0.length() > 0 && H0.m(charSequence0.toString()) || !new kotlin.text.r("[^#\\s]").b(charSequence0) ? "" : charSequence0;
        }, new InputFilter.LengthFilter(6)};
        this.a.g.setFilters(arr_inputFilter);
    }

    // 检测为 Lambda 实现
    private static final CharSequence u(kotlin.text.r r0, CharSequence charSequence0, int v, int v1, Spanned spanned0, int v2, int v3) [...]

    private final void v() {
        L.o(this.a.j, "dcconTagItemDetailWrap");
        L.o(this.a.j, "dcconTagItemDetailWrap");
        this.a.j.setVisibility((this.a.j.getVisibility() == 0 ? 8 : 0));
        com.dcinside.app.dccon.setting.tag.f f0 = (TextView textView0, int v, KeyEvent keyEvent0) -> {
            L.p(this, "this$0");
            if(v == 6) {
                this.a.h.performClick();
                return true;
            }
            return false;
        };
        this.a.g.setOnEditorActionListener(f0);
        L.o(this.a.j, "dcconTagItemDetailWrap");
        if(this.a.j.getVisibility() == 0) {
            this.q(false);
            Nk.a.f(this.a.g);
            return;
        }
        i.r(this, false, 1, null);
        Nk.a.c(this.a.g);
    }

    // 检测为 Lambda 实现
    private static final boolean w(i i0, TextView textView0, int v, KeyEvent keyEvent0) [...]
}

