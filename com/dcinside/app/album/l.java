package com.dcinside.app.album;

import A3.o;
import A3.p;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Video.Media;
import android.view.View;
import androidx.collection.LongSparseArray;
import com.dcinside.app.Application;
import com.dcinside.app.util.Bk;
import com.dcinside.app.util.Gk;
import com.dcinside.app.util.dl;
import com.dcinside.app.util.jl;
import com.google.android.material.snackbar.Snackbar;
import j..time.LocalDateTime;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.V;
import kotlin.collections.T;
import kotlin.collections.Y;
import kotlin.collections.u;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.r0;
import kotlin.ranges.s;
import kotlin.text.v;
import y4.m;

@s0({"SMAP\nMediaUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaUtil.kt\ncom/dcinside/app/album/MediaUtil\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,276:1\n128#1,4:277\n149#1:281\n150#1,13:283\n132#1,9:296\n128#1,4:305\n149#1:309\n150#1,13:311\n132#1,9:324\n149#1:337\n150#1,13:339\n1#2:282\n1#2:310\n1#2:335\n1#2:338\n1#2:352\n1628#3,2:333\n1630#3:336\n*S KotlinDebug\n*F\n+ 1 MediaUtil.kt\ncom/dcinside/app/album/MediaUtil\n*L\n78#1:277,4\n78#1:281\n78#1:283,13\n78#1:296,9\n88#1:305,4\n88#1:309\n88#1:311,13\n88#1:324,9\n131#1:337\n131#1:339,13\n78#1:282\n88#1:310\n131#1:338\n104#1:333,2\n104#1:336\n*E\n"})
public final class l {
    @y4.l
    public static final l a;

    static {
        l.a = new l();
    }

    private final File b(String s, boolean z) throws IOException {
        String s2;
        StringBuilder stringBuilder0;
        LocalDateTime localDateTime0 = LocalDateTime.now();
        L.o(localDateTime0, "now(...)");
        String s1 = Bk.a.c(localDateTime0);
        if(z) {
            stringBuilder0 = new StringBuilder();
            s2 = "MP4_";
        }
        else {
            stringBuilder0 = new StringBuilder();
            s2 = "JPEG_";
        }
        stringBuilder0.append(s2);
        stringBuilder0.append(s1);
        stringBuilder0.append("_");
        String s3 = stringBuilder0.toString();
        File file0 = new File(s);
        if(!file0.exists() && !file0.mkdirs()) {
            return null;
        }
        File file1 = File.createTempFile(s3, (z ? ".mp4" : ".jpg"), file0);
        file1.delete();
        return file1;
    }

    @y4.l
    public final File c() {
        return new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "DCINSIDE");
    }

    @y4.l
    public final File d() {
        return new File(Application.e.c().getCacheDir(), Environment.DIRECTORY_PICTURES);
    }

    private final void e(Cursor cursor0, Album album0, LongSparseArray longSparseArray0, boolean z, p p0) {
        if(cursor0.moveToFirst()) {
            try {
                while(true) {
                    String s = cursor0.getString(2);
                    if(s != null) {
                        L.m(s);
                        if(s.length() <= 0) {
                            s = null;
                        }
                        if(s != null) {
                            boolean z1 = !z && v.M1(s, ".gif", true);
                            long v = (long)cursor0.getInt(0);
                            Album album1 = (Album)longSparseArray0.g(v);
                            if(album1 == null) {
                                album1 = new Album(cursor0.getLong(4), v, cursor0.getString(1), new File(s).getParent(), s, 0, 0, 0, 0xE0, null);
                                longSparseArray0.n(v, album1);
                                if(album0.h() == null) {
                                    album0.t(album1.h());
                                }
                            }
                            p0.invoke(Boolean.valueOf(z1), album0, album1);
                        }
                    }
                    if(!cursor0.moveToNext()) {
                        break;
                    }
                }
            }
            catch(Exception unused_ex) {
            }
        }
        cursor0.close();
    }

    private final void f(Cursor cursor0, Album album0, LongSparseArray longSparseArray0, boolean z, p p0) {
        String s = cursor0.getString(2);
        if(s != null) {
            if(s.length() <= 0) {
                s = null;
            }
            if(s != null) {
                boolean z1 = !z && v.M1(s, ".gif", true);
                long v = (long)cursor0.getInt(0);
                Album album1 = (Album)longSparseArray0.g(v);
                if(album1 == null) {
                    album1 = new Album(cursor0.getLong(4), v, cursor0.getString(1), new File(s).getParent(), s, 0, 0, 0, 0xE0, null);
                    longSparseArray0.n(v, album1);
                    if(album0.h() == null) {
                        album0.t(album1.h());
                    }
                }
                p0.invoke(Boolean.valueOf(z1), album0, album1);
            }
        }
    }

    @m
    public final Cursor g(long v, boolean z) {
        V v2;
        Context context0 = Application.e.c();
        int v1 = dl.a.G0();
        String s = com.dcinside.app.album.m.d.b(v1).c();
        Uri uri0 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        if(v != 0L) {
            if(z) {
                L.o("bucket_id = ? and LOWER(_data) not like ?", "format(...)");
                v2 = r0.a("bucket_id = ? and LOWER(_data) not like ?", new String[]{String.valueOf(v), "%%.gif"});
                return context0.getContentResolver().query(uri0, new String[]{"_display_name", "_data"}, ((String)v2.e()), ((String[])v2.f()), s);
            }
            L.o("bucket_id = ?", "format(...)");
            v2 = r0.a("bucket_id = ?", new String[]{String.valueOf(v)});
            return context0.getContentResolver().query(uri0, new String[]{"_display_name", "_data"}, ((String)v2.e()), ((String[])v2.f()), s);
        }
        if(z) {
            L.o("LOWER(_data) NOT LIKE ?", "format(...)");
            v2 = r0.a("LOWER(_data) NOT LIKE ?", new String[]{"%%.gif"});
            return context0.getContentResolver().query(uri0, new String[]{"_display_name", "_data"}, "LOWER(_data) NOT LIKE ?", ((String[])v2.f()), s);
        }
        v2 = r0.a(null, null);
        return context0.getContentResolver().query(uri0, new String[]{"_display_name", "_data"}, ((String)v2.e()), ((String[])v2.f()), s);
    }

    @m
    public final Cursor h(long v) {
        Context context0 = Application.e.c();
        String[] arr_s = {"_display_name", "_data"};
        int v1 = dl.a.G0();
        String s = com.dcinside.app.album.m.d.b(v1).c();
        Uri uri0 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        return v == 0L ? context0.getContentResolver().query(uri0, arr_s, null, null, s) : context0.getContentResolver().query(uri0, arr_s, "bucket_id=?", new String[]{String.valueOf(v)}, s);
    }

    @y4.l
    public final List i() {
        static final class a extends N implements o {
            final boolean e;

            a(boolean z) {
                this.e = z;
                super(2);
            }

            @y4.l
            public final Integer a(Album album0, Album album1) {
                if(this.e) {
                    String s = album1.c();
                    String s1 = "";
                    if(s == null) {
                        s = "";
                    }
                    String s2 = album0.c();
                    if(s2 != null) {
                        s1 = s2;
                    }
                    return s.compareTo(s1);
                }
                return L.u(album1.d(), album0.d());
            }

            @Override  // A3.o
            public Object invoke(Object object0, Object object1) {
                return this.a(((Album)object0), ((Album)object1));
            }
        }

        Context context0 = Application.e.c();
        ContentResolver contentResolver0 = context0.getContentResolver();
        int v = dl.a.E0();
        com.dcinside.app.album.m m0 = com.dcinside.app.album.m.d.b(v);
        String s = com.dcinside.app.album.m.d.a(m0);
        L.m(contentResolver0);
        Cursor cursor0 = this.k(contentResolver0, s);
        if(cursor0 == null) {
            return u.H();
        }
        LongSparseArray longSparseArray0 = new LongSparseArray(0, 1, null);
        Album album0 = new Album(0L, 0L, null, null, null, 0, 0, 0, 0xFF, null);
        album0.m("전체사진");
        album0.q(l.a.c().getPath());
        if(cursor0.moveToFirst()) {
            try {
                while(true) {
                    String s1 = cursor0.getString(2);
                    if(s1 != null) {
                        L.m(s1);
                        if(s1.length() <= 0) {
                            s1 = null;
                        }
                        if(s1 != null) {
                            boolean z = v.M1(s1, ".gif", true);
                            long v1 = (long)cursor0.getInt(0);
                            Album album1 = (Album)longSparseArray0.g(v1);
                            if(album1 == null) {
                                album1 = new Album(cursor0.getLong(4), v1, cursor0.getString(1), new File(s1).getParent(), s1, 0, 0, 0, 0xE0, null);
                                longSparseArray0.n(v1, album1);
                                if(album0.h() == null) {
                                    album0.t(album1.h());
                                }
                            }
                            if(z) {
                                album0.r(album0.f() + 1);
                                album1.r(album1.f() + 1);
                            }
                            album0.s(album0.g() + 1);
                            album1.s(album1.g() + 1);
                        }
                    }
                    if(!cursor0.moveToNext()) {
                        break;
                    }
                }
            }
            catch(Exception unused_ex) {
            }
        }
        cursor0.close();
        ContentResolver contentResolver1 = context0.getContentResolver();
        L.o(contentResolver1, "getContentResolver(...)");
        Cursor cursor1 = this.l(contentResolver1, s);
        if(cursor1 != null) {
            if(cursor1.moveToFirst()) {
                try {
                    while(true) {
                        String s2 = cursor1.getString(2);
                        if(s2 != null) {
                            L.m(s2);
                            if(s2.length() <= 0) {
                                s2 = null;
                            }
                            if(s2 != null) {
                                long v2 = (long)cursor1.getInt(0);
                                Album album2 = (Album)longSparseArray0.g(v2);
                                if(album2 == null) {
                                    album2 = new Album(cursor1.getLong(4), v2, cursor1.getString(1), new File(s2).getParent(), s2, 0, 0, 0, 0xE0, null);
                                    longSparseArray0.n(v2, album2);
                                    if(album0.h() == null) {
                                        album0.t(album2.h());
                                    }
                                }
                                album0.u(album0.i() + 1);
                                album2.u(album2.i() + 1);
                            }
                        }
                        if(!cursor1.moveToNext()) {
                            break;
                        }
                    }
                }
                catch(Exception unused_ex) {
                }
            }
            cursor1.close();
        }
        boolean z1 = m0 == com.dcinside.app.album.m.j || m0 == com.dcinside.app.album.m.i;
        boolean z2 = m0 == com.dcinside.app.album.m.i || m0 == com.dcinside.app.album.m.h || m0 == com.dcinside.app.album.m.f;
        String s3 = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getAbsolutePath();
        HashMap hashMap0 = Y.M(new V[]{r0.a((s3 + "/Camera"), "카메라"), r0.a((s3 + "/Screenshots"), "스크린샷"), r0.a((s3 + "/Screen recordings"), "화면 녹화 파일"), r0.a((s3 + "/Videocaptures"), "동영상 캡처"), r0.a(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath(), "다운로드")});
        List list0 = new ArrayList();
        Iterator iterator0 = s.W1(0, longSparseArray0.w()).iterator();
        while(iterator0.hasNext()) {
            Album album3 = (Album)longSparseArray0.x(((T)iterator0).b());
            String s4 = album3.e();
            String s5 = "";
            if(s4 == null) {
                s4 = "";
            }
            String s6 = (String)hashMap0.get(s4);
            if(s6 == null) {
                s6 = album3.c();
                if(s6 != null) {
                    s5 = s6;
                }
            }
            else {
                s5 = s6;
            }
            album3.m(s5);
            list0.add(album3);
        }
        u.p0(list0, (Object object0, Object object1) -> {
            L.p(new a(z1), "$tmp0");
            return ((Number)new a(z1).invoke(object0, object1)).intValue();
        });
        if(z2) {
            u.r1(list0);
        }
        list0.add(0, album0);
        return list0;
    }

    // 检测为 Lambda 实现
    private static final int j(o o0, Object object0, Object object1) [...]

    private final Cursor k(ContentResolver contentResolver0, String s) {
        return contentResolver0.query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{"bucket_id", "bucket_display_name", "_data", "_id", s}, null, null, "_id DESC");
    }

    private final Cursor l(ContentResolver contentResolver0, String s) {
        return contentResolver0.query(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, new String[]{"bucket_id", "bucket_display_name", "_data", "_id", s}, null, null, "_id DESC");
    }

    @m
    public final String m(@y4.l Activity activity0, @m String s, int v, boolean z) throws Exception {
        L.p(activity0, "activity");
        if(s != null) {
            File file0 = l.a.b(s, z);
            if(file0 != null) {
                Intent intent0 = z ? new Intent("android.media.action.VIDEO_CAPTURE") : new Intent("android.media.action.IMAGE_CAPTURE");
                if(intent0.resolveActivity(activity0.getPackageManager()) != null) {
                    intent0.putExtra("output", Gk.v(file0));
                    activity0.startActivityForResult(intent0, v);
                    return file0.getPath();
                }
            }
        }
        return null;
    }

    public static String n(l l0, Activity activity0, String s, int v, boolean z, int v1, Object object0) throws Exception {
        if((v1 & 8) != 0) {
            z = false;
        }
        return l0.m(activity0, s, v, z);
    }

    public final boolean o(@y4.l View view0, @y4.l Context context0, @y4.l String s, boolean z, boolean z1) {
        L.p(view0, "view");
        L.p(context0, "context");
        L.p(s, "path");
        File file0 = new File(s);
        if(!file0.canRead()) {
            file0 = null;
        }
        if(file0 == null) {
            Snackbar.D0(view0, 0x7F15068B, -1).m0();  // string:msg_cant_read "이미지를 읽을 수 없거나 이미지 형식이 맞지 않습니다."
            return false;
        }
        if(z) {
            long v = Math.max(U.a.d, jl.a.p0());
            if(!z1) {
                v = U.a.c;
            }
            if(v > file0.length()) {
                return true;
            }
            String s1 = Gk.b(v);
            String s2 = z1 ? context0.getString(0x7F150813, new Object[]{s1}) : context0.getString(0x7F150800, new Object[]{s1});  // string:post_write_video_max_bytes "%1$s까지 업로드 가능합니다."
            L.m(s2);
            Snackbar.E0(view0, s2, -1).m0();
            return false;
        }
        return true;
    }

    public static boolean p(l l0, View view0, Context context0, String s, boolean z, boolean z1, int v, Object object0) {
        return (v & 16) == 0 ? l0.o(view0, context0, s, z, z1) : l0.o(view0, context0, s, z, false);
    }
}

