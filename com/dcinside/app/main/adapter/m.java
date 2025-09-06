package com.dcinside.app.main.adapter;

import A3.p;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.dcinside.app.internal.r;
import com.dcinside.app.main.HomeActivity;
import com.dcinside.app.model.Z;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.Xk;
import com.dcinside.app.util.jl;
import java.util.List;
import kotlin.S0;
import kotlin.V;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.O;
import y4.l;

public final class m extends ViewHolder {
    private final LinearLayout a;
    private final TextView b;
    private final TextView c;
    @l
    private TextPaint d;

    public m(@l View view0) {
        L.p(view0, "itemView");
        super(view0);
        this.a = (LinearLayout)view0.findViewById(0x7F0B0CDD);  // id:recommend_galleries_container
        this.b = (TextView)view0.findViewById(0x7F0B0CDF);  // id:recommend_galleries_title
        this.c = (TextView)view0.findViewById(0x7F0B0CE0);  // id:recommend_galleries_topic_name
        this.d = new TextPaint();
    }

    private final void f(String s, List list0, boolean z, boolean z1) {
        if(this.a.getChildCount() > 0) {
            if(z1) {
                this.a.removeAllViews();
                goto label_5;
            }
            return;
        }
    label_5:
        this.c.setText(s);
        LayoutInflater layoutInflater0 = LayoutInflater.from(this.itemView.getContext());
        Rect rect0 = new Rect();
        L.o(this.b, "title");
        float f = 0.0f - (m.i(this.b, this, rect0) + 0.0f);
        List list1 = u.Y5(list0);
        LinearLayout linearLayout0 = this.a;
        while(!list1.isEmpty()) {
            Z z2 = (Z)list1.remove(0);
            TextView textView0 = m.h(layoutInflater0, this, z2);
            textView0.setText(z2.c());
            float f1 = m.i(textView0, this, rect0) + 0.0f;
            if(f <= f1) {
                break;
            }
            linearLayout0.addView(textView0);
            f -= f1;
        }
    }

    private static final TextView h(LayoutInflater layoutInflater0, m m0, Z z0) {
        @f(c = "com.dcinside.app.main.adapter.MainRecommendHolder$applyRecommend$createView$1", f = "MainRecommendHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements p {
            int k;
            Object l;
            final m m;

            a(m m0, d d0) {
                this.m = m0;
                super(3, d0);
            }

            @y4.m
            public final Object a(@l O o0, @l View view0, @y4.m d d0) {
                a m$a0 = new a(this.m, d0);
                m$a0.l = view0;
                return m$a0.invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.m.k(((View)this.l));
                return S0.a;
            }
        }

        View view0 = layoutInflater0.inflate(0x7F0E025F, m0.a, false);  // layout:view_recommend_item
        L.n(view0, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView)view0).setTag(z0);
        r.M(((TextView)view0), null, new a(m0, null), 1, null);
        return (TextView)view0;
    }

    private static final float i(TextView textView0, m m0, Rect rect0) {
        String s = textView0.getText().toString();
        TextPaint textPaint0 = textView0.getPaint();
        L.o(textPaint0, "getPaint(...)");
        m0.d = textPaint0;
        textPaint0.getTextBounds(s, 0, s.length(), rect0);
        return ((float)rect0.width()) + 15.0f;
    }

    private final void j() {
        this.itemView.setVisibility(8);
    }

    private final void k(View view0) {
        Object object0 = view0.getTag();
        Context context0 = Dl.b(view0);
        if(object0 instanceof Z) {
            Xk.i(((HomeActivity)context0), ((Z)object0).b());
        }
    }

    public final void l(@y4.m Boolean boolean0, boolean z) {
        V v0 = jl.a.B0();
        String s = (String)v0.a();
        List list0 = (List)v0.b();
        if(s.length() == 0 || list0.isEmpty()) {
            this.j();
            return;
        }
        this.f(s, list0, L.g(boolean0, Boolean.TRUE), z);
    }

    public static void m(m m0, Boolean boolean0, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        m0.l(boolean0, z);
    }
}

