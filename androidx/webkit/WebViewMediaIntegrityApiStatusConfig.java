package androidx.webkit;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.HashMap;
import java.util.Map;

public class WebViewMediaIntegrityApiStatusConfig {
    public static final class Builder {
        private int a;
        private Map b;

        public Builder(int v) {
            this.a = v;
            this.b = new HashMap();
        }

        @NonNull
        public Builder c(@NonNull String s, int v) {
            this.b.put(s, v);
            return this;
        }

        @NonNull
        public WebViewMediaIntegrityApiStatusConfig d() {
            return new WebViewMediaIntegrityApiStatusConfig(this);
        }

        @NonNull
        @RestrictTo({Scope.a})
        public Builder e(@NonNull Map map0) {
            this.b = map0;
            return this;
        }
    }

    private int a;
    private Map b;
    public static final int c = 2;
    public static final int d = 1;
    public static final int e;

    public WebViewMediaIntegrityApiStatusConfig(@NonNull Builder webViewMediaIntegrityApiStatusConfig$Builder0) {
        this.a = webViewMediaIntegrityApiStatusConfig$Builder0.a;
        this.b = webViewMediaIntegrityApiStatusConfig$Builder0.b;
    }

    public int a() {
        return this.a;
    }

    @NonNull
    public Map b() {
        return this.b;
    }
}

