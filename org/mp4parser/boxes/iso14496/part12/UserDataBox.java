package org.mp4parser.boxes.iso14496.part12;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import org.mp4parser.BoxParser;
import org.mp4parser.support.AbstractContainerBox;

public class UserDataBox extends AbstractContainerBox {
    public static final String TYPE = "udta";

    public UserDataBox() {
        super("udta");
    }

    @Override  // org.mp4parser.support.AbstractContainerBox
    public void getBox(WritableByteChannel writableByteChannel0) throws IOException {
        super.getBox(writableByteChannel0);
    }

    @Override  // org.mp4parser.support.AbstractContainerBox
    public void parse(ReadableByteChannel readableByteChannel0, ByteBuffer byteBuffer0, long v, BoxParser boxParser0) throws IOException {
        super.parse(readableByteChannel0, byteBuffer0, v, boxParser0);
    }
}

