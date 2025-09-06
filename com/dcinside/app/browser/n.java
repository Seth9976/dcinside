package com.dcinside.app.browser;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint.Align;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.Handler.Callback;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.print.PrintDocumentAdapter;
import android.print.PrintManager;
import android.provider.MediaStore.Downloads;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.appcompat.app.AlertDialog.Builder;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentFactory;
import androidx.fragment.app.FragmentManager;
import com.dcinside.app.auth.LoginActivity;
import com.dcinside.app.main.login.g;
import com.dcinside.app.main.login.o;
import com.dcinside.app.post.PostContainerFullActivity;
import com.hjq.toast.s;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import kotlin.V;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w;
import y4.l;
import y4.m;

@s0({"SMAP\nAwesomeWebViewScript.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AwesomeWebViewScript.kt\ncom/dcinside/app/browser/AwesomeWebViewScript\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n*L\n1#1,319:1\n192#2,7:320\n*S KotlinDebug\n*F\n+ 1 AwesomeWebViewScript.kt\ncom/dcinside/app/browser/AwesomeWebViewScript\n*L\n114#1:320,7\n*E\n"})
public final class n implements Handler.Callback {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }
    }

    @l
    private final WeakReference a;
    @m
    private Handler b;
    @m
    private o c;
    @l
    public static final a d = null;
    private static final int e = 1;
    private static final int f = 2;
    private static final int g = 3;
    @l
    private static final String h = "com.dcinside.app.EXTRA_DC_REPORT_ID";
    @l
    private static final String i = "com.dcinside.app.EXTRA_DC_REPORT_NO";
    @l
    private static final String j = "com.dcinside.app.EXTRA_DC_REPORT_NICK";
    @l
    private static final String k = "com.dcinside.app.EXTRA_DC_REPORT_NAME";
    @l
    private static final String l = "com.dcinside.app.EXTRA_DC_REPORT_SUBJECT";
    @l
    private static final String m = "com.dcinside.app.EXTRA_DC_REPORT_TIME";
    @l
    private static final String n = "com.dcinside.app.EXTRA_DC_REPORT_RESULT";
    @l
    private static final String o = "com.dcinside.app.EXTRA_DC_WITHDRAW_SUCCESS";
    @l
    private static final String p = "com.dcinside.app.EXTRA_DC_ADULT_RESULT";
    @l
    private static final String q = "com.dcinside.app.EXTRA_DC_ADULT_CODE";
    @l
    private static final String r = "com.dcinside.app.EXTRA_DC_ADULT_EXPIRE_DATE";

    static {
        n.d = new a(null);
    }

    public n(@l WebView webView0) {
        L.p(webView0, "webView");
        super();
        this.a = new WeakReference(webView0);
        this.b = new Handler(Looper.getMainLooper(), this);
    }

    @JavascriptInterface
    public final void adultCode(@l String s, @l String s1) {
        L.p(s, "code");
        L.p(s1, "date");
        WebView webView0 = (WebView)this.a.get();
        AppCompatActivity appCompatActivity0 = null;
        ViewParent viewParent0 = webView0 == null ? null : webView0.getParent();
        ViewGroup viewGroup0 = viewParent0 instanceof ViewGroup ? ((ViewGroup)viewParent0) : null;
        if(viewGroup0 == null) {
            return;
        }
        Context context0 = viewGroup0.getContext();
        if(context0 instanceof AppCompatActivity) {
            appCompatActivity0 = (AppCompatActivity)context0;
        }
        if(appCompatActivity0 == null) {
            return;
        }
        appCompatActivity0.runOnUiThread(() -> {
            L.p(s, "$code");
            L.p(appCompatActivity0, "$activity");
            L.p(s1, "$date");
            if(s.length() == 0) {
                s.A(0x7F1501C9);  // string:cannot_read_adult_data "성인 인증 정보를 조회할 수 없습니다."
                appCompatActivity0.finish();
                return;
            }
            if(s1.length() == 0) {
                s.A(0x7F150BCB);  // string:wrong_adult_data "성인 인증 정보가 잘못되었습니다."
                appCompatActivity0.finish();
                return;
            }
            Intent intent0 = new Intent();
            intent0.putExtra("com.dcinside.app.EXTRA_DC_ADULT_RESULT", true);
            intent0.putExtra("com.dcinside.app.EXTRA_DC_ADULT_CODE", s);
            intent0.putExtra("com.dcinside.app.EXTRA_DC_ADULT_EXPIRE_DATE", s1);
            appCompatActivity0.setResult(-1, intent0);
            appCompatActivity0.finish();
        });
    }

    @JavascriptInterface
    public final void closeWebPage() {
        WebView webView0 = (WebView)this.a.get();
        AppCompatActivity appCompatActivity0 = null;
        ViewParent viewParent0 = webView0 == null ? null : webView0.getParent();
        ViewGroup viewGroup0 = viewParent0 instanceof ViewGroup ? ((ViewGroup)viewParent0) : null;
        if(viewGroup0 == null) {
            return;
        }
        Context context0 = viewGroup0.getContext();
        if(context0 instanceof AppCompatActivity) {
            appCompatActivity0 = (AppCompatActivity)context0;
        }
        if(appCompatActivity0 != null) {
            appCompatActivity0.runOnUiThread(() -> {
                L.p(appCompatActivity0, "$it");
                appCompatActivity0.finish();
            });
        }
    }

    @JavascriptInterface
    public final void down_security_code(@l String s, @l String s1, @l String s2) {
        L.p(s, "code");
        L.p(s1, "id");
        L.p(s2, "type");
        switch(s2) {
            case "image": {
                Handler handler1 = this.b;
                if(handler1 != null) {
                    Message message1 = handler1.obtainMessage(2, s);
                    if(message1 != null) {
                        message1.sendToTarget();
                        return;
                    }
                }
                break;
            }
            case "print": {
                Handler handler2 = this.b;
                if(handler2 != null) {
                    Message message2 = handler2.obtainMessage(3);
                    if(message2 != null) {
                        message2.sendToTarget();
                        return;
                    }
                }
                break;
            }
            case "text": {
                Handler handler0 = this.b;
                if(handler0 != null) {
                    Message message0 = handler0.obtainMessage(1, s);
                    if(message0 != null) {
                        message0.sendToTarget();
                        return;
                    }
                }
                break;
            }
        }
    }

    // 检测为 Lambda 实现
    private static final void e(String s, AppCompatActivity appCompatActivity0, String s1) [...]

    private final void f(String s) {
        WebView webView0 = (WebView)this.a.get();
        AwesomeWebViewActivity awesomeWebViewActivity0 = null;
        Context context0 = webView0 == null ? null : webView0.getContext();
        AppCompatActivity appCompatActivity0 = context0 instanceof AppCompatActivity ? ((AppCompatActivity)context0) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        Paint paint0 = new Paint(1);
        float f = appCompatActivity0.getResources().getDimension(0x7F0703E7);  // dimen:security_text_font_padding_horizontal
        paint0.setTextSize(appCompatActivity0.getResources().getDimension(0x7F0703E8));  // dimen:security_text_font_size
        paint0.setColor(0xFFFF0000);
        paint0.setTextAlign(Paint.Align.CENTER);
        paint0.setTypeface(Typeface.DEFAULT_BOLD);
        float f1 = paint0.ascent();
        int v = (int)(paint0.measureText(s) + 0.5f + f);
        Bitmap bitmap0 = Bitmap.createBitmap(v, ((int)(paint0.descent() + -f1 + 0.5f)), Bitmap.Config.ARGB_8888);
        L.o(bitmap0, "createBitmap(...)");
        Canvas canvas0 = new Canvas(bitmap0);
        canvas0.drawColor(-1);
        canvas0.drawText(s, ((float)(v / 2)), -f1, paint0);
        if(Build.VERSION.SDK_INT >= 29) {
            Intent intent0 = appCompatActivity0.getIntent();
            String s1 = String.format("%s_%s", Arrays.copyOf(new Object[]{(intent0 == null ? null : intent0.getStringExtra("extraSecurityUser")), s}, 2));
            L.o(s1, "format(...)");
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put("_display_name", s1);
            contentValues0.put("relative_path", Environment.DIRECTORY_DOWNLOADS + "/dcinside");
            contentValues0.put("mime_type", "image/png");
            ContentResolver contentResolver0 = appCompatActivity0.getContentResolver();
            if(contentResolver0 == null) {
                throw null;
            }
            Uri uri0 = contentResolver0.insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues0);
            if(uri0 == null) {
                throw null;
            }
            OutputStream outputStream0 = contentResolver0.openOutputStream(uri0);
            try {
                try {
                    if(outputStream0 != null) {
                        bitmap0.compress(Bitmap.CompressFormat.PNG, 100, outputStream0);
                    }
                    AwesomeWebViewActivity awesomeWebViewActivity1 = appCompatActivity0 instanceof AwesomeWebViewActivity ? ((AwesomeWebViewActivity)appCompatActivity0) : null;
                    if(awesomeWebViewActivity1 != null) {
                        L.o("이미지가 저장되었습니다.", "getString(...)");
                        awesomeWebViewActivity1.M1("이미지가 저장되었습니다.", appCompatActivity0);
                    }
                    goto label_56;
                }
                catch(Exception unused_ex) {
                }
                if(appCompatActivity0 instanceof AwesomeWebViewActivity) {
                    awesomeWebViewActivity0 = (AwesomeWebViewActivity)appCompatActivity0;
                }
                if(awesomeWebViewActivity0 != null) {
                    L.o("이미지를 생성할 수 없습니다.", "getString(...)");
                    awesomeWebViewActivity0.M1("이미지를 생성할 수 없습니다.", appCompatActivity0);
                }
            }
            catch(Throwable throwable0) {
                goto label_51;
            }
            if(outputStream0 != null) {
                try {
                    outputStream0.flush();
                label_48:
                    if(outputStream0 != null) {
                        outputStream0.close();
                    }
                }
                catch(IOException unused_ex) {
                }
                bitmap0.recycle();
                return;
            }
            goto label_48;
            try {
            label_51:
                if(outputStream0 != null) {
                    outputStream0.flush();
                }
                if(outputStream0 != null) {
                    outputStream0.close();
                }
            }
            catch(IOException unused_ex) {
            }
            throw throwable0;
            try {
            label_56:
                if(outputStream0 != null) {
                    outputStream0.flush();
                }
                if(outputStream0 != null) {
                    outputStream0.close();
                }
            }
            catch(IOException unused_ex) {
            }
        }
        else {
            if(appCompatActivity0 instanceof AwesomeWebViewActivity) {
                awesomeWebViewActivity0 = (AwesomeWebViewActivity)appCompatActivity0;
            }
            if(awesomeWebViewActivity0 == null) {
                return;
            }
            if(awesomeWebViewActivity0.u5("android.permission.WRITE_EXTERNAL_STORAGE")) {
                return;
            }
            awesomeWebViewActivity0.T1(s, bitmap0);
        }
        bitmap0.recycle();
    }

    // 检测为 Lambda 实现
    private static final void g(AppCompatActivity appCompatActivity0) [...]

    @JavascriptInterface
    public final void gall_make_block(@m String s) {
        WebView webView0 = (WebView)this.a.get();
        if(webView0 == null) {
            return;
        }
        ViewParent viewParent0 = webView0.getParent();
        ViewGroup viewGroup0 = viewParent0 instanceof ViewGroup ? ((ViewGroup)viewParent0) : null;
        if(viewGroup0 == null) {
            return;
        }
        Context context0 = viewGroup0.getContext();
        if(context0 instanceof AppCompatActivity) {
            webView0.post(() -> new Builder(context0).l(s).setPositiveButton(0x104000A, (DialogInterface dialogInterface0, int v) -> ((AppCompatActivity)context0).finish()).I());
        }
    }

    @JavascriptInterface
    public final void gall_make_success(@m String s) {
        WebView webView0 = (WebView)this.a.get();
        if(webView0 == null) {
            return;
        }
        ViewParent viewParent0 = webView0.getParent();
        ViewGroup viewGroup0 = viewParent0 instanceof ViewGroup ? ((ViewGroup)viewParent0) : null;
        if(viewGroup0 == null) {
            return;
        }
        Context context0 = viewGroup0.getContext();
        if(context0 instanceof AppCompatActivity) {
            Intent intent0 = new Intent(context0, PostContainerFullActivity.class);
            intent0.putExtra("com.dcinside.app.extra.GALLERY_ID", s);
            context0.startActivity(intent0);
            ((AppCompatActivity)context0).finish();
        }
    }

    private final void h(String s) {
        WebView webView0 = (WebView)this.a.get();
        AwesomeWebViewActivity awesomeWebViewActivity0 = null;
        Context context0 = webView0 == null ? null : webView0.getContext();
        AppCompatActivity appCompatActivity0 = context0 instanceof AppCompatActivity ? ((AppCompatActivity)context0) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        if(Build.VERSION.SDK_INT >= 29) {
            Intent intent0 = appCompatActivity0.getIntent();
            String s1 = String.format("%s_%s", Arrays.copyOf(new Object[]{(intent0 == null ? null : intent0.getStringExtra("extraSecurityUser")), s}, 2));
            L.o(s1, "format(...)");
            ContentValues contentValues0 = new ContentValues();
            contentValues0.put("_display_name", s1);
            contentValues0.put("relative_path", Environment.DIRECTORY_DOWNLOADS + "/dcinside");
            contentValues0.put("mime_type", "text/plain");
            ContentResolver contentResolver0 = appCompatActivity0.getContentResolver();
            if(contentResolver0 == null) {
                throw null;
            }
            Uri uri0 = contentResolver0.insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues0);
            if(uri0 == null) {
                throw null;
            }
            OutputStream outputStream0 = contentResolver0.openOutputStream(uri0);
            try {
                if(outputStream0 != null) {
                    Charset charset0 = StandardCharsets.UTF_8;
                    L.o(charset0, "UTF_8");
                    byte[] arr_b = s.getBytes(charset0);
                    L.o(arr_b, "getBytes(...)");
                    outputStream0.write(arr_b);
                }
                if(outputStream0 != null) {
                    outputStream0.flush();
                }
                if(outputStream0 != null) {
                    outputStream0.close();
                }
            }
            catch(Exception unused_ex) {
                goto label_37;
            }
            catch(Throwable throwable0) {
                awesomeWebViewActivity0 = outputStream0;
                goto label_49;
            }
            try {
                AwesomeWebViewActivity awesomeWebViewActivity1 = appCompatActivity0 instanceof AwesomeWebViewActivity ? ((AwesomeWebViewActivity)appCompatActivity0) : null;
                if(awesomeWebViewActivity1 != null) {
                    L.o("파일이 저장되었습니다.", "getString(...)");
                    awesomeWebViewActivity1.M1("파일이 저장되었습니다.", appCompatActivity0);
                    return;
                }
                return;
            }
            catch(Exception unused_ex) {
                outputStream0 = null;
            }
            catch(Throwable throwable0) {
                goto label_49;
            }
            try {
            label_37:
                if(appCompatActivity0 instanceof AwesomeWebViewActivity) {
                    awesomeWebViewActivity0 = (AwesomeWebViewActivity)appCompatActivity0;
                }
                if(awesomeWebViewActivity0 != null) {
                    L.o("파일을 생성할 수 없습니다.", "getString(...)");
                    awesomeWebViewActivity0.M1("파일을 생성할 수 없습니다.", appCompatActivity0);
                }
            }
            catch(Throwable throwable0) {
                awesomeWebViewActivity0 = outputStream0;
                goto label_49;
            }
            if(outputStream0 != null) {
                try {
                    outputStream0.close();
                }
                catch(IOException unused_ex) {
                }
                return;
            label_49:
                if(awesomeWebViewActivity0 != null) {
                    try {
                        ((OutputStream)awesomeWebViewActivity0).close();
                    }
                    catch(IOException unused_ex) {
                    }
                }
                throw throwable0;
            }
        }
        else {
            if(appCompatActivity0 instanceof AwesomeWebViewActivity) {
                awesomeWebViewActivity0 = (AwesomeWebViewActivity)appCompatActivity0;
            }
            if(awesomeWebViewActivity0 == null) {
                return;
            }
            if(awesomeWebViewActivity0.u5("android.permission.WRITE_EXTERNAL_STORAGE")) {
                return;
            }
            awesomeWebViewActivity0.X1(s);
        }
    }

    @Override  // android.os.Handler$Callback
    public boolean handleMessage(@l Message message0) {
        L.p(message0, "msg");
        switch(message0.what) {
            case 1: {
                this.h(message0.obj.toString());
                return true;
            }
            case 2: {
                this.f(message0.obj.toString());
                return true;
            }
            case 3: {
                this.k();
                return true;
            }
            default: {
                return false;
            }
        }
    }

    // 检测为 Lambda 实现
    private static final void i(Context context0, String s) [...]

    // 检测为 Lambda 实现
    private static final void j(Context context0, DialogInterface dialogInterface0, int v) [...]

    private final void k() {
        WebView webView0 = (WebView)this.a.get();
        if(webView0 == null) {
            return;
        }
        ViewParent viewParent0 = webView0.getParent();
        ViewGroup viewGroup0 = viewParent0 instanceof ViewGroup ? ((ViewGroup)viewParent0) : null;
        if(viewGroup0 == null) {
            return;
        }
        Context context0 = viewGroup0.getContext();
        AppCompatActivity appCompatActivity0 = context0 instanceof AppCompatActivity ? ((AppCompatActivity)context0) : null;
        if(appCompatActivity0 == null) {
            return;
        }
        try {
            Object object0 = appCompatActivity0.getSystemService("print");
            PrintManager printManager0 = object0 instanceof PrintManager ? ((PrintManager)object0) : null;
            if(printManager0 == null) {
                return;
            }
            L.o("디시인사이드", "getString(...)");
            PrintDocumentAdapter printDocumentAdapter0 = webView0.createPrintDocumentAdapter("디시인사이드");
            L.o(printDocumentAdapter0, "createPrintDocumentAdapter(...)");
            printManager0.print("디시인사이드", printDocumentAdapter0, null);
        }
        catch(Exception exception0) {
            String s = exception0.getLocalizedMessage();
            if(s == null) {
                s = "인쇄 정보를 불러올 수 없습니다.";
                L.o("인쇄 정보를 불러올 수 없습니다.", "getString(...)");
            }
            s.F(s);
        }
    }

    public final void l() {
        Handler handler0 = this.b;
        if(handler0 != null) {
            handler0.removeCallbacksAndMessages(null);
        }
        this.b = null;
        this.a.clear();
        o o0 = this.c;
        if(o0 != null) {
            o0.dismissAllowingStateLoss();
        }
        this.c = null;
    }

    @JavascriptInterface
    public final void memberOutSuccess() {
        WebView webView0 = (WebView)this.a.get();
        AppCompatActivity appCompatActivity0 = null;
        ViewParent viewParent0 = webView0 == null ? null : webView0.getParent();
        ViewGroup viewGroup0 = viewParent0 instanceof ViewGroup ? ((ViewGroup)viewParent0) : null;
        if(viewGroup0 == null) {
            return;
        }
        Context context0 = viewGroup0.getContext();
        if(context0 instanceof AppCompatActivity) {
            appCompatActivity0 = (AppCompatActivity)context0;
        }
        if(appCompatActivity0 != null) {
            Intent intent0 = new Intent();
            intent0.putExtra("com.dcinside.app.EXTRA_DC_WITHDRAW_SUCCESS", true);
            appCompatActivity0.setResult(-1, intent0);
            appCompatActivity0.finish();
        }
    }

    @JavascriptInterface
    public final void moveLogin() {
        WebView webView0 = (WebView)this.a.get();
        if(webView0 == null) {
            return;
        }
        ViewParent viewParent0 = webView0.getParent();
        ViewGroup viewGroup0 = viewParent0 instanceof ViewGroup ? ((ViewGroup)viewParent0) : null;
        if(viewGroup0 == null) {
            return;
        }
        Context context0 = viewGroup0.getContext();
        if(context0 instanceof AppCompatActivity) {
            if(g.a.p()) {
                FragmentManager fragmentManager0 = ((AppCompatActivity)context0).getSupportFragmentManager();
                L.o(fragmentManager0, "getSupportFragmentManager(...)");
                FragmentFactory fragmentFactory0 = fragmentManager0.G0();
                ClassLoader classLoader0 = o.class.getClassLoader();
                L.m(classLoader0);
                Fragment fragment0 = fragmentFactory0.a(classLoader0, "com.dcinside.app.main.login.o");
                if(fragment0 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.dcinside.app.main.login.SettingSimpleLoginFragment");
                }
                ((o)fragment0).setArguments(BundleKt.b(((V[])Arrays.copyOf(new V[0], 0))));
                ((o)fragment0).show(fragmentManager0, "com.dcinside.app.main.login.o");
                this.c = (o)fragment0;
                return;
            }
            ((AppCompatActivity)context0).startActivityForResult(new Intent(context0, LoginActivity.class), 3080);
        }
    }

    @JavascriptInterface
    public final void reportFinish(@l String s, @l String s1, @l String s2, @l String s3, @l String s4, @l String s5) {
        L.p(s, "id");
        L.p(s1, "no");
        L.p(s2, "nick");
        L.p(s3, "name");
        L.p(s4, "subject");
        L.p(s5, "time");
        WebView webView0 = (WebView)this.a.get();
        AppCompatActivity appCompatActivity0 = null;
        ViewParent viewParent0 = webView0 == null ? null : webView0.getParent();
        ViewGroup viewGroup0 = viewParent0 instanceof ViewGroup ? ((ViewGroup)viewParent0) : null;
        if(viewGroup0 == null) {
            return;
        }
        Context context0 = viewGroup0.getContext();
        if(context0 instanceof AppCompatActivity) {
            appCompatActivity0 = (AppCompatActivity)context0;
        }
        if(appCompatActivity0 != null) {
            Intent intent0 = new Intent();
            intent0.putExtra("com.dcinside.app.EXTRA_DC_REPORT_ID", s);
            intent0.putExtra("com.dcinside.app.EXTRA_DC_REPORT_NO", s1);
            intent0.putExtra("com.dcinside.app.EXTRA_DC_REPORT_NICK", s2);
            intent0.putExtra("com.dcinside.app.EXTRA_DC_REPORT_NAME", s3);
            intent0.putExtra("com.dcinside.app.EXTRA_DC_REPORT_SUBJECT", s4);
            intent0.putExtra("com.dcinside.app.EXTRA_DC_REPORT_TIME", s5);
            intent0.putExtra("com.dcinside.app.EXTRA_DC_REPORT_RESULT", true);
            appCompatActivity0.setResult(-1, intent0);
            appCompatActivity0.finish();
        }
    }
}

