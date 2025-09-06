package com.dcinside.app.image.edit.filter;

import Y.a2;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.davemorrissey.labs.subscaleview.ImageSource;
import com.dcinside.app.Application;
import com.dcinside.app.image.edit.ImageEditActivity;
import com.dcinside.app.image.edit.a;
import com.dcinside.app.rx.h;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.wk;
import com.dcinside.app.view.tool.NonPredictiveLayoutManager;
import java.io.File;
import kotlin.S0;
import kotlin.V;
import kotlin.coroutines.g;
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

@s0({"SMAP\nImageEditFilterFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageEditFilterFragment.kt\ncom/dcinside/app/image/edit/filter/ImageEditFilterFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,142:1\n255#2:143\n255#2:144\n*S KotlinDebug\n*F\n+ 1 ImageEditFilterFragment.kt\ncom/dcinside/app/image/edit/filter/ImageEditFilterFragment\n*L\n67#1:143\n98#1:144\n*E\n"})
public final class b extends a implements com.dcinside.app.image.edit.filter.a.a, com.dcinside.app.rx.a {
    private final com.dcinside.app.rx.a b;
    @m
    private a2 c;
    @l
    private final V[] d;
    @m
    private Bitmap e;

    public b() {
        this(null, 1, null);
    }

    public b(@l com.dcinside.app.rx.a a0) {
        L.p(a0, "scope");
        super();
        this.b = a0;
        Context context0 = Application.e.c();
        this.d = d.a.b(context0);
    }

    public b(com.dcinside.app.rx.a a0, int v, w w0) {
        if((v & 1) != 0) {
            a0 = new h(null, 1, null);
        }
        this(a0);
    }

    @Override  // com.dcinside.app.image.edit.filter.a$a
    public void L(@l Y2.a a0) {
        @f(c = "com.dcinside.app.image.edit.filter.ImageEditFilterFragment$onFilterSelected$1", f = "ImageEditFilterFragment.kt", i = {}, l = {70, 77, 83, 83}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.image.edit.filter.b.a extends o implements A3.o {
            Object k;
            int l;
            final b m;
            final Y2.a n;

            com.dcinside.app.image.edit.filter.b.a(b b0, Y2.a a0, kotlin.coroutines.d d0) {
                this.m = b0;
                this.n = a0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new com.dcinside.app.image.edit.filter.b.a(this.m, this.n, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.image.edit.filter.b.a)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @f(c = "com.dcinside.app.image.edit.filter.ImageEditFilterFragment$onFilterSelected$1$1", f = "ImageEditFilterFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                @s0({"SMAP\nImageEditFilterFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageEditFilterFragment.kt\ncom/dcinside/app/image/edit/filter/ImageEditFilterFragment$onFilterSelected$1$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,142:1\n257#2,2:143\n*S KotlinDebug\n*F\n+ 1 ImageEditFilterFragment.kt\ncom/dcinside/app/image/edit/filter/ImageEditFilterFragment$onFilterSelected$1$1\n*L\n72#1:143,2\n*E\n"})
                static final class com.dcinside.app.image.edit.filter.b.a.a extends o implements A3.o {
                    int k;
                    private Object l;
                    final b m;

                    com.dcinside.app.image.edit.filter.b.a.a(b b0, kotlin.coroutines.d d0) {
                        this.m = b0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        kotlin.coroutines.d d1 = new com.dcinside.app.image.edit.filter.b.a.a(this.m, d0);
                        d1.l = object0;
                        return d1;
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.image.edit.filter.b.a.a)this.create(o0, d0)).invokeSuspend(S0.a);
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
                        a2 a20 = this.m.p0();
                        L.o(a20.e, "imageEditFilterProgress");
                        a20.e.setVisibility(0);
                        return S0.a;
                    }
                }


                @f(c = "com.dcinside.app.image.edit.filter.ImageEditFilterFragment$onFilterSelected$1$2", f = "ImageEditFilterFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.image.edit.filter.b.a.b extends o implements A3.o {
                    int k;
                    private Object l;
                    final b m;
                    final Bitmap n;

                    com.dcinside.app.image.edit.filter.b.a.b(b b0, Bitmap bitmap0, kotlin.coroutines.d d0) {
                        this.m = b0;
                        this.n = bitmap0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        kotlin.coroutines.d d1 = new com.dcinside.app.image.edit.filter.b.a.b(this.m, this.n, d0);
                        d1.l = object0;
                        return d1;
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.image.edit.filter.b.a.b)this.create(o0, d0)).invokeSuspend(S0.a);
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
                        a2 a20 = this.m.p0();
                        L.o(a20.c, "imageEditFilterImg");
                        ImageSource imageSource0 = ImageSource.bitmap(this.n);
                        a20.c.setImage(imageSource0);
                        return S0.a;
                    }
                }


                @f(c = "com.dcinside.app.image.edit.filter.ImageEditFilterFragment$onFilterSelected$1$3", f = "ImageEditFilterFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                @s0({"SMAP\nImageEditFilterFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageEditFilterFragment.kt\ncom/dcinside/app/image/edit/filter/ImageEditFilterFragment$onFilterSelected$1$3\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,142:1\n257#2,2:143\n*S KotlinDebug\n*F\n+ 1 ImageEditFilterFragment.kt\ncom/dcinside/app/image/edit/filter/ImageEditFilterFragment$onFilterSelected$1$3\n*L\n85#1:143,2\n*E\n"})
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
                        a2 a20 = this.m.p0();
                        L.o(a20.e, "imageEditFilterProgress");
                        a20.e.setVisibility(8);
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
                    goto label_27;
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
                    goto label_35;
                label_10:
                    f0.n(object0);
                    goto label_17;
                }
                catch(Throwable throwable0) {
                    goto label_27;
                }
            label_12:
                f0.n(object0);
                try {
                    com.dcinside.app.image.edit.filter.b.a.a b$a$a0 = new com.dcinside.app.image.edit.filter.b.a.a(this.m, null);
                    this.l = 1;
                    if(i.h(h0.e(), b$a$a0, this) == object1) {
                        return object1;
                    }
                label_17:
                    Bitmap bitmap0 = this.m.q0(this.n);
                    Bitmap bitmap1 = this.m.e;
                    if(bitmap1 != null) {
                        bitmap1.recycle();
                    }
                    this.m.e = bitmap0;
                    com.dcinside.app.image.edit.filter.b.a.b b$a$b0 = new com.dcinside.app.image.edit.filter.b.a.b(this.m, bitmap0, null);
                    this.l = 2;
                    if(i.h(h0.e(), b$a$b0, this) == object1) {
                        return object1;
                    }
                    goto label_35;
                }
                catch(Throwable throwable0) {
                }
            label_27:
                c b$a$c0 = new c(this.m, null);
                this.k = throwable0;
                this.l = 4;
                if(i.h(h0.e(), b$a$c0, this) == object1) {
                    return object1;
                }
                throwable1 = throwable0;
                throw throwable1;
            label_35:
                c b$a$c1 = new c(this.m, null);
                this.l = 3;
                return i.h(h0.e(), b$a$c1, this) == object1 ? object1 : S0.a;
            }
        }

        L.p(a0, "filter");
        a2 a20 = this.p0();
        L.o(a20.e, "imageEditFilterProgress");
        if(a20.e.getVisibility() == 0) {
            return;
        }
        k.f(this, null, null, new com.dcinside.app.image.edit.filter.b.a(this, a0, null), 3, null);
    }

    @Override  // kotlinx.coroutines.O
    @l
    public g getCoroutineContext() {
        return this.b.getCoroutineContext();
    }

    @Override  // com.dcinside.app.image.edit.a
    public void j0() {
        @f(c = "com.dcinside.app.image.edit.filter.ImageEditFilterFragment$save$1", f = "ImageEditFilterFragment.kt", i = {1}, l = {108, 0x72, 0x7A, 0x83}, m = "invokeSuspend", n = {"parent"}, s = {"L$0"})
        static final class com.dcinside.app.image.edit.filter.b.b extends o implements A3.o {
            Object k;
            int l;
            final Bitmap m;
            final b n;

            com.dcinside.app.image.edit.filter.b.b(Bitmap bitmap0, b b0, kotlin.coroutines.d d0) {
                this.m = bitmap0;
                this.n = b0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new com.dcinside.app.image.edit.filter.b.b(this.m, this.n, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.image.edit.filter.b.b)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @f(c = "com.dcinside.app.image.edit.filter.ImageEditFilterFragment$save$1$1", f = "ImageEditFilterFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.image.edit.filter.b.b.a extends o implements A3.o {
                    int k;
                    private Object l;
                    final b m;

                    com.dcinside.app.image.edit.filter.b.b.a(b b0, kotlin.coroutines.d d0) {
                        this.m = b0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        kotlin.coroutines.d d1 = new com.dcinside.app.image.edit.filter.b.b.a(this.m, d0);
                        d1.l = object0;
                        return d1;
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.image.edit.filter.b.b.a)this.create(o0, d0)).invokeSuspend(S0.a);
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
                        FragmentActivity fragmentActivity0 = this.m.getActivity();
                        ImageEditActivity imageEditActivity0 = fragmentActivity0 instanceof ImageEditActivity ? ((ImageEditActivity)fragmentActivity0) : null;
                        if(imageEditActivity0 != null) {
                            imageEditActivity0.X1(null);
                        }
                        return S0.a;
                    }
                }


                @f(c = "com.dcinside.app.image.edit.filter.ImageEditFilterFragment$save$1$2", f = "ImageEditFilterFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                @s0({"SMAP\nImageEditFilterFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageEditFilterFragment.kt\ncom/dcinside/app/image/edit/filter/ImageEditFilterFragment$save$1$2\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,142:1\n257#2,2:143\n*S KotlinDebug\n*F\n+ 1 ImageEditFilterFragment.kt\ncom/dcinside/app/image/edit/filter/ImageEditFilterFragment$save$1$2\n*L\n116#1:143,2\n*E\n"})
                static final class com.dcinside.app.image.edit.filter.b.b.b extends o implements A3.o {
                    int k;
                    private Object l;
                    final b m;

                    com.dcinside.app.image.edit.filter.b.b.b(b b0, kotlin.coroutines.d d0) {
                        this.m = b0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        kotlin.coroutines.d d1 = new com.dcinside.app.image.edit.filter.b.b.b(this.m, d0);
                        d1.l = object0;
                        return d1;
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.image.edit.filter.b.b.b)this.create(o0, d0)).invokeSuspend(S0.a);
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
                        a2 a20 = this.m.p0();
                        L.o(a20.e, "imageEditFilterProgress");
                        a20.e.setVisibility(0);
                        return S0.a;
                    }
                }


                @f(c = "com.dcinside.app.image.edit.filter.ImageEditFilterFragment$save$1$3", f = "ImageEditFilterFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.image.edit.filter.b.b.c extends o implements A3.o {
                    int k;
                    private Object l;
                    final boolean m;
                    final b n;
                    final File o;

                    com.dcinside.app.image.edit.filter.b.b.c(boolean z, b b0, File file0, kotlin.coroutines.d d0) {
                        this.m = z;
                        this.n = b0;
                        this.o = file0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        kotlin.coroutines.d d1 = new com.dcinside.app.image.edit.filter.b.b.c(this.m, this.n, this.o, d0);
                        d1.l = object0;
                        return d1;
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.image.edit.filter.b.b.c)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        ImageEditActivity imageEditActivity0 = null;
                        f0.n(object0);
                        if(!P.k(((O)this.l))) {
                            return S0.a;
                        }
                        if(this.m) {
                            FragmentActivity fragmentActivity0 = this.n.getActivity();
                            if(fragmentActivity0 instanceof ImageEditActivity) {
                                imageEditActivity0 = (ImageEditActivity)fragmentActivity0;
                            }
                            if(imageEditActivity0 != null) {
                                imageEditActivity0.X1(this.o.getPath());
                                return S0.a;
                            }
                        }
                        else {
                            FragmentActivity fragmentActivity1 = this.n.getActivity();
                            ImageEditActivity imageEditActivity1 = fragmentActivity1 instanceof ImageEditActivity ? ((ImageEditActivity)fragmentActivity1) : null;
                            if(imageEditActivity1 != null) {
                                imageEditActivity1.X1(null);
                            }
                        }
                        return S0.a;
                    }
                }


                @f(c = "com.dcinside.app.image.edit.filter.ImageEditFilterFragment$save$1$4", f = "ImageEditFilterFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.image.edit.filter.b.b.d extends o implements A3.o {
                    int k;
                    private Object l;
                    final b m;
                    final Exception n;

                    com.dcinside.app.image.edit.filter.b.b.d(b b0, Exception exception0, kotlin.coroutines.d d0) {
                        this.m = b0;
                        this.n = exception0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        kotlin.coroutines.d d1 = new com.dcinside.app.image.edit.filter.b.b.d(this.m, this.n, d0);
                        d1.l = object0;
                        return d1;
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.image.edit.filter.b.b.d)this.create(o0, d0)).invokeSuspend(S0.a);
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
                        FragmentActivity fragmentActivity0 = this.m.getActivity();
                        ImageEditActivity imageEditActivity0 = fragmentActivity0 instanceof ImageEditActivity ? ((ImageEditActivity)fragmentActivity0) : null;
                        if(imageEditActivity0 != null) {
                            imageEditActivity0.X1(null);
                        }
                        Context context0 = this.m.getContext();
                        if(context0 == null) {
                            return S0.a;
                        }
                        Dl.G(context0, this.n.getMessage());
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
                            goto label_7;
                        }
                        case 2: {
                            goto label_9;
                        }
                        case 3: {
                            goto label_5;
                        }
                        case 4: {
                            goto label_3;
                        }
                    }
                }
                catch(Exception exception0) {
                    goto label_34;
                }
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            label_3:
                f0.n(object0);
                return S0.a;
                try {
                label_5:
                    f0.n(object0);
                    return S0.a;
                label_7:
                    f0.n(object0);
                    return S0.a;
                }
                catch(Exception exception0) {
                    goto label_34;
                }
            label_9:
                File file0 = (File)this.k;
                try {
                    f0.n(object0);
                    goto label_25;
                }
                catch(Exception exception0) {
                    goto label_34;
                }
            label_12:
                f0.n(object0);
                try {
                    file0 = wk.c.c();
                    if(file0 == null) {
                        com.dcinside.app.image.edit.filter.b.b.a b$b$a0 = new com.dcinside.app.image.edit.filter.b.b.a(this.n, null);
                        this.l = 1;
                        return i.h(h0.e(), b$b$a0, this) == object1 ? object1 : S0.a;
                    }
                    com.dcinside.app.image.edit.filter.b.b.b b$b$b0 = new com.dcinside.app.image.edit.filter.b.b.b(this.n, null);
                    this.k = file0;
                    this.l = 2;
                    if(i.h(h0.e(), b$b$b0, this) == object1) {
                        return object1;
                    }
                label_25:
                    File file1 = new File(file0, System.nanoTime() + ".fix");
                    boolean z = com.dcinside.app.internal.a.c(this.m, file1, null, 0, 6, null);
                    this.m.recycle();
                    com.dcinside.app.image.edit.filter.b.b.c b$b$c0 = new com.dcinside.app.image.edit.filter.b.b.c(z, this.n, file1, null);
                    this.k = null;
                    this.l = 3;
                    if(i.h(h0.e(), b$b$c0, this) == object1) {
                        return object1;
                    }
                }
                catch(Exception exception0) {
                label_34:
                    com.dcinside.app.image.edit.filter.b.b.d b$b$d0 = new com.dcinside.app.image.edit.filter.b.b.d(this.n, exception0, null);
                    this.k = null;
                    this.l = 4;
                    if(i.h(h0.e(), b$b$d0, this) == object1) {
                        return object1;
                    }
                }
                return S0.a;
            }
        }

        a2 a20 = this.p0();
        L.o(a20.e, "imageEditFilterProgress");
        if(a20.e.getVisibility() == 0) {
            return;
        }
        Context context0 = this.getContext();
        File file0 = context0 == null ? null : context0.getCacheDir();
        Bitmap bitmap0 = this.e;
        if(file0 != null && bitmap0 != null) {
            k.f(this, null, null, new com.dcinside.app.image.edit.filter.b.b(bitmap0, this, null), 3, null);
            return;
        }
        FragmentActivity fragmentActivity0 = this.getActivity();
        ImageEditActivity imageEditActivity0 = fragmentActivity0 instanceof ImageEditActivity ? ((ImageEditActivity)fragmentActivity0) : null;
        if(imageEditActivity0 != null) {
            imageEditActivity0.X1(null);
        }
    }

    @Override  // androidx.fragment.app.Fragment
    @l
    public View onCreateView(@l LayoutInflater layoutInflater0, @m ViewGroup viewGroup0, @m Bundle bundle0) {
        L.p(layoutInflater0, "inflater");
        this.c = a2.d(layoutInflater0, viewGroup0, false);
        View view0 = this.p0().b();
        L.o(view0, "getRoot(...)");
        return view0;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.t();
        this.c = null;
    }

    @Override  // com.dcinside.app.image.edit.a
    public void onViewCreated(@l View view0, @m Bundle bundle0) {
        L.p(view0, "view");
        super.onViewCreated(view0, bundle0);
        a2 a20 = this.p0();
        a20.c.setMinimumScaleType(3);
        a20.c.setMinimumDpi(40);
        a2 a21 = this.p0();
        NonPredictiveLayoutManager nonPredictiveLayoutManager0 = new NonPredictiveLayoutManager(0, false);
        a21.d.setLayoutManager(nonPredictiveLayoutManager0);
        String s = this.i0();
        com.dcinside.app.image.edit.filter.a a0 = new com.dcinside.app.image.edit.filter.a(this, this.d, s);
        a21.d.setAdapter(a0);
        this.L(((Y2.a)this.d[0].f()));
    }

    private final a2 p0() {
        a2 a20 = this.c;
        L.m(a20);
        return a20;
    }

    private final Bitmap q0(Y2.a a0) {
        BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
        bitmapFactory$Options0.inMutable = true;
        Bitmap bitmap0 = a0.f(BitmapFactory.decodeFile(this.i0(), bitmapFactory$Options0));
        L.o(bitmap0, "processFilter(...)");
        return bitmap0;
    }

    @Override  // com.dcinside.app.rx.a
    public void t() {
        this.b.t();
    }
}

