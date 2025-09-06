package org.mp4parser.boxes.iso14496.part1.objectdescriptors;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.mp4parser.tools.IsoTypeReader;

public abstract class InitialObjectDescriptor extends ObjectDescriptorBase {
    int audioProfileLevelIndication;
    List esDescriptors;
    List extensionDescriptors;
    int graphicsProfileLevelIndication;
    int includeInlineProfileLevelFlag;
    int oDProfileLevelIndication;
    private int objectDescriptorId;
    int sceneProfileLevelIndication;
    List unknownDescriptors;
    int urlFlag;
    int urlLength;
    String urlString;
    int visualProfileLevelIndication;

    public InitialObjectDescriptor() {
        this.esDescriptors = new ArrayList();
        this.extensionDescriptors = new ArrayList();
        this.unknownDescriptors = new ArrayList();
    }

    @Override  // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    public void parseDetail(ByteBuffer byteBuffer0) throws IOException {
        int v3;
        int v = IsoTypeReader.readUInt16(byteBuffer0);
        this.objectDescriptorId = (0xFFC0 & v) >> 6;
        this.urlFlag = (v & 0x3F) >> 5;
        this.includeInlineProfileLevelFlag = (v & 0x1F) >> 4;
        int v1 = this.getSize();
        if(this.urlFlag == 1) {
            int v2 = IsoTypeReader.readUInt8(byteBuffer0);
            this.urlLength = v2;
            this.urlString = IsoTypeReader.readString(byteBuffer0, v2);
            v3 = v1 - 2 - (this.urlLength + 1);
        }
        else {
            this.oDProfileLevelIndication = IsoTypeReader.readUInt8(byteBuffer0);
            this.sceneProfileLevelIndication = IsoTypeReader.readUInt8(byteBuffer0);
            this.audioProfileLevelIndication = IsoTypeReader.readUInt8(byteBuffer0);
            this.visualProfileLevelIndication = IsoTypeReader.readUInt8(byteBuffer0);
            this.graphicsProfileLevelIndication = IsoTypeReader.readUInt8(byteBuffer0);
            v3 = v1 - 7;
            if(v3 > 2) {
                BaseDescriptor baseDescriptor0 = ObjectDescriptorFactory.createFrom(-1, byteBuffer0);
                v3 -= baseDescriptor0.getSize();
                if(baseDescriptor0 instanceof ESDescriptor) {
                    this.esDescriptors.add(((ESDescriptor)baseDescriptor0));
                }
                else {
                    this.unknownDescriptors.add(baseDescriptor0);
                }
            }
        }
        if(v3 > 2) {
            BaseDescriptor baseDescriptor1 = ObjectDescriptorFactory.createFrom(-1, byteBuffer0);
            if(baseDescriptor1 instanceof ExtensionDescriptor) {
                this.extensionDescriptors.add(((ExtensionDescriptor)baseDescriptor1));
                return;
            }
            this.unknownDescriptors.add(baseDescriptor1);
        }
    }

    // 去混淆评级： 低(20)
    @Override  // org.mp4parser.boxes.iso14496.part1.objectdescriptors.BaseDescriptor
    public String toString() {
        return "InitialObjectDescriptor{objectDescriptorId=" + this.objectDescriptorId + ", urlFlag=" + this.urlFlag + ", includeInlineProfileLevelFlag=" + this.includeInlineProfileLevelFlag + ", urlLength=" + this.urlLength + ", urlString=\'" + this.urlString + '\'' + ", oDProfileLevelIndication=" + this.oDProfileLevelIndication + ", sceneProfileLevelIndication=" + this.sceneProfileLevelIndication + ", audioProfileLevelIndication=" + this.audioProfileLevelIndication + ", visualProfileLevelIndication=" + this.visualProfileLevelIndication + ", graphicsProfileLevelIndication=" + this.graphicsProfileLevelIndication + ", esDescriptors=" + this.esDescriptors + ", extensionDescriptors=" + this.extensionDescriptors + ", unknownDescriptors=" + this.unknownDescriptors + '}';
    }
}

