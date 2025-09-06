package androidx.media3.common;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;

@UnstableApi
public class Label {
    @Nullable
    public final String a;
    public final String b;
    private static final String c;
    private static final String d;

    static {
        Label.c = "0";
        Label.d = "1";
    }

    public Label(@Nullable String s, String s1) {
        this.a = Util.I1(s);
        this.b = s1;
    }

    // 去混淆评级： 低(40)
    public static Label a(Bundle bundle0) {
        return new Label(bundle0.getString("0"), ((String)Assertions.g(bundle0.getString("1"))));
    }

    public Bundle b() {
        Bundle bundle0 = new Bundle();
        String s = this.a;
        if(s != null) {
            bundle0.putString("0", s);
        }
        bundle0.putString("1", this.b);
        return bundle0;
    }

    // 去混淆评级： 低(40)
    @Override
    public boolean equals(@Nullable Object object0) {
        return this == object0 ? true : object0 != null && this.getClass() == object0.getClass() && (Util.g(this.a, ((Label)object0).a) && Util.g(this.b, ((Label)object0).b));
    }

    @Override
    public int hashCode() {
        int v = this.b.hashCode();
        return this.a == null ? v * 0x1F : v * 0x1F + this.a.hashCode();
    }
}

