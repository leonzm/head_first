package com.company.chapter_08;

/**
 * 具体 Container 实现
 *
 * @Author: Leon
 * @CreateDate: 2019/7/7
 * @Description:
 */
public class NameContainer implements Container<String> {

    private String[] names = {"zhangsan" , "lisi" ,"wangwu" , "liuliu"};

    @Override
    public Iterator<String> iterable() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator<String> {

        private int index = 0;


        @Override
        public boolean hasNext() {
            if (index < names.length) {
                return true;
            }
            return false;
        }

        @Override
        public String next() {
            return names[index ++];
        }
    }

}
