package androidx.exifinterface.media;

import android.annotation.SuppressLint;
import android.content.res.AssetManager.AssetInputStream;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.Location;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build.VERSION;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import j..util.DesugarTimeZone;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import jeb.synthetic.TWR;

public class ExifInterface {
    static class ByteOrderedDataInputStream extends InputStream implements DataInput {
        protected final DataInputStream a;
        protected int b;
        private ByteOrder c;
        private byte[] d;
        private int e;
        public static final int f = -1;

        ByteOrderedDataInputStream(InputStream inputStream0) throws IOException {
            this(inputStream0, ByteOrder.BIG_ENDIAN);
        }

        ByteOrderedDataInputStream(InputStream inputStream0, ByteOrder byteOrder0) throws IOException {
            DataInputStream dataInputStream0 = new DataInputStream(inputStream0);
            this.a = dataInputStream0;
            dataInputStream0.mark(0);
            this.b = 0;
            this.c = byteOrder0;
            this.e = inputStream0 instanceof ByteOrderedDataInputStream ? ((ByteOrderedDataInputStream)inputStream0).a() : -1;
        }

        ByteOrderedDataInputStream(byte[] arr_b) throws IOException {
            this(new ByteArrayInputStream(arr_b), ByteOrder.BIG_ENDIAN);
            this.e = arr_b.length;
        }

        public int a() {
            return this.e;
        }

        @Override
        public int available() throws IOException {
            return this.a.available();
        }

        public int b() {
            return this.b;
        }

        public long c() throws IOException {
            return ((long)this.readInt()) & 0xFFFFFFFFL;
        }

        public void e(ByteOrder byteOrder0) {
            this.c = byteOrder0;
        }

        public void f(int v) throws IOException {
            int v1;
            for(v1 = 0; v1 < v; v1 += v3) {
                int v2 = v - v1;
                int v3 = (int)this.a.skip(((long)v2));
                if(v3 <= 0) {
                    if(this.d == null) {
                        this.d = new byte[0x2000];
                    }
                    v3 = this.a.read(this.d, 0, Math.min(0x2000, v2));
                    if(v3 == -1) {
                        throw new EOFException("Reached EOF while skipping " + v + " bytes.");
                    }
                }
            }
            this.b += v1;
        }

        @Override
        public void mark(int v) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override
        public int read() throws IOException {
            ++this.b;
            return this.a.read();
        }

        @Override
        public int read(byte[] arr_b, int v, int v1) throws IOException {
            int v2 = this.a.read(arr_b, v, v1);
            this.b += v2;
            return v2;
        }

        @Override
        public boolean readBoolean() throws IOException {
            ++this.b;
            return this.a.readBoolean();
        }

        @Override
        public byte readByte() throws IOException {
            ++this.b;
            int v = this.a.read();
            if(v < 0) {
                throw new EOFException();
            }
            return (byte)v;
        }

        @Override
        public char readChar() throws IOException {
            this.b += 2;
            return this.a.readChar();
        }

        @Override
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(this.readLong());
        }

        @Override
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(this.readInt());
        }

        @Override
        public void readFully(byte[] arr_b) throws IOException {
            this.b += arr_b.length;
            this.a.readFully(arr_b);
        }

        @Override
        public void readFully(byte[] arr_b, int v, int v1) throws IOException {
            this.b += v1;
            this.a.readFully(arr_b, v, v1);
        }

        @Override
        public int readInt() throws IOException {
            this.b += 4;
            int v = this.a.read();
            int v1 = this.a.read();
            int v2 = this.a.read();
            int v3 = this.a.read();
            if((v | v1 | v2 | v3) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder0 = this.c;
            if(byteOrder0 == ByteOrder.LITTLE_ENDIAN) {
                return (v3 << 24) + (v2 << 16) + (v1 << 8) + v;
            }
            if(byteOrder0 != ByteOrder.BIG_ENDIAN) {
                throw new IOException("Invalid byte order: " + this.c);
            }
            return (v << 24) + (v1 << 16) + (v2 << 8) + v3;
        }

        @Override
        public String readLine() throws IOException {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override
        public long readLong() throws IOException {
            this.b += 8;
            int v = this.a.read();
            int v1 = this.a.read();
            int v2 = this.a.read();
            int v3 = this.a.read();
            int v4 = this.a.read();
            int v5 = this.a.read();
            int v6 = this.a.read();
            int v7 = this.a.read();
            if((v | v1 | v2 | v3 | v4 | v5 | v6 | v7) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder0 = this.c;
            if(byteOrder0 == ByteOrder.LITTLE_ENDIAN) {
                return (((long)v7) << 56) + (((long)v6) << 0x30) + (((long)v5) << 40) + (((long)v4) << 0x20) + (((long)v3) << 24) + (((long)v2) << 16) + (((long)v1) << 8) + ((long)v);
            }
            if(byteOrder0 != ByteOrder.BIG_ENDIAN) {
                throw new IOException("Invalid byte order: " + this.c);
            }
            return (((long)v) << 56) + (((long)v1) << 0x30) + (((long)v2) << 40) + (((long)v3) << 0x20) + (((long)v4) << 24) + (((long)v5) << 16) + (((long)v6) << 8) + ((long)v7);
        }

        @Override
        public short readShort() throws IOException {
            this.b += 2;
            int v = this.a.read();
            int v1 = this.a.read();
            if((v | v1) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder0 = this.c;
            if(byteOrder0 == ByteOrder.LITTLE_ENDIAN) {
                return (short)((v1 << 8) + v);
            }
            if(byteOrder0 != ByteOrder.BIG_ENDIAN) {
                throw new IOException("Invalid byte order: " + this.c);
            }
            return (short)((v << 8) + v1);
        }

        @Override
        public String readUTF() throws IOException {
            this.b += 2;
            return this.a.readUTF();
        }

        @Override
        public int readUnsignedByte() throws IOException {
            ++this.b;
            return this.a.readUnsignedByte();
        }

        @Override
        public int readUnsignedShort() throws IOException {
            this.b += 2;
            int v = this.a.read();
            int v1 = this.a.read();
            if((v | v1) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder0 = this.c;
            if(byteOrder0 == ByteOrder.LITTLE_ENDIAN) {
                return (v1 << 8) + v;
            }
            if(byteOrder0 != ByteOrder.BIG_ENDIAN) {
                throw new IOException("Invalid byte order: " + this.c);
            }
            return (v << 8) + v1;
        }

        @Override
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override
        public int skipBytes(int v) throws IOException {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }
    }

    static class ByteOrderedDataOutputStream extends FilterOutputStream {
        final OutputStream a;
        private ByteOrder b;

        public ByteOrderedDataOutputStream(OutputStream outputStream0, ByteOrder byteOrder0) {
            super(outputStream0);
            this.a = outputStream0;
            this.b = byteOrder0;
        }

        public void a(ByteOrder byteOrder0) {
            this.b = byteOrder0;
        }

        public void b(int v) throws IOException {
            ByteOrder byteOrder0 = this.b;
            if(byteOrder0 == ByteOrder.LITTLE_ENDIAN) {
                this.a.write(v & 0xFF);
                this.a.write(v >>> 8 & 0xFF);
                this.a.write(v >>> 16 & 0xFF);
                this.a.write(v >>> 24 & 0xFF);
                return;
            }
            if(byteOrder0 == ByteOrder.BIG_ENDIAN) {
                this.a.write(v >>> 24 & 0xFF);
                this.a.write(v >>> 16 & 0xFF);
                this.a.write(v >>> 8 & 0xFF);
                this.a.write(v & 0xFF);
            }
        }

        public void c(short v) throws IOException {
            ByteOrder byteOrder0 = this.b;
            if(byteOrder0 == ByteOrder.LITTLE_ENDIAN) {
                this.a.write(v & 0xFF);
                this.a.write(v >>> 8 & 0xFF);
                return;
            }
            if(byteOrder0 == ByteOrder.BIG_ENDIAN) {
                this.a.write(v >>> 8 & 0xFF);
                this.a.write(v & 0xFF);
            }
        }

        public void e(long v) throws IOException {
            if(v > 0xFFFFFFFFL) {
                throw new IllegalArgumentException("val is larger than the maximum value of a 32-bit unsigned integer");
            }
            this.b(((int)v));
        }

        public void f(int v) throws IOException {
            if(v > 0xFFFF) {
                throw new IllegalArgumentException("val is larger than the maximum value of a 16-bit unsigned integer");
            }
            this.c(((short)v));
        }

        @Override
        public void write(byte[] arr_b) throws IOException {
            this.a.write(arr_b);
        }

        @Override
        public void write(byte[] arr_b, int v, int v1) throws IOException {
            this.a.write(arr_b, v, v1);
        }

        public void writeByte(int v) throws IOException {
            this.a.write(v);
        }
    }

    static class ExifAttribute {
        public final int a;
        public final int b;
        public final long c;
        public final byte[] d;
        public static final long e = -1L;

        ExifAttribute(int v, int v1, long v2, byte[] arr_b) {
            this.a = v;
            this.b = v1;
            this.c = v2;
            this.d = arr_b;
        }

        ExifAttribute(int v, int v1, byte[] arr_b) {
            this(v, v1, -1L, arr_b);
        }

        public static ExifAttribute a(String s) {
            if(s.length() == 1 && s.charAt(0) >= 0x30 && s.charAt(0) <= 49) {
                return new ExifAttribute(1, 1, new byte[]{((byte)(s.charAt(0) - 0x30))});
            }
            byte[] arr_b = s.getBytes(ExifInterface.j7);
            return new ExifAttribute(1, arr_b.length, arr_b);
        }

        public static ExifAttribute b(double f, ByteOrder byteOrder0) {
            return ExifAttribute.c(new double[]{f}, byteOrder0);
        }

        public static ExifAttribute c(double[] arr_f, ByteOrder byteOrder0) {
            ByteBuffer byteBuffer0 = ByteBuffer.wrap(new byte[ExifInterface.H6[12] * arr_f.length]);
            byteBuffer0.order(byteOrder0);
            for(int v = 0; v < arr_f.length; ++v) {
                byteBuffer0.putDouble(arr_f[v]);
            }
            byte[] arr_b = byteBuffer0.array();
            return new ExifAttribute(12, arr_f.length, arr_b);
        }

        public static ExifAttribute d(int v, ByteOrder byteOrder0) {
            return ExifAttribute.e(new int[]{v}, byteOrder0);
        }

        public static ExifAttribute e(int[] arr_v, ByteOrder byteOrder0) {
            ByteBuffer byteBuffer0 = ByteBuffer.wrap(new byte[ExifInterface.H6[9] * arr_v.length]);
            byteBuffer0.order(byteOrder0);
            for(int v = 0; v < arr_v.length; ++v) {
                byteBuffer0.putInt(arr_v[v]);
            }
            byte[] arr_b = byteBuffer0.array();
            return new ExifAttribute(9, arr_v.length, arr_b);
        }

        public static ExifAttribute f(Rational exifInterface$Rational0, ByteOrder byteOrder0) {
            return ExifAttribute.g(new Rational[]{exifInterface$Rational0}, byteOrder0);
        }

        public static ExifAttribute g(Rational[] arr_exifInterface$Rational, ByteOrder byteOrder0) {
            ByteBuffer byteBuffer0 = ByteBuffer.wrap(new byte[ExifInterface.H6[10] * arr_exifInterface$Rational.length]);
            byteBuffer0.order(byteOrder0);
            for(int v = 0; v < arr_exifInterface$Rational.length; ++v) {
                Rational exifInterface$Rational0 = arr_exifInterface$Rational[v];
                byteBuffer0.putInt(((int)exifInterface$Rational0.a));
                byteBuffer0.putInt(((int)exifInterface$Rational0.b));
            }
            byte[] arr_b = byteBuffer0.array();
            return new ExifAttribute(10, arr_exifInterface$Rational.length, arr_b);
        }

        public static ExifAttribute h(String s) {
            byte[] arr_b = (s + '\u0000').getBytes(ExifInterface.j7);
            return new ExifAttribute(2, arr_b.length, arr_b);
        }

        public static ExifAttribute i(long v, ByteOrder byteOrder0) {
            return ExifAttribute.j(new long[]{v}, byteOrder0);
        }

        public static ExifAttribute j(long[] arr_v, ByteOrder byteOrder0) {
            ByteBuffer byteBuffer0 = ByteBuffer.wrap(new byte[ExifInterface.H6[4] * arr_v.length]);
            byteBuffer0.order(byteOrder0);
            for(int v = 0; v < arr_v.length; ++v) {
                byteBuffer0.putInt(((int)arr_v[v]));
            }
            byte[] arr_b = byteBuffer0.array();
            return new ExifAttribute(4, arr_v.length, arr_b);
        }

        public static ExifAttribute k(Rational exifInterface$Rational0, ByteOrder byteOrder0) {
            return ExifAttribute.l(new Rational[]{exifInterface$Rational0}, byteOrder0);
        }

        public static ExifAttribute l(Rational[] arr_exifInterface$Rational, ByteOrder byteOrder0) {
            ByteBuffer byteBuffer0 = ByteBuffer.wrap(new byte[ExifInterface.H6[5] * arr_exifInterface$Rational.length]);
            byteBuffer0.order(byteOrder0);
            for(int v = 0; v < arr_exifInterface$Rational.length; ++v) {
                Rational exifInterface$Rational0 = arr_exifInterface$Rational[v];
                byteBuffer0.putInt(((int)exifInterface$Rational0.a));
                byteBuffer0.putInt(((int)exifInterface$Rational0.b));
            }
            byte[] arr_b = byteBuffer0.array();
            return new ExifAttribute(5, arr_exifInterface$Rational.length, arr_b);
        }

        public static ExifAttribute m(int v, ByteOrder byteOrder0) {
            return ExifAttribute.n(new int[]{v}, byteOrder0);
        }

        public static ExifAttribute n(int[] arr_v, ByteOrder byteOrder0) {
            ByteBuffer byteBuffer0 = ByteBuffer.wrap(new byte[ExifInterface.H6[3] * arr_v.length]);
            byteBuffer0.order(byteOrder0);
            for(int v = 0; v < arr_v.length; ++v) {
                byteBuffer0.putShort(((short)arr_v[v]));
            }
            byte[] arr_b = byteBuffer0.array();
            return new ExifAttribute(3, arr_v.length, arr_b);
        }

        public double o(ByteOrder byteOrder0) {
            Object object0 = this.r(byteOrder0);
            if(object0 == null) {
                throw new NumberFormatException("NULL can\'t be converted to a double value");
            }
            if(object0 instanceof String) {
                return Double.parseDouble(((String)object0));
            }
            if(object0 instanceof long[]) {
                if(((long[])object0).length != 1) {
                    throw new NumberFormatException("There are more than one component");
                }
                return (double)((long[])object0)[0];
            }
            if(object0 instanceof int[]) {
                if(((int[])object0).length != 1) {
                    throw new NumberFormatException("There are more than one component");
                }
                return (double)((int[])object0)[0];
            }
            if(object0 instanceof double[]) {
                if(((double[])object0).length != 1) {
                    throw new NumberFormatException("There are more than one component");
                }
                return ((double[])object0)[0];
            }
            if(!(object0 instanceof Rational[])) {
                throw new NumberFormatException("Couldn\'t find a double value");
            }
            if(((Rational[])object0).length != 1) {
                throw new NumberFormatException("There are more than one component");
            }
            return ((Rational[])object0)[0].a();
        }

        public int p(ByteOrder byteOrder0) {
            Object object0 = this.r(byteOrder0);
            if(object0 == null) {
                throw new NumberFormatException("NULL can\'t be converted to a integer value");
            }
            if(object0 instanceof String) {
                return Integer.parseInt(((String)object0));
            }
            if(object0 instanceof long[]) {
                if(((long[])object0).length != 1) {
                    throw new NumberFormatException("There are more than one component");
                }
                return (int)((long[])object0)[0];
            }
            if(!(object0 instanceof int[])) {
                throw new NumberFormatException("Couldn\'t find a integer value");
            }
            if(((int[])object0).length != 1) {
                throw new NumberFormatException("There are more than one component");
            }
            return ((int[])object0)[0];
        }

        public String q(ByteOrder byteOrder0) {
            Object object0 = this.r(byteOrder0);
            if(object0 == null) {
                return null;
            }
            if(object0 instanceof String) {
                return (String)object0;
            }
            StringBuilder stringBuilder0 = new StringBuilder();
            int v = 0;
            if(object0 instanceof long[]) {
                while(v < ((long[])object0).length) {
                    stringBuilder0.append(((long[])object0)[v]);
                    ++v;
                    if(v != ((long[])object0).length) {
                        stringBuilder0.append(",");
                    }
                }
                return stringBuilder0.toString();
            }
            if(object0 instanceof int[]) {
                while(v < ((int[])object0).length) {
                    stringBuilder0.append(((int[])object0)[v]);
                    ++v;
                    if(v != ((int[])object0).length) {
                        stringBuilder0.append(",");
                    }
                }
                return stringBuilder0.toString();
            }
            if(object0 instanceof double[]) {
                while(v < ((double[])object0).length) {
                    stringBuilder0.append(((double[])object0)[v]);
                    ++v;
                    if(v != ((double[])object0).length) {
                        stringBuilder0.append(",");
                    }
                }
                return stringBuilder0.toString();
            }
            if(object0 instanceof Rational[]) {
                while(v < ((Rational[])object0).length) {
                    stringBuilder0.append(((Rational[])object0)[v].a);
                    stringBuilder0.append('/');
                    stringBuilder0.append(((Rational[])object0)[v].b);
                    ++v;
                    if(v != ((Rational[])object0).length) {
                        stringBuilder0.append(",");
                    }
                }
                return stringBuilder0.toString();
            }
            return null;
        }

        Object r(ByteOrder byteOrder0) {
            double[] arr_f1;
            double[] arr_f;
            Rational[] arr_exifInterface$Rational1;
            int[] arr_v3;
            int[] arr_v2;
            Rational[] arr_exifInterface$Rational;
            long[] arr_v1;
            int[] arr_v;
            String s2;
            String s1;
            String s;
            byte[] arr_b;
            ByteOrderedDataInputStream exifInterface$ByteOrderedDataInputStream1;
            ByteOrderedDataInputStream exifInterface$ByteOrderedDataInputStream0;
            int v = 0;
            try {
                exifInterface$ByteOrderedDataInputStream0 = null;
                exifInterface$ByteOrderedDataInputStream1 = null;
                exifInterface$ByteOrderedDataInputStream1 = new ByteOrderedDataInputStream(this.d);
                goto label_7;
            }
            catch(IOException iOException0) {
                goto label_131;
            }
            catch(Throwable throwable0) {
            }
            goto label_140;
            try {
            label_7:
                exifInterface$ByteOrderedDataInputStream1.e(byteOrder0);
                switch(this.a) {
                    case 3: {
                        goto label_55;
                    }
                    case 4: {
                        goto label_65;
                    }
                    case 5: {
                        goto label_75;
                    }
                    case 1: 
                    case 6: {
                        goto label_14;
                    }
                    case 2: 
                    case 7: {
                        goto label_30;
                    }
                    case 8: {
                        goto label_85;
                    }
                    case 9: {
                        goto label_95;
                    }
                    case 10: {
                        goto label_105;
                    }
                    case 11: {
                        goto label_115;
                    }
                    case 12: {
                        goto label_125;
                    }
                }
            }
            catch(IOException iOException0) {
                goto label_131;
            }
            catch(Throwable throwable0) {
                goto label_139;
            }
            try {
                exifInterface$ByteOrderedDataInputStream1.close();
            }
            catch(IOException iOException1) {
                Log.e("ExifInterface", "IOException occurred while closing InputStream", iOException1);
            }
            return null;
            try {
            label_14:
                arr_b = this.d;
                if(arr_b.length == 1) {
                    int v1 = arr_b[0];
                    if(v1 >= 0 && v1 <= 1) {
                        s = new String(new char[]{((char)(v1 + 0x30))});
                        goto label_19;
                    }
                }
                goto label_24;
            }
            catch(IOException iOException0) {
                goto label_131;
            }
            catch(Throwable throwable0) {
                goto label_139;
            }
            try {
            label_19:
                exifInterface$ByteOrderedDataInputStream1.close();
            }
            catch(IOException iOException2) {
                Log.e("ExifInterface", "IOException occurred while closing InputStream", iOException2);
            }
            return s;
            try {
            label_24:
                s1 = new String(arr_b, ExifInterface.j7);
            }
            catch(IOException iOException0) {
                goto label_131;
            }
            catch(Throwable throwable0) {
                goto label_139;
            }
            try {
                exifInterface$ByteOrderedDataInputStream1.close();
            }
            catch(IOException iOException3) {
                Log.e("ExifInterface", "IOException occurred while closing InputStream", iOException3);
            }
            return s1;
            try {
            label_30:
                if(this.b >= ExifInterface.I6.length) {
                    for(int v2 = 0; true; ++v2) {
                        byte[] arr_b1 = ExifInterface.I6;
                        if(v2 >= arr_b1.length) {
                            v = arr_b1.length;
                            break;
                        }
                        if(this.d[v2] != arr_b1[v2]) {
                            break;
                        }
                    }
                }
                StringBuilder stringBuilder0 = new StringBuilder();
                while(v < this.b) {
                    int v3 = this.d[v];
                    if(v3 == 0) {
                        break;
                    }
                    if(v3 >= 0x20) {
                        stringBuilder0.append(((char)v3));
                    }
                    else {
                        stringBuilder0.append('?');
                    }
                    ++v;
                }
                s2 = stringBuilder0.toString();
            }
            catch(IOException iOException0) {
                goto label_131;
            }
            catch(Throwable throwable0) {
                goto label_139;
            }
            try {
                exifInterface$ByteOrderedDataInputStream1.close();
            }
            catch(IOException iOException4) {
                Log.e("ExifInterface", "IOException occurred while closing InputStream", iOException4);
            }
            return s2;
            try {
            label_55:
                arr_v = new int[this.b];
                while(v < this.b) {
                    arr_v[v] = exifInterface$ByteOrderedDataInputStream1.readUnsignedShort();
                    ++v;
                }
            }
            catch(IOException iOException0) {
                goto label_131;
            }
            catch(Throwable throwable0) {
                goto label_139;
            }
            try {
                exifInterface$ByteOrderedDataInputStream1.close();
            }
            catch(IOException iOException5) {
                Log.e("ExifInterface", "IOException occurred while closing InputStream", iOException5);
            }
            return arr_v;
            try {
            label_65:
                arr_v1 = new long[this.b];
                while(v < this.b) {
                    arr_v1[v] = exifInterface$ByteOrderedDataInputStream1.c();
                    ++v;
                }
            }
            catch(IOException iOException0) {
                goto label_131;
            }
            catch(Throwable throwable0) {
                goto label_139;
            }
            try {
                exifInterface$ByteOrderedDataInputStream1.close();
            }
            catch(IOException iOException6) {
                Log.e("ExifInterface", "IOException occurred while closing InputStream", iOException6);
            }
            return arr_v1;
            try {
            label_75:
                arr_exifInterface$Rational = new Rational[this.b];
                while(v < this.b) {
                    arr_exifInterface$Rational[v] = new Rational(exifInterface$ByteOrderedDataInputStream1.c(), exifInterface$ByteOrderedDataInputStream1.c());
                    ++v;
                }
            }
            catch(IOException iOException0) {
                goto label_131;
            }
            catch(Throwable throwable0) {
                goto label_139;
            }
            try {
                exifInterface$ByteOrderedDataInputStream1.close();
            }
            catch(IOException iOException7) {
                Log.e("ExifInterface", "IOException occurred while closing InputStream", iOException7);
            }
            return arr_exifInterface$Rational;
            try {
            label_85:
                arr_v2 = new int[this.b];
                while(v < this.b) {
                    arr_v2[v] = exifInterface$ByteOrderedDataInputStream1.readShort();
                    ++v;
                }
            }
            catch(IOException iOException0) {
                goto label_131;
            }
            catch(Throwable throwable0) {
                goto label_139;
            }
            try {
                exifInterface$ByteOrderedDataInputStream1.close();
            }
            catch(IOException iOException8) {
                Log.e("ExifInterface", "IOException occurred while closing InputStream", iOException8);
            }
            return arr_v2;
            try {
            label_95:
                arr_v3 = new int[this.b];
                while(v < this.b) {
                    arr_v3[v] = exifInterface$ByteOrderedDataInputStream1.readInt();
                    ++v;
                }
            }
            catch(IOException iOException0) {
                goto label_131;
            }
            catch(Throwable throwable0) {
                goto label_139;
            }
            try {
                exifInterface$ByteOrderedDataInputStream1.close();
            }
            catch(IOException iOException9) {
                Log.e("ExifInterface", "IOException occurred while closing InputStream", iOException9);
            }
            return arr_v3;
            try {
            label_105:
                arr_exifInterface$Rational1 = new Rational[this.b];
                while(v < this.b) {
                    arr_exifInterface$Rational1[v] = new Rational(((long)exifInterface$ByteOrderedDataInputStream1.readInt()), ((long)exifInterface$ByteOrderedDataInputStream1.readInt()));
                    ++v;
                }
            }
            catch(IOException iOException0) {
                goto label_131;
            }
            catch(Throwable throwable0) {
                goto label_139;
            }
            try {
                exifInterface$ByteOrderedDataInputStream1.close();
            }
            catch(IOException iOException10) {
                Log.e("ExifInterface", "IOException occurred while closing InputStream", iOException10);
            }
            return arr_exifInterface$Rational1;
            try {
            label_115:
                arr_f = new double[this.b];
                while(v < this.b) {
                    arr_f[v] = (double)exifInterface$ByteOrderedDataInputStream1.readFloat();
                    ++v;
                }
            }
            catch(IOException iOException0) {
                goto label_131;
            }
            catch(Throwable throwable0) {
                goto label_139;
            }
            try {
                exifInterface$ByteOrderedDataInputStream1.close();
            }
            catch(IOException iOException11) {
                Log.e("ExifInterface", "IOException occurred while closing InputStream", iOException11);
            }
            return arr_f;
            try {
                try {
                label_125:
                    arr_f1 = new double[this.b];
                    while(true) {
                        if(v >= this.b) {
                            goto label_146;
                        }
                        arr_f1[v] = exifInterface$ByteOrderedDataInputStream1.readDouble();
                        ++v;
                    }
                }
                catch(IOException iOException0) {
                }
            label_131:
                Log.w("ExifInterface", "IOException occurred during reading a value", iOException0);
                if(exifInterface$ByteOrderedDataInputStream1 != null) {
                    goto label_133;
                }
                return null;
            }
            catch(Throwable throwable0) {
                goto label_139;
            }
            try {
            label_133:
                exifInterface$ByteOrderedDataInputStream1.close();
                return null;
            }
            catch(IOException iOException12) {
                Log.e("ExifInterface", "IOException occurred while closing InputStream", iOException12);
            }
            return null;
        label_139:
            exifInterface$ByteOrderedDataInputStream0 = exifInterface$ByteOrderedDataInputStream1;
        label_140:
            if(exifInterface$ByteOrderedDataInputStream0 != null) {
                try {
                    exifInterface$ByteOrderedDataInputStream0.close();
                }
                catch(IOException iOException13) {
                    Log.e("ExifInterface", "IOException occurred while closing InputStream", iOException13);
                }
            }
            throw throwable0;
            try {
            label_146:
                exifInterface$ByteOrderedDataInputStream1.close();
            }
            catch(IOException iOException14) {
                Log.e("ExifInterface", "IOException occurred while closing InputStream", iOException14);
            }
            return arr_f1;
        }

        public int s() {
            return ExifInterface.H6[this.a] * this.b;
        }

        @Override
        public String toString() {
            return "(" + ExifInterface.G6[this.a] + ", data length:" + this.d.length + ")";
        }
    }

    @RestrictTo({Scope.a})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ExifStreamType {
    }

    static class ExifTag {
        public final int a;
        public final String b;
        public final int c;
        public final int d;

        ExifTag(String s, int v, int v1) {
            this.b = s;
            this.a = v;
            this.c = v1;
            this.d = -1;
        }

        ExifTag(String s, int v, int v1, int v2) {
            this.b = s;
            this.a = v;
            this.c = v1;
            this.d = v2;
        }

        boolean a(int v) {
            int v1 = this.c;
            if(v1 != 7 && v != 7 && v1 != v) {
                int v2 = this.d;
                if(v2 == v || (v1 == 4 || v2 == 4) && v == 3) {
                    return true;
                }
                return v1 != 9 && v2 != 9 || v != 8 ? (v1 == 12 || v2 == 12) && v == 11 : true;
            }
            return true;
        }
    }

    @RestrictTo({Scope.a})
    @Retention(RetentionPolicy.SOURCE)
    public @interface IfdType {
    }

    static class Rational {
        public final long a;
        public final long b;

        Rational(double f) {
            this(((long)(f * 10000.0)), 10000L);
        }

        Rational(long v, long v1) {
            if(v1 == 0L) {
                this.a = 0L;
                this.b = 1L;
                return;
            }
            this.a = v;
            this.b = v1;
        }

        public double a() {
            return ((double)this.a) / ((double)this.b);
        }

        @Override
        public String toString() {
            return this.a + "/" + this.b;
        }
    }

    static class SeekableByteOrderedDataInputStream extends ByteOrderedDataInputStream {
        SeekableByteOrderedDataInputStream(InputStream inputStream0) throws IOException {
            super(inputStream0);
            if(!inputStream0.markSupported()) {
                throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
            }
            this.a.mark(0x7FFFFFFF);
        }

        SeekableByteOrderedDataInputStream(byte[] arr_b) throws IOException {
            super(arr_b);
            this.a.mark(0x7FFFFFFF);
        }

        public void i(long v) throws IOException {
            int v1 = this.b;
            if(((long)v1) > v) {
                this.b = 0;
                this.a.reset();
            }
            else {
                v -= (long)v1;
            }
            this.f(((int)v));
        }
    }

    public static final String A = "Compression";
    public static final String A0 = "OECF";
    public static final String A1 = "GPSLongitudeRef";
    private static final String A2 = "CameraSettingsIFDPointer";
    public static final short A3 = 9;
    public static final short A4 = 2;
    public static final int A5 = 0;
    private static final int A6 = 9;
    private static final byte A7 = -49;
    public static final String B = "PhotometricInterpretation";
    public static final String B0 = "SensitivityType";
    public static final String B1 = "GPSLongitude";
    private static final String B2 = "ImageProcessingIFDPointer";
    public static final short B3 = 10;
    public static final short B4 = 3;
    public static final int B5 = 1;
    private static final int B6 = 10;
    private static final byte B7 = -38;
    public static final String C = "Orientation";
    public static final String C0 = "StandardOutputSensitivity";
    public static final String C1 = "GPSAltitudeRef";
    private static final int C2 = 0x200;
    public static final short C3 = 11;
    public static final short C4 = 4;
    private static final int C5 = 5000;
    private static final int C6 = 11;
    static final byte C7 = (byte)0xE1;
    public static final String D = "SamplesPerPixel";
    public static final String D0 = "RecommendedExposureIndex";
    public static final String D1 = "GPSAltitude";
    public static final int D2 = 0;
    public static final short D3 = 12;
    public static final short D4 = 0;
    static final byte[] D5 = null;
    private static final int D6 = 12;
    private static final byte D7 = -2;
    public static final String E = "PlanarConfiguration";
    public static final String E0 = "ISOSpeed";
    public static final String E1 = "GPSTimeStamp";
    public static final int E2 = 1;
    public static final short E3 = 13;
    public static final short E4 = 1;
    private static final String E5 = "FUJIFILMCCD-RAW";
    private static final int E6 = 13;
    static final byte E7 = -39;
    public static final String F = "YCbCrSubSampling";
    public static final String F0 = "ISOSpeedLatitudeyyy";
    public static final String F1 = "GPSSatellites";
    public static final int F2 = 2;
    public static final short F3 = 14;
    public static final short F4 = 2;
    private static final int F5 = 84;
    private static final int F6 = 0x2000;
    static final int F7 = 0;
    public static final String G = "YCbCrPositioning";
    public static final String G0 = "ISOSpeedLatitudezzz";
    public static final String G1 = "GPSStatus";
    public static final int G2 = 3;
    public static final short G3 = 15;
    public static final short G4 = 0;
    private static final byte[] G5 = null;
    static final String[] G6 = null;
    static final int G7 = 1;
    public static final String H = "XResolution";
    public static final String H0 = "ShutterSpeedValue";
    public static final String H1 = "GPSMeasureMode";
    public static final int H2 = 4;
    public static final short H3 = 16;
    public static final short H4 = 0;
    private static final byte[] H5 = null;
    static final int[] H6 = null;
    static final int H7 = 2;
    public static final String I = "YResolution";
    public static final String I0 = "ApertureValue";
    public static final String I1 = "GPSDOP";
    public static final int I2 = 5;
    public static final short I3 = 17;
    public static final short I4 = 0;
    private static final byte[] I5 = null;
    static final byte[] I6 = null;
    static final int I7 = 3;
    public static final String J = "ResolutionUnit";
    public static final String J0 = "BrightnessValue";
    public static final String J1 = "GPSSpeedRef";
    public static final int J2 = 6;
    public static final short J3 = 18;
    public static final short J4 = 0;
    private static final short J5 = 20306;
    private static final ExifTag[] J6 = null;
    static final int J7 = 4;
    public static final String K = "StripOffsets";
    public static final String K0 = "ExposureBiasValue";
    public static final String K1 = "GPSSpeed";
    public static final int K2 = 7;
    public static final short K3 = 19;
    public static final short K4 = 1;
    private static final short K5 = 21330;
    private static final ExifTag[] K6 = null;
    static final int K7 = 5;
    public static final String L = "RowsPerStrip";
    public static final String L0 = "MaxApertureValue";
    public static final String L1 = "GPSTrackRef";
    public static final int L2 = 8;
    public static final short L3 = 20;
    public static final short L4 = 2;
    private static final byte[] L5 = null;
    private static final ExifTag[] L6 = null;
    static final int L7 = 6;
    public static final String M = "StripByteCounts";
    public static final String M0 = "SubjectDistance";
    public static final String M1 = "GPSTrack";
    private static final List M2 = null;
    public static final short M3 = 21;
    public static final short M4 = 0;
    private static final byte[] M5 = null;
    private static final ExifTag[] M6 = null;
    static final int M7 = 7;
    public static final String N = "JPEGInterchangeFormat";
    public static final String N0 = "MeteringMode";
    public static final String N1 = "GPSImgDirectionRef";
    private static final List N2 = null;
    public static final short N3 = 22;
    public static final short N4 = 1;
    private static final int N5 = 8;
    private static final ExifTag[] N6 = null;
    static final int N7 = 8;
    public static final String O = "JPEGInterchangeFormatLength";
    public static final String O0 = "LightSource";
    public static final String O1 = "GPSImgDirection";
    public static final short O2 = 1;
    public static final short O3 = 23;
    public static final short O4 = 2;
    private static final int O5 = 12;
    private static final ExifTag O6 = null;
    static final int O7 = 9;
    public static final String P = "TransferFunction";
    public static final String P0 = "Flash";
    public static final String P1 = "GPSMapDatum";
    public static final short P2 = 2;
    public static final short P3 = 24;
    public static final short P4 = 3;
    private static final short P5 = 85;
    private static final ExifTag[] P6 = null;
    static final int P7 = 10;
    public static final String Q = "WhitePoint";
    public static final String Q0 = "SubjectArea";
    public static final String Q1 = "GPSDestLatitudeRef";
    public static final short Q2 = 1;
    public static final short Q3 = 0xFF;
    public static final String Q4 = "N";
    private static final String Q5 = "PENTAX";
    private static final ExifTag[] Q6 = null;
    static final int Q7 = 11;
    public static final String R = "PrimaryChromaticities";
    public static final String R0 = "FocalLength";
    public static final String R1 = "GPSDestLatitude";
    public static final short R2 = 2;
    public static final short R3 = 1;
    public static final String R4 = "S";
    private static final int R5 = 6;
    private static final ExifTag[] R6 = null;
    static final int R7 = 12;
    public static final String S = "YCbCrCoefficients";
    public static final String S0 = "FlashEnergy";
    public static final String S1 = "GPSDestLongitudeRef";
    public static final short S2 = 2;
    public static final short S3 = 4;
    public static final String S4 = "E";
    private static final byte[] S5 = null;
    private static final ExifTag[] S6 = null;
    static final int S7 = 13;
    public static final String T = "ReferenceBlackWhite";
    public static final String T0 = "SpatialFrequencyResponse";
    public static final String T1 = "GPSDestLongitude";
    public static final short T2 = 3;
    public static final short T3 = 6;
    public static final String T4 = "W";
    private static final byte[] T5 = null;
    static final int T6 = 0;
    static final int T7 = 14;
    public static final String U = "DateTime";
    public static final String U0 = "FocalPlaneXResolution";
    public static final String U1 = "GPSDestBearingRef";
    public static final int U2 = 1;
    public static final short U3 = 8;
    public static final short U4 = 0;
    private static final byte[] U5 = null;
    private static final int U6 = 1;
    private static final Pattern U7 = null;
    public static final String V = "ImageDescription";
    public static final String V0 = "FocalPlaneYResolution";
    public static final String V1 = "GPSDestBearing";
    public static final int V2 = 0xFFFF;
    public static final short V3 = 16;
    public static final short V4 = 1;
    private static final byte[] V5 = null;
    private static final int V6 = 2;
    private static final Pattern V7 = null;
    public static final String W = "Make";
    public static final String W0 = "FocalPlaneResolutionUnit";
    public static final String W1 = "GPSDestDistanceRef";
    public static final short W2 = 0;
    public static final short W3 = 24;
    public static final String W4 = "A";
    private static final int W5 = 4;
    private static final int W6 = 3;
    private static final Pattern W7 = null;
    public static final String X = "Model";
    public static final String X0 = "SubjectLocation";
    public static final String X1 = "GPSDestDistance";
    public static final short X2 = 1;
    public static final short X3 = 0x20;
    public static final String X4 = "V";
    private static final int X5 = 4;
    static final int X6 = 4;
    private static final Pattern X7 = null;
    public static final String Y = "Software";
    public static final String Y0 = "ExposureIndex";
    public static final String Y1 = "GPSProcessingMethod";
    public static final short Y2 = 2;
    public static final short Y3 = 0x40;
    public static final String Y4 = "2";
    private static final byte[] Y5 = null;
    static final int Y6 = 5;
    private static final int Y7 = 19;
    public static final String Z = "Artist";
    public static final String Z0 = "SensingMethod";
    public static final String Z1 = "GPSAreaInformation";
    public static final short Z2 = 3;
    public static final short Z3 = 1;
    public static final String Z4 = "3";
    private static final byte[] Z5 = null;
    private static final int Z6 = 6;
    private String a;
    public static final String a0 = "Copyright";
    public static final String a1 = "FileSource";
    public static final String a2 = "GPSDateStamp";
    public static final short a3 = 4;
    public static final short a4 = 2;
    public static final String a5 = "K";
    private static final int a6 = 4;
    private static final int a7 = 7;
    private FileDescriptor b;
    public static final String b0 = "ExifVersion";
    public static final String b1 = "SceneType";
    public static final String b2 = "GPSDifferential";
    public static final short b3 = 5;
    public static final short b4 = 3;
    public static final String b5 = "M";
    private static final byte[] b6 = null;
    private static final int b7 = 8;
    private AssetManager.AssetInputStream c;
    public static final String c0 = "FlashpixVersion";
    public static final String c1 = "CFAPattern";
    public static final String c2 = "GPSHPositioningError";
    public static final short c3 = 6;
    public static final short c4 = 4;
    public static final String c5 = "N";
    private static final byte[] c6 = null;
    private static final int c7 = 9;
    private int d;
    public static final String d0 = "ColorSpace";
    public static final String d1 = "CustomRendered";
    public static final String d2 = "InteroperabilityIndex";
    public static final short d3 = 7;
    public static final short d4 = 5;
    public static final String d5 = "T";
    private static final byte d6 = 0x2F;
    static final ExifTag[][] d7 = null;
    private boolean e;
    public static final String e0 = "Gamma";
    public static final String e1 = "ExposureMode";
    public static final String e2 = "ThumbnailImageLength";
    public static final short e3 = 8;
    public static final short e4 = 7;
    public static final String e5 = "M";
    private static final byte[] e6 = null;
    private static final ExifTag[] e7 = null;
    private final HashMap[] f;
    public static final String f0 = "PixelXDimension";
    public static final String f1 = "WhiteBalance";
    public static final String f2 = "ThumbnailImageWidth";
    public static final short f3 = 0;
    public static final short f4 = 8;
    public static final String f5 = "K";
    private static final byte[] f6 = null;
    private static final HashMap[] f7 = null;
    private Set g;
    public static final String g0 = "PixelYDimension";
    public static final String g1 = "DigitalZoomRatio";
    @RestrictTo({Scope.a})
    public static final String g2 = "ThumbnailOrientation";
    public static final short g3 = 1;
    public static final short g4 = 0;
    public static final String g5 = "M";
    private static final byte[] g6 = null;
    private static final HashMap[] g7 = null;
    private ByteOrder h;
    public static final String h0 = "ComponentsConfiguration";
    public static final String h1 = "FocalLengthIn35mmFilm";
    public static final String h2 = "DNGVersion";
    public static final short h3 = 2;
    public static final short h4 = 1;
    public static final String h5 = "N";
    private static final byte[] h6 = null;
    private static final HashSet h7 = null;
    private boolean i;
    public static final String i0 = "CompressedBitsPerPixel";
    public static final String i1 = "SceneCaptureType";
    public static final String i2 = "DefaultCropSize";
    public static final short i3 = 3;
    public static final short i4 = 2;
    public static final short i5 = 0;
    private static final byte[] i6 = null;
    private static final HashMap i7 = null;
    private boolean j;
    public static final String j0 = "MakerNote";
    public static final String j1 = "GainControl";
    public static final String j2 = "ThumbnailImage";
    public static final short j3 = 4;
    public static final short j4 = 3;
    public static final short j5 = 1;
    private static final int j6 = 10;
    static final Charset j7 = null;
    private boolean k;
    public static final String k0 = "UserComment";
    public static final String k1 = "Contrast";
    public static final String k2 = "PreviewImageStart";
    public static final short k3 = 5;
    public static final short k4 = 1;
    public static final int k5 = 1;
    private static final int k6 = 4;
    static final byte[] k7 = null;
    private int l;
    public static final String l0 = "RelatedSoundFile";
    public static final String l1 = "Saturation";
    public static final String l2 = "PreviewImageLength";
    public static final short l3 = 6;
    public static final short l4 = 0;
    public static final int l5 = 2;
    private static final int l6 = 4;
    private static final byte[] l7 = null;
    private int m;
    public static final String m0 = "DateTimeOriginal";
    public static final String m1 = "Sharpness";
    public static final String m2 = "AspectFrame";
    public static final short m3 = 7;
    public static final short m4 = 1;
    public static final int m5 = 6;
    private static SimpleDateFormat m6 = null;
    static final byte m7 = -1;
    private byte[] n;
    public static final String n0 = "DateTimeDigitized";
    public static final String n1 = "DeviceSettingDescription";
    public static final String n2 = "SensorBottomBorder";
    public static final short n3 = 0;
    public static final short n4 = 0;
    public static final int n5 = 7;
    private static SimpleDateFormat n6 = null;
    private static final byte n7 = -40;
    private int o;
    public static final String o0 = "OffsetTime";
    public static final String o1 = "SubjectDistanceRange";
    public static final String o2 = "SensorLeftBorder";
    public static final short o3 = 1;
    public static final short o4 = 1;
    public static final int o5 = 8;
    static final short o6 = 0x4949;
    private static final byte o7 = (byte)0xC0;
    private int p;
    public static final String p0 = "OffsetTimeOriginal";
    public static final String p1 = "ImageUniqueID";
    public static final String p2 = "SensorRightBorder";
    public static final short p3 = 2;
    public static final short p4 = 2;
    public static final int p5 = 0x8005;
    static final short p6 = 0x4D4D;
    private static final byte p7 = (byte)0xC1;
    private int q;
    public static final String q0 = "OffsetTimeDigitized";
    @Deprecated
    public static final String q1 = "CameraOwnerName";
    public static final String q2 = "SensorTopBorder";
    public static final short q3 = 3;
    @Deprecated
    public static final int q4 = 0;
    public static final int q5 = 0x884C;
    static final byte q6 = 42;
    private static final byte q7 = -62;
    private int r;
    public static final String r0 = "SubSecTime";
    public static final String r1 = "CameraOwnerName";
    public static final String r2 = "ISO";
    public static final short r3 = 4;
    @Deprecated
    public static final int r4 = 1;
    public static final int[] r5 = null;
    private static final int r6 = 8;
    private static final byte r7 = -61;
    private int s;
    public static final String s0 = "SubSecTimeOriginal";
    public static final String s1 = "BodySerialNumber";
    public static final String s2 = "JpgFromRaw";
    public static final short s3 = 5;
    public static final short s4 = 0;
    public static final int[] s5 = null;
    private static final int s6 = 1;
    private static final byte s7 = -59;
    private boolean t;
    public static final String t0 = "SubSecTimeDigitized";
    public static final String t1 = "LensSpecification";
    public static final String t2 = "Xmp";
    public static final short t3 = 6;
    public static final short t4 = 1;
    public static final int[] t5 = null;
    private static final int t6 = 2;
    private static final byte t7 = -58;
    private boolean u;
    public static final String u0 = "ExposureTime";
    public static final String u1 = "LensMake";
    public static final String u2 = "NewSubfileType";
    public static final short u3 = 0xFF;
    public static final short u4 = 0;
    public static final int u5 = 0;
    private static final int u6 = 3;
    private static final byte u7 = -57;
    private static final String v = "ExifInterface";
    public static final String v0 = "FNumber";
    public static final String v1 = "LensModel";
    public static final String v2 = "SubfileType";
    public static final short v3 = 0;
    public static final short v4 = 1;
    public static final int v5 = 1;
    private static final int v6 = 4;
    private static final byte v7 = -55;
    private static final boolean w = false;
    public static final String w0 = "ExposureProgram";
    public static final String w1 = "LensSerialNumber";
    private static final String w2 = "ExifIFDPointer";
    public static final short w3 = 1;
    public static final short w4 = 2;
    public static final int w5 = 2;
    private static final int w6 = 5;
    private static final byte w7 = -54;
    public static final String x = "ImageWidth";
    public static final String x0 = "SpectralSensitivity";
    public static final String x1 = "GPSVersionID";
    private static final String x2 = "GPSInfoIFDPointer";
    public static final short x3 = 2;
    public static final short x4 = 3;
    public static final int x5 = 6;
    private static final int x6 = 6;
    private static final byte x7 = -53;
    public static final String y = "ImageLength";
    @Deprecated
    public static final String y0 = "ISOSpeedRatings";
    public static final String y1 = "GPSLatitudeRef";
    private static final String y2 = "InteroperabilityIFDPointer";
    public static final short y3 = 3;
    public static final short y4 = 0;
    public static final int y5 = 0;
    private static final int y6 = 7;
    private static final byte y7 = -51;
    public static final String z = "BitsPerSample";
    public static final String z0 = "PhotographicSensitivity";
    public static final String z1 = "GPSLatitude";
    private static final String z2 = "SubIFDPointer";
    public static final short z3 = 4;
    public static final short z4 = 1;
    public static final int z5 = 1;
    private static final int z6 = 8;
    private static final byte z7 = -50;

    static {
        ExifInterface.w = Log.isLoggable("ExifInterface", 3);
        ExifInterface.M2 = Arrays.asList(new Integer[]{1, 6, 3, 8});
        ExifInterface.N2 = Arrays.asList(new Integer[]{2, 7, 4, 5});
        ExifInterface.r5 = new int[]{8, 8, 8};
        ExifInterface.s5 = new int[]{4};
        ExifInterface.t5 = new int[]{8};
        ExifInterface.D5 = new byte[]{-1, -40, -1};
        ExifInterface.G5 = new byte[]{102, 0x74, 0x79, 0x70};
        ExifInterface.H5 = new byte[]{109, 105, 102, 49};
        ExifInterface.I5 = new byte[]{104, 101, 105, 99};
        ExifInterface.L5 = new byte[]{0x4F, 76, 89, 77, 80, 0};
        ExifInterface.M5 = new byte[]{0x4F, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        ExifInterface.S5 = new byte[]{(byte)0x89, 80, 78, 71, 13, 10, 26, 10};
        ExifInterface.T5 = new byte[]{101, 88, 73, 102};
        ExifInterface.U5 = new byte[]{73, 72, 68, 82};
        ExifInterface.V5 = new byte[]{73, 69, 78, 68};
        ExifInterface.Y5 = new byte[]{82, 73, 70, 70};
        ExifInterface.Z5 = new byte[]{87, 69, 66, 80};
        ExifInterface.b6 = new byte[]{69, 88, 73, 70};
        ExifInterface.c6 = new byte[]{-99, 1, 42};
        ExifInterface.e6 = "VP8X".getBytes(Charset.defaultCharset());
        ExifInterface.f6 = "VP8L".getBytes(Charset.defaultCharset());
        ExifInterface.g6 = "VP8 ".getBytes(Charset.defaultCharset());
        ExifInterface.h6 = "ANIM".getBytes(Charset.defaultCharset());
        ExifInterface.i6 = "ANMF".getBytes(Charset.defaultCharset());
        ExifInterface.G6 = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        ExifInterface.H6 = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        ExifInterface.I6 = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        ExifTag[] arr_exifInterface$ExifTag = {new ExifTag("NewSubfileType", 0xFE, 4), new ExifTag("SubfileType", 0xFF, 4), new ExifTag("ImageWidth", 0x100, 3, 4), new ExifTag("ImageLength", 0x101, 3, 4), new ExifTag("BitsPerSample", 0x102, 3), new ExifTag("Compression", 0x103, 3), new ExifTag("PhotometricInterpretation", 0x106, 3), new ExifTag("ImageDescription", 270, 2), new ExifTag("Make", 0x10F, 2), new ExifTag("Model", 0x110, 2), new ExifTag("StripOffsets", 273, 3, 4), new ExifTag("Orientation", 274, 3), new ExifTag("SamplesPerPixel", 277, 3), new ExifTag("RowsPerStrip", 278, 3, 4), new ExifTag("StripByteCounts", 279, 3, 4), new ExifTag("XResolution", 282, 5), new ExifTag("YResolution", 283, 5), new ExifTag("PlanarConfiguration", 284, 3), new ExifTag("ResolutionUnit", 296, 3), new ExifTag("TransferFunction", 301, 3), new ExifTag("Software", 305, 2), new ExifTag("DateTime", 306, 2), new ExifTag("Artist", 315, 2), new ExifTag("WhitePoint", 318, 5), new ExifTag("PrimaryChromaticities", 0x13F, 5), new ExifTag("SubIFDPointer", 330, 4), new ExifTag("JPEGInterchangeFormat", 0x201, 4), new ExifTag("JPEGInterchangeFormatLength", 0x202, 4), new ExifTag("YCbCrCoefficients", 529, 5), new ExifTag("YCbCrSubSampling", 530, 3), new ExifTag("YCbCrPositioning", 531, 3), new ExifTag("ReferenceBlackWhite", 532, 5), new ExifTag("Copyright", 0x8298, 2), new ExifTag("ExifIFDPointer", 0x8769, 4), new ExifTag("GPSInfoIFDPointer", 0x8825, 4), new ExifTag("SensorTopBorder", 4, 4), new ExifTag("SensorLeftBorder", 5, 4), new ExifTag("SensorBottomBorder", 6, 4), new ExifTag("SensorRightBorder", 7, 4), new ExifTag("ISO", 23, 3), new ExifTag("JpgFromRaw", 46, 7), new ExifTag("Xmp", 700, 1)};
        ExifInterface.J6 = arr_exifInterface$ExifTag;
        ExifTag[] arr_exifInterface$ExifTag1 = {new ExifTag("ExposureTime", 0x829A, 5), new ExifTag("FNumber", 0x829D, 5), new ExifTag("ExposureProgram", 34850, 3), new ExifTag("SpectralSensitivity", 0x8824, 2), new ExifTag("PhotographicSensitivity", 0x8827, 3), new ExifTag("OECF", 0x8828, 7), new ExifTag("SensitivityType", 0x8830, 3), new ExifTag("StandardOutputSensitivity", 0x8831, 4), new ExifTag("RecommendedExposureIndex", 0x8832, 4), new ExifTag("ISOSpeed", 0x8833, 4), new ExifTag("ISOSpeedLatitudeyyy", 0x8834, 4), new ExifTag("ISOSpeedLatitudezzz", 0x8835, 4), new ExifTag("ExifVersion", 0x9000, 2), new ExifTag("DateTimeOriginal", 0x9003, 2), new ExifTag("DateTimeDigitized", 0x9004, 2), new ExifTag("OffsetTime", 0x9010, 2), new ExifTag("OffsetTimeOriginal", 0x9011, 2), new ExifTag("OffsetTimeDigitized", 0x9012, 2), new ExifTag("ComponentsConfiguration", 0x9101, 7), new ExifTag("CompressedBitsPerPixel", 0x9102, 5), new ExifTag("ShutterSpeedValue", 0x9201, 10), new ExifTag("ApertureValue", 0x9202, 5), new ExifTag("BrightnessValue", 0x9203, 10), new ExifTag("ExposureBiasValue", 0x9204, 10), new ExifTag("MaxApertureValue", 0x9205, 5), new ExifTag("SubjectDistance", 0x9206, 5), new ExifTag("MeteringMode", 0x9207, 3), new ExifTag("LightSource", 0x9208, 3), new ExifTag("Flash", 0x9209, 3), new ExifTag("FocalLength", 0x920A, 5), new ExifTag("SubjectArea", 0x9214, 3), new ExifTag("MakerNote", 37500, 7), new ExifTag("UserComment", 37510, 7), new ExifTag("SubSecTime", 0x9290, 2), new ExifTag("SubSecTimeOriginal", 0x9291, 2), new ExifTag("SubSecTimeDigitized", 0x9292, 2), new ExifTag("FlashpixVersion", 0xA000, 7), new ExifTag("ColorSpace", 0xA001, 3), new ExifTag("PixelXDimension", 0xA002, 3, 4), new ExifTag("PixelYDimension", 0xA003, 3, 4), new ExifTag("RelatedSoundFile", 0xA004, 2), new ExifTag("InteroperabilityIFDPointer", 0xA005, 4), new ExifTag("FlashEnergy", 0xA20B, 5), new ExifTag("SpatialFrequencyResponse", 0xA20C, 7), new ExifTag("FocalPlaneXResolution", 0xA20E, 5), new ExifTag("FocalPlaneYResolution", 0xA20F, 5), new ExifTag("FocalPlaneResolutionUnit", 0xA210, 3), new ExifTag("SubjectLocation", 0xA214, 3), new ExifTag("ExposureIndex", 0xA215, 5), new ExifTag("SensingMethod", 0xA217, 3), new ExifTag("FileSource", 0xA300, 7), new ExifTag("SceneType", 0xA301, 7), new ExifTag("CFAPattern", 0xA302, 7), new ExifTag("CustomRendered", 0xA401, 3), new ExifTag("ExposureMode", 0xA402, 3), new ExifTag("WhiteBalance", 0xA403, 3), new ExifTag("DigitalZoomRatio", 0xA404, 5), new ExifTag("FocalLengthIn35mmFilm", 0xA405, 3), new ExifTag("SceneCaptureType", 0xA406, 3), new ExifTag("GainControl", 0xA407, 3), new ExifTag("Contrast", 0xA408, 3), new ExifTag("Saturation", 0xA409, 3), new ExifTag("Sharpness", 0xA40A, 3), new ExifTag("DeviceSettingDescription", 0xA40B, 7), new ExifTag("SubjectDistanceRange", 0xA40C, 3), new ExifTag("ImageUniqueID", 0xA420, 2), new ExifTag("CameraOwnerName", 0xA430, 2), new ExifTag("BodySerialNumber", 42033, 2), new ExifTag("LensSpecification", 42034, 5), new ExifTag("LensMake", 42035, 2), new ExifTag("LensModel", 42036, 2), new ExifTag("Gamma", 0xA500, 5), new ExifTag("DNGVersion", 50706, 1), new ExifTag("DefaultCropSize", 50720, 3, 4)};
        ExifInterface.K6 = arr_exifInterface$ExifTag1;
        ExifTag[] arr_exifInterface$ExifTag2 = {new ExifTag("GPSVersionID", 0, 1), new ExifTag("GPSLatitudeRef", 1, 2), new ExifTag("GPSLatitude", 2, 5, 10), new ExifTag("GPSLongitudeRef", 3, 2), new ExifTag("GPSLongitude", 4, 5, 10), new ExifTag("GPSAltitudeRef", 5, 1), new ExifTag("GPSAltitude", 6, 5), new ExifTag("GPSTimeStamp", 7, 5), new ExifTag("GPSSatellites", 8, 2), new ExifTag("GPSStatus", 9, 2), new ExifTag("GPSMeasureMode", 10, 2), new ExifTag("GPSDOP", 11, 5), new ExifTag("GPSSpeedRef", 12, 2), new ExifTag("GPSSpeed", 13, 5), new ExifTag("GPSTrackRef", 14, 2), new ExifTag("GPSTrack", 15, 5), new ExifTag("GPSImgDirectionRef", 16, 2), new ExifTag("GPSImgDirection", 17, 5), new ExifTag("GPSMapDatum", 18, 2), new ExifTag("GPSDestLatitudeRef", 19, 2), new ExifTag("GPSDestLatitude", 20, 5), new ExifTag("GPSDestLongitudeRef", 21, 2), new ExifTag("GPSDestLongitude", 22, 5), new ExifTag("GPSDestBearingRef", 23, 2), new ExifTag("GPSDestBearing", 24, 5), new ExifTag("GPSDestDistanceRef", 25, 2), new ExifTag("GPSDestDistance", 26, 5), new ExifTag("GPSProcessingMethod", 27, 7), new ExifTag("GPSAreaInformation", 28, 7), new ExifTag("GPSDateStamp", 29, 2), new ExifTag("GPSDifferential", 30, 3), new ExifTag("GPSHPositioningError", 0x1F, 5)};
        ExifInterface.L6 = arr_exifInterface$ExifTag2;
        ExifTag[] arr_exifInterface$ExifTag3 = {new ExifTag("InteroperabilityIndex", 1, 2)};
        ExifInterface.M6 = arr_exifInterface$ExifTag3;
        ExifTag[] arr_exifInterface$ExifTag4 = {new ExifTag("NewSubfileType", 0xFE, 4), new ExifTag("SubfileType", 0xFF, 4), new ExifTag("ThumbnailImageWidth", 0x100, 3, 4), new ExifTag("ThumbnailImageLength", 0x101, 3, 4), new ExifTag("BitsPerSample", 0x102, 3), new ExifTag("Compression", 0x103, 3), new ExifTag("PhotometricInterpretation", 0x106, 3), new ExifTag("ImageDescription", 270, 2), new ExifTag("Make", 0x10F, 2), new ExifTag("Model", 0x110, 2), new ExifTag("StripOffsets", 273, 3, 4), new ExifTag("ThumbnailOrientation", 274, 3), new ExifTag("SamplesPerPixel", 277, 3), new ExifTag("RowsPerStrip", 278, 3, 4), new ExifTag("StripByteCounts", 279, 3, 4), new ExifTag("XResolution", 282, 5), new ExifTag("YResolution", 283, 5), new ExifTag("PlanarConfiguration", 284, 3), new ExifTag("ResolutionUnit", 296, 3), new ExifTag("TransferFunction", 301, 3), new ExifTag("Software", 305, 2), new ExifTag("DateTime", 306, 2), new ExifTag("Artist", 315, 2), new ExifTag("WhitePoint", 318, 5), new ExifTag("PrimaryChromaticities", 0x13F, 5), new ExifTag("SubIFDPointer", 330, 4), new ExifTag("JPEGInterchangeFormat", 0x201, 4), new ExifTag("JPEGInterchangeFormatLength", 0x202, 4), new ExifTag("YCbCrCoefficients", 529, 5), new ExifTag("YCbCrSubSampling", 530, 3), new ExifTag("YCbCrPositioning", 531, 3), new ExifTag("ReferenceBlackWhite", 532, 5), new ExifTag("Copyright", 0x8298, 2), new ExifTag("ExifIFDPointer", 0x8769, 4), new ExifTag("GPSInfoIFDPointer", 0x8825, 4), new ExifTag("DNGVersion", 50706, 1), new ExifTag("DefaultCropSize", 50720, 3, 4)};
        ExifInterface.N6 = arr_exifInterface$ExifTag4;
        ExifInterface.O6 = new ExifTag("StripOffsets", 273, 3);
        ExifTag[] arr_exifInterface$ExifTag5 = {new ExifTag("ThumbnailImage", 0x100, 7), new ExifTag("CameraSettingsIFDPointer", 0x2020, 4), new ExifTag("ImageProcessingIFDPointer", 0x2040, 4)};
        ExifInterface.P6 = arr_exifInterface$ExifTag5;
        ExifTag[] arr_exifInterface$ExifTag6 = {new ExifTag("PreviewImageStart", 0x101, 4), new ExifTag("PreviewImageLength", 0x102, 4)};
        ExifInterface.Q6 = arr_exifInterface$ExifTag6;
        ExifTag[] arr_exifInterface$ExifTag7 = {new ExifTag("AspectFrame", 4371, 3)};
        ExifInterface.R6 = arr_exifInterface$ExifTag7;
        ExifTag[] arr_exifInterface$ExifTag8 = {new ExifTag("ColorSpace", 55, 3)};
        ExifInterface.S6 = arr_exifInterface$ExifTag8;
        ExifInterface.d7 = new ExifTag[][]{arr_exifInterface$ExifTag, arr_exifInterface$ExifTag1, arr_exifInterface$ExifTag2, arr_exifInterface$ExifTag3, arr_exifInterface$ExifTag4, arr_exifInterface$ExifTag, arr_exifInterface$ExifTag5, arr_exifInterface$ExifTag6, arr_exifInterface$ExifTag7, arr_exifInterface$ExifTag8};
        ExifInterface.e7 = new ExifTag[]{new ExifTag("SubIFDPointer", 330, 4), new ExifTag("ExifIFDPointer", 0x8769, 4), new ExifTag("GPSInfoIFDPointer", 0x8825, 4), new ExifTag("InteroperabilityIFDPointer", 0xA005, 4), new ExifTag("CameraSettingsIFDPointer", 0x2020, 1), new ExifTag("ImageProcessingIFDPointer", 0x2040, 1)};
        ExifInterface.f7 = new HashMap[10];
        ExifInterface.g7 = new HashMap[10];
        ExifInterface.h7 = new HashSet(Arrays.asList(new String[]{"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"}));
        ExifInterface.i7 = new HashMap();
        Charset charset0 = Charset.forName("US-ASCII");
        ExifInterface.j7 = charset0;
        ExifInterface.k7 = "Exif\u0000\u0000".getBytes(charset0);
        ExifInterface.l7 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charset0);
        Locale locale0 = Locale.US;
        SimpleDateFormat simpleDateFormat0 = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale0);
        ExifInterface.m6 = simpleDateFormat0;
        simpleDateFormat0.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale0);
        ExifInterface.n6 = simpleDateFormat1;
        simpleDateFormat1.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        for(int v = 0; true; ++v) {
            ExifTag[][] arr2_exifInterface$ExifTag = ExifInterface.d7;
            if(v >= arr2_exifInterface$ExifTag.length) {
                break;
            }
            ExifInterface.f7[v] = new HashMap();
            ExifInterface.g7[v] = new HashMap();
            ExifTag[] arr_exifInterface$ExifTag9 = arr2_exifInterface$ExifTag[v];
            for(int v1 = 0; v1 < arr_exifInterface$ExifTag9.length; ++v1) {
                ExifTag exifInterface$ExifTag0 = arr_exifInterface$ExifTag9[v1];
                ExifInterface.f7[v].put(exifInterface$ExifTag0.a, exifInterface$ExifTag0);
                ExifInterface.g7[v].put(exifInterface$ExifTag0.b, exifInterface$ExifTag0);
            }
        }
        ExifInterface.i7.put(ExifInterface.e7[0].a, 5);
        ExifInterface.i7.put(ExifInterface.e7[1].a, 1);
        ExifInterface.i7.put(ExifInterface.e7[2].a, 2);
        ExifInterface.i7.put(ExifInterface.e7[3].a, 3);
        ExifInterface.i7.put(ExifInterface.e7[4].a, 7);
        ExifInterface.i7.put(ExifInterface.e7[5].a, 8);
        ExifInterface.U7 = Pattern.compile(".*[1-9].*");
        ExifInterface.V7 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
        ExifInterface.W7 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
        ExifInterface.X7 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
    }

    public ExifInterface(@NonNull File file0) throws IOException {
        this.f = new HashMap[ExifInterface.d7.length];
        this.g = new HashSet(ExifInterface.d7.length);
        this.h = ByteOrder.BIG_ENDIAN;
        if(file0 == null) {
            throw new NullPointerException("file cannot be null");
        }
        this.O(file0.getAbsolutePath());
    }

    public ExifInterface(@NonNull FileDescriptor fileDescriptor0) throws IOException {
        Throwable throwable1;
        FileInputStream fileInputStream0;
        boolean z;
        this.f = new HashMap[ExifInterface.d7.length];
        this.g = new HashSet(ExifInterface.d7.length);
        this.h = ByteOrder.BIG_ENDIAN;
        if(fileDescriptor0 == null) {
            throw new NullPointerException("fileDescriptor cannot be null");
        }
        this.c = null;
        this.a = null;
        if(ExifInterface.X(fileDescriptor0)) {
            try {
                this.b = fileDescriptor0;
                fileDescriptor0 = Api21Impl.b(fileDescriptor0);
                z = true;
            }
            catch(Exception exception0) {
                throw new IOException("Failed to duplicate file descriptor", exception0);
            }
        }
        else {
            this.b = null;
            z = false;
        }
        try {
            fileInputStream0 = new FileInputStream(fileDescriptor0);
        }
        catch(Throwable throwable0) {
            fileInputStream0 = null;
            throwable1 = throwable0;
            goto label_25;
        }
        try {
            this.e0(fileInputStream0);
            goto label_29;
        }
        catch(Throwable throwable1) {
        }
    label_25:
        ExifInterfaceUtils.c(fileInputStream0);
        if(z) {
            ExifInterfaceUtils.b(fileDescriptor0);
        }
        throw throwable1;
    label_29:
        ExifInterfaceUtils.c(fileInputStream0);
        if(z) {
            ExifInterfaceUtils.b(fileDescriptor0);
        }
    }

    public ExifInterface(@NonNull InputStream inputStream0) throws IOException {
        this(inputStream0, 0);
    }

    public ExifInterface(@NonNull InputStream inputStream0, int v) throws IOException {
        this.f = new HashMap[ExifInterface.d7.length];
        this.g = new HashSet(ExifInterface.d7.length);
        this.h = ByteOrder.BIG_ENDIAN;
        if(inputStream0 == null) {
            throw new NullPointerException("inputStream cannot be null");
        }
        this.a = null;
        if(v == 1) {
            BufferedInputStream bufferedInputStream0 = new BufferedInputStream(inputStream0, ExifInterface.k7.length);
            if(!ExifInterface.P(bufferedInputStream0)) {
                Log.w("ExifInterface", "Given data does not follow the structure of an Exif-only data.");
                return;
            }
            this.e = true;
            this.c = null;
            this.b = null;
            inputStream0 = bufferedInputStream0;
        }
        else if(inputStream0 instanceof AssetManager.AssetInputStream) {
            this.c = (AssetManager.AssetInputStream)inputStream0;
            this.b = null;
        }
        else if(!(inputStream0 instanceof FileInputStream) || !ExifInterface.X(((FileInputStream)inputStream0).getFD())) {
            this.c = null;
            this.b = null;
        }
        else {
            this.c = null;
            this.b = ((FileInputStream)inputStream0).getFD();
        }
        this.e0(inputStream0);
    }

    public ExifInterface(@NonNull String s) throws IOException {
        this.f = new HashMap[ExifInterface.d7.length];
        this.g = new HashSet(ExifInterface.d7.length);
        this.h = ByteOrder.BIG_ENDIAN;
        if(s == null) {
            throw new NullPointerException("filename cannot be null");
        }
        this.O(s);
    }

    private void A(SeekableByteOrderedDataInputStream exifInterface$SeekableByteOrderedDataInputStream0) throws IOException {
        this.g0(exifInterface$SeekableByteOrderedDataInputStream0);
        this.k0(exifInterface$SeekableByteOrderedDataInputStream0, 0);
        this.C0(exifInterface$SeekableByteOrderedDataInputStream0, 0);
        this.C0(exifInterface$SeekableByteOrderedDataInputStream0, 5);
        this.C0(exifInterface$SeekableByteOrderedDataInputStream0, 4);
        this.D0();
        if(this.d == 8) {
            ExifAttribute exifInterface$ExifAttribute0 = (ExifAttribute)this.f[1].get("MakerNote");
            if(exifInterface$ExifAttribute0 != null) {
                SeekableByteOrderedDataInputStream exifInterface$SeekableByteOrderedDataInputStream1 = new SeekableByteOrderedDataInputStream(exifInterface$ExifAttribute0.d);
                exifInterface$SeekableByteOrderedDataInputStream1.e(this.h);
                exifInterface$SeekableByteOrderedDataInputStream1.f(6);
                this.k0(exifInterface$SeekableByteOrderedDataInputStream1, 9);
                ExifAttribute exifInterface$ExifAttribute1 = (ExifAttribute)this.f[9].get("ColorSpace");
                if(exifInterface$ExifAttribute1 != null) {
                    this.f[1].put("ColorSpace", exifInterface$ExifAttribute1);
                }
            }
        }
    }

    private static boolean A0(int v) {
        return v != 4 && v != 9 && v != 13 && v != 14;
    }

    public int B() {
        switch(this.l("Orientation", 1)) {
            case 3: 
            case 4: {
                return 180;
            }
            case 6: 
            case 7: {
                return 90;
            }
            case 5: 
            case 8: {
                return 270;
            }
            default: {
                return 0;
            }
        }
    }

    private void B0(int v, int v1) throws IOException {
        if(!this.f[v].isEmpty() && !this.f[v1].isEmpty()) {
            ExifAttribute exifInterface$ExifAttribute0 = (ExifAttribute)this.f[v].get("ImageLength");
            ExifAttribute exifInterface$ExifAttribute1 = (ExifAttribute)this.f[v].get("ImageWidth");
            ExifAttribute exifInterface$ExifAttribute2 = (ExifAttribute)this.f[v1].get("ImageLength");
            ExifAttribute exifInterface$ExifAttribute3 = (ExifAttribute)this.f[v1].get("ImageWidth");
            if(exifInterface$ExifAttribute0 != null && exifInterface$ExifAttribute1 != null) {
                if(exifInterface$ExifAttribute2 != null && exifInterface$ExifAttribute3 != null) {
                    int v2 = exifInterface$ExifAttribute0.p(this.h);
                    int v3 = exifInterface$ExifAttribute1.p(this.h);
                    if(v2 < exifInterface$ExifAttribute2.p(this.h) && v3 < exifInterface$ExifAttribute3.p(this.h)) {
                        HashMap hashMap0 = this.f[v];
                        this.f[v] = this.f[v1];
                        this.f[v1] = hashMap0;
                        return;
                    }
                }
                else if(ExifInterface.w) {
                    Log.d("ExifInterface", "Second image does not contain valid size information");
                    return;
                }
            }
            else if(ExifInterface.w) {
                Log.d("ExifInterface", "First image does not contain valid size information");
            }
            return;
        }
        if(ExifInterface.w) {
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        }
    }

    private void C(SeekableByteOrderedDataInputStream exifInterface$SeekableByteOrderedDataInputStream0) throws IOException {
        if(ExifInterface.w) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + exifInterface$SeekableByteOrderedDataInputStream0);
        }
        this.A(exifInterface$SeekableByteOrderedDataInputStream0);
        ExifAttribute exifInterface$ExifAttribute0 = (ExifAttribute)this.f[0].get("JpgFromRaw");
        if(exifInterface$ExifAttribute0 != null) {
            this.t(new ByteOrderedDataInputStream(exifInterface$ExifAttribute0.d), ((int)exifInterface$ExifAttribute0.c), 5);
        }
        ExifAttribute exifInterface$ExifAttribute1 = (ExifAttribute)this.f[0].get("ISO");
        if(exifInterface$ExifAttribute1 != null && ((ExifAttribute)this.f[1].get("PhotographicSensitivity")) == null) {
            this.f[1].put("PhotographicSensitivity", exifInterface$ExifAttribute1);
        }
    }

    private void C0(SeekableByteOrderedDataInputStream exifInterface$SeekableByteOrderedDataInputStream0, int v) throws IOException {
        ExifAttribute exifInterface$ExifAttribute6;
        ExifAttribute exifInterface$ExifAttribute5;
        ExifAttribute exifInterface$ExifAttribute0 = (ExifAttribute)this.f[v].get("DefaultCropSize");
        ExifAttribute exifInterface$ExifAttribute1 = (ExifAttribute)this.f[v].get("SensorTopBorder");
        ExifAttribute exifInterface$ExifAttribute2 = (ExifAttribute)this.f[v].get("SensorLeftBorder");
        ExifAttribute exifInterface$ExifAttribute3 = (ExifAttribute)this.f[v].get("SensorBottomBorder");
        ExifAttribute exifInterface$ExifAttribute4 = (ExifAttribute)this.f[v].get("SensorRightBorder");
        if(exifInterface$ExifAttribute0 != null) {
            if(exifInterface$ExifAttribute0.a == 5) {
                Rational[] arr_exifInterface$Rational = (Rational[])exifInterface$ExifAttribute0.r(this.h);
                if(arr_exifInterface$Rational != null && arr_exifInterface$Rational.length == 2) {
                    exifInterface$ExifAttribute5 = ExifAttribute.k(arr_exifInterface$Rational[0], this.h);
                    exifInterface$ExifAttribute6 = ExifAttribute.k(arr_exifInterface$Rational[1], this.h);
                    this.f[v].put("ImageWidth", exifInterface$ExifAttribute5);
                    this.f[v].put("ImageLength", exifInterface$ExifAttribute6);
                    return;
                }
                Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(arr_exifInterface$Rational));
                return;
            }
            int[] arr_v = (int[])exifInterface$ExifAttribute0.r(this.h);
            if(arr_v != null && arr_v.length == 2) {
                exifInterface$ExifAttribute5 = ExifAttribute.m(arr_v[0], this.h);
                exifInterface$ExifAttribute6 = ExifAttribute.m(arr_v[1], this.h);
                this.f[v].put("ImageWidth", exifInterface$ExifAttribute5);
                this.f[v].put("ImageLength", exifInterface$ExifAttribute6);
                return;
            }
            Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(arr_v));
            return;
        }
        if(exifInterface$ExifAttribute1 == null || exifInterface$ExifAttribute2 == null || exifInterface$ExifAttribute3 == null || exifInterface$ExifAttribute4 == null) {
            this.o0(exifInterface$SeekableByteOrderedDataInputStream0, v);
        }
        else {
            int v1 = exifInterface$ExifAttribute1.p(this.h);
            int v2 = exifInterface$ExifAttribute3.p(this.h);
            int v3 = exifInterface$ExifAttribute4.p(this.h);
            int v4 = exifInterface$ExifAttribute2.p(this.h);
            if(v2 > v1 && v3 > v4) {
                ExifAttribute exifInterface$ExifAttribute7 = ExifAttribute.m(v2 - v1, this.h);
                ExifAttribute exifInterface$ExifAttribute8 = ExifAttribute.m(v3 - v4, this.h);
                this.f[v].put("ImageLength", exifInterface$ExifAttribute7);
                this.f[v].put("ImageWidth", exifInterface$ExifAttribute8);
            }
        }
    }

    private void D(SeekableByteOrderedDataInputStream exifInterface$SeekableByteOrderedDataInputStream0) throws IOException {
        exifInterface$SeekableByteOrderedDataInputStream0.f(ExifInterface.k7.length);
        byte[] arr_b = new byte[exifInterface$SeekableByteOrderedDataInputStream0.available()];
        exifInterface$SeekableByteOrderedDataInputStream0.readFully(arr_b);
        this.p = ExifInterface.k7.length;
        this.j0(arr_b, 0);
    }

    private void D0() throws IOException {
        this.B0(0, 5);
        this.B0(0, 4);
        this.B0(5, 4);
        ExifAttribute exifInterface$ExifAttribute0 = (ExifAttribute)this.f[1].get("PixelXDimension");
        ExifAttribute exifInterface$ExifAttribute1 = (ExifAttribute)this.f[1].get("PixelYDimension");
        if(exifInterface$ExifAttribute0 != null && exifInterface$ExifAttribute1 != null) {
            this.f[0].put("ImageWidth", exifInterface$ExifAttribute0);
            this.f[0].put("ImageLength", exifInterface$ExifAttribute1);
        }
        if(this.f[4].isEmpty() && this.b0(this.f[5])) {
            this.f[4] = this.f[5];
            this.f[5] = new HashMap();
        }
        if(!this.b0(this.f[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        this.m0(0, "ThumbnailOrientation", "Orientation");
        this.m0(0, "ThumbnailImageLength", "ImageLength");
        this.m0(0, "ThumbnailImageWidth", "ImageWidth");
        this.m0(5, "ThumbnailOrientation", "Orientation");
        this.m0(5, "ThumbnailImageLength", "ImageLength");
        this.m0(5, "ThumbnailImageWidth", "ImageWidth");
        this.m0(4, "Orientation", "ThumbnailOrientation");
        this.m0(4, "ImageLength", "ThumbnailImageLength");
        this.m0(4, "ImageWidth", "ThumbnailImageWidth");
    }

    @Nullable
    public byte[] E() {
        return this.o == 6 || this.o == 7 ? this.G() : null;
    }

    private int E0(ByteOrderedDataOutputStream exifInterface$ByteOrderedDataOutputStream0) throws IOException {
        int[] arr_v = new int[ExifInterface.d7.length];
        int[] arr_v1 = new int[ExifInterface.d7.length];
        ExifTag[] arr_exifInterface$ExifTag = ExifInterface.e7;
        for(int v = 0; v < arr_exifInterface$ExifTag.length; ++v) {
            this.l0(arr_exifInterface$ExifTag[v].b);
        }
        if(this.i) {
            if(this.j) {
                this.l0("StripOffsets");
                this.l0("StripByteCounts");
            }
            else {
                this.l0("JPEGInterchangeFormat");
                this.l0("JPEGInterchangeFormatLength");
            }
        }
        for(int v1 = 0; v1 < ExifInterface.d7.length; ++v1) {
            Object[] arr_object = this.f[v1].entrySet().toArray();
            for(int v2 = 0; v2 < arr_object.length; ++v2) {
                Map.Entry map$Entry0 = (Map.Entry)arr_object[v2];
                if(map$Entry0.getValue() == null) {
                    this.f[v1].remove(map$Entry0.getKey());
                }
            }
        }
        if(!this.f[1].isEmpty()) {
            this.f[0].put(ExifInterface.e7[1].b, ExifAttribute.i(0L, this.h));
        }
        if(!this.f[2].isEmpty()) {
            this.f[0].put(ExifInterface.e7[2].b, ExifAttribute.i(0L, this.h));
        }
        if(!this.f[3].isEmpty()) {
            this.f[1].put(ExifInterface.e7[3].b, ExifAttribute.i(0L, this.h));
        }
        if(this.i) {
            if(this.j) {
                this.f[4].put("StripOffsets", ExifAttribute.m(0, this.h));
                this.f[4].put("StripByteCounts", ExifAttribute.m(this.m, this.h));
            }
            else {
                this.f[4].put("JPEGInterchangeFormat", ExifAttribute.i(0L, this.h));
                this.f[4].put("JPEGInterchangeFormatLength", ExifAttribute.i(this.m, this.h));
            }
        }
        for(int v3 = 0; v3 < ExifInterface.d7.length; ++v3) {
            int v4 = 0;
            for(Object object0: this.f[v3].entrySet()) {
                int v5 = ((ExifAttribute)((Map.Entry)object0).getValue()).s();
                if(v5 > 4) {
                    v4 += v5;
                }
            }
            arr_v1[v3] += v4;
        }
        int v7 = 8;
        for(int v6 = 0; v6 < ExifInterface.d7.length; ++v6) {
            if(!this.f[v6].isEmpty()) {
                arr_v[v6] = v7;
                v7 += this.f[v6].size() * 12 + 6 + arr_v1[v6];
            }
        }
        if(this.i) {
            if(this.j) {
                this.f[4].put("StripOffsets", ExifAttribute.m(v7, this.h));
            }
            else {
                this.f[4].put("JPEGInterchangeFormat", ExifAttribute.i(v7, this.h));
            }
            this.l = v7;
            v7 += this.m;
        }
        if(this.d == 4) {
            v7 += 8;
        }
        if(ExifInterface.w) {
            for(int v8 = 0; v8 < ExifInterface.d7.length; ++v8) {
                Log.d("ExifInterface", String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", v8, ((int)arr_v[v8]), this.f[v8].size(), ((int)arr_v1[v8]), v7));
            }
        }
        if(!this.f[1].isEmpty()) {
            this.f[0].put(ExifInterface.e7[1].b, ExifAttribute.i(arr_v[1], this.h));
        }
        if(!this.f[2].isEmpty()) {
            this.f[0].put(ExifInterface.e7[2].b, ExifAttribute.i(arr_v[2], this.h));
        }
        if(!this.f[3].isEmpty()) {
            this.f[1].put(ExifInterface.e7[3].b, ExifAttribute.i(arr_v[3], this.h));
        }
        int v9 = this.d;
        if(v9 != 4) {
            switch(v9) {
                case 13: {
                    exifInterface$ByteOrderedDataOutputStream0.b(v7);
                    exifInterface$ByteOrderedDataOutputStream0.write(ExifInterface.T5);
                    break;
                }
                case 14: {
                    exifInterface$ByteOrderedDataOutputStream0.write(ExifInterface.b6);
                    exifInterface$ByteOrderedDataOutputStream0.b(v7);
                }
            }
        }
        else if(v7 <= 0xFFFF) {
            exifInterface$ByteOrderedDataOutputStream0.f(v7);
            exifInterface$ByteOrderedDataOutputStream0.write(ExifInterface.k7);
        }
        else {
            throw new IllegalStateException("Size of exif data (" + v7 + " bytes) exceeds the max size of a JPEG APP1 segment (65536 bytes)");
        }
        exifInterface$ByteOrderedDataOutputStream0.c(((short)(this.h == ByteOrder.BIG_ENDIAN ? 0x4D4D : 0x4949)));
        exifInterface$ByteOrderedDataOutputStream0.a(this.h);
        exifInterface$ByteOrderedDataOutputStream0.f(42);
        exifInterface$ByteOrderedDataOutputStream0.e(8L);
        for(int v10 = 0; v10 < ExifInterface.d7.length; ++v10) {
            if(!this.f[v10].isEmpty()) {
                exifInterface$ByteOrderedDataOutputStream0.f(this.f[v10].size());
                int v11 = arr_v[v10] + 2 + this.f[v10].size() * 12 + 4;
                for(Object object1: this.f[v10].entrySet()) {
                    int v12 = ((ExifTag)ExifInterface.g7[v10].get(((Map.Entry)object1).getKey())).a;
                    ExifAttribute exifInterface$ExifAttribute0 = (ExifAttribute)((Map.Entry)object1).getValue();
                    int v13 = exifInterface$ExifAttribute0.s();
                    exifInterface$ByteOrderedDataOutputStream0.f(v12);
                    exifInterface$ByteOrderedDataOutputStream0.f(exifInterface$ExifAttribute0.a);
                    exifInterface$ByteOrderedDataOutputStream0.b(exifInterface$ExifAttribute0.b);
                    if(v13 > 4) {
                        exifInterface$ByteOrderedDataOutputStream0.e(((long)v11));
                        v11 += v13;
                    }
                    else {
                        exifInterface$ByteOrderedDataOutputStream0.write(exifInterface$ExifAttribute0.d);
                        if(v13 < 4) {
                            while(v13 < 4) {
                                exifInterface$ByteOrderedDataOutputStream0.writeByte(0);
                                ++v13;
                            }
                        }
                    }
                }
                if(v10 != 0 || this.f[4].isEmpty()) {
                    exifInterface$ByteOrderedDataOutputStream0.e(0L);
                }
                else {
                    exifInterface$ByteOrderedDataOutputStream0.e(((long)arr_v[4]));
                }
                for(Object object2: this.f[v10].entrySet()) {
                    byte[] arr_b = ((ExifAttribute)((Map.Entry)object2).getValue()).d;
                    if(arr_b.length > 4) {
                        exifInterface$ByteOrderedDataOutputStream0.write(arr_b, 0, arr_b.length);
                    }
                }
            }
        }
        if(this.i) {
            exifInterface$ByteOrderedDataOutputStream0.write(this.G());
        }
        if(this.d == 14 && v7 % 2 == 1) {
            exifInterface$ByteOrderedDataOutputStream0.writeByte(0);
        }
        exifInterface$ByteOrderedDataOutputStream0.a(ByteOrder.BIG_ENDIAN);
        return v7;
    }

    @Nullable
    public Bitmap F() {
        if(!this.i) {
            return null;
        }
        if(this.n == null) {
            this.n = this.G();
        }
        switch(this.o) {
            case 1: {
                int v1 = this.n.length / 3;
                int[] arr_v = new int[v1];
                for(int v = 0; v < v1; ++v) {
                    arr_v[v] = (this.n[v * 3] << 16) + (this.n[v * 3 + 1] << 8) + this.n[v * 3 + 2];
                }
                ExifAttribute exifInterface$ExifAttribute0 = (ExifAttribute)this.f[4].get("ThumbnailImageLength");
                ExifAttribute exifInterface$ExifAttribute1 = (ExifAttribute)this.f[4].get("ThumbnailImageWidth");
                if(exifInterface$ExifAttribute0 != null && exifInterface$ExifAttribute1 != null) {
                    int v2 = exifInterface$ExifAttribute0.p(this.h);
                    return Bitmap.createBitmap(arr_v, exifInterface$ExifAttribute1.p(this.h), v2, Bitmap.Config.ARGB_8888);
                }
                return null;
            }
            case 6: 
            case 7: {
                return BitmapFactory.decodeByteArray(this.n, 0, this.m);
            }
            default: {
                return null;
            }
        }
    }

    @Nullable
    public byte[] G() {
        byte[] arr_b1;
        Exception exception1;
        FileDescriptor fileDescriptor1;
        FileDescriptor fileDescriptor0;
        AssetManager.AssetInputStream assetManager$AssetInputStream0;
        Closeable closeable0 = null;
        if(!this.i) {
            return null;
        }
        byte[] arr_b = this.n;
        if(arr_b != null) {
            return arr_b;
        }
        try {
            assetManager$AssetInputStream0 = this.c;
            if(assetManager$AssetInputStream0 == null) {
                if(this.a != null) {
                    assetManager$AssetInputStream0 = new FileInputStream(this.a);
                    fileDescriptor1 = null;
                    goto label_35;
                }
                fileDescriptor0 = Api21Impl.b(this.b);
                goto label_21;
            }
            goto label_32;
        }
        catch(Exception exception0) {
            assetManager$AssetInputStream0 = null;
            exception1 = exception0;
            fileDescriptor1 = null;
            goto label_56;
        }
        catch(Throwable throwable0) {
            fileDescriptor1 = null;
            goto label_64;
        }
        try {
        label_21:
            Api21Impl.c(fileDescriptor0, 0L, OsConstants.SEEK_SET);
            fileDescriptor1 = fileDescriptor0;
            assetManager$AssetInputStream0 = new FileInputStream(fileDescriptor0);
            goto label_35;
        }
        catch(Exception exception2) {
            exception1 = exception2;
            fileDescriptor1 = fileDescriptor0;
            assetManager$AssetInputStream0 = null;
            goto label_56;
        }
        catch(Throwable throwable0) {
            goto label_64;
        }
        try {
        label_32:
            if(assetManager$AssetInputStream0.markSupported()) {
                assetManager$AssetInputStream0.reset();
                fileDescriptor1 = null;
                goto label_35;
            }
            goto label_47;
        }
        catch(Exception exception3) {
            goto label_54;
        }
        catch(Throwable throwable0) {
            goto label_50;
        }
        try {
        label_35:
            ByteOrderedDataInputStream exifInterface$ByteOrderedDataInputStream0 = new ByteOrderedDataInputStream(assetManager$AssetInputStream0);
            exifInterface$ByteOrderedDataInputStream0.f(this.l + this.p);
            arr_b1 = new byte[this.m];
            exifInterface$ByteOrderedDataInputStream0.readFully(arr_b1);
            this.n = arr_b1;
            goto label_43;
        }
        catch(Exception exception1) {
            goto label_56;
        label_43:
            ExifInterfaceUtils.c(assetManager$AssetInputStream0);
            if(fileDescriptor1 != null) {
                ExifInterfaceUtils.b(fileDescriptor1);
            }
            return arr_b1;
            try {
            label_47:
                Log.d("ExifInterface", "Cannot read thumbnail from inputstream without mark/reset support");
                goto label_68;
            label_50:
                fileDescriptor1 = null;
                while(true) {
                    closeable0 = assetManager$AssetInputStream0;
                    goto label_64;
                label_54:
                    exception1 = exception3;
                    fileDescriptor1 = null;
                    break;
                }
            }
            catch(Exception exception3) {
                goto label_54;
            }
            catch(Throwable throwable0) {
                goto label_50;
            }
            try {
            label_56:
                Log.d("ExifInterface", "Encountered exception while getting thumbnail", exception1);
                goto label_60;
            }
            catch(Throwable throwable0) {
            }
            closeable0 = assetManager$AssetInputStream0;
            goto label_64;
        }
        catch(Throwable throwable0) {
            try {
                closeable0 = assetManager$AssetInputStream0;
                goto label_64;
            }
            catch(Exception exception3) {
                goto label_54;
            }
            catch(Throwable throwable0) {
                goto label_50;
            }
        }
    label_60:
        ExifInterfaceUtils.c(assetManager$AssetInputStream0);
        if(fileDescriptor1 != null) {
            ExifInterfaceUtils.b(fileDescriptor1);
        }
        return null;
    label_64:
        ExifInterfaceUtils.c(closeable0);
        if(fileDescriptor1 != null) {
            ExifInterfaceUtils.b(fileDescriptor1);
        }
        throw throwable0;
    label_68:
        ExifInterfaceUtils.c(assetManager$AssetInputStream0);
        return null;
    }

    @Nullable
    public long[] H() {
        if(this.t) {
            throw new IllegalStateException("The underlying file has been modified since being parsed");
        }
        return this.i && (!this.j || this.k) ? new long[]{((long)(this.l + this.p)), ((long)this.m)} : null;
    }

    private void I(ByteOrderedDataInputStream exifInterface$ByteOrderedDataInputStream0) throws IOException {
        if(ExifInterface.w) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + exifInterface$ByteOrderedDataInputStream0);
        }
        exifInterface$ByteOrderedDataInputStream0.e(ByteOrder.LITTLE_ENDIAN);
        exifInterface$ByteOrderedDataInputStream0.f(ExifInterface.Y5.length);
        int v = exifInterface$ByteOrderedDataInputStream0.readInt();
        exifInterface$ByteOrderedDataInputStream0.f(ExifInterface.Z5.length);
        int v1 = ExifInterface.Z5.length + 8;
        try {
            while(true) {
                byte[] arr_b = new byte[4];
                exifInterface$ByteOrderedDataInputStream0.readFully(arr_b);
                int v2 = exifInterface$ByteOrderedDataInputStream0.readInt();
                if(Arrays.equals(ExifInterface.b6, arr_b)) {
                    byte[] arr_b1 = new byte[v2];
                    exifInterface$ByteOrderedDataInputStream0.readFully(arr_b1);
                    this.p = v1 + 8;
                    this.j0(arr_b1, 0);
                    this.z0(new ByteOrderedDataInputStream(arr_b1));
                    return;
                }
                if(v2 % 2 == 1) {
                    ++v2;
                }
                v1 = v1 + 8 + v2;
                if(v1 == v + 8) {
                    return;
                }
                if(v1 > v + 8) {
                    break;
                }
                exifInterface$ByteOrderedDataInputStream0.f(v2);
            }
            throw new IOException("Encountered WebP file with invalid chunk size");
        }
        catch(EOFException unused_ex) {
            throw new IOException("Encountered corrupt WebP file.");
        }
    }

    private static Pair J(String s) {
        if(s.contains(",")) {
            String[] arr_s = s.split(",", -1);
            Pair pair0 = ExifInterface.J(arr_s[0]);
            if(((int)(((Integer)pair0.first))) == 2) {
                return pair0;
            }
            for(int v = 1; v < arr_s.length; ++v) {
                Pair pair1 = ExifInterface.J(arr_s[v]);
                int v1 = ((Integer)pair1.first).equals(pair0.first) || ((Integer)pair1.second).equals(pair0.first) ? ((int)(((Integer)pair0.first))) : -1;
                int v2 = ((int)(((Integer)pair0.second))) == -1 || !((Integer)pair1.first).equals(pair0.second) && !((Integer)pair1.second).equals(pair0.second) ? -1 : ((int)(((Integer)pair0.second)));
                if(v1 == -1 && v2 == -1) {
                    return new Pair(2, -1);
                }
                if(v1 == -1) {
                    pair0 = new Pair(v2, -1);
                }
                else if(v2 == -1) {
                    pair0 = new Pair(v1, -1);
                }
            }
            return pair0;
        }
        if(s.contains("/")) {
            String[] arr_s1 = s.split("/", -1);
            if(arr_s1.length == 2) {
                try {
                    long v3 = (long)Double.parseDouble(arr_s1[0]);
                    long v4 = (long)Double.parseDouble(arr_s1[1]);
                    if(v3 >= 0L && v4 >= 0L) {
                        return v3 > 0x7FFFFFFFL || v4 > 0x7FFFFFFFL ? new Pair(5, -1) : new Pair(10, 5);
                    }
                    return new Pair(10, -1);
                }
                catch(NumberFormatException unused_ex) {
                }
            }
            return new Pair(2, -1);
        }
        try {
            long v5 = Long.parseLong(s);
            int v6 = Long.compare(v5, 0L);
            if(v6 >= 0 && v5 <= 0xFFFFL) {
                return new Pair(3, 4);
            }
            return v6 >= 0 ? new Pair(4, -1) : new Pair(9, -1);
        }
        catch(NumberFormatException unused_ex) {
            try {
                Double.parseDouble(s);
                return new Pair(12, -1);
            }
            catch(NumberFormatException unused_ex) {
                return new Pair(2, -1);
            }
        }
    }

    private void K(ByteOrderedDataInputStream exifInterface$ByteOrderedDataInputStream0, HashMap hashMap0) throws IOException {
        ExifAttribute exifInterface$ExifAttribute0 = (ExifAttribute)hashMap0.get("JPEGInterchangeFormat");
        ExifAttribute exifInterface$ExifAttribute1 = (ExifAttribute)hashMap0.get("JPEGInterchangeFormatLength");
        if(exifInterface$ExifAttribute0 != null && exifInterface$ExifAttribute1 != null) {
            int v = exifInterface$ExifAttribute0.p(this.h);
            int v1 = exifInterface$ExifAttribute1.p(this.h);
            if(this.d == 7) {
                v += this.q;
            }
            if(v > 0 && v1 > 0) {
                this.i = true;
                if(this.a == null && this.c == null && this.b == null) {
                    byte[] arr_b = new byte[v1];
                    exifInterface$ByteOrderedDataInputStream0.f(v);
                    exifInterface$ByteOrderedDataInputStream0.readFully(arr_b);
                    this.n = arr_b;
                }
                this.l = v;
                this.m = v1;
            }
            if(ExifInterface.w) {
                Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + v + ", length: " + v1);
            }
        }
    }

    private void L(ByteOrderedDataInputStream exifInterface$ByteOrderedDataInputStream0, HashMap hashMap0) throws IOException {
        int v8;
        ExifAttribute exifInterface$ExifAttribute0 = (ExifAttribute)hashMap0.get("StripOffsets");
        ExifAttribute exifInterface$ExifAttribute1 = (ExifAttribute)hashMap0.get("StripByteCounts");
        if(exifInterface$ExifAttribute0 != null && exifInterface$ExifAttribute1 != null) {
            long[] arr_v = ExifInterfaceUtils.d(exifInterface$ExifAttribute0.r(this.h));
            long[] arr_v1 = ExifInterfaceUtils.d(exifInterface$ExifAttribute1.r(this.h));
            if(arr_v == null || arr_v.length == 0) {
                Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            }
            else {
                if(arr_v1 == null || arr_v1.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if(arr_v.length != arr_v1.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long v = 0L;
                for(int v1 = 0; v1 < arr_v1.length; ++v1) {
                    v += arr_v1[v1];
                }
                int v2 = (int)v;
                byte[] arr_b = new byte[v2];
                this.k = true;
                this.j = true;
                this.i = true;
                int v3 = 0;
                int v4 = 0;
                int v5 = 0;
                while(v3 < arr_v.length) {
                    int v6 = (int)arr_v[v3];
                    int v7 = (int)arr_v1[v3];
                    if(v3 < arr_v.length - 1) {
                        v8 = v2;
                        if(((long)(v6 + v7)) != arr_v[v3 + 1]) {
                            this.k = false;
                        }
                    }
                    else {
                        v8 = v2;
                    }
                    int v9 = v6 - v4;
                    if(v9 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    try {
                        exifInterface$ByteOrderedDataInputStream0.f(v9);
                    }
                    catch(EOFException unused_ex) {
                        Log.d("ExifInterface", "Failed to skip " + v9 + " bytes.");
                        return;
                    }
                    byte[] arr_b1 = new byte[v7];
                    try {
                        exifInterface$ByteOrderedDataInputStream0.readFully(arr_b1);
                    }
                    catch(EOFException unused_ex) {
                        Log.d("ExifInterface", "Failed to read " + v7 + " bytes.");
                        return;
                    }
                    v4 = v4 + v9 + v7;
                    System.arraycopy(arr_b1, 0, arr_b, v5, v7);
                    v5 += v7;
                    ++v3;
                    v2 = v8;
                }
                this.n = arr_b;
                if(this.k) {
                    this.l = (int)arr_v[0];
                    this.m = v2;
                }
            }
        }
    }

    public boolean M(@NonNull String s) {
        return this.q(s) != null;
    }

    public boolean N() {
        return this.i;
    }

    private void O(String s) throws IOException {
        FileInputStream fileInputStream1;
        FileInputStream fileInputStream0;
        if(s == null) {
            throw new NullPointerException("filename cannot be null");
        }
        try {
            fileInputStream0 = null;
            this.c = null;
            this.a = s;
            fileInputStream1 = new FileInputStream(s);
        }
        catch(Throwable throwable0) {
            ExifInterfaceUtils.c(fileInputStream0);
            throw throwable0;
        }
        try {
            this.b = ExifInterface.X(fileInputStream1.getFD()) ? fileInputStream1.getFD() : null;
            this.e0(fileInputStream1);
        }
        catch(Throwable throwable0) {
            fileInputStream0 = fileInputStream1;
            ExifInterfaceUtils.c(fileInputStream0);
            throw throwable0;
        }
        ExifInterfaceUtils.c(fileInputStream1);
    }

    private static boolean P(BufferedInputStream bufferedInputStream0) throws IOException {
        bufferedInputStream0.mark(ExifInterface.k7.length);
        byte[] arr_b = new byte[ExifInterface.k7.length];
        bufferedInputStream0.read(arr_b);
        bufferedInputStream0.reset();
        for(int v = 0; true; ++v) {
            byte[] arr_b1 = ExifInterface.k7;
            if(v >= arr_b1.length) {
                break;
            }
            if(arr_b[v] != arr_b1[v]) {
                return false;
            }
        }
        return true;
    }

    public boolean Q() {
        switch(this.l("Orientation", 1)) {
            case 2: 
            case 4: 
            case 5: 
            case 7: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    private boolean R(byte[] arr_b) throws IOException {
        boolean z1;
        boolean z;
        long v3;
        byte[] arr_b2;
        long v1;
        long v;
        ByteOrderedDataInputStream exifInterface$ByteOrderedDataInputStream0 = null;
        try {
            exifInterface$ByteOrderedDataInputStream0 = new ByteOrderedDataInputStream(arr_b);
            v = (long)exifInterface$ByteOrderedDataInputStream0.readInt();
            byte[] arr_b1 = new byte[4];
            exifInterface$ByteOrderedDataInputStream0.readFully(arr_b1);
            if(!Arrays.equals(arr_b1, ExifInterface.G5)) {
                goto label_6;
            }
            goto label_8;
        }
        catch(Exception exception0) {
            goto label_38;
        }
        catch(Throwable throwable0) {
            goto label_44;
        }
    label_6:
        exifInterface$ByteOrderedDataInputStream0.close();
        return false;
    label_8:
        if(v == 1L) {
            try {
                v1 = 16L;
                v = exifInterface$ByteOrderedDataInputStream0.readLong();
                if(v < 16L) {
                    goto label_12;
                }
                goto label_15;
            }
            catch(Exception exception0) {
                goto label_38;
            }
            catch(Throwable throwable0) {
                goto label_44;
            }
        label_12:
            exifInterface$ByteOrderedDataInputStream0.close();
            return false;
        }
        else {
            v1 = 8L;
        }
    label_15:
        if(v > ((long)arr_b.length)) {
            v = (long)arr_b.length;
        }
        long v2 = v - v1;
        if(v2 < 8L) {
            exifInterface$ByteOrderedDataInputStream0.close();
            return false;
        }
        try {
            arr_b2 = new byte[4];
            v3 = 0L;
            z = false;
            z1 = false;
        }
        catch(Exception exception0) {
            goto label_38;
        }
        catch(Throwable throwable0) {
            goto label_44;
        }
        while(v3 < v2 / 4L) {
            try {
                exifInterface$ByteOrderedDataInputStream0.readFully(arr_b2);
                goto label_30;
            }
            catch(EOFException unused_ex) {
            }
            catch(Exception exception0) {
                goto label_38;
            }
            catch(Throwable throwable0) {
                goto label_44;
            }
            exifInterface$ByteOrderedDataInputStream0.close();
            return false;
        label_30:
            if(v3 != 1L) {
                try {
                    try {
                        if(Arrays.equals(arr_b2, ExifInterface.H5)) {
                            z = true;
                        }
                        else if(Arrays.equals(arr_b2, ExifInterface.I5)) {
                            z1 = true;
                        }
                        goto label_46;
                    }
                    catch(Exception exception0) {
                    }
                label_38:
                    if(ExifInterface.w) {
                        Log.d("ExifInterface", "Exception parsing HEIF file type box.", exception0);
                    }
                }
                catch(Throwable throwable0) {
                    goto label_44;
                }
                if(exifInterface$ByteOrderedDataInputStream0 != null) {
                    exifInterface$ByteOrderedDataInputStream0.close();
                }
                return false;
            label_44:
                TWR.safeClose$NT(exifInterface$ByteOrderedDataInputStream0, throwable0);
                throw throwable0;
            label_46:
                if(z && z1) {
                    exifInterface$ByteOrderedDataInputStream0.close();
                    return true;
                }
            }
            ++v3;
        }
        exifInterface$ByteOrderedDataInputStream0.close();
        return false;
    }

    private static boolean S(byte[] arr_b) throws IOException {
        for(int v = 0; true; ++v) {
            byte[] arr_b1 = ExifInterface.D5;
            if(v >= arr_b1.length) {
                break;
            }
            if(arr_b[v] != arr_b1[v]) {
                return false;
            }
        }
        return true;
    }

    private boolean T(byte[] arr_b) throws IOException {
        ByteOrderedDataInputStream exifInterface$ByteOrderedDataInputStream0;
        boolean z = false;
        try {
            exifInterface$ByteOrderedDataInputStream0 = null;
            exifInterface$ByteOrderedDataInputStream0 = new ByteOrderedDataInputStream(arr_b);
            ByteOrder byteOrder0 = this.i0(exifInterface$ByteOrderedDataInputStream0);
            this.h = byteOrder0;
            exifInterface$ByteOrderedDataInputStream0.e(byteOrder0);
            int v = exifInterface$ByteOrderedDataInputStream0.readShort();
        }
        catch(Exception unused_ex) {
            if(exifInterface$ByteOrderedDataInputStream0 != null) {
                exifInterface$ByteOrderedDataInputStream0.close();
            }
            return false;
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(exifInterface$ByteOrderedDataInputStream0, throwable0);
            throw throwable0;
        }
        if(v == 20306 || v == 21330) {
            z = true;
        }
        exifInterface$ByteOrderedDataInputStream0.close();
        return z;
    }

    private boolean U(byte[] arr_b) throws IOException {
        for(int v = 0; true; ++v) {
            byte[] arr_b1 = ExifInterface.S5;
            if(v >= arr_b1.length) {
                break;
            }
            if(arr_b[v] != arr_b1[v]) {
                return false;
            }
        }
        return true;
    }

    private boolean V(byte[] arr_b) throws IOException {
        byte[] arr_b1 = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for(int v = 0; v < arr_b1.length; ++v) {
            if(arr_b[v] != arr_b1[v]) {
                return false;
            }
        }
        return true;
    }

    private boolean W(byte[] arr_b) throws IOException {
        ByteOrderedDataInputStream exifInterface$ByteOrderedDataInputStream0;
        boolean z = false;
        try {
            exifInterface$ByteOrderedDataInputStream0 = null;
            exifInterface$ByteOrderedDataInputStream0 = new ByteOrderedDataInputStream(arr_b);
            ByteOrder byteOrder0 = this.i0(exifInterface$ByteOrderedDataInputStream0);
            this.h = byteOrder0;
            exifInterface$ByteOrderedDataInputStream0.e(byteOrder0);
            if(exifInterface$ByteOrderedDataInputStream0.readShort() == 85) {
                z = true;
            }
        }
        catch(Exception unused_ex) {
            if(exifInterface$ByteOrderedDataInputStream0 != null) {
                exifInterface$ByteOrderedDataInputStream0.close();
            }
            return false;
        }
        catch(Throwable throwable0) {
            TWR.safeClose$NT(exifInterface$ByteOrderedDataInputStream0, throwable0);
            throw throwable0;
        }
        exifInterface$ByteOrderedDataInputStream0.close();
        return z;
    }

    private static boolean X(FileDescriptor fileDescriptor0) {
        try {
            Api21Impl.c(fileDescriptor0, 0L, OsConstants.SEEK_CUR);
            return true;
        }
        catch(Exception unused_ex) {
            if(ExifInterface.w) {
                Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
            }
            return false;
        }
    }

    private boolean Y(HashMap hashMap0) throws IOException {
        ExifAttribute exifInterface$ExifAttribute0 = (ExifAttribute)hashMap0.get("BitsPerSample");
        if(exifInterface$ExifAttribute0 != null) {
            int[] arr_v = (int[])exifInterface$ExifAttribute0.r(this.h);
            int[] arr_v1 = ExifInterface.r5;
            if(Arrays.equals(arr_v1, arr_v)) {
                return true;
            }
            if(this.d == 3) {
                ExifAttribute exifInterface$ExifAttribute1 = (ExifAttribute)hashMap0.get("PhotometricInterpretation");
                if(exifInterface$ExifAttribute1 != null) {
                    int v = exifInterface$ExifAttribute1.p(this.h);
                    if(v == 1 && Arrays.equals(arr_v, ExifInterface.t5) || v == 6 && Arrays.equals(arr_v, arr_v1)) {
                        return true;
                    }
                }
            }
        }
        if(ExifInterface.w) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
        return false;
    }

    private static boolean Z(int v) {
        return v == 4 || v == 13 || v == 14;
    }

    private void a() {
        String s = this.i("DateTimeOriginal");
        if(s != null && this.i("DateTime") == null) {
            this.f[0].put("DateTime", ExifAttribute.h(s));
        }
        if(this.i("ImageWidth") == null) {
            this.f[0].put("ImageWidth", ExifAttribute.i(0L, this.h));
        }
        if(this.i("ImageLength") == null) {
            this.f[0].put("ImageLength", ExifAttribute.i(0L, this.h));
        }
        if(this.i("Orientation") == null) {
            this.f[0].put("Orientation", ExifAttribute.i(0L, this.h));
        }
        if(this.i("LightSource") == null) {
            this.f[1].put("LightSource", ExifAttribute.i(0L, this.h));
        }
    }

    // 去混淆评级： 低(21)
    public static boolean a0(@NonNull String s) {
        if(s != null) {
            String s1 = s.toLowerCase(Locale.ROOT);
            s1.hashCode();
            switch(s1) {
                case "image/heic": 
                case "image/heif": 
                case "image/jpeg": 
                case "image/png": 
                case "image/webp": 
                case "image/x-adobe-dng": 
                case "image/x-canon-cr2": 
                case "image/x-fuji-raf": 
                case "image/x-nikon-nef": 
                case "image/x-nikon-nrw": 
                case "image/x-olympus-orf": 
                case "image/x-panasonic-rw2": 
                case "image/x-pentax-pef": 
                case "image/x-samsung-srw": 
                case "image/x-sony-arw": {
                    return true;
                }
                default: {
                    return false;
                }
            }
        }
        throw new NullPointerException("mimeType shouldn\'t be null");
    }

    private String b(double f) {
        double f1 = f - ((double)(((long)f)));
        return ((long)f) + "/1," + ((long)(f1 * 60.0)) + "/1," + Math.round((f1 - ((double)(((long)(f1 * 60.0)))) / 60.0) * 36000000000.0) + "/10000000";
    }

    private boolean b0(HashMap hashMap0) throws IOException {
        ExifAttribute exifInterface$ExifAttribute0 = (ExifAttribute)hashMap0.get("ImageLength");
        ExifAttribute exifInterface$ExifAttribute1 = (ExifAttribute)hashMap0.get("ImageWidth");
        return exifInterface$ExifAttribute0 != null && exifInterface$ExifAttribute1 != null && (exifInterface$ExifAttribute0.p(this.h) <= 0x200 && exifInterface$ExifAttribute1.p(this.h) <= 0x200);
    }

    private static double c(String s, String s1) {
        try {
            String[] arr_s = s.split(",", -1);
            String[] arr_s1 = arr_s[0].split("/", -1);
            double f = Double.parseDouble(arr_s1[0].trim());
            double f1 = Double.parseDouble(arr_s1[1].trim());
            String[] arr_s2 = arr_s[1].split("/", -1);
            double f2 = Double.parseDouble(arr_s2[0].trim());
            double f3 = Double.parseDouble(arr_s2[1].trim());
            String[] arr_s3 = arr_s[2].split("/", -1);
            double f4 = f / f1 + f2 / f3 / 60.0 + Double.parseDouble(arr_s3[0].trim()) / Double.parseDouble(arr_s3[1].trim()) / 3600.0;
            if(!s1.equals("S") && !s1.equals("W")) {
                if(!s1.equals("N") && !s1.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return f4;
            }
            return -f4;
        }
        catch(NumberFormatException | ArrayIndexOutOfBoundsException unused_ex) {
            throw new IllegalArgumentException();
        }
    }

    public boolean c0() {
        return this.i ? this.o == 6 || this.o == 7 : false;
    }

    private void d(ByteOrderedDataInputStream exifInterface$ByteOrderedDataInputStream0, ByteOrderedDataOutputStream exifInterface$ByteOrderedDataOutputStream0, byte[] arr_b, byte[] arr_b1) throws IOException {
        do {
            byte[] arr_b2 = new byte[4];
            exifInterface$ByteOrderedDataInputStream0.readFully(arr_b2);
            this.e(exifInterface$ByteOrderedDataInputStream0, exifInterface$ByteOrderedDataOutputStream0, arr_b2);
        }
        while(!Arrays.equals(arr_b2, arr_b) && (arr_b1 == null || !Arrays.equals(arr_b2, arr_b1)));
    }

    private boolean d0(byte[] arr_b) throws IOException {
        for(int v = 0; true; ++v) {
            byte[] arr_b1 = ExifInterface.Y5;
            if(v >= arr_b1.length) {
                break;
            }
            if(arr_b[v] != arr_b1[v]) {
                return false;
            }
        }
        for(int v1 = 0; true; ++v1) {
            byte[] arr_b2 = ExifInterface.Z5;
            if(v1 >= arr_b2.length) {
                break;
            }
            if(arr_b[ExifInterface.Y5.length + v1 + 4] != arr_b2[v1]) {
                return false;
            }
        }
        return true;
    }

    private void e(ByteOrderedDataInputStream exifInterface$ByteOrderedDataInputStream0, ByteOrderedDataOutputStream exifInterface$ByteOrderedDataOutputStream0, byte[] arr_b) throws IOException {
        int v = exifInterface$ByteOrderedDataInputStream0.readInt();
        exifInterface$ByteOrderedDataOutputStream0.write(arr_b);
        exifInterface$ByteOrderedDataOutputStream0.b(v);
        if(v % 2 == 1) {
            ++v;
        }
        ExifInterfaceUtils.f(exifInterface$ByteOrderedDataInputStream0, exifInterface$ByteOrderedDataOutputStream0, v);
    }

    private void e0(@NonNull InputStream inputStream0) {
        if(inputStream0 == null) {
            throw new NullPointerException("inputstream shouldn\'t be null");
        }
        try {
            try {
                for(int v = 0; v < ExifInterface.d7.length; ++v) {
                    this.f[v] = new HashMap();
                }
                if(!this.e) {
                    BufferedInputStream bufferedInputStream0 = new BufferedInputStream(inputStream0, 5000);
                    this.d = this.w(bufferedInputStream0);
                    inputStream0 = bufferedInputStream0;
                }
                if(ExifInterface.A0(this.d)) {
                    SeekableByteOrderedDataInputStream exifInterface$SeekableByteOrderedDataInputStream0 = new SeekableByteOrderedDataInputStream(inputStream0);
                    if(this.e) {
                        this.D(exifInterface$SeekableByteOrderedDataInputStream0);
                    }
                    else {
                        int v1 = this.d;
                        if(v1 == 12) {
                            this.s(exifInterface$SeekableByteOrderedDataInputStream0);
                        }
                        else {
                            switch(v1) {
                                case 7: {
                                    this.x(exifInterface$SeekableByteOrderedDataInputStream0);
                                    break;
                                }
                                case 10: {
                                    this.C(exifInterface$SeekableByteOrderedDataInputStream0);
                                    break;
                                }
                                default: {
                                    this.A(exifInterface$SeekableByteOrderedDataInputStream0);
                                }
                            }
                        }
                    }
                    exifInterface$SeekableByteOrderedDataInputStream0.i(((long)this.p));
                    this.z0(exifInterface$SeekableByteOrderedDataInputStream0);
                }
                else {
                    ByteOrderedDataInputStream exifInterface$ByteOrderedDataInputStream0 = new ByteOrderedDataInputStream(inputStream0);
                    int v2 = this.d;
                    if(v2 == 4) {
                        this.t(exifInterface$ByteOrderedDataInputStream0, 0, 0);
                        goto label_54;
                    label_44:
                        boolean z = ExifInterface.w;
                        if(z) {
                            goto label_46;
                        }
                        goto label_47;
                    }
                    else {
                        switch(v2) {
                            case 9: {
                                this.z(exifInterface$ByteOrderedDataInputStream0);
                                break;
                            }
                            case 13: {
                                this.y(exifInterface$ByteOrderedDataInputStream0);
                                break;
                            }
                            case 14: {
                                this.I(exifInterface$ByteOrderedDataInputStream0);
                            }
                        }
                    }
                }
                goto label_54;
            }
            catch(IOException | UnsupportedOperationException iOException0) {
                goto label_44;
            }
        label_46:
            Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", iOException0);
        }
        catch(Throwable throwable0) {
            goto label_50;
        }
    label_47:
        this.a();
        if(z) {
            this.h0();
            return;
        }
        return;
    label_50:
        this.a();
        if(ExifInterface.w) {
            this.h0();
        }
        throw throwable0;
    label_54:
        this.a();
        if(ExifInterface.w) {
            this.h0();
        }
    }

    public void f() {
        int v = 1;
        switch(this.l("Orientation", 1)) {
            case 1: {
                v = 2;
                break;
            }
            case 2: {
                break;
            }
            case 3: {
                v = 4;
                break;
            }
            case 4: {
                v = 3;
                break;
            }
            case 5: {
                v = 6;
                break;
            }
            case 6: {
                v = 5;
                break;
            }
            case 7: {
                v = 8;
                break;
            }
            case 8: {
                v = 7;
                break;
            }
            default: {
                v = 0;
            }
        }
        this.v0("Orientation", Integer.toString(v));
    }

    private static Long f0(@Nullable String s, @Nullable String s1, @Nullable String s2) {
        if(s != null && ExifInterface.U7.matcher(s).matches()) {
            ParsePosition parsePosition0 = new ParsePosition(0);
            try {
                Date date0 = ExifInterface.m6.parse(s, parsePosition0);
                if(date0 == null) {
                    date0 = ExifInterface.n6.parse(s, parsePosition0);
                    if(date0 == null) {
                        return null;
                    }
                }
                long v = date0.getTime();
                if(s2 != null) {
                    int v1 = 1;
                    String s3 = s2.substring(0, 1);
                    int v2 = Integer.parseInt(s2.substring(1, 3));
                    int v3 = Integer.parseInt(s2.substring(4, 6));
                    if(("+".equals(s3) || "-".equals(s3)) && (":".equals(s2.substring(3, 4)) && v2 <= 14)) {
                        if(!"-".equals(s3)) {
                            v1 = -1;
                        }
                        v += (long)((v2 * 60 + v3) * 60000 * v1);
                    }
                }
                if(s1 != null) {
                    v += ExifInterfaceUtils.g(s1);
                }
                return v;
            }
            catch(IllegalArgumentException unused_ex) {
            }
        }
        return null;
    }

    public void g() {
        int v = 1;
        switch(this.l("Orientation", 1)) {
            case 1: {
                v = 4;
                break;
            }
            case 2: {
                v = 3;
                break;
            }
            case 3: {
                v = 2;
                break;
            }
            case 4: {
                break;
            }
            case 5: {
                v = 8;
                break;
            }
            case 6: {
                v = 7;
                break;
            }
            case 7: {
                v = 6;
                break;
            }
            case 8: {
                v = 5;
                break;
            }
            default: {
                v = 0;
            }
        }
        this.v0("Orientation", Integer.toString(v));
    }

    private void g0(ByteOrderedDataInputStream exifInterface$ByteOrderedDataInputStream0) throws IOException {
        ByteOrder byteOrder0 = this.i0(exifInterface$ByteOrderedDataInputStream0);
        this.h = byteOrder0;
        exifInterface$ByteOrderedDataInputStream0.e(byteOrder0);
        int v = exifInterface$ByteOrderedDataInputStream0.readUnsignedShort();
        if(this.d != 7 && this.d != 10 && v != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(v));
        }
        int v1 = exifInterface$ByteOrderedDataInputStream0.readInt();
        if(v1 < 8) {
            throw new IOException("Invalid first Ifd offset: " + v1);
        }
        if(v1 - 8 > 0) {
            exifInterface$ByteOrderedDataInputStream0.f(v1 - 8);
        }
    }

    public double h(double f) {
        double f1 = this.k("GPSAltitude", -1.0);
        int v = -1;
        int v1 = this.l("GPSAltitudeRef", -1);
        if(f1 >= 0.0 && v1 >= 0) {
            if(v1 != 1) {
                v = 1;
            }
            return f1 * ((double)v);
        }
        return f;
    }

    private void h0() {
        for(int v = 0; v < this.f.length; ++v) {
            Log.d("ExifInterface", "The size of tag group[" + v + "]: " + this.f[v].size());
            for(Object object0: this.f[v].entrySet()) {
                ExifAttribute exifInterface$ExifAttribute0 = (ExifAttribute)((Map.Entry)object0).getValue();
                Log.d("ExifInterface", "tagName: " + ((String)((Map.Entry)object0).getKey()) + ", tagType: " + exifInterface$ExifAttribute0.toString() + ", tagValue: \'" + exifInterface$ExifAttribute0.q(this.h) + "\'");
            }
        }
    }

    @Nullable
    public String i(@NonNull String s) {
        if(s == null) {
            throw new NullPointerException("tag shouldn\'t be null");
        }
        ExifAttribute exifInterface$ExifAttribute0 = this.q(s);
        if(exifInterface$ExifAttribute0 != null) {
            if(!ExifInterface.h7.contains(s)) {
                return exifInterface$ExifAttribute0.q(this.h);
            }
            if(s.equals("GPSTimeStamp")) {
                if(exifInterface$ExifAttribute0.a != 5 && exifInterface$ExifAttribute0.a != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + exifInterface$ExifAttribute0.a);
                    return null;
                }
                Rational[] arr_exifInterface$Rational = (Rational[])exifInterface$ExifAttribute0.r(this.h);
                if(arr_exifInterface$Rational != null && arr_exifInterface$Rational.length == 3) {
                    return String.format("%02d:%02d:%02d", ((int)(((float)arr_exifInterface$Rational[0].a) / ((float)arr_exifInterface$Rational[0].b))), ((int)(((float)arr_exifInterface$Rational[1].a) / ((float)arr_exifInterface$Rational[1].b))), ((int)(((float)arr_exifInterface$Rational[2].a) / ((float)arr_exifInterface$Rational[2].b))));
                }
                Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(arr_exifInterface$Rational));
                return null;
            }
            try {
                return Double.toString(exifInterface$ExifAttribute0.o(this.h));
            }
            catch(NumberFormatException unused_ex) {
            }
        }
        return null;
    }

    private ByteOrder i0(ByteOrderedDataInputStream exifInterface$ByteOrderedDataInputStream0) throws IOException {
        int v = exifInterface$ByteOrderedDataInputStream0.readShort();
        switch(v) {
            case 0x4949: {
                if(ExifInterface.w) {
                    Log.d("ExifInterface", "readExifSegment: Byte Align II");
                }
                return ByteOrder.LITTLE_ENDIAN;
            }
            case 0x4D4D: {
                if(ExifInterface.w) {
                    Log.d("ExifInterface", "readExifSegment: Byte Align MM");
                }
                return ByteOrder.BIG_ENDIAN;
            }
            default: {
                throw new IOException("Invalid byte order: " + Integer.toHexString(v));
            }
        }
    }

    @Nullable
    public byte[] j(@NonNull String s) {
        if(s == null) {
            throw new NullPointerException("tag shouldn\'t be null");
        }
        ExifAttribute exifInterface$ExifAttribute0 = this.q(s);
        return exifInterface$ExifAttribute0 == null ? null : exifInterface$ExifAttribute0.d;
    }

    private void j0(byte[] arr_b, int v) throws IOException {
        SeekableByteOrderedDataInputStream exifInterface$SeekableByteOrderedDataInputStream0 = new SeekableByteOrderedDataInputStream(arr_b);
        this.g0(exifInterface$SeekableByteOrderedDataInputStream0);
        this.k0(exifInterface$SeekableByteOrderedDataInputStream0, v);
    }

    public double k(@NonNull String s, double f) {
        if(s != null) {
            ExifAttribute exifInterface$ExifAttribute0 = this.q(s);
            if(exifInterface$ExifAttribute0 == null) {
                return f;
            }
            try {
                return exifInterface$ExifAttribute0.o(this.h);
            }
            catch(NumberFormatException unused_ex) {
                return f;
            }
        }
        throw new NullPointerException("tag shouldn\'t be null");
    }

    // This method was un-flattened
    private void k0(SeekableByteOrderedDataInputStream exifInterface$SeekableByteOrderedDataInputStream0, int v) throws IOException {
        long v11;
        int v12;
        long v10;
        int v7;
        this.g.add(exifInterface$SeekableByteOrderedDataInputStream0.b());
        int v1 = exifInterface$SeekableByteOrderedDataInputStream0.readShort();
        if(ExifInterface.w) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + v1);
        }
        if(v1 <= 0) {
            return;
        }
        int v2 = 0;
        while(v2 < v1) {
            int v3 = exifInterface$SeekableByteOrderedDataInputStream0.readUnsignedShort();
            int v4 = exifInterface$SeekableByteOrderedDataInputStream0.readUnsignedShort();
            int v5 = exifInterface$SeekableByteOrderedDataInputStream0.readInt();
            long v6 = ((long)exifInterface$SeekableByteOrderedDataInputStream0.b()) + 4L;
            ExifTag exifInterface$ExifTag0 = (ExifTag)ExifInterface.f7[v].get(v3);
            boolean z = ExifInterface.w;
            if(z) {
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", v, v3, (exifInterface$ExifTag0 == null ? null : exifInterface$ExifTag0.b), v4, v5));
            }
            if(exifInterface$ExifTag0 == null) {
                if(z) {
                    Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + v3);
                }
                v7 = v2;
                exifInterface$SeekableByteOrderedDataInputStream0.i(v6);
            }
            else if(v4 > 0) {
                int[] arr_v = ExifInterface.H6;
                if(v4 >= arr_v.length) {
                    v7 = v2;
                    goto label_109;
                }
                else if(!exifInterface$ExifTag0.a(v4)) {
                    if(z) {
                        Log.d("ExifInterface", "Skip the tag entry since data format (" + ExifInterface.G6[v4] + ") is unexpected for tag: " + exifInterface$ExifTag0.b);
                    }
                    v7 = v2;
                    exifInterface$SeekableByteOrderedDataInputStream0.i(v6);
                }
                else {
                    if(v4 == 7) {
                        v4 = exifInterface$ExifTag0.c;
                    }
                    v7 = v2;
                    long v8 = ((long)v5) * ((long)arr_v[v4]);
                    if(v8 >= 0L && v8 <= 0x7FFFFFFFL) {
                        if(v8 > 4L) {
                            int v9 = exifInterface$SeekableByteOrderedDataInputStream0.readInt();
                            if(z) {
                                v10 = v6;
                                Log.d("ExifInterface", "seek to data offset: " + v9);
                            }
                            else {
                                v10 = v6;
                            }
                            if(this.d == 7) {
                                if("MakerNote".equals(exifInterface$ExifTag0.b)) {
                                    this.q = v9;
                                }
                                else if(v == 6 && "ThumbnailImage".equals(exifInterface$ExifTag0.b)) {
                                    this.r = v9;
                                    this.s = v5;
                                    ExifAttribute exifInterface$ExifAttribute0 = ExifAttribute.m(6, this.h);
                                    ExifAttribute exifInterface$ExifAttribute1 = ExifAttribute.i(this.r, this.h);
                                    ExifAttribute exifInterface$ExifAttribute2 = ExifAttribute.i(this.s, this.h);
                                    this.f[4].put("Compression", exifInterface$ExifAttribute0);
                                    this.f[4].put("JPEGInterchangeFormat", exifInterface$ExifAttribute1);
                                    this.f[4].put("JPEGInterchangeFormatLength", exifInterface$ExifAttribute2);
                                }
                            }
                            exifInterface$SeekableByteOrderedDataInputStream0.i(((long)v9));
                        }
                        else {
                            v10 = v6;
                        }
                        Integer integer0 = (Integer)ExifInterface.i7.get(v3);
                        if(z) {
                            Log.d("ExifInterface", "nextIfdType: " + integer0 + " byteCount: " + v8);
                        }
                        if(integer0 == null) {
                            int v13 = exifInterface$SeekableByteOrderedDataInputStream0.b() + this.p;
                            byte[] arr_b = new byte[((int)v8)];
                            exifInterface$SeekableByteOrderedDataInputStream0.readFully(arr_b);
                            ExifAttribute exifInterface$ExifAttribute3 = new ExifAttribute(v4, v5, ((long)v13), arr_b);
                            this.f[v].put(exifInterface$ExifTag0.b, exifInterface$ExifAttribute3);
                            if("DNGVersion".equals(exifInterface$ExifTag0.b)) {
                                this.d = 3;
                            }
                            if(("Make".equals(exifInterface$ExifTag0.b) || "Model".equals(exifInterface$ExifTag0.b)) && exifInterface$ExifAttribute3.q(this.h).contains("PENTAX") || "Compression".equals(exifInterface$ExifTag0.b) && exifInterface$ExifAttribute3.p(this.h) == 0xFFFF) {
                                this.d = 8;
                            }
                            if(((long)exifInterface$SeekableByteOrderedDataInputStream0.b()) != v10) {
                                exifInterface$SeekableByteOrderedDataInputStream0.i(v10);
                            }
                        }
                        else {
                            if(v4 == 3) {
                                v12 = exifInterface$SeekableByteOrderedDataInputStream0.readUnsignedShort();
                            }
                            else {
                                switch(v4) {
                                    case 4: {
                                        v11 = exifInterface$SeekableByteOrderedDataInputStream0.c();
                                        goto label_80;
                                    }
                                    case 8: {
                                        v12 = exifInterface$SeekableByteOrderedDataInputStream0.readShort();
                                        break;
                                    }
                                    default: {
                                        if(v4 == 9 || v4 == 13) {
                                            v12 = exifInterface$SeekableByteOrderedDataInputStream0.readInt();
                                            break;
                                        }
                                        else {
                                            v11 = -1L;
                                            goto label_80;
                                        }
                                        v11 = exifInterface$SeekableByteOrderedDataInputStream0.c();
                                        goto label_80;
                                    }
                                }
                            }
                            v11 = (long)v12;
                        label_80:
                            if(z) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", v11, exifInterface$ExifTag0.b));
                            }
                            if(v11 <= 0L || exifInterface$SeekableByteOrderedDataInputStream0.a() != -1 && v11 >= ((long)exifInterface$SeekableByteOrderedDataInputStream0.a())) {
                                if(z) {
                                    Log.d("ExifInterface", (exifInterface$SeekableByteOrderedDataInputStream0.a() == -1 ? "Skip jump into the IFD since its offset is invalid: " + v11 : "Skip jump into the IFD since its offset is invalid: " + v11 + " (total length: " + exifInterface$SeekableByteOrderedDataInputStream0.a() + ")"));
                                }
                            }
                            else if(!this.g.contains(((int)v11))) {
                                exifInterface$SeekableByteOrderedDataInputStream0.i(v11);
                                this.k0(exifInterface$SeekableByteOrderedDataInputStream0, ((int)integer0));
                            }
                            else if(z) {
                                Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + integer0 + " (at " + v11 + ")");
                            }
                            exifInterface$SeekableByteOrderedDataInputStream0.i(v10);
                        }
                    }
                    else {
                        if(z) {
                            Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + v5);
                        }
                        exifInterface$SeekableByteOrderedDataInputStream0.i(v6);
                    }
                }
            }
            else {
                v7 = v2;
            label_109:
                if(z) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + v4);
                }
                exifInterface$SeekableByteOrderedDataInputStream0.i(v6);
            }
            v2 = (short)(v7 + 1);
        }
        int v14 = exifInterface$SeekableByteOrderedDataInputStream0.readInt();
        boolean z1 = ExifInterface.w;
        if(z1) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", v14));
        }
        if(((long)v14) > 0L) {
            if(!this.g.contains(v14)) {
                exifInterface$SeekableByteOrderedDataInputStream0.i(((long)v14));
                if(this.f[4].isEmpty()) {
                    this.k0(exifInterface$SeekableByteOrderedDataInputStream0, 4);
                    return;
                }
                if(this.f[5].isEmpty()) {
                    this.k0(exifInterface$SeekableByteOrderedDataInputStream0, 5);
                }
            }
            else if(z1) {
                Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + v14);
            }
        }
        else if(z1) {
            Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + v14);
        }
    }

    public int l(@NonNull String s, int v) {
        if(s != null) {
            ExifAttribute exifInterface$ExifAttribute0 = this.q(s);
            if(exifInterface$ExifAttribute0 == null) {
                return v;
            }
            try {
                return exifInterface$ExifAttribute0.p(this.h);
            }
            catch(NumberFormatException unused_ex) {
                return v;
            }
        }
        throw new NullPointerException("tag shouldn\'t be null");
    }

    private void l0(String s) {
        for(int v = 0; v < ExifInterface.d7.length; ++v) {
            this.f[v].remove(s);
        }
    }

    @Nullable
    public long[] m(@NonNull String s) {
        if(s == null) {
            throw new NullPointerException("tag shouldn\'t be null");
        }
        if(this.t) {
            throw new IllegalStateException("The underlying file has been modified since being parsed");
        }
        ExifAttribute exifInterface$ExifAttribute0 = this.q(s);
        return exifInterface$ExifAttribute0 == null ? null : new long[]{exifInterface$ExifAttribute0.c, ((long)exifInterface$ExifAttribute0.d.length)};
    }

    private void m0(int v, String s, String s1) {
        if(!this.f[v].isEmpty() && this.f[v].get(s) != null) {
            HashMap hashMap0 = this.f[v];
            hashMap0.put(s1, hashMap0.get(s));
            this.f[v].remove(s);
        }
    }

    @Nullable
    @RestrictTo({Scope.a})
    public Long n() {
        return ExifInterface.f0(this.i("DateTime"), this.i("SubSecTime"), this.i("OffsetTime"));
    }

    public void n0() {
        this.v0("Orientation", "1");
    }

    @Nullable
    @RestrictTo({Scope.a})
    public Long o() {
        return ExifInterface.f0(this.i("DateTimeDigitized"), this.i("SubSecTimeDigitized"), this.i("OffsetTimeDigitized"));
    }

    private void o0(SeekableByteOrderedDataInputStream exifInterface$SeekableByteOrderedDataInputStream0, int v) throws IOException {
        if(((ExifAttribute)this.f[v].get("ImageLength")) == null || ((ExifAttribute)this.f[v].get("ImageWidth")) == null) {
            ExifAttribute exifInterface$ExifAttribute0 = (ExifAttribute)this.f[v].get("JPEGInterchangeFormat");
            if(exifInterface$ExifAttribute0 != null && ((ExifAttribute)this.f[v].get("JPEGInterchangeFormatLength")) != null) {
                int v1 = exifInterface$ExifAttribute0.p(this.h);
                int v2 = exifInterface$ExifAttribute0.p(this.h);
                exifInterface$SeekableByteOrderedDataInputStream0.i(((long)v1));
                byte[] arr_b = new byte[v2];
                exifInterface$SeekableByteOrderedDataInputStream0.readFully(arr_b);
                this.t(new ByteOrderedDataInputStream(arr_b), v1, v);
            }
        }
    }

    @Nullable
    @RestrictTo({Scope.a})
    public Long p() {
        return ExifInterface.f0(this.i("DateTimeOriginal"), this.i("SubSecTimeOriginal"), this.i("OffsetTimeOriginal"));
    }

    public void p0(int v) {
        if(v % 90 != 0) {
            throw new IllegalArgumentException("degree should be a multiple of 90");
        }
        int v1 = this.l("Orientation", 1);
        List list0 = ExifInterface.M2;
        int v2 = 0;
        if(list0.contains(v1)) {
            int v3 = (list0.indexOf(v1) + v / 90) % 4;
            if(v3 < 0) {
                v2 = 4;
            }
            v2 = (int)(((Integer)list0.get(v3 + v2)));
        }
        else {
            List list1 = ExifInterface.N2;
            if(list1.contains(v1)) {
                int v4 = (list1.indexOf(v1) + v / 90) % 4;
                if(v4 < 0) {
                    v2 = 4;
                }
                v2 = (int)(((Integer)list1.get(v4 + v2)));
            }
        }
        this.v0("Orientation", Integer.toString(v2));
    }

    @Nullable
    private ExifAttribute q(@NonNull String s) {
        if(s == null) {
            throw new NullPointerException("tag shouldn\'t be null");
        }
        if("ISOSpeedRatings".equals(s)) {
            if(ExifInterface.w) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            s = "PhotographicSensitivity";
        }
        for(int v = 0; v < ExifInterface.d7.length; ++v) {
            ExifAttribute exifInterface$ExifAttribute0 = (ExifAttribute)this.f[v].get(s);
            if(exifInterface$ExifAttribute0 != null) {
                return exifInterface$ExifAttribute0;
            }
        }
        return null;
    }

    public void q0() throws IOException {
        FileOutputStream fileOutputStream2;
        Exception exception7;
        Closeable closeable2;
        Exception exception3;
        FileOutputStream fileOutputStream1;
        Closeable closeable1;
        BufferedInputStream bufferedInputStream0;
        FileInputStream fileInputStream1;
        FileInputStream fileInputStream0;
        FileOutputStream fileOutputStream0;
        File file0;
        if(!ExifInterface.Z(this.d)) {
            throw new IOException("ExifInterface only supports saving attributes for JPEG, PNG, and WebP formats.");
        }
        if(this.b == null && this.a == null) {
            throw new IOException("ExifInterface does not support saving attributes for the current input.");
        }
        if(this.i && this.j && !this.k) {
            throw new IOException("ExifInterface does not support saving attributes when the image file has non-consecutive thumbnail strips");
        }
        this.t = true;
        this.n = this.E();
        Closeable closeable0 = null;
        try {
            file0 = File.createTempFile("temp", "tmp");
            if(this.a == null) {
                Api21Impl.c(this.b, 0L, OsConstants.SEEK_SET);
                fileInputStream0 = new FileInputStream(this.b);
            }
            else {
                fileInputStream0 = new FileInputStream(this.a);
            }
        }
        catch(Exception exception0) {
            fileOutputStream0 = null;
            throw new IOException("Failed to copy original file to temp file", exception0);
        }
        catch(Throwable throwable0) {
            fileOutputStream0 = null;
            ExifInterfaceUtils.c(closeable0);
            ExifInterfaceUtils.c(fileOutputStream0);
            throw throwable0;
        }
        try {
            fileOutputStream0 = null;
            fileOutputStream0 = new FileOutputStream(file0);
            ExifInterfaceUtils.e(fileInputStream0, fileOutputStream0);
            goto label_35;
        }
        catch(Exception exception0) {
            closeable0 = fileInputStream0;
            try {
                throw new IOException("Failed to copy original file to temp file", exception0);
            }
            catch(Throwable throwable0) {
            }
        }
        catch(Throwable throwable0) {
            closeable0 = fileInputStream0;
        }
        ExifInterfaceUtils.c(closeable0);
        ExifInterfaceUtils.c(fileOutputStream0);
        throw throwable0;
    label_35:
        ExifInterfaceUtils.c(fileInputStream0);
        ExifInterfaceUtils.c(fileOutputStream0);
        boolean z = false;
        try {
            fileInputStream1 = new FileInputStream(file0);
            goto label_44;
        }
        catch(Exception exception1) {
            bufferedInputStream0 = null;
            closeable1 = null;
            exception3 = exception1;
            fileOutputStream1 = null;
            goto label_90;
            try {
                try {
                label_44:
                    if(this.a == null) {
                        Api21Impl.c(this.b, 0L, OsConstants.SEEK_SET);
                        fileOutputStream1 = new FileOutputStream(this.b);
                    }
                    else {
                        fileOutputStream1 = new FileOutputStream(this.a);
                    }
                }
                catch(Exception exception1) {
                    goto label_61;
                }
                try {
                    bufferedInputStream0 = new BufferedInputStream(fileInputStream1);
                }
                catch(Exception exception2) {
                    closeable1 = null;
                    closeable0 = fileInputStream1;
                    exception3 = exception2;
                    bufferedInputStream0 = null;
                    goto label_90;
                }
            }
            catch(Throwable throwable1) {
                closeable1 = null;
                goto label_121;
            }
        }
        catch(Throwable throwable1) {
            try {
                closeable1 = null;
                goto label_121;
            label_61:
                bufferedInputStream0 = null;
                closeable1 = null;
                closeable0 = fileInputStream1;
                exception3 = exception1;
                fileOutputStream1 = null;
                goto label_90;
            }
            catch(Exception exception1) {
                goto label_61;
            }
            catch(Throwable throwable1) {
                closeable1 = null;
                goto label_121;
            }
        }
        try {
            closeable1 = null;
            closeable1 = new BufferedOutputStream(fileOutputStream1);
            goto label_74;
        }
        catch(Exception exception4) {
        }
        catch(Throwable throwable1) {
            closeable0 = bufferedInputStream0;
            goto label_121;
        }
        closeable0 = fileInputStream1;
        exception3 = exception4;
        goto label_90;
        try {
        label_74:
            int v = this.d;
            if(v == 4) {
                this.r0(bufferedInputStream0, ((OutputStream)closeable1));
            }
            else {
                switch(v) {
                    case 13: {
                        this.s0(bufferedInputStream0, ((OutputStream)closeable1));
                        break;
                    }
                    case 14: {
                        this.t0(bufferedInputStream0, ((OutputStream)closeable1));
                    }
                }
            }
            goto label_126;
        }
        catch(Exception exception5) {
            exception3 = exception5;
            closeable0 = fileInputStream1;
        }
        catch(Throwable throwable1) {
            closeable0 = bufferedInputStream0;
            goto label_121;
        }
        try {
        label_90:
            closeable2 = closeable0;
            closeable2 = new FileInputStream(file0);
        }
        catch(Exception exception6) {
            exception7 = exception6;
            throw new IOException("Failed to save new file. Original file is stored in " + file0.getAbsolutePath(), exception7);
        }
        catch(Throwable throwable2) {
            goto label_115;
        }
        try {
            if(this.a == null) {
                Api21Impl.c(this.b, 0L, OsConstants.SEEK_SET);
                fileOutputStream2 = new FileOutputStream(this.b);
            }
            else {
                fileOutputStream2 = new FileOutputStream(this.a);
            }
            fileOutputStream1 = fileOutputStream2;
            ExifInterfaceUtils.e(((InputStream)closeable2), fileOutputStream1);
            goto label_118;
        }
        catch(Exception exception7) {
        }
        catch(Throwable throwable2) {
            closeable0 = closeable2;
            goto label_115;
        }
        try {
            throw new IOException("Failed to save new file. Original file is stored in " + file0.getAbsolutePath(), exception7);
        }
        catch(Throwable throwable3) {
            throwable2 = throwable3;
            closeable0 = closeable2;
            z = true;
        }
        try {
        label_115:
            ExifInterfaceUtils.c(closeable0);
            ExifInterfaceUtils.c(fileOutputStream1);
            throw throwable2;
        label_118:
            ExifInterfaceUtils.c(closeable2);
            ExifInterfaceUtils.c(fileOutputStream1);
            throw new IOException("Failed to save new file", exception3);
        }
        catch(Throwable throwable1) {
            closeable0 = bufferedInputStream0;
        }
    label_121:
        ExifInterfaceUtils.c(closeable0);
        ExifInterfaceUtils.c(closeable1);
        if(!z) {
            file0.delete();
        }
        throw throwable1;
    label_126:
        ExifInterfaceUtils.c(bufferedInputStream0);
        ExifInterfaceUtils.c(closeable1);
        file0.delete();
        this.n = null;
    }

    @SuppressLint({"AutoBoxing"})
    @Nullable
    public Long r() {
        String s = this.i("GPSDateStamp");
        String s1 = this.i("GPSTimeStamp");
        if(s != null && s1 != null && (ExifInterface.U7.matcher(s).matches() || ExifInterface.U7.matcher(s1).matches())) {
            String s2 = s + ' ' + s1;
            ParsePosition parsePosition0 = new ParsePosition(0);
            try {
                Date date0 = ExifInterface.m6.parse(s2, parsePosition0);
                if(date0 == null) {
                    date0 = ExifInterface.n6.parse(s2, parsePosition0);
                    return date0 == null ? null : date0.getTime();
                }
                return date0.getTime();
            }
            catch(IllegalArgumentException unused_ex) {
            }
        }
        return null;
    }

    private void r0(InputStream inputStream0, OutputStream outputStream0) throws IOException {
        if(ExifInterface.w) {
            Log.d("ExifInterface", "saveJpegAttributes starting with (inputStream: " + inputStream0 + ", outputStream: " + outputStream0 + ")");
        }
        ByteOrderedDataInputStream exifInterface$ByteOrderedDataInputStream0 = new ByteOrderedDataInputStream(inputStream0);
        ByteOrderedDataOutputStream exifInterface$ByteOrderedDataOutputStream0 = new ByteOrderedDataOutputStream(outputStream0, ByteOrder.BIG_ENDIAN);
        if(exifInterface$ByteOrderedDataInputStream0.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        exifInterface$ByteOrderedDataOutputStream0.writeByte(-1);
        if(exifInterface$ByteOrderedDataInputStream0.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        exifInterface$ByteOrderedDataOutputStream0.writeByte(-40);
        ExifAttribute exifInterface$ExifAttribute0 = this.i("Xmp") == null || !this.u ? null : ((ExifAttribute)this.f[0].remove("Xmp"));
        exifInterface$ByteOrderedDataOutputStream0.writeByte(-1);
        exifInterface$ByteOrderedDataOutputStream0.writeByte(0xFFFFFFE1);
        this.E0(exifInterface$ByteOrderedDataOutputStream0);
        if(exifInterface$ExifAttribute0 != null) {
            this.f[0].put("Xmp", exifInterface$ExifAttribute0);
        }
        byte[] arr_b = new byte[0x1000];
        while(exifInterface$ByteOrderedDataInputStream0.readByte() == -1) {
            int v = exifInterface$ByteOrderedDataInputStream0.readByte();
            switch(v) {
                case -39: 
                case -38: {
                    exifInterface$ByteOrderedDataOutputStream0.writeByte(-1);
                    exifInterface$ByteOrderedDataOutputStream0.writeByte(v);
                    ExifInterfaceUtils.e(exifInterface$ByteOrderedDataInputStream0, exifInterface$ByteOrderedDataOutputStream0);
                    return;
                }
                case 0xFFFFFFE1: {
                    goto label_37;
                }
            }
            exifInterface$ByteOrderedDataOutputStream0.writeByte(-1);
            exifInterface$ByteOrderedDataOutputStream0.writeByte(v);
            int v1 = exifInterface$ByteOrderedDataInputStream0.readUnsignedShort();
            exifInterface$ByteOrderedDataOutputStream0.f(v1);
            int v2 = v1 - 2;
            if(v2 < 0) {
                throw new IOException("Invalid length");
            }
            while(v2 > 0) {
                int v3 = exifInterface$ByteOrderedDataInputStream0.read(arr_b, 0, Math.min(v2, 0x1000));
                if(v3 < 0) {
                    break;
                }
                exifInterface$ByteOrderedDataOutputStream0.write(arr_b, 0, v3);
                v2 -= v3;
            }
            continue;
        label_37:
            int v4 = exifInterface$ByteOrderedDataInputStream0.readUnsignedShort();
            int v5 = v4 - 2;
            if(v5 < 0) {
                throw new IOException("Invalid length");
            }
            byte[] arr_b1 = new byte[6];
            if(v5 >= 6) {
                exifInterface$ByteOrderedDataInputStream0.readFully(arr_b1);
                if(Arrays.equals(arr_b1, ExifInterface.k7)) {
                    exifInterface$ByteOrderedDataInputStream0.f(v4 - 8);
                    continue;
                }
            }
            exifInterface$ByteOrderedDataOutputStream0.writeByte(-1);
            exifInterface$ByteOrderedDataOutputStream0.writeByte(0xFFFFFFE1);
            exifInterface$ByteOrderedDataOutputStream0.f(v4);
            if(v5 >= 6) {
                v5 = v4 - 8;
                exifInterface$ByteOrderedDataOutputStream0.write(arr_b1);
            }
        label_52:
            if(v5 <= 0) {
                continue;
            }
            int v6 = exifInterface$ByteOrderedDataInputStream0.read(arr_b, 0, Math.min(v5, 0x1000));
            if(v6 < 0) {
                continue;
            }
            exifInterface$ByteOrderedDataOutputStream0.write(arr_b, 0, v6);
            v5 -= v6;
            goto label_52;
        }
        throw new IOException("Invalid marker");
    }

    private void s(SeekableByteOrderedDataInputStream exifInterface$SeekableByteOrderedDataInputStream0) throws IOException {
        int v1;
        String s6;
        String s5;
        String s4;
        if(Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever0 = new MediaMetadataRetriever();
        try {
            Api23Impl.a(mediaMetadataRetriever0, new MediaDataSource() {
                long a;
                final ExifInterface c;

                @Override
                public void close() throws IOException {
                }

                @Override  // android.media.MediaDataSource
                public long getSize() throws IOException {
                    return -1L;
                }

                @Override  // android.media.MediaDataSource
                public int readAt(long v, byte[] arr_b, int v1, int v2) throws IOException {
                    if(v2 == 0) {
                        return 0;
                    }
                    if(v < 0L) {
                        return -1;
                    }
                    try {
                        long v3 = this.a;
                        if(v3 != v) {
                            if(v3 >= 0L && v >= v3 + ((long)exifInterface$SeekableByteOrderedDataInputStream0.available())) {
                                return -1;
                            }
                            exifInterface$SeekableByteOrderedDataInputStream0.i(v);
                            this.a = v;
                        }
                        if(v2 > exifInterface$SeekableByteOrderedDataInputStream0.available()) {
                            v2 = exifInterface$SeekableByteOrderedDataInputStream0.available();
                        }
                        int v4 = exifInterface$SeekableByteOrderedDataInputStream0.read(arr_b, v1, v2);
                        if(v4 >= 0) {
                            this.a += (long)v4;
                            return v4;
                        }
                    }
                    catch(IOException unused_ex) {
                    }
                    this.a = -1L;
                    return -1;
                }
            });
            String s = mediaMetadataRetriever0.extractMetadata(33);
            String s1 = mediaMetadataRetriever0.extractMetadata(34);
            String s2 = mediaMetadataRetriever0.extractMetadata(26);
            String s3 = mediaMetadataRetriever0.extractMetadata(17);
            if("yes".equals(s2)) {
                s4 = mediaMetadataRetriever0.extractMetadata(29);
                s5 = mediaMetadataRetriever0.extractMetadata(30);
                s6 = mediaMetadataRetriever0.extractMetadata(0x1F);
            }
            else if("yes".equals(s3)) {
                s4 = mediaMetadataRetriever0.extractMetadata(18);
                s5 = mediaMetadataRetriever0.extractMetadata(19);
                s6 = mediaMetadataRetriever0.extractMetadata(24);
            }
            else {
                s4 = null;
                s5 = null;
                s6 = null;
            }
            if(s4 != null) {
                this.f[0].put("ImageWidth", ExifAttribute.m(Integer.parseInt(s4), this.h));
            }
            if(s5 != null) {
                this.f[0].put("ImageLength", ExifAttribute.m(Integer.parseInt(s5), this.h));
            }
            if(s6 != null) {
                switch(Integer.parseInt(s6)) {
                    case 90: {
                        v1 = 6;
                        break;
                    }
                    case 180: {
                        v1 = 3;
                        break;
                    }
                    case 270: {
                        v1 = 8;
                        break;
                    }
                    default: {
                        v1 = 1;
                    }
                }
                this.f[0].put("Orientation", ExifAttribute.m(v1, this.h));
            }
            if(s != null && s1 != null) {
                int v2 = Integer.parseInt(s);
                int v3 = Integer.parseInt(s1);
                if(v3 <= 6) {
                    throw new IOException("Invalid exif length");
                }
                exifInterface$SeekableByteOrderedDataInputStream0.i(((long)v2));
                byte[] arr_b = new byte[6];
                exifInterface$SeekableByteOrderedDataInputStream0.readFully(arr_b);
                if(!Arrays.equals(arr_b, ExifInterface.k7)) {
                    throw new IOException("Invalid identifier");
                }
                byte[] arr_b1 = new byte[v3 - 6];
                exifInterface$SeekableByteOrderedDataInputStream0.readFully(arr_b1);
                this.p = v2 + 6;
                this.j0(arr_b1, 0);
            }
            if(ExifInterface.w) {
                Log.d("ExifInterface", "Heif meta: " + s4 + "x" + s5 + ", rotation " + s6);
            }
        }
        catch(RuntimeException unused_ex) {
            throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
        }
        finally {
            mediaMetadataRetriever0.release();
        }
    }

    private void s0(InputStream inputStream0, OutputStream outputStream0) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream0;
        if(ExifInterface.w) {
            Log.d("ExifInterface", "savePngAttributes starting with (inputStream: " + inputStream0 + ", outputStream: " + outputStream0 + ")");
        }
        ByteOrderedDataInputStream exifInterface$ByteOrderedDataInputStream0 = new ByteOrderedDataInputStream(inputStream0);
        ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
        ByteOrderedDataOutputStream exifInterface$ByteOrderedDataOutputStream0 = new ByteOrderedDataOutputStream(outputStream0, byteOrder0);
        byte[] arr_b = ExifInterface.S5;
        ExifInterfaceUtils.f(exifInterface$ByteOrderedDataInputStream0, exifInterface$ByteOrderedDataOutputStream0, arr_b.length);
        int v = this.p;
        if(v == 0) {
            int v1 = exifInterface$ByteOrderedDataInputStream0.readInt();
            exifInterface$ByteOrderedDataOutputStream0.b(v1);
            ExifInterfaceUtils.f(exifInterface$ByteOrderedDataInputStream0, exifInterface$ByteOrderedDataOutputStream0, v1 + 8);
        }
        else {
            ExifInterfaceUtils.f(exifInterface$ByteOrderedDataInputStream0, exifInterface$ByteOrderedDataOutputStream0, v - arr_b.length - 8);
            exifInterface$ByteOrderedDataInputStream0.f(exifInterface$ByteOrderedDataInputStream0.readInt() + 8);
        }
        try {
            byteArrayOutputStream0 = new ByteArrayOutputStream();
            ByteOrderedDataOutputStream exifInterface$ByteOrderedDataOutputStream1 = new ByteOrderedDataOutputStream(byteArrayOutputStream0, byteOrder0);
            this.E0(exifInterface$ByteOrderedDataOutputStream1);
            byte[] arr_b1 = ((ByteArrayOutputStream)exifInterface$ByteOrderedDataOutputStream1.a).toByteArray();
            exifInterface$ByteOrderedDataOutputStream0.write(arr_b1);
            CRC32 cRC320 = new CRC32();
            cRC320.update(arr_b1, 4, arr_b1.length - 4);
            exifInterface$ByteOrderedDataOutputStream0.b(((int)cRC320.getValue()));
        }
        finally {
            ExifInterfaceUtils.c(byteArrayOutputStream0);
        }
        ExifInterfaceUtils.e(exifInterface$ByteOrderedDataInputStream0, exifInterface$ByteOrderedDataOutputStream0);
    }

    private void t(ByteOrderedDataInputStream exifInterface$ByteOrderedDataInputStream0, int v, int v1) throws IOException {
        if(ExifInterface.w) {
            Log.d("ExifInterface", "getJpegAttributes starting with: " + exifInterface$ByteOrderedDataInputStream0);
        }
        exifInterface$ByteOrderedDataInputStream0.e(ByteOrder.BIG_ENDIAN);
        int v2 = exifInterface$ByteOrderedDataInputStream0.readByte();
        if(v2 != -1) {
            throw new IOException("Invalid marker: " + Integer.toHexString(v2 & 0xFF));
        }
        if(exifInterface$ByteOrderedDataInputStream0.readByte() != -40) {
            throw new IOException("Invalid marker: ff");
        }
        for(int v3 = 2; true; v3 = v8 + v7) {
            int v4 = exifInterface$ByteOrderedDataInputStream0.readByte();
            if(v4 != -1) {
                throw new IOException("Invalid marker:" + Integer.toHexString(v4 & 0xFF));
            }
            int v5 = exifInterface$ByteOrderedDataInputStream0.readByte();
            boolean z = ExifInterface.w;
            if(z) {
                Log.d("ExifInterface", "Found JPEG segment indicator: " + Integer.toHexString(v5 & 0xFF));
            }
            if(v5 == -39 || v5 == -38) {
                exifInterface$ByteOrderedDataInputStream0.e(this.h);
                return;
            }
            int v6 = exifInterface$ByteOrderedDataInputStream0.readUnsignedShort();
            int v7 = v6 - 2;
            int v8 = v3 + 4;
            if(z) {
                Log.d("ExifInterface", "JPEG segment: " + Integer.toHexString(v5 & 0xFF) + " (length: " + v6 + ")");
            }
            if(v7 < 0) {
                throw new IOException("Invalid length");
            }
            switch(v5) {
                case 0xFFFFFFE1: {
                    byte[] arr_b = new byte[v7];
                    exifInterface$ByteOrderedDataInputStream0.readFully(arr_b);
                    byte[] arr_b1 = ExifInterface.k7;
                    if(ExifInterfaceUtils.h(arr_b, arr_b1)) {
                        byte[] arr_b2 = Arrays.copyOfRange(arr_b, arr_b1.length, v7);
                        this.p = v + v8 + arr_b1.length;
                        this.j0(arr_b2, v1);
                        this.z0(new ByteOrderedDataInputStream(arr_b2));
                    }
                    else {
                        byte[] arr_b3 = ExifInterface.l7;
                        if(ExifInterfaceUtils.h(arr_b, arr_b3)) {
                            int v9 = v8 + arr_b3.length;
                            byte[] arr_b4 = Arrays.copyOfRange(arr_b, arr_b3.length, v7);
                            if(this.i("Xmp") == null) {
                                this.f[0].put("Xmp", new ExifAttribute(1, arr_b4.length, ((long)v9), arr_b4));
                                this.u = true;
                            }
                        }
                    }
                    v8 += v7;
                    v7 = 0;
                    break;
                }
                case -2: {
                    byte[] arr_b5 = new byte[v7];
                    exifInterface$ByteOrderedDataInputStream0.readFully(arr_b5);
                    if(this.i("UserComment") == null) {
                        this.f[1].put("UserComment", ExifAttribute.h(new String(arr_b5, ExifInterface.j7)));
                    }
                    v7 = 0;
                    break;
                }
                default: {
                    if(v5 == 0xFFFFFFC0 || v5 == 0xFFFFFFC1 || v5 == -62 || v5 == -61 || (v5 == -59 || v5 == -58 || v5 == -57) || (v5 == -55 || v5 == -54 || v5 == -53) || (v5 == -51 || v5 == -50 || v5 == -49)) {
                        exifInterface$ByteOrderedDataInputStream0.f(1);
                        this.f[v1].put((v1 == 4 ? "ThumbnailImageLength" : "ImageLength"), ExifAttribute.i(exifInterface$ByteOrderedDataInputStream0.readUnsignedShort(), this.h));
                        this.f[v1].put((v1 == 4 ? "ThumbnailImageWidth" : "ImageWidth"), ExifAttribute.i(exifInterface$ByteOrderedDataInputStream0.readUnsignedShort(), this.h));
                        v7 = v6 - 7;
                    }
                }
            }
            if(v7 < 0) {
                break;
            }
            exifInterface$ByteOrderedDataInputStream0.f(v7);
        }
        throw new IOException("Invalid length");
    }

    private void t0(InputStream inputStream0, OutputStream outputStream0) throws IOException {
        int v10;
        int v9;
        int v8;
        ByteArrayOutputStream byteArrayOutputStream0;
        if(ExifInterface.w) {
            Log.d("ExifInterface", "saveWebpAttributes starting with (inputStream: " + inputStream0 + ", outputStream: " + outputStream0 + ")");
        }
        ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
        ByteOrderedDataInputStream exifInterface$ByteOrderedDataInputStream0 = new ByteOrderedDataInputStream(inputStream0, byteOrder0);
        ByteOrderedDataOutputStream exifInterface$ByteOrderedDataOutputStream0 = new ByteOrderedDataOutputStream(outputStream0, byteOrder0);
        byte[] arr_b = ExifInterface.Y5;
        ExifInterfaceUtils.f(exifInterface$ByteOrderedDataInputStream0, exifInterface$ByteOrderedDataOutputStream0, arr_b.length);
        byte[] arr_b1 = ExifInterface.Z5;
        exifInterface$ByteOrderedDataInputStream0.f(arr_b1.length + 4);
        try {
            byteArrayOutputStream0 = new ByteArrayOutputStream();
            ByteOrderedDataOutputStream exifInterface$ByteOrderedDataOutputStream1 = new ByteOrderedDataOutputStream(byteArrayOutputStream0, byteOrder0);
            int v1 = this.p;
            if(v1 == 0) {
                byte[] arr_b2 = new byte[4];
                exifInterface$ByteOrderedDataInputStream0.readFully(arr_b2);
                byte[] arr_b3 = ExifInterface.e6;
                boolean z = false;
                boolean z1 = true;
                if(Arrays.equals(arr_b2, arr_b3)) {
                    int v3 = exifInterface$ByteOrderedDataInputStream0.readInt();
                    byte[] arr_b4 = new byte[(v3 % 2 == 1 ? v3 + 1 : v3)];
                    exifInterface$ByteOrderedDataInputStream0.readFully(arr_b4);
                    byte b = (byte)(8 | arr_b4[0]);
                    arr_b4[0] = b;
                    if((b >> 1 & 1) == 1) {
                        z = true;
                    }
                    exifInterface$ByteOrderedDataOutputStream1.write(arr_b3);
                    exifInterface$ByteOrderedDataOutputStream1.b(v3);
                    exifInterface$ByteOrderedDataOutputStream1.write(arr_b4);
                    if(z) {
                        this.d(exifInterface$ByteOrderedDataInputStream0, exifInterface$ByteOrderedDataOutputStream1, ExifInterface.h6, null);
                        while(true) {
                            byte[] arr_b5 = new byte[4];
                            try {
                                exifInterface$ByteOrderedDataInputStream0.readFully(arr_b5);
                                int v4 = 1;
                                v4 = !Arrays.equals(arr_b5, ExifInterface.i6);
                            }
                            catch(EOFException unused_ex) {
                            }
                            if(v4 != 0) {
                                this.E0(exifInterface$ByteOrderedDataOutputStream1);
                                break;
                            }
                            this.e(exifInterface$ByteOrderedDataInputStream0, exifInterface$ByteOrderedDataOutputStream1, arr_b5);
                        }
                    }
                    else {
                        this.d(exifInterface$ByteOrderedDataInputStream0, exifInterface$ByteOrderedDataOutputStream1, ExifInterface.g6, ExifInterface.f6);
                        this.E0(exifInterface$ByteOrderedDataOutputStream1);
                    }
                }
                else {
                    byte[] arr_b6 = ExifInterface.g6;
                    if(Arrays.equals(arr_b2, arr_b6) || Arrays.equals(arr_b2, ExifInterface.f6)) {
                        int v5 = exifInterface$ByteOrderedDataInputStream0.readInt();
                        int v6 = v5 % 2 == 1 ? v5 + 1 : v5;
                        byte[] arr_b7 = new byte[3];
                        if(Arrays.equals(arr_b2, arr_b6)) {
                            exifInterface$ByteOrderedDataInputStream0.readFully(arr_b7);
                            byte[] arr_b8 = new byte[3];
                            exifInterface$ByteOrderedDataInputStream0.readFully(arr_b8);
                            if(!Arrays.equals(ExifInterface.c6, arr_b8)) {
                                throw new IOException("Error checking VP8 signature");
                            }
                            int v7 = exifInterface$ByteOrderedDataInputStream0.readInt();
                            v8 = v7 << 2 >> 18;
                            v6 -= 10;
                            v9 = v7 << 18 >> 18;
                            v10 = v7;
                            z1 = false;
                        }
                        else if(Arrays.equals(arr_b2, ExifInterface.f6)) {
                            if(exifInterface$ByteOrderedDataInputStream0.readByte() != 0x2F) {
                                throw new IOException("Error checking VP8L signature");
                            }
                            v10 = exifInterface$ByteOrderedDataInputStream0.readInt();
                            v9 = (v10 & 0x3FFF) + 1;
                            v8 = ((v10 & 0xFFFC000) >>> 14) + 1;
                            if((v10 & 0x10000000) == 0) {
                                z1 = false;
                            }
                            v6 -= 5;
                        }
                        else {
                            v9 = 0;
                            z1 = false;
                            v10 = 0;
                            v8 = 0;
                        }
                        exifInterface$ByteOrderedDataOutputStream1.write(arr_b3);
                        exifInterface$ByteOrderedDataOutputStream1.b(10);
                        byte[] arr_b9 = new byte[10];
                        if(z1) {
                            arr_b9[0] = (byte)(arr_b9[0] | 16);
                        }
                        arr_b9[0] = (byte)(arr_b9[0] | 8);
                        arr_b9[4] = (byte)(v9 - 1);
                        arr_b9[5] = (byte)(v9 - 1 >> 8);
                        arr_b9[6] = (byte)(v9 - 1 >> 16);
                        arr_b9[7] = (byte)(v8 - 1);
                        arr_b9[8] = (byte)(v8 - 1 >> 8);
                        arr_b9[9] = (byte)(v8 - 1 >> 16);
                        exifInterface$ByteOrderedDataOutputStream1.write(arr_b9);
                        exifInterface$ByteOrderedDataOutputStream1.write(arr_b2);
                        exifInterface$ByteOrderedDataOutputStream1.b(v5);
                        if(Arrays.equals(arr_b2, arr_b6)) {
                            exifInterface$ByteOrderedDataOutputStream1.write(arr_b7);
                            exifInterface$ByteOrderedDataOutputStream1.write(ExifInterface.c6);
                            exifInterface$ByteOrderedDataOutputStream1.b(v10);
                        }
                        else if(Arrays.equals(arr_b2, ExifInterface.f6)) {
                            exifInterface$ByteOrderedDataOutputStream1.write(0x2F);
                            exifInterface$ByteOrderedDataOutputStream1.b(v10);
                        }
                        ExifInterfaceUtils.f(exifInterface$ByteOrderedDataInputStream0, exifInterface$ByteOrderedDataOutputStream1, v6);
                        this.E0(exifInterface$ByteOrderedDataOutputStream1);
                    }
                }
            }
            else {
                ExifInterfaceUtils.f(exifInterface$ByteOrderedDataInputStream0, exifInterface$ByteOrderedDataOutputStream1, v1 - (arr_b.length + 4 + arr_b1.length) - 8);
                exifInterface$ByteOrderedDataInputStream0.f(4);
                int v2 = exifInterface$ByteOrderedDataInputStream0.readInt();
                if(v2 % 2 != 0) {
                    ++v2;
                }
                exifInterface$ByteOrderedDataInputStream0.f(v2);
                this.E0(exifInterface$ByteOrderedDataOutputStream1);
            }
            ExifInterfaceUtils.e(exifInterface$ByteOrderedDataInputStream0, exifInterface$ByteOrderedDataOutputStream1);
            exifInterface$ByteOrderedDataOutputStream0.b(byteArrayOutputStream0.size() + ExifInterface.Z5.length);
            exifInterface$ByteOrderedDataOutputStream0.write(ExifInterface.Z5);
            byteArrayOutputStream0.writeTo(exifInterface$ByteOrderedDataOutputStream0);
        }
        catch(Exception exception0) {
            throw new IOException("Failed to save WebP file", exception0);
        }
        finally {
            ExifInterfaceUtils.c(byteArrayOutputStream0);
        }
    }

    @Deprecated
    public boolean u(float[] arr_f) {
        double[] arr_f1 = this.v();
        if(arr_f1 == null) {
            return false;
        }
        arr_f[0] = (float)arr_f1[0];
        arr_f[1] = (float)arr_f1[1];
        return true;
    }

    public void u0(double f) {
        this.v0("GPSAltitude", new Rational(Math.abs(f)).toString());
        this.v0("GPSAltitudeRef", (f >= 0.0 ? "0" : "1"));
    }

    @Nullable
    public double[] v() {
        String s = this.i("GPSLatitude");
        String s1 = this.i("GPSLatitudeRef");
        String s2 = this.i("GPSLongitude");
        String s3 = this.i("GPSLongitudeRef");
        if(s != null && s1 != null && s2 != null && s3 != null) {
            try {
                return new double[]{ExifInterface.c(s, s1), ExifInterface.c(s2, s3)};
            }
            catch(IllegalArgumentException unused_ex) {
                Log.w("ExifInterface", "Latitude/longitude values are not parsable. " + String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", s, s1, s2, s3));
            }
        }
        return null;
    }

    public void v0(@NonNull String s, @Nullable String s1) {
        int v1;
        String s2 = s1;
        if(s == null) {
            throw new NullPointerException("tag shouldn\'t be null");
        }
        if(("DateTime".equals(s) || "DateTimeOriginal".equals(s) || "DateTimeDigitized".equals(s)) && s2 != null) {
            boolean z = ExifInterface.W7.matcher(s2).find();
            boolean z1 = ExifInterface.X7.matcher(s2).find();
            if(s1.length() != 19 || !z && !z1) {
                Log.w("ExifInterface", "Invalid value for " + s + " : " + s2);
                return;
            }
            else if(z1) {
                s2 = s2.replaceAll("-", ":");
            }
        }
        if("ISOSpeedRatings".equals(s)) {
            if(ExifInterface.w) {
                Log.d("ExifInterface", "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            s = "PhotographicSensitivity";
        }
        if(s2 != null && ExifInterface.h7.contains(s)) {
            if(s.equals("GPSTimeStamp")) {
                Matcher matcher0 = ExifInterface.V7.matcher(s2);
                if(!matcher0.find()) {
                    Log.w("ExifInterface", "Invalid value for " + s + " : " + s2);
                    return;
                }
                s2 = Integer.parseInt(matcher0.group(1)) + "/1," + Integer.parseInt(matcher0.group(2)) + "/1," + Integer.parseInt(matcher0.group(3)) + "/1";
            }
            else {
                try {
                    s2 = new Rational(Double.parseDouble(s2)).toString();
                }
                catch(NumberFormatException unused_ex) {
                    Log.w("ExifInterface", "Invalid value for " + s + " : " + s2);
                    return;
                }
            }
        }
        int v = 0;
        while(v < ExifInterface.d7.length) {
            if(v != 4 || this.i) {
                ExifTag exifInterface$ExifTag0 = (ExifTag)ExifInterface.g7[v].get(s);
                if(exifInterface$ExifTag0 != null) {
                    if(s2 == null) {
                        this.f[v].remove(s);
                    }
                    else {
                        Pair pair0 = ExifInterface.J(s2);
                        if(exifInterface$ExifTag0.c == ((int)(((Integer)pair0.first))) || exifInterface$ExifTag0.c == ((int)(((Integer)pair0.second)))) {
                            v1 = exifInterface$ExifTag0.c;
                        label_62:
                            switch(v1) {
                                case 1: {
                                    this.f[v].put(s, ExifAttribute.a(s2));
                                    break;
                                }
                                case 3: {
                                    String[] arr_s1 = s2.split(",", -1);
                                    int[] arr_v = new int[arr_s1.length];
                                    for(int v3 = 0; v3 < arr_s1.length; ++v3) {
                                        arr_v[v3] = Integer.parseInt(arr_s1[v3]);
                                    }
                                    this.f[v].put(s, ExifAttribute.n(arr_v, this.h));
                                    break;
                                }
                                case 4: {
                                    String[] arr_s2 = s2.split(",", -1);
                                    long[] arr_v1 = new long[arr_s2.length];
                                    for(int v4 = 0; v4 < arr_s2.length; ++v4) {
                                        arr_v1[v4] = Long.parseLong(arr_s2[v4]);
                                    }
                                    this.f[v].put(s, ExifAttribute.j(arr_v1, this.h));
                                    break;
                                }
                                case 5: {
                                    String[] arr_s3 = s2.split(",", -1);
                                    Rational[] arr_exifInterface$Rational = new Rational[arr_s3.length];
                                    for(int v5 = 0; v5 < arr_s3.length; ++v5) {
                                        String[] arr_s4 = arr_s3[v5].split("/", -1);
                                        arr_exifInterface$Rational[v5] = new Rational(((long)Double.parseDouble(arr_s4[0])), ((long)Double.parseDouble(arr_s4[1])));
                                    }
                                    this.f[v].put(s, ExifAttribute.l(arr_exifInterface$Rational, this.h));
                                    break;
                                }
                                case 2: 
                                case 7: {
                                    this.f[v].put(s, ExifAttribute.h(s2));
                                    break;
                                }
                                case 9: {
                                    String[] arr_s5 = s2.split(",", -1);
                                    int[] arr_v2 = new int[arr_s5.length];
                                    for(int v6 = 0; v6 < arr_s5.length; ++v6) {
                                        arr_v2[v6] = Integer.parseInt(arr_s5[v6]);
                                    }
                                    this.f[v].put(s, ExifAttribute.e(arr_v2, this.h));
                                    break;
                                }
                                case 10: {
                                    String[] arr_s6 = s2.split(",", -1);
                                    Rational[] arr_exifInterface$Rational1 = new Rational[arr_s6.length];
                                    for(int v7 = 0; v7 < arr_s6.length; ++v7) {
                                        String[] arr_s7 = arr_s6[v7].split("/", -1);
                                        arr_exifInterface$Rational1[v7] = new Rational(((long)Double.parseDouble(arr_s7[0])), ((long)Double.parseDouble(arr_s7[1])));
                                    }
                                    this.f[v].put(s, ExifAttribute.g(arr_exifInterface$Rational1, this.h));
                                    break;
                                }
                                case 12: {
                                    String[] arr_s8 = s2.split(",", -1);
                                    double[] arr_f = new double[arr_s8.length];
                                    for(int v8 = 0; v8 < arr_s8.length; ++v8) {
                                        arr_f[v8] = Double.parseDouble(arr_s8[v8]);
                                    }
                                    this.f[v].put(s, ExifAttribute.c(arr_f, this.h));
                                    break;
                                }
                                default: {
                                    if(ExifInterface.w) {
                                        Log.d("ExifInterface", "Data format isn\'t one of expected formats: " + v1);
                                    }
                                }
                            }
                        }
                        else if(exifInterface$ExifTag0.d != -1 && (exifInterface$ExifTag0.d == ((int)(((Integer)pair0.first))) || exifInterface$ExifTag0.d == ((int)(((Integer)pair0.second))))) {
                            v1 = exifInterface$ExifTag0.d;
                            goto label_62;
                        }
                        else {
                            int v2 = exifInterface$ExifTag0.c;
                            if(v2 == 1 || v2 == 2 || v2 == 7) {
                                v1 = v2;
                                goto label_62;
                            }
                            else if(ExifInterface.w) {
                                StringBuilder stringBuilder0 = new StringBuilder();
                                stringBuilder0.append("Given tag (");
                                stringBuilder0.append(s);
                                stringBuilder0.append(") value didn\'t match with one of expected formats: ");
                                String[] arr_s = ExifInterface.G6;
                                stringBuilder0.append(arr_s[exifInterface$ExifTag0.c]);
                                String s3 = "";
                                stringBuilder0.append((exifInterface$ExifTag0.d == -1 ? "" : ", " + arr_s[exifInterface$ExifTag0.d]));
                                stringBuilder0.append(" (guess: ");
                                stringBuilder0.append(arr_s[((int)(((Integer)pair0.first)))]);
                                if(((int)(((Integer)pair0.second))) != -1) {
                                    s3 = ", " + arr_s[((int)(((Integer)pair0.second)))];
                                }
                                stringBuilder0.append(s3);
                                stringBuilder0.append(")");
                                Log.d("ExifInterface", stringBuilder0.toString());
                            }
                        }
                    }
                }
            }
            ++v;
        }
    }

    private int w(BufferedInputStream bufferedInputStream0) throws IOException {
        bufferedInputStream0.mark(5000);
        byte[] arr_b = new byte[5000];
        bufferedInputStream0.read(arr_b);
        bufferedInputStream0.reset();
        if(ExifInterface.S(arr_b)) {
            return 4;
        }
        if(this.V(arr_b)) {
            return 9;
        }
        if(this.R(arr_b)) {
            return 12;
        }
        if(this.T(arr_b)) {
            return 7;
        }
        if(this.W(arr_b)) {
            return 10;
        }
        if(this.U(arr_b)) {
            return 13;
        }
        return this.d0(arr_b) ? 14 : 0;
    }

    @RestrictTo({Scope.a})
    public void w0(@NonNull Long long0) {
        if(long0 == null) {
            throw new NullPointerException("Timestamp should not be null.");
        }
        if(((long)long0) < 0L) {
            throw new IllegalArgumentException("Timestamp should a positive value.");
        }
        String s = Long.toString(((long)long0) % 1000L);
        for(int v = s.length(); v < 3; ++v) {
            s = "0" + s;
        }
        this.v0("DateTime", ExifInterface.m6.format(new Date(((long)long0))));
        this.v0("SubSecTime", s);
    }

    private void x(SeekableByteOrderedDataInputStream exifInterface$SeekableByteOrderedDataInputStream0) throws IOException {
        this.A(exifInterface$SeekableByteOrderedDataInputStream0);
        ExifAttribute exifInterface$ExifAttribute0 = (ExifAttribute)this.f[1].get("MakerNote");
        if(exifInterface$ExifAttribute0 != null) {
            SeekableByteOrderedDataInputStream exifInterface$SeekableByteOrderedDataInputStream1 = new SeekableByteOrderedDataInputStream(exifInterface$ExifAttribute0.d);
            exifInterface$SeekableByteOrderedDataInputStream1.e(this.h);
            byte[] arr_b = new byte[ExifInterface.L5.length];
            exifInterface$SeekableByteOrderedDataInputStream1.readFully(arr_b);
            exifInterface$SeekableByteOrderedDataInputStream1.i(0L);
            byte[] arr_b1 = ExifInterface.M5;
            byte[] arr_b2 = new byte[arr_b1.length];
            exifInterface$SeekableByteOrderedDataInputStream1.readFully(arr_b2);
            if(Arrays.equals(arr_b, ExifInterface.L5)) {
                exifInterface$SeekableByteOrderedDataInputStream1.i(8L);
            }
            else if(Arrays.equals(arr_b2, arr_b1)) {
                exifInterface$SeekableByteOrderedDataInputStream1.i(12L);
            }
            this.k0(exifInterface$SeekableByteOrderedDataInputStream1, 6);
            ExifAttribute exifInterface$ExifAttribute1 = (ExifAttribute)this.f[7].get("PreviewImageStart");
            ExifAttribute exifInterface$ExifAttribute2 = (ExifAttribute)this.f[7].get("PreviewImageLength");
            if(exifInterface$ExifAttribute1 != null && exifInterface$ExifAttribute2 != null) {
                this.f[5].put("JPEGInterchangeFormat", exifInterface$ExifAttribute1);
                this.f[5].put("JPEGInterchangeFormatLength", exifInterface$ExifAttribute2);
            }
            ExifAttribute exifInterface$ExifAttribute3 = (ExifAttribute)this.f[8].get("AspectFrame");
            if(exifInterface$ExifAttribute3 != null) {
                int[] arr_v = (int[])exifInterface$ExifAttribute3.r(this.h);
                if(arr_v == null || arr_v.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(arr_v));
                }
                else {
                    int v = arr_v[2];
                    int v1 = arr_v[0];
                    if(v > v1) {
                        int v2 = arr_v[3];
                        int v3 = arr_v[1];
                        if(v2 > v3) {
                            int v4 = v - v1 + 1;
                            int v5 = v2 - v3 + 1;
                            if(v4 < v5) {
                                int v6 = v4 + v5;
                                v5 = v6 - v5;
                                v4 = v6 - v5;
                            }
                            ExifAttribute exifInterface$ExifAttribute4 = ExifAttribute.m(v4, this.h);
                            ExifAttribute exifInterface$ExifAttribute5 = ExifAttribute.m(v5, this.h);
                            this.f[0].put("ImageWidth", exifInterface$ExifAttribute4);
                            this.f[0].put("ImageLength", exifInterface$ExifAttribute5);
                        }
                    }
                }
            }
        }
    }

    public void x0(Location location0) {
        if(location0 == null) {
            return;
        }
        this.v0("GPSProcessingMethod", location0.getProvider());
        this.y0(location0.getLatitude(), location0.getLongitude());
        this.u0(location0.getAltitude());
        this.v0("GPSSpeedRef", "K");
        this.v0("GPSSpeed", new Rational(((double)(location0.getSpeed() * ((float)TimeUnit.HOURS.toSeconds(1L)) / 1000.0f))).toString());
        String[] arr_s = ExifInterface.m6.format(new Date(location0.getTime())).split("\\s+", -1);
        this.v0("GPSDateStamp", arr_s[0]);
        this.v0("GPSTimeStamp", arr_s[1]);
    }

    private void y(ByteOrderedDataInputStream exifInterface$ByteOrderedDataInputStream0) throws IOException {
        if(ExifInterface.w) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + exifInterface$ByteOrderedDataInputStream0);
        }
        exifInterface$ByteOrderedDataInputStream0.e(ByteOrder.BIG_ENDIAN);
        exifInterface$ByteOrderedDataInputStream0.f(ExifInterface.S5.length);
        int v = ExifInterface.S5.length;
        try {
            while(true) {
                int v1 = exifInterface$ByteOrderedDataInputStream0.readInt();
                byte[] arr_b = new byte[4];
                exifInterface$ByteOrderedDataInputStream0.readFully(arr_b);
                if(v + 8 == 16 && !Arrays.equals(arr_b, ExifInterface.U5)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if(Arrays.equals(arr_b, ExifInterface.V5)) {
                    break;
                }
                if(Arrays.equals(arr_b, ExifInterface.T5)) {
                    byte[] arr_b1 = new byte[v1];
                    exifInterface$ByteOrderedDataInputStream0.readFully(arr_b1);
                    int v2 = exifInterface$ByteOrderedDataInputStream0.readInt();
                    CRC32 cRC320 = new CRC32();
                    cRC320.update(arr_b);
                    cRC320.update(arr_b1);
                    if(((int)cRC320.getValue()) != v2) {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + v2 + ", calculated CRC value: " + cRC320.getValue());
                    }
                    this.p = v + 8;
                    this.j0(arr_b1, 0);
                    this.D0();
                    this.z0(new ByteOrderedDataInputStream(arr_b1));
                    return;
                }
                exifInterface$ByteOrderedDataInputStream0.f(v1 + 4);
                v = v + v1 + 12;
            }
        }
        catch(EOFException unused_ex) {
            throw new IOException("Encountered corrupt PNG file.");
        }
    }

    public void y0(double f, double f1) {
        if(f < -90.0 || f > 90.0 || Double.isNaN(f)) {
            throw new IllegalArgumentException("Latitude value " + f + " is not valid.");
        }
        if(f1 < -180.0 || f1 > 180.0 || Double.isNaN(f1)) {
            throw new IllegalArgumentException("Longitude value " + f1 + " is not valid.");
        }
        this.v0("GPSLatitudeRef", (f >= 0.0 ? "N" : "S"));
        this.v0("GPSLatitude", this.b(Math.abs(f)));
        this.v0("GPSLongitudeRef", (f1 >= 0.0 ? "E" : "W"));
        this.v0("GPSLongitude", this.b(Math.abs(f1)));
    }

    private void z(ByteOrderedDataInputStream exifInterface$ByteOrderedDataInputStream0) throws IOException {
        boolean z = ExifInterface.w;
        if(z) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + exifInterface$ByteOrderedDataInputStream0);
        }
        exifInterface$ByteOrderedDataInputStream0.f(84);
        byte[] arr_b = new byte[4];
        byte[] arr_b1 = new byte[4];
        byte[] arr_b2 = new byte[4];
        exifInterface$ByteOrderedDataInputStream0.readFully(arr_b);
        exifInterface$ByteOrderedDataInputStream0.readFully(arr_b1);
        exifInterface$ByteOrderedDataInputStream0.readFully(arr_b2);
        int v = ByteBuffer.wrap(arr_b).getInt();
        int v1 = ByteBuffer.wrap(arr_b1).getInt();
        int v2 = ByteBuffer.wrap(arr_b2).getInt();
        byte[] arr_b3 = new byte[v1];
        exifInterface$ByteOrderedDataInputStream0.f(v - exifInterface$ByteOrderedDataInputStream0.b());
        exifInterface$ByteOrderedDataInputStream0.readFully(arr_b3);
        this.t(new ByteOrderedDataInputStream(arr_b3), v, 5);
        exifInterface$ByteOrderedDataInputStream0.f(v2 - exifInterface$ByteOrderedDataInputStream0.b());
        exifInterface$ByteOrderedDataInputStream0.e(ByteOrder.BIG_ENDIAN);
        int v3 = exifInterface$ByteOrderedDataInputStream0.readInt();
        if(z) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + v3);
        }
        for(int v4 = 0; v4 < v3; ++v4) {
            int v5 = exifInterface$ByteOrderedDataInputStream0.readUnsignedShort();
            int v6 = exifInterface$ByteOrderedDataInputStream0.readUnsignedShort();
            if(v5 == ExifInterface.O6.a) {
                int v7 = exifInterface$ByteOrderedDataInputStream0.readShort();
                int v8 = exifInterface$ByteOrderedDataInputStream0.readShort();
                ExifAttribute exifInterface$ExifAttribute0 = ExifAttribute.m(v7, this.h);
                ExifAttribute exifInterface$ExifAttribute1 = ExifAttribute.m(v8, this.h);
                this.f[0].put("ImageLength", exifInterface$ExifAttribute0);
                this.f[0].put("ImageWidth", exifInterface$ExifAttribute1);
                if(ExifInterface.w) {
                    Log.d("ExifInterface", "Updated to length: " + v7 + ", width: " + v8);
                }
                return;
            }
            exifInterface$ByteOrderedDataInputStream0.f(v6);
        }
    }

    private void z0(ByteOrderedDataInputStream exifInterface$ByteOrderedDataInputStream0) throws IOException {
        HashMap hashMap0 = this.f[4];
        ExifAttribute exifInterface$ExifAttribute0 = (ExifAttribute)hashMap0.get("Compression");
        if(exifInterface$ExifAttribute0 == null) {
            this.o = 6;
            this.K(exifInterface$ByteOrderedDataInputStream0, hashMap0);
        }
        else {
            int v = exifInterface$ExifAttribute0.p(this.h);
            this.o = v;
            switch(v) {
                case 1: {
                    break;
                }
                case 6: {
                    this.K(exifInterface$ByteOrderedDataInputStream0, hashMap0);
                    return;
                label_9:
                    if(v != 7) {
                        return;
                    }
                    break;
                }
                default: {
                    goto label_9;
                }
            }
            if(this.Y(hashMap0)) {
                this.L(exifInterface$ByteOrderedDataInputStream0, hashMap0);
            }
        }
    }
}

