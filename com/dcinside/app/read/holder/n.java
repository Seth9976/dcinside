package com.dcinside.app.read.holder;

import A3.p;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.dcinside.app.internal.r;
import com.dcinside.app.perform.r.b;
import com.dcinside.app.perform.r.c;
import com.dcinside.app.util.Bk;
import com.dcinside.app.util.Dl;
import fr.castorflex.android.smoothprogressbar.SmoothProgressBar;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import y4.m;

public final class n extends l implements b {
    @y4.l
    private final View n;
    @y4.l
    private final TextView o;
    @y4.l
    private final SmoothProgressBar p;
    @y4.l
    private final View q;
    @m
    private String r;

    public n(@y4.l View view0) {
        @f(c = "com.dcinside.app.read.holder.ReplyVoiceHolder$1", f = "ReplyVoiceHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nReplyVoiceHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReplyVoiceHolder.kt\ncom/dcinside/app/read/holder/ReplyVoiceHolder$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,59:1\n1#2:60\n*E\n"})
        static final class a extends o implements p {
            int k;
            Object l;
            final n m;

            a(n n0, d d0) {
                this.m = n0;
                super(3, d0);
            }

            @m
            public final Object a(@y4.l O o0, @y4.l View view0, @m d d0) {
                a n$a0 = new a(this.m, d0);
                n$a0.l = view0;
                return n$a0.invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@y4.l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.m.G(((View)this.l));
                return S0.a;
            }
        }

        L.p(view0, "itemView");
        super(view0, null, 2, null);
        View view1 = view0.findViewById(0x7F0B0D75);  // id:reply_voice
        L.o(view1, "findViewById(...)");
        this.n = view1;
        View view2 = view0.findViewById(0x7F0B0D77);  // id:reply_voice_desc
        L.o(view2, "findViewById(...)");
        this.o = (TextView)view2;
        View view3 = view0.findViewById(0x7F0B0D79);  // id:reply_voice_progress
        L.o(view3, "findViewById(...)");
        this.p = (SmoothProgressBar)view3;
        View view4 = view0.findViewById(0x7F0B0D76);  // id:reply_voice_cover
        L.o(view4, "findViewById(...)");
        this.q = view4;
        r.M(view1, null, new a(this, null), 1, null);
    }

    @m
    public final String F() {
        return this.r;
    }

    private final void G(View view0) {
        Context context0 = Dl.b(view0);
        L.n(context0, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        c r$c0 = com.dcinside.app.perform.r.g(((AppCompatActivity)context0)).i(this.r);
        if(r$c0 != null) {
            r$c0.t();
        }
    }

    public final void H(@m String s) {
        this.r = s;
    }

    @Override  // com.dcinside.app.perform.r$b
    public void b(boolean z, boolean z1, int v, int v1) {
        if(z || z1) {
            this.q.setVisibility(8);
            this.p.setVisibility(0);
            String s = Bk.E(v1 - v);
            this.o.setText(s);
        }
        else {
            this.p.setVisibility(8);
            this.q.setVisibility(0);
            this.o.setText(0x7F1508C6);  // string:reply_voice_play_msg "보이스리플 재생"
        }
        this.p.setProgress(v);
        if(this.p.isIndeterminate() != z) {
            this.p.setIndeterminate(z);
            if(!z) {
                this.p.progressiveStop();
            }
        }
        if(this.n.isSelected() != z1) {
            this.p.setMax(v1);
            this.n.setSelected(z1);
        }
    }
}

