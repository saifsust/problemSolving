import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;


public class Main
{

    //private static Scanner read = FileFactory.read();
    //private static  Reader read = new Reader();
    private static Scanner read = new Scanner(System.in);


    private static class Node
    {
        public Node next, previous;

        public int data;
        public Node(int data)
        {
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }

    private static Node root = null;

    private static void insert(int data)
    {

        if(root == null)
        {
            root = new Node(data);
            root.previous = null;
            return ;
        }

        Node temp = root;

        while(temp.next != null)
        {
            temp = temp.next;
        }

        temp.next = new Node(data);
        temp.next.previous = temp;

    }

    private static void print_forword(){

     Node temp =root;

     while(temp != null){
        System.out.print(temp.data+" ");
        temp = temp.next;
     }
     System.out.println();

    }

   private static void print_backword(){

    Node temp = root;

    while(temp.next != null){
        temp = temp.next;
    }


    while(temp != null){
        System.out.print(temp.data+" ");
        temp=temp.previous;
    }
    System.out.println();

   }




    public static void main(String[] args)
    {

      
        insert(12);
        insert(13);
        insert(14);
        print_forword();

        print_backword();





    }

    // faster reader

    private static class Reader
    {

        private BufferedReader buffered ;

        private StringTokenizer tokenizer;

        public Reader()
        {
            this.buffered = new BufferedReader(new InputStreamReader(System.in), 31768);
            this.tokenizer = null;
        }

        public String nextLine()
        {
            try
            {
                return buffered.readLine();
            }
            catch(Exception ex)
            {
                throw new RuntimeException(ex);
            }
        }


        public String next()
        {
            while(tokenizer == null || !tokenizer.hasMoreTokens())
            {
                tokenizer = new StringTokenizer(nextLine());
            }
            return tokenizer.nextToken();
        }

        public int nextInt()
        {
            try
            {
                return Integer.parseInt(next());
            }
            catch(Exception ex)
            {
                return -1;
            }
        }

        public long nextLong()
        {
            try
            {
                return Long.parseLong(next());
            }
            catch(Exception ex)
            {
                return -1;
            }
        }

        public double nextDouble()
        {
            try
            {
                return Double.parseDouble(next());
            }
            catch(Exception ex)
            {
                return -1.0;
            }
        }
    }
}
