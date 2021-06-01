package learncode.Chapter07;

public class Homework03 {
    public static void main(String[] args){
        //编写类Book,定义方法updataPrice,是西安更改某本书的价格，
        //具体如果价格>150,则更改为150如果价格大于100，改为100，否则不变
        Book book = new Book(90);
        book.updataPrice(book);
        System.out.println("该本书的价格为"+book.price);
    }
}
class Book{
    double price;
    public Book(double price1){
         this.price = price1;
    }
    public void updataPrice(Book book){
        if(book.price>150){
            book.price = 150;
        }else if(book.price > 100){
            book.price = 100;
        }
    }
}