package com.dcinside.app.view.popupmenu;

import Y.h1;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.core.os.BundleCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentKt;
import com.dcinside.app.model.BlockWriterInfo;
import com.dcinside.app.read.reply.more.BlockState;
import com.dcinside.app.span.g;
import com.dcinside.app.util.vk;
import com.hjq.toast.s;
import io.realm.F0;
import io.realm.T0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nBlockWriterDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlockWriterDialogFragment.kt\ncom/dcinside/app/view/popupmenu/BlockWriterDialogFragment\n+ 2 ColorDrawable.kt\nandroidx/core/graphics/drawable/ColorDrawableKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,181:1\n27#2:182\n257#3,2:183\n257#3,2:185\n257#3,2:187\n257#3,2:189\n257#3,2:191\n257#3,2:193\n257#3,2:195\n257#3,2:197\n112#4,3:199\n129#4,15:203\n116#4:218\n129#4,15:219\n1#5:202\n*S KotlinDebug\n*F\n+ 1 BlockWriterDialogFragment.kt\ncom/dcinside/app/view/popupmenu/BlockWriterDialogFragment\n*L\n45#1:182\n64#1:183,2\n76#1:185,2\n80#1:187,2\n91#1:189,2\n93#1:191,2\n104#1:193,2\n106#1:195,2\n107#1:197,2\n119#1:199,3\n119#1:203,15\n119#1:218\n119#1:219,15\n119#1:202\n*E\n"})
public final class j extends DialogFragment {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @m
    private h1 a;
    @l
    public static final a b = null;
    @l
    public static final String c = "com.dcinside.app.view.popupmenu.BlockWriterDialogFragment.FRAGMENT_RESULT_KEY";
    @l
    public static final String d = "com.dcinside.app.view.popupmenu.BlockWriterDialogFragment.EXTRA_BLOCK_WRITER_INFO";
    @l
    public static final String e = "전체";

    static {
        j.b = new a(null);
    }

    // 检测为 Lambda 实现
    private static final void A0(j j0, String s, String s1, View view0) [...]

    // 检测为 Lambda 实现
    private static final void B0(j j0, String s, View view0) [...]

    private final void C0(boolean z, View view0, String s) {
        Context context0 = this.getContext();
        if(context0 == null) {
            return;
        }
        int v = vk.b(context0, 0x7F04012E);  // attr:colorAccent
        view0.setSelected(z);
        if(!(view0 instanceof TextView)) {
            return;
        }
        boolean z1 = L.g(s, "");
        if(z) {
            if(z1) {
                SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder("전체 갤 차단 해제");
                ((TextView)view0).setText(g.f(g.a, spannableStringBuilder0, "전체", v, false, 8, null));
                return;
            }
            ((TextView)view0).setText("현재 갤 차단 해제");
            return;
        }
        if(z1) {
            SpannableStringBuilder spannableStringBuilder1 = new SpannableStringBuilder("전체 갤 차단");
            ((TextView)view0).setText(g.f(g.a, spannableStringBuilder1, "전체", v, false, 8, null));
            return;
        }
        ((TextView)view0).setText("현재 갤 차단");
    }

    @Override  // androidx.fragment.app.Fragment
    @l
    public View onCreateView(@l LayoutInflater layoutInflater0, @m ViewGroup viewGroup0, @m Bundle bundle0) {
        L.p(layoutInflater0, "inflater");
        this.a = h1.d(layoutInflater0, viewGroup0, false);
        Dialog dialog0 = this.getDialog();
        if(dialog0 != null) {
            Window window0 = dialog0.getWindow();
            if(window0 != null) {
                window0.setBackgroundDrawable(new ColorDrawable(0));
            }
        }
        View view0 = this.s0().b();
        L.o(view0, "getRoot(...)");
        return view0;
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void onDestroyView() {
        super.onDestroyView();
        FragmentKt.d(this, "com.dcinside.app.view.popupmenu.BlockWriterDialogFragment.FRAGMENT_RESULT_KEY", BundleKt.a());
        FragmentKt.b(this, "com.dcinside.app.view.popupmenu.BlockWriterDialogFragment.FRAGMENT_RESULT_KEY");
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
        String s5;
        L.p(view0, "view");
        super.onViewCreated(view0, bundle0);
        Bundle bundle1 = this.getArguments();
        if(bundle1 == null) {
            return;
        }
        BlockWriterInfo blockWriterInfo0 = (BlockWriterInfo)BundleCompat.b(bundle1, "com.dcinside.app.view.popupmenu.BlockWriterDialogFragment.EXTRA_BLOCK_WRITER_INFO", BlockWriterInfo.class);
        if(blockWriterInfo0 == null) {
            return;
        }
        Context context0 = this.getContext();
        if(context0 == null) {
            return;
        }
        String s = blockWriterInfo0.m();
        String s1 = blockWriterInfo0.l();
        String s2 = blockWriterInfo0.i();
        String s3 = blockWriterInfo0.h();
        BlockState blockState0 = BlockState.d.a(s, s1, s2, s3);
        BlockState blockState1 = BlockState.d.a("", s1, s2, s3);
        h1 h10 = this.s0();
        b b0 = (View view0) -> {
            L.p(this, "this$0");
            this.dismissAllowingStateLoss();
        };
        h10.c.setOnClickListener(b0);
        h1 h11 = this.s0();
        c c0 = (View view0) -> {
            L.p(this, "this$0");
            this.dismissAllowingStateLoss();
        };
        h11.t.setOnClickListener(c0);
        int v = vk.b(context0, 0x7F04012E);  // attr:colorAccent
        if(s1.length() > 0) {
            h1 h12 = this.s0();
            L.o(h12.p, "blockWriterNameGroup");
            h12.p.setVisibility(0);
            this.s0().r.setText(s1);
            h1 h13 = this.s0();
            String s4 = context0.getString((blockState0.i() ? 0x7F1508B8 : 0x7F1508A9));  // string:reply_more_unblock_gall "현재 갤 차단 해제"
            h13.o.setText(s4);
            SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder(context0.getString((blockState1.i() ? 0x7F1508B3 : 0x7F1508A1)));  // string:reply_more_unblock_all "전체 갤 차단 해제"
            h1 h14 = this.s0();
            s5 = s3;
            SpannableStringBuilder spannableStringBuilder1 = g.f(g.a, spannableStringBuilder0, "전체", v, false, 8, null);
            h14.n.setText(spannableStringBuilder1);
            this.s0().o.setSelected(blockState0.i());
            this.s0().n.setSelected(blockState1.i());
            h1 h15 = this.s0();
            d d0 = (View view0) -> {
                L.p(this, "this$0");
                L.p(s, "$galleryId");
                L.p(s1, "$blockName");
                L.m(view0);
                this.t0("block_name", view0, s, s1);
            };
            h15.o.setOnClickListener(d0);
            h1 h16 = this.s0();
            e e0 = (View view0) -> {
                L.p(this, "this$0");
                L.p(s1, "$blockName");
                L.m(view0);
                this.t0("block_name", view0, "", s1);
            };
            h16.n.setOnClickListener(e0);
        }
        else {
            s5 = s3;
            h1 h17 = this.s0();
            L.o(h17.p, "blockWriterNameGroup");
            h17.p.setVisibility(8);
        }
        if(s2.length() > 0) {
            h1 h18 = this.s0();
            L.o(h18.k, "blockWriterIpGroup");
            h18.k.setVisibility(0);
            this.s0().m.setText(s2);
            h1 h19 = this.s0();
            String s6 = context0.getString((blockState0.h() ? 0x7F1508B8 : 0x7F1508A9));  // string:reply_more_unblock_gall "현재 갤 차단 해제"
            h19.j.setText(s6);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(context0.getString((blockState1.h() ? 0x7F1508B3 : 0x7F1508A1)));  // string:reply_more_unblock_all "전체 갤 차단 해제"
            h1 h110 = this.s0();
            SpannableStringBuilder spannableStringBuilder3 = g.f(g.a, spannableStringBuilder2, "전체", v, false, 8, null);
            h110.i.setText(spannableStringBuilder3);
            this.s0().j.setSelected(blockState0.h());
            this.s0().i.setSelected(blockState1.h());
            h1 h111 = this.s0();
            f f0 = (View view0) -> {
                L.p(this, "this$0");
                L.p(s, "$galleryId");
                L.p(s2, "$blockIp");
                L.m(view0);
                this.t0("block_ip", view0, s, s2);
            };
            h111.j.setOnClickListener(f0);
            h1 h112 = this.s0();
            com.dcinside.app.view.popupmenu.g g0 = (View view0) -> {
                L.p(this, "this$0");
                L.p(s2, "$blockIp");
                L.m(view0);
                this.t0("block_ip", view0, "", s2);
            };
            h112.i.setOnClickListener(g0);
            h1 h113 = this.s0();
            L.o(h113.f, "blockWriterIdGroup");
            h113.f.setVisibility(8);
            return;
        }
        if(s5.length() > 0) {
            h1 h114 = this.s0();
            L.o(h114.f, "blockWriterIdGroup");
            h114.f.setVisibility(0);
            this.s0().h.setText(s5);
            h1 h115 = this.s0();
            String s7 = context0.getString((blockState0.g() ? 0x7F1508B8 : 0x7F1508A9));  // string:reply_more_unblock_gall "현재 갤 차단 해제"
            h115.e.setText(s7);
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(context0.getString((blockState1.g() ? 0x7F1508B3 : 0x7F1508A1)));  // string:reply_more_unblock_all "전체 갤 차단 해제"
            h1 h116 = this.s0();
            SpannableStringBuilder spannableStringBuilder5 = g.f(g.a, spannableStringBuilder4, "전체", v, false, 8, null);
            h116.d.setText(spannableStringBuilder5);
            this.s0().e.setSelected(blockState0.g());
            this.s0().d.setSelected(blockState1.g());
            h1 h117 = this.s0();
            h h0 = (View view0) -> {
                L.p(this, "this$0");
                L.p(s, "$galleryId");
                L.p(s5, "$blockId");
                L.m(view0);
                this.t0("block_id", view0, s, s5);
            };
            h117.e.setOnClickListener(h0);
            h1 h118 = this.s0();
            i i0 = (View view0) -> {
                L.p(this, "this$0");
                L.p(s5, "$blockId");
                L.m(view0);
                this.t0("block_id", view0, "", s5);
            };
            h118.d.setOnClickListener(i0);
            h1 h119 = this.s0();
            L.o(h119.k, "blockWriterIpGroup");
            h119.k.setVisibility(8);
            return;
        }
        h1 h120 = this.s0();
        L.o(h120.k, "blockWriterIpGroup");
        h120.k.setVisibility(8);
        h1 h121 = this.s0();
        L.o(h121.f, "blockWriterIdGroup");
        h121.f.setVisibility(8);
    }

    private final h1 s0() {
        h1 h10 = this.a;
        L.m(h10);
        return h10;
    }

    private final void t0(String s, View view0, String s1, String s2) {
        Integer integer0;
        T0 t01;
        boolean z;
        T0 t00;
        String s3;
        F0 f00 = F0.g4();
        s3 = null;
        L.m(f00);
        if(!f00.E0()) {
            f00.beginTransaction();
            goto label_5;
        }
        goto label_29;
        try {
        label_5:
            com.dcinside.app.realm.e e0 = com.dcinside.app.realm.e.k.c(f00, s1);
            if(e0 != null) {
                switch(s) {
                    case "block_id": {
                        t00 = e0.U5();
                        goto label_14;
                    }
                    case "block_ip": {
                        t00 = e0.V5();
                        goto label_14;
                    }
                    case "block_name": {
                        t00 = e0.W5();
                    label_14:
                        if(t00.contains(s2)) {
                            t00.remove(s2);
                            z = false;
                        }
                        else {
                            t00.add(s2);
                            e0.a6(true);
                            z = true;
                        }
                        break;
                    }
                    default: {
                        z = false;
                        break;
                    }
                }
                f00.p();
                goto label_53;
            }
            goto label_27;
        }
        catch(Throwable throwable1) {
        }
        if(f00.E0()) {
            f00.e();
        }
        throw throwable1;
    label_27:
        kotlin.io.c.a(f00, null);
        return;
        try {
        label_29:
            com.dcinside.app.realm.e e1 = com.dcinside.app.realm.e.k.c(f00, s1);
            if(e1 != null) {
                switch(s) {
                    case "block_id": {
                        t01 = e1.U5();
                        goto label_38;
                    }
                    case "block_ip": {
                        t01 = e1.V5();
                        goto label_38;
                    }
                    case "block_name": {
                        t01 = e1.W5();
                    label_38:
                        if(t01.contains(s2)) {
                            t01.remove(s2);
                            z = false;
                        }
                        else {
                            t01.add(s2);
                            e1.a6(true);
                            z = true;
                        }
                        goto label_53;
                    }
                    default: {
                        z = false;
                        goto label_53;
                    }
                }
            }
            goto label_71;
        }
        catch(Throwable throwable2) {
        }
        try {
            throw throwable2;
        }
        catch(Throwable throwable0) {
        }
        try {
            throw throwable0;
        }
        catch(Throwable throwable3) {
            kotlin.io.c.a(f00, throwable0);
            throw throwable3;
        }
    label_53:
        kotlin.io.c.a(f00, null);
        switch(s) {
            case "block_id": {
                integer0 = (int)(z ? 0x7F150170 : 0x7F150B21);  // string:block_id "차단 완료 - 식별 코드 \'%1$s\'"
                break;
            }
            case "block_ip": {
                integer0 = (int)(z ? 0x7F150176 : 0x7F150B23);  // string:block_ip "차단 완료 - IP \'%1$s\'"
                break;
            }
            case "block_name": {
                integer0 = (int)(z ? 0x7F15017D : 0x7F150B25);  // string:block_nickname "차단 완료 - 닉네임 \'%1$s\'"
                break;
            }
            default: {
                integer0 = null;
            }
        }
        if(integer0 != null) {
            s.u(17, 0, this.s0().u.getHeight());
            Context context0 = this.getContext();
            if(context0 != null) {
                s3 = context0.getString(((int)integer0), new Object[]{s2});
            }
            s.C(s3);
            s.t(17);
        }
        this.C0(z, view0, s1);
        return;
    label_71:
        kotlin.io.c.a(f00, null);
    }

    // 检测为 Lambda 实现
    private static final void u0(j j0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void v0(j j0, View view0) [...]

    // 检测为 Lambda 实现
    private static final void w0(j j0, String s, String s1, View view0) [...]

    // 检测为 Lambda 实现
    private static final void x0(j j0, String s, View view0) [...]

    // 检测为 Lambda 实现
    private static final void y0(j j0, String s, String s1, View view0) [...]

    // 检测为 Lambda 实现
    private static final void z0(j j0, String s, View view0) [...]
}

