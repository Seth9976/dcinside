package com.dcinside.rich;

import A3.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Layout.Alignment;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import com.dcinside.rich.color.ColorPickerView;
import com.dcinside.rich.color.c;
import com.dcinside.rich.styles.b;
import com.dcinside.rich.styles.d;
import com.dcinside.rich.styles.e;
import com.dcinside.rich.styles.f;
import com.dcinside.rich.styles.h;
import com.dcinside.rich.styles.i;
import com.dcinside.rich.styles.j;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

public final class RichToolbar extends LinearLayout {
    @m
    private RichEditText a;
    @l
    private final ArrayList b;
    @m
    private h c;
    @m
    private e d;
    @m
    private i e;
    @m
    private com.dcinside.rich.styles.l f;
    @m
    private j g;
    @m
    private f h;
    @m
    private d i;
    @m
    private d j;
    @m
    private d k;
    @m
    private ImageView l;
    @m
    private ImageView m;
    @m
    private ImageView n;
    @m
    private ImageView o;
    @m
    private ImageView p;
    @m
    private ColorPickerView q;
    @m
    private ImageView r;
    @m
    private ImageView s;
    @m
    private ImageView t;
    @m
    private ImageView u;
    @m
    private a v;
    private int w;
    @m
    private ColorStateList x;

    @z3.j
    public RichToolbar(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @z3.j
    public RichToolbar(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @z3.j
    public RichToolbar(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        super(context0, attributeSet0, v);
        this.b = new ArrayList();
        if(attributeSet0 != null) {
            TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.RichToolbar);
            L.o(typedArray0, "obtainStyledAttributes(...)");
            this.x = typedArray0.getColorStateList(styleable.RichToolbar_colorRichIcon);
            typedArray0.recycle();
        }
        LayoutInflater.from(context0).inflate(0x7F0E017D, this, true);  // layout:rich_toolbar
        this.setOrientation(0);
        this.c();
        this.b();
    }

    public RichToolbar(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    private final void b() {
        this.c = new h(this, this.l);
        this.d = new e(this, this.m);
        this.e = new i(this, this.n);
        this.f = new com.dcinside.rich.styles.l(this, this.o);
        this.g = new j(this, this.p);
        this.h = new f(this, this.r);
        ImageView imageView0 = this.s;
        L.m(imageView0);
        this.i = new d(this, imageView0, Layout.Alignment.ALIGN_NORMAL);
        ImageView imageView1 = this.t;
        L.m(imageView1);
        this.j = new d(this, imageView1, Layout.Alignment.ALIGN_CENTER);
        ImageView imageView2 = this.u;
        L.m(imageView2);
        this.k = new d(this, imageView2, Layout.Alignment.ALIGN_OPPOSITE);
        h h0 = this.c;
        L.m(h0);
        this.b.add(h0);
        e e0 = this.d;
        L.m(e0);
        this.b.add(e0);
        i i0 = this.e;
        L.m(i0);
        this.b.add(i0);
        com.dcinside.rich.styles.l l0 = this.f;
        L.m(l0);
        this.b.add(l0);
        j j0 = this.g;
        L.m(j0);
        this.b.add(j0);
        f f0 = this.h;
        L.m(f0);
        this.b.add(f0);
        d d0 = this.i;
        L.m(d0);
        this.b.add(d0);
        d d1 = this.j;
        L.m(d1);
        this.b.add(d1);
        d d2 = this.k;
        L.m(d2);
        this.b.add(d2);
    }

    private final void c() {
        this.l = (ImageView)this.findViewById(id.rteFontsize);
        this.m = (ImageView)this.findViewById(id.rteBold);
        this.n = (ImageView)this.findViewById(id.rteItalic);
        this.o = (ImageView)this.findViewById(id.rteUnderline);
        this.r = (ImageView)this.findViewById(id.rteFontColor);
        this.p = (ImageView)this.findViewById(id.rteStrikethrough);
        this.s = (ImageView)this.findViewById(id.rteAlignLeft);
        this.t = (ImageView)this.findViewById(id.rteAlignCenter);
        this.u = (ImageView)this.findViewById(id.rteAlignRight);
        View view0 = this.findViewById(id.rteClose);
        L.o(view0, "findViewById(...)");
        ((ImageView)view0).setOnClickListener((View view0) -> {
            L.p(this, "this$0");
            this.e();
        });
        this.f(((ImageView)view0));
        this.f(this.l);
        this.f(this.m);
        this.f(this.n);
        this.f(this.o);
        this.f(this.r);
        this.f(this.p);
        this.f(this.s);
        this.f(this.t);
        this.f(this.u);
    }

    // 检测为 Lambda 实现
    private static final void d(RichToolbar richToolbar0, View view0) [...]

    private final void e() {
        a a0 = this.v;
        if(a0 != null) {
            a0.invoke();
        }
    }

    private final void f(ImageView imageView0) {
        ColorStateList colorStateList0 = this.x;
        if(colorStateList0 == null) {
            return;
        }
        if(imageView0 != null) {
            Drawable drawable0 = imageView0.getDrawable();
            if(drawable0 != null) {
                Drawable drawable1 = DrawableCompat.r(drawable0);
                L.o(drawable1, "wrap(...)");
                DrawableCompat.o(drawable1, colorStateList0);
                imageView0.setImageDrawable(drawable1);
            }
        }
    }

    public final void g(@l c c0) {
        L.p(c0, "colorPickerListener");
        ColorPickerView colorPickerView0 = this.q;
        if(colorPickerView0 == null) {
            return;
        }
        int v = colorPickerView0.getVisibility();
        colorPickerView0.setColorPickerListener(c0);
        if(v == 0) {
            colorPickerView0.setVisibility(8);
            return;
        }
        colorPickerView0.setVisibility(0);
    }

    @m
    public final b getBoldStyle() {
        return this.d;
    }

    @m
    public final ColorPickerView getColorPalette() {
        return this.q;
    }

    @m
    public final RichEditText getEditText() {
        return this.a;
    }

    @m
    public final i getItalicStyle() {
        return this.e;
    }

    private final int getLayoutId() [...] // 潜在的解密器

    @m
    public final a getOnClickClose() {
        return this.v;
    }

    public final int getSelector() {
        return this.w;
    }

    @m
    public final j getStrikeThroughStyle() {
        return this.g;
    }

    @l
    public final List getStyles() {
        return this.b;
    }

    @m
    public final com.dcinside.rich.styles.l getUnderlineStyle() {
        return this.f;
    }

    public final void setColorPalette(@m ColorPickerView colorPickerView0) {
        this.q = colorPickerView0;
    }

    public final void setColorPaletteColor(int v) {
        ColorPickerView colorPickerView0 = this.q;
        if(colorPickerView0 != null) {
            colorPickerView0.setColor(v);
        }
    }

    public final void setEditText(@m RichEditText richEditText0) {
        if(L.g(this.a, richEditText0)) {
            return;
        }
        this.a = richEditText0;
        ColorPickerView colorPickerView0 = this.q;
        if(colorPickerView0 != null && colorPickerView0.getVisibility() == 0) {
            colorPickerView0.setColorPickerListener(null);
            colorPickerView0.setVisibility(8);
        }
        if(richEditText0 != null) {
            int v = richEditText0.getSelectionStart();
            int v1 = richEditText0.getSelectionEnd();
            if(v >= 0 && v1 >= 0) {
                richEditText0.onSelectionChanged(v, v1);
            }
        }
    }

    public final void setOnClickClose(@m a a0) {
        this.v = a0;
    }

    public final void setSelector(int v) {
        this.w = v;
    }
}

