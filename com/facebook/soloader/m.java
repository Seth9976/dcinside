package com.facebook.soloader;

import android.content.Context;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import jeb.synthetic.TWR;

public final class m extends L {
    final class a extends e {
        private final b[] a;
        final m b;

        a(L l0) throws IOException {
            File file4;
            File file3;
            File file0 = new File("/data/local/tmp/exopackage/com.dcinside.app.android/native-libs/");
            ArrayList arrayList0 = new ArrayList();
            LinkedHashSet linkedHashSet0 = new LinkedHashSet();
            String[] arr_s = SysUtil.m();
            int v = 0;
            int v1 = 0;
            while(v1 < arr_s.length) {
                String s = arr_s[v1];
                File file1 = new File(file0, s);
                if(file1.isDirectory()) {
                    linkedHashSet0.add(s);
                    File file2 = new File(file1, "metadata.txt");
                    if(file2.isFile()) {
                        FileReader fileReader0 = new FileReader(file2);
                        try {
                            BufferedReader bufferedReader0 = new BufferedReader(fileReader0);
                            try {
                                String s1;
                                while((s1 = bufferedReader0.readLine()) != null) {
                                    if(s1.length() != 0) {
                                        int v2 = s1.indexOf(0x20);
                                        if(v2 == -1) {
                                            throw new RuntimeException("illegal line in exopackage metadata: [" + s1 + "]");
                                        }
                                        String s2 = s1.substring(0, v2) + ".so";
                                        int v3 = arrayList0.size();
                                        while(true) {
                                            if(v < v3) {
                                                file3 = file0;
                                                if(((b)arrayList0.get(v)).a.equals(s2)) {
                                                    break;
                                                }
                                                else {
                                                    ++v;
                                                    file0 = file3;
                                                    continue;
                                                }
                                            }
                                            file3 = file0;
                                            String s3 = s1.substring(v2 + 1);
                                            arrayList0.add(new b(s2, s3.substring(s3.indexOf(45), s3.indexOf(".so")), new File(file1, s3)));
                                            break;
                                        }
                                        file0 = file3;
                                        v = 0;
                                    }
                                }
                            }
                            catch(Throwable throwable1) {
                                TWR.safeClose$NT(bufferedReader0, throwable1);
                                throw throwable1;
                            }
                            file4 = file0;
                            bufferedReader0.close();
                        }
                        catch(Throwable throwable0) {
                            TWR.safeClose$NT(fileReader0, throwable0);
                            throw throwable0;
                        }
                        fileReader0.close();
                    }
                }
                else {
                    file4 = file0;
                }
                ++v1;
                file0 = file4;
                v = 0;
            }
            l0.A(((String[])linkedHashSet0.toArray(new String[linkedHashSet0.size()])));
            this.a = (b[])arrayList0.toArray(new b[arrayList0.size()]);
        }

        @Override  // com.facebook.soloader.L$e
        public c[] b() throws IOException {
            return this.a;
        }

        @Override  // com.facebook.soloader.L$e
        public void c(File file0) throws IOException {
            b[] arr_m$b = this.a;
            for(int v = 0; v < arr_m$b.length; ++v) {
                b m$b0 = arr_m$b[v];
                FileInputStream fileInputStream0 = new FileInputStream(m$b0.c);
                try(d l$d0 = new d(m$b0, fileInputStream0)) {
                    fileInputStream0 = null;
                    this.a(l$d0, new byte[0x8000], file0);
                }
                catch(Throwable throwable0) {
                    TWR.safeClose$NT(fileInputStream0, throwable0);
                    throw throwable0;
                }
            }
        }
    }

    static final class b extends c {
        final File c;

        b(String s, String s1, File file0) {
            super(s, s1);
            this.c = file0;
        }
    }

    public m(Context context0, String s) {
        super(context0, s);
    }

    @Override  // com.facebook.soloader.e
    public String f() {
        return "ExoSoSource";
    }

    @Override  // com.facebook.soloader.L
    protected MessageDigest t() throws NoSuchAlgorithmException {
        return MessageDigest.getInstance("SHA-1");
    }

    @Override  // com.facebook.soloader.L
    protected e w(boolean z) throws IOException {
        return new a(this, this);
    }
}

