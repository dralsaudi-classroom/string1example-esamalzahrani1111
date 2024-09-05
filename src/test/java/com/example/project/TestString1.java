package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestString1 {

   @Test
   public void testString1()
   {
      String1 s = new String1(); //test
      s.append('a');
      s.append('b');
      s.append('c');
      assertEquals(3, s.length());
      assertEquals('c', s.remove());
      assertEquals(2, s.length());
      assertEquals('b', s.getChar(1));
      s.makeEmpty();
      assertEquals(0, s.length());
      s.append('d');
      s.append('e');
      s.append('f');
      assertEquals(3, s.length());
      String1 s2 = new String1();
      s2.append('g');
      s2.append('h');
      s2.append('i');
      s.concat(s2);
      assertEquals(6, s.length());
      assertEquals('d', s.getChar(0));
      assertEquals('e', s.getChar(1));
      assertEquals('f', s.getChar(2));
      assertEquals('g', s.getChar(3));
      assertEquals('h', s.getChar(4));
      assertEquals('i', s.getChar(5));
   }

   @Test
   public void testString1Reverse()
   {
      String1 s = new String1();
      s.append('a');
      s.append('b');
      s.append('c');
      s.reverse();
      s.remove();
      assertEquals(2, s.length());
      assertEquals('c', s.getChar(0));
      assertEquals('b', s.getChar(1));
      s.makeEmpty();
      s.reverse();
      assertEquals(0, s.length());
   }

   @Test
    public void testString1Equal()
    {
        String1 s = new String1();
        String1 s2 = new String1();
        s.append('a');
        s.append('b');
        s.append('c');
        s2.append('a');
        s2.append('b');
        s2.append('c');
        assertEquals(true, s.equal(s2));
        s2.remove();
        s2.append('d');
        assertEquals(false, s.equal(s2));
        s.makeEmpty();
        assertEquals(false, s.equal(s2));
        s2.makeEmpty();
        assertEquals(true, s.equal(s2));
    }
}
