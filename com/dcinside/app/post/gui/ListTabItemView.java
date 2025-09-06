package com.dcinside.app.post.gui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.dcinside.app.internal.r;
import com.dcinside.app.util.vk;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.j;

public final class ListTabItemView extends ConstraintLayout {
    public static final class a {
        private final int a;
        private final int b;
        private final int c;
        private final int d;
        private final int e;
        private final int f;

        public a(@DrawableRes int v, @StringRes int v1, @ColorInt int v2, @ColorInt int v3, @ColorInt int v4, int v5) {
            this.a = v;
            this.b = v1;
            this.c = v2;
            this.d = v3;
            this.e = v4;
            this.f = v5;
        }

        public a(int v, int v1, int v2, int v3, int v4, int v5, int v6, w w0) {
            this(v, v1, v2, v3, v4, ((v6 & 0x20) == 0 ? v5 : 0));
        }

        public final int a() {
            return this.a;
        }

        public final int b() {
            return this.b;
        }

        public final int c() {
            return this.c;
        }

        public final int d() {
            return this.d;
        }

        public final int e() {
            return this.e;
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof a)) {
                return false;
            }
            if(this.a != ((a)object0).a) {
                return false;
            }
            if(this.b != ((a)object0).b) {
                return false;
            }
            if(this.c != ((a)object0).c) {
                return false;
            }
            if(this.d != ((a)object0).d) {
                return false;
            }
            return this.e == ((a)object0).e ? this.f == ((a)object0).f : false;
        }

        public final int f() {
            return this.f;
        }

        @l
        public final a g(@DrawableRes int v, @StringRes int v1, @ColorInt int v2, @ColorInt int v3, @ColorInt int v4, int v5) {
            return new a(v, v1, v2, v3, v4, v5);
        }

        public static a h(a listTabItemView$a0, int v, int v1, int v2, int v3, int v4, int v5, int v6, Object object0) {
            if((v6 & 1) != 0) {
                v = listTabItemView$a0.a;
            }
            if((v6 & 2) != 0) {
                v1 = listTabItemView$a0.b;
            }
            if((v6 & 4) != 0) {
                v2 = listTabItemView$a0.c;
            }
            if((v6 & 8) != 0) {
                v3 = listTabItemView$a0.d;
            }
            if((v6 & 16) != 0) {
                v4 = listTabItemView$a0.e;
            }
            if((v6 & 0x20) != 0) {
                v5 = listTabItemView$a0.f;
            }
            return listTabItemView$a0.g(v, v1, v2, v3, v4, v5);
        }

        @Override
        public int hashCode() {
            return ((((this.a * 0x1F + this.b) * 0x1F + this.c) * 0x1F + this.d) * 0x1F + this.e) * 0x1F + this.f;
        }

        public final int i() {
            return this.e;
        }

        public final int j() {
            return this.a;
        }

        public final int k() {
            return this.c;
        }

        public final int l() {
            return this.b;
        }

        public final int m() {
            return this.d;
        }

        public final int n() {
            return this.f;
        }

        @Override
        @l
        public String toString() {
            return "Option(icon=" + this.a + ", text=" + this.b + ", iconColor=" + this.c + ", textColor=" + this.d + ", backgroundColor=" + this.e + ", textStyle=" + this.f + ")";
        }
    }

    private boolean a;
    @l
    private final ImageView b;
    @l
    private final TextView c;
    @m
    private View d;
    @m
    private a e;
    @m
    private a f;
    @m
    private a g;
    @m
    private a h;
    @m
    private a i;
    private boolean j;
    private boolean k;

    @j
    public ListTabItemView(@l Context context0) {
        L.p(context0, "context");
        this(context0, null, 0, 6, null);
    }

    @j
    public ListTabItemView(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    @j
    public ListTabItemView(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        super(context0, attributeSet0, v);
        View.inflate(context0, 0x7F0E0202, this);  // layout:view_list_tab_item
        View view0 = this.findViewById(0x7F0B0722);  // id:list_tab_item_icon
        L.o(view0, "findViewById(...)");
        this.b = (ImageView)view0;
        View view1 = this.findViewById(0x7F0B0723);  // id:list_tab_item_txt
        L.o(view1, "findViewById(...)");
        this.c = (TextView)view1;
    }

    public ListTabItemView(Context context0, AttributeSet attributeSet0, int v, int v1, w w0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    public final boolean A() {
        return this.j;
    }

    public final boolean B() {
        return this.a;
    }

    public final boolean C() {
        return this.k;
    }

    private final void D(boolean z) {
        if(z) {
            if(this.d != null) {
                return;
            }
            ImageView imageView0 = new ImageView(this.getContext());
            imageView0.setBackground(ContextCompat.getDrawable(this.getContext(), 0x7F080451));  // drawable:notice_new_oval_bg
            imageView0.setImageResource(0x7F080450);  // drawable:notice_new_icon
            imageView0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView0.setPadding(0, 0, 0, 0);
            this.d = imageView0;
            LayoutParams constraintLayout$LayoutParams0 = new LayoutParams(0, 0);
            constraintLayout$LayoutParams0.setMargins(0, 0, 0, 0);
            constraintLayout$LayoutParams0.i = 0;
            constraintLayout$LayoutParams0.v = 0;
            this.addView(this.d, constraintLayout$LayoutParams0);
            return;
        }
        View view0 = this.d;
        if(view0 == null) {
            return;
        }
        this.removeView(view0);
        this.d = null;
    }

    private final void E() {
        a listTabItemView$a0;
        if(!this.isEnabled()) {
            listTabItemView$a0 = this.e;
        }
        else if(this.isSelected()) {
            listTabItemView$a0 = this.f;
        }
        else {
            listTabItemView$a0 = this.k ? this.h : this.g;
        }
        if(!L.g(this.i, listTabItemView$a0) && listTabItemView$a0 != null) {
            r.d0(this.b, listTabItemView$a0.j());
            r.o0(this.c, listTabItemView$a0.l());
            this.c.setTextColor(listTabItemView$a0.m());
            this.c.setTypeface(null, listTabItemView$a0.n());
            ColorStateList colorStateList0 = ColorStateList.valueOf(listTabItemView$a0.k());
            L.o(colorStateList0, "valueOf(...)");
            vk.n(colorStateList0, new View[]{this.b});
            this.setBackgroundColor(listTabItemView$a0.i());
        }
        this.i = listTabItemView$a0;
    }

    public final void F(@l a listTabItemView$a0, @l a listTabItemView$a1, @l a listTabItemView$a2, @l a listTabItemView$a3) {
        L.p(listTabItemView$a0, "disabled");
        L.p(listTabItemView$a1, "selected");
        L.p(listTabItemView$a2, "normal");
        L.p(listTabItemView$a3, "tintDisable");
        this.e = listTabItemView$a0;
        this.f = listTabItemView$a1;
        this.g = listTabItemView$a2;
        this.h = listTabItemView$a3;
        this.E();
    }

    @Override  // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.E();
    }

    public final void setNew(boolean z) {
        if(this.j != z) {
            this.j = z;
            this.D(z);
        }
    }

    public final void setSelectAllow(boolean z) {
        this.a = z;
    }

    @Override  // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        this.E();
    }

    public final void setTintOnly(boolean z) {
        if(this.k != z) {
            this.k = z;
            this.E();
        }
    }
}

