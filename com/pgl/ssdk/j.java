package com.pgl.ssdk;

import com.pgl.ssdk.ces.out.DungeonFlag;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class j {
    @DungeonFlag
    public static List a(File file0) {
        ZipInputStream zipInputStream1;
        FileInputStream fileInputStream0;
        CertificateFactory certificateFactory0;
        ZipInputStream zipInputStream0 = null;
        try {
            certificateFactory0 = null;
            certificateFactory0 = CertificateFactory.getInstance("X.509");
        }
        catch(CertificateException unused_ex) {
        }
        if(certificateFactory0 == null) {
            return null;
        }
        List list0 = new ArrayList();
        try {
            fileInputStream0 = null;
            fileInputStream0 = new FileInputStream(file0);
            zipInputStream1 = new ZipInputStream(fileInputStream0);
        }
        catch(IOException unused_ex) {
            goto label_33;
        }
        catch(Throwable throwable0) {
            goto label_40;
        }
        try {
            while(true) {
                do {
                label_15:
                    ZipEntry zipEntry0 = zipInputStream1.getNextEntry();
                    if(zipEntry0 == null) {
                        goto label_45;
                    }
                    String s = zipEntry0.getName();
                }
                while(!s.startsWith("META-INF/"));
                if(!s.endsWith(".RSA") && !s.endsWith(".DSA") && !s.endsWith(".EC")) {
                    zipInputStream1.closeEntry();
                    goto label_15;
                }
                byte[] arr_b = j.a(zipInputStream1);
                try {
                    Iterator iterator0 = certificateFactory0.generateCertificates(new ByteArrayInputStream(arr_b)).iterator();
                label_24:
                    if(!iterator0.hasNext()) {
                        goto label_15;
                    }
                    Object object0 = iterator0.next();
                    Certificate certificate0 = (Certificate)object0;
                    if(!(certificate0 instanceof X509Certificate)) {
                        goto label_24;
                    }
                    list0.add(new e(String.valueOf(((X509Certificate)certificate0).getSubjectDN()), certificate0.getEncoded()));
                    goto label_24;
                }
                catch(CertificateException unused_ex) {
                }
            }
            goto label_38;
        }
        catch(IOException unused_ex) {
        }
        catch(Throwable throwable1) {
            goto label_38;
        }
        zipInputStream0 = zipInputStream1;
    label_33:
        if(zipInputStream0 != null) {
            try {
                zipInputStream0.close();
            }
            catch(IOException unused_ex) {
            }
        }
        if(fileInputStream0 != null) {
            try {
                fileInputStream0.close();
            }
            catch(IOException unused_ex) {
            }
            return list0;
        label_38:
            zipInputStream0 = zipInputStream1;
            throwable0 = throwable1;
        label_40:
            if(zipInputStream0 != null) {
                try {
                    zipInputStream0.close();
                }
                catch(IOException unused_ex) {
                }
            }
            if(fileInputStream0 != null) {
                try {
                    fileInputStream0.close();
                }
                catch(IOException unused_ex) {
                }
            }
            throw throwable0;
            try {
            label_45:
                zipInputStream1.close();
            }
            catch(IOException unused_ex) {
            }
            try {
                fileInputStream0.close();
                return list0;
            }
            catch(IOException unused_ex) {
            }
        }
        return list0;
    }

    private static byte[] a(InputStream inputStream0) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
        byte[] arr_b = new byte[0x400];
        int v;
        while((v = inputStream0.read(arr_b)) != -1) {
            byteArrayOutputStream0.write(arr_b, 0, v);
        }
        return byteArrayOutputStream0.toByteArray();
    }
}

