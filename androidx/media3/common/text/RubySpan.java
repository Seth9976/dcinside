package androidx.media3.common.text;

import android.os.Bundle;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
public final class RubySpan implements LanguageFeatureSpan {
    public final String a;
    public final int b;
    private static final String c;
    private static final String d;

    static {
        RubySpan.c = "0";
        RubySpan.d = "1";
    }

    public RubySpan(String s, int v) {
        this.a = s;
        this.b = v;
    }

    public static RubySpan a(Bundle bundle0) {
        return new RubySpan(((String)Assertions.g(bundle0.getString(RubySpan.c))), bundle0.getInt(RubySpan.d));
    }

    public Bundle b() {
        Bundle bundle0 = new Bundle();
        bundle0.putString("0", this.a);
        bundle0.putInt("1", this.b);
        return bundle0;
    }
}

