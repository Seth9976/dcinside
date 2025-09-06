package com.facebook.common.util;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri.Builder;
import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.DocumentsContract;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Video.Media;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import jeb.synthetic.TWR;
import k1.n.a;
import k1.n;
import k1.u;

@n(a.a)
public class h {
    public static final String a = "http";
    public static final String b = "https";
    public static final String c = "file";
    public static final String d = "content";
    private static final Uri e = null;
    public static final String f = "asset";
    public static final String g = "res";
    public static final String h = "android.resource";
    public static final String i = "data";

    static {
        h.e = Uri.withAppendedPath(ContactsContract.AUTHORITY_URI, "display_photo");
    }

    @o3.h
    public static AssetFileDescriptor a(ContentResolver contentResolver0, Uri uri0) {
        if(h.n(uri0)) {
            try {
                return contentResolver0.openAssetFileDescriptor(uri0, "r");
            }
            catch(FileNotFoundException unused_ex) {
            }
        }
        return null;
    }

    private static String b(boolean z) [...] // Inlined contents

    // 去混淆评级： 低(20)
    private static Uri c(boolean z) {
        return z ? MediaStore.Video.Media.EXTERNAL_CONTENT_URI : MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
    }

    private static String d(boolean z) [...] // Inlined contents

    @o3.h
    public static String e(ContentResolver contentResolver0, Uri uri0) {
        String[] arr_s;
        String s3;
        Uri uri1;
        String s = contentResolver0.getType(uri0);
        String s1 = null;
        if(h.n(uri0)) {
            boolean z = s != null && s.startsWith("video/");
            if("com.android.providers.media.documents".equals(uri0.getAuthority())) {
                String s2 = DocumentsContract.getDocumentId(uri0);
                com.facebook.common.internal.n.i(s2);
                uri1 = (Uri)com.facebook.common.internal.n.i(h.c(z));
                s3 = "_id=?";
                arr_s = new String[]{s2.split(":")[1]};
            }
            else {
                uri1 = uri0;
                s3 = null;
                arr_s = null;
            }
            Cursor cursor0 = contentResolver0.query(uri1, new String[]{"_data"}, s3, arr_s, null);
            if(cursor0 != null) {
                try {
                    if(cursor0.moveToFirst()) {
                        int v = cursor0.getColumnIndexOrThrow("_data");
                        if(v != -1) {
                            s1 = cursor0.getString(v);
                        }
                    }
                }
                catch(Throwable throwable0) {
                    TWR.safeClose$NT(cursor0, throwable0);
                    throw throwable0;
                }
            }
            if(cursor0 != null) {
                cursor0.close();
                return s1;
            }
            return s1;
        }
        return h.o(uri0) ? uri0.getPath() : null;
    }

    @o3.h
    public static String f(@o3.h Uri uri0) {
        return uri0 == null ? null : uri0.getScheme();
    }

    public static Uri g(File file0) {
        return Uri.fromFile(file0);
    }

    public static Uri h(String s, int v) {
        return new Uri.Builder().scheme("android.resource").authority(s).path(String.valueOf(v)).build();
    }

    public static Uri i(int v) {
        return new Uri.Builder().scheme("res").path(String.valueOf(v)).build();
    }

    public static boolean j(@o3.h Uri uri0) {
        return "data".equals(h.f(uri0));
    }

    public static boolean k(@o3.h Uri uri0) {
        return "asset".equals(h.f(uri0));
    }

    public static boolean l(Uri uri0) {
        String s = uri0.toString();
        return s.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) || s.startsWith(MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString());
    }

    // 去混淆评级： 低(40)
    public static boolean m(Uri uri0) {
        return uri0.getPath() == null ? false : h.n(uri0) && "com.android.contacts".equals(uri0.getAuthority()) && !uri0.getPath().startsWith(((String)k1.a.l(h.e.getPath())));
    }

    public static boolean n(@o3.h Uri uri0) {
        return "content".equals(h.f(uri0));
    }

    public static boolean o(@o3.h Uri uri0) {
        return "file".equals(h.f(uri0));
    }

    public static boolean p(@o3.h Uri uri0) {
        return "res".equals(h.f(uri0));
    }

    public static boolean q(@o3.h Uri uri0) {
        String s = h.f(uri0);
        return "https".equals(s) || "http".equals(s);
    }

    public static boolean r(@o3.h Uri uri0) {
        return "android.resource".equals(h.f(uri0));
    }

    @o3.h
    public static Uri s(@o3.h String s) {
        return s == null ? null : Uri.parse(s);
    }

    @o3.h
    public static URL t(@u @o3.h Uri uri0) {
        if(uri0 == null) {
            return null;
        }
        try {
            return new URL(uri0.toString());
        }
        catch(MalformedURLException malformedURLException0) {
            throw new RuntimeException(malformedURLException0);
        }
    }
}

