public enum Entries {
    book("Book", new String[]{"A written work published in printed or electronic form.","To arrange for someone to have a seat on a plane."}),
    bookable("Bookable",new String[]{"Can be ordered in advance."}),
    bookcase("Bookcase", new String[]{"A piece of furniture with shelves."}),
    bookbinder("Bookbinder" , new String[]{"A person who fastens the pages of books."}),
    cSc220("CSC220",new String[]{"Data Structures.","Ready to create complex data structures.","To create data structures."})

    ;
    private String wordName;
    private String[] definitions;

    private Entries(String wordName, String[] definitions){
        this.wordName = wordName;
        this.definitions = definitions;
    }
    public String getWordName(){
        return this.wordName;
    }
    public String[] getDefinitions(){
        return definitions;
    }
    private enum Definition{
        


        private Definition(){

        }

    }


}
