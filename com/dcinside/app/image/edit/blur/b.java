package com.dcinside.app.image.edit.blur;

import A3.p;
import Y.W1;
import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import androidx.fragment.app.FragmentActivity;
import com.davemorrissey.labs.subscaleview.ImageSource;
import com.dcinside.app.image.edit.ImageEditActivity;
import com.dcinside.app.image.edit.a;
import com.dcinside.app.internal.j;
import com.dcinside.app.internal.r;
import com.dcinside.app.rx.h;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.wk;
import java.io.File;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import kotlinx.coroutines.P;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.i;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;

@s0({"SMAP\nImageEditBlurFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageEditBlurFragment.kt\ncom/dcinside/app/image/edit/blur/ImageEditBlurFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,154:1\n255#2:155\n255#2:156\n*S KotlinDebug\n*F\n+ 1 ImageEditBlurFragment.kt\ncom/dcinside/app/image/edit/blur/ImageEditBlurFragment\n*L\n66#1:155\n110#1:156\n*E\n"})
public final class b extends a implements com.dcinside.app.rx.a {
    private final com.dcinside.app.rx.a b;
    @m
    private W1 c;
    @m
    private Bitmap d;

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
    public g getCoroutineContext() {
        return this.b.getCoroutineContext();
    }

    @Override  // com.dcinside.app.image.edit.a
    public void j0() {
        @f(c = "com.dcinside.app.image.edit.blur.ImageEditBlurFragment$save$1", f = "ImageEditBlurFragment.kt", i = {1}, l = {120, 0x7E, 0x86, 0x8F}, m = "invokeSuspend", n = {"parent"}, s = {"L$0"})
        static final class c extends o implements A3.o {
            Object k;
            int l;
            final Bitmap m;
            final b n;

            c(Bitmap bitmap0, b b0, d d0) {
                this.m = bitmap0;
                this.n = b0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new c(this.m, this.n, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((c)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @f(c = "com.dcinside.app.image.edit.blur.ImageEditBlurFragment$save$1$1", f = "ImageEditBlurFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.image.edit.blur.b.c.a extends o implements A3.o {
                    int k;
                    private Object l;
                    final b m;

                    com.dcinside.app.image.edit.blur.b.c.a(b b0, d d0) {
                        this.m = b0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        d d1 = new com.dcinside.app.image.edit.blur.b.c.a(this.m, d0);
                        d1.l = object0;
                        return d1;
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((com.dcinside.app.image.edit.blur.b.c.a)this.create(o0, d0)).invokeSuspend(S0.a);
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


                @f(c = "com.dcinside.app.image.edit.blur.ImageEditBlurFragment$save$1$2", f = "ImageEditBlurFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                @s0({"SMAP\nImageEditBlurFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageEditBlurFragment.kt\ncom/dcinside/app/image/edit/blur/ImageEditBlurFragment$save$1$2\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,154:1\n257#2,2:155\n*S KotlinDebug\n*F\n+ 1 ImageEditBlurFragment.kt\ncom/dcinside/app/image/edit/blur/ImageEditBlurFragment$save$1$2\n*L\n128#1:155,2\n*E\n"})
                static final class com.dcinside.app.image.edit.blur.b.c.b extends o implements A3.o {
                    int k;
                    private Object l;
                    final b m;

                    com.dcinside.app.image.edit.blur.b.c.b(b b0, d d0) {
                        this.m = b0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        d d1 = new com.dcinside.app.image.edit.blur.b.c.b(this.m, d0);
                        d1.l = object0;
                        return d1;
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((com.dcinside.app.image.edit.blur.b.c.b)this.create(o0, d0)).invokeSuspend(S0.a);
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
                        W1 w10 = this.m.p0();
                        L.o(w10.d, "imageEditBlurProgress");
                        w10.d.setVisibility(0);
                        return S0.a;
                    }
                }


                @f(c = "com.dcinside.app.image.edit.blur.ImageEditBlurFragment$save$1$3", f = "ImageEditBlurFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.image.edit.blur.b.c.c extends o implements A3.o {
                    int k;
                    private Object l;
                    final boolean m;
                    final b n;
                    final File o;

                    com.dcinside.app.image.edit.blur.b.c.c(boolean z, b b0, File file0, d d0) {
                        this.m = z;
                        this.n = b0;
                        this.o = file0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        d d1 = new com.dcinside.app.image.edit.blur.b.c.c(this.m, this.n, this.o, d0);
                        d1.l = object0;
                        return d1;
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((com.dcinside.app.image.edit.blur.b.c.c)this.create(o0, d0)).invokeSuspend(S0.a);
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


                @f(c = "com.dcinside.app.image.edit.blur.ImageEditBlurFragment$save$1$4", f = "ImageEditBlurFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.image.edit.blur.b.c.d extends o implements A3.o {
                    int k;
                    private Object l;
                    final b m;
                    final Exception n;

                    com.dcinside.app.image.edit.blur.b.c.d(b b0, Exception exception0, d d0) {
                        this.m = b0;
                        this.n = exception0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        d d1 = new com.dcinside.app.image.edit.blur.b.c.d(this.m, this.n, d0);
                        d1.l = object0;
                        return d1;
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((com.dcinside.app.image.edit.blur.b.c.d)this.create(o0, d0)).invokeSuspend(S0.a);
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
                        com.dcinside.app.image.edit.blur.b.c.a b$c$a0 = new com.dcinside.app.image.edit.blur.b.c.a(this.n, null);
                        this.l = 1;
                        return i.h(h0.e(), b$c$a0, this) == object1 ? object1 : S0.a;
                    }
                    com.dcinside.app.image.edit.blur.b.c.b b$c$b0 = new com.dcinside.app.image.edit.blur.b.c.b(this.n, null);
                    this.k = file0;
                    this.l = 2;
                    if(i.h(h0.e(), b$c$b0, this) == object1) {
                        return object1;
                    }
                label_25:
                    File file1 = new File(file0, System.nanoTime() + ".fix");
                    boolean z = com.dcinside.app.internal.a.c(this.m, file1, null, 0, 6, null);
                    this.m.recycle();
                    com.dcinside.app.image.edit.blur.b.c.c b$c$c0 = new com.dcinside.app.image.edit.blur.b.c.c(z, this.n, file1, null);
                    this.k = null;
                    this.l = 3;
                    if(i.h(h0.e(), b$c$c0, this) == object1) {
                        return object1;
                    }
                }
                catch(Exception exception0) {
                label_34:
                    com.dcinside.app.image.edit.blur.b.c.d b$c$d0 = new com.dcinside.app.image.edit.blur.b.c.d(this.n, exception0, null);
                    this.k = null;
                    this.l = 4;
                    if(i.h(h0.e(), b$c$d0, this) == object1) {
                        return object1;
                    }
                }
                return S0.a;
            }
        }

        W1 w10 = this.p0();
        L.o(w10.d, "imageEditBlurProgress");
        if(w10.d.getVisibility() == 0) {
            return;
        }
        Context context0 = this.getContext();
        File file0 = context0 == null ? null : context0.getCacheDir();
        Bitmap bitmap0 = this.d;
        if(file0 != null && bitmap0 != null) {
            k.f(this, null, null, new c(bitmap0, this, null), 3, null);
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
        this.c = W1.d(layoutInflater0, viewGroup0, false);
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
        static final class com.dcinside.app.image.edit.blur.b.b extends N implements Function1 {
            final b e;

            com.dcinside.app.image.edit.blur.b.b(b b0) {
                this.e = b0;
                super(1);
            }

            public final void a(@l j j0) {
                @f(c = "com.dcinside.app.image.edit.blur.ImageEditBlurFragment$onViewCreated$2$1", f = "ImageEditBlurFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.image.edit.blur.b.b.a extends o implements p {
                    int k;
                    Object l;
                    final b m;

                    com.dcinside.app.image.edit.blur.b.b.a(b b0, d d0) {
                        this.m = b0;
                        super(3, d0);
                    }

                    @m
                    public final Object a(@l O o0, @l SeekBar seekBar0, @m d d0) {
                        com.dcinside.app.image.edit.blur.b.b.a b$b$a0 = new com.dcinside.app.image.edit.blur.b.b.a(this.m, d0);
                        b$b$a0.l = seekBar0;
                        return b$b$a0.invokeSuspend(S0.a);
                    }

                    @Override  // A3.p
                    public Object invoke(Object object0, Object object1, Object object2) {
                        return this.a(((O)object0), ((SeekBar)object1), ((d)object2));
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        float f = ((float)((SeekBar)this.l).getProgress()) / 100.0f + 1.0f;
                        this.m.r0(f);
                        return S0.a;
                    }
                }

                L.p(j0, "$this$onSeekBarChangeListener");
                j0.c(new com.dcinside.app.image.edit.blur.b.b.a(this.e, null));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((j)object0));
                return S0.a;
            }
        }

        L.p(view0, "view");
        super.onViewCreated(view0, bundle0);
        W1 w10 = this.p0();
        w10.c.setMinimumScaleType(3);
        w10.c.setMinimumDpi(40);
        ImageSource imageSource0 = ImageSource.uri(this.i0());
        w10.c.setImage(imageSource0);
        W1 w11 = this.p0();
        L.o(w11.e, "imageEditBlurSeek");
        com.dcinside.app.image.edit.blur.b.b b$b0 = new com.dcinside.app.image.edit.blur.b.b(this);
        r.V(w11.e, null, b$b0, 1, null);
    }

    private final W1 p0() {
        W1 w10 = this.c;
        L.m(w10);
        return w10;
    }

    private final Bitmap q0(float f) {
        BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
        bitmapFactory$Options0.inMutable = true;
        Bitmap bitmap0 = BitmapFactory.decodeFile(this.i0(), bitmapFactory$Options0);
        Bitmap bitmap1 = Bitmap.createBitmap(bitmap0.getWidth(), bitmap0.getHeight(), Bitmap.Config.ARGB_8888);
        L.o(bitmap1, "createBitmap(...)");
        RenderScript renderScript0 = RenderScript.create(this.getContext());
        ScriptIntrinsicBlur scriptIntrinsicBlur0 = ScriptIntrinsicBlur.create(renderScript0, Element.U8_4(renderScript0));
        Allocation allocation0 = Allocation.createFromBitmap(renderScript0, bitmap1);
        scriptIntrinsicBlur0.setRadius(f);
        scriptIntrinsicBlur0.setInput(Allocation.createFromBitmap(renderScript0, bitmap0));
        scriptIntrinsicBlur0.forEach(allocation0);
        allocation0.copyTo(bitmap1);
        renderScript0.destroy();
        return bitmap1;
    }

    private final void r0(float f) {
        @f(c = "com.dcinside.app.image.edit.blur.ImageEditBlurFragment$onChangeBlur$1", f = "ImageEditBlurFragment.kt", i = {}, l = {69, 75, 81, 81}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.image.edit.blur.b.a extends o implements A3.o {
            Object k;
            int l;
            final b m;
            final float n;

            com.dcinside.app.image.edit.blur.b.a(b b0, float f, d d0) {
                this.m = b0;
                this.n = f;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.dcinside.app.image.edit.blur.b.a(this.m, this.n, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.dcinside.app.image.edit.blur.b.a)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @f(c = "com.dcinside.app.image.edit.blur.ImageEditBlurFragment$onChangeBlur$1$1", f = "ImageEditBlurFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                @s0({"SMAP\nImageEditBlurFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageEditBlurFragment.kt\ncom/dcinside/app/image/edit/blur/ImageEditBlurFragment$onChangeBlur$1$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,154:1\n257#2,2:155\n*S KotlinDebug\n*F\n+ 1 ImageEditBlurFragment.kt\ncom/dcinside/app/image/edit/blur/ImageEditBlurFragment$onChangeBlur$1$1\n*L\n71#1:155,2\n*E\n"})
                static final class com.dcinside.app.image.edit.blur.b.a.a extends o implements A3.o {
                    int k;
                    private Object l;
                    final b m;

                    com.dcinside.app.image.edit.blur.b.a.a(b b0, d d0) {
                        this.m = b0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        d d1 = new com.dcinside.app.image.edit.blur.b.a.a(this.m, d0);
                        d1.l = object0;
                        return d1;
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((com.dcinside.app.image.edit.blur.b.a.a)this.create(o0, d0)).invokeSuspend(S0.a);
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
                        W1 w10 = this.m.p0();
                        L.o(w10.d, "imageEditBlurProgress");
                        w10.d.setVisibility(0);
                        return S0.a;
                    }
                }


                @f(c = "com.dcinside.app.image.edit.blur.ImageEditBlurFragment$onChangeBlur$1$2", f = "ImageEditBlurFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.image.edit.blur.b.a.b extends o implements A3.o {
                    int k;
                    private Object l;
                    final b m;
                    final Bitmap n;

                    com.dcinside.app.image.edit.blur.b.a.b(b b0, Bitmap bitmap0, d d0) {
                        this.m = b0;
                        this.n = bitmap0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        d d1 = new com.dcinside.app.image.edit.blur.b.a.b(this.m, this.n, d0);
                        d1.l = object0;
                        return d1;
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((com.dcinside.app.image.edit.blur.b.a.b)this.create(o0, d0)).invokeSuspend(S0.a);
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
                        W1 w10 = this.m.p0();
                        L.o(w10.c, "imageEditBlurImg");
                        ImageSource imageSource0 = ImageSource.bitmap(this.n);
                        w10.c.setImage(imageSource0);
                        return S0.a;
                    }
                }


                @f(c = "com.dcinside.app.image.edit.blur.ImageEditBlurFragment$onChangeBlur$1$3", f = "ImageEditBlurFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                @s0({"SMAP\nImageEditBlurFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageEditBlurFragment.kt\ncom/dcinside/app/image/edit/blur/ImageEditBlurFragment$onChangeBlur$1$3\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,154:1\n257#2,2:155\n*S KotlinDebug\n*F\n+ 1 ImageEditBlurFragment.kt\ncom/dcinside/app/image/edit/blur/ImageEditBlurFragment$onChangeBlur$1$3\n*L\n83#1:155,2\n*E\n"})
                static final class com.dcinside.app.image.edit.blur.b.a.c extends o implements A3.o {
                    int k;
                    private Object l;
                    final b m;

                    com.dcinside.app.image.edit.blur.b.a.c(b b0, d d0) {
                        this.m = b0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        d d1 = new com.dcinside.app.image.edit.blur.b.a.c(this.m, d0);
                        d1.l = object0;
                        return d1;
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((com.dcinside.app.image.edit.blur.b.a.c)this.create(o0, d0)).invokeSuspend(S0.a);
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
                        W1 w10 = this.m.p0();
                        L.o(w10.d, "imageEditBlurProgress");
                        w10.d.setVisibility(8);
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
                    goto label_24;
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
                    goto label_32;
                label_10:
                    f0.n(object0);
                    goto label_17;
                }
                catch(Throwable throwable0) {
                    goto label_24;
                }
            label_12:
                f0.n(object0);
                try {
                    com.dcinside.app.image.edit.blur.b.a.a b$a$a0 = new com.dcinside.app.image.edit.blur.b.a.a(this.m, null);
                    this.l = 1;
                    if(i.h(h0.e(), b$a$a0, this) == object1) {
                        return object1;
                    }
                label_17:
                    Bitmap bitmap0 = this.m.q0(this.n);
                    this.m.d = bitmap0;
                    com.dcinside.app.image.edit.blur.b.a.b b$a$b0 = new com.dcinside.app.image.edit.blur.b.a.b(this.m, bitmap0, null);
                    this.l = 2;
                    if(i.h(h0.e(), b$a$b0, this) == object1) {
                        return object1;
                    }
                    goto label_32;
                }
                catch(Throwable throwable0) {
                }
            label_24:
                com.dcinside.app.image.edit.blur.b.a.c b$a$c0 = new com.dcinside.app.image.edit.blur.b.a.c(this.m, null);
                this.k = throwable0;
                this.l = 4;
                if(i.h(h0.e(), b$a$c0, this) == object1) {
                    return object1;
                }
                throwable1 = throwable0;
                throw throwable1;
            label_32:
                com.dcinside.app.image.edit.blur.b.a.c b$a$c1 = new com.dcinside.app.image.edit.blur.b.a.c(this.m, null);
                this.l = 3;
                return i.h(h0.e(), b$a$c1, this) == object1 ? object1 : S0.a;
            }
        }

        W1 w10 = this.p0();
        L.o(w10.d, "imageEditBlurProgress");
        if(w10.d.getVisibility() == 0) {
            return;
        }
        k.f(this, null, null, new com.dcinside.app.image.edit.blur.b.a(this, f, null), 3, null);
    }

    @Override  // com.dcinside.app.rx.a
    public void t() {
        this.b.t();
    }
}

