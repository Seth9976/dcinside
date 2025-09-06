package com.dcinside.app.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View.OnLayoutChangeListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.widget.ImageViewCompat;
import androidx.core.widget.TextViewCompat;
import com.dcinside.app.R.styleable;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.vk;
import java.lang.reflect.Field;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nDcListToolbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DcListToolbar.kt\ncom/dcinside/app/view/DcListToolbar\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 4 Menu.kt\nandroidx/core/view/MenuKt\n*L\n1#1,356:1\n257#2,2:357\n257#2,2:359\n257#2,2:361\n255#2:388\n177#3,9:363\n57#4,4:372\n57#4,4:376\n57#4,4:380\n57#4,4:384\n*S KotlinDebug\n*F\n+ 1 DcListToolbar.kt\ncom/dcinside/app/view/DcListToolbar\n*L\n223#1:357,2\n237#1:359,2\n275#1:361,2\n87#1:388\n285#1:363,9\n303#1:372,4\n307#1:376,4\n342#1:380,4\n346#1:384,4\n*E\n"})
public final class DcListToolbar extends Toolbar implements View.OnLayoutChangeListener {
    @m
    private ColorStateList Q8;
    @l
    private Paint R8;
    private boolean S8;
    private boolean T8;
    @m
    private View U8;
    @m
    private View V8;
    @m
    private TextView W8;
    @m
    private TextView X8;
    @m
    private TextView Y8;
    @m
    private ImageView Z8;
    private int a9;
    @l
    private final Runnable b9;

    public DcListToolbar(@l Context context0) {
        L.p(context0, "context");
        super(context0);
        Paint paint0 = new Paint();
        paint0.setStyle(Paint.Style.STROKE);
        this.R8 = paint0;
        this.T8 = true;
        this.b9 = () -> {
            String s;
            L.p(this, "this$0");
            View view0 = this.U8;
            if(view0 == null) {
                return;
            }
            View view1 = this.V8;
            if(view1 == null) {
                return;
            }
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = view1.getLayoutParams();
            LayoutParams constraintLayout$LayoutParams0 = viewGroup$LayoutParams0 instanceof LayoutParams ? ((LayoutParams)viewGroup$LayoutParams0) : null;
            if(constraintLayout$LayoutParams0 == null) {
                return;
            }
            TextView textView0 = this.W8;
            if(textView0 == null) {
                s = "";
            }
            else {
                CharSequence charSequence0 = textView0.getText();
                if(charSequence0 == null) {
                    s = "";
                }
                else {
                    s = charSequence0.toString();
                    if(s == null) {
                        s = "";
                    }
                }
            }
            int v = Dl.h(this.W8, s);
            int v1 = view0.getWidth();
            int v2 = Math.max((this.W8 == null ? 0 : this.W8.getWidth()), v);
            if(this.Z8 == null || this.Z8.getVisibility() != 0) {
                constraintLayout$LayoutParams0.setMarginStart(0);
            }
            else {
                constraintLayout$LayoutParams0.setMarginStart(0);
            }
            constraintLayout$LayoutParams0.T = 0;
            view1.setLayoutParams(constraintLayout$LayoutParams0);
            int v3 = v1 - constraintLayout$LayoutParams0.getMarginStart() - v2;
            view0.setPadding((v3 <= 0 ? 0 : Math.min(v3 / 2, 0)), 0, 0, 0);
        };
        this.W(context0, null, 0);
    }

    public DcListToolbar(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        super(context0, attributeSet0);
        Paint paint0 = new Paint();
        paint0.setStyle(Paint.Style.STROKE);
        this.R8 = paint0;
        this.T8 = true;
        this.b9 = () -> {
            String s;
            L.p(this, "this$0");
            View view0 = this.U8;
            if(view0 == null) {
                return;
            }
            View view1 = this.V8;
            if(view1 == null) {
                return;
            }
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = view1.getLayoutParams();
            LayoutParams constraintLayout$LayoutParams0 = viewGroup$LayoutParams0 instanceof LayoutParams ? ((LayoutParams)viewGroup$LayoutParams0) : null;
            if(constraintLayout$LayoutParams0 == null) {
                return;
            }
            TextView textView0 = this.W8;
            if(textView0 == null) {
                s = "";
            }
            else {
                CharSequence charSequence0 = textView0.getText();
                if(charSequence0 == null) {
                    s = "";
                }
                else {
                    s = charSequence0.toString();
                    if(s == null) {
                        s = "";
                    }
                }
            }
            int v = Dl.h(this.W8, s);
            int v1 = view0.getWidth();
            int v2 = Math.max((this.W8 == null ? 0 : this.W8.getWidth()), v);
            if(this.Z8 == null || this.Z8.getVisibility() != 0) {
                constraintLayout$LayoutParams0.setMarginStart(0);
            }
            else {
                constraintLayout$LayoutParams0.setMarginStart(0);
            }
            constraintLayout$LayoutParams0.T = 0;
            view1.setLayoutParams(constraintLayout$LayoutParams0);
            int v3 = v1 - constraintLayout$LayoutParams0.getMarginStart() - v2;
            view0.setPadding((v3 <= 0 ? 0 : Math.min(v3 / 2, 0)), 0, 0, 0);
        };
        this.W(context0, attributeSet0, 0);
    }

    public DcListToolbar(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        super(context0, attributeSet0, v);
        Paint paint0 = new Paint();
        paint0.setStyle(Paint.Style.STROKE);
        this.R8 = paint0;
        this.T8 = true;
        this.b9 = () -> {
            String s;
            L.p(this, "this$0");
            View view0 = this.U8;
            if(view0 == null) {
                return;
            }
            View view1 = this.V8;
            if(view1 == null) {
                return;
            }
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = view1.getLayoutParams();
            LayoutParams constraintLayout$LayoutParams0 = viewGroup$LayoutParams0 instanceof LayoutParams ? ((LayoutParams)viewGroup$LayoutParams0) : null;
            if(constraintLayout$LayoutParams0 == null) {
                return;
            }
            TextView textView0 = this.W8;
            if(textView0 == null) {
                s = "";
            }
            else {
                CharSequence charSequence0 = textView0.getText();
                if(charSequence0 == null) {
                    s = "";
                }
                else {
                    s = charSequence0.toString();
                    if(s == null) {
                        s = "";
                    }
                }
            }
            int v = Dl.h(this.W8, s);
            int v1 = view0.getWidth();
            int v2 = Math.max((this.W8 == null ? 0 : this.W8.getWidth()), v);
            if(this.Z8 == null || this.Z8.getVisibility() != 0) {
                constraintLayout$LayoutParams0.setMarginStart(0);
            }
            else {
                constraintLayout$LayoutParams0.setMarginStart(0);
            }
            constraintLayout$LayoutParams0.T = 0;
            view1.setLayoutParams(constraintLayout$LayoutParams0);
            int v3 = v1 - constraintLayout$LayoutParams0.getMarginStart() - v2;
            view0.setPadding((v3 <= 0 ? 0 : Math.min(v3 / 2, 0)), 0, 0, 0);
        };
        this.W(context0, attributeSet0, v);
    }

    @Override  // androidx.appcompat.widget.Toolbar
    public void O(@l Context context0, @StyleRes int v) {
        L.p(context0, "context");
        TextView textView0 = this.X8;
        if(textView0 == null) {
            return;
        }
        TextViewCompat.D(textView0, v);
    }

    @Override  // androidx.appcompat.widget.Toolbar
    public void Q(@l Context context0, @StyleRes int v) {
        L.p(context0, "context");
        TextView textView0 = this.W8;
        if(textView0 == null) {
            return;
        }
        TextViewCompat.D(textView0, v);
        TextView textView1 = this.W8;
        if(textView1 != null) {
            textView1.setTextSize(1, 19.0f);
        }
    }

    private final void W(Context context0, AttributeSet attributeSet0, int v) {
        Class class0 = Toolbar.class;
        TypedArray typedArray0 = context0.getTheme().obtainStyledAttributes(attributeSet0, styleable.DcListToolbar, v, 0);
        L.o(typedArray0, "obtainStyledAttributes(...)");
        this.S8 = typedArray0.getBoolean(0, false);
        this.T8 = typedArray0.getBoolean(1, true);
        typedArray0.recycle();
        this.R8.setColor(vk.b(context0, 0x7F04021A));  // attr:dcToolbarDividerColor
        this.R8.setStrokeWidth(vk.d(context0, 0x7F04021C));  // attr:dcToolbarDividerSize
        this.setBackgroundColor(vk.b(context0, 0x7F040219));  // attr:dcToolbarColor
        if(this.isInEditMode()) {
            return;
        }
        View view0 = LayoutInflater.from(context0).inflate(0x7F0E029A, this, false);  // layout:view_toolbar_overlay
        this.setPadding(this.getPaddingLeft(), this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom() + ((int)this.R8.getStrokeWidth()));
        this.addView(view0);
        this.V8 = this.findViewById(0x7F0B0F94);  // id:toolbar_gravity
        this.U8 = this.findViewById(0x7F0B0F97);  // id:toolbar_overlay
        this.W8 = (TextView)this.findViewById(0x7F0B0F99);  // id:toolbar_title
        this.X8 = (TextView)this.findViewById(0x7F0B0F98);  // id:toolbar_sub
        this.Y8 = (TextView)this.findViewById(0x7F0B0F95);  // id:toolbar_info
        this.Z8 = (ImageView)this.findViewById(0x7F0B0F96);  // id:toolbar_left_icon
        try {
            Field field0 = class0.getDeclaredField("l");
            field0.setAccessible(true);
            int v1 = field0.getInt(this);
            Field field1 = class0.getDeclaredField("m");
            field1.setAccessible(true);
            int v2 = field1.getInt(this);
            Field field2 = class0.getDeclaredField("z");
            field2.setAccessible(true);
            Object object0 = field2.get(this);
            ColorStateList colorStateList0 = null;
            ColorStateList colorStateList1 = object0 instanceof ColorStateList ? ((ColorStateList)object0) : null;
            Field field3 = class0.getDeclaredField("A");
            field3.setAccessible(true);
            Object object1 = field3.get(this);
            if(object1 instanceof ColorStateList) {
                colorStateList0 = (ColorStateList)object1;
            }
            super.setTitleTextColor(0);
            super.setSubtitleTextColor(0);
            if(v1 != 0) {
                this.Q(context0, v1);
            }
            if(v2 != 0) {
                this.O(context0, v2);
            }
            if(colorStateList1 != null) {
                this.setTitleTextColor(colorStateList1);
            }
            if(colorStateList0 != null) {
                this.setSubtitleTextColor(colorStateList0);
            }
            this.setTitle(this.getTitle());
            this.setSubtitle(this.getSubtitle());
            this.post(this.b9);
            return;
        }
        catch(Exception exception0) {
        }
        exception0.printStackTrace();
    }

    public final void X() {
        int v = 0;
        ColorStateList colorStateList0 = this.Q8;
        if(colorStateList0 != null) {
            if(Build.VERSION.SDK_INT >= 26) {
                Menu menu0 = this.getMenu();
                L.o(menu0, "getMenu(...)");
                int v1 = menu0.size();
                while(v < v1) {
                    menu0.getItem(v).setIconTintList(colorStateList0);
                    ++v;
                }
                return;
            }
            Menu menu1 = this.getMenu();
            L.o(menu1, "getMenu(...)");
            int v2 = menu1.size();
            while(v < v2) {
                Drawable drawable0 = menu1.getItem(v).getIcon();
                if(drawable0 != null) {
                    DrawableCompat.o(drawable0, colorStateList0);
                }
                ++v;
            }
        }
    }

    public final void Y() {
        try {
            this.post(this.b9);
        }
        catch(Exception unused_ex) {
        }
    }

    // 检测为 Lambda 实现
    private static final void Z(DcListToolbar dcListToolbar0) [...]

    @Override  // android.view.View
    public void draw(@l Canvas canvas0) {
        L.p(canvas0, "canvas");
        super.draw(canvas0);
        if(!this.S8) {
            return;
        }
        if(this.R8.getStrokeWidth() != 0.0f) {
            float f = ((float)this.getHeight()) - this.R8.getStrokeWidth() / 2.0f;
            canvas0.drawLine(0.0f, f, ((float)this.getWidth()), f, this.R8);
        }
    }

    @m
    public final CharSequence getTitleText() {
        return this.W8 == null ? null : this.W8.getText();
    }

    @Override  // androidx.appcompat.widget.Toolbar
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        View view0 = this.U8;
        if(view0 != null) {
            view0.addOnLayoutChangeListener(this);
        }
    }

    @Override  // androidx.appcompat.widget.Toolbar
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        View view0 = this.U8;
        if(view0 != null) {
            view0.removeOnLayoutChangeListener(this);
        }
    }

    @Override  // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@l MotionEvent motionEvent0) {
        L.p(motionEvent0, "ev");
        int v = motionEvent0.getActionMasked();
        switch(v) {
            case 0: {
                this.getParent().requestDisallowInterceptTouchEvent(true);
                break;
            }
            case 1: {
                this.getParent().requestDisallowInterceptTouchEvent(false);
                return super.onInterceptTouchEvent(motionEvent0);
            }
            default: {
                if(v == 3) {
                    this.getParent().requestDisallowInterceptTouchEvent(false);
                    return super.onInterceptTouchEvent(motionEvent0);
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent0);
    }

    @Override  // android.view.View$OnLayoutChangeListener
    public void onLayoutChange(@m View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
        int v8 = this.U8 == null ? 0 : this.U8.getWidth();
        if(this.a9 != v8) {
            this.a9 = v8;
            this.post(this.b9);
        }
    }

    public final void setLeftIcon(@m Drawable drawable0) {
        int v = 0;
        ImageView imageView0 = this.Z8;
        if(imageView0 == null) {
            return;
        }
        if(drawable0 == null) {
            v = 8;
        }
        imageView0.setVisibility(v);
        if(drawable0 == null) {
            return;
        }
        imageView0.setImageDrawable(drawable0);
        ColorStateList colorStateList0 = this.Q8;
        if(colorStateList0 != null) {
            ImageViewCompat.c(imageView0, colorStateList0);
        }
    }

    @Override  // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@m Drawable drawable0) {
        super.setNavigationIcon(drawable0);
        ColorStateList colorStateList0 = this.Q8;
        if(colorStateList0 != null) {
            Drawable drawable1 = this.getNavigationIcon();
            if(drawable1 == null) {
                return;
            }
            DrawableCompat.o(drawable1, colorStateList0);
        }
    }

    public final void setShowToolbarDivider(boolean z) {
        this.S8 = z;
        this.invalidate();
    }

    @Override  // androidx.appcompat.widget.Toolbar
    public void setSubtitle(@m CharSequence charSequence0) {
        TextView textView0 = this.X8;
        if(textView0 != null) {
            textView0.setText(charSequence0);
        }
        int v = 0;
        TextView textView1 = this.X8;
        if(textView1 != null) {
            if(!this.T8 || charSequence0 == null || charSequence0.length() <= 0) {
                v = 8;
            }
            textView1.setVisibility(v);
        }
    }

    @Override  // androidx.appcompat.widget.Toolbar
    public void setSubtitleTextColor(@l ColorStateList colorStateList0) {
        L.p(colorStateList0, "color");
        TextView textView0 = this.X8;
        if(textView0 != null) {
            textView0.setTextColor(colorStateList0);
        }
    }

    @Override  // androidx.appcompat.widget.Toolbar
    public void setTitle(@m CharSequence charSequence0) {
        super.setTitle(charSequence0);
        TextView textView0 = this.W8;
        if(textView0 != null) {
            textView0.setText(charSequence0);
        }
        int v = 0;
        TextView textView1 = this.W8;
        if(textView1 != null) {
            if(!this.T8 || charSequence0 == null || charSequence0.length() <= 0) {
                v = 8;
            }
            textView1.setVisibility(v);
        }
    }

    public final void setTitleCompoundRight(@m Drawable drawable0) {
        TextView textView0 = this.W8;
        if(textView0 == null) {
            return;
        }
        textView0.setCompoundDrawables(null, null, drawable0, null);
        ColorStateList colorStateList0 = this.Q8;
        if(colorStateList0 != null) {
            TextViewCompat.s(textView0, colorStateList0);
        }
    }

    @Override  // androidx.appcompat.widget.Toolbar
    public void setTitleTextColor(@l ColorStateList colorStateList0) {
        L.p(colorStateList0, "color");
        TextView textView0 = this.W8;
        if(textView0 != null) {
            textView0.setTextColor(colorStateList0);
        }
    }

    public final void setToolbarTintColor(@ColorInt int v) {
        int v1 = 0;
        if(this.Q8 != null && this.Q8.getDefaultColor() == v) {
            return;
        }
        ColorStateList colorStateList0 = new ColorStateList(new int[][]{new int[]{0}}, new int[]{v});
        this.Q8 = colorStateList0;
        Drawable drawable0 = this.getNavigationIcon();
        if(drawable0 != null) {
            DrawableCompat.o(drawable0, colorStateList0);
        }
        ImageView imageView0 = this.Z8;
        if(imageView0 != null) {
            ImageViewCompat.c(imageView0, colorStateList0);
        }
        this.setTitleTextColor(colorStateList0);
        TextView textView0 = this.W8;
        if(textView0 != null) {
            TextViewCompat.s(textView0, colorStateList0);
        }
        if(Build.VERSION.SDK_INT >= 26) {
            Menu menu0 = this.getMenu();
            L.o(menu0, "getMenu(...)");
            int v2 = menu0.size();
            while(v1 < v2) {
                menu0.getItem(v1).setIconTintList(colorStateList0);
                ++v1;
            }
            return;
        }
        Menu menu1 = this.getMenu();
        L.o(menu1, "getMenu(...)");
        int v3 = menu1.size();
        while(v1 < v3) {
            Drawable drawable1 = menu1.getItem(v1).getIcon();
            if(drawable1 != null) {
                DrawableCompat.o(drawable1, colorStateList0);
            }
            ++v1;
        }
    }
}

