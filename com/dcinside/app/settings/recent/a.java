package com.dcinside.app.settings.recent;

import A3.p;
import Y.f1;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.dcinside.app.base.g;
import com.dcinside.app.internal.r;
import com.dcinside.app.rx.bus.K;
import com.dcinside.app.rx.bus.c;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.Xk;
import com.dcinside.app.util.vk;
import io.realm.F0;
import kotlin.S0;
import kotlin.V;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.r0;
import kotlin.text.v;
import kotlinx.coroutines.O;
import y4.l;
import y4.m;

@s0({"SMAP\nAddRecentGalleryDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddRecentGalleryDialog.kt\ncom/dcinside/app/settings/recent/AddRecentGalleryDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n*L\n1#1,132:1\n1#2:133\n177#3,9:134\n*S KotlinDebug\n*F\n+ 1 AddRecentGalleryDialog.kt\ncom/dcinside/app/settings/recent/AddRecentGalleryDialog\n*L\n124#1:134,9\n*E\n"})
public final class a extends DialogFragment {
    public static final class com.dcinside.app.settings.recent.a.a {
        private com.dcinside.app.settings.recent.a.a() {
        }

        public com.dcinside.app.settings.recent.a.a(w w0) {
        }
    }

    @m
    private f1 a;
    @l
    public static final com.dcinside.app.settings.recent.a.a b = null;
    @l
    public static final String c = "AddRecentGalleryDialog_gallery_id";
    @l
    public static final String d = "AddRecentGalleryDialog_gallery_name";

    static {
        a.b = new com.dcinside.app.settings.recent.a.a(null);
    }

    private final void m0() {
        Context context0 = this.getContext();
        String s = null;
        g g0 = context0 instanceof g ? ((g)context0) : null;
        F0 f00 = g0 == null ? null : g0.F1();
        Bundle bundle0 = this.getArguments();
        if(bundle0 != null) {
            s = bundle0.getString("AddRecentGalleryDialog_gallery_id");
        }
        if(f00 != null && s != null) {
            com.dcinside.app.realm.s0.a s0$a0 = com.dcinside.app.realm.s0.j;
            com.dcinside.app.realm.s0 s00 = s0$a0.m(f00, s);
            if(s00 == null) {
                this.n0(false);
                return;
            }
            s0$a0.o(f00, s00, true);
            Dl.D(g0, 0x7F150362);  // string:fix_recent_gallery_added "갤러리가 상단 고정되었습니다."
            c.a(g0, new K(s));
            this.n0(false);
            return;
        }
        this.n0(false);
    }

    private final void n0(boolean z) {
        if(z) {
            FragmentActivity fragmentActivity0 = this.getActivity();
            String s = null;
            AppCompatActivity appCompatActivity0 = fragmentActivity0 instanceof AppCompatActivity ? ((AppCompatActivity)fragmentActivity0) : null;
            Bundle bundle0 = this.getArguments();
            if(bundle0 != null) {
                s = bundle0.getString("AddRecentGalleryDialog_gallery_id");
            }
            if(appCompatActivity0 != null && s != null) {
                Xk.i(appCompatActivity0, s);
            }
        }
        try {
            this.dismissAllowingStateLoss();
        }
        catch(Exception unused_ex) {
        }
    }

    private final f1 o0() {
        f1 f10 = this.a;
        L.m(f10);
        return f10;
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
        this.a = f1.d(layoutInflater0, viewGroup0, false);
        View view0 = this.o0().b();
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
        @f(c = "com.dcinside.app.settings.recent.AddRecentGalleryDialog$onViewCreated$1", f = "AddRecentGalleryDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class b extends o implements p {
            int k;
            final a l;

            b(a a0, d d0) {
                this.l = a0;
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


        @f(c = "com.dcinside.app.settings.recent.AddRecentGalleryDialog$onViewCreated$2", f = "AddRecentGalleryDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.settings.recent.a.c extends o implements p {
            int k;
            final a l;

            com.dcinside.app.settings.recent.a.c(a a0, d d0) {
                this.l = a0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.settings.recent.a.c(this.l, d0).invokeSuspend(S0.a);
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
                this.l.n0(true);
                return S0.a;
            }
        }


        @f(c = "com.dcinside.app.settings.recent.AddRecentGalleryDialog$onViewCreated$3", f = "AddRecentGalleryDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class com.dcinside.app.settings.recent.a.d extends o implements p {
            int k;
            final a l;

            com.dcinside.app.settings.recent.a.d(a a0, d d0) {
                this.l = a0;
                super(3, d0);
            }

            @m
            public final Object a(@l O o0, @l View view0, @m d d0) {
                return new com.dcinside.app.settings.recent.a.d(this.l, d0).invokeSuspend(S0.a);
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
                this.l.n0(false);
                return S0.a;
            }
        }

        String s;
        L.p(view0, "view");
        super.onViewCreated(view0, bundle0);
        f1 f10 = this.o0();
        L.o(f10.c, "dialogFixRecentGalleryApply");
        b a$b0 = new b(this, null);
        r.M(f10.c, null, a$b0, 1, null);
        f1 f11 = this.o0();
        L.o(f11.d, "dialogFixRecentGalleryCancel");
        com.dcinside.app.settings.recent.a.c a$c0 = new com.dcinside.app.settings.recent.a.c(this, null);
        r.M(f11.d, null, a$c0, 1, null);
        f1 f12 = this.o0();
        L.o(f12.b, "dialogFixRecentGallery");
        com.dcinside.app.settings.recent.a.d a$d0 = new com.dcinside.app.settings.recent.a.d(this, null);
        r.M(f12.b, null, a$d0, 1, null);
        TextView textView0 = this.o0().e;
        Context context0 = textView0.getContext();
        Bundle bundle1 = this.getArguments();
        if(bundle1 == null) {
            s = "";
        }
        else {
            s = bundle1.getString("AddRecentGalleryDialog_gallery_name");
            if(s == null) {
                s = "";
            }
        }
        L.m(s);
        String s1 = this.getString(0x7F150367, new Object[]{s});  // string:fix_recent_gallery_message "자주 방문하는 \'%s\' 갤러리를"
        L.o(s1, "getString(...)");
        String s2 = this.getString(0x7F150368);  // string:fix_recent_gallery_message2 "상단 고정하겠습니까?\n(최근 방문 탭에서 롱터치하여 해제 가능)"
        L.o(s2, "getString(...)");
        String s3 = this.getString(0x7F15035F);  // string:fix_recent_gallery_accent "상단 고정"
        L.o(s3, "getString(...)");
        SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder(s1);
        int v = v.s3(spannableStringBuilder0, s, 0, false, 6, null);
        V v1 = r0.a(v, ((int)(v + s.length())));
        spannableStringBuilder0.setSpan(new StyleSpan(1), ((Number)v1.a()).intValue(), ((Number)v1.b()).intValue(), 33);
        spannableStringBuilder0.append(' ');
        L.m(context0);
        com.dcinside.app.internal.l.a(spannableStringBuilder0, "**", new com.dcinside.app.span.o(context0, 0x7F08033D, vk.c(context0, 0x7F0401FF), 0, 0, false, 0x20, null));  // drawable:ico_pin_set
        spannableStringBuilder0.append(' ');
        spannableStringBuilder0.append(s2);
        int v2 = v.s3(spannableStringBuilder0, s3, 0, false, 6, null);
        V v3 = r0.a(v2, ((int)(v2 + s3.length())));
        int v4 = ((Number)v3.a()).intValue();
        int v5 = ((Number)v3.b()).intValue();
        spannableStringBuilder0.setSpan(new ForegroundColorSpan(vk.b(context0, 0x7F04012E)), v4, v5, 33);  // attr:colorAccent
        spannableStringBuilder0.setSpan(new StyleSpan(1), v4, v5, 33);
        textView0.setText(spannableStringBuilder0);
    }
}

