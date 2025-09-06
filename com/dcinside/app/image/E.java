package com.dcinside.app.image;

import A3.p;
import Y.L7;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentManager;
import com.dcinside.app.internal.r;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.c;
import com.google.android.material.bottomsheet.d;
import kotlin.S0;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nImageBlockSettingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageBlockSettingFragment.kt\ncom/dcinside/app/image/ImageBlockSettingFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,150:1\n257#2,2:151\n257#2,2:153\n1#3:155\n*S KotlinDebug\n*F\n+ 1 ImageBlockSettingFragment.kt\ncom/dcinside/app/image/ImageBlockSettingFragment\n*L\n68#1:151,2\n69#1:153,2\n*E\n"})
public final class e extends d {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @m
    private L7 b;
    private ViewTreeObserver.OnGlobalLayoutListener c;
    @l
    public static final a d = null;
    @l
    public static final String e = "com.dcinside.app.image.ImageBlockSettingFragment";
    @l
    public static final String f = "com.dcinside.app.image.ImageBlockSettingFragment_EXTRA_IS_MANAGER";
    @l
    public static final String g = "com.dcinside.app.image.ImageBlockSettingFragment_EXTRA_IMAGE_DOWNLOAD_URL";
    @l
    public static final String h = "com.dcinside.app.image.EXTRA_IS_MANAGER_BLOCKED";
    @l
    public static final String i = "com.dcinside.app.image.EXTRA_HAS_BLOCK_DATA";
    @l
    public static final String j = "com.dcinside.app.image.ImageBlockSettingFragment_EXTRA_SETTING_SELECT_INDEX";

    static {
        e.d = new a(null);
    }

    @Override  // com.google.android.material.bottomsheet.d
    @l
    public Dialog onCreateDialog(@m Bundle bundle0) {
        Dialog dialog0 = new c(this.requireContext(), this.getTheme());
        ((c)dialog0).w(true);
        return dialog0;
    }

    @Override  // androidx.fragment.app.Fragment
    @l
    public View onCreateView(@l LayoutInflater layoutInflater0, @m ViewGroup viewGroup0, @m Bundle bundle0) {
        L.p(layoutInflater0, "inflater");
        this.b = L7.d(layoutInflater0, viewGroup0, false);
        View view0 = this.q0().b();
        L.o(view0, "getRoot(...)");
        return view0;
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void onDestroyView() {
        View view0 = this.getView();
        if(view0 != null) {
            ViewTreeObserver viewTreeObserver0 = view0.getViewTreeObserver();
            if(viewTreeObserver0 != null) {
                ViewTreeObserver.OnGlobalLayoutListener viewTreeObserver$OnGlobalLayoutListener0 = this.c;
                if(viewTreeObserver$OnGlobalLayoutListener0 == null) {
                    L.S("listener");
                    viewTreeObserver$OnGlobalLayoutListener0 = null;
                }
                viewTreeObserver0.removeOnGlobalLayoutListener(viewTreeObserver$OnGlobalLayoutListener0);
            }
        }
        super.onDestroyView();
        FragmentKt.b(this, "com.dcinside.app.image.ImageBlockSettingFragment");
        this.b = null;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onViewCreated(@l View view0, @m Bundle bundle0) {
        L.p(view0, "view");
        super.onViewCreated(view0, bundle0);
        this.s0();
        this.t0();
    }

    private final L7 q0() {
        L7 l70 = this.b;
        L.m(l70);
        return l70;
    }

    private final void r0(View view0) {
        int v;
        if(view0 == null) {
            return;
        }
        switch(view0.getId()) {
            case 0x7F0B0E7B: {  // id:setting_image_block
                v = 3;
                break;
            }
            case 0x7F0B0E7C: {  // id:setting_image_block_download
                v = 0;
                break;
            }
            case 0x7F0B0E7D: {  // id:setting_image_block_download_origin
                v = 1;
                break;
            }
            case 0x7F0B0E7F: {  // id:setting_image_block_manager_wrap
                v = 4;
                break;
            }
            case 0x7F0B0E81: {  // id:setting_image_block_show
                v = 2;
                break;
            }
            default: {
                return;
            }
        }
        FragmentManager fragmentManager0 = this.getParentFragmentManager();
        Bundle bundle0 = new Bundle();
        Bundle bundle1 = this.getArguments();
        bundle0.putString("com.dcinside.app.image.ImageBlockSettingFragment_EXTRA_IMAGE_DOWNLOAD_URL", (bundle1 == null ? null : bundle1.getString("com.dcinside.app.image.ImageBlockSettingFragment_EXTRA_IMAGE_DOWNLOAD_URL")));
        bundle0.putInt("com.dcinside.app.image.ImageBlockSettingFragment_EXTRA_SETTING_SELECT_INDEX", v);
        fragmentManager0.a("com.dcinside.app.image.ImageBlockSettingFragment", bundle0);
        this.dismissAllowingStateLoss();
    }

    private final void s0() {
        Context context0 = this.getContext();
        if(context0 == null) {
            this.dismissAllowingStateLoss();
            return;
        }
        Bundle bundle0 = this.getArguments();
        int v = 0;
        boolean z = bundle0 == null ? false : bundle0.getBoolean("com.dcinside.app.image.ImageBlockSettingFragment_EXTRA_IS_MANAGER");
        Bundle bundle1 = this.getArguments();
        boolean z1 = bundle1 == null ? false : bundle1.getBoolean("com.dcinside.app.image.EXTRA_HAS_BLOCK_DATA");
        Bundle bundle2 = this.getArguments();
        boolean z2 = bundle2 == null ? false : bundle2.getBoolean("com.dcinside.app.image.EXTRA_IS_MANAGER_BLOCKED");
        TextView textView0 = this.q0().b;
        L.o(textView0, "settingImageBlock");
        textView0.setVisibility((z1 ? 0 : 8));
        FrameLayout frameLayout0 = this.q0().f;
        L.o(frameLayout0, "settingImageBlockManagerWrap");
        if(!z || !z1) {
            v = 8;
        }
        frameLayout0.setVisibility(v);
        this.q0().e.setText(context0.getString((z2 ? 0x7F15004F : 0x7F150025)));  // string:action_unblock_image_manager "매니저 - 이미지 차단 해제"
    }

    private final void t0() {
        @f(c = "com.dcinside.app.image.ImageBlockSettingFragment$setupListener$2", f = "ImageBlockSettingFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements p {
            int k;
            Object l;
            final e m;

            b(e e0, kotlin.coroutines.d d0) {
                this.m = e0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                b e$b0 = new b(this.m, d0);
                e$b0.l = view0;
                return e$b0.invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.m.r0(((View)this.l));
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.image.ImageBlockSettingFragment$setupListener$3", f = "ImageBlockSettingFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.image.e.c extends o implements p {
            int k;
            Object l;
            final e m;

            com.dcinside.app.image.e.c(e e0, kotlin.coroutines.d d0) {
                this.m = e0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                com.dcinside.app.image.e.c e$c0 = new com.dcinside.app.image.e.c(this.m, d0);
                e$c0.l = view0;
                return e$c0.invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.m.r0(((View)this.l));
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.image.ImageBlockSettingFragment$setupListener$4", f = "ImageBlockSettingFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.image.e.d extends o implements p {
            int k;
            Object l;
            final e m;

            com.dcinside.app.image.e.d(e e0, kotlin.coroutines.d d0) {
                this.m = e0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                com.dcinside.app.image.e.d e$d0 = new com.dcinside.app.image.e.d(this.m, d0);
                e$d0.l = view0;
                return e$d0.invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.m.r0(((View)this.l));
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.image.ImageBlockSettingFragment$setupListener$5", f = "ImageBlockSettingFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.image.e.e extends o implements p {
            int k;
            Object l;
            final e m;

            com.dcinside.app.image.e.e(e e0, kotlin.coroutines.d d0) {
                this.m = e0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                com.dcinside.app.image.e.e e$e0 = new com.dcinside.app.image.e.e(this.m, d0);
                e$e0.l = view0;
                return e$e0.invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.m.r0(((View)this.l));
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.image.ImageBlockSettingFragment$setupListener$6", f = "ImageBlockSettingFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.image.e.f extends o implements p {
            int k;
            Object l;
            final e m;

            com.dcinside.app.image.e.f(e e0, kotlin.coroutines.d d0) {
                this.m = e0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m kotlin.coroutines.d d0) {
                com.dcinside.app.image.e.f e$f0 = new com.dcinside.app.image.e.f(this.m, d0);
                e$f0.l = view0;
                return e$f0.invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((kotlin.coroutines.d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.m.r0(((View)this.l));
                return S0.a;
            }
        }

        this.c = () -> {
            L.p(this, "this$0");
            Dialog dialog0 = this.getDialog();
            c c0 = dialog0 instanceof c ? ((c)dialog0) : null;
            if(c0 != null) {
                FrameLayout frameLayout0 = (FrameLayout)c0.findViewById(0x7F0B03C6);  // id:design_bottom_sheet
                if(frameLayout0 != null) {
                    frameLayout0.setBackgroundResource(0x106000D);
                    BottomSheetBehavior bottomSheetBehavior0 = BottomSheetBehavior.x0(frameLayout0);
                    bottomSheetBehavior0.g(3);
                    bottomSheetBehavior0.f1(false);
                    bottomSheetBehavior0.p1(0);
                }
            }
        };
        View view0 = this.getView();
        if(view0 != null) {
            ViewTreeObserver viewTreeObserver0 = view0.getViewTreeObserver();
            if(viewTreeObserver0 != null) {
                ViewTreeObserver.OnGlobalLayoutListener viewTreeObserver$OnGlobalLayoutListener0 = this.c;
                if(viewTreeObserver$OnGlobalLayoutListener0 == null) {
                    L.S("listener");
                    viewTreeObserver$OnGlobalLayoutListener0 = null;
                }
                viewTreeObserver0.addOnGlobalLayoutListener(viewTreeObserver$OnGlobalLayoutListener0);
            }
        }
        L7 l70 = this.q0();
        L.o(l70.c, "settingImageBlockDownload");
        b e$b0 = new b(this, null);
        r.M(l70.c, null, e$b0, 1, null);
        L7 l71 = this.q0();
        L.o(l71.d, "settingImageBlockDownloadOrigin");
        com.dcinside.app.image.e.c e$c0 = new com.dcinside.app.image.e.c(this, null);
        r.M(l71.d, null, e$c0, 1, null);
        L7 l72 = this.q0();
        L.o(l72.h, "settingImageBlockShow");
        com.dcinside.app.image.e.d e$d0 = new com.dcinside.app.image.e.d(this, null);
        r.M(l72.h, null, e$d0, 1, null);
        L7 l73 = this.q0();
        L.o(l73.b, "settingImageBlock");
        com.dcinside.app.image.e.e e$e0 = new com.dcinside.app.image.e.e(this, null);
        r.M(l73.b, null, e$e0, 1, null);
        L7 l74 = this.q0();
        L.o(l74.f, "settingImageBlockManagerWrap");
        com.dcinside.app.image.e.f e$f0 = new com.dcinside.app.image.e.f(this, null);
        r.M(l74.f, null, e$f0, 1, null);
    }

    // 检测为 Lambda 实现
    private static final void u0(e e0) [...]
}

