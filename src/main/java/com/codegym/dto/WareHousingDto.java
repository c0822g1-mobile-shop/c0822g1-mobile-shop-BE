//
//
//import com.codegym.model.commodity.Commodity;
//import com.codegym.model.supplier.Supplier;
//
//import javax.persistence.*;
//import javax.validation.constraints.NotBlank;
//
//@Entity
//public class WareHousingDto {
//    @Id
//    @GeneratedValue( strategy = GenerationType.IDENTITY)
//    private Integer id;
//    private String dateImport;
//    @NotBlank
//    private Integer quantity;
//    @ManyToOne
//    private Commodity commodity;
//    @ManyToOne
//    private Supplier supplier;
//
//    public WareHousingDto() {
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getDateImport() {
//        return dateImport;
//    }
//
//    public void setDateImport(String dateImport) {
//        this.dateImport = dateImport;
//    }
//
//    public Integer getQuantity() {
//        return quantity;
//    }
//
//    public void setQuantity(int quantity) {
//        this.quantity = quantity;
//    }
//
//    public Commodity getCommodity() {
//        return commodity;
//    }
//
//    public void setCommodity(Commodity commodity) {
//        this.commodity = commodity;
//    }
//
//    public Supplier getSupplier() {
//        return supplier;
//    }
//
//    public void setSupplier(Supplier supplier) {
//        this.supplier = supplier;
//    }
//}
