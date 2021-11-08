public class HW8_2 {

    public static void main(String[] args) {

        Book82 b1 = new Book82("Eternal dream", 3200);
        Book82 b2 = new Book82("Healthier today", 2800);
        ComicBook82 c1 = new ComicBook82("Micky mouse", 5400, 21);
        ComicBook82 c2 = new ComicBook82("Donald duck", 6200, 17);
        Novel82 n1 = new Novel82("Gone with the wind", 4200, 542);
        Novel82 n2 = new Novel82("Summer night dream", 5600, 483);

        System.out.println(b1.betterThan(c1));
        System.out.println(b1.betterThan(b2));
        System.out.println(c1.betterThan(null));
        System.out.println(c2.betterThan(c1));
        System.out.println(n1.betterThan(n2));
        System.out.println(n1.betterThan(b2));
    }
}

// your code for class Book82, ComicBook82, Novel82
class Book82 {
    String title;
    int price;

    public Book82() {
    }

    public Book82(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String betterThan(Book82 book) {
        String str;
        if (book == null) {
            str = "Impossible comparison. other=null.";
        } else {
            Class clazz = book.getClass();
            if (getClass() == book.getClass()) {
                // if (clazz.getSimpleName() == "Book82") {
                if (price > book.price) {
                    str = title + " is better than " + book.title;
                } else {
                    str = book.title + " is better than " + title;
                }
                // }

                // else if (clazz.getSimpleName() == "ComicBook82") {
                // if (numCharacter > book.numCharacter) {
                // str = title+" is better than "+book.title;
                // }
                // else {str = book.title+" is better than "+title;}
                // }

                // else if (clazz.getSimpleName() == "Novel82") {
                // if (numPage > book.numPage) {
                // str = title+" is better than "+book.title;
                // }
                // else {str = book.title+" is better than "+title;}
                // }

            }

            else {
                str = "Impossible comparison. different classes.";
            }
        }

        return str;
    }

    public String betterThan(ComicBook82 book) {
        String str;
        if (numCharacter > book.numCharacter) {
            str = title+" is better than "+book.title;
            }
            else {str = book.title+" is better than "+title;}
        }
    }

}

class ComicBook82 extends Book82 {
    int numCharacter;

    public ComicBook82(String title, int price, int numCharacter) {
        this.title = title;
        this.price = price;
        this.numCharacter = numCharacter;
    }

}

class Novel82 extends Book82 {
    int numPage = 0;

    public Novel82(String title, int price, int numPage) {
        this.title = title;
        this.price = price;
        this.numPage = numPage;
    }
}
