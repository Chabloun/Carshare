/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ENTITIES;

/**
 *
 * @author Karray
 */
public class Stock {


     private int numero_stock;
    private String type_vet_stock;
    private int nombre_articles;
    private User depot;

    public int getNombre_articles() {
        return nombre_articles;
    }

    public void setNombre_articles(int nombre_articles) {
        this.nombre_articles = nombre_articles;
    }

    public int getNumero_stock() {
        return numero_stock;
    }

    public void setNumero_stock(int numero_stock) {
        this.numero_stock = numero_stock;
    }

    public String getType_vet_stock() {
        return type_vet_stock;
    }

    public void setType_vet_stock(String type_vet_stock) {
        this.type_vet_stock = type_vet_stock;
    }

    /**
     * @return the depot
     */
    public User getDepot() {
        return depot;
    }

    /**
     * @param depot the depot to set
     */
    public void setDepot(User depot) {
        this.depot = depot;
    }
}
