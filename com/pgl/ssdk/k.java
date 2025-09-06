package com.pgl.ssdk;

import com.pgl.ssdk.ces.out.DungeonFlag;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

public class k {
    @DungeonFlag
    private static e a(ByteBuffer byteBuffer0) throws a, NoSuchAlgorithmException, CertificateException {
        ByteBuffer byteBuffer1 = f.a(byteBuffer0);
        byteBuffer1.get(new byte[byteBuffer1.remaining()]);
        byteBuffer1.flip();
        byteBuffer1.position(0);
        f.a(byteBuffer1);
        byte[] arr_b = f.b(f.a(byteBuffer1));
        ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(arr_b);
        try {
            Certificate certificate0 = CertificateFactory.getInstance("X.509").generateCertificate(byteArrayInputStream0);
            return certificate0 instanceof X509Certificate ? new e(String.valueOf(((X509Certificate)certificate0).getSubjectDN()), arr_b) : null;
        }
        catch(Exception unused_ex) {
        }
        return null;
    }

    public static List a(o o0, com.pgl.ssdk.c.a c$a0) throws IOException, com.pgl.ssdk.f.a {
        return k.b(f.a(o0, c$a0, 0x7109871A).a);
    }

    public static List b(ByteBuffer byteBuffer0) {
        ByteBuffer byteBuffer1;
        try {
            byteBuffer1 = f.a(byteBuffer0);
        }
        catch(a unused_ex) {
            return null;
        }
        if(!byteBuffer1.hasRemaining()) {
            return null;
        }
        List list0 = new ArrayList();
        while(byteBuffer1.hasRemaining()) {
            try {
                list0.add(k.a(f.a(byteBuffer1)));
            }
            catch(a | BufferUnderflowException unused_ex) {
                return null;
            }
            catch(NoSuchAlgorithmException | CertificateException unused_ex) {
            }
        }
        return list0;
    }
}

