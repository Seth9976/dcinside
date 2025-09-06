package g3;

import io.realm.transformer.k;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.Scanner;
import jeb.synthetic.TWR;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.w;
import kotlin.text.f;
import kotlin.text.v;
import y4.l;

public final class b {
    public static final class a {
        private a() {
        }

        public a(w w0) {
        }

        // 去混淆评级： 中等(110)
        @l
        public final String a() {
            return "unknown";
        }

        private final String b() throws FileNotFoundException, NoSuchAlgorithmException [...] // 潜在的解密器

        private final String c() throws SocketException, NoSuchAlgorithmException {
            String s = k.b(k.d(NetworkInterface.getByName("en0").getHardwareAddress()));
            L.o(s, "hexStringify(Utils.sha256Hash(hardwareAddress))");
            return s;
        }

        private final String d() throws IOException, NoSuchAlgorithmException {
            String s;
            Process process0 = Runtime.getRuntime().exec(new String[]{"wmic", "csproduct", "get", "UUID"});
            InputStream inputStream0 = process0.getInputStream();
            Scanner scanner0 = new Scanner(process0.getInputStream());
            while(true) {
                try {
                    s = null;
                    if(!scanner0.hasNext()) {
                        break;
                    }
                    String s1 = scanner0.next();
                    L.o(s1, "next");
                    if(v.W2(s1, "UUID", false, 2, null)) {
                        String s2 = scanner0.next();
                        L.o(s2, "sc.next()");
                        int v = s2.length() - 1;
                        int v1 = 0;
                        boolean z = false;
                        while(v1 <= v) {
                            boolean z1 = L.t(s2.charAt((z ? v : v1)), 0x20) <= 0;
                            if(z) {
                                if(!z1) {
                                    break;
                                }
                                --v;
                            }
                            else if(z1) {
                                ++v1;
                            }
                            else {
                                z = true;
                            }
                        }
                        s = s2.subSequence(v1, v + 1).toString();
                        break;
                    }
                }
                catch(Throwable throwable0) {
                    TWR.safeClose$NT(inputStream0, throwable0);
                    throw throwable0;
                }
            }
            inputStream0.close();
            if(s == null) {
                return "unknown";
            }
            byte[] arr_b = s.getBytes(f.b);
            L.o(arr_b, "this as java.lang.String).getBytes(charset)");
            String s3 = k.b(k.d(arr_b));
            L.o(s3, "hexStringify(Utils.sha25…sh(result.toByteArray()))");
            return s3;
        }
    }

    @l
    public static final a a = null;
    @l
    private static final String b = "unknown";
    @l
    private static final String c;
    private static final boolean d;
    private static final boolean e;
    private static final boolean f;

    static {
        b.a = new a(null);
        L.o("Linux", "getProperty(\"os.name\")");
        Locale locale0 = Locale.getDefault();
        L.o(locale0, "getDefault()");
        String s = "Linux".toLowerCase(locale0);
        L.o(s, "this as java.lang.String).toLowerCase(locale)");
        b.c = s;
        b.d = v.W2(s, "win", false, 2, null);
        b.e = v.W2(s, "mac", false, 2, null);
        b.f = v.W2(s, "inux", false, 2, null);
    }

    public static final boolean a() [...] // 潜在的解密器

    public static final boolean b() [...] // 潜在的解密器

    public static final boolean c() [...] // 潜在的解密器
}

