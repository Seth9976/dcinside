package androidx.print;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.pdf.PdfDocument.Page;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.CancellationSignal.OnCancelListener;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes.Builder;
import android.print.PrintAttributes.Margins;
import android.print.PrintAttributes.MediaSize;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter.LayoutResultCallback;
import android.print.PrintDocumentAdapter.WriteResultCallback;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentInfo.Builder;
import android.print.PrintDocumentInfo;
import android.print.PrintManager;
import android.print.pdf.PrintedPdfDocument;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public final class PrintHelper {
    public interface OnPrintFinishCallback {
        void a();
    }

    @RequiresApi(19)
    class PrintBitmapAdapter extends PrintDocumentAdapter {
        private final String a;
        private final int b;
        private final Bitmap c;
        private final OnPrintFinishCallback d;
        private PrintAttributes e;
        final PrintHelper f;

        PrintBitmapAdapter(String s, int v, Bitmap bitmap0, OnPrintFinishCallback printHelper$OnPrintFinishCallback0) {
            this.a = s;
            this.b = v;
            this.c = bitmap0;
            this.d = printHelper$OnPrintFinishCallback0;
        }

        @Override  // android.print.PrintDocumentAdapter
        public void onFinish() {
            OnPrintFinishCallback printHelper$OnPrintFinishCallback0 = this.d;
            if(printHelper$OnPrintFinishCallback0 != null) {
                printHelper$OnPrintFinishCallback0.a();
            }
        }

        @Override  // android.print.PrintDocumentAdapter
        public void onLayout(PrintAttributes printAttributes0, PrintAttributes printAttributes1, CancellationSignal cancellationSignal0, PrintDocumentAdapter.LayoutResultCallback printDocumentAdapter$LayoutResultCallback0, Bundle bundle0) {
            this.e = printAttributes1;
            printDocumentAdapter$LayoutResultCallback0.onLayoutFinished(new PrintDocumentInfo.Builder(this.a).setContentType(1).setPageCount(1).build(), !printAttributes1.equals(printAttributes0));
        }

        @Override  // android.print.PrintDocumentAdapter
        public void onWrite(PageRange[] arr_pageRange, ParcelFileDescriptor parcelFileDescriptor0, CancellationSignal cancellationSignal0, PrintDocumentAdapter.WriteResultCallback printDocumentAdapter$WriteResultCallback0) {
            PrintHelper.this.r(this.e, this.b, this.c, parcelFileDescriptor0, cancellationSignal0, printDocumentAdapter$WriteResultCallback0);
        }
    }

    @RequiresApi(19)
    class PrintUriAdapter extends PrintDocumentAdapter {
        final String a;
        final Uri b;
        final OnPrintFinishCallback c;
        final int d;
        PrintAttributes e;
        AsyncTask f;
        Bitmap g;
        final PrintHelper h;

        PrintUriAdapter(String s, Uri uri0, OnPrintFinishCallback printHelper$OnPrintFinishCallback0, int v) {
            this.a = s;
            this.b = uri0;
            this.c = printHelper$OnPrintFinishCallback0;
            this.d = v;
            this.g = null;
        }

        void a() {
            synchronized(PrintHelper.this.c) {
                BitmapFactory.Options bitmapFactory$Options0 = PrintHelper.this.b;
                if(bitmapFactory$Options0 != null) {
                    if(Build.VERSION.SDK_INT < 24) {
                        bitmapFactory$Options0.requestCancelDecode();
                    }
                    PrintHelper.this.b = null;
                }
            }
        }

        @Override  // android.print.PrintDocumentAdapter
        public void onFinish() {
            super.onFinish();
            this.a();
            AsyncTask asyncTask0 = this.f;
            if(asyncTask0 != null) {
                asyncTask0.cancel(true);
            }
            OnPrintFinishCallback printHelper$OnPrintFinishCallback0 = this.c;
            if(printHelper$OnPrintFinishCallback0 != null) {
                printHelper$OnPrintFinishCallback0.a();
            }
            Bitmap bitmap0 = this.g;
            if(bitmap0 != null) {
                bitmap0.recycle();
                this.g = null;
            }
        }

        @Override  // android.print.PrintDocumentAdapter
        public void onLayout(PrintAttributes printAttributes0, PrintAttributes printAttributes1, CancellationSignal cancellationSignal0, PrintDocumentAdapter.LayoutResultCallback printDocumentAdapter$LayoutResultCallback0, Bundle bundle0) {
            synchronized(this) {
                this.e = printAttributes1;
            }
            if(cancellationSignal0.isCanceled()) {
                printDocumentAdapter$LayoutResultCallback0.onLayoutCancelled();
                return;
            }
            if(this.g != null) {
                printDocumentAdapter$LayoutResultCallback0.onLayoutFinished(new PrintDocumentInfo.Builder(this.a).setContentType(1).setPageCount(1).build(), !printAttributes1.equals(printAttributes0));
                return;
            }
            this.f = new AsyncTask() {
                final PrintUriAdapter e;

                protected Bitmap a(Uri[] arr_uri) {
                    try {
                        return PrintHelper.this.i(PrintUriAdapter.this.b);
                    }
                    catch(FileNotFoundException unused_ex) {
                        return null;
                    }
                }

                protected void b(Bitmap bitmap0) {
                    printDocumentAdapter$LayoutResultCallback0.onLayoutCancelled();
                    PrintUriAdapter.this.f = null;
                }

                protected void c(Bitmap bitmap0) {
                    super.onPostExecute(bitmap0);
                    if(bitmap0 != null && (!PrintHelper.i || PrintHelper.this.f == 0)) {
                        synchronized(this) {
                            PrintAttributes.MediaSize printAttributes$MediaSize0 = PrintUriAdapter.this.e.getMediaSize();
                        }
                        if(printAttributes$MediaSize0 != null && printAttributes$MediaSize0.isPortrait() != PrintHelper.g(bitmap0)) {
                            Matrix matrix0 = new Matrix();
                            matrix0.postRotate(90.0f);
                            bitmap0 = Bitmap.createBitmap(bitmap0, 0, 0, bitmap0.getWidth(), bitmap0.getHeight(), matrix0, true);
                        }
                    }
                    PrintUriAdapter.this.g = bitmap0;
                    if(bitmap0 == null) {
                        printDocumentAdapter$LayoutResultCallback0.onLayoutFailed(null);
                    }
                    else {
                        PrintDocumentInfo printDocumentInfo0 = new PrintDocumentInfo.Builder(PrintUriAdapter.this.a).setContentType(1).setPageCount(1).build();
                        boolean z = printAttributes1.equals(printAttributes0);
                        printDocumentAdapter$LayoutResultCallback0.onLayoutFinished(printDocumentInfo0, ((boolean)(true ^ z)));
                    }
                    PrintUriAdapter.this.f = null;
                }

                @Override  // android.os.AsyncTask
                protected Object doInBackground(Object[] arr_object) {
                    return this.a(((Uri[])arr_object));
                }

                @Override  // android.os.AsyncTask
                protected void onCancelled(Object object0) {
                    this.b(((Bitmap)object0));
                }

                @Override  // android.os.AsyncTask
                protected void onPostExecute(Object object0) {
                    this.c(((Bitmap)object0));
                }

                @Override  // android.os.AsyncTask
                protected void onPreExecute() {
                    androidx.print.PrintHelper.PrintUriAdapter.1.1 printHelper$PrintUriAdapter$1$10 = new CancellationSignal.OnCancelListener() {
                        final androidx.print.PrintHelper.PrintUriAdapter.1 a;

                        @Override  // android.os.CancellationSignal$OnCancelListener
                        public void onCancel() {
                            PrintUriAdapter.this.a();
                            androidx.print.PrintHelper.PrintUriAdapter.1.this.cancel(false);
                        }
                    };
                    cancellationSignal0.setOnCancelListener(printHelper$PrintUriAdapter$1$10);
                }
            }.execute(new Uri[0]);
        }

        @Override  // android.print.PrintDocumentAdapter
        public void onWrite(PageRange[] arr_pageRange, ParcelFileDescriptor parcelFileDescriptor0, CancellationSignal cancellationSignal0, PrintDocumentAdapter.WriteResultCallback printDocumentAdapter$WriteResultCallback0) {
            PrintHelper.this.r(this.e, this.d, this.g, parcelFileDescriptor0, cancellationSignal0, printDocumentAdapter$WriteResultCallback0);
        }
    }

    final Context a;
    BitmapFactory.Options b;
    final Object c;
    int d;
    int e;
    int f;
    private static final String g = "PrintHelper";
    private static final int h = 3500;
    static final boolean i = false;
    static final boolean j = false;
    public static final int k = 1;
    public static final int l = 2;
    @SuppressLint({"InlinedApi"})
    public static final int m = 1;
    @SuppressLint({"InlinedApi"})
    public static final int n = 2;
    public static final int o = 1;
    public static final int p = 2;

    static {
        boolean z = true;
        PrintHelper.i = Build.VERSION.SDK_INT > 23;
        if(Build.VERSION.SDK_INT == 23) {
            z = false;
        }
        PrintHelper.j = z;
    }

    public PrintHelper(@NonNull Context context0) {
        this.b = null;
        this.c = new Object();
        this.d = 2;
        this.e = 2;
        this.f = 1;
        this.a = context0;
    }

    static Bitmap a(Bitmap bitmap0, int v) {
        if(v != 1) {
            return bitmap0;
        }
        Bitmap bitmap1 = Bitmap.createBitmap(bitmap0.getWidth(), bitmap0.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas0 = new Canvas(bitmap1);
        Paint paint0 = new Paint();
        ColorMatrix colorMatrix0 = new ColorMatrix();
        colorMatrix0.setSaturation(0.0f);
        paint0.setColorFilter(new ColorMatrixColorFilter(colorMatrix0));
        canvas0.drawBitmap(bitmap0, 0.0f, 0.0f, paint0);
        canvas0.setBitmap(null);
        return bitmap1;
    }

    @RequiresApi(19)
    private static PrintAttributes.Builder b(PrintAttributes printAttributes0) {
        PrintAttributes.Builder printAttributes$Builder0 = new PrintAttributes.Builder().setMediaSize(printAttributes0.getMediaSize()).setResolution(printAttributes0.getResolution()).setMinMargins(printAttributes0.getMinMargins());
        if(printAttributes0.getColorMode() != 0) {
            printAttributes$Builder0.setColorMode(printAttributes0.getColorMode());
        }
        if(Build.VERSION.SDK_INT >= 23 && printAttributes0.getDuplexMode() != 0) {
            printAttributes$Builder0.setDuplexMode(printAttributes0.getDuplexMode());
        }
        return printAttributes$Builder0;
    }

    public int c() {
        return this.e;
    }

    static Matrix d(int v, int v1, RectF rectF0, int v2) {
        Matrix matrix0 = new Matrix();
        float f = rectF0.width() / ((float)v);
        float f1 = v2 == 2 ? Math.max(f, rectF0.height() / ((float)v1)) : Math.min(f, rectF0.height() / ((float)v1));
        matrix0.postScale(f1, f1);
        matrix0.postTranslate((rectF0.width() - ((float)v) * f1) / 2.0f, (rectF0.height() - ((float)v1) * f1) / 2.0f);
        return matrix0;
    }

    public int e() {
        return this.f == 0 ? 1 : this.f;
    }

    public int f() {
        return this.d;
    }

    static boolean g(Bitmap bitmap0) {
        return bitmap0.getWidth() <= bitmap0.getHeight();
    }

    private Bitmap h(Uri uri0, BitmapFactory.Options bitmapFactory$Options0) throws FileNotFoundException {
        Bitmap bitmap0;
        InputStream inputStream0;
        if(uri0 != null) {
            Context context0 = this.a;
            if(context0 != null) {
                try {
                    inputStream0 = null;
                    inputStream0 = context0.getContentResolver().openInputStream(uri0);
                    bitmap0 = BitmapFactory.decodeStream(inputStream0, null, bitmapFactory$Options0);
                }
                catch(Throwable throwable0) {
                    if(inputStream0 != null) {
                        try {
                            inputStream0.close();
                        }
                        catch(IOException iOException0) {
                            Log.w("PrintHelper", "close fail ", iOException0);
                        }
                    }
                    throw throwable0;
                }
                if(inputStream0 != null) {
                    try {
                        inputStream0.close();
                        return bitmap0;
                    }
                    catch(IOException iOException1) {
                        Log.w("PrintHelper", "close fail ", iOException1);
                    }
                }
                return bitmap0;
            }
        }
        throw new IllegalArgumentException("bad argument to loadBitmap");
    }

    Bitmap i(Uri uri0) throws FileNotFoundException {
        BitmapFactory.Options bitmapFactory$Options1;
        if(uri0 == null || this.a == null) {
            throw new IllegalArgumentException("bad argument to getScaledBitmap");
        }
        BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
        bitmapFactory$Options0.inJustDecodeBounds = true;
        this.h(uri0, bitmapFactory$Options0);
        int v = bitmapFactory$Options0.outWidth;
        int v1 = bitmapFactory$Options0.outHeight;
        if(v > 0 && v1 > 0) {
            int v2 = Math.max(v, v1);
            int v3;
            for(v3 = 1; v2 > 3500; v3 <<= 1) {
                v2 >>>= 1;
            }
            if(v3 > 0 && Math.min(v, v1) / v3 > 0) {
                synchronized(this.c) {
                    bitmapFactory$Options1 = new BitmapFactory.Options();
                    this.b = bitmapFactory$Options1;
                    bitmapFactory$Options1.inMutable = true;
                    bitmapFactory$Options1.inSampleSize = v3;
                }
                try {
                    return this.h(uri0, bitmapFactory$Options1);
                }
                finally {
                    synchronized(this.c) {
                        this.b = null;
                    }
                }
            }
        }
        return null;
    }

    public void j(@NonNull String s, @NonNull Bitmap bitmap0) {
        this.k(s, bitmap0, null);
    }

    public void k(@NonNull String s, @NonNull Bitmap bitmap0, @Nullable OnPrintFinishCallback printHelper$OnPrintFinishCallback0) {
        if(bitmap0 == null) {
            return;
        }
        PrintManager printManager0 = (PrintManager)this.a.getSystemService("print");
        PrintAttributes.MediaSize printAttributes$MediaSize0 = PrintHelper.g(bitmap0) ? PrintAttributes.MediaSize.UNKNOWN_PORTRAIT : PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE;
        PrintAttributes printAttributes0 = new PrintAttributes.Builder().setMediaSize(printAttributes$MediaSize0).setColorMode(this.e).build();
        printManager0.print(s, new PrintBitmapAdapter(this, s, this.d, bitmap0, printHelper$OnPrintFinishCallback0), printAttributes0);
    }

    public void l(@NonNull String s, @NonNull Uri uri0) throws FileNotFoundException {
        this.m(s, uri0, null);
    }

    public void m(@NonNull String s, @NonNull Uri uri0, @Nullable OnPrintFinishCallback printHelper$OnPrintFinishCallback0) throws FileNotFoundException {
        PrintUriAdapter printHelper$PrintUriAdapter0 = new PrintUriAdapter(this, s, uri0, printHelper$OnPrintFinishCallback0, this.d);
        PrintManager printManager0 = (PrintManager)this.a.getSystemService("print");
        PrintAttributes.Builder printAttributes$Builder0 = new PrintAttributes.Builder();
        printAttributes$Builder0.setColorMode(this.e);
        int v = this.f;
        if(v == 0 || v == 1) {
            printAttributes$Builder0.setMediaSize(PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE);
        }
        else if(v == 2) {
            printAttributes$Builder0.setMediaSize(PrintAttributes.MediaSize.UNKNOWN_PORTRAIT);
        }
        printManager0.print(s, printHelper$PrintUriAdapter0, printAttributes$Builder0.build());
    }

    public void n(int v) {
        this.e = v;
    }

    public void o(int v) {
        this.f = v;
    }

    public void p(int v) {
        this.d = v;
    }

    public static boolean q() {
        return true;
    }

    @RequiresApi(19)
    void r(PrintAttributes printAttributes0, int v, Bitmap bitmap0, ParcelFileDescriptor parcelFileDescriptor0, CancellationSignal cancellationSignal0, PrintDocumentAdapter.WriteResultCallback printDocumentAdapter$WriteResultCallback0) {
        new AsyncTask() {
            final PrintHelper h;

            protected Throwable a(Void[] arr_void) {
                RectF rectF0;
                Bitmap bitmap0;
                PrintedPdfDocument printedPdfDocument0;
                try {
                    if(cancellationSignal0.isCanceled()) {
                        return null;
                    }
                    printedPdfDocument0 = new PrintedPdfDocument(PrintHelper.this.a, (PrintHelper.j ? printAttributes0 : PrintHelper.b(printAttributes0).setMinMargins(new PrintAttributes.Margins(0, 0, 0, 0)).build()));
                    int v = (PrintHelper.j ? printAttributes0 : PrintHelper.b(printAttributes0).setMinMargins(new PrintAttributes.Margins(0, 0, 0, 0)).build()).getColorMode();
                    bitmap0 = PrintHelper.a(bitmap0, v);
                    if(cancellationSignal0.isCanceled()) {
                        return null;
                    }
                }
                catch(Throwable throwable0) {
                    return throwable0;
                }
                try {
                    PdfDocument.Page pdfDocument$Page0 = printedPdfDocument0.startPage(1);
                    boolean z = PrintHelper.j;
                    if(z) {
                        rectF0 = new RectF(pdfDocument$Page0.getInfo().getContentRect());
                    }
                    else {
                        PrintedPdfDocument printedPdfDocument1 = new PrintedPdfDocument(PrintHelper.this.a, printAttributes0);
                        PdfDocument.Page pdfDocument$Page1 = printedPdfDocument1.startPage(1);
                        RectF rectF1 = new RectF(pdfDocument$Page1.getInfo().getContentRect());
                        printedPdfDocument1.finishPage(pdfDocument$Page1);
                        printedPdfDocument1.close();
                        rectF0 = rectF1;
                    }
                    Matrix matrix0 = PrintHelper.d(bitmap0.getWidth(), bitmap0.getHeight(), rectF0, v);
                    if(!z) {
                        matrix0.postTranslate(rectF0.left, rectF0.top);
                        pdfDocument$Page0.getCanvas().clipRect(rectF0);
                    }
                    pdfDocument$Page0.getCanvas().drawBitmap(bitmap0, matrix0, null);
                    printedPdfDocument0.finishPage(pdfDocument$Page0);
                    if(!cancellationSignal0.isCanceled()) {
                        printedPdfDocument0.writeTo(new FileOutputStream(parcelFileDescriptor0.getFileDescriptor()));
                        goto label_35;
                    }
                    goto label_42;
                }
                catch(Throwable throwable1) {
                }
                try {
                    printedPdfDocument0.close();
                    ParcelFileDescriptor parcelFileDescriptor0 = parcelFileDescriptor0;
                    if(parcelFileDescriptor0 != null) {
                        try {
                            parcelFileDescriptor0.close();
                        }
                        catch(IOException unused_ex) {
                        }
                    }
                    if(bitmap0 != bitmap0) {
                        bitmap0.recycle();
                    }
                    throw throwable1;
                label_35:
                    printedPdfDocument0.close();
                    ParcelFileDescriptor parcelFileDescriptor1 = parcelFileDescriptor0;
                    if(parcelFileDescriptor1 != null) {
                        try {
                            parcelFileDescriptor1.close();
                        }
                        catch(IOException unused_ex) {
                        }
                    }
                    if(bitmap0 != bitmap0) {
                        bitmap0.recycle();
                    }
                    return null;
                label_42:
                    printedPdfDocument0.close();
                    ParcelFileDescriptor parcelFileDescriptor2 = parcelFileDescriptor0;
                    if(parcelFileDescriptor2 != null) {
                        try {
                            parcelFileDescriptor2.close();
                        }
                        catch(IOException unused_ex) {
                        }
                    }
                    if(bitmap0 != bitmap0) {
                        bitmap0.recycle();
                    }
                    return null;
                }
                catch(Throwable throwable0) {
                    return throwable0;
                }
            }

            protected void b(Throwable throwable0) {
                if(cancellationSignal0.isCanceled()) {
                    printDocumentAdapter$WriteResultCallback0.onWriteCancelled();
                    return;
                }
                if(throwable0 == null) {
                    printDocumentAdapter$WriteResultCallback0.onWriteFinished(new PageRange[]{PageRange.ALL_PAGES});
                    return;
                }
                Log.e("PrintHelper", "Error writing printed content", throwable0);
                printDocumentAdapter$WriteResultCallback0.onWriteFailed(null);
            }

            @Override  // android.os.AsyncTask
            protected Object doInBackground(Object[] arr_object) {
                return this.a(((Void[])arr_object));
            }

            @Override  // android.os.AsyncTask
            protected void onPostExecute(Object object0) {
                this.b(((Throwable)object0));
            }
        }.execute(new Void[0]);
    }
}

