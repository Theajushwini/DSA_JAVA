public class SB {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder();
        for (int i=0;i<26;i++){
            char ch=(char) ('a'+i);
            builder.append(ch);
        }
        ///String Builder is a data type which mutable unlike string and its doesnt create a new object everytime ch is appended to the same obj everytime
        System.out.println(builder.toString());
        builder.deleteCharAt(25);
        System.out.println(builder);
        System.out.println(builder.reverse());

    }
}
