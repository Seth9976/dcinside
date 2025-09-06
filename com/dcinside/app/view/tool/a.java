package com.dcinside.app.view.tool;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.dcinside.app.view.HackyDrawerLayout;
import java.lang.ref.WeakReference;
import y4.l;
import y4.m;

public abstract class a {
    private boolean a;
    @m
    private WeakReference b;

    public abstract void a(@l HackyDrawerLayout arg1, boolean arg2);

    private final void b(boolean z) {
        if(z) {
            if(!this.a) {
                this.a = true;
                WeakReference weakReference0 = this.b;
                if(weakReference0 != null) {
                    HackyDrawerLayout hackyDrawerLayout0 = (HackyDrawerLayout)weakReference0.get();
                    if(hackyDrawerLayout0 != null) {
                        this.a(hackyDrawerLayout0, true);
                    }
                }
            }
        }
        else if(this.a) {
            this.a = false;
            WeakReference weakReference1 = this.b;
            if(weakReference1 != null) {
                HackyDrawerLayout hackyDrawerLayout1 = (HackyDrawerLayout)weakReference1.get();
                if(hackyDrawerLayout1 != null) {
                    this.a(hackyDrawerLayout1, false);
                }
            }
        }
    }

    public final void c(@m MotionEvent motionEvent0) {
        Integer integer0 = motionEvent0 == null ? null : motionEvent0.getActionMasked();
        if(integer0 != null && ((int)integer0) == 0 || integer0 != null && ((int)integer0) == 2) {
            this.b(true);
            return;
        }
        if(integer0 != null && ((int)integer0) == 1 || integer0 != null && ((int)integer0) == 3 || integer0 != null && ((int)integer0) == 4) {
            this.b(false);
        }
    }

    private final HackyDrawerLayout d(View view0) {
        HackyDrawerLayout hackyDrawerLayout0 = null;
        if(view0 != null) {
            if(view0 instanceof HackyDrawerLayout) {
                return (HackyDrawerLayout)view0;
            }
            ViewParent viewParent0 = view0.getParent();
            if(viewParent0 instanceof View) {
                hackyDrawerLayout0 = (View)viewParent0;
            }
            return this.d(hackyDrawerLayout0);
        }
        return null;
    }

    public final void e(@m View view0) {
        View view1 = null;
        ViewParent viewParent0 = view0 == null ? null : view0.getParent();
        if(viewParent0 instanceof View) {
            view1 = (View)viewParent0;
        }
        HackyDrawerLayout hackyDrawerLayout0 = this.d(view1);
        if(hackyDrawerLayout0 != null) {
            this.b = new WeakReference(hackyDrawerLayout0);
        }
    }

    public final void f() {
        this.b(false);
    }
}

