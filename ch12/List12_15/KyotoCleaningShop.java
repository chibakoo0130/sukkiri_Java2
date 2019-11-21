public class KyotoCleaningShop implements CleaningService {
    private String ownerName;
    private String address;
    private String phone;

    /* シャツを洗う */
    public Shirt washShirt(Shirt s) {
        // 大型洗濯機15分
        // 業務用乾燥機30分
        // スチームアイロン5分
        return s;
    }

    /* タオルを洗う */
    public Towl washTowl(Towl t) {

    }

    /* コートを洗う */
    public Coat washCoat(Coat c) {

    }
}