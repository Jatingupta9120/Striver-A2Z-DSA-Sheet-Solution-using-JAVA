//we have to do this aaabbc=>a3b2c1

class StringConvert {
    public static String compressString(String str){
        String newStr=" ";
        Integer ct=1;
       for(int i=0;i<str.length();i++){
        while(i<str.length()-1&&str.charAt(i)==str.charAt(i+1)){
            ct++;
            i++;
        }
        newStr+=str.charAt(i);
        if(ct>1){
            newStr+=ct.toString(i);
        }
       }
       return newStr;


    }
    public static void main(String[] args) {
     String str="aaabbc";
     System.out.println(compressString(str));
    }

    
}