package com.dcinside.app.view.colorpicker;

import A3.o;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import codes.side.andcolorpicker.model.a;
import codes.side.andcolorpicker.model.h;
import codes.side.andcolorpicker.rgb.RGBColorPickerSeekBar;
import codes.side.andcolorpicker.view.picker.b.b;
import com.dcinside.app.internal.t;
import java.util.Arrays;
import java.util.Locale;
import k.c;
import kotlin.S0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import kotlin.text.v;
import y4.l;
import y4.m;
import z3.j;

@s0({"SMAP\nColorSlidersRgbView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorSlidersRgbView.kt\ncom/dcinside/app/view/colorpicker/ColorSlidersRgbView\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 3 Color.kt\nandroidx/core/graphics/ColorKt\n+ 4 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n*L\n1#1,153:1\n48#2,19:154\n84#2,3:173\n48#2,19:176\n84#2,3:195\n48#2,19:198\n84#2,3:217\n96#3:220\n105#3:221\n114#3:222\n123#3:223\n177#4,9:224\n*S KotlinDebug\n*F\n+ 1 ColorSlidersRgbView.kt\ncom/dcinside/app/view/colorpicker/ColorSlidersRgbView\n*L\n77#1:154,19\n77#1:173,3\n81#1:176,19\n81#1:195,3\n85#1:198,19\n85#1:217,3\n47#1:220\n48#1:221\n49#1:222\n50#1:223\n117#1:224,9\n*E\n"})
public final class ColorSlidersRgbView extends ConstraintLayout {
    @s0({"SMAP\nColorSlidersRgbView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorSlidersRgbView.kt\ncom/dcinside/app/view/colorpicker/ColorSlidersRgbView$ColorListener\n+ 2 ViewExtension.kt\ncom/dcinside/app/internal/ViewExtensionKt\n+ 3 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n*L\n1#1,153:1\n147#2:154\n177#3,9:155\n*S KotlinDebug\n*F\n+ 1 ColorSlidersRgbView.kt\ncom/dcinside/app/view/colorpicker/ColorSlidersRgbView$ColorListener\n*L\n127#1:154\n134#1:155,9\n*E\n"})
    static final class g extends b {
        @l
        private final t a;

        public g(@l ColorSlidersRgbView colorSlidersRgbView0) {
            L.p(colorSlidersRgbView0, "view");
            super();
            this.a = new t(colorSlidersRgbView0);
        }

        @Override  // codes.side.andcolorpicker.view.picker.b$b
        public void a(codes.side.andcolorpicker.view.picker.b b0, a a0, int v, boolean z) {
            this.f(b0, ((h)a0), v, z);
        }

        @Override  // codes.side.andcolorpicker.view.picker.b$b
        public void b(codes.side.andcolorpicker.view.picker.b b0, a a0, int v, boolean z) {
            this.e(b0, ((h)a0), v, z);
        }

        @Override  // codes.side.andcolorpicker.view.picker.b$b
        public void c(codes.side.andcolorpicker.view.picker.b b0, a a0, int v) {
            this.d(b0, ((h)a0), v);
        }

        @SuppressLint({"SetTextI18n"})
        public void d(@l codes.side.andcolorpicker.view.picker.b b0, @l h h0, int v) {
            Integer integer0;
            L.p(b0, "picker");
            L.p(h0, "color");
            ColorSlidersRgbView colorSlidersRgbView0 = (ColorSlidersRgbView)this.a.a();
            if(colorSlidersRgbView0 == null) {
                return;
            }
            SelectedColorView selectedColorView0 = colorSlidersRgbView0.i;
            if(selectedColorView0 != null) {
                try {
                    integer0 = null;
                    integer0 = c.e(h0);
                }
                catch(Exception unused_ex) {
                }
                selectedColorView0.setCurrentColor(integer0);
            }
            Locale locale0 = Locale.ENGLISH;
            String s = String.format(locale0, "%d", Arrays.copyOf(new Object[]{h0.n()}, 1));
            L.o(s, "format(...)");
            colorSlidersRgbView0.e.setText(s);
            colorSlidersRgbView0.e.setSelection(colorSlidersRgbView0.e.getText().length());
            String s1 = String.format(locale0, "%d", Arrays.copyOf(new Object[]{h0.m()}, 1));
            L.o(s1, "format(...)");
            colorSlidersRgbView0.f.setText(s1);
            colorSlidersRgbView0.f.setSelection(colorSlidersRgbView0.f.getText().length());
            String s2 = String.format(locale0, "%d", Arrays.copyOf(new Object[]{h0.l()}, 1));
            L.o(s2, "format(...)");
            colorSlidersRgbView0.g.setText(s2);
            colorSlidersRgbView0.g.setSelection(colorSlidersRgbView0.g.getText().length());
        }

        public void e(@l codes.side.andcolorpicker.view.picker.b b0, @l h h0, int v, boolean z) {
            L.p(b0, "picker");
            L.p(h0, "color");
        }

        public void f(@l codes.side.andcolorpicker.view.picker.b b0, @l h h0, int v, boolean z) {
            L.p(b0, "picker");
            L.p(h0, "color");
        }
    }

    @l
    private final l.a a;
    @l
    private final RGBColorPickerSeekBar b;
    @l
    private final RGBColorPickerSeekBar c;
    @l
    private final RGBColorPickerSeekBar d;
    @l
    private final EditText e;
    @l
    private final EditText f;
    @l
    private final EditText g;
    @l
    private final g h;
    @m
    private SelectedColorView i;

    @j
    public ColorSlidersRgbView(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @j
    public ColorSlidersRgbView(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public ColorSlidersRgbView(@l Context context0, @m AttributeSet attributeSet0, int v) {
        static final class com.dcinside.app.view.colorpicker.ColorSlidersRgbView.a extends N implements Function1 {
            public static final com.dcinside.app.view.colorpicker.ColorSlidersRgbView.a e;

            static {
                com.dcinside.app.view.colorpicker.ColorSlidersRgbView.a.e = new com.dcinside.app.view.colorpicker.ColorSlidersRgbView.a();
            }

            com.dcinside.app.view.colorpicker.ColorSlidersRgbView.a() {
                super(1);
            }

            @l
            public final Integer a(@l h h0) {
                L.p(h0, "it");
                return h0.n();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((h)object0));
            }
        }


        static final class com.dcinside.app.view.colorpicker.ColorSlidersRgbView.b extends N implements o {
            public static final com.dcinside.app.view.colorpicker.ColorSlidersRgbView.b e;

            static {
                com.dcinside.app.view.colorpicker.ColorSlidersRgbView.b.e = new com.dcinside.app.view.colorpicker.ColorSlidersRgbView.b();
            }

            com.dcinside.app.view.colorpicker.ColorSlidersRgbView.b() {
                super(2);
            }

            public final void a(@l h h0, int v) {
                L.p(h0, "color");
                h0.u(v);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((h)object0), ((Number)object1).intValue());
                return S0.a;
            }
        }


        static final class com.dcinside.app.view.colorpicker.ColorSlidersRgbView.c extends N implements Function1 {
            public static final com.dcinside.app.view.colorpicker.ColorSlidersRgbView.c e;

            static {
                com.dcinside.app.view.colorpicker.ColorSlidersRgbView.c.e = new com.dcinside.app.view.colorpicker.ColorSlidersRgbView.c();
            }

            com.dcinside.app.view.colorpicker.ColorSlidersRgbView.c() {
                super(1);
            }

            @l
            public final Integer a(@l h h0) {
                L.p(h0, "it");
                return h0.m();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((h)object0));
            }
        }


        static final class d extends N implements o {
            public static final d e;

            static {
                d.e = new d();
            }

            d() {
                super(2);
            }

            public final void a(@l h h0, int v) {
                L.p(h0, "color");
                h0.t(v);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((h)object0), ((Number)object1).intValue());
                return S0.a;
            }
        }


        static final class e extends N implements Function1 {
            public static final e e;

            static {
                e.e = new e();
            }

            e() {
                super(1);
            }

            @l
            public final Integer a(@l h h0) {
                L.p(h0, "it");
                return h0.l();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((h)object0));
            }
        }


        static final class f extends N implements o {
            public static final f e;

            static {
                f.e = new f();
            }

            f() {
                super(2);
            }

            public final void a(@l h h0, int v) {
                L.p(h0, "color");
                h0.s(v);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                this.a(((h)object0), ((Number)object1).intValue());
                return S0.a;
            }
        }


        @s0({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 ColorSlidersRgbView.kt\ncom/dcinside/app/view/colorpicker/ColorSlidersRgbView\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 5 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,82:1\n78#2:83\n79#2,2:85\n1#3:84\n59#4:87\n62#5:88\n*E\n"})
        public static final class com.dcinside.app.view.colorpicker.ColorSlidersRgbView.h implements TextWatcher {
            final ColorSlidersRgbView a;

            public com.dcinside.app.view.colorpicker.ColorSlidersRgbView.h(ColorSlidersRgbView colorSlidersRgbView0) {
                this.a = colorSlidersRgbView0;
                super();
            }

            @Override  // android.text.TextWatcher
            public void afterTextChanged(Editable editable0) {
                if(editable0 != null) {
                    if(editable0.length() <= 0) {
                        editable0 = null;
                    }
                    if(editable0 != null) {
                        RGBColorPickerSeekBar rGBColorPickerSeekBar0 = this.a.b;
                        this.a.J(editable0, rGBColorPickerSeekBar0, com.dcinside.app.view.colorpicker.ColorSlidersRgbView.a.e, com.dcinside.app.view.colorpicker.ColorSlidersRgbView.b.e);
                    }
                }
            }

            @Override  // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
            }

            @Override  // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
            }
        }


        @s0({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 ColorSlidersRgbView.kt\ncom/dcinside/app/view/colorpicker/ColorSlidersRgbView\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 5 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,82:1\n82#2:83\n83#2,2:85\n1#3:84\n59#4:87\n62#5:88\n*E\n"})
        public static final class i implements TextWatcher {
            final ColorSlidersRgbView a;

            public i(ColorSlidersRgbView colorSlidersRgbView0) {
                this.a = colorSlidersRgbView0;
                super();
            }

            @Override  // android.text.TextWatcher
            public void afterTextChanged(Editable editable0) {
                if(editable0 != null) {
                    if(editable0.length() <= 0) {
                        editable0 = null;
                    }
                    if(editable0 != null) {
                        RGBColorPickerSeekBar rGBColorPickerSeekBar0 = this.a.c;
                        this.a.J(editable0, rGBColorPickerSeekBar0, com.dcinside.app.view.colorpicker.ColorSlidersRgbView.c.e, d.e);
                    }
                }
            }

            @Override  // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
            }

            @Override  // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
            }
        }


        @s0({"SMAP\nTextView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$textWatcher$1\n+ 2 ColorSlidersRgbView.kt\ncom/dcinside/app/view/colorpicker/ColorSlidersRgbView\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$1\n+ 5 TextView.kt\nandroidx/core/widget/TextViewKt$addTextChangedListener$2\n*L\n1#1,82:1\n86#2:83\n87#2,2:85\n1#3:84\n59#4:87\n62#5:88\n*E\n"})
        public static final class com.dcinside.app.view.colorpicker.ColorSlidersRgbView.j implements TextWatcher {
            final ColorSlidersRgbView a;

            public com.dcinside.app.view.colorpicker.ColorSlidersRgbView.j(ColorSlidersRgbView colorSlidersRgbView0) {
                this.a = colorSlidersRgbView0;
                super();
            }

            @Override  // android.text.TextWatcher
            public void afterTextChanged(Editable editable0) {
                if(editable0 != null) {
                    if(editable0.length() <= 0) {
                        editable0 = null;
                    }
                    if(editable0 != null) {
                        RGBColorPickerSeekBar rGBColorPickerSeekBar0 = this.a.d;
                        this.a.J(editable0, rGBColorPickerSeekBar0, e.e, f.e);
                    }
                }
            }

            @Override  // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
            }

            @Override  // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
            }
        }

        L.p(context0, "context");
        super(context0, attributeSet0, v);
        g colorSlidersRgbView$g0 = new g(this);
        this.h = colorSlidersRgbView$g0;
        LayoutInflater.from(context0).inflate(0x7F0E01B3, this);  // layout:view_color_sliders_rgb
        View view0 = this.findViewById(0x7F0B02E2);  // id:color_sliders_red
        L.o(view0, "findViewById(...)");
        this.b = (RGBColorPickerSeekBar)view0;
        View view1 = this.findViewById(0x7F0B02DF);  // id:color_sliders_green
        L.o(view1, "findViewById(...)");
        this.c = (RGBColorPickerSeekBar)view1;
        View view2 = this.findViewById(0x7F0B02DC);  // id:color_sliders_blue
        L.o(view2, "findViewById(...)");
        this.d = (RGBColorPickerSeekBar)view2;
        View view3 = this.findViewById(0x7F0B02E3);  // id:color_sliders_red_input
        L.o(view3, "findViewById(...)");
        this.e = (EditText)view3;
        View view4 = this.findViewById(0x7F0B02E0);  // id:color_sliders_green_input
        L.o(view4, "findViewById(...)");
        this.f = (EditText)view4;
        View view5 = this.findViewById(0x7F0B02DD);  // id:color_sliders_blue_input
        L.o(view5, "findViewById(...)");
        this.g = (EditText)view5;
        l.a a0 = new l.a();
        this.a = a0;
        l.b.b(a0, new codes.side.andcolorpicker.view.picker.b[]{((RGBColorPickerSeekBar)view0), ((RGBColorPickerSeekBar)view1), ((RGBColorPickerSeekBar)view2)});
        Locale locale0 = Locale.ENGLISH;
        String s = String.format(locale0, "%d", Arrays.copyOf(new Object[]{((h)((RGBColorPickerSeekBar)view0).getPickedColor()).n()}, 1));
        L.o(s, "format(...)");
        ((EditText)view3).setText(s);
        ((EditText)view3).setSelection(((EditText)view3).getText().length());
        String s1 = String.format(locale0, "%d", Arrays.copyOf(new Object[]{((h)((RGBColorPickerSeekBar)view1).getPickedColor()).m()}, 1));
        L.o(s1, "format(...)");
        ((EditText)view4).setText(s1);
        ((EditText)view4).setSelection(((EditText)view4).getText().length());
        String s2 = String.format(locale0, "%d", Arrays.copyOf(new Object[]{((h)((RGBColorPickerSeekBar)view2).getPickedColor()).l()}, 1));
        L.o(s2, "format(...)");
        ((EditText)view5).setText(s2);
        ((EditText)view5).setSelection(((EditText)view5).getText().length());
        a0.d(colorSlidersRgbView$g0);
        ((EditText)view3).addTextChangedListener(new com.dcinside.app.view.colorpicker.ColorSlidersRgbView.h(this));
        ((EditText)view4).addTextChangedListener(new i(this));
        ((EditText)view5).addTextChangedListener(new com.dcinside.app.view.colorpicker.ColorSlidersRgbView.j(this));
    }

    public ColorSlidersRgbView(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    public final void I(@l SelectedColorView selectedColorView0) {
        L.p(selectedColorView0, "view");
        this.i = selectedColorView0;
    }

    private final void J(Editable editable0, RGBColorPickerSeekBar rGBColorPickerSeekBar0, Function1 function10, o o0) {
        Integer integer1;
        this.a.l(this.h);
        h h0 = (h)rGBColorPickerSeekBar0.getPickedColor();
        int v = ((Number)function10.invoke(h0)).intValue();
        Integer integer0 = v.b1(editable0.toString());
        int v1 = integer0 == null ? v : ((int)integer0);
        if(v1 > 0xFF) {
            editable0.clear();
            editable0.append("255");
            v1 = 0xFF;
        }
        else if(v1 < 0) {
            editable0.clear();
            editable0.append("0");
            v1 = 0;
        }
        if(v != v1) {
            h h1 = new h();
            h1.d(h0);
            o0.invoke(h1, v1);
            rGBColorPickerSeekBar0.setPickedColor(h1);
            SelectedColorView selectedColorView0 = this.i;
            if(selectedColorView0 != null) {
                try {
                    integer1 = null;
                    integer1 = c.e(rGBColorPickerSeekBar0.getPickedColor());
                }
                catch(Exception unused_ex) {
                }
                selectedColorView0.setCurrentColor(integer1);
            }
        }
        this.a.d(this.h);
    }

    public final int getColor() {
        return Color.rgb(((h)this.b.getPickedColor()).n(), ((h)this.b.getPickedColor()).m(), ((h)this.b.getPickedColor()).l());
    }

    public final void setColor(int v) {
        h h0 = new h();
        h0.r(v >> 24 & 0xFF);
        h0.u(v >> 16 & 0xFF);
        h0.t(v >> 8 & 0xFF);
        h0.s(v & 0xFF);
        this.b.setPickedColor(h0);
    }
}

