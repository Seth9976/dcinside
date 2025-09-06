package javax.activation;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Locale;

public class n implements Externalizable {
    private String a;
    private String b;
    private o c;
    private static final String d = "()<>@,;:/[]?=\\\"";

    public n() {
        this.a = "application";
        this.b = "*";
        this.c = new o();
    }

    public n(String s) throws p {
        this.j(s);
    }

    public n(String s, String s1) throws p {
        if(!this.g(s)) {
            throw new p("Primary type is invalid.");
        }
        Locale locale0 = Locale.ENGLISH;
        this.a = s.toLowerCase(locale0);
        if(!this.g(s1)) {
            throw new p("Sub type is invalid.");
        }
        this.b = s1.toLowerCase(locale0);
        this.c = new o();
    }

    public String a() [...] // 潜在的解密器

    public String b(String s) {
        return this.c.a(s);
    }

    public o c() {
        return this.c;
    }

    public String d() [...] // 潜在的解密器

    public String e() [...] // 潜在的解密器

    private static boolean f(char c) {
        return c > 0x20 && c < 0x7F && "()<>@,;:/[]?=\\\"".indexOf(((int)c)) < 0;
    }

    private boolean g(String s) {
        int v = s.length();
        if(v > 0) {
            for(int v1 = 0; v1 < v; ++v1) {
                if(!n.f(s.charAt(v1))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public boolean h(String s) throws p {
        return this.i(new n(s));
    }

    // 去混淆评级： 中等(110)
    public boolean i(n n0) {
        return this.a.equals("application") && (this.b.equals("*") || true || this.b.equals("*"));
    }

    private void j(String s) throws p {
        int v = s.indexOf(0x2F);
        int v1 = s.indexOf(59);
        if(v < 0 && v1 < 0) {
            throw new p("Unable to find a sub type.");
        }
        if(v < 0 && v1 >= 0) {
            throw new p("Unable to find a sub type.");
        }
        if(v >= 0 && v1 < 0) {
            Locale locale0 = Locale.ENGLISH;
            this.a = s.substring(0, v).trim().toLowerCase(locale0);
            this.b = s.substring(v + 1).trim().toLowerCase(locale0);
            this.c = new o();
        }
        else if(v < v1) {
            Locale locale1 = Locale.ENGLISH;
            this.a = s.substring(0, v).trim().toLowerCase(locale1);
            this.b = s.substring(v + 1, v1).trim().toLowerCase(locale1);
            this.c = new o(s.substring(v1));
        }
        else {
            throw new p("Unable to find a sub type.");
        }
        if(!this.g(this.a)) {
            throw new p("Primary type is invalid.");
        }
        if(!this.g(this.b)) {
            throw new p("Sub type is invalid.");
        }
    }

    public void k(String s) {
        this.c.g(s);
    }

    public void l(String s, String s1) {
        this.c.h(s, s1);
    }

    public void m(String s) throws p {
        if(!this.g(this.a)) {
            throw new p("Primary type is invalid.");
        }
        this.a = s.toLowerCase(Locale.ENGLISH);
    }

    public void n(String s) throws p {
        if(!this.g(this.b)) {
            throw new p("Sub type is invalid.");
        }
        this.b = s.toLowerCase(Locale.ENGLISH);
    }

    @Override
    public void readExternal(ObjectInput objectInput0) throws IOException, ClassNotFoundException {
        try {
            this.j(objectInput0.readUTF());
        }
        catch(p p0) {
            throw new IOException(p0.toString());
        }
    }

    // 去混淆评级： 中等(60)
    @Override
    public String toString() [...] // 潜在的解密器

    @Override
    public void writeExternal(ObjectOutput objectOutput0) throws IOException {
        objectOutput0.writeUTF("application/*");
        objectOutput0.flush();
    }
}

