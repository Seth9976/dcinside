package androidx.media3.common;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.Map;

@UnstableApi
public final class FileTypes {
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @Target({ElementType.TYPE_USE})
    public @interface Type {
    }

    private static final String A = ".ac4";
    private static final String B = ".adts";
    private static final String C = ".aac";
    private static final String D = ".amr";
    private static final String E = ".flac";
    private static final String F = ".flv";
    private static final String G = ".mid";
    private static final String H = ".midi";
    private static final String I = ".smf";
    private static final String J = ".mk";
    private static final String K = ".webm";
    private static final String L = ".og";
    private static final String M = ".opus";
    private static final String N = ".mp3";
    private static final String O = ".mp4";
    private static final String P = ".m4";
    private static final String Q = ".mp4";
    private static final String R = ".cmf";
    private static final String S = ".ps";
    private static final String T = ".mpeg";
    private static final String U = ".mpg";
    private static final String V = ".m2p";
    private static final String W = ".ts";
    private static final String X = ".ts";
    private static final String Y = ".wav";
    private static final String Z = ".wave";
    public static final int a = -1;
    private static final String a0 = ".vtt";
    public static final int b = 0;
    private static final String b0 = ".webvtt";
    public static final int c = 1;
    private static final String c0 = ".jpg";
    public static final int d = 2;
    private static final String d0 = ".jpeg";
    public static final int e = 3;
    private static final String e0 = ".avi";
    public static final int f = 4;
    private static final String f0 = ".png";
    public static final int g = 5;
    private static final String g0 = ".webp";
    public static final int h = 6;
    private static final String h0 = ".bmp";
    public static final int i = 7;
    private static final String i0 = ".dib";
    public static final int j = 8;
    private static final String j0 = ".heic";
    public static final int k = 9;
    private static final String k0 = ".heif";
    public static final int l = 10;
    private static final String l0 = ".avif";
    public static final int m = 11;
    public static final int n = 12;
    public static final int o = 13;
    public static final int p = 14;
    public static final int q = 15;
    public static final int r = 16;
    public static final int s = 17;
    public static final int t = 18;
    public static final int u = 19;
    public static final int v = 20;
    public static final int w = 21;
    @VisibleForTesting
    static final String x = "Content-Type";
    private static final String y = ".ac3";
    private static final String z = ".ec3";

    public static int a(@Nullable String s) {
        if(s == null) {
            return -1;
        }
        String s1 = MimeTypes.v(s);
        s1.hashCode();
        switch(s1) {
            case "application/mp4": {
                return 8;
            }
            case "application/webm": {
                return 6;
            }
            case "audio/3gpp": {
                return 3;
            }
            case "audio/ac3": {
                return 0;
            }
            case "audio/ac4": {
                return 1;
            }
            case "audio/amr": {
                return 3;
            }
            case "audio/amr-wb": {
                return 3;
            }
            case "audio/eac3": {
                return 0;
            }
            case "audio/eac3-joc": {
                return 0;
            }
            case "audio/flac": {
                return 4;
            }
            case "audio/midi": {
                return 15;
            }
            case "audio/mp4": {
                return 8;
            }
            case "audio/mpeg": {
                return 7;
            }
            case "audio/ogg": {
                return 9;
            }
            case "audio/wav": {
                return 12;
            }
            case "audio/webm": {
                return 6;
            }
            case "audio/x-matroska": {
                return 6;
            }
            case "image/avif": {
                return 21;
            }
            case "image/bmp": {
                return 19;
            }
            case "image/heic": {
                return 20;
            }
            case "image/heif": {
                return 20;
            }
            case "image/jpeg": {
                return 14;
            }
            case "image/png": {
                return 17;
            }
            case "image/webp": {
                return 18;
            }
            case "text/vtt": {
                return 13;
            }
            case "video/mp2p": {
                return 10;
            }
            case "video/mp2t": {
                return 11;
            }
            case "video/mp4": {
                return 8;
            }
            case "video/webm": {
                return 6;
            }
            case "video/x-flv": {
                return 5;
            }
            case "video/x-matroska": {
                return 6;
            }
            case "video/x-msvideo": {
                return 16;
            }
            default: {
                return -1;
            }
        }
    }

    public static int b(Map map0) {
        List list0 = (List)map0.get("Content-Type");
        return list0 == null || list0.isEmpty() ? FileTypes.a(null) : FileTypes.a(((String)list0.get(0)));
    }

    public static int c(Uri uri0) {
        String s = uri0.getLastPathSegment();
        if(s == null) {
            return -1;
        }
        if(!s.endsWith(".ac3") && !s.endsWith(".ec3")) {
            if(s.endsWith(".ac4")) {
                return 1;
            }
            if(!s.endsWith(".adts") && !s.endsWith(".aac")) {
                if(s.endsWith(".amr")) {
                    return 3;
                }
                if(s.endsWith(".flac")) {
                    return 4;
                }
                if(s.endsWith(".flv")) {
                    return 5;
                }
                if(!s.endsWith(".mid") && !s.endsWith(".midi") && !s.endsWith(".smf")) {
                    if(!s.startsWith(".mk", s.length() - 4) && !s.endsWith(".webm")) {
                        if(s.endsWith(".mp3")) {
                            return 7;
                        }
                        if(!s.endsWith(".mp4") && !s.startsWith(".m4", s.length() - 4) && !s.startsWith(".mp4", s.length() - 5) && !s.startsWith(".cmf", s.length() - 5)) {
                            if(!s.startsWith(".og", s.length() - 4) && !s.endsWith(".opus")) {
                                if(!s.endsWith(".ps") && !s.endsWith(".mpeg") && !s.endsWith(".mpg") && !s.endsWith(".m2p")) {
                                    if(!s.endsWith(".ts") && !s.startsWith(".ts", s.length() - 4)) {
                                        if(!s.endsWith(".wav") && !s.endsWith(".wave")) {
                                            if(!s.endsWith(".vtt") && !s.endsWith(".webvtt")) {
                                                if(!s.endsWith(".jpg") && !s.endsWith(".jpeg")) {
                                                    if(s.endsWith(".avi")) {
                                                        return 16;
                                                    }
                                                    if(s.endsWith(".png")) {
                                                        return 17;
                                                    }
                                                    if(s.endsWith(".webp")) {
                                                        return 18;
                                                    }
                                                    if(!s.endsWith(".bmp") && !s.endsWith(".dib")) {
                                                        if(!s.endsWith(".heic") && !s.endsWith(".heif")) {
                                                            return s.endsWith(".avif") ? 21 : -1;
                                                        }
                                                        return 20;
                                                    }
                                                    return 19;
                                                }
                                                return 14;
                                            }
                                            return 13;
                                        }
                                        return 12;
                                    }
                                    return 11;
                                }
                                return 10;
                            }
                            return 9;
                        }
                        return 8;
                    }
                    return 6;
                }
                return 15;
            }
            return 2;
        }
        return 0;
    }
}

