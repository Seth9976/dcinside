package org.mp4parser;

import java.io.InputStreamReader;
import java.io.LineNumberReader;
import org.slf4j.a;
import org.slf4j.b;

public class Version {
    private static final a LOG;
    public static final String VERSION;

    static {
        Version.LOG = b.i(Version.class);
        new LineNumberReader(new InputStreamReader(Version.class.getResourceAsStream("/version2.txt")));
        Version.VERSION = "isoparser-1.9.41";
    }
}

