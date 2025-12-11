/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.search;

/**
 *
 * @author arfaj_sixefe7
 */
import java.util.ArrayList;

public class Search {

    private ArrayList<LibraryItems> catalog;

    
    public Search(ArrayList<LibraryItems> catalog) {
        this.catalog = catalog;
    }

    //: update catalog later
    public void setCatalog(ArrayList<LibraryItems> catalog) {
        this.catalog = catalog;
    }

    public ArrayList<LibraryItems> byTitle(String title) {
        ArrayList<LibraryItems> results = new ArrayList<>();
        if (catalog == null) return results;

        for (LibraryItems item : catalog) {
            if (item.getTitle() != null &&
                item.getTitle().equalsIgnoreCase(title)) {
                results.add(item);
            }
        }
        return results;
    }

    public ArrayList<LibraryItems> byAuthor(String author) {
        ArrayList<LibraryItems> results = new ArrayList<>();
        if (catalog == null) return results;

        for (LibraryItems item : catalog) {
            if (item.getAuthor() != null &&
                item.getAuthor().equalsIgnoreCase(author)) {
                results.add(item);
            }
        }
        return results;
    }

    public ArrayList<LibraryItems> byGenre(String genre) {
        ArrayList<LibraryItems> results = new ArrayList<>();
        if (catalog == null) return results;

        for (LibraryItems item : catalog) {
            if (item.getGenre() != null &&
                item.getGenre().equalsIgnoreCase(genre)) {
                results.add(item);
            }
        }
        return results;
    }

    public ArrayList<LibraryItems> byType(String type) {
        ArrayList<LibraryItems> results = new ArrayList<>();
        if (catalog == null) return results;

        for (LibraryItems item : catalog) {
            if (item.getType() != null &&
                item.getType().equalsIgnoreCase(type)) {
                results.add(item);
            }
        }
        return results;
    }

    public LibraryItems byId(int id) {
        if (catalog == null) return null;

        for (LibraryItems item : catalog) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null; 
    }
}
