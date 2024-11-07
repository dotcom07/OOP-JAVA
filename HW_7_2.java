public class HW_7_2 {

    public static void main(String[] args) {
        BookLibrary library = new BookLibrary();
        
        library.addBook("To Kill a Mockingbird", "Harper Lee");
        library.addBook("1984", "George Orwell");
        library.addBook("Moby Dick", "Herman Melville");
        
        library.showLibrary();
        
        System.out.println();
        library.searchByAuthor("Harper Lee");
        
        System.out.println();
        library.searchByAuthor("J.K. Rowling");
    }
}



class BookLibrary {

    Book book[] = new Book[100];
    int count = 0;
    boolean isbook;
    BookLibrary() {}

    class Book {
        String name, auth;

        Book() {}

        Book(String name, String auth){
            this.name = name;
            this.auth = auth;
        }

        public String toString(){
            return "[BOOK] Title: "+name+", Author: "+auth;
        }

        public String getName() {
            return name;
        }

        public String getAuth() {
            return auth;
        }
    }

    void addBook(String name, String auth){
        this.book[count++] = new Book(name, auth);
    }

    void showLibrary() {
        System.out.println("[LIBRARY] Book Count: "+ count);
        for ( int i = 0 ; i < count; i++ ){
            System.out.println(book[i]);
        }
    }

    void searchByAuthor(String auth) {
        this.isbook = false;
        System.out.println("[SEARCH RESULT] Author: "+ auth);
        for  ( int i = 0 ; i < count; i++ ){
            if (book[i].getAuth() == auth){
                System.out.println(book[i]);
                this.isbook = true;
            }
        }

        if ( this.isbook == false) {
            System.out.println("No books found by this author.");
        }
    }
}
