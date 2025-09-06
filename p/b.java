package P;

import android.annotation.SuppressLint;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Scanner;
import kotlin.jvm.internal.L;
import kotlin.text.f;
import kotlin.text.r;
import kotlin.text.v;
import y4.l;
import y4.m;

public final class b {
    @l
    public static final b a;

    static {
        b.a = new b();
    }

    @m
    public final String[] a(@m String s) {
        String s1;
        try {
            s1 = new Scanner(Runtime.getRuntime().exec(s).getInputStream()).useDelimiter("\\A").next();
            L.o(s1, "Scanner(inputstream).useDelimiter(\"\\\\A\").next()");
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
            s1 = "";
        }
        Object[] arr_object = v.V4(s1, new String[]{"\n"}, false, 0, 6, null).toArray(new String[0]);
        if(arr_object == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        return (String[])arr_object;
    }

    @m
    public final String b(@l String s) {
        BufferedInputStream bufferedInputStream0;
        BufferedOutputStream bufferedOutputStream0;
        Process process0;
        L.p(s, "command");
        String s1 = null;
        try {
            process0 = null;
            process0 = Runtime.getRuntime().exec("sh");
        }
        catch(Exception unused_ex) {
            bufferedOutputStream0 = null;
            bufferedInputStream0 = null;
            goto label_35;
        }
        catch(Throwable throwable0) {
            bufferedInputStream0 = null;
            goto label_49;
        }
        try {
            bufferedOutputStream0 = null;
            bufferedOutputStream0 = new BufferedOutputStream(process0.getOutputStream());
        }
        catch(Exception unused_ex) {
            bufferedInputStream0 = null;
            goto label_35;
        }
        catch(Throwable throwable0) {
            bufferedInputStream0 = null;
            goto label_49;
        }
        try {
            bufferedInputStream0 = null;
            bufferedInputStream0 = new BufferedInputStream(process0.getInputStream());
            byte[] arr_b = s.getBytes(f.b);
            L.o(arr_b, "this as java.lang.String).getBytes(charset)");
            bufferedOutputStream0.write(arr_b);
            bufferedOutputStream0.write(10);
            bufferedOutputStream0.flush();
            bufferedOutputStream0.close();
            process0.waitFor();
            String s2 = this.d(bufferedInputStream0);
            if(s2.charAt(s2.length() - 1) == 10) {
                String s3 = s2.substring(0, s2.length() - 1);
                L.o(s3, "this as java.lang.String…ing(startIndex, endIndex)");
                s1 = s3;
            }
            else {
                s1 = s2;
            }
            goto label_62;
        }
        catch(Exception unused_ex) {
        label_35:
            if(bufferedOutputStream0 != null) {
                try {
                    bufferedOutputStream0.close();
                }
                catch(IOException iOException0) {
                    iOException0.printStackTrace();
                }
            }
            if(bufferedInputStream0 != null) {
                try {
                    bufferedInputStream0.close();
                }
                catch(IOException iOException1) {
                    iOException1.printStackTrace();
                }
            }
            if(process0 == null) {
                return null;
            }
            process0.destroy();
            return s1;
        }
        catch(Throwable throwable0) {
            s1 = bufferedOutputStream0;
        }
    label_49:
        if(s1 != null) {
            try {
                ((OutputStream)s1).close();
            }
            catch(IOException iOException2) {
                iOException2.printStackTrace();
            }
        }
        if(bufferedInputStream0 != null) {
            try {
                bufferedInputStream0.close();
            }
            catch(IOException iOException3) {
                iOException3.printStackTrace();
            }
        }
        if(process0 != null) {
            process0.destroy();
        }
        throw throwable0;
        try {
        label_62:
            bufferedOutputStream0.close();
        }
        catch(IOException iOException4) {
            iOException4.printStackTrace();
        }
        try {
            bufferedInputStream0.close();
        }
        catch(IOException iOException5) {
            iOException5.printStackTrace();
        }
        process0.destroy();
        return s1;
    }

    @SuppressLint({"PrivateApi"})
    @m
    public final String c(@m String s) {
        try {
            Object object0 = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, s);
            if(object0 != null) {
                return (String)object0;
            }
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
        }
        return null;
    }

    private final String d(BufferedInputStream bufferedInputStream0) {
        if(bufferedInputStream0 == null) {
            return "";
        }
        byte[] arr_b = new byte[0x200];
        StringBuilder stringBuilder0 = new StringBuilder();
        try {
            do {
                int v = bufferedInputStream0.read(arr_b);
                if(v > 0) {
                    stringBuilder0.append(new String(arr_b, 0, v, f.b));
                }
            }
            while(v >= 0x200);
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
        }
        String s = stringBuilder0.toString();
        L.o(s, "result.toString()");
        return s;
    }

    @m
    public final String e() {
        try {
            String s = this.b("cat /proc/self/cgroup");
            if(s == null || s.length() == 0) {
                return null;
            }
            int v = v.H3(s, "uid", 0, false, 6, null);
            int v1 = v.H3(s, "/pid", 0, false, 6, null);
            if(v < 0) {
                return null;
            }
            if(v1 <= 0) {
                v1 = s.length();
            }
            String s1 = s.substring(v + 4, v1);
            L.o(s1, "this as java.lang.String…ing(startIndex, endIndex)");
            String s2 = new r("\n").m(s1, "");
            if(this.f(s2)) {
                String s3 = String.format("u0_a%d", Arrays.copyOf(new Object[]{((int)(((int)Integer.valueOf(s2)) - 10000))}, 1));
                L.o(s3, "format(format, *args)");
                return s3;
            }
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
        }
        return null;
    }

    private final boolean f(String s) {
        if(s != null && s.length() != 0) {
            int v = 0;
            while(v < s.length()) {
                int v1 = s.charAt(v);
                ++v;
                if(!Character.isDigit(((char)v1))) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean g(@l String s) {
        DataOutputStream dataOutputStream1;
        Process process0;
        L.p(s, "command");
        DataOutputStream dataOutputStream0 = null;
        try {
            process0 = Runtime.getRuntime().exec("su");
            dataOutputStream1 = new DataOutputStream(process0.getOutputStream());
            goto label_7;
        }
        catch(Exception exception0) {
            goto label_14;
            try {
            label_7:
                dataOutputStream1.writeBytes(v.p(("\n                " + s + "\n                \n                ")));
                dataOutputStream1.writeBytes("exit\n");
                dataOutputStream1.flush();
                process0.waitFor();
                goto label_32;
            }
            catch(Exception exception0) {
            }
            catch(Throwable throwable0) {
                goto label_25;
            }
            dataOutputStream0 = dataOutputStream1;
            try {
            label_14:
                exception0.printStackTrace();
                goto label_18;
            }
            catch(Throwable throwable0) {
            }
            goto label_26;
        }
        catch(Throwable throwable0) {
            goto label_26;
        }
    label_18:
        if(dataOutputStream0 != null) {
            try {
                dataOutputStream0.close();
                return false;
            }
            catch(Exception exception1) {
                exception1.printStackTrace();
            }
        }
        return false;
    label_25:
        dataOutputStream0 = dataOutputStream1;
    label_26:
        if(dataOutputStream0 != null) {
            try {
                dataOutputStream0.close();
            }
            catch(Exception exception2) {
                exception2.printStackTrace();
            }
        }
        throw throwable0;
        try {
        label_32:
            dataOutputStream1.close();
        }
        catch(Exception exception3) {
            exception3.printStackTrace();
        }
        return true;
    }
}

