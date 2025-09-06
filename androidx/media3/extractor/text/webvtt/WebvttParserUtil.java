package androidx.media3.extractor.text.webvtt;

import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@UnstableApi
public final class WebvttParserUtil {
    private static final Pattern a = null;
    private static final String b = "WEBVTT";

    static {
        WebvttParserUtil.a = Pattern.compile("^NOTE([ \t].*)?$");
    }

    @Nullable
    public static Matcher a(ParsableByteArray parsableByteArray0) {
        String s;
    alab1:
        while(true) {
            do {
                s = parsableByteArray0.u();
                if(s == null) {
                    break alab1;
                }
                if(!WebvttParserUtil.a.matcher(s).matches()) {
                    goto label_6;
                }
            label_3:
                String s1 = parsableByteArray0.u();
            }
            while(s1 == null || s1.isEmpty());
            goto label_3;
        label_6:
            Matcher matcher0 = WebvttCueParser.f.matcher(s);
            if(matcher0.matches()) {
                return matcher0;
            }
        }
        return null;
    }

    public static boolean b(ParsableByteArray parsableByteArray0) {
        String s = parsableByteArray0.u();
        return s != null && s.startsWith("WEBVTT");
    }

    public static float c(String s) throws NumberFormatException {
        if(!s.endsWith("%")) {
            throw new NumberFormatException("Percentages must end with %");
        }
        return Float.parseFloat(s.substring(0, s.length() - 1)) / 100.0f;
    }

    public static long d(String s) throws NumberFormatException {
        String[] arr_s = Util.n2(s, "\\.");
        String[] arr_s1 = Util.m2(arr_s[0], ":");
        long v1 = 0L;
        for(int v = 0; v < arr_s1.length; ++v) {
            v1 = v1 * 60L + Long.parseLong(arr_s1[v]);
        }
        return (arr_s.length == 2 ? v1 * 1000L + Long.parseLong(arr_s[1]) : v1 * 1000L) * 1000L;
    }

    public static void e(ParsableByteArray parsableByteArray0) throws ParserException {
        int v = parsableByteArray0.f();
        if(WebvttParserUtil.b(parsableByteArray0)) {
            return;
        }
        parsableByteArray0.Y(v);
        throw ParserException.a(("Expected WEBVTT. Got " + parsableByteArray0.u()), null);
    }
}

