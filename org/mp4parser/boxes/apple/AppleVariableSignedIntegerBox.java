package org.mp4parser.boxes.apple;

import java.nio.ByteBuffer;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.internal.Conversions;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeReaderVariable;
import org.mp4parser.tools.IsoTypeWriterVariable;

public abstract class AppleVariableSignedIntegerBox extends AppleDataBox {
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    private static StaticPart ajc$tjp_3;
    int intLength;
    long value;

    static {
        AppleVariableSignedIntegerBox.ajc$preClinit();
    }

    protected AppleVariableSignedIntegerBox(String s) {
        super(s, 15);
        this.intLength = 1;
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("AppleVariableSignedIntegerBox.java", AppleVariableSignedIntegerBox.class);
        AppleVariableSignedIntegerBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getIntLength", "org.mp4parser.boxes.apple.AppleVariableSignedIntegerBox", "", "", "", "int"), 19);
        AppleVariableSignedIntegerBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setIntLength", "org.mp4parser.boxes.apple.AppleVariableSignedIntegerBox", "int", "intLength", "", "void"), 23);
        AppleVariableSignedIntegerBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getValue", "org.mp4parser.boxes.apple.AppleVariableSignedIntegerBox", "", "", "", "long"), 27);
        AppleVariableSignedIntegerBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setValue", "org.mp4parser.boxes.apple.AppleVariableSignedIntegerBox", "long", "value", "", "void"), 35);
    }

    @Override  // org.mp4parser.boxes.apple.AppleDataBox
    protected int getDataLength() {
        return this.intLength;
    }

    public int getIntLength() {
        JoinPoint joinPoint0 = Factory.makeJP(AppleVariableSignedIntegerBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.intLength;
    }

    public long getValue() {
        JoinPoint joinPoint0 = Factory.makeJP(AppleVariableSignedIntegerBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        if(!this.isParsed()) {
            this.parseDetails();
        }
        return this.value;
    }

    @Override  // org.mp4parser.boxes.apple.AppleDataBox
    protected void parseData(ByteBuffer byteBuffer0) {
        int v = byteBuffer0.remaining();
        this.value = IsoTypeReaderVariable.read(byteBuffer0, v);
        this.intLength = v;
    }

    public void setIntLength(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(AppleVariableSignedIntegerBox.ajc$tjp_1, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.intLength = v;
    }

    public void setValue(long v) {
        JoinPoint joinPoint0 = Factory.makeJP(AppleVariableSignedIntegerBox.ajc$tjp_3, this, this, Conversions.longObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        if(v <= 0x7FL && v > 0xFFFFFFFFFFFFFF80L) {
            this.intLength = 1;
        }
        else if(v <= 0x7FFFL && v > 0xFFFFFFFFFFFF8000L && this.intLength < 2) {
            this.intLength = 2;
        }
        else if(v > 0x7FFFFFL || v <= 0xFFFFFFFFFF800000L || this.intLength >= 3) {
            this.intLength = 4;
        }
        else {
            this.intLength = 3;
        }
        this.value = v;
    }

    @Override  // org.mp4parser.boxes.apple.AppleDataBox
    protected byte[] writeData() {
        int v = this.getDataLength();
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(new byte[v]);
        IsoTypeWriterVariable.write(this.value, byteBuffer0, v);
        return byteBuffer0.array();
    }
}

