package com.dcinside.app.image;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.documentfile.provider.DocumentFile;
import com.bumptech.glide.request.d;
import com.dcinside.app.Application;
import com.dcinside.app.realm.z;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.Gk;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.util.Arrays;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.OkHttpClient;
import okhttp3.Request.Builder;
import okhttp3.Response;
import okhttp3.ResponseBody;
import rx.g;
import rx.n;
import y4.l;
import y4.m;

@s0({"SMAP\nImageDownloadHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageDownloadHelper.kt\ncom/dcinside/app/image/ImageDownloadHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,215:1\n1#2:216\n*E\n"})
public final class j {
    public static final class a {
        @l
        private final Uri a;
        @l
        private final String b;

        public a(@l Uri uri0, @l String s) {
            L.p(uri0, "uri");
            L.p(s, "name");
            super();
            this.a = uri0;
            this.b = s;
        }

        @l
        public final String a() {
            return this.b;
        }

        @l
        public final Uri b() {
            return this.a;
        }
    }

    @l
    public static final j a;

    static {
        j.a = new j();
    }

    private final void d(Closeable[] arr_closeable) {
        for(int v = 0; v < arr_closeable.length; ++v) {
            Closeable closeable0 = arr_closeable[v];
            if(closeable0 != null) {
                try {
                    closeable0.close();
                }
                catch(Exception unused_ex) {
                }
            }
        }
    }

    @l
    public final g e(@m File file0, @l File file1, @l String s) {
        L.p(file1, "toDir");
        L.p(s, "toName");
        g g0 = g.M6((n n0) -> {
            FileChannel fileChannel0;
            FileOutputStream fileOutputStream0;
            Closeable closeable1;
            Throwable throwable1;
            FileInputStream fileInputStream0;
            Closeable closeable0;
            L.p(file1, "$toDir");
            L.p(s, "$toName");
            L.p(n0, "subscriber");
            n0.onStart();
            if(file1.exists() || file1.mkdirs()) {
                try {
                    File file2 = new File(file1, s);
                    if(file2.exists() || file2.createNewFile()) {
                        try {
                            closeable0 = null;
                            fileInputStream0 = new FileInputStream(file0);
                        }
                        catch(Throwable throwable0) {
                            throwable1 = throwable0;
                            closeable1 = null;
                            fileInputStream0 = null;
                            fileOutputStream0 = null;
                            j.a.d(new Closeable[]{closeable0, closeable1, fileInputStream0, fileOutputStream0});
                            throw throwable1;
                        }
                        try {
                            fileOutputStream0 = new FileOutputStream(file2);
                        }
                        catch(Throwable throwable2) {
                            throwable1 = throwable2;
                            closeable1 = null;
                            fileOutputStream0 = null;
                            j.a.d(new Closeable[]{closeable0, closeable1, fileInputStream0, fileOutputStream0});
                            throw throwable1;
                        }
                        try {
                            fileChannel0 = fileInputStream0.getChannel();
                        }
                        catch(Throwable throwable3) {
                            throwable1 = throwable3;
                            closeable1 = null;
                            j.a.d(new Closeable[]{closeable0, closeable1, fileInputStream0, fileOutputStream0});
                            throw throwable1;
                        }
                        try {
                            closeable0 = fileOutputStream0.getChannel();
                            fileChannel0.transferTo(0L, fileChannel0.size(), ((WritableByteChannel)closeable0));
                        }
                        catch(Throwable throwable4) {
                            throwable1 = throwable4;
                            closeable1 = closeable0;
                            closeable0 = fileChannel0;
                            j.a.d(new Closeable[]{closeable0, closeable1, fileInputStream0, fileOutputStream0});
                            throw throwable1;
                        }
                        j.a.d(new Closeable[]{fileChannel0, closeable0, fileInputStream0, fileOutputStream0});
                        n0.onNext(file2);
                    }
                    else {
                        n0.onError(new FileNotFoundException("Failed to create a file."));
                    }
                }
                catch(Exception exception0) {
                    n0.onError(exception0);
                }
            }
            else {
                n0.onError(new FileNotFoundException("Failed to create a dir."));
            }
            n0.d();
        });
        L.o(g0, "unsafeCreate(...)");
        return g0;
    }

    // 检测为 Lambda 实现
    private static final void f(File file0, String s, File file1, n n0) [...]

    @l
    public final g g(@l Context context0, @l Uri uri0) {
        L.p(context0, "context");
        L.p(uri0, "url");
        g g0 = g.M6((n n0) -> {
            L.p(context0, "$context");
            L.p(uri0, "$url");
            L.p(n0, "subscriber");
            n0.onStart();
            d d0 = s.c(context0, uri0);
            try {
                File file0 = (File)d0.get();
                if(file0 != null && file0.exists()) {
                    n0.onNext(file0);
                    n0.d();
                    return;
                }
            }
            catch(Exception exception0) {
                n0.onError(exception0);
                n0.d();
                return;
            }
            n0.onError(new FileNotFoundException("Download file not found."));
            n0.d();
        });
        L.o(g0, "unsafeCreate(...)");
        return g0;
    }

    // 检测为 Lambda 实现
    private static final void h(Context context0, Uri uri0, n n0) [...]

    @l
    public final g i(@l Context context0, @l Uri uri0, @l String s, @l String s1) {
        L.p(context0, "context");
        L.p(uri0, "url");
        L.p(s, "dir");
        L.p(s1, "name");
        g g0 = g.M6((n n0) -> {
            L.p(context0, "$context");
            L.p(uri0, "$url");
            L.p(s, "$dir");
            L.p(s1, "$name");
            L.p(n0, "subscriber");
            n0.onStart();
            try {
                n0.onNext(j.a.k(context0, uri0, s, s1));
                n0.d();
            }
            catch(Exception exception0) {
                n0.onError(exception0);
            }
        });
        L.o(g0, "unsafeCreate(...)");
        return g0;
    }

    // 检测为 Lambda 实现
    private static final void j(Context context0, Uri uri0, String s, String s1, n n0) [...]

    @l
    public final a k(@l Context context0, @l Uri uri0, @l String s, @l String s1) throws Exception {
        Response response0;
        L.p(context0, "context");
        L.p(uri0, "url");
        L.p(s, "dir");
        L.p(s1, "name");
        d d0 = s.c(context0, uri0);
        DocumentFile documentFile0 = Gk.f(s);
        try {
            File file0 = (File)d0.get();
            if(file0 != null && file0.exists()) {
                FileInputStream fileInputStream0 = new FileInputStream(file0);
                L.m(documentFile0);
                return this.n(this.m(context0, fileInputStream0, documentFile0, s1));
            }
            goto label_13;
        }
        catch(a0.a a0) {
        }
        catch(Exception unused_ex) {
            goto label_13;
        }
        throw a0;
        try {
        label_13:
            OkHttpClient okHttpClient0 = Application.e.a();
            Builder request$Builder0 = new Builder();
            String s2 = uri0.toString();
            L.o(s2, "toString(...)");
            response0 = FirebasePerfOkHttpClient.execute(okHttpClient0.newCall(request$Builder0.url(s2).build()));
            ResponseBody responseBody0 = response0.body();
            if(responseBody0 == null) {
                throw new NullPointerException("response is null");
            }
            InputStream inputStream0 = responseBody0.byteStream();
            L.m(documentFile0);
            return this.n(this.m(context0, inputStream0, documentFile0, s1));
        }
        catch(Exception exception0) {
            throw exception0;
        }
        finally {
            this.d(new Closeable[]{response0});
        }
    }

    public final void l(@l z[] arr_z) {
        L.p(arr_z, "args");
        try {
            z[] arr_z1 = (z[])Arrays.copyOf(arr_z, arr_z.length);
            z.m.b(arr_z1);
        }
        catch(Exception exception0) {
            Dl.G(Application.e.c(), exception0.getMessage());
        }
        ImageDownloadWorker.a.a(null);
    }

    @l
    public final Uri m(@l Context context0, @m InputStream inputStream0, @l DocumentFile documentFile0, @l String s) throws Exception {
        Uri uri1;
        Closeable closeable0;
        ParcelFileDescriptor parcelFileDescriptor1;
        DocumentFile documentFile1;
        int v;
        byte[] arr_b;
        BufferedInputStream bufferedInputStream0;
        String s1 = "image/jpeg";
        L.p(context0, "context");
        L.p(documentFile0, "to");
        L.p(s, "name");
        ParcelFileDescriptor parcelFileDescriptor0 = null;
        try {
            bufferedInputStream0 = new BufferedInputStream(inputStream0);
        }
        catch(Throwable throwable0) {
            closeable0 = null;
            bufferedInputStream0 = null;
            goto label_53;
        }
        try {
            arr_b = new byte[0x400];
            v = bufferedInputStream0.read(arr_b);
            String s2 = Gk.n(arr_b, "image/jpeg");
            if(s2 != null) {
                s1 = s2;
            }
            documentFile1 = documentFile0.d(s1, s);
            if(documentFile1 == null) {
                this.d(new Closeable[]{bufferedInputStream0});
                throw new a0.a("Failed to create file. PATH = " + documentFile0.n() + " NAME = " + s);
            }
            Uri uri0 = documentFile1.n();
            L.o(uri0, "getUri(...)");
            parcelFileDescriptor1 = context0.getContentResolver().openFileDescriptor(uri0, "w");
        }
        catch(Throwable throwable0) {
            closeable0 = null;
            goto label_53;
        }
        if(parcelFileDescriptor1 != null) {
            try {
                closeable0 = new FileOutputStream(parcelFileDescriptor1.getFileDescriptor());
                if(v != -1) {
                    goto label_25;
                }
                goto label_28;
            }
            catch(Throwable throwable0) {
                goto label_48;
            }
            try {
                do {
                label_25:
                    ((FileOutputStream)closeable0).write(arr_b, 0, v);
                    v = bufferedInputStream0.read(arr_b);
                }
                while(v != -1);
            label_28:
                ((OutputStream)closeable0).flush();
                ((FileOutputStream)closeable0).close();
            }
            catch(Throwable throwable0) {
                goto label_52;
            }
            try {
                bufferedInputStream0.close();
            }
            catch(Throwable throwable0) {
                goto label_48;
            }
            try {
                parcelFileDescriptor1.close();
            }
            catch(Throwable throwable0) {
                closeable0 = null;
                bufferedInputStream0 = null;
                parcelFileDescriptor0 = parcelFileDescriptor1;
                break;
            }
            try {
                uri1 = documentFile1.n();
                L.m(uri1);
            }
            catch(Throwable throwable0) {
                closeable0 = null;
                bufferedInputStream0 = null;
                goto label_53;
            }
            this.d(new Closeable[]{null, null});
            return uri1;
        }
        try {
            throw new NullPointerException("ParcelFileDescriptor == null");
        }
        catch(Throwable throwable0) {
        label_48:
            closeable0 = null;
        }
        try {
            while(true) {
                parcelFileDescriptor0 = parcelFileDescriptor1;
                break;
            label_52:
            }
        }
        catch(Throwable throwable0) {
            goto label_52;
        }
    label_53:
        if(parcelFileDescriptor0 != null) {
            try {
                parcelFileDescriptor0.close();
            }
            catch(Exception unused_ex) {
            }
        }
        this.d(new Closeable[]{bufferedInputStream0, closeable0});
        throw throwable0;
    }

    @l
    public final a n(@l Uri uri0) throws Exception {
        L.p(uri0, "trans");
        String s = Gk.g(uri0).k();
        if(s == null || s.length() == 0) {
            throw new FileNotFoundException("File name == null, uri = " + uri0);
        }
        return new a(uri0, s);
    }
}

