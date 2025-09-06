package androidx.media3.extractor.text.ssa;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import com.google.common.base.c;

final class SsaDialogueFormat {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    private SsaDialogueFormat(int v, int v1, int v2, int v3, int v4) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
    }

    // This method was un-flattened
    @Nullable
    public static SsaDialogueFormat a(String s) {
        Assertions.a(s.startsWith("Format:"));
        String[] arr_s = TextUtils.split(s.substring(7), ",");
        int v1 = -1;
        int v2 = -1;
        int v3 = -1;
        int v4 = -1;
        for(int v = 0; v < arr_s.length; ++v) {
            String s1 = c.g(arr_s[v].trim());
            s1.hashCode();
            switch(s1) {
                case "end": {
                    v2 = v;
                    break;
                }
                case "start": {
                    v1 = v;
                    break;
                }
                case "style": {
                    v3 = v;
                    break;
                }
                case "text": {
                    v4 = v;
                }
            }
        }
        return v1 == -1 || v2 == -1 || v4 == -1 ? null : new SsaDialogueFormat(v1, v2, v3, v4, arr_s.length);
    }
}

