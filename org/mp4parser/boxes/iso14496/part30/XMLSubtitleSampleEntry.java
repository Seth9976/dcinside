package org.mp4parser.boxes.iso14496.part30;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import org.mp4parser.BoxParser;
import org.mp4parser.boxes.sampleentry.AbstractSampleEntry;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;
import org.mp4parser.tools.Mp4Arrays;
import org.mp4parser.tools.Utf8;

public class XMLSubtitleSampleEntry extends AbstractSampleEntry {
    public static final String TYPE = "stpp";
    private String auxiliaryMimeTypes;
    private String namespace;
    private String schemaLocation;

    public XMLSubtitleSampleEntry() {
        super("stpp");
        this.namespace = "";
        this.schemaLocation = "";
        this.auxiliaryMimeTypes = "";
    }

    public String getAuxiliaryMimeTypes() {
        return this.auxiliaryMimeTypes;
    }

    @Override  // org.mp4parser.boxes.sampleentry.AbstractSampleEntry
    public void getBox(WritableByteChannel writableByteChannel0) throws IOException {
        writableByteChannel0.write(this.getHeader());
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(this.namespace.length() + 8 + this.schemaLocation.length() + this.auxiliaryMimeTypes.length() + 3);
        byteBuffer0.position(6);
        IsoTypeWriter.writeUInt16(byteBuffer0, this.dataReferenceIndex);
        IsoTypeWriter.writeZeroTermUtf8String(byteBuffer0, this.namespace);
        IsoTypeWriter.writeZeroTermUtf8String(byteBuffer0, this.schemaLocation);
        IsoTypeWriter.writeZeroTermUtf8String(byteBuffer0, this.auxiliaryMimeTypes);
        writableByteChannel0.write(((ByteBuffer)byteBuffer0.rewind()));
        this.writeContainer(writableByteChannel0);
    }

    public String getNamespace() {
        return this.namespace;
    }

    public String getSchemaLocation() {
        return this.schemaLocation;
    }

    @Override  // org.mp4parser.support.AbstractContainerBox, org.mp4parser.Box
    public long getSize() {
        int v = 8;
        long v1 = this.getContainerSize() + ((long)(this.namespace.length() + 8 + this.schemaLocation.length() + this.auxiliaryMimeTypes.length() + 3));
        if(this.largeBox || v1 + 8L >= 0x100000000L) {
            v = 16;
        }
        return v1 + ((long)v);
    }

    @Override  // org.mp4parser.boxes.sampleentry.AbstractSampleEntry
    public void parse(ReadableByteChannel readableByteChannel0, ByteBuffer byteBuffer0, long v, BoxParser boxParser0) throws IOException {
        ByteBuffer byteBuffer1 = ByteBuffer.allocate(8);
        readableByteChannel0.read(((ByteBuffer)byteBuffer1.rewind()));
        byteBuffer1.position(6);
        this.dataReferenceIndex = IsoTypeReader.readUInt16(byteBuffer1);
        byte[] arr_b = new byte[0];
        int v1;
        while((v1 = Channels.newInputStream(readableByteChannel0).read()) != 0) {
            arr_b = Mp4Arrays.copyOfAndAppend(arr_b, new byte[]{((byte)v1)});
        }
        this.namespace = Utf8.convert(arr_b);
        byte[] arr_b1 = new byte[0];
        int v2;
        while((v2 = Channels.newInputStream(readableByteChannel0).read()) != 0) {
            arr_b1 = Mp4Arrays.copyOfAndAppend(arr_b1, new byte[]{((byte)v2)});
        }
        this.schemaLocation = Utf8.convert(arr_b1);
        byte[] arr_b2 = new byte[0];
        int v3;
        while((v3 = Channels.newInputStream(readableByteChannel0).read()) != 0) {
            arr_b2 = Mp4Arrays.copyOfAndAppend(arr_b2, new byte[]{((byte)v3)});
        }
        this.auxiliaryMimeTypes = Utf8.convert(arr_b2);
        this.initContainer(readableByteChannel0, v - ((long)(byteBuffer0.remaining() + this.namespace.length() + this.schemaLocation.length() + this.auxiliaryMimeTypes.length() + 3)), boxParser0);
    }

    public void setAuxiliaryMimeTypes(String s) {
        this.auxiliaryMimeTypes = s;
    }

    public void setNamespace(String s) {
        this.namespace = s;
    }

    public void setSchemaLocation(String s) {
        this.schemaLocation = s;
    }
}

