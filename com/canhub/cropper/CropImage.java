package com.canhub.cropper;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;
import z3.f;

public final class CropImage {
    public static class ActivityResult extends c implements Parcelable {
        public static final class a implements Parcelable.Creator {
            public ActivityResult a(Parcel parcel0) {
                L.p(parcel0, "in");
                return new ActivityResult(parcel0);
            }

            public ActivityResult[] b(int v) {
                return new ActivityResult[v];
            }

            @Override  // android.os.Parcelable$Creator
            public Object createFromParcel(Parcel parcel0) {
                return this.a(parcel0);
            }

            @Override  // android.os.Parcelable$Creator
            public Object[] newArray(int v) {
                return this.b(v);
            }
        }

        public static final class b {
            private b() {
            }

            public b(w w0) {
            }
        }

        @l
        @f
        public static final Parcelable.Creator CREATOR;
        @l
        public static final b k;

        static {
            ActivityResult.k = new b(null);
            ActivityResult.CREATOR = new a();
        }

        public ActivityResult(@m Uri uri0, @m Uri uri1, @m Exception exception0, @m float[] arr_f, @m Rect rect0, int v, @m Rect rect1, int v1) {
            L.m(arr_f);
            super(null, uri0, null, uri1, exception0, arr_f, rect0, rect1, v, v1);
        }

        protected ActivityResult(@l Parcel parcel0) {
            L.p(parcel0, "in");
            Parcelable parcelable0 = parcel0.readParcelable(Uri.class.getClassLoader());
            Parcelable parcelable1 = parcel0.readParcelable(Uri.class.getClassLoader());
            Serializable serializable0 = parcel0.readSerializable();
            float[] arr_f = parcel0.createFloatArray();
            L.m(arr_f);
            super(null, ((Uri)parcelable0), null, ((Uri)parcelable1), ((Exception)serializable0), arr_f, ((Rect)parcel0.readParcelable(Rect.class.getClassLoader())), ((Rect)parcel0.readParcelable(Rect.class.getClassLoader())), parcel0.readInt(), parcel0.readInt());
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(@l Parcel parcel0, int v) {
            L.p(parcel0, "dest");
            parcel0.writeParcelable(this.h(), v);
            parcel0.writeParcelable(this.m(), v);
            parcel0.writeSerializable(this.f());
            parcel0.writeFloatArray(this.d());
            parcel0.writeParcelable(this.e(), v);
            parcel0.writeParcelable(this.r(), v);
            parcel0.writeInt(this.i());
            parcel0.writeInt(this.l());
        }
    }

    public static final class com.canhub.cropper.CropImage.a extends c {
        @l
        public static final com.canhub.cropper.CropImage.a k;

        static {
            com.canhub.cropper.CropImage.a.k = new com.canhub.cropper.CropImage.a();
        }

        private com.canhub.cropper.CropImage.a() {
            super(null, null, null, null, new com.canhub.cropper.e.a(), new float[0], null, null, 0, 0);
        }
    }

    @l
    public static final CropImage a = null;
    @l
    public static final String b = "CROP_IMAGE_EXTRA_SOURCE";
    @l
    public static final String c = "CROP_IMAGE_EXTRA_OPTIONS";
    @l
    public static final String d = "CROP_IMAGE_EXTRA_BUNDLE";
    @l
    public static final String e = "CROP_IMAGE_EXTRA_RESULT";
    public static final int f = 204;

    static {
        CropImage.a = new CropImage();
    }

    @l
    public final Bitmap a(@l Bitmap bitmap0) {
        L.p(bitmap0, "bitmap");
        int v = bitmap0.getWidth();
        int v1 = bitmap0.getHeight();
        Bitmap bitmap1 = Bitmap.createBitmap(v, v1, Bitmap.Config.ARGB_8888);
        L.o(bitmap1, "createBitmap(...)");
        Canvas canvas0 = new Canvas(bitmap1);
        Paint paint0 = new Paint();
        paint0.setAntiAlias(true);
        canvas0.drawARGB(0, 0, 0, 0);
        paint0.setColor(0xFF424242);
        canvas0.drawOval(new RectF(0.0f, 0.0f, ((float)v), ((float)v1)), paint0);
        paint0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas0.drawBitmap(bitmap0, 0.0f, 0.0f, paint0);
        bitmap0.recycle();
        return bitmap1;
    }
}

