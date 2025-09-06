package org.mp4parser;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.Iterator;
import org.mp4parser.boxes.iso14496.part12.MovieBox;
import org.mp4parser.support.DoNotParseDetail;
import org.slf4j.a;
import org.slf4j.b;

@DoNotParseDetail
public class IsoFile extends BasicContainer implements Closeable {
    private static a LOG;
    private ReadableByteChannel readableByteChannel;

    static {
        IsoFile.LOG = b.i(IsoFile.class);
    }

    public IsoFile(File file0) throws IOException {
        this(new FileInputStream(file0).getChannel(), new PropertyBoxParserImpl(new String[0]));
    }

    public IsoFile(String s) throws IOException {
        this(new FileInputStream(s).getChannel(), new PropertyBoxParserImpl(new String[0]));
    }

    public IsoFile(ReadableByteChannel readableByteChannel0) throws IOException {
        this(readableByteChannel0, new PropertyBoxParserImpl(new String[0]));
    }

    public IsoFile(ReadableByteChannel readableByteChannel0, BoxParser boxParser0) throws IOException {
        this.readableByteChannel = readableByteChannel0;
        this.initContainer(readableByteChannel0, -1L, boxParser0);
    }

    public static String bytesToFourCC(byte[] arr_b) {
        byte[] arr_b1 = new byte[4];
        if(arr_b != null) {
            System.arraycopy(arr_b, 0, arr_b1, 0, Math.min(arr_b.length, 4));
        }
        try {
            return new String(arr_b1, "ISO-8859-1");
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            throw new Error("Required character encoding is missing", unsupportedEncodingException0);
        }
    }

    @Override
    public void close() throws IOException {
        this.readableByteChannel.close();
    }

    public static byte[] fourCCtoBytes(String s) {
        byte[] arr_b = new byte[4];
        if(s != null) {
            for(int v = 0; v < Math.min(4, s.length()); ++v) {
                arr_b[v] = (byte)s.charAt(v);
            }
        }
        return arr_b;
    }

    public void getBox(WritableByteChannel writableByteChannel0) throws IOException {
        this.writeContainer(writableByteChannel0);
    }

    public MovieBox getMovieBox() {
        Box box0;
        Iterator iterator0 = this.getBoxes().iterator();
        do {
            if(!iterator0.hasNext()) {
                return null;
            }
            Object object0 = iterator0.next();
            box0 = (Box)object0;
        }
        while(!(box0 instanceof MovieBox));
        return (MovieBox)box0;
    }

    public long getSize() {
        return this.getContainerSize();
    }

    @Override  // org.mp4parser.BasicContainer
    public String toString() {
        return "model(" + this.readableByteChannel.toString() + ")";
    }
}

