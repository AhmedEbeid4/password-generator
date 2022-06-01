package com.mycompany;

import java.util.Random;

public class Password {
    private int length;
    private String text;

    public Password() {
        length=10;
    }

    public Password(int length) {
        this.length = length;
        text=generate(length);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getPassword() {
        return text;
    }

    private String generate(int length){
        String password ="";
        char[] alphabet = getAlpha();
        char[] UpAlphabet = getUpAlpha();
        char[] numbers={'1','2','3','4','5','6','9'};
        char[] others={':', ';', '<', '=', '>', '?', '@', '[', '\'', ']', '^', '_', '`','+','×','!','|','&',',','~','.','-','*'};
        char[][] chars={alphabet,UpAlphabet,numbers,others};
        for (int i =0 ; i<length;i++){
            int num1=new Random().nextInt(chars.length);
            int num2=new Random().nextInt(alphabet.length);
            if (!(num2 >=numbers.length || num2>=others.length)){
                password=password+chars[num1][num2];
            }else {
                int u = new Random().nextInt(1);
                password=password+chars[u][num2];
            }
        }
        return password;
    }
    private char[] getAlpha(){
        String con="";
        for (char i='a' ; i<'z' ; i++){
            con=con+i ;
        }
        return con.toCharArray();
    }
    private char[] getUpAlpha(){
        String con="";
        for (char i='a' ; i<'z' ; i++){
            con=con+Character.toUpperCase(i) ;
        }
        return con.toCharArray();
    }

}
