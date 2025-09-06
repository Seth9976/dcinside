package javax.activation;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Locale;

public class o {
    private Hashtable a;
    private static final String b = "()<>@,;:/[]?=\\\"";

    public o() {
        this.a = new Hashtable();
    }

    public o(String s) throws p {
        this.a = new Hashtable();
        this.e(s);
    }

    public String a(String s) {
        return (String)this.a.get(s.trim().toLowerCase(Locale.ENGLISH));
    }

    public Enumeration b() {
        return this.a.keys();
    }

    public boolean c() {
        return this.a.isEmpty();
    }

    private static boolean d(char c) {
        return c > 0x20 && c < 0x7F && "()<>@,;:/[]?=\\\"".indexOf(((int)c)) < 0;
    }

    protected void e(String s) throws p {
        int v8;
        String s2;
        if(s == null) {
            return;
        }
        int v = s.length();
        if(v <= 0) {
            return;
        }
        int v1;
        for(v1 = o.j(s, 0); v1 < v && s.charAt(v1) == 59; v1 = o.j(s, v8)) {
            int v2 = o.j(s, v1 + 1);
            if(v2 >= v) {
                return;
            }
            int v3;
            for(v3 = v2; v3 < v && o.d(s.charAt(v3)); ++v3) {
            }
            String s1 = s.substring(v2, v3).toLowerCase(Locale.ENGLISH);
            int v4 = o.j(s, v3);
            if(v4 >= v || s.charAt(v4) != 61) {
                throw new p("Couldn\'t find the \'=\' that separates a parameter name from its value.");
            }
            int v5 = o.j(s, v4 + 1);
            if(v5 >= v) {
                throw new p("Couldn\'t find a value for parameter named " + s1);
            }
            int v6 = s.charAt(v5);
            if(v6 == 34) {
                if(v5 + 1 >= v) {
                    throw new p("Encountered unterminated quoted parameter value.");
                }
                int v7;
                for(v7 = v5 + 1; v7 < v; ++v7) {
                    v6 = s.charAt(v7);
                    if(v6 == 34) {
                        break;
                    }
                    if(v6 == 92) {
                        ++v7;
                    }
                }
                if(v6 != 34) {
                    throw new p("Encountered unterminated quoted parameter value.");
                }
                s2 = o.k(s.substring(v5 + 1, v7));
                v8 = v7 + 1;
            }
            else {
                if(!o.d(((char)v6))) {
                    throw new p("Unexpected character encountered at index " + v5);
                }
                for(v8 = v5; v8 < v && o.d(s.charAt(v8)); ++v8) {
                }
                s2 = s.substring(v5, v8);
            }
            this.a.put(s1, s2);
        }
        if(v1 < v) {
            throw new p("More characters encountered in input than expected.");
        }
    }

    private static String f(String s) {
        int v = s.length();
        int v3 = 0;
        for(int v2 = 0; v2 < v && v3 == 0; ++v2) {
            v3 = !o.d(s.charAt(v2));
        }
        if(v3 != 0) {
            StringBuffer stringBuffer0 = new StringBuffer();
            stringBuffer0.ensureCapacity(((int)(((double)v) * 1.5)));
            stringBuffer0.append('\"');
            for(int v1 = 0; v1 < v; ++v1) {
                int v4 = s.charAt(v1);
                if(v4 == 34 || v4 == 92) {
                    stringBuffer0.append('\\');
                }
                stringBuffer0.append(((char)v4));
            }
            stringBuffer0.append('\"');
            return stringBuffer0.toString();
        }
        return s;
    }

    public void g(String s) {
        this.a.remove(s.trim().toLowerCase(Locale.ENGLISH));
    }

    public void h(String s, String s1) {
        this.a.put(s.trim().toLowerCase(Locale.ENGLISH), s1);
    }

    public int i() {
        return this.a.size();
    }

    private static int j(String s, int v) {
        int v1 = s.length();
        while(v < v1 && Character.isWhitespace(s.charAt(v))) {
            ++v;
        }
        return v;
    }

    private static String k(String s) {
        int v = s.length();
        StringBuffer stringBuffer0 = new StringBuffer();
        stringBuffer0.ensureCapacity(v);
        boolean z = false;
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = s.charAt(v1);
            if(!z && v2 != 92) {
                stringBuffer0.append(((char)v2));
            }
            else if(z) {
                stringBuffer0.append(((char)v2));
                z = false;
            }
            else {
                z = true;
            }
        }
        return stringBuffer0.toString();
    }

    @Override
    public String toString() [...] // 潜在的解密器
}

