public class Course {
    String name;
    int id;
    int note;

    public  Course(String name,int id,int note) {
        this.name=name;
        this.id=id;
        this.note=note;

    }
    public  void calculator(int[] sayilar){
        double toplam=0;
        for(int x:sayilar){
            toplam+=x;

        }
        System.out.println("Ortalma:"+toplam/ sayilar.length);



    }
}
