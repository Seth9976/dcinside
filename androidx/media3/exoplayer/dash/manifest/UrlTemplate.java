package androidx.media3.exoplayer.dash.manifest;

import androidx.media3.common.util.UnstableApi;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@UnstableApi
public final class UrlTemplate {
    private final List a;
    private final List b;
    private final List c;
    private static final String d = "RepresentationID";
    private static final String e = "Number";
    private static final String f = "Bandwidth";
    private static final String g = "Time";
    private static final String h = "$$";
    private static final String i = "%01d";
    private static final int j = 1;
    private static final int k = 2;
    private static final int l = 3;
    private static final int m = 4;

    private UrlTemplate(List list0, List list1, List list2) {
        this.a = list0;
        this.b = list1;
        this.c = list2;
    }

    public String a(String s, long v, int v1, long v2) {
        StringBuilder stringBuilder0 = new StringBuilder();
        for(int v3 = 0; v3 < this.b.size(); ++v3) {
            stringBuilder0.append(((String)this.a.get(v3)));
            if(((int)(((Integer)this.b.get(v3)))) == 1) {
                stringBuilder0.append(s);
            }
            else {
                switch(((int)(((Integer)this.b.get(v3))))) {
                    case 2: {
                        stringBuilder0.append(String.format(Locale.US, ((String)this.c.get(v3)), v));
                        break;
                    }
                    case 3: {
                        stringBuilder0.append(String.format(Locale.US, ((String)this.c.get(v3)), v1));
                        break;
                    }
                    case 4: {
                        stringBuilder0.append(String.format(Locale.US, ((String)this.c.get(v3)), v2));
                    }
                }
            }
        }
        stringBuilder0.append(((String)this.a.get(this.b.size())));
        return stringBuilder0.toString();
    }

    public static UrlTemplate b(String s) {
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        UrlTemplate.c(s, arrayList0, arrayList1, arrayList2);
        return new UrlTemplate(arrayList0, arrayList1, arrayList2);
    }

    // This method was un-flattened
    private static void c(String s, List list0, List list1, List list2) {
        String s2;
        list0.add("");
        int v = 0;
        while(v < s.length()) {
            int v1 = s.indexOf("$", v);
            if(v1 == -1) {
                list0.set(list1.size(), ((String)list0.get(list1.size())) + s.substring(v));
                v = s.length();
            }
            else if(v1 != v) {
                list0.set(list1.size(), ((String)list0.get(list1.size())) + s.substring(v, v1));
                v = v1;
            }
            else if(s.startsWith("$$", v)) {
                list0.set(list1.size(), ((String)list0.get(list1.size())) + "$");
                v += 2;
            }
            else {
                list2.add("");
                int v2 = s.indexOf("$", v + 1);
                String s1 = s.substring(v + 1, v2);
                if(s1.equals("RepresentationID")) {
                    list1.add(1);
                }
                else {
                    int v3 = s1.indexOf("%0");
                    if(v3 == -1) {
                        s2 = "%01d";
                    }
                    else {
                        s2 = s1.substring(v3);
                        s2 = s2.endsWith("d") || s2.endsWith("x") || s2.endsWith("X") ? s1.substring(v3) : s2 + "d";
                        s1 = s1.substring(0, v3);
                    }
                    s1.hashCode();
                    switch(s1) {
                        case "Bandwidth": {
                            list1.add(3);
                            break;
                        }
                        case "Number": {
                            list1.add(2);
                            break;
                        }
                        case "Time": {
                            list1.add(4);
                            break;
                        }
                        default: {
                            throw new IllegalArgumentException("Invalid template: " + s);
                        }
                    }
                    list2.set(list1.size() - 1, s2);
                }
                list0.add("");
                v = v2 + 1;
            }
        }
    }
}

