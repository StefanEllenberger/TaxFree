public enum Product {
    SMALLBEER (Category.BEER, 330),
    LARGEBEER (Category.BEER, 500),
    SMALLPACK (Category.BEER, SMALLBEER.amount * 6),
    LARGEPACK (Category.BEER, LARGEBEER.amount * 6),

    BOTTLEWINE (Category.WINE, 750),
    SMALLBOXWINE (Category.WINE, BOTTLEWINE.amount * 2),
    LARGEBOXWINE (Category.WINE, BOTTLEWINE.amount * 4),

    HALFSPIRIT (Category.SPIRIT, 500),
    FULLSPIRIT (Category.SPIRIT, 1000),

    CIGARETTES (Category.TOBACCO, 200),
    HALFSNUS (Category.TOBACCO, 110),
    WHOLESNUS (Category.TOBACCO, 210);

    private final Category c;
    private final int amount;

    Product (Category c, int amount){
        this.c = c;
        this.amount = amount;
    }

    int amount(){
        return amount;
    }
    Category category() {return c;}

}
