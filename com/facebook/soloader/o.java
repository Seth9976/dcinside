package com.facebook.soloader;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import o3.h;

public final class o implements Closeable {
    private final FileOutputStream a;
    @h
    private final FileLock b;

    private o(File file0) throws IOException {
        FileLock fileLock0;
        FileOutputStream fileOutputStream0 = new FileOutputStream(file0);
        this.a = fileOutputStream0;
        try {
            fileLock0 = fileOutputStream0.getChannel().lock();
        }
        catch(Throwable throwable0) {
            this.a.close();
            throw throwable0;
        }
        if(fileLock0 == null) {
            fileOutputStream0.close();
        }
        this.b = fileLock0;
    }

    public static o a(File file0) throws IOException {
        return new o(file0);
    }

    @Override
    public void close() throws IOException {
        try {
            FileLock fileLock0 = this.b;
            if(fileLock0 != null) {
                fileLock0.release();
            }
        }
        finally {
            this.a.close();
        }
    }
}

