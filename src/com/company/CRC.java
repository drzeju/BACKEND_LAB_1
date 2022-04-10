package com.company;

public class CRC
{
    static int[] CRC_TABLE = new int[256];

    public static void main(String[] args)
    {
        for (int i = 0; i < 256; ++i)
        {
            int code = i;

            for(int j = 0; j < 8; ++j)
            {
                code = ((code & 0x01) != 0 ? (0xEDB88320 ^ (code >>> 1)) : (code >>> 1));
            }
            CRC_TABLE[i] = code;
        }

        String text = "This is example text ...";
        System.out.println(crc32(text));
    }

    private static long crc32(String text)
    {
        int crc = -1;

        for (int i = 0; i < text.length(); ++i)
        {
            final int code = text.charAt(i);
            int index = (code ^ crc) & 0xFF;
            crc = CRC_TABLE[index] ^ (crc >>> 8);
        }

        return (~crc) & 0xFFFFFFFFL;
    }
}

//const CRC_TABLE = Array(256);
//
//        for (let i = 0; i < 256; ++i) {
//        let code = i;
//        for (let j = 0; j < 8; ++j) {
//        code = (code & 0x01 ? 0xEDB88320 ^ (code >>> 1) : (code >>> 1));
//        }
//        CRC_TABLE[i] = code;
//        }
//
//        const crc32 = text => {
//          let crc = -1;
//          for (let i = 0; i < text.length; ++i) {
//            const code = text.charCodeAt(i);
//            crc = CRC_TABLE[(code ^ crc) & 0xFF] ^ (crc >>> 8);
//          }
//          return (-1 ^ crc) >>> 0;
//        };
//
//
//// Usage example:
//
//        console.log(crc32('This is example text ...'));  // 3473739588