package androidx.media3.datasource.cache;

import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class SimpleCacheSpan extends CacheSpan {
    static final String g = ".exo";
    private static final String h = ".v3.exo";
    private static final Pattern i;
    private static final Pattern j;
    private static final Pattern k;

    static {
        SimpleCacheSpan.i = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 0x20);
        SimpleCacheSpan.j = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 0x20);
        SimpleCacheSpan.k = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 0x20);
    }

    private SimpleCacheSpan(String s, long v, long v1, long v2, @Nullable File file0) {
        super(s, v, v1, v2, file0);
    }

    public SimpleCacheSpan d(File file0, long v) {
        Assertions.i(this.d);
        return new SimpleCacheSpan(this.a, this.b, this.c, v, file0);
    }

    @Nullable
    public static SimpleCacheSpan e(File file0, long v, long v1, CachedContentIndex cachedContentIndex0) {
        File file2;
        String s = file0.getName();
        if(s.endsWith(".v3.exo")) {
            file2 = file0;
        }
        else {
            File file1 = SimpleCacheSpan.j(file0, cachedContentIndex0);
            if(file1 == null) {
                return null;
            }
            file2 = file1;
            s = file1.getName();
        }
        Matcher matcher0 = SimpleCacheSpan.k.matcher(s);
        if(!matcher0.matches()) {
            return null;
        }
        String s1 = cachedContentIndex0.j(Integer.parseInt(((String)Assertions.g(matcher0.group(1)))));
        if(s1 == null) {
            return null;
        }
        long v2 = v == -1L ? file2.length() : v;
        if(v2 == 0L) {
            return null;
        }
        long v3 = Long.parseLong(((String)Assertions.g(matcher0.group(2))));
        return v1 == 0x8000000000000001L ? new SimpleCacheSpan(s1, v3, v2, Long.parseLong(((String)Assertions.g(matcher0.group(3)))), file2) : new SimpleCacheSpan(s1, v3, v2, v1, file2);
    }

    @Nullable
    public static SimpleCacheSpan f(File file0, long v, CachedContentIndex cachedContentIndex0) {
        return SimpleCacheSpan.e(file0, v, 0x8000000000000001L, cachedContentIndex0);
    }

    public static SimpleCacheSpan g(String s, long v, long v1) {
        return new SimpleCacheSpan(s, v, v1, 0x8000000000000001L, null);
    }

    public static SimpleCacheSpan h(String s, long v) {
        return new SimpleCacheSpan(s, v, -1L, 0x8000000000000001L, null);
    }

    public static File i(File file0, int v, long v1, long v2) {
        return new File(file0, v + "." + v1 + "." + v2 + ".v3.exo");
    }

    @Nullable
    private static File j(File file0, CachedContentIndex cachedContentIndex0) {
        String s1;
        String s = file0.getName();
        Matcher matcher0 = SimpleCacheSpan.j.matcher(s);
        if(matcher0.matches()) {
            s1 = Util.A2(((String)Assertions.g(matcher0.group(1))));
        }
        else {
            matcher0 = SimpleCacheSpan.i.matcher(s);
            s1 = matcher0.matches() ? ((String)Assertions.g(matcher0.group(1))) : null;
        }
        if(s1 == null) {
            return null;
        }
        File file1 = SimpleCacheSpan.i(((File)Assertions.k(file0.getParentFile())), cachedContentIndex0.e(s1), Long.parseLong(((String)Assertions.g(matcher0.group(2)))), Long.parseLong(((String)Assertions.g(matcher0.group(3)))));
        return file0.renameTo(file1) ? file1 : null;
    }
}

