public class Search_In_Strings {
    public static void main(String[] args) {
        String name="theajushwini";
        char a='b';
        Boolean ans=search(name,a);
        System.out.println(ans);
    }
    public static Boolean search(String str,char a){
        if(str.isEmpty()){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(a==str.charAt(i)){
                return true;
            }
        }
        return false;


    }

}
