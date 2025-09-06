package com.dcinside.app.image.edit.emoji;

import Y.Z1;
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

@s0({"SMAP\nImageEditEmojiFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageEditEmojiFragment.kt\ncom/dcinside/app/image/edit/emoji/ImageEditEmojiFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,108:1\n255#2:109\n255#2:110\n257#2,2:111\n*S KotlinDebug\n*F\n+ 1 ImageEditEmojiFragment.kt\ncom/dcinside/app/image/edit/emoji/ImageEditEmojiFragment\n*L\n67#1:109\n89#1:110\n91#1:111,2\n*E\n"})
public final class b extends a implements g, com.dcinside.app.image.edit.emoji.a.a, com.dcinside.app.rx.a {
    private final com.dcinside.app.rx.a b;
    @m
    private Z1 c;
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

    @Override  // kotlinx.coroutines.O
    @l
    public kotlin.coroutines.g getCoroutineContext() {
        return this.b.getCoroutineContext();
    }

    @Override  // com.dcinside.app.image.edit.a
    public void j0() {
        ProgressBar progressBar0 = this.n0().e;
        L.o(progressBar0, "imageEditEmojiProgress");
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

    private final Z1 n0() {
        Z1 z10 = this.c;
        L.m(z10);
        return z10;
    }

    @Override  // androidx.fragment.app.Fragment
    @l
    public View onCreateView(@l LayoutInflater layoutInflater0, @m ViewGroup viewGroup0, @m Bundle bundle0) {
        L.p(layoutInflater0, "inflater");
        this.c = Z1.d(layoutInflater0, viewGroup0, false);
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
        Z1 z10 = this.n0();
        L.o(z10.c, "imageEditEmojiImg");
        Bitmap bitmap0 = BitmapFactory.decodeFile(this.i0());
        z10.c.getSource().setImageBitmap(bitmap0);
        z10.c.setVisibility(0);
        r.h(z10.c);
        d d0 = new e(view0.getContext(), z10.c).m(true).i();
        L.o(d0, "build(...)");
        this.d = d0;
        Z1 z11 = this.n0();
        NonPredictiveLayoutManager nonPredictiveLayoutManager0 = new NonPredictiveLayoutManager(0, false);
        z11.d.setLayoutManager(nonPredictiveLayoutManager0);
        com.dcinside.app.image.edit.emoji.a a0 = new com.dcinside.app.image.edit.emoji.a(this, this.i0());
        z11.d.setAdapter(a0);
    }

    @Override  // com.dcinside.app.rx.a
    public void t() {
        this.b.t();
    }

    @Override  // com.dcinside.app.image.edit.emoji.a$a
    public void v(@l String s) {
        @f(c = "com.dcinside.app.image.edit.emoji.ImageEditEmojiFragment$onEmojiSelected$1", f = "ImageEditEmojiFragment.kt", i = {}, l = {70, 74, 0x4F, 0x4F}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.image.edit.emoji.b.a extends o implements A3.o {
            Object k;
            int l;
            final b m;
            final String n;

            com.dcinside.app.image.edit.emoji.b.a(b b0, String s, kotlin.coroutines.d d0) {
                this.m = b0;
                this.n = s;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new com.dcinside.app.image.edit.emoji.b.a(this.m, this.n, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.image.edit.emoji.b.a)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @f(c = "com.dcinside.app.image.edit.emoji.ImageEditEmojiFragment$onEmojiSelected$1$1", f = "ImageEditEmojiFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                @s0({"SMAP\nImageEditEmojiFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageEditEmojiFragment.kt\ncom/dcinside/app/image/edit/emoji/ImageEditEmojiFragment$onEmojiSelected$1$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,108:1\n257#2,2:109\n*S KotlinDebug\n*F\n+ 1 ImageEditEmojiFragment.kt\ncom/dcinside/app/image/edit/emoji/ImageEditEmojiFragment$onEmojiSelected$1$1\n*L\n72#1:109,2\n*E\n"})
                static final class com.dcinside.app.image.edit.emoji.b.a.a extends o implements A3.o {
                    int k;
                    private Object l;
                    final b m;

                    com.dcinside.app.image.edit.emoji.b.a.a(b b0, kotlin.coroutines.d d0) {
                        this.m = b0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        kotlin.coroutines.d d1 = new com.dcinside.app.image.edit.emoji.b.a.a(this.m, d0);
                        d1.l = object0;
                        return d1;
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.image.edit.emoji.b.a.a)this.create(o0, d0)).invokeSuspend(S0.a);
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
                        Z1 z10 = this.m.n0();
                        L.o(z10.e, "imageEditEmojiProgress");
                        z10.e.setVisibility(0);
                        return S0.a;
                    }
                }


                @f(c = "com.dcinside.app.image.edit.emoji.ImageEditEmojiFragment$onEmojiSelected$1$2", f = "ImageEditEmojiFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.image.edit.emoji.b.a.b extends o implements A3.o {
                    int k;
                    private Object l;
                    final b m;
                    final String n;

                    com.dcinside.app.image.edit.emoji.b.a.b(b b0, String s, kotlin.coroutines.d d0) {
                        this.m = b0;
                        this.n = s;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        kotlin.coroutines.d d1 = new com.dcinside.app.image.edit.emoji.b.a.b(this.m, this.n, d0);
                        d1.l = object0;
                        return d1;
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.image.edit.emoji.b.a.b)this.create(o0, d0)).invokeSuspend(S0.a);
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
                        d0.h(this.n);
                        return S0.a;
                    }
                }


                @f(c = "com.dcinside.app.image.edit.emoji.ImageEditEmojiFragment$onEmojiSelected$1$3", f = "ImageEditEmojiFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                @s0({"SMAP\nImageEditEmojiFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageEditEmojiFragment.kt\ncom/dcinside/app/image/edit/emoji/ImageEditEmojiFragment$onEmojiSelected$1$3\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,108:1\n257#2,2:109\n*S KotlinDebug\n*F\n+ 1 ImageEditEmojiFragment.kt\ncom/dcinside/app/image/edit/emoji/ImageEditEmojiFragment$onEmojiSelected$1$3\n*L\n81#1:109,2\n*E\n"})
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
                        Z1 z10 = this.m.n0();
                        L.o(z10.e, "imageEditEmojiProgress");
                        z10.e.setVisibility(8);
                        return S0.a;
                    }
                }

                Object object1 = kotlin.coroutines.intrinsics.b.l();
                try {
                    switch(this.l) {
                        case 0: {
                            goto label_12;
                        }
                        case 1: {
                            goto label_10;
                        }
                        case 2: {
                            goto label_8;
                        }
                        case 3: {
                            goto label_3;
                        }
                        case 4: {
                            goto label_5;
                        }
                    }
                }
                catch(Throwable throwable0) {
                    goto label_22;
                }
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            label_3:
                f0.n(object0);
                return S0.a;
            label_5:
                Throwable throwable1 = (Throwable)this.k;
                f0.n(object0);
                throw throwable1;
                try {
                label_8:
                    f0.n(object0);
                    goto label_30;
                label_10:
                    f0.n(object0);
                    goto label_17;
                }
                catch(Throwable throwable0) {
                    goto label_22;
                }
            label_12:
                f0.n(object0);
                try {
                    com.dcinside.app.image.edit.emoji.b.a.a b$a$a0 = new com.dcinside.app.image.edit.emoji.b.a.a(this.m, null);
                    this.l = 1;
                    if(i.h(h0.e(), b$a$a0, this) == object1) {
                        return object1;
                    }
                label_17:
                    com.dcinside.app.image.edit.emoji.b.a.b b$a$b0 = new com.dcinside.app.image.edit.emoji.b.a.b(this.m, this.n, null);
                    this.l = 2;
                    if(i.h(h0.e(), b$a$b0, this) == object1) {
                        return object1;
                    }
                    goto label_30;
                }
                catch(Throwable throwable0) {
                }
            label_22:
                c b$a$c0 = new c(this.m, null);
                this.k = throwable0;
                this.l = 4;
                if(i.h(h0.e(), b$a$c0, this) == object1) {
                    return object1;
                }
                throwable1 = throwable0;
                throw throwable1;
            label_30:
                c b$a$c1 = new c(this.m, null);
                this.l = 3;
                return i.h(h0.e(), b$a$c1, this) == object1 ? object1 : S0.a;
            }
        }

        L.p(s, "emoji");
        Z1 z10 = this.n0();
        L.o(z10.e, "imageEditEmojiProgress");
        if(z10.e.getVisibility() == 0) {
            return;
        }
        k.f(this, null, null, new com.dcinside.app.image.edit.emoji.b.a(this, s, null), 3, null);
    }
}

