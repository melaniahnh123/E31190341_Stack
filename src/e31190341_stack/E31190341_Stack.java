/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e31190341_stack;
//untuk mengimport Scanner ke program
import java.util.Scanner;
//untuk mengimport Stack ke program
import java.util.Stack;
/**
 *
 * @author amirotul kotimah
 */
public class E31190341_Stack {
    //menambah keyword static agar dapat dipanggil dalam program utama
    static Stack a = new Stack ();
    static Scanner in = new Scanner (System.in);
    static String b;
    static int max;
    static int i=0;
  
    //membuat method push
    static void push (Stack a, String b){
        //memanggil pada keyword static 
        a.push((b).toString());
        //menampilkan kata "Stack : "
        System.out.println("Stack : "+a);
    }
    /**
     * @param args the command line arguments
     */
    //merupakan class utama
    public static void main(String[] args) {
        //menampilkan kalimat "Masukkan maksimal Stack : "
        System.out.print("Masukkan maksimal Stack : ");
        //menginputkan jumlah maksimal tumpukan
        max=in.nextInt();
        //menggunakan perulang for, jika int i = 0; i < max ; i++
        for (int i = 0; i < max ; i++) {
            //menampilkan kata "Push : "
            System.out.print("Push : ");
            //menginputkan data yang akan disimpan
            b=in.next();
            //menyimpan data di tumpukan (a, b) 
            push (a, b);
        }
    }
}
    

