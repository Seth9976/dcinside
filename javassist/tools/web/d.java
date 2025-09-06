package javassist.tools.web;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import javassist.E;
import javassist.G;
import javassist.b;
import javassist.g;
import javassist.l;

public class d {
    private ServerSocket a;
    private g b;
    protected G c;
    public String d;
    public String e;
    private static final byte[] f = null;
    private static final int g = 1;
    private static final int h = 2;
    private static final int i = 3;
    private static final int j = 4;
    private static final int k = 5;

    static {
        d.f = new byte[]{13, 10};
    }

    public d(int v) throws IOException {
        this.d = null;
        this.e = null;
        this.a = new ServerSocket(v);
        this.b = null;
        this.c = null;
    }

    public d(String s) throws IOException {
        this(Integer.parseInt(s));
    }

    public void a(g g0, G g1) throws E, b {
        this.b = g0;
        this.c = g1;
        g1.a(g0);
    }

    private void b(String s, int v) throws a {
        for(int v1 = 0; v1 < v; ++v1) {
            int v2 = s.charAt(v1);
            if(!Character.isJavaIdentifierPart(((char)v2)) && v2 != 46 && v2 != 0x2F) {
                throw new a();
            }
        }
        if(s.indexOf("..") >= 0) {
            throw new a();
        }
    }

    public void c(InputStream inputStream0, OutputStream outputStream0, String s) throws IOException, a {
        if(!s.startsWith("GET /")) {
            throw new a();
        }
        int v = 5;
        String s1 = s.substring(5, s.indexOf(0x20, 5));
        if(s1.endsWith(".class")) {
            v = 2;
        }
        else if(s1.endsWith(".html") || s1.endsWith(".htm")) {
            v = 1;
        }
        else if(s1.endsWith(".gif")) {
            v = 3;
        }
        else if(s1.endsWith(".jpg")) {
            v = 4;
        }
        int v1 = s1.length();
        if(v == 2 && this.e(outputStream0, s1, v1)) {
            return;
        }
        this.b(s1, v1);
        String s2 = this.e == null ? s1 : this.e + s1;
        int v2 = File.separatorChar;
        if(v2 != 0x2F) {
            s2 = s2.replace('/', ((char)v2));
        }
        File file0 = new File(s2);
        if(file0.canRead()) {
            this.o(outputStream0, file0.length(), v);
            FileInputStream fileInputStream0 = new FileInputStream(file0);
            byte[] arr_b = new byte[0x1000];
            int v3;
            while((v3 = fileInputStream0.read(arr_b)) > 0) {
                outputStream0.write(arr_b, 0, v3);
            }
            fileInputStream0.close();
            return;
        }
        if(v == 2) {
            InputStream inputStream1 = this.getClass().getResourceAsStream("/" + s1);
            if(inputStream1 != null) {
                ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                byte[] arr_b1 = new byte[0x1000];
                int v4;
                while((v4 = inputStream1.read(arr_b1)) > 0) {
                    byteArrayOutputStream0.write(arr_b1, 0, v4);
                }
                byte[] arr_b2 = byteArrayOutputStream0.toByteArray();
                this.o(outputStream0, ((long)arr_b2.length), 2);
                outputStream0.write(arr_b2);
                inputStream1.close();
                return;
            }
        }
        throw new a();
    }

    public void d() throws IOException {
        this.a.close();
    }

    private boolean e(OutputStream outputStream0, String s, int v) throws IOException, a {
        byte[] arr_b;
        if(this.b == null) {
            return false;
        }
        String s1 = s.substring(0, v - 6).replace('/', '.');
        try {
            G g0 = this.c;
            if(g0 != null) {
                g0.b(this.b, s1);
            }
            l l0 = this.b.s(s1);
            arr_b = l0.M0();
            String s2 = this.d;
            if(s2 != null) {
                l0.T0(s2);
            }
        }
        catch(Exception exception0) {
            throw new a(exception0);
        }
        this.o(outputStream0, ((long)arr_b.length), 2);
        outputStream0.write(arr_b);
        return true;
    }

    public void f(String s) {
        System.out.println(s);
    }

    public void g(String s, String s1) {
        PrintStream printStream0 = System.out;
        printStream0.print(s);
        printStream0.print(" ");
        printStream0.println(s1);
    }

    public void h(String s, String s1, String s2) {
        PrintStream printStream0 = System.out;
        printStream0.print(s);
        printStream0.print(" ");
        printStream0.print(s1);
        printStream0.print(" ");
        printStream0.println(s2);
    }

    public void i(String s) {
        PrintStream printStream0 = System.out;
        printStream0.print("    ");
        printStream0.println(s);
    }

    public static void j(String[] arr_s) throws IOException {
        if(arr_s.length == 1) {
            new d(arr_s[0]).n();
            return;
        }
        System.err.println("Usage: java javassist.tools.web.Webserver <port number>");
    }

    final void k(Socket socket0) throws IOException {
        BufferedInputStream bufferedInputStream0 = new BufferedInputStream(socket0.getInputStream());
        String s = this.l(bufferedInputStream0);
        this.h(socket0.getInetAddress().getHostName(), "Sat Sep 06 02:22:49 CST 2025", s);
        while(this.q(bufferedInputStream0) > 0) {
        }
        BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(socket0.getOutputStream());
        try {
            this.c(bufferedInputStream0, bufferedOutputStream0, s);
        }
        catch(a a0) {
            this.m(bufferedOutputStream0, a0);
        }
        bufferedOutputStream0.flush();
        bufferedInputStream0.close();
        bufferedOutputStream0.close();
        socket0.close();
    }

    private String l(InputStream inputStream0) throws IOException {
        StringBuffer stringBuffer0 = new StringBuffer();
        while(true) {
            int v = inputStream0.read();
            if(v < 0 || v == 13) {
                break;
            }
            stringBuffer0.append(((char)v));
        }
        inputStream0.read();
        return stringBuffer0.toString();
    }

    private void m(OutputStream outputStream0, a a0) throws IOException {
        this.i("bad request: jebdyn.dexdec.irsb.Exception_861d61eb");
        outputStream0.write("HTTP/1.0 400 Bad Request".getBytes());
        outputStream0.write(d.f);
        outputStream0.write(d.f);
        outputStream0.write("<H1>Bad Request</H1>".getBytes());
    }

    public void n() {
        System.err.println("ready to service...");
        while(true) {
            try {
                new javassist.tools.web.b(this, this.a.accept()).start();
            }
            catch(IOException iOException0) {
                this.f(iOException0.toString());
            }
        }
    }

    private void o(OutputStream outputStream0, long v, int v1) throws IOException {
        outputStream0.write("HTTP/1.0 200 OK".getBytes());
        byte[] arr_b = d.f;
        outputStream0.write(arr_b);
        outputStream0.write("Content-Length: ".getBytes());
        outputStream0.write(Long.toString(v).getBytes());
        outputStream0.write(arr_b);
        switch(v1) {
            case 1: {
                outputStream0.write("Content-Type: text/html".getBytes());
                break;
            }
            case 2: {
                outputStream0.write("Content-Type: application/octet-stream".getBytes());
                break;
            }
            case 3: {
                outputStream0.write("Content-Type: image/gif".getBytes());
                break;
            }
            case 4: {
                outputStream0.write("Content-Type: image/jpg".getBytes());
                break;
            }
            case 5: {
                outputStream0.write("Content-Type: text/plain".getBytes());
            }
        }
        outputStream0.write(arr_b);
        outputStream0.write(arr_b);
    }

    public void p(g g0) {
        this.b = g0;
    }

    private int q(InputStream inputStream0) throws IOException {
        int v;
        for(v = 0; true; ++v) {
            int v1 = inputStream0.read();
            if(v1 < 0 || v1 == 13) {
                break;
            }
        }
        inputStream0.read();
        return v;
    }
}

