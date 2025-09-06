package pl.droidsonroids.gif;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;
import android.view.TextureView;
import android.widget.ImageView.ScaleType;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import java.lang.ref.WeakReference;

public class GifTextureView extends TextureView {
    static class a {
        static final int[] a;

        static {
            int[] arr_v = new int[ImageView.ScaleType.values().length];
            a.a = arr_v;
            try {
                arr_v[ImageView.ScaleType.CENTER.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[ImageView.ScaleType.FIT_START.ordinal()] = 6;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                a.a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

    public interface b {
        void a(Canvas arg1);
    }

    static class c extends Thread implements TextureView.SurfaceTextureListener {
        final pl.droidsonroids.gif.c a;
        private GifInfoHandle b;
        private IOException c;
        long[] d;
        private final WeakReference e;

        c(GifTextureView gifTextureView0) {
            super("GifRenderThread");
            this.a = new pl.droidsonroids.gif.c();
            this.b = new GifInfoHandle();
            this.e = new WeakReference(gifTextureView0);
        }

        void c(@NonNull GifTextureView gifTextureView0, @Nullable b gifTextureView$b0) {
            this.a.b();
            gifTextureView0.setSuperSurfaceTextureListener((gifTextureView$b0 == null ? null : new q(gifTextureView$b0)));
            this.b.z();
            this.interrupt();
        }

        @Override  // android.view.TextureView$SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture0, int v, int v1) {
            GifTextureView gifTextureView0 = (GifTextureView)this.e.get();
            if(gifTextureView0 != null) {
                gifTextureView0.i(this.b);
            }
            this.a.c();
        }

        @Override  // android.view.TextureView$SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture0) {
            this.a.b();
            this.b.z();
            this.interrupt();
            return true;
        }

        @Override  // android.view.TextureView$SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture0, int v, int v1) {
        }

        @Override  // android.view.TextureView$SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture0) {
        }

        @Override
        public void run() {
            class pl.droidsonroids.gif.GifTextureView.c.a implements Runnable {
                final GifTextureView a;
                final c b;

                pl.droidsonroids.gif.GifTextureView.c.a(GifTextureView gifTextureView0) {
                    this.a = gifTextureView0;
                    super();
                }

                @Override
                public void run() {
                    this.a.i(c.this.b);
                }
            }

            try {
                GifTextureView gifTextureView0 = (GifTextureView)this.e.get();
                if(gifTextureView0 == null) {
                    return;
                }
                GifInfoHandle gifInfoHandle0 = gifTextureView0.c.c();
                this.b = gifInfoHandle0;
                gifInfoHandle0.K('\u0001', gifTextureView0.isOpaque());
                if(gifTextureView0.f.b >= 0) {
                    this.b.J(gifTextureView0.f.b);
                }
            }
            catch(IOException iOException0) {
                this.c = iOException0;
                return;
            }
            GifTextureView gifTextureView1 = (GifTextureView)this.e.get();
            if(gifTextureView1 == null) {
                this.b.A();
                return;
            }
            gifTextureView1.setSuperSurfaceTextureListener(this);
            boolean z = gifTextureView1.isAvailable();
            this.a.d(z);
            if(z) {
                gifTextureView1.post(new pl.droidsonroids.gif.GifTextureView.c.a(this, gifTextureView1));
            }
            this.b.L(gifTextureView1.e);
            while(!this.isInterrupted()) {
                try {
                    this.a.a();
                }
                catch(InterruptedException unused_ex) {
                    Thread.currentThread().interrupt();
                    break;
                }
                GifTextureView gifTextureView2 = (GifTextureView)this.e.get();
                if(gifTextureView2 == null) {
                    break;
                }
                SurfaceTexture surfaceTexture0 = gifTextureView2.getSurfaceTexture();
                if(surfaceTexture0 != null) {
                    Surface surface0 = new Surface(surfaceTexture0);
                    try {
                        this.b.a(surface0, this.d);
                    }
                    finally {
                        surface0.release();
                    }
                }
            }
            this.b.A();
            this.b = new GifInfoHandle();
        }
    }

    private ImageView.ScaleType a;
    private final Matrix b;
    private m c;
    private c d;
    private float e;
    private pl.droidsonroids.gif.l.b f;
    private static final ImageView.ScaleType[] g;

    static {
        GifTextureView.g = new ImageView.ScaleType[]{ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    }

    public GifTextureView(Context context0) {
        super(context0);
        this.a = ImageView.ScaleType.FIT_CENTER;
        this.b = new Matrix();
        this.e = 1.0f;
        this.g(null, 0, 0);
    }

    public GifTextureView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.a = ImageView.ScaleType.FIT_CENTER;
        this.b = new Matrix();
        this.e = 1.0f;
        this.g(attributeSet0, 0, 0);
    }

    public GifTextureView(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.a = ImageView.ScaleType.FIT_CENTER;
        this.b = new Matrix();
        this.e = 1.0f;
        this.g(attributeSet0, v, 0);
    }

    @RequiresApi(21)
    public GifTextureView(Context context0, AttributeSet attributeSet0, int v, int v1) {
        super(context0, attributeSet0, v, v1);
        this.a = ImageView.ScaleType.FIT_CENTER;
        this.b = new Matrix();
        this.e = 1.0f;
        this.g(attributeSet0, v, v1);
    }

    private static m f(TypedArray typedArray0) {
        TypedValue typedValue0 = new TypedValue();
        if(!typedArray0.getValue(styleable.GifTextureView_gifSource, typedValue0)) {
            return null;
        }
        if(typedValue0.resourceId != 0) {
            String s = typedArray0.getResources().getResourceTypeName(typedValue0.resourceId);
            if(l.b.contains(s)) {
                return new i(typedArray0.getResources(), typedValue0.resourceId);
            }
            if(!"string".equals(s)) {
                throw new IllegalArgumentException("Expected string, drawable, mipmap or raw resource type. \'" + s + "\' is not supported");
            }
        }
        return new pl.droidsonroids.gif.m.c(typedArray0.getResources().getAssets(), typedValue0.string.toString());
    }

    private void g(AttributeSet attributeSet0, int v, int v1) {
        if(attributeSet0 == null) {
            super.setOpaque(false);
            this.f = new pl.droidsonroids.gif.l.b();
        }
        else {
            int v2 = attributeSet0.getAttributeIntValue("http://schemas.android.com/apk/res/android", "scaleType", -1);
            if(v2 >= 0) {
                ImageView.ScaleType[] arr_imageView$ScaleType = GifTextureView.g;
                if(v2 < arr_imageView$ScaleType.length) {
                    this.a = arr_imageView$ScaleType[v2];
                }
            }
            TypedArray typedArray0 = this.getContext().obtainStyledAttributes(attributeSet0, styleable.GifTextureView, v, v1);
            this.c = GifTextureView.f(typedArray0);
            super.setOpaque(typedArray0.getBoolean(styleable.GifTextureView_isOpaque, false));
            typedArray0.recycle();
            this.f = new pl.droidsonroids.gif.l.b(this, attributeSet0, v, v1);
        }
        if(!this.isInEditMode()) {
            c gifTextureView$c0 = new c(this);
            this.d = gifTextureView$c0;
            if(this.c != null) {
                gifTextureView$c0.start();
            }
        }
    }

    @Nullable
    public IOException getIOException() {
        return this.d.c != null ? this.d.c : GifIOException.a(this.d.b.l());
    }

    public ImageView.ScaleType getScaleType() {
        return this.a;
    }

    @Override  // android.view.TextureView
    public TextureView.SurfaceTextureListener getSurfaceTextureListener() {
        return null;
    }

    @Override  // android.view.TextureView
    public Matrix getTransform(Matrix matrix0) {
        if(matrix0 == null) {
            matrix0 = new Matrix();
        }
        matrix0.set(this.b);
        return matrix0;
    }

    public void h(@Nullable m m0, @Nullable b gifTextureView$b0) {
        synchronized(this) {
            this.d.c(this, gifTextureView$b0);
            try {
                this.d.join();
            }
            catch(InterruptedException interruptedException0) {
                interruptedException0.printStackTrace();
            }
            this.c = m0;
            c gifTextureView$c0 = new c(this);
            this.d = gifTextureView$c0;
            if(m0 != null) {
                gifTextureView$c0.start();
            }
        }
    }

    private void i(GifInfoHandle gifInfoHandle0) {
        Matrix matrix0 = new Matrix();
        float f = (float)this.getWidth();
        float f1 = (float)this.getHeight();
        float f2 = ((float)gifInfoHandle0.q()) / f;
        float f3 = ((float)gifInfoHandle0.i()) / f1;
        RectF rectF0 = new RectF(0.0f, 0.0f, ((float)gifInfoHandle0.q()), ((float)gifInfoHandle0.i()));
        RectF rectF1 = new RectF(0.0f, 0.0f, f, f1);
        float f4 = 1.0f;
        switch(a.a[this.a.ordinal()]) {
            case 1: {
                matrix0.setScale(f2, f3, f / 2.0f, f1 / 2.0f);
                break;
            }
            case 2: {
                float f5 = Math.min(f2, f3);
                matrix0.setScale(f2 * (1.0f / f5), 1.0f / f5 * f3, f / 2.0f, f1 / 2.0f);
                break;
            }
            case 3: {
                if(((float)gifInfoHandle0.q()) > f || ((float)gifInfoHandle0.i()) > f1) {
                    f4 = Math.min(1.0f / f2, 1.0f / f3);
                }
                matrix0.setScale(f2 * f4, f4 * f3, f / 2.0f, f1 / 2.0f);
                break;
            }
            case 4: {
                matrix0.setRectToRect(rectF0, rectF1, Matrix.ScaleToFit.CENTER);
                matrix0.preScale(f2, f3);
                break;
            }
            case 5: {
                matrix0.setRectToRect(rectF0, rectF1, Matrix.ScaleToFit.END);
                matrix0.preScale(f2, f3);
                break;
            }
            case 6: {
                matrix0.setRectToRect(rectF0, rectF1, Matrix.ScaleToFit.START);
                matrix0.preScale(f2, f3);
                break;
            }
            case 7: {
                return;
            }
            case 8: {
                matrix0.set(this.b);
                matrix0.preScale(f2, f3);
            }
        }
        super.setTransform(matrix0);
    }

    @Override  // android.view.View
    protected void onDetachedFromWindow() {
        this.d.c(this, null);
        super.onDetachedFromWindow();
        SurfaceTexture surfaceTexture0 = this.getSurfaceTexture();
        if(surfaceTexture0 != null) {
            surfaceTexture0.release();
        }
    }

    @Override  // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable0) {
        if(!(parcelable0 instanceof GifViewSavedState)) {
            super.onRestoreInstanceState(parcelable0);
            return;
        }
        super.onRestoreInstanceState(((GifViewSavedState)parcelable0).getSuperState());
        this.d.d = ((GifViewSavedState)parcelable0).a[0];
    }

    @Override  // android.view.View
    public Parcelable onSaveInstanceState() {
        c gifTextureView$c0 = this.d;
        gifTextureView$c0.d = gifTextureView$c0.b.o();
        Parcelable parcelable0 = super.onSaveInstanceState();
        return this.f.a ? new GifViewSavedState(parcelable0, this.d.d) : new GifViewSavedState(parcelable0, null);
    }

    public void setFreezesAnimation(boolean z) {
        this.f.a = z;
    }

    public void setImageMatrix(Matrix matrix0) {
        this.setTransform(matrix0);
    }

    public void setInputSource(@Nullable m m0) {
        synchronized(this) {
            this.h(m0, null);
        }
    }

    @Override  // android.view.TextureView
    public void setOpaque(boolean z) {
        if(z != this.isOpaque()) {
            super.setOpaque(z);
            this.setInputSource(this.c);
        }
    }

    public void setScaleType(@NonNull ImageView.ScaleType imageView$ScaleType0) {
        this.a = imageView$ScaleType0;
        this.i(this.d.b);
    }

    public void setSpeed(@FloatRange(from = 0.0, fromInclusive = false) float f) {
        this.e = f;
        this.d.b.L(f);
    }

    private void setSuperSurfaceTextureListener(TextureView.SurfaceTextureListener textureView$SurfaceTextureListener0) {
        super.setSurfaceTextureListener(textureView$SurfaceTextureListener0);
    }

    @Override  // android.view.TextureView
    public void setSurfaceTexture(SurfaceTexture surfaceTexture0) {
        throw new UnsupportedOperationException("Changing SurfaceTexture is not supported");
    }

    @Override  // android.view.TextureView
    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener textureView$SurfaceTextureListener0) {
        throw new UnsupportedOperationException("Changing SurfaceTextureListener is not supported");
    }

    @Override  // android.view.TextureView
    public void setTransform(Matrix matrix0) {
        this.b.set(matrix0);
        this.i(this.d.b);
    }
}

