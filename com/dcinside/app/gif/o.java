package com.dcinside.app.gif;

import A3.p;
import A3.r;
import Y.U1;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.core.view.MenuProvider;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.dcinside.app.gif.frame.Frame;
import com.dcinside.app.gif.maker.d;
import com.dcinside.app.gif.view.RangeSeekBar;
import com.dcinside.app.image.s;
import com.dcinside.app.util.Dl;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.S0;
import kotlin.V;
import kotlin.collections.u;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.r0;
import kotlinx.coroutines.I0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.X;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.i;
import kotlinx.coroutines.k;
import y4.l;
import y4.m;

@s0({"SMAP\nGifVideoSeekFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GifVideoSeekFragment.kt\ncom/dcinside/app/gif/GifVideoSeekFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,325:1\n1#2:326\n*E\n"})
public final class o extends Fragment {
    @m
    private U1 a;
    @m
    private d b;
    @m
    private File c;
    @m
    private I0 d;
    @m
    private I0 e;
    @m
    private I0 f;
    @l
    private final Object g;
    private boolean h;
    @l
    private ImageView[] i;

    public o() {
        this.g = new Object();
        this.i = new ImageView[9];
    }

    private final void A0(RangeSeekBar rangeSeekBar0, double f, double f1) {
        @f(c = "com.dcinside.app.gif.GifVideoSeekFragment$onSeekChanged$1", f = "GifVideoSeekFragment.kt", i = {}, l = {293, 294}, m = "invokeSuspend", n = {}, s = {})
        static final class c extends kotlin.coroutines.jvm.internal.o implements A3.o {
            int k;
            final o l;
            final double m;
            final double n;

            c(o o0, double f, double f1, kotlin.coroutines.d d0) {
                this.l = o0;
                this.m = f;
                this.n = f1;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new c(this.l, this.m, this.n, d0);
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
                @f(c = "com.dcinside.app.gif.GifVideoSeekFragment$onSeekChanged$1$1", f = "GifVideoSeekFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class a extends kotlin.coroutines.jvm.internal.o implements A3.o {
                    int k;
                    final o l;
                    final double m;
                    final double n;

                    a(o o0, double f, double f1, kotlin.coroutines.d d0) {
                        this.l = o0;
                        this.m = f;
                        this.n = f1;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new a(this.l, this.m, this.n, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        this.l.x0().k.p(((int)this.m), ((int)this.n));
                        return S0.a;
                    }
                }

                Object object1 = b.l();
                switch(this.k) {
                    case 0: {
                        f0.n(object0);
                        this.k = 1;
                        if(a0.b(300L, this) == object1) {
                            return object1;
                        }
                        break;
                    }
                    case 1: {
                        f0.n(object0);
                        break;
                    }
                    case 2: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                a o$c$a0 = new a(this.l, this.m, this.n, null);
                this.k = 2;
                return i.h(h0.e(), o$c$a0, this) == object1 ? object1 : S0.a;
            }
        }

        double f2 = Math.min(Math.max(f1, 0.0), 10000.0);
        I0 i00 = this.d;
        if(i00 != null) {
            kotlinx.coroutines.I0.a.b(i00, null, 1, null);
        }
        this.d = k.f(LifecycleOwnerKt.a(this), h0.c(), null, new c(this, f, f2, null), 2, null);
        U1 u10 = this.x0();
        String s = rangeSeekBar0.getContext().getString(0x7F15040C, new Object[]{10L});  // string:gif_video_time "원하는 구간을 선택하세요. (최대 %1$d초)"
        u10.l.setText(s);
        U1 u11 = this.x0();
        String s1 = this.I0(((long)f), ((long)(f + f2)));
        u11.r.setText(s1);
    }

    private final void B0(int v, int v1) {
        FragmentActivity fragmentActivity0 = this.getActivity();
        if(fragmentActivity0 == null) {
            return;
        }
        Dl.H(fragmentActivity0, this.getString(0x7F15040B, new Object[]{v, v1}), 1);  // string:gif_video_error "영상을 표시할 수 없습니다.(%1$d, %2$d)"
    }

    private final void C0() {
        synchronized(this.g) {
            this.h = true;
            this.g.notifyAll();
        }
    }

    private final void D0(float f) {
        U1 u10 = this.x0();
        int v = (int)(((float)u10.n.getMax()) * f);
        u10.n.setProgress(v);
    }

    private final void E0() {
        public static final class e implements MenuProvider {
            final o a;

            e(o o0) {
                this.a = o0;
                super();
            }

            @Override  // androidx.core.view.MenuProvider
            public void a(@l Menu menu0, @l MenuInflater menuInflater0) {
                L.p(menu0, "menu");
                L.p(menuInflater0, "menuInflater");
                menuInflater0.inflate(0x7F100008, menu0);  // mipmap:ic_launcher12
                MenuItem menuItem0 = menu0.findItem(0x7F0B0061);  // id:action_gif_next
                if(menuItem0 != null) {
                    View view0 = menuItem0.getActionView();
                    Button button0 = view0 == null ? null : ((Button)view0.findViewById(0x7F0B0818));  // id:menu_gif_next
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
                if(menuItem0.getItemId() == 0x7F0B0061) {  // id:action_gif_next
                    this.a.y0();
                }
                return true;
            }

            // 检测为 Lambda 实现
            private static final void f(e o$e0, MenuItem menuItem0, View view0) [...]
        }

        FragmentActivity fragmentActivity0 = this.requireActivity();
        L.n(fragmentActivity0, "null cannot be cast to non-null type androidx.core.view.MenuHost");
        fragmentActivity0.addMenuProvider(new e(this), this.getViewLifecycleOwner());
    }

    private final void F0() {
        @f(c = "com.dcinside.app.gif.GifVideoSeekFragment$setRangeSeekBar$1", f = "GifVideoSeekFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        @s0({"SMAP\nGifVideoSeekFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GifVideoSeekFragment.kt\ncom/dcinside/app/gif/GifVideoSeekFragment$setRangeSeekBar$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,325:1\n1#2:326\n*E\n"})
        static final class com.dcinside.app.gif.o.f extends kotlin.coroutines.jvm.internal.o implements r {
            int k;
            Object l;
            double m;
            double n;
            final o o;

            com.dcinside.app.gif.o.f(o o0, kotlin.coroutines.d d0) {
                this.o = o0;
                super(5, d0);
            }

            @Override  // A3.r
            public Object K0(Object object0, Object object1, Object object2, Object object3, Object object4) {
                return this.a(((O)object0), ((RangeSeekBar)object1), ((Number)object2).doubleValue(), ((Number)object3).doubleValue(), ((kotlin.coroutines.d)object4));
            }

            @m
            public final Object a(@l O o0, @m RangeSeekBar rangeSeekBar0, double f, double f1, @m kotlin.coroutines.d d0) {
                com.dcinside.app.gif.o.f o$f0 = new com.dcinside.app.gif.o.f(this.o, d0);
                o$f0.l = rangeSeekBar0;
                o$f0.m = f;
                o$f0.n = f1;
                return o$f0.invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                RangeSeekBar rangeSeekBar0 = (RangeSeekBar)this.l;
                double f = this.m;
                double f1 = this.n;
                if(rangeSeekBar0 != null) {
                    this.o.A0(rangeSeekBar0, f, f1);
                }
                return S0.a;
            }
        }

        this.x0().q.setThumbEnabled(true);
        this.x0().q.setNotifyWhileDragging(true);
        U1 u10 = this.x0();
        L.o(u10.q, "gifVideoRangeSeek");
        com.dcinside.app.gif.o.f o$f0 = new com.dcinside.app.gif.o.f(this, null);
        RangeSeekBar.m(u10.q, null, o$f0, 1, null);
    }

    private final void G0() {
        U1 u10 = this.x0();
        L.o(u10.b, "gifPreview1");
        U1 u11 = this.x0();
        L.o(u11.c, "gifPreview2");
        U1 u12 = this.x0();
        L.o(u12.d, "gifPreview3");
        U1 u13 = this.x0();
        L.o(u13.e, "gifPreview4");
        U1 u14 = this.x0();
        L.o(u14.f, "gifPreview5");
        U1 u15 = this.x0();
        L.o(u15.g, "gifPreview6");
        U1 u16 = this.x0();
        L.o(u16.h, "gifPreview7");
        U1 u17 = this.x0();
        L.o(u17.i, "gifPreview8");
        U1 u18 = this.x0();
        L.o(u18.j, "gifPreview9");
        this.i = new ImageView[]{u10.b, u11.c, u12.d, u13.e, u14.f, u15.g, u16.h, u17.i, u18.j};
    }

    private final void H0() {
        static final class g extends N implements Function1 {
            final o e;

            g(o o0) {
                this.e = o0;
                super(1);
            }

            public final void a(@l MediaPlayer mediaPlayer0) {
                L.p(mediaPlayer0, "it");
                this.e.C0();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.a(((MediaPlayer)object0));
                return S0.a;
            }
        }


        static final class h extends N implements p {
            final o e;

            h(o o0) {
                this.e = o0;
                super(3);
            }

            public final void a(@m MediaPlayer mediaPlayer0, int v, int v1) {
                this.e.B0(v, v1);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                this.a(((MediaPlayer)object0), ((Number)object1).intValue(), ((Number)object2).intValue());
                return S0.a;
            }
        }

        U1 u10 = this.x0();
        g o$g0 = new g(this);
        u10.k.setOnPreparedListener(o$g0);
        U1 u11 = this.x0();
        h o$h0 = new h(this);
        u11.k.setOnErrorListener(o$h0);
    }

    private final String I0(long v, long v1) {
        String s;
        long v7;
        long v6;
        long v4;
        long v3;
        long v2 = v / 1000L;
        if(v2 >= 3600L) {
            v3 = v2 / 3600L;
            v2 -= 3600L * v3;
        }
        else {
            v3 = 0L;
        }
        if(v2 >= 60L) {
            v4 = v2 / 60L;
            v2 -= 60L * v4;
        }
        else {
            v4 = 0L;
        }
        long v5 = v1 / 1000L;
        if(v5 >= 3600L) {
            v6 = v5 / 3600L;
            v5 -= 3600L * v6;
        }
        else {
            v6 = 0L;
        }
        if(v5 >= 60L) {
            v7 = v5 / 60L;
            v5 -= 60L * v7;
        }
        else {
            v7 = 0L;
        }
        double f = Math.rint(((double)v1) - ((double)v));
        if(v3 <= 0L && v6 <= 0L) {
            s = String.format("%02d:%02d ~ %02d:%02d (%02.1fs)", Arrays.copyOf(new Object[]{v4, v2, v7, v5, ((double)(f / 1000.0))}, 5));
            L.o(s, "format(...)");
            return s;
        }
        s = String.format("%02d:%02d:%02d ~ %02d:%02d:%02d (%02.1fs)", Arrays.copyOf(new Object[]{v3, v4, v2, v6, v7, v5, ((double)(f / 1000.0))}, 7));
        L.o(s, "format(...)");
        return s;
    }

    @Override  // androidx.fragment.app.Fragment
    @l
    public View onCreateView(@l LayoutInflater layoutInflater0, @m ViewGroup viewGroup0, @m Bundle bundle0) {
        L.p(layoutInflater0, "inflater");
        this.a = U1.d(layoutInflater0, viewGroup0, false);
        View view0 = this.x0().b();
        L.o(view0, "getRoot(...)");
        return view0;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        d d0 = this.b;
        if(d0 != null) {
            d0.w();
        }
        I0 i00 = this.d;
        if(i00 != null) {
            kotlinx.coroutines.I0.a.b(i00, null, 1, null);
        }
        this.d = null;
        I0 i01 = this.e;
        if(i01 != null) {
            kotlinx.coroutines.I0.a.b(i01, null, 1, null);
        }
        this.e = null;
        I0 i02 = this.f;
        if(i02 != null) {
            kotlinx.coroutines.I0.a.b(i02, null, 1, null);
        }
        this.f = null;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onViewCreated(@l View view0, @m Bundle bundle0) {
        @f(c = "com.dcinside.app.gif.GifVideoSeekFragment$onViewCreated$1", f = "GifVideoSeekFragment.kt", i = {0, 1}, l = {69, 76}, m = "invokeSuspend", n = {"$this$launch", "$this$launch"}, s = {"L$0", "L$0"})
        @s0({"SMAP\nGifVideoSeekFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GifVideoSeekFragment.kt\ncom/dcinside/app/gif/GifVideoSeekFragment$onViewCreated$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,325:1\n1#2:326\n*E\n"})
        static final class com.dcinside.app.gif.o.d extends kotlin.coroutines.jvm.internal.o implements A3.o {
            Object k;
            Object l;
            Object m;
            int n;
            private Object o;
            final o p;

            com.dcinside.app.gif.o.d(o o0, kotlin.coroutines.d d0) {
                this.p = o0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                kotlin.coroutines.d d1 = new com.dcinside.app.gif.o.d(this.p, d0);
                d1.o = object0;
                return d1;
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.gif.o.d)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                File file3;
                o o3;
                o o2;
                File file2;
                File file0;
                O o0;
                Object object1 = b.l();
                GifMakeActivity gifMakeActivity0 = null;
                switch(this.n) {
                    case 0: {
                        f0.n(object0);
                        o0 = (O)this.o;
                        o o1 = this.p;
                        Bundle bundle0 = o1.getArguments();
                        if(bundle0 == null) {
                            file0 = null;
                        }
                        else {
                            String s = bundle0.getString("extra_video_path");
                            file0 = s == null ? null : new File(s);
                        }
                        o1.c = file0;
                        File file1 = this.p.c;
                        if(file1 == null) {
                            goto label_56;
                        }
                        else {
                            file2 = file1.exists() ? file1 : null;
                            if(file2 == null) {
                                goto label_56;
                            }
                            else {
                                try {
                                    o2 = this.p;
                                    this.o = o0;
                                    this.k = file2;
                                    this.l = o2;
                                    this.m = o2;
                                    this.n = 1;
                                    object0 = d.f.i(file2, this);
                                }
                                catch(Exception unused_ex) {
                                    o3 = o2;
                                    goto label_43;
                                }
                                if(object0 == object1) {
                                    return object1;
                                }
                                o3 = o2;
                                goto label_40;
                            }
                        }
                        break;
                    }
                    case 1: {
                        o2 = (o)this.m;
                        o3 = (o)this.l;
                        file2 = (File)this.k;
                        o0 = (O)this.o;
                        try {
                            f0.n(object0);
                        label_40:
                            o3.x0().q.setEnabled(false);
                            o3.x0().k.setVideoPath(((com.dcinside.app.gif.maker.c)((d)object0).j()).a());
                            o2.b = (d)object0;
                        }
                        catch(Exception unused_ex) {
                        }
                    label_43:
                        this.o = o0;
                        this.k = file2;
                        this.l = null;
                        this.m = null;
                        this.n = 2;
                        if(o3.z0(this) == object1) {
                            return object1;
                        }
                        file3 = file2;
                        goto label_55;
                    }
                    case 2: {
                        file3 = (File)this.k;
                        O o4 = (O)this.o;
                        f0.n(object0);
                    label_55:
                        if(file3 == null) {
                        label_56:
                            o o5 = this.p;
                            FragmentActivity fragmentActivity0 = o5.getActivity();
                            if(fragmentActivity0 instanceof GifMakeActivity) {
                                gifMakeActivity0 = (GifMakeActivity)fragmentActivity0;
                            }
                            if(gifMakeActivity0 != null) {
                                String s1 = o5.getString(0x7F1503E5);  // string:gif_make_select_files "대상을 선택해주세요."
                                L.o(s1, "getString(...)");
                                gifMakeActivity0.L1(s1);
                            }
                        }
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                return S0.a;
            }
        }

        L.p(view0, "view");
        super.onViewCreated(view0, bundle0);
        this.E0();
        this.G0();
        this.H0();
        this.F0();
        LifecycleOwner lifecycleOwner0 = this.getViewLifecycleOwner();
        L.o(lifecycleOwner0, "getViewLifecycleOwner(...)");
        this.e = k.f(LifecycleOwnerKt.a(lifecycleOwner0), h0.e(), null, new com.dcinside.app.gif.o.d(this, null), 2, null);
    }

    private final I0 w0(d d0, long v, long v1, com.dcinside.app.gif.frame.d.a d$a0) {
        @f(c = "com.dcinside.app.gif.GifVideoSeekFragment$extractFramesAsync$1", f = "GifVideoSeekFragment.kt", i = {1}, l = {0x91, 0xA2, 180, 0xBF, 0xBA, 0xBF, 0xBF}, m = "invokeSuspend", n = {"destination$iv$iv"}, s = {"L$0"})
        @s0({"SMAP\nGifVideoSeekFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GifVideoSeekFragment.kt\ncom/dcinside/app/gif/GifVideoSeekFragment$extractFramesAsync$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,325:1\n1557#2:326\n1628#2,3:327\n1863#2,2:330\n*S KotlinDebug\n*F\n+ 1 GifVideoSeekFragment.kt\ncom/dcinside/app/gif/GifVideoSeekFragment$extractFramesAsync$1\n*L\n162#1:326\n162#1:327,3\n170#1:330,2\n*E\n"})
        static final class com.dcinside.app.gif.o.a extends kotlin.coroutines.jvm.internal.o implements A3.o {
            Object k;
            Object l;
            Object m;
            int n;
            final long o;
            final long p;
            final d q;
            final com.dcinside.app.gif.frame.d.a r;
            final o s;

            com.dcinside.app.gif.o.a(long v, long v1, d d0, com.dcinside.app.gif.frame.d.a d$a0, o o0, kotlin.coroutines.d d1) {
                this.o = v;
                this.p = v1;
                this.q = d0;
                this.r = d$a0;
                this.s = o0;
                super(2, d1);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new com.dcinside.app.gif.o.a(this.o, this.p, this.q, this.r, this.s, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.gif.o.a)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @f(c = "com.dcinside.app.gif.GifVideoSeekFragment$extractFramesAsync$1$1", f = "GifVideoSeekFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                @s0({"SMAP\nGifVideoSeekFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GifVideoSeekFragment.kt\ncom/dcinside/app/gif/GifVideoSeekFragment$extractFramesAsync$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,325:1\n1#2:326\n*E\n"})
                static final class com.dcinside.app.gif.o.a.a extends kotlin.coroutines.jvm.internal.o implements A3.o {
                    int k;
                    final o l;

                    com.dcinside.app.gif.o.a.a(o o0, kotlin.coroutines.d d0) {
                        this.l = o0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.gif.o.a.a(this.l, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.gif.o.a.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        this.l.D0(0.0f);
                        U1 u10 = this.l.x0();
                        u10.o.setVisibility(0);
                        return u10.o;
                    }
                }


                @f(c = "com.dcinside.app.gif.GifVideoSeekFragment$extractFramesAsync$1$3", f = "GifVideoSeekFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.gif.o.a.b extends kotlin.coroutines.jvm.internal.o implements A3.o {
                    int k;
                    final o l;
                    final Bundle m;

                    com.dcinside.app.gif.o.a.b(o o0, Bundle bundle0, kotlin.coroutines.d d0) {
                        this.l = o0;
                        this.m = bundle0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.gif.o.a.b(this.l, this.m, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.gif.o.a.b)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        FragmentActivity fragmentActivity0 = this.l.getActivity();
                        GifMakeActivity gifMakeActivity0 = fragmentActivity0 instanceof GifMakeActivity ? ((GifMakeActivity)fragmentActivity0) : null;
                        if(gifMakeActivity0 != null) {
                            gifMakeActivity0.M1(this.l, this.m);
                            return S0.a;
                        }
                        return null;
                    }
                }


                @f(c = "com.dcinside.app.gif.GifVideoSeekFragment$extractFramesAsync$1$4", f = "GifVideoSeekFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.gif.o.a.c extends kotlin.coroutines.jvm.internal.o implements A3.o {
                    int k;
                    final o l;
                    final Exception m;

                    com.dcinside.app.gif.o.a.c(o o0, Exception exception0, kotlin.coroutines.d d0) {
                        this.l = o0;
                        this.m = exception0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.gif.o.a.c(this.l, this.m, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.gif.o.a.c)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        Context context0 = this.l.requireContext();
                        String s = this.m.getMessage();
                        if(s == null) {
                            s = this.l.getString(0x7F1503E4);  // string:gif_make_img_fail "이미지를 생성할 수 없습니다."
                            L.o(s, "getString(...)");
                        }
                        Dl.G(context0, s);
                        return S0.a;
                    }
                }


                @f(c = "com.dcinside.app.gif.GifVideoSeekFragment$extractFramesAsync$1$5", f = "GifVideoSeekFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.gif.o.a.d extends kotlin.coroutines.jvm.internal.o implements A3.o {
                    int k;
                    final o l;

                    com.dcinside.app.gif.o.a.d(o o0, kotlin.coroutines.d d0) {
                        this.l = o0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.gif.o.a.d(this.l, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.gif.o.a.d)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        this.l.x0().o.setVisibility(8);
                        return S0.a;
                    }
                }


                static final class com.dcinside.app.gif.o.a.e extends N implements p {
                    final o e;

                    com.dcinside.app.gif.o.a.e(o o0) {
                        this.e = o0;
                        super(3);
                    }

                    public final void a(long v, long v1, long v2) {
                        @f(c = "com.dcinside.app.gif.GifVideoSeekFragment$extractFramesAsync$1$list$1$1", f = "GifVideoSeekFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                        static final class com.dcinside.app.gif.o.a.e.a extends kotlin.coroutines.jvm.internal.o implements A3.o {
                            int k;
                            final o l;
                            final double m;

                            com.dcinside.app.gif.o.a.e.a(o o0, double f, kotlin.coroutines.d d0) {
                                this.l = o0;
                                this.m = f;
                                super(2, d0);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @l
                            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                                return new com.dcinside.app.gif.o.a.e.a(this.l, this.m, d0);
                            }

                            @Override  // A3.o
                            public Object invoke(Object object0, Object object1) {
                                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                            }

                            @m
                            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                                return ((com.dcinside.app.gif.o.a.e.a)this.create(o0, d0)).invokeSuspend(S0.a);
                            }

                            @Override  // kotlin.coroutines.jvm.internal.a
                            @m
                            public final Object invokeSuspend(@l Object object0) {
                                if(this.k != 0) {
                                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                }
                                f0.n(object0);
                                this.l.D0(((float)this.m));
                                return S0.a;
                            }
                        }

                        k.f(LifecycleOwnerKt.a(this.e), h0.e(), null, new com.dcinside.app.gif.o.a.e.a(this.e, ((double)(v - v1)) / ((double)(v2 - v1)), null), 2, null);
                    }

                    @Override  // A3.p
                    public Object invoke(Object object0, Object object1, Object object2) {
                        this.a(((Number)object0).longValue(), ((Number)object1).longValue(), ((Number)object2).longValue());
                        return S0.a;
                    }
                }

                Iterator iterator0;
                Collection collection0;
                Object object1 = b.l();
                switch(this.n) {
                    case 0: {
                        f0.n(object0);
                        com.dcinside.app.gif.o.a.a o$a$a0 = new com.dcinside.app.gif.o.a.a(this.s, null);
                        this.n = 1;
                        if(i.h(h0.e(), o$a$a0, this) == object1) {
                            return object1;
                        }
                        goto label_11;
                    }
                    case 1: {
                        f0.n(object0);
                        try {
                        label_11:
                            long v = this.o;
                            if(v < 0L) {
                                throw new IllegalArgumentException("Invalid time value.");
                            }
                            long v1 = this.p;
                            if(v1 == 0L) {
                                throw new IllegalArgumentException("Invalid time value.");
                            }
                            com.dcinside.app.gif.o.a.e o$a$e0 = new com.dcinside.app.gif.o.a.e(this.s);
                            Iterable iterable0 = com.dcinside.app.gif.frame.d.a.d(((com.dcinside.app.gif.maker.c)this.q.j()), v * 1000L, v1 * 1000L, false, this.r, o$a$e0);
                            collection0 = new ArrayList(u.b0(iterable0, 10));
                            iterator0 = iterable0.iterator();
                            goto label_31;
                        }
                        catch(Exception exception0) {
                            goto label_71;
                        }
                        catch(Throwable throwable0) {
                            goto label_86;
                        }
                    }
                    case 2: {
                        collection0 = (Collection)this.m;
                        Iterator iterator1 = (Iterator)this.l;
                        Collection collection1 = (Collection)this.k;
                        try {
                            f0.n(object0);
                            Iterator iterator2 = iterator1;
                            Collection collection2 = collection1;
                            Object object2 = object0;
                            while(true) {
                                collection0.add(((Frame)object2));
                                collection0 = collection2;
                                iterator0 = iterator2;
                            label_31:
                                if(!iterator0.hasNext()) {
                                    break;
                                }
                                Object object3 = iterator0.next();
                                this.k = collection0;
                                this.l = iterator0;
                                this.m = collection0;
                                this.n = 2;
                                object2 = ((X)object3).o(this);
                                if(object2 == object1) {
                                    return object1;
                                }
                                iterator2 = iterator0;
                                collection2 = collection0;
                            }
                            if(((List)collection0).size() < 2) {
                                throw new IllegalArgumentException("Invalid frame count.");
                            }
                            kotlin.jvm.internal.l0.g l0$g0 = new kotlin.jvm.internal.l0.g();
                            kotlin.jvm.internal.l0.g l0$g1 = new kotlin.jvm.internal.l0.g();
                            l0$g1.a = -1L;
                            for(Object object4: ((List)collection0)) {
                                Frame frame0 = (Frame)object4;
                                if(l0$g1.a >= 0L) {
                                    l0$g0.a += Math.abs(frame0.d() - l0$g1.a);
                                }
                                l0$g1.a = frame0.d();
                            }
                            l0$g0.a /= (long)(((List)collection0).size() - 1);
                            Bundle bundle0 = new Bundle();
                            bundle0.putParcelableArrayList("extra_image_frames", new ArrayList(((List)collection0)));
                            bundle0.putLong("extra_frame_interval_ms", l0$g0.a / 1000L);
                            bundle0.putBoolean("extra_from_video", true);
                            com.dcinside.app.gif.o.a.b o$a$b0 = new com.dcinside.app.gif.o.a.b(this.s, bundle0, null);
                            this.k = null;
                            this.l = null;
                            this.m = null;
                            this.n = 3;
                            if(i.h(h0.e(), o$a$b0, this) == object1) {
                                return object1;
                            }
                            goto label_79;
                        }
                        catch(Exception exception0) {
                            goto label_71;
                        }
                        catch(Throwable throwable0) {
                            goto label_86;
                        }
                        return object1;
                    }
                    case 3: {
                        try {
                            try {
                                f0.n(object0);
                                goto label_79;
                            }
                            catch(Exception exception0) {
                            }
                        label_71:
                            timber.log.b.a.e(exception0);
                            com.dcinside.app.gif.o.a.c o$a$c0 = new com.dcinside.app.gif.o.a.c(this.s, exception0, null);
                            this.k = null;
                            this.l = null;
                            this.m = null;
                            this.n = 5;
                            if(i.h(h0.e(), o$a$c0, this) == object1) {
                                return object1;
                            }
                            goto label_93;
                        }
                        catch(Throwable throwable0) {
                            goto label_86;
                        }
                        return object1;
                    label_79:
                        com.dcinside.app.gif.o.a.d o$a$d0 = new com.dcinside.app.gif.o.a.d(this.s, null);
                        this.n = 4;
                        return i.h(h0.e(), o$a$d0, this) != object1 ? S0.a : object1;
                    }
                    case 5: {
                        try {
                            f0.n(object0);
                        }
                        catch(Throwable throwable0) {
                        label_86:
                            com.dcinside.app.gif.o.a.d o$a$d1 = new com.dcinside.app.gif.o.a.d(this.s, null);
                            this.k = throwable0;
                            this.l = null;
                            this.m = null;
                            this.n = 7;
                            if(i.h(h0.e(), o$a$d1, this) != object1) {
                                throw throwable0;
                            }
                            return object1;
                        }
                    label_93:
                        com.dcinside.app.gif.o.a.d o$a$d2 = new com.dcinside.app.gif.o.a.d(this.s, null);
                        this.n = 6;
                        return i.h(h0.e(), o$a$d2, this) == object1 ? object1 : S0.a;
                    }
                    case 4: 
                    case 6: {
                        f0.n(object0);
                        return S0.a;
                    }
                    case 7: {
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                throwable0 = (Throwable)this.k;
                f0.n(object0);
                throw throwable0;
            }
        }

        return k.f(LifecycleOwnerKt.a(this), h0.c(), null, new com.dcinside.app.gif.o.a(v, v1, d0, d$a0, this, null), 2, null);
    }

    private final U1 x0() {
        U1 u10 = this.a;
        L.m(u10);
        return u10;
    }

    private final void y0() {
        if(this.f != null && this.f.isActive()) {
            return;
        }
        U1 u10 = this.x0();
        V v0 = r0.a(((long)u10.q.getSelectedMinValue()), ((long)u10.q.getSelectedIntervalValue()));
        this.f = this.b == null ? null : this.w0(this.b, ((Number)v0.a()).longValue(), ((Number)v0.b()).longValue(), com.dcinside.app.gif.frame.d.a.a);
    }

    private final Object z0(kotlin.coroutines.d d0) {
        @f(c = "com.dcinside.app.gif.GifVideoSeekFragment$onDisplayPreviewsAsync$2", f = "GifVideoSeekFragment.kt", i = {1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3}, l = {202, 0xCF, 0xD9, 0xDB, 0xED, 0xFC}, m = "invokeSuspend", n = {"maker", "maker", "$this$forEachIndexed$iv", "iv", "size", "interval", "index$iv", "index", "maker", "$this$forEachIndexed$iv", "size", "interval", "index$iv"}, s = {"L$0", "L$0", "L$1", "L$3", "I$0", "J$0", "I$1", "I$4", "L$0", "L$1", "I$0", "J$0", "I$1"})
        @s0({"SMAP\nGifVideoSeekFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GifVideoSeekFragment.kt\ncom/dcinside/app/gif/GifVideoSeekFragment$onDisplayPreviewsAsync$2\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,325:1\n13411#2,3:326\n*S KotlinDebug\n*F\n+ 1 GifVideoSeekFragment.kt\ncom/dcinside/app/gif/GifVideoSeekFragment$onDisplayPreviewsAsync$2\n*L\n215#1:326,3\n*E\n"})
        static final class com.dcinside.app.gif.o.b extends kotlin.coroutines.jvm.internal.o implements A3.o {
            Object k;
            Object l;
            Object m;
            Object n;
            int o;
            int p;
            int q;
            int r;
            int s;
            long t;
            int u;
            final o v;

            com.dcinside.app.gif.o.b(o o0, kotlin.coroutines.d d0) {
                this.v = o0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                return new com.dcinside.app.gif.o.b(this.v, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                return ((com.dcinside.app.gif.o.b)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                @f(c = "com.dcinside.app.gif.GifVideoSeekFragment$onDisplayPreviewsAsync$2$1", f = "GifVideoSeekFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.gif.o.b.a extends kotlin.coroutines.jvm.internal.o implements A3.o {
                    int k;
                    final o l;

                    com.dcinside.app.gif.o.b.a(o o0, kotlin.coroutines.d d0) {
                        this.l = o0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.gif.o.b.a(this.l, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.gif.o.b.a)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        this.l.D0(0.0f);
                        this.l.x0().o.setVisibility(0);
                        return S0.a;
                    }
                }


                @f(c = "com.dcinside.app.gif.GifVideoSeekFragment$onDisplayPreviewsAsync$2$2$1$1", f = "GifVideoSeekFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.gif.o.b.b extends kotlin.coroutines.jvm.internal.o implements A3.o {
                    int k;
                    final o l;
                    final int m;
                    final int n;
                    final ImageView o;
                    final Frame p;

                    com.dcinside.app.gif.o.b.b(o o0, int v, int v1, ImageView imageView0, Frame frame0, kotlin.coroutines.d d0) {
                        this.l = o0;
                        this.m = v;
                        this.n = v1;
                        this.o = imageView0;
                        this.p = frame0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.gif.o.b.b(this.l, this.m, this.n, this.o, this.p, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.gif.o.b.b)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        this.l.D0((((float)this.m) + 1.0f) / ((float)this.n));
                        File file0 = new File(this.p.c());
                        s.g(this.o, file0).b().apply();
                        return S0.a;
                    }
                }


                @f(c = "com.dcinside.app.gif.GifVideoSeekFragment$onDisplayPreviewsAsync$2$4", f = "GifVideoSeekFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.gif.o.b.c extends kotlin.coroutines.jvm.internal.o implements A3.o {
                    int k;
                    final o l;
                    final long m;

                    com.dcinside.app.gif.o.b.c(o o0, long v, kotlin.coroutines.d d0) {
                        this.l = o0;
                        this.m = v;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.gif.o.b.c(this.l, this.m, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.gif.o.b.c)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        this.l.D0(1.0f);
                        U1 u10 = this.l.x0();
                        u10.q.setEnabled(true);
                        double f = Math.min(this.m, 10000.0);
                        u10.q.t(0.0, ((double)this.m), 100.0, f);
                        u10.q.setSelectedIntervalValue(f);
                        u10.q.setSelectedMinValue(0.0);
                        L.m(u10.q);
                        this.l.A0(u10.q, 0.0, f);
                        return S0.a;
                    }
                }


                @f(c = "com.dcinside.app.gif.GifVideoSeekFragment$onDisplayPreviewsAsync$2$5", f = "GifVideoSeekFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.gif.o.b.d extends kotlin.coroutines.jvm.internal.o implements A3.o {
                    int k;
                    final o l;

                    com.dcinside.app.gif.o.b.d(o o0, kotlin.coroutines.d d0) {
                        this.l = o0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.gif.o.b.d(this.l, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.gif.o.b.d)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        this.l.x0().o.setVisibility(8);
                        return S0.a;
                    }
                }


                @f(c = "com.dcinside.app.gif.GifVideoSeekFragment$onDisplayPreviewsAsync$2$maker$1$1", f = "GifVideoSeekFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                static final class com.dcinside.app.gif.o.b.e extends kotlin.coroutines.jvm.internal.o implements A3.o {
                    int k;
                    final o l;

                    com.dcinside.app.gif.o.b.e(o o0, kotlin.coroutines.d d0) {
                        this.l = o0;
                        super(2, d0);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @l
                    public final kotlin.coroutines.d create(@m Object object0, @l kotlin.coroutines.d d0) {
                        return new com.dcinside.app.gif.o.b.e(this.l, d0);
                    }

                    @Override  // A3.o
                    public Object invoke(Object object0, Object object1) {
                        return this.invoke(((O)object0), ((kotlin.coroutines.d)object1));
                    }

                    @m
                    public final Object invoke(@l O o0, @m kotlin.coroutines.d d0) {
                        return ((com.dcinside.app.gif.o.b.e)this.create(o0, d0)).invokeSuspend(S0.a);
                    }

                    @Override  // kotlin.coroutines.jvm.internal.a
                    @m
                    public final Object invokeSuspend(@l Object object0) {
                        if(this.k != 0) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f0.n(object0);
                        FragmentActivity fragmentActivity0 = this.l.getActivity();
                        GifMakeActivity gifMakeActivity0 = fragmentActivity0 instanceof GifMakeActivity ? ((GifMakeActivity)fragmentActivity0) : null;
                        if(gifMakeActivity0 != null) {
                            String s = this.l.getString(0x7F1503EC);  // string:gif_not_supported "지원하지 않는 파일형식입니다."
                            L.o(s, "getString(...)");
                            gifMakeActivity0.L1(s);
                            return S0.a;
                        }
                        return null;
                    }
                }

                d d4;
                Frame frame0;
                ImageView imageView3;
                ImageView[] arr_imageView6;
                long v14;
                ImageView imageView1;
                ImageView[] arr_imageView4;
                int v13;
                d d3;
                int v12;
                int v11;
                Object object2;
                int v10;
                int v4;
                int v3;
                long v2;
                ImageView[] arr_imageView2;
                o o0;
                int v1;
                int v;
                d d1;
                d d0;
                Object object1 = b.l();
                switch(this.u) {
                    case 0: {
                        f0.n(object0);
                        d0 = this.v.b;
                        if(d0 == null) {
                            com.dcinside.app.gif.o.b.e o$b$e0 = new com.dcinside.app.gif.o.b.e(this.v, null);
                            this.u = 1;
                            return i.h(h0.e(), o$b$e0, this) == object1 ? object1 : S0.a;
                        }
                        com.dcinside.app.gif.o.b.a o$b$a0 = new com.dcinside.app.gif.o.b.a(this.v, null);
                        this.k = d0;
                        this.u = 2;
                        if(i.h(h0.e(), o$b$a0, this) == object1) {
                            return object1;
                        }
                        d1 = d0;
                        goto label_25;
                    }
                    case 1: {
                        f0.n(object0);
                        return S0.a;
                    }
                    case 2: {
                        d0 = (d)this.k;
                        f0.n(object0);
                        d1 = d0;
                        try {
                        label_25:
                            ImageView[] arr_imageView = this.v.i;
                            ImageView[] arr_imageView1 = this.v.i;
                            v = arr_imageView1.length;
                            v1 = 0;
                            o0 = this.v;
                            arr_imageView2 = arr_imageView1;
                            v2 = (long)Math.max(((float)((com.dcinside.app.gif.maker.c)d1.j()).f1()) / ((float)arr_imageView.length), 1.0f);
                            v3 = arr_imageView.length;
                            v4 = 0;
                            goto label_80;
                        }
                        catch(Exception exception0) {
                            goto label_145;
                        }
                    }
                    case 3: {
                        int v5 = this.s;
                        int v6 = this.r;
                        int v7 = this.q;
                        int v8 = this.p;
                        long v9 = this.t;
                        v10 = this.o;
                        ImageView imageView0 = (ImageView)this.n;
                        o o1 = (o)this.m;
                        ImageView[] arr_imageView3 = (ImageView[])this.l;
                        d d2 = (d)this.k;
                        try {
                            f0.n(object0);
                            object2 = object0;
                            v11 = v5;
                            v12 = v6;
                            d3 = d2;
                            v13 = v8;
                            arr_imageView4 = arr_imageView3;
                            v1 = v7;
                            imageView1 = imageView0;
                            o0 = o1;
                            v14 = v9;
                            goto label_108;
                        }
                        catch(Exception exception0) {
                            d1 = d2;
                            goto label_145;
                        }
                    }
                    case 4: {
                        int v15 = this.r;
                        int v16 = this.q;
                        int v17 = this.p;
                        long v18 = this.t;
                        int v19 = this.o;
                        ImageView imageView2 = (ImageView)this.n;
                        o o2 = (o)this.m;
                        ImageView[] arr_imageView5 = (ImageView[])this.l;
                        d1 = (d)this.k;
                        try {
                            f0.n(object0);
                            v13 = v17;
                            while(true) {
                            label_71:
                                arr_imageView6 = arr_imageView5;
                                v1 = v16;
                                v3 = v19;
                                o0 = o2;
                                v = v15;
                                v4 = v13;
                            label_77:
                                ++v1;
                                v2 = v18;
                                arr_imageView2 = arr_imageView6;
                            label_80:
                                if(v1 >= v) {
                                    goto label_154;
                                }
                                imageView3 = arr_imageView2[v1];
                                v13 = v4 + 1;
                                X x0 = d1.p(true, ((long)v4) * v2 + 1L);
                                this.k = d1;
                                this.l = arr_imageView2;
                                this.m = o0;
                                this.n = imageView3;
                                this.o = v3;
                                this.t = v2;
                                this.p = v13;
                                this.q = v1;
                                this.r = v;
                                this.s = v4;
                                this.u = 3;
                                object2 = x0.o(this);
                                break;
                            }
                        }
                        catch(Exception exception0) {
                            goto label_145;
                        }
                        if(object2 == object1) {
                            return object1;
                        }
                        v11 = v4;
                        arr_imageView4 = arr_imageView2;
                        v12 = v;
                        imageView1 = imageView3;
                        v10 = v3;
                        d3 = d1;
                        v14 = v2;
                        try {
                        label_108:
                            frame0 = (Frame)object2;
                            if(imageView1 == null) {
                                goto label_135;
                            }
                            d4 = d3;
                        }
                        catch(Exception exception0) {
                            goto label_143;
                        }
                        try {
                            com.dcinside.app.gif.o.b.b o$b$b0 = new com.dcinside.app.gif.o.b.b(o0, v11, v10, imageView1, frame0, null);
                            this.k = d4;
                            this.l = arr_imageView4;
                            this.m = o0;
                            this.n = imageView1;
                            this.o = v10;
                            this.t = v14;
                            this.p = v13;
                            this.q = v1;
                            this.r = v12;
                            this.u = 4;
                            if(i.h(h0.e(), o$b$b0, this) == object1) {
                                return object1;
                            }
                        }
                        catch(Exception exception0) {
                            goto label_144;
                        }
                        o2 = o0;
                        v19 = v10;
                        v15 = v12;
                        v16 = v1;
                        v18 = v14;
                        d1 = d4;
                        arr_imageView5 = arr_imageView4;
                        goto label_71;
                        try {
                        label_135:
                            arr_imageView6 = arr_imageView4;
                            v = v12;
                            v18 = v14;
                            v4 = v13;
                            d1 = d3;
                            v3 = v10;
                            goto label_77;
                        }
                        catch(Exception exception0) {
                        label_143:
                            d4 = d3;
                        }
                    label_144:
                        d1 = d4;
                    label_145:
                        timber.log.b.a.y(exception0);
                        String s = exception0.getMessage();
                        if(s == null) {
                            s = this.v.getString(0x7F1503EC);  // string:gif_not_supported "지원하지 않는 파일형식입니다."
                            L.o(s, "getString(...)");
                        }
                        FragmentActivity fragmentActivity0 = this.v.getActivity();
                        GifMakeActivity gifMakeActivity0 = fragmentActivity0 instanceof GifMakeActivity ? ((GifMakeActivity)fragmentActivity0) : null;
                        if(gifMakeActivity0 != null) {
                            gifMakeActivity0.L1(s);
                        }
                    label_154:
                        if(!this.v.h) {
                            synchronized(this.v.g) {
                                this.v.g.wait(5000L);
                            }
                        }
                        if(this.v.h) {
                            com.dcinside.app.gif.o.b.c o$b$c0 = new com.dcinside.app.gif.o.b.c(this.v, ((com.dcinside.app.gif.maker.c)d1.j()).f1(), null);
                            this.k = null;
                            this.l = null;
                            this.m = null;
                            this.n = null;
                            this.u = 5;
                            if(i.h(h0.e(), o$b$c0, this) == object1) {
                                return object1;
                            }
                        }
                        else {
                            FragmentActivity fragmentActivity1 = this.v.getActivity();
                            GifMakeActivity gifMakeActivity1 = fragmentActivity1 instanceof GifMakeActivity ? ((GifMakeActivity)fragmentActivity1) : null;
                            if(gifMakeActivity1 != null) {
                                String s1 = this.v.getString(0x7F1503EC);  // string:gif_not_supported "지원하지 않는 파일형식입니다."
                                L.o(s1, "getString(...)");
                                gifMakeActivity1.L1(s1);
                            }
                        }
                        goto label_179;
                    }
                    case 5: {
                        break;
                    }
                    case 6: {
                        f0.n(object0);
                        return S0.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                f0.n(object0);
            label_179:
                com.dcinside.app.gif.o.b.d o$b$d0 = new com.dcinside.app.gif.o.b.d(this.v, null);
                this.k = null;
                this.l = null;
                this.m = null;
                this.n = null;
                this.u = 6;
                return i.h(h0.e(), o$b$d0, this) == object1 ? object1 : S0.a;
            }
        }

        LifecycleOwner lifecycleOwner0 = this.getViewLifecycleOwner();
        L.o(lifecycleOwner0, "getViewLifecycleOwner(...)");
        k.f(LifecycleOwnerKt.a(lifecycleOwner0), h0.c(), null, new com.dcinside.app.gif.o.b(this, null), 2, null);
        return S0.a;
    }
}

