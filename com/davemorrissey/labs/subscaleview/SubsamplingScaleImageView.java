package com.davemorrissey.labs.subscaleview;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint.Style;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler.Callback;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View.OnLongClickListener;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.exifinterface.media.ExifInterface;
import com.davemorrissey.labs.subscaleview.decoder.CompatDecoderFactory;
import com.davemorrissey.labs.subscaleview.decoder.DecoderFactory;
import com.davemorrissey.labs.subscaleview.decoder.ImageDecoder;
import com.davemorrissey.labs.subscaleview.decoder.ImageRegionDecoder;
import com.davemorrissey.labs.subscaleview.decoder.SkiaImageDecoder;
import com.davemorrissey.labs.subscaleview.decoder.SkiaImageRegionDecoder;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import jeb.synthetic.TWR;

public class SubsamplingScaleImageView extends View {
    static class Anim {
        private long duration;
        private int easing;
        private boolean interruptible;
        private OnAnimationEventListener listener;
        private int origin;
        private PointF sCenterEnd;
        private PointF sCenterEndRequested;
        private PointF sCenterStart;
        private float scaleEnd;
        private float scaleStart;
        private long time;
        private PointF vFocusEnd;
        private PointF vFocusStart;

        private Anim() {
            this.duration = 500L;
            this.interruptible = true;
            this.easing = 2;
            this.origin = 1;
            this.time = System.currentTimeMillis();
        }

        Anim(com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.1 subsamplingScaleImageView$10) {
        }
    }

    public final class AnimationBuilder {
        private long duration;
        private int easing;
        private boolean interruptible;
        private OnAnimationEventListener listener;
        private int origin;
        private boolean panLimited;
        private final PointF targetSCenter;
        private final float targetScale;
        private final PointF vFocus;

        private AnimationBuilder(float f) {
            this.duration = 500L;
            this.easing = 2;
            this.origin = 1;
            this.interruptible = true;
            this.panLimited = true;
            this.targetScale = f;
            this.targetSCenter = subsamplingScaleImageView0.getCenter();
            this.vFocus = null;
        }

        private AnimationBuilder(float f, PointF pointF0) {
            this.duration = 500L;
            this.easing = 2;
            this.origin = 1;
            this.interruptible = true;
            this.panLimited = true;
            this.targetScale = f;
            this.targetSCenter = pointF0;
            this.vFocus = null;
        }

        private AnimationBuilder(float f, PointF pointF0, PointF pointF1) {
            this.duration = 500L;
            this.easing = 2;
            this.origin = 1;
            this.interruptible = true;
            this.panLimited = true;
            this.targetScale = f;
            this.targetSCenter = pointF0;
            this.vFocus = pointF1;
        }

        AnimationBuilder(float f, PointF pointF0, PointF pointF1, com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.1 subsamplingScaleImageView$10) {
            this(f, pointF0, pointF1);
        }

        AnimationBuilder(float f, PointF pointF0, com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.1 subsamplingScaleImageView$10) {
            this(f, pointF0);
        }

        AnimationBuilder(float f, com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.1 subsamplingScaleImageView$10) {
            this(f);
        }

        private AnimationBuilder(PointF pointF0) {
            this.duration = 500L;
            this.easing = 2;
            this.origin = 1;
            this.interruptible = true;
            this.panLimited = true;
            this.targetScale = subsamplingScaleImageView0.scale;
            this.targetSCenter = pointF0;
            this.vFocus = null;
        }

        AnimationBuilder(PointF pointF0, com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.1 subsamplingScaleImageView$10) {
            this(pointF0);
        }

        public void start() {
            PointF pointF1;
            if(SubsamplingScaleImageView.this.anim != null && SubsamplingScaleImageView.this.anim.listener != null) {
                try {
                    SubsamplingScaleImageView.this.anim.listener.onInterruptedByNewAnim();
                }
                catch(Exception exception0) {
                    Log.w("SubsamplingScaleImageView", "Error thrown by animation listener", exception0);
                }
            }
            int v = SubsamplingScaleImageView.this.getPaddingLeft();
            int v1 = SubsamplingScaleImageView.this.getWidth();
            int v2 = SubsamplingScaleImageView.this.getPaddingRight();
            int v3 = SubsamplingScaleImageView.this.getPaddingLeft();
            int v4 = SubsamplingScaleImageView.this.getPaddingTop();
            int v5 = SubsamplingScaleImageView.this.getHeight();
            int v6 = SubsamplingScaleImageView.this.getPaddingBottom();
            int v7 = SubsamplingScaleImageView.this.getPaddingTop();
            float f = SubsamplingScaleImageView.this.limitedScale(this.targetScale);
            if(this.panLimited) {
                float f1 = this.targetSCenter.x;
                float f2 = this.targetSCenter.y;
                PointF pointF0 = new PointF();
                pointF1 = SubsamplingScaleImageView.this.limitedSCenter(f1, f2, f, pointF0);
            }
            else {
                pointF1 = this.targetSCenter;
            }
            Anim subsamplingScaleImageView$Anim0 = new Anim(null);
            SubsamplingScaleImageView.this.anim = subsamplingScaleImageView$Anim0;
            SubsamplingScaleImageView.this.anim.scaleStart = SubsamplingScaleImageView.this.scale;
            SubsamplingScaleImageView.this.anim.scaleEnd = f;
            SubsamplingScaleImageView.this.anim.time = System.currentTimeMillis();
            SubsamplingScaleImageView.this.anim.sCenterEndRequested = pointF1;
            SubsamplingScaleImageView.this.anim.sCenterStart = SubsamplingScaleImageView.this.getCenter();
            SubsamplingScaleImageView.this.anim.sCenterEnd = pointF1;
            SubsamplingScaleImageView.this.anim.vFocusStart = SubsamplingScaleImageView.this.sourceToViewCoord(pointF1);
            SubsamplingScaleImageView.this.anim.vFocusEnd = new PointF(((float)(v + (v1 - v2 - v3) / 2)), ((float)(v4 + (v5 - v6 - v7) / 2)));
            SubsamplingScaleImageView.this.anim.duration = this.duration;
            SubsamplingScaleImageView.this.anim.interruptible = this.interruptible;
            SubsamplingScaleImageView.this.anim.easing = this.easing;
            SubsamplingScaleImageView.this.anim.origin = this.origin;
            SubsamplingScaleImageView.this.anim.time = System.currentTimeMillis();
            SubsamplingScaleImageView.this.anim.listener = this.listener;
            PointF pointF2 = this.vFocus;
            if(pointF2 != null) {
                float f3 = pointF2.x - SubsamplingScaleImageView.this.anim.sCenterStart.x * f;
                float f4 = this.vFocus.y - SubsamplingScaleImageView.this.anim.sCenterStart.y * f;
                ScaleAndTranslate subsamplingScaleImageView$ScaleAndTranslate0 = new ScaleAndTranslate(f, new PointF(f3, f4), null);
                SubsamplingScaleImageView.this.fitToBounds(true, subsamplingScaleImageView$ScaleAndTranslate0);
                SubsamplingScaleImageView.this.anim.vFocusEnd = new PointF(this.vFocus.x + (subsamplingScaleImageView$ScaleAndTranslate0.vTranslate.x - f3), this.vFocus.y + (subsamplingScaleImageView$ScaleAndTranslate0.vTranslate.y - f4));
            }
            SubsamplingScaleImageView.this.invalidate();
        }

        @NonNull
        public AnimationBuilder withDuration(long v) {
            this.duration = v;
            return this;
        }

        @NonNull
        public AnimationBuilder withEasing(int v) {
            if(!SubsamplingScaleImageView.VALID_EASING_STYLES.contains(v)) {
                throw new IllegalArgumentException("Unknown easing type: " + v);
            }
            this.easing = v;
            return this;
        }

        @NonNull
        public AnimationBuilder withInterruptible(boolean z) {
            this.interruptible = z;
            return this;
        }

        @NonNull
        public AnimationBuilder withOnAnimationEventListener(OnAnimationEventListener subsamplingScaleImageView$OnAnimationEventListener0) {
            this.listener = subsamplingScaleImageView$OnAnimationEventListener0;
            return this;
        }

        @NonNull
        private AnimationBuilder withOrigin(int v) {
            this.origin = v;
            return this;
        }

        @NonNull
        private AnimationBuilder withPanLimited(boolean z) {
            this.panLimited = z;
            return this;
        }
    }

    static class BitmapLoadTask extends AsyncTask {
        private Bitmap bitmap;
        private final WeakReference contextRef;
        private final WeakReference decoderFactoryRef;
        private Exception exception;
        private final boolean preview;
        private final Uri source;
        private final WeakReference viewRef;

        BitmapLoadTask(SubsamplingScaleImageView subsamplingScaleImageView0, Context context0, DecoderFactory decoderFactory0, Uri uri0, boolean z) {
            this.viewRef = new WeakReference(subsamplingScaleImageView0);
            this.contextRef = new WeakReference(context0);
            this.decoderFactoryRef = new WeakReference(decoderFactory0);
            this.source = uri0;
            this.preview = z;
        }

        protected Integer doInBackground(Void[] arr_void) {
            try {
                String s = this.source.toString();
                Context context0 = (Context)this.contextRef.get();
                DecoderFactory decoderFactory0 = (DecoderFactory)this.decoderFactoryRef.get();
                SubsamplingScaleImageView subsamplingScaleImageView0 = (SubsamplingScaleImageView)this.viewRef.get();
                if(context0 != null && decoderFactory0 != null && subsamplingScaleImageView0 != null) {
                    subsamplingScaleImageView0.debug("BitmapLoadTask.doInBackground", new Object[0]);
                    this.bitmap = ((ImageDecoder)decoderFactory0.make()).decode(context0, this.source);
                    return subsamplingScaleImageView0.getExifOrientation(context0, s);
                }
            }
            catch(Exception exception0) {
                Log.e("SubsamplingScaleImageView", "Failed to load bitmap", exception0);
                this.exception = exception0;
            }
            catch(OutOfMemoryError outOfMemoryError0) {
                Log.e("SubsamplingScaleImageView", "Failed to load bitmap - OutOfMemoryError", outOfMemoryError0);
                this.exception = new RuntimeException(outOfMemoryError0);
            }
            return null;
        }

        @Override  // android.os.AsyncTask
        protected Object doInBackground(Object[] arr_object) {
            return this.doInBackground(((Void[])arr_object));
        }

        protected void onPostExecute(Integer integer0) {
            SubsamplingScaleImageView subsamplingScaleImageView0 = (SubsamplingScaleImageView)this.viewRef.get();
            if(subsamplingScaleImageView0 != null) {
                Bitmap bitmap0 = this.bitmap;
                if(bitmap0 != null && integer0 != null) {
                    if(this.preview) {
                        subsamplingScaleImageView0.onPreviewLoaded(bitmap0);
                        return;
                    }
                    subsamplingScaleImageView0.onImageLoaded(bitmap0, ((int)integer0), false);
                    return;
                }
                if(this.exception != null && subsamplingScaleImageView0.onImageEventListener != null) {
                    if(this.preview) {
                        subsamplingScaleImageView0.onImageEventListener.onPreviewLoadError(this.exception);
                        return;
                    }
                    subsamplingScaleImageView0.onImageEventListener.onImageLoadError(this.exception);
                }
            }
        }

        @Override  // android.os.AsyncTask
        protected void onPostExecute(Object object0) {
            this.onPostExecute(((Integer)object0));
        }
    }

    public static class DefaultOnAnimationEventListener implements OnAnimationEventListener {
        @Override  // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView$OnAnimationEventListener
        public void onComplete() {
        }

        @Override  // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView$OnAnimationEventListener
        public void onInterruptedByNewAnim() {
        }

        @Override  // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView$OnAnimationEventListener
        public void onInterruptedByUser() {
        }
    }

    public static class DefaultOnImageEventListener implements OnImageEventListener {
        @Override  // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView$OnImageEventListener
        public void onImageLoadError(Exception exception0) {
        }

        @Override  // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView$OnImageEventListener
        public void onImageLoaded() {
        }

        @Override  // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView$OnImageEventListener
        public void onPreviewLoadError(Exception exception0) {
        }

        @Override  // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView$OnImageEventListener
        public void onPreviewReleased() {
        }

        @Override  // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView$OnImageEventListener
        public void onReady() {
        }

        @Override  // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView$OnImageEventListener
        public void onTileLoadError(Exception exception0) {
        }
    }

    public static class DefaultOnStateChangedListener implements OnStateChangedListener {
        @Override  // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView$OnStateChangedListener
        public void onCenterChanged(PointF pointF0, int v) {
        }

        @Override  // com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView$OnStateChangedListener
        public void onScaleChanged(float f, int v) {
        }
    }

    public interface OnAnimationEventListener {
        void onComplete();

        void onInterruptedByNewAnim();

        void onInterruptedByUser();
    }

    public interface OnImageEventListener {
        void onImageLoadError(Exception arg1);

        void onImageLoaded();

        void onPreviewLoadError(Exception arg1);

        void onPreviewReleased();

        void onReady();

        void onTileLoadError(Exception arg1);
    }

    public interface OnStateChangedListener {
        void onCenterChanged(PointF arg1, int arg2);

        void onScaleChanged(float arg1, int arg2);
    }

    static class ScaleAndTranslate {
        private float scale;
        private final PointF vTranslate;

        private ScaleAndTranslate(float f, PointF pointF0) {
            this.scale = f;
            this.vTranslate = pointF0;
        }

        ScaleAndTranslate(float f, PointF pointF0, com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.1 subsamplingScaleImageView$10) {
            this(f, pointF0);
        }
    }

    static class Tile {
        private Bitmap bitmap;
        private Rect fileSRect;
        private boolean loading;
        private Rect sRect;
        private int sampleSize;
        private Rect vRect;
        private boolean visible;

        private Tile() {
        }

        Tile(com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView.1 subsamplingScaleImageView$10) {
        }
    }

    static class TileLoadTask extends AsyncTask {
        private final WeakReference decoderRef;
        private Exception exception;
        private final WeakReference tileRef;
        private final WeakReference viewRef;

        TileLoadTask(SubsamplingScaleImageView subsamplingScaleImageView0, ImageRegionDecoder imageRegionDecoder0, Tile subsamplingScaleImageView$Tile0) {
            this.viewRef = new WeakReference(subsamplingScaleImageView0);
            this.decoderRef = new WeakReference(imageRegionDecoder0);
            this.tileRef = new WeakReference(subsamplingScaleImageView$Tile0);
            subsamplingScaleImageView$Tile0.loading = true;
        }

        protected Bitmap doInBackground(Void[] arr_void) {
            Bitmap bitmap0;
            Tile subsamplingScaleImageView$Tile0;
            ImageRegionDecoder imageRegionDecoder0;
            SubsamplingScaleImageView subsamplingScaleImageView0;
            try {
                subsamplingScaleImageView0 = (SubsamplingScaleImageView)this.viewRef.get();
                imageRegionDecoder0 = (ImageRegionDecoder)this.decoderRef.get();
                subsamplingScaleImageView$Tile0 = (Tile)this.tileRef.get();
                if(imageRegionDecoder0 != null && subsamplingScaleImageView$Tile0 != null && subsamplingScaleImageView0 != null && imageRegionDecoder0.isReady() && subsamplingScaleImageView$Tile0.visible) {
                    subsamplingScaleImageView0.debug("TileLoadTask.doInBackground, tile.sRect=%s, tile.sampleSize=%d", new Object[]{subsamplingScaleImageView$Tile0.sRect, subsamplingScaleImageView$Tile0.sampleSize});
                    subsamplingScaleImageView0.decoderLock.readLock().lock();
                    goto label_6;
                }
                goto label_20;
            }
            catch(Exception exception0) {
                Log.e("SubsamplingScaleImageView", "Failed to decode tile", exception0);
                this.exception = exception0;
                return null;
            }
            catch(OutOfMemoryError outOfMemoryError0) {
                Log.e("SubsamplingScaleImageView", "Failed to decode tile - OutOfMemoryError", outOfMemoryError0);
                this.exception = new RuntimeException(outOfMemoryError0);
                return null;
            }
            try {
            label_6:
                if(imageRegionDecoder0.isReady()) {
                    subsamplingScaleImageView0.fileSRect(subsamplingScaleImageView$Tile0.sRect, subsamplingScaleImageView$Tile0.fileSRect);
                    if(subsamplingScaleImageView0.sRegion != null) {
                        subsamplingScaleImageView$Tile0.fileSRect.offset(subsamplingScaleImageView0.sRegion.left, subsamplingScaleImageView0.sRegion.top);
                    }
                    bitmap0 = imageRegionDecoder0.decodeRegion(subsamplingScaleImageView$Tile0.fileSRect, subsamplingScaleImageView$Tile0.sampleSize);
                    goto label_11;
                }
                subsamplingScaleImageView$Tile0.loading = false;
                goto label_18;
            }
            catch(Throwable throwable0) {
                goto label_16;
            }
            try {
            label_11:
                subsamplingScaleImageView0.decoderLock.readLock().unlock();
                return bitmap0;
            }
            catch(Exception exception0) {
                Log.e("SubsamplingScaleImageView", "Failed to decode tile", exception0);
                this.exception = exception0;
                return null;
            }
            catch(OutOfMemoryError outOfMemoryError0) {
                Log.e("SubsamplingScaleImageView", "Failed to decode tile - OutOfMemoryError", outOfMemoryError0);
                this.exception = new RuntimeException(outOfMemoryError0);
                return null;
            }
            try {
                subsamplingScaleImageView$Tile0.loading = false;
                goto label_18;
            }
            catch(Throwable throwable0) {
            }
            try {
            label_16:
                subsamplingScaleImageView0.decoderLock.readLock().unlock();
                throw throwable0;
            label_18:
                subsamplingScaleImageView0.decoderLock.readLock().unlock();
                return null;
            label_20:
                if(subsamplingScaleImageView$Tile0 != null) {
                    subsamplingScaleImageView$Tile0.loading = false;
                    return null;
                }
            }
            catch(Exception exception0) {
                Log.e("SubsamplingScaleImageView", "Failed to decode tile", exception0);
                this.exception = exception0;
            }
            catch(OutOfMemoryError outOfMemoryError0) {
                Log.e("SubsamplingScaleImageView", "Failed to decode tile - OutOfMemoryError", outOfMemoryError0);
                this.exception = new RuntimeException(outOfMemoryError0);
            }
            return null;
        }

        @Override  // android.os.AsyncTask
        protected Object doInBackground(Object[] arr_object) {
            return this.doInBackground(((Void[])arr_object));
        }

        protected void onPostExecute(Bitmap bitmap0) {
            SubsamplingScaleImageView subsamplingScaleImageView0 = (SubsamplingScaleImageView)this.viewRef.get();
            Tile subsamplingScaleImageView$Tile0 = (Tile)this.tileRef.get();
            if(subsamplingScaleImageView0 != null && subsamplingScaleImageView$Tile0 != null) {
                if(bitmap0 != null) {
                    subsamplingScaleImageView$Tile0.bitmap = bitmap0;
                    subsamplingScaleImageView$Tile0.loading = false;
                    subsamplingScaleImageView0.onTileLoaded();
                    return;
                }
                if(this.exception != null && subsamplingScaleImageView0.onImageEventListener != null) {
                    subsamplingScaleImageView0.onImageEventListener.onTileLoadError(this.exception);
                }
            }
        }

        @Override  // android.os.AsyncTask
        protected void onPostExecute(Object object0) {
            this.onPostExecute(((Bitmap)object0));
        }
    }

    static class TilesInitTask extends AsyncTask {
        private final WeakReference contextRef;
        private ImageRegionDecoder decoder;
        private final WeakReference decoderFactoryRef;
        private Exception exception;
        private final Uri source;
        private final WeakReference viewRef;

        TilesInitTask(SubsamplingScaleImageView subsamplingScaleImageView0, Context context0, DecoderFactory decoderFactory0, Uri uri0) {
            this.viewRef = new WeakReference(subsamplingScaleImageView0);
            this.contextRef = new WeakReference(context0);
            this.decoderFactoryRef = new WeakReference(decoderFactory0);
            this.source = uri0;
        }

        @Override  // android.os.AsyncTask
        protected Object doInBackground(Object[] arr_object) {
            return this.doInBackground(((Void[])arr_object));
        }

        protected int[] doInBackground(Void[] arr_void) {
            try {
                String s = this.source.toString();
                Context context0 = (Context)this.contextRef.get();
                DecoderFactory decoderFactory0 = (DecoderFactory)this.decoderFactoryRef.get();
                SubsamplingScaleImageView subsamplingScaleImageView0 = (SubsamplingScaleImageView)this.viewRef.get();
                if(context0 != null && decoderFactory0 != null && subsamplingScaleImageView0 != null) {
                    subsamplingScaleImageView0.debug("TilesInitTask.doInBackground", new Object[0]);
                    ImageRegionDecoder imageRegionDecoder0 = (ImageRegionDecoder)decoderFactory0.make();
                    this.decoder = imageRegionDecoder0;
                    Point point0 = imageRegionDecoder0.init(context0, this.source);
                    int v = point0.x;
                    int v1 = point0.y;
                    int v2 = subsamplingScaleImageView0.getExifOrientation(context0, s);
                    if(subsamplingScaleImageView0.sRegion != null) {
                        subsamplingScaleImageView0.sRegion.left = Math.max(0, subsamplingScaleImageView0.sRegion.left);
                        subsamplingScaleImageView0.sRegion.top = Math.max(0, subsamplingScaleImageView0.sRegion.top);
                        subsamplingScaleImageView0.sRegion.right = Math.min(v, subsamplingScaleImageView0.sRegion.right);
                        subsamplingScaleImageView0.sRegion.bottom = Math.min(v1, subsamplingScaleImageView0.sRegion.bottom);
                        return new int[]{subsamplingScaleImageView0.sRegion.width(), subsamplingScaleImageView0.sRegion.height(), v2};
                    }
                    return new int[]{v, v1, v2};
                }
            }
            catch(Exception exception0) {
                Log.e("SubsamplingScaleImageView", "Failed to initialise bitmap decoder", exception0);
                this.exception = exception0;
            }
            return null;
        }

        @Override  // android.os.AsyncTask
        protected void onPostExecute(Object object0) {
            this.onPostExecute(((int[])object0));
        }

        protected void onPostExecute(int[] arr_v) {
            SubsamplingScaleImageView subsamplingScaleImageView0 = (SubsamplingScaleImageView)this.viewRef.get();
            if(subsamplingScaleImageView0 != null) {
                ImageRegionDecoder imageRegionDecoder0 = this.decoder;
                if(imageRegionDecoder0 != null && arr_v != null && arr_v.length == 3) {
                    subsamplingScaleImageView0.onTilesInited(imageRegionDecoder0, arr_v[0], arr_v[1], arr_v[2]);
                    return;
                }
                if(this.exception != null && subsamplingScaleImageView0.onImageEventListener != null) {
                    subsamplingScaleImageView0.onImageEventListener.onImageLoadError(this.exception);
                }
            }
        }
    }

    public static final int EASE_IN_OUT_QUAD = 2;
    public static final int EASE_OUT_QUAD = 1;
    private static final int MESSAGE_LONG_CLICK = 1;
    public static final int ORIENTATION_0 = 0;
    public static final int ORIENTATION_180 = 180;
    public static final int ORIENTATION_270 = 270;
    public static final int ORIENTATION_90 = 90;
    public static final int ORIENTATION_USE_EXIF = -1;
    public static final int ORIGIN_ANIM = 1;
    public static final int ORIGIN_DOUBLE_TAP_ZOOM = 4;
    public static final int ORIGIN_FLING = 3;
    public static final int ORIGIN_TOUCH = 2;
    public static final int PAN_LIMIT_CENTER = 3;
    public static final int PAN_LIMIT_INSIDE = 1;
    public static final int PAN_LIMIT_OUTSIDE = 2;
    public static final int SCALE_TYPE_CENTER_CROP = 2;
    public static final int SCALE_TYPE_CENTER_INSIDE = 1;
    public static final int SCALE_TYPE_CUSTOM = 3;
    public static final int SCALE_TYPE_START = 4;
    private static final String TAG = "SubsamplingScaleImageView";
    public static final int TILE_SIZE_AUTO = 0x7FFFFFFF;
    private static final List VALID_EASING_STYLES = null;
    private static final List VALID_ORIENTATIONS = null;
    private static final List VALID_PAN_LIMITS = null;
    private static final List VALID_SCALE_TYPES = null;
    private static final List VALID_ZOOM_STYLES = null;
    public static final int ZOOM_FOCUS_CENTER = 2;
    public static final int ZOOM_FOCUS_CENTER_IMMEDIATE = 3;
    public static final int ZOOM_FOCUS_FIXED = 1;
    private Anim anim;
    private Bitmap bitmap;
    private DecoderFactory bitmapDecoderFactory;
    private boolean bitmapIsCached;
    private boolean bitmapIsPreview;
    private Paint bitmapPaint;
    private boolean debug;
    private Paint debugLinePaint;
    private Paint debugTextPaint;
    private ImageRegionDecoder decoder;
    private final ReadWriteLock decoderLock;
    private final float density;
    private GestureDetector detector;
    private int doubleTapZoomDuration;
    private float doubleTapZoomScale;
    private int doubleTapZoomStyle;
    private final float[] dstArray;
    private boolean eagerLoadingEnabled;
    private Executor executor;
    private int fullImageSampleSize;
    private final Handler handler;
    private boolean imageLoadedSent;
    private boolean isPanning;
    private boolean isQuickScaling;
    private boolean isZooming;
    private Matrix matrix;
    private float maxScale;
    private int maxTileHeight;
    private int maxTileWidth;
    private int maxTouchCount;
    private float minScale;
    private int minimumScaleType;
    private int minimumTileDpi;
    private OnImageEventListener onImageEventListener;
    private View.OnLongClickListener onLongClickListener;
    private OnStateChangedListener onStateChangedListener;
    private int orientation;
    private Rect pRegion;
    private boolean panEnabled;
    private int panLimit;
    private Float pendingScale;
    private static Bitmap.Config preferredBitmapConfig;
    private boolean quickScaleEnabled;
    private float quickScaleLastDistance;
    private boolean quickScaleMoved;
    private PointF quickScaleSCenter;
    private final float quickScaleThreshold;
    private PointF quickScaleVLastPoint;
    private PointF quickScaleVStart;
    private boolean readySent;
    private DecoderFactory regionDecoderFactory;
    private int sHeight;
    private int sOrientation;
    private PointF sPendingCenter;
    private RectF sRect;
    private Rect sRegion;
    private PointF sRequestedCenter;
    private int sWidth;
    private ScaleAndTranslate satTemp;
    private float scale;
    private float scaleStart;
    private GestureDetector singleDetector;
    private final float[] srcArray;
    private Paint tileBgPaint;
    private Map tileMap;
    private Uri uri;
    private PointF vCenterStart;
    private float vDistStart;
    private PointF vTranslate;
    private PointF vTranslateBefore;
    private PointF vTranslateStart;
    private boolean zoomEnabled;

    static {
        SubsamplingScaleImageView.VALID_ORIENTATIONS = Arrays.asList(new Integer[]{0, 90, 180, 270, -1});
        SubsamplingScaleImageView.VALID_ZOOM_STYLES = Arrays.asList(new Integer[]{1, 2, 3});
        SubsamplingScaleImageView.VALID_EASING_STYLES = Arrays.asList(new Integer[]{2, 1});
        SubsamplingScaleImageView.VALID_PAN_LIMITS = Arrays.asList(new Integer[]{1, 2, 3});
        SubsamplingScaleImageView.VALID_SCALE_TYPES = Arrays.asList(new Integer[]{2, 1, 3, 4});
    }

    public SubsamplingScaleImageView(Context context0) {
        this(context0, null);
    }

    public SubsamplingScaleImageView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.orientation = 0;
        this.maxScale = 2.0f;
        this.minScale = this.minScale();
        this.minimumTileDpi = -1;
        this.panLimit = 1;
        this.minimumScaleType = 1;
        this.maxTileWidth = 0x7FFFFFFF;
        this.maxTileHeight = 0x7FFFFFFF;
        this.executor = AsyncTask.THREAD_POOL_EXECUTOR;
        this.eagerLoadingEnabled = true;
        this.panEnabled = true;
        this.zoomEnabled = true;
        this.quickScaleEnabled = true;
        this.doubleTapZoomScale = 1.0f;
        this.doubleTapZoomStyle = 1;
        this.doubleTapZoomDuration = 500;
        this.decoderLock = new ReentrantReadWriteLock(true);
        this.bitmapDecoderFactory = new CompatDecoderFactory(SkiaImageDecoder.class);
        this.regionDecoderFactory = new CompatDecoderFactory(SkiaImageRegionDecoder.class);
        this.srcArray = new float[8];
        this.dstArray = new float[8];
        this.density = this.getResources().getDisplayMetrics().density;
        this.setMinimumDpi(0xA0);
        this.setDoubleTapZoomDpi(0xA0);
        this.setMinimumTileDpi(320);
        this.setGestureDetector(context0);
        this.handler = new Handler(new Handler.Callback() {
            @Override  // android.os.Handler$Callback
            public boolean handleMessage(Message message0) {
                if(message0.what == 1 && SubsamplingScaleImageView.this.onLongClickListener != null) {
                    SubsamplingScaleImageView.this.maxTouchCount = 0;
                    SubsamplingScaleImageView.this.super.setOnLongClickListener(SubsamplingScaleImageView.this.onLongClickListener);
                    SubsamplingScaleImageView.this.performLongClick();
                    SubsamplingScaleImageView.this.super.setOnLongClickListener(null);
                }
                return true;
            }
        });
        if(attributeSet0 != null) {
            TypedArray typedArray0 = this.getContext().obtainStyledAttributes(attributeSet0, styleable.SubsamplingScaleImageView);
            if(typedArray0.hasValue(styleable.SubsamplingScaleImageView_assetName)) {
                String s = typedArray0.getString(0);
                if(s != null && s.length() > 0) {
                    this.setImage(ImageSource.asset(s).tilingEnabled());
                }
            }
            if(typedArray0.hasValue(styleable.SubsamplingScaleImageView_src)) {
                int v = typedArray0.getResourceId(3, 0);
                if(v > 0) {
                    this.setImage(ImageSource.resource(v).tilingEnabled());
                }
            }
            if(typedArray0.hasValue(styleable.SubsamplingScaleImageView_panEnabled)) {
                this.setPanEnabled(typedArray0.getBoolean(1, true));
            }
            if(typedArray0.hasValue(styleable.SubsamplingScaleImageView_zoomEnabled)) {
                this.setZoomEnabled(typedArray0.getBoolean(5, true));
            }
            if(typedArray0.hasValue(styleable.SubsamplingScaleImageView_quickScaleEnabled)) {
                this.setQuickScaleEnabled(typedArray0.getBoolean(2, true));
            }
            if(typedArray0.hasValue(styleable.SubsamplingScaleImageView_tileBackgroundColor)) {
                this.setTileBackgroundColor(typedArray0.getColor(4, 0));
            }
            typedArray0.recycle();
        }
        this.quickScaleThreshold = TypedValue.applyDimension(1, 20.0f, context0.getResources().getDisplayMetrics());
    }

    // 去混淆评级： 低(20)
    static String access$5400() [...] // 潜在的解密器

    @Nullable
    public AnimationBuilder animateCenter(PointF pointF0) {
        return this.isReady() ? new AnimationBuilder(this, pointF0, null) : null;
    }

    @Nullable
    public AnimationBuilder animateScale(float f) {
        return this.isReady() ? new AnimationBuilder(this, f, null) : null;
    }

    @Nullable
    public AnimationBuilder animateScaleAndCenter(float f, PointF pointF0) {
        return this.isReady() ? new AnimationBuilder(this, f, pointF0, null) : null;
    }

    private int calculateInSampleSize(float f) {
        int v3;
        if(this.minimumTileDpi > 0) {
            DisplayMetrics displayMetrics0 = this.getResources().getDisplayMetrics();
            f *= ((float)this.minimumTileDpi) / ((displayMetrics0.xdpi + displayMetrics0.ydpi) / 2.0f);
        }
        int v = 1;
        int v1 = (int)(((float)this.sWidth()) * f);
        int v2 = (int)(((float)this.sHeight()) * f);
        if(v1 != 0 && v2 != 0) {
            if(this.sHeight() > v2 || this.sWidth() > v1) {
                v3 = Math.round(((float)this.sHeight()) / ((float)v2));
                int v4 = Math.round(((float)this.sWidth()) / ((float)v1));
                if(v3 >= v4) {
                    v3 = v4;
                }
            }
            else {
                v3 = 1;
            }
            while(v * 2 < v3) {
                v *= 2;
            }
            return v;
        }
        return 0x20;
    }

    private boolean checkImageLoaded() {
        boolean z = this.isBaseLayerReady();
        if(!this.imageLoadedSent && z) {
            this.preDraw();
            this.imageLoadedSent = true;
            OnImageEventListener subsamplingScaleImageView$OnImageEventListener0 = this.onImageEventListener;
            if(subsamplingScaleImageView$OnImageEventListener0 != null) {
                subsamplingScaleImageView$OnImageEventListener0.onImageLoaded();
            }
        }
        return z;
    }

    private boolean checkReady() {
        boolean z = this.getWidth() > 0 && this.getHeight() > 0 && this.sWidth > 0 && this.sHeight > 0 && (this.bitmap != null || this.isBaseLayerReady());
        if(!this.readySent && z) {
            this.preDraw();
            this.readySent = true;
            OnImageEventListener subsamplingScaleImageView$OnImageEventListener0 = this.onImageEventListener;
            if(subsamplingScaleImageView$OnImageEventListener0 != null) {
                subsamplingScaleImageView$OnImageEventListener0.onReady();
            }
        }
        return z;
    }

    private void createPaints() {
        if(this.bitmapPaint == null) {
            Paint paint0 = new Paint();
            this.bitmapPaint = paint0;
            paint0.setAntiAlias(true);
            this.bitmapPaint.setFilterBitmap(true);
            this.bitmapPaint.setDither(true);
        }
        if((this.debugTextPaint == null || this.debugLinePaint == null) && this.debug) {
            Paint paint1 = new Paint();
            this.debugTextPaint = paint1;
            paint1.setTextSize(((float)this.px(12)));
            this.debugTextPaint.setColor(0xFFFF00FF);
            this.debugTextPaint.setStyle(Paint.Style.FILL);
            Paint paint2 = new Paint();
            this.debugLinePaint = paint2;
            paint2.setColor(0xFFFF00FF);
            this.debugLinePaint.setStyle(Paint.Style.STROKE);
            this.debugLinePaint.setStrokeWidth(((float)this.px(1)));
        }
    }

    @AnyThread
    private void debug(String s, Object[] arr_object) {
        if(this.debug) {
            Log.d("SubsamplingScaleImageView", String.format(s, arr_object));
        }
    }

    private float distance(float f, float f1, float f2, float f3) {
        return (float)Math.sqrt((f - f1) * (f - f1) + (f2 - f3) * (f2 - f3));
    }

    private void doubleTapZoom(PointF pointF0, PointF pointF1) {
        if(!this.panEnabled) {
            PointF pointF2 = this.sRequestedCenter;
            if(pointF2 == null) {
                pointF0.x = (float)(this.sWidth() / 2);
                pointF0.y = (float)(this.sHeight() / 2);
            }
            else {
                pointF0.x = pointF2.x;
                pointF0.y = pointF2.y;
            }
        }
        float f = Math.min(this.maxScale, this.doubleTapZoomScale);
        boolean z = ((double)this.scale) <= ((double)f) * 0.9 || this.scale == this.minScale;
        if(!z) {
            f = this.minScale();
        }
        int v = this.doubleTapZoomStyle;
        if(v == 3) {
            this.setScaleAndCenter(f, pointF0);
        }
        else if(v == 2 || !z || !this.panEnabled) {
            new AnimationBuilder(this, f, pointF0, null).withInterruptible(false).withDuration(((long)this.doubleTapZoomDuration)).withOrigin(4).start();
        }
        else if(v == 1) {
            new AnimationBuilder(this, f, pointF0, pointF1, null).withInterruptible(false).withDuration(((long)this.doubleTapZoomDuration)).withOrigin(4).start();
        }
        this.invalidate();
    }

    private float ease(int v, long v1, float f, float f1, long v2) {
        switch(v) {
            case 1: {
                return this.easeOutQuad(v1, f, f1, v2);
            }
            case 2: {
                return this.easeInOutQuad(v1, f, f1, v2);
            }
            default: {
                throw new IllegalStateException("Unexpected easing type: " + v);
            }
        }
    }

    private float easeInOutQuad(long v, float f, float f1, long v1) {
        float f2 = ((float)v) / (((float)v1) / 2.0f);
        return f2 < 1.0f ? f1 / 2.0f * f2 * f2 + f : -f1 / 2.0f * ((f2 - 1.0f) * (f2 - 1.0f - 2.0f) - 1.0f) + f;
    }

    private float easeOutQuad(long v, float f, float f1, long v1) {
        float f2 = ((float)v) / ((float)v1);
        return -f1 * f2 * (f2 - 2.0f) + f;
    }

    private void execute(AsyncTask asyncTask0) {
        asyncTask0.executeOnExecutor(this.executor, new Void[0]);
    }

    @AnyThread
    private void fileSRect(Rect rect0, Rect rect1) {
        switch(this.getRequiredRotation()) {
            case 0: {
                rect1.set(rect0);
                return;
            }
            case 90: {
                rect1.set(rect0.top, this.sHeight - rect0.right, rect0.bottom, this.sHeight - rect0.left);
                return;
            }
            case 180: {
                rect1.set(this.sWidth - rect0.right, this.sHeight - rect0.bottom, this.sWidth - rect0.left, this.sHeight - rect0.top);
                return;
            }
            default: {
                rect1.set(this.sWidth - rect0.bottom, rect0.left, this.sWidth - rect0.top, rect0.right);
            }
        }
    }

    private void fitToBounds(boolean z) {
        boolean z1;
        if(this.vTranslate == null) {
            this.vTranslate = new PointF(0.0f, 0.0f);
            z1 = true;
        }
        else {
            z1 = false;
        }
        if(this.satTemp == null) {
            this.satTemp = new ScaleAndTranslate(0.0f, new PointF(0.0f, 0.0f), null);
        }
        this.satTemp.scale = this.scale;
        this.satTemp.vTranslate.set(this.vTranslate);
        this.fitToBounds(z, this.satTemp);
        this.scale = this.satTemp.scale;
        this.vTranslate.set(this.satTemp.vTranslate);
        if(z1 && this.minimumScaleType != 4) {
            this.vTranslate.set(this.vTranslateForSCenter(((float)(this.sWidth() / 2)), ((float)(this.sHeight() / 2)), this.scale));
        }
    }

    private void fitToBounds(boolean z, ScaleAndTranslate subsamplingScaleImageView$ScaleAndTranslate0) {
        float f6;
        float f5;
        if(this.panLimit == 2 && this.isReady()) {
            z = false;
        }
        PointF pointF0 = subsamplingScaleImageView$ScaleAndTranslate0.vTranslate;
        float f = this.limitedScale(subsamplingScaleImageView$ScaleAndTranslate0.scale);
        float f1 = ((float)this.sWidth()) * f;
        float f2 = ((float)this.sHeight()) * f;
        if(this.panLimit == 3 && this.isReady()) {
            pointF0.x = Math.max(pointF0.x, ((float)(this.getWidth() / 2)) - f1);
            pointF0.y = Math.max(pointF0.y, ((float)(this.getHeight() / 2)) - f2);
        }
        else if(z) {
            pointF0.x = Math.max(pointF0.x, ((float)this.getWidth()) - f1);
            pointF0.y = Math.max(pointF0.y, ((float)this.getHeight()) - f2);
        }
        else {
            pointF0.x = Math.max(pointF0.x, -f1);
            pointF0.y = Math.max(pointF0.y, -f2);
        }
        float f3 = 0.5f;
        float f4 = this.getPaddingLeft() > 0 || this.getPaddingRight() > 0 ? ((float)this.getPaddingLeft()) / ((float)(this.getPaddingLeft() + this.getPaddingRight())) : 0.5f;
        if(this.getPaddingTop() > 0 || this.getPaddingBottom() > 0) {
            f3 = ((float)this.getPaddingTop()) / ((float)(this.getPaddingTop() + this.getPaddingBottom()));
        }
        if(this.panLimit == 3 && this.isReady()) {
            f5 = (float)Math.max(0, this.getWidth() / 2);
            f6 = (float)Math.max(0, this.getHeight() / 2);
        }
        else if(z) {
            f5 = Math.max(0.0f, (((float)this.getWidth()) - f1) * f4);
            f6 = Math.max(0.0f, (((float)this.getHeight()) - f2) * f3);
        }
        else {
            f5 = (float)Math.max(0, this.getWidth());
            f6 = (float)Math.max(0, this.getHeight());
        }
        pointF0.x = Math.min(pointF0.x, f5);
        pointF0.y = Math.min(pointF0.y, f6);
        subsamplingScaleImageView$ScaleAndTranslate0.scale = f;
    }

    public final int getAppliedOrientation() {
        return this.getRequiredRotation();
    }

    @Nullable
    public final PointF getCenter() {
        return this.viewToSourceCoord(((float)(this.getWidth() / 2)), ((float)(this.getHeight() / 2)));
    }

    @AnyThread
    private int getExifOrientation(Context context0, String s) {
        Cursor cursor0;
        int v = 0;
        if(s.startsWith("content")) {
            try {
                try {
                    cursor0 = null;
                    cursor0 = context0.getContentResolver().query(Uri.parse(s), new String[]{"orientation"}, null, null, null);
                    if(cursor0 != null && cursor0.moveToFirst()) {
                        int v1 = cursor0.getInt(0);
                        if(!SubsamplingScaleImageView.VALID_ORIENTATIONS.contains(v1) || v1 == -1) {
                            Log.w("SubsamplingScaleImageView", "Unsupported orientation: " + v1);
                        }
                        else {
                            v = v1;
                        }
                    }
                    goto label_17;
                }
                catch(Exception unused_ex) {
                    Log.w("SubsamplingScaleImageView", "Could not get orientation of image from media store");
                    if(cursor0 != null) {
                        goto label_18;
                    }
                }
                return v;
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(cursor0, throwable0);
                throw throwable0;
            }
        label_17:
            if(cursor0 != null) {
            label_18:
                cursor0.close();
                return v;
            }
        }
        else if(s.startsWith("file:///") && !s.startsWith("file:///android_asset/")) {
            try {
                int v2 = new ExifInterface(s.substring(7)).l("Orientation", 1);
                if(v2 != 0 && v2 != 1) {
                    switch(v2) {
                        case 3: {
                            return 180;
                        }
                        case 6: {
                            return 90;
                        }
                        case 8: {
                            return 270;
                        }
                        default: {
                            Log.w("SubsamplingScaleImageView", "Unsupported EXIF orientation: " + v2);
                            return 0;
                        }
                    }
                }
            }
            catch(Exception unused_ex) {
                Log.w("SubsamplingScaleImageView", "Could not get EXIF orientation of image");
            }
        }
        return v;
    }

    @NonNull
    private Point getMaxBitmapDimensions(Canvas canvas0) {
        return new Point(Math.min(canvas0.getMaximumBitmapWidth(), this.maxTileWidth), Math.min(canvas0.getMaximumBitmapHeight(), this.maxTileHeight));
    }

    public float getMaxScale() {
        return this.maxScale;
    }

    public final float getMinScale() {
        return this.minScale();
    }

    public final int getOrientation() {
        return this.orientation;
    }

    public final void getPanRemaining(RectF rectF0) {
        if(!this.isReady()) {
            return;
        }
        float f = this.scale * ((float)this.sWidth());
        float f1 = this.scale * ((float)this.sHeight());
        int v = this.panLimit;
        if(v == 3) {
            rectF0.top = Math.max(0.0f, -(this.vTranslate.y - ((float)(this.getHeight() / 2))));
            rectF0.left = Math.max(0.0f, -(this.vTranslate.x - ((float)(this.getWidth() / 2))));
            rectF0.bottom = Math.max(0.0f, this.vTranslate.y - (((float)(this.getHeight() / 2)) - f1));
            rectF0.right = Math.max(0.0f, this.vTranslate.x - (((float)(this.getWidth() / 2)) - f));
            return;
        }
        if(v == 2) {
            rectF0.top = Math.max(0.0f, -(this.vTranslate.y - ((float)this.getHeight())));
            rectF0.left = Math.max(0.0f, -(this.vTranslate.x - ((float)this.getWidth())));
            rectF0.bottom = Math.max(0.0f, this.vTranslate.y + f1);
            rectF0.right = Math.max(0.0f, this.vTranslate.x + f);
            return;
        }
        rectF0.top = Math.max(0.0f, -this.vTranslate.y);
        rectF0.left = Math.max(0.0f, -this.vTranslate.x);
        rectF0.bottom = Math.max(0.0f, f1 + this.vTranslate.y - ((float)this.getHeight()));
        rectF0.right = Math.max(0.0f, f + this.vTranslate.x - ((float)this.getWidth()));
    }

    public static Bitmap.Config getPreferredBitmapConfig() {
        return SubsamplingScaleImageView.preferredBitmapConfig;
    }

    @AnyThread
    private int getRequiredRotation() {
        return this.orientation == -1 ? this.sOrientation : this.orientation;
    }

    public final int getSHeight() {
        return this.sHeight;
    }

    public final int getSWidth() {
        return this.sWidth;
    }

    public final float getScale() {
        return this.scale;
    }

    @Nullable
    public final ImageViewState getState() {
        return this.vTranslate == null || this.sWidth <= 0 || this.sHeight <= 0 ? null : new ImageViewState(this.getScale(), this.getCenter(), this.getOrientation());
    }

    public boolean hasImage() {
        return this.uri != null || this.bitmap != null;
    }

    private void initialiseBaseLayer(@NonNull Point point0) {
        synchronized(this) {
            this.debug("initialiseBaseLayer maxTileDimensions=%dx%d", new Object[]{point0.x, point0.y});
            ScaleAndTranslate subsamplingScaleImageView$ScaleAndTranslate0 = new ScaleAndTranslate(0.0f, new PointF(0.0f, 0.0f), null);
            this.satTemp = subsamplingScaleImageView$ScaleAndTranslate0;
            this.fitToBounds(true, subsamplingScaleImageView$ScaleAndTranslate0);
            int v1 = this.calculateInSampleSize(this.satTemp.scale);
            this.fullImageSampleSize = v1;
            if(v1 > 1) {
                this.fullImageSampleSize = v1 / 2;
            }
            if(this.fullImageSampleSize != 1 || this.sRegion != null || this.sWidth() >= point0.x || this.sHeight() >= point0.y) {
                this.initialiseTileMap(point0);
                for(Object object0: ((List)this.tileMap.get(this.fullImageSampleSize))) {
                    this.execute(new TileLoadTask(this, this.decoder, ((Tile)object0)));
                }
                this.refreshRequiredTiles(true);
            }
            else {
                this.decoder.recycle();
                this.decoder = null;
                this.execute(new BitmapLoadTask(this, this.getContext(), this.bitmapDecoderFactory, this.uri, false));
            }
        }
    }

    private void initialiseTileMap(Point point0) {
        this.debug("initialiseTileMap maxTileDimensions=%dx%d", new Object[]{point0.x, point0.y});
        this.tileMap = new LinkedHashMap();
        int v = this.fullImageSampleSize;
        int v1 = 1;
        int v2 = 1;
        while(true) {
            int v3 = this.sWidth() / v1;
            int v4 = this.sHeight() / v2;
            int v5 = v3 / v;
            int v6 = v4 / v;
            while(v5 + v1 + 1 > point0.x || ((double)v5) > ((double)this.getWidth()) * 1.25 && v < this.fullImageSampleSize) {
                ++v1;
                v3 = this.sWidth() / v1;
                v5 = v3 / v;
            }
            while(v6 + v2 + 1 > point0.y || ((double)v6) > ((double)this.getHeight()) * 1.25 && v < this.fullImageSampleSize) {
                ++v2;
                v4 = this.sHeight() / v2;
                v6 = v4 / v;
            }
            ArrayList arrayList0 = new ArrayList(v1 * v2);
            for(int v7 = 0; v7 < v1; ++v7) {
                for(int v8 = 0; v8 < v2; ++v8) {
                    Tile subsamplingScaleImageView$Tile0 = new Tile(null);
                    subsamplingScaleImageView$Tile0.sampleSize = v;
                    subsamplingScaleImageView$Tile0.visible = v == this.fullImageSampleSize;
                    subsamplingScaleImageView$Tile0.sRect = new Rect(v7 * v3, v8 * v4, (v7 == v1 - 1 ? this.sWidth() : (v7 + 1) * v3), (v8 == v2 - 1 ? this.sHeight() : (v8 + 1) * v4));
                    subsamplingScaleImageView$Tile0.vRect = new Rect(0, 0, 0, 0);
                    subsamplingScaleImageView$Tile0.fileSRect = new Rect(subsamplingScaleImageView$Tile0.sRect);
                    arrayList0.add(subsamplingScaleImageView$Tile0);
                }
            }
            this.tileMap.put(v, arrayList0);
            if(v == 1) {
                break;
            }
            v /= 2;
        }
    }

    private boolean isBaseLayerReady() {
        boolean z = true;
        if(this.bitmap != null && !this.bitmapIsPreview) {
            return true;
        }
        Map map0 = this.tileMap;
        if(map0 != null) {
            for(Object object0: map0.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                if(((int)(((Integer)map$Entry0.getKey()))) == this.fullImageSampleSize) {
                    for(Object object1: ((List)map$Entry0.getValue())) {
                        if(((Tile)object1).loading || ((Tile)object1).bitmap == null) {
                            z = false;
                        }
                    }
                }
            }
            return z;
        }
        return false;
    }

    public final boolean isImageLoaded() {
        return this.imageLoadedSent;
    }

    public final boolean isPanEnabled() {
        return this.panEnabled;
    }

    public final boolean isQuickScaleEnabled() {
        return this.quickScaleEnabled;
    }

    public final boolean isReady() {
        return this.readySent;
    }

    public final boolean isZoomEnabled() {
        return this.zoomEnabled;
    }

    @NonNull
    private PointF limitedSCenter(float f, float f1, float f2, @NonNull PointF pointF0) {
        PointF pointF1 = this.vTranslateForSCenter(f, f1, f2);
        int v = this.getPaddingLeft();
        int v1 = this.getWidth();
        int v2 = this.getPaddingRight();
        int v3 = this.getPaddingLeft();
        int v4 = this.getPaddingTop();
        int v5 = this.getHeight();
        int v6 = this.getPaddingBottom();
        int v7 = this.getPaddingTop();
        pointF0.set((((float)(v + (v1 - v2 - v3) / 2)) - pointF1.x) / f2, (((float)(v4 + (v5 - v6 - v7) / 2)) - pointF1.y) / f2);
        return pointF0;
    }

    private float limitedScale(float f) {
        float f1 = Math.max(this.minScale(), f);
        return Math.min(this.maxScale, f1);
    }

    private float minScale() {
        int v = this.getPaddingBottom() + this.getPaddingTop();
        int v1 = this.getPaddingLeft() + this.getPaddingRight();
        switch(this.minimumScaleType) {
            case 3: {
                return this.minScale > 0.0f ? this.minScale : Math.min(((float)(this.getWidth() - v1)) / ((float)this.sWidth()), ((float)(this.getHeight() - v)) / ((float)this.sHeight()));
            }
            case 2: 
            case 4: {
                return Math.max(((float)(this.getWidth() - v1)) / ((float)this.sWidth()), ((float)(this.getHeight() - v)) / ((float)this.sHeight()));
            }
            default: {
                return Math.min(((float)(this.getWidth() - v1)) / ((float)this.sWidth()), ((float)(this.getHeight() - v)) / ((float)this.sHeight()));
            }
        }
    }

    @Override  // android.view.View
    protected void onDraw(Canvas canvas0) {
        float f8;
        super.onDraw(canvas0);
        this.createPaints();
        if(this.sWidth != 0 && this.sHeight != 0 && this.getWidth() != 0 && this.getHeight() != 0) {
            if(this.tileMap == null && this.decoder != null) {
                this.initialiseBaseLayer(this.getMaxBitmapDimensions(canvas0));
            }
            if(!this.checkReady()) {
                return;
            }
            this.preDraw();
            if(this.anim != null && this.anim.vFocusStart != null) {
                float f = this.scale;
                if(this.vTranslateBefore == null) {
                    this.vTranslateBefore = new PointF(0.0f, 0.0f);
                }
                this.vTranslateBefore.set(this.vTranslate);
                long v = System.currentTimeMillis() - this.anim.time;
                boolean z = v > this.anim.duration;
                long v1 = Math.min(v, this.anim.duration);
                this.scale = this.ease(this.anim.easing, v1, this.anim.scaleStart, this.anim.scaleEnd - this.anim.scaleStart, this.anim.duration);
                float f1 = this.ease(this.anim.easing, v1, this.anim.vFocusStart.x, this.anim.vFocusEnd.x - this.anim.vFocusStart.x, this.anim.duration);
                float f2 = this.ease(this.anim.easing, v1, this.anim.vFocusStart.y, this.anim.vFocusEnd.y - this.anim.vFocusStart.y, this.anim.duration);
                this.vTranslate.x -= this.sourceToViewX(this.anim.sCenterEnd.x) - f1;
                this.vTranslate.y -= this.sourceToViewY(this.anim.sCenterEnd.y) - f2;
                this.fitToBounds(z || this.anim.scaleStart == this.anim.scaleEnd);
                this.sendStateChanged(f, this.vTranslateBefore, this.anim.origin);
                this.refreshRequiredTiles(z);
                if(z) {
                    if(this.anim.listener != null) {
                        try {
                            this.anim.listener.onComplete();
                        }
                        catch(Exception exception0) {
                            Log.w("SubsamplingScaleImageView", "Error thrown by animation listener", exception0);
                        }
                    }
                    this.anim = null;
                }
                this.invalidate();
            }
            if(this.tileMap == null || !this.isBaseLayerReady()) {
                Bitmap bitmap0 = this.bitmap;
                if(bitmap0 != null) {
                    float f7 = this.scale;
                    if(this.bitmapIsPreview) {
                        f7 *= ((float)this.sWidth) / ((float)bitmap0.getWidth());
                        f8 = this.scale * (((float)this.sHeight) / ((float)this.bitmap.getHeight()));
                    }
                    else {
                        f8 = f7;
                    }
                    if(this.matrix == null) {
                        this.matrix = new Matrix();
                    }
                    this.matrix.reset();
                    this.matrix.postScale(f7, f8);
                    this.matrix.postRotate(((float)this.getRequiredRotation()));
                    this.matrix.postTranslate(this.vTranslate.x, this.vTranslate.y);
                    if(this.getRequiredRotation() == 180) {
                        this.matrix.postTranslate(((float)this.sWidth) * this.scale, this.scale * ((float)this.sHeight));
                    }
                    else {
                        switch(this.getRequiredRotation()) {
                            case 90: {
                                this.matrix.postTranslate(this.scale * ((float)this.sHeight), 0.0f);
                                break;
                            }
                            case 270: {
                                this.matrix.postTranslate(0.0f, this.scale * ((float)this.sWidth));
                            }
                        }
                    }
                    if(this.tileBgPaint != null) {
                        if(this.sRect == null) {
                            this.sRect = new RectF();
                        }
                        this.sRect.set(0.0f, 0.0f, ((float)(this.bitmapIsPreview ? this.bitmap.getWidth() : this.sWidth)), ((float)(this.bitmapIsPreview ? this.bitmap.getHeight() : this.sHeight)));
                        this.matrix.mapRect(this.sRect);
                        canvas0.drawRect(this.sRect, this.tileBgPaint);
                    }
                    canvas0.drawBitmap(this.bitmap, this.matrix, this.bitmapPaint);
                }
            }
            else {
                int v2 = Math.min(this.fullImageSampleSize, this.calculateInSampleSize(this.scale));
                boolean z1 = false;
                for(Object object0: this.tileMap.entrySet()) {
                    Map.Entry map$Entry0 = (Map.Entry)object0;
                    if(((int)(((Integer)map$Entry0.getKey()))) == v2) {
                        for(Object object1: ((List)map$Entry0.getValue())) {
                            Tile subsamplingScaleImageView$Tile0 = (Tile)object1;
                            if(subsamplingScaleImageView$Tile0.visible && (subsamplingScaleImageView$Tile0.loading || subsamplingScaleImageView$Tile0.bitmap == null)) {
                                z1 = true;
                            }
                        }
                    }
                }
                for(Object object2: this.tileMap.entrySet()) {
                    Map.Entry map$Entry1 = (Map.Entry)object2;
                    if(((int)(((Integer)map$Entry1.getKey()))) == v2 || z1) {
                        for(Object object3: ((List)map$Entry1.getValue())) {
                            Tile subsamplingScaleImageView$Tile1 = (Tile)object3;
                            this.sourceToViewRect(subsamplingScaleImageView$Tile1.sRect, subsamplingScaleImageView$Tile1.vRect);
                            if(!subsamplingScaleImageView$Tile1.loading && subsamplingScaleImageView$Tile1.bitmap != null) {
                                if(this.tileBgPaint != null) {
                                    canvas0.drawRect(subsamplingScaleImageView$Tile1.vRect, this.tileBgPaint);
                                }
                                if(this.matrix == null) {
                                    this.matrix = new Matrix();
                                }
                                this.matrix.reset();
                                float f3 = (float)subsamplingScaleImageView$Tile1.bitmap.getWidth();
                                float f4 = (float)subsamplingScaleImageView$Tile1.bitmap.getWidth();
                                float f5 = (float)subsamplingScaleImageView$Tile1.bitmap.getHeight();
                                float f6 = (float)subsamplingScaleImageView$Tile1.bitmap.getHeight();
                                this.setMatrixArray(this.srcArray, 0.0f, 0.0f, f3, 0.0f, f4, f5, 0.0f, f6);
                                if(this.getRequiredRotation() == 0) {
                                    this.setMatrixArray(this.dstArray, ((float)subsamplingScaleImageView$Tile1.vRect.left), ((float)subsamplingScaleImageView$Tile1.vRect.top), ((float)subsamplingScaleImageView$Tile1.vRect.right), ((float)subsamplingScaleImageView$Tile1.vRect.top), ((float)subsamplingScaleImageView$Tile1.vRect.right), ((float)subsamplingScaleImageView$Tile1.vRect.bottom), ((float)subsamplingScaleImageView$Tile1.vRect.left), ((float)subsamplingScaleImageView$Tile1.vRect.bottom));
                                }
                                else {
                                    switch(this.getRequiredRotation()) {
                                        case 90: {
                                            this.setMatrixArray(this.dstArray, ((float)subsamplingScaleImageView$Tile1.vRect.right), ((float)subsamplingScaleImageView$Tile1.vRect.top), ((float)subsamplingScaleImageView$Tile1.vRect.right), ((float)subsamplingScaleImageView$Tile1.vRect.bottom), ((float)subsamplingScaleImageView$Tile1.vRect.left), ((float)subsamplingScaleImageView$Tile1.vRect.bottom), ((float)subsamplingScaleImageView$Tile1.vRect.left), ((float)subsamplingScaleImageView$Tile1.vRect.top));
                                            break;
                                        }
                                        case 180: {
                                            this.setMatrixArray(this.dstArray, ((float)subsamplingScaleImageView$Tile1.vRect.right), ((float)subsamplingScaleImageView$Tile1.vRect.bottom), ((float)subsamplingScaleImageView$Tile1.vRect.left), ((float)subsamplingScaleImageView$Tile1.vRect.bottom), ((float)subsamplingScaleImageView$Tile1.vRect.left), ((float)subsamplingScaleImageView$Tile1.vRect.top), ((float)subsamplingScaleImageView$Tile1.vRect.right), ((float)subsamplingScaleImageView$Tile1.vRect.top));
                                            break;
                                        }
                                        case 270: {
                                            this.setMatrixArray(this.dstArray, ((float)subsamplingScaleImageView$Tile1.vRect.left), ((float)subsamplingScaleImageView$Tile1.vRect.bottom), ((float)subsamplingScaleImageView$Tile1.vRect.left), ((float)subsamplingScaleImageView$Tile1.vRect.top), ((float)subsamplingScaleImageView$Tile1.vRect.right), ((float)subsamplingScaleImageView$Tile1.vRect.top), ((float)subsamplingScaleImageView$Tile1.vRect.right), ((float)subsamplingScaleImageView$Tile1.vRect.bottom));
                                        }
                                    }
                                }
                                this.matrix.setPolyToPoly(this.srcArray, 0, this.dstArray, 0, 4);
                                canvas0.drawBitmap(subsamplingScaleImageView$Tile1.bitmap, this.matrix, this.bitmapPaint);
                                if(this.debug) {
                                    canvas0.drawRect(subsamplingScaleImageView$Tile1.vRect, this.debugLinePaint);
                                }
                            }
                            else if(subsamplingScaleImageView$Tile1.loading && this.debug) {
                                canvas0.drawText("LOADING", ((float)(subsamplingScaleImageView$Tile1.vRect.left + this.px(5))), ((float)(subsamplingScaleImageView$Tile1.vRect.top + this.px(35))), this.debugTextPaint);
                            }
                            if(subsamplingScaleImageView$Tile1.visible && this.debug) {
                                canvas0.drawText("ISS " + subsamplingScaleImageView$Tile1.sampleSize + " RECT " + subsamplingScaleImageView$Tile1.sRect.top + "," + subsamplingScaleImageView$Tile1.sRect.left + "," + subsamplingScaleImageView$Tile1.sRect.bottom + "," + subsamplingScaleImageView$Tile1.sRect.right, ((float)(subsamplingScaleImageView$Tile1.vRect.left + this.px(5))), ((float)(subsamplingScaleImageView$Tile1.vRect.top + this.px(15))), this.debugTextPaint);
                            }
                        }
                    }
                }
            }
            if(this.debug) {
                Locale locale0 = Locale.ENGLISH;
                canvas0.drawText("Scale: " + String.format(locale0, "%.2f", this.scale) + " (" + String.format(locale0, "%.2f", this.minScale()) + " - " + String.format(locale0, "%.2f", this.maxScale) + ")", ((float)this.px(5)), ((float)this.px(15)), this.debugTextPaint);
                canvas0.drawText("Translate: " + String.format(locale0, "%.2f", this.vTranslate.x) + ":" + String.format(locale0, "%.2f", this.vTranslate.y), ((float)this.px(5)), ((float)this.px(30)), this.debugTextPaint);
                PointF pointF0 = this.getCenter();
                canvas0.drawText("Source center: " + String.format(locale0, "%.2f", pointF0.x) + ":" + String.format(locale0, "%.2f", pointF0.y), ((float)this.px(5)), ((float)this.px(45)), this.debugTextPaint);
                Anim subsamplingScaleImageView$Anim0 = this.anim;
                if(subsamplingScaleImageView$Anim0 != null) {
                    PointF pointF1 = this.sourceToViewCoord(subsamplingScaleImageView$Anim0.sCenterStart);
                    PointF pointF2 = this.sourceToViewCoord(this.anim.sCenterEndRequested);
                    PointF pointF3 = this.sourceToViewCoord(this.anim.sCenterEnd);
                    canvas0.drawCircle(pointF1.x, pointF1.y, ((float)this.px(10)), this.debugLinePaint);
                    this.debugLinePaint.setColor(0xFFFF0000);
                    canvas0.drawCircle(pointF2.x, pointF2.y, ((float)this.px(20)), this.debugLinePaint);
                    this.debugLinePaint.setColor(0xFF0000FF);
                    canvas0.drawCircle(pointF3.x, pointF3.y, ((float)this.px(25)), this.debugLinePaint);
                    this.debugLinePaint.setColor(0xFF00FFFF);
                    canvas0.drawCircle(((float)(this.getWidth() / 2)), ((float)(this.getHeight() / 2)), ((float)this.px(30)), this.debugLinePaint);
                }
                if(this.vCenterStart != null) {
                    this.debugLinePaint.setColor(0xFFFF0000);
                    canvas0.drawCircle(this.vCenterStart.x, this.vCenterStart.y, ((float)this.px(20)), this.debugLinePaint);
                }
                if(this.quickScaleSCenter != null) {
                    this.debugLinePaint.setColor(0xFF0000FF);
                    canvas0.drawCircle(this.sourceToViewX(this.quickScaleSCenter.x), this.sourceToViewY(this.quickScaleSCenter.y), ((float)this.px(35)), this.debugLinePaint);
                }
                if(this.quickScaleVStart != null && this.isQuickScaling) {
                    this.debugLinePaint.setColor(0xFF00FFFF);
                    canvas0.drawCircle(this.quickScaleVStart.x, this.quickScaleVStart.y, ((float)this.px(30)), this.debugLinePaint);
                }
                this.debugLinePaint.setColor(0xFFFF00FF);
            }
        }
    }

    private void onImageLoaded(Bitmap bitmap0, int v, boolean z) {
        synchronized(this) {
            this.debug("onImageLoaded", new Object[0]);
            if(this.sWidth > 0 && this.sHeight > 0 && (this.sWidth != bitmap0.getWidth() || this.sHeight != bitmap0.getHeight())) {
                this.reset(false);
            }
            Bitmap bitmap1 = this.bitmap;
            if(bitmap1 != null && !this.bitmapIsCached) {
                bitmap1.recycle();
            }
            if(this.bitmap != null && this.bitmapIsCached) {
                OnImageEventListener subsamplingScaleImageView$OnImageEventListener0 = this.onImageEventListener;
                if(subsamplingScaleImageView$OnImageEventListener0 != null) {
                    subsamplingScaleImageView$OnImageEventListener0.onPreviewReleased();
                }
            }
            this.bitmapIsPreview = false;
            this.bitmapIsCached = z;
            this.bitmap = bitmap0;
            this.sWidth = bitmap0.getWidth();
            this.sHeight = bitmap0.getHeight();
            this.sOrientation = v;
            if(this.checkReady() || this.checkImageLoaded()) {
                this.invalidate();
                this.requestLayout();
            }
        }
    }

    protected void onImageLoaded() {
    }

    @Override  // android.view.View
    protected void onMeasure(int v, int v1) {
        int v2 = View.MeasureSpec.getMode(v);
        int v3 = View.MeasureSpec.getMode(v1);
        int v4 = View.MeasureSpec.getSize(v);
        int v5 = View.MeasureSpec.getSize(v1);
        if(this.sWidth > 0 && this.sHeight > 0) {
            if(v2 != 0x40000000 && v3 != 0x40000000) {
                v4 = this.sWidth();
                v5 = this.sHeight();
            }
            else if(v3 != 0x40000000) {
                v5 = (int)(((double)this.sHeight()) / ((double)this.sWidth()) * ((double)v4));
            }
            else if(v2 != 0x40000000) {
                v4 = (int)(((double)this.sWidth()) / ((double)this.sHeight()) * ((double)v5));
            }
        }
        this.setMeasuredDimension(Math.max(v4, this.getSuggestedMinimumWidth()), Math.max(v5, this.getSuggestedMinimumHeight()));
    }

    private void onPreviewLoaded(Bitmap bitmap0) {
        synchronized(this) {
            this.debug("onPreviewLoaded", new Object[0]);
            if(this.bitmap == null && !this.imageLoadedSent) {
                Rect rect0 = this.pRegion;
                this.bitmap = rect0 == null ? bitmap0 : Bitmap.createBitmap(bitmap0, rect0.left, rect0.top, rect0.width(), this.pRegion.height());
                this.bitmapIsPreview = true;
                if(this.checkReady()) {
                    this.invalidate();
                    this.requestLayout();
                }
                return;
            }
            bitmap0.recycle();
        }
    }

    protected void onReady() {
    }

    @Override  // android.view.View
    protected void onSizeChanged(int v, int v1, int v2, int v3) {
        this.debug("onSizeChanged %dx%d -> %dx%d", new Object[]{v2, v3, v, v1});
        PointF pointF0 = this.getCenter();
        if(this.readySent && pointF0 != null) {
            this.anim = null;
            this.pendingScale = this.scale;
            this.sPendingCenter = pointF0;
        }
    }

    private void onTileLoaded() {
        synchronized(this) {
            this.debug("onTileLoaded", new Object[0]);
            this.checkReady();
            this.checkImageLoaded();
            if(this.isBaseLayerReady()) {
                Bitmap bitmap0 = this.bitmap;
                if(bitmap0 != null) {
                    if(!this.bitmapIsCached) {
                        bitmap0.recycle();
                    }
                    this.bitmap = null;
                    OnImageEventListener subsamplingScaleImageView$OnImageEventListener0 = this.onImageEventListener;
                    if(subsamplingScaleImageView$OnImageEventListener0 != null && this.bitmapIsCached) {
                        subsamplingScaleImageView$OnImageEventListener0.onPreviewReleased();
                    }
                    this.bitmapIsPreview = false;
                    this.bitmapIsCached = false;
                }
            }
            this.invalidate();
        }
    }

    private void onTilesInited(ImageRegionDecoder imageRegionDecoder0, int v, int v1, int v2) {
        synchronized(this) {
            this.debug("onTilesInited sWidth=%d, sHeight=%d, sOrientation=%d", new Object[]{v, v1, this.orientation});
            if(this.sWidth > 0 && (this.sHeight > 0 && (this.sWidth != v || this.sHeight != v1))) {
                this.reset(false);
                Bitmap bitmap0 = this.bitmap;
                if(bitmap0 != null) {
                    if(!this.bitmapIsCached) {
                        bitmap0.recycle();
                    }
                    this.bitmap = null;
                    OnImageEventListener subsamplingScaleImageView$OnImageEventListener0 = this.onImageEventListener;
                    if(subsamplingScaleImageView$OnImageEventListener0 != null && this.bitmapIsCached) {
                        subsamplingScaleImageView$OnImageEventListener0.onPreviewReleased();
                    }
                    this.bitmapIsPreview = false;
                    this.bitmapIsCached = false;
                }
            }
            this.decoder = imageRegionDecoder0;
            this.sWidth = v;
            this.sHeight = v1;
            this.sOrientation = v2;
            this.checkReady();
            if(!this.checkImageLoaded() && (this.maxTileWidth > 0 && this.maxTileWidth != 0x7FFFFFFF) && (this.maxTileHeight > 0 && this.maxTileHeight != 0x7FFFFFFF && this.getWidth() > 0 && this.getHeight() > 0)) {
                this.initialiseBaseLayer(new Point(this.maxTileWidth, this.maxTileHeight));
            }
            this.invalidate();
            this.requestLayout();
        }
    }

    @Override  // android.view.View
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent0) {
        if(this.anim != null && !this.anim.interruptible) {
            this.requestDisallowInterceptTouchEvent(true);
            return true;
        }
        if(this.anim != null && this.anim.listener != null) {
            try {
                this.anim.listener.onInterruptedByUser();
            }
            catch(Exception exception0) {
                Log.w("SubsamplingScaleImageView", "Error thrown by animation listener", exception0);
            }
        }
        this.anim = null;
        if(this.vTranslate == null) {
            GestureDetector gestureDetector0 = this.singleDetector;
            if(gestureDetector0 != null) {
                gestureDetector0.onTouchEvent(motionEvent0);
            }
            return true;
        }
        if(!this.isQuickScaling && (this.detector == null || this.detector.onTouchEvent(motionEvent0))) {
            this.isZooming = false;
            this.isPanning = false;
            this.maxTouchCount = 0;
            return true;
        }
        if(this.vTranslateStart == null) {
            this.vTranslateStart = new PointF(0.0f, 0.0f);
        }
        if(this.vTranslateBefore == null) {
            this.vTranslateBefore = new PointF(0.0f, 0.0f);
        }
        if(this.vCenterStart == null) {
            this.vCenterStart = new PointF(0.0f, 0.0f);
        }
        float f = this.scale;
        this.vTranslateBefore.set(this.vTranslate);
        boolean z = this.onTouchEventInternal(motionEvent0);
        this.sendStateChanged(f, this.vTranslateBefore, 2);
        return z || super.onTouchEvent(motionEvent0);
    }

    private boolean onTouchEventInternal(@NonNull MotionEvent motionEvent0) {
        int v = motionEvent0.getPointerCount();
        boolean z = false;
        switch(motionEvent0.getAction()) {
            case 2: {
                if(this.maxTouchCount > 0) {
                    if(v >= 2) {
                        float f1 = this.distance(motionEvent0.getX(0), motionEvent0.getX(1), motionEvent0.getY(0), motionEvent0.getY(1));
                        float f2 = (motionEvent0.getX(0) + motionEvent0.getX(1)) / 2.0f;
                        float f3 = (motionEvent0.getY(0) + motionEvent0.getY(1)) / 2.0f;
                        if(this.zoomEnabled && (this.distance(this.vCenterStart.x, f2, this.vCenterStart.y, f3) > 5.0f || Math.abs(f1 - this.vDistStart) > 5.0f || this.isPanning)) {
                            this.isZooming = true;
                            this.isPanning = true;
                            double f4 = (double)this.scale;
                            float f5 = Math.min(this.maxScale, f1 / this.vDistStart * this.scaleStart);
                            this.scale = f5;
                            if(f5 <= this.minScale()) {
                                this.vDistStart = f1;
                                this.scaleStart = this.minScale();
                                this.vCenterStart.set(f2, f3);
                                this.vTranslateStart.set(this.vTranslate);
                            }
                            else if(this.panEnabled) {
                                float f6 = this.vCenterStart.y - this.vTranslateStart.y;
                                float f7 = this.scale;
                                float f8 = this.scaleStart;
                                PointF pointF0 = this.vTranslate;
                                pointF0.x = f2 - (this.vCenterStart.x - this.vTranslateStart.x) * (f7 / f8);
                                pointF0.y = f3 - f6 * (f7 / f8);
                                if(((double)this.sHeight()) * f4 < ((double)this.getHeight()) && this.scale * ((float)this.sHeight()) >= ((float)this.getHeight()) || f4 * ((double)this.sWidth()) < ((double)this.getWidth()) && this.scale * ((float)this.sWidth()) >= ((float)this.getWidth())) {
                                    this.fitToBounds(true);
                                    this.vCenterStart.set(f2, f3);
                                    this.vTranslateStart.set(this.vTranslate);
                                    this.scaleStart = this.scale;
                                    this.vDistStart = f1;
                                }
                            }
                            else if(this.sRequestedCenter == null) {
                                PointF pointF3 = this.vTranslate;
                                pointF3.x = ((float)(this.getWidth() / 2)) - this.scale * ((float)(this.sWidth() / 2));
                                PointF pointF4 = this.vTranslate;
                                pointF4.y = ((float)(this.getHeight() / 2)) - this.scale * ((float)(this.sHeight() / 2));
                            }
                            else {
                                PointF pointF1 = this.vTranslate;
                                pointF1.x = ((float)(this.getWidth() / 2)) - this.scale * this.sRequestedCenter.x;
                                PointF pointF2 = this.vTranslate;
                                pointF2.y = ((float)(this.getHeight() / 2)) - this.scale * this.sRequestedCenter.y;
                            }
                            this.fitToBounds(true);
                            this.refreshRequiredTiles(this.eagerLoadingEnabled);
                            this.handler.removeMessages(1);
                            this.invalidate();
                            return true;
                        }
                    }
                    else {
                        if(this.isQuickScaling) {
                            float f9 = Math.abs(this.quickScaleVStart.y - motionEvent0.getY()) * 2.0f + this.quickScaleThreshold;
                            if(this.quickScaleLastDistance == -1.0f) {
                                this.quickScaleLastDistance = f9;
                            }
                            float f10 = motionEvent0.getY();
                            PointF pointF5 = this.quickScaleVLastPoint;
                            if(f10 > pointF5.y) {
                                z = true;
                            }
                            pointF5.set(0.0f, motionEvent0.getY());
                            float f11 = 1.0f;
                            float f12 = Math.abs(1.0f - f9 / this.quickScaleLastDistance);
                            if(f12 * 0.5f > 0.03f || this.quickScaleMoved) {
                                this.quickScaleMoved = true;
                                if(this.quickScaleLastDistance > 0.0f) {
                                    f11 = z ? f12 * 0.5f + 1.0f : 1.0f - f12 * 0.5f;
                                }
                                double f13 = (double)this.scale;
                                float f14 = Math.max(this.minScale(), Math.min(this.maxScale, this.scale * f11));
                                this.scale = f14;
                                if(this.panEnabled) {
                                    float f15 = this.vCenterStart.y;
                                    float f16 = f15 - this.vTranslateStart.y;
                                    float f17 = this.scaleStart;
                                    PointF pointF6 = this.vTranslate;
                                    pointF6.x = this.vCenterStart.x - (this.vCenterStart.x - this.vTranslateStart.x) * (f14 / f17);
                                    pointF6.y = f15 - f16 * (f14 / f17);
                                    if(((double)this.sHeight()) * f13 < ((double)this.getHeight()) && this.scale * ((float)this.sHeight()) >= ((float)this.getHeight()) || f13 * ((double)this.sWidth()) < ((double)this.getWidth()) && this.scale * ((float)this.sWidth()) >= ((float)this.getWidth())) {
                                        this.fitToBounds(true);
                                        this.vCenterStart.set(this.sourceToViewCoord(this.quickScaleSCenter));
                                        this.vTranslateStart.set(this.vTranslate);
                                        this.scaleStart = this.scale;
                                        f9 = 0.0f;
                                    }
                                }
                                else if(this.sRequestedCenter == null) {
                                    PointF pointF9 = this.vTranslate;
                                    pointF9.x = ((float)(this.getWidth() / 2)) - this.scale * ((float)(this.sWidth() / 2));
                                    PointF pointF10 = this.vTranslate;
                                    pointF10.y = ((float)(this.getHeight() / 2)) - this.scale * ((float)(this.sHeight() / 2));
                                }
                                else {
                                    PointF pointF7 = this.vTranslate;
                                    pointF7.x = ((float)(this.getWidth() / 2)) - this.scale * this.sRequestedCenter.x;
                                    PointF pointF8 = this.vTranslate;
                                    pointF8.y = ((float)(this.getHeight() / 2)) - this.scale * this.sRequestedCenter.y;
                                }
                            }
                            this.quickScaleLastDistance = f9;
                            this.fitToBounds(true);
                            this.refreshRequiredTiles(this.eagerLoadingEnabled);
                            this.handler.removeMessages(1);
                            this.invalidate();
                            return true;
                        }
                        if(!this.isZooming) {
                            float f18 = Math.abs(motionEvent0.getX() - this.vCenterStart.x);
                            float f19 = Math.abs(motionEvent0.getY() - this.vCenterStart.y);
                            float f20 = this.density * 5.0f;
                            int v1 = Float.compare(f18, f20);
                            if(v1 > 0 || f19 > f20 || this.isPanning) {
                                PointF pointF11 = this.vTranslate;
                                pointF11.x = this.vTranslateStart.x + (motionEvent0.getX() - this.vCenterStart.x);
                                PointF pointF12 = this.vTranslate;
                                pointF12.y = this.vTranslateStart.y + (motionEvent0.getY() - this.vCenterStart.y);
                                float f21 = this.vTranslate.x;
                                float f22 = this.vTranslate.y;
                                this.fitToBounds(true);
                                boolean z2 = f21 != this.vTranslate.x;
                                boolean z3 = f22 != this.vTranslate.y;
                                if((!z2 || f18 <= f19 || this.isPanning) && (!z3 || f19 <= f18 || this.isPanning) && (!z2 || !z3 || f22 == this.vTranslate.y && f19 > 3.0f * f20 || this.isPanning)) {
                                    this.isPanning = true;
                                }
                                else if(v1 > 0 || f19 > f20) {
                                    this.maxTouchCount = 0;
                                    this.handler.removeMessages(1);
                                    this.requestDisallowInterceptTouchEvent(false);
                                }
                                if(!this.panEnabled) {
                                    this.vTranslate.x = this.vTranslateStart.x;
                                    this.vTranslate.y = this.vTranslateStart.y;
                                    this.requestDisallowInterceptTouchEvent(false);
                                }
                                this.refreshRequiredTiles(this.eagerLoadingEnabled);
                                this.handler.removeMessages(1);
                                this.invalidate();
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
            case 0: 
            case 5: 
            case 0x105: {
                this.anim = null;
                this.requestDisallowInterceptTouchEvent(true);
                this.maxTouchCount = Math.max(this.maxTouchCount, v);
                if(v >= 2) {
                    if(this.zoomEnabled) {
                        float f = this.distance(motionEvent0.getX(0), motionEvent0.getX(1), motionEvent0.getY(0), motionEvent0.getY(1));
                        this.scaleStart = this.scale;
                        this.vDistStart = f;
                        this.vTranslateStart.set(this.vTranslate.x, this.vTranslate.y);
                        this.vCenterStart.set((motionEvent0.getX(0) + motionEvent0.getX(1)) / 2.0f, (motionEvent0.getY(0) + motionEvent0.getY(1)) / 2.0f);
                    }
                    else {
                        this.maxTouchCount = 0;
                    }
                    this.handler.removeMessages(1);
                    return true;
                }
                if(!this.isQuickScaling) {
                    this.vTranslateStart.set(this.vTranslate.x, this.vTranslate.y);
                    this.vCenterStart.set(motionEvent0.getX(), motionEvent0.getY());
                    this.handler.sendEmptyMessageDelayed(1, 600L);
                }
                return true;
            }
            case 1: 
            case 6: 
            case 0x106: {
                this.handler.removeMessages(1);
                if(this.isQuickScaling) {
                    this.isQuickScaling = false;
                    if(!this.quickScaleMoved) {
                        this.doubleTapZoom(this.quickScaleSCenter, this.vCenterStart);
                    }
                }
                if(this.maxTouchCount > 0) {
                    boolean z1 = this.isZooming;
                    if(z1 || this.isPanning) {
                        if(z1 && v == 2) {
                            this.isPanning = true;
                            this.vTranslateStart.set(this.vTranslate.x, this.vTranslate.y);
                            if(motionEvent0.getActionIndex() == 1) {
                                this.vCenterStart.set(motionEvent0.getX(0), motionEvent0.getY(0));
                            }
                            else {
                                this.vCenterStart.set(motionEvent0.getX(1), motionEvent0.getY(1));
                            }
                        }
                        if(v < 3) {
                            this.isZooming = false;
                        }
                        if(v < 2) {
                            this.isPanning = false;
                            this.maxTouchCount = 0;
                        }
                        this.refreshRequiredTiles(true);
                        return true;
                    }
                }
                if(v == 1) {
                    this.isZooming = false;
                    this.isPanning = false;
                    this.maxTouchCount = 0;
                }
                return true;
            }
            default: {
                return false;
            }
        }
    }

    private void preDraw() {
        if(this.getWidth() != 0 && this.getHeight() != 0 && this.sWidth > 0 && this.sHeight > 0) {
            if(this.sPendingCenter != null) {
                Float float0 = this.pendingScale;
                if(float0 != null) {
                    this.scale = (float)float0;
                    if(this.vTranslate == null) {
                        this.vTranslate = new PointF();
                    }
                    PointF pointF0 = this.vTranslate;
                    pointF0.x = ((float)(this.getWidth() / 2)) - this.scale * this.sPendingCenter.x;
                    PointF pointF1 = this.vTranslate;
                    pointF1.y = ((float)(this.getHeight() / 2)) - this.scale * this.sPendingCenter.y;
                    this.sPendingCenter = null;
                    this.pendingScale = null;
                    this.fitToBounds(true);
                    this.refreshRequiredTiles(true);
                }
            }
            this.fitToBounds(false);
        }
    }

    private int px(int v) {
        return (int)(this.density * ((float)v));
    }

    public void recycle() {
        this.reset(true);
        this.bitmapPaint = null;
        this.debugTextPaint = null;
        this.debugLinePaint = null;
        this.tileBgPaint = null;
    }

    private void refreshRequiredTiles(boolean z) {
        if(this.decoder != null && this.tileMap != null) {
            int v = Math.min(this.fullImageSampleSize, this.calculateInSampleSize(this.scale));
            for(Object object0: this.tileMap.entrySet()) {
                for(Object object1: ((List)((Map.Entry)object0).getValue())) {
                    Tile subsamplingScaleImageView$Tile0 = (Tile)object1;
                    if(subsamplingScaleImageView$Tile0.sampleSize < v || subsamplingScaleImageView$Tile0.sampleSize > v && subsamplingScaleImageView$Tile0.sampleSize != this.fullImageSampleSize) {
                        subsamplingScaleImageView$Tile0.visible = false;
                        if(subsamplingScaleImageView$Tile0.bitmap != null) {
                            subsamplingScaleImageView$Tile0.bitmap.recycle();
                            subsamplingScaleImageView$Tile0.bitmap = null;
                        }
                    }
                    if(subsamplingScaleImageView$Tile0.sampleSize == v) {
                        if(this.tileVisible(subsamplingScaleImageView$Tile0)) {
                            subsamplingScaleImageView$Tile0.visible = true;
                            if(subsamplingScaleImageView$Tile0.loading || subsamplingScaleImageView$Tile0.bitmap != null || !z) {
                                continue;
                            }
                            this.execute(new TileLoadTask(this, this.decoder, subsamplingScaleImageView$Tile0));
                        }
                        else {
                            if(subsamplingScaleImageView$Tile0.sampleSize == this.fullImageSampleSize) {
                                continue;
                            }
                            subsamplingScaleImageView$Tile0.visible = false;
                            if(subsamplingScaleImageView$Tile0.bitmap == null) {
                                continue;
                            }
                            subsamplingScaleImageView$Tile0.bitmap.recycle();
                            subsamplingScaleImageView$Tile0.bitmap = null;
                        }
                    }
                    else if(subsamplingScaleImageView$Tile0.sampleSize == this.fullImageSampleSize) {
                        subsamplingScaleImageView$Tile0.visible = true;
                    }
                }
            }
        }
    }

    private void requestDisallowInterceptTouchEvent(boolean z) {
        ViewParent viewParent0 = this.getParent();
        if(viewParent0 != null) {
            viewParent0.requestDisallowInterceptTouchEvent(z);
        }
    }

    private void reset(boolean z) {
        this.debug("reset newImage=" + z, new Object[0]);
        this.scale = 0.0f;
        this.scaleStart = 0.0f;
        this.vTranslate = null;
        this.vTranslateStart = null;
        this.vTranslateBefore = null;
        this.pendingScale = 0.0f;
        this.sPendingCenter = null;
        this.sRequestedCenter = null;
        this.isZooming = false;
        this.isPanning = false;
        this.isQuickScaling = false;
        this.maxTouchCount = 0;
        this.fullImageSampleSize = 0;
        this.vCenterStart = null;
        this.vDistStart = 0.0f;
        this.quickScaleLastDistance = 0.0f;
        this.quickScaleMoved = false;
        this.quickScaleSCenter = null;
        this.quickScaleVLastPoint = null;
        this.quickScaleVStart = null;
        this.anim = null;
        this.satTemp = null;
        this.matrix = null;
        this.sRect = null;
        if(z) {
            this.uri = null;
            this.decoderLock.writeLock().lock();
            try {
                ImageRegionDecoder imageRegionDecoder0 = this.decoder;
                if(imageRegionDecoder0 != null) {
                    imageRegionDecoder0.recycle();
                    this.decoder = null;
                }
            }
            finally {
                this.decoderLock.writeLock().unlock();
            }
            Bitmap bitmap0 = this.bitmap;
            if(bitmap0 != null && !this.bitmapIsCached) {
                bitmap0.recycle();
            }
            if(this.bitmap != null && this.bitmapIsCached) {
                OnImageEventListener subsamplingScaleImageView$OnImageEventListener0 = this.onImageEventListener;
                if(subsamplingScaleImageView$OnImageEventListener0 != null) {
                    subsamplingScaleImageView$OnImageEventListener0.onPreviewReleased();
                }
            }
            this.sWidth = 0;
            this.sHeight = 0;
            this.sOrientation = 0;
            this.sRegion = null;
            this.pRegion = null;
            this.readySent = false;
            this.imageLoadedSent = false;
            this.bitmap = null;
            this.bitmapIsPreview = false;
            this.bitmapIsCached = false;
        }
        Map map0 = this.tileMap;
        if(map0 != null) {
            for(Object object0: map0.entrySet()) {
                for(Object object1: ((List)((Map.Entry)object0).getValue())) {
                    Tile subsamplingScaleImageView$Tile0 = (Tile)object1;
                    subsamplingScaleImageView$Tile0.visible = false;
                    if(subsamplingScaleImageView$Tile0.bitmap != null) {
                        subsamplingScaleImageView$Tile0.bitmap.recycle();
                        subsamplingScaleImageView$Tile0.bitmap = null;
                    }
                }
            }
            this.tileMap = null;
        }
        this.setGestureDetector(this.getContext());
    }

    public final void resetScaleAndCenter() {
        this.anim = null;
        this.pendingScale = this.limitedScale(0.0f);
        this.sPendingCenter = this.isReady() ? new PointF(((float)(this.sWidth() / 2)), ((float)(this.sHeight() / 2))) : new PointF(0.0f, 0.0f);
        this.invalidate();
    }

    private void restoreState(ImageViewState imageViewState0) {
        if(imageViewState0 != null && SubsamplingScaleImageView.VALID_ORIENTATIONS.contains(imageViewState0.getOrientation())) {
            this.orientation = imageViewState0.getOrientation();
            this.pendingScale = imageViewState0.getScale();
            this.sPendingCenter = imageViewState0.getCenter();
            this.invalidate();
        }
    }

    private int sHeight() {
        switch(this.getRequiredRotation()) {
            case 90: 
            case 270: {
                return this.sWidth;
            }
            default: {
                return this.sHeight;
            }
        }
    }

    private int sWidth() {
        switch(this.getRequiredRotation()) {
            case 90: 
            case 270: {
                return this.sHeight;
            }
            default: {
                return this.sWidth;
            }
        }
    }

    private void sendStateChanged(float f, PointF pointF0, int v) {
        OnStateChangedListener subsamplingScaleImageView$OnStateChangedListener0 = this.onStateChangedListener;
        if(subsamplingScaleImageView$OnStateChangedListener0 != null) {
            float f1 = this.scale;
            if(f1 != f) {
                subsamplingScaleImageView$OnStateChangedListener0.onScaleChanged(f1, v);
            }
        }
        if(this.onStateChangedListener != null && !this.vTranslate.equals(pointF0)) {
            this.onStateChangedListener.onCenterChanged(this.getCenter(), v);
        }
    }

    public final void setBitmapDecoderClass(@NonNull Class class0) {
        if(class0 == null) {
            throw new IllegalArgumentException("Decoder class cannot be set to null");
        }
        this.bitmapDecoderFactory = new CompatDecoderFactory(class0);
    }

    public final void setBitmapDecoderFactory(@NonNull DecoderFactory decoderFactory0) {
        if(decoderFactory0 == null) {
            throw new IllegalArgumentException("Decoder factory cannot be set to null");
        }
        this.bitmapDecoderFactory = decoderFactory0;
    }

    public final void setDebug(boolean z) {
        this.debug = z;
    }

    public final void setDoubleTapZoomDpi(int v) {
        DisplayMetrics displayMetrics0 = this.getResources().getDisplayMetrics();
        this.setDoubleTapZoomScale((displayMetrics0.xdpi + displayMetrics0.ydpi) / 2.0f / ((float)v));
    }

    public final void setDoubleTapZoomDuration(int v) {
        this.doubleTapZoomDuration = Math.max(0, v);
    }

    public final void setDoubleTapZoomScale(float f) {
        this.doubleTapZoomScale = f;
    }

    public final void setDoubleTapZoomStyle(int v) {
        if(!SubsamplingScaleImageView.VALID_ZOOM_STYLES.contains(v)) {
            throw new IllegalArgumentException("Invalid zoom style: " + v);
        }
        this.doubleTapZoomStyle = v;
    }

    public void setEagerLoadingEnabled(boolean z) {
        this.eagerLoadingEnabled = z;
    }

    public void setExecutor(@NonNull Executor executor0) {
        if(executor0 == null) {
            throw new NullPointerException("Executor must not be null");
        }
        this.executor = executor0;
    }

    private void setGestureDetector(Context context0) {
        this.detector = new GestureDetector(context0, new GestureDetector.SimpleOnGestureListener() {
            @Override  // android.view.GestureDetector$SimpleOnGestureListener
            public boolean onDoubleTap(MotionEvent motionEvent0) {
                if(SubsamplingScaleImageView.this.zoomEnabled && SubsamplingScaleImageView.this.readySent && SubsamplingScaleImageView.this.vTranslate != null) {
                    SubsamplingScaleImageView.this.setGestureDetector(context0);
                    if(SubsamplingScaleImageView.this.quickScaleEnabled) {
                        PointF pointF0 = new PointF(motionEvent0.getX(), motionEvent0.getY());
                        SubsamplingScaleImageView.this.vCenterStart = pointF0;
                        PointF pointF1 = new PointF(SubsamplingScaleImageView.this.vTranslate.x, SubsamplingScaleImageView.this.vTranslate.y);
                        SubsamplingScaleImageView.this.vTranslateStart = pointF1;
                        SubsamplingScaleImageView.this.scaleStart = SubsamplingScaleImageView.this.scale;
                        SubsamplingScaleImageView.this.isQuickScaling = true;
                        SubsamplingScaleImageView.this.isZooming = true;
                        SubsamplingScaleImageView.this.quickScaleLastDistance = -1.0f;
                        PointF pointF2 = SubsamplingScaleImageView.this.viewToSourceCoord(SubsamplingScaleImageView.this.vCenterStart);
                        SubsamplingScaleImageView.this.quickScaleSCenter = pointF2;
                        PointF pointF3 = new PointF(motionEvent0.getX(), motionEvent0.getY());
                        SubsamplingScaleImageView.this.quickScaleVStart = pointF3;
                        PointF pointF4 = new PointF(SubsamplingScaleImageView.this.quickScaleSCenter.x, SubsamplingScaleImageView.this.quickScaleSCenter.y);
                        SubsamplingScaleImageView.this.quickScaleVLastPoint = pointF4;
                        SubsamplingScaleImageView.this.quickScaleMoved = false;
                        return false;
                    }
                    PointF pointF5 = new PointF(motionEvent0.getX(), motionEvent0.getY());
                    PointF pointF6 = SubsamplingScaleImageView.this.viewToSourceCoord(pointF5);
                    PointF pointF7 = new PointF(motionEvent0.getX(), motionEvent0.getY());
                    SubsamplingScaleImageView.this.doubleTapZoom(pointF6, pointF7);
                    return true;
                }
                return super.onDoubleTapEvent(motionEvent0);
            }

            @Override  // android.view.GestureDetector$SimpleOnGestureListener
            public boolean onFling(MotionEvent motionEvent0, MotionEvent motionEvent1, float f, float f1) {
                if(SubsamplingScaleImageView.this.panEnabled && SubsamplingScaleImageView.this.readySent && SubsamplingScaleImageView.this.vTranslate != null && motionEvent0 != null && motionEvent1 != null && (Math.abs(motionEvent0.getX() - motionEvent1.getX()) > 50.0f || Math.abs(motionEvent0.getY() - motionEvent1.getY()) > 50.0f) && (Math.abs(f) > 500.0f || Math.abs(f1) > 500.0f) && !SubsamplingScaleImageView.this.isZooming) {
                    PointF pointF0 = new PointF(SubsamplingScaleImageView.this.vTranslate.x + f * 0.25f, SubsamplingScaleImageView.this.vTranslate.y + f1 * 0.25f);
                    PointF pointF1 = new PointF((((float)(SubsamplingScaleImageView.this.getWidth() / 2)) - pointF0.x) / SubsamplingScaleImageView.this.scale, (((float)(SubsamplingScaleImageView.this.getHeight() / 2)) - pointF0.y) / SubsamplingScaleImageView.this.scale);
                    new AnimationBuilder(SubsamplingScaleImageView.this, pointF1, null).withEasing(1).withPanLimited(false).withOrigin(3).start();
                    return true;
                }
                return super.onFling(motionEvent0, motionEvent1, f, f1);
            }

            @Override  // android.view.GestureDetector$SimpleOnGestureListener
            public boolean onSingleTapConfirmed(MotionEvent motionEvent0) {
                SubsamplingScaleImageView.this.performClick();
                return true;
            }
        });
        this.singleDetector = new GestureDetector(context0, new GestureDetector.SimpleOnGestureListener() {
            @Override  // android.view.GestureDetector$SimpleOnGestureListener
            public boolean onSingleTapConfirmed(MotionEvent motionEvent0) {
                SubsamplingScaleImageView.this.performClick();
                return true;
            }
        });
    }

    public final void setImage(@NonNull ImageSource imageSource0) {
        this.setImage(imageSource0, null, null);
    }

    public final void setImage(@NonNull ImageSource imageSource0, ImageSource imageSource1) {
        this.setImage(imageSource0, imageSource1, null);
    }

    public final void setImage(@NonNull ImageSource imageSource0, ImageSource imageSource1, ImageViewState imageViewState0) {
        if(imageSource0 == null) {
            throw new NullPointerException("imageSource must not be null");
        }
        this.reset(true);
        if(imageViewState0 != null) {
            this.restoreState(imageViewState0);
        }
        if(imageSource1 != null) {
            if(imageSource0.getBitmap() != null) {
                throw new IllegalArgumentException("Preview image cannot be used when a bitmap is provided for the main image");
            }
            if(imageSource0.getSWidth() <= 0 || imageSource0.getSHeight() <= 0) {
                throw new IllegalArgumentException("Preview image cannot be used unless dimensions are provided for the main image");
            }
            this.sWidth = imageSource0.getSWidth();
            this.sHeight = imageSource0.getSHeight();
            this.pRegion = imageSource1.getSRegion();
            if(imageSource1.getBitmap() == null) {
                Uri uri0 = imageSource1.getUri() != null || imageSource1.getResource() == null ? imageSource1.getUri() : Uri.parse(("android.resource://com.dcinside.app.android/" + imageSource1.getResource()));
                this.execute(new BitmapLoadTask(this, this.getContext(), this.bitmapDecoderFactory, uri0, true));
            }
            else {
                this.bitmapIsCached = imageSource1.isCached();
                this.onPreviewLoaded(imageSource1.getBitmap());
            }
        }
        if(imageSource0.getBitmap() != null && imageSource0.getSRegion() != null) {
            this.onImageLoaded(Bitmap.createBitmap(imageSource0.getBitmap(), imageSource0.getSRegion().left, imageSource0.getSRegion().top, imageSource0.getSRegion().width(), imageSource0.getSRegion().height()), 0, false);
            return;
        }
        if(imageSource0.getBitmap() != null) {
            this.onImageLoaded(imageSource0.getBitmap(), 0, imageSource0.isCached());
            return;
        }
        this.sRegion = imageSource0.getSRegion();
        Uri uri1 = imageSource0.getUri();
        this.uri = uri1;
        if(uri1 == null && imageSource0.getResource() != null) {
            this.uri = Uri.parse(("android.resource://com.dcinside.app.android/" + imageSource0.getResource()));
        }
        if(!imageSource0.getTile() && this.sRegion == null) {
            this.execute(new BitmapLoadTask(this, this.getContext(), this.bitmapDecoderFactory, this.uri, false));
            return;
        }
        this.execute(new TilesInitTask(this, this.getContext(), this.regionDecoderFactory, this.uri));
    }

    public final void setImage(@NonNull ImageSource imageSource0, ImageViewState imageViewState0) {
        this.setImage(imageSource0, null, imageViewState0);
    }

    private void setMatrixArray(float[] arr_f, float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7) {
        arr_f[0] = f;
        arr_f[1] = f1;
        arr_f[2] = f2;
        arr_f[3] = f3;
        arr_f[4] = f4;
        arr_f[5] = f5;
        arr_f[6] = f6;
        arr_f[7] = f7;
    }

    public final void setMaxScale(float f) {
        this.maxScale = f;
    }

    public void setMaxTileSize(int v) {
        this.maxTileWidth = v;
        this.maxTileHeight = v;
    }

    public void setMaxTileSize(int v, int v1) {
        this.maxTileWidth = v;
        this.maxTileHeight = v1;
    }

    public final void setMaximumDpi(int v) {
        DisplayMetrics displayMetrics0 = this.getResources().getDisplayMetrics();
        this.setMinScale((displayMetrics0.xdpi + displayMetrics0.ydpi) / 2.0f / ((float)v));
    }

    public final void setMinScale(float f) {
        this.minScale = f;
    }

    public final void setMinimumDpi(int v) {
        DisplayMetrics displayMetrics0 = this.getResources().getDisplayMetrics();
        this.setMaxScale((displayMetrics0.xdpi + displayMetrics0.ydpi) / 2.0f / ((float)v));
    }

    public final void setMinimumScaleType(int v) {
        if(!SubsamplingScaleImageView.VALID_SCALE_TYPES.contains(v)) {
            throw new IllegalArgumentException("Invalid scale type: " + v);
        }
        this.minimumScaleType = v;
        if(this.isReady()) {
            this.fitToBounds(true);
            this.invalidate();
        }
    }

    public void setMinimumTileDpi(int v) {
        DisplayMetrics displayMetrics0 = this.getResources().getDisplayMetrics();
        this.minimumTileDpi = (int)Math.min((displayMetrics0.xdpi + displayMetrics0.ydpi) / 2.0f, v);
        if(this.isReady()) {
            this.reset(false);
            this.invalidate();
        }
    }

    public void setOnImageEventListener(OnImageEventListener subsamplingScaleImageView$OnImageEventListener0) {
        this.onImageEventListener = subsamplingScaleImageView$OnImageEventListener0;
    }

    @Override  // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener view$OnLongClickListener0) {
        this.onLongClickListener = view$OnLongClickListener0;
    }

    public void setOnStateChangedListener(OnStateChangedListener subsamplingScaleImageView$OnStateChangedListener0) {
        this.onStateChangedListener = subsamplingScaleImageView$OnStateChangedListener0;
    }

    public final void setOrientation(int v) {
        if(!SubsamplingScaleImageView.VALID_ORIENTATIONS.contains(v)) {
            throw new IllegalArgumentException("Invalid orientation: " + v);
        }
        this.orientation = v;
        this.reset(false);
        this.invalidate();
        this.requestLayout();
    }

    public final void setPanEnabled(boolean z) {
        this.panEnabled = z;
        if(!z) {
            PointF pointF0 = this.vTranslate;
            if(pointF0 != null) {
                pointF0.x = ((float)(this.getWidth() / 2)) - this.scale * ((float)(this.sWidth() / 2));
                PointF pointF1 = this.vTranslate;
                pointF1.y = ((float)(this.getHeight() / 2)) - this.scale * ((float)(this.sHeight() / 2));
                if(this.isReady()) {
                    this.refreshRequiredTiles(true);
                    this.invalidate();
                }
            }
        }
    }

    public final void setPanLimit(int v) {
        if(!SubsamplingScaleImageView.VALID_PAN_LIMITS.contains(v)) {
            throw new IllegalArgumentException("Invalid pan limit: " + v);
        }
        this.panLimit = v;
        if(this.isReady()) {
            this.fitToBounds(true);
            this.invalidate();
        }
    }

    public static void setPreferredBitmapConfig(Bitmap.Config bitmap$Config0) {
        SubsamplingScaleImageView.preferredBitmapConfig = bitmap$Config0;
    }

    public final void setQuickScaleEnabled(boolean z) {
        this.quickScaleEnabled = z;
    }

    public final void setRegionDecoderClass(@NonNull Class class0) {
        if(class0 == null) {
            throw new IllegalArgumentException("Decoder class cannot be set to null");
        }
        this.regionDecoderFactory = new CompatDecoderFactory(class0);
    }

    public final void setRegionDecoderFactory(@NonNull DecoderFactory decoderFactory0) {
        if(decoderFactory0 == null) {
            throw new IllegalArgumentException("Decoder factory cannot be set to null");
        }
        this.regionDecoderFactory = decoderFactory0;
    }

    public final void setScaleAndCenter(float f, @Nullable PointF pointF0) {
        this.anim = null;
        this.pendingScale = f;
        this.sPendingCenter = pointF0;
        this.sRequestedCenter = pointF0;
        this.invalidate();
    }

    public final void setTileBackgroundColor(int v) {
        if(Color.alpha(v) == 0) {
            this.tileBgPaint = null;
        }
        else {
            Paint paint0 = new Paint();
            this.tileBgPaint = paint0;
            paint0.setStyle(Paint.Style.FILL);
            this.tileBgPaint.setColor(v);
        }
        this.invalidate();
    }

    public final void setZoomEnabled(boolean z) {
        this.zoomEnabled = z;
    }

    @Nullable
    public final PointF sourceToViewCoord(float f, float f1) {
        return this.sourceToViewCoord(f, f1, new PointF());
    }

    @Nullable
    public final PointF sourceToViewCoord(float f, float f1, @NonNull PointF pointF0) {
        if(this.vTranslate == null) {
            return null;
        }
        pointF0.set(this.sourceToViewX(f), this.sourceToViewY(f1));
        return pointF0;
    }

    @Nullable
    public final PointF sourceToViewCoord(PointF pointF0) {
        return this.sourceToViewCoord(pointF0.x, pointF0.y, new PointF());
    }

    @Nullable
    public final PointF sourceToViewCoord(PointF pointF0, @NonNull PointF pointF1) {
        return this.sourceToViewCoord(pointF0.x, pointF0.y, pointF1);
    }

    private void sourceToViewRect(@NonNull Rect rect0, @NonNull Rect rect1) {
        rect1.set(((int)this.sourceToViewX(((float)rect0.left))), ((int)this.sourceToViewY(((float)rect0.top))), ((int)this.sourceToViewX(((float)rect0.right))), ((int)this.sourceToViewY(((float)rect0.bottom))));
    }

    private float sourceToViewX(float f) {
        return this.vTranslate == null ? NaNf : f * this.scale + this.vTranslate.x;
    }

    private float sourceToViewY(float f) {
        return this.vTranslate == null ? NaNf : f * this.scale + this.vTranslate.y;
    }

    private boolean tileVisible(Tile subsamplingScaleImageView$Tile0) {
        float f = this.viewToSourceX(0.0f);
        float f1 = this.viewToSourceX(((float)this.getWidth()));
        float f2 = this.viewToSourceY(0.0f);
        float f3 = this.viewToSourceY(((float)this.getHeight()));
        return f <= ((float)subsamplingScaleImageView$Tile0.sRect.right) && ((float)subsamplingScaleImageView$Tile0.sRect.left) <= f1 && f2 <= ((float)subsamplingScaleImageView$Tile0.sRect.bottom) && ((float)subsamplingScaleImageView$Tile0.sRect.top) <= f3;
    }

    @NonNull
    private PointF vTranslateForSCenter(float f, float f1, float f2) {
        int v = this.getPaddingLeft();
        int v1 = this.getWidth();
        int v2 = this.getPaddingRight();
        int v3 = this.getPaddingLeft();
        int v4 = this.getPaddingTop();
        int v5 = this.getHeight();
        int v6 = this.getPaddingBottom();
        int v7 = this.getPaddingTop();
        if(this.satTemp == null) {
            this.satTemp = new ScaleAndTranslate(0.0f, new PointF(0.0f, 0.0f), null);
        }
        this.satTemp.scale = f2;
        this.satTemp.vTranslate.set(((float)(v + (v1 - v2 - v3) / 2)) - f * f2, ((float)(v4 + (v5 - v6 - v7) / 2)) - f1 * f2);
        this.fitToBounds(true, this.satTemp);
        return this.satTemp.vTranslate;
    }

    public void viewToFileRect(Rect rect0, Rect rect1) {
        if(this.vTranslate != null && this.readySent) {
            rect1.set(((int)this.viewToSourceX(((float)rect0.left))), ((int)this.viewToSourceY(((float)rect0.top))), ((int)this.viewToSourceX(((float)rect0.right))), ((int)this.viewToSourceY(((float)rect0.bottom))));
            this.fileSRect(rect1, rect1);
            rect1.set(Math.max(0, rect1.left), Math.max(0, rect1.top), Math.min(this.sWidth, rect1.right), Math.min(this.sHeight, rect1.bottom));
            Rect rect2 = this.sRegion;
            if(rect2 != null) {
                rect1.offset(rect2.left, rect2.top);
            }
        }
    }

    @Nullable
    public final PointF viewToSourceCoord(float f, float f1) {
        return this.viewToSourceCoord(f, f1, new PointF());
    }

    @Nullable
    public final PointF viewToSourceCoord(float f, float f1, @NonNull PointF pointF0) {
        if(this.vTranslate == null) {
            return null;
        }
        pointF0.set(this.viewToSourceX(f), this.viewToSourceY(f1));
        return pointF0;
    }

    @Nullable
    public final PointF viewToSourceCoord(PointF pointF0) {
        return this.viewToSourceCoord(pointF0.x, pointF0.y, new PointF());
    }

    @Nullable
    public final PointF viewToSourceCoord(PointF pointF0, @NonNull PointF pointF1) {
        return this.viewToSourceCoord(pointF0.x, pointF0.y, pointF1);
    }

    private float viewToSourceX(float f) {
        return this.vTranslate == null ? NaNf : (f - this.vTranslate.x) / this.scale;
    }

    private float viewToSourceY(float f) {
        return this.vTranslate == null ? NaNf : (f - this.vTranslate.y) / this.scale;
    }

    public void visibleFileRect(Rect rect0) {
        if(this.vTranslate != null && this.readySent) {
            rect0.set(0, 0, this.getWidth(), this.getHeight());
            this.viewToFileRect(rect0, rect0);
        }
    }
}

