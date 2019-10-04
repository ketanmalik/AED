/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author ketanmalik
 */
public class ProductCatalog {

    private ArrayList<Product> productCatalog;

    public ProductCatalog() {
        productCatalog = new ArrayList<Product>();
    }

    public ArrayList<Product> getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(ArrayList<Product> productCatalog) {
        this.productCatalog = productCatalog;
    }

    public Product addProduct() {
        Product product = new Product();
        productCatalog.add(product);
        return product;
    }

    public void deleteProduct(Product product) {
        productCatalog.remove(product);
    }

    public ArrayList<Product> searchResult(String searchTerm) {
        ArrayList<Product> tempList = new ArrayList<Product>();
        for (Product e : productCatalog) {
            if (searchTerm.equalsIgnoreCase(e.getName())) {
                tempList.add(e);
            }
        }
        return tempList;
    }

}
