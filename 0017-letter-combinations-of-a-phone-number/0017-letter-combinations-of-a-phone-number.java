class Solution {
    public List<String> letterCombinations(String digits) {
        List <String> arr=new ArrayList<>();
        if(digits.length()==0)
        return arr;
        int no=Integer.parseInt(digits);
        if(no<10){
            String str=get(no);
            for(int i=0;i<str.length();i++){
                arr.add(String.valueOf(str.charAt(i)));
            }
        }


        if(no>10&&no<100){
            String str2=get(no%10);
            String str1=get((no/10)%10);
            for(int i=0;i<str1.length();i++){
                for(int j=0;j<str2.length();j++){
                   arr.add(String.valueOf(String.valueOf(str1.charAt(i))+String.valueOf(str2.charAt(j))));
                }
            }
        }
       if(no>100&&no<1000){
        String str3=get(no%10);
        String str2=get((no/10)%10);
        String str1=get(((no/10)/10)%10);
        for(int i=0;i<str1.length();i++){
            for(int j=0;j<str2.length();j++){
                for(int k=0;k<str3.length();k++){
                    arr.add(String.valueOf(str1.charAt(i))+
                    String.valueOf(str2.charAt(j))+
                    String.valueOf(str3.charAt(k)));
                }
            }
        }
       }

       if(no>1000&&no<10000){
        String str4=get(no%10);
        String str3=get((no/10)%10);
        String str2=get(((no/10)/10)%10);
        String str1=get((((no/10)/10)/10)%10);
         for(int i=0;i<str1.length();i++){
            for(int j=0;j<str2.length();j++){
                for(int k=0;k<str3.length();k++){
                    for(int l=0;l<str4.length();l++){
                    arr.add(String.valueOf(String.valueOf(str1.charAt(i))+
                    String.valueOf(str2.charAt(j)+
                    String.valueOf(str3.charAt(k))+
                    String.valueOf(str4.charAt(l)))));
                    }
                    }
            }
        }

       }


        return arr;
    }
    String get(int n){
        switch(n){
            case 2:
            return "abc";
            case 3:
            return "def";
            case 4:
            return "ghi";
            case 5:
            return "jkl";
            case 6:
            return "mno";
            case 7:
            return "pqrs";
            case 8:
            return "tuv";
            case 9:
            return "wxyz";
            default:
            return "";
        }
    }
}