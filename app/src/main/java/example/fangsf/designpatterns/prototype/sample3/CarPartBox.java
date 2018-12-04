package example.fangsf.designpatterns.prototype.sample3;

/**
 * Created by fangsf on 2018/12/4.
 * Useful:  装汽车零件的箱子
 */
public class CarPartBox extends IBox {

    private int mNumber;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setNumber(int number) {
        this.mNumber = number;
    }

    @Override
    public int getNumber() {
        return mNumber;
    }

}
