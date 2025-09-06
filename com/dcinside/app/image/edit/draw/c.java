package com.dcinside.app.image.edit.draw;

import Y.Y1;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.dcinside.app.image.edit.ImageEditActivity;
import com.dcinside.app.image.edit.a;
import com.dcinside.app.image.edit.b;
import com.dcinside.app.image.edit.d.e;
import com.dcinside.app.image.edit.d.g;
import com.dcinside.app.image.edit.d;
import com.dcinside.app.image.edit.h;
import com.dcinside.app.image.edit.j;
import com.dcinside.app.image.edit.text.i;
import com.dcinside.app.internal.r;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.wk;
import com.dcinside.app.view.tool.NonPredictiveLayoutManager;
import java.io.File;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nImageEditDrawFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageEditDrawFragment.kt\ncom/dcinside/app/image/edit/draw/ImageEditDrawFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,151:1\n255#2:152\n255#2:156\n257#2,2:157\n1#3:153\n25#4:154\n25#4:155\n*S KotlinDebug\n*F\n+ 1 ImageEditDrawFragment.kt\ncom/dcinside/app/image/edit/draw/ImageEditDrawFragment\n*L\n72#1:152\n132#1:156\n134#1:157,2\n115#1:154\n121#1:155\n*E\n"})
public final class c extends a implements g, com.dcinside.app.image.edit.draw.a.a, h, com.dcinside.app.rx.a {
    private final com.dcinside.app.rx.a b;
    @m
    private Y1 c;
    private d d;

    public c() {
        this(null, 1, null);
    }

    public c(@l com.dcinside.app.rx.a a0) {
        L.p(a0, "scope");
        super();
        this.b = a0;
    }

    public c(com.dcinside.app.rx.a a0, int v, w w0) {
        if((v & 1) != 0) {
            a0 = new com.dcinside.app.rx.h(null, 1, null);
        }
        this(a0);
    }

    @Override  // com.dcinside.app.image.edit.h
    public void I(@m b b0) {
    }

    @Override  // com.dcinside.app.image.edit.h
    public void N(@m b b0, int v) {
        Y1 y10 = this.o0();
        L.o(y10.e, "imageEditDrawList");
        Adapter recyclerView$Adapter0 = y10.e.getAdapter();
        d d0 = null;
        if(!(recyclerView$Adapter0 instanceof com.dcinside.app.image.edit.draw.a)) {
            recyclerView$Adapter0 = null;
        }
        if(((com.dcinside.app.image.edit.draw.a)recyclerView$Adapter0) != null) {
            d d1 = this.d;
            if(d1 == null) {
                L.S("editor");
                d1 = null;
            }
            ((com.dcinside.app.image.edit.draw.a)recyclerView$Adapter0).C(d1.D());
        }
        if(((com.dcinside.app.image.edit.draw.a)recyclerView$Adapter0) != null) {
            d d2 = this.d;
            if(d2 == null) {
                L.S("editor");
            }
            else {
                d0 = d2;
            }
            ((com.dcinside.app.image.edit.draw.a)recyclerView$Adapter0).B(d0.C());
        }
    }

    @Override  // com.dcinside.app.image.edit.h
    public void P(@m b b0) {
    }

    @Override  // com.dcinside.app.image.edit.h
    public void f(@m View view0, @m String s, int v) {
    }

    @Override  // kotlinx.coroutines.O
    @l
    public kotlin.coroutines.g getCoroutineContext() {
        return this.b.getCoroutineContext();
    }

    @Override  // com.dcinside.app.image.edit.h
    public void j(@m b b0, int v) {
        Y1 y10 = this.o0();
        L.o(y10.e, "imageEditDrawList");
        Adapter recyclerView$Adapter0 = y10.e.getAdapter();
        d d0 = null;
        if(!(recyclerView$Adapter0 instanceof com.dcinside.app.image.edit.draw.a)) {
            recyclerView$Adapter0 = null;
        }
        if(((com.dcinside.app.image.edit.draw.a)recyclerView$Adapter0) != null) {
            d d1 = this.d;
            if(d1 == null) {
                L.S("editor");
                d1 = null;
            }
            ((com.dcinside.app.image.edit.draw.a)recyclerView$Adapter0).C(d1.D());
        }
        if(((com.dcinside.app.image.edit.draw.a)recyclerView$Adapter0) != null) {
            d d2 = this.d;
            if(d2 == null) {
                L.S("editor");
            }
            else {
                d0 = d2;
            }
            ((com.dcinside.app.image.edit.draw.a)recyclerView$Adapter0).B(d0.C());
        }
    }

    @Override  // com.dcinside.app.image.edit.a
    public void j0() {
        ProgressBar progressBar0 = this.o0().f;
        L.o(progressBar0, "imageEditDrawProgress");
        if(progressBar0.getVisibility() == 0) {
            return;
        }
        File file0 = wk.c.c();
        if(file0 == null) {
            return;
        }
        progressBar0.setVisibility(0);
        File file1 = new File(file0, System.nanoTime() + ".fix");
        j j0 = new com.dcinside.app.image.edit.j.a().e();
        d d0 = this.d;
        if(d0 == null) {
            L.S("editor");
            d0 = null;
        }
        d0.I(this, file1.getPath(), j0, this);
    }

    @Override  // com.dcinside.app.image.edit.draw.a$a
    public void l(int v) {
        d d0 = null;
        Y1 y10 = this.o0();
        L.o(y10.f, "imageEditDrawProgress");
        if(y10.f.getVisibility() == 0) {
            return;
        }
        switch(v) {
            case 0: {
                d d1 = this.d;
                if(d1 == null) {
                    L.S("editor");
                }
                else {
                    d0 = d1;
                }
                d0.Q();
                return;
            }
            case 1: {
                d d2 = this.d;
                if(d2 == null) {
                    L.S("editor");
                }
                else {
                    d0 = d2;
                }
                d0.G();
                return;
            }
            case 2: {
                FrameLayout frameLayout0 = this.o0().b;
                if(frameLayout0.getChildCount() > 0) {
                    View view0 = frameLayout0.getChildAt(0);
                    if(view0.getVisibility() == 0) {
                        view0.setVisibility(8);
                        return;
                    }
                    view0.setVisibility(0);
                }
            }
        }
    }

    private final void m0(View view0) {
        FrameLayout.LayoutParams frameLayout$LayoutParams0;
        FrameLayout frameLayout0 = this.o0().b;
        boolean z = view0 != null;
        frameLayout0.setClickable(z);
        if(z) {
            frameLayout0.removeAllViews();
            if(view0 == null) {
                frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(-2, -2);
            }
            else {
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
                frameLayout$LayoutParams0 = viewGroup$LayoutParams0 == null ? new FrameLayout.LayoutParams(-2, -2) : new FrameLayout.LayoutParams(viewGroup$LayoutParams0);
            }
            frameLayout$LayoutParams0.gravity = 17;
            frameLayout0.addView(view0, frameLayout$LayoutParams0);
        }
        frameLayout0.animate().cancel();
        frameLayout0.animate().alpha((z ? 1.0f : 0.0f)).withEndAction(() -> {
            L.p(frameLayout0, "$it");
            if(!z) {
                frameLayout0.removeAllViews();
            }
        }).start();
    }

    // 检测为 Lambda 实现
    private static final void n0(boolean z, FrameLayout frameLayout0) [...]

    private final Y1 o0() {
        Y1 y10 = this.c;
        L.m(y10);
        return y10;
    }

    @Override  // androidx.fragment.app.Fragment
    @l
    public View onCreateView(@l LayoutInflater layoutInflater0, @m ViewGroup viewGroup0, @m Bundle bundle0) {
        L.p(layoutInflater0, "inflater");
        this.c = Y1.d(layoutInflater0, viewGroup0, false);
        View view0 = this.o0().b();
        L.o(view0, "getRoot(...)");
        return view0;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.t();
        this.c = null;
    }

    @Override  // com.dcinside.app.image.edit.d$g
    public void onFailure(@l Exception exception0) {
        L.p(exception0, "exception");
        timber.log.b.a.y(exception0);
        Context context0 = this.getContext();
        if(context0 == null) {
            return;
        }
        Dl.G(context0, exception0.getMessage());
        FragmentActivity fragmentActivity0 = this.getActivity();
        ImageEditActivity imageEditActivity0 = fragmentActivity0 instanceof ImageEditActivity ? ((ImageEditActivity)fragmentActivity0) : null;
        if(imageEditActivity0 != null) {
            imageEditActivity0.X1(null);
        }
    }

    @Override  // com.dcinside.app.image.edit.d$g
    public void onSuccess(@l String s) {
        L.p(s, "path");
        FragmentActivity fragmentActivity0 = this.getActivity();
        ImageEditActivity imageEditActivity0 = fragmentActivity0 instanceof ImageEditActivity ? ((ImageEditActivity)fragmentActivity0) : null;
        if(imageEditActivity0 != null) {
            imageEditActivity0.X1(s);
        }
    }

    @Override  // com.dcinside.app.image.edit.a
    public void onViewCreated(@l View view0, @m Bundle bundle0) {
        L.p(view0, "view");
        super.onViewCreated(view0, bundle0);
        Y1 y10 = this.o0();
        L.o(y10.d, "imageEditDrawImg");
        Bitmap bitmap0 = BitmapFactory.decodeFile(this.i0());
        y10.d.getSource().setImageBitmap(bitmap0);
        y10.d.setVisibility(0);
        r.h(y10.d);
        d d0 = new e(view0.getContext(), y10.d).i();
        L.o(d0, "build(...)");
        this.d = d0;
        d d1 = null;
        if(d0 == null) {
            L.S("editor");
            d0 = null;
        }
        d0.K(true);
        d d2 = this.d;
        if(d2 == null) {
            L.S("editor");
            d2 = null;
        }
        d2.O(this);
        Y1 y11 = this.o0();
        NonPredictiveLayoutManager nonPredictiveLayoutManager0 = new NonPredictiveLayoutManager(0, false);
        y11.e.setLayoutManager(nonPredictiveLayoutManager0);
        com.dcinside.app.image.edit.draw.a a0 = new com.dcinside.app.image.edit.draw.a(this, this.i0());
        y11.e.setAdapter(a0);
        i i0 = i.a;
        ViewGroup viewGroup0 = view0 instanceof ViewGroup ? ((ViewGroup)view0) : null;
        if(viewGroup0 == null) {
            return;
        }
        d d3 = this.d;
        if(d3 == null) {
            L.S("editor");
        }
        else {
            d1 = d3;
        }
        this.m0(i0.e(viewGroup0, d1));
    }

    @Override  // com.dcinside.app.rx.a
    public void t() {
        this.b.t();
    }
}

