package com.dcinside.app.post;

import A3.p;
import Y.s1;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import com.dcinside.app.internal.r;
import com.dcinside.app.rx.bus.c;
import com.dcinside.app.rx.bus.y;
import com.dcinside.app.util.dl;
import kotlin.S0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

public final class c1 extends DialogFragment {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @m
    private s1 a;
    @l
    public static final a b = null;
    @l
    public static final String c = "com.dcinside.app.post.SearchKeywordPopupFragment_EXTRA_BUNDLE_KEYWORD";
    @l
    public static final String d = "com.dcinside.app.post.SearchKeywordPopupFragment_EXTRA_BUNDLE_GALLERY_ID";
    @l
    public static final String e = "com.dcinside.app.post.SearchKeywordPopupFragment_EXTRA_BUNDLE_GALLERY_NAME";

    static {
        c1.b = new a(null);
    }

    private final void m0() {
        if(Math.abs(dl.a.D0() - System.currentTimeMillis()) > 2500L) {
            this.dismissAllowingStateLoss();
        }
    }

    private final s1 n0() {
        s1 s10 = this.a;
        L.m(s10);
        return s10;
    }

    private final void o0() {
        Context context0 = this.getContext();
        if(context0 == null) {
            return;
        }
        Bundle bundle0 = this.getArguments();
        if(bundle0 != null) {
            String s = bundle0.getString("com.dcinside.app.post.SearchKeywordPopupFragment_EXTRA_BUNDLE_GALLERY_ID");
            if(s != null) {
                Bundle bundle1 = this.getArguments();
                if(bundle1 != null) {
                    String s1 = bundle1.getString("com.dcinside.app.post.SearchKeywordPopupFragment_EXTRA_BUNDLE_KEYWORD");
                    if(s1 != null) {
                        Bundle bundle2 = this.getArguments();
                        if(bundle2 != null) {
                            String s2 = bundle2.getString("com.dcinside.app.post.SearchKeywordPopupFragment_EXTRA_BUNDLE_GALLERY_NAME");
                            if(s2 != null) {
                                c.a(context0, new y(s, s2, s1));
                                this.dismissAllowingStateLoss();
                            }
                        }
                    }
                }
            }
        }
    }

    @Override  // androidx.fragment.app.DialogFragment
    @l
    public Dialog onCreateDialog(@m Bundle bundle0) {
        Dialog dialog0 = super.onCreateDialog(bundle0);
        L.o(dialog0, "onCreateDialog(...)");
        Window window0 = dialog0.getWindow();
        if(window0 != null) {
            window0.setBackgroundDrawable(new ColorDrawable(0));
        }
        return dialog0;
    }

    @Override  // androidx.fragment.app.Fragment
    @l
    public View onCreateView(@l LayoutInflater layoutInflater0, @m ViewGroup viewGroup0, @m Bundle bundle0) {
        L.p(layoutInflater0, "inflater");
        this.a = s1.d(layoutInflater0, viewGroup0, false);
        View view0 = this.n0().b();
        L.o(view0, "getRoot(...)");
        return view0;
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void onDestroyView() {
        super.onDestroyView();
        this.a = null;
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void onStart() {
        super.onStart();
        Dialog dialog0 = this.getDialog();
        if(dialog0 != null) {
            Window window0 = dialog0.getWindow();
            if(window0 != null) {
                window0.setLayout(-1, -1);
            }
        }
    }

    @Override  // androidx.fragment.app.Fragment
    public void onViewCreated(@l View view0, @m Bundle bundle0) {
        @f(c = "com.dcinside.app.post.SearchKeywordPopupFragment$onViewCreated$1", f = "SearchKeywordPopupFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements p {
            int k;
            final c1 l;

            b(c1 c10, d d0) {
                this.l = c10;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new b(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.m0();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.post.SearchKeywordPopupFragment$onViewCreated$2", f = "SearchKeywordPopupFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.post.c1.c extends o implements p {
            int k;
            final c1 l;

            com.dcinside.app.post.c1.c(c1 c10, d d0) {
                this.l = c10;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.post.c1.c(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.m0();
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.post.SearchKeywordPopupFragment$onViewCreated$3", f = "SearchKeywordPopupFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.post.c1.d extends o implements p {
            int k;
            final c1 l;

            com.dcinside.app.post.c1.d(c1 c10, d d0) {
                this.l = c10;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.post.c1.d(this.l, d0).invokeSuspend(S0.a);
            }

            @Override  // A3.p
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.a(((O)object0), ((View)object1), ((d)object2));
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.o0();
                return S0.a;
            }
        }

        L.p(view0, "view");
        super.onViewCreated(view0, bundle0);
        s1 s10 = this.n0();
        L.o(s10.d, "popupKeywordContent");
        b c1$b0 = new b(this, null);
        r.M(s10.d, null, c1$b0, 1, null);
        s1 s11 = this.n0();
        L.o(s11.c, "popupKeywordCancel");
        com.dcinside.app.post.c1.c c1$c0 = new com.dcinside.app.post.c1.c(this, null);
        r.M(s11.c, null, c1$c0, 1, null);
        s1 s12 = this.n0();
        L.o(s12.b, "popupKeywordApply");
        com.dcinside.app.post.c1.d c1$d0 = new com.dcinside.app.post.c1.d(this, null);
        r.M(s12.b, null, c1$d0, 1, null);
        Bundle bundle1 = this.getArguments();
        if(bundle1 != null) {
            String s = bundle1.getString("com.dcinside.app.post.SearchKeywordPopupFragment_EXTRA_BUNDLE_KEYWORD");
            if(s != null) {
                s1 s13 = this.n0();
                String s1 = this.getString(0x7F150521, new Object[]{s});  // string:keyword_popup_value "\'%s\'"
                s13.g.setText(s1);
            }
        }
        dl.a.v4(System.currentTimeMillis());
    }
}

