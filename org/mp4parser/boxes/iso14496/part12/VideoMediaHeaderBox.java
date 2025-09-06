package org.mp4parser.boxes.iso14496.part12;

import java.nio.ByteBuffer;
import org.mp4parser.aj.lang.JoinPoint.StaticPart;
import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.runtime.internal.Conversions;
import org.mp4parser.aj.runtime.reflect.Factory;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

public class VideoMediaHeaderBox extends AbstractMediaHeaderBox {
    public static final String TYPE = "vmhd";
    private static StaticPart ajc$tjp_0;
    private static StaticPart ajc$tjp_1;
    private static StaticPart ajc$tjp_2;
    private static StaticPart ajc$tjp_3;
    private static StaticPart ajc$tjp_4;
    private int graphicsmode;
    private int[] opcolor;

    static {
        VideoMediaHeaderBox.ajc$preClinit();
    }

    public VideoMediaHeaderBox() {
        super("vmhd");
        this.graphicsmode = 0;
        this.opcolor = new int[3];
        this.setFlags(1);
    }

    @Override  // org.mp4parser.support.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer0) {
        this.parseVersionAndFlags(byteBuffer0);
        this.graphicsmode = IsoTypeReader.readUInt16(byteBuffer0);
        this.opcolor = new int[3];
        for(int v = 0; v < 3; ++v) {
            int[] arr_v = this.opcolor;
            arr_v[v] = IsoTypeReader.readUInt16(byteBuffer0);
        }
    }

    private static void ajc$preClinit() {
        Factory factory0 = new Factory("VideoMediaHeaderBox.java", VideoMediaHeaderBox.class);
        VideoMediaHeaderBox.ajc$tjp_0 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getGraphicsmode", "org.mp4parser.boxes.iso14496.part12.VideoMediaHeaderBox", "", "", "", "int"), 39);
        VideoMediaHeaderBox.ajc$tjp_1 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setGraphicsmode", "org.mp4parser.boxes.iso14496.part12.VideoMediaHeaderBox", "int", "graphicsmode", "", "void"), 43);
        VideoMediaHeaderBox.ajc$tjp_2 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "getOpcolor", "org.mp4parser.boxes.iso14496.part12.VideoMediaHeaderBox", "", "", "", "[I"), 0x2F);
        VideoMediaHeaderBox.ajc$tjp_3 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "setOpcolor", "org.mp4parser.boxes.iso14496.part12.VideoMediaHeaderBox", "[I", "opcolor", "", "void"), 51);
        VideoMediaHeaderBox.ajc$tjp_4 = factory0.makeSJP("method-execution", factory0.makeMethodSig("1", "toString", "org.mp4parser.boxes.iso14496.part12.VideoMediaHeaderBox", "", "", "", "java.lang.String"), 78);
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected void getContent(ByteBuffer byteBuffer0) {
        this.writeVersionAndFlags(byteBuffer0);
        IsoTypeWriter.writeUInt16(byteBuffer0, this.graphicsmode);
        int[] arr_v = this.opcolor;
        for(int v = 0; v < arr_v.length; ++v) {
            IsoTypeWriter.writeUInt16(byteBuffer0, arr_v[v]);
        }
    }

    @Override  // org.mp4parser.support.AbstractBox
    protected long getContentSize() {
        return 12L;
    }

    public int getGraphicsmode() {
        JoinPoint joinPoint0 = Factory.makeJP(VideoMediaHeaderBox.ajc$tjp_0, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.graphicsmode;
    }

    public int[] getOpcolor() {
        JoinPoint joinPoint0 = Factory.makeJP(VideoMediaHeaderBox.ajc$tjp_2, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return this.opcolor;
    }

    public void setGraphicsmode(int v) {
        JoinPoint joinPoint0 = Factory.makeJP(VideoMediaHeaderBox.ajc$tjp_1, this, this, Conversions.intObject(v));
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.graphicsmode = v;
    }

    public void setOpcolor(int[] arr_v) {
        JoinPoint joinPoint0 = Factory.makeJP(VideoMediaHeaderBox.ajc$tjp_3, this, this, arr_v);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        this.opcolor = arr_v;
    }

    @Override
    public String toString() {
        JoinPoint joinPoint0 = Factory.makeJP(VideoMediaHeaderBox.ajc$tjp_4, this, this);
        RequiresParseDetailAspect.aspectOf().before(joinPoint0);
        return "VideoMediaHeaderBox[graphicsmode=" + this.getGraphicsmode() + ";opcolor0=" + this.getOpcolor()[0] + ";opcolor1=" + this.getOpcolor()[1] + ";opcolor2=" + this.getOpcolor()[2] + "]";
    }
}

