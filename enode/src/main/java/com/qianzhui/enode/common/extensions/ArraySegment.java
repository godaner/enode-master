package com.qianzhui.enode.common.extensions;

import com.qianzhui.enode.common.utilities.Ensure;

/**
 * Created by junbo_xu on 2016/3/4.
 */
public class ArraySegment<T> {
    private T[] array;
    private int offset;
    private int count;

    public ArraySegment(T[] array) {
        Ensure.notNull(array, "array");
        this.array = array;
        this.offset = 0;
        this.count = array.length;
    }

    public ArraySegment(T[] array, int offset, int count) {
        Ensure.notNull(array, "array");
        if (offset >= array.length)
            throw new ArrayIndexOutOfBoundsException();

        if (count + offset > array.length)
            throw new ArrayIndexOutOfBoundsException();

        this.array = array;
        this.offset = offset;
        this.count = count;
    }

    public T[] getArray() {
        return array;
    }

    public int getOffset() {
        return offset;
    }

    public int getCount() {
        return count;
    }
}
