package com.dcinside.app.view;

import A3.p;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.dcinside.app.internal.r;
import com.dcinside.app.model.W;
import com.dcinside.app.rx.bus.I;
import com.dcinside.app.util.dl;
import kotlin.S0;
import kotlin.V;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.r0;
import kotlin.text.v;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;
import z3.j;

public final class ReadOtherPostView extends ConstraintLayout {
    @l
    private V a;
    @l
    private V b;
    @l
    private V c;
    @l
    private final TextView d;
    @l
    private final TextView e;
    @l
    private final TextView f;
    @l
    private final TextView g;

    @j
    public ReadOtherPostView(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @j
    public ReadOtherPostView(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public ReadOtherPostView(@l Context context0, @m AttributeSet attributeSet0, int v) {
        @f(c = "com.dcinside.app.view.ReadOtherPostView$1", f = "ReadOtherPostView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements p {
            int k;
            Object l;
            final ReadOtherPostView m;

            a(ReadOtherPostView readOtherPostView0, d d0) {
                this.m = readOtherPostView0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                a readOtherPostView$a0 = new a(this.m, d0);
                readOtherPostView$a0.l = view0;
                return readOtherPostView$a0.invokeSuspend(S0.a);
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
                this.m.F(((View)this.l));
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.view.ReadOtherPostView$2", f = "ReadOtherPostView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements p {
            int k;
            Object l;
            final ReadOtherPostView m;

            b(ReadOtherPostView readOtherPostView0, d d0) {
                this.m = readOtherPostView0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                b readOtherPostView$b0 = new b(this.m, d0);
                readOtherPostView$b0.l = view0;
                return readOtherPostView$b0.invokeSuspend(S0.a);
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
                this.m.F(((View)this.l));
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.view.ReadOtherPostView$3", f = "ReadOtherPostView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends o implements p {
            int k;
            Object l;
            final ReadOtherPostView m;

            c(ReadOtherPostView readOtherPostView0, d d0) {
                this.m = readOtherPostView0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                c readOtherPostView$c0 = new c(this.m, d0);
                readOtherPostView$c0.l = view0;
                return readOtherPostView$c0.invokeSuspend(S0.a);
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
                this.m.F(((View)this.l));
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.view.ReadOtherPostView$4", f = "ReadOtherPostView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.view.ReadOtherPostView.d extends o implements p {
            int k;
            Object l;
            final ReadOtherPostView m;

            com.dcinside.app.view.ReadOtherPostView.d(ReadOtherPostView readOtherPostView0, d d0) {
                this.m = readOtherPostView0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                com.dcinside.app.view.ReadOtherPostView.d readOtherPostView$d0 = new com.dcinside.app.view.ReadOtherPostView.d(this.m, d0);
                readOtherPostView$d0.l = view0;
                return readOtherPostView$d0.invokeSuspend(S0.a);
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
                this.m.F(((View)this.l));
                return S0.a;
            }
        }

        L.p(context0, "context");
        super(context0, attributeSet0, v);
        this.a = r0.a("", "");
        this.b = r0.a("", 0);
        this.c = r0.a("", 0);
        View.inflate(context0, 0x7F0E024F, this);  // layout:view_read_other_posts
        View view0 = this.findViewById(0x7F0B0C71);  // id:read_other_posts_prev_text
        L.o(view0, "findViewById(...)");
        this.d = (TextView)view0;
        r.M(((TextView)view0), null, new a(this, null), 1, null);
        View view1 = this.findViewById(0x7F0B0C70);  // id:read_other_posts_prev_subject
        L.o(view1, "findViewById(...)");
        this.e = (TextView)view1;
        r.M(((TextView)view1), null, new b(this, null), 1, null);
        View view2 = this.findViewById(0x7F0B0C6F);  // id:read_other_posts_next_text
        L.o(view2, "findViewById(...)");
        this.f = (TextView)view2;
        r.M(((TextView)view2), null, new c(this, null), 1, null);
        View view3 = this.findViewById(0x7F0B0C6E);  // id:read_other_posts_next_subject
        L.o(view3, "findViewById(...)");
        this.g = (TextView)view3;
        r.M(((TextView)view3), null, new com.dcinside.app.view.ReadOtherPostView.d(this, null), 1, null);
    }

    public ReadOtherPostView(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    private final void B(boolean z, boolean z1, View view0, TextView textView0, com.dcinside.app.model.O o0) {
        if(o0.c() <= 0) {
            view0.setVisibility(8);
            textView0.setVisibility(8);
            return;
        }
        if(z1) {
            view0.setVisibility(8);
            textView0.setVisibility(8);
            return;
        }
        view0.setVisibility(0);
        textView0.setVisibility(0);
        textView0.setText("");
        textView0.setAlpha((z ? 0.2f : 1.0f));
        int v = dl.a.k2();
        if(com.dcinside.app.settings.spoiler.c.d.a(v).d() && !z) {
            this.E(textView0, "");
        }
    }

    static void C(ReadOtherPostView readOtherPostView0, boolean z, boolean z1, View view0, TextView textView0, com.dcinside.app.model.O o0, int v, Object object0) {
        readOtherPostView0.B(((v & 1) == 0 ? z : false), ((v & 2) == 0 ? z1 : false), view0, textView0, o0);
    }

    public final void D(@m String s, @l V v0) {
        L.p(v0, "data");
        Object object0 = v0.e();
        Object object1 = v0.f();
        if(s == null) {
            ReadOtherPostView.C(this, false, false, this.d, this.e, ((W)object0), 3, null);
            ReadOtherPostView.C(this, false, false, this.f, this.g, ((com.dcinside.app.model.L)object1), 3, null);
            return;
        }
        this.b = r0.a(s, ((W)object0).c());
        this.c = r0.a(s, ((com.dcinside.app.model.L)object1).c());
        this.B(((W)object0).l(), ((W)object0).m(), this.d, this.e, ((W)object0));
        this.B(((com.dcinside.app.model.L)object1).l(), ((com.dcinside.app.model.L)object1).m(), this.f, this.g, ((com.dcinside.app.model.L)object1));
    }

    private final void E(TextView textView0, String s) {
        if(s.length() == 0) {
            return;
        }
        Context context0 = textView0.getContext();
        SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder(textView0.getText());
        int v = v.s3(spannableStringBuilder0, s, 0, false, 6, null);
        spannableStringBuilder0.setSpan(new ForegroundColorSpan((dl.a.q2().m() ? ContextCompat.getColor(context0, 0x7F060586) : ContextCompat.getColor(context0, 0x7F060587))), v, s.length() + v, 33);  // color:spoiler_subject_color_dark
        textView0.setText(spannableStringBuilder0);
    }

    private final void F(View view0) {
        V v0;
        switch(view0.getId()) {
            case 0x7F0B0C6E:   // id:read_other_posts_next_subject
            case 0x7F0B0C6F: {  // id:read_other_posts_next_text
                v0 = this.c;
                break;
            }
            case 0x7F0B0C70:   // id:read_other_posts_prev_subject
            case 0x7F0B0C71: {  // id:read_other_posts_prev_text
                v0 = this.b;
                break;
            }
            default: {
                return;
            }
        }
        Object object0 = v0.a();
        int v1 = ((Number)v0.b()).intValue();
        if(((String)object0).length() == 0 && v1 == 0) {
            return;
        }
        Context context0 = this.getContext();
        L.o(context0, "getContext(...)");
        com.dcinside.app.rx.bus.c.a(context0, new I(((String)object0), v1, null, 4, null));
    }
}

