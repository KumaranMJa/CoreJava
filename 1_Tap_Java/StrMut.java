public class StrMut {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        sb.append("Java ");
        sb.append("JavaScript ");
        sb.append("Python");
        System.out.println(sb);
        System.out.println(sb.capacity());//here 16(default capacity) * 2 + 2   (bcoz the capacity need to increased for appending the string)
        sb.delete(0, 4); //0 - including , 4 - excluding
        System.out.println(sb);
        StringBuffer sb2 = new StringBuffer("Kumaran");
        System.out.println(sb2); 
    }
}
