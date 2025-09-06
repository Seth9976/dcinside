package com.apm.insight.nativecrash;

import com.apm.insight.a;
import com.apm.insight.l.j;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class c {
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private Map h;
    private static final Pattern i;
    private static final Pattern j;
    private static final Pattern k;
    private static final Pattern l;
    private static final Pattern m;

    static {
        c.i = Pattern.compile("^pid:\\s(.*),\\stid:\\s(.*),\\sname:\\s(.*)\\s+>>>\\s(.*)\\s<<<$");
        c.j = Pattern.compile("^signal\\s(.*),\\scode\\s(.*),\\sfault\\saddr\\s(.*)$");
        c.k = Pattern.compile("^Abort message: (.*)$");
        c.l = Pattern.compile("^Crash message: (.*)$");
        c.m = Pattern.compile("^    \\/(\\w*)\\/.*\\/(.*\\.so)\\s\\(BuildId: ([a-f0-9]*)\\)$");
    }

    public c(File file0) {
        this.h = new HashMap();
        this.c(j.b(file0));
    }

    public final String a() {
        return this.g;
    }

    public final void a(File file0) {
        File file1 = j.b(file0);
        if(file1.exists()) {
            file1.renameTo(new File(file1.getAbsoluteFile() + ".old"));
        }
        NativeImpl.a(file0);
        this.c(j.b(file0));
    }

    public final Map b() {
        return this.h;
    }

    public final void b(File file0) [...] // 潜在的解密器

    private void c(File file0) {
        BufferedReader bufferedReader0;
        if(file0.exists() && file0.length() != 0L) {
            try {
                bufferedReader0 = null;
                bufferedReader0 = new BufferedReader(new FileReader(file0));
                int v1 = 0;
            alab1:
                while(true) {
                    String s = bufferedReader0.readLine();
                    if(s == null || v1 >= 0x40) {
                        break;
                    }
                    if(this.a == null && s.startsWith("pid: ")) {
                        goto label_51;
                    }
                    if(this.e == null && s.startsWith("signal ")) {
                        goto label_42;
                    }
                    if(this.f == null && s.startsWith("Abort ")) {
                        goto label_38;
                    }
                    if(this.f == null && s.startsWith("Crash ")) {
                        goto label_34;
                    }
                    if(this.g == null && s.startsWith("backtrace:")) {
                        StringBuilder stringBuilder0 = new StringBuilder();
                        while(true) {
                            String s1 = bufferedReader0.readLine();
                            if(s1 == null || !s1.startsWith("    #")) {
                                break;
                            }
                            stringBuilder0.append(s1.substring(4));
                            stringBuilder0.append('\n');
                        }
                        ++v1;
                        this.g = stringBuilder0.toString();
                    }
                    else if(this.h.isEmpty() && s.startsWith("build id:")) {
                        while(true) {
                            String s2 = bufferedReader0.readLine();
                            if(s2 == null || !s2.contains("BuildId:")) {
                                break alab1;
                            }
                            Matcher matcher0 = c.m.matcher(s2);
                            if(matcher0.find()) {
                                String s3 = matcher0.group(1);
                                String s4 = matcher0.group(2);
                                String s5 = matcher0.group(3);
                                if(s3.equals("data")) {
                                    this.h.put(s4, s5);
                                }
                            }
                        }
                    label_34:
                        Matcher matcher1 = c.l.matcher(s);
                        if(matcher1.find() && matcher1.groupCount() == 1) {
                            this.f = "crash message: " + matcher1.group(1) + "\n";
                            goto label_57;
                        label_38:
                            Matcher matcher2 = c.k.matcher(s);
                            if(matcher2.find() && matcher2.groupCount() == 1) {
                                this.f = "abort message: " + matcher2.group(1) + "\n";
                                goto label_57;
                            label_42:
                                Matcher matcher3 = c.j.matcher(s);
                                if(matcher3.find() && matcher3.groupCount() == 3) {
                                    String s6 = matcher3.group(1).replace(" ", "");
                                    String s7 = matcher3.group(2).replace(" ", "");
                                    int v2 = s7.indexOf("frompid");
                                    if(v2 > 0) {
                                        s7 = s7.substring(0, v2) + ")";
                                    }
                                    this.e = "Signal " + s6 + ", Code " + s7 + "\n";
                                    goto label_57;
                                label_51:
                                    Matcher matcher4 = c.i.matcher(s);
                                    if(matcher4.find() && matcher4.groupCount() == 4) {
                                        this.a = matcher4.group(1);
                                        this.b = matcher4.group(2);
                                        this.d = matcher4.group(3);
                                        this.c = matcher4.group(4);
                                    }
                                }
                            }
                        }
                    }
                label_57:
                    ++v1;
                }
            }
            catch(Throwable throwable0) {
                com.apm.insight.runtime.j.a(throwable0, "NPTH_CATCH");
            }
            finally {
                a.a(bufferedReader0);
            }
        }
    }

    public final String c() {
        StringBuilder stringBuilder0 = new StringBuilder();
        String s = this.e;
        if(s != null) {
            stringBuilder0.append(s);
        }
        String s1 = this.f;
        if(s1 != null) {
            stringBuilder0.append(s1);
        }
        String s2 = this.g;
        if(s2 != null) {
            stringBuilder0.append(s2);
        }
        return stringBuilder0.toString();
    }
}

