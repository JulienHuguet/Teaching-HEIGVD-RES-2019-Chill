package ch.heigvd.res.chill.domain;
import ch.heigvd.res.chill.domain.IProduct;
import java.math.BigDecimal;

public class TroisDame implements IProduct{
    public final static String NAME = "TroisDame";
    public final static BigDecimal PRICE = new BigDecimal(2.0);

    @Override
    public String getName(){
        return NAME;
    }
    @Override
    public BigDecimal getPrice(){
        return PRICE;
    }
}