package AnimalRescue;

public class DogFood {

    private String name;
    private int price ;
    private String quality;
    private String availability ;






    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setPrice(int price){
        this.price = price;
    }
    public int getPrice(){
        return price;
    }

    public void setQuality(String quality){
        this.quality = quality;

    }
    public String getQuality(){
        return quality;
    }

    public void setAvailability(String availability){
        this.availability =availability;

    }
    public String getAvailability(){
        return availability;
    }





    public void calcium (){
        System.out.println("Calcium for strong teeth and bones ");
    }
    public void vitamin(){
        System.out.println("Vitamin E for a better and natural immune system");
    }
    public void protein (){
        System.out.println("High protein for a better and strong muscles");
    }
    public void acid (){
        System.out.println("Fat acids Omega-3 and Omega-6 for sparkling and soft fur ");
    }
    public void oil(){
        System.out.println("Fish oil for the development of the brain and the vision");
    }
}
