package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;

final class Utf8 {
    static class DecodeUtil {
        private static void h(byte b, byte b1, byte b2, byte b3, char[] arr_c, int v) throws InvalidProtocolBufferException {
            if(DecodeUtil.m(b1) || (b << 28) + (b1 + 0x70) >> 30 != 0 || DecodeUtil.m(b2) || DecodeUtil.m(b3)) {
                throw InvalidProtocolBufferException.d();
            }
            int v1 = (b & 7) << 18 | (b1 & 0x3F) << 12 | (b2 & 0x3F) << 6 | b3 & 0x3F;
            arr_c[v] = (char)((v1 >>> 10) + 0xD7C0);
            arr_c[v + 1] = (char)((v1 & 0x3FF) + 0xDC00);
        }

        private static void i(byte b, char[] arr_c, int v) {
            arr_c[v] = (char)b;
        }

        private static void j(byte b, byte b1, byte b2, char[] arr_c, int v) throws InvalidProtocolBufferException {
            if(DecodeUtil.m(b1) || b == 0xFFFFFFE0 && b1 < 0xFFFFFFA0 || b == -19 && b1 >= 0xFFFFFFA0 || DecodeUtil.m(b2)) {
                throw InvalidProtocolBufferException.d();
            }
            arr_c[v] = (char)((b & 15) << 12 | (b1 & 0x3F) << 6 | b2 & 0x3F);
        }

        private static void k(byte b, byte b1, char[] arr_c, int v) throws InvalidProtocolBufferException {
            if(b < -62 || DecodeUtil.m(b1)) {
                throw InvalidProtocolBufferException.d();
            }
            arr_c[v] = (char)((b & 0x1F) << 6 | b1 & 0x3F);
        }

        private static char l(int v) [...] // Inlined contents

        private static boolean m(byte b) {
            return b > -65;
        }

        private static boolean n(byte b) {
            return b >= 0;
        }

        private static boolean o(byte b) {
            return b < -16;
        }

        private static boolean p(byte b) {
            return b < 0xFFFFFFE0;
        }

        private static char q(int v) [...] // Inlined contents

        private static int r(byte b) [...] // Inlined contents
    }

    static abstract class Processor {
        final String a(ByteBuffer byteBuffer0, int v, int v1) throws InvalidProtocolBufferException {
            if(byteBuffer0.hasArray()) {
                int v2 = byteBuffer0.arrayOffset();
                return this.b(byteBuffer0.array(), v2 + v, v1);
            }
            return byteBuffer0.isDirect() ? this.d(byteBuffer0, v, v1) : this.c(byteBuffer0, v, v1);
        }

        abstract String b(byte[] arg1, int arg2, int arg3) throws InvalidProtocolBufferException;

        final String c(ByteBuffer byteBuffer0, int v, int v1) throws InvalidProtocolBufferException {
            if((v | v1 | byteBuffer0.limit() - v - v1) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", byteBuffer0.limit(), v, v1));
            }
            int v2 = v + v1;
            char[] arr_c = new char[v1];
            int v3;
            for(v3 = 0; v < v2; ++v3) {
                int v4 = byteBuffer0.get(v);
                if(!DecodeUtil.n(((byte)v4))) {
                    break;
                }
                ++v;
                DecodeUtil.i(((byte)v4), arr_c, v3);
            }
            int v5 = v3;
            while(v < v2) {
                int v6 = v + 1;
                int v7 = byteBuffer0.get(v);
                if(DecodeUtil.n(((byte)v7))) {
                    int v8 = v5 + 1;
                    DecodeUtil.i(((byte)v7), arr_c, v5);
                    while(v6 < v2) {
                        int v9 = byteBuffer0.get(v6);
                        if(!DecodeUtil.n(((byte)v9))) {
                            break;
                        }
                        ++v6;
                        DecodeUtil.i(((byte)v9), arr_c, v8);
                        ++v8;
                    }
                    v5 = v8;
                    v = v6;
                    continue;
                }
                if(DecodeUtil.p(((byte)v7))) {
                    if(v6 < v2) {
                        v += 2;
                        DecodeUtil.k(((byte)v7), byteBuffer0.get(v6), arr_c, v5);
                        ++v5;
                        continue;
                    }
                }
                else if(!DecodeUtil.o(((byte)v7))) {
                    if(v6 < v2 - 2) {
                        int v11 = byteBuffer0.get(v6);
                        int v12 = v + 3;
                        int v13 = byteBuffer0.get(v + 2);
                        v += 4;
                        DecodeUtil.h(((byte)v7), ((byte)v11), ((byte)v13), byteBuffer0.get(v12), arr_c, v5);
                        v5 += 2;
                        continue;
                    }
                }
                else if(v6 < v2 - 1) {
                    int v10 = v + 2;
                    v += 3;
                    DecodeUtil.j(((byte)v7), byteBuffer0.get(v6), byteBuffer0.get(v10), arr_c, v5);
                    ++v5;
                    continue;
                }
                throw InvalidProtocolBufferException.d();
            }
            return new String(arr_c, 0, v5);
        }

        abstract String d(ByteBuffer arg1, int arg2, int arg3) throws InvalidProtocolBufferException;

        abstract int e(CharSequence arg1, byte[] arg2, int arg3, int arg4);

        final void f(CharSequence charSequence0, ByteBuffer byteBuffer0) {
            if(byteBuffer0.hasArray()) {
                int v = byteBuffer0.arrayOffset();
                byteBuffer0.position(Utf8.i(charSequence0, byteBuffer0.array(), byteBuffer0.position() + v, byteBuffer0.remaining()) - v);
                return;
            }
            if(byteBuffer0.isDirect()) {
                this.h(charSequence0, byteBuffer0);
                return;
            }
            this.g(charSequence0, byteBuffer0);
        }

        final void g(CharSequence charSequence0, ByteBuffer byteBuffer0) {
            int v8;
            int v7;
            int v5;
            int v4;
            int v = charSequence0.length();
            int v1 = byteBuffer0.position();
            int v2 = 0;
            try {
                while(v2 < v) {
                    int v3 = charSequence0.charAt(v2);
                    if(v3 >= 0x80) {
                        break;
                    }
                    byteBuffer0.put(v1 + v2, ((byte)v3));
                    ++v2;
                }
                if(v2 == v) {
                    byteBuffer0.position(v1 + v2);
                    return;
                }
                v1 += v2;
                while(true) {
                label_13:
                    if(v2 >= v) {
                        byteBuffer0.position(v1);
                        return;
                    }
                    v4 = charSequence0.charAt(v2);
                    if(v4 >= 0x80) {
                        break;
                    }
                    byteBuffer0.put(v1, ((byte)v4));
                    ++v2;
                    ++v1;
                }
            }
            catch(IndexOutOfBoundsException unused_ex) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence0.charAt(v2) + " at index " + (byteBuffer0.position() + Math.max(v2, v1 - byteBuffer0.position() + 1)));
            }
            if(v4 < 0x800) {
                try {
                    v5 = v1 + 1;
                    byteBuffer0.put(v1, ((byte)(v4 >>> 6 | 0xC0)));
                    byteBuffer0.put(v5, ((byte)(v4 & 0x3F | 0x80)));
                    v1 = v5;
                }
                catch(IndexOutOfBoundsException unused_ex) {
                    v1 = v5;
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence0.charAt(v2) + " at index " + (byteBuffer0.position() + Math.max(v2, v1 - byteBuffer0.position() + 1)));
                }
            }
            else if(v4 < 0xD800 || 0xDFFF < v4) {
                try {
                    v5 = v1 + 1;
                    byteBuffer0.put(v1, ((byte)(v4 >>> 12 | 0xE0)));
                    v1 += 2;
                }
                catch(IndexOutOfBoundsException unused_ex) {
                    v1 = v5;
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence0.charAt(v2) + " at index " + (byteBuffer0.position() + Math.max(v2, v1 - byteBuffer0.position() + 1)));
                }
                try {
                    byteBuffer0.put(v5, ((byte)(v4 >>> 6 & 0x3F | 0x80)));
                    byteBuffer0.put(v1, ((byte)(v4 & 0x3F | 0x80)));
                    ++v2;
                    ++v1;
                    goto label_13;
                }
                catch(IndexOutOfBoundsException unused_ex) {
                }
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence0.charAt(v2) + " at index " + (byteBuffer0.position() + Math.max(v2, v1 - byteBuffer0.position() + 1)));
            }
            else {
                if(v2 + 1 != v) {
                    try {
                        int v6 = charSequence0.charAt(v2 + 1);
                        if(Character.isSurrogatePair(((char)v4), ((char)v6))) {
                            v7 = Character.toCodePoint(((char)v4), ((char)v6));
                            goto label_31;
                        }
                        else {
                            goto label_46;
                        }
                        throw new UnpairedSurrogateException(v2, v);
                    }
                    catch(IndexOutOfBoundsException unused_ex) {
                        ++v2;
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence0.charAt(v2) + " at index " + (byteBuffer0.position() + Math.max(v2, v1 - byteBuffer0.position() + 1)));
                    }
                    try {
                    label_31:
                        byteBuffer0.put(v1, ((byte)(v7 >>> 18 | 0xF0)));
                        v8 = v1 + 2;
                    }
                    catch(IndexOutOfBoundsException unused_ex) {
                        ++v1;
                        ++v2;
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence0.charAt(v2) + " at index " + (byteBuffer0.position() + Math.max(v2, v1 - byteBuffer0.position() + 1)));
                    }
                    try {
                        byteBuffer0.put(v1 + 1, ((byte)(v7 >>> 12 & 0x3F | 0x80)));
                        v1 += 3;
                    }
                    catch(IndexOutOfBoundsException unused_ex) {
                        ++v2;
                        v1 = v8;
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence0.charAt(v2) + " at index " + (byteBuffer0.position() + Math.max(v2, v1 - byteBuffer0.position() + 1)));
                    }
                    try {
                        byteBuffer0.put(v8, ((byte)(v7 >>> 6 & 0x3F | 0x80)));
                        byteBuffer0.put(v1, ((byte)(v7 & 0x3F | 0x80)));
                        ++v2;
                        ++v2;
                        ++v1;
                        goto label_13;
                    label_46:
                        ++v2;
                    }
                    catch(IndexOutOfBoundsException unused_ex) {
                        ++v2;
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence0.charAt(v2) + " at index " + (byteBuffer0.position() + Math.max(v2, v1 - byteBuffer0.position() + 1)));
                    }
                }
                try {
                    throw new UnpairedSurrogateException(v2, v);
                }
                catch(IndexOutOfBoundsException unused_ex) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence0.charAt(v2) + " at index " + (byteBuffer0.position() + Math.max(v2, v1 - byteBuffer0.position() + 1)));
                }
            }
            ++v2;
            ++v1;
            goto label_13;
        }

        abstract void h(CharSequence arg1, ByteBuffer arg2);

        final boolean i(ByteBuffer byteBuffer0, int v, int v1) {
            return this.k(0, byteBuffer0, v, v1) == 0;
        }

        final boolean j(byte[] arr_b, int v, int v1) {
            return this.l(0, arr_b, v, v1) == 0;
        }

        final int k(int v, ByteBuffer byteBuffer0, int v1, int v2) {
            if(byteBuffer0.hasArray()) {
                int v3 = byteBuffer0.arrayOffset();
                return this.l(v, byteBuffer0.array(), v1 + v3, v3 + v2);
            }
            return byteBuffer0.isDirect() ? this.o(v, byteBuffer0, v1, v2) : this.n(v, byteBuffer0, v1, v2);
        }

        abstract int l(int arg1, byte[] arg2, int arg3, int arg4);

        private static int m(ByteBuffer byteBuffer0, int v, int v1) {
            int v2 = v + Utf8.m(byteBuffer0, v, v1);
            while(true) {
                if(v2 >= v1) {
                    return 0;
                }
                int v3 = byteBuffer0.get(v2);
                if(v3 < 0) {
                    if(v3 < 0xFFFFFFE0) {
                        if(v2 + 1 >= v1) {
                            return v3;
                        }
                        if(v3 >= -62 && byteBuffer0.get(v2 + 1) <= -65) {
                            v2 += 2;
                            continue;
                        }
                    }
                    else if(v3 < -16) {
                        if(v2 + 1 >= v1 - 1) {
                            return Utf8.q(byteBuffer0, v3, v2 + 1, v1 - (v2 + 1));
                        }
                        int v4 = byteBuffer0.get(v2 + 1);
                        if(v4 <= -65 && (v3 != 0xFFFFFFE0 || v4 >= 0xFFFFFFA0) && (v3 != -19 || v4 < 0xFFFFFFA0) && byteBuffer0.get(v2 + 2) <= -65) {
                            v2 += 3;
                            continue;
                        }
                    }
                    else {
                        if(v2 + 1 >= v1 - 2) {
                            return Utf8.q(byteBuffer0, v3, v2 + 1, v1 - (v2 + 1));
                        }
                        int v5 = byteBuffer0.get(v2 + 1);
                        if(v5 <= -65 && (v3 << 28) + (v5 + 0x70) >> 30 == 0) {
                            int v6 = v2 + 3;
                            if(byteBuffer0.get(v2 + 2) <= -65) {
                                v2 += 4;
                                if(byteBuffer0.get(v6) > -65) {
                                    return -1;
                                }
                                continue;
                            }
                        }
                    }
                    return -1;
                }
                ++v2;
            }
        }

        final int n(int v, ByteBuffer byteBuffer0, int v1, int v2) {
            int v7;
            int v6;
            if(v != 0) {
                if(v1 >= v2) {
                    return v;
                }
                if(((byte)v) < 0xFFFFFFE0) {
                    if(((byte)v) >= -62) {
                        return byteBuffer0.get(v1) > -65 ? -1 : Processor.m(byteBuffer0, v1 + 1, v2);
                    }
                    return -1;
                }
                if(((byte)v) < -16) {
                    int v3 = (byte)(~(v >> 8));
                    if(v3 == 0) {
                        int v4 = byteBuffer0.get(v1);
                        if(v1 + 1 >= v2) {
                            return Utf8.o(((byte)v), v4);
                        }
                        ++v1;
                        v3 = v4;
                    }
                    if(v3 <= -65 && (((byte)v) != 0xFFFFFFE0 || v3 >= 0xFFFFFFA0) && (((byte)v) != -19 || v3 < 0xFFFFFFA0)) {
                        return byteBuffer0.get(v1) <= -65 ? Processor.m(byteBuffer0, v1 + 1, v2) : -1;
                    }
                    return -1;
                }
                int v5 = (byte)(~(v >> 8));
                if(v5 == 0) {
                    v6 = v1 + 1;
                    v5 = byteBuffer0.get(v1);
                    if(v6 >= v2) {
                        return Utf8.o(((byte)v), v5);
                    }
                    v7 = 0;
                }
                else {
                    v7 = (byte)(v >> 16);
                    v6 = v1;
                }
                if(v7 == 0) {
                    int v8 = byteBuffer0.get(v6);
                    if(v6 + 1 >= v2) {
                        return Utf8.p(((byte)v), v5, v8);
                    }
                    v7 = v8;
                    ++v6;
                }
                if(v5 <= -65 && (((byte)v) << 28) + (v5 + 0x70) >> 30 == 0 && v7 <= -65) {
                    return byteBuffer0.get(v6) <= -65 ? Processor.m(byteBuffer0, v6 + 1, v2) : -1;
                }
                return -1;
            }
            return Processor.m(byteBuffer0, v1, v2);
        }

        abstract int o(int arg1, ByteBuffer arg2, int arg3, int arg4);
    }

    static final class SafeProcessor extends Processor {
        @Override  // androidx.datastore.preferences.protobuf.Utf8$Processor
        String b(byte[] arr_b, int v, int v1) throws InvalidProtocolBufferException {
            if((v | v1 | arr_b.length - v - v1) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", ((int)arr_b.length), v, v1));
            }
            int v2 = v + v1;
            char[] arr_c = new char[v1];
            int v3;
            for(v3 = 0; v < v2; ++v3) {
                int v4 = arr_b[v];
                if(!DecodeUtil.n(((byte)v4))) {
                    break;
                }
                ++v;
                DecodeUtil.i(((byte)v4), arr_c, v3);
            }
            int v5 = v3;
            while(v < v2) {
                int v6 = v + 1;
                int v7 = arr_b[v];
                if(DecodeUtil.n(((byte)v7))) {
                    int v8 = v5 + 1;
                    DecodeUtil.i(((byte)v7), arr_c, v5);
                    while(v6 < v2) {
                        int v9 = arr_b[v6];
                        if(!DecodeUtil.n(((byte)v9))) {
                            break;
                        }
                        ++v6;
                        DecodeUtil.i(((byte)v9), arr_c, v8);
                        ++v8;
                    }
                    v5 = v8;
                    v = v6;
                    continue;
                }
                if(DecodeUtil.p(((byte)v7))) {
                    if(v6 < v2) {
                        v += 2;
                        DecodeUtil.k(((byte)v7), arr_b[v6], arr_c, v5);
                        ++v5;
                        continue;
                    }
                }
                else if(!DecodeUtil.o(((byte)v7))) {
                    if(v6 < v2 - 2) {
                        int v11 = arr_b[v6];
                        int v12 = v + 3;
                        int v13 = arr_b[v + 2];
                        v += 4;
                        DecodeUtil.h(((byte)v7), ((byte)v11), ((byte)v13), arr_b[v12], arr_c, v5);
                        v5 += 2;
                        continue;
                    }
                }
                else if(v6 < v2 - 1) {
                    int v10 = v + 2;
                    v += 3;
                    DecodeUtil.j(((byte)v7), arr_b[v6], arr_b[v10], arr_c, v5);
                    ++v5;
                    continue;
                }
                throw InvalidProtocolBufferException.d();
            }
            return new String(arr_c, 0, v5);
        }

        @Override  // androidx.datastore.preferences.protobuf.Utf8$Processor
        String d(ByteBuffer byteBuffer0, int v, int v1) throws InvalidProtocolBufferException {
            return this.c(byteBuffer0, v, v1);
        }

        @Override  // androidx.datastore.preferences.protobuf.Utf8$Processor
        int e(CharSequence charSequence0, byte[] arr_b, int v, int v1) {
            int v2 = charSequence0.length();
            int v3 = v1 + v;
            int v4;
            for(v4 = 0; v4 < v2; ++v4) {
                int v5 = v4 + v;
                if(v5 >= v3) {
                    break;
                }
                int v6 = charSequence0.charAt(v4);
                if(v6 >= 0x80) {
                    break;
                }
                arr_b[v5] = (byte)v6;
            }
            if(v4 == v2) {
                return v + v2;
            }
            int v7 = v + v4;
            while(v4 < v2) {
                int v8 = charSequence0.charAt(v4);
                if(v8 < 0x80 && v7 < v3) {
                    arr_b[v7] = (byte)v8;
                    ++v7;
                }
                else if(v8 < 0x800 && v7 <= v3 - 2) {
                    int v9 = v7 + 1;
                    arr_b[v7] = (byte)(v8 >>> 6 | 960);
                    v7 += 2;
                    arr_b[v9] = (byte)(v8 & 0x3F | 0x80);
                }
                else if(v8 >= 0xD800 && 0xDFFF >= v8 || v7 > v3 - 3) {
                    if(v7 > v3 - 4) {
                        goto label_49;
                    }
                    if(v4 + 1 == charSequence0.length()) {
                        throw new UnpairedSurrogateException(v4 - 1, v2);
                    }
                    int v11 = charSequence0.charAt(v4 + 1);
                    if(!Character.isSurrogatePair(((char)v8), ((char)v11))) {
                        goto label_47;
                    }
                    int v12 = Character.toCodePoint(((char)v8), ((char)v11));
                    arr_b[v7] = (byte)(v12 >>> 18 | 0xF0);
                    arr_b[v7 + 1] = (byte)(v12 >>> 12 & 0x3F | 0x80);
                    int v13 = v7 + 3;
                    arr_b[v7 + 2] = (byte)(v12 >>> 6 & 0x3F | 0x80);
                    v7 += 4;
                    arr_b[v13] = (byte)(v12 & 0x3F | 0x80);
                    ++v4;
                }
                else {
                    arr_b[v7] = (byte)(v8 >>> 12 | 480);
                    int v10 = v7 + 2;
                    arr_b[v7 + 1] = (byte)(v8 >>> 6 & 0x3F | 0x80);
                    v7 += 3;
                    arr_b[v10] = (byte)(v8 & 0x3F | 0x80);
                }
                ++v4;
                continue;
            label_47:
                ++v4;
                throw new UnpairedSurrogateException(v4 - 1, v2);
            label_49:
                if(!(0xD800 <= v8 && v8 <= 0xDFFF && (v4 + 1 == charSequence0.length() || !Character.isSurrogatePair(((char)v8), charSequence0.charAt(v4 + 1))))) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char)v8) + " at index " + v7);
                }
                throw new UnpairedSurrogateException(v4, v2);
            }
            return v7;
        }

        @Override  // androidx.datastore.preferences.protobuf.Utf8$Processor
        void h(CharSequence charSequence0, ByteBuffer byteBuffer0) {
            this.g(charSequence0, byteBuffer0);
        }

        @Override  // androidx.datastore.preferences.protobuf.Utf8$Processor
        int l(int v, byte[] arr_b, int v1, int v2) {
            int v7;
            int v6;
            if(v != 0) {
                if(v1 >= v2) {
                    return v;
                }
                if(((byte)v) < 0xFFFFFFE0) {
                    if(((byte)v) >= -62) {
                        return arr_b[v1] > -65 ? -1 : SafeProcessor.p(arr_b, v1 + 1, v2);
                    }
                    return -1;
                }
                if(((byte)v) < -16) {
                    int v3 = (byte)(~(v >> 8));
                    if(v3 == 0) {
                        int v4 = arr_b[v1];
                        if(v1 + 1 >= v2) {
                            return Utf8.o(((byte)v), v4);
                        }
                        ++v1;
                        v3 = v4;
                    }
                    if(v3 <= -65 && (((byte)v) != 0xFFFFFFE0 || v3 >= 0xFFFFFFA0) && (((byte)v) != -19 || v3 < 0xFFFFFFA0)) {
                        return arr_b[v1] <= -65 ? SafeProcessor.p(arr_b, v1 + 1, v2) : -1;
                    }
                    return -1;
                }
                int v5 = (byte)(~(v >> 8));
                if(v5 == 0) {
                    v6 = v1 + 1;
                    v5 = arr_b[v1];
                    if(v6 >= v2) {
                        return Utf8.o(((byte)v), v5);
                    }
                    v7 = 0;
                }
                else {
                    v7 = (byte)(v >> 16);
                    v6 = v1;
                }
                if(v7 == 0) {
                    int v8 = arr_b[v6];
                    if(v6 + 1 >= v2) {
                        return Utf8.p(((byte)v), v5, v8);
                    }
                    v7 = v8;
                    ++v6;
                }
                if(v5 <= -65 && (((byte)v) << 28) + (v5 + 0x70) >> 30 == 0 && v7 <= -65) {
                    return arr_b[v6] <= -65 ? SafeProcessor.p(arr_b, v6 + 1, v2) : -1;
                }
                return -1;
            }
            return SafeProcessor.p(arr_b, v1, v2);
        }

        @Override  // androidx.datastore.preferences.protobuf.Utf8$Processor
        int o(int v, ByteBuffer byteBuffer0, int v1, int v2) {
            return this.n(v, byteBuffer0, v1, v2);
        }

        private static int p(byte[] arr_b, int v, int v1) {
            while(v < v1 && arr_b[v] >= 0) {
                ++v;
            }
            return v < v1 ? SafeProcessor.q(arr_b, v, v1) : 0;
        }

        private static int q(byte[] arr_b, int v, int v1) {
            while(true) {
                if(v >= v1) {
                    return 0;
                }
                int v2 = v + 1;
                int v3 = arr_b[v];
                if(v3 < 0) {
                    if(v3 < 0xFFFFFFE0) {
                        if(v2 >= v1) {
                            return v3;
                        }
                        if(v3 >= -62) {
                            v += 2;
                            if(arr_b[v2] > -65) {
                                return -1;
                            }
                            continue;
                        }
                    }
                    else if(v3 < -16) {
                        if(v2 >= v1 - 1) {
                            return Utf8.r(arr_b, v2, v1);
                        }
                        int v4 = v + 2;
                        int v5 = arr_b[v2];
                        if(v5 <= -65 && (v3 != 0xFFFFFFE0 || v5 >= 0xFFFFFFA0) && (v3 != -19 || v5 < 0xFFFFFFA0)) {
                            v += 3;
                            if(arr_b[v4] > -65) {
                                return -1;
                            }
                            continue;
                        }
                    }
                    else {
                        if(v2 >= v1 - 2) {
                            return Utf8.r(arr_b, v2, v1);
                        }
                        int v6 = arr_b[v2];
                        if(v6 <= -65 && (v3 << 28) + (v6 + 0x70) >> 30 == 0) {
                            int v7 = v + 3;
                            if(arr_b[v + 2] <= -65) {
                                v += 4;
                                if(arr_b[v7] > -65) {
                                    return -1;
                                }
                                continue;
                            }
                        }
                    }
                    return -1;
                }
                v = v2;
            }
        }
    }

    static class UnpairedSurrogateException extends IllegalArgumentException {
        UnpairedSurrogateException(int v, int v1) {
            super("Unpaired surrogate at index " + v + " of " + v1);
        }
    }

    static final class UnsafeProcessor extends Processor {
        @Override  // androidx.datastore.preferences.protobuf.Utf8$Processor
        String b(byte[] arr_b, int v, int v1) throws InvalidProtocolBufferException {
            if((v | v1 | arr_b.length - v - v1) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", ((int)arr_b.length), v, v1));
            }
            int v2 = v + v1;
            char[] arr_c = new char[v1];
            int v3;
            for(v3 = 0; v < v2; ++v3) {
                int v4 = UnsafeUtil.A(arr_b, ((long)v));
                if(!DecodeUtil.n(((byte)v4))) {
                    break;
                }
                ++v;
                DecodeUtil.i(((byte)v4), arr_c, v3);
            }
            int v5 = v3;
            while(v < v2) {
                int v6 = v + 1;
                int v7 = UnsafeUtil.A(arr_b, ((long)v));
                if(DecodeUtil.n(((byte)v7))) {
                    int v8 = v5 + 1;
                    DecodeUtil.i(((byte)v7), arr_c, v5);
                    while(v6 < v2) {
                        int v9 = UnsafeUtil.A(arr_b, ((long)v6));
                        if(!DecodeUtil.n(((byte)v9))) {
                            break;
                        }
                        ++v6;
                        DecodeUtil.i(((byte)v9), arr_c, v8);
                        ++v8;
                    }
                    v5 = v8;
                    v = v6;
                    continue;
                }
                if(DecodeUtil.p(((byte)v7))) {
                    if(v6 < v2) {
                        v += 2;
                        DecodeUtil.k(((byte)v7), UnsafeUtil.A(arr_b, ((long)v6)), arr_c, v5);
                        ++v5;
                        continue;
                    }
                }
                else if(!DecodeUtil.o(((byte)v7))) {
                    if(v6 < v2 - 2) {
                        int v11 = UnsafeUtil.A(arr_b, ((long)v6));
                        int v12 = v + 3;
                        int v13 = UnsafeUtil.A(arr_b, ((long)(v + 2)));
                        v += 4;
                        DecodeUtil.h(((byte)v7), ((byte)v11), ((byte)v13), UnsafeUtil.A(arr_b, ((long)v12)), arr_c, v5);
                        v5 += 2;
                        continue;
                    }
                }
                else if(v6 < v2 - 1) {
                    int v10 = v + 2;
                    v += 3;
                    DecodeUtil.j(((byte)v7), UnsafeUtil.A(arr_b, ((long)v6)), UnsafeUtil.A(arr_b, ((long)v10)), arr_c, v5);
                    ++v5;
                    continue;
                }
                throw InvalidProtocolBufferException.d();
            }
            return new String(arr_c, 0, v5);
        }

        @Override  // androidx.datastore.preferences.protobuf.Utf8$Processor
        String d(ByteBuffer byteBuffer0, int v, int v1) throws InvalidProtocolBufferException {
            if((v | v1 | byteBuffer0.limit() - v - v1) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", byteBuffer0.limit(), v, v1));
            }
            long v2 = UnsafeUtil.i(byteBuffer0) + ((long)v);
            long v3 = ((long)v1) + v2;
            char[] arr_c = new char[v1];
            int v4;
            for(v4 = 0; v2 < v3; ++v4) {
                int v5 = UnsafeUtil.y(v2);
                if(!DecodeUtil.n(((byte)v5))) {
                    break;
                }
                ++v2;
                DecodeUtil.i(((byte)v5), arr_c, v4);
            }
            while(v2 < v3) {
                long v6 = v2 + 1L;
                int v7 = UnsafeUtil.y(v2);
                if(DecodeUtil.n(((byte)v7))) {
                    int v8 = v4 + 1;
                    DecodeUtil.i(((byte)v7), arr_c, v4);
                    while(v6 < v3) {
                        int v9 = UnsafeUtil.y(v6);
                        if(!DecodeUtil.n(((byte)v9))) {
                            break;
                        }
                        ++v6;
                        DecodeUtil.i(((byte)v9), arr_c, v8);
                        ++v8;
                    }
                    v4 = v8;
                    v2 = v6;
                    continue;
                }
                if(DecodeUtil.p(((byte)v7))) {
                    if(v6 < v3) {
                        v2 += 2L;
                        DecodeUtil.k(((byte)v7), UnsafeUtil.y(v6), arr_c, v4);
                        ++v4;
                        continue;
                    }
                }
                else if(!DecodeUtil.o(((byte)v7))) {
                    if(v6 < v3 - 2L) {
                        int v11 = UnsafeUtil.y(v6);
                        long v12 = v2 + 3L;
                        int v13 = UnsafeUtil.y(v2 + 2L);
                        v2 += 4L;
                        DecodeUtil.h(((byte)v7), ((byte)v11), ((byte)v13), UnsafeUtil.y(v12), arr_c, v4);
                        v4 += 2;
                        continue;
                    }
                }
                else if(v6 < v3 - 1L) {
                    long v10 = v2 + 2L;
                    v2 += 3L;
                    DecodeUtil.j(((byte)v7), UnsafeUtil.y(v6), UnsafeUtil.y(v10), arr_c, v4);
                    ++v4;
                    continue;
                }
                throw InvalidProtocolBufferException.d();
            }
            return new String(arr_c, 0, v4);
        }

        @Override  // androidx.datastore.preferences.protobuf.Utf8$Processor
        int e(CharSequence charSequence0, byte[] arr_b, int v, int v1) {
            long v2 = (long)v;
            long v3 = ((long)v1) + v2;
            int v4 = charSequence0.length();
            if(v4 > v1 || arr_b.length - v1 < v) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence0.charAt(v4 - 1) + " at index " + (v + v1));
            }
            int v5 = 0;
            while(v5 < v4) {
                int v6 = charSequence0.charAt(v5);
                if(v6 >= 0x80) {
                    break;
                }
                UnsafeUtil.d0(arr_b, v2, ((byte)v6));
                ++v5;
                ++v2;
            }
            if(v5 == v4) {
                return (int)v2;
            }
            while(v5 < v4) {
                int v7 = charSequence0.charAt(v5);
                if(v7 < 0x80 && v2 < v3) {
                    UnsafeUtil.d0(arr_b, v2, ((byte)v7));
                    ++v2;
                }
                else if(v7 < 0x800 && v2 <= v3 - 2L) {
                    long v8 = v2 + 1L;
                    UnsafeUtil.d0(arr_b, v2, ((byte)(v7 >>> 6 | 960)));
                    v2 += 2L;
                    UnsafeUtil.d0(arr_b, v8, ((byte)(v7 & 0x3F | 0x80)));
                }
                else if(v7 >= 0xD800 && 0xDFFF >= v7 || v2 > v3 - 3L) {
                    if(v2 > v3 - 4L) {
                        goto label_49;
                    }
                    if(v5 + 1 == v4) {
                        throw new UnpairedSurrogateException(v5 - 1, v4);
                    }
                    int v10 = charSequence0.charAt(v5 + 1);
                    if(!Character.isSurrogatePair(((char)v7), ((char)v10))) {
                        goto label_47;
                    }
                    int v11 = Character.toCodePoint(((char)v7), ((char)v10));
                    UnsafeUtil.d0(arr_b, v2, ((byte)(v11 >>> 18 | 0xF0)));
                    UnsafeUtil.d0(arr_b, v2 + 1L, ((byte)(v11 >>> 12 & 0x3F | 0x80)));
                    long v12 = v2 + 3L;
                    UnsafeUtil.d0(arr_b, v2 + 2L, ((byte)(v11 >>> 6 & 0x3F | 0x80)));
                    v2 += 4L;
                    UnsafeUtil.d0(arr_b, v12, ((byte)(v11 & 0x3F | 0x80)));
                    ++v5;
                }
                else {
                    UnsafeUtil.d0(arr_b, v2, ((byte)(v7 >>> 12 | 480)));
                    long v9 = v2 + 2L;
                    UnsafeUtil.d0(arr_b, v2 + 1L, ((byte)(v7 >>> 6 & 0x3F | 0x80)));
                    v2 += 3L;
                    UnsafeUtil.d0(arr_b, v9, ((byte)(v7 & 0x3F | 0x80)));
                }
                ++v5;
                continue;
            label_47:
                ++v5;
                throw new UnpairedSurrogateException(v5 - 1, v4);
            label_49:
                if(0xD800 > v7 || v7 > 0xDFFF || v5 + 1 != v4 && Character.isSurrogatePair(((char)v7), charSequence0.charAt(v5 + 1))) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char)v7) + " at index " + v2);
                }
                throw new UnpairedSurrogateException(v5, v4);
            }
            return (int)v2;
        }

        @Override  // androidx.datastore.preferences.protobuf.Utf8$Processor
        void h(CharSequence charSequence0, ByteBuffer byteBuffer0) {
            int v7;
            long v = UnsafeUtil.i(byteBuffer0);
            long v1 = ((long)byteBuffer0.position()) + v;
            long v2 = ((long)byteBuffer0.limit()) + v;
            int v3 = charSequence0.length();
            if(((long)v3) > v2 - v1) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence0.charAt(v3 - 1) + " at index " + byteBuffer0.limit());
            }
            int v4 = 0;
            while(v4 < v3) {
                int v5 = charSequence0.charAt(v4);
                if(v5 >= 0x80) {
                    break;
                }
                UnsafeUtil.b0(v1, ((byte)v5));
                ++v4;
                ++v1;
            }
            if(v4 == v3) {
                byteBuffer0.position(((int)(v1 - v)));
                return;
            }
            while(v4 < v3) {
                int v6 = charSequence0.charAt(v4);
                if(v6 < 0x80 && v1 < v2) {
                    UnsafeUtil.b0(v1, ((byte)v6));
                    v7 = v4;
                    ++v1;
                }
                else if(v6 < 0x800 && v1 <= v2 - 2L) {
                    long v8 = v1 + 1L;
                    UnsafeUtil.b0(v1, ((byte)(v6 >>> 6 | 960)));
                    v1 += 2L;
                    UnsafeUtil.b0(v8, ((byte)(v6 & 0x3F | 0x80)));
                    v7 = v4;
                }
                else if(v6 >= 0xD800 && 0xDFFF >= v6 || v1 > v2 - 3L) {
                    if(v1 > v2 - 4L) {
                        goto label_54;
                    }
                    v7 = v4 + 1;
                    if(v7 == v3) {
                        throw new UnpairedSurrogateException(v4 - 1, v3);
                    }
                    int v10 = charSequence0.charAt(v7);
                    if(!Character.isSurrogatePair(((char)v6), ((char)v10))) {
                        goto label_52;
                    }
                    int v11 = Character.toCodePoint(((char)v6), ((char)v10));
                    UnsafeUtil.b0(v1, ((byte)(v11 >>> 18 | 0xF0)));
                    UnsafeUtil.b0(v1 + 1L, ((byte)(v11 >>> 12 & 0x3F | 0x80)));
                    long v12 = v1 + 3L;
                    UnsafeUtil.b0(v1 + 2L, ((byte)(v11 >>> 6 & 0x3F | 0x80)));
                    v1 += 4L;
                    UnsafeUtil.b0(v12, ((byte)(v11 & 0x3F | 0x80)));
                }
                else {
                    UnsafeUtil.b0(v1, ((byte)(v6 >>> 12 | 480)));
                    long v9 = v1 + 2L;
                    UnsafeUtil.b0(v1 + 1L, ((byte)(v6 >>> 6 & 0x3F | 0x80)));
                    v1 += 3L;
                    UnsafeUtil.b0(v9, ((byte)(v6 & 0x3F | 0x80)));
                    v7 = v4;
                }
                v4 = v7 + 1;
                continue;
            label_52:
                v4 = v7;
                throw new UnpairedSurrogateException(v4 - 1, v3);
            label_54:
                if(!(0xD800 <= v6 && v6 <= 0xDFFF && (v4 + 1 == v3 || !Character.isSurrogatePair(((char)v6), charSequence0.charAt(v4 + 1))))) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char)v6) + " at index " + v1);
                }
                throw new UnpairedSurrogateException(v4, v3);
            }
            byteBuffer0.position(((int)(v1 - v)));
            return;
        }

        @Override  // androidx.datastore.preferences.protobuf.Utf8$Processor
        int l(int v, byte[] arr_b, int v1, int v2) {
            long v6;
            int v3 = 0;
            if((v1 | v2 | arr_b.length - v2) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", ((int)arr_b.length), v1, v2));
            }
            long v4 = (long)v1;
            if(v != 0) {
                if(v4 >= ((long)v2)) {
                    return v;
                }
                if(((byte)v) < 0xFFFFFFE0) {
                    return ((byte)v) < -62 || UnsafeUtil.A(arr_b, v4) > -65 ? -1 : UnsafeProcessor.r(arr_b, v4 + 1L, ((int)(((long)v2) - (v4 + 1L))));
                }
                if(((byte)v) < -16) {
                    int v5 = (byte)(~(v >> 8));
                    if(v5 == 0) {
                        v5 = UnsafeUtil.A(arr_b, v4);
                        if(v4 + 1L >= ((long)v2)) {
                            return Utf8.o(((byte)v), v5);
                        }
                        ++v4;
                    }
                    if(v5 <= -65 && (((byte)v) != 0xFFFFFFE0 || v5 >= 0xFFFFFFA0) && (((byte)v) != -19 || v5 < 0xFFFFFFA0)) {
                        v6 = v4 + 1L;
                        return UnsafeUtil.A(arr_b, v4) > -65 ? -1 : UnsafeProcessor.r(arr_b, v6, ((int)(((long)v2) - v6)));
                    }
                    return -1;
                }
                int v7 = (byte)(~(v >> 8));
                if(v7 == 0) {
                    v7 = UnsafeUtil.A(arr_b, v4);
                    if(v4 + 1L >= ((long)v2)) {
                        return Utf8.o(((byte)v), v7);
                    }
                    ++v4;
                }
                else {
                    v3 = (byte)(v >> 16);
                }
                if(v3 == 0) {
                    v3 = UnsafeUtil.A(arr_b, v4);
                    if(v4 + 1L >= ((long)v2)) {
                        return Utf8.p(((byte)v), v7, v3);
                    }
                    ++v4;
                }
                if(v7 <= -65 && (((byte)v) << 28) + (v7 + 0x70) >> 30 == 0 && v3 <= -65) {
                    v6 = v4 + 1L;
                    return UnsafeUtil.A(arr_b, v4) <= -65 ? UnsafeProcessor.r(arr_b, v6, ((int)(((long)v2) - v6))) : -1;
                }
                return -1;
            }
            return UnsafeProcessor.r(arr_b, v4, ((int)(((long)v2) - v4)));
        }

        @Override  // androidx.datastore.preferences.protobuf.Utf8$Processor
        int o(int v, ByteBuffer byteBuffer0, int v1, int v2) {
            long v6;
            int v3 = 0;
            if((v1 | v2 | byteBuffer0.limit() - v2) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", byteBuffer0.limit(), v1, v2));
            }
            long v4 = UnsafeUtil.i(byteBuffer0) + ((long)v1);
            long v5 = ((long)(v2 - v1)) + v4;
            if(v != 0) {
                if(v4 >= v5) {
                    return v;
                }
                if(((byte)v) < 0xFFFFFFE0) {
                    if(((byte)v) >= -62) {
                        v6 = v4 + 1L;
                        return UnsafeUtil.y(v4) > -65 ? -1 : UnsafeProcessor.q(v6, ((int)(v5 - v6)));
                    }
                    return -1;
                }
                if(((byte)v) < -16) {
                    int v7 = (byte)(~(v >> 8));
                    if(v7 == 0) {
                        v7 = UnsafeUtil.y(v4);
                        if(v4 + 1L >= v5) {
                            return Utf8.o(((byte)v), v7);
                        }
                        ++v4;
                    }
                    if(v7 <= -65 && (((byte)v) != 0xFFFFFFE0 || v7 >= 0xFFFFFFA0) && (((byte)v) != -19 || v7 < 0xFFFFFFA0)) {
                        v6 = v4 + 1L;
                        return UnsafeUtil.y(v4) <= -65 ? UnsafeProcessor.q(v6, ((int)(v5 - v6))) : -1;
                    }
                    return -1;
                }
                int v8 = (byte)(~(v >> 8));
                if(v8 == 0) {
                    v8 = UnsafeUtil.y(v4);
                    if(v4 + 1L >= v5) {
                        return Utf8.o(((byte)v), v8);
                    }
                    ++v4;
                }
                else {
                    v3 = (byte)(v >> 16);
                }
                if(v3 == 0) {
                    v3 = UnsafeUtil.y(v4);
                    if(v4 + 1L >= v5) {
                        return Utf8.p(((byte)v), v8, v3);
                    }
                    ++v4;
                }
                if(v8 <= -65 && (((byte)v) << 28) + (v8 + 0x70) >> 30 == 0 && v3 <= -65) {
                    v6 = v4 + 1L;
                    return UnsafeUtil.y(v4) <= -65 ? UnsafeProcessor.q(v6, ((int)(v5 - v6))) : -1;
                }
                return -1;
            }
            return UnsafeProcessor.q(v4, ((int)(v5 - v4)));
        }

        // 去混淆评级： 中等(60)
        static boolean p() [...] // 潜在的解密器

        private static int q(long v, int v1) {
            int v5;
            int v2 = UnsafeProcessor.s(v, v1);
            long v3 = v + ((long)v2);
            int v4 = v1 - v2;
            while(true) {
                while(true) {
                label_3:
                    v5 = 0;
                    while(v4 > 0) {
                        v5 = UnsafeUtil.y(v3);
                        if(v5 >= 0) {
                            --v4;
                            ++v3;
                        }
                        else {
                            ++v3;
                            if(true) {
                                break;
                            }
                        }
                    }
                    if(v4 == 0) {
                        return 0;
                    }
                    if(v5 < 0xFFFFFFE0) {
                        if(v4 - 1 == 0) {
                            return v5;
                        }
                        v4 -= 2;
                        if(v5 >= -62 && UnsafeUtil.y(v3) <= -65) {
                            ++v3;
                            continue;
                        }
                        return -1;
                    }
                    if(v5 < -16) {
                        if(v4 - 1 < 2) {
                            return UnsafeProcessor.u(v3, v5, v4 - 1);
                        }
                        v4 -= 3;
                        long v6 = v3 + 1L;
                        int v7 = UnsafeUtil.y(v3);
                        if(v7 <= -65 && (v5 != 0xFFFFFFE0 || v7 >= 0xFFFFFFA0) && (v5 != -19 || v7 < 0xFFFFFFA0)) {
                            v3 += 2L;
                            if(UnsafeUtil.y(v6) <= -65) {
                                continue;
                            }
                        }
                        return -1;
                    }
                    break;
                }
                if(v4 - 1 < 3) {
                    return UnsafeProcessor.u(v3, v5, v4 - 1);
                }
                v4 -= 4;
                int v8 = UnsafeUtil.y(v3);
                if(v8 > -65 || (v5 << 28) + (v8 + 0x70) >> 30 != 0) {
                    break;
                }
                long v9 = v3 + 2L;
                if(UnsafeUtil.y(v3 + 1L) > -65) {
                    break;
                }
                v3 += 3L;
                if(UnsafeUtil.y(v9) <= -65) {
                    goto label_3;
                }
                break;
            }
            return -1;
        }

        private static int r(byte[] arr_b, long v, int v1) {
            int v5;
            int v2 = UnsafeProcessor.t(arr_b, v, v1);
            int v3 = v1 - v2;
            long v4 = v + ((long)v2);
            while(true) {
                while(true) {
                label_3:
                    v5 = 0;
                    while(v3 > 0) {
                        v5 = UnsafeUtil.A(arr_b, v4);
                        if(v5 >= 0) {
                            --v3;
                            ++v4;
                        }
                        else {
                            ++v4;
                            if(true) {
                                break;
                            }
                        }
                    }
                    if(v3 == 0) {
                        return 0;
                    }
                    if(v5 < 0xFFFFFFE0) {
                        if(v3 - 1 == 0) {
                            return v5;
                        }
                        v3 -= 2;
                        if(v5 >= -62 && UnsafeUtil.A(arr_b, v4) <= -65) {
                            ++v4;
                            continue;
                        }
                        return -1;
                    }
                    if(v5 < -16) {
                        if(v3 - 1 < 2) {
                            return UnsafeProcessor.v(arr_b, v5, v4, v3 - 1);
                        }
                        v3 -= 3;
                        long v6 = v4 + 1L;
                        int v7 = UnsafeUtil.A(arr_b, v4);
                        if(v7 <= -65 && (v5 != 0xFFFFFFE0 || v7 >= 0xFFFFFFA0) && (v5 != -19 || v7 < 0xFFFFFFA0)) {
                            v4 += 2L;
                            if(UnsafeUtil.A(arr_b, v6) <= -65) {
                                continue;
                            }
                        }
                        return -1;
                    }
                    break;
                }
                if(v3 - 1 < 3) {
                    return UnsafeProcessor.v(arr_b, v5, v4, v3 - 1);
                }
                v3 -= 4;
                int v8 = UnsafeUtil.A(arr_b, v4);
                if(v8 > -65 || (v5 << 28) + (v8 + 0x70) >> 30 != 0) {
                    break;
                }
                long v9 = v4 + 2L;
                if(UnsafeUtil.A(arr_b, v4 + 1L) > -65) {
                    break;
                }
                v4 += 3L;
                if(UnsafeUtil.A(arr_b, v9) <= -65) {
                    goto label_3;
                }
                break;
            }
            return -1;
        }

        private static int s(long v, int v1) {
            if(v1 < 16) {
                return 0;
            }
            int v2 = 8 - (((int)v) & 7);
            int v3 = v2;
            while(v3 > 0) {
                if(UnsafeUtil.y(v) < 0) {
                    return v2 - v3;
                }
                --v3;
                ++v;
            }
            int v4;
            for(v4 = v1 - v2; v4 >= 8 && (UnsafeUtil.K(v) & 0x8080808080808080L) == 0L; v4 -= 8) {
                v += 8L;
            }
            return v1 - v4;
        }

        private static int t(byte[] arr_b, long v, int v1) {
            int v2 = 0;
            if(v1 < 16) {
                return 0;
            }
            while(v2 < v1) {
                if(UnsafeUtil.A(arr_b, v) < 0) {
                    return v2;
                }
                ++v2;
                ++v;
            }
            return v1;
        }

        private static int u(long v, int v1, int v2) {
            switch(v2) {
                case 0: {
                    return Utf8.n(v1);
                }
                case 1: {
                    return Utf8.o(v1, UnsafeUtil.y(v));
                }
                case 2: {
                    return Utf8.p(v1, UnsafeUtil.y(v), UnsafeUtil.y(v + 1L));
                }
                default: {
                    throw new AssertionError();
                }
            }
        }

        private static int v(byte[] arr_b, int v, long v1, int v2) {
            switch(v2) {
                case 0: {
                    return Utf8.n(v);
                }
                case 1: {
                    return Utf8.o(v, UnsafeUtil.A(arr_b, v1));
                }
                case 2: {
                    return Utf8.p(v, UnsafeUtil.A(arr_b, v1), UnsafeUtil.A(arr_b, v1 + 1L));
                }
                default: {
                    throw new AssertionError();
                }
            }
        }
    }

    private static final Processor a = null;
    private static final long b = 0x8080808080808080L;
    static final int c = 3;
    public static final int d = 0;
    public static final int e = -1;
    private static final int f = 16;

    // 去混淆评级： 低(30)
    static {
        Utf8.a = new UnsafeProcessor();
    }

    static String g(ByteBuffer byteBuffer0, int v, int v1) throws InvalidProtocolBufferException {
        return Utf8.a.a(byteBuffer0, v, v1);
    }

    static String h(byte[] arr_b, int v, int v1) throws InvalidProtocolBufferException {
        return Utf8.a.b(arr_b, v, v1);
    }

    static int i(CharSequence charSequence0, byte[] arr_b, int v, int v1) {
        return Utf8.a.e(charSequence0, arr_b, v, v1);
    }

    static void j(CharSequence charSequence0, ByteBuffer byteBuffer0) {
        Utf8.a.f(charSequence0, byteBuffer0);
    }

    static int k(CharSequence charSequence0) {
        int v = charSequence0.length();
        int v1;
        for(v1 = 0; v1 < v && charSequence0.charAt(v1) < 0x80; ++v1) {
        }
        int v2 = v;
        while(v1 < v) {
            int v3 = charSequence0.charAt(v1);
            if(v3 < 0x800) {
                v2 += 0x7F - v3 >>> 0x1F;
                ++v1;
            }
            else {
                v2 += Utf8.l(charSequence0, v1);
                if(true) {
                    break;
                }
            }
        }
        if(v2 < v) {
            throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long)v2) + 0x100000000L));
        }
        return v2;
    }

    private static int l(CharSequence charSequence0, int v) {
        int v1 = charSequence0.length();
        int v2 = 0;
        while(v < v1) {
            int v3 = charSequence0.charAt(v);
            if(v3 < 0x800) {
                v2 += 0x7F - v3 >>> 0x1F;
            }
            else {
                v2 += 2;
                if(0xD800 <= v3 && v3 <= 0xDFFF) {
                    if(Character.codePointAt(charSequence0, v) < 0x10000) {
                        throw new UnpairedSurrogateException(v, v1);
                    }
                    ++v;
                }
            }
            ++v;
        }
        return v2;
    }

    private static int m(ByteBuffer byteBuffer0, int v, int v1) {
        int v2;
        for(v2 = v; v2 < v1 - 7 && (byteBuffer0.getLong(v2) & 0x8080808080808080L) == 0L; v2 += 8) {
        }
        return v2 - v;
    }

    private static int n(int v) {
        return v <= -12 ? v : -1;
    }

    private static int o(int v, int v1) {
        return v > -12 || v1 > -65 ? -1 : v ^ v1 << 8;
    }

    private static int p(int v, int v1, int v2) {
        return v > -12 || v1 > -65 || v2 > -65 ? -1 : v ^ v1 << 8 ^ v2 << 16;
    }

    private static int q(ByteBuffer byteBuffer0, int v, int v1, int v2) {
        switch(v2) {
            case 0: {
                return Utf8.n(v);
            }
            case 1: {
                return Utf8.o(v, byteBuffer0.get(v1));
            }
            case 2: {
                return Utf8.p(v, byteBuffer0.get(v1), byteBuffer0.get(v1 + 1));
            }
            default: {
                throw new AssertionError();
            }
        }
    }

    private static int r(byte[] arr_b, int v, int v1) {
        int v2 = arr_b[v - 1];
        switch(v1 - v) {
            case 0: {
                return Utf8.n(v2);
            }
            case 1: {
                return Utf8.o(v2, arr_b[v]);
            }
            case 2: {
                return Utf8.p(v2, arr_b[v], arr_b[v + 1]);
            }
            default: {
                throw new AssertionError();
            }
        }
    }

    static boolean s(ByteBuffer byteBuffer0) {
        return Utf8.a.i(byteBuffer0, byteBuffer0.position(), byteBuffer0.remaining());
    }

    public static boolean t(byte[] arr_b) {
        return Utf8.a.j(arr_b, 0, arr_b.length);
    }

    public static boolean u(byte[] arr_b, int v, int v1) {
        return Utf8.a.j(arr_b, v, v1);
    }

    static int v(int v, ByteBuffer byteBuffer0, int v1, int v2) {
        return Utf8.a.k(v, byteBuffer0, v1, v2);
    }

    public static int w(int v, byte[] arr_b, int v1, int v2) {
        return Utf8.a.l(v, arr_b, v1, v2);
    }
}

