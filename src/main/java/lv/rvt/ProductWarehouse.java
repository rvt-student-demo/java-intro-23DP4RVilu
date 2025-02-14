package lv.rvt;

public class ProductWarehouse extends Warehouse{
    
    private String warehouseName;

    public ProductWarehouse(String name, Double capacity) {
        super(capacity);
        this.warehouseName = name;
    }

    public String getName() {
        return this.warehouseName;
    }

    public void setName(String name) {
        this.warehouseName = name;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
