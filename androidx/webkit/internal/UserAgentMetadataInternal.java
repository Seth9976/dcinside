package androidx.webkit.internal;

import androidx.annotation.NonNull;
import androidx.webkit.UserAgentMetadata.BrandVersion;
import androidx.webkit.UserAgentMetadata.Builder;
import androidx.webkit.UserAgentMetadata;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserAgentMetadataInternal {
    private static final String a = "MOBILE";
    private static final String b = "BRAND_VERSION_LIST";
    private static final String c = "FULL_VERSION";
    private static final String d = "PLATFORM";
    private static final String e = "PLATFORM_VERSION";
    private static final String f = "ARCHITECTURE";
    private static final String g = "MODEL";
    private static final String h = "BITNESS";
    private static final String i = "WOW64";
    private static final int j = 3;

    @NonNull
    static Map a(@NonNull UserAgentMetadata userAgentMetadata0) {
        Map map0 = new HashMap();
        map0.put("BRAND_VERSION_LIST", UserAgentMetadataInternal.b(userAgentMetadata0.c()));
        map0.put("FULL_VERSION", userAgentMetadata0.d());
        map0.put("PLATFORM", userAgentMetadata0.f());
        map0.put("PLATFORM_VERSION", userAgentMetadata0.g());
        map0.put("ARCHITECTURE", userAgentMetadata0.a());
        map0.put("MODEL", userAgentMetadata0.e());
        map0.put("MOBILE", Boolean.valueOf(userAgentMetadata0.h()));
        map0.put("BITNESS", userAgentMetadata0.b());
        map0.put("WOW64", Boolean.valueOf(userAgentMetadata0.i()));
        return map0;
    }

    private static String[][] b(List list0) {
        if(list0 != null && !list0.isEmpty()) {
            String[][] arr2_s = new String[list0.size()][3];
            for(int v = 0; v < list0.size(); ++v) {
                String[] arr_s = arr2_s[v];
                arr_s[0] = ((BrandVersion)list0.get(v)).a();
                String[] arr_s1 = arr2_s[v];
                arr_s1[1] = ((BrandVersion)list0.get(v)).c();
                String[] arr_s2 = arr2_s[v];
                arr_s2[2] = ((BrandVersion)list0.get(v)).b();
            }
            return arr2_s;
        }
        return null;
    }

    @NonNull
    static UserAgentMetadata c(@NonNull Map map0) {
        Builder userAgentMetadata$Builder0 = new Builder();
        Object object0 = map0.get("BRAND_VERSION_LIST");
        if(object0 != null) {
            ArrayList arrayList0 = new ArrayList();
            for(int v = 0; v < ((String[][])object0).length; ++v) {
                String[] arr_s = ((String[][])object0)[v];
                arrayList0.add(new androidx.webkit.UserAgentMetadata.BrandVersion.Builder().b(arr_s[0]).d(arr_s[1]).c(arr_s[2]).a());
            }
            userAgentMetadata$Builder0.d(arrayList0);
        }
        String s = (String)map0.get("FULL_VERSION");
        if(s != null) {
            userAgentMetadata$Builder0.e(s);
        }
        String s1 = (String)map0.get("PLATFORM");
        if(s1 != null) {
            userAgentMetadata$Builder0.h(s1);
        }
        String s2 = (String)map0.get("PLATFORM_VERSION");
        if(s2 != null) {
            userAgentMetadata$Builder0.i(s2);
        }
        String s3 = (String)map0.get("ARCHITECTURE");
        if(s3 != null) {
            userAgentMetadata$Builder0.b(s3);
        }
        String s4 = (String)map0.get("MODEL");
        if(s4 != null) {
            userAgentMetadata$Builder0.g(s4);
        }
        Boolean boolean0 = (Boolean)map0.get("MOBILE");
        if(boolean0 != null) {
            userAgentMetadata$Builder0.f(boolean0.booleanValue());
        }
        Integer integer0 = (Integer)map0.get("BITNESS");
        if(integer0 != null) {
            userAgentMetadata$Builder0.c(((int)integer0));
        }
        Boolean boolean1 = (Boolean)map0.get("WOW64");
        if(boolean1 != null) {
            userAgentMetadata$Builder0.j(boolean1.booleanValue());
        }
        return userAgentMetadata$Builder0.a();
    }
}

