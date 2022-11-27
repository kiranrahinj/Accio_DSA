
import java.util.ArrayList;
import java.util.Scanner;

//leetcode decode String
public class Main {

    public static String stringChallenege(String str,int n) {
        // char aa=str[1].charAt(0);
       
        // int n=aa-'0';
        if(n==1)
         {
           return str;
         }

       ArrayList<ArrayList<Character>> al = new ArrayList<>();
       
       for(int i=0;i<n;i++) {
           ArrayList<Character> ar=new ArrayList<>();
           al.add(ar);
       }
       int j=0,c=1;
       
       for(int i=0;i<str.length();i++) {
           al.get(j).add(str.charAt(i));
           j+=c;
           
           if(j==n-1) {
               c=-1;
           }
           if(j==0) {
               c=1;
           }
       }
        String ans="";
    
       for(int i=0;i<al.size();i++) {
        for(int k=0;k<al.get(i).size();k++) {
            ans+=al.get(i).get(k);
          }
       }
    return ans;
   }
    public static String solve(String s){
        if(s.length()==0){
            return "";
        }
        String ans=solve(s.substring(1));
        String a=ans;
        if(s.charAt(0)>=48 && s.charAt(0)<=57){
            int x=s.charAt(0)-'0';
            for(int i=0;i<x;i++){
               a+=a;
            }
        }
        else{
            if(s.charAt(0)!='[' && s.charAt(0)!=']')
              a=s.charAt(0)+a;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a="kamvjjf1";
        System.out.println(stringChallenege(a,5));
    }
}
