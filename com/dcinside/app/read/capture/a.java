package com.dcinside.app.read.capture;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import android.provider.MediaStore.Downloads;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.util.SparseArray;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.dcinside.app.internal.s;
import com.dcinside.app.model.Mention;
import com.dcinside.app.model.Q;
import com.dcinside.app.perform.r;
import com.dcinside.app.read.C;
import com.dcinside.app.read.Q0;
import com.dcinside.app.read.x;
import com.dcinside.app.span.p;
import com.dcinside.app.type.t;
import com.dcinside.app.util.Bk;
import com.dcinside.app.util.Ck;
import com.dcinside.app.util.Dl;
import com.dcinside.app.util.ol;
import com.dcinside.app.util.uk;
import com.dcinside.app.util.vk;
import com.dcinside.app.view.PostReadFooterView;
import com.dcinside.app.view.PostReadHeaderView;
import com.dcinside.app.view.ResizeTextView;
import com.dcinside.app.wv.VideoEnabledWebView;
import com.facebook.drawee.view.SimpleDraweeView;
import j..time.LocalDateTime;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.S0;
import kotlin.V;
import kotlin.collections.T;
import kotlin.collections.u;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.r0;
import kotlinx.coroutines.O;
import kotlinx.coroutines.h0;
import kotlinx.coroutines.i;
import y4.l;
import y4.m;
import z3.n;

@s0({"SMAP\nCaptureImg.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CaptureImg.kt\ncom/dcinside/app/read/capture/CaptureImg\n+ 2 DcInternals.kt\ncom/dcinside/app/internal/DcInternalsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,836:1\n177#2,9:837\n177#2,9:894\n257#3,2:846\n257#3,2:848\n257#3,2:850\n257#3,2:852\n257#3,2:854\n257#3,2:856\n327#3,4:905\n327#3,4:909\n1611#4,9:858\n1863#4:867\n1864#4:869\n1620#4:870\n1053#4:871\n1557#4:872\n1628#4,3:873\n1053#4:877\n1557#4:878\n1628#4,3:879\n1863#4,2:882\n1863#4,2:884\n1863#4,2:886\n1863#4,2:888\n1863#4,2:890\n1863#4,2:892\n1#5:868\n1#5:876\n13346#6,2:903\n*S KotlinDebug\n*F\n+ 1 CaptureImg.kt\ncom/dcinside/app/read/capture/CaptureImg\n*L\n205#1:837,9\n571#1:894,9\n336#1:846,2\n337#1:848,2\n339#1:850,2\n340#1:852,2\n341#1:854,2\n342#1:856,2\n766#1:905,4\n802#1:909,4\n379#1:858,9\n379#1:867\n379#1:869\n379#1:870\n401#1:871\n401#1:872\n401#1:873,3\n415#1:877\n415#1:878\n415#1:879,3\n460#1:882,2\n476#1:884,2\n487#1:886,2\n489#1:888,2\n490#1:890,2\n491#1:892,2\n379#1:868\n603#1:903,2\n*E\n"})
public final class a {
    public static final class com.dcinside.app.read.capture.a.a {
        @m
        private final Bitmap a;
        @m
        private final Uri b;
        @m
        private final Throwable c;

        public com.dcinside.app.read.capture.a.a(@m Bitmap bitmap0, @m Uri uri0, @m Throwable throwable0) {
            this.a = bitmap0;
            this.b = uri0;
            this.c = throwable0;
        }

        @m
        public final Bitmap a() {
            return this.a;
        }

        @m
        public final Uri b() {
            return this.b;
        }

        @m
        public final Throwable c() {
            return this.c;
        }

        @l
        public final com.dcinside.app.read.capture.a.a d(@m Bitmap bitmap0, @m Uri uri0, @m Throwable throwable0) {
            return new com.dcinside.app.read.capture.a.a(bitmap0, uri0, throwable0);
        }

        public static com.dcinside.app.read.capture.a.a e(com.dcinside.app.read.capture.a.a a$a0, Bitmap bitmap0, Uri uri0, Throwable throwable0, int v, Object object0) {
            if((v & 1) != 0) {
                bitmap0 = a$a0.a;
            }
            if((v & 2) != 0) {
                uri0 = a$a0.b;
            }
            if((v & 4) != 0) {
                throwable0 = a$a0.c;
            }
            return a$a0.d(bitmap0, uri0, throwable0);
        }

        @Override
        public boolean equals(@m Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof com.dcinside.app.read.capture.a.a)) {
                return false;
            }
            if(!L.g(this.a, ((com.dcinside.app.read.capture.a.a)object0).a)) {
                return false;
            }
            return L.g(this.b, ((com.dcinside.app.read.capture.a.a)object0).b) ? L.g(this.c, ((com.dcinside.app.read.capture.a.a)object0).c) : false;
        }

        @m
        public final Bitmap f() {
            return this.a;
        }

        @m
        public final Throwable g() {
            return this.c;
        }

        @m
        public final Uri h() {
            return this.b;
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = this.a == null ? 0 : this.a.hashCode();
            int v2 = this.b == null ? 0 : this.b.hashCode();
            Throwable throwable0 = this.c;
            if(throwable0 != null) {
                v = throwable0.hashCode();
            }
            return (v1 * 0x1F + v2) * 0x1F + v;
        }

        @Override
        @l
        public String toString() {
            return "CaptureResult(bitmap=" + this.a + ", uri=" + this.b + ", error=" + this.c + ")";
        }
    }

    public static final class b {
        @l
        private final TextView a;
        @l
        private final TextView b;
        @l
        private final TextView c;
        @l
        private final View d;
        @l
        private final ImageView e;
        @l
        private final TextView f;
        @l
        private final TextView g;
        @l
        private final View h;
        @l
        private final View i;

        public b(@l View view0) {
            L.p(view0, "view");
            super();
            View view1 = view0.findViewById(0x7F0B0C34);  // id:read_footer_like_text
            L.o(view1, "findViewById(...)");
            this.a = (TextView)view1;
            View view2 = view0.findViewById(0x7F0B0C33);  // id:read_footer_like_mem_text
            L.o(view2, "findViewById(...)");
            this.b = (TextView)view2;
            View view3 = view0.findViewById(0x7F0B0C31);  // id:read_footer_dislike_text
            L.o(view3, "findViewById(...)");
            this.c = (TextView)view3;
            View view4 = view0.findViewById(0x7F0B0C30);  // id:read_footer_dislike_ic
            L.o(view4, "findViewById(...)");
            this.d = view4;
            View view5 = view0.findViewById(0x7F0B0C32);  // id:read_footer_like_ic
            L.o(view5, "findViewById(...)");
            this.e = (ImageView)view5;
            View view6 = view0.findViewById(0x7F0B0C39);  // id:read_footer_search_nick
            L.o(view6, "findViewById(...)");
            this.f = (TextView)view6;
            View view7 = view0.findViewById(0x7F0B0C38);  // id:read_footer_search_link
            L.o(view7, "findViewById(...)");
            this.g = (TextView)view7;
            View view8 = view0.findViewById(0x7F0B0C37);  // id:read_footer_report_post
            L.o(view8, "findViewById(...)");
            this.h = view8;
            View view9 = view0.findViewById(0x7F0B0C29);  // id:read_footer_archive_manager
            L.o(view9, "findViewById(...)");
            this.i = view9;
        }

        @l
        public final View a() {
            return this.i;
        }

        @l
        public final TextView b() {
            return this.c;
        }

        @l
        public final View c() {
            return this.d;
        }

        @l
        public final TextView d() {
            return this.a;
        }

        @l
        public final ImageView e() {
            return this.e;
        }

        @l
        public final TextView f() {
            return this.b;
        }

        @l
        public final View g() {
            return this.h;
        }

        @l
        public final TextView h() {
            return this.g;
        }

        @l
        public final TextView i() {
            return this.f;
        }
    }

    @l
    public static final a a = null;
    @l
    private static final Bitmap.Config b = null;
    @l
    private static final String c = "wv_temp_%04d.jpeg";
    @l
    private static final String d = "header_capture.jpeg";
    @l
    private static final String e = "reply_temp_%04d.jpeg";
    @l
    private static final String f = "header_title.jpeg";
    @l
    private static final String g = "url_title.jpeg";
    @l
    private static final String h = "footer_view.jpeg";

    static {
        a.a = new a();
        a.b = Bitmap.Config.RGB_565;
    }

    @m
    @n
    public static final Object b(@l Context context0, @l PostReadHeaderView postReadHeaderView0, @l VideoEnabledWebView videoEnabledWebView0, @l SparseArray sparseArray0, @l x x0, @l RecyclerView recyclerView0, @l Q q0, boolean z, @l d d0) {
        @f(c = "com.dcinside.app.read.capture.CaptureImg", f = "CaptureImg.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {0xA0}, m = "capturePostRead", n = {"ctx", "header", "replyHolderArray", "adapter", "recycler", "postInfo", "url", "gallName", "isAll"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "Z$0"})
        static final class c extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            Object m;
            Object n;
            Object o;
            Object p;
            Object q;
            Object r;
            boolean s;
            Object t;
            int u;

            c(d d0) {
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                this.t = object0;
                this.u |= 0x80000000;
                return a.b(null, null, null, null, null, null, null, false, this);
            }
        }

        Object object2;
        String s1;
        String s;
        c a$c0;
        if(d0 instanceof c) {
            a$c0 = (c)d0;
            int v = a$c0.u;
            if((v & 0x80000000) == 0) {
                a$c0 = new c(d0);
            }
            else {
                a$c0.u = v ^ 0x80000000;
            }
        }
        else {
            a$c0 = new c(d0);
        }
        Object object0 = a$c0.t;
        Object object1 = kotlin.coroutines.intrinsics.b.l();
        switch(a$c0.u) {
            case 0: {
                f0.n(object0);
                try {
                    s = uk.TG(q0.G0(), q0.c1(), q0.F0());
                    s1 = q0.H0();
                    a$c0.k = context0;
                    a$c0.l = postReadHeaderView0;
                    a$c0.m = sparseArray0;
                    a$c0.n = x0;
                    a$c0.o = recyclerView0;
                    a$c0.p = q0;
                    a$c0.q = s;
                    a$c0.r = s1;
                    a$c0.s = z;
                    a$c0.u = 1;
                    object2 = a.a.e(videoEnabledWebView0, a$c0);
                    if(object2 == object1) {
                        return object1;
                    }
                    goto label_44;
                }
                catch(Exception exception0) {
                    break;
                }
            }
            case 1: {
                z = a$c0.s;
                String s2 = (String)a$c0.r;
                String s3 = (String)a$c0.q;
                q0 = (Q)a$c0.p;
                recyclerView0 = (RecyclerView)a$c0.o;
                x0 = (x)a$c0.n;
                sparseArray0 = (SparseArray)a$c0.m;
                PostReadHeaderView postReadHeaderView1 = (PostReadHeaderView)a$c0.l;
                Context context1 = (Context)a$c0.k;
                try {
                    f0.n(object0);
                    s1 = s2;
                    context0 = context1;
                    s = s3;
                    postReadHeaderView0 = postReadHeaderView1;
                    object2 = object0;
                label_44:
                    if(!q0.K0()) {
                        View view0 = a.a.j(q0, sparseArray0);
                        Bitmap bitmap0 = a.a.d(view0);
                        a.a.o(context0, bitmap0, "footer_view.jpeg");
                    }
                    a.a.o(context0, a.a.d(postReadHeaderView0), "header_capture.jpeg");
                    a.a.g(context0, s1, q0.F0().d(q0));
                    a.a.h(context0, s);
                    List list0 = z ? a.a.c(sparseArray0, x0, recyclerView0) : null;
                    Uri uri0 = a.a.i(context0, a.a.f(context0, ((List)object2), list0));
                    return new com.dcinside.app.read.capture.a.a(a.a.n(context0, uri0), uri0, null);
                }
                catch(Exception exception0) {
                    break;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        timber.log.b.a.y(exception0);
        return new com.dcinside.app.read.capture.a.a(null, null, exception0);
    }

    private final List c(SparseArray sparseArray0, x x0, RecyclerView recyclerView0) {
        V v0 = x0.U();
        Integer integer0 = (Integer)v0.b();
        int v1 = View.MeasureSpec.makeMeasureSpec(recyclerView0.getWidth(), 0x40000000);
        L.m(integer0);
        kotlin.ranges.l l0 = new kotlin.ranges.l(((int)(((Integer)v0.a()))), ((int)integer0));
        List list0 = new ArrayList();
        Iterator iterator0 = l0.iterator();
        while(iterator0.hasNext()) {
            int v2 = ((T)iterator0).b();
            File file0 = a.a.k(v1, 0, sparseArray0, x0, v2);
            if(file0 != null) {
                list0.add(file0);
            }
        }
        return list0;
    }

    private final Bitmap d(View view0) {
        Bitmap bitmap0 = Bitmap.createBitmap(view0.getWidth(), view0.getHeight(), a.b);
        L.o(bitmap0, "createBitmap(...)");
        Canvas canvas0 = new Canvas(bitmap0);
        Context context0 = view0.getContext();
        L.o(context0, "getContext(...)");
        canvas0.drawColor(vk.b(context0, 0x1010054));
        view0.draw(canvas0);
        return bitmap0;
    }

    private final Object e(WebView webView0, d d0) {
        @f(c = "com.dcinside.app.read.capture.CaptureImg", f = "CaptureImg.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {0xE1}, m = "captureWeb", n = {"this", "wv", "ctx", "files", "bmp", "bgColor", "width", "height", "drawn", "count", "partSize", "saveHeight"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "I$3", "I$4", "I$5", "I$6"})
        static final class com.dcinside.app.read.capture.a.d extends kotlin.coroutines.jvm.internal.d {
            Object k;
            Object l;
            Object m;
            Object n;
            Object o;
            int p;
            int q;
            int r;
            int s;
            int t;
            int u;
            int v;
            Object w;
            final a x;
            int y;

            com.dcinside.app.read.capture.a.d(a a0, d d0) {
                this.x = a0;
                super(d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                this.w = object0;
                this.y |= 0x80000000;
                return this.x.e(null, this);
            }
        }


        @f(c = "com.dcinside.app.read.capture.CaptureImg$captureWeb$2", f = "CaptureImg.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        static final class e extends o implements A3.o {
            int k;
            final WebView l;
            final Canvas m;

            e(WebView webView0, Canvas canvas0, d d0) {
                this.l = webView0;
                this.m = canvas0;
                super(2, d0);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @l
            public final d create(@m Object object0, @l d d0) {
                return new e(this.l, this.m, d0);
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((O)object0), ((d)object1));
            }

            @m
            public final Object invoke(@l O o0, @m d d0) {
                return ((e)this.create(o0, d0)).invokeSuspend(S0.a);
            }

            @Override  // kotlin.coroutines.jvm.internal.a
            @m
            public final Object invokeSuspend(@l Object object0) {
                if(this.k != 0) {
                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
                f0.n(object0);
                this.l.draw(this.m);
                return S0.a;
            }
        }

        Bitmap bitmap0;
        int v7;
        WebView webView1;
        int v6;
        int v5;
        int v4;
        List list0;
        int v3;
        a a0;
        int v2;
        int v1;
        Context context1;
        com.dcinside.app.read.capture.a.d a$d0;
        if(d0 instanceof com.dcinside.app.read.capture.a.d) {
            a$d0 = (com.dcinside.app.read.capture.a.d)d0;
            int v = a$d0.y;
            if((v & 0x80000000) == 0) {
                a$d0 = new com.dcinside.app.read.capture.a.d(this, d0);
            }
            else {
                a$d0.y = v ^ 0x80000000;
            }
        }
        else {
            a$d0 = new com.dcinside.app.read.capture.a.d(this, d0);
        }
        Object object0 = a$d0.w;
        Object object1 = kotlin.coroutines.intrinsics.b.l();
        switch(a$d0.y) {
            case 0: {
                f0.n(object0);
                Context context0 = webView0.getContext();
                L.m(context0);
                context1 = context0;
                v1 = vk.b(context0, 0x1010054);
                v2 = webView0.getWidth();
                a0 = this;
                v3 = webView0.getHeight();
                list0 = new ArrayList();
                v4 = 760;
                v5 = 0;
                v6 = 0;
                webView1 = webView0;
                goto label_49;
            }
            case 1: {
                v7 = a$d0.v;
                v4 = a$d0.u;
                v5 = a$d0.t;
                v6 = a$d0.s;
                v3 = a$d0.r;
                v2 = a$d0.q;
                v1 = a$d0.p;
                bitmap0 = (Bitmap)a$d0.o;
                list0 = (List)a$d0.n;
                context1 = (Context)a$d0.m;
                WebView webView2 = (WebView)a$d0.l;
                a0 = (a)a$d0.k;
                f0.n(object0);
                webView1 = webView2;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        while(true) {
            String s = String.format("wv_temp_%04d.jpeg", Arrays.copyOf(new Object[]{kotlin.coroutines.jvm.internal.b.f(v5)}, 1));
            L.o(s, "format(...)");
            L.m(context1);
            File file0 = a0.o(context1, bitmap0, s);
            L.m(file0);
            list0.add(file0);
            v6 += v7;
            ++v5;
        label_49:
            if(v6 >= v3) {
                break;
            }
            v7 = Math.min(v3 - v6, v4);
            if(v7 <= 1) {
                break;
            }
            bitmap0 = Bitmap.createBitmap(v2, v7, a.b);
            L.o(bitmap0, "createBitmap(...)");
            Canvas canvas0 = new Canvas(bitmap0);
            canvas0.drawColor(v1);
            canvas0.translate(0.0f, -((float)v6));
            e a$e0 = new e(webView1, canvas0, null);
            a$d0.k = a0;
            a$d0.l = webView1;
            a$d0.m = context1;
            a$d0.n = list0;
            a$d0.o = bitmap0;
            a$d0.p = v1;
            a$d0.q = v2;
            a$d0.r = v3;
            a$d0.s = v6;
            a$d0.t = v5;
            a$d0.u = v4;
            a$d0.v = v7;
            a$d0.y = 1;
            if(i.h(h0.e(), a$e0, a$d0) != object1) {
                continue;
            }
            return object1;
        }
        return list0;
    }

    private final Bitmap f(Context context0, List list0, List list1) {
        @s0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 CaptureImg.kt\ncom/dcinside/app/read/capture/CaptureImg\n*L\n1#1,102:1\n401#2:103\n*E\n"})
        public static final class com.dcinside.app.read.capture.a.f implements Comparator {
            @Override
            public final int compare(Object object0, Object object1) {
                return kotlin.comparisons.a.l(((File)object0).getName(), ((File)object1).getName());
            }
        }


        @s0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 CaptureImg.kt\ncom/dcinside/app/read/capture/CaptureImg\n*L\n1#1,102:1\n415#2:103\n*E\n"})
        public static final class g implements Comparator {
            @Override
            public final int compare(Object object0, Object object1) {
                return kotlin.comparisons.a.l(((File)object0).getName(), ((File)object1).getName());
            }
        }


        static final class h extends N implements Function1 {
            public static final h e;

            static {
                h.e = new h();
            }

            h() {
                super(1);
            }

            @m
            public final ol a(@l ol ol0) {
                L.p(ol0, "<name for destructuring parameter 0>");
                int v = ol0.a();
                int v1 = ol0.b();
                return v <= 720 ? null : ol.e.d(v, v1, 720, v1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((ol)object0));
            }
        }


        static final class com.dcinside.app.read.capture.a.i extends N implements Function1 {
            public static final com.dcinside.app.read.capture.a.i e;

            static {
                com.dcinside.app.read.capture.a.i.e = new com.dcinside.app.read.capture.a.i();
            }

            com.dcinside.app.read.capture.a.i() {
                super(1);
            }

            @m
            public final ol a(@l ol ol0) {
                L.p(ol0, "<name for destructuring parameter 0>");
                int v = ol0.a();
                int v1 = ol0.b();
                return v <= 720 ? null : ol.e.d(v, v1, 720, v1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((ol)object0));
            }
        }

        int v6;
        File file0 = this.l(context0, "url_title.jpeg");
        File file1 = this.l(context0, "header_title.jpeg");
        File file2 = this.l(context0, "header_capture.jpeg");
        File file3 = this.l(context0, "footer_view.jpeg");
        String s = file0.getPath();
        L.o(s, "getPath(...)");
        Iterable iterable0 = null;
        int v = com.dcinside.app.util.ol.b.c(ol.e, s, false, 2, null).g();
        String s1 = file1.getPath();
        L.o(s1, "getPath(...)");
        int v1 = com.dcinside.app.util.ol.b.c(ol.e, s1, false, 2, null).g();
        String s2 = file2.getPath();
        L.o(s2, "getPath(...)");
        ol ol0 = com.dcinside.app.util.ol.b.c(ol.e, s2, false, 2, null);
        int v2 = ol0.a();
        int v3 = ol0.b();
        Iterable iterable1 = u.u5(list0, new com.dcinside.app.read.capture.a.f());
        ArrayList arrayList0 = new ArrayList(u.b0(iterable1, 10));
        for(Object object0: iterable1) {
            String s3 = ((File)object0).getPath();
            L.o(s3, "getPath(...)");
            String s4 = com.dcinside.app.write.d.d(com.dcinside.app.write.d.a, s3, ((File)object0), 0, null, h.e, 12, null);
            arrayList0.add(r0.a(s4, com.dcinside.app.util.ol.b.c(ol.e, s4, false, 2, null)));
        }
        int v4 = 0;
        for(Object object1: arrayList0) {
            v4 += ((ol)((V)object1).f()).g();
        }
        String s5 = file3.getPath();
        L.o(s5, "getPath(...)");
        int v5 = com.dcinside.app.util.ol.b.c(ol.e, s5, false, 2, null).g();
        if(list1 == null) {
            v6 = 0;
        }
        else {
            List list2 = u.u5(list1, new g());
            if(list2 == null) {
                v6 = 0;
            }
            else {
                ArrayList arrayList1 = new ArrayList(u.b0(list2, 10));
                for(Object object2: list2) {
                    String s6 = ((File)object2).getPath();
                    L.o(s6, "getPath(...)");
                    String s7 = com.dcinside.app.write.d.d(com.dcinside.app.write.d.a, s6, ((File)object2), 0, null, com.dcinside.app.read.capture.a.i.e, 12, null);
                    arrayList1.add(r0.a(s7, com.dcinside.app.util.ol.b.c(ol.e, s7, false, 2, null)));
                }
                v6 = 0;
                iterable0 = arrayList1;
            }
        }
        if(iterable0 != null) {
            for(Object object3: iterable0) {
                v6 += ((ol)((V)object3).f()).g();
            }
        }
        Bitmap bitmap0 = Bitmap.createBitmap(v2, v1 + v + v3 + v4 + v5 + v6, a.b);
        L.o(bitmap0, "createBitmap(...)");
        Canvas canvas0 = new Canvas(bitmap0);
        Paint paint0 = new Paint();
        BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
        bitmapFactory$Options0.inPreferredConfig = a.b;
        Bitmap bitmap1 = BitmapFactory.decodeFile(file0.getPath(), bitmapFactory$Options0);
        if(bitmap1 != null) {
            canvas0.drawBitmap(bitmap1, 0.0f, 0.0f, paint0);
            bitmap1.recycle();
        }
        Bitmap bitmap2 = BitmapFactory.decodeFile(file1.getPath(), bitmapFactory$Options0);
        if(bitmap2 != null) {
            canvas0.drawBitmap(bitmap2, 0.0f, ((float)v) + 0.0f, paint0);
            bitmap2.recycle();
        }
        float f = ((float)v) + 0.0f + ((float)v1);
        Bitmap bitmap3 = BitmapFactory.decodeFile(file2.getPath(), bitmapFactory$Options0);
        canvas0.drawBitmap(bitmap3, 0.0f, f, paint0);
        bitmap3.recycle();
        float f1 = f + ((float)v3);
        for(Object object4: arrayList0) {
            Bitmap bitmap4 = BitmapFactory.decodeFile(((String)((V)object4).a()), bitmapFactory$Options0);
            canvas0.drawBitmap(bitmap4, 0.0f, f1, paint0);
            f1 += (float)((ol)((V)object4).b()).g();
            bitmap4.recycle();
        }
        Bitmap bitmap5 = BitmapFactory.decodeFile(file3.getPath(), bitmapFactory$Options0);
        if(bitmap5 != null) {
            canvas0.drawBitmap(bitmap5, 0.0f, f1, paint0);
            bitmap5.recycle();
        }
        float f2 = f1 + ((float)v5);
        if(iterable0 != null) {
            for(Object object5: iterable0) {
                Bitmap bitmap6 = BitmapFactory.decodeFile(((String)((V)object5).a()), bitmapFactory$Options0);
                canvas0.drawBitmap(bitmap6, 0.0f, f2, paint0);
                f2 += (float)((ol)((V)object5).b()).g();
                bitmap6.recycle();
            }
        }
        file0.delete();
        file1.delete();
        file2.delete();
        for(Object object6: list0) {
            ((File)object6).delete();
        }
        file3.delete();
        if(list1 != null) {
            for(Object object7: list1) {
                ((File)object7).delete();
            }
        }
        for(Object object8: arrayList0) {
            new File(((String)((V)object8).e())).delete();
        }
        if(iterable0 != null) {
            for(Object object9: iterable0) {
                new File(((String)((V)object9).e())).delete();
            }
        }
        return bitmap0;
    }

    private final File g(Context context0, String s, @DrawableRes int v) {
        if(s == null) {
            s = "디시인사이드";
            L.o("디시인사이드", "getString(...)");
        }
        FrameLayout frameLayout0 = new FrameLayout(context0);
        frameLayout0.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
        frameLayout0.setBackgroundColor(vk.b(context0, 0x7F040158));  // attr:colorPrimary
        TextView textView0 = new TextView(context0);
        textView0.setGravity(17);
        textView0.setTextSize(17.0f);
        textView0.setTextColor(ContextCompat.getColor(context0, 0x7F06012D));  // color:grey5
        textView0.setText(s);
        if(v == 0) {
            s.i(textView0).clear();
        }
        else {
            s.i(textView0).d(v).c(3);
        }
        frameLayout0.addView(textView0, new FrameLayout.LayoutParams(-2, -2, 17));
        frameLayout0.measure(View.MeasureSpec.makeMeasureSpec(0, 0x40000000), View.MeasureSpec.makeMeasureSpec(0, 0x40000000));
        frameLayout0.layout(0, 0, frameLayout0.getMeasuredWidth(), frameLayout0.getMeasuredHeight());
        return this.o(context0, this.d(frameLayout0), "header_title.jpeg");
    }

    private final File h(Context context0, String s) {
        if(s == null) {
            return null;
        }
        TextView textView0 = new TextView(context0);
        textView0.setWidth(0);
        textView0.setHeight(0);
        textView0.setGravity(17);
        textView0.setTextSize(13.0f);
        textView0.setTextColor(ContextCompat.getColor(context0, 0x7F060129));  // color:grey1
        textView0.setText(s);
        textView0.measure(0, 0);
        textView0.layout(0, 0, textView0.getMeasuredWidth(), textView0.getMeasuredHeight());
        return this.o(context0, this.d(textView0), "url_title.jpeg");
    }

    private final Uri i(Context context0, Bitmap bitmap0) {
        File file0;
        OutputStream outputStream0;
        Uri uri1;
        String s;
        Uri uri0 = null;
        try {
            LocalDateTime localDateTime0 = LocalDateTime.now();
            L.o(localDateTime0, "now(...)");
            s = context0.getString(0x7F1501CA, new Object[]{Bk.a.d(localDateTime0)});  // string:capture_bitmap_file_name "dccapture_%s.jpg"
            L.o(s, "getString(...)");
            if(Build.VERSION.SDK_INT >= 29) {
                ContentValues contentValues0 = new ContentValues();
                contentValues0.put("_display_name", s);
                contentValues0.put("relative_path", Environment.DIRECTORY_DOWNLOADS + "/dcinside");
                contentValues0.put("mime_type", "image/jpeg");
                ContentResolver contentResolver0 = context0.getContentResolver();
                if(contentResolver0 == null) {
                    throw new NullPointerException();
                }
                uri1 = contentResolver0.insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues0);
                if(uri1 == null) {
                    throw new NullPointerException();
                }
                outputStream0 = contentResolver0.openOutputStream(uri1);
                if(outputStream0 != null) {
                    goto label_17;
                }
                goto label_24;
            }
            goto label_28;
        }
        catch(Exception exception0) {
            outputStream0 = null;
            file0 = null;
            goto label_46;
        }
        catch(Throwable throwable0) {
            throwable1 = throwable0;
            goto label_50;
        }
        try {
        label_17:
            bitmap0.compress(Bitmap.CompressFormat.JPEG, 100, outputStream0);
            outputStream0.close();
            uri0 = uri1;
            goto label_24;
        }
        catch(Exception exception0) {
            file0 = null;
            goto label_46;
        label_24:
            if(outputStream0 != null) {
                try {
                    outputStream0.close();
                }
                catch(Exception unused_ex) {
                }
            }
            bitmap0.recycle();
            return uri0;
            try {
            label_28:
                File file1 = new File(Environment.getExternalStorageDirectory(), "dcinside");
                if(file1.exists() || file1.mkdirs()) {
                    file0 = new File(file1, s);
                    goto label_36;
                }
                goto label_62;
            }
            catch(Exception exception0) {
                outputStream0 = null;
                file0 = null;
                goto label_46;
                try {
                label_36:
                    outputStream0 = null;
                    outputStream0 = new FileOutputStream(file0);
                }
                catch(Exception exception0) {
                    goto label_46;
                }
                catch(Throwable throwable0) {
                    throwable1 = throwable0;
                    goto label_50;
                }
            }
            catch(Throwable throwable0) {
                throwable1 = throwable0;
                goto label_50;
            }
            try {
                bitmap0.compress(Bitmap.CompressFormat.JPEG, 100, outputStream0);
                ((FileOutputStream)outputStream0).close();
                goto label_54;
            }
            catch(Exception exception0) {
            }
            catch(Throwable throwable1) {
                goto label_50;
            }
            try {
            label_46:
                timber.log.b.a.y(exception0);
                if(outputStream0 != null) {
                    goto label_54;
                }
                goto label_55;
            }
            catch(Throwable throwable1) {
            }
        }
        catch(Throwable throwable1) {
        }
    label_50:
        if(outputStream0 != null) {
            try {
                outputStream0.close();
            }
            catch(Exception unused_ex) {
            }
        }
        bitmap0.recycle();
        throw throwable1;
        try {
        label_54:
            outputStream0.close();
        }
        catch(Exception unused_ex) {
        }
    label_55:
        bitmap0.recycle();
        if(file0 == null) {
            return null;
        }
        if(file0.length() == 0L) {
            file0.delete();
            return null;
        }
        return Uri.fromFile(file0);
    label_62:
        bitmap0.recycle();
        return null;
    }

    private final View j(Q q0, SparseArray sparseArray0) {
        Object object0 = sparseArray0.get(10000003);
        L.o(object0, "get(...)");
        L.n(((com.dcinside.app.read.holder.b)object0).itemView, "null cannot be cast to non-null type com.dcinside.app.view.PostReadFooterView");
        View view0 = (PostReadFooterView)((com.dcinside.app.read.holder.b)object0).itemView;
        b a$b0 = new b(view0);
        if(Q.n0.d(q0)) {
            a$b0.e().setImageResource(0x7F0802CD);  // drawable:ic_read_like_recommend_tinted
            a$b0.e().setBackgroundResource(0x7F0805CC);  // drawable:rounded_like_bg_left_recommend
        }
        else {
            a$b0.e().setImageResource(0x7F0802CB);  // drawable:ic_read_like_normal_tinted
            a$b0.e().setBackgroundResource(0x7F0805CB);  // drawable:rounded_like_bg_left_normal
        }
        a$b0.b().setVisibility((q0.E0() ? 8 : 0));
        a$b0.c().setVisibility((q0.E0() ? 8 : 0));
        a$b0.i().setVisibility(8);
        a$b0.h().setVisibility(8);
        a$b0.g().setVisibility(8);
        a$b0.a().setVisibility(8);
        int[] arr_v = q0.R0();
        a$b0.d().setText(String.valueOf(arr_v[0]));
        a$b0.f().setText(String.valueOf(arr_v[1]));
        a$b0.b().setText(String.valueOf(arr_v[2]));
        a$b0.d().setGravity(16);
        a$b0.f().setGravity(16);
        a$b0.b().setGravity(16);
        view0.measure(View.MeasureSpec.makeMeasureSpec(0, 0x40000000), 0);
        TextView textView0 = a$b0.b();
        Rect rect0 = new Rect();
        TextPaint textPaint0 = textView0.getPaint();
        String s = textView0.getText().toString();
        textPaint0.getTextBounds(s, 0, s.length(), rect0);
        int v = rect0.width();
        textView0.setPadding((textView0.getMeasuredWidth() - v) / 2, textView0.getPaddingTop(), textView0.getPaddingRight(), textView0.getPaddingBottom());
        view0.layout(0, 0, view0.getMeasuredWidth(), view0.getMeasuredHeight());
        return view0;
    }

    private final File k(int v, int v1, SparseArray sparseArray0, x x0, int v2) {
        int v3 = x0.getItemViewType(v2);
        switch(v3) {
            case 10000004: 
            case 10000005: 
            case 10000006: 
            case 10000007: 
            case 10000009: 
            case 10000010: 
            case 10000018: 
            case 10000022: {
                com.dcinside.app.read.holder.b b0 = (com.dcinside.app.read.holder.b)sparseArray0.get(v3);
                C c0 = x0.Q(v2);
                L.o(c0, "getItem(...)");
                L.m(b0);
                this.v(x0, b0, c0);
                String s = String.format(Locale.getDefault(), "reply_temp_%04d.jpeg", Arrays.copyOf(new Object[]{v2}, 1));
                L.o(s, "format(...)");
                b0.itemView.measure(v, v1);
                int v4 = b0.itemView.getMeasuredWidth();
                int v5 = b0.itemView.getMeasuredHeight();
                b0.itemView.layout(0, 0, v4, v5);
                Context context0 = b0.itemView.getContext();
                L.o(context0, "getContext(...)");
                L.o(b0.itemView, "itemView");
                Bitmap bitmap0 = a.a.d(b0.itemView);
                return a.a.o(context0, bitmap0, s);
            }
            default: {
                return null;
            }
        }
    }

    private final File l(Context context0, String s) {
        return new File(new File(context0.getCacheDir(), "capture_tmp"), s);
    }

    @n
    public static final void m(@l RecyclerView recyclerView0, @l SparseArray sparseArray0, @l x x0) {
        L.p(recyclerView0, "rv");
        L.p(sparseArray0, "holders");
        L.p(x0, "adapter");
        Integer[] arr_integer = {10000004, 10000022, 10000005, 10000006, 10000007, 10000009, 10000010, 10000003, 10000018};
        for(int v = 0; v < 9; ++v) {
            int v1 = arr_integer[v].intValue();
            sparseArray0.put(v1, x0.x0(recyclerView0, v1));
        }
    }

    private final Bitmap n(Context context0, Uri uri0) {
        BitmapRegionDecoder bitmapRegionDecoder1;
        BitmapRegionDecoder bitmapRegionDecoder0;
        ContentResolver contentResolver0 = context0.getContentResolver();
        Bitmap bitmap0 = null;
        if(uri0 == null) {
            return null;
        }
        InputStream inputStream0 = contentResolver0.openInputStream(uri0);
        if(inputStream0 == null) {
            return null;
        }
        try {
            if(Build.VERSION.SDK_INT >= 0x1F) {
                bitmapRegionDecoder0 = BitmapRegionDecoder.newInstance(inputStream0);
                if(bitmapRegionDecoder0 == null) {
                    return null;
                }
            }
            else {
                bitmapRegionDecoder0 = BitmapRegionDecoder.newInstance(inputStream0, false);
                goto label_18;
            }
            goto label_20;
        }
        catch(Exception exception0) {
            bitmapRegionDecoder1 = null;
            goto label_28;
        }
        catch(Throwable throwable0) {
            goto label_39;
        }
    label_18:
        if(bitmapRegionDecoder0 == null) {
            return null;
        }
        try {
        label_20:
            Rect rect0 = new Rect(0, 0, bitmapRegionDecoder0.getWidth(), bitmapRegionDecoder0.getWidth());
            BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
            bitmapFactory$Options0.inPreferredConfig = Bitmap.Config.RGB_565;
            bitmap0 = bitmapRegionDecoder0.decodeRegion(rect0, bitmapFactory$Options0);
            goto label_42;
        }
        catch(Exception exception1) {
            bitmapRegionDecoder1 = bitmapRegionDecoder0;
            exception0 = exception1;
            try {
            label_28:
                timber.log.b.a.y(exception0);
            }
            catch(Throwable throwable0) {
                bitmap0 = bitmapRegionDecoder1;
                goto label_39;
            }
            if(bitmapRegionDecoder1 != null) {
                try {
                    bitmapRegionDecoder1.recycle();
                    return null;
                }
                catch(Exception unused_ex) {
                }
            }
            return bitmap0;
        }
        catch(Throwable throwable1) {
            bitmap0 = bitmapRegionDecoder0;
            throwable0 = throwable1;
        }
    label_39:
        if(bitmap0 != null) {
            try {
                ((BitmapRegionDecoder)bitmap0).recycle();
            }
            catch(Exception unused_ex) {
            }
        }
        throw throwable0;
        try {
        label_42:
            bitmapRegionDecoder0.recycle();
        }
        catch(Exception unused_ex) {
        }
        return bitmap0;
    }

    private final File o(Context context0, Bitmap bitmap0, String s) {
        static final class j extends N implements Function1 {
            public static final j e;

            static {
                j.e = new j();
            }

            j() {
                super(1);
            }

            @m
            public final ol a(@l ol ol0) {
                L.p(ol0, "<name for destructuring parameter 0>");
                int v = ol0.a();
                int v1 = ol0.b();
                return v <= 720 ? null : ol.e.d(v, v1, 720, v1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.a(((ol)object0));
            }
        }

        FileOutputStream fileOutputStream3;
        FileOutputStream fileOutputStream2;
        File file2;
        FileOutputStream fileOutputStream1;
        File file1;
        FileOutputStream fileOutputStream0 = null;
        try {
            File file0 = new File(context0.getCacheDir(), "capture_tmp");
            if(file0.exists() || file0.mkdirs()) {
                file1 = new File(file0, s);
                fileOutputStream2 = new FileOutputStream(file1);
                goto label_16;
            }
            goto label_51;
        }
        catch(Exception unused_ex) {
            fileOutputStream1 = null;
            file2 = null;
            goto label_30;
        }
        catch(Throwable throwable0) {
            fileOutputStream3 = null;
            goto label_37;
        }
    label_16:
        if(bitmap0 == null) {
            goto label_18;
        }
        else {
            try {
                fileOutputStream0 = com.dcinside.app.write.d.a.f(bitmap0, j.e);
            label_18:
                if(fileOutputStream0 != null) {
                    ((Bitmap)fileOutputStream0).compress(Bitmap.CompressFormat.WEBP, 100, fileOutputStream2);
                }
                fileOutputStream2.flush();
                goto label_44;
            label_23:
                FileOutputStream fileOutputStream4 = fileOutputStream0;
                fileOutputStream0 = fileOutputStream2;
                fileOutputStream3 = fileOutputStream4;
                goto label_37;
            }
            catch(Exception unused_ex) {
                file2 = file1;
                fileOutputStream1 = fileOutputStream0;
                fileOutputStream0 = fileOutputStream2;
            }
            catch(Throwable throwable0) {
                goto label_23;
            }
        }
    label_30:
        if(fileOutputStream0 != null) {
            try {
                fileOutputStream0.close();
            }
            catch(IOException unused_ex) {
            }
        }
        if((bitmap0 == null || !bitmap0.isRecycled()) && bitmap0 != null) {
            bitmap0.recycle();
        }
        if((fileOutputStream1 == null || !((Bitmap)fileOutputStream1).isRecycled()) && fileOutputStream1 != null) {
            ((Bitmap)fileOutputStream1).recycle();
        }
        return file2;
    label_37:
        if(fileOutputStream0 != null) {
            try {
                fileOutputStream0.close();
            }
            catch(IOException unused_ex) {
            }
        }
        if((bitmap0 == null || !bitmap0.isRecycled()) && bitmap0 != null) {
            bitmap0.recycle();
        }
        if((fileOutputStream3 == null || !((Bitmap)fileOutputStream3).isRecycled()) && fileOutputStream3 != null) {
            ((Bitmap)fileOutputStream3).recycle();
        }
        throw throwable0;
        try {
        label_44:
            fileOutputStream2.close();
        }
        catch(IOException unused_ex) {
        }
        if((bitmap0 == null || !bitmap0.isRecycled()) && bitmap0 != null) {
            bitmap0.recycle();
        }
        if((fileOutputStream0 == null || !((Bitmap)fileOutputStream0).isRecycled()) && fileOutputStream0 != null) {
            ((Bitmap)fileOutputStream0).recycle();
            return file1;
        }
        return file1;
    label_51:
        if((bitmap0 == null || !bitmap0.isRecycled()) && bitmap0 != null) {
            bitmap0.recycle();
        }
        return null;
    }

    private final void p(x x0, com.dcinside.app.read.holder.g g0, C c0) {
        g0.i().setText(c0.i());
        com.dcinside.app.response.j j0 = c0.g();
        L.m(j0);
        g0.k().setVisibility((j0.i0() ? 0 : 8));
        g0.h().setDrawPadding(x0.n0(g0.getBindingAdapterPosition()));
    }

    private final void q(com.dcinside.app.read.holder.l l0, C c0) {
        int v1;
        SpannableStringBuilder spannableStringBuilder1;
        com.dcinside.app.response.j j0 = c0.g();
        if(j0 == null) {
            return;
        }
        Context context0 = l0.itemView.getContext();
        l0.v().setVisibility(4);
        l0.itemView.setAlpha((j0.h0() ? 0.5f : 1.0f));
        p.a(l0.x(), new CharSequence[]{j0.I()});
        Mention mention0 = c0.g().W();
        CharSequence charSequence0 = c0.i();
        CharSequence charSequence1 = charSequence0 == null ? "" : charSequence0;
        if(mention0 == null || c0.j() != 10000007) {
            spannableStringBuilder1 = new SpannableStringBuilder(charSequence1);
        }
        else {
            String s = Dl.c("").toString();
            L.m(context0);
            SpannableStringBuilder spannableStringBuilder0 = com.dcinside.app.span.g.w(context0, Q0.d, s, "", "", mention0.q() == 1);
            if(spannableStringBuilder0.length() == 0) {
                spannableStringBuilder1 = new SpannableStringBuilder(charSequence1);
            }
            else {
                int v = vk.b(context0, 0x7F0401F8);  // attr:dcBodyLinkColor
                spannableStringBuilder0.setSpan(new RelativeSizeSpan(0.9f), 0, spannableStringBuilder0.length(), 33);
                spannableStringBuilder0.setSpan(new ForegroundColorSpan(v), 0, spannableStringBuilder0.length(), 33);
                spannableStringBuilder0.append(' ');
                spannableStringBuilder1 = spannableStringBuilder0.append(charSequence1);
            }
        }
        ResizeTextView resizeTextView0 = l0.t();
        if(resizeTextView0 != null) {
            resizeTextView0.setText(spannableStringBuilder1);
            if(m0.a.a.i(charSequence1)) {
                v1 = 8;
            }
            else {
                Ck.b().a(resizeTextView0);
                v1 = 0;
            }
            resizeTextView0.setVisibility(v1);
        }
        String s1 = j0.f0();
        String s2 = j0.R();
        if(s1 != null && s1.length() != 0 || s2 == null || s2.length() == 0) {
            l0.r().setText("");
        }
        else {
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append('(');
            stringBuilder0.append(m0.a.a.m(s2, ".*"));
            stringBuilder0.append(')');
            l0.r().setText(stringBuilder0);
        }
        L.m(context0);
        l0.w().setText(com.dcinside.app.span.g.r(context0, null, j0.X(), null, j0.S(), null, null, null, true, 0xC0, null));
        t.c.f(j0, l0.s(), true);
        ResizeTextView resizeTextView1 = l0.z();
        CharSequence charSequence2 = com.dcinside.app.span.g.A(context0, j0.R(), c0.c(), j0.f0());
        if(charSequence2 == null || charSequence2.length() == 0) {
            resizeTextView1.setVisibility(8);
        }
        else {
            resizeTextView1.setText(charSequence2);
            resizeTextView1.setVisibility(0);
        }
        if(j0.i0()) {
            l0.y().setVisibility(0);
        }
        else {
            l0.y().setVisibility(8);
        }
        l0.v().setVisibility(8);
    }

    private final void r(com.dcinside.app.read.holder.d d0, C c0) {
        Context context0 = d0.itemView.getContext();
        com.dcinside.app.read.C.c c$c0 = c0.h();
        if(c$c0 == null) {
            c$c0 = new com.dcinside.app.read.C.c(0, 0, 0, 7, null);
        }
        String s = d0.itemView.getContext().getString(0x7F150890, new Object[]{c$c0.b()});  // string:reply_count "댓글 %1$d"
        L.o(s, "getString(...)");
        Context context1 = d0.itemView.getContext();
        L.o(context1, "getContext(...)");
        int v = vk.b(context1, 0x7F0401AF);  // attr:countHolderBg
        int v1 = (int)context0.getResources().getDimension(0x7F07006D);  // dimen:capture_reply_page_margin_end
        d0.itemView.setBackgroundColor(v);
        d0.j().setText(s);
        d0.m().setText(String.valueOf(c$c0.a()));
        View view0 = d0.k();
        if(view0 != null) {
            view0.setVisibility(8);
        }
        d0.i()[0].setVisibility(8);
        d0.i()[1].setVisibility(8);
        ResizeTextView resizeTextView0 = d0.m();
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = resizeTextView0.getLayoutParams();
        if(viewGroup$LayoutParams0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).setMarginEnd(v1);
        resizeTextView0.setLayoutParams(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0));
    }

    private final void s(com.dcinside.app.read.holder.h h0, C c0) {
        L.m(c0.g());
        SimpleDraweeView simpleDraweeView0 = h0.U();
        String s = c0.g().N().h() == null ? null : "";
        SimpleDraweeView simpleDraweeView1 = h0.W();
        Context context0 = h0.itemView.getContext();
        this.q(h0, c0);
        h0.b0(c0.g().W());
        h0.R().setVisibility(8);
        h0.P().setVisibility(8);
        h0.T().setVisibility(8);
        int v = (int)context0.getResources().getDimension(0x7F07006C);  // dimen:capture_reply_dccon_time_margin_top
        ResizeTextView resizeTextView0 = h0.x();
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = resizeTextView0.getLayoutParams();
        if(viewGroup$LayoutParams0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0).topMargin = v;
        resizeTextView0.setLayoutParams(((ViewGroup.MarginLayoutParams)viewGroup$LayoutParams0));
        if(!com.dcinside.app.image.s.d(context0)) {
            throw new IllegalStateException("load cancelled activity is destroyed.");
        }
        Bitmap bitmap0 = (Bitmap)com.dcinside.app.glide.a.k(context0).g0().v2("").Q1(com.dcinside.app.image.o.b.g()).H1().get();
        L.n(simpleDraweeView0, "null cannot be cast to non-null type android.widget.ImageView");
        simpleDraweeView0.setImageBitmap(bitmap0);
        if(s != null) {
            simpleDraweeView1.setVisibility(0);
            Bitmap bitmap1 = (Bitmap)com.dcinside.app.glide.a.k(context0).g0().v2(s).Q1(com.dcinside.app.image.o.b.g()).H1().get();
            L.n(simpleDraweeView1, "null cannot be cast to non-null type android.widget.ImageView");
            simpleDraweeView1.setImageBitmap(bitmap1);
            return;
        }
        simpleDraweeView1.setVisibility(8);
    }

    private final void t(com.dcinside.app.read.holder.n n0, C c0) {
        this.q(n0, c0);
        Context context0 = Dl.b(n0.itemView);
        r r0 = r.g((context0 instanceof AppCompatActivity ? ((AppCompatActivity)context0) : null));
        r0.j(n0.F(), null);
        com.dcinside.app.response.j j0 = c0.g();
        L.m(j0);
        n0.H(j0.g0());
        r0.j(n0.F(), n0);
    }

    private final void u(com.dcinside.app.read.holder.o o0, C c0) {
        this.q(o0, c0);
        ImageView imageView0 = new ImageView(o0.itemView.getContext());
        imageView0.setImageResource(0x7F0803A7);  // drawable:img_voice_frame
        com.dcinside.app.response.j j0 = c0.g();
        o0.F((j0 == null ? null : j0.W()));
        imageView0.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView0.setPadding(0, 0, 0, 0);
        ViewGroup viewGroup0 = o0.E();
        if(viewGroup0 != null) {
            viewGroup0.addView(imageView0);
        }
    }

    public final void v(@l x x0, @l com.dcinside.app.read.holder.b b0, @l C c0) {
        L.p(x0, "adapter");
        L.p(b0, "holder");
        L.p(c0, "item");
        switch(c0.j()) {
            case 10000005: {
                this.t(((com.dcinside.app.read.holder.n)b0), c0);
                return;
            }
            case 10000006: {
                this.u(((com.dcinside.app.read.holder.o)b0), c0);
                return;
            }
            case 10000007: {
                this.q(((com.dcinside.app.read.holder.l)b0), c0);
                return;
            }
            case 10000009: 
            case 10000010: {
                this.r(((com.dcinside.app.read.holder.d)b0), c0);
                return;
            }
            case 10000018: {
                this.p(x0, ((com.dcinside.app.read.holder.g)b0), c0);
                return;
            }
            case 10000004: 
            case 10000022: {
                this.s(((com.dcinside.app.read.holder.h)b0), c0);
            }
        }
    }

    private final int w(int v, int v1) {
        return Color.argb(v1, Color.red(v), Color.green(v), Color.blue(v));
    }
}

