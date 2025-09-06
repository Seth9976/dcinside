package okhttp3.internal.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.jvm.internal.L;
import okio.Z;
import okio.a0;
import okio.m0;
import okio.o0;
import y4.l;
import z3.f;

public interface FileSystem {
    public static final class Companion {
        static final class SystemFileSystem implements FileSystem {
            @Override  // okhttp3.internal.io.FileSystem
            @l
            public m0 appendingSink(@l File file0) throws FileNotFoundException {
                L.p(file0, "file");
                try {
                    return Z.a(file0);
                }
                catch(FileNotFoundException unused_ex) {
                    file0.getParentFile().mkdirs();
                    return Z.a(file0);
                }
            }

            @Override  // okhttp3.internal.io.FileSystem
            public void delete(@l File file0) throws IOException {
                L.p(file0, "file");
                if(!file0.delete() && file0.exists()) {
                    throw new IOException("failed to delete " + file0);
                }
            }

            @Override  // okhttp3.internal.io.FileSystem
            public void deleteContents(@l File file0) throws IOException {
                L.p(file0, "directory");
                File[] arr_file = file0.listFiles();
                if(arr_file == null) {
                    throw new IOException("not a readable directory: " + file0);
                }
                for(int v = 0; v < arr_file.length; ++v) {
                    File file1 = arr_file[v];
                    if(file1.isDirectory()) {
                        L.o(file1, "file");
                        this.deleteContents(file1);
                    }
                    if(!file1.delete()) {
                        throw new IOException("failed to delete " + file1);
                    }
                }
            }

            @Override  // okhttp3.internal.io.FileSystem
            public boolean exists(@l File file0) {
                L.p(file0, "file");
                return file0.exists();
            }

            @Override  // okhttp3.internal.io.FileSystem
            public void rename(@l File file0, @l File file1) throws IOException {
                L.p(file0, "from");
                L.p(file1, "to");
                this.delete(file1);
                if(!file0.renameTo(file1)) {
                    throw new IOException("failed to rename " + file0 + " to " + file1);
                }
            }

            @Override  // okhttp3.internal.io.FileSystem
            @l
            public m0 sink(@l File file0) throws FileNotFoundException {
                L.p(file0, "file");
                try {
                    return a0.q(file0, false, 1, null);
                }
                catch(FileNotFoundException unused_ex) {
                    file0.getParentFile().mkdirs();
                    return a0.q(file0, false, 1, null);
                }
            }

            @Override  // okhttp3.internal.io.FileSystem
            public long size(@l File file0) {
                L.p(file0, "file");
                return file0.length();
            }

            @Override  // okhttp3.internal.io.FileSystem
            @l
            public o0 source(@l File file0) throws FileNotFoundException {
                L.p(file0, "file");
                return Z.t(file0);
            }

            @Override
            @l
            public String toString() {
                return "FileSystem.SYSTEM";
            }
        }

        static final Companion $$INSTANCE;

        static {
            Companion.$$INSTANCE = new Companion();
        }
    }

    @l
    public static final Companion Companion;
    @l
    @f
    public static final FileSystem SYSTEM;

    static {
        FileSystem.Companion = Companion.$$INSTANCE;
        FileSystem.SYSTEM = new SystemFileSystem();
    }

    @l
    m0 appendingSink(@l File arg1) throws FileNotFoundException;

    void delete(@l File arg1) throws IOException;

    void deleteContents(@l File arg1) throws IOException;

    boolean exists(@l File arg1);

    void rename(@l File arg1, @l File arg2) throws IOException;

    @l
    m0 sink(@l File arg1) throws FileNotFoundException;

    long size(@l File arg1);

    @l
    o0 source(@l File arg1) throws FileNotFoundException;
}

