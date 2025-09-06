package pl.droidsonroids.gif;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import java.io.IOException;

public class GifTextView extends TextView {
    private b a;

    public GifTextView(Context context0) {
        super(context0);
    }

    public GifTextView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.c(attributeSet0, 0, 0);
    }

    public GifTextView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.c(attributeSet0, v, 0);
    }

    @RequiresApi(21)
    public GifTextView(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        this.c(attributeSet0, v, v1);
    }

    private void a() {
        if(this.a.b < 0) {
            return;
        }
        Drawable[] arr_drawable = this.getCompoundDrawables();
        for(int v1 = 0; v1 < arr_drawable.length; ++v1) {
            l.a(this.a.b, arr_drawable[v1]);
        }
        Drawable[] arr_drawable1 = this.getCompoundDrawablesRelative();
        for(int v = 0; v < arr_drawable1.length; ++v) {
            l.a(this.a.b, arr_drawable1[v]);
        }
        l.a(this.a.b, this.getBackground());
    }

    private Drawable b(int v) {
        if(v == 0) {
            return null;
        }
        Resources resources0 = this.getResources();
        String s = resources0.getResourceTypeName(v);
        if(!this.isInEditMode() && l.b.contains(s)) {
            try {
                return new e(resources0, v);
            }
            catch(IOException | Resources.NotFoundException unused_ex) {
            }
        }
        return resources0.getDrawable(v, this.getContext().getTheme());
    }

    private void c(AttributeSet attributeSet0, int v, int v1) {
        if(attributeSet0 != null) {
            Drawable drawable0 = this.b(attributeSet0.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "drawableLeft", 0));
            Drawable drawable1 = this.b(attributeSet0.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "drawableTop", 0));
            Drawable drawable2 = this.b(attributeSet0.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "drawableRight", 0));
            Drawable drawable3 = this.b(attributeSet0.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "drawableBottom", 0));
            Drawable drawable4 = this.b(attributeSet0.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "drawableStart", 0));
            Drawable drawable5 = this.b(attributeSet0.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "drawableEnd", 0));
            if(this.getLayoutDirection() == 0) {
                if(drawable4 != null) {
                    drawable0 = drawable4;
                }
                if(drawable5 == null) {
                    drawable5 = drawable2;
                }
            }
            else {
                if(drawable4 != null) {
                    drawable2 = drawable4;
                }
                if(drawable5 == null) {
                    drawable5 = drawable0;
                }
                drawable0 = drawable2;
            }
            this.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable0, drawable1, drawable5, drawable3);
            this.setBackground(this.b(attributeSet0.getAttributeResourceValue("http://schemas.android.com/apk/res/android", "background", 0)));
            this.a = new b(this, attributeSet0, v, v1);
            this.a();
        }
        this.a = new b();
    }

    private static void d(Drawable[] arr_drawable, boolean z) {
        for(int v = 0; v < arr_drawable.length; ++v) {
            Drawable drawable0 = arr_drawable[v];
            if(drawable0 != null) {
                drawable0.setVisible(z, false);
            }
        }
    }

    @Override  // android.widget.TextView
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.setCompoundDrawablesVisible(true);
    }

    @Override  // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.setCompoundDrawablesVisible(false);
    }

    @Override  // android.widget.TextView
    public void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof GifViewSavedState)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((GifViewSavedState)parcelable0).getSuperState());
        Drawable[] arr_drawable = this.getCompoundDrawables();
        ((GifViewSavedState)parcelable0).a(arr_drawable[0], 0);
        ((GifViewSavedState)parcelable0).a(arr_drawable[1], 1);
        ((GifViewSavedState)parcelable0).a(arr_drawable[2], 2);
        ((GifViewSavedState)parcelable0).a(arr_drawable[3], 3);
        Drawable[] arr_drawable1 = this.getCompoundDrawablesRelative();
        ((GifViewSavedState)parcelable0).a(arr_drawable1[0], 4);
        ((GifViewSavedState)parcelable0).a(arr_drawable1[2], 5);
        ((GifViewSavedState)parcelable0).a(this.getBackground(), 6);
    }

    @Override  // android.widget.TextView
    public Parcelable onSaveInstanceState() {
        Drawable[] arr_drawable = new Drawable[7];
        if(this.a.a) {
            Drawable[] arr_drawable1 = this.getCompoundDrawables();
            System.arraycopy(arr_drawable1, 0, arr_drawable, 0, arr_drawable1.length);
            Drawable[] arr_drawable2 = this.getCompoundDrawablesRelative();
            arr_drawable[4] = arr_drawable2[0];
            arr_drawable[5] = arr_drawable2[2];
            arr_drawable[6] = this.getBackground();
        }
        return new GifViewSavedState(super.onSaveInstanceState(), arr_drawable);
    }

    @Override  // android.view.View
    public void setBackgroundResource(int v) {
        this.setBackground(this.b(v));
    }

    @Override  // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int v, int v1, int v2, int v3) {
        this.setCompoundDrawablesRelativeWithIntrinsicBounds(this.b(v), this.b(v1), this.b(v2), this.b(v3));
    }

    private void setCompoundDrawablesVisible(boolean z) {
        GifTextView.d(this.getCompoundDrawables(), z);
        GifTextView.d(this.getCompoundDrawablesRelative(), z);
    }

    @Override  // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int v, int v1, int v2, int v3) {
        this.setCompoundDrawablesWithIntrinsicBounds(this.b(v), this.b(v1), this.b(v2), this.b(v3));
    }

    public void setFreezesAnimation(boolean z) {
        this.a.a = z;
    }
}

