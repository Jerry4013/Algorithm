/**
 * @author: Jingchao Zhang
 * @createDate: 2019/08/06
 * The read4 API is defined in the parent class Reader4.
 * int read4(char[] buf);
 **/
class Reader4 {
    int read4(char[] buf) {
        return 0;
    }
}
public class E_157_ReadNCharactersGivenRead4 extends Reader4 {

    /**
     * @param buf Destination buffer
     * @param n   Number of characters to read
     * @return    The number of actual characters read
     */
    public int read(char[] buf, int n) {
        char[] buffer = new char[4];
        int read;
        int hasRead = 0;
        while (true) {
            read = read4(buffer);
            int toRead = Math.min(read, n - hasRead);
            for (int i = 0; i < toRead; i++) {
                buf[hasRead] = buffer[i];
            }
            if (read < 4) {
                return hasRead;
            }
            if (hasRead == n) {
                return n;
            }
        }
    }
}
