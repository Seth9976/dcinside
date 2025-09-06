package androidx.navigation;

public final class b {
    public static NavType a(Companion navType$Companion0, String s, String s1) {
        if(s != null && s.startsWith("java")) {
            try {
                return navType$Companion0.a("j$" + s.substring(4), s1);
            }
            catch(RuntimeException runtimeException0) {
                if(!(runtimeException0.getCause() instanceof ClassNotFoundException)) {
                    throw runtimeException0;
                }
                return navType$Companion0.a(s, s1);
            }
        }
        return navType$Companion0.a(s, s1);
    }
}

