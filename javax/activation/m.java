package javax.activation;

import com.sun.activation.registries.LogSupport;
import com.sun.activation.registries.MailcapFile;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class m extends c {
    static final class a implements PrivilegedAction {
        // 去混淆评级： 高(320)
        @Override
        public Object run() {
            return "/apex/com.android.art/lib/";
        }
    }

    private MailcapFile[] c;
    private static final int d;
    private static final String e;

    // 去混淆评级： 低(30)
    static {
        m.e = "/apex/com.android.art/lib/";
    }

    public m() {
        ArrayList arrayList0 = new ArrayList(5);
        arrayList0.add(null);
        LogSupport.log("MailcapCommandMap: load HOME");
        try {
            MailcapFile mailcapFile0 = this.s("/.mailcap");
            if(mailcapFile0 != null) {
                arrayList0.add(mailcapFile0);
            }
        }
        catch(SecurityException unused_ex) {
        }
        LogSupport.log("MailcapCommandMap: load SYS");
        try {
            MailcapFile mailcapFile1 = this.s("/apex/com.android.art/lib/mailcap");
            if(mailcapFile1 != null) {
                arrayList0.add(mailcapFile1);
            }
        }
        catch(SecurityException unused_ex) {
        }
        LogSupport.log("MailcapCommandMap: load JAR");
        this.r(arrayList0, "META-INF/mailcap");
        LogSupport.log("MailcapCommandMap: load DEF");
        MailcapFile mailcapFile2 = this.t("/META-INF/mailcap.default");
        if(mailcapFile2 != null) {
            arrayList0.add(mailcapFile2);
        }
        this.c = (MailcapFile[])arrayList0.toArray(new MailcapFile[arrayList0.size()]);
    }

    public m(InputStream inputStream0) {
        LogSupport.log("MailcapCommandMap: load PROG");
        MailcapFile[] arr_mailcapFile = this.c;
        if(arr_mailcapFile[0] == null) {
            try {
                arr_mailcapFile[0] = new MailcapFile(inputStream0);
            }
            catch(IOException unused_ex) {
            }
        }
    }

    public m(String s) throws IOException {
        if(LogSupport.isLoggable()) {
            LogSupport.log(("MailcapCommandMap: load PROG from " + s));
        }
        MailcapFile[] arr_mailcapFile = this.c;
        if(arr_mailcapFile[0] == null) {
            arr_mailcapFile[0] = new MailcapFile(s);
        }
    }

    @Override  // javax.activation.c
    public e a(String s) {
        synchronized(this) {
            if(LogSupport.isLoggable()) {
                LogSupport.log(("MailcapCommandMap: createDataContentHandler for " + s));
            }
            if(s != null) {
                s = s.toLowerCase(Locale.ENGLISH);
            }
            for(int v1 = 0; true; ++v1) {
                MailcapFile[] arr_mailcapFile = this.c;
                if(v1 >= arr_mailcapFile.length) {
                    break;
                }
                if(arr_mailcapFile[v1] != null) {
                    if(LogSupport.isLoggable()) {
                        LogSupport.log(("  search DB #" + v1));
                    }
                    Map map0 = this.c[v1].getMailcapList(s);
                    if(map0 != null) {
                        List list0 = (List)map0.get("content-handler");
                        if(list0 != null) {
                            e e0 = this.p(((String)list0.get(0)));
                            if(e0 != null) {
                                return e0;
                            }
                        }
                    }
                }
            }
            for(int v2 = 0; true; ++v2) {
                MailcapFile[] arr_mailcapFile1 = this.c;
                if(v2 >= arr_mailcapFile1.length) {
                    break;
                }
                if(arr_mailcapFile1[v2] != null) {
                    if(LogSupport.isLoggable()) {
                        LogSupport.log(("  search fallback DB #" + v2));
                    }
                    Map map1 = this.c[v2].getMailcapFallbackList(s);
                    if(map1 != null) {
                        List list1 = (List)map1.get("content-handler");
                        if(list1 != null) {
                            e e1 = this.p(((String)list1.get(0)));
                            if(e1 != null) {
                                return e1;
                            }
                        }
                    }
                }
            }
            return null;
        }
    }

    @Override  // javax.activation.c
    public b[] c(String s) {
        synchronized(this) {
            ArrayList arrayList0 = new ArrayList();
            if(s != null) {
                s = s.toLowerCase(Locale.ENGLISH);
            }
            for(int v2 = 0; true; ++v2) {
                MailcapFile[] arr_mailcapFile = this.c;
                if(v2 >= arr_mailcapFile.length) {
                    break;
                }
                MailcapFile mailcapFile0 = arr_mailcapFile[v2];
                if(mailcapFile0 != null) {
                    Map map0 = mailcapFile0.getMailcapList(s);
                    if(map0 != null) {
                        this.m(map0, arrayList0);
                    }
                }
            }
            for(int v1 = 0; true; ++v1) {
                MailcapFile[] arr_mailcapFile1 = this.c;
                if(v1 >= arr_mailcapFile1.length) {
                    break;
                }
                MailcapFile mailcapFile1 = arr_mailcapFile1[v1];
                if(mailcapFile1 != null) {
                    Map map1 = mailcapFile1.getMailcapFallbackList(s);
                    if(map1 != null) {
                        this.m(map1, arrayList0);
                    }
                }
            }
            return (b[])arrayList0.toArray(new b[arrayList0.size()]);
        }
    }

    @Override  // javax.activation.c
    public b e(String s, String s1) {
        synchronized(this) {
            if(s != null) {
                s = s.toLowerCase(Locale.ENGLISH);
            }
            for(int v1 = 0; true; ++v1) {
                MailcapFile[] arr_mailcapFile = this.c;
                if(v1 >= arr_mailcapFile.length) {
                    break;
                }
                MailcapFile mailcapFile0 = arr_mailcapFile[v1];
                if(mailcapFile0 != null) {
                    Map map0 = mailcapFile0.getMailcapList(s);
                    if(map0 != null) {
                        List list0 = (List)map0.get(s1);
                        if(list0 != null) {
                            String s2 = (String)list0.get(0);
                            if(s2 != null) {
                                return new b(s1, s2);
                            }
                        }
                    }
                }
            }
            for(int v2 = 0; true; ++v2) {
                MailcapFile[] arr_mailcapFile1 = this.c;
                if(v2 >= arr_mailcapFile1.length) {
                    break;
                }
                MailcapFile mailcapFile1 = arr_mailcapFile1[v2];
                if(mailcapFile1 != null) {
                    Map map1 = mailcapFile1.getMailcapFallbackList(s);
                    if(map1 != null) {
                        List list1 = (List)map1.get(s1);
                        if(list1 != null) {
                            String s3 = (String)list1.get(0);
                            if(s3 != null) {
                                return new b(s1, s3);
                            }
                        }
                    }
                }
            }
            return null;
        }
    }

    @Override  // javax.activation.c
    public String[] h() {
        synchronized(this) {
            ArrayList arrayList0 = new ArrayList();
            for(int v1 = 0; true; ++v1) {
                MailcapFile[] arr_mailcapFile = this.c;
                if(v1 >= arr_mailcapFile.length) {
                    break;
                }
                MailcapFile mailcapFile0 = arr_mailcapFile[v1];
                if(mailcapFile0 != null) {
                    String[] arr_s = mailcapFile0.getMimeTypes();
                    if(arr_s != null) {
                        for(int v2 = 0; v2 < arr_s.length; ++v2) {
                            if(!arrayList0.contains(arr_s[v2])) {
                                arrayList0.add(arr_s[v2]);
                            }
                        }
                    }
                }
            }
            return (String[])arrayList0.toArray(new String[arrayList0.size()]);
        }
    }

    @Override  // javax.activation.c
    public b[] i(String s) {
        synchronized(this) {
            ArrayList arrayList0 = new ArrayList();
            if(s != null) {
                s = s.toLowerCase(Locale.ENGLISH);
            }
            for(int v2 = 0; true; ++v2) {
                MailcapFile[] arr_mailcapFile = this.c;
                if(v2 >= arr_mailcapFile.length) {
                    break;
                }
                MailcapFile mailcapFile0 = arr_mailcapFile[v2];
                if(mailcapFile0 != null) {
                    Map map0 = mailcapFile0.getMailcapList(s);
                    if(map0 != null) {
                        this.n(map0, arrayList0);
                    }
                }
            }
            for(int v1 = 0; true; ++v1) {
                MailcapFile[] arr_mailcapFile1 = this.c;
                if(v1 >= arr_mailcapFile1.length) {
                    break;
                }
                MailcapFile mailcapFile1 = arr_mailcapFile1[v1];
                if(mailcapFile1 != null) {
                    Map map1 = mailcapFile1.getMailcapFallbackList(s);
                    if(map1 != null) {
                        this.n(map1, arrayList0);
                    }
                }
            }
            return (b[])arrayList0.toArray(new b[arrayList0.size()]);
        }
    }

    public void l(String s) {
        synchronized(this) {
            LogSupport.log("MailcapCommandMap: add to PROG");
            MailcapFile[] arr_mailcapFile = this.c;
            if(arr_mailcapFile[0] == null) {
                arr_mailcapFile[0] = new MailcapFile();
            }
            this.c[0].appendToMailcap(s);
        }
    }

    private void m(Map map0, List list0) {
        for(Object object0: map0.keySet()) {
            String s = (String)object0;
            for(Object object1: ((List)map0.get(s))) {
                list0.add(new b(s, ((String)object1)));
            }
        }
    }

    private void n(Map map0, List list0) {
        for(Object object0: map0.keySet()) {
            String s = (String)object0;
            if(!this.o(list0, s)) {
                list0.add(new b(s, ((String)((List)map0.get(s)).get(0))));
            }
        }
    }

    private boolean o(List list0, String s) {
        for(Object object0: list0) {
            if(((b)object0).b().equals(s)) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    private e p(String s) {
        Class class0;
        if(LogSupport.isLoggable()) {
            LogSupport.log("    got content-handler");
        }
        if(LogSupport.isLoggable()) {
            LogSupport.log(("      class " + s));
        }
        try {
            ClassLoader classLoader0 = s.a();
            if(classLoader0 == null) {
                classLoader0 = this.getClass().getClassLoader();
            }
            try {
                class0 = classLoader0.loadClass(s);
            }
            catch(Exception unused_ex) {
                class0 = Class.forName(s);
            }
            if(class0 != null) {
                return (e)class0.newInstance();
            }
        }
        catch(IllegalAccessException illegalAccessException0) {
            if(LogSupport.isLoggable()) {
                LogSupport.log(("Can\'t load DCH " + s), illegalAccessException0);
                return null;
            }
        }
        catch(ClassNotFoundException classNotFoundException0) {
            if(LogSupport.isLoggable()) {
                LogSupport.log(("Can\'t load DCH " + s), classNotFoundException0);
                return null;
            }
        }
        catch(InstantiationException instantiationException0) {
            if(LogSupport.isLoggable()) {
                LogSupport.log(("Can\'t load DCH " + s), instantiationException0);
                return null;
            }
        }
        return null;
    }

    public String[] q(String s) {
        synchronized(this) {
            ArrayList arrayList0 = new ArrayList();
            if(s != null) {
                s = s.toLowerCase(Locale.ENGLISH);
            }
            for(int v1 = 0; true; ++v1) {
                MailcapFile[] arr_mailcapFile = this.c;
                if(v1 >= arr_mailcapFile.length) {
                    break;
                }
                MailcapFile mailcapFile0 = arr_mailcapFile[v1];
                if(mailcapFile0 != null) {
                    String[] arr_s = mailcapFile0.getNativeCommands(s);
                    if(arr_s != null) {
                        for(int v2 = 0; v2 < arr_s.length; ++v2) {
                            if(!arrayList0.contains(arr_s[v2])) {
                                arrayList0.add(arr_s[v2]);
                            }
                        }
                    }
                }
            }
            return (String[])arrayList0.toArray(new String[arrayList0.size()]);
        }
    }

    private void r(List list0, String s) {
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
                    LogSupport.log("MailcapCommandMap: getResources");
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
                    LogSupport.log(("MailcapCommandMap: URL " + uRL0));
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
                list0.add(new MailcapFile(inputStream0));
                v1 = 1;
                if(LogSupport.isLoggable()) {
                    LogSupport.log(("MailcapCommandMap: successfully loaded mailcap file from URL: " + uRL0));
                }
            }
            else if(LogSupport.isLoggable()) {
                LogSupport.log(("MailcapCommandMap: not loading mailcap file from URL: " + uRL0));
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
                LogSupport.log(("MailcapCommandMap: can\'t load " + uRL0), iOException0);
            }
            if(inputStream0 != null) {
                goto label_27;
            }
            ++v;
            goto label_12;
        label_39:
            if(LogSupport.isLoggable()) {
                LogSupport.log(("MailcapCommandMap: can\'t load " + uRL0), securityException0);
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
            LogSupport.log(("MailcapCommandMap: can\'t load " + s), exception0);
        }
    label_52:
        if(v == 0) {
            if(LogSupport.isLoggable()) {
                LogSupport.log("MailcapCommandMap: !anyLoaded");
            }
            MailcapFile mailcapFile0 = this.t("/" + s);
            if(mailcapFile0 != null) {
                list0.add(mailcapFile0);
            }
        }
    }

    private MailcapFile s(String s) {
        try {
            return new MailcapFile(s);
        }
        catch(IOException unused_ex) {
            return null;
        }
    }

    private MailcapFile t(String s) {
        MailcapFile mailcapFile0;
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
                mailcapFile0 = new MailcapFile(inputStream1);
                if(LogSupport.isLoggable()) {
                    LogSupport.log(("MailcapCommandMap: successfully loaded mailcap file: " + s));
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
            return mailcapFile0;
        }
        try {
            try {
                if(LogSupport.isLoggable()) {
                    LogSupport.log(("MailcapCommandMap: not loading mailcap file: " + s));
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
                LogSupport.log(("MailcapCommandMap: can\'t load " + s), iOException0);
            }
            if(inputStream1 != null) {
                goto label_24;
            }
            return null;
        label_21:
            if(LogSupport.isLoggable()) {
                LogSupport.log(("MailcapCommandMap: can\'t load " + s), securityException0);
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

