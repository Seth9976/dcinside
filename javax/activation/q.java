package javax.activation;

import com.sun.activation.registries.LogSupport;
import com.sun.activation.registries.MimeTypeFile;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.security.PrivilegedAction;
import java.util.Vector;

public class q extends l {
    static final class a implements PrivilegedAction {
        // 去混淆评级： 高(320)
        @Override
        public Object run() {
            return "/apex/com.android.art/lib/";
        }
    }

    private MimeTypeFile[] c;
    private static final int d = 0;
    private static final String e = "application/octet-stream";
    private static final String f;

    // 去混淆评级： 低(30)
    static {
        q.f = "/apex/com.android.art/lib/";
    }

    public q() {
        Vector vector0 = new Vector(5);
        vector0.addElement(null);
        LogSupport.log("MimetypesFileTypeMap: load HOME");
        try {
            MimeTypeFile mimeTypeFile0 = this.g("/.mime.types");
            if(mimeTypeFile0 != null) {
                vector0.addElement(mimeTypeFile0);
            }
        }
        catch(SecurityException unused_ex) {
        }
        LogSupport.log("MimetypesFileTypeMap: load SYS");
        try {
            MimeTypeFile mimeTypeFile1 = this.g("/apex/com.android.art/lib/mime.types");
            if(mimeTypeFile1 != null) {
                vector0.addElement(mimeTypeFile1);
            }
        }
        catch(SecurityException unused_ex) {
        }
        LogSupport.log("MimetypesFileTypeMap: load JAR");
        this.f(vector0, "META-INF/mime.types");
        LogSupport.log("MimetypesFileTypeMap: load DEF");
        MimeTypeFile mimeTypeFile2 = this.h("/META-INF/mimetypes.default");
        if(mimeTypeFile2 != null) {
            vector0.addElement(mimeTypeFile2);
        }
        MimeTypeFile[] arr_mimeTypeFile = new MimeTypeFile[vector0.size()];
        this.c = arr_mimeTypeFile;
        vector0.copyInto(arr_mimeTypeFile);
    }

    public q(InputStream inputStream0) {
        try {
            MimeTypeFile[] arr_mimeTypeFile = this.c;
            arr_mimeTypeFile[0] = new MimeTypeFile(inputStream0);
        }
        catch(IOException unused_ex) {
        }
    }

    public q(String s) throws IOException {
        MimeTypeFile[] arr_mimeTypeFile = this.c;
        arr_mimeTypeFile[0] = new MimeTypeFile(s);
    }

    @Override  // javax.activation.l
    public String a(File file0) {
        return this.b(file0.getName());
    }

    @Override  // javax.activation.l
    public String b(String s) {
        synchronized(this) {
            int v1 = s.lastIndexOf(".");
            if(v1 < 0) {
                return "application/octet-stream";
            }
            String s1 = s.substring(v1 + 1);
            if(s1.length() == 0) {
                return "application/octet-stream";
            }
            for(int v2 = 0; true; ++v2) {
                MimeTypeFile[] arr_mimeTypeFile = this.c;
                if(v2 >= arr_mimeTypeFile.length) {
                    break;
                }
                MimeTypeFile mimeTypeFile0 = arr_mimeTypeFile[v2];
                if(mimeTypeFile0 != null) {
                    String s2 = mimeTypeFile0.getMIMETypeString(s1);
                    if(s2 != null) {
                        return s2;
                    }
                }
            }
            return "application/octet-stream";
        }
    }

    public void e(String s) {
        synchronized(this) {
            MimeTypeFile[] arr_mimeTypeFile = this.c;
            if(arr_mimeTypeFile[0] == null) {
                arr_mimeTypeFile[0] = new MimeTypeFile();
            }
            this.c[0].appendToRegistry(s);
        }
    }

    private void f(Vector vector0, String s) {
        InputStream inputStream0;
        URL uRL0;
        int v1;
        URL[] arr_uRL;
        int v = 0;
        try {
            ClassLoader classLoader0 = s.a();
            if(classLoader0 == null) {
                classLoader0 = this.getClass().getClassLoader();
            }
            arr_uRL = classLoader0 == null ? s.d(s) : s.c(classLoader0, s);
            if(arr_uRL != null) {
                if(LogSupport.isLoggable()) {
                    LogSupport.log("MimetypesFileTypeMap: getResources");
                }
                v1 = 0;
                goto label_12;
            }
            goto label_52;
        }
        catch(Exception exception0) {
            goto label_50;
        }
        try {
            while(true) {
            label_12:
                if(v >= arr_uRL.length) {
                    v = v1;
                    goto label_52;
                }
                uRL0 = arr_uRL[v];
                if(LogSupport.isLoggable()) {
                    LogSupport.log(("MimetypesFileTypeMap: URL " + uRL0));
                }
                break;
            }
        }
        catch(Exception exception0) {
            goto label_49;
        }
        try {
            inputStream0 = null;
            inputStream0 = s.e(uRL0);
            if(inputStream0 != null) {
                vector0.addElement(new MimeTypeFile(inputStream0));
                v1 = 1;
                if(LogSupport.isLoggable()) {
                    LogSupport.log(("MimetypesFileTypeMap: successfully loaded mime types from URL: " + uRL0));
                }
            }
            else if(LogSupport.isLoggable()) {
                LogSupport.log(("MimetypesFileTypeMap: not loading mime types from URL: " + uRL0));
            }
        }
        catch(IOException iOException0) {
            goto label_35;
        }
        catch(SecurityException securityException0) {
            goto label_39;
        }
        catch(Throwable throwable0) {
            goto label_43;
        }
        if(inputStream0 != null) {
            try {
            label_27:
                inputStream0.close();
            }
            catch(IOException unused_ex) {
            }
            catch(Exception exception0) {
                goto label_49;
            }
        }
        try {
            ++v;
            goto label_12;
            try {
                goto label_43;
            }
            catch(IOException iOException0) {
            }
            catch(SecurityException securityException0) {
                goto label_39;
            }
        label_35:
            if(LogSupport.isLoggable()) {
                LogSupport.log(("MimetypesFileTypeMap: can\'t load " + uRL0), iOException0);
            }
            if(inputStream0 != null) {
                goto label_27;
            }
            ++v;
            goto label_12;
        label_39:
            if(LogSupport.isLoggable()) {
                LogSupport.log(("MimetypesFileTypeMap: can\'t load " + uRL0), securityException0);
            }
            if(inputStream0 == null) {
                ++v;
                goto label_12;
            }
            else {
                goto label_27;
            }
            v = v1;
            goto label_52;
        }
        catch(Throwable throwable0) {
            goto label_43;
        }
        goto label_27;
    label_43:
        if(inputStream0 == null) {
            throw throwable0;
        }
        else {
            try {
                try {
                    inputStream0.close();
                }
                catch(IOException unused_ex) {
                }
                throw throwable0;
            }
            catch(Exception exception0) {
            }
        }
    label_49:
        v = v1;
    label_50:
        if(LogSupport.isLoggable()) {
            LogSupport.log(("MimetypesFileTypeMap: can\'t load " + s), exception0);
        }
    label_52:
        if(v == 0) {
            LogSupport.log("MimetypesFileTypeMap: !anyLoaded");
            MimeTypeFile mimeTypeFile0 = this.h("/" + s);
            if(mimeTypeFile0 != null) {
                vector0.addElement(mimeTypeFile0);
            }
        }
    }

    private MimeTypeFile g(String s) {
        try {
            return new MimeTypeFile(s);
        }
        catch(IOException unused_ex) {
            return null;
        }
    }

    private MimeTypeFile h(String s) {
        MimeTypeFile mimeTypeFile0;
        InputStream inputStream1;
        InputStream inputStream0 = null;
        try {
            inputStream1 = null;
            inputStream1 = s.b(this.getClass(), s);
            goto label_6;
        }
        catch(IOException iOException0) {
            goto label_16;
        }
        catch(SecurityException securityException0) {
            goto label_21;
        }
        catch(Throwable throwable0) {
        }
        goto label_28;
    label_6:
        if(inputStream1 != null) {
            try {
                mimeTypeFile0 = new MimeTypeFile(inputStream1);
                if(LogSupport.isLoggable()) {
                    LogSupport.log(("MimetypesFileTypeMap: successfully loaded mime types file: " + s));
                }
            }
            catch(IOException iOException0) {
                goto label_16;
            }
            catch(SecurityException securityException0) {
                goto label_21;
            }
            catch(Throwable throwable0) {
                goto label_27;
            }
            try {
                inputStream1.close();
            }
            catch(IOException unused_ex) {
            }
            return mimeTypeFile0;
        }
        try {
            try {
                if(LogSupport.isLoggable()) {
                    LogSupport.log(("MimetypesFileTypeMap: not loading mime types file: " + s));
                    return null;
                }
                return null;
            }
            catch(IOException iOException0) {
            }
            catch(SecurityException securityException0) {
                goto label_21;
            }
        label_16:
            if(LogSupport.isLoggable()) {
                LogSupport.log(("MimetypesFileTypeMap: can\'t load " + s), iOException0);
            }
            if(inputStream1 != null) {
                goto label_24;
            }
            return null;
        label_21:
            if(LogSupport.isLoggable()) {
                LogSupport.log(("MimetypesFileTypeMap: can\'t load " + s), securityException0);
            }
        }
        catch(Throwable throwable0) {
            goto label_27;
        }
        if(inputStream1 != null) {
            try {
            label_24:
                inputStream1.close();
            }
            catch(IOException unused_ex) {
            }
            return null;
        label_27:
            inputStream0 = inputStream1;
        label_28:
            if(inputStream0 != null) {
                try {
                    inputStream0.close();
                }
                catch(IOException unused_ex) {
                }
            }
            throw throwable0;
        }
        return null;
    }
}

