package com.dcinside.app.read.holder;

import android.content.Context;
import android.content.Intent;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.read.x;
import com.dcinside.app.settings.spoiler.SpoilerSettingActivity;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.v;
import y4.l;

@s0({"SMAP\nSpoilerHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpoilerHolder.kt\ncom/dcinside/app/read/holder/SpoilerHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,98:1\n257#2,2:99\n257#2,2:101\n*S KotlinDebug\n*F\n+ 1 SpoilerHolder.kt\ncom/dcinside/app/read/holder/SpoilerHolder\n*L\n75#1:99,2\n76#1:101,2\n*E\n"})
public final class t extends b {
    @s0({"SMAP\nSpoilerHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpoilerHolder.kt\ncom/dcinside/app/read/holder/SpoilerHolder$SpoilerConfigClickableSpan\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n*L\n1#1,98:1\n147#2:99\n*S KotlinDebug\n*F\n+ 1 SpoilerHolder.kt\ncom/dcinside/app/read/holder/SpoilerHolder$SpoilerConfigClickableSpan\n*L\n85#1:99\n*E\n"})
    static final class a extends ClickableSpan {
        @l
        private final com.dcinside.app.internal.t a;

        public a(@l t t0) {
            L.p(t0, "holder");
            super();
            this.a = new com.dcinside.app.internal.t(t0);
        }

        @Override  // android.text.style.ClickableSpan
        public void onClick(@l View view0) {
            L.p(view0, "widget");
            t t0 = (t)this.a.a();
            if(t0 != null) {
                t0.k();
            }
        }

        @Override  // android.text.style.ClickableSpan
        public void updateDrawState(@l TextPaint textPaint0) {
            L.p(textPaint0, "ds");
            textPaint0.setColor(-1);
            textPaint0.setUnderlineText(false);
        }
    }

    @l
    private final TextView b;
    @l
    private final View c;
    @l
    private final TextView d;
    @l
    private final ImageView e;

    public t(@l View view0) {
        L.p(view0, "itemView");
        super(view0, null, 2, null);
        View view1 = view0.findViewById(0x7F0B0C8C);  // id:read_spoiler_guide
        L.o(view1, "findViewById(...)");
        this.b = (TextView)view1;
        View view2 = view0.findViewById(0x7F0B0C8D);  // id:read_spoiler_guide_tip
        L.o(view2, "findViewById(...)");
        this.c = view2;
        View view3 = view0.findViewById(0x7F0B0C8E);  // id:read_spoiler_title
        L.o(view3, "findViewById(...)");
        this.d = (TextView)view3;
        View view4 = view0.findViewById(0x7F0B0C8A);  // id:read_spoiler_close
        L.o(view4, "findViewById(...)");
        this.e = (ImageView)view4;
        Context context0 = view0.getContext();
        SpannableStringBuilder spannableStringBuilder0 = new SpannableStringBuilder(((TextView)view1).getText());
        L.o("설정에서", "getString(...)");
        int v = v.s3(spannableStringBuilder0, "설정에서", 0, false, 6, null);
        spannableStringBuilder0.setSpan(new a(this), v, v + 4, 33);
        L.o("설정", "getString(...)");
        int v1 = v.s3(spannableStringBuilder0, "설정", 0, false, 6, null);
        spannableStringBuilder0.setSpan(new ForegroundColorSpan(ContextCompat.getColor(context0, 0x7F060040)), v1, v1 + 2, 33);  // color:ai_image_guide_accent_color
        spannableStringBuilder0.setSpan(new UnderlineSpan(), v1, v1 + 2, 33);
        ((TextView)view1).setText(spannableStringBuilder0);
        ((TextView)view1).setMovementMethod(LinkMovementMethod.getInstance());
        SpannableStringBuilder spannableStringBuilder1 = new SpannableStringBuilder(((TextView)view3).getText());
        L.o("스포일러", "getString(...)");
        int v2 = v.s3(spannableStringBuilder0, "스포일러", 0, false, 6, null);
        spannableStringBuilder1.setSpan(new ForegroundColorSpan(ContextCompat.getColor(context0, 0x7F0600A6)), v2, v2 + 4, 33);  // color:caution_hate_word
        ((TextView)view3).setText(spannableStringBuilder1);
        ((ImageView)view4).setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            this.l();
        });
    }

    // 检测为 Lambda 实现
    private static final void i(t t0, View view0) [...]

    private final void k() {
        this.m();
        this.n(false);
    }

    private final void l() {
        try {
            ViewParent viewParent0 = this.itemView.getParent();
            x x0 = null;
            RecyclerView recyclerView0 = viewParent0 instanceof RecyclerView ? ((RecyclerView)viewParent0) : null;
            if(recyclerView0 == null) {
                return;
            }
            Adapter recyclerView$Adapter0 = recyclerView0.getAdapter();
            if(recyclerView$Adapter0 instanceof x) {
                x0 = (x)recyclerView$Adapter0;
            }
            if(x0 == null) {
                return;
            }
            x0.K0();
            return;
        }
        catch(Exception exception0) {
        }
        exception0.printStackTrace();
    }

    private final void m() {
        Context context0 = this.itemView.getContext();
        context0.startActivity(new Intent(context0, SpoilerSettingActivity.class));
    }

    public final void n(boolean z) {
        int v = 8;
        this.b.setVisibility((z ? 0 : 8));
        View view0 = this.c;
        if(z) {
            v = 0;
        }
        view0.setVisibility(v);
    }
}

