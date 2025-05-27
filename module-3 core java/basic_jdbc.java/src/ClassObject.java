public class ClassObject {
    void detailsdisplay(String type,String model,int year){
        System.out.println("car type:"+type);
        System.out.println("car model: "+model);
        System.out.println("Car manufacture year:"+year);
    }
    public static void main(String[] args) {
        ClassObject obj = new ClassObject();
        obj.detailsdisplay("petrol", "Audio", 2023);
        obj.detailsdisplay("disel", "Shift", 2022);
    }
}
