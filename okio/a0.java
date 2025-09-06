package okio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import kotlin.jvm.internal.L;
import okio.internal.j;
import y4.l;

final class a0 {
    private static final Logger a;

    static {
        a0.a = Logger.getLogger("okio.Okio");
    }

    @l
    public static final m0 b(@l File file0) throws FileNotFoundException {
        L.p(file0, "<this>");
        return Z.p(new FileOutputStream(file0, true));
    }

    @l
    public static final v c(@l ClassLoader classLoader0) {
        L.p(classLoader0, "<this>");
        return new j(classLoader0, true, null, 4, null);
    }

    @l
    public static final p d(@l m0 m00, @l Cipher cipher0) {
        L.p(m00, "<this>");
        L.p(cipher0, "cipher");
        return new p(Z.d(m00), cipher0);
    }

    @l
    public static final q e(@l o0 o00, @l Cipher cipher0) {
        L.p(o00, "<this>");
        L.p(cipher0, "cipher");
        return new q(Z.e(o00), cipher0);
    }

    @l
    public static final C f(@l m0 m00, @l MessageDigest messageDigest0) {
        L.p(m00, "<this>");
        L.p(messageDigest0, "digest");
        return new C(m00, messageDigest0);
    }

    @l
    public static final C g(@l m0 m00, @l Mac mac0) {
        L.p(m00, "<this>");
        L.p(mac0, "mac");
        return new C(m00, mac0);
    }

    @l
    public static final D h(@l o0 o00, @l MessageDigest messageDigest0) {
        L.p(o00, "<this>");
        L.p(messageDigest0, "digest");
        return new D(o00, messageDigest0);
    }

    @l
    public static final D i(@l o0 o00, @l Mac mac0) {
        L.p(o00, "<this>");
        L.p(mac0, "mac");
        return new D(o00, mac0);
    }

    public static final boolean j(@l AssertionError assertionError0) {
        L.p(assertionError0, "<this>");
        if(assertionError0.getCause() != null) {
            String s = assertionError0.getMessage();
            return s == null ? false : kotlin.text.v.W2(s, "getsockname failed", false, 2, null);
        }
        return false;
    }

    @l
    public static final v k(@l v v0, @l e0 e00) throws IOException {
        L.p(v0, "<this>");
        L.p(e00, "zipPath");
        return okio.internal.l.e(e00, v0, null, 4, null);
    }

    @l
    @z3.j
    public static final m0 l(@l File file0) throws FileNotFoundException {
        L.p(file0, "<this>");
        return a0.q(file0, false, 1, null);
    }

    @l
    @z3.j
    public static final m0 m(@l File file0, boolean z) throws FileNotFoundException {
        L.p(file0, "<this>");
        return Z.p(new FileOutputStream(file0, z));
    }

    @l
    public static final m0 n(@l OutputStream outputStream0) {
        L.p(outputStream0, "<this>");
        return new d0(outputStream0, new q0());
    }

    @l
    public static final m0 o(@l Socket socket0) throws IOException {
        L.p(socket0, "<this>");
        n0 n00 = new n0(socket0);
        OutputStream outputStream0 = socket0.getOutputStream();
        L.o(outputStream0, "getOutputStream(...)");
        return n00.sink(new d0(outputStream0, n00));
    }

    @l
    public static final m0 p(@l Path path0, @l OpenOption[] arr_openOption) throws IOException {
        L.p(path0, "<this>");
        L.p(arr_openOption, "options");
        OutputStream outputStream0 = Files.newOutputStream(path0, ((OpenOption[])Arrays.copyOf(arr_openOption, arr_openOption.length)));
        L.o(outputStream0, "newOutputStream(...)");
        return Z.p(outputStream0);
    }

    public static m0 q(File file0, boolean z, int v, Object object0) throws FileNotFoundException {
        if((v & 1) != 0) {
            z = false;
        }
        return Z.o(file0, z);
    }

    @l
    public static final o0 r(@l File file0) throws FileNotFoundException {
        L.p(file0, "<this>");
        return new F(new FileInputStream(file0), q0.NONE);
    }

    @l
    public static final o0 s(@l InputStream inputStream0) {
        L.p(inputStream0, "<this>");
        return new F(inputStream0, new q0());
    }

    @l
    public static final o0 t(@l Socket socket0) throws IOException {
        L.p(socket0, "<this>");
        n0 n00 = new n0(socket0);
        InputStream inputStream0 = socket0.getInputStream();
        L.o(inputStream0, "getInputStream(...)");
        return n00.source(new F(inputStream0, n00));
    }

    @l
    public static final o0 u(@l Path path0, @l OpenOption[] arr_openOption) throws IOException {
        L.p(path0, "<this>");
        L.p(arr_openOption, "options");
        InputStream inputStream0 = Files.newInputStream(path0, ((OpenOption[])Arrays.copyOf(arr_openOption, arr_openOption.length)));
        L.o(inputStream0, "newInputStream(...)");
        return Z.u(inputStream0);
    }
}

