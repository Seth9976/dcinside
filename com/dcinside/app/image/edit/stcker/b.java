package com.dcinside.app.image.edit.stcker;

import Y.e2;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.fragment.app.FragmentActivity;
import com.dcinside.app.image.edit.ImageEditActivity;
import com.dcinside.app.image.edit.a;
import com.dcinside.app.image.edit.d.e;
import com.dcinside.app.image.edit.d.g;
import com.dcinside.app.image.edit.d;
import com.dcinside.app.image.edit.j;
import com.dcinside.app.internal.r;
import com.dcinside.app.rx.h;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.wk;
import com.dcinside.app.view.tool.NonPredictiveLayoutManager;
import java.io.File;
import kotlin.S0;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.i;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;

@s0({"SMAP\nImageEditStickerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageEditStickerFragment.kt\ncom/dcinside/app/image/edit/stcker/ImageEditStickerFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,109:1\n255#2:110\n255#2:111\n257#2,2:112\n*S KotlinDebug\n*F\n+ 1 ImageEditStickerFragment.kt\ncom/dcinside/app/image/edit/stcker/ImageEditStickerFragment\n*L\n66#1:110\n91#1:111\n92#1:112,2\n*E\n"})
public final class b extends a implements g, com.dcinside.app.image.edit.stcker.a.a, com.dcinside.app.rx.a {
    private final com.dcinside.app.rx.a b;
    @m
    private e2 c;
    private d d;

    public b() {
        this(null, 1, null);
    }

    public b(@l com.dcinside.app.rx.a a0) {
        L.p(a0, "scope");
        super();
        this.b = a0;
    }

    public b(com.dcinside.app.rx.a a0, int v, w w0) {
        if((v & 1) != 0) {
            a0 = new h(null, 1, null);
        }
        this(a0);
    }

    @Override  // com.dcinside.app.image.edit.stcker.a$a
    public void g(int v) {
        @f(c = "com.dcinside.app.image.edit.stcker.ImageEditStickerFragment$onStickerSelected$1", f = "ImageEditStickerFragment.kt", i = {1}, l = {80, 70, 75, 80, 80}, m = "invokeSuspend", n = {"ctx"}, s = {"L$0"})
        static final class com.dcinside.app.image.edit.stcker.b.a extends o implements A3.o {
            Object k;
            int l;
            final b m;
            final int n;

            com.dcinside.app.image.edit.stcker.b.a(b b0, int v, kotlin.coroutines.d d0) {
                this.m = b0;
                this.n = v;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new com.dcinside.app.image.edit.stcker.b.a(this.m, this.n, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.image.edit.stcker.b.a)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @f(c = "com.dcinside.app.image.edit.stcker.ImageEditStickerFragment$onStickerSelected$1$1", f = "ImageEditStickerFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                @s0({"SMAP\nImageEditStickerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageEditStickerFragment.kt\ncom/dcinside/app/image/edit/stcker/ImageEditStickerFragment$onStickerSelected$1$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,109:1\n257#2,2:110\n*S KotlinDebug\n*F\n+ 1 ImageEditStickerFragment.kt\ncom/dcinside/app/image/edit/stcker/ImageEditStickerFragment$onStickerSelected$1$1\n*L\n72#1:110,2\n*E\n"})
                static final class com.dcinside.app.image.edit.stcker.b.a.a extends o implements A3.o {
                    int k;
                    private Object l;
                    final b m;

                    com.dcinside.app.image.edit.stcker.b.a.a(b b0, kotlin.coroutines.d d0) {
                        this.m = b0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        kotlin.coroutines.d d1 = new com.dcinside.app.image.edit.stcker.b.a.a(this.m, d0);
                        d1.l = object0;
                        return d1;
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.image.edit.stcker.b.a.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        if(!P.k(((O)this.l))) {
                            return S0.a;
                        }
                        e2 e20 = this.m.n0();
                        L.o(e20.e, "imageEditStickerProgress");
                        e20.e.setVisibility(0);
                        return S0.a;
                    }
                }


                @f(c = "com.dcinside.app.image.edit.stcker.ImageEditStickerFragment$onStickerSelected$1$2", f = "ImageEditStickerFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.image.edit.stcker.b.a.b extends o implements A3.o {
                    int k;
                    private Object l;
                    final b m;
                    final Bitmap n;

                    com.dcinside.app.image.edit.stcker.b.a.b(b b0, Bitmap bitmap0, kotlin.coroutines.d d0) {
                        this.m = b0;
                        this.n = bitmap0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        kotlin.coroutines.d d1 = new com.dcinside.app.image.edit.stcker.b.a.b(this.m, this.n, d0);
                        d1.l = object0;
                        return d1;
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.image.edit.stcker.b.a.b)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        if(!P.k(((O)this.l))) {
                            return S0.a;
                        }
                        d d0 = this.m.d;
                        if(d0 == null) {
                            L.S("editor");
                            d0 = null;
                        }
                        d0.i(this.n);
                        return S0.a;
                    }
                }


                @f(c = "com.dcinside.app.image.edit.stcker.ImageEditStickerFragment$onStickerSelected$1$3", f = "ImageEditStickerFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                @s0({"SMAP\nImageEditStickerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageEditStickerFragment.kt\ncom/dcinside/app/image/edit/stcker/ImageEditStickerFragment$onStickerSelected$1$3\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,109:1\n257#2,2:110\n*S KotlinDebug\n*F\n+ 1 ImageEditStickerFragment.kt\ncom/dcinside/app/image/edit/stcker/ImageEditStickerFragment$onStickerSelected$1$3\n*L\n82#1:110,2\n*E\n"})
                static final class c extends o implements A3.o {
                    int k;
                    private Object l;
                    final b m;

                    c(b b0, kotlin.coroutines.d d0) {
                        this.m = b0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        kotlin.coroutines.d d1 = new c(this.m, d0);
                        d1.l = object0;
                        return d1;
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((c)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        if(!P.k(((O)this.l))) {
                            return S0.a;
                        }
                        e2 e20 = this.m.n0();
                        L.o(e20.e, "imageEditStickerProgress");
                        e20.e.setVisibility(8);
                        return S0.a;
                    }
                }

                Throwable throwable0;
                Context context0;
                S0 s01;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.l) {
                    case 0: {
                        f0.n(object0);
                        try {
                            context0 = this.m.getContext();
                            if(context0 != null) {
                                com.dcinside.app.image.edit.stcker.b.a.a b$a$a0 = new com.dcinside.app.image.edit.stcker.b.a.a(this.m, null);
                                this.k = context0;
                                this.l = 2;
                                if(i.h(h0.e(), b$a$a0, this) == object1) {
                                    return object1;
                                }
                            label_24:
                                Bitmap bitmap0 = BitmapFactory.decodeResource(context0.getResources(), this.n);
                                com.dcinside.app.image.edit.stcker.b.a.b b$a$b0 = new com.dcinside.app.image.edit.stcker.b.a.b(this.m, bitmap0, null);
                                this.k = null;
                                this.l = 3;
                                if(i.h(h0.e(), b$a$b0, this) == object1) {
                                    return object1;
                                }
                                goto label_30;
                            }
                            goto label_35;
                        }
                        catch(Throwable throwable1) {
                            goto label_38;
                        }
                        return object1;
                    label_30:
                        c b$a$c0 = new c(this.m, null);
                        this.l = 4;
                        return i.h(h0.e(), b$a$c0, this) == object1 ? object1 : S0.a;
                        try {
                        label_35:
                            s01 = S0.a;
                        }
                        catch(Throwable throwable1) {
                        label_38:
                            c b$a$c1 = new c(this.m, null);
                            this.k = throwable1;
                            this.l = 5;
                            if(i.h(h0.e(), b$a$c1, this) == object1) {
                                return object1;
                            }
                            throwable0 = throwable1;
                            throw throwable0;
                        }
                        c b$a$c2 = new c(this.m, null);
                        this.k = s01;
                        this.l = 1;
                        return i.h(h0.e(), b$a$c2, this) == object1 ? object1 : s01;
                    }
                    case 1: {
                        S0 s00 = (S0)this.k;
                        f0.n(object0);
                        return s00;
                    }
                    case 2: {
                        context0 = (Context)this.k;
                        try {
                            f0.n(object0);
                            goto label_24;
                        }
                        catch(Throwable throwable1) {
                            goto label_38;
                        }
                    }
                    case 3: {
                        try {
                            f0.n(object0);
                            goto label_30;
                        }
                        catch(Throwable throwable1) {
                            goto label_38;
                        }
                    }
                    case 4: {
                        f0.n(object0);
                        return S0.a;
                    }
                    case 5: {
                        throwable0 = (Throwable)this.k;
                        f0.n(object0);
                        throw throwable0;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }

        e2 e20 = this.n0();
        L.o(e20.e, "imageEditStickerProgress");
        if(e20.e.getVisibility() == 0) {
            return;
        }
        k.f(this, null, null, new com.dcinside.app.image.edit.stcker.b.a(this, v, null), 3, null);
    }

    @Override  // kotlinx.coroutines.O
    @l
    public kotlin.coroutines.g getCoroutineContext() {
        return this.b.getCoroutineContext();
    }

    @Override  // com.dcinside.app.image.edit.a
    public void j0() {
        ProgressBar progressBar0 = this.n0().e;
        L.o(progressBar0, "imageEditStickerProgress");
        File file0 = wk.c.c();
        if(file0 == null) {
            return;
        }
        if(progressBar0.getVisibility() == 0) {
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

    private final e2 n0() {
        e2 e20 = this.c;
        L.m(e20);
        return e20;
    }

    @Override  // androidx.fragment.app.Fragment
    @l
    public View onCreateView(@l LayoutInflater layoutInflater0, @m ViewGroup viewGroup0, @m Bundle bundle0) {
        L.p(layoutInflater0, "inflater");
        this.c = e2.d(layoutInflater0, viewGroup0, false);
        View view0 = this.n0().b();
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
        e2 e20 = this.n0();
        L.o(e20.c, "imageEditStickerImg");
        Bitmap bitmap0 = BitmapFactory.decodeFile(this.i0());
        e20.c.getSource().setImageBitmap(bitmap0);
        e20.c.setVisibility(0);
        r.h(e20.c);
        d d0 = new e(view0.getContext(), e20.c).m(true).i();
        L.o(d0, "build(...)");
        this.d = d0;
        e2 e21 = this.n0();
        NonPredictiveLayoutManager nonPredictiveLayoutManager0 = new NonPredictiveLayoutManager(0, false);
        e21.d.setLayoutManager(nonPredictiveLayoutManager0);
        com.dcinside.app.image.edit.stcker.a a0 = new com.dcinside.app.image.edit.stcker.a(this, this.i0());
        e21.d.setAdapter(a0);
    }

    @Override  // com.dcinside.app.rx.a
    public void t() {
        this.b.t();
    }
}

