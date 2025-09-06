package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.core.f;
import com.fasterxml.jackson.core.n;
import com.fasterxml.jackson.core.r;
import com.fasterxml.jackson.databind.deser.std.I;
import com.fasterxml.jackson.databind.h;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.spi.FileSystemProvider;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

public class p extends I {
    private static final long g = 1L;
    private static final boolean h;

    // 去混淆评级： 中等(65)
    static {
        p.h = 0 < File.listRoots().length;
    }

    public p() {
        super(Path.class);
    }

    @Override  // com.fasterxml.jackson.databind.n
    public Object g(n n0, h h0) throws IOException, f {
        return this.r1(n0, h0);
    }

    public Path r1(n n0, h h0) throws IOException {
        URI uRI0;
        if(!n0.Y3(r.q)) {
            return j.a(h0.v0(Path.class, n0));
        }
        String s = n0.R2();
        if(s.indexOf(58) < 0) {
            return Paths.get(s, new String[0]);
        }
        if(p.h && s.length() >= 2 && Character.isLetter(s.charAt(0)) && s.charAt(1) == 58) {
            return Paths.get(s, new String[0]);
        }
        try {
            uRI0 = new URI(s);
        }
        catch(URISyntaxException uRISyntaxException0) {
            return j.a(h0.o0(this.s(), s, uRISyntaxException0));
        }
        try {
            return Paths.get(uRI0);
        }
        catch(FileSystemNotFoundException fileSystemNotFoundException0) {
            try {
                String s1 = uRI0.getScheme();
                for(Object object0: ServiceLoader.load(FileSystemProvider.class)) {
                    FileSystemProvider fileSystemProvider0 = (FileSystemProvider)object0;
                    if(fileSystemProvider0.getScheme().equalsIgnoreCase(s1)) {
                        return fileSystemProvider0.getPath(uRI0);
                    }
                    if(false) {
                        break;
                    }
                }
                return j.a(h0.o0(this.s(), s, fileSystemNotFoundException0));
            }
            catch(ServiceConfigurationError serviceConfigurationError0) {
            }
            serviceConfigurationError0.addSuppressed(fileSystemNotFoundException0);
            return j.a(h0.o0(this.s(), s, serviceConfigurationError0));
        }
        catch(Exception exception0) {
            return j.a(h0.o0(this.s(), s, exception0));
        }
    }
}

