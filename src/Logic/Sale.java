
package Logic;


public class Sale {
    
    //Representa un identificador de la venta
    private String idSale;
    //Permite establecer el nombre del producto
    private String nameProduct;
    //Especifica el valor unitario del producto
    private double unitValue;
    //Especifica la categoría o tipo de producto, que puede ser Medicina, Licor, Aseo o un producto de Víveres.
    private byte typeProduct;
    //Especifica si el producto está gravado, es decir si aplica el porcentaje del IVA especificado con base en el tipo de producto
    private boolean engraved;
    //Permite especificar la cantidad de la venta.
    private short cantSale;
    public static final byte MEDICINE = 0;
    public static final byte LIQUEUR = 1;
    public static final byte CLEANNESS = 2;
    public static final byte VICTUALS = 3;

    public Sale() {
    }
    
    /**
     * Constructor
     * @param idSale
     * @param nameProduct
     * @param unitValue
     * @param typeProduct
     * @param engraved
     * @param cantSale 
     */
    public Sale(String idSale, String nameProduct, double unitValue, byte typeProduct, boolean engraved, short cantSale) {
        this.idSale = idSale;
        this.nameProduct = nameProduct;
        this.unitValue = unitValue;
        this.typeProduct = typeProduct;
        this.engraved = engraved;
        this.cantSale = cantSale;
    }

    public String getIdSale() {
        return idSale;
    }

    public void setIdSale(String idSale) {
        this.idSale = idSale;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getUnitValue() {
        return unitValue;
    }

    public void setUnitValue(double unitValue) {
        this.unitValue = unitValue;
    }

    public byte getTypeProduct() {
        return typeProduct;
    }

    public void setTypeProduct(byte typeProduct) {
        this.typeProduct = typeProduct;
    }

    public boolean isEngraved() {
        return engraved;
    }

    public void setEngraved(boolean engraved) {
        this.engraved = engraved;
    }

    public short getCantSale() {
        return cantSale;
    }

    public void setCantSale(short cantSale) {
        this.cantSale = cantSale;
    }
    
    public double calcIVA(){
        double IVA = 0;
        
        if(typeProduct == MEDICINE ){
            IVA = unitValue * 0.10; 
        }else if(typeProduct == LIQUEUR ){
            IVA = unitValue * 0.19; 
        }else if(typeProduct == CLEANNESS ){
            IVA = unitValue * 0.12; 
        }else if(typeProduct == VICTUALS ){
            IVA = unitValue * 0.08; 
        }
        
        return IVA;
    }
    
    /**
     * 
     * @return 
     */
    
    public double calcDiscount(){
        double subtotal;
        
        subtotal = unitValue * cantSale;
               
        if(cantSale >= 10 && cantSale <= 20){
            subtotal = subtotal - (subtotal * 0.05);
        }else if(cantSale >= 21 && cantSale <= 50){
            subtotal = subtotal - (subtotal * 0.10);
        }else if(cantSale >= 51 && cantSale <= 100){
            subtotal = subtotal - (subtotal * 0.15);
        }else if(cantSale > 100){
            subtotal = subtotal - (subtotal * 0.20);
        }
        
        return subtotal;
    }
    
    public double getValueSale(){
        double totalValueSale = 0;
        
        totalValueSale = calcDiscount() + calcIVA();
            
        
        return totalValueSale;
    }
}
