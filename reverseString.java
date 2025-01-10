// import java.util.Scanner;
// public class reverseString {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//          System.out.println("Enter a String");
//         String Word= sc.nextLine();
        
//         int letters =0 , spaces =0 , numbers=0, others=0;

//         String reversed = "";
//         for(int i = Word.length() -1 ; i >= 0;  i-- ){
           
//             char ch = Word.charAt(i);
//             reversed += Word.charAt(i);

//             if(Character.isLetter(ch)){
//                 letters++;
//             }else if (Character.isDigit(ch)){
//                 numbers++;
//             }else if (Character.isWhitespace(ch)){
//                 spaces++;
//             }else{
//                 others++;
//             }

//         }
//         System.out.println("Letters is: " + letters);
//         System.out.println("numbers is:" + numbers);
//         System.out.println("whitespaces is:" + spaces);
//         System.out.println("others is:" + others);
       
        
//         System.out.println("Reversed is:" + reversed);
//         sc.close();
// }     
// }


//BY RECURSION REVERSE A STRINIG.........
public class reverseString{
    public static void reverse(String str, int idx){
        if(idx == 0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.println(str.charAt(idx));
        reverse(str, idx-1);
    }
    public static void main(String[] args) {
        String str = "abcd";
        reverse(str, str.length()-1);
    }

}