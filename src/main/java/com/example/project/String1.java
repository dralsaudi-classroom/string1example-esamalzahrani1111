package com.example.project;

public class String1 {
	private char[] str;
	private int size;

	public String1 () {
	   size = -1;
	   str = new char[80];
	}
	public void append(char c) {
        str[++size] = c;
    }
    public char remove() {
        return str[size--];
    }
    public char getChar(int i) {
        return str[i];
    }
    public int length() {
        return size+1;
    }
    public void makeEmpty()
    {
        size = -1;
    }
    public void concat(String1 s)
    {
        for(int i = 0; i < s.length(); i++)
            append(s.getChar(i));
    }
    public boolean equal(String1 s) {
        boolean equals= s.length()-1 == this.size();
        if (equals)
        for (int i =0; i<=this.size;i++){
            if (!(s.getChar(i) == this.getChar(i)))
                equals = false;
        }
        return equals;
    }
    public void reverse() {
        char temp1;
        for (int i=0,k=this.size; i<this.size/2;i++,k--)
        {
            temp1 = str[k];
            str[k] = str[i]; 
            str[i] = temp1;
        }
    }
}
