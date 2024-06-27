package com.Xworkz.java.practice.String;

public class WordsCount {

      public static void main(String[] args) {
     /*   String s="MY NAME IS SHAMBHU AND SHAMBHU IS A GOOD BOY";
        String[] arr=s.split(" ");
        boolean[] visited = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (visited[i]){
                continue;
            }
            int count=1;
            String current=arr[i];
                for (int j = i+1; j < arr.length; j++) {
                        if (current.equals(arr[j])){
                            visited[j]=true;
                            count++;
                        }
                }
            System.out.println(arr[i]+" : "+count);
        }*/

          String s="MY NAME IS SHAMBHU AND SHAMBHU IS A GOOD BOY";
            String[] words=s.split(" ");
            boolean[] checked=new boolean[words.length];
          for (int i = 0; i < words.length; i++) {
              if (checked[i]){
                  continue;
              }
              int count=1;
              for (int j = i+1; j < words.length; j++) {
                  if (words[i].equals(words[j])){
                      checked[j]=true;
                      count++;
                  }
              }
              System.out.println(words[i]+": "+count);
          }
    }
}
