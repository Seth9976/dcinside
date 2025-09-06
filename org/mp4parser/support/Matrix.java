package org.mp4parser.support;

import java.nio.ByteBuffer;
import org.mp4parser.tools.IsoTypeReader;
import org.mp4parser.tools.IsoTypeWriter;

public class Matrix {
    public static final Matrix ROTATE_0;
    public static final Matrix ROTATE_180;
    public static final Matrix ROTATE_270;
    public static final Matrix ROTATE_90;
    double a;
    double b;
    double c;
    double d;
    double tx;
    double ty;
    double u;
    double v;
    double w;

    static {
        Matrix.ROTATE_0 = new Matrix(1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0);
        Matrix.ROTATE_90 = new Matrix(0.0, 1.0, -1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0);
        Matrix.ROTATE_180 = new Matrix(-1.0, 0.0, 0.0, -1.0, 0.0, 0.0, 1.0, 0.0, 0.0);
        Matrix.ROTATE_270 = new Matrix(0.0, -1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0);
    }

    public Matrix(double f, double f1, double f2, double f3, double f4, double f5, double f6, double f7, double f8) {
        this.u = f4;
        this.v = f5;
        this.w = f6;
        this.a = f;
        this.b = f1;
        this.c = f2;
        this.d = f3;
        this.tx = f7;
        this.ty = f8;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null || this.getClass() != object0.getClass() || Double.compare(((Matrix)object0).a, this.a) != 0) {
            return false;
        }
        if(Double.compare(((Matrix)object0).b, this.b) != 0) {
            return false;
        }
        if(Double.compare(((Matrix)object0).c, this.c) != 0) {
            return false;
        }
        if(Double.compare(((Matrix)object0).d, this.d) != 0) {
            return false;
        }
        if(Double.compare(((Matrix)object0).tx, this.tx) != 0) {
            return false;
        }
        if(Double.compare(((Matrix)object0).ty, this.ty) != 0) {
            return false;
        }
        if(Double.compare(((Matrix)object0).u, this.u) != 0) {
            return false;
        }
        return Double.compare(((Matrix)object0).v, this.v) == 0 ? Double.compare(((Matrix)object0).w, this.w) == 0 : false;
    }

    public static Matrix fromByteBuffer(ByteBuffer byteBuffer0) {
        return Matrix.fromFileOrder(IsoTypeReader.readFixedPoint1616(byteBuffer0), IsoTypeReader.readFixedPoint1616(byteBuffer0), IsoTypeReader.readFixedPoint0230(byteBuffer0), IsoTypeReader.readFixedPoint1616(byteBuffer0), IsoTypeReader.readFixedPoint1616(byteBuffer0), IsoTypeReader.readFixedPoint0230(byteBuffer0), IsoTypeReader.readFixedPoint1616(byteBuffer0), IsoTypeReader.readFixedPoint1616(byteBuffer0), IsoTypeReader.readFixedPoint0230(byteBuffer0));
    }

    public static Matrix fromFileOrder(double f, double f1, double f2, double f3, double f4, double f5, double f6, double f7, double f8) {
        return new Matrix(f, f1, f3, f4, f2, f5, f8, f6, f7);
    }

    public void getContent(ByteBuffer byteBuffer0) {
        IsoTypeWriter.writeFixedPoint1616(byteBuffer0, this.a);
        IsoTypeWriter.writeFixedPoint1616(byteBuffer0, this.b);
        IsoTypeWriter.writeFixedPoint0230(byteBuffer0, this.u);
        IsoTypeWriter.writeFixedPoint1616(byteBuffer0, this.c);
        IsoTypeWriter.writeFixedPoint1616(byteBuffer0, this.d);
        IsoTypeWriter.writeFixedPoint0230(byteBuffer0, this.v);
        IsoTypeWriter.writeFixedPoint1616(byteBuffer0, this.tx);
        IsoTypeWriter.writeFixedPoint1616(byteBuffer0, this.ty);
        IsoTypeWriter.writeFixedPoint0230(byteBuffer0, this.w);
    }

    @Override
    public int hashCode() {
        long v = Double.doubleToLongBits(this.u);
        long v1 = Double.doubleToLongBits(this.v);
        long v2 = Double.doubleToLongBits(this.w);
        long v3 = Double.doubleToLongBits(this.a);
        long v4 = Double.doubleToLongBits(this.b);
        long v5 = Double.doubleToLongBits(this.c);
        long v6 = Double.doubleToLongBits(this.d);
        long v7 = Double.doubleToLongBits(this.tx);
        long v8 = Double.doubleToLongBits(this.ty);
        return (((((((((int)(v ^ v >>> 0x20)) * 0x1F + ((int)(v1 ^ v1 >>> 0x20))) * 0x1F + ((int)(v2 ^ v2 >>> 0x20))) * 0x1F + ((int)(v3 ^ v3 >>> 0x20))) * 0x1F + ((int)(v4 ^ v4 >>> 0x20))) * 0x1F + ((int)(v5 ^ v5 >>> 0x20))) * 0x1F + ((int)(v6 ^ v6 >>> 0x20))) * 0x1F + ((int)(v7 ^ v7 >>> 0x20))) * 0x1F + ((int)(v8 ^ v8 >>> 0x20));
    }

    @Override
    public String toString() {
        if(this.equals(Matrix.ROTATE_0)) {
            return "Rotate 0°";
        }
        if(this.equals(Matrix.ROTATE_90)) {
            return "Rotate 90°";
        }
        if(this.equals(Matrix.ROTATE_180)) {
            return "Rotate 180°";
        }
        return this.equals(Matrix.ROTATE_270) ? "Rotate 270°" : "Matrix{u=" + this.u + ", v=" + this.v + ", w=" + this.w + ", a=" + this.a + ", b=" + this.b + ", c=" + this.c + ", d=" + this.d + ", tx=" + this.tx + ", ty=" + this.ty + '}';
    }
}

