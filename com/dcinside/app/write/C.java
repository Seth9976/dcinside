package com.dcinside.app.write;

import A3.p;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.dcinside.app.internal.r;
import com.dcinside.app.util.Dk;
import com.dcinside.app.util.dl;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nHeadPopupGuideManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeadPopupGuideManager.kt\ncom/dcinside/app/write/HeadPopupGuideManager\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,84:1\n255#2:85\n327#2,4:86\n*S KotlinDebug\n*F\n+ 1 HeadPopupGuideManager.kt\ncom/dcinside/app/write/HeadPopupGuideManager\n*L\n27#1:85\n47#1:86,4\n*E\n"})
public class c {
    @m
    private PopupWindow a;

    @m
    public final PopupWindow a() {
        return this.a;
    }

    public final void b() {
        PopupWindow popupWindow0 = this.a;
        if(popupWindow0 != null) {
            popupWindow0.dismiss();
        }
        this.a = null;
    }

    public final void c(@m PopupWindow popupWindow0) {
        this.a = popupWindow0;
    }

    public final void d(@l com.dcinside.app.head.c c0, @m ViewGroup viewGroup0) {
        @f(c = "com.dcinside.app.write.HeadPopupGuideManager$showHeadGuide$1", f = "HeadPopupGuideManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements p {
            int k;
            final c l;

            a(c c0, d d0) {
                this.l = c0;
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
                PopupWindow popupWindow0 = this.l.a();
                if(popupWindow0 != null) {
                    popupWindow0.dismiss();
                }
                return S0.a;
            }
        }

        L.p(c0, "holder");
        if(c0.i().getVisibility() != 0 || viewGroup0 == null) {
            return;
        }
        boolean z = false;
        View view0 = LayoutInflater.from(c0.itemView.getContext()).inflate(0x7F0E0281, viewGroup0, false);  // layout:view_shield_head_guide
        L.o(view0, "inflate(...)");
        View view1 = view0.findViewById(0x7F0B0EFA);  // id:shield_head_guide_tip
        L.o(view1, "findViewById(...)");
        int v = Dk.b(0x7F0700F8);  // dimen:head_guide_width
        int v1 = Dk.b(0x7F0700F7);  // dimen:head_guide_tip_width
        int v2 = c0.i().getWidth();
        int v3 = Dk.b(0x7F0700FA);  // dimen:head_parent_padding
        boolean z1 = c0.itemView.getX() < 0.0f;
        PopupWindow popupWindow0 = null;
        r.M(view0, null, new a(this, null), 1, null);
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view1.getLayoutParams();
        if(viewGroup$LayoutParams0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        r.f0(view1, 0, 0, ((int)(z1 ? c0.j().getWidth() + v2 / 2 - v1 / 2 : v - c0.i().getPaddingEnd() - v1 - v2 / 2)), 0);
        view1.setLayoutParams(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0));
        if(!z1) {
            v3 = -(v - c0.itemView.getWidth() - v3);
        }
        int v4 = c0.itemView.getHeight();
        int v5 = Dk.b(0x7F0703D4);  // dimen:post_write_default_padding_vertical
        try {
            PopupWindow popupWindow1 = new PopupWindow(view0, -2, -2, false);
            popupWindow1.setAnimationStyle(0x1030000);
            popupWindow1.setTouchable(true);
            popupWindow1.setOutsideTouchable(true);
            popupWindow1.setBackgroundDrawable(new ColorDrawable(0));
            popupWindow1.showAsDropDown(c0.itemView, v3, -(v4 * 2 + v5));
            popupWindow0 = popupWindow1;
        }
        catch(Exception unused_ex) {
        }
        this.a = popupWindow0;
        dl dl0 = dl.a;
        if(popupWindow0 != null) {
            z = true;
        }
        dl0.O5(z);
    }
}

