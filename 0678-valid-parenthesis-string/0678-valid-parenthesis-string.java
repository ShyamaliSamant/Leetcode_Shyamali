// class Solution {
//     public boolean checkValidString(String s) {
//        int n = s.length();
//        int count =0;
//        int count2 =0;
//        Stack<Character> st = new Stack<>();
//        for(int i =0 ; i<n; i++){
//         if(s.charAt(i) == '('){
//             st.push(s.charAt(i));
//     }
//     else if(s.charAt(i) == ')' && st.isEmpty() == false) {
//         st.pop();
//     }
//     else if(s.charAt(i) == '*'){
//         count++;
//     }
//     else if(s.charAt(i) == ')' && st.isEmpty() == true){  
//         count2++;

//         if(count2>count) return false;
//     }
//        }
//        if(st.isEmpty() == false && count>0){
//         count--;
//         st.pop();
//        }
//        if(st.isEmpty() == true) return true;

//        return false;
//     }
// }

class Solution {
    public boolean checkValidString(String s) {
        int minOpen = 0;
        int maxOpen = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                minOpen++;
                maxOpen++;
            } else if (c == ')') {
                minOpen--;
                maxOpen--;
            } else { 
                minOpen--; 
                maxOpen++; 
            }
            if (maxOpen < 0) return false; 
            if (minOpen < 0) minOpen = 0; 
        }
        return minOpen == 0;
    }
}