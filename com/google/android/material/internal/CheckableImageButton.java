package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.attr;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;

@RestrictTo({Scope.b})
public class CheckableImageButton extends AppCompatImageButton implements Checkable {
    static class SavedState extends AbsSavedState {
        class a implements Parcelable.ClassLoaderCreator {
            a() {
                super();
            }

            @NonNull
            public SavedState a(@NonNull Parcel parcel0) {
                return new SavedState(parcel0, null);
            }

            @NonNull
            public SavedState b(@NonNull Parcel parcel0, ClassLoader classLoader0) {
                return new SavedState(parcel0, classLoader0);
            }

            @NonNull
            public SavedState[] c(int v) {
                return new SavedState[v];
            }

            @Override  // android.os.Parcelable$Creator
            @NonNull
            public Object createFromParcel(@NonNull Parcel parcel0) {
                return this.a(parcel0);
            }

            @Override  // android.os.Parcelable$ClassLoaderCreator
            @NonNull
            public Object createFromParcel(@NonNull Parcel parcel0, ClassLoader classLoader0) {
                return this.b(parcel0, classLoader0);
            }

            @Override  // android.os.Parcelable$Creator
            @NonNull
            public Object[] newArray(int v) {
                return this.c(v);
            }
        }

        public static final Parcelable.Creator CREATOR;
        boolean c;

        static {
            SavedState.CREATOR = new a();
        }

        public SavedState(@NonNull Parcel parcel0, ClassLoader classLoader0) {
            super(parcel0, classLoader0);
            this.c(parcel0);
        }

        public SavedState(Parcelable parcelable0) {
            super(parcelable0);
        }

        private void c(@NonNull Parcel parcel0) {
            this.c = parcel0.readInt() == 1;
        }

        @Override  // androidx.customview.view.AbsSavedState
        public void writeToParcel(@NonNull Parcel parcel0, int v) {
            super.writeToParcel(parcel0, v);
            parcel0.writeInt(((int)this.c));
        }
    }

    private boolean d;
    private boolean e;
    private boolean f;
    private static final int[] g;

    static {
        CheckableImageButton.g = new int[]{0x10100A0};
    }

    public CheckableImageButton(Context context0) {
        this(context0, null);
    }

    public CheckableImageButton(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, attr.imageButtonStyle);
    }

    public CheckableImageButton(Context context0, AttributeSet attributeSet0, int v) {
        class com.google.android.material.internal.CheckableImageButton.a extends AccessibilityDelegateCompat {
            final CheckableImageButton d;

            @Override  // androidx.core.view.AccessibilityDelegateCompat
            public void f(View view0, @NonNull AccessibilityEvent accessibilityEvent0) {
                super.f(view0, accessibilityEvent0);
                accessibilityEvent0.setChecked(CheckableImageButton.this.isChecked());
            }

            @Override  // androidx.core.view.AccessibilityDelegateCompat
            public void g(View view0, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat0) {
                super.g(view0, accessibilityNodeInfoCompat0);
                accessibilityNodeInfoCompat0.i1(CheckableImageButton.this.a());
                accessibilityNodeInfoCompat0.j1(CheckableImageButton.this.isChecked());
            }
        }

        super(context0, attributeSet0, v);
        this.e = true;
        this.f = true;
        ViewCompat.J1(this, new com.google.android.material.internal.CheckableImageButton.a(this));
    }

    public boolean a() {
        return this.e;
    }

    public boolean b() {
        return this.f;
    }

    @Override  // android.widget.Checkable
    public boolean isChecked() {
        return this.d;
    }

    // 去混淆评级： 低(20)
    @Override  // android.widget.ImageView
    public int[] onCreateDrawableState(int v) {
        return this.d ? View.mergeDrawableStates(super.onCreateDrawableState(v + CheckableImageButton.g.length), CheckableImageButton.g) : super.onCreateDrawableState(v);
    }

    @Override  // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((SavedState)parcelable0).a());
        this.setChecked(((SavedState)parcelable0).c);
    }

    @Override  // android.view.View
    @NonNull
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelable0 = new SavedState(super.onSaveInstanceState());
        parcelable0.c = this.d;
        return parcelable0;
    }

    public void setCheckable(boolean z) {
        if(this.e != z) {
            this.e = z;
            this.sendAccessibilityEvent(0);
        }
    }

    @Override  // android.widget.Checkable
    public void setChecked(boolean z) {
        if(this.e && this.d != z) {
            this.d = z;
            this.refreshDrawableState();
            this.sendAccessibilityEvent(0x800);
        }
    }

    public void setPressable(boolean z) {
        this.f = z;
    }

    @Override  // android.view.View
    public void setPressed(boolean z) {
        if(this.f) {
            super.setPressed(z);
        }
    }

    @Override  // android.widget.Checkable
    public void toggle() {
        this.setChecked(!this.d);
    }
}

