package stringbuilder;

public class StringBuilder {
    private int size = 0;
    private int capacity = 0;
    private char[] buffer;

    public StringBuilder() {
    }

    public StringBuilder(char[] chars) {
        buffer = new char[chars.length];
        size = capacity = chars.length;
        System.arraycopy(chars, 0, buffer, 0, chars.length);
    }

    public StringBuilder(String s) {
        capacity = size = s.length();
        buffer = new char[capacity];

        for (int i = 0; i < s.length(); i++)
            buffer[i] = s.charAt(i);
    }

    public StringBuilder append(StringBuilder s) {
        if (capacity < size + s.length()) {
            increaseCapacity(2 * (size + s.length()));
        }

        for (int i = 0; i < s.length(); i++)
            buffer[i + size] = s.charAt(i);

        size += s.length();

        return this;
    }

    public StringBuilder append(int i) {
        return append(new StringBuilder(String.valueOf(i)));
    }

    public int length() {
        return size;
    }

    public char charAt(int index) {
        return buffer[index];
    }

    public StringBuilder toLowerCase() {
        for (int i = 0; i < size; i++)
            buffer[i] = Character.toLowerCase(buffer[i]);

        return this;
    }

    public StringBuilder toUpperCase() {
        for (int i = 0; i < size; i++)
            buffer[i] = Character.toUpperCase(buffer[i]);

        return this;
    }

    public StringBuilder substring(int begin, int end) {
        char[] result = new char[end - begin];
        for (int i = 0; i < result.length; i++)
            result[i] = buffer[begin + i];

        return new StringBuilder(result);
    }

    public StringBuilder substring(int begin) {
        return substring(begin, size);
    }

    @Override
    public String toString() {
        char[] temp = new char[size];
        for (int i = 0; i < size; i++)
            temp[i] = buffer[i];

        return new String(temp);
    }

    public StringBuilder insert(int offset, StringBuilder s) {
        if (capacity < size + s.length()) {
            increaseCapacity(2 * (size + s.length()));
        }

        String temp = s.toString();
        for (int i = 0; i < temp.length(); i++)
            buffer[size - 1 + temp.length() - i] = buffer[size - 1 - i];

        for (int i = 0; i < temp.length() ; i++)
            buffer[i + offset] = temp.charAt(i);

        size += temp.length();

        return this;
    }

    private void increaseCapacity(int newCapacity) {
        char[] temp = new char[newCapacity];
        System.arraycopy(buffer, 0, temp, 0, size);
        capacity = newCapacity;
        buffer = temp;
    }

    public StringBuilder reverse() {
        for (int i = 0; i < size / 2; i++) {
            char temp = buffer[i];
            buffer[i] = buffer[size - 1 - i];
            buffer[size - 1 - i] = temp;
        }

        return this;
    }
}
