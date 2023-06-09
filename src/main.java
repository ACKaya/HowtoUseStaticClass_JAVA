public class main {
    public static void main(String[] args) {
        Course c1=new Course("FZK",1,100);
        Course c2=new Course("MAT",2,50);
        Course c3=new Course("BIO",3,20);
        int[] list={c1.note,c2.note,c3.note};
        Course.calculator(list);

    }
}
