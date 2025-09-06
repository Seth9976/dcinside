package okhttp3.internal.http2;

import java.io.IOException;
import kotlin.jvm.internal.L;
import okhttp3.internal.Util;
import okio.n;
import okio.o;
import y4.l;
import y4.m;

public final class Huffman {
    static final class Node {
        @m
        private final Node[] children;
        private final int symbol;
        private final int terminalBitCount;

        public Node() {
            this.children = new Node[0x100];
            this.symbol = 0;
            this.terminalBitCount = 0;
        }

        public Node(int v, int v1) {
            this.children = null;
            this.symbol = v;
            this.terminalBitCount = (v1 & 7) == 0 ? 8 : v1 & 7;
        }

        @m
        public final Node[] getChildren() {
            return this.children;
        }

        public final int getSymbol() {
            return this.symbol;
        }

        public final int getTerminalBitCount() {
            return this.terminalBitCount;
        }
    }

    @l
    private static final int[] CODES;
    @l
    private static final byte[] CODE_BIT_COUNTS;
    @l
    public static final Huffman INSTANCE;
    @l
    private static final Node root;

    static {
        Huffman.INSTANCE = new Huffman();
        Huffman.CODES = new int[]{0x1FF8, 0x7FFFD8, 0xFFFFFE2, 0xFFFFFE3, 0xFFFFFE4, 0xFFFFFE5, 0xFFFFFE6, 0xFFFFFE7, 0xFFFFFE8, 0xFFFFEA, 0x3FFFFFFC, 0xFFFFFE9, 0xFFFFFEA, 0x3FFFFFFD, 0xFFFFFEB, 0xFFFFFEC, 0xFFFFFED, 0xFFFFFEE, 0xFFFFFEF, 0xFFFFFF0, 0xFFFFFF1, 0xFFFFFF2, 0x3FFFFFFE, 0xFFFFFF3, 0xFFFFFF4, 0xFFFFFF5, 0xFFFFFF6, 0xFFFFFF7, 0xFFFFFF8, 0xFFFFFF9, 0xFFFFFFA, 0xFFFFFFB, 20, 0x3F8, 0x3F9, 0xFFA, 0x1FF9, 21, 0xF8, 0x7FA, 0x3FA, 0x3FB, 0xF9, 0x7FB, 0xFA, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 0x1F, 92, 0xFB, 0x7FFC, 0x20, 0xFFB, 1020, 0x1FFA, 33, 93, 94, 0x5F, 0x60, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 0x6F, 0x70, 0x71, 0x72, 0xFC, 0x73, 0xFD, 0x1FFB, 0x7FFF0, 0x1FFC, 0x3FFC, 34, 0x7FFD, 3, 35, 4, 36, 5, 37, 38, 39, 6, 0x74, 0x75, 40, 41, 42, 7, 43, 0x76, 44, 8, 9, 45, 0x77, 120, 0x79, 0x7A, 0x7B, 0x7FFE, 0x7FC, 0x3FFD, 0x1FFD, 0xFFFFFFC, 0xFFFE6, 0x3FFFD2, 0xFFFE7, 0xFFFE8, 0x3FFFD3, 0x3FFFD4, 0x3FFFD5, 0x7FFFD9, 0x3FFFD6, 0x7FFFDA, 0x7FFFDB, 0x7FFFDC, 0x7FFFDD, 0x7FFFDE, 0xFFFFEB, 0x7FFFDF, 0xFFFFEC, 0xFFFFED, 0x3FFFD7, 0x7FFFE0, 0xFFFFEE, 0x7FFFE1, 0x7FFFE2, 0x7FFFE3, 0x7FFFE4, 0x1FFFDC, 0x3FFFD8, 0x7FFFE5, 0x3FFFD9, 0x7FFFE6, 0x7FFFE7, 0xFFFFEF, 0x3FFFDA, 0x1FFFDD, 0xFFFE9, 0x3FFFDB, 0x3FFFDC, 0x7FFFE8, 0x7FFFE9, 0x1FFFDE, 0x7FFFEA, 0x3FFFDD, 0x3FFFDE, 0xFFFFF0, 0x1FFFDF, 0x3FFFDF, 0x7FFFEB, 0x7FFFEC, 0x1FFFE0, 0x1FFFE1, 0x3FFFE0, 0x1FFFE2, 0x7FFFED, 0x3FFFE1, 0x7FFFEE, 0x7FFFEF, 0xFFFEA, 0x3FFFE2, 0x3FFFE3, 0x3FFFE4, 0x7FFFF0, 0x3FFFE5, 0x3FFFE6, 0x7FFFF1, 0x3FFFFE0, 0x3FFFFE1, 0xFFFEB, 0x7FFF1, 0x3FFFE7, 0x7FFFF2, 0x3FFFE8, 0x1FFFFEC, 0x3FFFFE2, 0x3FFFFE3, 0x3FFFFE4, 0x7FFFFDE, 0x7FFFFDF, 0x3FFFFE5, 0xFFFFF1, 0x1FFFFED, 0x7FFF2, 0x1FFFE3, 0x3FFFFE6, 0x7FFFFE0, 0x7FFFFE1, 0x3FFFFE7, 0x7FFFFE2, 0xFFFFF2, 0x1FFFE4, 0x1FFFE5, 0x3FFFFE8, 0x3FFFFE9, 0xFFFFFFD, 0x7FFFFE3, 0x7FFFFE4, 0x7FFFFE5, 0xFFFEC, 0xFFFFF3, 0xFFFED, 0x1FFFE6, 0x3FFFE9, 0x1FFFE7, 0x1FFFE8, 0x7FFFF3, 0x3FFFEA, 0x3FFFEB, 0x1FFFFEE, 0x1FFFFEF, 0xFFFFF4, 0xFFFFF5, 0x3FFFFEA, 0x7FFFF4, 0x3FFFFEB, 0x7FFFFE6, 0x3FFFFEC, 0x3FFFFED, 0x7FFFFE7, 0x7FFFFE8, 0x7FFFFE9, 0x7FFFFEA, 0x7FFFFEB, 0xFFFFFFE, 0x7FFFFEC, 0x7FFFFED, 0x7FFFFEE, 0x7FFFFEF, 0x7FFFFF0, 0x3FFFFEE};
        Huffman.CODE_BIT_COUNTS = new byte[]{13, 23, 28, 28, 28, 28, 28, 28, 28, 24, 30, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 28, 6, 10, 10, 12, 13, 6, 8, 11, 10, 10, 8, 11, 8, 6, 6, 6, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, 15, 6, 12, 10, 13, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, 13, 19, 13, 14, 6, 15, 5, 6, 5, 6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 7, 7, 7, 15, 11, 14, 13, 28, 20, 22, 20, 20, 22, 22, 22, 23, 22, 23, 23, 23, 23, 23, 24, 23, 24, 24, 22, 23, 24, 23, 23, 23, 23, 21, 22, 23, 22, 23, 23, 24, 22, 21, 20, 22, 22, 23, 23, 21, 23, 22, 22, 24, 21, 22, 23, 23, 21, 21, 22, 21, 23, 22, 23, 23, 20, 22, 22, 22, 23, 22, 22, 23, 26, 26, 20, 19, 22, 23, 22, 25, 26, 26, 26, 27, 27, 26, 24, 25, 19, 21, 26, 27, 27, 26, 27, 24, 21, 21, 26, 26, 28, 27, 27, 27, 20, 24, 20, 21, 22, 21, 21, 23, 22, 22, 25, 25, 24, 24, 26, 23, 26, 27, 26, 26, 27, 27, 27, 27, 27, 28, 27, 27, 27, 27, 27, 26};
        Huffman.root = new Node();
        for(int v = 0; v < 0x100; ++v) {
            Huffman.INSTANCE.addCode(v, new int[]{0x1FF8, 0x7FFFD8, 0xFFFFFE2, 0xFFFFFE3, 0xFFFFFE4, 0xFFFFFE5, 0xFFFFFE6, 0xFFFFFE7, 0xFFFFFE8, 0xFFFFEA, 0x3FFFFFFC, 0xFFFFFE9, 0xFFFFFEA, 0x3FFFFFFD, 0xFFFFFEB, 0xFFFFFEC, 0xFFFFFED, 0xFFFFFEE, 0xFFFFFEF, 0xFFFFFF0, 0xFFFFFF1, 0xFFFFFF2, 0x3FFFFFFE, 0xFFFFFF3, 0xFFFFFF4, 0xFFFFFF5, 0xFFFFFF6, 0xFFFFFF7, 0xFFFFFF8, 0xFFFFFF9, 0xFFFFFFA, 0xFFFFFFB, 20, 0x3F8, 0x3F9, 0xFFA, 0x1FF9, 21, 0xF8, 0x7FA, 0x3FA, 0x3FB, 0xF9, 0x7FB, 0xFA, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 0x1F, 92, 0xFB, 0x7FFC, 0x20, 0xFFB, 1020, 0x1FFA, 33, 93, 94, 0x5F, 0x60, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 0x6F, 0x70, 0x71, 0x72, 0xFC, 0x73, 0xFD, 0x1FFB, 0x7FFF0, 0x1FFC, 0x3FFC, 34, 0x7FFD, 3, 35, 4, 36, 5, 37, 38, 39, 6, 0x74, 0x75, 40, 41, 42, 7, 43, 0x76, 44, 8, 9, 45, 0x77, 120, 0x79, 0x7A, 0x7B, 0x7FFE, 0x7FC, 0x3FFD, 0x1FFD, 0xFFFFFFC, 0xFFFE6, 0x3FFFD2, 0xFFFE7, 0xFFFE8, 0x3FFFD3, 0x3FFFD4, 0x3FFFD5, 0x7FFFD9, 0x3FFFD6, 0x7FFFDA, 0x7FFFDB, 0x7FFFDC, 0x7FFFDD, 0x7FFFDE, 0xFFFFEB, 0x7FFFDF, 0xFFFFEC, 0xFFFFED, 0x3FFFD7, 0x7FFFE0, 0xFFFFEE, 0x7FFFE1, 0x7FFFE2, 0x7FFFE3, 0x7FFFE4, 0x1FFFDC, 0x3FFFD8, 0x7FFFE5, 0x3FFFD9, 0x7FFFE6, 0x7FFFE7, 0xFFFFEF, 0x3FFFDA, 0x1FFFDD, 0xFFFE9, 0x3FFFDB, 0x3FFFDC, 0x7FFFE8, 0x7FFFE9, 0x1FFFDE, 0x7FFFEA, 0x3FFFDD, 0x3FFFDE, 0xFFFFF0, 0x1FFFDF, 0x3FFFDF, 0x7FFFEB, 0x7FFFEC, 0x1FFFE0, 0x1FFFE1, 0x3FFFE0, 0x1FFFE2, 0x7FFFED, 0x3FFFE1, 0x7FFFEE, 0x7FFFEF, 0xFFFEA, 0x3FFFE2, 0x3FFFE3, 0x3FFFE4, 0x7FFFF0, 0x3FFFE5, 0x3FFFE6, 0x7FFFF1, 0x3FFFFE0, 0x3FFFFE1, 0xFFFEB, 0x7FFF1, 0x3FFFE7, 0x7FFFF2, 0x3FFFE8, 0x1FFFFEC, 0x3FFFFE2, 0x3FFFFE3, 0x3FFFFE4, 0x7FFFFDE, 0x7FFFFDF, 0x3FFFFE5, 0xFFFFF1, 0x1FFFFED, 0x7FFF2, 0x1FFFE3, 0x3FFFFE6, 0x7FFFFE0, 0x7FFFFE1, 0x3FFFFE7, 0x7FFFFE2, 0xFFFFF2, 0x1FFFE4, 0x1FFFE5, 0x3FFFFE8, 0x3FFFFE9, 0xFFFFFFD, 0x7FFFFE3, 0x7FFFFE4, 0x7FFFFE5, 0xFFFEC, 0xFFFFF3, 0xFFFED, 0x1FFFE6, 0x3FFFE9, 0x1FFFE7, 0x1FFFE8, 0x7FFFF3, 0x3FFFEA, 0x3FFFEB, 0x1FFFFEE, 0x1FFFFEF, 0xFFFFF4, 0xFFFFF5, 0x3FFFFEA, 0x7FFFF4, 0x3FFFFEB, 0x7FFFFE6, 0x3FFFFEC, 0x3FFFFED, 0x7FFFFE7, 0x7FFFFE8, 0x7FFFFE9, 0x7FFFFEA, 0x7FFFFEB, 0xFFFFFFE, 0x7FFFFEC, 0x7FFFFED, 0x7FFFFEE, 0x7FFFFEF, 0x7FFFFF0, 0x3FFFFEE}[v], ((int)new byte[]{13, 23, 28, 28, 28, 28, 28, 28, 28, 24, 30, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 28, 6, 10, 10, 12, 13, 6, 8, 11, 10, 10, 8, 11, 8, 6, 6, 6, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, 15, 6, 12, 10, 13, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, 13, 19, 13, 14, 6, 15, 5, 6, 5, 6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 7, 7, 7, 15, 11, 14, 13, 28, 20, 22, 20, 20, 22, 22, 22, 23, 22, 23, 23, 23, 23, 23, 24, 23, 24, 24, 22, 23, 24, 23, 23, 23, 23, 21, 22, 23, 22, 23, 23, 24, 22, 21, 20, 22, 22, 23, 23, 21, 23, 22, 22, 24, 21, 22, 23, 23, 21, 21, 22, 21, 23, 22, 23, 23, 20, 22, 22, 22, 23, 22, 22, 23, 26, 26, 20, 19, 22, 23, 22, 25, 26, 26, 26, 27, 27, 26, 24, 25, 19, 21, 26, 27, 27, 26, 27, 24, 21, 21, 26, 26, 28, 27, 27, 27, 20, 24, 20, 21, 22, 21, 21, 23, 22, 22, 25, 25, 24, 24, 26, 23, 26, 27, 26, 26, 27, 27, 27, 27, 27, 28, 27, 27, 27, 27, 27, 26}[v]));
        }
    }

    private final void addCode(int v, int v1, int v2) {
        Node huffman$Node0 = new Node(v, v2);
        Node huffman$Node1;
        for(huffman$Node1 = Huffman.root; v2 > 8; huffman$Node1 = huffman$Node2) {
            v2 -= 8;
            int v3 = v1 >>> v2 & 0xFF;
            Node[] arr_huffman$Node = huffman$Node1.getChildren();
            L.m(arr_huffman$Node);
            Node huffman$Node2 = arr_huffman$Node[v3];
            if(huffman$Node2 == null) {
                huffman$Node2 = new Node();
                arr_huffman$Node[v3] = huffman$Node2;
            }
        }
        int v4 = v1 << 8 - v2 & 0xFF;
        Node[] arr_huffman$Node1 = huffman$Node1.getChildren();
        L.m(arr_huffman$Node1);
        kotlin.collections.l.M1(arr_huffman$Node1, huffman$Node0, v4, (1 << 8 - v2) + v4);
    }

    public final void decode(@l n n0, long v, @l okio.m m0) {
        L.p(n0, "source");
        L.p(m0, "sink");
        Node huffman$Node0 = Huffman.root;
        int v1 = 0;
        int v3 = 0;
        for(long v2 = 0L; v2 < v; ++v2) {
            v1 = v1 << 8 | Util.and(n0.readByte(), ((byte)0xFF));
            v3 += 8;
            while(v3 >= 8) {
                Node[] arr_huffman$Node = huffman$Node0.getChildren();
                L.m(arr_huffman$Node);
                huffman$Node0 = arr_huffman$Node[v1 >>> v3 - 8 & 0xFF];
                L.m(huffman$Node0);
                if(huffman$Node0.getChildren() == null) {
                    m0.writeByte(huffman$Node0.getSymbol());
                    v3 -= huffman$Node0.getTerminalBitCount();
                    huffman$Node0 = Huffman.root;
                }
                else {
                    v3 -= 8;
                }
            }
        }
        while(v3 > 0) {
            Node[] arr_huffman$Node1 = huffman$Node0.getChildren();
            L.m(arr_huffman$Node1);
            Node huffman$Node1 = arr_huffman$Node1[v1 << 8 - v3 & 0xFF];
            L.m(huffman$Node1);
            if(huffman$Node1.getChildren() != null || huffman$Node1.getTerminalBitCount() > v3) {
                break;
            }
            m0.writeByte(huffman$Node1.getSymbol());
            v3 -= huffman$Node1.getTerminalBitCount();
            huffman$Node0 = Huffman.root;
        }
    }

    public final void encode(@l o o0, @l okio.m m0) throws IOException {
        L.p(o0, "source");
        L.p(m0, "sink");
        int v = o0.h0();
        long v1 = 0L;
        int v3 = 0;
        for(int v2 = 0; v2 < v; ++v2) {
            int v4 = Util.and(o0.r(v2), ((byte)0xFF));
            v1 = v1 << Huffman.CODE_BIT_COUNTS[v4] | ((long)Huffman.CODES[v4]);
            v3 += Huffman.CODE_BIT_COUNTS[v4];
            while(v3 >= 8) {
                v3 -= 8;
                m0.writeByte(((int)(v1 >> v3)));
            }
        }
        if(v3 > 0) {
            m0.writeByte(((int)(v1 << 8 - v3 | 0xFFL >>> v3)));
        }
    }

    public final int encodedLength(@l o o0) {
        L.p(o0, "bytes");
        int v = o0.h0();
        long v1 = 0L;
        for(int v2 = 0; v2 < v; ++v2) {
            v1 += (long)Huffman.CODE_BIT_COUNTS[Util.and(o0.r(v2), ((byte)0xFF))];
        }
        return (int)(v1 + 7L >> 3);
    }
}

