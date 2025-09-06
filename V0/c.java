package v0;

import com.facebook.common.internal.n;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import o3.h;

public class c {
    public static class a extends IOException {
        public a(String s) {
            super(s);
        }

        public a(String s, Throwable throwable0) {
            super(s);
            this.initCause(throwable0);
        }
    }

    public static class b extends IOException {
        public b(String s) {
            super(s);
        }
    }

    public static class v0.c.c extends FileNotFoundException {
        public v0.c.c(String s) {
            super(s);
        }
    }

    public static class d extends IOException {
        public d(String s) {
            super(s);
        }

        public d(String s, @h Throwable throwable0) {
            super(s);
            this.initCause(throwable0);
        }
    }

    public static void a(File file0) throws a {
        if(file0.exists()) {
            if(file0.isDirectory()) {
                return;
            }
            if(!file0.delete()) {
                throw new a(file0.getAbsolutePath(), new b(file0.getAbsolutePath()));
            }
        }
        if(!file0.mkdirs() && !file0.isDirectory()) {
            throw new a(file0.getAbsolutePath());
        }
    }

    public static void b(File file0, File file1) throws d {
        b c$b0;
        n.i(file0);
        n.i(file1);
        file1.delete();
        if(file0.renameTo(file1)) {
            return;
        }
        if(file1.exists()) {
            c$b0 = new b(file1.getAbsolutePath());
        }
        else if(!file0.getParentFile().exists()) {
            c$b0 = new v0.c.c(file0.getAbsolutePath());
        }
        else if(!file0.exists()) {
            c$b0 = new FileNotFoundException(file0.getAbsolutePath());
        }
        else {
            c$b0 = null;
        }
        throw new d("Unknown error renaming " + file0.getAbsolutePath() + " to " + file1.getAbsolutePath(), c$b0);
    }
}

