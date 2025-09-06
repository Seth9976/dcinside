package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.InputFilter;
import android.text.Layout.Alignment;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode.Callback;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.string;
import androidx.appcompat.R.styleable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.text.AllCapsTransformationMethod;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.emoji2.text.EmojiCompat.InitCallback;
import androidx.emoji2.text.EmojiCompat;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public class SwitchCompat extends CompoundButton implements EmojiCompatConfigurationView {
    static class EmojiCompatInitCallback extends InitCallback {
        private final Reference a;

        EmojiCompatInitCallback(SwitchCompat switchCompat0) {
            this.a = new WeakReference(switchCompat0);
        }

        @Override  // androidx.emoji2.text.EmojiCompat$InitCallback
        public void a(@Nullable Throwable throwable0) {
            SwitchCompat switchCompat0 = (SwitchCompat)this.a.get();
            if(switchCompat0 != null) {
                switchCompat0.k();
            }
        }

        @Override  // androidx.emoji2.text.EmojiCompat$InitCallback
        public void b() {
            SwitchCompat switchCompat0 = (SwitchCompat)this.a.get();
            if(switchCompat0 != null) {
                switchCompat0.k();
            }
        }
    }

    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private boolean H;
    private final TextPaint I;
    private ColorStateList J;
    private Layout K;
    private Layout L;
    @Nullable
    private TransformationMethod M;
    private final Rect M8;
    ObjectAnimator N;
    private static final int N8 = 0xFA;
    private final AppCompatTextHelper O;
    private static final int O8 = 0;
    @NonNull
    private AppCompatEmojiTextHelper P;
    private static final int P8 = 1;
    @Nullable
    private EmojiCompatInitCallback Q;
    private static final int Q8 = 2;
    private static final String R8 = "android.widget.Switch";
    private static final int S8 = 1;
    private static final int T8 = 2;
    private static final int U8 = 3;
    private static final Property V8;
    private static final int[] W8;
    private Drawable a;
    private ColorStateList b;
    private PorterDuff.Mode c;
    private boolean d;
    private boolean e;
    private Drawable f;
    private ColorStateList g;
    private PorterDuff.Mode h;
    private boolean i;
    private boolean j;
    private int k;
    private int l;
    private int m;
    private boolean n;
    private CharSequence o;
    private CharSequence p;
    private CharSequence q;
    private CharSequence r;
    private boolean s;
    private int t;
    private int u;
    private float v;
    private float w;
    private VelocityTracker x;
    private int y;
    float z;

    static {
        SwitchCompat.V8 = new Property(Float.class, "thumbPos") {
            public Float a(SwitchCompat switchCompat0) {
                return switchCompat0.z;
            }

            public void b(SwitchCompat switchCompat0, Float float0) {
                switchCompat0.setThumbPosition(((float)float0));
            }

            @Override  // android.util.Property
            public Object get(Object object0) {
                return this.a(((SwitchCompat)object0));
            }

            @Override  // android.util.Property
            public void set(Object object0, Object object1) {
                this.b(((SwitchCompat)object0), ((Float)object1));
            }
        };
        SwitchCompat.W8 = new int[]{0x10100A0};
    }

    public SwitchCompat(@NonNull Context context0) {
        this(context0, null);
    }

    public SwitchCompat(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.switchStyle);
    }

    public SwitchCompat(@NonNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.b = null;
        this.c = null;
        this.d = false;
        this.e = false;
        this.g = null;
        this.h = null;
        this.i = false;
        this.j = false;
        this.x = VelocityTracker.obtain();
        this.H = true;
        this.M8 = new Rect();
        ThemeUtils.a(this, this.getContext());
        TextPaint textPaint0 = new TextPaint(1);
        this.I = textPaint0;
        textPaint0.density = this.getResources().getDisplayMetrics().density;
        TintTypedArray tintTypedArray0 = TintTypedArray.G(context0, attributeSet0, styleable.SwitchCompat, v, 0);
        ViewCompat.H1(this, context0, styleable.SwitchCompat, attributeSet0, tintTypedArray0.B(), v, 0);
        Drawable drawable0 = tintTypedArray0.h(styleable.SwitchCompat_android_thumb);
        this.a = drawable0;
        if(drawable0 != null) {
            drawable0.setCallback(this);
        }
        Drawable drawable1 = tintTypedArray0.h(styleable.SwitchCompat_track);
        this.f = drawable1;
        if(drawable1 != null) {
            drawable1.setCallback(this);
        }
        this.setTextOnInternal(tintTypedArray0.x(styleable.SwitchCompat_android_textOn));
        this.setTextOffInternal(tintTypedArray0.x(styleable.SwitchCompat_android_textOff));
        this.s = tintTypedArray0.a(styleable.SwitchCompat_showText, true);
        this.k = tintTypedArray0.g(styleable.SwitchCompat_thumbTextPadding, 0);
        this.l = tintTypedArray0.g(styleable.SwitchCompat_switchMinWidth, 0);
        this.m = tintTypedArray0.g(styleable.SwitchCompat_switchPadding, 0);
        this.n = tintTypedArray0.a(styleable.SwitchCompat_splitTrack, false);
        ColorStateList colorStateList0 = tintTypedArray0.d(styleable.SwitchCompat_thumbTint);
        if(colorStateList0 != null) {
            this.b = colorStateList0;
            this.d = true;
        }
        PorterDuff.Mode porterDuff$Mode0 = DrawableUtils.e(tintTypedArray0.o(styleable.SwitchCompat_thumbTintMode, -1), null);
        if(this.c != porterDuff$Mode0) {
            this.c = porterDuff$Mode0;
            this.e = true;
        }
        if(this.d || this.e) {
            this.c();
        }
        ColorStateList colorStateList1 = tintTypedArray0.d(styleable.SwitchCompat_trackTint);
        if(colorStateList1 != null) {
            this.g = colorStateList1;
            this.i = true;
        }
        PorterDuff.Mode porterDuff$Mode1 = DrawableUtils.e(tintTypedArray0.o(styleable.SwitchCompat_trackTintMode, -1), null);
        if(this.h != porterDuff$Mode1) {
            this.h = porterDuff$Mode1;
            this.j = true;
        }
        if(this.i || this.j) {
            this.d();
        }
        int v1 = tintTypedArray0.u(styleable.SwitchCompat_switchTextAppearance, 0);
        if(v1 != 0) {
            this.n(context0, v1);
        }
        AppCompatTextHelper appCompatTextHelper0 = new AppCompatTextHelper(this);
        this.O = appCompatTextHelper0;
        appCompatTextHelper0.m(attributeSet0, v);
        tintTypedArray0.I();
        ViewConfiguration viewConfiguration0 = ViewConfiguration.get(context0);
        this.u = viewConfiguration0.getScaledTouchSlop();
        this.y = viewConfiguration0.getScaledMinimumFlingVelocity();
        this.getEmojiTextViewHelper().c(attributeSet0, v);
        this.refreshDrawableState();
        this.setChecked(this.isChecked());
    }

    @Override  // androidx.appcompat.widget.EmojiCompatConfigurationView
    public boolean a() {
        return this.getEmojiTextViewHelper().b();
    }

    private void b(boolean z) {
        ObjectAnimator objectAnimator0 = ObjectAnimator.ofFloat(this, SwitchCompat.V8, new float[]{(z ? 1.0f : 0.0f)});
        this.N = objectAnimator0;
        objectAnimator0.setDuration(0xFAL);
        this.N.setAutoCancel(true);
        this.N.start();
    }

    private void c() {
        Drawable drawable0 = this.a;
        if(drawable0 != null && (this.d || this.e)) {
            Drawable drawable1 = DrawableCompat.r(drawable0).mutate();
            this.a = drawable1;
            if(this.d) {
                DrawableCompat.o(drawable1, this.b);
            }
            if(this.e) {
                DrawableCompat.p(this.a, this.c);
            }
            if(this.a.isStateful()) {
                this.a.setState(this.getDrawableState());
            }
        }
    }

    private void d() {
        Drawable drawable0 = this.f;
        if(drawable0 != null && (this.i || this.j)) {
            Drawable drawable1 = DrawableCompat.r(drawable0).mutate();
            this.f = drawable1;
            if(this.i) {
                DrawableCompat.o(drawable1, this.g);
            }
            if(this.j) {
                DrawableCompat.p(this.f, this.h);
            }
            if(this.f.isStateful()) {
                this.f.setState(this.getDrawableState());
            }
        }
    }

    @Override  // android.view.View
    public void draw(@NonNull Canvas canvas0) {
        int v12;
        int v7;
        Rect rect0 = this.M8;
        int v = this.D;
        int v1 = this.E;
        int v2 = this.F;
        int v3 = this.G;
        int v4 = this.getThumbOffset() + v;
        Rect rect1 = this.a == null ? DrawableUtils.c : DrawableUtils.d(this.a);
        Drawable drawable0 = this.f;
        if(drawable0 != null) {
            drawable0.getPadding(rect0);
            int v5 = rect0.left;
            v4 += v5;
            if(rect1 == null) {
                v7 = v1;
                v12 = v3;
            }
            else {
                int v6 = rect1.left;
                if(v6 > v5) {
                    v += v6 - v5;
                }
                v7 = rect1.top <= rect0.top ? v1 : rect1.top - rect0.top + v1;
                int v8 = rect1.right;
                int v9 = rect0.right;
                if(v8 > v9) {
                    v2 -= v8 - v9;
                }
                int v10 = rect1.bottom;
                int v11 = rect0.bottom;
                v12 = v10 > v11 ? v3 - (v10 - v11) : v3;
            }
            this.f.setBounds(v, v7, v2, v12);
        }
        Drawable drawable1 = this.a;
        if(drawable1 != null) {
            drawable1.getPadding(rect0);
            int v13 = v4 - rect0.left;
            int v14 = v4 + this.C + rect0.right;
            this.a.setBounds(v13, v1, v14, v3);
            Drawable drawable2 = this.getBackground();
            if(drawable2 != null) {
                DrawableCompat.l(drawable2, v13, v1, v14, v3);
            }
        }
        super.draw(canvas0);
    }

    @Override  // android.widget.CompoundButton
    public void drawableHotspotChanged(float f, float f1) {
        super.drawableHotspotChanged(f, f1);
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            DrawableCompat.k(drawable0, f, f1);
        }
        Drawable drawable1 = this.f;
        if(drawable1 != null) {
            DrawableCompat.k(drawable1, f, f1);
        }
    }

    @Override  // android.widget.CompoundButton
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] arr_v = this.getDrawableState();
        Drawable drawable0 = this.a;
        boolean z = drawable0 == null || !drawable0.isStateful() ? false : drawable0.setState(arr_v);
        Drawable drawable1 = this.f;
        if(drawable1 != null && drawable1.isStateful()) {
            z |= drawable1.setState(arr_v);
        }
        if(z) {
            this.invalidate();
        }
    }

    private void e() {
        ObjectAnimator objectAnimator0 = this.N;
        if(objectAnimator0 != null) {
            objectAnimator0.cancel();
        }
    }

    private void f(MotionEvent motionEvent0) {
        MotionEvent motionEvent1 = MotionEvent.obtain(motionEvent0);
        motionEvent1.setAction(3);
        super.onTouchEvent(motionEvent1);
        motionEvent1.recycle();
    }

    private static float g(float f, float f1, float f2) {
        if(f < f1) {
            return f1;
        }
        return f > f2 ? f2 : f;
    }

    @Override  // android.widget.CompoundButton
    public int getCompoundPaddingLeft() {
        if(!ViewUtils.b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int v = super.getCompoundPaddingLeft() + this.A;
        return TextUtils.isEmpty(this.getText()) ? v : v + this.m;
    }

    @Override  // android.widget.CompoundButton
    public int getCompoundPaddingRight() {
        if(ViewUtils.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int v = super.getCompoundPaddingRight() + this.A;
        return TextUtils.isEmpty(this.getText()) ? v : v + this.m;
    }

    @Override  // android.widget.TextView
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return TextViewCompat.F(super.getCustomSelectionActionModeCallback());
    }

    @NonNull
    private AppCompatEmojiTextHelper getEmojiTextViewHelper() {
        if(this.P == null) {
            this.P = new AppCompatEmojiTextHelper(this);
        }
        return this.P;
    }

    public boolean getShowText() {
        return this.s;
    }

    public boolean getSplitTrack() {
        return this.n;
    }

    public int getSwitchMinWidth() {
        return this.l;
    }

    public int getSwitchPadding() {
        return this.m;
    }

    private boolean getTargetCheckedState() {
        return this.z > 0.5f;
    }

    public CharSequence getTextOff() {
        return this.q;
    }

    public CharSequence getTextOn() {
        return this.o;
    }

    public Drawable getThumbDrawable() {
        return this.a;
    }

    // 去混淆评级： 低(20)
    private int getThumbOffset() {
        return ViewUtils.b(this) ? ((int)((1.0f - this.z) * ((float)this.getThumbScrollRange()) + 0.5f)) : ((int)(this.z * ((float)this.getThumbScrollRange()) + 0.5f));
    }

    @FloatRange(from = 0.0, to = 1.0)
    protected final float getThumbPosition() {
        return this.z;
    }

    private int getThumbScrollRange() {
        Drawable drawable0 = this.f;
        if(drawable0 != null) {
            Rect rect0 = this.M8;
            drawable0.getPadding(rect0);
            Drawable drawable1 = this.a;
            if(drawable1 != null) {
                Rect rect1 = DrawableUtils.d(drawable1);
                return this.A - this.C - rect0.left - rect0.right - rect1.left - rect1.right;
            }
            return this.A - this.C - rect0.left - rect0.right - DrawableUtils.c.left - DrawableUtils.c.right;
        }
        return 0;
    }

    public int getThumbTextPadding() {
        return this.k;
    }

    @Nullable
    public ColorStateList getThumbTintList() {
        return this.b;
    }

    @Nullable
    public PorterDuff.Mode getThumbTintMode() {
        return this.c;
    }

    public Drawable getTrackDrawable() {
        return this.f;
    }

    @Nullable
    public ColorStateList getTrackTintList() {
        return this.g;
    }

    @Nullable
    public PorterDuff.Mode getTrackTintMode() {
        return this.h;
    }

    @Nullable
    private CharSequence h(@Nullable CharSequence charSequence0) {
        TransformationMethod transformationMethod0 = this.getEmojiTextViewHelper().f(this.M);
        return transformationMethod0 == null ? charSequence0 : transformationMethod0.getTransformation(charSequence0, this);
    }

    private boolean i(float f, float f1) {
        if(this.a == null) {
            return false;
        }
        int v = this.getThumbOffset();
        this.a.getPadding(this.M8);
        int v1 = this.D + v - this.u;
        return f > ((float)v1) && f < ((float)(this.C + v1 + this.M8.left + this.M8.right + this.u)) && f1 > ((float)(this.E - this.u)) && f1 < ((float)(this.G + this.u));
    }

    private Layout j(CharSequence charSequence0) {
        return charSequence0 == null ? new StaticLayout(null, this.I, 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true) : new StaticLayout(charSequence0, this.I, ((int)Math.ceil(Layout.getDesiredWidth(charSequence0, this.I))), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    @Override  // android.widget.CompoundButton
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable0 = this.a;
        if(drawable0 != null) {
            drawable0.jumpToCurrentState();
        }
        Drawable drawable1 = this.f;
        if(drawable1 != null) {
            drawable1.jumpToCurrentState();
        }
        if(this.N != null && this.N.isStarted()) {
            this.N.end();
            this.N = null;
        }
    }

    void k() {
        this.setTextOnInternal(this.o);
        this.setTextOffInternal(this.q);
        this.requestLayout();
    }

    private void l() {
        if(Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence0 = this.q;
            if(charSequence0 == null) {
                charSequence0 = this.getResources().getString(string.abc_capital_off);
            }
            ViewCompat.C2(this, charSequence0);
        }
    }

    private void m() {
        if(Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence0 = this.o;
            if(charSequence0 == null) {
                charSequence0 = this.getResources().getString(string.abc_capital_on);
            }
            ViewCompat.C2(this, charSequence0);
        }
    }

    public void n(Context context0, int v) {
        TintTypedArray tintTypedArray0 = TintTypedArray.E(context0, v, styleable.TextAppearance);
        ColorStateList colorStateList0 = tintTypedArray0.d(styleable.TextAppearance_android_textColor);
        this.J = colorStateList0 == null ? this.getTextColors() : colorStateList0;
        int v1 = tintTypedArray0.g(styleable.TextAppearance_android_textSize, 0);
        if(v1 != 0 && ((float)v1) != this.I.getTextSize()) {
            this.I.setTextSize(((float)v1));
            this.requestLayout();
        }
        this.p(tintTypedArray0.o(styleable.TextAppearance_android_typeface, -1), tintTypedArray0.o(styleable.TextAppearance_android_textStyle, -1));
        this.M = tintTypedArray0.a(styleable.TextAppearance_textAllCaps, false) ? new AllCapsTransformationMethod(this.getContext()) : null;
        this.setTextOnInternal(this.o);
        this.setTextOffInternal(this.q);
        tintTypedArray0.I();
    }

    public void o(Typeface typeface0, int v) {
        float f = 0.0f;
        boolean z = false;
        if(v > 0) {
            Typeface typeface1 = typeface0 == null ? Typeface.defaultFromStyle(v) : Typeface.create(typeface0, v);
            this.setSwitchTypeface(typeface1);
            int v1 = ~(typeface1 == null ? 0 : typeface1.getStyle()) & v;
            TextPaint textPaint0 = this.I;
            if((v1 & 1) != 0) {
                z = true;
            }
            textPaint0.setFakeBoldText(z);
            TextPaint textPaint1 = this.I;
            if((v1 & 2) != 0) {
                f = -0.25f;
            }
            textPaint1.setTextSkewX(f);
            return;
        }
        this.I.setFakeBoldText(false);
        this.I.setTextSkewX(0.0f);
        this.setSwitchTypeface(typeface0);
    }

    @Override  // android.widget.CompoundButton
    protected int[] onCreateDrawableState(int v) {
        int[] arr_v = super.onCreateDrawableState(v + 1);
        if(this.isChecked()) {
            View.mergeDrawableStates(arr_v, SwitchCompat.W8);
        }
        return arr_v;
    }

    @Override  // android.widget.CompoundButton
    protected void onDraw(Canvas canvas0) {
        int v5;
        super.onDraw(canvas0);
        Rect rect0 = this.M8;
        Drawable drawable0 = this.f;
        if(drawable0 == null) {
            rect0.setEmpty();
        }
        else {
            drawable0.getPadding(rect0);
        }
        int v = this.E + rect0.top;
        int v1 = this.G - rect0.bottom;
        Drawable drawable1 = this.a;
        if(drawable0 != null) {
            if(!this.n || drawable1 == null) {
                drawable0.draw(canvas0);
            }
            else {
                Rect rect1 = DrawableUtils.d(drawable1);
                drawable1.copyBounds(rect0);
                rect0.left += rect1.left;
                rect0.right -= rect1.right;
                int v2 = canvas0.save();
                canvas0.clipRect(rect0, Region.Op.DIFFERENCE);
                drawable0.draw(canvas0);
                canvas0.restoreToCount(v2);
            }
        }
        int v3 = canvas0.save();
        if(drawable1 != null) {
            drawable1.draw(canvas0);
        }
        Layout layout0 = this.getTargetCheckedState() ? this.K : this.L;
        if(layout0 != null) {
            int[] arr_v = this.getDrawableState();
            ColorStateList colorStateList0 = this.J;
            if(colorStateList0 != null) {
                int v4 = colorStateList0.getColorForState(arr_v, 0);
                this.I.setColor(v4);
            }
            this.I.drawableState = arr_v;
            if(drawable1 == null) {
                v5 = this.getWidth();
            }
            else {
                Rect rect2 = drawable1.getBounds();
                v5 = rect2.left + rect2.right;
            }
            canvas0.translate(((float)(v5 / 2 - layout0.getWidth() / 2)), ((float)((v + v1) / 2 - layout0.getHeight() / 2)));
            layout0.draw(canvas0);
        }
        canvas0.restoreToCount(v3);
    }

    @Override  // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent0) {
        super.onInitializeAccessibilityEvent(accessibilityEvent0);
        accessibilityEvent0.setClassName("android.widget.Switch");
    }

    @Override  // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo0) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
        accessibilityNodeInfo0.setClassName("android.widget.Switch");
        if(Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence0 = this.isChecked() ? this.o : this.q;
            if(!TextUtils.isEmpty(charSequence0)) {
                CharSequence charSequence1 = accessibilityNodeInfo0.getText();
                if(TextUtils.isEmpty(charSequence1)) {
                    accessibilityNodeInfo0.setText(charSequence0);
                    return;
                }
                StringBuilder stringBuilder0 = new StringBuilder();
                stringBuilder0.append(charSequence1);
                stringBuilder0.append(' ');
                stringBuilder0.append(charSequence0);
                accessibilityNodeInfo0.setText(stringBuilder0);
            }
        }
    }

    @Override  // android.widget.TextView
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        int v9;
        int v8;
        int v7;
        int v6;
        int v5;
        super.onLayout(z, v, v1, v2, v3);
        int v4 = 0;
        if(this.a == null) {
            v5 = 0;
        }
        else {
            Rect rect0 = this.M8;
            Drawable drawable0 = this.f;
            if(drawable0 == null) {
                rect0.setEmpty();
            }
            else {
                drawable0.getPadding(rect0);
            }
            Rect rect1 = DrawableUtils.d(this.a);
            v5 = Math.max(0, rect1.left - rect0.left);
            v4 = Math.max(0, rect1.right - rect0.right);
        }
        if(ViewUtils.b(this)) {
            v6 = this.getPaddingLeft() + v5;
            v7 = this.A + v6 - v5 - v4;
        }
        else {
            v7 = this.getWidth() - this.getPaddingRight() - v4;
            v6 = v7 - this.A + v5 + v4;
        }
        switch(this.getGravity() & 0x70) {
            case 16: {
                v8 = (this.getPaddingTop() + this.getHeight() - this.getPaddingBottom()) / 2 - this.B / 2;
                v9 = this.B + v8;
                break;
            }
            case 80: {
                v9 = this.getHeight() - this.getPaddingBottom();
                v8 = v9 - this.B;
                break;
            }
            default: {
                v8 = this.getPaddingTop();
                v9 = this.B + v8;
            }
        }
        this.D = v6;
        this.E = v8;
        this.G = v9;
        this.F = v7;
    }

    @Override  // android.widget.TextView
    public void onMeasure(int v, int v1) {
        int v4;
        int v3;
        if(this.s) {
            if(this.K == null) {
                this.K = this.j(this.p);
            }
            if(this.L == null) {
                this.L = this.j(this.r);
            }
        }
        Rect rect0 = this.M8;
        Drawable drawable0 = this.a;
        int v2 = 0;
        if(drawable0 == null) {
            v3 = 0;
            v4 = 0;
        }
        else {
            drawable0.getPadding(rect0);
            v3 = this.a.getIntrinsicWidth() - rect0.left - rect0.right;
            v4 = this.a.getIntrinsicHeight();
        }
        this.C = Math.max((this.s ? Math.max(this.K.getWidth(), this.L.getWidth()) + this.k * 2 : 0), v3);
        Drawable drawable1 = this.f;
        if(drawable1 == null) {
            rect0.setEmpty();
        }
        else {
            drawable1.getPadding(rect0);
            v2 = this.f.getIntrinsicHeight();
        }
        int v5 = rect0.left;
        int v6 = rect0.right;
        Drawable drawable2 = this.a;
        if(drawable2 != null) {
            Rect rect1 = DrawableUtils.d(drawable2);
            v5 = Math.max(v5, rect1.left);
            v6 = Math.max(v6, rect1.right);
        }
        int v7 = Math.max(v2, v4);
        this.A = this.H ? Math.max(this.l, this.C * 2 + v5 + v6) : this.l;
        this.B = v7;
        super.onMeasure(v, v1);
        if(this.getMeasuredHeight() < v7) {
            this.setMeasuredDimension(this.getMeasuredWidthAndState(), v7);
        }
    }

    @Override  // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent0) {
        super.onPopulateAccessibilityEvent(accessibilityEvent0);
        CharSequence charSequence0 = this.isChecked() ? this.o : this.q;
        if(charSequence0 != null) {
            accessibilityEvent0.getText().add(charSequence0);
        }
    }

    @Override  // android.widget.TextView
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        float f2;
        this.x.addMovement(motionEvent0);
        int v = motionEvent0.getActionMasked();
        if(v == 0) {
            float f6 = motionEvent0.getX();
            float f7 = motionEvent0.getY();
            if(this.isEnabled() && this.i(f6, f7)) {
                this.t = 1;
                this.v = f6;
                this.w = f7;
            }
        }
        else {
            switch(v) {
                case 1: {
                label_6:
                    if(this.t == 2) {
                        this.r(motionEvent0);
                        super.onTouchEvent(motionEvent0);
                        return true;
                    }
                    this.t = 0;
                    this.x.clear();
                    return super.onTouchEvent(motionEvent0);
                }
                case 2: {
                    break;
                }
                default: {
                    if(v != 3) {
                        return super.onTouchEvent(motionEvent0);
                    }
                    goto label_6;
                }
            }
            switch(this.t) {
                case 1: {
                    goto label_29;
                }
                case 2: {
                    goto label_15;
                }
            }
            return super.onTouchEvent(motionEvent0);
        label_15:
            float f = motionEvent0.getX();
            int v1 = this.getThumbScrollRange();
            float f1 = f - this.v;
            if(v1 == 0) {
                f2 = f1 > 0.0f ? 1.0f : -1.0f;
            }
            else {
                f2 = f1 / ((float)v1);
            }
            if(ViewUtils.b(this)) {
                f2 = -f2;
            }
            float f3 = SwitchCompat.g(this.z + f2, 0.0f, 1.0f);
            if(f3 != this.z) {
                this.v = f;
                this.setThumbPosition(f3);
            }
            return true;
        label_29:
            float f4 = motionEvent0.getX();
            float f5 = motionEvent0.getY();
            if(Math.abs(f4 - this.v) > ((float)this.u) || Math.abs(f5 - this.w) > ((float)this.u)) {
                this.t = 2;
                this.getParent().requestDisallowInterceptTouchEvent(true);
                this.v = f4;
                this.w = f5;
                return true;
            }
        }
        return super.onTouchEvent(motionEvent0);
    }

    private void p(int v, int v1) {
        Typeface typeface0;
        switch(v) {
            case 1: {
                typeface0 = Typeface.SANS_SERIF;
                break;
            }
            case 2: {
                typeface0 = Typeface.SERIF;
                break;
            }
            case 3: {
                typeface0 = Typeface.MONOSPACE;
                break;
            }
            default: {
                typeface0 = null;
            }
        }
        this.o(typeface0, v1);
    }

    private void q() {
        if(this.Q == null && this.P.b() && false) {
            EmojiCompat emojiCompat0 = EmojiCompat.c();
            switch(emojiCompat0.i()) {
                case 0: 
                case 3: {
                    EmojiCompatInitCallback switchCompat$EmojiCompatInitCallback0 = new EmojiCompatInitCallback(this);
                    this.Q = switchCompat$EmojiCompatInitCallback0;
                    emojiCompat0.B(switchCompat$EmojiCompatInitCallback0);
                    break;
                }
            }
        }
    }

    private void r(MotionEvent motionEvent0) {
        this.t = 0;
        boolean z = true;
        boolean z1 = motionEvent0.getAction() == 1 && this.isEnabled();
        boolean z2 = this.isChecked();
        if(z1) {
            this.x.computeCurrentVelocity(1000);
            float f = this.x.getXVelocity();
            if(Math.abs(f) <= ((float)this.y)) {
                z = this.getTargetCheckedState();
            }
            else if(!ViewUtils.b(this)) {
                if(f <= 0.0f) {
                    z = false;
                }
            }
            else if(f >= 0.0f) {
                z = false;
            }
        }
        else {
            z = z2;
        }
        if(z != z2) {
            this.playSoundEffect(0);
        }
        this.setChecked(z);
        this.f(motionEvent0);
    }

    @Override  // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        this.getEmojiTextViewHelper().d(z);
    }

    @Override  // android.widget.CompoundButton
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean z1 = this.isChecked();
        if(z1) {
            this.m();
        }
        else {
            this.l();
        }
        if(this.getWindowToken() != null && this.isLaidOut()) {
            this.b(z1);
            return;
        }
        this.e();
        this.setThumbPosition((z1 ? 1.0f : 0.0f));
    }

    @Override  // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback actionMode$Callback0) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.G(this, actionMode$Callback0));
    }

    @Override  // androidx.appcompat.widget.EmojiCompatConfigurationView
    public void setEmojiCompatEnabled(boolean z) {
        this.getEmojiTextViewHelper().e(z);
        this.setTextOnInternal(this.o);
        this.setTextOffInternal(this.q);
        this.requestLayout();
    }

    protected final void setEnforceSwitchWidth(boolean z) {
        this.H = z;
        this.invalidate();
    }

    @Override  // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] arr_inputFilter) {
        super.setFilters(this.getEmojiTextViewHelper().a(arr_inputFilter));
    }

    public void setShowText(boolean z) {
        if(this.s != z) {
            this.s = z;
            this.requestLayout();
            if(z) {
                this.q();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.n = z;
        this.invalidate();
    }

    public void setSwitchMinWidth(int v) {
        this.l = v;
        this.requestLayout();
    }

    public void setSwitchPadding(int v) {
        this.m = v;
        this.requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface0) {
        if(this.I.getTypeface() != null && !this.I.getTypeface().equals(typeface0) || this.I.getTypeface() == null && typeface0 != null) {
            this.I.setTypeface(typeface0);
            this.requestLayout();
            this.invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence0) {
        this.setTextOffInternal(charSequence0);
        this.requestLayout();
        if(!this.isChecked()) {
            this.l();
        }
    }

    private void setTextOffInternal(CharSequence charSequence0) {
        this.q = charSequence0;
        this.r = this.h(charSequence0);
        this.L = null;
        if(this.s) {
            this.q();
        }
    }

    public void setTextOn(CharSequence charSequence0) {
        this.setTextOnInternal(charSequence0);
        this.requestLayout();
        if(this.isChecked()) {
            this.m();
        }
    }

    private void setTextOnInternal(CharSequence charSequence0) {
        this.o = charSequence0;
        this.p = this.h(charSequence0);
        this.K = null;
        if(this.s) {
            this.q();
        }
    }

    public void setThumbDrawable(Drawable drawable0) {
        Drawable drawable1 = this.a;
        if(drawable1 != null) {
            drawable1.setCallback(null);
        }
        this.a = drawable0;
        if(drawable0 != null) {
            drawable0.setCallback(this);
        }
        this.requestLayout();
    }

    void setThumbPosition(float f) {
        this.z = f;
        this.invalidate();
    }

    public void setThumbResource(int v) {
        this.setThumbDrawable(AppCompatResources.b(this.getContext(), v));
    }

    public void setThumbTextPadding(int v) {
        this.k = v;
        this.requestLayout();
    }

    public void setThumbTintList(@Nullable ColorStateList colorStateList0) {
        this.b = colorStateList0;
        this.d = true;
        this.c();
    }

    public void setThumbTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        this.c = porterDuff$Mode0;
        this.e = true;
        this.c();
    }

    public void setTrackDrawable(Drawable drawable0) {
        Drawable drawable1 = this.f;
        if(drawable1 != null) {
            drawable1.setCallback(null);
        }
        this.f = drawable0;
        if(drawable0 != null) {
            drawable0.setCallback(this);
        }
        this.requestLayout();
    }

    public void setTrackResource(int v) {
        this.setTrackDrawable(AppCompatResources.b(this.getContext(), v));
    }

    public void setTrackTintList(@Nullable ColorStateList colorStateList0) {
        this.g = colorStateList0;
        this.i = true;
        this.d();
    }

    public void setTrackTintMode(@Nullable PorterDuff.Mode porterDuff$Mode0) {
        this.h = porterDuff$Mode0;
        this.j = true;
        this.d();
    }

    @Override  // android.widget.CompoundButton
    public void toggle() {
        this.setChecked(!this.isChecked());
    }

    @Override  // android.widget.CompoundButton
    protected boolean verifyDrawable(@NonNull Drawable drawable0) {
        return super.verifyDrawable(drawable0) || drawable0 == this.a || drawable0 == this.f;
    }
}

