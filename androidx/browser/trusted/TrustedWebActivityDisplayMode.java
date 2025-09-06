package androidx.browser.trusted;

import android.os.Bundle;
import androidx.annotation.NonNull;

public interface TrustedWebActivityDisplayMode {
    public static class DefaultMode implements TrustedWebActivityDisplayMode {
        private static final int b;

        @Override  // androidx.browser.trusted.TrustedWebActivityDisplayMode
        @NonNull
        public Bundle toBundle() {
            Bundle bundle0 = new Bundle();
            bundle0.putInt("androidx.browser.trusted.displaymode.KEY_ID", 0);
            return bundle0;
        }
    }

    public static class ImmersiveMode implements TrustedWebActivityDisplayMode {
        private final boolean b;
        private final int c;
        private static final int d = 1;
        public static final String e = "androidx.browser.trusted.displaymode.KEY_STICKY";
        public static final String f = "androidx.browser.trusted.displaymode.KEY_CUTOUT_MODE";

        public ImmersiveMode(boolean z, int v) {
            this.b = z;
            this.c = v;
        }

        @NonNull
        static TrustedWebActivityDisplayMode a(@NonNull Bundle bundle0) {
            return new ImmersiveMode(bundle0.getBoolean("androidx.browser.trusted.displaymode.KEY_STICKY"), bundle0.getInt("androidx.browser.trusted.displaymode.KEY_CUTOUT_MODE"));
        }

        public boolean b() {
            return this.b;
        }

        public int c() {
            return this.c;
        }

        @Override  // androidx.browser.trusted.TrustedWebActivityDisplayMode
        @NonNull
        public Bundle toBundle() {
            Bundle bundle0 = new Bundle();
            bundle0.putInt("androidx.browser.trusted.displaymode.KEY_ID", 1);
            bundle0.putBoolean("androidx.browser.trusted.displaymode.KEY_STICKY", this.b);
            bundle0.putInt("androidx.browser.trusted.displaymode.KEY_CUTOUT_MODE", this.c);
            return bundle0;
        }
    }

    public static final String a = "androidx.browser.trusted.displaymode.KEY_ID";

    @NonNull
    Bundle toBundle();
}

