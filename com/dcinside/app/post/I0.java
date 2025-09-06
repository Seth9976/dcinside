package com.dcinside.app.post;

import Y.L2;
import Y.W;
import android.view.View;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.dcinside.app.view.ContentProgressBar;
import com.dcinside.app.view.HackyDrawerLayout;
import kotlin.jvm.internal.L;
import y4.l;

public final class i0 implements g0 {
    @l
    private final W a;

    public i0(@l W w0) {
        L.p(w0, "binding");
        super();
        this.a = w0;
    }

    @Override  // com.dcinside.app.post.g0
    @l
    public CoordinatorLayout a() {
        L.o(this.a.e, "postContainerFragmentList");
        return this.a.e;
    }

    @Override  // com.dcinside.app.post.g0
    @l
    public FrameLayout b() {
        L.o(this.a.b, "archiveQuickPlace");
        return this.a.b;
    }

    @Override  // com.dcinside.app.post.g0
    @l
    public View c() {
        L.o(this.a.i, "postContainerReadDummyBar");
        return this.a.i;
    }

    @Override  // com.dcinside.app.post.g0
    @l
    public ContentProgressBar d() {
        L.o(this.a.d, "postContainerContentProgress");
        return this.a.d;
    }

    @Override  // com.dcinside.app.post.g0
    @l
    public CoordinatorLayout e() {
        L.o(this.a.h, "postContainerFragments");
        return this.a.h;
    }

    @Override  // com.dcinside.app.post.g0
    @l
    public HackyDrawerLayout f() {
        L.o(this.a.k, "postContainerSlide");
        return this.a.k;
    }

    @Override  // com.dcinside.app.post.g0
    @l
    public L2 g() {
        L.o(this.a.j, "postContainerSideMenu");
        return this.a.j;
    }

    @Override  // com.dcinside.app.post.g0
    @l
    public CoordinatorLayout getRoot() {
        CoordinatorLayout coordinatorLayout0 = this.a.b();
        L.o(coordinatorLayout0, "getRoot(...)");
        return coordinatorLayout0;
    }

    @Override  // com.dcinside.app.post.g0
    @l
    public CoordinatorLayout h() {
        L.o(this.a.g, "postContainerFragmentRead");
        return this.a.g;
    }

    @Override  // com.dcinside.app.post.g0
    @l
    public CoordinatorLayout i() {
        L.o(this.a.f, "postContainerFragmentOthers");
        return this.a.f;
    }

    @Override  // com.dcinside.app.post.g0
    @l
    public HackyDrawerLayout j() {
        L.o(this.a.l, "postContainerSlideRight");
        return this.a.l;
    }

    @Override  // com.dcinside.app.post.g0
    @l
    public FrameLayout k() {
        L.o(this.a.c, "imageNoteInputView");
        return this.a.c;
    }
}

