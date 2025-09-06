package org.mp4parser.boxes.iso14496.part1.objectdescriptors;

import java.io.IOException;
import java.nio.ByteBuffer;
import org.mp4parser.tools.Hex;
import org.mp4parser.tools.IsoTypeWriter;
import org.slf4j.a;
import org.slf4j.b;

@Descriptor(tags = {19, 106, 107, 108, 109, 110, 0x6F, 0x70, 0x71, 0x72, 0x73, 0x74, 0x75, 0x76, 0x77, 120, 0x79, 0x7A, 0x7B, 0x7C, 0x7D, 0x7E, 0x7F, 0x80, 0x81, 130, 0x83, 0x84, 0x85, 0x86, 0x87, 0x88, 0x89, 0x8A, 0x8B, 140, 0x8D, 0x8E, 0x8F, 0x90, 0x91, 0x92, 0x93, 0x94, 0x95, 150, 0x97, 0x98, 0x99, 0x9A, 0x9B, 0x9C, 0x9D, 0x9E, 0x9F, 0xA0, 0xA1, 0xA2, 0xA3, 0xA4, 0xA5, 0xA6, 0xA7, 0xA8, 0xA9, 170, 0xAB, 0xAC, 0xAD, 0xAE, 0xAF, 0xB0, 0xB1, 0xB2, 0xB3, 180, 0xB5, 0xB6, 0xB7, 0xB8, 0xB9, 0xBA, 0xBB, 0xBC, 0xBD, 190, 0xBF, 0xC0, 0xC1, 0xC2, 0xC3, 0xC4, 0xC5, 0xC6, 0xC7, 200, 201, 202, 203, 204, 205, 206, 0xCF, 0xD0, 209, 210, 0xD3, 0xD4, 0xD5, 0xD6, 0xD7, 0xD8, 0xD9, 0xDA, 0xDB, 220, 0xDD, 0xDE, 0xDF, 0xE0, 0xE1, 0xE2, 0xE3, 0xE4, 0xE5, 230, 0xE7, 0xE8, 0xE9, 0xEA, 0xEB, 0xEC, 0xED, 0xEE, 0xEF, 0xF0, 0xF1, 0xF2, 0xF3, 0xF4, 0xF5, 0xF6, 0xF7, 0xF8, 0xF9, 0xFA, 0xFB, 0xFC, 0xFD})
public class ExtensionDescriptor extends BaseDescriptor {
    private static a LOG;
    ByteBuffer data;

    static {
        ExtensionDescriptor.LOG = b.j("org.mp4parser.boxes.iso14496.part1.objectdescriptors.ExtensionDescriptor");
    }

    static int[] allTags() {
        int[] arr_v = new int[0x94];
        for(int v = 106; v < 0xFE; ++v) {
            ExtensionDescriptor.LOG.W("pos: {}", ((int)(v - 106)));
            arr_v[v - 106] = v;
        }
        return arr_v;
    }

    @Override  // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    int getContentSize() {
        return this.data.remaining();
    }

    @Override  // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    public void parseDetail(ByteBuffer byteBuffer0) throws IOException {
        this.data = byteBuffer0.slice();
        byteBuffer0.position(byteBuffer0.position() + this.data.remaining());
    }

    @Override  // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    public ByteBuffer serialize() {
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(this.getSize());
        IsoTypeWriter.writeUInt8(byteBuffer0, this.tag);
        this.writeSize(byteBuffer0, this.getContentSize());
        byteBuffer0.put(this.data.duplicate());
        return byteBuffer0;
    }

    // 去混淆评级： 低(20)
    @Override  // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    public String toString() {
        return "ExtensionDescriptortag=" + this.tag + ",bytes=" + Hex.encodeHex(this.data.array()) + '}';
    }
}

