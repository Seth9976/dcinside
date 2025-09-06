package androidx.core.content;

import android.content.SharedPreferences.Editor;

@Deprecated
public final class SharedPreferencesCompat {
    @Deprecated
    public static final class EditorCompat {
        static class Helper {
            public void a(SharedPreferences.Editor sharedPreferences$Editor0) {
                try {
                    sharedPreferences$Editor0.apply();
                }
                catch(AbstractMethodError unused_ex) {
                    sharedPreferences$Editor0.commit();
                }
            }
        }

        private final Helper a;
        private static EditorCompat b;

        private EditorCompat() {
            this.a = new Helper();
        }

        @Deprecated
        public void a(SharedPreferences.Editor sharedPreferences$Editor0) {
            this.a.a(sharedPreferences$Editor0);
        }

        @Deprecated
        public static EditorCompat b() {
            if(EditorCompat.b == null) {
                EditorCompat.b = new EditorCompat();
            }
            return EditorCompat.b;
        }
    }

}

