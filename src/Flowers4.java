class Flowers4 {
    String flowerName;
    int freshness;
    int price;

    public Flowers4(String flowerName, int freshness, int price) {
        this.flowerName = flowerName;
        this.freshness = freshness;
        this.price = price;
    }

    public static void method(Flowers4[] flower) {

        int maxPrice = Integer.MIN_VALUE;


        for (Flowers4 meaning : flower) {
            if (meaning.price > maxPrice) {
                maxPrice = meaning.price;

            }

        }
        System.out.println(maxPrice);
        int maxFreshness = Integer.MIN_VALUE;

        for (Flowers4 getMaxFreshness : flower)
            if (getMaxFreshness.freshness > maxFreshness) {
                maxFreshness = getMaxFreshness.freshness;
            }
        System.out.println("MaxFreshness:" + maxFreshness);


        for (Flowers4 nameseee : flower) {


            System.out.println("Flower: " + nameseee.flowerName + " " + "Freshness: " + nameseee.freshness);
        }
    }

    public static String getFreshestFlowerName(Flowers4[] flower) {
        Flowers4 freshestFlower = flower[0];
        for (int i = 0; i < flower.length; i++) {
            if (flower[i].freshness > freshestFlower.freshness) {
                freshestFlower = flower[i];


            }
        }
        return freshestFlower.flowerName;
    }
}



