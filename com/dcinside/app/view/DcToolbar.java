package com.dcinside.app.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.view.View.OnLayoutChangeListener;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.widget.TextViewCompat;
import com.dcinside.app.R.styleable;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.vk;
import java.lang.reflect.Field;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import y4.l;
import y4.m;

@s0({"SMAP\nDcToolbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DcToolbar.kt\ncom/dcinside/app/view/DcToolbar\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,269:1\n257#2,2:270\n257#2,2:272\n257#2,2:274\n1#3:276\n*S KotlinDebug\n*F\n+ 1 DcToolbar.kt\ncom/dcinside/app/view/DcToolbar\n*L\n212#1:270,2\n231#1:272,2\n236#1:274,2\n*E\n"})
public final class DcToolbar extends Toolbar implements View.OnLayoutChangeListener {
    @l
    private final Paint Q8;
    private boolean R8;
    private boolean S8;
    @m
    private View T8;
    @m
    private View U8;
    @m
    private TextView V8;
    @m
    private TextView W8;
    @m
    private TextView X8;
    private int Y8;
    private int Z8;
    private int a9;
    @l
    private final Runnable b9;

    public DcToolbar(@l Context context0) {
        L.p(context0, "context");
        super(context0);
        Paint paint0 = new Paint();
        paint0.setStyle(Paint.Style.STROKE);
        this.Q8 = paint0;
        this.S8 = true;
        this.b9 = () -> {
            String s;
            L.p(this, "this$0");
            View view0 = this.U8;
            if(view0 == null) {
                return;
            }
            int v = this.getWidth();
            int v1 = view0.getLeft();
            int v2 = Math.max(v - view0.getRight(), 0);
            if(v1 > v2) {
                this.Y8 = 0;
                this.Z8 = v1 - v2;
            }
            else {
                this.Y8 = v1 < v2 ? v2 - v1 : 0;
                this.Z8 = 0;
            }
            if(v2 == 0) {
                int v3 = view0.getWidth() - (this.Y8 + this.Z8);
                TextView textView0 = this.V8;
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
                if(Dl.h(this.V8, s) >= v3) {
                    view0.setPadding(this.Y8, 0, 0, 0);
                    return;
                }
            }
            view0.setPadding(this.Y8, 0, this.Z8, 0);
        };
        this.X(context0, null, 0);
    }

    public DcToolbar(@l Context context0, @m AttributeSet attributeSet0) {
        L.p(context0, "context");
        super(context0, attributeSet0);
        Paint paint0 = new Paint();
        paint0.setStyle(Paint.Style.STROKE);
        this.Q8 = paint0;
        this.S8 = true;
        this.b9 = () -> {
            String s;
            L.p(this, "this$0");
            View view0 = this.U8;
            if(view0 == null) {
                return;
            }
            int v = this.getWidth();
            int v1 = view0.getLeft();
            int v2 = Math.max(v - view0.getRight(), 0);
            if(v1 > v2) {
                this.Y8 = 0;
                this.Z8 = v1 - v2;
            }
            else {
                this.Y8 = v1 < v2 ? v2 - v1 : 0;
                this.Z8 = 0;
            }
            if(v2 == 0) {
                int v3 = view0.getWidth() - (this.Y8 + this.Z8);
                TextView textView0 = this.V8;
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
                if(Dl.h(this.V8, s) >= v3) {
                    view0.setPadding(this.Y8, 0, 0, 0);
                    return;
                }
            }
            view0.setPadding(this.Y8, 0, this.Z8, 0);
        };
        this.X(context0, attributeSet0, 0);
    }

    public DcToolbar(@l Context context0, @m AttributeSet attributeSet0, int v) {
        L.p(context0, "context");
        super(context0, attributeSet0, v);
        Paint paint0 = new Paint();
        paint0.setStyle(Paint.Style.STROKE);
        this.Q8 = paint0;
        this.S8 = true;
        this.b9 = () -> {
            String s;
            L.p(this, "this$0");
            View view0 = this.U8;
            if(view0 == null) {
                return;
            }
            int v = this.getWidth();
            int v1 = view0.getLeft();
            int v2 = Math.max(v - view0.getRight(), 0);
            if(v1 > v2) {
                this.Y8 = 0;
                this.Z8 = v1 - v2;
            }
            else {
                this.Y8 = v1 < v2 ? v2 - v1 : 0;
                this.Z8 = 0;
            }
            if(v2 == 0) {
                int v3 = view0.getWidth() - (this.Y8 + this.Z8);
                TextView textView0 = this.V8;
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
                if(Dl.h(this.V8, s) >= v3) {
                    view0.setPadding(this.Y8, 0, 0, 0);
                    return;
                }
            }
            view0.setPadding(this.Y8, 0, this.Z8, 0);
        };
        this.X(context0, attributeSet0, v);
    }

    @Override  // androidx.appcompat.widget.Toolbar
    public void O(@l Context context0, @StyleRes int v) {
        L.p(context0, "context");
        super.O(context0, v);
        TextView textView0 = this.W8;
        if(textView0 != null) {
            TextViewCompat.D(textView0, v);
        }
    }

    @Override  // androidx.appcompat.widget.Toolbar
    public void Q(@l Context context0, @StyleRes int v) {
        L.p(context0, "context");
        super.Q(context0, v);
        TextView textView0 = this.V8;
        if(textView0 != null) {
            TextViewCompat.D(textView0, v);
            textView0.setTextSize(1, 20.0f);
        }
    }

    private final void X(Context context0, AttributeSet attributeSet0, int v) {
        Class class0 = Toolbar.class;
        ViewCompat.m2(this, (View view0, WindowInsetsCompat windowInsetsCompat0) -> WindowInsetsCompat.c);
        TypedArray typedArray0 = context0.getTheme().obtainStyledAttributes(attributeSet0, styleable.DcToolbar, v, 0);
        L.o(typedArray0, "obtainStyledAttributes(...)");
        this.R8 = typedArray0.getBoolean(0, false);
        this.S8 = typedArray0.getBoolean(1, true);
        typedArray0.recycle();
        int v1 = vk.b(context0, 0x7F04021A);  // attr:dcToolbarDividerColor
        this.Q8.setColor(v1);
        float f = vk.d(context0, 0x7F04021C);  // attr:dcToolbarDividerSize
        this.Q8.setStrokeWidth(f);
        this.setBackgroundColor(vk.b(context0, 0x7F040219));  // attr:dcToolbarColor
        if(this.isInEditMode()) {
            return;
        }
        View view0 = LayoutInflater.from(context0).inflate(0x7F0E029A, this, false);  // layout:view_toolbar_overlay
        this.setPadding(this.getPaddingLeft(), this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom() + ((int)this.Q8.getStrokeWidth()));
        this.addView(view0);
        this.T8 = this.findViewById(0x7F0B0F94);  // id:toolbar_gravity
        this.U8 = this.findViewById(0x7F0B0F97);  // id:toolbar_overlay
        this.V8 = (TextView)this.findViewById(0x7F0B0F99);  // id:toolbar_title
        this.W8 = (TextView)this.findViewById(0x7F0B0F98);  // id:toolbar_sub
        this.X8 = (TextView)this.findViewById(0x7F0B0F95);  // id:toolbar_info
        try {
            Field field0 = class0.getDeclaredField("l");
            field0.setAccessible(true);
            int v2 = field0.getInt(this);
            Field field1 = class0.getDeclaredField("m");
            field1.setAccessible(true);
            int v3 = field1.getInt(this);
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
            if(v2 != 0) {
                this.Q(context0, v2);
            }
            if(v3 != 0) {
                this.O(context0, v3);
            }
            if(colorStateList1 != null) {
                this.setTitleTextColor(colorStateList1);
            }
            if(colorStateList0 != null) {
                this.setSubtitleTextColor(colorStateList0);
            }
            super.setTitleTextColor(0);
            super.setSubtitleTextColor(0);
            this.setTitle(this.getTitle());
            this.setSubtitle(this.getSubtitle());
            this.post(this.b9);
            return;
        }
        catch(Exception exception0) {
        }
        exception0.printStackTrace();
    }

    // 检测为 Lambda 实现
    private static final WindowInsetsCompat Y(View view0, WindowInsetsCompat windowInsetsCompat0) [...]

    // 检测为 Lambda 实现
    private static final void Z(DcToolbar dcToolbar0) [...]

    @Override  // android.view.View
    public void draw(@l Canvas canvas0) {
        L.p(canvas0, "canvas");
        super.draw(canvas0);
        if(!this.R8) {
            return;
        }
        if(this.Q8.getStrokeWidth() != 0.0f) {
            float f = ((float)this.getHeight()) - this.Q8.getStrokeWidth() / 2.0f;
            canvas0.drawLine(0.0f, f, ((float)this.getWidth()), f, this.Q8);
        }
    }

    @m
    public final TextView getTitleView() {
        return this.V8;
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

    public final void setInfoTitle(@m CharSequence charSequence0) {
        TextView textView0 = this.X8;
        if(textView0 != null) {
            textView0.setText(charSequence0);
        }
        int v = 0;
        TextView textView1 = this.X8;
        if(textView1 != null) {
            if(!this.S8 || charSequence0 == null || charSequence0.length() <= 0) {
                v = 8;
            }
            textView1.setVisibility(v);
        }
    }

    public final void setInfoTitleTextColor(@ColorInt int v) {
        TextView textView0 = this.X8;
        if(textView0 != null) {
            textView0.setTextColor(v);
        }
    }

    public final void setOnLogoClickListener(@l View.OnClickListener view$OnClickListener0) {
        L.p(view$OnClickListener0, "listener");
        View view0 = this.U8;
        if(view0 != null) {
            view0.setOnClickListener(view$OnClickListener0);
        }
    }

    public final void setShowToolbarDivider(boolean z) {
        this.R8 = z;
        this.invalidate();
    }

    @Override  // androidx.appcompat.widget.Toolbar
    public void setSubtitle(@m CharSequence charSequence0) {
        super.setSubtitle(charSequence0);
        TextView textView0 = this.W8;
        if(textView0 != null) {
            textView0.setText(charSequence0);
        }
        int v = 0;
        TextView textView1 = this.W8;
        if(textView1 != null) {
            if(!this.S8 || charSequence0 == null || charSequence0.length() <= 0) {
                v = 8;
            }
            textView1.setVisibility(v);
        }
    }

    @Override  // androidx.appcompat.widget.Toolbar
    public void setSubtitleTextColor(@ColorInt int v) {
        super.setSubtitleTextColor(v);
        TextView textView0 = this.W8;
        if(textView0 != null) {
            textView0.setTextColor(v);
        }
    }

    @Override  // androidx.appcompat.widget.Toolbar
    public void setTitle(@m CharSequence charSequence0) {
        super.setTitle(charSequence0);
        TextView textView0 = this.V8;
        if(textView0 != null) {
            textView0.setText(charSequence0);
        }
        int v = 0;
        TextView textView1 = this.V8;
        if(textView1 != null) {
            if(!this.S8 || charSequence0 == null || charSequence0.length() <= 0) {
                v = 8;
            }
            textView1.setVisibility(v);
        }
    }

    @Override  // androidx.appcompat.widget.Toolbar
    public void setTitleTextColor(@ColorInt int v) {
        super.setTitleTextColor(v);
        TextView textView0 = this.V8;
        if(textView0 != null) {
            textView0.setTextColor(v);
        }
    }
}

