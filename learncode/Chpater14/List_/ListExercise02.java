package learncode.Chpater14.List_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExercise02 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Books("BOOK1",  20, "KSSK"));
        list.add(new Books("BOOK2",  15, "KSSK"));
        list.add(new Books("BOOK3",  30, "KSSK"));
        list = Books.listSort(list);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
    }
}

class Books {
    private String name;
    private double price;
    private String author;

    public Books(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public static List listSort(List booklist) {
        for (int i = 0; i < booklist.size(); ) {
            if (i == booklist.size() - 2) {
                break;
            }
            if (!(booklist.get(i) instanceof Books)) {
                break;
            }
            Books book1 = (Books) (booklist.get(i));//向下强制转换以使用get,set
            Books book2 = (Books) (booklist.get(i + 1));
            if (book1.getPrice() > book2.getPrice()) {
                booklist.set(i, book2);
                booklist.set(i + 1, book1);
                i = 0;
            } else {
                i++;
            }
        }
        return booklist;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Books{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }
}