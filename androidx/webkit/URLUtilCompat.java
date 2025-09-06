package androidx.webkit;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class URLUtilCompat {
    private static final Pattern a;

    static {
        URLUtilCompat.a = Pattern.compile("\\s*(\\S+?) # Group 1: parameter name\n\\s*=\\s* # Match equals sign\n(?: # non-capturing group of options\n   \'( (?: [^\'\\\\] | \\\\. )* )\' # Group 2: single-quoted\n | \"( (?: [^\"\\\\] | \\\\. )*  )\" # Group 3: double-quoted\n | ( [^\'\"][^;\\s]* ) # Group 4: un-quoted parameter\n)\\s*;? # Optional end semicolon", 4);
    }

    @NonNull
    private static String a(@NonNull String s, @NonNull String s1) {
        Charset charset0 = Charset.forName(s1);
        StringBuilder stringBuilder0 = new StringBuilder();
        byte[] arr_b = charset0.encode("+").array();
        for(int v = 0; v < arr_b.length; ++v) {
            stringBuilder0.append(String.format("%02x", ((byte)arr_b[v])));
        }
        return s.replaceAll("\\+", stringBuilder0.toString());
    }

    private static boolean b(@NonNull String s, @NonNull String s1) {
        String s2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(s.substring(s.lastIndexOf(46) + 1));
        return s2 != null && !s2.equalsIgnoreCase(s1);
    }

    @Nullable
    public static String c(@NonNull String s) {
        String s4;
        String[] arr_s = s.trim().split(";", 2);
        String s1 = null;
        if(arr_s.length < 2) {
            return null;
        }
        if("inline".equalsIgnoreCase(arr_s[0].trim())) {
            return null;
        }
        Matcher matcher0 = URLUtilCompat.a.matcher(arr_s[1]);
        String s2 = null;
        while(matcher0.find()) {
            String s3 = matcher0.group(1);
            if(matcher0.group(2) == null) {
                s4 = matcher0.group(3) == null ? matcher0.group(4) : URLUtilCompat.g(matcher0.group(3));
            }
            else {
                s4 = URLUtilCompat.g(matcher0.group(2));
            }
            if(s3 == null || s4 == null) {
            }
            else if("filename*".equalsIgnoreCase(s3)) {
                s1 = URLUtilCompat.f(s4);
            }
            else if("filename".equalsIgnoreCase(s3)) {
                s2 = s4;
            }
        }
        return s1 == null ? s2 : s1;
    }

    @NonNull
    private static String d(@NonNull String s, @Nullable String s1) {
        if(s1 != null) {
            String s2 = URLUtilCompat.c(s1);
            if(s2 != null) {
                return URLUtilCompat.h(s2);
            }
        }
        Uri uri0 = Uri.parse(s);
        if(uri0 != null) {
            String s3 = uri0.getLastPathSegment();
            return s3 == null ? "downloadfile" : URLUtilCompat.h(s3);
        }
        return "downloadfile";
    }

    @NonNull
    public static String e(@NonNull String s, @Nullable String s1, @Nullable String s2) {
        String s3 = URLUtilCompat.d(s, s1);
        String s4 = URLUtilCompat.i(s2);
        if(s3.indexOf(46) < 0) {
            return s3 + s4;
        }
        return s2 == null || !URLUtilCompat.b(s3, s2) ? s3 : s3 + s4;
    }

    private static String f(String s) {
        String[] arr_s = s.split("\'", 3);
        if(arr_s.length < 3) {
            return null;
        }
        String s1 = arr_s[0];
        String s2 = arr_s[2];
        try {
            return URLDecoder.decode(URLUtilCompat.a(s2, s1), s1);
        }
        catch(RuntimeException | UnsupportedEncodingException unused_ex) {
            return null;
        }
    }

    private static String g(String s) {
        return s == null ? null : s.replaceAll("\\\\(.)", "$1");
    }

    @NonNull
    private static String h(@NonNull String s) {
        return s.replaceAll("/", "_");
    }

    @NonNull
    private static String i(@Nullable String s) {
        if(s == null) {
            return ".bin";
        }
        String s1 = MimeTypeMap.getSingleton().getExtensionFromMimeType(s);
        if(s1 != null) {
            return "." + s1;
        }
        if(s.equalsIgnoreCase("text/html")) {
            return ".html";
        }
        return s.toLowerCase(Locale.ROOT).startsWith("text/") ? ".txt" : ".bin";
    }
}

