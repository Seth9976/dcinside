package com.dcinside.app.gif;

import Y.T1;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.core.view.MenuProvider;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.dcinside.app.image.s;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.Gk;
import java.io.File;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.i;
import kotlinx.coroutines.k;
import pl.droidsonroids.gif.e;
import rx.o;
import y4.l;

public final class m extends Fragment {
    @y4.m
    private T1 a;
    @y4.m
    private I0 b;
    @y4.m
    private String c;
    @y4.m
    private o d;

    private final Object l0(d d0) {
        @f(c = "com.dcinside.app.gif.GifPreviewFragment$displayInfo$2", f = "GifPreviewFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements A3.o {
            int k;
            final m l;

            a(m m0, d d0) {
                this.l = m0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@y4.m Object object0, @l d d0) {
                return new a(this.l, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @y4.m
            public final Object invoke(@l O o0, @y4.m d d0) {
                return ((a)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.m0().c.setText(null);
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.gif.GifPreviewFragment$displayInfo$3", f = "GifPreviewFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends kotlin.coroutines.jvm.internal.o implements A3.o {
            int k;
            final m l;
            final String m;
            final String n;

            b(m m0, String s, String s1, d d0) {
                this.l = m0;
                this.m = s;
                this.n = s1;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@y4.m Object object0, @l d d0) {
                return new b(this.l, this.m, this.n, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @y4.m
            public final Object invoke(@l O o0, @y4.m d d0) {
                return ((b)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                FragmentActivity fragmentActivity0 = this.l.getActivity();
                GifMakeActivity gifMakeActivity0 = fragmentActivity0 instanceof GifMakeActivity ? ((GifMakeActivity)fragmentActivity0) : null;
                if(gifMakeActivity0 == null) {
                    return S0.a;
                }
                String s = Gk.b(gifMakeActivity0.K1());
                T1 t10 = this.l.m0();
                String s1 = this.l.getString(0x7F1503EE, new Object[]{s});  // string:gif_optimize_max_size "※최대 %1$s"
                t10.e.setText(s1);
                this.l.m0().c.setText(this.m);
                T1 t11 = this.l.m0();
                L.o(t11.b, "gifPreviewImage");
                s.b(t11.b);
                T1 t12 = this.l.m0();
                e e0 = new e(this.n);
                t12.b.setImageDrawable(e0);
                return S0.a;
            }
        }

        String s = this.c;
        if(s == null) {
            Object object0 = i.h(h0.e(), new a(this, null), d0);
            return object0 == kotlin.coroutines.intrinsics.b.l() ? object0 : S0.a;
        }
        BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
        bitmapFactory$Options0.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(s, bitmapFactory$Options0);
        String s1 = Gk.a(new File(s).length());
        String s2 = this.getString(0x7F150409, new Object[]{kotlin.coroutines.jvm.internal.b.f(bitmapFactory$Options0.outWidth), kotlin.coroutines.jvm.internal.b.f(bitmapFactory$Options0.outHeight), s1});  // string:gif_preview_info_o "%1$dx%2$d(%3$s)"
        L.m(s2);
        Object object1 = i.h(h0.e(), new b(this, s2, s, null), d0);
        return object1 == kotlin.coroutines.intrinsics.b.l() ? object1 : S0.a;
    }

    private final T1 m0() {
        T1 t10 = this.a;
        L.m(t10);
        return t10;
    }

    private final void n0() {
        FragmentActivity fragmentActivity0 = this.getActivity();
        GifMakeActivity gifMakeActivity0 = fragmentActivity0 instanceof GifMakeActivity ? ((GifMakeActivity)fragmentActivity0) : null;
        if(gifMakeActivity0 == null) {
            return;
        }
        String s = this.c;
        if(s == null) {
            return;
        }
        if(new File(s).length() > gifMakeActivity0.K1()) {
            String s1 = gifMakeActivity0.getString(0x7F150800, new Object[]{Gk.b(gifMakeActivity0.K1())});  // string:post_write_less_max_upload_bytes "%1$s 이하의 이미지만 첨부할 수 있습니다."
            L.o(s1, "getString(...)");
            Dl.G(gifMakeActivity0, s1);
            return;
        }
        Bundle bundle0 = new Bundle();
        bundle0.putString("extra_gif_path", s);
        gifMakeActivity0.M1(this, bundle0);
    }

    private final void o0() {
        public static final class com.dcinside.app.gif.m.d implements MenuProvider {
            final m a;

            com.dcinside.app.gif.m.d(m m0) {
                this.a = m0;
                super();
            }

            @Override  // androidx.core.view.MenuProvider
            public void a(@l Menu menu0, @l MenuInflater menuInflater0) {
                L.p(menu0, "menu");
                L.p(menuInflater0, "menuInflater");
                menuInflater0.inflate(0x7F100016, menu0);  // mipmap:ic_launcher25
                MenuItem menuItem0 = menu0.findItem(0x7F0B0070);  // id:action_save
                if(menuItem0 != null) {
                    View view0 = menuItem0.getActionView();
                    Button button0 = view0 == null ? null : ((Button)view0.findViewById(0x7F0B082E));  // id:menu_save
                    if(button0 != null) {
                        button0.setOnClickListener((View view0) -> {
                            L.p(this, "this$0");
                            L.m(menuItem0);
                            this.d(menuItem0);
                        });
                    }
                }
            }

            @Override  // androidx.core.view.MenuProvider
            public void b(Menu menu0) {
            }

            @Override  // androidx.core.view.MenuProvider
            public void c(Menu menu0) {
            }

            @Override  // androidx.core.view.MenuProvider
            public boolean d(@l MenuItem menuItem0) {
                L.p(menuItem0, "menuItem");
                if(menuItem0.getItemId() == 0x7F0B0070) {  // id:action_save
                    this.a.n0();
                }
                return true;
            }

            // 检测为 Lambda 实现
            private static final void f(com.dcinside.app.gif.m.d m$d0, MenuItem menuItem0, View view0) [...]
        }

        FragmentActivity fragmentActivity0 = this.requireActivity();
        L.o(fragmentActivity0, "requireActivity(...)");
        fragmentActivity0.addMenuProvider(new com.dcinside.app.gif.m.d(this), this.getViewLifecycleOwner());
    }

    @Override  // androidx.fragment.app.Fragment
    @l
    public View onCreateView(@l LayoutInflater layoutInflater0, @y4.m ViewGroup viewGroup0, @y4.m Bundle bundle0) {
        L.p(layoutInflater0, "inflater");
        this.a = T1.d(layoutInflater0, viewGroup0, false);
        View view0 = this.m0().b();
        L.o(view0, "getRoot(...)");
        return view0;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        o o0 = this.d;
        if(o0 != null) {
            o0.l();
        }
        this.d = null;
        I0 i00 = this.b;
        if(i00 != null) {
            kotlinx.coroutines.I0.a.b(i00, null, 1, null);
        }
        this.b = null;
        this.a = null;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onViewCreated(@l View view0, @y4.m Bundle bundle0) {
        @f(c = "com.dcinside.app.gif.GifPreviewFragment$onViewCreated$1", f = "GifPreviewFragment.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends kotlin.coroutines.jvm.internal.o implements A3.o {
            int k;
            final m l;

            c(m m0, d d0) {
                this.l = m0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@y4.m Object object0, @l d d0) {
                return new c(this.l, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @y4.m
            public final Object invoke(@l O o0, @y4.m d d0) {
                return ((c)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @y4.m
            public final Object invokeSuspend(@l Object object0) {
                Object object1 = kotlin.coroutines.intrinsics.b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        this.k = 1;
                        return this.l.l0(this) == object1 ? object1 : S0.a;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }

        L.p(view0, "view");
        super.onViewCreated(view0, bundle0);
        this.o0();
        Bundle bundle1 = this.getArguments();
        this.c = bundle1 == null ? null : bundle1.getString("extra_gif_path");
        LifecycleOwner lifecycleOwner0 = this.getViewLifecycleOwner();
        L.o(lifecycleOwner0, "getViewLifecycleOwner(...)");
        this.b = k.f(LifecycleOwnerKt.a(lifecycleOwner0), h0.c(), null, new c(this, null), 2, null);
        com.dcinside.app.scan.a.a.a(this.c);
    }
}

