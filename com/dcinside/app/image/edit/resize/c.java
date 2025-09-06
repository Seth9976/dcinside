package com.dcinside.app.image.edit.resize;

import Y.c2;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.dcinside.app.image.edit.ImageEditActivity;
import com.dcinside.app.image.edit.a;
import com.dcinside.app.rx.h;
import com.dcinside.app.util.ol;
import com.dcinside.app.util.wk;
import com.dcinside.app.view.tool.NonPredictiveLayoutManager;
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

@s0({"SMAP\nImageEditResizeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageEditResizeFragment.kt\ncom/dcinside/app/image/edit/resize/ImageEditResizeFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 ViewInternals.kt\ncom/dcinside/app/internal/ViewInternalsKt\n*L\n1#1,139:1\n1#2:140\n255#3:141\n255#3:143\n25#4:142\n*S KotlinDebug\n*F\n+ 1 ImageEditResizeFragment.kt\ncom/dcinside/app/image/edit/resize/ImageEditResizeFragment\n*L\n89#1:141\n105#1:143\n90#1:142\n*E\n"})
public final class c extends a implements com.dcinside.app.image.edit.resize.a.a, e, com.dcinside.app.rx.a {
    private final com.dcinside.app.rx.a b;
    @m
    private c2 c;
    @m
    private ol d;

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
            a0 = new h(null, 1, null);
        }
        this(a0);
    }

    @Override  // com.dcinside.app.image.edit.resize.e
    public void K(@l ol ol0) {
        L.p(ol0, "size");
        if(!ol0.i()) {
            return;
        }
        this.d = ol0;
    }

    @Override  // kotlinx.coroutines.O
    @l
    public g getCoroutineContext() {
        return this.b.getCoroutineContext();
    }

    @Override  // com.dcinside.app.image.edit.a
    public void j0() {
        @f(c = "com.dcinside.app.image.edit.resize.ImageEditResizeFragment$save$1", f = "ImageEditResizeFragment.kt", i = {1}, l = {0x71, 0x77, 130}, m = "invokeSuspend", n = {"parent"}, s = {"L$0"})
        @s0({"SMAP\nImageEditResizeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageEditResizeFragment.kt\ncom/dcinside/app/image/edit/resize/ImageEditResizeFragment$save$1\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n*L\n1#1,139:1\n177#2,9:140\n*S KotlinDebug\n*F\n+ 1 ImageEditResizeFragment.kt\ncom/dcinside/app/image/edit/resize/ImageEditResizeFragment$save$1\n*L\n129#1:140,9\n*E\n"})
        static final class com.dcinside.app.image.edit.resize.c.a extends o implements A3.o {
            Object k;
            int l;
            final c m;
            final ol n;

            com.dcinside.app.image.edit.resize.c.a(c c0, ol ol0, d d0) {
                this.m = c0;
                this.n = ol0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new com.dcinside.app.image.edit.resize.c.a(this.m, this.n, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((com.dcinside.app.image.edit.resize.c.a)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @f(c = "com.dcinside.app.image.edit.resize.ImageEditResizeFragment$save$1$1", f = "ImageEditResizeFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.image.edit.resize.c.a.a extends o implements A3.o {
                    int k;
                    private Object l;
                    final c m;

                    com.dcinside.app.image.edit.resize.c.a.a(c c0, d d0) {
                        this.m = c0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        d d1 = new com.dcinside.app.image.edit.resize.c.a.a(this.m, d0);
                        d1.l = object0;
                        return d1;
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((com.dcinside.app.image.edit.resize.c.a.a)this.create(o0, d0)).invokeSuspend(S0.a);
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


                @f(c = "com.dcinside.app.image.edit.resize.ImageEditResizeFragment$save$1$2", f = "ImageEditResizeFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                @s0({"SMAP\nImageEditResizeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageEditResizeFragment.kt\ncom/dcinside/app/image/edit/resize/ImageEditResizeFragment$save$1$2\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,139:1\n257#2,2:140\n*S KotlinDebug\n*F\n+ 1 ImageEditResizeFragment.kt\ncom/dcinside/app/image/edit/resize/ImageEditResizeFragment$save$1$2\n*L\n121#1:140,2\n*E\n"})
                static final class b extends o implements A3.o {
                    int k;
                    private Object l;
                    final c m;

                    b(c c0, d d0) {
                        this.m = c0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        d d1 = new b(this.m, d0);
                        d1.l = object0;
                        return d1;
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((b)this.create(o0, d0)).invokeSuspend(S0.a);
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
                        c2 c20 = this.m.q0();
                        L.o(c20.f, "imageEditResizeProgress");
                        c20.f.setVisibility(0);
                        c2 c21 = this.m.q0();
                        L.o(c21.b, "imageEditResizeAdditional");
                        EditText editText0 = (EditText)c21.b.findViewById(0x7F0B05BD);  // id:image_edit_resize_new_width
                        EditText editText1 = (EditText)c21.b.findViewById(0x7F0B05BB);  // id:image_edit_resize_new_height
                        if(editText0 != null) {
                            editText0.setEnabled(false);
                        }
                        if(editText1 != null) {
                            editText1.setEnabled(false);
                        }
                        return S0.a;
                    }
                }


                @f(c = "com.dcinside.app.image.edit.resize.ImageEditResizeFragment$save$1$3", f = "ImageEditResizeFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.image.edit.resize.c.a.c extends o implements A3.o {
                    int k;
                    private Object l;
                    final c m;
                    final String n;

                    com.dcinside.app.image.edit.resize.c.a.c(c c0, String s, d d0) {
                        this.m = c0;
                        this.n = s;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final d create(@m Object object0, @l d d0) {
                        d d1 = new com.dcinside.app.image.edit.resize.c.a.c(this.m, this.n, d0);
                        d1.l = object0;
                        return d1;
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m d d0) {
                        return ((com.dcinside.app.image.edit.resize.c.a.c)this.create(o0, d0)).invokeSuspend(S0.a);
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
                            imageEditActivity0.X1(this.n);
                        }
                        return S0.a;
                    }
                }


                static final class com.dcinside.app.image.edit.resize.c.a.d extends N implements Function1 {
                    final ol e;

                    com.dcinside.app.image.edit.resize.c.a.d(ol ol0) {
                        this.e = ol0;
                        super(1);
                    }

                    @m
                    public final ol a(@l ol ol0) {
                        L.p(ol0, "it");
                        return this.e;
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        return this.a(((ol)object0));
                    }
                }

                String s1;
                File file0;
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.l) {
                    case 0: {
                        f0.n(object0);
                        file0 = wk.c.c();
                        if(file0 == null) {
                            com.dcinside.app.image.edit.resize.c.a.a c$a$a0 = new com.dcinside.app.image.edit.resize.c.a.a(this.m, null);
                            this.l = 1;
                            return i.h(h0.e(), c$a$a0, this) == object1 ? object1 : S0.a;
                        }
                        b c$a$b0 = new b(this.m, null);
                        this.k = file0;
                        this.l = 2;
                        if(i.h(h0.e(), c$a$b0, this) == object1) {
                            return object1;
                        }
                        break;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    case 2: {
                        file0 = (File)this.k;
                        f0.n(object0);
                        break;
                    }
                    case 3: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                File file1 = new File(file0, System.nanoTime() + ".fix");
                try {
                    String s = this.m.i0();
                    com.dcinside.app.image.edit.resize.c.a.d c$a$d0 = new com.dcinside.app.image.edit.resize.c.a.d(this.n);
                    s1 = null;
                    s1 = com.dcinside.app.write.d.d(com.dcinside.app.write.d.a, s, file1, 0, null, c$a$d0, 12, null);
                }
                catch(Exception unused_ex) {
                }
                com.dcinside.app.image.edit.resize.c.a.c c$a$c0 = new com.dcinside.app.image.edit.resize.c.a.c(this.m, s1, null);
                this.k = null;
                this.l = 3;
                return i.h(h0.e(), c$a$c0, this) == object1 ? object1 : S0.a;
            }
        }

        c2 c20 = this.q0();
        L.o(c20.f, "imageEditResizeProgress");
        if(c20.f.getVisibility() == 0) {
            return;
        }
        ol ol0 = this.d;
        if(ol0 == null) {
            FragmentActivity fragmentActivity0 = this.getActivity();
            ImageEditActivity imageEditActivity0 = fragmentActivity0 instanceof ImageEditActivity ? ((ImageEditActivity)fragmentActivity0) : null;
            if(imageEditActivity0 != null) {
                imageEditActivity0.X1(null);
            }
        }
        else {
            k.f(this, null, null, new com.dcinside.app.image.edit.resize.c.a(this, ol0, null), 3, null);
        }
    }

    private final void o0(View view0) {
        FrameLayout.LayoutParams frameLayout$LayoutParams0;
        FrameLayout frameLayout0 = this.q0().b;
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

    @Override  // androidx.fragment.app.Fragment
    @l
    public View onCreateView(@l LayoutInflater layoutInflater0, @m ViewGroup viewGroup0, @m Bundle bundle0) {
        L.p(layoutInflater0, "inflater");
        this.c = c2.d(layoutInflater0, viewGroup0, false);
        View view0 = this.q0().b();
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
        c2 c20 = this.q0();
        c20.d.setShowCropOverlay(false);
        Uri uri0 = Uri.fromFile(new File(this.i0()));
        c20.d.setImageUriAsync(uri0);
        c2 c21 = this.q0();
        NonPredictiveLayoutManager nonPredictiveLayoutManager0 = new NonPredictiveLayoutManager(0, false);
        c21.e.setLayoutManager(nonPredictiveLayoutManager0);
        com.dcinside.app.image.edit.resize.a a0 = new com.dcinside.app.image.edit.resize.a(this, this.i0());
        c21.e.setAdapter(a0);
        ViewGroup viewGroup0 = view0 instanceof ViewGroup ? ((ViewGroup)view0) : null;
        if(viewGroup0 == null) {
            return;
        }
        String s = this.i0();
        ol ol0 = ol.e.b(s, true);
        this.o0(com.dcinside.app.image.edit.text.i.a.g(viewGroup0, ol0.a(), ol0.b(), this));
    }

    // 检测为 Lambda 实现
    private static final void p0(boolean z, FrameLayout frameLayout0) [...]

    private final c2 q0() {
        c2 c20 = this.c;
        L.m(c20);
        return c20;
    }

    @Override  // com.dcinside.app.rx.a
    public void t() {
        this.b.t();
    }

    @Override  // com.dcinside.app.image.edit.resize.a$a
    public void y(int v) {
        c2 c20 = this.q0();
        L.o(c20.f, "imageEditResizeProgress");
        if(c20.f.getVisibility() == 0) {
            return;
        }
        c2 c21 = this.q0();
        L.o(c21.e, "imageEditResizeList");
        Adapter recyclerView$Adapter0 = c21.e.getAdapter();
        Integer integer0 = null;
        if(!(recyclerView$Adapter0 instanceof com.dcinside.app.image.edit.resize.a)) {
            recyclerView$Adapter0 = null;
        }
        if(((com.dcinside.app.image.edit.resize.a)recyclerView$Adapter0) != null) {
            integer0 = ((com.dcinside.app.image.edit.resize.a)recyclerView$Adapter0).v(v);
        }
        if(integer0 != null) {
            c2 c22 = this.q0();
            L.o(c22.b, "imageEditResizeAdditional");
            EditText editText0 = (EditText)c22.b.findViewById(0x7F0B05BD);  // id:image_edit_resize_new_width
            if(editText0 != null) {
                editText0.setText(integer0.toString());
            }
        }
    }
}

