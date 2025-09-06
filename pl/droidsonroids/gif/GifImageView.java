package pl.droidsonroids.gif;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.RequiresApi;

public class GifImageView extends ImageView {
    private boolean a;

    public GifImageView(Context context0) {
        super(context0);
    }

    public GifImageView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.a(l.c(this, attributeSet0, 0, 0));
    }

    public GifImageView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.a(l.c(this, attributeSet0, v, 0));
    }

    @RequiresApi(21)
    public GifImageView(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        this.a(l.c(this, attributeSet0, v, v1));
    }

    private void a(a l$a0) {
        this.a = l$a0.a;
        int v = l$a0.c;
        if(v > 0) {
            super.setImageResource(v);
        }
        int v1 = l$a0.d;
        if(v1 > 0) {
            super.setBackgroundResource(v1);
        }
    }

    @Override  // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof GifViewSavedState)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((GifViewSavedState)parcelable0).getSuperState());
        ((GifViewSavedState)parcelable0).a(this.getDrawable(), 0);
        ((GifViewSavedState)parcelable0).a(this.getBackground(), 1);
    }

    @Override  // android.view.View
    public Parcelable onSaveInstanceState() {
        Drawable drawable0 = null;
        Drawable drawable1 = this.a ? this.getDrawable() : null;
        if(this.a) {
            drawable0 = this.getBackground();
        }
        return new GifViewSavedState(super.onSaveInstanceState(), new Drawable[]{drawable1, drawable0});
    }

    @Override  // android.view.View
    public void setBackgroundResource(int v) {
        if(!l.e(this, false, v)) {
            super.setBackgroundResource(v);
        }
    }

    public void setFreezesAnimation(boolean z) {
        this.a = z;
    }

    @Override  // android.widget.ImageView
    public void setImageResource(int v) {
        if(!l.e(this, true, v)) {
            super.setImageResource(v);
        }
    }

    @Override  // android.widget.ImageView
    public void setImageURI(Uri uri0) {
        if(!l.d(this, uri0)) {
            super.setImageURI(uri0);
        }
    }
}

