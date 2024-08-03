public class Performance {
    public static void main(String[] args) {
        String series="";
        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            System.out.print(ch);
            series+=ch;//not efficient

        }
        System.out.println(" ");
        System.out.println(series+" ");//this way is not efficient since every string is imu=mmutable as we know and every time a char is added to the string it means that it every time the string is copied added to new character producing a new string this is like creating wat too many objects in the Pool..
        // also everytime the series value gets change the objects created gets dereferenced  leading to lots of onjects with no reference leading to wastage of space

    }
}
