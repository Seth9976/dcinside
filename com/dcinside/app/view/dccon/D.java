package com.dcinside.app.view.dccon;

import A3.p;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.dcinside.app.internal.r;
import kotlin.S0;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

public final class d {
    @m
    private PopupWindow a;

    public final void b() {
        PopupWindow popupWindow0 = this.a;
        if(popupWindow0 != null) {
            popupWindow0.dismiss();
        }
        this.a = null;
    }

    public final void c(@l View view0, @m ViewGroup viewGroup0) {
        @f(c = "com.dcinside.app.view.dccon.BigDcconGuideManager$showBigDcconGuide$1", f = "BigDcconGuideManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends o implements p {
            int k;
            final d l;

            a(d d0, kotlin.coroutines.d d1) {
                this.l = d0;
                super(3, d1);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                return new a(this.l, d0).invokeSuspend(S0.a);
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
                PopupWindow popupWindow0 = this.l.a;
                if(popupWindow0 != null) {
                    popupWindow0.dismiss();
                }
                return S0.a;
            }
        }

        L.p(view0, "view");
        if(viewGroup0 == null) {
            return;
        }
        View view1 = LayoutInflater.from(view0.getContext()).inflate(0x7F0E019F, viewGroup0, false);  // layout:view_big_dccon_guide
        L.o(view1, "inflate(...)");
        PopupWindow popupWindow0 = null;
        r.M(view1, null, new a(this, null), 1, null);
        try {
            PopupWindow popupWindow1 = new PopupWindow(view1, -2, -2, false);
            popupWindow1.setAnimationStyle(0x1030000);
            popupWindow1.setTouchable(true);
            popupWindow1.setOutsideTouchable(true);
            popupWindow1.setBackgroundDrawable(new ColorDrawable(0));
            popupWindow1.showAsDropDown(view0, 0, 0);
            popupWindow0 = popupWindow1;
        }
        catch(Exception unused_ex) {
        }
        this.a = popupWindow0;
    }
}

